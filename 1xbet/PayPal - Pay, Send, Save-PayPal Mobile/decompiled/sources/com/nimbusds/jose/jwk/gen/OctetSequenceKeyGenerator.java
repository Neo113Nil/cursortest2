package com.nimbusds.jose.jwk.gen;

/* loaded from: classes10.dex */
public class OctetSequenceKeyGenerator extends com.nimbusds.jose.jwk.gen.JWKGenerator<com.nimbusds.jose.jwk.OctetSequenceKey> {
    public static final int MIN_KEY_SIZE_BITS = 112;
    private final int size;

    public OctetSequenceKeyGenerator(int i) {
        if (i < 112) {
            throw new java.lang.IllegalArgumentException("The key size must be at least 112 bits");
        }
        if (i % 8 != 0) {
            throw new java.lang.IllegalArgumentException("The key size in bits must be divisible by 8");
        }
        this.size = i;
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public com.nimbusds.jose.jwk.OctetSequenceKey generate() throws com.nimbusds.jose.JOSEException {
        byte[] bArr = new byte[this.size / 8];
        if (this.secureRandom != null) {
            this.secureRandom.nextBytes(bArr);
        } else {
            new java.security.SecureRandom().nextBytes(bArr);
        }
        com.nimbusds.jose.jwk.OctetSequenceKey.Builder keyStore = new com.nimbusds.jose.jwk.OctetSequenceKey.Builder(com.nimbusds.jose.util.Base64URL.encode(bArr)).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).keyStore(this.keyStore);
        if (this.x5tKid) {
            keyStore.keyIDFromThumbprint();
        } else {
            keyStore.keyID(this.kid);
        }
        return keyStore.build();
    }
}
