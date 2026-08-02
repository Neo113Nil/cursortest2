package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes4.dex */
public class MACVerifier extends com.nimbusds.jose.crypto.impl.MACProvider implements com.nimbusds.jose.JWSVerifier, com.nimbusds.jose.CriticalHeaderParamsAware {
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;

    public MACVerifier(byte[] bArr) throws com.nimbusds.jose.JOSEException {
        this(bArr, (java.util.Set<java.lang.String>) null);
    }

    public MACVerifier(java.lang.String str) throws com.nimbusds.jose.JOSEException {
        this(str.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8));
    }

    public MACVerifier(javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.JOSEException {
        this(secretKey, (java.util.Set<java.lang.String>) null);
    }

    public MACVerifier(com.nimbusds.jose.jwk.OctetSequenceKey octetSequenceKey) throws com.nimbusds.jose.JOSEException {
        this(octetSequenceKey.toByteArray());
    }

    public MACVerifier(byte[] bArr, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.JOSEException {
        super(bArr, SUPPORTED_ALGORITHMS);
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    public MACVerifier(javax.crypto.SecretKey secretKey, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.JOSEException {
        super(secretKey, SUPPORTED_ALGORITHMS);
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    public MACVerifier(com.nimbusds.jose.jwk.OctetSequenceKey octetSequenceKey, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.JOSEException {
        this(octetSequenceKey.toByteArray(), set);
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public boolean verify(com.nimbusds.jose.JWSHeader jWSHeader, byte[] bArr, com.nimbusds.jose.util.Base64URL base64URL) throws com.nimbusds.jose.JOSEException {
        if (this.critPolicy.headerPasses(jWSHeader)) {
            return com.nimbusds.jose.crypto.utils.ConstantTimeUtils.areEqual(com.nimbusds.jose.crypto.impl.HMAC.compute(getJCAAlgorithmName(jWSHeader.getAlgorithm()), getSecretKey(), bArr, getJCAContext().getProvider()), base64URL.decode());
        }
        return false;
    }
}
