package com.nimbusds.jose.jwk.source;

/* loaded from: classes10.dex */
public interface JWKSetSource<C extends com.nimbusds.jose.proc.SecurityContext> extends java.io.Closeable {
    com.nimbusds.jose.jwk.JWKSet getJWKSet(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws com.nimbusds.jose.KeySourceException;
}
