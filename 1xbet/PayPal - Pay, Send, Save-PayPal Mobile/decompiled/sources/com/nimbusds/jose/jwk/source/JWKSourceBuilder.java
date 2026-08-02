package com.nimbusds.jose.jwk.source;

/* loaded from: classes10.dex */
public class JWKSourceBuilder<C extends com.nimbusds.jose.proc.SecurityContext> {
    public static final long DEFAULT_CACHE_REFRESH_TIMEOUT = 15000;
    public static final long DEFAULT_CACHE_TIME_TO_LIVE = 300000;
    public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_READ_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_SIZE_LIMIT = 51200;
    public static final long DEFAULT_RATE_LIMIT_MIN_INTERVAL = 30000;
    public static final long DEFAULT_REFRESH_AHEAD_TIME = 30000;
    private com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> cachingEventListener;
    protected com.nimbusds.jose.jwk.source.JWKSource<C> failover;
    private com.nimbusds.jose.util.health.HealthReportListener<com.nimbusds.jose.jwk.source.JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener;
    private final com.nimbusds.jose.jwk.source.JWKSetSource<C> jwkSetSource;
    private com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.OutageTolerantJWKSetSource<C>, C> outageEventListener;
    private com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.RateLimitedJWKSetSource<C>, C> rateLimitedEventListener;
    private com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.RetryingJWKSetSource<C>, C> retryingEventListener;
    private boolean caching = true;
    private long cacheTimeToLive = 300000;
    private long cacheRefreshTimeout = 15000;
    private boolean refreshAhead = true;
    private long refreshAheadTime = 30000;
    private boolean refreshAheadScheduled = false;
    private boolean rateLimited = true;
    private long minTimeInterval = 30000;
    private boolean retrying = false;
    private boolean outageTolerant = false;
    private long outageCacheTimeToLive = -1;

    public static <C extends com.nimbusds.jose.proc.SecurityContext> com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> create(java.net.URL url) {
        return new com.nimbusds.jose.jwk.source.JWKSourceBuilder<>(new com.nimbusds.jose.jwk.source.URLBasedJWKSetSource(url, new com.nimbusds.jose.util.DefaultResourceRetriever(500, 500, 51200)));
    }

    public static <C extends com.nimbusds.jose.proc.SecurityContext> com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> create(java.net.URL url, com.nimbusds.jose.util.ResourceRetriever resourceRetriever) {
        return new com.nimbusds.jose.jwk.source.JWKSourceBuilder<>(new com.nimbusds.jose.jwk.source.URLBasedJWKSetSource(url, resourceRetriever));
    }

    public static <C extends com.nimbusds.jose.proc.SecurityContext> com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> create(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource) {
        return new com.nimbusds.jose.jwk.source.JWKSourceBuilder<>(jWKSetSource);
    }

