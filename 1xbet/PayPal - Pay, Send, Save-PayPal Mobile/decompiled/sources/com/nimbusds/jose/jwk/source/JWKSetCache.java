package com.nimbusds.jose.jwk.source;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public interface JWKSetCache {
    com.nimbusds.jose.jwk.JWKSet get();

    void put(com.nimbusds.jose.jwk.JWKSet jWKSet);

    boolean requiresRefresh();
}
