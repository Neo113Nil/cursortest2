package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public abstract class AESCryptoProvider extends com.nimbusds.jose.crypto.impl.BaseJWEProvider {
    public static final java.util.Map<java.lang.Integer, java.util.Set<com.nimbusds.jose.JWEAlgorithm>> COMPATIBLE_ALGORITHMS;
    public static final java.util.Set<com.nimbusds.jose.JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final java.util.Set<com.nimbusds.jose.EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
    private final javax.crypto.SecretKey kek;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A128KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A192KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A256KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A128GCMKW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A192GCMKW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A256GCMKW);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        hashSet.add(com.nimbusds.jose.JWEAlgorithm.A128GCMKW);
        hashSet.add(com.nimbusds.jose.JWEAlgorithm.A128KW);
        hashSet2.add(com.nimbusds.jose.JWEAlgorithm.A192GCMKW);
        hashSet2.add(com.nimbusds.jose.JWEAlgorithm.A192KW);
        hashSet3.add(com.nimbusds.jose.JWEAlgorithm.A256GCMKW);
        hashSet3.add(com.nimbusds.jose.JWEAlgorithm.A256KW);
        hashMap.put(128, java.util.Collections.unmodifiableSet(hashSet));
        hashMap.put(192, java.util.Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, java.util.Collections.unmodifiableSet(hashSet3));
        COMPATIBLE_ALGORITHMS = java.util.Collections.unmodifiableMap(hashMap);
    }

    private static java.util.Set<com.nimbusds.jose.JWEAlgorithm> getCompatibleJWEAlgorithms(int i) throws com.nimbusds.jose.KeyLengthException {
        java.util.Set<com.nimbusds.jose.JWEAlgorithm> set = COMPATIBLE_ALGORITHMS.get(java.lang.Integer.valueOf(i));
        if (set != null) {
            return set;
        }
        throw new com.nimbusds.jose.KeyLengthException("The Key Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes) or 256 bits (32 bytes)");
    }

    public AESCryptoProvider(javax.crypto.SecretKey secretKey, javax.crypto.SecretKey secretKey2) throws com.nimbusds.jose.KeyLengthException {
        super(getCompatibleJWEAlgorithms(com.nimbusds.jose.util.ByteUtils.bitLength(secretKey.getEncoded())), com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS, secretKey2);
        this.kek = secretKey;
    }

    public javax.crypto.SecretKey getKey() {
        return this.kek;
    }
}
