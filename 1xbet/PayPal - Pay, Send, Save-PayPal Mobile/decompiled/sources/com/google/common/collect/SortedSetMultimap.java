package com.google.common.collect;

/* loaded from: classes9.dex */
public interface SortedSetMultimap<K, V> extends com.google.common.collect.SetMultimap<K, V> {
    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Map<K, java.util.Collection<V>> asMap();

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.SortedSet<V> get(K k);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.SortedSet<V> removeAll(java.lang.Object obj);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.SortedSet<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable);

    java.util.Comparator<? super V> valueComparator();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default java.util.Collection get(java.lang.Object obj) {
        return get((com.google.common.collect.SortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default java.util.Set get(java.lang.Object obj) {
        return get((com.google.common.collect.SortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.SortedSetMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default java.util.Set replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.SortedSetMultimap<K, V>) obj, iterable);
    }
}
