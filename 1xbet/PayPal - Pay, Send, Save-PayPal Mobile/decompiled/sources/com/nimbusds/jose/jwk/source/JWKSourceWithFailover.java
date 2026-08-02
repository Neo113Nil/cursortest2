package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class JWKSourceWithFailover<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.jwk.source.JWKSource<C>, java.io.Closeable {
    private final com.nimbusds.jose.jwk.source.JWKSource<C> failoverJWKSource;
    private final com.nimbusds.jose.jwk.source.JWKSource<C> jwkSource;

    public JWKSourceWithFailover(com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource, com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource2) {
        java.util.Objects.requireNonNull(jWKSource, "The primary JWK source must not be null");
        this.jwkSource = jWKSource;
        this.failoverJWKSource = jWKSource2;
    }

    private java.util.List<com.nimbusds.jose.jwk.JWK> failover(java.lang.Exception exc, com.nimbusds.jose.jwk.JWKSelector jWKSelector, C c) throws com.nimbusds.jose.KeySourceException {
        try {
            return this.failoverJWKSource.get(jWKSelector, c);
        } catch (com.nimbusds.jose.KeySourceException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(exc.getMessage());
            sb.append("; Failover JWK source retrieval failed with: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.KeySourceException(sb.toString(), e);
        }
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSource
    public java.util.List<com.nimbusds.jose.jwk.JWK> get(com.nimbusds.jose.jwk.JWKSelector jWKSelector, C c) throws com.nimbusds.jose.KeySourceException {
        try {
            return this.jwkSource.get(jWKSelector, c);
        } catch (java.lang.Exception e) {
            return failover(e, jWKSelector, c);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource = this.jwkSource;
        if (jWKSource instanceof java.io.Closeable) {
            com.nimbusds.jose.util.IOUtils.closeSilently((java.io.Closeable) jWKSource);
        }
        com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource2 = this.failoverJWKSource;
        if (jWKSource2 instanceof java.io.Closeable) {
            com.nimbusds.jose.util.IOUtils.closeSilently((java.io.Closeable) jWKSource2);
        }
    }
}
