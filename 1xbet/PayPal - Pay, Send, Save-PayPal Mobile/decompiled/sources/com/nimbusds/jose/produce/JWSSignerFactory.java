package com.nimbusds.jose.produce;

/* loaded from: classes10.dex */
public interface JWSSignerFactory extends com.nimbusds.jose.JWSProvider {
    com.nimbusds.jose.JWSSigner createJWSSigner(com.nimbusds.jose.jwk.JWK jwk) throws com.nimbusds.jose.JOSEException;

    com.nimbusds.jose.JWSSigner createJWSSigner(com.nimbusds.jose.jwk.JWK jwk, com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) throws com.nimbusds.jose.JOSEException;
}
