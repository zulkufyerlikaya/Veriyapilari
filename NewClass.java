
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aidata
 */
public class NewClass {
    public static void main(String[] args) {
        
            ArrayList<Integer> DinamikDizi=new ArrayList<>(5);
            DinamikDizi.add(100);
            DinamikDizi.add(20);
            DinamikDizi.add(15);
           
            DinamikDizi.add(0,27);
          
         
            
            DinamikDizi.removeAll(DinamikDizi);
            DinamikDizi.remove(1);
            
            DinamikDizi.clear();
               DinamikDizi.size();
   System.out.println(DinamikDizi);
            
    }
}
