package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class ConcatKDF implements com.nimbusds.jose.jca.JCAAware<com.nimbusds.jose.jca.JCAContext> {
    private final com.nimbusds.jose.jca.JCAContext jcaContext = new com.nimbusds.jose.jca.JCAContext();
    private final java.lang.String jcaHashAlg;

    public ConcatKDF(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The JCA hash algorithm must not be null");
        }
        this.jcaHashAlg = str;
    }

    public java.lang.String getHashAlgorithm() {
        return this.jcaHashAlg;
    }

    @Override // com.nimbusds.jose.jca.JCAAware
    public com.nimbusds.jose.jca.JCAContext getJCAContext() {
        return this.jcaContext;
    }

    public javax.crypto.SecretKey deriveKey(javax.crypto.SecretKey secretKey, int i, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.security.MessageDigest messageDigest = getMessageDigest();
        for (int i2 = 1; i2 <= computeDigestCycles(com.nimbusds.jose.util.ByteUtils.safeBitLength(messageDigest.getDigestLength()), i); i2++) {
            messageDigest.update(com.nimbusds.jose.util.IntegerUtils.toBytes(i2));
            messageDigest.update(secretKey.getEncoded());
            if (bArr != null) {
                messageDigest.update(bArr);
            }
            try {
                byteArrayOutputStream.write(messageDigest.digest());
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't write derived key: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int byteLength = com.nimbusds.jose.util.ByteUtils.byteLength(i);
        if (byteArray.length == byteLength) {
            return new javax.crypto.spec.SecretKeySpec(byteArray, org.jose4j.keys.AesKey.ALGORITHM);
        }
        return new javax.crypto.spec.SecretKeySpec(com.nimbusds.jose.util.ByteUtils.subArray(byteArray, 0, byteLength), org.jose4j.keys.AesKey.ALGORITHM);
    }

    public javax.crypto.SecretKey deriveKey(javax.crypto.SecretKey secretKey, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws com.nimbusds.jose.JOSEException {
        return deriveKey(secretKey, i, composeOtherInfo(bArr, bArr2, bArr3, bArr4, bArr5));
    }

    public javax.crypto.SecretKey deriveKey(javax.crypto.SecretKey secretKey, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) throws com.nimbusds.jose.JOSEException {
        return deriveKey(secretKey, i, composeOtherInfo(bArr, bArr2, bArr3, bArr4, bArr5, bArr6));
    }

    public static byte[] composeOtherInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return com.nimbusds.jose.util.ByteUtils.concat(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static byte[] composeOtherInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        return com.nimbusds.jose.util.ByteUtils.concat(bArr, bArr2, bArr3, bArr4, bArr5, bArr6);
    }

    private java.security.MessageDigest getMessageDigest() throws com.nimbusds.jose.JOSEException {
        java.security.Provider provider = getJCAContext().getProvider();
        try {
            if (provider == null) {
                return java.security.MessageDigest.getInstance(this.jcaHashAlg);
            }
            return java.security.MessageDigest.getInstance(this.jcaHashAlg, provider);
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't get message digest for KDF: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }

    public static int computeDigestCycles(int i, int i2) {
        return ((i2 + i) - 1) / i;
    }

    public static byte[] encodeNoData() {
        return new byte[0];
    }

    public static byte[] encodeIntData(int i) {
        return com.nimbusds.jose.util.IntegerUtils.toBytes(i);
    }

    public static byte[] encodeStringData(java.lang.String str) {
        return encodeDataWithLength(str != null ? str.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8) : null);
    }

    public static byte[] encodeDataWithLength(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return com.nimbusds.jose.util.ByteUtils.concat(com.nimbusds.jose.util.IntegerUtils.toBytes(bArr.length), bArr);
    }

    public static byte[] encodeDataWithLength(com.nimbusds.jose.util.Base64URL base64URL) {
        return encodeDataWithLength(base64URL != null ? base64URL.decode() : null);
    }
}
