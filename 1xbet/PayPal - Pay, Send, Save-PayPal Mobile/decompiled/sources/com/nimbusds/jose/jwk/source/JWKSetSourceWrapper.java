package com.nimbusds.jose.jwk.source;

/* loaded from: classes10.dex */
public abstract class JWKSetSourceWrapper<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.jwk.source.JWKSetSource<C> {
    private final com.nimbusds.jose.jwk.source.JWKSetSource<C> source;

    public JWKSetSourceWrapper(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource) {
        java.util.Objects.requireNonNull(jWKSetSource);
        this.source = jWKSetSource;
    }

    public com.nimbusds.jose.jwk.source.JWKSetSource<C> getSource() {
        return this.source;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.source.close();
    }
}
