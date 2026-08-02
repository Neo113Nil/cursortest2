package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class X25519Encrypter extends com.nimbusds.jose.crypto.impl.ECDHCryptoProvider implements com.nimbusds.jose.JWEEncrypter {
    private final com.nimbusds.jose.jwk.OctetKeyPair publicKey;

    public X25519Encrypter(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair) throws com.nimbusds.jose.JOSEException {
        this(octetKeyPair, null);
    }

    public X25519Encrypter(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.JOSEException {
        super(octetKeyPair.getCurve(), secretKey);
        if (!com.nimbusds.jose.jwk.Curve.X25519.equals(octetKeyPair.getCurve())) {
            throw new com.nimbusds.jose.JOSEException("X25519Encrypter only supports OctetKeyPairs with crv=X25519");
        }
        if (octetKeyPair.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("X25519Encrypter requires a public key, use OctetKeyPair.toPublicJWK()");
        }
        this.publicKey = octetKeyPair;
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDHCryptoProvider
    public java.util.Set<com.nimbusds.jose.jwk.Curve> supportedEllipticCurves() {
        return java.util.Collections.singleton(com.nimbusds.jose.jwk.Curve.X25519);
    }

    public com.nimbusds.jose.jwk.OctetKeyPair getPublicKey() {
        return this.publicKey;
    }

    @java.lang.Deprecated
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        return encrypt(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        byte[] generatePrivateKey = com.google.crypto.tink.subtle.X25519.generatePrivateKey();
        try {
            com.nimbusds.jose.jwk.OctetKeyPair build = new com.nimbusds.jose.jwk.OctetKeyPair.Builder(getCurve(), com.nimbusds.jose.util.Base64URL.encode(com.google.crypto.tink.subtle.X25519.publicFromPrivate(generatePrivateKey))).d(com.nimbusds.jose.util.Base64URL.encode(generatePrivateKey)).build();
            com.nimbusds.jose.JWEHeader build2 = new com.nimbusds.jose.JWEHeader.Builder(jWEHeader).ephemeralPublicKey(build.toPublicJWK()).build();
            javax.crypto.SecretKey deriveSharedSecret = com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(this.publicKey, build);
            if (java.util.Arrays.equals(com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader), bArr2)) {
                bArr2 = com.nimbusds.jose.crypto.impl.AAD.compute(build2);
            }
            return encryptWithZ(build2, deriveSharedSecret, bArr, bArr2);
        } catch (java.security.InvalidKeyException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }
}
