package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RefreshAheadCachingJWKSetSource<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> {
    private volatile long cacheExpiration;
    private final com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener;
    private final java.util.concurrent.ExecutorService executorService;
    private final java.util.concurrent.locks.ReentrantLock lazyLock;
    private final long refreshAheadTime;
    private final java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
    private java.util.concurrent.ScheduledFuture<?> scheduledRefreshFuture;
    private final boolean shutdownExecutorOnClose;

    public static class RefreshScheduledEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        public RefreshScheduledEvent(com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource<C> refreshAheadCachingJWKSetSource, C c) {
            super(refreshAheadCachingJWKSetSource, c);
        }
    }

    public static class RefreshNotScheduledEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        public RefreshNotScheduledEvent(com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource<C> refreshAheadCachingJWKSetSource, C c) {
            super(refreshAheadCachingJWKSetSource, c);
        }
    }

    public static class ScheduledRefreshFailed<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> {
        private final java.lang.Exception exception;

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        public ScheduledRefreshFailed(com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> cachingJWKSetSource, java.lang.Exception exc, C c) {
            super(cachingJWKSetSource, c);
            java.util.Objects.requireNonNull(exc);
            this.exception = exc;
        }

        public java.lang.Exception getException() {
            return this.exception;
        }
    }

    public static class ScheduledRefreshInitiatedEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        private ScheduledRefreshInitiatedEvent(com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> cachingJWKSetSource, C c) {
            super(cachingJWKSetSource, c);
        }
    }

    public static class ScheduledRefreshCompletedEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> {
        private final com.nimbusds.jose.jwk.JWKSet jwkSet;

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        private ScheduledRefreshCompletedEvent(com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> cachingJWKSetSource, com.nimbusds.jose.jwk.JWKSet jWKSet, C c) {
            super(cachingJWKSetSource, c);
            java.util.Objects.requireNonNull(jWKSet);
            this.jwkSet = jWKSet;
        }

        public com.nimbusds.jose.jwk.JWKSet getJWKSet() {
            return this.jwkSet;
        }
    }

    public static class UnableToRefreshAheadOfExpirationEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        public UnableToRefreshAheadOfExpirationEvent(com.nimbusds.jose.jwk.source.CachingJWKSetSource<C> cachingJWKSetSource, C c) {
            super(cachingJWKSetSource, c);
        }
    }

    public RefreshAheadCachingJWKSetSource(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource, long j, long j2, long j3, boolean z, com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener) {
        this(jWKSetSource, j, j2, j3, z, java.util.concurrent.Executors.newSingleThreadExecutor(), true, eventListener);
    }

    public RefreshAheadCachingJWKSetSource(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource, long j, long j2, long j3, boolean z, java.util.concurrent.ExecutorService executorService, boolean z2, com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener) {
        super(jWKSetSource, j, j2, eventListener);
        this.lazyLock = new java.util.concurrent.locks.ReentrantLock();
        if (j3 + j2 > j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The sum of the refresh-ahead time (");
            sb.append(j3);
            sb.append("ms) and the cache refresh timeout (");
            sb.append(j2);
            sb.append("ms) must not exceed the time-to-lived time (");
            sb.append(j);
            sb.append("ms)");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.refreshAheadTime = j3;
        java.util.Objects.requireNonNull(executorService, "The executor service must not be null");
        this.executorService = executorService;
        this.shutdownExecutorOnClose = z2;
        if (z) {
            this.scheduledExecutorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        } else {
            this.scheduledExecutorService = null;
        }
        this.eventListener = eventListener;
    }

    @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource, com.nimbusds.jose.jwk.source.JWKSetSource
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
        refreshAheadOfExpiration(cachedJWKSet, false, j, c);
        return cachedJWKSet.get();
    }

    @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource
    com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> loadJWKSetNotThreadSafe(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws com.nimbusds.jose.KeySourceException {
        com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> loadJWKSetNotThreadSafe = super.loadJWKSetNotThreadSafe(jWKSetCacheRefreshEvaluator, j, c);
        if (this.scheduledExecutorService != null) {
            scheduleRefreshAheadOfExpiration(loadJWKSetNotThreadSafe, j, c);
        }
        return loadJWKSetNotThreadSafe;
    }

    void scheduleRefreshAheadOfExpiration(final com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cachedObject, long j, final C c) {
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.scheduledRefreshFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        long expirationTime = ((cachedObject.getExpirationTime() - j) - this.refreshAheadTime) - getCacheRefreshTimeout();
        if (expirationTime > 0) {
            this.scheduledRefreshFuture = this.scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.refreshAheadOfExpiration(cachedObject, true, java.lang.System.currentTimeMillis(), c);
                    } catch (java.lang.Exception e) {
                        if (com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.eventListener != null) {
                            com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.eventListener.notify(new com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.ScheduledRefreshFailed(this, e, c));
                        }
                    }
                }
            }, expirationTime, java.util.concurrent.TimeUnit.MILLISECONDS);
            com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener = this.eventListener;
            if (eventListener != null) {
                eventListener.notify(new com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.RefreshScheduledEvent(this, c));
                return;
            }
            return;
        }
        com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener2 = this.eventListener;
        if (eventListener2 != null) {
            eventListener2.notify(new com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.RefreshNotScheduledEvent(this, c));
        }
    }

    void refreshAheadOfExpiration(com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cachedObject, boolean z, long j, C c) {
        if ((cachedObject.isExpired(this.refreshAheadTime + j) || z) && this.cacheExpiration < cachedObject.getExpirationTime() && this.lazyLock.tryLock()) {
            try {
                lockedRefresh(cachedObject, j, c);
            } finally {
                this.lazyLock.unlock();
            }
        }
    }

    void lockedRefresh(com.nimbusds.jose.util.cache.CachedObject<com.nimbusds.jose.jwk.JWKSet> cachedObject, final long j, final C c) {
        if (this.cacheExpiration < cachedObject.getExpirationTime()) {
            this.cacheExpiration = cachedObject.getExpirationTime();
            this.executorService.execute(new java.lang.Runnable() { // from class: com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.eventListener != null) {
                            com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.eventListener.notify(new com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.ScheduledRefreshInitiatedEvent(this, c));
                        }
                        com.nimbusds.jose.jwk.JWKSet loadJWKSetBlocking = com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.loadJWKSetBlocking(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator.forceRefresh(), j, c);
                        if (com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.eventListener != null) {
                            com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.eventListener.notify(new com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.ScheduledRefreshCompletedEvent(this, loadJWKSetBlocking, c));
                        }
                    } catch (java.lang.Throwable unused) {
                        com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.cacheExpiration = -1L;
                        if (com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.eventListener != null) {
                            com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.this.eventListener.notify(new com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.UnableToRefreshAheadOfExpirationEvent(this, c));
                        }
                    }
                }
            });
        }
    }

    public java.util.concurrent.ExecutorService getExecutorService() {
        return this.executorService;
    }

    java.util.concurrent.locks.ReentrantLock getLazyLock() {
        return this.lazyLock;
    }

    java.util.concurrent.ScheduledFuture<?> getScheduledRefreshFuture() {
        return this.scheduledRefreshFuture;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSourceWrapper, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.scheduledRefreshFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        super.close();
        if (this.shutdownExecutorOnClose) {
            this.executorService.shutdownNow();
            try {
                this.executorService.awaitTermination(getCacheRefreshTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            try {
                this.scheduledExecutorService.awaitTermination(getCacheRefreshTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException unused2) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }
}
