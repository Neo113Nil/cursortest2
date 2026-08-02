package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public class ContentCryptoProvider {
    public static final java.util.Map<java.lang.Integer, java.util.Set<com.nimbusds.jose.EncryptionMethod>> COMPATIBLE_ENCRYPTION_METHODS;
    public static final java.util.Set<com.nimbusds.jose.EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.EncryptionMethod.A128CBC_HS256);
        linkedHashSet.add(com.nimbusds.jose.EncryptionMethod.A192CBC_HS384);
        linkedHashSet.add(com.nimbusds.jose.EncryptionMethod.A256CBC_HS512);
        linkedHashSet.add(com.nimbusds.jose.EncryptionMethod.A128GCM);
        linkedHashSet.add(com.nimbusds.jose.EncryptionMethod.A192GCM);
        linkedHashSet.add(com.nimbusds.jose.EncryptionMethod.A256GCM);
        linkedHashSet.add(com.nimbusds.jose.EncryptionMethod.A128CBC_HS256_DEPRECATED);
        linkedHashSet.add(com.nimbusds.jose.EncryptionMethod.A256CBC_HS512_DEPRECATED);
        linkedHashSet.add(com.nimbusds.jose.EncryptionMethod.XC20P);
        SUPPORTED_ENCRYPTION_METHODS = java.util.Collections.unmodifiableSet(linkedHashSet);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        java.util.HashSet hashSet4 = new java.util.HashSet();
        java.util.HashSet hashSet5 = new java.util.HashSet();
        hashSet.add(com.nimbusds.jose.EncryptionMethod.A128GCM);
        hashSet2.add(com.nimbusds.jose.EncryptionMethod.A192GCM);
        hashSet3.add(com.nimbusds.jose.EncryptionMethod.A256GCM);
        hashSet3.add(com.nimbusds.jose.EncryptionMethod.A128CBC_HS256);
        hashSet3.add(com.nimbusds.jose.EncryptionMethod.A128CBC_HS256_DEPRECATED);
        hashSet3.add(com.nimbusds.jose.EncryptionMethod.XC20P);
        hashSet4.add(com.nimbusds.jose.EncryptionMethod.A192CBC_HS384);
        hashSet5.add(com.nimbusds.jose.EncryptionMethod.A256CBC_HS512);
        hashSet5.add(com.nimbusds.jose.EncryptionMethod.A256CBC_HS512_DEPRECATED);
        hashMap.put(128, java.util.Collections.unmodifiableSet(hashSet));
        hashMap.put(192, java.util.Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, java.util.Collections.unmodifiableSet(hashSet3));
        hashMap.put(384, java.util.Collections.unmodifiableSet(hashSet4));
        hashMap.put(512, java.util.Collections.unmodifiableSet(hashSet5));
        COMPATIBLE_ENCRYPTION_METHODS = java.util.Collections.unmodifiableMap(hashMap);
    }

    public static javax.crypto.SecretKey generateCEK(com.nimbusds.jose.EncryptionMethod encryptionMethod, java.security.SecureRandom secureRandom) throws com.nimbusds.jose.JOSEException {
        java.util.Set<com.nimbusds.jose.EncryptionMethod> set = SUPPORTED_ENCRYPTION_METHODS;
        if (!set.contains(encryptionMethod)) {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedEncryptionMethod(encryptionMethod, set));
        }
        byte[] bArr = new byte[com.nimbusds.jose.util.ByteUtils.byteLength(encryptionMethod.cekBitLength())];
        secureRandom.nextBytes(bArr);
        return new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM);
    }

    private static void checkCEKLength(javax.crypto.SecretKey secretKey, com.nimbusds.jose.EncryptionMethod encryptionMethod) throws com.nimbusds.jose.KeyLengthException {
        try {
            int safeBitLength = com.nimbusds.jose.util.ByteUtils.safeBitLength(secretKey.getEncoded());
            if (safeBitLength == 0 || encryptionMethod.cekBitLength() == safeBitLength) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The Content Encryption Key (CEK) length for ");
            sb.append(encryptionMethod);
            sb.append(" must be ");
            sb.append(encryptionMethod.cekBitLength());
            sb.append(" bits");
            throw new com.nimbusds.jose.KeyLengthException(sb.toString());
        } catch (com.nimbusds.jose.util.IntegerOverflowException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The Content Encryption Key (CEK) is too long: ");
            sb2.append(e.getMessage());
            throw new com.nimbusds.jose.KeyLengthException(sb2.toString());
        }
    }

    public static com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, javax.crypto.SecretKey secretKey, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.jca.JWEJCAContext jWEJCAContext) throws com.nimbusds.jose.JOSEException {
        return encrypt(jWEHeader, bArr, null, secretKey, base64URL, jWEJCAContext);
    }

    public static com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, byte[] bArr2, javax.crypto.SecretKey secretKey, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.jca.JWEJCAContext jWEJCAContext) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.crypto.impl.AuthenticatedCipherText encryptAuthenticated;
        byte[] bArr3;
        byte[] bArr4 = bArr2;
        while (bArr4 == null) {
            bArr4 = com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader);
        }
        checkCEKLength(secretKey, jWEHeader.getEncryptionMethod());
        byte[] applyCompression = com.nimbusds.jose.crypto.impl.DeflateHelper.applyCompression(jWEHeader, bArr);
        if (jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A256CBC_HS512)) {
            byte[] generateIV = com.nimbusds.jose.crypto.impl.AESCBC.generateIV(jWEJCAContext.getSecureRandom());
            encryptAuthenticated = com.nimbusds.jose.crypto.impl.AESCBC.encryptAuthenticated(secretKey, generateIV, applyCompression, bArr4, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
            bArr3 = generateIV;
        } else if (jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A256GCM)) {
            com.nimbusds.jose.util.Container container = new com.nimbusds.jose.util.Container(com.nimbusds.jose.crypto.impl.AESGCM.generateIV(jWEJCAContext.getSecureRandom()));
            encryptAuthenticated = com.nimbusds.jose.crypto.impl.AESGCM.encrypt(secretKey, container, applyCompression, bArr4, jWEJCAContext.getContentEncryptionProvider());
            bArr3 = (byte[]) container.get();
        } else if (jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A128CBC_HS256_DEPRECATED) || jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
            byte[] generateIV2 = com.nimbusds.jose.crypto.impl.AESCBC.generateIV(jWEJCAContext.getSecureRandom());
            encryptAuthenticated = com.nimbusds.jose.crypto.impl.AESCBC.encryptWithConcatKDF(jWEHeader, secretKey, base64URL, generateIV2, applyCompression, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
            bArr3 = generateIV2;
        } else if (jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.XC20P)) {
            com.nimbusds.jose.util.Container container2 = new com.nimbusds.jose.util.Container(null);
            encryptAuthenticated = com.nimbusds.jose.crypto.impl.XC20P.encryptAuthenticated(secretKey, container2, applyCompression, bArr4);
            bArr3 = (byte[]) container2.get();
        } else {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
        }
        return new com.nimbusds.jose.JWECryptoParts(jWEHeader, base64URL, com.nimbusds.jose.util.Base64URL.encode(bArr3), com.nimbusds.jose.util.Base64URL.encode(encryptAuthenticated.getCipherText()), com.nimbusds.jose.util.Base64URL.encode(encryptAuthenticated.getAuthenticationTag()));
    }

    public static byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, javax.crypto.SecretKey secretKey, com.nimbusds.jose.jca.JWEJCAContext jWEJCAContext) throws com.nimbusds.jose.JOSEException {
        return decrypt(jWEHeader, null, base64URL, base64URL2, base64URL3, base64URL4, secretKey, jWEJCAContext);
    }

    public static byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, javax.crypto.SecretKey secretKey, com.nimbusds.jose.jca.JWEJCAContext jWEJCAContext) throws com.nimbusds.jose.JOSEException {
        byte[] decryptAuthenticated;
        byte[] bArr2 = bArr;
        while (bArr2 == null) {
            bArr2 = com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader);
        }
        checkCEKLength(secretKey, jWEHeader.getEncryptionMethod());
        if (jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A256CBC_HS512)) {
            decryptAuthenticated = com.nimbusds.jose.crypto.impl.AESCBC.decryptAuthenticated(secretKey, base64URL2.decode(), base64URL3.decode(), bArr2, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A256GCM)) {
            decryptAuthenticated = com.nimbusds.jose.crypto.impl.AESGCM.decrypt(secretKey, base64URL2.decode(), base64URL3.decode(), bArr2, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A128CBC_HS256_DEPRECATED) || jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
            decryptAuthenticated = com.nimbusds.jose.crypto.impl.AESCBC.decryptWithConcatKDF(jWEHeader, secretKey, base64URL, base64URL2, base64URL3, base64URL4, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(com.nimbusds.jose.EncryptionMethod.XC20P)) {
            decryptAuthenticated = com.nimbusds.jose.crypto.impl.XC20P.decryptAuthenticated(secretKey, base64URL2.decode(), base64URL3.decode(), bArr2, base64URL4.decode());
        } else {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
        }
        return com.nimbusds.jose.crypto.impl.DeflateHelper.applyDecompression(jWEHeader, decryptAuthenticated);
    }
}
