package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class AbstractSortedKeySortedSetMultimap<K, V> extends com.google.common.collect.AbstractSortedSetMultimap<K, V> {
    AbstractSortedKeySortedSetMultimap(java.util.SortedMap<K, java.util.Collection<V>> sortedMap) {
        super(sortedMap);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedMap<K, java.util.Collection<V>> asMap() {
        return (java.util.SortedMap) super.asMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public java.util.SortedMap<K, java.util.Collection<V>> backingMap() {
        return (java.util.SortedMap) super.backingMap();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.SortedSet<K> keySet() {
        return (java.util.SortedSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
        return createMaybeNavigableKeySet();
    }
}
