package com.nimbusds.jose.proc;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
abstract class AbstractJWKSelectorWithSource<C extends com.nimbusds.jose.proc.SecurityContext> {
    private final com.nimbusds.jose.jwk.source.JWKSource<C> jwkSource;

    public AbstractJWKSelectorWithSource(com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource) {
        if (jWKSource == null) {
            throw new java.lang.IllegalArgumentException("The JWK source must not be null");
        }
        this.jwkSource = jWKSource;
    }

    public com.nimbusds.jose.jwk.source.JWKSource<C> getJWKSource() {
        return this.jwkSource;
    }
}
