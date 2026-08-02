package com.google.common.collect;

@com.google.errorprone.annotations.DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
/* loaded from: classes9.dex */
public interface Multimap<K, V> {
    java.util.Map<K, java.util.Collection<V>> asMap();

    void clear();

    boolean containsEntry(java.lang.Object obj, java.lang.Object obj2);

    boolean containsKey(java.lang.Object obj);

    boolean containsValue(java.lang.Object obj);

    java.util.Collection<java.util.Map.Entry<K, V>> entries();

    boolean equals(java.lang.Object obj);

    java.util.Collection<V> get(K k);

    int hashCode();

    boolean isEmpty();

    java.util.Set<K> keySet();

    com.google.common.collect.Multiset<K> keys();

    boolean put(K k, V v);

    boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap);

    boolean putAll(K k, java.lang.Iterable<? extends V> iterable);

    boolean remove(java.lang.Object obj, java.lang.Object obj2);

    java.util.Collection<V> removeAll(java.lang.Object obj);

    java.util.Collection<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable);

    int size();

    java.util.Collection<V> values();
}
