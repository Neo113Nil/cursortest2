package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public abstract class PasswordBasedCryptoProvider extends com.nimbusds.jose.crypto.impl.BaseJWEProvider {
    public static final java.util.Set<com.nimbusds.jose.JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final java.util.Set<com.nimbusds.jose.EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
    private final byte[] password;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.PBES2_HS256_A128KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.PBES2_HS384_A192KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.PBES2_HS512_A256KW);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public PasswordBasedCryptoProvider(byte[] bArr) {
        super(SUPPORTED_ALGORITHMS, com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS, null);
        if (bArr == null || bArr.length == 0) {
            throw new java.lang.IllegalArgumentException("The password must not be null or empty");
        }
        this.password = bArr;
    }

    public byte[] getPassword() {
        return this.password;
    }

    public java.lang.String getPasswordString() {
        return new java.lang.String(this.password, com.nimbusds.jose.util.StandardCharset.UTF_8);
    }
}
