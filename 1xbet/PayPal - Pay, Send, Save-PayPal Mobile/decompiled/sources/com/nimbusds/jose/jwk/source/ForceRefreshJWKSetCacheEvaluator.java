package com.nimbusds.jose.jwk.source;

/* loaded from: classes10.dex */
class ForceRefreshJWKSetCacheEvaluator extends com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator {
    public int hashCode() {
        return 0;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator
    public boolean requiresRefresh(com.nimbusds.jose.jwk.JWKSet jWKSet) {
        return true;
    }

    ForceRefreshJWKSetCacheEvaluator() {
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof com.nimbusds.jose.jwk.source.ForceRefreshJWKSetCacheEvaluator;
    }
}
