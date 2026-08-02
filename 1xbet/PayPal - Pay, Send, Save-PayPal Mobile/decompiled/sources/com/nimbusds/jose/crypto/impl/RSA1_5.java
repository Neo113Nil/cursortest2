package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RSA1_5 {
    public static byte[] encryptCEK(java.security.interfaces.RSAPublicKey rSAPublicKey, javax.crypto.SecretKey secretKey, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        try {
            javax.crypto.Cipher cipherHelper = com.nimbusds.jose.crypto.impl.CipherHelper.getInstance("RSA/ECB/PKCS1Padding", provider);
            cipherHelper.init(1, rSAPublicKey);
            return cipherHelper.doFinal(secretKey.getEncoded());
        } catch (javax.crypto.IllegalBlockSizeException e) {
            throw new com.nimbusds.jose.JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e);
        } catch (java.lang.Exception e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't encrypt Content Encryption Key (CEK): ");
            sb.append(e2.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e2);
        }
    }

    public static javax.crypto.SecretKey decryptCEK(java.security.PrivateKey privateKey, byte[] bArr, int i, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        try {
            javax.crypto.Cipher cipherHelper = com.nimbusds.jose.crypto.impl.CipherHelper.getInstance("RSA/ECB/PKCS1Padding", provider);
            cipherHelper.init(2, privateKey);
            byte[] doFinal = cipherHelper.doFinal(bArr);
            if (com.nimbusds.jose.util.ByteUtils.safeBitLength(doFinal) != i) {
                return null;
            }
            return new javax.crypto.spec.SecretKeySpec(doFinal, org.jose4j.keys.AesKey.ALGORITHM);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't decrypt Content Encryption Key (CEK): ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }

    private RSA1_5() {
    }
}
