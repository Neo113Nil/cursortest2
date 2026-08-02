package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public abstract class RSACryptoProvider extends com.nimbusds.jose.crypto.impl.BaseJWEProvider {
    public static final java.util.Set<com.nimbusds.jose.JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final java.util.Set<com.nimbusds.jose.EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.RSA1_5);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_256);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_384);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_512);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public RSACryptoProvider(javax.crypto.SecretKey secretKey) {
        super(SUPPORTED_ALGORITHMS, com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS, secretKey);
    }
}
