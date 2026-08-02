package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class AESGCMKW {
    public static com.nimbusds.jose.crypto.impl.AuthenticatedCipherText encryptCEK(javax.crypto.SecretKey secretKey, com.nimbusds.jose.util.Container<byte[]> container, javax.crypto.SecretKey secretKey2, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        return com.nimbusds.jose.crypto.impl.AESGCM.encrypt(secretKey2, container, secretKey.getEncoded(), new byte[0], provider);
    }

    public static javax.crypto.SecretKey decryptCEK(javax.crypto.SecretKey secretKey, byte[] bArr, com.nimbusds.jose.crypto.impl.AuthenticatedCipherText authenticatedCipherText, int i, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        byte[] decrypt = com.nimbusds.jose.crypto.impl.AESGCM.decrypt(secretKey, bArr, authenticatedCipherText.getCipherText(), new byte[0], authenticatedCipherText.getAuthenticationTag(), provider);
        if (com.nimbusds.jose.util.ByteUtils.safeBitLength(decrypt) != i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CEK key length mismatch: ");
            sb.append(com.nimbusds.jose.util.ByteUtils.safeBitLength(decrypt));
            sb.append(" != ");
            sb.append(i);
            throw new com.nimbusds.jose.KeyLengthException(sb.toString());
        }
        return new javax.crypto.spec.SecretKeySpec(decrypt, org.jose4j.keys.AesKey.ALGORITHM);
    }

    private AESGCMKW() {
    }
}
