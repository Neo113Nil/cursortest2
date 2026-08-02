package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class AESCBC {
    public static final int IV_BIT_LENGTH = 128;

    public static byte[] generateIV(java.security.SecureRandom secureRandom) {
        byte[] bArr = new byte[com.nimbusds.jose.util.ByteUtils.byteLength(128)];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    private static javax.crypto.Cipher createAESCBCCipher(javax.crypto.SecretKey secretKey, boolean z, byte[] bArr, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        try {
            javax.crypto.Cipher cipherHelper = com.nimbusds.jose.crypto.impl.CipherHelper.getInstance("AES/CBC/PKCS5Padding", provider);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(secretKey.getEncoded(), org.jose4j.keys.AesKey.ALGORITHM);
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr);
            if (z) {
                cipherHelper.init(1, secretKeySpec, ivParameterSpec);
                return cipherHelper;
            }
            cipherHelper.init(2, secretKeySpec, ivParameterSpec);
            return cipherHelper;
        } catch (java.lang.Exception e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    public static byte[] encrypt(javax.crypto.SecretKey secretKey, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        try {
            return createAESCBCCipher(secretKey, true, bArr, provider).doFinal(bArr2);
        } catch (java.lang.Exception e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    public static com.nimbusds.jose.crypto.impl.AuthenticatedCipherText encryptAuthenticated(javax.crypto.SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, java.security.Provider provider, java.security.Provider provider2) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.crypto.impl.CompositeKey compositeKey = new com.nimbusds.jose.crypto.impl.CompositeKey(secretKey);
        byte[] encrypt = encrypt(compositeKey.getAESKey(), bArr, bArr2, provider);
        byte[] computeLength = com.nimbusds.jose.crypto.impl.AAD.computeLength(bArr3);
        int length = bArr3.length;
        int length2 = bArr.length;
        return new com.nimbusds.jose.crypto.impl.AuthenticatedCipherText(encrypt, java.util.Arrays.copyOf(com.nimbusds.jose.crypto.impl.HMAC.compute(compositeKey.getMACKey(), java.nio.ByteBuffer.allocate(length + length2 + encrypt.length + computeLength.length).put(bArr3).put(bArr).put(encrypt).put(computeLength).array(), provider2), compositeKey.getTruncatedMACByteLength()));
    }

    public static com.nimbusds.jose.crypto.impl.AuthenticatedCipherText encryptWithConcatKDF(com.nimbusds.jose.JWEHeader jWEHeader, javax.crypto.SecretKey secretKey, com.nimbusds.jose.util.Base64URL base64URL, byte[] bArr, byte[] bArr2, java.security.Provider provider, java.security.Provider provider2) throws com.nimbusds.jose.JOSEException {
        byte[] decode = jWEHeader.getCustomParam("epu") instanceof java.lang.String ? new com.nimbusds.jose.util.Base64URL((java.lang.String) jWEHeader.getCustomParam("epu")).decode() : null;
        byte[] decode2 = jWEHeader.getCustomParam("epv") instanceof java.lang.String ? new com.nimbusds.jose.util.Base64URL((java.lang.String) jWEHeader.getCustomParam("epv")).decode() : null;
        byte[] encrypt = encrypt(com.nimbusds.jose.crypto.impl.LegacyConcatKDF.generateCEK(secretKey, jWEHeader.getEncryptionMethod(), decode, decode2), bArr, bArr2, provider);
        javax.crypto.SecretKey generateCIK = com.nimbusds.jose.crypto.impl.LegacyConcatKDF.generateCIK(secretKey, jWEHeader.getEncryptionMethod(), decode, decode2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(jWEHeader.toBase64URL());
        sb.append(".");
        sb.append(base64URL);
        sb.append(".");
        sb.append(com.nimbusds.jose.util.Base64URL.encode(bArr));
        sb.append(".");
        sb.append(com.nimbusds.jose.util.Base64URL.encode(encrypt));
        return new com.nimbusds.jose.crypto.impl.AuthenticatedCipherText(encrypt, com.nimbusds.jose.crypto.impl.HMAC.compute(generateCIK, sb.toString().getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8), provider2));
    }

    public static byte[] decrypt(javax.crypto.SecretKey secretKey, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        try {
            return createAESCBCCipher(secretKey, false, bArr, provider).doFinal(bArr2);
        } catch (java.lang.Exception e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    public static byte[] decryptAuthenticated(javax.crypto.SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, java.security.Provider provider, java.security.Provider provider2) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.crypto.impl.CompositeKey compositeKey = new com.nimbusds.jose.crypto.impl.CompositeKey(secretKey);
        byte[] computeLength = com.nimbusds.jose.crypto.impl.AAD.computeLength(bArr3);
        int length = bArr3.length;
        int length2 = bArr.length;
        if (!com.nimbusds.jose.crypto.utils.ConstantTimeUtils.areEqual(java.util.Arrays.copyOf(com.nimbusds.jose.crypto.impl.HMAC.compute(compositeKey.getMACKey(), java.nio.ByteBuffer.allocate(length + length2 + bArr2.length + computeLength.length).put(bArr3).put(bArr).put(bArr2).put(computeLength).array(), provider2), compositeKey.getTruncatedMACByteLength()), bArr4)) {
            throw new com.nimbusds.jose.JOSEException("MAC check failed");
        }
        return decrypt(compositeKey.getAESKey(), bArr, bArr2, provider);
    }

    public static byte[] decryptWithConcatKDF(com.nimbusds.jose.JWEHeader jWEHeader, javax.crypto.SecretKey secretKey, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, java.security.Provider provider, java.security.Provider provider2) throws com.nimbusds.jose.JOSEException {
        byte[] decode = jWEHeader.getCustomParam("epu") instanceof java.lang.String ? new com.nimbusds.jose.util.Base64URL((java.lang.String) jWEHeader.getCustomParam("epu")).decode() : null;
        byte[] decode2 = jWEHeader.getCustomParam("epv") instanceof java.lang.String ? new com.nimbusds.jose.util.Base64URL((java.lang.String) jWEHeader.getCustomParam("epv")).decode() : null;
        javax.crypto.SecretKey generateCIK = com.nimbusds.jose.crypto.impl.LegacyConcatKDF.generateCIK(secretKey, jWEHeader.getEncryptionMethod(), decode, decode2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(jWEHeader.toBase64URL().toString());
        sb.append(".");
        sb.append(base64URL.toString());
        sb.append(".");
        sb.append(base64URL2.toString());
        sb.append(".");
        sb.append(base64URL3.toString());
        if (!com.nimbusds.jose.crypto.utils.ConstantTimeUtils.areEqual(base64URL4.decode(), com.nimbusds.jose.crypto.impl.HMAC.compute(generateCIK, sb.toString().getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8), provider2))) {
            throw new com.nimbusds.jose.JOSEException("MAC check failed");
        }
        return decrypt(com.nimbusds.jose.crypto.impl.LegacyConcatKDF.generateCEK(secretKey, jWEHeader.getEncryptionMethod(), decode, decode2), base64URL2.decode(), base64URL3.decode(), provider);
    }

    private AESCBC() {
    }
}
