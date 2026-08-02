package com.adobe.marketing.mobile.services.internal.caching;

/* loaded from: classes7.dex */
class FileCacheResult implements com.adobe.marketing.mobile.services.caching.CacheResult {
    private final java.io.File getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final com.adobe.marketing.mobile.services.caching.CacheExpiry getHighSpeedVideoSizes;

    public FileCacheResult(java.io.File file, com.adobe.marketing.mobile.services.caching.CacheExpiry cacheExpiry, java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighSpeedVideoFpsRanges = file;
        this.getHighSpeedVideoSizes = cacheExpiry;
        this.getHighSpeedVideoFpsRangesFor = map;
    }

    @Override // com.adobe.marketing.mobile.services.caching.CacheResult
    public java.io.InputStream getData() {
        try {
            return new java.io.FileInputStream(this.getHighSpeedVideoFpsRanges);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.caching.CacheResult
    public com.adobe.marketing.mobile.services.caching.CacheExpiry getExpiry() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.adobe.marketing.mobile.services.caching.CacheResult
    public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
