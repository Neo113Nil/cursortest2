package com.google.common.collect;

/* loaded from: classes9.dex */
class FilteredEntryMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.FilteredMultimap<K, V> {
    final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate;
    final com.google.common.collect.Multimap<K, V> unfiltered;

    FilteredEntryMultimap(com.google.common.collect.Multimap<K, V> multimap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        this.unfiltered = (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(multimap);
        this.predicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
    }

    @Override // com.google.common.collect.FilteredMultimap
    public com.google.common.collect.Multimap<K, V> unfiltered() {
        return this.unfiltered;
    }

    @Override // com.google.common.collect.FilteredMultimap
    public com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate() {
        return this.predicate;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return entries().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean satisfies(K k, V v) {
        return this.predicate.apply(com.google.common.collect.Maps.immutableEntry(k, v));
    }

    final class ValuePredicate implements com.google.common.base.Predicate<V> {
        private final K key;

        ValuePredicate(K k) {
            this.key = k;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(V v) {
            return com.google.common.collect.FilteredEntryMultimap.this.satisfies(this.key, v);
        }
    }

    static <E> java.util.Collection<E> filterCollection(java.util.Collection<E> collection, com.google.common.base.Predicate<? super E> predicate) {
        if (collection instanceof java.util.Set) {
            return com.google.common.collect.Sets.filter((java.util.Set) collection, predicate);
        }
        return com.google.common.collect.Collections2.filter(collection, predicate);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(java.lang.Object obj) {
        return asMap().get(obj) != null;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> removeAll(java.lang.Object obj) {
        return (java.util.Collection) com.google.common.base.MoreObjects.firstNonNull(asMap().remove(obj), unmodifiableEmptyCollection());
    }

    java.util.Collection<V> unmodifiableEmptyCollection() {
        return this.unfiltered instanceof com.google.common.collect.SetMultimap ? java.util.Collections.emptySet() : java.util.Collections.emptyList();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        entries().clear();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> get(K k) {
        return filterCollection(this.unfiltered.get(k), new com.google.common.collect.FilteredEntryMultimap.ValuePredicate(k));
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
        return filterCollection(this.unfiltered.entries(), this.predicate);
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<V> createValues() {
        return new com.google.common.collect.FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        return new com.google.common.collect.FilteredEntryMultimap.AsMap();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
        return asMap().keySet();
    }

    boolean removeEntriesIf(com.google.common.base.Predicate<? super java.util.Map.Entry<K, java.util.Collection<V>>> predicate) {
        java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> it = this.unfiltered.asMap().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            java.util.Map.Entry<K, java.util.Collection<V>> next = it.next();
            K key = next.getKey();
            java.util.Collection filterCollection = filterCollection(next.getValue(), new com.google.common.collect.FilteredEntryMultimap.ValuePredicate(key));
            if (!filterCollection.isEmpty() && predicate.apply(com.google.common.collect.Maps.immutableEntry(key, filterCollection))) {
                if (filterCollection.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    filterCollection.clear();
                }
                z = true;
            }
        }
        return z;
    }

    final class AsMap extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, java.util.Collection<V>> {
        private AsMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            com.google.common.collect.FilteredEntryMultimap.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final java.util.Collection<V> get(java.lang.Object obj) {
            java.util.Collection<V> collection = com.google.common.collect.FilteredEntryMultimap.this.unfiltered.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            java.util.Collection<V> filterCollection = com.google.common.collect.FilteredEntryMultimap.filterCollection(collection, new com.google.common.collect.FilteredEntryMultimap.ValuePredicate(obj));
            if (filterCollection.isEmpty()) {
                return null;
            }
            return filterCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final java.util.Collection<V> remove(java.lang.Object obj) {
            java.util.Collection<V> collection = com.google.common.collect.FilteredEntryMultimap.this.unfiltered.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (com.google.common.collect.FilteredEntryMultimap.this.satisfies(obj, next)) {
                    it.remove();
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (com.google.common.collect.FilteredEntryMultimap.this.unfiltered instanceof com.google.common.collect.SetMultimap) {
                return java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(arrayList));
            }
            return java.util.Collections.unmodifiableList(arrayList);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        final java.util.Set<K> createKeySet() {
            return new com.google.common.collect.Maps.KeySet<K, java.util.Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1KeySetImpl
                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(java.util.Collection<?> collection) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.collect.Maps.keyPredicateOnEntries(com.google.common.base.Predicates.in(collection)));
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(java.util.Collection<?> collection) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.collect.Maps.keyPredicateOnEntries(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(collection))));
                }

                @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean remove(java.lang.Object obj) {
                    return com.google.common.collect.FilteredEntryMultimap.AsMap.this.remove(obj) != null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        final java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> createEntrySet() {
            return new com.google.common.collect.Maps.EntrySet<K, java.util.Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                final java.util.Map<K, java.util.Collection<V>> map() {
                    return com.google.common.collect.FilteredEntryMultimap.AsMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                    return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<K, java.util.Collection<V>>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl.1
                        final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> backingIterator;

                        {
                            this.backingIterator = com.google.common.collect.FilteredEntryMultimap.this.unfiltered.asMap().entrySet().iterator();
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.AbstractIterator
                        public java.util.Map.Entry<K, java.util.Collection<V>> computeNext() {
                            while (this.backingIterator.hasNext()) {
                                java.util.Map.Entry<K, java.util.Collection<V>> next = this.backingIterator.next();
                                K key = next.getKey();
                                java.util.Collection filterCollection = com.google.common.collect.FilteredEntryMultimap.filterCollection(next.getValue(), new com.google.common.collect.FilteredEntryMultimap.ValuePredicate(key));
                                if (!filterCollection.isEmpty()) {
                                    return com.google.common.collect.Maps.immutableEntry(key, filterCollection);
                                }
                            }
                            return endOfData();
                        }
                    };
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(java.util.Collection<?> collection) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.base.Predicates.in(collection));
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(java.util.Collection<?> collection) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(collection)));
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return com.google.common.collect.Iterators.size(iterator());
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        final java.util.Collection<java.util.Collection<V>> createValues() {
            return new com.google.common.collect.Maps.Values<K, java.util.Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1ValuesImpl
                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public final boolean remove(java.lang.Object obj) {
                    if (!(obj instanceof java.util.Collection)) {
                        return false;
                    }
                    java.util.Collection collection = (java.util.Collection) obj;
                    java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> it = com.google.common.collect.FilteredEntryMultimap.this.unfiltered.asMap().entrySet().iterator();
                    while (it.hasNext()) {
                        java.util.Map.Entry<K, java.util.Collection<V>> next = it.next();
                        java.util.Collection filterCollection = com.google.common.collect.FilteredEntryMultimap.filterCollection(next.getValue(), new com.google.common.collect.FilteredEntryMultimap.ValuePredicate(next.getKey()));
                        if (!filterCollection.isEmpty() && collection.equals(filterCollection)) {
                            if (filterCollection.size() == next.getValue().size()) {
                                it.remove();
                                return true;
                            }
                            filterCollection.clear();
                            return true;
                        }
                    }
                    return false;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public final boolean removeAll(java.util.Collection<?> collection) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.in(collection)));
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public final boolean retainAll(java.util.Collection<?> collection) {
                    return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(com.google.common.collect.Maps.valuePredicateOnEntries(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(collection))));
                }
            };
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    com.google.common.collect.Multiset<K> createKeys() {
        return new com.google.common.collect.FilteredEntryMultimap.Keys();
    }

    final class Keys extends com.google.common.collect.Multimaps.Keys<K, V> {
        Keys() {
            super(com.google.common.collect.FilteredEntryMultimap.this);
        }

        @Override // com.google.common.collect.Multimaps.Keys, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int remove(java.lang.Object obj, int i) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            java.util.Collection<V> collection = com.google.common.collect.FilteredEntryMultimap.this.unfiltered.asMap().get(obj);
            int i2 = 0;
            if (collection == null) {
                return 0;
            }
            java.util.Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (com.google.common.collect.FilteredEntryMultimap.this.satisfies(obj, it.next()) && (i2 = i2 + 1) <= i) {
                    it.remove();
                }
            }
            return i2;
        }

        /* renamed from: com.google.common.collect.FilteredEntryMultimap$Keys$1, reason: invalid class name */
        class AnonymousClass1 extends com.google.common.collect.Multisets.EntrySet<K> {
            AnonymousClass1() {
            }

            @Override // com.google.common.collect.Multisets.EntrySet
            com.google.common.collect.Multiset<K> multiset() {
                return com.google.common.collect.FilteredEntryMultimap.Keys.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<com.google.common.collect.Multiset.Entry<K>> iterator() {
                return com.google.common.collect.FilteredEntryMultimap.Keys.this.entryIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.collect.FilteredEntryMultimap.this.keySet().size();
            }

            private boolean removeEntriesIf(final com.google.common.base.Predicate<? super com.google.common.collect.Multiset.Entry<K>> predicate) {
                return com.google.common.collect.FilteredEntryMultimap.this.removeEntriesIf(new com.google.common.base.Predicate() { // from class: com.google.common.collect.FilteredEntryMultimap$Keys$1$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Predicate
                    public final boolean apply(java.lang.Object obj) {
                        boolean apply;
                        apply = com.google.common.base.Predicate.this.apply(com.google.common.collect.Multisets.immutableEntry(r2.getKey(), ((java.util.Collection) ((java.util.Map.Entry) obj).getValue()).size()));
                        return apply;
                    }
                });
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(java.util.Collection<?> collection) {
                return removeEntriesIf(com.google.common.base.Predicates.in(collection));
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(java.util.Collection<?> collection) {
                return removeEntriesIf(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(collection)));
            }
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final java.util.Set<com.google.common.collect.Multiset.Entry<K>> entrySet() {
            return new com.google.common.collect.FilteredEntryMultimap.Keys.AnonymousClass1();
        }
    }
}
