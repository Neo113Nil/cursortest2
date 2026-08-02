package com.google.common.collect;

/* loaded from: classes9.dex */
final class FilteredMultimapValues<K, V> extends java.util.AbstractCollection<V> {
    private final com.google.common.collect.FilteredMultimap<K, V> multimap;

    FilteredMultimapValues(com.google.common.collect.FilteredMultimap<K, V> filteredMultimap) {
        this.multimap = (com.google.common.collect.FilteredMultimap) com.google.common.base.Preconditions.checkNotNull(filteredMultimap);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        return com.google.common.collect.Maps.valueIterator(this.multimap.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.multimap.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.multimap.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate = this.multimap.entryPredicate();
        java.util.Iterator<java.util.Map.Entry<K, V>> it = this.multimap.unfiltered().entries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (entryPredicate.apply(next) && java.util.Objects.equals(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Iterables.removeIf(this.multimap.unfiltered().entries(), com.google.common.base.Predicates.and(this.multimap.entryPredicate(), com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.in(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Iterables.removeIf(this.multimap.unfiltered().entries(), com.google.common.base.Predicates.and(this.multimap.entryPredicate(), com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.multimap.clear();
    }
}
