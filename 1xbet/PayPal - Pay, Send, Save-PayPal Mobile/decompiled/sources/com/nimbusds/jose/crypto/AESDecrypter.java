package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class AESDecrypter extends com.nimbusds.jose.crypto.impl.AESCryptoProvider implements com.nimbusds.jose.JWEDecrypter, com.nimbusds.jose.CriticalHeaderParamsAware {
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;

    public AESDecrypter(javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.KeyLengthException {
        this(secretKey, null);
    }

    public AESDecrypter(byte[] bArr) throws com.nimbusds.jose.KeyLengthException {
        this(new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM));
    }

    public AESDecrypter(com.nimbusds.jose.jwk.OctetSequenceKey octetSequenceKey) throws com.nimbusds.jose.KeyLengthException {
        this(octetSequenceKey.toSecretKey(org.jose4j.keys.AesKey.ALGORITHM));
    }

    public AESDecrypter(javax.crypto.SecretKey secretKey, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.KeyLengthException {
        super(secretKey, null);
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
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
        javax.crypto.SecretKey unwrapCEK;
        if (base64URL == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE encrypted key");
        }
        if (base64URL2 == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE initialization vector (IV)");
        }
        if (base64URL4 == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE authentication tag");
        }
        com.nimbusds.jose.JWEAlgorithm algorithmAndEnsureNotNull = com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        int cekBitLength = jWEHeader.getEncryptionMethod().cekBitLength();
        if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A128KW) || algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A192KW) || algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A256KW)) {
            unwrapCEK = com.nimbusds.jose.crypto.impl.AESKW.unwrapCEK(getKey(), base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
        } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A128GCMKW) || algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A192GCMKW) || algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A256GCMKW)) {
            if (jWEHeader.getIV() == null) {
                throw new com.nimbusds.jose.JOSEException("Missing JWE \"iv\" header parameter");
            }
            byte[] decode = jWEHeader.getIV().decode();
            if (jWEHeader.getAuthTag() == null) {
                throw new com.nimbusds.jose.JOSEException("Missing JWE \"tag\" header parameter");
            }
            unwrapCEK = com.nimbusds.jose.crypto.impl.AESGCMKW.decryptCEK(getKey(), decode, new com.nimbusds.jose.crypto.impl.AuthenticatedCipherText(base64URL.decode(), jWEHeader.getAuthTag().decode()), cekBitLength, getJCAContext().getKeyEncryptionProvider());
        } else {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithmAndEnsureNotNull, SUPPORTED_ALGORITHMS));
        }
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.decrypt(jWEHeader, bArr, base64URL, base64URL2, base64URL3, base64URL4, unwrapCEK, getJCAContext());
    }
}
