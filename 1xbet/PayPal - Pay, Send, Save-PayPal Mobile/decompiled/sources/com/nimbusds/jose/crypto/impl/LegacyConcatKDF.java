package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public class LegacyConcatKDF {
    private static final byte[] ONE_BYTES = {0, 0, 0, 1};
    private static final byte[] ZERO_BYTES = {0, 0, 0, 0};
    private static final byte[] ENCRYPTION_BYTES = {69, 110, 99, 114, 121, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 116, 105, 111, 110};
    private static final byte[] INTEGRITY_BYTES = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static javax.crypto.SecretKey generateCEK(javax.crypto.SecretKey secretKey, com.nimbusds.jose.EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(ONE_BYTES);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(com.nimbusds.jose.util.IntegerUtils.toBytes(length / 2));
            byteArrayOutputStream.write(encryptionMethod.toString().getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8));
            if (bArr != null) {
                byteArrayOutputStream.write(com.nimbusds.jose.util.IntegerUtils.toBytes(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(ZERO_BYTES);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(com.nimbusds.jose.util.IntegerUtils.toBytes(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(ZERO_BYTES);
            }
            byteArrayOutputStream.write(ENCRYPTION_BYTES);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SHA-");
                sb.append(length);
                byte[] digest = java.security.MessageDigest.getInstance(sb.toString()).digest(byteArray);
                int length2 = digest.length / 2;
                byte[] bArr3 = new byte[length2];
                java.lang.System.arraycopy(digest, 0, bArr3, 0, length2);
                return new javax.crypto.spec.SecretKeySpec(bArr3, org.jose4j.keys.AesKey.ALGORITHM);
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
            }
        } catch (java.io.IOException e2) {
            throw new com.nimbusds.jose.JOSEException(e2.getMessage(), e2);
        }
    }

    public static javax.crypto.SecretKey generateCIK(javax.crypto.SecretKey secretKey, com.nimbusds.jose.EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(ONE_BYTES);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(com.nimbusds.jose.util.IntegerUtils.toBytes(length));
            byteArrayOutputStream.write(encryptionMethod.toString().getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8));
            if (bArr != null) {
                byteArrayOutputStream.write(com.nimbusds.jose.util.IntegerUtils.toBytes(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(ZERO_BYTES);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(com.nimbusds.jose.util.IntegerUtils.toBytes(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(ZERO_BYTES);
            }
            byteArrayOutputStream.write(INTEGRITY_BYTES);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SHA-");
                sb.append(length);
                return new javax.crypto.spec.SecretKeySpec(java.security.MessageDigest.getInstance(sb.toString()).digest(byteArray), "HMACSHA".concat(java.lang.String.valueOf(length)));
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
            }
        } catch (java.io.IOException e2) {
            throw new com.nimbusds.jose.JOSEException(e2.getMessage(), e2);
        }
    }

    private LegacyConcatKDF() {
    }
}
