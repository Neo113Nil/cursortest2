package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class ECDH1PUDecrypter extends com.nimbusds.jose.crypto.impl.ECDH1PUCryptoProvider implements com.nimbusds.jose.JWEDecrypter, com.nimbusds.jose.CriticalHeaderParamsAware {
    public static final java.util.Set<com.nimbusds.jose.jwk.Curve> SUPPORTED_ELLIPTIC_CURVES;
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;
    private final java.security.interfaces.ECPrivateKey privateKey;
    private final java.security.interfaces.ECPublicKey publicKey;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.P_256);
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.P_384);
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.P_521);
        SUPPORTED_ELLIPTIC_CURVES = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public ECDH1PUDecrypter(java.security.interfaces.ECPrivateKey eCPrivateKey, java.security.interfaces.ECPublicKey eCPublicKey) throws com.nimbusds.jose.JOSEException {
        this(eCPrivateKey, eCPublicKey, null);
    }

    public ECDH1PUDecrypter(java.security.interfaces.ECPrivateKey eCPrivateKey, java.security.interfaces.ECPublicKey eCPublicKey, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.JOSEException {
        this(eCPrivateKey, eCPublicKey, set, com.nimbusds.jose.jwk.Curve.forECParameterSpec(eCPrivateKey.getParams()));
    }

    public ECDH1PUDecrypter(java.security.interfaces.ECPrivateKey eCPrivateKey, java.security.interfaces.ECPublicKey eCPublicKey, java.util.Set<java.lang.String> set, com.nimbusds.jose.jwk.Curve curve) throws com.nimbusds.jose.JOSEException {
        super(curve, null);
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
        this.privateKey = eCPrivateKey;
        this.publicKey = eCPublicKey;
    }

    public java.security.interfaces.ECPublicKey getPublicKey() {
        return this.publicKey;
    }

    public java.security.PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDH1PUCryptoProvider
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
        return decryptWithZ(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.ECDH1PU.deriveRecipientZ(this.privateKey, this.publicKey, eCKey.toECPublicKey(), getJCAContext().getKeyEncryptionProvider()), base64URL, base64URL2, base64URL3, base64URL4);
    }
}
