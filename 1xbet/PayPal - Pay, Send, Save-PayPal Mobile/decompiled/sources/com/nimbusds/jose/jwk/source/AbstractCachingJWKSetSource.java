package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
abstract class AbstractCachingJWKSetSource<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.JWKSetSourceWrapper<C> {
    private volatile com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cachedJWKSet;
    private final long timeToLive;

    AbstractCachingJWKSetSource(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource, long j) {
        super(jWKSetSource);
        this.timeToLive = j;
    }

    com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> getCachedJWKSet() {
        return this.cachedJWKSet;
    }

    void setCachedJWKSet(com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cachedObject) {
        this.cachedJWKSet = cachedObject;
    }

    com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> getCachedJWKSetIfValid(long j) {
        com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cachedJWKSet = getCachedJWKSet();
        if (cachedJWKSet == null || !cachedJWKSet.isValid(j)) {
            return null;
        }
        return cachedJWKSet;
    }

    public long getTimeToLive() {
        return this.timeToLive;
    }

    com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cacheJWKSet(com.nimbusds.jose.jwk.JWKSet jWKSet, long j) {
        com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cachedObject = new com.nimbusds.jose.util.cache.CachedObject<>(jWKSet, currentTimeMillis(), com.nimbusds.jose.util.cache.CachedObject.computeExpirationTime(j, getTimeToLive()));
        setCachedJWKSet(cachedObject);
        return cachedObject;
    }

    long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }
}
