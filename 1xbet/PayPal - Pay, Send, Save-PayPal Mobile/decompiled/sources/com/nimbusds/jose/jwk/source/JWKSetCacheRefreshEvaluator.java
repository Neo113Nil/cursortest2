package com.nimbusds.jose.jwk.source;

/* loaded from: classes10.dex */
public abstract class JWKSetCacheRefreshEvaluator {
    private static final com.nimbusds.jose.jwk.source.ForceRefreshJWKSetCacheEvaluator FORCE_REFRESH = new com.nimbusds.jose.jwk.source.ForceRefreshJWKSetCacheEvaluator();
    private static final com.nimbusds.jose.jwk.source.NoRefreshJWKSetCacheEvaluator NO_REFRESH = new com.nimbusds.jose.jwk.source.NoRefreshJWKSetCacheEvaluator();

    public abstract boolean requiresRefresh(com.nimbusds.jose.jwk.JWKSet jWKSet);

    public static com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator forceRefresh() {
        return FORCE_REFRESH;
    }

    public static com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator noRefresh() {
        return NO_REFRESH;
    }

    public static com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator referenceComparison(com.nimbusds.jose.jwk.JWKSet jWKSet) {
        return new com.nimbusds.jose.jwk.source.ReferenceComparisonRefreshJWKSetEvaluator(jWKSet);
    }
}
