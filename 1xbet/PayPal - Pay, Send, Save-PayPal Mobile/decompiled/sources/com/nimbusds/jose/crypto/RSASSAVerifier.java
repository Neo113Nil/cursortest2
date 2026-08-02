package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RSASSAVerifier extends com.nimbusds.jose.crypto.impl.RSASSAProvider implements com.nimbusds.jose.JWSVerifier, com.nimbusds.jose.CriticalHeaderParamsAware {
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;
    private final java.security.interfaces.RSAPublicKey publicKey;

    public RSASSAVerifier(java.security.interfaces.RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    public RSASSAVerifier(com.nimbusds.jose.jwk.RSAKey rSAKey) throws com.nimbusds.jose.JOSEException {
        this(rSAKey.toRSAPublicKey(), null);
    }

    public RSASSAVerifier(java.security.interfaces.RSAPublicKey rSAPublicKey, java.util.Set<java.lang.String> set) {
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        if (rSAPublicKey == null) {
            throw new java.lang.IllegalArgumentException("The public RSA key must not be null");
        }
        this.publicKey = rSAPublicKey;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    public java.security.interfaces.RSAPublicKey getPublicKey() {
        return this.publicKey;
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getDeferredCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public boolean verify(com.nimbusds.jose.JWSHeader jWSHeader, byte[] bArr, com.nimbusds.jose.util.Base64URL base64URL) throws com.nimbusds.jose.JOSEException {
        if (!this.critPolicy.headerPasses(jWSHeader)) {
            return false;
        }
        java.security.Signature signerAndVerifier = com.nimbusds.jose.crypto.impl.RSASSA.getSignerAndVerifier(jWSHeader.getAlgorithm(), getJCAContext().getProvider());
        try {
            signerAndVerifier.initVerify(this.publicKey);
            try {
                signerAndVerifier.update(bArr);
                return signerAndVerifier.verify(base64URL.decode());
            } catch (java.security.SignatureException unused) {
                return false;
            }
        } catch (java.security.InvalidKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid public RSA key: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }
}
