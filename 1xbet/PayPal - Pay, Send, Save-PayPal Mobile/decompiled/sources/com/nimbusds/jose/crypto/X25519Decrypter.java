package com.nimbusds.jose.crypto;

/* loaded from: classes10.dex */
public class X25519Decrypter extends com.nimbusds.jose.crypto.impl.ECDHCryptoProvider implements com.nimbusds.jose.JWEDecrypter, com.nimbusds.jose.CriticalHeaderParamsAware {
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;
    private final com.nimbusds.jose.jwk.OctetKeyPair privateKey;

    public X25519Decrypter(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair) throws com.nimbusds.jose.JOSEException {
        this(octetKeyPair, null);
    }

    public X25519Decrypter(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.JOSEException {
        super(octetKeyPair.getCurve(), null);
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        if (!com.nimbusds.jose.jwk.Curve.X25519.equals(octetKeyPair.getCurve())) {
            throw new com.nimbusds.jose.JOSEException("X25519Decrypter only supports OctetKeyPairs with crv=X25519");
        }
        if (!octetKeyPair.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("The OctetKeyPair doesn't contain a private part");
        }
        this.privateKey = octetKeyPair;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDHCryptoProvider
    public java.util.Set<com.nimbusds.jose.jwk.Curve> supportedEllipticCurves() {
        return java.util.Collections.singleton(com.nimbusds.jose.jwk.Curve.X25519);
    }

    public com.nimbusds.jose.jwk.OctetKeyPair getPrivateKey() {
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
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair = (com.nimbusds.jose.jwk.OctetKeyPair) jWEHeader.getEphemeralPublicKey();
        if (octetKeyPair == null) {
            throw new com.nimbusds.jose.JOSEException("Missing ephemeral public key epk JWE header parameter");
        }
        if (!this.privateKey.getCurve().equals(octetKeyPair.getCurve())) {
            throw new com.nimbusds.jose.JOSEException("Curve of ephemeral public key does not match curve of private key");
        }
        return decryptWithZ(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(octetKeyPair, this.privateKey), base64URL, base64URL2, base64URL3, base64URL4);
    }
}
