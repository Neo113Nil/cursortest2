package com.adobe.marketing.mobile.services.caching;

/* loaded from: classes3.dex */
public interface CacheService {
    com.adobe.marketing.mobile.services.caching.CacheResult get(java.lang.String str, java.lang.String str2);

    boolean remove(java.lang.String str, java.lang.String str2);

    boolean set(java.lang.String str, java.lang.String str2, com.adobe.marketing.mobile.services.caching.CacheEntry cacheEntry);
}
