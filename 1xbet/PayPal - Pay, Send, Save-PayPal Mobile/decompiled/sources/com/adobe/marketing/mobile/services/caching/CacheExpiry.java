package com.adobe.marketing.mobile.services.caching;

/* loaded from: classes7.dex */
public class CacheExpiry {
    private final java.util.Date getHighSpeedVideoSizes;

    private CacheExpiry(java.util.Date date) {
        this.getHighSpeedVideoSizes = date;
    }

    public final java.util.Date getExpiration() {
        return this.getHighSpeedVideoSizes;
    }

    public static com.adobe.marketing.mobile.services.caching.CacheExpiry after(long j) {
        return new com.adobe.marketing.mobile.services.caching.CacheExpiry(new java.util.Date(java.lang.System.currentTimeMillis() + j));
    }

    public static com.adobe.marketing.mobile.services.caching.CacheExpiry at(java.util.Date date) {
        return new com.adobe.marketing.mobile.services.caching.CacheExpiry(date);
    }

    public static com.adobe.marketing.mobile.services.caching.CacheExpiry never() {
        return new com.adobe.marketing.mobile.services.caching.CacheExpiry(null);
    }

    public boolean isExpired() {
        return this.getHighSpeedVideoSizes != null && java.lang.System.currentTimeMillis() >= this.getHighSpeedVideoSizes.getTime();
    }
}
