package com.google.common.collect;

/* loaded from: classes9.dex */
public class ImmutableListMultimap<K, V> extends com.google.common.collect.ImmutableMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
    private static final long serialVersionUID = 0;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableListMultimap<V, K> inverse;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection get(java.lang.Object obj) {
        return get((com.google.common.collect.ImmutableListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
        return get((com.google.common.collect.ImmutableListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.List get(java.lang.Object obj) {
        return get((com.google.common.collect.ImmutableListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.ImmutableListMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.ImmutableListMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.List replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.ImmutableListMultimap<K, V>) obj, iterable);
    }

    public static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableListMultimap<K, V>> toImmutableListMultimap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2) {
        return com.google.common.collect.CollectCollectors.toImmutableListMultimap(function, function2);
    }

    public static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> function2) {
        return com.google.common.collect.CollectCollectors.flatteningToImmutableListMultimap(function, function2);
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of() {
        return com.google.common.collect.EmptyImmutableListMultimap.INSTANCE;
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K k, V v) {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k, (K) v);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2) {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k, (K) v);
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k2, (K) v2);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k, (K) v);
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k2, (K) v2);
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k3, (K) v3);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k, (K) v);
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k2, (K) v2);
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k3, (K) v3);
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k4, (K) v4);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k, (K) v);
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k2, (K) v2);
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k3, (K) v3);
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k4, (K) v4);
        builder.put((com.google.common.collect.ImmutableListMultimap.Builder) k5, (K) v5);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableListMultimap.Builder<>();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap.Builder<K, V> builderWithExpectedKeys(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new com.google.common.collect.ImmutableListMultimap.Builder<>(i);
    }

    public static final class Builder<K, V> extends com.google.common.collect.ImmutableMultimap.Builder<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.lang.Object obj, java.lang.Object obj2) {
            return put((com.google.common.collect.ImmutableListMultimap.Builder<K, V>) obj, obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object obj, java.lang.Iterable iterable) {
            return putAll((com.google.common.collect.ImmutableListMultimap.Builder<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object obj, java.lang.Object[] objArr) {
            return putAll((com.google.common.collect.ImmutableListMultimap.Builder<K, V>) obj, objArr);
        }

        public Builder() {
        }

        Builder(int i) {
            super(i);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap.Builder<K, V> expectedValuesPerKey(int i) {
            super.expectedValuesPerKey(i);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap.Builder<K, V> put(K k, V v) {
            super.put((com.google.common.collect.ImmutableListMultimap.Builder<K, V>) k, (K) v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            super.put((java.util.Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((java.lang.Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(K k, java.lang.Iterable<? extends V> iterable) {
            super.putAll((com.google.common.collect.ImmutableListMultimap.Builder<K, V>) k, (java.lang.Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(K k, V... vArr) {
            super.putAll((com.google.common.collect.ImmutableListMultimap.Builder<K, V>) k, (java.lang.Object[]) vArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            super.putAll((com.google.common.collect.Multimap) multimap);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap.Builder<K, V> combine(com.google.common.collect.ImmutableMultimap.Builder<K, V> builder) {
            super.combine((com.google.common.collect.ImmutableMultimap.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> comparator) {
            super.orderKeysBy((java.util.Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> comparator) {
            super.orderValuesBy((java.util.Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final com.google.common.collect.ImmutableListMultimap<K, V> build() {
            return (com.google.common.collect.ImmutableListMultimap) super.build();
        }
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return of();
        }
        if (multimap instanceof com.google.common.collect.ImmutableListMultimap) {
            com.google.common.collect.ImmutableListMultimap<K, V> immutableListMultimap = (com.google.common.collect.ImmutableListMultimap) multimap;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), null);
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
        return new com.google.common.collect.ImmutableListMultimap.Builder().putAll((java.lang.Iterable) iterable).build();
    }

    static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>>> collection, java.util.Comparator<? super V> comparator) {
        com.google.common.collect.ImmutableList sortedCopyOf;
        if (collection.isEmpty()) {
            return of();
        }
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(collection.size());
        int i = 0;
        for (java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            java.util.Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                sortedCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) value);
            } else {
                sortedCopyOf = com.google.common.collect.ImmutableList.sortedCopyOf(comparator, value);
            }
            if (!sortedCopyOf.isEmpty()) {
                builder.put(key, sortedCopyOf);
                i += sortedCopyOf.size();
            }
        }
        return new com.google.common.collect.ImmutableListMultimap<>(builder.buildOrThrow(), i);
    }

    static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> fromMapBuilderEntries(java.util.Collection<? extends java.util.Map.Entry<K, com.google.common.collect.ImmutableCollection.Builder<V>>> collection, java.util.Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(collection.size());
        int i = 0;
        for (java.util.Map.Entry<K, com.google.common.collect.ImmutableCollection.Builder<V>> entry : collection) {
            K key = entry.getKey();
            com.google.common.collect.ImmutableList.Builder builder2 = (com.google.common.collect.ImmutableList.Builder) entry.getValue();
            com.google.common.collect.ImmutableList build = comparator == null ? builder2.build() : builder2.buildSorted(comparator);
            builder.put(key, build);
            i += build.size();
        }
        return new com.google.common.collect.ImmutableListMultimap<>(builder.buildOrThrow(), i);
    }

    ImmutableListMultimap(com.google.common.collect.ImmutableMap<K, com.google.common.collect.ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public com.google.common.collect.ImmutableList<V> get(K k) {
        com.google.common.collect.ImmutableList<V> immutableList = (com.google.common.collect.ImmutableList) this.map.get(k);
        return immutableList == null ? com.google.common.collect.ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public com.google.common.collect.ImmutableListMultimap<V, K> inverse() {
        com.google.common.collect.ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        com.google.common.collect.ImmutableListMultimap<V, K> invert = invert();
        this.inverse = invert;
        return invert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.google.common.collect.ImmutableListMultimap<V, K> invert() {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        com.google.common.collect.UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            builder.put((com.google.common.collect.ImmutableListMultimap.Builder) entry.getValue(), entry.getKey());
        }
        com.google.common.collect.ImmutableListMultimap<V, K> build = builder.build();
        build.inverse = this;
        return build;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableList<V> removeAll(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableList<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
        throw new java.lang.UnsupportedOperationException();
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        com.google.common.collect.Serialization.writeMultimap(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
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
            com.google.common.collect.ImmutableList.Builder builder2 = com.google.common.collect.ImmutableList.builder();
            for (int i3 = 0; i3 < readInt2; i3++) {
                builder2.add((com.google.common.collect.ImmutableList.Builder) java.util.Objects.requireNonNull(objectInputStream.readObject()));
            }
            builder.put(requireNonNull, builder2.build());
            i += readInt2;
        }
        try {
            com.google.common.collect.ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set((com.google.common.collect.Serialization.FieldSetter<? super com.google.common.collect.ImmutableMultimap<?, ?>>) this, (java.lang.Object) builder.buildOrThrow());
            com.google.common.collect.ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set((com.google.common.collect.Serialization.FieldSetter<? super com.google.common.collect.ImmutableMultimap<?, ?>>) this, i);
        } catch (java.lang.IllegalArgumentException e) {
            throw ((java.io.InvalidObjectException) new java.io.InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
