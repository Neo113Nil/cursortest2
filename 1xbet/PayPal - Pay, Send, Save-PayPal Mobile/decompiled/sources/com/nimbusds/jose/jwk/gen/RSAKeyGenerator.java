package com.nimbusds.jose.jwk.gen;

/* loaded from: classes10.dex */
public class RSAKeyGenerator extends com.nimbusds.jose.jwk.gen.JWKGenerator<com.nimbusds.jose.jwk.RSAKey> {
    public static final int MIN_KEY_SIZE_BITS = 2048;
    private final int size;

    public RSAKeyGenerator(int i) {
        this(i, false);
    }

    public RSAKeyGenerator(int i, boolean z) {
        if (!z && i < 2048) {
            throw new java.lang.IllegalArgumentException("The key size must be at least 2048 bits");
        }
        this.size = i;
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public com.nimbusds.jose.jwk.RSAKey generate() throws com.nimbusds.jose.JOSEException {
        java.security.KeyPairGenerator keyPairGenerator;
        try {
            if (this.keyStore != null) {
                keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA", this.keyStore.getProvider());
            } else if (this.provider != null) {
                keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA", this.provider);
            } else {
                keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA");
            }
            if (this.secureRandom != null) {
                keyPairGenerator.initialize(this.size, this.secureRandom);
            } else {
                keyPairGenerator.initialize(this.size);
            }
            java.security.KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            com.nimbusds.jose.jwk.RSAKey.Builder keyStore = new com.nimbusds.jose.jwk.RSAKey.Builder((java.security.interfaces.RSAPublicKey) generateKeyPair.getPublic()).privateKey(generateKeyPair.getPrivate()).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).expirationTime(this.exp).notBeforeTime(this.nbf).issueTime(this.iat).keyStore(this.keyStore);
            if (this.x5tKid) {
                keyStore.keyIDFromThumbprint();
            } else {
                keyStore.keyID(this.kid);
            }
            return keyStore.build();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }
}
