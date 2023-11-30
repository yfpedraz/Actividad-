/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displayfriends;

/**
 *
 * @author YONNATTANTH
 */

// Java program to read from file "friendsContact.txt"
// and display the contacts
 
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

public class DisplayFriends {

    /**
     * @param args the command line arguments
     */
    public static void main(String data[]) {
        try {
 
            String nameNumberString;
            String name ;
            
            long number;
            int index;
 
            // Using file pointer creating the file.
            File file = new File("C:\\Users\\YONNATTANTH\\Desktop\\Unal 2023-2\\POO\\friendsContact.txt");
 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
 
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Traversing the file
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit
                    = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // Print the contact data
                System.out.println(
                    "Friend Name: " + name + "\n"
                    + "Contact Number: " + number + "\n");
            }
        }
            catch (IOException ioe)
            {
 
                System.out.println(ioe);
            }
            catch (NumberFormatException nef)
            {
 
                System.out.println(nef);
            }
    }
    
}
