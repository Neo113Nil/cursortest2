package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class AESKW {
    public static byte[] wrapCEK(javax.crypto.SecretKey secretKey, javax.crypto.SecretKey secretKey2, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        javax.crypto.Cipher cipher;
        try {
            if (provider != null) {
                cipher = javax.crypto.Cipher.getInstance("AESWrap", provider);
            } else {
                cipher = javax.crypto.Cipher.getInstance("AESWrap");
            }
            cipher.init(3, secretKey2);
            return cipher.wrap(secretKey);
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't wrap AES key: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }

    public static javax.crypto.SecretKey unwrapCEK(javax.crypto.SecretKey secretKey, byte[] bArr, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        javax.crypto.Cipher cipher;
        try {
            if (provider != null) {
                cipher = javax.crypto.Cipher.getInstance("AESWrap", provider);
            } else {
                cipher = javax.crypto.Cipher.getInstance("AESWrap");
            }
            cipher.init(4, com.nimbusds.jose.util.KeyUtils.toAESKey(secretKey));
            return (javax.crypto.SecretKey) cipher.unwrap(bArr, org.jose4j.keys.AesKey.ALGORITHM, 3);
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't unwrap AES key: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }

    private AESKW() {
    }
}
