package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public class ImmutableJWKSet<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.jwk.source.JWKSource<C> {
    private final com.nimbusds.jose.jwk.JWKSet jwkSet;

    public ImmutableJWKSet(com.nimbusds.jose.jwk.JWKSet jWKSet) {
        if (jWKSet == null) {
            throw new java.lang.IllegalArgumentException("The JWK set must not be null");
        }
        this.jwkSet = jWKSet;
    }

    public com.nimbusds.jose.jwk.JWKSet getJWKSet() {
        return this.jwkSet;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSource
    public java.util.List<com.nimbusds.jose.jwk.JWK> get(com.nimbusds.jose.jwk.JWKSelector jWKSelector, C c) {
        return jWKSelector.select(this.jwkSet);
    }
}
