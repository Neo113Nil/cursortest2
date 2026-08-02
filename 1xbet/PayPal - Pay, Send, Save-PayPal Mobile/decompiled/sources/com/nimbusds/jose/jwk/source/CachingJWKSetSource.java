package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class CachingJWKSetSource<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractCachingJWKSetSource<C> {
    private final long cacheRefreshTimeout;
    private final com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener;
    private final java.util.concurrent.locks.ReentrantLock lock;

    @Override // com.nimbusds.jose.jwk.source.AbstractCachingJWKSetSource
    public /* bridge */ /* synthetic */ long getTimeToLive() {
        return super.getTimeToLive();
    }

    static class AbstractCachingJWKSetSourceEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> {
        private final int threadQueueLength;

        public AbstractCachingJWKSetSourceEvent(com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> cachingJWKSetSource, int i, C c) {
            super(cachingJWKSetSource, c);
            this.threadQueueLength = i;
        }

        public int getThreadQueueLength() {
            return this.threadQueueLength;
        }
    }

    public static class RefreshInitiatedEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent<C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private RefreshInitiatedEvent(com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> cachingJWKSetSource, int i, C c) {
            super(cachingJWKSetSource, i, c);
        }
    }

    public static class RefreshCompletedEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent<C> {
        private final com.nimbusds.jose.jwk.JWKSet jwkSet;

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private RefreshCompletedEvent(com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> cachingJWKSetSource, com.nimbusds.jose.jwk.JWKSet jWKSet, int i, C c) {
            super(cachingJWKSetSource, i, c);
            java.util.Objects.requireNonNull(jWKSet);
            this.jwkSet = jWKSet;
        }

        public com.nimbusds.jose.jwk.JWKSet getJWKSet() {
            return this.jwkSet;
        }
    }

    public static class WaitingForRefreshEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent<C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private WaitingForRefreshEvent(com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> cachingJWKSetSource, int i, C c) {
            super(cachingJWKSetSource, i, c);
        }
    }

    public static class UnableToRefreshEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        private UnableToRefreshEvent(com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> cachingJWKSetSource, C c) {
            super(cachingJWKSetSource, c);
        }
    }

    public static class RefreshTimedOutEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent<C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private RefreshTimedOutEvent(com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> cachingJWKSetSource, int i, C c) {
            super(cachingJWKSetSource, i, c);
        }
    }

    public CachingJWKSetSource(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource, long j, long j2, com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener) {
        super(jWKSetSource, j);
        this.lock = new java.util.concurrent.locks.ReentrantLock();
        this.cacheRefreshTimeout = j2;
        this.eventListener = eventListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public com.nimbusds.jose.jwk.JWKSet getJWKSet(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws com.nimbusds.jose.KeySourceException {
        com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cachedJWKSet = getCachedJWKSet();
        if (cachedJWKSet == null) {
            return loadJWKSetBlocking(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator.noRefresh(), j, c);
        }
        com.nimbusds.jose.jwk.JWKSet jWKSet = cachedJWKSet.get();
        if (jWKSetCacheRefreshEvaluator.requiresRefresh(jWKSet)) {
            return loadJWKSetBlocking(jWKSetCacheRefreshEvaluator, j, c);
        }
        if (cachedJWKSet.isExpired(j)) {
            return loadJWKSetBlocking(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator.referenceComparison(jWKSet), j, c);
        }
        return cachedJWKSet.get();
    }

    public long getCacheRefreshTimeout() {
        return this.cacheRefreshTimeout;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00da A[Catch: InterruptedException -> 0x011e, TryCatch #1 {InterruptedException -> 0x011e, blocks: (B:2:0x0000, B:48:0x004e, B:23:0x00c9, B:25:0x00cf, B:27:0x00d6, B:29:0x00da, B:30:0x00e2, B:31:0x00e9, B:5:0x005c, B:7:0x0060, B:8:0x006e, B:21:0x00c2, B:10:0x00f1, B:12:0x00f5, B:13:0x0103, B:14:0x011d, B:41:0x00eb, B:42:0x00f0, B:57:0x0056, B:58:0x005b, B:44:0x0009, B:46:0x000f, B:49:0x001b, B:51:0x001f, B:52:0x002d, B:54:0x0035, B:17:0x007c, B:19:0x0082, B:32:0x008e, B:34:0x0092, B:35:0x00a0, B:37:0x00a8), top: B:1:0x0000, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    com.nimbusds.jose.jwk.JWKSet loadJWKSetBlocking(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws com.nimbusds.jose.KeySourceException {
        com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cachedJWKSet;
        com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener;
        try {
            if (this.lock.tryLock()) {
                try {
                    cachedJWKSet = getCachedJWKSet();
                    if (cachedJWKSet == null || jWKSetCacheRefreshEvaluator.requiresRefresh(cachedJWKSet.get())) {
                        com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener2 = this.eventListener;
                        if (eventListener2 != null) {
                            eventListener2.notify(new com.nimbusds.jose.jwk.source.CachingJWKSetSource.RefreshInitiatedEvent(this.lock.getQueueLength(), c));
                        }
                        cachedJWKSet = loadJWKSetNotThreadSafe(jWKSetCacheRefreshEvaluator, j, c);
                        com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener3 = this.eventListener;
                        if (eventListener3 != null) {
                            eventListener3.notify(new com.nimbusds.jose.jwk.source.CachingJWKSetSource.RefreshCompletedEvent(cachedJWKSet.get(), this.lock.getQueueLength(), c));
                        }
                    }
                    this.lock.unlock();
                    if (cachedJWKSet == null && cachedJWKSet.isValid(j)) {
                        return cachedJWKSet.get();
                    }
                    eventListener = this.eventListener;
                    if (eventListener != null) {
                        eventListener.notify(new com.nimbusds.jose.jwk.source.CachingJWKSetSource.UnableToRefreshEvent(c));
                    }
                    throw new com.nimbusds.jose.jwk.source.JWKSetUnavailableException("Unable to refresh cache");
                } finally {
                }
            }
            com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener4 = this.eventListener;
            if (eventListener4 != null) {
                eventListener4.notify(new com.nimbusds.jose.jwk.source.CachingJWKSetSource.WaitingForRefreshEvent(this.lock.getQueueLength(), c));
            }
            if (this.lock.tryLock(getCacheRefreshTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                try {
                    cachedJWKSet = getCachedJWKSet();
                    if (cachedJWKSet == null || jWKSetCacheRefreshEvaluator.requiresRefresh(cachedJWKSet.get())) {
                        com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener5 = this.eventListener;
                        if (eventListener5 != null) {
                            eventListener5.notify(new com.nimbusds.jose.jwk.source.CachingJWKSetSource.RefreshInitiatedEvent(this.lock.getQueueLength(), c));
                        }
                        com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> loadJWKSetNotThreadSafe = loadJWKSetNotThreadSafe(jWKSetCacheRefreshEvaluator, j, c);
                        com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener6 = this.eventListener;
                        if (eventListener6 != null) {
                            eventListener6.notify(new com.nimbusds.jose.jwk.source.CachingJWKSetSource.RefreshCompletedEvent(loadJWKSetNotThreadSafe.get(), this.lock.getQueueLength(), c));
                        }
                        cachedJWKSet = loadJWKSetNotThreadSafe;
                    }
                    if (cachedJWKSet == null) {
                    }
                    eventListener = this.eventListener;
                    if (eventListener != null) {
                    }
                    throw new com.nimbusds.jose.jwk.source.JWKSetUnavailableException("Unable to refresh cache");
                } finally {
                }
            }
            com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener7 = this.eventListener;
            if (eventListener7 != null) {
                eventListener7.notify(new com.nimbusds.jose.jwk.source.CachingJWKSetSource.RefreshTimedOutEvent(this.lock.getQueueLength(), c));
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Timeout while waiting for cache refresh (");
            sb.append(this.cacheRefreshTimeout);
            sb.append("ms exceeded)");
            throw new com.nimbusds.jose.jwk.source.JWKSetUnavailableException(sb.toString());
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw new com.nimbusds.jose.jwk.source.JWKSetUnavailableException("Interrupted while waiting for cache refresh", e);
        }
    }

    com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> loadJWKSetNotThreadSafe(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws com.nimbusds.jose.KeySourceException {
        return cacheJWKSet(getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j, c), j);
    }

    java.util.concurrent.locks.ReentrantLock getLock() {
        return this.lock;
    }
}
