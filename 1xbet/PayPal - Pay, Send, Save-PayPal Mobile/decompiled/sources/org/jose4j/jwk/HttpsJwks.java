package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class HttpsJwks {
    private static final org.slf4j.Logger Camera2StreamConfigurationMap = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.jwk.HttpsJwks.class);
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private volatile long getHighSpeedVideoSizes = 3600;
    private volatile org.jose4j.http.SimpleGet getInputFormats = new org.jose4j.http.Get();
    private volatile long getHighSpeedVideoSizesFor = 0;
    private volatile org.jose4j.jwk.HttpsJwks.Cache getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.jwk.HttpsJwks.Cache(java.util.Collections.emptyList(), 0, 0);
    private final java.util.concurrent.locks.ReentrantLock getHighSpeedVideoFpsRangesFor = new java.util.concurrent.locks.ReentrantLock();
    private long getOutputMinFrameDuration = 300;

    public HttpsJwks(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public void setDefaultCacheDuration(long j) {
        this.getHighSpeedVideoSizes = j;
    }

    public void setRetainCacheOnErrorDuration(long j) {
        this.getHighSpeedVideoSizesFor = j * 1000;
    }

    public void setSimpleHttpGet(org.jose4j.http.SimpleGet simpleGet) {
        this.getInputFormats = simpleGet;
    }

    public java.lang.String getLocation() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setRefreshReprieveThreshold(long j) {
        this.getOutputMinFrameDuration = j;
    }

    public java.util.List<org.jose4j.jwk.JsonWebKey> getJsonWebKeys() throws org.jose4j.lang.JoseException, java.io.IOException {
        org.jose4j.jwk.HttpsJwks.Cache cache;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        org.jose4j.jwk.HttpsJwks.Cache cache2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (cache2.getHighSpeedVideoFpsRanges <= currentTimeMillis) {
            if (!this.getHighSpeedVideoFpsRangesFor.tryLock()) {
                if (cache2.getHighSpeedVideoSizes.isEmpty()) {
                    this.getHighSpeedVideoFpsRangesFor.lock();
                } else {
                    return cache2.getHighSpeedVideoSizes;
                }
            }
            try {
                try {
                    refresh();
                    cache = this.getHighResolutionOutputSizeshNQ4ISI;
                } catch (java.lang.Exception e) {
                    if (this.getHighSpeedVideoSizesFor > 0 && !cache2.getHighSpeedVideoSizes.isEmpty()) {
                        org.jose4j.jwk.HttpsJwks.Cache cache3 = new org.jose4j.jwk.HttpsJwks.Cache(cache2.getHighSpeedVideoSizes, currentTimeMillis + this.getHighSpeedVideoSizesFor, (byte) 0);
                        this.getHighResolutionOutputSizeshNQ4ISI = cache3;
                        Camera2StreamConfigurationMap.info("Because of {} unable to refresh JWKS content from {} so will continue to use cached keys for more {} seconds until about {} -> {}", org.jose4j.lang.ExceptionHelp.toStringWithCauses(e), this.getHighSpeedVideoFpsRanges, java.lang.Long.valueOf(this.getHighSpeedVideoSizesFor / 1000), new java.util.Date(cache3.getHighSpeedVideoFpsRanges), cache3.getHighSpeedVideoSizes);
                        this.getHighSpeedVideoFpsRangesFor.unlock();
                        cache = cache3;
                    } else {
                        throw e;
                    }
                }
                return cache.getHighSpeedVideoSizes;
            } finally {
                this.getHighSpeedVideoFpsRangesFor.unlock();
            }
        }
        return cache2.getHighSpeedVideoSizes;
    }

    public void refresh() throws org.jose4j.lang.JoseException, java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.lock();
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            if (currentTimeMillis < this.getOutputMinFrameDuration && !this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes.isEmpty()) {
                Camera2StreamConfigurationMap.debug("NOT refreshing/loading JWKS from {} because it just happened {} mills ago", this.getHighSpeedVideoFpsRanges, java.lang.Long.valueOf(currentTimeMillis));
            } else {
                org.slf4j.Logger logger = Camera2StreamConfigurationMap;
                logger.debug("Refreshing/loading JWKS from {}", this.getHighSpeedVideoFpsRanges);
                org.jose4j.http.SimpleResponse simpleResponse = this.getInputFormats.get(this.getHighSpeedVideoFpsRanges);
                java.util.List<org.jose4j.jwk.JsonWebKey> jsonWebKeys = new org.jose4j.jwk.JsonWebKeySet(simpleResponse.getBody()).getJsonWebKeys();
                long Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(simpleResponse, java.lang.System.currentTimeMillis());
                if (Camera2StreamConfigurationMap2 <= 0) {
                    logger.debug("Will use default cache duration of {} seconds for content from {}", java.lang.Long.valueOf(this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRanges);
                    Camera2StreamConfigurationMap2 = this.getHighSpeedVideoSizes;
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() + (1000 * Camera2StreamConfigurationMap2);
                logger.debug("Updated JWKS content from {} will be cached for {} seconds until about {} -> {}", this.getHighSpeedVideoFpsRanges, java.lang.Long.valueOf(Camera2StreamConfigurationMap2), new java.util.Date(currentTimeMillis2), jsonWebKeys);
                this.getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.jwk.HttpsJwks.Cache(jsonWebKeys, currentTimeMillis2, (byte) 0);
            }
        } finally {
            this.getHighSpeedVideoFpsRangesFor.unlock();
        }
    }

    static class Cache {
        private final long getHighSpeedVideoFpsRanges;
        private final long getHighSpeedVideoFpsRangesFor;
        private final java.util.List<org.jose4j.jwk.JsonWebKey> getHighSpeedVideoSizes;

        /* synthetic */ Cache(java.util.List list, long j, byte b) {
            this(list, j);
        }

        private Cache(java.util.List<org.jose4j.jwk.JsonWebKey> list, long j) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.System.currentTimeMillis();
            this.getHighSpeedVideoSizes = list;
            this.getHighSpeedVideoFpsRanges = j;
        }
    }

    private static long Camera2StreamConfigurationMap(org.jose4j.http.SimpleResponse simpleResponse, long j) {
        java.lang.String lowerCase;
        long highSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRangesFor(simpleResponse, "expires") - j) / 1000;
        java.util.List<java.lang.String> headerValues = simpleResponse.getHeaderValues("cache-control");
        if (headerValues == null) {
            headerValues = java.util.Collections.emptyList();
        }
        for (java.lang.String str : headerValues) {
            if (str == null) {
                lowerCase = "";
            } else {
                try {
                    lowerCase = str.toLowerCase();
                } catch (java.lang.Exception unused) {
                }
            }
            int indexOf = lowerCase.indexOf(io.ktor.client.utils.CacheControl.MAX_AGE);
            int indexOf2 = lowerCase.indexOf(44, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = lowerCase.length();
            }
            java.lang.String substring = lowerCase.substring(indexOf, indexOf2);
            highSpeedVideoFpsRangesFor = java.lang.Long.parseLong(substring.substring(substring.indexOf(61) + 1).trim());
        }
        return highSpeedVideoFpsRangesFor;
    }

    private static long getHighSpeedVideoFpsRangesFor(org.jose4j.http.SimpleResponse simpleResponse, java.lang.String str) {
        java.util.List<java.lang.String> headerValues = simpleResponse.getHeaderValues(str);
        if (headerValues == null) {
            headerValues = java.util.Collections.emptyList();
        }
        java.util.Iterator<java.lang.String> it = headerValues.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            try {
                if (!next.endsWith("GMT")) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(next);
                    sb.append(" GMT");
                    next = sb.toString();
                }
                return java.util.Date.parse(next);
            } catch (java.lang.Exception unused) {
            }
        }
        return 0L;
    }
}
