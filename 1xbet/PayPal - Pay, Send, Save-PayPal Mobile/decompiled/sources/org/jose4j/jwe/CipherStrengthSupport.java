package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class CipherStrengthSupport {
    private static final org.slf4j.Logger getHighSpeedVideoFpsRangesFor = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.jwe.CipherStrengthSupport.class);

    public static boolean isAvailable(java.lang.String str, int i) {
        int bitLength = org.jose4j.lang.ByteUtil.bitLength(i);
        try {
            int maxAllowedKeyLength = javax.crypto.Cipher.getMaxAllowedKeyLength(str);
            boolean z = bitLength <= maxAllowedKeyLength;
            if (!z) {
                getHighSpeedVideoFpsRangesFor.debug("max allowed key length for {} is {}", str, java.lang.Integer.valueOf(maxAllowedKeyLength));
            }
            return z;
        } catch (java.security.NoSuchAlgorithmException e) {
            getHighSpeedVideoFpsRangesFor.debug("Unknown/unsupported algorithm, {} {}", str, e);
            return false;
        }
    }
}