    private JWKSourceBuilder(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource) {
        java.util.Objects.requireNonNull(jWKSetSource);
        this.jwkSetSource = jWKSetSource;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> cache(boolean z) {
        this.caching = z;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> cache(long j, long j2) {
        this.caching = true;
        this.cacheTimeToLive = j;
        this.cacheRefreshTimeout = j2;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> cache(long j, long j2, com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener) {
        this.caching = true;
        this.cacheTimeToLive = j;
        this.cacheRefreshTimeout = j2;
        this.cachingEventListener = eventListener;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> cacheForever() {
        this.caching = true;
        this.cacheTimeToLive = Long.MAX_VALUE;
        this.refreshAhead = false;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> refreshAheadCache(boolean z) {
        if (z) {
            this.caching = true;
        }
        this.refreshAhead = z;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> refreshAheadCache(long j, boolean z) {
        this.caching = true;
        this.refreshAhead = true;
        this.refreshAheadTime = j;
        this.refreshAheadScheduled = z;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> refreshAheadCache(long j, boolean z, com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.CachingJWKSetSource<C>, C> eventListener) {
        this.caching = true;
        this.refreshAhead = true;
        this.refreshAheadTime = j;
        this.refreshAheadScheduled = z;
        this.cachingEventListener = eventListener;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> rateLimited(boolean z) {
        this.rateLimited = z;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> rateLimited(long j) {
        this.rateLimited = true;
        this.minTimeInterval = j;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> rateLimited(long j, com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.RateLimitedJWKSetSource<C>, C> eventListener) {
        this.rateLimited = true;
        this.minTimeInterval = j;
        this.rateLimitedEventListener = eventListener;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> failover(com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource) {
        this.failover = jWKSource;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> retrying(boolean z) {
        this.retrying = z;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> retrying(com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.RetryingJWKSetSource<C>, C> eventListener) {
        this.retrying = true;
        this.retryingEventListener = eventListener;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> healthReporting(com.nimbusds.jose.util.health.HealthReportListener<com.nimbusds.jose.jwk.source.JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener) {
        this.healthReportListener = healthReportListener;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> outageTolerant(boolean z) {
        this.outageTolerant = z;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> outageTolerantForever() {
        this.outageTolerant = true;
        this.outageCacheTimeToLive = Long.MAX_VALUE;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> outageTolerant(long j) {
        this.outageTolerant = true;
        this.outageCacheTimeToLive = j;
        return this;
    }

    public com.nimbusds.jose.jwk.source.JWKSourceBuilder<C> outageTolerant(long j, com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.OutageTolerantJWKSetSource<C>, C> eventListener) {
        this.outageTolerant = true;
        this.outageCacheTimeToLive = j;
        this.outageEventListener = eventListener;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.nimbusds.jose.jwk.source.JWKSource<C> build() {
        com.nimbusds.jose.jwk.source.JWKSetSource<C> cachingJWKSetSource;
        boolean z = this.caching;
        if (!z && this.rateLimited) {
            throw new java.lang.IllegalStateException("Rate limiting requires caching");
        }
        if (!z && this.refreshAhead) {
            throw new java.lang.IllegalStateException("Refresh-ahead caching requires general caching");
        }
        if (z && this.rateLimited && this.cacheTimeToLive <= this.minTimeInterval) {
            throw new java.lang.IllegalStateException("The rate limiting min time interval between requests must be less than the cache time-to-live");
        }
        if (z && this.outageTolerant && this.cacheTimeToLive == Long.MAX_VALUE && this.outageCacheTimeToLive == Long.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Outage tolerance not necessary with a non-expiring cache");
        }
        if (z && this.refreshAhead && this.cacheTimeToLive == Long.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Refresh-ahead caching not necessary with a non-expiring cache");
        }
        com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource = this.jwkSetSource;
        if (this.retrying) {
            jWKSetSource = new com.nimbusds.jose.jwk.source.RetryingJWKSetSource(jWKSetSource, this.retryingEventListener);
        }
        if (this.outageTolerant) {
            if (this.outageCacheTimeToLive == -1) {
                if (this.caching) {
                    this.outageCacheTimeToLive = this.cacheTimeToLive * 10;
                } else {
                    this.outageCacheTimeToLive = com.paypal.oslo.feature.helpcenter.ui.util.VideoThumbnailExtractor.DEFAULT_FRAME_TIME_US;
                }
            }
            jWKSetSource = new com.nimbusds.jose.jwk.source.OutageTolerantJWKSetSource(jWKSetSource, this.outageCacheTimeToLive, this.outageEventListener);
        }
        com.nimbusds.jose.util.health.HealthReportListener<com.nimbusds.jose.jwk.source.JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener = this.healthReportListener;
        if (healthReportListener != null) {
            jWKSetSource = new com.nimbusds.jose.jwk.source.JWKSetSourceWithHealthStatusReporting(jWKSetSource, healthReportListener);
        }
        com.nimbusds.jose.jwk.source.JWKSetSource<C> rateLimitedJWKSetSource = this.rateLimited ? new com.nimbusds.jose.jwk.source.RateLimitedJWKSetSource(jWKSetSource, this.minTimeInterval, this.rateLimitedEventListener) : jWKSetSource;
        if (this.refreshAhead) {
            cachingJWKSetSource = new com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource<>(rateLimitedJWKSetSource, this.cacheTimeToLive, this.cacheRefreshTimeout, this.refreshAheadTime, this.refreshAheadScheduled, this.cachingEventListener);
        } else {
            if (this.caching) {
                cachingJWKSetSource = new com.nimbusds.jose.jwk.source.CachingJWKSetSource<>(rateLimitedJWKSetSource, this.cacheTimeToLive, this.cacheRefreshTimeout, this.cachingEventListener);
            }
            com.nimbusds.jose.jwk.source.JWKSetBasedJWKSource jWKSetBasedJWKSource = new com.nimbusds.jose.jwk.source.JWKSetBasedJWKSource(rateLimitedJWKSetSource);
            com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource = this.failover;
            return jWKSource == null ? new com.nimbusds.jose.jwk.source.JWKSourceWithFailover(jWKSetBasedJWKSource, jWKSource) : jWKSetBasedJWKSource;
        }
        rateLimitedJWKSetSource = cachingJWKSetSource;
        com.nimbusds.jose.jwk.source.JWKSetBasedJWKSource jWKSetBasedJWKSource2 = new com.nimbusds.jose.jwk.source.JWKSetBasedJWKSource(rateLimitedJWKSetSource);
        com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource2 = this.failover;
        if (jWKSource2 == null) {
        }
    }
}
