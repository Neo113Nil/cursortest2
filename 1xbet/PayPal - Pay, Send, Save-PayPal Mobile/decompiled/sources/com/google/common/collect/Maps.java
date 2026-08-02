package com.google.common.collect;

/* loaded from: classes4.dex */
public final class Maps {

    enum EntryFunction implements com.google.common.base.Function<java.util.Map.Entry<?, ?>, java.lang.Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.util.Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.util.Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(K k, V1 v1);
    }

    private Maps() {
    }

    static <K> com.google.common.base.Function<java.util.Map.Entry<K, ?>, K> keyFunction() {
        return com.google.common.collect.Maps.EntryFunction.KEY;
    }

    static <V> com.google.common.base.Function<java.util.Map.Entry<?, V>, V> valueFunction() {
        return com.google.common.collect.Maps.EntryFunction.VALUE;
    }

    static <K, V> java.util.Iterator<K> keyIterator(java.util.Iterator<java.util.Map.Entry<K, V>> it) {
        return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<K, V>, K>(it) { // from class: com.google.common.collect.Maps.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            public K transform(java.util.Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    static <K, V> java.util.Iterator<V> valueIterator(java.util.Iterator<java.util.Map.Entry<K, V>> it) {
        return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<K, V>, V>(it) { // from class: com.google.common.collect.Maps.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            public V transform(java.util.Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    public static <K extends java.lang.Enum<K>, V> com.google.common.collect.ImmutableMap<K, V> immutableEnumMap(java.util.Map<K, ? extends V> map) {
        if (map instanceof com.google.common.collect.ImmutableEnumMap) {
            return (com.google.common.collect.ImmutableEnumMap) map;
        }
        java.util.Iterator<java.util.Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return com.google.common.collect.ImmutableMap.of();
        }
        java.util.Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(key, value);
        java.util.EnumMap enumMap = new java.util.EnumMap(java.util.Collections.singletonMap(key, value));
        while (it.hasNext()) {
            java.util.Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(key2, value2);
            enumMap.put((java.util.EnumMap) key2, (K) value2);
        }
        return com.google.common.collect.ImmutableEnumMap.asImmutable(enumMap);
    }

    public static <T, K extends java.lang.Enum<K>, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2) {
        return com.google.common.collect.CollectCollectors.toImmutableEnumMap(function, function2);
    }

    public static <T, K extends java.lang.Enum<K>, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2, java.util.function.BinaryOperator<V> binaryOperator) {
        return com.google.common.collect.CollectCollectors.toImmutableEnumMap(function, function2, binaryOperator);
    }

    public static <K, V> java.util.HashMap<K, V> newHashMap() {
        return new java.util.HashMap<>();
    }

    public static <K, V> java.util.HashMap<K, V> newHashMap(java.util.Map<? extends K, ? extends V> map) {
        return new java.util.HashMap<>(map);
    }

    public static <K, V> java.util.HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new java.util.HashMap<>(capacity(i));
    }

    static int capacity(int i) {
        if (i < 3) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) java.lang.Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMap() {
        return new java.util.LinkedHashMap<>();
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMap(java.util.Map<? extends K, ? extends V> map) {
        return new java.util.LinkedHashMap<>(map);
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return new java.util.LinkedHashMap<>(capacity(i));
    }

    public static <K, V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentMap() {
        return new java.util.concurrent.ConcurrentHashMap();
    }

    public static <K extends java.lang.Comparable, V> java.util.TreeMap<K, V> newTreeMap() {
        return new java.util.TreeMap<>();
    }

    public static <K, V> java.util.TreeMap<K, V> newTreeMap(java.util.SortedMap<K, ? extends V> sortedMap) {
        return new java.util.TreeMap<>((java.util.SortedMap) sortedMap);
    }

    public static <C, K extends C, V> java.util.TreeMap<K, V> newTreeMap(java.util.Comparator<C> comparator) {
        return new java.util.TreeMap<>(comparator);
    }

    public static <K extends java.lang.Enum<K>, V> java.util.EnumMap<K, V> newEnumMap(java.lang.Class<K> cls) {
        return new java.util.EnumMap<>((java.lang.Class) com.google.common.base.Preconditions.checkNotNull(cls));
    }

    public static <K extends java.lang.Enum<K>, V> java.util.EnumMap<K, V> newEnumMap(java.util.Map<K, ? extends V> map) {
        return new java.util.EnumMap<>(map);
    }

    public static <K, V> java.util.IdentityHashMap<K, V> newIdentityHashMap() {
        return new java.util.IdentityHashMap<>();
    }

    public static <K, V> com.google.common.collect.MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> map, java.util.Map<? extends K, ? extends V> map2) {
        if (map instanceof java.util.SortedMap) {
            return difference((java.util.SortedMap) map, (java.util.Map) map2);
        }
        return difference(map, map2, com.google.common.base.Equivalence.equals());
    }

    public static <K, V> com.google.common.collect.MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> map, java.util.Map<? extends K, ? extends V> map2, com.google.common.base.Equivalence<? super V> equivalence) {
        com.google.common.base.Preconditions.checkNotNull(equivalence);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(map2);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        doDifference(map, map2, equivalence, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        return new com.google.common.collect.Maps.MapDifferenceImpl(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
    }

    public static <K, V> com.google.common.collect.SortedMapDifference<K, V> difference(java.util.SortedMap<K, ? extends V> sortedMap, java.util.Map<? extends K, ? extends V> map) {
        com.google.common.base.Preconditions.checkNotNull(sortedMap);
        com.google.common.base.Preconditions.checkNotNull(map);
        java.util.Comparator orNaturalOrder = orNaturalOrder(sortedMap.comparator());
        java.util.TreeMap newTreeMap = newTreeMap(orNaturalOrder);
        java.util.TreeMap newTreeMap2 = newTreeMap(orNaturalOrder);
        newTreeMap2.putAll(map);
        java.util.TreeMap newTreeMap3 = newTreeMap(orNaturalOrder);
        java.util.TreeMap newTreeMap4 = newTreeMap(orNaturalOrder);
        doDifference(sortedMap, map, com.google.common.base.Equivalence.equals(), newTreeMap, newTreeMap2, newTreeMap3, newTreeMap4);
        return new com.google.common.collect.Maps.SortedMapDifferenceImpl(newTreeMap, newTreeMap2, newTreeMap3, newTreeMap4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <K, V> void doDifference(java.util.Map<? extends K, ? extends V> map, java.util.Map<? extends K, ? extends V> map2, com.google.common.base.Equivalence<? super V> equivalence, java.util.Map<K, V> map3, java.util.Map<K, V> map4, java.util.Map<K, V> map5, java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> map6) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                a.d dVar = (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(map4.remove(key));
                if (equivalence.equivalent(value, dVar)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, com.google.common.collect.Maps.ValueDifferenceImpl.create(value, dVar));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<K, ? extends V> map) {
        if (map instanceof java.util.SortedMap) {
            return java.util.Collections.unmodifiableSortedMap((java.util.SortedMap) map);
        }
        return java.util.Collections.unmodifiableMap(map);
    }

    /* loaded from: classes9.dex */
    static class MapDifferenceImpl<K, V> implements com.google.common.collect.MapDifference<K, V> {
        final java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> differences;
        final java.util.Map<K, V> onBoth;
        final java.util.Map<K, V> onlyOnLeft;
        final java.util.Map<K, V> onlyOnRight;

        MapDifferenceImpl(java.util.Map<K, V> map, java.util.Map<K, V> map2, java.util.Map<K, V> map3, java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> map4) {
            this.onlyOnLeft = com.google.common.collect.Maps.unmodifiableMap(map);
            this.onlyOnRight = com.google.common.collect.Maps.unmodifiableMap(map2);
            this.onBoth = com.google.common.collect.Maps.unmodifiableMap(map3);
            this.differences = com.google.common.collect.Maps.unmodifiableMap(map4);
        }

        @Override // com.google.common.collect.MapDifference
        public boolean areEqual() {
            return this.onlyOnLeft.isEmpty() && this.onlyOnRight.isEmpty() && this.differences.isEmpty();
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, V> entriesOnlyOnLeft() {
            return this.onlyOnLeft;
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, V> entriesOnlyOnRight() {
            return this.onlyOnRight;
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, V> entriesInCommon() {
            return this.onBoth;
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering() {
            return this.differences;
        }

        @Override // com.google.common.collect.MapDifference
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.common.collect.MapDifference)) {
                return false;
            }
            com.google.common.collect.MapDifference mapDifference = (com.google.common.collect.MapDifference) obj;
            return entriesOnlyOnLeft().equals(mapDifference.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(mapDifference.entriesOnlyOnRight()) && entriesInCommon().equals(mapDifference.entriesInCommon()) && entriesDiffering().equals(mapDifference.entriesDiffering());
        }

        @Override // com.google.common.collect.MapDifference
        public int hashCode() {
            return java.util.Objects.hash(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
        }

        public java.lang.String toString() {
            if (areEqual()) {
                return "equal";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("not equal");
            if (!this.onlyOnLeft.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.onlyOnLeft);
            }
            if (!this.onlyOnRight.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.onlyOnRight);
            }
            if (!this.differences.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.differences);
            }
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class ValueDifferenceImpl<V> implements com.google.common.collect.MapDifference.ValueDifference<V> {
        private final V left;
        private final V right;

        static <V> com.google.common.collect.MapDifference.ValueDifference<V> create(V v, V v2) {
            return new com.google.common.collect.Maps.ValueDifferenceImpl(v, v2);
        }

        private ValueDifferenceImpl(V v, V v2) {
            this.left = v;
            this.right = v2;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public final V leftValue() {
            return this.left;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public final V rightValue() {
            return this.right;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.collect.MapDifference.ValueDifference)) {
                return false;
            }
            com.google.common.collect.MapDifference.ValueDifference valueDifference = (com.google.common.collect.MapDifference.ValueDifference) obj;
            return java.util.Objects.equals(this.left, valueDifference.leftValue()) && java.util.Objects.equals(this.right, valueDifference.rightValue());
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public final int hashCode() {
            return java.util.Objects.hash(this.left, this.right);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
            sb.append(this.left);
            sb.append(", ");
            sb.append(this.right);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class SortedMapDifferenceImpl<K, V> extends com.google.common.collect.Maps.MapDifferenceImpl<K, V> implements com.google.common.collect.SortedMapDifference<K, V> {
        SortedMapDifferenceImpl(java.util.SortedMap<K, V> sortedMap, java.util.SortedMap<K, V> sortedMap2, java.util.SortedMap<K, V> sortedMap3, java.util.SortedMap<K, com.google.common.collect.MapDifference.ValueDifference<V>> sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public final java.util.SortedMap<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering() {
            return (java.util.SortedMap) super.entriesDiffering();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public final java.util.SortedMap<K, V> entriesInCommon() {
            return (java.util.SortedMap) super.entriesInCommon();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public final java.util.SortedMap<K, V> entriesOnlyOnLeft() {
            return (java.util.SortedMap) super.entriesOnlyOnLeft();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public final java.util.SortedMap<K, V> entriesOnlyOnRight() {
            return (java.util.SortedMap) super.entriesOnlyOnRight();
        }
    }

    static <E> java.util.Comparator<? super E> orNaturalOrder(java.util.Comparator<? super E> comparator) {
        return comparator != null ? comparator : com.google.common.collect.Ordering.natural();
    }

    public static <K, V> java.util.Map<K, V> asMap(java.util.Set<K> set, com.google.common.base.Function<? super K, V> function) {
        return new com.google.common.collect.Maps.AsMapView(set, function);
    }

    public static <K, V> java.util.SortedMap<K, V> asMap(java.util.SortedSet<K> sortedSet, com.google.common.base.Function<? super K, V> function) {
        return new com.google.common.collect.Maps.SortedAsMapView(sortedSet, function);
    }

    public static <K, V> java.util.NavigableMap<K, V> asMap(java.util.NavigableSet<K> navigableSet, com.google.common.base.Function<? super K, V> function) {
        return new com.google.common.collect.Maps.NavigableAsMapView(navigableSet, function);
    }

    /* loaded from: classes9.dex */
    static class AsMapView<K, V> extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, V> {
        final com.google.common.base.Function<? super K, V> function;
        private final java.util.Set<K> set;

        java.util.Set<K> backingSet() {
            return this.set;
        }

        AsMapView(java.util.Set<K> set, com.google.common.base.Function<? super K, V> function) {
            this.set = (java.util.Set) com.google.common.base.Preconditions.checkNotNull(set);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.Set<K> createKeySet() {
            return com.google.common.collect.Maps.removeOnlySet(backingSet());
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Collection<V> createValues() {
            return com.google.common.collect.Collections2.transform(this.set, this.function);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return backingSet().size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            return backingSet().contains(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(java.lang.Object obj) {
            if (com.google.common.collect.Collections2.safeContains(backingSet(), obj)) {
                return this.function.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(java.lang.Object obj) {
            if (backingSet().remove(obj)) {
                return this.function.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            backingSet().clear();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
            return new com.google.common.collect.Maps.EntrySet<K, V>() { // from class: com.google.common.collect.Maps.AsMapView.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                final java.util.Map<K, V> map() {
                    return com.google.common.collect.Maps.AsMapView.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    return com.google.common.collect.Maps.asMapEntryIterator(com.google.common.collect.Maps.AsMapView.this.backingSet(), com.google.common.collect.Maps.AsMapView.this.function);
                }
            };
        }
    }

    static <K, V> java.util.Iterator<java.util.Map.Entry<K, V>> asMapEntryIterator(java.util.Set<K> set, final com.google.common.base.Function<? super K, V> function) {
        return new com.google.common.collect.TransformedIterator<K, java.util.Map.Entry<K, V>>(set.iterator()) { // from class: com.google.common.collect.Maps.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.TransformedIterator
            /* bridge */ /* synthetic */ java.lang.Object transform(java.lang.Object obj) {
                return transform((com.google.common.collect.Maps.AnonymousClass3<K, V>) obj);
            }

            @Override // com.google.common.collect.TransformedIterator
            java.util.Map.Entry<K, V> transform(K k) {
                return com.google.common.collect.Maps.immutableEntry(k, function.apply(k));
            }
        };
    }

    /* loaded from: classes9.dex */
    static final class SortedAsMapView<K, V> extends com.google.common.collect.Maps.AsMapView<K, V> implements java.util.SortedMap<K, V> {
        SortedAsMapView(java.util.SortedSet<K> sortedSet, com.google.common.base.Function<? super K, V> function) {
            super(sortedSet, function);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.AsMapView
        public final java.util.SortedSet<K> backingSet() {
            return (java.util.SortedSet) super.backingSet();
        }

        @Override // java.util.SortedMap
        public final java.util.Comparator<? super K> comparator() {
            return backingSet().comparator();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final java.util.Set<K> keySet() {
            return com.google.common.collect.Maps.removeOnlySortedSet(backingSet());
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<K, V> subMap(K k, K k2) {
            return com.google.common.collect.Maps.asMap((java.util.SortedSet) backingSet().subSet(k, k2), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<K, V> headMap(K k) {
            return com.google.common.collect.Maps.asMap((java.util.SortedSet) backingSet().headSet(k), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<K, V> tailMap(K k) {
            return com.google.common.collect.Maps.asMap((java.util.SortedSet) backingSet().tailSet(k), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return backingSet().first();
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return backingSet().last();
        }
    }

    /* loaded from: classes9.dex */
    static final class NavigableAsMapView<K, V> extends com.google.common.collect.AbstractNavigableMap<K, V> {
        private final com.google.common.base.Function<? super K, V> function;
        private final java.util.NavigableSet<K> set;

        NavigableAsMapView(java.util.NavigableSet<K> navigableSet, com.google.common.base.Function<? super K, V> function) {
            this.set = (java.util.NavigableSet) com.google.common.base.Preconditions.checkNotNull(navigableSet);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return com.google.common.collect.Maps.asMap((java.util.NavigableSet) this.set.subSet(k, z, k2, z2), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> headMap(K k, boolean z) {
            return com.google.common.collect.Maps.asMap((java.util.NavigableSet) this.set.headSet(k, z), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> tailMap(K k, boolean z) {
            return com.google.common.collect.Maps.asMap((java.util.NavigableSet) this.set.tailSet(k, z), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.SortedMap
        public final java.util.Comparator<? super K> comparator() {
            return this.set.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public final V get(java.lang.Object obj) {
            if (com.google.common.collect.Collections2.safeContains(this.set, obj)) {
                return this.function.apply(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.set.clear();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return com.google.common.collect.Maps.asMapEntryIterator(this.set, this.function);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        final java.util.Iterator<java.util.Map.Entry<K, V>> descendingEntryIterator() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final java.util.NavigableSet<K> navigableKeySet() {
            return com.google.common.collect.Maps.removeOnlyNavigableSet(this.set);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.set.size();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final java.util.NavigableMap<K, V> descendingMap() {
            return com.google.common.collect.Maps.asMap((java.util.NavigableSet) this.set.descendingSet(), (com.google.common.base.Function) this.function);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.Set<E> removeOnlySet(final java.util.Set<E> set) {
        return new com.google.common.collect.ForwardingSet<E>() { // from class: com.google.common.collect.Maps.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public java.util.Set<E> delegate() {
                return set;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(E e) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(java.util.Collection<? extends E> collection) {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.SortedSet<E> removeOnlySortedSet(final java.util.SortedSet<E> sortedSet) {
        return new com.google.common.collect.ForwardingSortedSet<E>() { // from class: com.google.common.collect.Maps.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public java.util.SortedSet<E> delegate() {
                return sortedSet;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(E e) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(java.util.Collection<? extends E> collection) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> headSet(E e) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.headSet(e));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> subSet(E e, E e2) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.subSet(e, e2));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> tailSet(E e) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.tailSet(e));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.NavigableSet<E> removeOnlyNavigableSet(final java.util.NavigableSet<E> navigableSet) {
        return new com.google.common.collect.ForwardingNavigableSet<E>() { // from class: com.google.common.collect.Maps.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public java.util.NavigableSet<E> delegate() {
                return navigableSet;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(E e) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(java.util.Collection<? extends E> collection) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> headSet(E e) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.headSet(e));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public java.util.NavigableSet<E> headSet(E e, boolean z) {
                return com.google.common.collect.Maps.removeOnlyNavigableSet(super.headSet(e, z));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> subSet(E e, E e2) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.subSet(e, e2));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public java.util.NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
                return com.google.common.collect.Maps.removeOnlyNavigableSet(super.subSet(e, z, e2, z2));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> tailSet(E e) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.tailSet(e));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public java.util.NavigableSet<E> tailSet(E e, boolean z) {
                return com.google.common.collect.Maps.removeOnlyNavigableSet(super.tailSet(e, z));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public java.util.NavigableSet<E> descendingSet() {
                return com.google.common.collect.Maps.removeOnlyNavigableSet(super.descendingSet());
            }
        };
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> toMap(java.lang.Iterable<K> iterable, com.google.common.base.Function<? super K, V> function) {
        return toMap(iterable.iterator(), function);
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> toMap(java.util.Iterator<K> it, com.google.common.base.Function<? super K, V> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        while (it.hasNext()) {
            K next = it.next();
            builder.put(next, function.apply(next));
        }
        return builder.buildKeepingLast();
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> uniqueIndex(java.lang.Iterable<V> iterable, com.google.common.base.Function<? super V, K> function) {
        if (iterable instanceof java.util.Collection) {
            return uniqueIndex(iterable.iterator(), function, com.google.common.collect.ImmutableMap.builderWithExpectedSize(((java.util.Collection) iterable).size()));
        }
        return uniqueIndex(iterable.iterator(), function);
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> uniqueIndex(java.util.Iterator<V> it, com.google.common.base.Function<? super V, K> function) {
        return uniqueIndex(it, function, com.google.common.collect.ImmutableMap.builder());
    }

    private static <K, V> com.google.common.collect.ImmutableMap<K, V> uniqueIndex(java.util.Iterator<V> it, com.google.common.base.Function<? super V, K> function, com.google.common.collect.ImmutableMap.Builder<K, V> builder) {
        com.google.common.base.Preconditions.checkNotNull(function);
        while (it.hasNext()) {
            V next = it.next();
            builder.put(function.apply(next), next);
        }
        try {
            return builder.buildOrThrow();
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(e.getMessage());
            sb.append(". To index multiple values under a key, use Multimaps.index.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> fromProperties(java.util.Properties properties) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        java.util.Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            java.lang.String str = (java.lang.String) java.util.Objects.requireNonNull(propertyNames.nextElement());
            builder.put(str, (java.lang.String) java.util.Objects.requireNonNull(properties.getProperty(str)));
        }
        return builder.buildOrThrow();
    }

    public static <K, V> java.util.Map.Entry<K, V> immutableEntry(K k, V v) {
        return new java.util.AbstractMap.SimpleImmutableEntry(k, v);
    }

    static <K, V> java.util.Set<java.util.Map.Entry<K, V>> unmodifiableEntrySet(java.util.Set<java.util.Map.Entry<K, V>> set) {
        return new com.google.common.collect.Maps.UnmodifiableEntrySet(java.util.Collections.unmodifiableSet(set));
    }

    static <K, V> java.util.Map.Entry<K, V> unmodifiableEntry(final java.util.Map.Entry<? extends K, ? extends V> entry) {
        com.google.common.base.Preconditions.checkNotNull(entry);
        return new com.google.common.collect.AbstractMapEntry<K, V>() { // from class: com.google.common.collect.Maps.7
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public K getKey() {
                return (K) entry.getKey();
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public V getValue() {
                return (V) entry.getValue();
            }
        };
    }

    static <K, V> com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> unmodifiableEntryIterator(final java.util.Iterator<java.util.Map.Entry<K, V>> it) {
        return new com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.Maps.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                return com.google.common.collect.Maps.unmodifiableEntry((java.util.Map.Entry) it.next());
            }
        };
    }

    /* loaded from: classes9.dex */
    static class UnmodifiableEntries<K, V> extends com.google.common.collect.ForwardingCollection<java.util.Map.Entry<K, V>> {
        private final java.util.Collection<java.util.Map.Entry<K, V>> entries;

        UnmodifiableEntries(java.util.Collection<java.util.Map.Entry<K, V>> collection) {
            this.entries = collection;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Collection<java.util.Map.Entry<K, V>> delegate() {
            return this.entries;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return com.google.common.collect.Maps.unmodifiableEntryIterator(this.entries.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    /* loaded from: classes9.dex */
    static final class UnmodifiableEntrySet<K, V> extends com.google.common.collect.Maps.UnmodifiableEntries<K, V> implements java.util.Set<java.util.Map.Entry<K, V>> {
        UnmodifiableEntrySet(java.util.Set<java.util.Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(java.lang.Object obj) {
            return com.google.common.collect.Sets.equalsImpl(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return com.google.common.collect.Sets.hashCodeImpl(this);
        }
    }

    public static <A, B> com.google.common.base.Converter<A, B> asConverter(com.google.common.collect.BiMap<A, B> biMap) {
        return new com.google.common.collect.Maps.BiMapConverter(biMap);
    }

    /* loaded from: classes9.dex */
    static final class BiMapConverter<A, B> extends com.google.common.base.Converter<A, B> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.BiMap<A, B> bimap;

        BiMapConverter(com.google.common.collect.BiMap<A, B> biMap) {
            this.bimap = (com.google.common.collect.BiMap) com.google.common.base.Preconditions.checkNotNull(biMap);
        }

        @Override // com.google.common.base.Converter
        public final B doForward(A a2) {
            return (B) convert(this.bimap, a2);
        }

        @Override // com.google.common.base.Converter
        public final A doBackward(B b) {
            return (A) convert(this.bimap.inverse(), b);
        }

        private static <X, Y> Y convert(com.google.common.collect.BiMap<X, Y> biMap, X x) {
            Y y = biMap.get(x);
            com.google.common.base.Preconditions.checkArgument(y != null, "No non-null mapping present for input: %s", x);
            return y;
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.collect.Maps.BiMapConverter) {
                return this.bimap.equals(((com.google.common.collect.Maps.BiMapConverter) obj).bimap);
            }
            return false;
        }

        public final int hashCode() {
            return this.bimap.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Maps.asConverter(");
            sb.append(this.bimap);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> synchronizedBiMap(com.google.common.collect.BiMap<K, V> biMap) {
        return com.google.common.collect.Synchronized.biMap(biMap, null);
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> unmodifiableBiMap(com.google.common.collect.BiMap<? extends K, ? extends V> biMap) {
        return new com.google.common.collect.Maps.UnmodifiableBiMap(biMap, null);
    }

    /* loaded from: classes9.dex */
    static final class UnmodifiableBiMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.BiMap<? extends K, ? extends V> delegate;

        @com.google.errorprone.annotations.concurrent.LazyInit
        com.google.common.collect.BiMap<V, K> inverse;
        final java.util.Map<K, V> unmodifiableMap;

        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Set<V> values;

        UnmodifiableBiMap(com.google.common.collect.BiMap<? extends K, ? extends V> biMap, com.google.common.collect.BiMap<V, K> biMap2) {
            this.unmodifiableMap = java.util.Collections.unmodifiableMap(biMap);
            this.delegate = biMap;
            this.inverse = biMap2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.util.Map<K, V> delegate() {
            return this.unmodifiableMap;
        }

        @Override // com.google.common.collect.BiMap
        public final V forcePut(K k, V v) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.BiMap
        public final com.google.common.collect.BiMap<V, K> inverse() {
            com.google.common.collect.BiMap<V, K> biMap = this.inverse;
            if (biMap != null) {
                return biMap;
            }
            com.google.common.collect.Maps.UnmodifiableBiMap unmodifiableBiMap = new com.google.common.collect.Maps.UnmodifiableBiMap(this.delegate.inverse(), this);
            this.inverse = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public final java.util.Set<V> values() {
            java.util.Set<V> set = this.values;
            if (set != null) {
                return set;
            }
            java.util.Set<V> unmodifiableSet = java.util.Collections.unmodifiableSet(this.delegate.values());
            this.values = unmodifiableSet;
            return unmodifiableSet;
        }
    }

    public static <K, V1, V2> java.util.Map<K, V2> transformValues(java.util.Map<K, V1> map, final com.google.common.base.Function<? super V1, V2> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return transformEntries(map, new com.google.common.collect.Maps.EntryTransformer() { // from class: com.google.common.collect.Maps$$ExternalSyntheticLambda3
            @Override // com.google.common.collect.Maps.EntryTransformer
            public final java.lang.Object transformEntry(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object apply;
                apply = com.google.common.base.Function.this.apply(obj2);
                return apply;
            }
        });
    }

    public static <K, V1, V2> java.util.SortedMap<K, V2> transformValues(java.util.SortedMap<K, V1> sortedMap, final com.google.common.base.Function<? super V1, V2> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return transformEntries((java.util.SortedMap) sortedMap, new com.google.common.collect.Maps.EntryTransformer() { // from class: com.google.common.collect.Maps$$ExternalSyntheticLambda1
            @Override // com.google.common.collect.Maps.EntryTransformer
            public final java.lang.Object transformEntry(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object apply;
                apply = com.google.common.base.Function.this.apply(obj2);
                return apply;
            }
        });
    }

    public static <K, V1, V2> java.util.NavigableMap<K, V2> transformValues(java.util.NavigableMap<K, V1> navigableMap, final com.google.common.base.Function<? super V1, V2> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return transformEntries((java.util.NavigableMap) navigableMap, new com.google.common.collect.Maps.EntryTransformer() { // from class: com.google.common.collect.Maps$$ExternalSyntheticLambda2
            @Override // com.google.common.collect.Maps.EntryTransformer
            public final java.lang.Object transformEntry(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object apply;
                apply = com.google.common.base.Function.this.apply(obj2);
                return apply;
            }
        });
    }

    public static <K, V1, V2> java.util.Map<K, V2> transformEntries(java.util.Map<K, V1> map, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new com.google.common.collect.Maps.TransformedEntriesMap(map, entryTransformer);
    }

    public static <K, V1, V2> java.util.SortedMap<K, V2> transformEntries(java.util.SortedMap<K, V1> sortedMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new com.google.common.collect.Maps.TransformedEntriesSortedMap(sortedMap, entryTransformer);
    }

    public static <K, V1, V2> java.util.NavigableMap<K, V2> transformEntries(java.util.NavigableMap<K, V1> navigableMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new com.google.common.collect.Maps.TransformedEntriesNavigableMap(navigableMap, entryTransformer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V2, K, V1> java.util.Map.Entry<K, V2> transformEntry(final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer, final java.util.Map.Entry<K, V1> entry) {
        com.google.common.base.Preconditions.checkNotNull(entryTransformer);
        com.google.common.base.Preconditions.checkNotNull(entry);
        return new com.google.common.collect.AbstractMapEntry<K, V2>() { // from class: com.google.common.collect.Maps.9
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public K getKey() {
                return (K) entry.getKey();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public V2 getValue() {
                return (V2) entryTransformer.transformEntry(entry.getKey(), entry.getValue());
            }
        };
    }

    static <K, V1, V2> com.google.common.base.Function<java.util.Map.Entry<K, V1>, java.util.Map.Entry<K, V2>> asEntryToEntryFunction(final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        com.google.common.base.Preconditions.checkNotNull(entryTransformer);
        return new com.google.common.base.Function() { // from class: com.google.common.collect.Maps$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.Map.Entry transformEntry;
                transformEntry = com.google.common.collect.Maps.transformEntry(com.google.common.collect.Maps.EntryTransformer.this, (java.util.Map.Entry) obj);
                return transformEntry;
            }
        };
    }

    /* loaded from: classes9.dex */
    static class TransformedEntriesMap<K, V1, V2> extends com.google.common.collect.Maps.IteratorBasedAbstractMap<K, V2> {
        final java.util.Map<K, V1> fromMap;
        final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer;

        TransformedEntriesMap(java.util.Map<K, V1> map, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            this.fromMap = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
            this.transformer = (com.google.common.collect.Maps.EntryTransformer) com.google.common.base.Preconditions.checkNotNull(entryTransformer);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.fromMap.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            return this.fromMap.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(java.lang.Object obj) {
            V1 v1 = this.fromMap.get(obj);
            if (v1 != null || this.fromMap.containsKey(obj)) {
                return this.transformer.transformEntry(obj, (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(v1));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(java.lang.Object obj) {
            if (this.fromMap.containsKey(obj)) {
                return this.transformer.transformEntry(obj, (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.fromMap.remove(obj)));
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.fromMap.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            return this.fromMap.keySet();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<K, V2>> entryIterator() {
            return com.google.common.collect.Iterators.transform(this.fromMap.entrySet().iterator(), com.google.common.collect.Maps.asEntryToEntryFunction(this.transformer));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection<V2> values() {
            return new com.google.common.collect.Maps.Values(this);
        }
    }

    /* loaded from: classes9.dex */
    static class TransformedEntriesSortedMap<K, V1, V2> extends com.google.common.collect.Maps.TransformedEntriesMap<K, V1, V2> implements java.util.SortedMap<K, V2> {
        protected java.util.SortedMap<K, V1> fromMap() {
            return (java.util.SortedMap) this.fromMap;
        }

        TransformedEntriesSortedMap(java.util.SortedMap<K, V1> sortedMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(sortedMap, entryTransformer);
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super K> comparator() {
            return fromMap().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return fromMap().firstKey();
        }

        public java.util.SortedMap<K, V2> headMap(K k) {
            return com.google.common.collect.Maps.transformEntries((java.util.SortedMap) fromMap().headMap(k), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return fromMap().lastKey();
        }

        public java.util.SortedMap<K, V2> subMap(K k, K k2) {
            return com.google.common.collect.Maps.transformEntries((java.util.SortedMap) fromMap().subMap(k, k2), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        public java.util.SortedMap<K, V2> tailMap(K k) {
            return com.google.common.collect.Maps.transformEntries((java.util.SortedMap) fromMap().tailMap(k), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }
    }

    /* loaded from: classes9.dex */
    static final class TransformedEntriesNavigableMap<K, V1, V2> extends com.google.common.collect.Maps.TransformedEntriesSortedMap<K, V1, V2> implements java.util.NavigableMap<K, V2> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final /* bridge */ /* synthetic */ java.util.SortedMap headMap(java.lang.Object obj) {
            return headMap((com.google.common.collect.Maps.TransformedEntriesNavigableMap<K, V1, V2>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final /* bridge */ /* synthetic */ java.util.SortedMap tailMap(java.lang.Object obj) {
            return tailMap((com.google.common.collect.Maps.TransformedEntriesNavigableMap<K, V1, V2>) obj);
        }

        TransformedEntriesNavigableMap(java.util.NavigableMap<K, V1> navigableMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(navigableMap, entryTransformer);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V2> ceilingEntry(K k) {
            return transformEntry(fromMap().ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return fromMap().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableSet<K> descendingKeySet() {
            return fromMap().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V2> descendingMap() {
            return com.google.common.collect.Maps.transformEntries((java.util.NavigableMap) fromMap().descendingMap(), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V2> firstEntry() {
            return transformEntry(fromMap().firstEntry());
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V2> floorEntry(K k) {
            return transformEntry(fromMap().floorEntry(k));
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return fromMap().floorKey(k);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final java.util.NavigableMap<K, V2> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V2> headMap(K k, boolean z) {
            return com.google.common.collect.Maps.transformEntries((java.util.NavigableMap) fromMap().headMap(k, z), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V2> higherEntry(K k) {
            return transformEntry(fromMap().higherEntry(k));
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return fromMap().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V2> lastEntry() {
            return transformEntry(fromMap().lastEntry());
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V2> lowerEntry(K k) {
            return transformEntry(fromMap().lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return fromMap().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableSet<K> navigableKeySet() {
            return fromMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V2> pollFirstEntry() {
            return transformEntry(fromMap().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V2> pollLastEntry() {
            return transformEntry(fromMap().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V2> subMap(K k, boolean z, K k2, boolean z2) {
            return com.google.common.collect.Maps.transformEntries((java.util.NavigableMap) fromMap().subMap(k, z, k2, z2), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final java.util.NavigableMap<K, V2> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final java.util.NavigableMap<K, V2> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V2> tailMap(K k, boolean z) {
            return com.google.common.collect.Maps.transformEntries((java.util.NavigableMap) fromMap().tailMap(k, z), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        private java.util.Map.Entry<K, V2> transformEntry(java.util.Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return com.google.common.collect.Maps.transformEntry(this.transformer, entry);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        public final java.util.NavigableMap<K, V1> fromMap() {
            return (java.util.NavigableMap) super.fromMap();
        }
    }

    static <K> com.google.common.base.Predicate<java.util.Map.Entry<K, ?>> keyPredicateOnEntries(com.google.common.base.Predicate<? super K> predicate) {
        return com.google.common.base.Predicates.compose(predicate, keyFunction());
    }

    static <V> com.google.common.base.Predicate<java.util.Map.Entry<?, V>> valuePredicateOnEntries(com.google.common.base.Predicate<? super V> predicate) {
        return com.google.common.base.Predicates.compose(predicate, valueFunction());
    }

    public static <K, V> java.util.Map<K, V> filterKeys(java.util.Map<K, V> map, com.google.common.base.Predicate<? super K> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        com.google.common.base.Predicate keyPredicateOnEntries = keyPredicateOnEntries(predicate);
        if (map instanceof com.google.common.collect.Maps.AbstractFilteredMap) {
            return filterFiltered((com.google.common.collect.Maps.AbstractFilteredMap) map, keyPredicateOnEntries);
        }
        return new com.google.common.collect.Maps.FilteredKeyMap((java.util.Map) com.google.common.base.Preconditions.checkNotNull(map), predicate, keyPredicateOnEntries);
    }

    public static <K, V> java.util.SortedMap<K, V> filterKeys(java.util.SortedMap<K, V> sortedMap, com.google.common.base.Predicate<? super K> predicate) {
        return filterEntries((java.util.SortedMap) sortedMap, keyPredicateOnEntries(predicate));
    }

    public static <K, V> java.util.NavigableMap<K, V> filterKeys(java.util.NavigableMap<K, V> navigableMap, com.google.common.base.Predicate<? super K> predicate) {
        return filterEntries((java.util.NavigableMap) navigableMap, keyPredicateOnEntries(predicate));
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> filterKeys(com.google.common.collect.BiMap<K, V> biMap, com.google.common.base.Predicate<? super K> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        return filterEntries((com.google.common.collect.BiMap) biMap, keyPredicateOnEntries(predicate));
    }

    public static <K, V> java.util.Map<K, V> filterValues(java.util.Map<K, V> map, com.google.common.base.Predicate<? super V> predicate) {
        return filterEntries(map, valuePredicateOnEntries(predicate));
    }

    public static <K, V> java.util.SortedMap<K, V> filterValues(java.util.SortedMap<K, V> sortedMap, com.google.common.base.Predicate<? super V> predicate) {
        return filterEntries((java.util.SortedMap) sortedMap, valuePredicateOnEntries(predicate));
    }

    public static <K, V> java.util.NavigableMap<K, V> filterValues(java.util.NavigableMap<K, V> navigableMap, com.google.common.base.Predicate<? super V> predicate) {
        return filterEntries((java.util.NavigableMap) navigableMap, valuePredicateOnEntries(predicate));
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> filterValues(com.google.common.collect.BiMap<K, V> biMap, com.google.common.base.Predicate<? super V> predicate) {
        return filterEntries((com.google.common.collect.BiMap) biMap, valuePredicateOnEntries(predicate));
    }

    public static <K, V> java.util.Map<K, V> filterEntries(java.util.Map<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        if (map instanceof com.google.common.collect.Maps.AbstractFilteredMap) {
            return filterFiltered((com.google.common.collect.Maps.AbstractFilteredMap) map, predicate);
        }
        return new com.google.common.collect.Maps.FilteredEntryMap((java.util.Map) com.google.common.base.Preconditions.checkNotNull(map), predicate);
    }

    public static <K, V> java.util.SortedMap<K, V> filterEntries(java.util.SortedMap<K, V> sortedMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        if (sortedMap instanceof com.google.common.collect.Maps.FilteredEntrySortedMap) {
            return filterFiltered((com.google.common.collect.Maps.FilteredEntrySortedMap) sortedMap, (com.google.common.base.Predicate) predicate);
        }
        return new com.google.common.collect.Maps.FilteredEntrySortedMap((java.util.SortedMap) com.google.common.base.Preconditions.checkNotNull(sortedMap), predicate);
    }

    public static <K, V> java.util.NavigableMap<K, V> filterEntries(java.util.NavigableMap<K, V> navigableMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        if (navigableMap instanceof com.google.common.collect.Maps.FilteredEntryNavigableMap) {
            return filterFiltered((com.google.common.collect.Maps.FilteredEntryNavigableMap) navigableMap, predicate);
        }
        return new com.google.common.collect.Maps.FilteredEntryNavigableMap((java.util.NavigableMap) com.google.common.base.Preconditions.checkNotNull(navigableMap), predicate);
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> filterEntries(com.google.common.collect.BiMap<K, V> biMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        com.google.common.base.Preconditions.checkNotNull(biMap);
        com.google.common.base.Preconditions.checkNotNull(predicate);
        if (biMap instanceof com.google.common.collect.Maps.FilteredEntryBiMap) {
            return filterFiltered((com.google.common.collect.Maps.FilteredEntryBiMap) biMap, (com.google.common.base.Predicate) predicate);
        }
        return new com.google.common.collect.Maps.FilteredEntryBiMap(biMap, predicate);
    }

    private static <K, V> java.util.Map<K, V> filterFiltered(com.google.common.collect.Maps.AbstractFilteredMap<K, V> abstractFilteredMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        return new com.google.common.collect.Maps.FilteredEntryMap(abstractFilteredMap.unfiltered, com.google.common.base.Predicates.and(abstractFilteredMap.predicate, predicate));
    }

    private static <K, V> java.util.SortedMap<K, V> filterFiltered(com.google.common.collect.Maps.FilteredEntrySortedMap<K, V> filteredEntrySortedMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        return new com.google.common.collect.Maps.FilteredEntrySortedMap(filteredEntrySortedMap.sortedMap(), com.google.common.base.Predicates.and(filteredEntrySortedMap.predicate, predicate));
    }

    private static <K, V> java.util.NavigableMap<K, V> filterFiltered(com.google.common.collect.Maps.FilteredEntryNavigableMap<K, V> filteredEntryNavigableMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        return new com.google.common.collect.Maps.FilteredEntryNavigableMap(((com.google.common.collect.Maps.FilteredEntryNavigableMap) filteredEntryNavigableMap).unfiltered, com.google.common.base.Predicates.and(((com.google.common.collect.Maps.FilteredEntryNavigableMap) filteredEntryNavigableMap).entryPredicate, predicate));
    }

    private static <K, V> com.google.common.collect.BiMap<K, V> filterFiltered(com.google.common.collect.Maps.FilteredEntryBiMap<K, V> filteredEntryBiMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
        return new com.google.common.collect.Maps.FilteredEntryBiMap(filteredEntryBiMap.unfiltered(), com.google.common.base.Predicates.and(filteredEntryBiMap.predicate, predicate));
    }

    /* loaded from: classes9.dex */
    static abstract class AbstractFilteredMap<K, V> extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, V> {
        final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate;
        final java.util.Map<K, V> unfiltered;

        AbstractFilteredMap(java.util.Map<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
            this.unfiltered = map;
            this.predicate = predicate;
        }

        boolean apply(java.lang.Object obj, V v) {
            return this.predicate.apply(com.google.common.collect.Maps.immutableEntry(obj, v));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            com.google.common.base.Preconditions.checkArgument(apply(k, v));
            return this.unfiltered.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(java.util.Map<? extends K, ? extends V> map) {
            for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                com.google.common.base.Preconditions.checkArgument(apply(entry.getKey(), entry.getValue()));
            }
            this.unfiltered.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            return this.unfiltered.containsKey(obj) && apply(obj, this.unfiltered.get(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(java.lang.Object obj) {
            V v = this.unfiltered.get(obj);
            if (v == null || !apply(obj, v)) {
                return null;
            }
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(java.lang.Object obj) {
            if (containsKey(obj)) {
                return this.unfiltered.remove(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Collection<V> createValues() {
            return new com.google.common.collect.Maps.FilteredMapValues(this, this.unfiltered, this.predicate);
        }
    }

    /* loaded from: classes9.dex */
    static final class FilteredMapValues<K, V> extends com.google.common.collect.Maps.Values<K, V> {
        final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate;
        final java.util.Map<K, V> unfiltered;

        FilteredMapValues(java.util.Map<K, V> map, java.util.Map<K, V> map2, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
            super(map);
            this.unfiltered = map2;
            this.predicate = predicate;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean remove(java.lang.Object obj) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                if (this.predicate.apply(next) && java.util.Objects.equals(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(java.util.Collection<?> collection) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                if (this.predicate.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(java.util.Collection<?> collection) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                if (this.predicate.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final java.lang.Object[] toArray() {
            return com.google.common.collect.Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) com.google.common.collect.Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    /* loaded from: classes9.dex */
    static final class FilteredKeyMap<K, V> extends com.google.common.collect.Maps.AbstractFilteredMap<K, V> {
        final com.google.common.base.Predicate<? super K> keyPredicate;

        FilteredKeyMap(java.util.Map<K, V> map, com.google.common.base.Predicate<? super K> predicate, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate2) {
            super(map, predicate2);
            this.keyPredicate = predicate;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected final java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
            return com.google.common.collect.Sets.filter(this.unfiltered.entrySet(), this.predicate);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        final java.util.Set<K> createKeySet() {
            return com.google.common.collect.Sets.filter(this.unfiltered.keySet(), this.keyPredicate);
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return this.unfiltered.containsKey(obj) && this.keyPredicate.apply(obj);
        }
    }

    /* loaded from: classes9.dex */
    static class FilteredEntryMap<K, V> extends com.google.common.collect.Maps.AbstractFilteredMap<K, V> {
        final java.util.Set<java.util.Map.Entry<K, V>> filteredEntrySet;

        FilteredEntryMap(java.util.Map<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
            super(map, predicate);
            this.filteredEntrySet = com.google.common.collect.Sets.filter(map.entrySet(), this.predicate);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
            return new com.google.common.collect.Maps.FilteredEntryMap.EntrySet();
        }

        final class EntrySet extends com.google.common.collect.ForwardingSet<java.util.Map.Entry<K, V>> {
            private EntrySet() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public final java.util.Set<java.util.Map.Entry<K, V>> delegate() {
                return com.google.common.collect.Maps.FilteredEntryMap.this.filteredEntrySet;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<K, V>, java.util.Map.Entry<K, V>>(com.google.common.collect.Maps.FilteredEntryMap.this.filteredEntrySet.iterator()) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    @Override // com.google.common.collect.TransformedIterator
                    public java.util.Map.Entry<K, V> transform(final java.util.Map.Entry<K, V> entry) {
                        return new com.google.common.collect.ForwardingMapEntry<K, V>(this) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1.1
                            final /* synthetic */ com.google.common.collect.Maps.FilteredEntryMap.EntrySet.AnonymousClass1 this$2;

                            {
                                this.this$2 = this;
                            }

                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                            public java.util.Map.Entry<K, V> delegate() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                            public V setValue(V v) {
                                com.google.common.base.Preconditions.checkArgument(com.google.common.collect.Maps.FilteredEntryMap.this.apply(getKey(), v));
                                return (V) super.setValue(v);
                            }
                        };
                    }
                };
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Set<K> createKeySet() {
            return new com.google.common.collect.Maps.FilteredEntryMap.KeySet();
        }

        static <K, V> boolean removeAllKeys(java.util.Map<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate, java.util.Collection<?> collection) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        static <K, V> boolean retainAllKeys(java.util.Map<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate, java.util.Collection<?> collection) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        class KeySet extends com.google.common.collect.Maps.KeySet<K, V> {
            KeySet() {
                super(com.google.common.collect.Maps.FilteredEntryMap.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object obj) {
                if (!com.google.common.collect.Maps.FilteredEntryMap.this.containsKey(obj)) {
                    return false;
                }
                com.google.common.collect.Maps.FilteredEntryMap.this.unfiltered.remove(obj);
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(java.util.Collection<?> collection) {
                return com.google.common.collect.Maps.FilteredEntryMap.removeAllKeys(com.google.common.collect.Maps.FilteredEntryMap.this.unfiltered, com.google.common.collect.Maps.FilteredEntryMap.this.predicate, collection);
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(java.util.Collection<?> collection) {
                return com.google.common.collect.Maps.FilteredEntryMap.retainAllKeys(com.google.common.collect.Maps.FilteredEntryMap.this.unfiltered, com.google.common.collect.Maps.FilteredEntryMap.this.predicate, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public java.lang.Object[] toArray() {
                return com.google.common.collect.Lists.newArrayList(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) com.google.common.collect.Lists.newArrayList(iterator()).toArray(tArr);
            }
        }
    }

    /* loaded from: classes9.dex */
    static final class FilteredEntrySortedMap<K, V> extends com.google.common.collect.Maps.FilteredEntryMap<K, V> implements java.util.SortedMap<K, V> {
        FilteredEntrySortedMap(java.util.SortedMap<K, V> sortedMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
            super(sortedMap, predicate);
        }

        final java.util.SortedMap<K, V> sortedMap() {
            return (java.util.SortedMap) this.unfiltered;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final java.util.SortedSet<K> keySet() {
            return (java.util.SortedSet) super.keySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.SortedSet<K> createKeySet() {
            return new com.google.common.collect.Maps.FilteredEntrySortedMap.SortedKeySet();
        }

        final class SortedKeySet extends com.google.common.collect.Maps.FilteredEntryMap<K, V>.KeySet implements java.util.SortedSet<K> {
            SortedKeySet() {
                super();
            }

            @Override // java.util.SortedSet
            public final java.util.Comparator<? super K> comparator() {
                return com.google.common.collect.Maps.FilteredEntrySortedMap.this.sortedMap().comparator();
            }

            @Override // java.util.SortedSet
            public final java.util.SortedSet<K> subSet(K k, K k2) {
                return (java.util.SortedSet) com.google.common.collect.Maps.FilteredEntrySortedMap.this.subMap(k, k2).keySet();
            }

            @Override // java.util.SortedSet
            public final java.util.SortedSet<K> headSet(K k) {
                return (java.util.SortedSet) com.google.common.collect.Maps.FilteredEntrySortedMap.this.headMap(k).keySet();
            }

            @Override // java.util.SortedSet
            public final java.util.SortedSet<K> tailSet(K k) {
                return (java.util.SortedSet) com.google.common.collect.Maps.FilteredEntrySortedMap.this.tailMap(k).keySet();
            }

            @Override // java.util.SortedSet
            public final K first() {
                return (K) com.google.common.collect.Maps.FilteredEntrySortedMap.this.firstKey();
            }

            @Override // java.util.SortedSet
            public final K last() {
                return (K) com.google.common.collect.Maps.FilteredEntrySortedMap.this.lastKey();
            }
        }

        @Override // java.util.SortedMap
        public final java.util.Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return keySet().iterator().next();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        public final K lastKey() {
            java.util.SortedMap<K, V> sortedMap = sortedMap();
            while (true) {
                K lastKey = sortedMap.lastKey();
                if (apply(lastKey, com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.unfiltered.get(lastKey)))) {
                    return lastKey;
                }
                sortedMap = sortedMap().headMap(lastKey);
            }
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<K, V> headMap(K k) {
            return new com.google.common.collect.Maps.FilteredEntrySortedMap(sortedMap().headMap(k), this.predicate);
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<K, V> subMap(K k, K k2) {
            return new com.google.common.collect.Maps.FilteredEntrySortedMap(sortedMap().subMap(k, k2), this.predicate);
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<K, V> tailMap(K k) {
            return new com.google.common.collect.Maps.FilteredEntrySortedMap(sortedMap().tailMap(k), this.predicate);
        }
    }

    /* loaded from: classes9.dex */
    static final class FilteredEntryNavigableMap<K, V> extends com.google.common.collect.AbstractNavigableMap<K, V> {
        private final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate;
        private final java.util.Map<K, V> filteredDelegate;
        private final java.util.NavigableMap<K, V> unfiltered;

        FilteredEntryNavigableMap(java.util.NavigableMap<K, V> navigableMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
            this.unfiltered = (java.util.NavigableMap) com.google.common.base.Preconditions.checkNotNull(navigableMap);
            this.entryPredicate = predicate;
            this.filteredDelegate = new com.google.common.collect.Maps.FilteredEntryMap(navigableMap, predicate);
        }

        @Override // java.util.SortedMap
        public final java.util.Comparator<? super K> comparator() {
            return this.unfiltered.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final java.util.NavigableSet<K> navigableKeySet() {
            return new com.google.common.collect.Maps.NavigableKeySet<K, V>(this) { // from class: com.google.common.collect.Maps.FilteredEntryNavigableMap.1
                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(java.util.Collection<?> collection) {
                    return com.google.common.collect.Maps.FilteredEntryMap.removeAllKeys(com.google.common.collect.Maps.FilteredEntryNavigableMap.this.unfiltered, com.google.common.collect.Maps.FilteredEntryNavigableMap.this.entryPredicate, collection);
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(java.util.Collection<?> collection) {
                    return com.google.common.collect.Maps.FilteredEntryMap.retainAllKeys(com.google.common.collect.Maps.FilteredEntryNavigableMap.this.unfiltered, com.google.common.collect.Maps.FilteredEntryNavigableMap.this.entryPredicate, collection);
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final java.util.Collection<V> values() {
            return new com.google.common.collect.Maps.FilteredMapValues(this, this.unfiltered, this.entryPredicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return com.google.common.collect.Iterators.filter(this.unfiltered.entrySet().iterator(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        final java.util.Iterator<java.util.Map.Entry<K, V>> descendingEntryIterator() {
            return com.google.common.collect.Iterators.filter(this.unfiltered.descendingMap().entrySet().iterator(), this.entryPredicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.filteredDelegate.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return !com.google.common.collect.Iterables.any(this.unfiltered.entrySet(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public final V get(java.lang.Object obj) {
            return this.filteredDelegate.get(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return this.filteredDelegate.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V put(K k, V v) {
            return this.filteredDelegate.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V remove(java.lang.Object obj) {
            return this.filteredDelegate.remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void putAll(java.util.Map<? extends K, ? extends V> map) {
            this.filteredDelegate.putAll(map);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.filteredDelegate.clear();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            return this.filteredDelegate.entrySet();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final java.util.Map.Entry<K, V> pollFirstEntry() {
            return (java.util.Map.Entry) com.google.common.collect.Iterables.removeFirstMatching(this.unfiltered.entrySet(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final java.util.Map.Entry<K, V> pollLastEntry() {
            return (java.util.Map.Entry) com.google.common.collect.Iterables.removeFirstMatching(this.unfiltered.descendingMap().entrySet(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final java.util.NavigableMap<K, V> descendingMap() {
            return com.google.common.collect.Maps.filterEntries((java.util.NavigableMap) this.unfiltered.descendingMap(), (com.google.common.base.Predicate) this.entryPredicate);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return com.google.common.collect.Maps.filterEntries((java.util.NavigableMap) this.unfiltered.subMap(k, z, k2, z2), (com.google.common.base.Predicate) this.entryPredicate);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> headMap(K k, boolean z) {
            return com.google.common.collect.Maps.filterEntries((java.util.NavigableMap) this.unfiltered.headMap(k, z), (com.google.common.base.Predicate) this.entryPredicate);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> tailMap(K k, boolean z) {
            return com.google.common.collect.Maps.filterEntries((java.util.NavigableMap) this.unfiltered.tailMap(k, z), (com.google.common.base.Predicate) this.entryPredicate);
        }
    }

    /* loaded from: classes9.dex */
    static final class FilteredEntryBiMap<K, V> extends com.google.common.collect.Maps.FilteredEntryMap<K, V> implements com.google.common.collect.BiMap<K, V> {
        private final com.google.common.collect.BiMap<V, K> inverse;

        private static <K, V> com.google.common.base.Predicate<java.util.Map.Entry<V, K>> inversePredicate(final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
            return new com.google.common.base.Predicate() { // from class: com.google.common.collect.Maps$FilteredEntryBiMap$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    boolean apply;
                    apply = com.google.common.base.Predicate.this.apply(com.google.common.collect.Maps.immutableEntry(r2.getValue(), ((java.util.Map.Entry) obj).getKey()));
                    return apply;
                }
            };
        }

        FilteredEntryBiMap(com.google.common.collect.BiMap<K, V> biMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
            super(biMap, predicate);
            this.inverse = new com.google.common.collect.Maps.FilteredEntryBiMap(biMap.inverse(), inversePredicate(predicate), this);
        }

        private FilteredEntryBiMap(com.google.common.collect.BiMap<K, V> biMap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate, com.google.common.collect.BiMap<V, K> biMap2) {
            super(biMap, predicate);
            this.inverse = biMap2;
        }

        final com.google.common.collect.BiMap<K, V> unfiltered() {
            return (com.google.common.collect.BiMap) this.unfiltered;
        }

        @Override // com.google.common.collect.BiMap
        public final V forcePut(K k, V v) {
            com.google.common.base.Preconditions.checkArgument(apply(k, v));
            return unfiltered().forcePut(k, v);
        }

        @Override // com.google.common.collect.BiMap
        public final com.google.common.collect.BiMap<V, K> inverse() {
            return this.inverse;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final java.util.Set<V> values() {
            return this.inverse.keySet();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> java.util.NavigableMap<K, V> unmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> navigableMap) {
        com.google.common.base.Preconditions.checkNotNull(navigableMap);
        return navigableMap instanceof com.google.common.collect.Maps.UnmodifiableNavigableMap ? navigableMap : new com.google.common.collect.Maps.UnmodifiableNavigableMap(navigableMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> java.util.Map.Entry<K, V> unmodifiableOrNull(java.util.Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return unmodifiableEntry(entry);
    }

    /* loaded from: classes9.dex */
    static final class UnmodifiableNavigableMap<K, V> extends com.google.common.collect.ForwardingSortedMap<K, V> implements java.util.NavigableMap<K, V>, java.io.Serializable {
        private final java.util.NavigableMap<K, ? extends V> delegate;

        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient com.google.common.collect.Maps.UnmodifiableNavigableMap<K, V> descendingMap;

        UnmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> navigableMap) {
            this.delegate = navigableMap;
        }

        UnmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> navigableMap, com.google.common.collect.Maps.UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
            this.delegate = navigableMap;
            this.descendingMap = unmodifiableNavigableMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.util.SortedMap<K, V> delegate() {
            return java.util.Collections.unmodifiableSortedMap(this.delegate);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> lowerEntry(K k) {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return this.delegate.lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> floorEntry(K k) {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.floorEntry(k));
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return this.delegate.floorKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> ceilingEntry(K k) {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return this.delegate.ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> higherEntry(K k) {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.higherEntry(k));
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return this.delegate.higherKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> firstEntry() {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.firstEntry());
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> lastEntry() {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.lastEntry());
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> pollFirstEntry() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> pollLastEntry() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> descendingMap() {
            com.google.common.collect.Maps.UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap = this.descendingMap;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            com.google.common.collect.Maps.UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap2 = new com.google.common.collect.Maps.UnmodifiableNavigableMap<>(this.delegate.descendingMap(), this);
            this.descendingMap = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final java.util.Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableSet<K> navigableKeySet() {
            return com.google.common.collect.Sets.unmodifiableNavigableSet(this.delegate.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableSet<K> descendingKeySet() {
            return com.google.common.collect.Sets.unmodifiableNavigableSet(this.delegate.descendingKeySet());
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final java.util.SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return com.google.common.collect.Maps.unmodifiableNavigableMap(this.delegate.subMap(k, z, k2, z2));
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final java.util.SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> headMap(K k, boolean z) {
            return com.google.common.collect.Maps.unmodifiableNavigableMap(this.delegate.headMap(k, z));
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final java.util.SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> tailMap(K k, boolean z) {
            return com.google.common.collect.Maps.unmodifiableNavigableMap(this.delegate.tailMap(k, z));
        }
    }

    public static <K, V> java.util.NavigableMap<K, V> synchronizedNavigableMap(java.util.NavigableMap<K, V> navigableMap) {
        return com.google.common.collect.Synchronized.navigableMap(navigableMap);
    }

    /* loaded from: classes9.dex */
    static abstract class ViewCachingAbstractMap<K, V> extends java.util.AbstractMap<K, V> {

        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.Set<K> keySet;

        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.Collection<V> values;

        abstract java.util.Set<java.util.Map.Entry<K, V>> createEntrySet();

        ViewCachingAbstractMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            java.util.Set<java.util.Map.Entry<K, V>> createEntrySet = createEntrySet();
            this.entrySet = createEntrySet;
            return createEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            java.util.Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            java.util.Set<K> createKeySet = createKeySet();
            this.keySet = createKeySet;
            return createKeySet;
        }

        java.util.Set<K> createKeySet() {
            return new com.google.common.collect.Maps.KeySet(this);
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Collection<V> values() {
            java.util.Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            java.util.Collection<V> createValues = createValues();
            this.values = createValues;
            return createValues;
        }

        java.util.Collection<V> createValues() {
            return new com.google.common.collect.Maps.Values(this);
        }
    }

    /* loaded from: classes9.dex */
    static abstract class IteratorBasedAbstractMap<K, V> extends java.util.AbstractMap<K, V> {
        abstract java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator();

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();

        IteratorBasedAbstractMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            return new com.google.common.collect.Maps.EntrySet<K, V>() { // from class: com.google.common.collect.Maps.IteratorBasedAbstractMap.1
                @Override // com.google.common.collect.Maps.EntrySet
                java.util.Map<K, V> map() {
                    return com.google.common.collect.Maps.IteratorBasedAbstractMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    return com.google.common.collect.Maps.IteratorBasedAbstractMap.this.entryIterator();
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            com.google.common.collect.Iterators.clear(entryIterator());
        }
    }

    static <V> V safeGet(java.util.Map<?, V> map, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return null;
        }
    }

    static boolean safeContainsKey(java.util.Map<?, ?> map, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    static <V> V safeRemove(java.util.Map<?, V> map, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return null;
        }
    }

    static boolean containsKeyImpl(java.util.Map<?, ?> map, java.lang.Object obj) {
        return com.google.common.collect.Iterators.contains(keyIterator(map.entrySet().iterator()), obj);
    }

    static boolean containsValueImpl(java.util.Map<?, ?> map, java.lang.Object obj) {
        return com.google.common.collect.Iterators.contains(valueIterator(map.entrySet().iterator()), obj);
    }

    static <K, V> boolean containsEntryImpl(java.util.Collection<java.util.Map.Entry<K, V>> collection, java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return collection.contains(unmodifiableEntry((java.util.Map.Entry) obj));
        }
        return false;
    }

    static <K, V> boolean removeEntryImpl(java.util.Collection<java.util.Map.Entry<K, V>> collection, java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return collection.remove(unmodifiableEntry((java.util.Map.Entry) obj));
        }
        return false;
    }

    static boolean equalsImpl(java.util.Map<?, ?> map, java.lang.Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return map.entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    static java.lang.String toStringImpl(java.util.Map<?, ?> map) {
        java.lang.StringBuilder newStringBuilderForCollection = com.google.common.collect.Collections2.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (java.util.Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                newStringBuilderForCollection.append(", ");
            }
            newStringBuilderForCollection.append(entry.getKey());
            newStringBuilderForCollection.append('=');
            newStringBuilderForCollection.append(entry.getValue());
            z = false;
        }
        newStringBuilderForCollection.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return newStringBuilderForCollection.toString();
    }

    static <K, V> void putAllImpl(java.util.Map<K, V> map, java.util.Map<? extends K, ? extends V> map2) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    /* loaded from: classes9.dex */
    static class KeySet<K, V> extends com.google.common.collect.Sets.ImprovedAbstractSet<K> {
        final java.util.Map<K, V> map;

        KeySet(java.util.Map<K, V> map) {
            this.map = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
        }

        java.util.Map<K, V> map() {
            return this.map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            return com.google.common.collect.Maps.keyIterator(map().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return map().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            if (!contains(obj)) {
                return false;
            }
            map().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            map().clear();
        }
    }

    static <K> K keyOrNull(java.util.Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static <V> V valueOrNull(java.util.Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    /* loaded from: classes9.dex */
    static class SortedKeySet<K, V> extends com.google.common.collect.Maps.KeySet<K, V> implements java.util.SortedSet<K> {
        SortedKeySet(java.util.SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.KeySet
        public java.util.SortedMap<K, V> map() {
            return (java.util.SortedMap) super.map();
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super K> comparator() {
            return map().comparator();
        }

        public java.util.SortedSet<K> subSet(K k, K k2) {
            return new com.google.common.collect.Maps.SortedKeySet(map().subMap(k, k2));
        }

        public java.util.SortedSet<K> headSet(K k) {
            return new com.google.common.collect.Maps.SortedKeySet(map().headMap(k));
        }

        public java.util.SortedSet<K> tailSet(K k) {
            return new com.google.common.collect.Maps.SortedKeySet(map().tailMap(k));
        }

        @Override // java.util.SortedSet
        public K first() {
            return map().firstKey();
        }

        @Override // java.util.SortedSet
        public K last() {
            return map().lastKey();
        }
    }

    /* loaded from: classes9.dex */
    static class NavigableKeySet<K, V> extends com.google.common.collect.Maps.SortedKeySet<K, V> implements java.util.NavigableSet<K> {
        NavigableKeySet(java.util.NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public java.util.NavigableMap<K, V> map() {
            return (java.util.NavigableMap) this.map;
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return map().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return map().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return map().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return map().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) com.google.common.collect.Maps.keyOrNull(map().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) com.google.common.collect.Maps.keyOrNull(map().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> descendingSet() {
            return map().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return map().subMap(k, z, k2, z2).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> headSet(K k, boolean z) {
            return map().headMap(k, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> tailSet(K k, boolean z) {
            return map().tailMap(k, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<K> tailSet(K k) {
            return tailSet(k, true);
        }
    }

    /* loaded from: classes9.dex */
    static class Values<K, V> extends java.util.AbstractCollection<V> {
        final java.util.Map<K, V> map;

        Values(java.util.Map<K, V> map) {
            this.map = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
        }

        final java.util.Map<K, V> map() {
            return this.map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return com.google.common.collect.Maps.valueIterator(map().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            try {
                return super.remove(obj);
            } catch (java.lang.UnsupportedOperationException unused) {
                for (java.util.Map.Entry<K, V> entry : map().entrySet()) {
                    if (java.util.Objects.equals(obj, entry.getValue())) {
                        map().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> collection) {
            try {
                return super.removeAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection));
            } catch (java.lang.UnsupportedOperationException unused) {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.util.Map.Entry<K, V> entry : map().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map().keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> collection) {
            try {
                return super.retainAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection));
            } catch (java.lang.UnsupportedOperationException unused) {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.util.Map.Entry<K, V> entry : map().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map().keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return map().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return map().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            map().clear();
        }
    }

    /* loaded from: classes9.dex */
    static abstract class EntrySet<K, V> extends com.google.common.collect.Sets.ImprovedAbstractSet<java.util.Map.Entry<K, V>> {
        abstract java.util.Map<K, V> map();

        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            map().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object safeGet = com.google.common.collect.Maps.safeGet(map(), key);
            if (java.util.Objects.equals(safeGet, entry.getValue())) {
                return safeGet != null || map().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                return map().keySet().remove(((java.util.Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> collection) {
            try {
                return super.removeAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection));
            } catch (java.lang.UnsupportedOperationException unused) {
                return com.google.common.collect.Sets.removeAllImpl(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> collection) {
            try {
                return super.retainAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection));
            } catch (java.lang.UnsupportedOperationException unused) {
                java.util.HashSet newHashSetWithExpectedSize = com.google.common.collect.Sets.newHashSetWithExpectedSize(collection.size());
                for (java.lang.Object obj : collection) {
                    if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                        newHashSetWithExpectedSize.add(((java.util.Map.Entry) obj).getKey());
                    }
                }
                return map().keySet().retainAll(newHashSetWithExpectedSize);
            }
        }
    }

    /* loaded from: classes9.dex */
    static abstract class DescendingMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements java.util.NavigableMap<K, V> {

        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.Comparator<? super K> comparator;

        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.NavigableSet<K> navigableKeySet;

        abstract java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator();

        abstract java.util.NavigableMap<K, V> forward();

        DescendingMap() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.util.Map<K, V> delegate() {
            return forward();
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super K> comparator() {
            java.util.Comparator<? super K> comparator = this.comparator;
            if (comparator != null) {
                return comparator;
            }
            java.util.Comparator<? super K> comparator2 = forward().comparator();
            if (comparator2 == null) {
                comparator2 = com.google.common.collect.Ordering.natural();
            }
            com.google.common.collect.Ordering reverse = reverse(comparator2);
            this.comparator = reverse;
            return reverse;
        }

        private static <T> com.google.common.collect.Ordering<T> reverse(java.util.Comparator<T> comparator) {
            return com.google.common.collect.Ordering.from(comparator).reverse();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return forward().lastKey();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return forward().firstKey();
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> lowerEntry(K k) {
            return forward().higherEntry(k);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return forward().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> floorEntry(K k) {
            return forward().ceilingEntry(k);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return forward().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> ceilingEntry(K k) {
            return forward().floorEntry(k);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return forward().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> higherEntry(K k) {
            return forward().lowerEntry(k);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return forward().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> firstEntry() {
            return forward().lastEntry();
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> lastEntry() {
            return forward().firstEntry();
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> pollFirstEntry() {
            return forward().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> pollLastEntry() {
            return forward().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
            return forward();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            java.util.Set<java.util.Map.Entry<K, V>> createEntrySet = createEntrySet();
            this.entrySet = createEntrySet;
            return createEntrySet;
        }

        java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
            return new com.google.common.collect.Maps.EntrySet<K, V>() { // from class: com.google.common.collect.Maps.DescendingMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                final java.util.Map<K, V> map() {
                    return com.google.common.collect.Maps.DescendingMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    return com.google.common.collect.Maps.DescendingMap.this.entryIterator();
                }
            };
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
            java.util.NavigableSet<K> navigableSet = this.navigableKeySet;
            if (navigableSet != null) {
                return navigableSet;
            }
            com.google.common.collect.Maps.NavigableKeySet navigableKeySet = new com.google.common.collect.Maps.NavigableKeySet(this);
            this.navigableKeySet = navigableKeySet;
            return navigableKeySet;
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
            return forward().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return forward().subMap(k2, z2, k, z).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public java.util.SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(K k, boolean z) {
            return forward().tailMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public java.util.SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(K k, boolean z) {
            return forward().headMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public java.util.SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Collection<V> values() {
            return new com.google.common.collect.Maps.Values(this);
        }

        @Override // com.google.common.collect.ForwardingObject
        public java.lang.String toString() {
            return standardToString();
        }
    }

    static <E> com.google.common.collect.ImmutableMap<E, java.lang.Integer> indexMap(java.util.Collection<E> collection) {
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(collection.size());
        java.util.Iterator<E> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            builder.put(it.next(), java.lang.Integer.valueOf(i));
            i++;
        }
        return builder.buildOrThrow();
    }

    public static <K extends java.lang.Comparable<? super K>, V> java.util.NavigableMap<K, V> subMap(java.util.NavigableMap<K, V> navigableMap, com.google.common.collect.Range<K> range) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != com.google.common.collect.Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            com.google.common.base.Preconditions.checkArgument(navigableMap.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            return navigableMap.subMap(range.lowerEndpoint(), range.lowerBoundType() == com.google.common.collect.BoundType.CLOSED, range.upperEndpoint(), range.upperBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        if (range.hasLowerBound()) {
            return navigableMap.tailMap(range.lowerEndpoint(), range.lowerBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return navigableMap.headMap(range.upperEndpoint(), range.upperBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        return (java.util.NavigableMap) com.google.common.base.Preconditions.checkNotNull(navigableMap);
    }
}
