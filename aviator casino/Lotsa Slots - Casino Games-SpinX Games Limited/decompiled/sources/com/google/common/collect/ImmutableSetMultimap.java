package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public class ImmutableSetMultimap<K, V> extends com.google.common.collect.ImmutableMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    private final transient com.google.common.collect.ImmutableSet<V> emptySet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entries;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSetMultimap<V, K> inverse;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection get(java.lang.Object key) {
        return get((com.google.common.collect.ImmutableSetMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object key) {
        return get((com.google.common.collect.ImmutableSetMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set get(java.lang.Object key) {
        return get((com.google.common.collect.ImmutableSetMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection replaceValues(java.lang.Object key, java.lang.Iterable values) {
        return replaceValues((com.google.common.collect.ImmutableSetMultimap<K, V>) key, values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object key, java.lang.Iterable values) {
        return replaceValues((com.google.common.collect.ImmutableSetMultimap<K, V>) key, values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Set replaceValues(java.lang.Object key, java.lang.Iterable values) {
        return replaceValues((com.google.common.collect.ImmutableSetMultimap<K, V>) key, values);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSetMultimap<K, V>> toImmutableSetMultimap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableSetMultimap(keyFunction, valueFunction);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> valuesFunction) {
        return com.google.common.collect.CollectCollectors.flatteningToImmutableSetMultimap(keyFunction, valuesFunction);
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of() {
        return com.google.common.collect.EmptyImmutableSetMultimap.INSTANCE;
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K k1, V v1) {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k1, (K) v1);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K k1, V v1, K k2, V v2) {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k1, (K) v1);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k2, (K) v2);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k1, (K) v1);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k2, (K) v2);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k3, (K) v3);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k1, (K) v1);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k2, (K) v2);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k3, (K) v3);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k4, (K) v4);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        com.google.common.collect.ImmutableSetMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k1, (K) v1);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k2, (K) v2);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k3, (K) v3);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k4, (K) v4);
        builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) k5, (K) v5);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableSetMultimap.Builder<>();
    }

    public static final class Builder<K, V> extends com.google.common.collect.ImmutableMultimap.Builder<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.lang.Object key, java.lang.Object value) {
            return put((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) key, value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object key, java.lang.Iterable values) {
            return putAll((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) key, values);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object key, java.lang.Object[] values) {
            return putAll((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) key, values);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        java.util.Collection<V> newMutableValueCollection() {
            return com.google.common.collect.Platform.preservesInsertionOrderOnAddsSet();
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> put(K key, V value) {
            super.put((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) key, (K) value);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            super.put((java.util.Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
            super.putAll((java.lang.Iterable) entries);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(K key, java.lang.Iterable<? extends V> values) {
            super.putAll((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) key, (java.lang.Iterable) values);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(K key, V... values) {
            return putAll((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) key, (java.lang.Iterable) java.util.Arrays.asList(values));
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            for (java.util.Map.Entry<? extends K, java.util.Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                putAll((com.google.common.collect.ImmutableSetMultimap.Builder<K, V>) entry.getKey(), (java.lang.Iterable) entry.getValue());
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> combine(com.google.common.collect.ImmutableMultimap.Builder<K, V> other) {
            super.combine((com.google.common.collect.ImmutableMultimap.Builder) other);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> keyComparator) {
            super.orderKeysBy((java.util.Comparator) keyComparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> valueComparator) {
            super.orderValuesBy((java.util.Comparator) valueComparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap<K, V> build() {
            java.util.Collection entrySet = this.builderMap.entrySet();
            if (this.keyComparator != null) {
                entrySet = com.google.common.collect.Ordering.from(this.keyComparator).onKeys().immutableSortedCopy(entrySet);
            }
            return com.google.common.collect.ImmutableSetMultimap.fromMapEntries(entrySet, this.valueComparator);
        }
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        return copyOf(multimap, null);
    }

    private static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> multimap, @javax.annotation.CheckForNull java.util.Comparator<? super V> valueComparator) {
        com.google.common.base.Preconditions.checkNotNull(multimap);
        if (multimap.isEmpty() && valueComparator == null) {
            return of();
        }
        if (multimap instanceof com.google.common.collect.ImmutableSetMultimap) {
            com.google.common.collect.ImmutableSetMultimap<K, V> immutableSetMultimap = (com.google.common.collect.ImmutableSetMultimap) multimap;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), valueComparator);
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
        return new com.google.common.collect.ImmutableSetMultimap.Builder().putAll((java.lang.Iterable) entries).build();
    }

    static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>>> mapEntries, @javax.annotation.CheckForNull java.util.Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return of();
        }
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(mapEntries.size());
        int i = 0;
        for (java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>> entry : mapEntries) {
            K key = entry.getKey();
            com.google.common.collect.ImmutableSet valueSet = valueSet(valueComparator, entry.getValue());
            if (!valueSet.isEmpty()) {
                builder.put(key, valueSet);
                i += valueSet.size();
            }
        }
        return new com.google.common.collect.ImmutableSetMultimap<>(builder.buildOrThrow(), i, valueComparator);
    }

    ImmutableSetMultimap(com.google.common.collect.ImmutableMap<K, com.google.common.collect.ImmutableSet<V>> map, int size, @javax.annotation.CheckForNull java.util.Comparator<? super V> valueComparator) {
        super(map, size);
        this.emptySet = emptySet(valueComparator);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableSet<V> get(K key) {
        return (com.google.common.collect.ImmutableSet) com.google.common.base.MoreObjects.firstNonNull((com.google.common.collect.ImmutableSet) this.map.get(key), this.emptySet);
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
        com.google.common.collect.UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            builder.put((com.google.common.collect.ImmutableSetMultimap.Builder) entry.getValue(), entry.getKey());
        }
        com.google.common.collect.ImmutableSetMultimap<V, K> build = builder.build();
        build.inverse = this;
        return build;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableSet<V> replaceValues(K key, java.lang.Iterable<? extends V> values) {
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

    private static final class EntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {
        private final transient com.google.common.collect.ImmutableSetMultimap<K, V> multimap;

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return false;
        }

        EntrySet(com.google.common.collect.ImmutableSetMultimap<K, V> multimap) {
            this.multimap = multimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) object;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    private static <V> com.google.common.collect.ImmutableSet<V> valueSet(@javax.annotation.CheckForNull java.util.Comparator<? super V> valueComparator, java.util.Collection<? extends V> values) {
        if (valueComparator == null) {
            return com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) values);
        }
        return com.google.common.collect.ImmutableSortedSet.copyOf((java.util.Comparator) valueComparator, (java.util.Collection) values);
    }

    private static <V> com.google.common.collect.ImmutableSet<V> emptySet(@javax.annotation.CheckForNull java.util.Comparator<? super V> valueComparator) {
        if (valueComparator == null) {
            return com.google.common.collect.ImmutableSet.of();
        }
        return com.google.common.collect.ImmutableSortedSet.emptySet(valueComparator);
    }

    private static <V> com.google.common.collect.ImmutableSet.Builder<V> valuesBuilder(@javax.annotation.CheckForNull java.util.Comparator<? super V> valueComparator) {
        if (valueComparator == null) {
            return new com.google.common.collect.ImmutableSet.Builder<>();
        }
        return new com.google.common.collect.ImmutableSortedSet.Builder(valueComparator);
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeObject(valueComparator());
        com.google.common.collect.Serialization.writeMultimap(this, stream);
    }

    @javax.annotation.CheckForNull
    java.util.Comparator<? super V> valueComparator() {
        com.google.common.collect.ImmutableSet<V> immutableSet = this.emptySet;
        if (immutableSet instanceof com.google.common.collect.ImmutableSortedSet) {
            return ((com.google.common.collect.ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    private static final class SetFieldSettersHolder {
        static final com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ImmutableSetMultimap> EMPTY_SET_FIELD_SETTER = com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.ImmutableSetMultimap.class, "emptySet");

        private SetFieldSettersHolder() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
        stream.defaultReadObject();
        java.util.Comparator comparator = (java.util.Comparator) stream.readObject();
        int readInt = stream.readInt();
        if (readInt < 0) {
            throw new java.io.InvalidObjectException("Invalid key count " + readInt);
        }
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            java.lang.Object requireNonNull = java.util.Objects.requireNonNull(stream.readObject());
            int readInt2 = stream.readInt();
            if (readInt2 <= 0) {
                throw new java.io.InvalidObjectException("Invalid value count " + readInt2);
            }
            com.google.common.collect.ImmutableSet.Builder valuesBuilder = valuesBuilder(comparator);
            for (int i3 = 0; i3 < readInt2; i3++) {
                valuesBuilder.add((com.google.common.collect.ImmutableSet.Builder) java.util.Objects.requireNonNull(stream.readObject()));
            }
            com.google.common.collect.ImmutableSet build = valuesBuilder.build();
            if (build.size() != readInt2) {
                throw new java.io.InvalidObjectException("Duplicate key-value pairs exist for key " + requireNonNull);
            }
            builder.put(requireNonNull, build);
            i += readInt2;
        }
        try {
            com.google.common.collect.ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set((com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ImmutableMultimap>) this, (java.lang.Object) builder.buildOrThrow());
            com.google.common.collect.ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set((com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ImmutableMultimap>) this, i);
            com.google.common.collect.ImmutableSetMultimap.SetFieldSettersHolder.EMPTY_SET_FIELD_SETTER.set((com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ImmutableSetMultimap>) this, (java.lang.Object) emptySet(comparator));
        } catch (java.lang.IllegalArgumentException e) {
            throw ((java.io.InvalidObjectException) new java.io.InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
