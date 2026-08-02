package com.google.common.collect;

/* loaded from: classes9.dex */
public class ImmutableSetMultimap<K, V> extends com.google.common.collect.ImmutableMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    private final transient com.google.common.collect.ImmutableSet<V> emptySet;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entries;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSetMultimap<V, K> inverse;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection get(java.lang.Object obj) {
        return get((com.google.common.collect.ImmutableSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
        return get((com.google.common.collect.ImmutableSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Set get(java.lang.Object obj) {
        return get((com.google.common.collect.ImmutableSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.ImmutableSetMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.ImmutableSetMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Set replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.ImmutableSetMultimap<K, V>) obj, iterable);
    }

    public static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSetMultimap<K, V>> toImmutableSetMultimap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2) {
        return com.google.common.collect.CollectCollectors.toImmutableSetMultimap(function, function2);
    }

    public static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> function2) {
        return com.google.common.collect.CollectCollectors.flatteningToImmutableSetMultimap(function, function2);
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of() {
        return com.google.common.collect.EmptyImmutableSetMultimap.INSTANCE;
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K k, V v) {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k, (K) v);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K k, V v, K k2, V v2) {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k, (K) v);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k2, (K) v2);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k, (K) v);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k2, (K) v2);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k3, (K) v3);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k, (K) v);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k2, (K) v2);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k3, (K) v3);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k4, (K) v4);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k, (K) v);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k2, (K) v2);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k3, (K) v3);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k4, (K) v4);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k5, (K) v5);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableSetMultimap.Builder<>();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap.Builder<K, V> builderWithExpectedKeys(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new com.google.common.collect.ImmutableSetMultimap.Builder<>(i);
    }

    public static final class Builder<K, V> extends com.google.common.collect.ImmutableMultimap.Builder<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.lang.Object obj, java.lang.Object obj2) {
            return put((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) obj, obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object obj, java.lang.Iterable iterable) {
            return putAll((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object obj, java.lang.Object[] objArr) {
            return putAll((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) obj, objArr);
        }

        public Builder() {
        }

        Builder(int i) {
            super(i);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        final com.google.common.collect.ImmutableCollection.Builder<V> newValueCollectionBuilderWithExpectedSize(int i) {
            if (this.valueComparator == null) {
                return com.google.common.collect.ImmutableSet.builderWithExpectedSize(i);
            }
            return new com.google.common.collect.ImmutableSortedSet.Builder(this.valueComparator, i);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        final int expectedValueCollectionSize(int i, java.lang.Iterable<?> iterable) {
            return iterable instanceof java.util.Set ? java.lang.Math.max(i, ((java.util.Set) iterable).size()) : i;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap.Builder<K, V> expectedValuesPerKey(int i) {
            super.expectedValuesPerKey(i);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap.Builder<K, V> put(K k, V v) {
            super.put((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) k, (K) v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            super.put((java.util.Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((java.lang.Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(K k, java.lang.Iterable<? extends V> iterable) {
            super.putAll((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) k, (java.lang.Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(K k, V... vArr) {
            return putAll((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) k, (java.lang.Iterable) java.util.Arrays.asList(vArr));
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            for (java.util.Map.Entry<? extends K, java.util.Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                putAll((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) entry.getKey(), (java.lang.Iterable) entry.getValue());
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap.Builder<K, V> combine(com.google.common.collect.ImmutableMultimap.Builder<K, V> builder) {
            super.combine((com.google.common.collect.ImmutableMultimap.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> comparator) {
            super.orderKeysBy((java.util.Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> comparator) {
            super.orderValuesBy((java.util.Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableSetMultimap<K, V> build() {
            if (this.builderMap == null) {
                return com.google.common.collect.ImmutableSetMultimap.of();
            }
            java.util.Collection entrySet = this.builderMap.entrySet();
            if (this.keyComparator != null) {
                entrySet = com.google.common.collect.Ordering.from(this.keyComparator).onKeys().immutableSortedCopy(entrySet);
            }
            return com.google.common.collect.ImmutableSetMultimap.fromMapBuilderEntries(entrySet, this.valueComparator);
        }
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        return copyOf(multimap, null);
    }

    private static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> multimap, java.util.Comparator<? super V> comparator) {
        com.google.common.base.Preconditions.checkNotNull(multimap);
        if (multimap.isEmpty() && comparator == null) {
            return of();
        }
        if (multimap instanceof com.google.common.collect.ImmutableSetMultimap) {
            com.google.common.collect.ImmutableSetMultimap<K, V> immutableSetMultimap = (com.google.common.collect.ImmutableSetMultimap) multimap;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), comparator);
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
        return new com.google.common.collect.ImmutableSetMultimap.Builder().putAll((java.lang.Iterable) iterable).build();
    }

    static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>>> collection, java.util.Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(collection.size());
        int i = 0;
        for (java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            com.google.common.collect.ImmutableSet valueSet = valueSet(comparator, entry.getValue());
            if (!valueSet.isEmpty()) {
                builder.put(key, valueSet);
                i += valueSet.size();
            }
        }
        return new com.google.common.collect.ImmutableSetMultimap<>(builder.buildOrThrow(), i, comparator);
    }

    static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> fromMapBuilderEntries(java.util.Collection<? extends java.util.Map.Entry<K, com.google.common.collect.ImmutableCollection.Builder<V>>> collection, java.util.Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(collection.size());
        int i = 0;
        for (java.util.Map.Entry<K, com.google.common.collect.ImmutableCollection.Builder<V>> entry : collection) {
            K key = entry.getKey();
            com.google.common.collect.ImmutableSet valueSet = valueSet(comparator, ((com.google.common.collect.ImmutableSet.Builder) entry.getValue()).build());
            if (!valueSet.isEmpty()) {
                builder.put(key, valueSet);
                i += valueSet.size();
            }
        }
        return new com.google.common.collect.ImmutableSetMultimap<>(builder.buildOrThrow(), i, comparator);
    }

    ImmutableSetMultimap(com.google.common.collect.ImmutableMap<K, com.google.common.collect.ImmutableSet<V>> immutableMap, int i, java.util.Comparator<? super V> comparator) {
        super(immutableMap, i);
        this.emptySet = emptySet(comparator);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public com.google.common.collect.ImmutableSet<V> get(K k) {
        return (com.google.common.collect.ImmutableSet) com.google.common.base.MoreObjects.firstNonNull((com.google.common.collect.ImmutableSet) this.map.get(k), this.emptySet);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public com.google.common.collect.ImmutableSetMultimap<V, K> inverse() {
        com.google.common.collect.ImmutableSetMultimap<V, K> immutableSetMultimap = this.inverse;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        com.google.common.collect.ImmutableSetMultimap<V, K> invert = invert();
        this.inverse = invert;
        return invert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.google.common.collect.ImmutableSetMultimap<V, K> invert() {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        java.util.Iterator it = entries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) entry.getValue(), entry.getKey());
        }
        com.google.common.collect.ImmutableSetMultimap<V, K> build = builder.build();
        build.inverse = this;
        return build;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableSet<V> removeAll(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableSet<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entries() {
        com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> immutableSet = this.entries;
        if (immutableSet != null) {
            return immutableSet;
        }
        com.google.common.collect.ImmutableSetMultimap.EntrySet entrySet = new com.google.common.collect.ImmutableSetMultimap.EntrySet(this);
        this.entries = entrySet;
        return entrySet;
    }

    static final class EntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {
        private final transient com.google.common.collect.ImmutableSetMultimap<K, V> multimap;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return iterator();
        }

        EntrySet(com.google.common.collect.ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.multimap = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    private static <V> com.google.common.collect.ImmutableSet<V> valueSet(java.util.Comparator<? super V> comparator, java.util.Collection<? extends V> collection) {
        if (comparator == null) {
            return com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) collection);
        }
        return com.google.common.collect.ImmutableSortedSet.copyOf((java.util.Comparator) comparator, (java.util.Collection) collection);
    }

    private static <V> com.google.common.collect.ImmutableSet<V> emptySet(java.util.Comparator<? super V> comparator) {
        if (comparator == null) {
            return com.google.common.collect.ImmutableSet.of();
        }
        return com.google.common.collect.ImmutableSortedSet.emptySet(comparator);
    }

    private static <V> com.google.common.collect.ImmutableSet.Builder<V> valuesBuilder(java.util.Comparator<? super V> comparator) {
        if (comparator == null) {
            return new com.google.common.collect.ImmutableSet.Builder<>();
        }
        return new com.google.common.collect.ImmutableSortedSet.Builder(comparator);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        com.google.common.collect.Serialization.writeMultimap(this, objectOutputStream);
    }

    java.util.Comparator<? super V> valueComparator() {
        com.google.common.collect.ImmutableSet<V> immutableSet = this.emptySet;
        if (immutableSet instanceof com.google.common.collect.ImmutableSortedSet) {
            return ((com.google.common.collect.ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    static final class SetFieldSettersHolder {
        static final com.google.common.collect.Serialization.FieldSetter<? super com.google.common.collect.ImmutableSetMultimap<?, ?>> EMPTY_SET_FIELD_SETTER = com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.ImmutableSetMultimap.class, "emptySet");

        private SetFieldSettersHolder() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        java.util.Comparator comparator = (java.util.Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new java.io.InvalidObjectException("Invalid key count ".concat(java.lang.String.valueOf(readInt)));
        }
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            java.lang.Object requireNonNull = java.util.Objects.requireNonNull(objectInputStream.readObject());
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new java.io.InvalidObjectException("Invalid value count ".concat(java.lang.String.valueOf(readInt2)));
            }
            com.google.common.collect.ImmutableSet.Builder valuesBuilder = valuesBuilder(comparator);
            for (int i3 = 0; i3 < readInt2; i3++) {
                valuesBuilder.add((com.google.common.collect.ImmutableSet.Builder) java.util.Objects.requireNonNull(objectInputStream.readObject()));
            }
            com.google.common.collect.ImmutableSet build = valuesBuilder.build();
            if (build.size() != readInt2) {
                throw new java.io.InvalidObjectException("Duplicate key-value pairs exist for key ".concat(java.lang.String.valueOf(requireNonNull)));
            }
            builder.put(requireNonNull, build);
            i += readInt2;
        }
        try {
            com.google.common.collect.ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set((com.google.common.collect.Serialization.FieldSetter<? super com.google.common.collect.ImmutableMultimap<?, ?>>) this, (java.lang.Object) builder.buildOrThrow());
            com.google.common.collect.ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set((com.google.common.collect.Serialization.FieldSetter<? super com.google.common.collect.ImmutableMultimap<?, ?>>) this, i);
            com.google.common.collect.ImmutableSetMultimap.SetFieldSettersHolder.EMPTY_SET_FIELD_SETTER.set((com.google.common.collect.Serialization.FieldSetter<? super com.google.common.collect.ImmutableSetMultimap<?, ?>>) this, (java.lang.Object) emptySet(comparator));
        } catch (java.lang.IllegalArgumentException e) {
            throw ((java.io.InvalidObjectException) new java.io.InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
