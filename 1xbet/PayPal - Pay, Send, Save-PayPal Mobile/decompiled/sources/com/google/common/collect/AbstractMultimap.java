package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class AbstractMultimap<K, V> implements com.google.common.collect.Multimap<K, V> {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Map<K, java.util.Collection<V>> asMap;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<java.util.Map.Entry<K, V>> entries;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<K> keySet;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.Multiset<K> keys;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<V> values;

    abstract java.util.Map<K, java.util.Collection<V>> createAsMap();

    abstract java.util.Collection<java.util.Map.Entry<K, V>> createEntries();

    abstract java.util.Set<K> createKeySet();

    abstract com.google.common.collect.Multiset<K> createKeys();

    abstract java.util.Collection<V> createValues();

    abstract java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator();

    AbstractMultimap() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(java.lang.Object obj) {
        java.util.Iterator<java.util.Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(K k, V v) {
        return get(k).add(v);
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(K k, java.lang.Iterable<? extends V> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        if (iterable instanceof java.util.Collection) {
            java.util.Collection<? extends V> collection = (java.util.Collection) iterable;
            return !collection.isEmpty() && get(k).addAll(collection);
        }
        java.util.Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && com.google.common.collect.Iterators.addAll(get(k), it);
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        boolean z = false;
        for (java.util.Map.Entry<? extends K, ? extends V> entry : multimap.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        java.util.Collection<V> removeAll = removeAll(k);
        putAll(k, iterable);
        return removeAll;
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
        java.util.Collection<java.util.Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<java.util.Map.Entry<K, V>> createEntries = createEntries();
        this.entries = createEntries;
        return createEntries;
    }

    class Entries extends com.google.common.collect.Multimaps.Entries<K, V> {
        Entries() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        com.google.common.collect.Multimap<K, V> multimap() {
            return com.google.common.collect.AbstractMultimap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return com.google.common.collect.AbstractMultimap.this.entryIterator();
        }
    }

    final class EntrySet extends com.google.common.collect.AbstractMultimap<K, V>.Entries implements java.util.Set<java.util.Map.Entry<K, V>> {
        EntrySet() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return com.google.common.collect.Sets.hashCodeImpl(this);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(java.lang.Object obj) {
            return com.google.common.collect.Sets.equalsImpl(this, obj);
        }
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        java.util.Set<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    @Override // com.google.common.collect.Multimap
    public com.google.common.collect.Multiset<K> keys() {
        com.google.common.collect.Multiset<K> multiset = this.keys;
        if (multiset != null) {
            return multiset;
        }
        com.google.common.collect.Multiset<K> createKeys = createKeys();
        this.keys = createKeys;
        return createKeys;
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    final class Values extends java.util.AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            return com.google.common.collect.AbstractMultimap.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return com.google.common.collect.AbstractMultimap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.collect.AbstractMultimap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            com.google.common.collect.AbstractMultimap.this.clear();
        }
    }

    java.util.Iterator<V> valueIterator() {
        return com.google.common.collect.Maps.valueIterator(entries().iterator());
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
        java.util.Map<K, java.util.Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        java.util.Map<K, java.util.Collection<V>> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(java.lang.Object obj) {
        return com.google.common.collect.Multimaps.equalsImpl(this, obj);
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return asMap().hashCode();
    }

    public java.lang.String toString() {
        return asMap().toString();
    }
}
