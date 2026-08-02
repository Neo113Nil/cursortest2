package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class ECDHEncrypter extends com.nimbusds.jose.crypto.impl.ECDHCryptoProvider implements com.nimbusds.jose.JWEEncrypter {
    public static final java.util.Set<com.nimbusds.jose.jwk.Curve> SUPPORTED_ELLIPTIC_CURVES;
    private final java.security.interfaces.ECPublicKey publicKey;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.P_256);
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.P_384);
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.P_521);
        SUPPORTED_ELLIPTIC_CURVES = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public ECDHEncrypter(java.security.interfaces.ECPublicKey eCPublicKey) throws com.nimbusds.jose.JOSEException {
        this(eCPublicKey, null);
    }

    public ECDHEncrypter(com.nimbusds.jose.jwk.ECKey eCKey) throws com.nimbusds.jose.JOSEException {
        this(eCKey.toECPublicKey(), null);
    }

    public ECDHEncrypter(java.security.interfaces.ECPublicKey eCPublicKey, javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.JOSEException {
        super(com.nimbusds.jose.jwk.Curve.forECParameterSpec(eCPublicKey.getParams()), secretKey);
        this.publicKey = eCPublicKey;
    }

    public java.security.interfaces.ECPublicKey getPublicKey() {
        return this.publicKey;
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDHCryptoProvider
    public java.util.Set<com.nimbusds.jose.jwk.Curve> supportedEllipticCurves() {
        return SUPPORTED_ELLIPTIC_CURVES;
    }

    @java.lang.Deprecated
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        return encrypt(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        java.security.KeyPair generateEphemeralKeyPair = generateEphemeralKeyPair(this.publicKey.getParams());
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) generateEphemeralKeyPair.getPublic();
        java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) generateEphemeralKeyPair.getPrivate();
        com.nimbusds.jose.JWEHeader build = new com.nimbusds.jose.JWEHeader.Builder(jWEHeader).ephemeralPublicKey(new com.nimbusds.jose.jwk.ECKey.Builder(getCurve(), eCPublicKey).build()).build();
        javax.crypto.SecretKey deriveSharedSecret = com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(this.publicKey, eCPrivateKey, getJCAContext().getKeyEncryptionProvider());
        if (java.util.Arrays.equals(com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader), bArr2)) {
            bArr2 = com.nimbusds.jose.crypto.impl.AAD.compute(build);
        }
        return encryptWithZ(build, deriveSharedSecret, bArr, bArr2);
    }

    private java.security.KeyPair generateEphemeralKeyPair(java.security.spec.ECParameterSpec eCParameterSpec) throws com.nimbusds.jose.JOSEException {
        java.security.KeyPairGenerator keyPairGenerator;
        java.security.Provider keyEncryptionProvider = getJCAContext().getKeyEncryptionProvider();
        try {
            if (keyEncryptionProvider != null) {
                keyPairGenerator = java.security.KeyPairGenerator.getInstance("EC", keyEncryptionProvider);
            } else {
                keyPairGenerator = java.security.KeyPairGenerator.getInstance("EC");
            }
            keyPairGenerator.initialize(eCParameterSpec);
            return keyPairGenerator.generateKeyPair();
        } catch (java.security.InvalidAlgorithmParameterException | java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't generate ephemeral EC key pair: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }
}
