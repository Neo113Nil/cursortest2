package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RSA_OAEP_SHA2 {
    private static final java.lang.String RSA_OEAP_256_JCA_ALG = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
    private static final java.lang.String RSA_OEAP_384_JCA_ALG = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
    private static final java.lang.String RSA_OEAP_512_JCA_ALG = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
    private static final java.lang.String SHA_256_JCA_ALG = "SHA-256";
    private static final java.lang.String SHA_384_JCA_ALG = "SHA-384";
    private static final java.lang.String SHA_512_JCA_ALG = "SHA-512";

    public static byte[] encryptCEK(java.security.interfaces.RSAPublicKey rSAPublicKey, javax.crypto.SecretKey secretKey, int i, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        java.security.spec.MGF1ParameterSpec mGF1ParameterSpec;
        java.lang.String str;
        java.lang.String str2;
        if (256 == i) {
            mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA256;
            str = RSA_OEAP_256_JCA_ALG;
            str2 = "SHA-256";
        } else if (384 == i) {
            mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA384;
            str = RSA_OEAP_384_JCA_ALG;
            str2 = "SHA-384";
        } else if (512 == i) {
            mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA512;
            str = RSA_OEAP_512_JCA_ALG;
            str2 = "SHA-512";
        } else {
            throw new com.nimbusds.jose.JOSEException("Unsupported SHA-2 bit size: ".concat(java.lang.String.valueOf(i)));
        }
        try {
            java.security.AlgorithmParameters algorithmParametersHelper = com.nimbusds.jose.crypto.impl.AlgorithmParametersHelper.getInstance("OAEP", provider);
            algorithmParametersHelper.init(new javax.crypto.spec.OAEPParameterSpec(str2, "MGF1", mGF1ParameterSpec, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            javax.crypto.Cipher cipherHelper = com.nimbusds.jose.crypto.impl.CipherHelper.getInstance(str, provider);
            cipherHelper.init(1, rSAPublicKey, algorithmParametersHelper);
            return cipherHelper.doFinal(secretKey.getEncoded());
        } catch (javax.crypto.IllegalBlockSizeException e) {
            throw new com.nimbusds.jose.JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e);
        } catch (java.lang.Exception e2) {
            throw new com.nimbusds.jose.JOSEException(e2.getMessage(), e2);
        }
    }

    public static javax.crypto.SecretKey decryptCEK(java.security.PrivateKey privateKey, byte[] bArr, int i, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        java.security.spec.MGF1ParameterSpec mGF1ParameterSpec;
        java.lang.String str;
        java.lang.String str2;
        if (256 == i) {
            mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA256;
            str = RSA_OEAP_256_JCA_ALG;
            str2 = "SHA-256";
        } else if (384 == i) {
            mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA384;
            str = RSA_OEAP_384_JCA_ALG;
            str2 = "SHA-384";
        } else if (512 == i) {
            mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA512;
            str = RSA_OEAP_512_JCA_ALG;
            str2 = "SHA-512";
        } else {
            throw new com.nimbusds.jose.JOSEException("Unsupported SHA-2 bit size: ".concat(java.lang.String.valueOf(i)));
        }
        try {
            java.security.AlgorithmParameters algorithmParametersHelper = com.nimbusds.jose.crypto.impl.AlgorithmParametersHelper.getInstance("OAEP", provider);
            algorithmParametersHelper.init(new javax.crypto.spec.OAEPParameterSpec(str2, "MGF1", mGF1ParameterSpec, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            javax.crypto.Cipher cipherHelper = com.nimbusds.jose.crypto.impl.CipherHelper.getInstance(str, provider);
            cipherHelper.init(2, privateKey, algorithmParametersHelper);
            return new javax.crypto.spec.SecretKeySpec(cipherHelper.doFinal(bArr), org.jose4j.keys.AesKey.ALGORITHM);
        } catch (java.lang.Exception e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    private RSA_OAEP_SHA2() {
    }
}
