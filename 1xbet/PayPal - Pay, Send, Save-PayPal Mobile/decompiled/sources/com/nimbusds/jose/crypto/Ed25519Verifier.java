package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class Ed25519Verifier extends com.nimbusds.jose.crypto.impl.EdDSAProvider implements com.nimbusds.jose.JWSVerifier, com.nimbusds.jose.CriticalHeaderParamsAware {
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;
    private final com.nimbusds.jose.jwk.OctetKeyPair publicKey;
    private final com.google.crypto.tink.subtle.Ed25519Verify tinkVerifier;

    public Ed25519Verifier(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair) throws com.nimbusds.jose.JOSEException {
        this(octetKeyPair, null);
    }

    public Ed25519Verifier(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        if (!com.nimbusds.jose.jwk.Curve.Ed25519.equals(octetKeyPair.getCurve())) {
            throw new com.nimbusds.jose.JOSEException("Ed25519Verifier only supports OctetKeyPairs with crv=Ed25519");
        }
        if (octetKeyPair.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("Ed25519Verifier requires a public key, use OctetKeyPair.toPublicJWK()");
        }
        this.publicKey = octetKeyPair;
        this.tinkVerifier = new com.google.crypto.tink.subtle.Ed25519Verify(octetKeyPair.getDecodedX());
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    public com.nimbusds.jose.jwk.OctetKeyPair getPublicKey() {
        return this.publicKey;
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
        if (!com.nimbusds.jose.JWSAlgorithm.EdDSA.equals(jWSHeader.getAlgorithm())) {
            throw new com.nimbusds.jose.JOSEException("Ed25519Verifier requires alg=EdDSA in JWSHeader");
        }
        if (!this.critPolicy.headerPasses(jWSHeader)) {
            return false;
        }
        try {
            this.tinkVerifier.verify(base64URL.decode(), bArr);
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }
}
