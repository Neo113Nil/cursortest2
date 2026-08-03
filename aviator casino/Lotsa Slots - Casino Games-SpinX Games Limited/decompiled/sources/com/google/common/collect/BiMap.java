package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface BiMap<K, V> extends java.util.Map<K, V> {
    @javax.annotation.CheckForNull
    V forcePut(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value);

    com.google.common.collect.BiMap<V, K> inverse();

    @javax.annotation.CheckForNull
    V put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value);

    void putAll(java.util.Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    java.util.Set<V> values();

    /* renamed from: com.google.common.collect.BiMap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
