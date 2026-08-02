package com.nimbusds.jwt.proc;

/* loaded from: classes10.dex */
public interface JWTProcessorConfiguration<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.proc.JOSEProcessorConfiguration<C> {
    com.nimbusds.jwt.proc.JWTClaimsSetAwareJWSKeySelector<C> getJWTClaimsSetAwareJWSKeySelector();

    com.nimbusds.jwt.proc.JWTClaimsSetVerifier<C> getJWTClaimsSetVerifier();

    void setJWTClaimsSetAwareJWSKeySelector(com.nimbusds.jwt.proc.JWTClaimsSetAwareJWSKeySelector<C> jWTClaimsSetAwareJWSKeySelector);

    void setJWTClaimsSetVerifier(com.nimbusds.jwt.proc.JWTClaimsSetVerifier<C> jWTClaimsSetVerifier);
}
