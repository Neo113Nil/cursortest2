package com.adobe.marketing.mobile.services.caching;

/* loaded from: classes7.dex */
public class CacheEntry {
    private final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;
    private final com.adobe.marketing.mobile.services.caching.CacheExpiry getHighResolutionOutputSizeshNQ4ISI;
    private final java.io.InputStream getHighSpeedVideoFpsRangesFor;

    public CacheEntry(java.io.InputStream inputStream, com.adobe.marketing.mobile.services.caching.CacheExpiry cacheExpiry, java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighSpeedVideoFpsRangesFor = inputStream;
        this.getHighResolutionOutputSizeshNQ4ISI = cacheExpiry;
        this.Camera2StreamConfigurationMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
    }

    public java.io.InputStream getData() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.adobe.marketing.mobile.services.caching.CacheExpiry getExpiry() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return this.Camera2StreamConfigurationMap;
    }
}
