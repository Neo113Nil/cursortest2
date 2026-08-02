package com.google.common.collect;

/* loaded from: classes9.dex */
public final class TreeRangeMap<K extends java.lang.Comparable, V> implements com.google.common.collect.RangeMap<K, V> {
    private static final com.google.common.collect.RangeMap<java.lang.Comparable<?>, java.lang.Object> EMPTY_SUB_RANGE_MAP = new com.google.common.collect.RangeMap<java.lang.Comparable<?>, java.lang.Object>() { // from class: com.google.common.collect.TreeRangeMap.1
        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }

        @Override // com.google.common.collect.RangeMap
        public java.lang.Object get(java.lang.Comparable<?> comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public java.util.Map.Entry<com.google.common.collect.Range<java.lang.Comparable<?>>, java.lang.Object> getEntry(java.lang.Comparable<?> comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public com.google.common.collect.Range<java.lang.Comparable<?>> span() {
            throw new java.util.NoSuchElementException();
        }

        @Override // com.google.common.collect.RangeMap
        public void put(com.google.common.collect.Range<java.lang.Comparable<?>> range, java.lang.Object obj) {
            com.google.common.base.Preconditions.checkNotNull(range);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot insert range ");
            sb.append(range);
            sb.append(" into an empty subRangeMap");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(com.google.common.collect.Range<java.lang.Comparable<?>> range, java.lang.Object obj) {
            com.google.common.base.Preconditions.checkNotNull(range);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot insert range ");
            sb.append(range);
            sb.append(" into an empty subRangeMap");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(com.google.common.collect.RangeMap<java.lang.Comparable<?>, ? extends java.lang.Object> rangeMap) {
            if (!rangeMap.asMapOfRanges().isEmpty()) {
                throw new java.lang.IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(com.google.common.collect.Range<java.lang.Comparable<?>> range) {
            com.google.common.base.Preconditions.checkNotNull(range);
        }

        @Override // com.google.common.collect.RangeMap
        public java.util.Map<com.google.common.collect.Range<java.lang.Comparable<?>>, java.lang.Object> asMapOfRanges() {
            return java.util.Collections.emptyMap();
        }

        @Override // com.google.common.collect.RangeMap
        public java.util.Map<com.google.common.collect.Range<java.lang.Comparable<?>>, java.lang.Object> asDescendingMapOfRanges() {
            return java.util.Collections.emptyMap();
        }

        @Override // com.google.common.collect.RangeMap
        public com.google.common.collect.RangeMap<java.lang.Comparable<?>, java.lang.Object> subRangeMap(com.google.common.collect.Range<java.lang.Comparable<?>> range) {
            com.google.common.base.Preconditions.checkNotNull(range);
            return this;
        }
    };
    private final java.util.NavigableMap<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entriesByLowerBound;

    public static <K extends java.lang.Comparable, V> com.google.common.collect.TreeRangeMap<K, V> create() {
        return new com.google.common.collect.TreeRangeMap<>();
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.TreeRangeMap<K, V> copyOf(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
        if (rangeMap instanceof com.google.common.collect.TreeRangeMap) {
            java.util.TreeMap newTreeMap = com.google.common.collect.Maps.newTreeMap();
            newTreeMap.putAll(((com.google.common.collect.TreeRangeMap) rangeMap).entriesByLowerBound);
            return new com.google.common.collect.TreeRangeMap<>(newTreeMap);
        }
        java.util.TreeMap newTreeMap2 = com.google.common.collect.Maps.newTreeMap();
        for (java.util.Map.Entry<com.google.common.collect.Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
            newTreeMap2.put(entry.getKey().lowerBound(), new com.google.common.collect.TreeRangeMap.RangeMapEntry(entry.getKey(), entry.getValue()));
        }
        return new com.google.common.collect.TreeRangeMap<>(newTreeMap2);
    }

    private TreeRangeMap() {
        this.entriesByLowerBound = com.google.common.collect.Maps.newTreeMap();
    }

    private TreeRangeMap(java.util.NavigableMap<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> navigableMap) {
        this.entriesByLowerBound = navigableMap;
    }

    static final class RangeMapEntry<K extends java.lang.Comparable, V> extends java.util.AbstractMap.SimpleImmutableEntry<com.google.common.collect.Range<K>, V> {
        RangeMapEntry(com.google.common.collect.Cut<K> cut, com.google.common.collect.Cut<K> cut2, V v) {
            this(com.google.common.collect.Range.create(cut, cut2), v);
        }

        RangeMapEntry(com.google.common.collect.Range<K> range, V v) {
            super(range, v);
        }

        final boolean contains(K k) {
            return getKey().contains(k);
        }

        final com.google.common.collect.Cut<K> getLowerBound() {
            return (com.google.common.collect.Cut<K>) getKey().lowerBound;
        }

        final com.google.common.collect.Cut<K> getUpperBound() {
            return (com.google.common.collect.Cut<K>) getKey().upperBound;
        }
    }

    @Override // com.google.common.collect.RangeMap
    public final V get(K k) {
        java.util.Map.Entry<com.google.common.collect.Range<K>, V> entry = getEntry(k);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    public final java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K k) {
        java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> floorEntry = this.entriesByLowerBound.floorEntry(com.google.common.collect.Cut.belowValue(k));
        if (floorEntry == null || !floorEntry.getValue().contains(k)) {
            return null;
        }
        return floorEntry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    public final void put(com.google.common.collect.Range<K> range, V v) {
        if (range.isEmpty()) {
            return;
        }
        com.google.common.base.Preconditions.checkNotNull(v);
        remove(range);
        this.entriesByLowerBound.put(range.lowerBound, new com.google.common.collect.TreeRangeMap.RangeMapEntry(range, v));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RangeMap
    public final void putCoalescing(com.google.common.collect.Range<K> range, V v) {
        if (this.entriesByLowerBound.isEmpty()) {
            put(range, v);
        } else {
            put(coalescedRange(range, com.google.common.base.Preconditions.checkNotNull(v)), v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.Range<K> coalescedRange(com.google.common.collect.Range<K> range, V v) {
        return coalesce(coalesce(range, v, this.entriesByLowerBound.lowerEntry(range.lowerBound)), v, this.entriesByLowerBound.floorEntry(range.upperBound));
    }

    private static <K extends java.lang.Comparable, V> com.google.common.collect.Range<K> coalesce(com.google.common.collect.Range<K> range, V v, java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entry) {
        return (entry != null && entry.getValue().getKey().isConnected(range) && entry.getValue().getValue().equals(v)) ? range.span((com.google.common.collect.Range) entry.getValue().getKey()) : range;
    }

    @Override // com.google.common.collect.RangeMap
    public final void putAll(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
        for (java.util.Map.Entry<com.google.common.collect.Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.RangeMap
    public final void clear() {
        this.entriesByLowerBound.clear();
    }

    @Override // com.google.common.collect.RangeMap
    public final com.google.common.collect.Range<K> span() {
        java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> firstEntry = this.entriesByLowerBound.firstEntry();
        java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> lastEntry = this.entriesByLowerBound.lastEntry();
        if (firstEntry == null || lastEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return com.google.common.collect.Range.create(firstEntry.getValue().getKey().lowerBound, lastEntry.getValue().getKey().upperBound);
    }

    private void putRangeMapEntry(com.google.common.collect.Cut<K> cut, com.google.common.collect.Cut<K> cut2, V v) {
        this.entriesByLowerBound.put(cut, new com.google.common.collect.TreeRangeMap.RangeMapEntry(cut, cut2, v));
    }

    @Override // com.google.common.collect.RangeMap
    public final void remove(com.google.common.collect.Range<K> range) {
        if (range.isEmpty()) {
            return;
        }
        java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> lowerEntry = this.entriesByLowerBound.lowerEntry(range.lowerBound);
        if (lowerEntry != null) {
            com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V> value = lowerEntry.getValue();
            if (value.getUpperBound().compareTo(range.lowerBound) > 0) {
                if (value.getUpperBound().compareTo(range.upperBound) > 0) {
                    putRangeMapEntry(range.upperBound, value.getUpperBound(), lowerEntry.getValue().getValue());
                }
                putRangeMapEntry(value.getLowerBound(), range.lowerBound, lowerEntry.getValue().getValue());
            }
        }
        java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> lowerEntry2 = this.entriesByLowerBound.lowerEntry(range.upperBound);
        if (lowerEntry2 != null) {
            com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V> value2 = lowerEntry2.getValue();
            if (value2.getUpperBound().compareTo(range.upperBound) > 0) {
                putRangeMapEntry(range.upperBound, value2.getUpperBound(), lowerEntry2.getValue().getValue());
            }
        }
        this.entriesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    @Override // com.google.common.collect.RangeMap
    public final java.util.Map<com.google.common.collect.Range<K>, V> asMapOfRanges() {
        return new com.google.common.collect.TreeRangeMap.AsMapOfRanges(this.entriesByLowerBound.values());
    }

    @Override // com.google.common.collect.RangeMap
    public final java.util.Map<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges() {
        return new com.google.common.collect.TreeRangeMap.AsMapOfRanges(this.entriesByLowerBound.descendingMap().values());
    }

    final class AsMapOfRanges extends com.google.common.collect.Maps.IteratorBasedAbstractMap<com.google.common.collect.Range<K>, V> {
        final java.lang.Iterable<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterable;

        AsMapOfRanges(java.lang.Iterable<com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> iterable) {
            this.entryIterable = iterable;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V get(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.collect.Range)) {
                return null;
            }
            com.google.common.collect.Range range = (com.google.common.collect.Range) obj;
            com.google.common.collect.TreeRangeMap.RangeMapEntry rangeMapEntry = (com.google.common.collect.TreeRangeMap.RangeMapEntry) com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.get(range.lowerBound);
            if (rangeMapEntry == null || !rangeMapEntry.getKey().equals(range)) {
                return null;
            }
            return rangeMapEntry.getValue();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final int size() {
            return com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.size();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterator() {
            return this.entryIterable.iterator();
        }
    }

    @Override // com.google.common.collect.RangeMap
    public final com.google.common.collect.RangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> range) {
        return range.equals(com.google.common.collect.Range.all()) ? this : new com.google.common.collect.TreeRangeMap.SubRangeMap(range);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.RangeMap<K, V> emptySubRangeMap() {
        return EMPTY_SUB_RANGE_MAP;
    }

    final class SubRangeMap implements com.google.common.collect.RangeMap<K, V> {
        private final com.google.common.collect.Range<K> subRange;

        SubRangeMap(com.google.common.collect.Range<K> range) {
            this.subRange = range;
        }

        @Override // com.google.common.collect.RangeMap
        public final V get(K k) {
            if (this.subRange.contains(k)) {
                return (V) com.google.common.collect.TreeRangeMap.this.get(k);
            }
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public final java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K k) {
            java.util.Map.Entry<com.google.common.collect.Range<K>, V> entry;
            if (!this.subRange.contains(k) || (entry = com.google.common.collect.TreeRangeMap.this.getEntry(k)) == null) {
                return null;
            }
            return com.google.common.collect.Maps.immutableEntry(entry.getKey().intersection(this.subRange), entry.getValue());
        }

        @Override // com.google.common.collect.RangeMap
        public final com.google.common.collect.Range<K> span() {
            com.google.common.collect.Cut<K> cut;
            com.google.common.collect.Cut<K> upperBound;
            java.util.Map.Entry floorEntry = com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.floorEntry(this.subRange.lowerBound);
            if (floorEntry == null || ((com.google.common.collect.TreeRangeMap.RangeMapEntry) floorEntry.getValue()).getUpperBound().compareTo((com.google.common.collect.Cut) this.subRange.lowerBound) <= 0) {
                cut = (com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.ceilingKey(this.subRange.lowerBound);
                if (cut == null || cut.compareTo(this.subRange.upperBound) >= 0) {
                    throw new java.util.NoSuchElementException();
                }
            } else {
                cut = this.subRange.lowerBound;
            }
            java.util.Map.Entry lowerEntry = com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.lowerEntry(this.subRange.upperBound);
            if (lowerEntry == null) {
                throw new java.util.NoSuchElementException();
            }
            if (((com.google.common.collect.TreeRangeMap.RangeMapEntry) lowerEntry.getValue()).getUpperBound().compareTo((com.google.common.collect.Cut) this.subRange.upperBound) >= 0) {
                upperBound = this.subRange.upperBound;
            } else {
                upperBound = ((com.google.common.collect.TreeRangeMap.RangeMapEntry) lowerEntry.getValue()).getUpperBound();
            }
            return com.google.common.collect.Range.create(cut, upperBound);
        }

        @Override // com.google.common.collect.RangeMap
        public final void put(com.google.common.collect.Range<K> range, V v) {
            com.google.common.base.Preconditions.checkArgument(this.subRange.encloses(range), "Cannot put range %s into a subRangeMap(%s)", range, this.subRange);
            com.google.common.collect.TreeRangeMap.this.put(range, v);
        }

        @Override // com.google.common.collect.RangeMap
        public final void putCoalescing(com.google.common.collect.Range<K> range, V v) {
            if (com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.isEmpty() || !this.subRange.encloses(range)) {
                put(range, v);
            } else {
                put(com.google.common.collect.TreeRangeMap.this.coalescedRange(range, com.google.common.base.Preconditions.checkNotNull(v)).intersection(this.subRange), v);
            }
        }

        @Override // com.google.common.collect.RangeMap
        public final void putAll(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            com.google.common.collect.Range<K> span = rangeMap.span();
            com.google.common.base.Preconditions.checkArgument(this.subRange.encloses(span), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", span, this.subRange);
            com.google.common.collect.TreeRangeMap.this.putAll(rangeMap);
        }

        @Override // com.google.common.collect.RangeMap
        public final void clear() {
            com.google.common.collect.TreeRangeMap.this.remove(this.subRange);
        }

        @Override // com.google.common.collect.RangeMap
        public final void remove(com.google.common.collect.Range<K> range) {
            if (range.isConnected(this.subRange)) {
                com.google.common.collect.TreeRangeMap.this.remove(range.intersection(this.subRange));
            }
        }

        @Override // com.google.common.collect.RangeMap
        public final com.google.common.collect.RangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> range) {
            if (!range.isConnected(this.subRange)) {
                return com.google.common.collect.TreeRangeMap.this.emptySubRangeMap();
            }
            return com.google.common.collect.TreeRangeMap.this.subRangeMap(range.intersection(this.subRange));
        }

        @Override // com.google.common.collect.RangeMap
        public final java.util.Map<com.google.common.collect.Range<K>, V> asMapOfRanges() {
            return new com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap();
        }

        @Override // com.google.common.collect.RangeMap
        public final java.util.Map<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges() {
            return new com.google.common.collect.TreeRangeMap<K, V>.SubRangeMap.SubRangeMapAsMap() { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.1
                @Override // com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap
                java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterator() {
                    if (com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.isEmpty()) {
                        return com.google.common.collect.Iterators.emptyIterator();
                    }
                    final java.util.Iterator<V> it = com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.headMap(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.upperBound, false).descendingMap().values().iterator();
                    return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.1.1
                        final /* synthetic */ com.google.common.collect.TreeRangeMap.SubRangeMap.AnonymousClass1 this$2;

                        {
                            this.this$2 = this;
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.AbstractIterator
                        public java.util.Map.Entry<com.google.common.collect.Range<K>, V> computeNext() {
                            if (it.hasNext()) {
                                com.google.common.collect.TreeRangeMap.RangeMapEntry rangeMapEntry = (com.google.common.collect.TreeRangeMap.RangeMapEntry) it.next();
                                if (rangeMapEntry.getUpperBound().compareTo((com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.lowerBound) > 0) {
                                    return com.google.common.collect.Maps.immutableEntry(rangeMapEntry.getKey().intersection(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange), rangeMapEntry.getValue());
                                }
                                return (java.util.Map.Entry) endOfData();
                            }
                            return (java.util.Map.Entry) endOfData();
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.RangeMap
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.collect.RangeMap) {
                return asMapOfRanges().equals(((com.google.common.collect.RangeMap) obj).asMapOfRanges());
            }
            return false;
        }

        @Override // com.google.common.collect.RangeMap
        public final int hashCode() {
            return asMapOfRanges().hashCode();
        }

        @Override // com.google.common.collect.RangeMap
        public final java.lang.String toString() {
            return asMapOfRanges().toString();
        }

        class SubRangeMapAsMap extends java.util.AbstractMap<com.google.common.collect.Range<K>, V> {
            SubRangeMapAsMap() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(java.lang.Object obj) {
                return get(obj) != null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V get(java.lang.Object obj) {
                com.google.common.collect.TreeRangeMap.RangeMapEntry rangeMapEntry;
                if (obj instanceof com.google.common.collect.Range) {
                    try {
                        com.google.common.collect.Range range = (com.google.common.collect.Range) obj;
                        if (com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.encloses(range) && !range.isEmpty()) {
                            if (range.lowerBound.compareTo((com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.lowerBound) == 0) {
                                java.util.Map.Entry floorEntry = com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.floorEntry(range.lowerBound);
                                rangeMapEntry = floorEntry != null ? (com.google.common.collect.TreeRangeMap.RangeMapEntry) floorEntry.getValue() : null;
                            } else {
                                rangeMapEntry = (com.google.common.collect.TreeRangeMap.RangeMapEntry) com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.get(range.lowerBound);
                            }
                            if (rangeMapEntry != null && rangeMapEntry.getKey().isConnected(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange) && rangeMapEntry.getKey().intersection(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange).equals(range)) {
                                return rangeMapEntry.getValue();
                            }
                        }
                    } catch (java.lang.ClassCastException unused) {
                    }
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V remove(java.lang.Object obj) {
                V v = get(obj);
                if (v == null) {
                    return null;
                }
                com.google.common.collect.TreeRangeMap.this.remove((com.google.common.collect.Range) java.util.Objects.requireNonNull(obj));
                return v;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                com.google.common.collect.TreeRangeMap.SubRangeMap.this.clear();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean removeEntryIf(com.google.common.base.Predicate<? super java.util.Map.Entry<com.google.common.collect.Range<K>, V>> predicate) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (predicate.apply(entry)) {
                        arrayList.add((com.google.common.collect.Range) entry.getKey());
                    }
                }
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.google.common.collect.TreeRangeMap.this.remove((com.google.common.collect.Range) it2.next());
                }
                return !arrayList.isEmpty();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public java.util.Set<com.google.common.collect.Range<K>> keySet() {
                return new com.google.common.collect.Maps.KeySet<com.google.common.collect.Range<K>, V>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.1
                    @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean remove(java.lang.Object obj) {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.remove(obj) != null;
                    }

                    @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean retainAll(java.util.Collection<?> collection) {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.removeEntryIf(com.google.common.base.Predicates.compose(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(collection)), com.google.common.collect.Maps.keyFunction()));
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public java.util.Set<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entrySet() {
                return new com.google.common.collect.Maps.EntrySet<com.google.common.collect.Range<K>, V>() { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.2
                    @Override // com.google.common.collect.Maps.EntrySet
                    java.util.Map<com.google.common.collect.Range<K>, V> map() {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> iterator() {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.entryIterator();
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean retainAll(java.util.Collection<?> collection) {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.removeEntryIf(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(collection)));
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
                        return com.google.common.collect.Iterators.size(iterator());
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean isEmpty() {
                        return !iterator().hasNext();
                    }
                };
            }

            java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterator() {
                if (com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.isEmpty()) {
                    return com.google.common.collect.Iterators.emptyIterator();
                }
                final java.util.Iterator<V> it = com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.tailMap((com.google.common.collect.Cut) com.google.common.base.MoreObjects.firstNonNull((com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.floorKey(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.lowerBound), com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.lowerBound), true).values().iterator();
                return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.3
                    final /* synthetic */ com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap this$2;

                    {
                        this.this$2 = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    public java.util.Map.Entry<com.google.common.collect.Range<K>, V> computeNext() {
                        while (it.hasNext()) {
                            com.google.common.collect.TreeRangeMap.RangeMapEntry rangeMapEntry = (com.google.common.collect.TreeRangeMap.RangeMapEntry) it.next();
                            if (rangeMapEntry.getLowerBound().compareTo((com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.upperBound) < 0) {
                                if (rangeMapEntry.getUpperBound().compareTo((com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.lowerBound) > 0) {
                                    return com.google.common.collect.Maps.immutableEntry(rangeMapEntry.getKey().intersection(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange), rangeMapEntry.getValue());
                                }
                            } else {
                                return (java.util.Map.Entry) endOfData();
                            }
                        }
                        return (java.util.Map.Entry) endOfData();
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public java.util.Collection<V> values() {
                return new com.google.common.collect.Maps.Values<com.google.common.collect.Range<K>, V>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.4
                    @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                    public boolean removeAll(java.util.Collection<?> collection) {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.removeEntryIf(com.google.common.base.Predicates.compose(com.google.common.base.Predicates.in(collection), com.google.common.collect.Maps.valueFunction()));
                    }

                    @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                    public boolean retainAll(java.util.Collection<?> collection) {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.removeEntryIf(com.google.common.base.Predicates.compose(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(collection)), com.google.common.collect.Maps.valueFunction()));
                    }
                };
            }
        }
    }

    @Override // com.google.common.collect.RangeMap
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.common.collect.RangeMap) {
            return asMapOfRanges().equals(((com.google.common.collect.RangeMap) obj).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeMap
    public final int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    public final java.lang.String toString() {
        return this.entriesByLowerBound.values().toString();
    }
}
