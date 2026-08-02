package com.nimbusds.jose.crypto;

/* loaded from: classes10.dex */
public class ECDHDecrypter extends com.nimbusds.jose.crypto.impl.ECDHCryptoProvider implements com.nimbusds.jose.JWEDecrypter, com.nimbusds.jose.CriticalHeaderParamsAware {
    public static final java.util.Set<com.nimbusds.jose.jwk.Curve> SUPPORTED_ELLIPTIC_CURVES;
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;
    private final java.security.PrivateKey privateKey;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.P_256);
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.P_384);
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.P_521);
        SUPPORTED_ELLIPTIC_CURVES = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public ECDHDecrypter(java.security.interfaces.ECPrivateKey eCPrivateKey) throws com.nimbusds.jose.JOSEException {
        this(eCPrivateKey, null);
    }

    public ECDHDecrypter(com.nimbusds.jose.jwk.ECKey eCKey) throws com.nimbusds.jose.JOSEException {
        super(eCKey.getCurve(), null);
        this.critPolicy = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        if (!eCKey.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("The EC JWK doesn't contain a private part");
        }
        this.privateKey = eCKey.toECPrivateKey();
    }

    public ECDHDecrypter(java.security.interfaces.ECPrivateKey eCPrivateKey, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.JOSEException {
        this(eCPrivateKey, set, com.nimbusds.jose.jwk.Curve.forECParameterSpec(eCPrivateKey.getParams()));
    }

    public ECDHDecrypter(java.security.PrivateKey privateKey, java.util.Set<java.lang.String> set, com.nimbusds.jose.jwk.Curve curve) throws com.nimbusds.jose.JOSEException {
        super(curve, null);
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
        this.privateKey = privateKey;
    }

    public java.security.PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDHCryptoProvider
    public java.util.Set<com.nimbusds.jose.jwk.Curve> supportedEllipticCurves() {
        return SUPPORTED_ELLIPTIC_CURVES;
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
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        com.nimbusds.jose.jwk.ECKey eCKey = (com.nimbusds.jose.jwk.ECKey) jWEHeader.getEphemeralPublicKey();
        if (eCKey == null) {
            throw new com.nimbusds.jose.JOSEException("Missing ephemeral public EC key \"epk\" JWE header parameter");
        }
        java.security.interfaces.ECPublicKey eCPublicKey = eCKey.toECPublicKey();
        if (getPrivateKey() instanceof java.security.interfaces.ECPrivateKey) {
            if (!com.nimbusds.jose.crypto.utils.ECChecks.isPointOnCurve(eCPublicKey, (java.security.interfaces.ECPrivateKey) getPrivateKey())) {
                throw new com.nimbusds.jose.JOSEException("Invalid ephemeral public EC key: Point(s) not on the expected curve");
            }
        } else if (!com.nimbusds.jose.crypto.utils.ECChecks.isPointOnCurve(eCPublicKey, getCurve().toECParameterSpec())) {
            throw new com.nimbusds.jose.JOSEException("Invalid ephemeral public EC key: Point(s) not on the expected curve");
        }
        return decryptWithZ(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(eCPublicKey, this.privateKey, getJCAContext().getKeyEncryptionProvider()), base64URL, base64URL2, base64URL3, base64URL4);
    }
}
