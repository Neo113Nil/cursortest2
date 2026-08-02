package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class OutageTolerantJWKSetSource<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractCachingJWKSetSource<C> {
    private final com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.OutageTolerantJWKSetSource<C>, C> eventListener;

    @Override // com.nimbusds.jose.jwk.source.AbstractCachingJWKSetSource
    public /* bridge */ /* synthetic */ long getTimeToLive() {
        return super.getTimeToLive();
    }

    public static class OutageEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.OutageTolerantJWKSetSource<C>, C> {
        private final java.lang.Exception exception;
        private final long remainingTime;

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        private OutageEvent(com.nimbusds.jose.jwk.source.OutageTolerantJWKSetSource<C> outageTolerantJWKSetSource, java.lang.Exception exc, long j, C c) {
            super(outageTolerantJWKSetSource, c);
            java.util.Objects.requireNonNull(exc);
            this.exception = exc;
            this.remainingTime = j;
        }

        public java.lang.Exception getException() {
            return this.exception;
        }

        public long getRemainingTime() {
            return this.remainingTime;
        }
    }

    public OutageTolerantJWKSetSource(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource, long j, com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.OutageTolerantJWKSetSource<C>, C> eventListener) {
        super(jWKSetSource, j);
        this.eventListener = eventListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public com.nimbusds.jose.jwk.JWKSet getJWKSet(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws com.nimbusds.jose.KeySourceException {
        try {
            com.nimbusds.jose.jwk.JWKSet jWKSet = getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j, c);
            cacheJWKSet(jWKSet, j);
            return jWKSet;
        } catch (com.nimbusds.jose.jwk.source.JWKSetUnavailableException e) {
            com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cachedJWKSet = getCachedJWKSet();
            if (cachedJWKSet != null && cachedJWKSet.isValid(j)) {
                long expirationTime = cachedJWKSet.getExpirationTime();
                com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.OutageTolerantJWKSetSource<C>, C> eventListener = this.eventListener;
                if (eventListener != null) {
                    eventListener.notify(new com.nimbusds.jose.jwk.source.OutageTolerantJWKSetSource.OutageEvent(e, expirationTime - j, c));
                }
                com.nimbusds.jose.jwk.JWKSet jWKSet2 = new com.nimbusds.jose.jwk.JWKSet(cachedJWKSet.get().getKeys());
                if (!jWKSetCacheRefreshEvaluator.requiresRefresh(jWKSet2)) {
                    return jWKSet2;
                }
            }
            throw e;
        }
    }
}
