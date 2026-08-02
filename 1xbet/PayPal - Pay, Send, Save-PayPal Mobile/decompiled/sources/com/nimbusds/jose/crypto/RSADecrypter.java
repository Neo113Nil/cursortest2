package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RSADecrypter extends com.nimbusds.jose.crypto.impl.RSACryptoProvider implements com.nimbusds.jose.JWEDecrypter, com.nimbusds.jose.CriticalHeaderParamsAware {
    private java.lang.Exception cekDecryptionException;
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;
    private final java.security.PrivateKey privateKey;

    public RSADecrypter(java.security.PrivateKey privateKey) {
        this(privateKey, null, false);
    }

    public RSADecrypter(com.nimbusds.jose.jwk.RSAKey rSAKey) throws com.nimbusds.jose.JOSEException {
        this(com.nimbusds.jose.crypto.impl.RSAKeyUtils.toRSAPrivateKey(rSAKey));
    }

    public RSADecrypter(java.security.PrivateKey privateKey, java.util.Set<java.lang.String> set) {
        this(privateKey, set, false);
    }

    public RSADecrypter(java.security.PrivateKey privateKey, java.util.Set<java.lang.String> set, boolean z) {
        super(null);
        int keyBitLength;
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        if (!privateKey.getAlgorithm().equalsIgnoreCase("RSA")) {
            throw new java.lang.IllegalArgumentException("The private key algorithm must be RSA");
        }
        if (!z && (keyBitLength = com.nimbusds.jose.crypto.impl.RSAKeyUtils.keyBitLength(privateKey)) > 0 && keyBitLength < 2048) {
            throw new java.lang.IllegalArgumentException("The RSA key size must be at least 2048 bits");
        }
        this.privateKey = privateKey;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    public java.security.PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @java.lang.Deprecated
    public byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4) throws com.nimbusds.jose.JOSEException {
        return decrypt(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        javax.crypto.SecretKey decryptCEK;
        javax.crypto.SecretKey secretKey;
        if (base64URL == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE encrypted key");
        }
        if (base64URL2 == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE initialization vector (IV)");
        }
        if (base64URL4 == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE authentication tag");
        }
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        com.nimbusds.jose.JWEAlgorithm algorithmAndEnsureNotNull = com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
        if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.RSA1_5)) {
            int cekBitLength = jWEHeader.getEncryptionMethod().cekBitLength();
            javax.crypto.SecretKey generateCEK = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.generateCEK(jWEHeader.getEncryptionMethod(), getJCAContext().getSecureRandom());
            try {
                javax.crypto.SecretKey decryptCEK2 = com.nimbusds.jose.crypto.impl.RSA1_5.decryptCEK(this.privateKey, base64URL.decode(), cekBitLength, getJCAContext().getKeyEncryptionProvider());
                if (decryptCEK2 != null) {
                    generateCEK = decryptCEK2;
                }
            } catch (java.lang.Exception e) {
                this.cekDecryptionException = e;
            }
            this.cekDecryptionException = null;
            secretKey = generateCEK;
        } else {
            if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP)) {
                decryptCEK = com.nimbusds.jose.crypto.impl.RSA_OAEP.decryptCEK(this.privateKey, base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
            } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_256)) {
                decryptCEK = com.nimbusds.jose.crypto.impl.RSA_OAEP_SHA2.decryptCEK(this.privateKey, base64URL.decode(), 256, getJCAContext().getKeyEncryptionProvider());
            } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_384)) {
                decryptCEK = com.nimbusds.jose.crypto.impl.RSA_OAEP_SHA2.decryptCEK(this.privateKey, base64URL.decode(), 384, getJCAContext().getKeyEncryptionProvider());
            } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_512)) {
                decryptCEK = com.nimbusds.jose.crypto.impl.RSA_OAEP_SHA2.decryptCEK(this.privateKey, base64URL.decode(), 512, getJCAContext().getKeyEncryptionProvider());
            } else {
                throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithmAndEnsureNotNull, SUPPORTED_ALGORITHMS));
            }
            secretKey = decryptCEK;
        }
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.decrypt(jWEHeader, bArr, base64URL, base64URL2, base64URL3, base64URL4, secretKey, getJCAContext());
    }

    public java.lang.Exception getCEKDecryptionException() {
        return this.cekDecryptionException;
    }
}
