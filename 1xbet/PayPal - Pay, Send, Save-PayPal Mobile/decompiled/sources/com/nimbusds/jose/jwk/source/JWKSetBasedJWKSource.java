package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class JWKSetBasedJWKSource<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.jwk.source.JWKSource<C>, java.io.Closeable {
    private final com.nimbusds.jose.jwk.source.JWKSetSource<C> source;

    public JWKSetBasedJWKSource(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource) {
        java.util.Objects.requireNonNull(jWKSetSource);
        this.source = jWKSetSource;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSource
    public java.util.List<com.nimbusds.jose.jwk.JWK> get(com.nimbusds.jose.jwk.JWKSelector jWKSelector, C c) throws com.nimbusds.jose.KeySourceException {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.nimbusds.jose.jwk.JWKSet jWKSet = this.source.getJWKSet(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator.noRefresh(), currentTimeMillis, c);
        java.util.List<com.nimbusds.jose.jwk.JWK> select = jWKSelector.select(jWKSet);
        return select.isEmpty() ? jWKSelector.select(this.source.getJWKSet(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator.referenceComparison(jWKSet), currentTimeMillis, c)) : select;
    }

    public com.nimbusds.jose.jwk.source.JWKSetSource<C> getJWKSetSource() {
        return this.source;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.source.close();
    }
}
