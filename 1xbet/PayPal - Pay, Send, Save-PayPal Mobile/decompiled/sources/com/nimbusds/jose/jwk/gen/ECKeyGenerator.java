package com.nimbusds.jose.jwk.gen;

/* loaded from: classes10.dex */
public class ECKeyGenerator extends com.nimbusds.jose.jwk.gen.JWKGenerator<com.nimbusds.jose.jwk.ECKey> {
    private final com.nimbusds.jose.jwk.Curve crv;

    public ECKeyGenerator(com.nimbusds.jose.jwk.Curve curve) {
        if (curve == null) {
            throw new java.lang.IllegalArgumentException("The curve must not be null");
        }
        this.crv = curve;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public com.nimbusds.jose.jwk.ECKey generate() throws com.nimbusds.jose.JOSEException {
        java.security.KeyPairGenerator keyPairGenerator;
        java.security.spec.ECParameterSpec eCParameterSpec = this.crv.toECParameterSpec();
        try {
            if (this.keyStore != null) {
                keyPairGenerator = java.security.KeyPairGenerator.getInstance("EC", this.keyStore.getProvider());
            } else if (this.provider != null) {
                keyPairGenerator = java.security.KeyPairGenerator.getInstance("EC", this.provider);
            } else {
                keyPairGenerator = java.security.KeyPairGenerator.getInstance("EC");
            }
            if (this.secureRandom != null) {
                keyPairGenerator.initialize(eCParameterSpec, this.secureRandom);
            } else {
                keyPairGenerator.initialize(eCParameterSpec);
            }
            java.security.KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            com.nimbusds.jose.jwk.ECKey.Builder keyStore = new com.nimbusds.jose.jwk.ECKey.Builder(this.crv, (java.security.interfaces.ECPublicKey) generateKeyPair.getPublic()).privateKey(generateKeyPair.getPrivate()).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).expirationTime(this.exp).notBeforeTime(this.nbf).issueTime(this.iat).keyStore(this.keyStore);
            if (this.x5tKid) {
                keyStore.keyIDFromThumbprint();
            } else {
                keyStore.keyID(this.kid);
            }
            return keyStore.build();
        } catch (java.security.InvalidAlgorithmParameterException | java.security.NoSuchAlgorithmException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }
}
