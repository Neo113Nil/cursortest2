package com.google.common.collect;

/* loaded from: classes4.dex */
public interface BiMap<K, V> extends java.util.Map<K, V> {
    V forcePut(K k, V v);

    com.google.common.collect.BiMap<V, K> inverse();

    V put(K k, V v);

    void putAll(java.util.Map<? extends K, ? extends V> map);

    @Override // com.google.common.collect.BiMap
    java.util.Set<V> values();
}
