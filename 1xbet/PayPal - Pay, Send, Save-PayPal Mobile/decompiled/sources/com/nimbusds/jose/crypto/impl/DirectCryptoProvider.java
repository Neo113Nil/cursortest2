package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public abstract class DirectCryptoProvider extends com.nimbusds.jose.crypto.impl.BaseJWEProvider {
    public static final java.util.Set<com.nimbusds.jose.JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final java.util.Set<com.nimbusds.jose.EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.DIR);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    private static java.util.Set<com.nimbusds.jose.EncryptionMethod> getCompatibleEncryptionMethods(int i) throws com.nimbusds.jose.KeyLengthException {
        if (i == 0) {
            return com.nimbusds.jose.EncryptionMethod.Family.AES_GCM;
        }
        java.util.Set<com.nimbusds.jose.EncryptionMethod> set = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.COMPATIBLE_ENCRYPTION_METHODS.get(java.lang.Integer.valueOf(i));
        if (set != null) {
            return set;
        }
        throw new com.nimbusds.jose.KeyLengthException("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
    }

    public DirectCryptoProvider(javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.KeyLengthException {
        super(SUPPORTED_ALGORITHMS, getCompatibleEncryptionMethods(com.nimbusds.jose.util.ByteUtils.bitLength(secretKey.getEncoded())), secretKey);
    }

    public javax.crypto.SecretKey getKey() {
        try {
            return getCEK(null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
