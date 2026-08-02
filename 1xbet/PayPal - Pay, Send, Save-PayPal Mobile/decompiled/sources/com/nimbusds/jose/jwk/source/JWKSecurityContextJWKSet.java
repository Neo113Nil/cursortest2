package com.nimbusds.jose.jwk.source;

/* loaded from: classes10.dex */
public class JWKSecurityContextJWKSet implements com.nimbusds.jose.jwk.source.JWKSource<com.nimbusds.jose.proc.JWKSecurityContext> {
    @Override // com.nimbusds.jose.jwk.source.JWKSource
    public java.util.List<com.nimbusds.jose.jwk.JWK> get(com.nimbusds.jose.jwk.JWKSelector jWKSelector, com.nimbusds.jose.proc.JWKSecurityContext jWKSecurityContext) throws com.nimbusds.jose.KeySourceException {
        if (jWKSecurityContext == null) {
            throw new java.lang.IllegalArgumentException("Security Context must not be null");
        }
        return jWKSelector.select(new com.nimbusds.jose.jwk.JWKSet(jWKSecurityContext.getKeys()));
    }
}
