package com.nimbusds.jose.jwk.source;

/* loaded from: classes10.dex */
public interface JWKSource<C extends com.nimbusds.jose.proc.SecurityContext> {
    java.util.List<com.nimbusds.jose.jwk.JWK> get(com.nimbusds.jose.jwk.JWKSelector jWKSelector, C c) throws com.nimbusds.jose.KeySourceException;
}
