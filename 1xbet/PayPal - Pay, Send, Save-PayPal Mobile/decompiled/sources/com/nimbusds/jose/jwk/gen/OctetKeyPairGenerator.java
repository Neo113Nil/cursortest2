package com.nimbusds.jose.jwk.gen;

/* loaded from: classes10.dex */
public class OctetKeyPairGenerator extends com.nimbusds.jose.jwk.gen.JWKGenerator<com.nimbusds.jose.jwk.OctetKeyPair> {
    public static final java.util.Set<com.nimbusds.jose.jwk.Curve> SUPPORTED_CURVES;
    private final com.nimbusds.jose.jwk.Curve crv;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.X25519);
        linkedHashSet.add(com.nimbusds.jose.jwk.Curve.Ed25519);
        SUPPORTED_CURVES = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public OctetKeyPairGenerator(com.nimbusds.jose.jwk.Curve curve) {
        if (curve == null) {
            throw new java.lang.IllegalArgumentException("The curve must not be null");
        }
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new java.lang.IllegalArgumentException("Curve not supported for OKP generation");
        }
        this.crv = curve;
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public com.nimbusds.jose.jwk.OctetKeyPair generate() throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.util.Base64URL encode;
        com.nimbusds.jose.util.Base64URL encode2;
        if (this.crv.equals(com.nimbusds.jose.jwk.Curve.X25519)) {
            try {
                byte[] generatePrivateKey = com.google.crypto.tink.subtle.X25519.generatePrivateKey();
                byte[] publicFromPrivate = com.google.crypto.tink.subtle.X25519.publicFromPrivate(generatePrivateKey);
                encode = com.nimbusds.jose.util.Base64URL.encode(generatePrivateKey);
                encode2 = com.nimbusds.jose.util.Base64URL.encode(publicFromPrivate);
            } catch (java.security.InvalidKeyException e) {
                throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
            }
        } else if (this.crv.equals(com.nimbusds.jose.jwk.Curve.Ed25519)) {
            try {
                com.google.crypto.tink.subtle.Ed25519Sign.KeyPair newKeyPair = com.google.crypto.tink.subtle.Ed25519Sign.KeyPair.newKeyPair();
                com.nimbusds.jose.util.Base64URL encode3 = com.nimbusds.jose.util.Base64URL.encode(newKeyPair.getPrivateKey());
                encode2 = com.nimbusds.jose.util.Base64URL.encode(newKeyPair.getPublicKey());
                encode = encode3;
            } catch (java.security.GeneralSecurityException e2) {
                throw new com.nimbusds.jose.JOSEException(e2.getMessage(), e2);
            }
        } else {
            throw new com.nimbusds.jose.JOSEException("Curve not supported");
        }
        com.nimbusds.jose.jwk.OctetKeyPair.Builder issueTime = new com.nimbusds.jose.jwk.OctetKeyPair.Builder(this.crv, encode2).d(encode).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).expirationTime(this.exp).notBeforeTime(this.nbf).issueTime(this.iat);
        if (this.x5tKid) {
            issueTime.keyIDFromThumbprint();
        } else {
            issueTime.keyID(this.kid);
        }
        return issueTime.build();
    }
}
