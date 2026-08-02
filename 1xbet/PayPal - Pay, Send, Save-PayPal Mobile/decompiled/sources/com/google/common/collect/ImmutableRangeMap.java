package com.google.common.collect;

/* loaded from: classes9.dex */
public class ImmutableRangeMap<K extends java.lang.Comparable<?>, V> implements com.google.common.collect.RangeMap<K, V>, java.io.Serializable {
    private static final com.google.common.collect.ImmutableRangeMap<java.lang.Comparable<?>, java.lang.Object> EMPTY = new com.google.common.collect.ImmutableRangeMap<>(com.google.common.collect.ImmutableList.of(), com.google.common.collect.ImmutableList.of());
    private static final long serialVersionUID = 0;
    private final transient com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>> ranges;
    private final transient com.google.common.collect.ImmutableList<V> values;

    public static <T, K extends java.lang.Comparable<? super K>, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableRangeMap<K, V>> toImmutableRangeMap(java.util.function.Function<? super T, com.google.common.collect.Range<K>> function, java.util.function.Function<? super T, ? extends V> function2) {
        return com.google.common.collect.CollectCollectors.toImmutableRangeMap(function, function2);
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> of() {
        return (com.google.common.collect.ImmutableRangeMap<K, V>) EMPTY;
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> of(com.google.common.collect.Range<K> range, V v) {
        return new com.google.common.collect.ImmutableRangeMap<>(com.google.common.collect.ImmutableList.of(range), com.google.common.collect.ImmutableList.of(v));
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> copyOf(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
        if (rangeMap instanceof com.google.common.collect.ImmutableRangeMap) {
            return (com.google.common.collect.ImmutableRangeMap) rangeMap;
        }
        java.util.Map<com.google.common.collect.Range<K>, ? extends V> asMapOfRanges = rangeMap.asMapOfRanges();
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(asMapOfRanges.size());
        com.google.common.collect.ImmutableList.Builder builder2 = new com.google.common.collect.ImmutableList.Builder(asMapOfRanges.size());
        for (java.util.Map.Entry<com.google.common.collect.Range<K>, ? extends V> entry : asMapOfRanges.entrySet()) {
            builder.add((com.google.common.collect.ImmutableList.Builder) entry.getKey());
            builder2.add((com.google.common.collect.ImmutableList.Builder) entry.getValue());
        }
        return new com.google.common.collect.ImmutableRangeMap<>(builder.build(), builder2.build());
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableRangeMap.Builder<>();
    }

    @com.google.errorprone.annotations.DoNotMock
    public static final class Builder<K extends java.lang.Comparable<?>, V> {
        private final java.util.List<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entries = new java.util.ArrayList();

        public final com.google.common.collect.ImmutableRangeMap.Builder<K, V> put(com.google.common.collect.Range<K> range, V v) {
            com.google.common.base.Preconditions.checkNotNull(range);
            com.google.common.base.Preconditions.checkNotNull(v);
            com.google.common.base.Preconditions.checkArgument(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.entries.add(com.google.common.collect.Maps.immutableEntry(range, v));
            return this;
        }

        public final com.google.common.collect.ImmutableRangeMap.Builder<K, V> putAll(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
            for (java.util.Map.Entry<com.google.common.collect.Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        final com.google.common.collect.ImmutableRangeMap.Builder<K, V> combine(com.google.common.collect.ImmutableRangeMap.Builder<K, V> builder) {
            this.entries.addAll(builder.entries);
            return this;
        }

        public final com.google.common.collect.ImmutableRangeMap<K, V> build() {
            java.util.Collections.sort(this.entries, com.google.common.collect.Range.rangeLexOrdering().onKeys());
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(this.entries.size());
            com.google.common.collect.ImmutableList.Builder builder2 = new com.google.common.collect.ImmutableList.Builder(this.entries.size());
            for (int i = 0; i < this.entries.size(); i++) {
                com.google.common.collect.Range<K> key = this.entries.get(i).getKey();
                if (i > 0) {
                    com.google.common.collect.Range<K> key2 = this.entries.get(i - 1).getKey();
                    if (key.isConnected(key2) && !key.intersection(key2).isEmpty()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Overlapping ranges: range ");
                        sb.append(key2);
                        sb.append(" overlaps with entry ");
                        sb.append(key);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                }
                builder.add((com.google.common.collect.ImmutableList.Builder) key);
                builder2.add((com.google.common.collect.ImmutableList.Builder) this.entries.get(i).getValue());
            }
            return new com.google.common.collect.ImmutableRangeMap<>(builder.build(), builder2.build());
        }
    }

    ImmutableRangeMap(com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>> immutableList, com.google.common.collect.ImmutableList<V> immutableList2) {
        this.ranges = immutableList;
        this.values = immutableList2;
    }

    @Override // com.google.common.collect.RangeMap
    public V get(K k) {
        int binarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, new com.google.common.collect.ImmutableRangeMap$$ExternalSyntheticLambda1(), com.google.common.collect.Cut.belowValue(k), com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (binarySearch != -1 && this.ranges.get(binarySearch).contains(k)) {
            return this.values.get(binarySearch);
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    public java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K k) {
        int binarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, new com.google.common.collect.ImmutableRangeMap$$ExternalSyntheticLambda1(), com.google.common.collect.Cut.belowValue(k), com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (binarySearch == -1) {
            return null;
        }
        com.google.common.collect.Range<K> range = this.ranges.get(binarySearch);
        if (range.contains(k)) {
            return com.google.common.collect.Maps.immutableEntry(range, this.values.get(binarySearch));
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.Range<K> span() {
        if (this.ranges.isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return com.google.common.collect.Range.create(this.ranges.get(0).lowerBound, this.ranges.get(r1.size() - 1).upperBound);
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public final void put(com.google.common.collect.Range<K> range, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public final void putCoalescing(com.google.common.collect.Range<K> range, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public final void putAll(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public final void remove(com.google.common.collect.Range<K> range) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> asMapOfRanges() {
        if (this.ranges.isEmpty()) {
            return com.google.common.collect.ImmutableMap.of();
        }
        return new com.google.common.collect.ImmutableSortedMap(new com.google.common.collect.RegularImmutableSortedSet(this.ranges, com.google.common.collect.Range.rangeLexOrdering()), this.values);
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges() {
        if (this.ranges.isEmpty()) {
            return com.google.common.collect.ImmutableMap.of();
        }
        return new com.google.common.collect.ImmutableSortedMap(new com.google.common.collect.RegularImmutableSortedSet(this.ranges.reverse(), com.google.common.collect.Range.rangeLexOrdering().reverse()), this.values.reverse());
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableRangeMap<K, V> subRangeMap(final com.google.common.collect.Range<K> range) {
        if (((com.google.common.collect.Range) com.google.common.base.Preconditions.checkNotNull(range)).isEmpty()) {
            return of();
        }
        if (this.ranges.isEmpty() || range.encloses(span())) {
            return this;
        }
        final int binarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, new com.google.common.collect.ImmutableRangeMap$$ExternalSyntheticLambda0(), range.lowerBound, com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        int binarySearch2 = com.google.common.collect.SortedLists.binarySearch(this.ranges, new com.google.common.collect.ImmutableRangeMap$$ExternalSyntheticLambda1(), range.upperBound, com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (binarySearch >= binarySearch2) {
            return of();
        }
        final int i = binarySearch2 - binarySearch;
        return (com.google.common.collect.ImmutableRangeMap<K, V>) new com.google.common.collect.ImmutableRangeMap<K, V>(this, new com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>>(this) { // from class: com.google.common.collect.ImmutableRangeMap.1
            final /* synthetic */ com.google.common.collect.ImmutableRangeMap this$0;

            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public com.google.common.collect.Range<K> get(int i2) {
                com.google.common.base.Preconditions.checkElementIndex(i2, i);
                return (i2 == 0 || i2 == i + (-1)) ? ((com.google.common.collect.Range) this.this$0.ranges.get(i2 + binarySearch)).intersection(range) : (com.google.common.collect.Range) this.this$0.ranges.get(i2 + binarySearch);
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        }, this.values.subList(binarySearch, binarySearch2)) { // from class: com.google.common.collect.ImmutableRangeMap.2
            final /* synthetic */ com.google.common.collect.ImmutableRangeMap this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public /* bridge */ /* synthetic */ java.util.Map asDescendingMapOfRanges() {
                return super.asDescendingMapOfRanges();
            }

            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public /* bridge */ /* synthetic */ java.util.Map asMapOfRanges() {
                return super.asMapOfRanges();
            }

            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public /* bridge */ /* synthetic */ com.google.common.collect.RangeMap subRangeMap(com.google.common.collect.Range range2) {
                return subRangeMap(range2);
            }

            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public com.google.common.collect.ImmutableRangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> range2) {
                if (range.isConnected(range2)) {
                    return this.subRangeMap((com.google.common.collect.Range) range2.intersection(range));
                }
                return com.google.common.collect.ImmutableRangeMap.of();
            }

            @Override // com.google.common.collect.ImmutableRangeMap
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.common.collect.RangeMap) {
            return asMapOfRanges().equals(((com.google.common.collect.RangeMap) obj).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeMap
    public java.lang.String toString() {
        return asMapOfRanges().toString();
    }

    static final class SerializedForm<K extends java.lang.Comparable<?>, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> mapOfRanges;

        SerializedForm(com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> immutableMap) {
            this.mapOfRanges = immutableMap;
        }

        final java.lang.Object readResolve() {
            if (this.mapOfRanges.isEmpty()) {
                return com.google.common.collect.ImmutableRangeMap.of();
            }
            return createRangeMap();
        }

        final java.lang.Object createRangeMap() {
            com.google.common.collect.ImmutableRangeMap.Builder builder = new com.google.common.collect.ImmutableRangeMap.Builder();
            com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<com.google.common.collect.Range<K>, V> next = it.next();
                builder.put(next.getKey(), next.getValue());
            }
            return builder.build();
        }
    }

    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableRangeMap.SerializedForm(asMapOfRanges());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }
}
