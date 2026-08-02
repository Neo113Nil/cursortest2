package com.google.common.collect;

/* loaded from: classes9.dex */
public interface ListMultimap<K, V> extends com.google.common.collect.Multimap<K, V> {
    java.util.Map<K, java.util.Collection<V>> asMap();

    boolean equals(java.lang.Object obj);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.List<V> get(K k);

    @Override // 
    java.util.List<V> removeAll(java.lang.Object obj);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.List<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default java.util.Collection get(java.lang.Object obj) {
        return get((com.google.common.collect.ListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.ListMultimap<K, V>) obj, iterable);
    }
}
