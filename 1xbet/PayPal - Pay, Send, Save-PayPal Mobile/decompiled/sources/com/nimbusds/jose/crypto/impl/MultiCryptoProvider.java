package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public abstract class MultiCryptoProvider extends com.nimbusds.jose.crypto.impl.BaseJWEProvider {
    public static final java.util.Map<java.lang.Integer, java.util.Set<com.nimbusds.jose.JWEAlgorithm>> COMPATIBLE_ALGORITHMS;
    public static final java.util.Set<com.nimbusds.jose.JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final java.util.Set<com.nimbusds.jose.jwk.Curve> SUPPORTED_ELLIPTIC_CURVES;
    public static final java.util.Set<com.nimbusds.jose.EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(null);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A128KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A192KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A256KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A128GCMKW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A192GCMKW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.A256GCMKW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.DIR);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A128KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A192KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A256KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.RSA1_5);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_256);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_384);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_512);
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
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        linkedHashSet2.add(com.nimbusds.jose.jwk.Curve.P_256);
        linkedHashSet2.add(com.nimbusds.jose.jwk.Curve.P_384);
        linkedHashSet2.add(com.nimbusds.jose.jwk.Curve.P_521);
        linkedHashSet2.add(com.nimbusds.jose.jwk.Curve.X25519);
        SUPPORTED_ELLIPTIC_CURVES = java.util.Collections.unmodifiableSet(linkedHashSet2);
    }

    public java.util.Set<com.nimbusds.jose.jwk.Curve> supportedEllipticCurves() {
        return SUPPORTED_ELLIPTIC_CURVES;
    }

    public MultiCryptoProvider(javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.KeyLengthException {
        super(SUPPORTED_ALGORITHMS, com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS, secretKey);
    }
}
