package org.jose4j.jwa;

/* loaded from: classes18.dex */
public class AlgorithmAvailability {
    private static org.slf4j.Logger getHighSpeedVideoSizes = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.jwa.AlgorithmAvailability.class);

    public static boolean isAvailable(java.lang.String str, java.lang.String str2) {
        java.util.Set<java.lang.String> algorithms = java.security.Security.getAlgorithms(str);
        java.util.Iterator<java.lang.String> it = algorithms.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str2)) {
                return true;
            }
        }
        getHighSpeedVideoSizes.debug("{} is NOT available for {}. Algorithms available from underlying JCE: {}", str2, str, algorithms);
        return false;
    }
}
