package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class ECDH1PUX25519Encrypter extends com.nimbusds.jose.crypto.impl.ECDH1PUCryptoProvider implements com.nimbusds.jose.JWEEncrypter {
    private final com.nimbusds.jose.jwk.OctetKeyPair privateKey;
    private final com.nimbusds.jose.jwk.OctetKeyPair publicKey;

    public ECDH1PUX25519Encrypter(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair2) throws com.nimbusds.jose.JOSEException {
        this(octetKeyPair, octetKeyPair2, null);
    }

    public ECDH1PUX25519Encrypter(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair2, javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.JOSEException {
        super(octetKeyPair2.getCurve(), secretKey);
        this.publicKey = octetKeyPair2;
        this.privateKey = octetKeyPair;
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDH1PUCryptoProvider
    public java.util.Set<com.nimbusds.jose.jwk.Curve> supportedEllipticCurves() {
        return java.util.Collections.singleton(com.nimbusds.jose.jwk.Curve.X25519);
    }

    public com.nimbusds.jose.jwk.OctetKeyPair getPublicKey() {
        return this.publicKey;
    }

    public com.nimbusds.jose.jwk.OctetKeyPair getPrivateKey() {
        return this.privateKey;
    }

    @java.lang.Deprecated
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        return encrypt(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.jwk.OctetKeyPair generate = new com.nimbusds.jose.jwk.gen.OctetKeyPairGenerator(getCurve()).generate();
        com.nimbusds.jose.JWEHeader build = new com.nimbusds.jose.JWEHeader.Builder(jWEHeader).ephemeralPublicKey(generate.toPublicJWK()).build();
        javax.crypto.SecretKey deriveSenderZ = com.nimbusds.jose.crypto.impl.ECDH1PU.deriveSenderZ(this.privateKey, this.publicKey, generate);
        if (java.util.Arrays.equals(com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader), bArr2)) {
            bArr2 = com.nimbusds.jose.crypto.impl.AAD.compute(build);
        }
        return encryptWithZ(build, deriveSenderZ, bArr, bArr2);
    }
}
