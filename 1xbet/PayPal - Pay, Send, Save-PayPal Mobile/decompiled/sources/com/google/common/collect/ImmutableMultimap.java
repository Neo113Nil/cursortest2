package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ImmutableMultimap<K, V> extends com.google.common.collect.BaseImmutableMultimap<K, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final transient com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> map;
    final transient int size;

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public abstract com.google.common.collect.ImmutableCollection<V> get(K k);

    public abstract com.google.common.collect.ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(java.lang.Object obj, java.lang.Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
        return get((com.google.common.collect.ImmutableMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.ImmutableMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of() {
        return com.google.common.collect.ImmutableListMultimap.of();
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K k, V v) {
        return com.google.common.collect.ImmutableListMultimap.of((java.lang.Object) k, (java.lang.Object) v);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K k, V v, K k2, V v2) {
        return com.google.common.collect.ImmutableListMultimap.of((java.lang.Object) k, (java.lang.Object) v, (java.lang.Object) k2, (java.lang.Object) v2);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        return com.google.common.collect.ImmutableListMultimap.of((java.lang.Object) k, (java.lang.Object) v, (java.lang.Object) k2, (java.lang.Object) v2, (java.lang.Object) k3, (java.lang.Object) v3);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return com.google.common.collect.ImmutableListMultimap.of((java.lang.Object) k, (java.lang.Object) v, (java.lang.Object) k2, (java.lang.Object) v2, (java.lang.Object) k3, (java.lang.Object) v3, (java.lang.Object) k4, (java.lang.Object) v4);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return com.google.common.collect.ImmutableListMultimap.of((java.lang.Object) k, (java.lang.Object) v, (java.lang.Object) k2, (java.lang.Object) v2, (java.lang.Object) k3, (java.lang.Object) v3, (java.lang.Object) k4, (java.lang.Object) v4, (java.lang.Object) k5, (java.lang.Object) v5);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableMultimap.Builder<>();
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap.Builder<K, V> builderWithExpectedKeys(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new com.google.common.collect.ImmutableMultimap.Builder<>(i);
    }

    @com.google.errorprone.annotations.DoNotMock
    public static class Builder<K, V> {
        java.util.Map<K, com.google.common.collect.ImmutableCollection.Builder<V>> builderMap;
        int expectedValuesPerKey = 4;
        java.util.Comparator<? super K> keyComparator;
        java.util.Comparator<? super V> valueComparator;

        public Builder() {
        }

        Builder(int i) {
            if (i > 0) {
                this.builderMap = com.google.common.collect.Platform.preservesInsertionOrderOnPutsMapWithExpectedSize(i);
            }
        }

        java.util.Map<K, com.google.common.collect.ImmutableCollection.Builder<V>> ensureBuilderMapNonNull() {
            java.util.Map<K, com.google.common.collect.ImmutableCollection.Builder<V>> map = this.builderMap;
            if (map != null) {
                return map;
            }
            java.util.Map<K, com.google.common.collect.ImmutableCollection.Builder<V>> preservesInsertionOrderOnPutsMap = com.google.common.collect.Platform.preservesInsertionOrderOnPutsMap();
            this.builderMap = preservesInsertionOrderOnPutsMap;
            return preservesInsertionOrderOnPutsMap;
        }

        com.google.common.collect.ImmutableCollection.Builder<V> newValueCollectionBuilderWithExpectedSize(int i) {
            return com.google.common.collect.ImmutableList.builderWithExpectedSize(i);
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> expectedValuesPerKey(int i) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            this.expectedValuesPerKey = java.lang.Math.max(i, 1);
            return this;
        }

        int expectedValueCollectionSize(int i, java.lang.Iterable<?> iterable) {
            return iterable instanceof java.util.Collection ? java.lang.Math.max(i, ((java.util.Collection) iterable).size()) : i;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> put(K k, V v) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
            com.google.common.collect.ImmutableCollection.Builder<V> builder = ensureBuilderMapNonNull().get(k);
            if (builder == null) {
                builder = newValueCollectionBuilderWithExpectedSize(this.expectedValuesPerKey);
                ensureBuilderMapNonNull().put(k, builder);
            }
            builder.add((com.google.common.collect.ImmutableCollection.Builder<V>) v);
            return this;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
            java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(K k, java.lang.Iterable<? extends V> iterable) {
            if (k == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("null key in entry: null=");
                sb.append(com.google.common.collect.Iterables.toString(iterable));
                throw new java.lang.NullPointerException(sb.toString());
            }
            java.util.Iterator<? extends V> it = iterable.iterator();
            if (it.hasNext()) {
                com.google.common.collect.ImmutableCollection.Builder<V> builder = ensureBuilderMapNonNull().get(k);
                if (builder == null) {
                    builder = newValueCollectionBuilderWithExpectedSize(expectedValueCollectionSize(this.expectedValuesPerKey, iterable));
                    ensureBuilderMapNonNull().put(k, builder);
                }
                while (it.hasNext()) {
                    V next = it.next();
                    com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, next);
                    builder.add((com.google.common.collect.ImmutableCollection.Builder<V>) next);
                }
            }
            return this;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(K k, V... vArr) {
            return putAll((com.google.common.collect.ImmutableMultimap.Builder<K, V>) k, java.util.Arrays.asList(vArr));
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            for (java.util.Map.Entry<? extends K, java.util.Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                putAll((com.google.common.collect.ImmutableMultimap.Builder<K, V>) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> comparator) {
            this.keyComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
            return this;
        }

        public com.google.common.collect.ImmutableMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> comparator) {
            this.valueComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
            return this;
        }

        com.google.common.collect.ImmutableMultimap.Builder<K, V> combine(com.google.common.collect.ImmutableMultimap.Builder<K, V> builder) {
            java.util.Map<K, com.google.common.collect.ImmutableCollection.Builder<V>> map = builder.builderMap;
            if (map != null) {
                for (java.util.Map.Entry<K, com.google.common.collect.ImmutableCollection.Builder<V>> entry : map.entrySet()) {
                    putAll((com.google.common.collect.ImmutableMultimap.Builder<K, V>) entry.getKey(), entry.getValue().build());
                }
            }
            return this;
        }

        public com.google.common.collect.ImmutableMultimap<K, V> build() {
            java.util.Map<K, com.google.common.collect.ImmutableCollection.Builder<V>> map = this.builderMap;
            if (map == null) {
                return com.google.common.collect.ImmutableListMultimap.of();
            }
            java.util.Collection entrySet = map.entrySet();
            java.util.Comparator<? super K> comparator = this.keyComparator;
            if (comparator != null) {
                entrySet = com.google.common.collect.Ordering.from(comparator).onKeys().immutableSortedCopy(entrySet);
            }
            return com.google.common.collect.ImmutableListMultimap.fromMapBuilderEntries(entrySet, this.valueComparator);
        }
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        if (multimap instanceof com.google.common.collect.ImmutableMultimap) {
            com.google.common.collect.ImmutableMultimap<K, V> immutableMultimap = (com.google.common.collect.ImmutableMultimap) multimap;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return com.google.common.collect.ImmutableListMultimap.copyOf((com.google.common.collect.Multimap) multimap);
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
        return com.google.common.collect.ImmutableListMultimap.copyOf((java.lang.Iterable) iterable);
    }

    static final class FieldSettersHolder {
        static final com.google.common.collect.Serialization.FieldSetter<? super com.google.common.collect.ImmutableMultimap<?, ?>> MAP_FIELD_SETTER = com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.ImmutableMultimap.class, "map");
        static final com.google.common.collect.Serialization.FieldSetter<? super com.google.common.collect.ImmutableMultimap<?, ?>> SIZE_FIELD_SETTER = com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.ImmutableMultimap.class, io.ktor.http.ContentDisposition.Parameters.Size);

        private FieldSettersHolder() {
        }
    }

    ImmutableMultimap(com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public com.google.common.collect.ImmutableCollection<V> removeAll(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public com.google.common.collect.ImmutableCollection<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final boolean put(K k, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final boolean putAll(K k, java.lang.Iterable<? extends V> iterable) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(java.lang.Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(java.lang.Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
        throw new java.lang.AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public com.google.common.collect.ImmutableMap<K, java.util.Collection<V>> asMap() {
        return this.map;
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K, V>> entries() {
        return (com.google.common.collect.ImmutableCollection) super.entries();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K, V>> createEntries() {
        return new com.google.common.collect.ImmutableMultimap.EntryCollection(this);
    }

    static final class EntryCollection<K, V> extends com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableMultimap<K, V> multimap;

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return iterator();
        }

        EntryCollection(com.google.common.collect.ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return this.multimap.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator() {
        return new com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableMultimap.1
            final java.util.Iterator<? extends java.util.Map.Entry<K, ? extends com.google.common.collect.ImmutableCollection<V>>> asMapItr;
            K currentKey = null;
            java.util.Iterator<V> valueItr = com.google.common.collect.Iterators.emptyIterator();

            {
                this.asMapItr = com.google.common.collect.ImmutableMultimap.this.map.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.valueItr.hasNext() || this.asMapItr.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                if (!this.valueItr.hasNext()) {
                    java.util.Map.Entry<K, ? extends com.google.common.collect.ImmutableCollection<V>> next = this.asMapItr.next();
                    this.currentKey = next.getKey();
                    this.valueItr = next.getValue().iterator();
                }
                return com.google.common.collect.Maps.immutableEntry(java.util.Objects.requireNonNull(this.currentKey), this.valueItr.next());
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableMultiset<K> keys() {
        return (com.google.common.collect.ImmutableMultiset) super.keys();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public com.google.common.collect.ImmutableMultiset<K> createKeys() {
        return new com.google.common.collect.ImmutableMultimap.Keys();
    }

    final class Keys extends com.google.common.collect.ImmutableMultiset<K> {
        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        public final /* bridge */ /* synthetic */ java.util.Set elementSet() {
            return elementSet();
        }

        private Keys() {
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.collect.ImmutableMultimap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.Multiset
        public final int count(java.lang.Object obj) {
            com.google.common.collect.ImmutableCollection<V> immutableCollection = com.google.common.collect.ImmutableMultimap.this.map.get(obj);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        public final com.google.common.collect.ImmutableSet<K> elementSet() {
            return com.google.common.collect.ImmutableMultimap.this.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public final int size() {
            return com.google.common.collect.ImmutableMultimap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        final com.google.common.collect.Multiset.Entry<K> getEntry(int i) {
            java.util.Map.Entry<K, ? extends com.google.common.collect.ImmutableCollection<V>> entry = com.google.common.collect.ImmutableMultimap.this.map.entrySet().asList().get(i);
            return com.google.common.collect.Multisets.immutableEntry(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return new com.google.common.collect.ImmutableMultimap.KeysSerializedForm(com.google.common.collect.ImmutableMultimap.this);
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use KeysSerializedForm");
        }
    }

    static final class KeysSerializedForm implements java.io.Serializable {
        final com.google.common.collect.ImmutableMultimap<?, ?> multimap;

        KeysSerializedForm(com.google.common.collect.ImmutableMultimap<?, ?> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        final java.lang.Object readResolve() {
            return this.multimap.keys();
        }
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableCollection<V> values() {
        return (com.google.common.collect.ImmutableCollection) super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public com.google.common.collect.ImmutableCollection<V> createValues() {
        return new com.google.common.collect.ImmutableMultimap.Values(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public com.google.common.collect.UnmodifiableIterator<V> valueIterator() {
        return new com.google.common.collect.UnmodifiableIterator<V>() { // from class: com.google.common.collect.ImmutableMultimap.2
            final java.util.Iterator<? extends com.google.common.collect.ImmutableCollection<V>> valueCollectionItr;
            java.util.Iterator<V> valueItr = com.google.common.collect.Iterators.emptyIterator();

            {
                this.valueCollectionItr = com.google.common.collect.ImmutableMultimap.this.map.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.valueItr.hasNext() || this.valueCollectionItr.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                if (!this.valueItr.hasNext()) {
                    this.valueItr = this.valueCollectionItr.next().iterator();
                }
                return this.valueItr.next();
            }
        };
    }

    static final class Values<K, V> extends com.google.common.collect.ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        private final transient com.google.common.collect.ImmutableMultimap<K, V> multimap;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return iterator();
        }

        Values(com.google.common.collect.ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return this.multimap.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final com.google.common.collect.UnmodifiableIterator<V> iterator() {
            return this.multimap.valueIterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        final int copyIntoArray(java.lang.Object[] objArr, int i) {
            com.google.common.collect.UnmodifiableIterator<? extends com.google.common.collect.ImmutableCollection<V>> it = this.multimap.map.values().iterator();
            while (it.hasNext()) {
                i = it.next().copyIntoArray(objArr, i);
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }
}
