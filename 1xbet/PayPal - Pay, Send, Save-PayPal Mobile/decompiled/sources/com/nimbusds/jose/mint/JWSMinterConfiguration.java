package com.nimbusds.jose.mint;

/* loaded from: classes10.dex */
public interface JWSMinterConfiguration<C extends com.nimbusds.jose.proc.SecurityContext> {
    com.nimbusds.jose.jwk.source.JWKSource<C> getJWKSource();

    com.nimbusds.jose.produce.JWSSignerFactory getJWSSignerFactory();

    void setJWKSource(com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource);

    void setJWSSignerFactory(com.nimbusds.jose.produce.JWSSignerFactory jWSSignerFactory);
}
