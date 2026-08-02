package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public interface JOSEProcessorConfiguration<C extends com.nimbusds.jose.proc.SecurityContext> {
    com.nimbusds.jose.proc.JWEDecrypterFactory getJWEDecrypterFactory();

    com.nimbusds.jose.proc.JWEKeySelector<C> getJWEKeySelector();

    com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> getJWETypeVerifier();

    com.nimbusds.jose.proc.JWSKeySelector<C> getJWSKeySelector();

    com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> getJWSTypeVerifier();

    com.nimbusds.jose.proc.JWSVerifierFactory getJWSVerifierFactory();

    void setJWEDecrypterFactory(com.nimbusds.jose.proc.JWEDecrypterFactory jWEDecrypterFactory);

    void setJWEKeySelector(com.nimbusds.jose.proc.JWEKeySelector<C> jWEKeySelector);

    void setJWETypeVerifier(com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier);

    void setJWSKeySelector(com.nimbusds.jose.proc.JWSKeySelector<C> jWSKeySelector);

    void setJWSTypeVerifier(com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier);

    void setJWSVerifierFactory(com.nimbusds.jose.proc.JWSVerifierFactory jWSVerifierFactory);
}
