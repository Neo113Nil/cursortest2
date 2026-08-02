package com.google.crypto.tink.hybrid.subtle;

/* loaded from: classes9.dex */
class RsaKem {
    static final byte[] EMPTY_AAD = new byte[0];
    static final int MIN_RSA_KEY_LENGTH_BITS = 2048;

    private RsaKem() {
    }

    static void validateRsaModulus(java.math.BigInteger bigInteger) throws java.security.GeneralSecurityException {
        if (bigInteger.bitLength() < 2048) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("RSA key must be of at least size %d bits, but got %d", 2048, java.lang.Integer.valueOf(bigInteger.bitLength())));
        }
    }

    static int bigIntSizeInBytes(java.math.BigInteger bigInteger) {
        return (bigInteger.bitLength() + 7) / 8;
    }

    static byte[] bigIntToByteArray(java.math.BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        byte[] bArr = new byte[i];
        if (byteArray.length == i + 1) {
            if (byteArray[0] != 0) {
                throw new java.lang.IllegalArgumentException("Value is one-byte longer than the expected size, but its first byte is not 0");
            }
            java.lang.System.arraycopy(byteArray, 1, bArr, 0, i);
            return bArr;
        }
        if (byteArray.length < i) {
            java.lang.System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
            return bArr;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Value has invalid length, must be of length at most (%d + 1), but got %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(byteArray.length)));
    }

    static byte[] generateSecret(java.math.BigInteger bigInteger) {
        int bigIntSizeInBytes = bigIntSizeInBytes(bigInteger);
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        while (true) {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger(bigInteger.bitLength(), secureRandom);
            if (bigInteger2.signum() > 0 && bigInteger2.compareTo(bigInteger) < 0) {
                return bigIntToByteArray(bigInteger2, bigIntSizeInBytes);
            }
        }
    }

    static java.security.KeyPair generateRsaKeyPair(int i) {
        try {
            java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(i);
            return keyPairGenerator.generateKeyPair();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.IllegalStateException("No support for RSA algorithm.", e);
        }
    }
}
