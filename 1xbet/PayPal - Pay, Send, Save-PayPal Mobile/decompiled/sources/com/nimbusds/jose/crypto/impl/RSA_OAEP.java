package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RSA_OAEP {
    private static final java.lang.String RSA_OEAP_JCA_ALG = "RSA/ECB/OAEPWithSHA-1AndMGF1Padding";

    public static byte[] encryptCEK(java.security.interfaces.RSAPublicKey rSAPublicKey, javax.crypto.SecretKey secretKey, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        try {
            javax.crypto.Cipher cipherHelper = com.nimbusds.jose.crypto.impl.CipherHelper.getInstance(RSA_OEAP_JCA_ALG, provider);
            cipherHelper.init(1, rSAPublicKey, new java.security.SecureRandom());
            return cipherHelper.doFinal(secretKey.getEncoded());
        } catch (javax.crypto.IllegalBlockSizeException e) {
            throw new com.nimbusds.jose.JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
        } catch (java.lang.Exception e2) {
            throw new com.nimbusds.jose.JOSEException(e2.getMessage(), e2);
        }
    }

    public static javax.crypto.SecretKey decryptCEK(java.security.PrivateKey privateKey, byte[] bArr, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        try {
            javax.crypto.Cipher cipherHelper = com.nimbusds.jose.crypto.impl.CipherHelper.getInstance(RSA_OEAP_JCA_ALG, provider);
            cipherHelper.init(2, privateKey);
            return new javax.crypto.spec.SecretKeySpec(cipherHelper.doFinal(bArr), org.jose4j.keys.AesKey.ALGORITHM);
        } catch (java.lang.Exception e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    private RSA_OAEP() {
    }
}
