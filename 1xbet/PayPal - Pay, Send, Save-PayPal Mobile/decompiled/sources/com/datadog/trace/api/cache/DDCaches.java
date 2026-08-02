package com.datadog.trace.api.cache;

/* loaded from: classes3.dex */
public final class DDCaches {
    private DDCaches() {
    }

    public static <K, V> com.datadog.trace.api.cache.DDCache<K, V> newFixedSizeCache(int i) {
        return new com.datadog.trace.api.cache.FixedSizeCache.ObjectHash(i);
    }

    public static <K, V> com.datadog.trace.api.cache.DDPartialKeyCache<K, V> newFixedSizePartialKeyCache(int i) {
        return new com.datadog.trace.api.cache.FixedSizePartialKeyCache(i);
    }
}
