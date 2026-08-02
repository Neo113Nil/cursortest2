package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public abstract class BaseJWEProvider implements com.nimbusds.jose.JWEProvider {
    private static final java.util.Set<java.lang.String> ACCEPTABLE_CEK_ALGS = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(org.jose4j.keys.AesKey.ALGORITHM, "ChaCha20")));
    private final java.util.Set<com.nimbusds.jose.JWEAlgorithm> algs;
    private final javax.crypto.SecretKey cek;
    private final java.util.Set<com.nimbusds.jose.EncryptionMethod> encs;
    private final com.nimbusds.jose.jca.JWEJCAContext jcaContext;

    public BaseJWEProvider(java.util.Set<com.nimbusds.jose.JWEAlgorithm> set, java.util.Set<com.nimbusds.jose.EncryptionMethod> set2) {
        this(set, set2, null);
    }

    public BaseJWEProvider(java.util.Set<com.nimbusds.jose.JWEAlgorithm> set, java.util.Set<com.nimbusds.jose.EncryptionMethod> set2, javax.crypto.SecretKey secretKey) {
        this.jcaContext = new com.nimbusds.jose.jca.JWEJCAContext();
        if (set == null) {
            throw new java.lang.IllegalArgumentException("The supported JWE algorithm set must not be null");
        }
        this.algs = java.util.Collections.unmodifiableSet(set);
        if (set2 == null) {
            throw new java.lang.IllegalArgumentException("The supported encryption methods must not be null");
        }
        this.encs = set2;
        if (secretKey != null && set.size() > 1 && (secretKey.getAlgorithm() == null || !ACCEPTABLE_CEK_ALGS.contains(secretKey.getAlgorithm()))) {
            throw new java.lang.IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
        }
        this.cek = secretKey;
    }

    @Override // com.nimbusds.jose.JWEProvider
    public java.util.Set<com.nimbusds.jose.JWEAlgorithm> supportedJWEAlgorithms() {
        return this.algs;
    }

    @Override // com.nimbusds.jose.JWEProvider
    public java.util.Set<com.nimbusds.jose.EncryptionMethod> supportedEncryptionMethods() {
        return this.encs;
    }

    @Override // com.nimbusds.jose.jca.JCAAware
    public com.nimbusds.jose.jca.JWEJCAContext getJCAContext() {
        return this.jcaContext;
    }

    protected boolean isCEKProvided() {
        return this.cek != null;
    }

    protected javax.crypto.SecretKey getCEK(com.nimbusds.jose.EncryptionMethod encryptionMethod) throws com.nimbusds.jose.JOSEException {
        return (isCEKProvided() || encryptionMethod == null) ? this.cek : com.nimbusds.jose.crypto.impl.ContentCryptoProvider.generateCEK(encryptionMethod, this.jcaContext.getSecureRandom());
    }
}
