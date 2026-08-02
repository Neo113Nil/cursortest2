package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class DirectDecrypter extends com.nimbusds.jose.crypto.impl.DirectCryptoProvider implements com.nimbusds.jose.JWEDecrypter, com.nimbusds.jose.CriticalHeaderParamsAware {
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;
    private final boolean promiscuousMode;

    public DirectDecrypter(javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.KeyLengthException {
        this(secretKey, false);
    }

    public DirectDecrypter(javax.crypto.SecretKey secretKey, boolean z) throws com.nimbusds.jose.KeyLengthException {
        super(secretKey);
        this.critPolicy = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.promiscuousMode = z;
    }

    public DirectDecrypter(byte[] bArr) throws com.nimbusds.jose.KeyLengthException {
        this((javax.crypto.SecretKey) new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM), false);
    }

    public DirectDecrypter(com.nimbusds.jose.jwk.OctetSequenceKey octetSequenceKey) throws com.nimbusds.jose.KeyLengthException {
        this(octetSequenceKey.toSecretKey(org.jose4j.keys.AesKey.ALGORITHM));
    }

    public DirectDecrypter(javax.crypto.SecretKey secretKey, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.KeyLengthException {
        this(secretKey, set, false);
    }

    public DirectDecrypter(javax.crypto.SecretKey secretKey, java.util.Set<java.lang.String> set, boolean z) throws com.nimbusds.jose.KeyLengthException {
        super(secretKey);
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
        this.promiscuousMode = z;
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
        if (!this.promiscuousMode) {
            com.nimbusds.jose.JWEAlgorithm algorithmAndEnsureNotNull = com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
            if (!algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.DIR)) {
                throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithmAndEnsureNotNull, SUPPORTED_ALGORITHMS));
            }
            if (base64URL != null) {
                throw new com.nimbusds.jose.JOSEException("Unexpected present JWE encrypted key");
            }
        }
        if (base64URL2 == null) {
            throw new com.nimbusds.jose.JOSEException("Unexpected present JWE initialization vector (IV)");
        }
        if (base64URL4 == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE authentication tag");
        }
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.decrypt(jWEHeader, bArr, null, base64URL2, base64URL3, base64URL4, getKey(), getJCAContext());
    }
}
