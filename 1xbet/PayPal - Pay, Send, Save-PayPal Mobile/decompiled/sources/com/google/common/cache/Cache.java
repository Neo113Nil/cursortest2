package com.google.common.cache;

@com.google.errorprone.annotations.DoNotMock("Use CacheBuilder.newBuilder().build()")
/* loaded from: classes9.dex */
public interface Cache<K, V> {
    java.util.concurrent.ConcurrentMap<K, V> asMap();

    void cleanUp();

    V get(K k, java.util.concurrent.Callable<? extends V> callable) throws java.util.concurrent.ExecutionException;

    com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<? extends java.lang.Object> iterable);

    V getIfPresent(java.lang.Object obj);

    void invalidate(java.lang.Object obj);

    void invalidateAll();

    void invalidateAll(java.lang.Iterable<? extends java.lang.Object> iterable);

    void put(K k, V v);

    void putAll(java.util.Map<? extends K, ? extends V> map);

    long size();

    com.google.common.cache.CacheStats stats();
}
