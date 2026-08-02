package com.datadog.trace.api.cache;

/* loaded from: classes3.dex */
public interface DDCache<K, V> {
    void clear();

    V computeIfAbsent(K k, com.datadog.android.trace.internal.compat.function.Function<K, ? extends V> function);

    void visit(com.datadog.android.trace.internal.compat.function.BiConsumer<K, V> biConsumer);
}
