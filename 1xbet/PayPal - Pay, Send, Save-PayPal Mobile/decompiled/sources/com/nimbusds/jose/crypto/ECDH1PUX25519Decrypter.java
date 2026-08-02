package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class ECDH1PUX25519Decrypter extends com.nimbusds.jose.crypto.impl.ECDH1PUCryptoProvider implements com.nimbusds.jose.JWEDecrypter, com.nimbusds.jose.CriticalHeaderParamsAware {
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;
    private final com.nimbusds.jose.jwk.OctetKeyPair privateKey;
    private final com.nimbusds.jose.jwk.OctetKeyPair publicKey;

    public ECDH1PUX25519Decrypter(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair2) throws com.nimbusds.jose.JOSEException {
        this(octetKeyPair, octetKeyPair2, null);
    }

    public ECDH1PUX25519Decrypter(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair2, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.JOSEException {
        super(octetKeyPair.getCurve(), null);
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        this.privateKey = octetKeyPair;
        this.publicKey = octetKeyPair2;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDH1PUCryptoProvider
    public java.util.Set<com.nimbusds.jose.jwk.Curve> supportedEllipticCurves() {
        return java.util.Collections.singleton(com.nimbusds.jose.jwk.Curve.X25519);
    }

    public com.nimbusds.jose.jwk.OctetKeyPair getPrivateKey() {
        return this.privateKey;
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

    @java.lang.Deprecated
    public byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4) throws com.nimbusds.jose.JOSEException {
        return decrypt(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair = (com.nimbusds.jose.jwk.OctetKeyPair) jWEHeader.getEphemeralPublicKey();
        if (octetKeyPair == null) {
            throw new com.nimbusds.jose.JOSEException("Missing ephemeral public key \"epk\" JWE header parameter");
        }
        return decryptWithZ(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.ECDH1PU.deriveRecipientZ(this.privateKey, this.publicKey, octetKeyPair), base64URL, base64URL2, base64URL3, base64URL4);
    }
}
