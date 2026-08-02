package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class AbstractSortedSetMultimap<K, V> extends com.google.common.collect.AbstractSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public abstract java.util.SortedSet<V> createCollection();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
        return get((com.google.common.collect.AbstractSortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Set get(java.lang.Object obj) {
        return get((com.google.common.collect.AbstractSortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.AbstractSortedSetMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Set replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.AbstractSortedSetMultimap<K, V>) obj, iterable);
    }

    protected AbstractSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public java.util.SortedSet<V> createUnmodifiableEmptyCollection() {
        return (java.util.SortedSet<V>) unmodifiableCollectionSubclass((java.util.Collection) createCollection());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public <E> java.util.SortedSet<E> unmodifiableCollectionSubclass(java.util.Collection<E> collection) {
        if (collection instanceof java.util.NavigableSet) {
            return com.google.common.collect.Sets.unmodifiableNavigableSet((java.util.NavigableSet) collection);
        }
        return java.util.Collections.unmodifiableSortedSet((java.util.SortedSet) collection);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    java.util.Collection<V> wrapCollection(K k, java.util.Collection<V> collection) {
        if (collection instanceof java.util.NavigableSet) {
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedNavigableSet(k, (java.util.NavigableSet) collection, null);
        }
        return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(k, (java.util.SortedSet) collection, null);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> get(K k) {
        return (java.util.SortedSet) super.get((com.google.common.collect.AbstractSortedSetMultimap<K, V>) k);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> removeAll(java.lang.Object obj) {
        return (java.util.SortedSet) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
        return (java.util.SortedSet) super.replaceValues((com.google.common.collect.AbstractSortedSetMultimap<K, V>) k, (java.lang.Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
        return super.values();
    }
}
