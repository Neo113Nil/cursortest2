package org.jose4j.jwx;

/* loaded from: classes18.dex */
public class KeyValidationSupport {
    public static final int MIN_RSA_KEY_LENGTH = 2048;

    public static void checkRsaKeySize(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        int bitLength;
        if (key == null) {
            throw new org.jose4j.lang.InvalidKeyException("The RSA key must not be null.");
        }
        if (!(key instanceof java.security.interfaces.RSAKey) || (bitLength = ((java.security.interfaces.RSAKey) key).getModulus().bitLength()) >= 2048) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("An RSA key of size 2048 bits or larger MUST be used with the all JOSE RSA algorithms (given key was only ");
        sb.append(bitLength);
        sb.append(" bits).");
        throw new org.jose4j.lang.InvalidKeyException(sb.toString());
    }

    public static <K extends java.security.Key> K castKey(java.security.Key key, java.lang.Class<K> cls) throws org.jose4j.lang.InvalidKeyException {
        notNull(key);
        try {
            return cls.cast(key);
        } catch (java.lang.ClassCastException e) {
            throw new org.jose4j.lang.InvalidKeyException("Invalid key ".concat(java.lang.String.valueOf(e)));
        }
    }

    public static void notNull(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        if (key == null) {
            throw new org.jose4j.lang.InvalidKeyException("The key must not be null.");
        }
    }

    public static void cekNotAllowed(byte[] bArr, java.lang.String str) throws org.jose4j.lang.InvalidKeyException {
        if (bArr != null) {
            throw new org.jose4j.lang.InvalidKeyException("An explicit content encryption key cannot be used with ".concat(java.lang.String.valueOf(str)));
        }
    }

    public static void validateAesWrappingKey(java.security.Key key, java.lang.String str, int i) throws org.jose4j.lang.InvalidKeyException {
        int length;
        notNull(key);
        java.lang.String algorithm = key.getAlgorithm();
        if (!org.jose4j.keys.AesKey.ALGORITHM.equals(algorithm)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid key for JWE ");
            sb.append(str);
            sb.append(", expected an AES key but an ");
            sb.append(algorithm);
            sb.append(" key was provided.");
            throw new org.jose4j.lang.InvalidKeyException(sb.toString());
        }
        if (key.getEncoded() == null || (length = key.getEncoded().length) == i) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid key for JWE ");
        sb2.append(str);
        sb2.append(", expected a ");
        sb2.append(org.jose4j.lang.ByteUtil.bitLength(i));
        sb2.append(" bit key but a ");
        sb2.append(org.jose4j.lang.ByteUtil.bitLength(length));
        sb2.append(" bit key was provided.");
        throw new org.jose4j.lang.InvalidKeyException(sb2.toString());
    }
}
