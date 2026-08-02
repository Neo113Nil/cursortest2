package com.datadog.trace.api.cache;

/* loaded from: classes3.dex */
public interface DDPartialKeyCache<K, V> {

    @java.lang.FunctionalInterface
    public interface Comparator<T, U> {
        boolean test(T t, int i, int i2, U u);
    }

    @java.lang.FunctionalInterface
    public interface Hasher<T> {
        int apply(T t, int i, int i2);
    }

    @java.lang.FunctionalInterface
    public interface Producer<T, R> {
        R apply(T t, int i, int i2, int i3);
    }

    void clear();

    V computeIfAbsent(K k, int i, int i2, com.datadog.trace.api.cache.DDPartialKeyCache.Hasher<K> hasher, com.datadog.trace.api.cache.DDPartialKeyCache.Comparator<K, V> comparator, com.datadog.trace.api.cache.DDPartialKeyCache.Producer<K, ? extends V> producer);
}
