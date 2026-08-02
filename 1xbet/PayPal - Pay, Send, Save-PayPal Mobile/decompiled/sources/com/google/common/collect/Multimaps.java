package com.google.common.collect;

/* loaded from: classes9.dex */
public final class Multimaps {
    private Multimaps() {
    }

    public static <T, K, V, M extends com.google.common.collect.Multimap<K, V>> java.util.stream.Collector<T, ?, M> toMultimap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2, java.util.function.Supplier<M> supplier) {
        return com.google.common.collect.CollectCollectors.toMultimap(function, function2, supplier);
    }

    public static <T, K, V, M extends com.google.common.collect.Multimap<K, V>> java.util.stream.Collector<T, ?, M> flatteningToMultimap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> function2, java.util.function.Supplier<M> supplier) {
        return com.google.common.collect.CollectCollectors.flatteningToMultimap(function, function2, supplier);
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> newMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.Collection<V>> supplier) {
        return new com.google.common.collect.Multimaps.CustomMultimap(map, supplier);
    }

    static final class CustomMultimap<K, V> extends com.google.common.collect.AbstractMapBasedMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient com.google.common.base.Supplier<? extends java.util.Collection<V>> factory;

        CustomMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.Collection<V>> supplier) {
            super(map);
            this.factory = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        final java.util.Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        final java.util.Map<K, java.util.Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        protected final java.util.Collection<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        final <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> collection) {
            if (collection instanceof java.util.NavigableSet) {
                return com.google.common.collect.Sets.unmodifiableNavigableSet((java.util.NavigableSet) collection);
            }
            if (collection instanceof java.util.SortedSet) {
                return java.util.Collections.unmodifiableSortedSet((java.util.SortedSet) collection);
            }
            if (collection instanceof java.util.Set) {
                return java.util.Collections.unmodifiableSet((java.util.Set) collection);
            }
            if (collection instanceof java.util.List) {
                return java.util.Collections.unmodifiableList((java.util.List) collection);
            }
            return java.util.Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        final java.util.Collection<V> wrapCollection(K k, java.util.Collection<V> collection) {
            if (collection instanceof java.util.List) {
                return wrapList(k, (java.util.List) collection, null);
            }
            if (collection instanceof java.util.NavigableSet) {
                return new com.google.common.collect.AbstractMapBasedMultimap.WrappedNavigableSet(k, (java.util.NavigableSet) collection, null);
            }
            if (collection instanceof java.util.SortedSet) {
                return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(k, (java.util.SortedSet) collection, null);
            }
            if (collection instanceof java.util.Set) {
                return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSet(k, (java.util.Set) collection);
            }
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection(k, collection, null);
        }

        private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.factory = (com.google.common.base.Supplier) java.util.Objects.requireNonNull(objectInputStream.readObject());
            setMap((java.util.Map) java.util.Objects.requireNonNull(objectInputStream.readObject()));
        }
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> newListMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.List<V>> supplier) {
        return new com.google.common.collect.Multimaps.CustomListMultimap(map, supplier);
    }

    static final class CustomListMultimap<K, V> extends com.google.common.collect.AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient com.google.common.base.Supplier<? extends java.util.List<V>> factory;

        CustomListMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.List<V>> supplier) {
            super(map);
            this.factory = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        final java.util.Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        final java.util.Map<K, java.util.Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.List<V> createCollection() {
            return this.factory.get();
        }

        private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.factory = (com.google.common.base.Supplier) java.util.Objects.requireNonNull(objectInputStream.readObject());
            setMap((java.util.Map) java.util.Objects.requireNonNull(objectInputStream.readObject()));
        }
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> newSetMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.Set<V>> supplier) {
        return new com.google.common.collect.Multimaps.CustomSetMultimap(map, supplier);
    }

    static final class CustomSetMultimap<K, V> extends com.google.common.collect.AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient com.google.common.base.Supplier<? extends java.util.Set<V>> factory;

        CustomSetMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.Set<V>> supplier) {
            super(map);
            this.factory = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        final java.util.Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        final java.util.Map<K, java.util.Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.Set<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        final <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> collection) {
            if (collection instanceof java.util.NavigableSet) {
                return com.google.common.collect.Sets.unmodifiableNavigableSet((java.util.NavigableSet) collection);
            }
            if (collection instanceof java.util.SortedSet) {
                return java.util.Collections.unmodifiableSortedSet((java.util.SortedSet) collection);
            }
            return java.util.Collections.unmodifiableSet((java.util.Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        final java.util.Collection<V> wrapCollection(K k, java.util.Collection<V> collection) {
            if (collection instanceof java.util.NavigableSet) {
                return new com.google.common.collect.AbstractMapBasedMultimap.WrappedNavigableSet(k, (java.util.NavigableSet) collection, null);
            }
            if (collection instanceof java.util.SortedSet) {
                return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(k, (java.util.SortedSet) collection, null);
            }
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSet(k, (java.util.Set) collection);
        }

        private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.factory = (com.google.common.base.Supplier) java.util.Objects.requireNonNull(objectInputStream.readObject());
            setMap((java.util.Map) java.util.Objects.requireNonNull(objectInputStream.readObject()));
        }
    }

    public static <K, V> com.google.common.collect.SortedSetMultimap<K, V> newSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.SortedSet<V>> supplier) {
        return new com.google.common.collect.Multimaps.CustomSortedSetMultimap(map, supplier);
    }

    static final class CustomSortedSetMultimap<K, V> extends com.google.common.collect.AbstractSortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient com.google.common.base.Supplier<? extends java.util.SortedSet<V>> factory;
        transient java.util.Comparator<? super V> valueComparator;

        CustomSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.SortedSet<V>> supplier) {
            super(map);
            this.factory = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
            this.valueComparator = supplier.get().comparator();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        final java.util.Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        final java.util.Map<K, java.util.Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.SortedSet<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public final java.util.Comparator<? super V> valueComparator() {
            return this.valueComparator;
        }

        private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            objectInputStream.defaultReadObject();
            com.google.common.base.Supplier<? extends java.util.SortedSet<V>> supplier = (com.google.common.base.Supplier) java.util.Objects.requireNonNull(objectInputStream.readObject());
            this.factory = supplier;
            this.valueComparator = supplier.get().comparator();
            setMap((java.util.Map) java.util.Objects.requireNonNull(objectInputStream.readObject()));
        }
    }

    public static <K, V, M extends com.google.common.collect.Multimap<K, V>> M invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K> multimap, M m) {
        com.google.common.base.Preconditions.checkNotNull(m);
        for (java.util.Map.Entry<? extends V, ? extends K> entry : multimap.entries()) {
            m.put(entry.getValue(), entry.getKey());
        }
        return m;
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> synchronizedMultimap(com.google.common.collect.Multimap<K, V> multimap) {
        return com.google.common.collect.Synchronized.multimap(multimap, null);
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.Multimap<K, V> multimap) {
        return ((multimap instanceof com.google.common.collect.Multimaps.UnmodifiableMultimap) || (multimap instanceof com.google.common.collect.ImmutableMultimap)) ? multimap : new com.google.common.collect.Multimaps.UnmodifiableMultimap(multimap);
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V> immutableMultimap) {
        return (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(immutableMultimap);
    }

    static class UnmodifiableMultimap<K, V> extends com.google.common.collect.ForwardingMultimap<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.Multimap<K, V> delegate;

        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Collection<java.util.Map.Entry<K, V>> entries;

        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Set<K> keySet;

        @com.google.errorprone.annotations.concurrent.LazyInit
        transient com.google.common.collect.Multiset<K> keys;

        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Map<K, java.util.Collection<V>> map;

        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Collection<V> values;

        UnmodifiableMultimap(com.google.common.collect.Multimap<K, V> multimap) {
            this.delegate = (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(multimap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public com.google.common.collect.Multimap<K, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public void clear() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Map<K, java.util.Collection<V>> asMap() {
            java.util.Map<K, java.util.Collection<V>> map = this.map;
            if (map != null) {
                return map;
            }
            java.util.Map<K, java.util.Collection<V>> unmodifiableMap = java.util.Collections.unmodifiableMap(com.google.common.collect.Maps.transformValues(this.delegate.asMap(), new com.google.common.base.Function() { // from class: com.google.common.collect.Multimaps$UnmodifiableMultimap$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    java.util.Collection unmodifiableValueCollection;
                    unmodifiableValueCollection = com.google.common.collect.Multimaps.unmodifiableValueCollection((java.util.Collection) obj);
                    return unmodifiableValueCollection;
                }
            }));
            this.map = unmodifiableMap;
            return unmodifiableMap;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
            java.util.Collection<java.util.Map.Entry<K, V>> collection = this.entries;
            if (collection != null) {
                return collection;
            }
            java.util.Collection<java.util.Map.Entry<K, V>> unmodifiableEntries = com.google.common.collect.Multimaps.unmodifiableEntries(this.delegate.entries());
            this.entries = unmodifiableEntries;
            return unmodifiableEntries;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V> get(K k) {
            return com.google.common.collect.Multimaps.unmodifiableValueCollection(this.delegate.get(k));
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public com.google.common.collect.Multiset<K> keys() {
            com.google.common.collect.Multiset<K> multiset = this.keys;
            if (multiset != null) {
                return multiset;
            }
            com.google.common.collect.Multiset<K> unmodifiableMultiset = com.google.common.collect.Multisets.unmodifiableMultiset(this.delegate.keys());
            this.keys = unmodifiableMultiset;
            return unmodifiableMultiset;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Set<K> keySet() {
            java.util.Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            java.util.Set<K> unmodifiableSet = java.util.Collections.unmodifiableSet(this.delegate.keySet());
            this.keySet = unmodifiableSet;
            return unmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean put(K k, V v) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(K k, java.lang.Iterable<? extends V> iterable) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V> removeAll(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Collection<V> values() {
            java.util.Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            java.util.Collection<V> unmodifiableCollection = java.util.Collections.unmodifiableCollection(this.delegate.values());
            this.values = unmodifiableCollection;
            return unmodifiableCollection;
        }
    }

    static final class UnmodifiableListMultimap<K, V> extends com.google.common.collect.Multimaps.UnmodifiableMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
            return get((com.google.common.collect.Multimaps.UnmodifiableListMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
            return replaceValues((com.google.common.collect.Multimaps.UnmodifiableListMultimap<K, V>) obj, iterable);
        }

        UnmodifiableListMultimap(com.google.common.collect.ListMultimap<K, V> listMultimap) {
            super(listMultimap);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public final com.google.common.collect.ListMultimap<K, V> delegate() {
            return (com.google.common.collect.ListMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.List<V> get(K k) {
            return java.util.Collections.unmodifiableList(delegate().get((com.google.common.collect.ListMultimap<K, V>) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.List<V> removeAll(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.List<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static class UnmodifiableSetMultimap<K, V> extends com.google.common.collect.Multimaps.UnmodifiableMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
            return get((com.google.common.collect.Multimaps.UnmodifiableSetMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
            return replaceValues((com.google.common.collect.Multimaps.UnmodifiableSetMultimap<K, V>) obj, iterable);
        }

        UnmodifiableSetMultimap(com.google.common.collect.SetMultimap<K, V> setMultimap) {
            super(setMultimap);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public com.google.common.collect.SetMultimap<K, V> delegate() {
            return (com.google.common.collect.SetMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> get(K k) {
            return java.util.Collections.unmodifiableSet(delegate().get((com.google.common.collect.SetMultimap<K, V>) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Set<java.util.Map.Entry<K, V>> entries() {
            return com.google.common.collect.Maps.unmodifiableEntrySet(delegate().entries());
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> removeAll(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static final class UnmodifiableSortedSetMultimap<K, V> extends com.google.common.collect.Multimaps.UnmodifiableSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
            return get((com.google.common.collect.Multimaps.UnmodifiableSortedSetMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Set get(java.lang.Object obj) {
            return get((com.google.common.collect.Multimaps.UnmodifiableSortedSetMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
            return replaceValues((com.google.common.collect.Multimaps.UnmodifiableSortedSetMultimap<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Set replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
            return replaceValues((com.google.common.collect.Multimaps.UnmodifiableSortedSetMultimap<K, V>) obj, iterable);
        }

        UnmodifiableSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> sortedSetMultimap) {
            super(sortedSetMultimap);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public final com.google.common.collect.SortedSetMultimap<K, V> delegate() {
            return (com.google.common.collect.SortedSetMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.SortedSet<V> get(K k) {
            return java.util.Collections.unmodifiableSortedSet(delegate().get((com.google.common.collect.SortedSetMultimap<K, V>) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.SortedSet<V> removeAll(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.SortedSet<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public final java.util.Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> synchronizedSetMultimap(com.google.common.collect.SetMultimap<K, V> setMultimap) {
        return com.google.common.collect.Synchronized.setMultimap(setMultimap, null);
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> unmodifiableSetMultimap(com.google.common.collect.SetMultimap<K, V> setMultimap) {
        return ((setMultimap instanceof com.google.common.collect.Multimaps.UnmodifiableSetMultimap) || (setMultimap instanceof com.google.common.collect.ImmutableSetMultimap)) ? setMultimap : new com.google.common.collect.Multimaps.UnmodifiableSetMultimap(setMultimap);
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.SetMultimap<K, V> unmodifiableSetMultimap(com.google.common.collect.ImmutableSetMultimap<K, V> immutableSetMultimap) {
        return (com.google.common.collect.SetMultimap) com.google.common.base.Preconditions.checkNotNull(immutableSetMultimap);
    }

    public static <K, V> com.google.common.collect.SortedSetMultimap<K, V> synchronizedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> sortedSetMultimap) {
        return com.google.common.collect.Synchronized.sortedSetMultimap(sortedSetMultimap, null);
    }

    public static <K, V> com.google.common.collect.SortedSetMultimap<K, V> unmodifiableSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> sortedSetMultimap) {
        return sortedSetMultimap instanceof com.google.common.collect.Multimaps.UnmodifiableSortedSetMultimap ? sortedSetMultimap : new com.google.common.collect.Multimaps.UnmodifiableSortedSetMultimap(sortedSetMultimap);
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> synchronizedListMultimap(com.google.common.collect.ListMultimap<K, V> listMultimap) {
        return com.google.common.collect.Synchronized.listMultimap(listMultimap, null);
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> unmodifiableListMultimap(com.google.common.collect.ListMultimap<K, V> listMultimap) {
        return ((listMultimap instanceof com.google.common.collect.Multimaps.UnmodifiableListMultimap) || (listMultimap instanceof com.google.common.collect.ImmutableListMultimap)) ? listMultimap : new com.google.common.collect.Multimaps.UnmodifiableListMultimap(listMultimap);
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ListMultimap<K, V> unmodifiableListMultimap(com.google.common.collect.ImmutableListMultimap<K, V> immutableListMultimap) {
        return (com.google.common.collect.ListMultimap) com.google.common.base.Preconditions.checkNotNull(immutableListMultimap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> java.util.Collection<V> unmodifiableValueCollection(java.util.Collection<V> collection) {
        if (collection instanceof java.util.SortedSet) {
            return java.util.Collections.unmodifiableSortedSet((java.util.SortedSet) collection);
        }
        if (collection instanceof java.util.Set) {
            return java.util.Collections.unmodifiableSet((java.util.Set) collection);
        }
        if (collection instanceof java.util.List) {
            return java.util.Collections.unmodifiableList((java.util.List) collection);
        }
        return java.util.Collections.unmodifiableCollection(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> java.util.Collection<java.util.Map.Entry<K, V>> unmodifiableEntries(java.util.Collection<java.util.Map.Entry<K, V>> collection) {
        if (collection instanceof java.util.Set) {
            return com.google.common.collect.Maps.unmodifiableEntrySet((java.util.Set) collection);
        }
        return new com.google.common.collect.Maps.UnmodifiableEntries(java.util.Collections.unmodifiableCollection(collection));
    }

    public static <K, V> java.util.Map<K, java.util.List<V>> asMap(com.google.common.collect.ListMultimap<K, V> listMultimap) {
        return listMultimap.asMap();
    }

    public static <K, V> java.util.Map<K, java.util.Set<V>> asMap(com.google.common.collect.SetMultimap<K, V> setMultimap) {
        return setMultimap.asMap();
    }

    public static <K, V> java.util.Map<K, java.util.SortedSet<V>> asMap(com.google.common.collect.SortedSetMultimap<K, V> sortedSetMultimap) {
        return sortedSetMultimap.asMap();
    }

    public static <K, V> java.util.Map<K, java.util.Collection<V>> asMap(com.google.common.collect.Multimap<K, V> multimap) {
        return multimap.asMap();
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> forMap(java.util.Map<K, V> map) {
        return new com.google.common.collect.Multimaps.MapMultimap(map);
    }

    static final class MapMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        final java.util.Map<K, V> map;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
            return get((com.google.common.collect.Multimaps.MapMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
            return replaceValues((com.google.common.collect.Multimaps.MapMultimap<K, V>) obj, iterable);
        }

        MapMultimap(java.util.Map<K, V> map) {
            this.map = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
        }

        @Override // com.google.common.collect.Multimap
        public final int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.Multimap
        public final boolean containsKey(java.lang.Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean containsValue(java.lang.Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean containsEntry(java.lang.Object obj, java.lang.Object obj2) {
            return this.map.entrySet().contains(com.google.common.collect.Maps.immutableEntry(obj, obj2));
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.Set<V> get(final K k) {
            return new com.google.common.collect.Sets.ImprovedAbstractSet<V>(this) { // from class: com.google.common.collect.Multimaps.MapMultimap.1
                final /* synthetic */ com.google.common.collect.Multimaps.MapMultimap this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public java.util.Iterator<V> iterator() {
                    final java.lang.Object obj = k;
                    return new java.util.Iterator<V>(this) { // from class: com.google.common.collect.Multimaps.MapMultimap.1.1
                        int i;
                        final /* synthetic */ com.google.common.collect.Multimaps.MapMultimap.AnonymousClass1 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            return this.i == 0 && this.this$1.this$0.map.containsKey(obj);
                        }

                        @Override // java.util.Iterator
                        public V next() {
                            if (!hasNext()) {
                                throw new java.util.NoSuchElementException();
                            }
                            this.i++;
                            return (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.this$1.this$0.map.get(obj));
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            com.google.common.collect.CollectPreconditions.checkRemove(this.i == 1);
                            this.i = -1;
                            this.this$1.this$0.map.remove(obj);
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return this.this$0.map.containsKey(k) ? 1 : 0;
                }
            };
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean put(K k, V v) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean putAll(K k, java.lang.Iterable<? extends V> iterable) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.Set<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
            return this.map.entrySet().remove(com.google.common.collect.Maps.immutableEntry(obj, obj2));
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.Set<V> removeAll(java.lang.Object obj) {
            java.util.HashSet hashSet = new java.util.HashSet(2);
            if (!this.map.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.map.remove(obj));
            return hashSet;
        }

        @Override // com.google.common.collect.Multimap
        public final void clear() {
            this.map.clear();
        }

        @Override // com.google.common.collect.AbstractMultimap
        final java.util.Set<K> createKeySet() {
            return this.map.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        final java.util.Collection<V> createValues() {
            return this.map.values();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final java.util.Set<java.util.Map.Entry<K, V>> entries() {
            return this.map.entrySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        final java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
            throw new java.lang.AssertionError("unreachable");
        }

        @Override // com.google.common.collect.AbstractMultimap
        final com.google.common.collect.Multiset<K> createKeys() {
            return new com.google.common.collect.Multimaps.Keys(this);
        }

        @Override // com.google.common.collect.AbstractMultimap
        final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return this.map.entrySet().iterator();
        }

        @Override // com.google.common.collect.AbstractMultimap
        final java.util.Map<K, java.util.Collection<V>> createAsMap() {
            return new com.google.common.collect.Multimaps.AsMap(this);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final int hashCode() {
            return this.map.hashCode();
        }
    }

    public static <K, V1, V2> com.google.common.collect.Multimap<K, V2> transformValues(com.google.common.collect.Multimap<K, V1> multimap, final com.google.common.base.Function<? super V1, V2> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return transformEntries(multimap, new com.google.common.collect.Maps.EntryTransformer() { // from class: com.google.common.collect.Multimaps$$ExternalSyntheticLambda1
            @Override // com.google.common.collect.Maps.EntryTransformer
            public final java.lang.Object transformEntry(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object apply;
                apply = com.google.common.base.Function.this.apply(obj2);
                return apply;
            }
        });
    }

    public static <K, V1, V2> com.google.common.collect.ListMultimap<K, V2> transformValues(com.google.common.collect.ListMultimap<K, V1> listMultimap, final com.google.common.base.Function<? super V1, V2> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return transformEntries((com.google.common.collect.ListMultimap) listMultimap, new com.google.common.collect.Maps.EntryTransformer() { // from class: com.google.common.collect.Multimaps$$ExternalSyntheticLambda0
            @Override // com.google.common.collect.Maps.EntryTransformer
            public final java.lang.Object transformEntry(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object apply;
                apply = com.google.common.base.Function.this.apply(obj2);
                return apply;
            }
        });
    }

    public static <K, V1, V2> com.google.common.collect.Multimap<K, V2> transformEntries(com.google.common.collect.Multimap<K, V1> multimap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new com.google.common.collect.Multimaps.TransformedEntriesMultimap(multimap, entryTransformer);
    }

    public static <K, V1, V2> com.google.common.collect.ListMultimap<K, V2> transformEntries(com.google.common.collect.ListMultimap<K, V1> listMultimap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new com.google.common.collect.Multimaps.TransformedEntriesListMultimap(listMultimap, entryTransformer);
    }

    static class TransformedEntriesMultimap<K, V1, V2> extends com.google.common.collect.AbstractMultimap<K, V2> {
        final com.google.common.collect.Multimap<K, V1> fromMultimap;
        final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer;

        TransformedEntriesMultimap(com.google.common.collect.Multimap<K, V1> multimap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            this.fromMultimap = (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(multimap);
            this.transformer = (com.google.common.collect.Maps.EntryTransformer) com.google.common.base.Preconditions.checkNotNull(entryTransformer);
        }

        /* renamed from: lambda$transform$0$com-google-common-collect-Multimaps$TransformedEntriesMultimap, reason: not valid java name */
        /* synthetic */ java.lang.Object m10316xcb195782(java.lang.Object obj, java.lang.Object obj2) {
            return this.transformer.transformEntry(obj, obj2);
        }

        java.util.Collection<V2> transform(final K k, java.util.Collection<V1> collection) {
            com.google.common.base.Function function = new com.google.common.base.Function() { // from class: com.google.common.collect.Multimaps$TransformedEntriesMultimap$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.collect.Multimaps.TransformedEntriesMultimap.this.m10316xcb195782(k, obj);
                }
            };
            if (collection instanceof java.util.List) {
                return com.google.common.collect.Lists.transform((java.util.List) collection, function);
            }
            return com.google.common.collect.Collections2.transform(collection, function);
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Map<K, java.util.Collection<V2>> createAsMap() {
            return com.google.common.collect.Maps.transformEntries(this.fromMultimap.asMap(), new com.google.common.collect.Maps.EntryTransformer() { // from class: com.google.common.collect.Multimaps$TransformedEntriesMultimap$$ExternalSyntheticLambda1
                @Override // com.google.common.collect.Maps.EntryTransformer
                public final java.lang.Object transformEntry(java.lang.Object obj, java.lang.Object obj2) {
                    return com.google.common.collect.Multimaps.TransformedEntriesMultimap.this.transform(obj, (java.util.Collection) obj2);
                }
            });
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            this.fromMultimap.clear();
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(java.lang.Object obj) {
            return this.fromMultimap.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Collection<java.util.Map.Entry<K, V2>> createEntries() {
            return new com.google.common.collect.AbstractMultimap.Entries();
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Iterator<java.util.Map.Entry<K, V2>> entryIterator() {
            return com.google.common.collect.Iterators.transform(this.fromMultimap.entries().iterator(), com.google.common.collect.Maps.asEntryToEntryFunction(this.transformer));
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V2> get(K k) {
            return transform(k, this.fromMultimap.get(k));
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean isEmpty() {
            return this.fromMultimap.isEmpty();
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Set<K> createKeySet() {
            return this.fromMultimap.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        com.google.common.collect.Multiset<K> createKeys() {
            return this.fromMultimap.keys();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(K k, V2 v2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(K k, java.lang.Iterable<? extends V2> iterable) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V2> multimap) {
            throw new java.lang.UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
            return get(obj).remove(obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V2> removeAll(java.lang.Object obj) {
            return transform(obj, this.fromMultimap.removeAll(obj));
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V2> replaceValues(K k, java.lang.Iterable<? extends V2> iterable) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            return this.fromMultimap.size();
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Collection<V2> createValues() {
            return com.google.common.collect.Collections2.transform(this.fromMultimap.entries(), new com.google.common.base.Function() { // from class: com.google.common.collect.Multimaps$TransformedEntriesMultimap$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.collect.Multimaps.TransformedEntriesMultimap.this.m10315x70e968d6((java.util.Map.Entry) obj);
                }
            });
        }

        /* renamed from: lambda$createValues$0$com-google-common-collect-Multimaps$TransformedEntriesMultimap, reason: not valid java name */
        /* synthetic */ java.lang.Object m10315x70e968d6(java.util.Map.Entry entry) {
            return this.transformer.transformEntry((java.lang.Object) entry.getKey(), (java.lang.Object) entry.getValue());
        }
    }

    static final class TransformedEntriesListMultimap<K, V1, V2> extends com.google.common.collect.Multimaps.TransformedEntriesMultimap<K, V1, V2> implements com.google.common.collect.ListMultimap<K, V2> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
            return get((com.google.common.collect.Multimaps.TransformedEntriesListMultimap<K, V1, V2>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
            return replaceValues((com.google.common.collect.Multimaps.TransformedEntriesListMultimap<K, V1, V2>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        final /* bridge */ /* synthetic */ java.util.Collection transform(java.lang.Object obj, java.util.Collection collection) {
            return transform((com.google.common.collect.Multimaps.TransformedEntriesListMultimap<K, V1, V2>) obj, collection);
        }

        TransformedEntriesListMultimap(com.google.common.collect.ListMultimap<K, V1> listMultimap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(listMultimap, entryTransformer);
        }

        /* renamed from: lambda$transform$0$com-google-common-collect-Multimaps$TransformedEntriesListMultimap, reason: not valid java name */
        final /* synthetic */ java.lang.Object m10314x7115d6c0(java.lang.Object obj, java.lang.Object obj2) {
            return this.transformer.transformEntry(obj, obj2);
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        final java.util.List<V2> transform(final K k, java.util.Collection<V1> collection) {
            return com.google.common.collect.Lists.transform((java.util.List) collection, new com.google.common.base.Function() { // from class: com.google.common.collect.Multimaps$TransformedEntriesListMultimap$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.collect.Multimaps.TransformedEntriesListMultimap.this.m10314x7115d6c0(k, obj);
                }
            });
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.List<V2> get(K k) {
            return transform((com.google.common.collect.Multimaps.TransformedEntriesListMultimap<K, V1, V2>) k, (java.util.Collection) this.fromMultimap.get(k));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.List<V2> removeAll(java.lang.Object obj) {
            return transform((com.google.common.collect.Multimaps.TransformedEntriesListMultimap<K, V1, V2>) obj, (java.util.Collection) this.fromMultimap.removeAll(obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.List<V2> replaceValues(K k, java.lang.Iterable<? extends V2> iterable) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.lang.Iterable<V> iterable, com.google.common.base.Function<? super V, K> function) {
        return index(iterable.iterator(), function);
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.util.Iterator<V> it, com.google.common.base.Function<? super V, K> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        com.google.common.collect.ImmutableListMultimap.Builder builder = com.google.common.collect.ImmutableListMultimap.builder();
        while (it.hasNext()) {
            V next = it.next();
            com.google.common.base.Preconditions.checkNotNull(next, it);
            builder.put((com.google.common.collect.ImmutableListMultimap.Builder) function.apply(next), (K) next);
        }
        return builder.build();
    }

    static class Keys<K, V> extends com.google.common.collect.AbstractMultiset<K> {
        final com.google.common.collect.Multimap<K, V> multimap;

        Keys(com.google.common.collect.Multimap<K, V> multimap) {
            this.multimap = multimap;
        }

        @Override // com.google.common.collect.AbstractMultiset
        java.util.Iterator<com.google.common.collect.Multiset.Entry<K>> entryIterator() {
            return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<K, java.util.Collection<V>>, com.google.common.collect.Multiset.Entry<K>>(this.multimap.asMap().entrySet().iterator()) { // from class: com.google.common.collect.Multimaps.Keys.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                public com.google.common.collect.Multiset.Entry<K> transform(final java.util.Map.Entry<K, java.util.Collection<V>> entry) {
                    return new com.google.common.collect.Multisets.AbstractEntry<K>(this) { // from class: com.google.common.collect.Multimaps.Keys.1.1
                        final /* synthetic */ com.google.common.collect.Multimaps.Keys.AnonymousClass1 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public K getElement() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public int getCount() {
                            return ((java.util.Collection) entry.getValue()).size();
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.AbstractMultiset
        int distinctElements() {
            return this.multimap.asMap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(java.lang.Object obj) {
            return this.multimap.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public java.util.Iterator<K> iterator() {
            return com.google.common.collect.Maps.keyIterator(this.multimap.entries().iterator());
        }

        @Override // com.google.common.collect.Multiset
        public int count(java.lang.Object obj) {
            java.util.Collection collection = (java.util.Collection) com.google.common.collect.Maps.safeGet(this.multimap.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(java.lang.Object obj, int i) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            java.util.Collection collection = (java.util.Collection) com.google.common.collect.Maps.safeGet(this.multimap.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
                return size;
            }
            java.util.Iterator it = collection.iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.multimap.clear();
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public java.util.Set<K> elementSet() {
            return this.multimap.keySet();
        }

        @Override // com.google.common.collect.AbstractMultiset
        java.util.Iterator<K> elementIterator() {
            throw new java.lang.AssertionError("should never be called");
        }
    }

    static abstract class Entries<K, V> extends java.util.AbstractCollection<java.util.Map.Entry<K, V>> {
        abstract com.google.common.collect.Multimap<K, V> multimap();

        Entries() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return multimap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return multimap().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return multimap().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            multimap().clear();
        }
    }

    static final class AsMap<K, V> extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, java.util.Collection<V>> {
        private final com.google.common.collect.Multimap<K, V> multimap;

        AsMap(com.google.common.collect.Multimap<K, V> multimap) {
            this.multimap = (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(multimap);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.multimap.keySet().size();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected final java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> createEntrySet() {
            return new com.google.common.collect.Multimaps.AsMap.EntrySet();
        }

        final void removeValuesForKey(java.lang.Object obj) {
            this.multimap.keySet().remove(obj);
        }

        final class EntrySet extends com.google.common.collect.Maps.EntrySet<K, java.util.Collection<V>> {
            EntrySet() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            final java.util.Map<K, java.util.Collection<V>> map() {
                return com.google.common.collect.Multimaps.AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                java.util.Set<K> keySet = com.google.common.collect.Multimaps.AsMap.this.multimap.keySet();
                final com.google.common.collect.Multimap multimap = com.google.common.collect.Multimaps.AsMap.this.multimap;
                java.util.Objects.requireNonNull(multimap);
                return com.google.common.collect.Maps.asMapEntryIterator(keySet, new com.google.common.base.Function() { // from class: com.google.common.collect.Multimaps$AsMap$EntrySet$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.common.collect.Multimap.this.get(obj);
                    }
                });
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(java.lang.Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                com.google.common.collect.Multimaps.AsMap.this.removeValuesForKey(((java.util.Map.Entry) java.util.Objects.requireNonNull((java.util.Map.Entry) obj)).getKey());
                return true;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final java.util.Collection<V> get(java.lang.Object obj) {
            if (containsKey(obj)) {
                return this.multimap.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final java.util.Collection<V> remove(java.lang.Object obj) {
            if (containsKey(obj)) {
                return this.multimap.removeAll(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final java.util.Set<K> keySet() {
            return this.multimap.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return this.multimap.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return this.multimap.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.multimap.clear();
        }
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> filterKeys(com.google.common.collect.Multimap<K, V> multimap, com.google.common.base.Predicate<? super K> predicate) {
        if (multimap instanceof com.google.common.collect.SetMultimap) {
            return filterKeys((com.google.common.collect.SetMultimap) multimap, (com.google.common.base.Predicate) predicate);
        }
        if (multimap instanceof com.google.common.collect.ListMultimap) {
            return filterKeys((com.google.common.collect.ListMultimap) multimap, (com.google.common.base.Predicate) predicate);
        }
        if (multimap instanceof com.google.common.collect.FilteredKeyMultimap) {
            com.google.common.collect.FilteredKeyMultimap filteredKeyMultimap = (com.google.common.collect.FilteredKeyMultimap) multimap;
            return new com.google.common.collect.FilteredKeyMultimap(filteredKeyMultimap.unfiltered, com.google.common.base.Predicates.and(filteredKeyMultimap.keyPredicate, predicate));
        }
        if (multimap instanceof com.google.common.collect.FilteredMultimap) {
            return filterFiltered((com.google.common.collect.FilteredMultimap) multimap, com.google.common.collect.Maps.keyPredicateOnEntries(predicate));
        }
        return new com.google.common.collect.FilteredKeyMultimap(multimap, predicate);
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> filterKeys(com.google.common.collect.SetMultimap<K, V> setMultimap, com.google.common.base.Predicate<? super K> predicate) {
        if (setMultimap instanceof com.google.common.collect.FilteredKeySetMultimap) {
            com.google.common.collect.FilteredKeySetMultimap filteredKeySetMultimap = (com.google.common.collect.FilteredKeySetMultimap) setMultimap;
            return new com.google.common.collect.FilteredKeySetMultimap(filteredKeySetMultimap.unfiltered(), com.google.common.base.Predicates.and(filteredKeySetMultimap.keyPredicate, predicate));
        }
        if (setMultimap instanceof com.google.common.collect.FilteredSetMultimap) {
            return filterFiltered((com.google.common.collect.FilteredSetMultimap) setMultimap, com.google.common.collect.Maps.keyPredicateOnEntries(predicate));
        }
        return new com.google.common.collect.FilteredKeySetMultimap(setMultimap, predicate);
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> filterKeys(com.google.common.collect.ListMultimap<K, V> listMultimap, com.google.common.base.Predicate<? super K> predicate) {
        if (listMultimap instanceof com.google.common.collect.FilteredKeyListMultimap) {
            com.google.common.collect.FilteredKeyListMultimap filteredKeyListMultimap = (com.google.common.collect.FilteredKeyListMultimap) listMultimap;
            return new com.google.common.collect.FilteredKeyListMultimap(filteredKeyListMultimap.unfiltered(), com.google.common.base.Predicates.and(filteredKeyListMultimap.keyPredicate, predicate));
        }
        return new com.google.common.collect.FilteredKeyListMultimap(listMultimap, predicate);
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> filterValues(com.google.common.collect.Multimap<K, V> multimap, com.google.common.base.Predicate<? super V> predicate) {
        return filterEntries(multimap, com.google.common.collect.Maps.valuePredicateOnEntries(predicate));
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> filterValues(com.google.common.collect.SetMultimap<K, V> setMultimap, com.google.common.base.Predicate<? super V> predicate) {
        return filterEntries((com.google.common.collect.SetMultimap) setMultimap, com.google.common.collect.Maps.valuePredicateOnEntries(predicate));
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> filterEntries(com.google.common.collect.Multimap<K, V> multimap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        if (multimap instanceof com.google.common.collect.SetMultimap) {
            return filterEntries((com.google.common.collect.SetMultimap) multimap, (com.google.common.base.Predicate) predicate);
        }
        if (multimap instanceof com.google.common.collect.FilteredMultimap) {
            return filterFiltered((com.google.common.collect.FilteredMultimap) multimap, predicate);
        }
        return new com.google.common.collect.FilteredEntryMultimap((com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(multimap), predicate);
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> filterEntries(com.google.common.collect.SetMultimap<K, V> setMultimap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        if (setMultimap instanceof com.google.common.collect.FilteredSetMultimap) {
            return filterFiltered((com.google.common.collect.FilteredSetMultimap) setMultimap, (com.google.common.base.Predicate) predicate);
        }
        return new com.google.common.collect.FilteredEntrySetMultimap((com.google.common.collect.SetMultimap) com.google.common.base.Preconditions.checkNotNull(setMultimap), predicate);
    }

    private static <K, V> com.google.common.collect.Multimap<K, V> filterFiltered(com.google.common.collect.FilteredMultimap<K, V> filteredMultimap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        return new com.google.common.collect.FilteredEntryMultimap(filteredMultimap.unfiltered(), com.google.common.base.Predicates.and(filteredMultimap.entryPredicate(), predicate));
    }

    private static <K, V> com.google.common.collect.SetMultimap<K, V> filterFiltered(com.google.common.collect.FilteredSetMultimap<K, V> filteredSetMultimap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        return new com.google.common.collect.FilteredEntrySetMultimap(filteredSetMultimap.unfiltered(), com.google.common.base.Predicates.and(filteredSetMultimap.entryPredicate(), predicate));
    }

    static boolean equalsImpl(com.google.common.collect.Multimap<?, ?> multimap, java.lang.Object obj) {
        if (obj == multimap) {
            return true;
        }
        if (obj instanceof com.google.common.collect.Multimap) {
            return multimap.asMap().equals(((com.google.common.collect.Multimap) obj).asMap());
        }
        return false;
    }
}
