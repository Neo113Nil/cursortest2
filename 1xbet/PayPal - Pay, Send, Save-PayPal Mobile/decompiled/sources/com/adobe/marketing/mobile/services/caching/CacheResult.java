package com.adobe.marketing.mobile.services.caching;

/* loaded from: classes7.dex */
public interface CacheResult {
    java.io.InputStream getData();

    com.adobe.marketing.mobile.services.caching.CacheExpiry getExpiry();

    java.util.Map<java.lang.String, java.lang.String> getMetadata();
}
