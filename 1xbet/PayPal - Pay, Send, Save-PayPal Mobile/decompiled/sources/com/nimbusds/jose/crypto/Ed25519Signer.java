package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class Ed25519Signer extends com.nimbusds.jose.crypto.impl.EdDSAProvider implements com.nimbusds.jose.JWSSigner {
    private final com.nimbusds.jose.jwk.OctetKeyPair privateKey;
    private final com.google.crypto.tink.subtle.Ed25519Sign tinkSigner;

    public Ed25519Signer(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair) throws com.nimbusds.jose.JOSEException {
        if (!com.nimbusds.jose.jwk.Curve.Ed25519.equals(octetKeyPair.getCurve())) {
            throw new com.nimbusds.jose.JOSEException("Ed25519Signer only supports OctetKeyPairs with crv=Ed25519");
        }
        if (!octetKeyPair.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("The OctetKeyPair doesn't contain a private part");
        }
        this.privateKey = octetKeyPair;
        try {
            this.tinkSigner = new com.google.crypto.tink.subtle.Ed25519Sign(octetKeyPair.getDecodedD());
        } catch (java.security.GeneralSecurityException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    public com.nimbusds.jose.jwk.OctetKeyPair getPrivateKey() {
        return this.privateKey;
    }

    @Override // com.nimbusds.jose.JWSSigner
    public com.nimbusds.jose.util.Base64URL sign(com.nimbusds.jose.JWSHeader jWSHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        if (!com.nimbusds.jose.JWSAlgorithm.EdDSA.equals(jWSHeader.getAlgorithm())) {
            throw new com.nimbusds.jose.JOSEException("Ed25519Signer requires alg=EdDSA in JWSHeader");
        }
        try {
            return com.nimbusds.jose.util.Base64URL.encode(this.tinkSigner.sign(bArr));
        } catch (java.security.GeneralSecurityException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }
}
