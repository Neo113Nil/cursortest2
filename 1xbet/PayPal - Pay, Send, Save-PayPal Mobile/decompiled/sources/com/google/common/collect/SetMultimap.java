package com.google.common.collect;

/* loaded from: classes9.dex */
public interface SetMultimap<K, V> extends com.google.common.collect.Multimap<K, V> {
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Map<K, java.util.Collection<V>> asMap();

    @Override // com.google.common.collect.Multimap
    java.util.Set<java.util.Map.Entry<K, V>> entries();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    boolean equals(java.lang.Object obj);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Set<V> get(K k);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Set<V> removeAll(java.lang.Object obj);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Set<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default java.util.Collection get(java.lang.Object obj) {
        return get((com.google.common.collect.SetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.SetMultimap<K, V>) obj, iterable);
    }
}
