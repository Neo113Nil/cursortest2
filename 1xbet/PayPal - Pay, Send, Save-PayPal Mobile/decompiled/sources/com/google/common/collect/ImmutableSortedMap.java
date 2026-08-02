package com.google.common.collect;

/* loaded from: classes9.dex */
public final class ImmutableSortedMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> implements java.util.NavigableMap<K, V> {
    private static final long serialVersionUID = 0;
    private final transient com.google.common.collect.ImmutableSortedMap<K, V> descendingMap;
    private final transient com.google.common.collect.RegularImmutableSortedSet<K> keySet;
    private final transient com.google.common.collect.ImmutableList<V> valueList;
    private static final java.util.Comparator<?> NATURAL_ORDER = com.google.common.collect.Ordering.natural();
    private static final com.google.common.collect.ImmutableSortedMap<java.lang.Comparable<?>, java.lang.Object> NATURAL_EMPTY_MAP = new com.google.common.collect.ImmutableSortedMap<>(com.google.common.collect.ImmutableSortedSet.emptySet(com.google.common.collect.Ordering.natural()), com.google.common.collect.ImmutableList.of());

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ java.util.NavigableMap headMap(java.lang.Object obj, boolean z) {
        return headMap((com.google.common.collect.ImmutableSortedMap<K, V>) obj, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ java.util.SortedMap headMap(java.lang.Object obj) {
        return headMap((com.google.common.collect.ImmutableSortedMap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ java.util.NavigableMap subMap(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return subMap((boolean) obj, z, (boolean) obj2, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ java.util.NavigableMap tailMap(java.lang.Object obj, boolean z) {
        return tailMap((com.google.common.collect.ImmutableSortedMap<K, V>) obj, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ java.util.SortedMap tailMap(java.lang.Object obj) {
        return tailMap((com.google.common.collect.ImmutableSortedMap<K, V>) obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        return values();
    }

    public static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMap<K, V>> toImmutableSortedMap(java.util.Comparator<? super K> comparator, java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2) {
        return com.google.common.collect.CollectCollectors.toImmutableSortedMap(comparator, function, function2);
    }

    public static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMap<K, V>> toImmutableSortedMap(java.util.Comparator<? super K> comparator, java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2, java.util.function.BinaryOperator<V> binaryOperator) {
        return com.google.common.collect.CollectCollectors.toImmutableSortedMap(comparator, function, function2, binaryOperator);
    }

    static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> emptyMap(java.util.Comparator<? super K> comparator) {
        if (com.google.common.collect.Ordering.natural().equals(comparator)) {
            return of();
        }
        return new com.google.common.collect.ImmutableSortedMap<>(com.google.common.collect.ImmutableSortedSet.emptySet(comparator), com.google.common.collect.ImmutableList.of());
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of() {
        return (com.google.common.collect.ImmutableSortedMap<K, V>) NATURAL_EMPTY_MAP;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable comparable, java.lang.Object obj) {
        return of(com.google.common.collect.Ordering.natural(), comparable, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(java.util.Comparator<? super K> comparator, K k, V v) {
        return new com.google.common.collect.ImmutableSortedMap<>(new com.google.common.collect.RegularImmutableSortedSet(com.google.common.collect.ImmutableList.of(k), (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator)), com.google.common.collect.ImmutableList.of(v));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable comparable, java.lang.Object obj, java.lang.Comparable comparable2, java.lang.Object obj2) {
        return fromEntries(entryOf(comparable, obj), entryOf(comparable2, obj2));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable comparable, java.lang.Object obj, java.lang.Comparable comparable2, java.lang.Object obj2, java.lang.Comparable comparable3, java.lang.Object obj3) {
        return fromEntries(entryOf(comparable, obj), entryOf(comparable2, obj2), entryOf(comparable3, obj3));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable comparable, java.lang.Object obj, java.lang.Comparable comparable2, java.lang.Object obj2, java.lang.Comparable comparable3, java.lang.Object obj3, java.lang.Comparable comparable4, java.lang.Object obj4) {
        return fromEntries(entryOf(comparable, obj), entryOf(comparable2, obj2), entryOf(comparable3, obj3), entryOf(comparable4, obj4));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable comparable, java.lang.Object obj, java.lang.Comparable comparable2, java.lang.Object obj2, java.lang.Comparable comparable3, java.lang.Object obj3, java.lang.Comparable comparable4, java.lang.Object obj4, java.lang.Comparable comparable5, java.lang.Object obj5) {
        return fromEntries(entryOf(comparable, obj), entryOf(comparable2, obj2), entryOf(comparable3, obj3), entryOf(comparable4, obj4), entryOf(comparable5, obj5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable comparable, java.lang.Object obj, java.lang.Comparable comparable2, java.lang.Object obj2, java.lang.Comparable comparable3, java.lang.Object obj3, java.lang.Comparable comparable4, java.lang.Object obj4, java.lang.Comparable comparable5, java.lang.Object obj5, java.lang.Comparable comparable6, java.lang.Object obj6) {
        return fromEntries(entryOf(comparable, obj), entryOf(comparable2, obj2), entryOf(comparable3, obj3), entryOf(comparable4, obj4), entryOf(comparable5, obj5), entryOf(comparable6, obj6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable comparable, java.lang.Object obj, java.lang.Comparable comparable2, java.lang.Object obj2, java.lang.Comparable comparable3, java.lang.Object obj3, java.lang.Comparable comparable4, java.lang.Object obj4, java.lang.Comparable comparable5, java.lang.Object obj5, java.lang.Comparable comparable6, java.lang.Object obj6, java.lang.Comparable comparable7, java.lang.Object obj7) {
        return fromEntries(entryOf(comparable, obj), entryOf(comparable2, obj2), entryOf(comparable3, obj3), entryOf(comparable4, obj4), entryOf(comparable5, obj5), entryOf(comparable6, obj6), entryOf(comparable7, obj7));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable comparable, java.lang.Object obj, java.lang.Comparable comparable2, java.lang.Object obj2, java.lang.Comparable comparable3, java.lang.Object obj3, java.lang.Comparable comparable4, java.lang.Object obj4, java.lang.Comparable comparable5, java.lang.Object obj5, java.lang.Comparable comparable6, java.lang.Object obj6, java.lang.Comparable comparable7, java.lang.Object obj7, java.lang.Comparable comparable8, java.lang.Object obj8) {
        return fromEntries(entryOf(comparable, obj), entryOf(comparable2, obj2), entryOf(comparable3, obj3), entryOf(comparable4, obj4), entryOf(comparable5, obj5), entryOf(comparable6, obj6), entryOf(comparable7, obj7), entryOf(comparable8, obj8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable comparable, java.lang.Object obj, java.lang.Comparable comparable2, java.lang.Object obj2, java.lang.Comparable comparable3, java.lang.Object obj3, java.lang.Comparable comparable4, java.lang.Object obj4, java.lang.Comparable comparable5, java.lang.Object obj5, java.lang.Comparable comparable6, java.lang.Object obj6, java.lang.Comparable comparable7, java.lang.Object obj7, java.lang.Comparable comparable8, java.lang.Object obj8, java.lang.Comparable comparable9, java.lang.Object obj9) {
        return fromEntries(entryOf(comparable, obj), entryOf(comparable2, obj2), entryOf(comparable3, obj3), entryOf(comparable4, obj4), entryOf(comparable5, obj5), entryOf(comparable6, obj6), entryOf(comparable7, obj7), entryOf(comparable8, obj8), entryOf(comparable9, obj9));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable comparable, java.lang.Object obj, java.lang.Comparable comparable2, java.lang.Object obj2, java.lang.Comparable comparable3, java.lang.Object obj3, java.lang.Comparable comparable4, java.lang.Object obj4, java.lang.Comparable comparable5, java.lang.Object obj5, java.lang.Comparable comparable6, java.lang.Object obj6, java.lang.Comparable comparable7, java.lang.Object obj7, java.lang.Comparable comparable8, java.lang.Object obj8, java.lang.Comparable comparable9, java.lang.Object obj9, java.lang.Comparable comparable10, java.lang.Object obj10) {
        return fromEntries(entryOf(comparable, obj), entryOf(comparable2, obj2), entryOf(comparable3, obj3), entryOf(comparable4, obj4), entryOf(comparable5, obj5), entryOf(comparable6, obj6), entryOf(comparable7, obj7), entryOf(comparable8, obj8), entryOf(comparable9, obj9), entryOf(comparable10, obj10));
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> map) {
        return copyOfInternal(map, (com.google.common.collect.Ordering) NATURAL_ORDER);
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> map, java.util.Comparator<? super K> comparator) {
        return copyOfInternal(map, (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator));
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, (com.google.common.collect.Ordering) NATURAL_ORDER);
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable, java.util.Comparator<? super K> comparator) {
        return fromEntries((java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator), false, iterable);
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfSorted(java.util.SortedMap<K, ? extends V> sortedMap) {
        java.util.Comparator comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = NATURAL_ORDER;
        }
        if (sortedMap instanceof com.google.common.collect.ImmutableSortedMap) {
            com.google.common.collect.ImmutableSortedMap<K, V> immutableSortedMap = (com.google.common.collect.ImmutableSortedMap) sortedMap;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, true, sortedMap.entrySet());
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfInternal(java.util.Map<? extends K, ? extends V> map, java.util.Comparator<? super K> comparator) {
        boolean z = false;
        if (map instanceof java.util.SortedMap) {
            java.util.Comparator<? super K> comparator2 = ((java.util.SortedMap) map).comparator();
            if (comparator2 != null) {
                z = comparator.equals(comparator2);
            } else if (comparator == NATURAL_ORDER) {
                z = true;
            }
        }
        if (z && (map instanceof com.google.common.collect.ImmutableSortedMap)) {
            com.google.common.collect.ImmutableSortedMap<K, V> immutableSortedMap = (com.google.common.collect.ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, z, map.entrySet());
    }

    private static <K extends java.lang.Comparable<? super K>, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(java.util.Map.Entry<K, V>... entryArr) {
        return fromEntries(com.google.common.collect.Ordering.natural(), false, entryArr, entryArr.length);
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(java.util.Comparator<? super K> comparator, boolean z, java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
        java.util.Map.Entry[] entryArr = (java.util.Map.Entry[]) com.google.common.collect.Iterables.toArray(iterable, EMPTY_ENTRY_ARRAY);
        return fromEntries(comparator, z, entryArr, entryArr.length);
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(final java.util.Comparator<? super K> comparator, boolean z, java.util.Map.Entry<K, V>[] entryArr, int i) {
        if (i == 0) {
            return emptyMap(comparator);
        }
        if (i == 1) {
            java.util.Map.Entry entry = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArr[0]);
            return of(comparator, entry.getKey(), entry.getValue());
        }
        java.lang.Object[] objArr = new java.lang.Object[i];
        java.lang.Object[] objArr2 = new java.lang.Object[i];
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArr[i2]);
                java.lang.Object key = entry2.getKey();
                java.lang.Object value = entry2.getValue();
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            java.util.Arrays.sort(entryArr, 0, i, new java.util.Comparator() { // from class: com.google.common.collect.ImmutableSortedMap$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return com.google.common.collect.ImmutableSortedMap.lambda$fromEntries$0(comparator, (java.util.Map.Entry) obj, (java.util.Map.Entry) obj2);
                }
            });
            java.util.Map.Entry entry3 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArr[0]);
            java.lang.Object key2 = entry3.getKey();
            objArr[0] = key2;
            java.lang.Object value2 = entry3.getValue();
            objArr2[0] = value2;
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(objArr[0], value2);
            int i3 = 1;
            while (i3 < i) {
                java.util.Map.Entry entry4 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArr[i3 - 1]);
                java.util.Map.Entry entry5 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArr[i3]);
                java.lang.Object key3 = entry5.getKey();
                java.lang.Object value3 = entry5.getValue();
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(key3, value3);
                objArr[i3] = key3;
                objArr2[i3] = value3;
                checkNoConflict(comparator.compare(key2, key3) != 0, "key", entry4, entry5);
                i3++;
                key2 = key3;
            }
        }
        return new com.google.common.collect.ImmutableSortedMap<>(new com.google.common.collect.RegularImmutableSortedSet(com.google.common.collect.ImmutableList.asImmutableList(objArr), comparator), com.google.common.collect.ImmutableList.asImmutableList(objArr2));
    }

    static /* synthetic */ int lambda$fromEntries$0(java.util.Comparator comparator, java.util.Map.Entry entry, java.util.Map.Entry entry2) {
        java.util.Objects.requireNonNull(entry);
        java.util.Objects.requireNonNull(entry2);
        return comparator.compare(entry.getKey(), entry2.getKey());
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> naturalOrder() {
        return new com.google.common.collect.ImmutableSortedMap.Builder<>(com.google.common.collect.Ordering.natural());
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> orderedBy(java.util.Comparator<K> comparator) {
        return new com.google.common.collect.ImmutableSortedMap.Builder<>(comparator);
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> reverseOrder() {
        return new com.google.common.collect.ImmutableSortedMap.Builder<>(com.google.common.collect.Ordering.natural().reverse());
    }

    public static class Builder<K, V> extends com.google.common.collect.ImmutableMap.Builder<K, V> {
        private final java.util.Comparator<? super K> comparator;
        private transient java.lang.Object[] keys;
        private transient java.lang.Object[] values;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder put(java.lang.Object obj, java.lang.Object obj2) {
            return put((com.google.common.collect.ImmutableSortedMap.Builder<K, V>) obj, obj2);
        }

        public Builder(java.util.Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private Builder(java.util.Comparator<? super K> comparator, int i) {
            this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
            this.keys = new java.lang.Object[i];
            this.values = new java.lang.Object[i];
        }

        private void ensureCapacity(int i) {
            java.lang.Object[] objArr = this.keys;
            if (i > objArr.length) {
                int expandedCapacity = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(objArr.length, i);
                this.keys = java.util.Arrays.copyOf(this.keys, expandedCapacity);
                this.values = java.util.Arrays.copyOf(this.values, expandedCapacity);
            }
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> put(K k, V v) {
            ensureCapacity(this.size + 1);
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(k, v);
            this.keys[this.size] = k;
            this.values[this.size] = v;
            this.size++;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            super.put((java.util.Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> map) {
            super.putAll((java.util.Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((java.lang.Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @java.lang.Deprecated
        public final com.google.common.collect.ImmutableSortedMap.Builder<K, V> orderEntriesByValue(java.util.Comparator<? super V> comparator) {
            throw new java.lang.UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        com.google.common.collect.ImmutableSortedMap.Builder<K, V> combine(com.google.common.collect.ImmutableSortedMap.Builder<K, V> builder) {
            ensureCapacity(this.size + builder.size);
            java.lang.System.arraycopy(builder.keys, 0, this.keys, this.size, builder.size);
            java.lang.System.arraycopy(builder.values, 0, this.values, this.size, builder.size);
            this.size += builder.size;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap<K, V> buildOrThrow() {
            int i = this.size;
            if (i == 0) {
                return com.google.common.collect.ImmutableSortedMap.emptyMap(this.comparator);
            }
            if (i == 1) {
                return com.google.common.collect.ImmutableSortedMap.of(this.comparator, java.util.Objects.requireNonNull(this.keys[0]), java.util.Objects.requireNonNull(this.values[0]));
            }
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.keys, this.size);
            java.util.Arrays.sort(copyOf, this.comparator);
            java.lang.Object[] objArr = new java.lang.Object[this.size];
            for (int i2 = 0; i2 < this.size; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.comparator.compare(copyOf[i3], copyOf[i2]) == 0) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("keys required to be distinct but compared as equal: ");
                        sb.append(copyOf[i3]);
                        sb.append(" and ");
                        sb.append(copyOf[i2]);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                }
                objArr[java.util.Arrays.binarySearch(copyOf, java.util.Objects.requireNonNull(this.keys[i2]), this.comparator)] = java.util.Objects.requireNonNull(this.values[i2]);
            }
            return new com.google.common.collect.ImmutableSortedMap<>(new com.google.common.collect.RegularImmutableSortedSet(com.google.common.collect.ImmutableList.asImmutableList(copyOf), this.comparator), com.google.common.collect.ImmutableList.asImmutableList(objArr));
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @java.lang.Deprecated
        public final com.google.common.collect.ImmutableSortedMap<K, V> buildKeepingLast() {
            throw new java.lang.UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }
    }

    ImmutableSortedMap(com.google.common.collect.RegularImmutableSortedSet<K> regularImmutableSortedSet, com.google.common.collect.ImmutableList<V> immutableList) {
        this(regularImmutableSortedSet, immutableList, null);
    }

    ImmutableSortedMap(com.google.common.collect.RegularImmutableSortedSet<K> regularImmutableSortedSet, com.google.common.collect.ImmutableList<V> immutableList, com.google.common.collect.ImmutableSortedMap<K, V> immutableSortedMap) {
        this.keySet = regularImmutableSortedSet;
        this.valueList = immutableList;
        this.descendingMap = immutableSortedMap;
    }

    @Override // java.util.Map
    public final int size() {
        return this.valueList.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(java.lang.Object obj) {
        int indexOf = this.keySet.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.valueList.get(indexOf);
    }

    @Override // com.google.common.collect.ImmutableMap
    final boolean isPartialView() {
        return this.keySet.isPartialView() || this.valueList.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    final com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? com.google.common.collect.ImmutableSet.of() : new com.google.common.collect.ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                return iterator();
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                return asList().iterator();
            }

            @Override // com.google.common.collect.ImmutableSet
            final com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
                return new com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                    @Override // com.google.common.collect.ImmutableCollection
                    boolean isPartialView() {
                        return true;
                    }

                    @Override // java.util.List
                    public java.util.Map.Entry<K, V> get(int i) {
                        return new java.util.AbstractMap.SimpleImmutableEntry(com.google.common.collect.ImmutableSortedMap.this.keySet.asList().get(i), com.google.common.collect.ImmutableSortedMap.this.valueList.get(i));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return com.google.common.collect.ImmutableSortedMap.this.size();
                    }

                    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                    java.lang.Object writeReplace() {
                        return super.writeReplace();
                    }
                };
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            final com.google.common.collect.ImmutableMap<K, V> map() {
                return com.google.common.collect.ImmutableSortedMap.this;
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
            final java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final com.google.common.collect.ImmutableSortedSet<K> keySet() {
        return this.keySet;
    }

    @Override // com.google.common.collect.ImmutableMap
    final com.google.common.collect.ImmutableSet<K> createKeySet() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public final com.google.common.collect.ImmutableCollection<V> values() {
        return this.valueList;
    }

    @Override // com.google.common.collect.ImmutableMap
    final com.google.common.collect.ImmutableCollection<V> createValues() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // java.util.SortedMap
    public final K firstKey() {
        return keySet().first();
    }

    @Override // java.util.SortedMap
    public final K lastKey() {
        return keySet().last();
    }

    private com.google.common.collect.ImmutableSortedMap<K, V> getSubMap(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return emptyMap(comparator());
        }
        return new com.google.common.collect.ImmutableSortedMap<>(this.keySet.getSubSet(i, i2), this.valueList.subList(i, i2));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final com.google.common.collect.ImmutableSortedMap<K, V> headMap(K k) {
        return headMap((com.google.common.collect.ImmutableSortedMap<K, V>) k, false);
    }

    @Override // java.util.NavigableMap
    public final com.google.common.collect.ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        return getSubMap(0, this.keySet.headIndex(com.google.common.base.Preconditions.checkNotNull(k), z));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final com.google.common.collect.ImmutableSortedMap<K, V> subMap(K k, K k2) {
        return subMap((boolean) k, true, (boolean) k2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public final com.google.common.collect.ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        com.google.common.base.Preconditions.checkNotNull(k);
        com.google.common.base.Preconditions.checkNotNull(k2);
        com.google.common.base.Preconditions.checkArgument(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap((com.google.common.collect.ImmutableSortedMap<K, V>) k2, z2).tailMap((com.google.common.collect.ImmutableSortedMap<K, V>) k, z);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final com.google.common.collect.ImmutableSortedMap<K, V> tailMap(K k) {
        return tailMap((com.google.common.collect.ImmutableSortedMap<K, V>) k, true);
    }

    @Override // java.util.NavigableMap
    public final com.google.common.collect.ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        return getSubMap(this.keySet.tailIndex(com.google.common.base.Preconditions.checkNotNull(k), z), size());
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry<K, V> lowerEntry(K k) {
        return headMap((com.google.common.collect.ImmutableSortedMap<K, V>) k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final K lowerKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry<K, V> floorEntry(K k) {
        return headMap((com.google.common.collect.ImmutableSortedMap<K, V>) k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final K floorKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap((com.google.common.collect.ImmutableSortedMap<K, V>) k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final K ceilingKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry<K, V> higherEntry(K k) {
        return tailMap((com.google.common.collect.ImmutableSortedMap<K, V>) k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final K higherKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(higherEntry(k));
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.NavigableMap
    @java.lang.Deprecated
    public final java.util.Map.Entry<K, V> pollFirstEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @java.lang.Deprecated
    public final java.util.Map.Entry<K, V> pollLastEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final com.google.common.collect.ImmutableSortedMap<K, V> descendingMap() {
        com.google.common.collect.ImmutableSortedMap<K, V> immutableSortedMap = this.descendingMap;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        if (isEmpty()) {
            return emptyMap(com.google.common.collect.Ordering.from(comparator()).reverse());
        }
        return new com.google.common.collect.ImmutableSortedMap<>((com.google.common.collect.RegularImmutableSortedSet) this.keySet.descendingSet(), this.valueList.reverse(), this);
    }

    @Override // java.util.NavigableMap
    public final com.google.common.collect.ImmutableSortedSet<K> navigableKeySet() {
        return this.keySet;
    }

    @Override // java.util.NavigableMap
    public final com.google.common.collect.ImmutableSortedSet<K> descendingKeySet() {
        return this.keySet.descendingSet();
    }

    static final class SerializedForm<K, V> extends com.google.common.collect.ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;
        private final java.util.Comparator<? super K> comparator;

        SerializedForm(com.google.common.collect.ImmutableSortedMap<K, V> immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public final com.google.common.collect.ImmutableSortedMap.Builder<K, V> makeBuilder(int i) {
            return new com.google.common.collect.ImmutableSortedMap.Builder<>(this.comparator);
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    final java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableSortedMap.SerializedForm(this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @java.lang.Deprecated
    public static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2, java.util.function.BinaryOperator<V> binaryOperator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> builder() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> builderWithExpectedSize(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.SafeVarargs
    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> ofEntries(java.util.Map.Entry<? extends K, ? extends V>... entryArr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
