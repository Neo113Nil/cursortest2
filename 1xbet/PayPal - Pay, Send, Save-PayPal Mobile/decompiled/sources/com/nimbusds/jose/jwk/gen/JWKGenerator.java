package com.nimbusds.jose.jwk.gen;

/* loaded from: classes10.dex */
public abstract class JWKGenerator<T extends com.nimbusds.jose.jwk.JWK> {
    protected com.nimbusds.jose.Algorithm alg;
    protected java.util.Date exp;
    protected java.util.Date iat;
    protected java.security.KeyStore keyStore;
    protected java.lang.String kid;
    protected java.util.Date nbf;
    protected java.util.Set<com.nimbusds.jose.jwk.KeyOperation> ops;
    protected java.security.Provider provider;
    protected java.security.SecureRandom secureRandom;
    protected com.nimbusds.jose.jwk.KeyUse use;
    protected boolean x5tKid;

    public abstract T generate() throws com.nimbusds.jose.JOSEException;

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> keyUse(com.nimbusds.jose.jwk.KeyUse keyUse) {
        this.use = keyUse;
        return this;
    }

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> keyOperations(java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set) {
        this.ops = set;
        return this;
    }

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> algorithm(com.nimbusds.jose.Algorithm algorithm) {
        this.alg = algorithm;
        return this;
    }

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> keyID(java.lang.String str) {
        this.kid = str;
        return this;
    }

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> keyIDFromThumbprint(boolean z) {
        this.x5tKid = z;
        return this;
    }

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> expirationTime(java.util.Date date) {
        this.exp = date;
        return this;
    }

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> notBeforeTime(java.util.Date date) {
        this.nbf = date;
        return this;
    }

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> issueTime(java.util.Date date) {
        this.iat = date;
        return this;
    }

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> keyStore(java.security.KeyStore keyStore) {
        this.keyStore = keyStore;
        return this;
    }

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> provider(java.security.Provider provider) {
        this.provider = provider;
        return this;
    }

    public com.nimbusds.jose.jwk.gen.JWKGenerator<T> secureRandom(java.security.SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
        return this;
    }
}
