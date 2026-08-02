package com.google.common.collect;

@com.google.errorprone.annotations.DoNotMock("Use ImmutableMap.of or another implementation")
/* loaded from: classes4.dex */
public abstract class ImmutableMap<K, V> implements java.util.Map<K, V>, java.io.Serializable {
    static final java.util.Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new java.util.Map.Entry[0];
    private static final long serialVersionUID = 912559;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<K> keySet;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSetMultimap<K, V> multimapView;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableCollection<V> values;

    abstract com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet();

    abstract com.google.common.collect.ImmutableSet<K> createKeySet();

    abstract com.google.common.collect.ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public abstract V get(java.lang.Object obj);

    boolean isHashCodeFast() {
        return false;
    }

    abstract boolean isPartialView();

    public static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2) {
        return com.google.common.collect.CollectCollectors.toImmutableMap(function, function2);
    }

    public static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2, java.util.function.BinaryOperator<V> binaryOperator) {
        return com.google.common.collect.CollectCollectors.toImmutableMap(function, function2, binaryOperator);
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of() {
        return (com.google.common.collect.ImmutableMap<K, V>) com.google.common.collect.RegularImmutableMap.EMPTY;
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k, V v) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        return com.google.common.collect.RegularImmutableMap.create(1, new java.lang.Object[]{k, v});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k, V v, K k2, V v2) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        return com.google.common.collect.RegularImmutableMap.create(2, new java.lang.Object[]{k, v, k2, v2});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        return com.google.common.collect.RegularImmutableMap.create(3, new java.lang.Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        return com.google.common.collect.RegularImmutableMap.create(4, new java.lang.Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        return com.google.common.collect.RegularImmutableMap.create(5, new java.lang.Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        return com.google.common.collect.RegularImmutableMap.create(6, new java.lang.Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        return com.google.common.collect.RegularImmutableMap.create(7, new java.lang.Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k8, v8);
        return com.google.common.collect.RegularImmutableMap.create(8, new java.lang.Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k8, v8);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k9, v9);
        return com.google.common.collect.RegularImmutableMap.create(9, new java.lang.Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k8, v8);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k9, v9);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k10, v10);
        return com.google.common.collect.RegularImmutableMap.create(10, new java.lang.Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10});
    }

    @java.lang.SafeVarargs
    public static <K, V> com.google.common.collect.ImmutableMap<K, V> ofEntries(java.util.Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(java.util.Arrays.asList(entryArr));
    }

    static <K, V> java.util.Map.Entry<K, V> entryOf(K k, V v) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
        return new java.util.AbstractMap.SimpleImmutableEntry(k, v);
    }

    public static <K, V> com.google.common.collect.ImmutableMap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableMap.Builder<>();
    }

    public static <K, V> com.google.common.collect.ImmutableMap.Builder<K, V> builderWithExpectedSize(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "expectedSize");
        return new com.google.common.collect.ImmutableMap.Builder<>(i);
    }

    static void checkNoConflict(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (!z) {
            throw conflictException(str, obj, obj2);
        }
    }

    static java.lang.IllegalArgumentException conflictException(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Multiple entries with same ");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(" and ");
        sb.append(obj2);
        return new java.lang.IllegalArgumentException(sb.toString());
    }

    @com.google.errorprone.annotations.DoNotMock
    public static class Builder<K, V> {
        java.lang.Object[] alternatingKeysAndValues;
        com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey;
        boolean entriesUsed;
        int size;
        java.util.Comparator<? super V> valueComparator;

        public Builder() {
            this(4);
        }

        Builder(int i) {
            this.alternatingKeysAndValues = new java.lang.Object[i * 2];
            this.size = 0;
            this.entriesUsed = false;
        }

        private void ensureCapacity(int i) {
            int i2 = i * 2;
            java.lang.Object[] objArr = this.alternatingKeysAndValues;
            if (i2 > objArr.length) {
                this.alternatingKeysAndValues = java.util.Arrays.copyOf(objArr, com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(objArr.length, i2));
                this.entriesUsed = false;
            }
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> put(K k, V v) {
            ensureCapacity(this.size + 1);
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
            java.lang.Object[] objArr = this.alternatingKeysAndValues;
            int i = this.size;
            int i2 = i * 2;
            objArr[i2] = k;
            objArr[i2 + 1] = v;
            this.size = i + 1;
            return this;
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof java.util.Collection) {
                ensureCapacity(this.size + ((java.util.Collection) iterable).size());
            }
            java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> orderEntriesByValue(java.util.Comparator<? super V> comparator) {
            com.google.common.base.Preconditions.checkState(this.valueComparator == null, "valueComparator was already set");
            this.valueComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator, "valueComparator");
            return this;
        }

        com.google.common.collect.ImmutableMap.Builder<K, V> combine(com.google.common.collect.ImmutableMap.Builder<K, V> builder) {
            com.google.common.base.Preconditions.checkNotNull(builder);
            ensureCapacity(this.size + builder.size);
            java.lang.System.arraycopy(builder.alternatingKeysAndValues, 0, this.alternatingKeysAndValues, this.size * 2, builder.size * 2);
            this.size += builder.size;
            return this;
        }

        private com.google.common.collect.ImmutableMap<K, V> build(boolean z) {
            java.lang.Object[] objArr;
            com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey;
            com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey2;
            if (z && (duplicateKey2 = this.duplicateKey) != null) {
                throw duplicateKey2.exception();
            }
            int i = this.size;
            if (this.valueComparator == null) {
                objArr = this.alternatingKeysAndValues;
            } else {
                if (this.entriesUsed) {
                    this.alternatingKeysAndValues = java.util.Arrays.copyOf(this.alternatingKeysAndValues, i * 2);
                }
                objArr = this.alternatingKeysAndValues;
                if (!z) {
                    objArr = lastEntryForEachKey(objArr, this.size);
                    if (objArr.length < this.alternatingKeysAndValues.length) {
                        i = objArr.length >>> 1;
                    }
                }
                sortEntries(objArr, i, this.valueComparator);
            }
            this.entriesUsed = true;
            com.google.common.collect.RegularImmutableMap create = com.google.common.collect.RegularImmutableMap.create(i, objArr, this);
            if (!z || (duplicateKey = this.duplicateKey) == null) {
                return create;
            }
            throw duplicateKey.exception();
        }

        public com.google.common.collect.ImmutableMap<K, V> build() {
            return buildOrThrow();
        }

        public com.google.common.collect.ImmutableMap<K, V> buildOrThrow() {
            return build(true);
        }

        public com.google.common.collect.ImmutableMap<K, V> buildKeepingLast() {
            return build(false);
        }

        static <V> void sortEntries(java.lang.Object[] objArr, int i, java.util.Comparator<? super V> comparator) {
            java.util.Map.Entry[] entryArr = new java.util.Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                entryArr[i2] = new java.util.AbstractMap.SimpleImmutableEntry(java.util.Objects.requireNonNull(objArr[i3]), java.util.Objects.requireNonNull(objArr[i3 + 1]));
            }
            java.util.Arrays.sort(entryArr, 0, i, com.google.common.collect.Ordering.from(comparator).onResultOf(com.google.common.collect.Maps.valueFunction()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        private java.lang.Object[] lastEntryForEachKey(java.lang.Object[] objArr, int i) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.BitSet bitSet = new java.util.BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (!hashSet.add(java.util.Objects.requireNonNull(objArr[i2 * 2]))) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    objArr2[i4] = java.util.Objects.requireNonNull(objArr[i3]);
                    objArr2[i4 + 1] = java.util.Objects.requireNonNull(objArr[i3 + 1]);
                    i4 += 2;
                    i3 += 2;
                }
            }
            return objArr2;
        }

        static final class DuplicateKey {
            private final java.lang.Object key;
            private final java.lang.Object value1;
            private final java.lang.Object value2;

            DuplicateKey(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                this.key = obj;
                this.value1 = obj2;
                this.value2 = obj3;
            }

            final java.lang.IllegalArgumentException exception() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Multiple entries with same key: ");
                sb.append(this.key);
                sb.append("=");
                sb.append(this.value1);
                sb.append(" and ");
                sb.append(this.key);
                sb.append("=");
                sb.append(this.value2);
                return new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> map) {
        if ((map instanceof com.google.common.collect.ImmutableMap) && !(map instanceof java.util.SortedMap)) {
            com.google.common.collect.ImmutableMap<K, V> immutableMap = (com.google.common.collect.ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : 4);
        builder.putAll(iterable);
        return builder.build();
    }

    /* loaded from: classes9.dex */
    static abstract class IteratorBasedImmutableMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> {
        abstract com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator();

        IteratorBasedImmutableMap() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ java.util.Collection values() {
            return super.values();
        }

        @Override // com.google.common.collect.ImmutableMap
        com.google.common.collect.ImmutableSet<K> createKeySet() {
            return new com.google.common.collect.ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            return new com.google.common.collect.ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
                public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                    return iterator();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                final com.google.common.collect.ImmutableMap<K, V> map() {
                    return com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
                public final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                    return com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.this.entryIterator();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                final java.lang.Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        com.google.common.collect.ImmutableCollection<V> createValues() {
            return new com.google.common.collect.ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    ImmutableMap() {
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V put(K k, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(java.lang.Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
        com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    @Override // java.util.Map
    public com.google.common.collect.ImmutableSet<K> keySet() {
        com.google.common.collect.ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        com.google.common.collect.ImmutableSet<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    com.google.common.collect.UnmodifiableIterator<K> keyIterator() {
        final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> it = entrySet().iterator();
        return new com.google.common.collect.UnmodifiableIterator<K>(this) { // from class: com.google.common.collect.ImmutableMap.1
            final /* synthetic */ com.google.common.collect.ImmutableMap this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((java.util.Map.Entry) it.next()).getKey();
            }
        };
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public com.google.common.collect.ImmutableCollection<V> values() {
        com.google.common.collect.ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        com.google.common.collect.ImmutableCollection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public com.google.common.collect.ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return com.google.common.collect.ImmutableSetMultimap.of();
        }
        com.google.common.collect.ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        com.google.common.collect.ImmutableSetMultimap<K, V> immutableSetMultimap2 = new com.google.common.collect.ImmutableSetMultimap<>(new com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets(), size(), null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    /* loaded from: classes9.dex */
    final class MapViewOfValuesAsSingletonSets extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, com.google.common.collect.ImmutableSet<V>> {
        private MapViewOfValuesAsSingletonSets() {
        }

        @Override // java.util.Map
        public final int size() {
            return com.google.common.collect.ImmutableMap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        final com.google.common.collect.ImmutableSet<K> createKeySet() {
            return com.google.common.collect.ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return com.google.common.collect.ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final com.google.common.collect.ImmutableSet<V> get(java.lang.Object obj) {
            java.lang.Object obj2 = com.google.common.collect.ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return com.google.common.collect.ImmutableSet.of(obj2);
        }

        @Override // com.google.common.collect.ImmutableMap
        final boolean isPartialView() {
            return com.google.common.collect.ImmutableMap.this.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final int hashCode() {
            return com.google.common.collect.ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        final boolean isHashCodeFast() {
            return com.google.common.collect.ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, com.google.common.collect.ImmutableSet<V>>> entryIterator() {
            final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> it = com.google.common.collect.ImmutableMap.this.entrySet().iterator();
            return new com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, com.google.common.collect.ImmutableSet<V>>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1
                final /* synthetic */ com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public java.util.Map.Entry<K, com.google.common.collect.ImmutableSet<V>> next() {
                    final java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    return new com.google.common.collect.AbstractMapEntry<K, com.google.common.collect.ImmutableSet<V>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1.1
                        final /* synthetic */ com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.AnonymousClass1 this$2;

                        {
                            this.this$2 = this;
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public com.google.common.collect.ImmutableSet<V> getValue() {
                            return com.google.common.collect.ImmutableSet.of(entry.getValue());
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return com.google.common.collect.Maps.equalsImpl(this, obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(entrySet());
    }

    public java.lang.String toString() {
        return com.google.common.collect.Maps.toStringImpl(this);
    }

    /* loaded from: classes9.dex */
    static class SerializedForm<K, V> implements java.io.Serializable {
        private static final boolean USE_LEGACY_SERIALIZATION = true;
        private static final long serialVersionUID = 0;
        private final java.lang.Object keys;
        private final java.lang.Object values;

        SerializedForm(com.google.common.collect.ImmutableMap<K, V> immutableMap) {
            java.lang.Object[] objArr = new java.lang.Object[immutableMap.size()];
            java.lang.Object[] objArr2 = new java.lang.Object[immutableMap.size()];
            com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final java.lang.Object readResolve() {
            java.lang.Object obj = this.keys;
            if (!(obj instanceof com.google.common.collect.ImmutableSet)) {
                return legacyReadResolve();
            }
            com.google.common.collect.ImmutableSet immutableSet = (com.google.common.collect.ImmutableSet) obj;
            com.google.common.collect.ImmutableCollection immutableCollection = (com.google.common.collect.ImmutableCollection) this.values;
            com.google.common.collect.ImmutableMap.Builder<K, V> makeBuilder = makeBuilder(immutableSet.size());
            com.google.common.collect.UnmodifiableIterator<E> it = immutableSet.iterator();
            com.google.common.collect.UnmodifiableIterator it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                makeBuilder.put(it.next(), it2.next());
            }
            return makeBuilder.buildOrThrow();
        }

        /* JADX WARN: Multi-variable type inference failed */
        final java.lang.Object legacyReadResolve() {
            java.lang.Object[] objArr = (java.lang.Object[]) this.keys;
            java.lang.Object[] objArr2 = (java.lang.Object[]) this.values;
            com.google.common.collect.ImmutableMap.Builder<K, V> makeBuilder = makeBuilder(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                makeBuilder.put(objArr[i], objArr2[i]);
            }
            return makeBuilder.buildOrThrow();
        }

        com.google.common.collect.ImmutableMap.Builder<K, V> makeBuilder(int i) {
            return new com.google.common.collect.ImmutableMap.Builder<>(i);
        }
    }

    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableMap.SerializedForm(this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }
}
