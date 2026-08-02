package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RateLimitedJWKSetSource<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.JWKSetSourceWrapper<C> {
    private int counter;
    private final com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.RateLimitedJWKSetSource<C>, C> eventListener;
    private final long minTimeInterval;
    private long nextOpeningTime;

    public static class RateLimitedEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.RateLimitedJWKSetSource<C>, C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        private RateLimitedEvent(com.nimbusds.jose.jwk.source.RateLimitedJWKSetSource<C> rateLimitedJWKSetSource, C c) {
            super(rateLimitedJWKSetSource, c);
        }
    }

    public RateLimitedJWKSetSource(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource, long j, com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.RateLimitedJWKSetSource<C>, C> eventListener) {
        super(jWKSetSource);
        this.nextOpeningTime = -1L;
        this.counter = 0;
        this.minTimeInterval = j;
        this.eventListener = eventListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public com.nimbusds.jose.jwk.JWKSet getJWKSet(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws com.nimbusds.jose.KeySourceException {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.nextOpeningTime <= j) {
                this.nextOpeningTime = this.minTimeInterval + j;
                this.counter = 1;
            } else {
                int i = this.counter;
                boolean z2 = i <= 0;
                if (z2) {
                    z = z2;
                } else {
                    this.counter = i - 1;
                }
            }
        }
        if (z) {
            com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.RateLimitedJWKSetSource<C>, C> eventListener = this.eventListener;
            if (eventListener != null) {
                eventListener.notify(new com.nimbusds.jose.jwk.source.RateLimitedJWKSetSource.RateLimitedEvent(c));
            }
            throw new com.nimbusds.jose.jwk.source.RateLimitReachedException();
        }
        return getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j, c);
    }

    public long getMinTimeInterval() {
        return this.minTimeInterval;
    }
}
