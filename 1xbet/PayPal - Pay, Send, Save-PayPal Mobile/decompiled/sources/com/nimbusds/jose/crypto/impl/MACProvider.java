package com.nimbusds.jose.crypto.impl;

/* loaded from: classes4.dex */
public abstract class MACProvider extends com.nimbusds.jose.crypto.impl.BaseJWSProvider {
    public static final java.util.Set<com.nimbusds.jose.JWSAlgorithm> SUPPORTED_ALGORITHMS;
    private final byte[] secret;
    private final javax.crypto.SecretKey secretKey;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.HS256);
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.HS384);
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.HS512);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    protected static java.lang.String getJCAAlgorithmName(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) throws com.nimbusds.jose.JOSEException {
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.HS256)) {
            return "HMACSHA256";
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.HS384)) {
            return "HMACSHA384";
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.HS512)) {
            return "HMACSHA512";
        }
        throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, SUPPORTED_ALGORITHMS));
    }

    public MACProvider(byte[] bArr, java.util.Set<com.nimbusds.jose.JWSAlgorithm> set) throws com.nimbusds.jose.KeyLengthException {
        super(set);
        if (bArr.length < 32) {
            throw new com.nimbusds.jose.KeyLengthException("The secret length must be at least 256 bits");
        }
        this.secret = bArr;
        this.secretKey = null;
    }

    public MACProvider(javax.crypto.SecretKey secretKey, java.util.Set<com.nimbusds.jose.JWSAlgorithm> set) throws com.nimbusds.jose.KeyLengthException {
        super(set);
        if (secretKey.getEncoded() != null && secretKey.getEncoded().length < 32) {
            throw new com.nimbusds.jose.KeyLengthException("The secret length must be at least 256 bits");
        }
        this.secretKey = secretKey;
        this.secret = null;
    }

    public javax.crypto.SecretKey getSecretKey() {
        javax.crypto.SecretKey secretKey = this.secretKey;
        if (secretKey != null) {
            return secretKey;
        }
        if (this.secret != null) {
            return new javax.crypto.spec.SecretKeySpec(this.secret, "MAC");
        }
        throw new java.lang.IllegalStateException("Unexpected state");
    }

    public byte[] getSecret() {
        javax.crypto.SecretKey secretKey = this.secretKey;
        if (secretKey != null) {
            return secretKey.getEncoded();
        }
        byte[] bArr = this.secret;
        if (bArr != null) {
            return bArr;
        }
        throw new java.lang.IllegalStateException("Unexpected state");
    }

    public java.lang.String getSecretString() {
        byte[] secret = getSecret();
        if (secret == null) {
            return null;
        }
        return new java.lang.String(secret, com.nimbusds.jose.util.StandardCharset.UTF_8);
    }
}
