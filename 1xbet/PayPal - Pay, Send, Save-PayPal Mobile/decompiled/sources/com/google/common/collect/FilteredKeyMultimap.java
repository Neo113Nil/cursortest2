package com.google.common.collect;

/* loaded from: classes9.dex */
class FilteredKeyMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.FilteredMultimap<K, V> {
    final com.google.common.base.Predicate<? super K> keyPredicate;
    final com.google.common.collect.Multimap<K, V> unfiltered;

    FilteredKeyMultimap(com.google.common.collect.Multimap<K, V> multimap, com.google.common.base.Predicate<? super K> predicate) {
        this.unfiltered = (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(multimap);
        this.keyPredicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
    }

    public com.google.common.collect.Multimap<K, V> unfiltered() {
        return this.unfiltered;
    }

    @Override // com.google.common.collect.FilteredMultimap
    public com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate() {
        return com.google.common.collect.Maps.keyPredicateOnEntries(this.keyPredicate);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        java.util.Iterator<java.util.Collection<V>> it = asMap().values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().size();
        }
        return i;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(java.lang.Object obj) {
        if (this.unfiltered.containsKey(obj)) {
            return this.keyPredicate.apply(obj);
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> removeAll(java.lang.Object obj) {
        return containsKey(obj) ? this.unfiltered.removeAll(obj) : unmodifiableEmptyCollection();
    }

    java.util.Collection<V> unmodifiableEmptyCollection() {
        if (this.unfiltered instanceof com.google.common.collect.SetMultimap) {
            return java.util.Collections.emptySet();
        }
        return java.util.Collections.emptyList();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
        return com.google.common.collect.Sets.filter(this.unfiltered.keySet(), this.keyPredicate);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> get(K k) {
        if (this.keyPredicate.apply(k)) {
            return this.unfiltered.get(k);
        }
        if (this.unfiltered instanceof com.google.common.collect.SetMultimap) {
            return new com.google.common.collect.FilteredKeyMultimap.AddRejectingSet(k);
        }
        return new com.google.common.collect.FilteredKeyMultimap.AddRejectingList(k);
    }

    static final class AddRejectingSet<K, V> extends com.google.common.collect.ForwardingSet<V> {
        final K key;

        AddRejectingSet(K k) {
            this.key = k;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(V v) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key does not satisfy predicate: ");
            sb.append(this.key);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(java.util.Collection<? extends V> collection) {
            com.google.common.base.Preconditions.checkNotNull(collection);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key does not satisfy predicate: ");
            sb.append(this.key);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set<V> delegate() {
            return java.util.Collections.emptySet();
        }
    }

    static final class AddRejectingList<K, V> extends com.google.common.collect.ForwardingList<V> {
        final K key;

        AddRejectingList(K k) {
            this.key = k;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(V v) {
            add(0, v);
            return true;
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public final void add(int i, V v) {
            com.google.common.base.Preconditions.checkPositionIndex(i, 0);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key does not satisfy predicate: ");
            sb.append(this.key);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(java.util.Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public final boolean addAll(int i, java.util.Collection<? extends V> collection) {
            com.google.common.base.Preconditions.checkNotNull(collection);
            com.google.common.base.Preconditions.checkPositionIndex(i, 0);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key does not satisfy predicate: ");
            sb.append(this.key);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.List<V> delegate() {
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
        return new com.google.common.collect.FilteredKeyMultimap.Entries();
    }

    class Entries extends com.google.common.collect.ForwardingCollection<java.util.Map.Entry<K, V>> {
        Entries() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Collection<java.util.Map.Entry<K, V>> delegate() {
            return com.google.common.collect.Collections2.filter(com.google.common.collect.FilteredKeyMultimap.this.unfiltered.entries(), com.google.common.collect.FilteredKeyMultimap.this.entryPredicate());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (com.google.common.collect.FilteredKeyMultimap.this.unfiltered.containsKey(entry.getKey()) && com.google.common.collect.FilteredKeyMultimap.this.keyPredicate.apply((java.lang.Object) entry.getKey())) {
                return com.google.common.collect.FilteredKeyMultimap.this.unfiltered.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<V> createValues() {
        return new com.google.common.collect.FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        return com.google.common.collect.Maps.filterKeys(this.unfiltered.asMap(), this.keyPredicate);
    }

    @Override // com.google.common.collect.AbstractMultimap
    com.google.common.collect.Multiset<K> createKeys() {
        return com.google.common.collect.Multisets.filter(this.unfiltered.keys(), this.keyPredicate);
    }
}
