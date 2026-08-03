package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public class TreeRangeSet<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractRangeSet<C> implements java.io.Serializable {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Range<C>> asDescendingSetOfRanges;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Range<C>> asRanges;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.RangeSet<C> complement;
    final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound;

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(com.google.common.collect.RangeSet other) {
        super.addAll(other);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(java.lang.Iterable ranges) {
        super.addAll(ranges);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable value) {
        return super.contains(value);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(com.google.common.collect.RangeSet other) {
        return super.enclosesAll(other);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(java.lang.Iterable ranges) {
        return super.enclosesAll(ranges);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(com.google.common.collect.RangeSet other) {
        super.removeAll(other);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(java.lang.Iterable ranges) {
        super.removeAll(ranges);
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.TreeRangeSet<C> create() {
        return new com.google.common.collect.TreeRangeSet<>(new java.util.TreeMap());
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.TreeRangeSet<C> create(com.google.common.collect.RangeSet<C> rangeSet) {
        com.google.common.collect.TreeRangeSet<C> create = create();
        create.addAll(rangeSet);
        return create;
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.TreeRangeSet<C> create(java.lang.Iterable<com.google.common.collect.Range<C>> ranges) {
        com.google.common.collect.TreeRangeSet<C> create = create();
        create.addAll(ranges);
        return create;
    }

    private TreeRangeSet(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerCut) {
        this.rangesByLowerBound = rangesByLowerCut;
    }

    @Override // com.google.common.collect.RangeSet
    public java.util.Set<com.google.common.collect.Range<C>> asRanges() {
        java.util.Set<com.google.common.collect.Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        com.google.common.collect.TreeRangeSet.AsRanges asRanges = new com.google.common.collect.TreeRangeSet.AsRanges(this, this.rangesByLowerBound.values());
        this.asRanges = asRanges;
        return asRanges;
    }

    @Override // com.google.common.collect.RangeSet
    public java.util.Set<com.google.common.collect.Range<C>> asDescendingSetOfRanges() {
        java.util.Set<com.google.common.collect.Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        com.google.common.collect.TreeRangeSet.AsRanges asRanges = new com.google.common.collect.TreeRangeSet.AsRanges(this, this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = asRanges;
        return asRanges;
    }

    final class AsRanges extends com.google.common.collect.ForwardingCollection<com.google.common.collect.Range<C>> implements java.util.Set<com.google.common.collect.Range<C>> {
        final java.util.Collection<com.google.common.collect.Range<C>> delegate;

        AsRanges(final com.google.common.collect.TreeRangeSet this$0, java.util.Collection<com.google.common.collect.Range<C>> delegate) {
            this.delegate = delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Collection<com.google.common.collect.Range<C>> delegate() {
            return this.delegate;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return com.google.common.collect.Sets.hashCodeImpl(this);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            return com.google.common.collect.Sets.equalsImpl(this, o);
        }
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @javax.annotation.CheckForNull
    public com.google.common.collect.Range<C> rangeContaining(C value) {
        com.google.common.base.Preconditions.checkNotNull(value);
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(com.google.common.collect.Cut.belowValue(value));
        if (floorEntry == null || !floorEntry.getValue().contains(value)) {
            return null;
        }
        return floorEntry.getValue();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(com.google.common.collect.Range<C> range) {
        com.google.common.base.Preconditions.checkNotNull(range);
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> ceilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (ceilingEntry != null && ceilingEntry.getValue().isConnected(range) && !ceilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        return (lowerEntry == null || !lowerEntry.getValue().isConnected(range) || lowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(com.google.common.collect.Range<C> range) {
        com.google.common.base.Preconditions.checkNotNull(range);
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return floorEntry != null && floorEntry.getValue().encloses(range);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.CheckForNull
    public com.google.common.collect.Range<C> rangeEnclosing(com.google.common.collect.Range<C> range) {
        com.google.common.base.Preconditions.checkNotNull(range);
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (floorEntry == null || !floorEntry.getValue().encloses(range)) {
            return null;
        }
        return floorEntry.getValue();
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.Range<C> span() {
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> firstEntry = this.rangesByLowerBound.firstEntry();
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> lastEntry = this.rangesByLowerBound.lastEntry();
        if (firstEntry == null || lastEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return com.google.common.collect.Range.create(firstEntry.getValue().lowerBound, lastEntry.getValue().upperBound);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void add(com.google.common.collect.Range<C> rangeToAdd) {
        com.google.common.base.Preconditions.checkNotNull(rangeToAdd);
        if (rangeToAdd.isEmpty()) {
            return;
        }
        com.google.common.collect.Cut<C> cut = rangeToAdd.lowerBound;
        com.google.common.collect.Cut<C> cut2 = rangeToAdd.upperBound;
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(cut);
        if (lowerEntry != null) {
            com.google.common.collect.Range<C> value = lowerEntry.getValue();
            if (value.upperBound.compareTo(cut) >= 0) {
                if (value.upperBound.compareTo(cut2) >= 0) {
                    cut2 = value.upperBound;
                }
                cut = value.lowerBound;
            }
        }
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(cut2);
        if (floorEntry != null) {
            com.google.common.collect.Range<C> value2 = floorEntry.getValue();
            if (value2.upperBound.compareTo(cut2) >= 0) {
                cut2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(cut, cut2).clear();
        replaceRangeWithSameLowerBound(com.google.common.collect.Range.create(cut, cut2));
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void remove(com.google.common.collect.Range<C> rangeToRemove) {
        com.google.common.base.Preconditions.checkNotNull(rangeToRemove);
        if (rangeToRemove.isEmpty()) {
            return;
        }
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(rangeToRemove.lowerBound);
        if (lowerEntry != null) {
            com.google.common.collect.Range<C> value = lowerEntry.getValue();
            if (value.upperBound.compareTo(rangeToRemove.lowerBound) >= 0) {
                if (rangeToRemove.hasUpperBound() && value.upperBound.compareTo(rangeToRemove.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(com.google.common.collect.Range.create(rangeToRemove.upperBound, value.upperBound));
                }
                replaceRangeWithSameLowerBound(com.google.common.collect.Range.create(value.lowerBound, rangeToRemove.lowerBound));
            }
        }
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(rangeToRemove.upperBound);
        if (floorEntry != null) {
            com.google.common.collect.Range<C> value2 = floorEntry.getValue();
            if (rangeToRemove.hasUpperBound() && value2.upperBound.compareTo(rangeToRemove.upperBound) >= 0) {
                replaceRangeWithSameLowerBound(com.google.common.collect.Range.create(rangeToRemove.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(rangeToRemove.lowerBound, rangeToRemove.upperBound).clear();
    }

    private void replaceRangeWithSameLowerBound(com.google.common.collect.Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.RangeSet<C> complement() {
        com.google.common.collect.RangeSet<C> rangeSet = this.complement;
        if (rangeSet != null) {
            return rangeSet;
        }
        com.google.common.collect.TreeRangeSet.Complement complement = new com.google.common.collect.TreeRangeSet.Complement();
        this.complement = complement;
        return complement;
    }

    static final class RangesByUpperBound<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractNavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> {
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound;
        private final com.google.common.collect.Range<com.google.common.collect.Cut<C>> upperBoundWindow;

        RangesByUpperBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound) {
            this.rangesByLowerBound = rangesByLowerBound;
            this.upperBoundWindow = com.google.common.collect.Range.all();
        }

        private RangesByUpperBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound, com.google.common.collect.Range<com.google.common.collect.Cut<C>> upperBoundWindow) {
            this.rangesByLowerBound = rangesByLowerBound;
            this.upperBoundWindow = upperBoundWindow;
        }

        private java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Range<com.google.common.collect.Cut<C>> window) {
            if (window.isConnected(this.upperBoundWindow)) {
                return new com.google.common.collect.TreeRangeSet.RangesByUpperBound(this.rangesByLowerBound, window.intersection(this.upperBoundWindow));
            }
            return com.google.common.collect.ImmutableSortedMap.of();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Cut<C> fromKey, boolean fromInclusive, com.google.common.collect.Cut<C> toKey, boolean toInclusive) {
            return subMap(com.google.common.collect.Range.range(fromKey, com.google.common.collect.BoundType.forBoolean(fromInclusive), toKey, com.google.common.collect.BoundType.forBoolean(toInclusive)));
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> headMap(com.google.common.collect.Cut<C> toKey, boolean inclusive) {
            return subMap(com.google.common.collect.Range.upTo(toKey, com.google.common.collect.BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> tailMap(com.google.common.collect.Cut<C> fromKey, boolean inclusive) {
            return subMap(com.google.common.collect.Range.downTo(fromKey, com.google.common.collect.BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super com.google.common.collect.Cut<C>> comparator() {
            return com.google.common.collect.Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return get(key) != null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public com.google.common.collect.Range<C> get(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> lowerEntry;
            if (key instanceof com.google.common.collect.Cut) {
                try {
                    com.google.common.collect.Cut<C> cut = (com.google.common.collect.Cut) key;
                    if (this.upperBoundWindow.contains(cut) && (lowerEntry = this.rangesByLowerBound.lowerEntry(cut)) != null && lowerEntry.getValue().upperBound.equals(cut)) {
                        return lowerEntry.getValue();
                    }
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> entryIterator() {
            final java.util.Iterator<com.google.common.collect.Range<C>> it;
            if (!this.upperBoundWindow.hasLowerBound()) {
                it = this.rangesByLowerBound.values().iterator();
            } else {
                java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(this.upperBoundWindow.lowerEndpoint());
                if (lowerEntry == null) {
                    it = this.rangesByLowerBound.values().iterator();
                } else if (this.upperBoundWindow.lowerBound.isLessThan(lowerEntry.getValue().upperBound)) {
                    it = this.rangesByLowerBound.tailMap(lowerEntry.getKey(), true).values().iterator();
                } else {
                    it = this.rangesByLowerBound.tailMap(this.upperBoundWindow.lowerEndpoint(), true).values().iterator();
                }
            }
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    if (!it.hasNext()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    com.google.common.collect.Range range = (com.google.common.collect.Range) it.next();
                    if (com.google.common.collect.TreeRangeSet.RangesByUpperBound.this.upperBoundWindow.upperBound.isLessThan(range.upperBound)) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    return com.google.common.collect.Maps.immutableEntry(range.upperBound, range);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> descendingEntryIterator() {
            java.util.Collection<com.google.common.collect.Range<C>> values;
            if (this.upperBoundWindow.hasUpperBound()) {
                values = this.rangesByLowerBound.headMap(this.upperBoundWindow.upperEndpoint(), false).descendingMap().values();
            } else {
                values = this.rangesByLowerBound.descendingMap().values();
            }
            final com.google.common.collect.PeekingIterator peekingIterator = com.google.common.collect.Iterators.peekingIterator(values.iterator());
            if (peekingIterator.hasNext() && this.upperBoundWindow.upperBound.isLessThan(((com.google.common.collect.Range) peekingIterator.peek()).upperBound)) {
                peekingIterator.next();
            }
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    if (!peekingIterator.hasNext()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    com.google.common.collect.Range range = (com.google.common.collect.Range) peekingIterator.next();
                    if (com.google.common.collect.TreeRangeSet.RangesByUpperBound.this.upperBoundWindow.lowerBound.isLessThan(range.upperBound)) {
                        return com.google.common.collect.Maps.immutableEntry(range.upperBound, range);
                    }
                    return (java.util.Map.Entry) endOfData();
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            if (this.upperBoundWindow.equals(com.google.common.collect.Range.all())) {
                return this.rangesByLowerBound.size();
            }
            return com.google.common.collect.Iterators.size(entryIterator());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.upperBoundWindow.equals(com.google.common.collect.Range.all())) {
                return this.rangesByLowerBound.isEmpty();
            }
            return !entryIterator().hasNext();
        }
    }

    private static final class ComplementRangesByLowerBound<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractNavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> {
        private final com.google.common.collect.Range<com.google.common.collect.Cut<C>> complementLowerBoundWindow;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> positiveRangesByLowerBound;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> positiveRangesByUpperBound;

        ComplementRangesByLowerBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> positiveRangesByLowerBound) {
            this(positiveRangesByLowerBound, com.google.common.collect.Range.all());
        }

        private ComplementRangesByLowerBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> positiveRangesByLowerBound, com.google.common.collect.Range<com.google.common.collect.Cut<C>> window) {
            this.positiveRangesByLowerBound = positiveRangesByLowerBound;
            this.positiveRangesByUpperBound = new com.google.common.collect.TreeRangeSet.RangesByUpperBound(positiveRangesByLowerBound);
            this.complementLowerBoundWindow = window;
        }

        private java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Range<com.google.common.collect.Cut<C>> subWindow) {
            if (!this.complementLowerBoundWindow.isConnected(subWindow)) {
                return com.google.common.collect.ImmutableSortedMap.of();
            }
            return new com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound(this.positiveRangesByLowerBound, subWindow.intersection(this.complementLowerBoundWindow));
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Cut<C> fromKey, boolean fromInclusive, com.google.common.collect.Cut<C> toKey, boolean toInclusive) {
            return subMap(com.google.common.collect.Range.range(fromKey, com.google.common.collect.BoundType.forBoolean(fromInclusive), toKey, com.google.common.collect.BoundType.forBoolean(toInclusive)));
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> headMap(com.google.common.collect.Cut<C> toKey, boolean inclusive) {
            return subMap(com.google.common.collect.Range.upTo(toKey, com.google.common.collect.BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> tailMap(com.google.common.collect.Cut<C> fromKey, boolean inclusive) {
            return subMap(com.google.common.collect.Range.downTo(fromKey, com.google.common.collect.BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super com.google.common.collect.Cut<C>> comparator() {
            return com.google.common.collect.Ordering.natural();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> entryIterator() {
            java.util.Collection<com.google.common.collect.Range<C>> values;
            com.google.common.collect.Cut cut;
            if (this.complementLowerBoundWindow.hasLowerBound()) {
                values = this.positiveRangesByUpperBound.tailMap(this.complementLowerBoundWindow.lowerEndpoint(), this.complementLowerBoundWindow.lowerBoundType() == com.google.common.collect.BoundType.CLOSED).values();
            } else {
                values = this.positiveRangesByUpperBound.values();
            }
            com.google.common.collect.PeekingIterator peekingIterator = com.google.common.collect.Iterators.peekingIterator(values.iterator());
            if (this.complementLowerBoundWindow.contains(com.google.common.collect.Cut.belowAll()) && (!peekingIterator.hasNext() || ((com.google.common.collect.Range) peekingIterator.peek()).lowerBound != com.google.common.collect.Cut.belowAll())) {
                cut = com.google.common.collect.Cut.belowAll();
            } else if (peekingIterator.hasNext()) {
                cut = ((com.google.common.collect.Range) peekingIterator.next()).upperBound;
            } else {
                return com.google.common.collect.Iterators.emptyIterator();
            }
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>(cut, peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.1
                com.google.common.collect.Cut<C> nextComplementRangeLowerBound;
                final /* synthetic */ com.google.common.collect.Cut val$firstComplementRangeLowerBound;
                final /* synthetic */ com.google.common.collect.PeekingIterator val$positiveItr;

                {
                    this.val$firstComplementRangeLowerBound = cut;
                    this.val$positiveItr = peekingIterator;
                    this.nextComplementRangeLowerBound = cut;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    com.google.common.collect.Range create;
                    if (com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.this.complementLowerBoundWindow.upperBound.isLessThan(this.nextComplementRangeLowerBound) || this.nextComplementRangeLowerBound == com.google.common.collect.Cut.aboveAll()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    if (this.val$positiveItr.hasNext()) {
                        com.google.common.collect.Range range = (com.google.common.collect.Range) this.val$positiveItr.next();
                        create = com.google.common.collect.Range.create(this.nextComplementRangeLowerBound, range.lowerBound);
                        this.nextComplementRangeLowerBound = range.upperBound;
                    } else {
                        create = com.google.common.collect.Range.create(this.nextComplementRangeLowerBound, com.google.common.collect.Cut.aboveAll());
                        this.nextComplementRangeLowerBound = com.google.common.collect.Cut.aboveAll();
                    }
                    return com.google.common.collect.Maps.immutableEntry(create.lowerBound, create);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> descendingEntryIterator() {
            com.google.common.collect.Cut<C> aboveAll;
            com.google.common.collect.Cut<C> higherKey;
            if (this.complementLowerBoundWindow.hasUpperBound()) {
                aboveAll = this.complementLowerBoundWindow.upperEndpoint();
            } else {
                aboveAll = com.google.common.collect.Cut.aboveAll();
            }
            com.google.common.collect.PeekingIterator peekingIterator = com.google.common.collect.Iterators.peekingIterator(this.positiveRangesByUpperBound.headMap(aboveAll, this.complementLowerBoundWindow.hasUpperBound() && this.complementLowerBoundWindow.upperBoundType() == com.google.common.collect.BoundType.CLOSED).descendingMap().values().iterator());
            if (peekingIterator.hasNext()) {
                if (((com.google.common.collect.Range) peekingIterator.peek()).upperBound == com.google.common.collect.Cut.aboveAll()) {
                    higherKey = ((com.google.common.collect.Range) peekingIterator.next()).lowerBound;
                } else {
                    higherKey = this.positiveRangesByLowerBound.higherKey(((com.google.common.collect.Range) peekingIterator.peek()).upperBound);
                }
            } else {
                if (!this.complementLowerBoundWindow.contains(com.google.common.collect.Cut.belowAll()) || this.positiveRangesByLowerBound.containsKey(com.google.common.collect.Cut.belowAll())) {
                    return com.google.common.collect.Iterators.emptyIterator();
                }
                higherKey = this.positiveRangesByLowerBound.higherKey(com.google.common.collect.Cut.belowAll());
            }
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>((com.google.common.collect.Cut) com.google.common.base.MoreObjects.firstNonNull(higherKey, com.google.common.collect.Cut.aboveAll()), peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.2
                com.google.common.collect.Cut<C> nextComplementRangeUpperBound;
                final /* synthetic */ com.google.common.collect.Cut val$firstComplementRangeUpperBound;
                final /* synthetic */ com.google.common.collect.PeekingIterator val$positiveItr;

                {
                    this.val$firstComplementRangeUpperBound = val$firstComplementRangeUpperBound;
                    this.val$positiveItr = peekingIterator;
                    this.nextComplementRangeUpperBound = val$firstComplementRangeUpperBound;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    if (this.nextComplementRangeUpperBound == com.google.common.collect.Cut.belowAll()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    if (!this.val$positiveItr.hasNext()) {
                        if (com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.this.complementLowerBoundWindow.lowerBound.isLessThan(com.google.common.collect.Cut.belowAll())) {
                            com.google.common.collect.Range create = com.google.common.collect.Range.create(com.google.common.collect.Cut.belowAll(), this.nextComplementRangeUpperBound);
                            this.nextComplementRangeUpperBound = com.google.common.collect.Cut.belowAll();
                            return com.google.common.collect.Maps.immutableEntry(com.google.common.collect.Cut.belowAll(), create);
                        }
                    } else {
                        com.google.common.collect.Range range = (com.google.common.collect.Range) this.val$positiveItr.next();
                        com.google.common.collect.Range create2 = com.google.common.collect.Range.create(range.upperBound, this.nextComplementRangeUpperBound);
                        this.nextComplementRangeUpperBound = range.lowerBound;
                        if (com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.this.complementLowerBoundWindow.lowerBound.isLessThan(create2.lowerBound)) {
                            return com.google.common.collect.Maps.immutableEntry(create2.lowerBound, create2);
                        }
                    }
                    return (java.util.Map.Entry) endOfData();
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return com.google.common.collect.Iterators.size(entryIterator());
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public com.google.common.collect.Range<C> get(@javax.annotation.CheckForNull java.lang.Object key) {
            if (key instanceof com.google.common.collect.Cut) {
                try {
                    com.google.common.collect.Cut<C> cut = (com.google.common.collect.Cut) key;
                    java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> firstEntry = tailMap((com.google.common.collect.Cut) cut, true).firstEntry();
                    if (firstEntry != null && firstEntry.getKey().equals(cut)) {
                        return firstEntry.getValue();
                    }
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return get(key) != null;
        }
    }

    private final class Complement extends com.google.common.collect.TreeRangeSet<C> {
        Complement() {
            super(new com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound(com.google.common.collect.TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(com.google.common.collect.Range<C> rangeToAdd) {
            com.google.common.collect.TreeRangeSet.this.remove(rangeToAdd);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(com.google.common.collect.Range<C> rangeToRemove) {
            com.google.common.collect.TreeRangeSet.this.add(rangeToRemove);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C value) {
            return !com.google.common.collect.TreeRangeSet.this.contains(value);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public com.google.common.collect.RangeSet<C> complement() {
            return com.google.common.collect.TreeRangeSet.this;
        }
    }

    private static final class SubRangeSetRangesByLowerBound<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractNavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> {
        private final com.google.common.collect.Range<com.google.common.collect.Cut<C>> lowerBoundWindow;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByUpperBound;
        private final com.google.common.collect.Range<C> restriction;

        private SubRangeSetRangesByLowerBound(com.google.common.collect.Range<com.google.common.collect.Cut<C>> lowerBoundWindow, com.google.common.collect.Range<C> restriction, java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound) {
            this.lowerBoundWindow = (com.google.common.collect.Range) com.google.common.base.Preconditions.checkNotNull(lowerBoundWindow);
            this.restriction = (com.google.common.collect.Range) com.google.common.base.Preconditions.checkNotNull(restriction);
            this.rangesByLowerBound = (java.util.NavigableMap) com.google.common.base.Preconditions.checkNotNull(rangesByLowerBound);
            this.rangesByUpperBound = new com.google.common.collect.TreeRangeSet.RangesByUpperBound(rangesByLowerBound);
        }

        private java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Range<com.google.common.collect.Cut<C>> window) {
            if (!window.isConnected(this.lowerBoundWindow)) {
                return com.google.common.collect.ImmutableSortedMap.of();
            }
            return new com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound(this.lowerBoundWindow.intersection(window), this.restriction, this.rangesByLowerBound);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Cut<C> fromKey, boolean fromInclusive, com.google.common.collect.Cut<C> toKey, boolean toInclusive) {
            return subMap(com.google.common.collect.Range.range(fromKey, com.google.common.collect.BoundType.forBoolean(fromInclusive), toKey, com.google.common.collect.BoundType.forBoolean(toInclusive)));
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> headMap(com.google.common.collect.Cut<C> toKey, boolean inclusive) {
            return subMap(com.google.common.collect.Range.upTo(toKey, com.google.common.collect.BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> tailMap(com.google.common.collect.Cut<C> fromKey, boolean inclusive) {
            return subMap(com.google.common.collect.Range.downTo(fromKey, com.google.common.collect.BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super com.google.common.collect.Cut<C>> comparator() {
            return com.google.common.collect.Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return get(key) != null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public com.google.common.collect.Range<C> get(@javax.annotation.CheckForNull java.lang.Object key) {
            if (key instanceof com.google.common.collect.Cut) {
                try {
                    com.google.common.collect.Cut<C> cut = (com.google.common.collect.Cut) key;
                    if (this.lowerBoundWindow.contains(cut) && cut.compareTo(this.restriction.lowerBound) >= 0 && cut.compareTo(this.restriction.upperBound) < 0) {
                        if (cut.equals(this.restriction.lowerBound)) {
                            com.google.common.collect.Range range = (com.google.common.collect.Range) com.google.common.collect.Maps.valueOrNull(this.rangesByLowerBound.floorEntry(cut));
                            if (range != null && range.upperBound.compareTo((com.google.common.collect.Cut) this.restriction.lowerBound) > 0) {
                                return range.intersection(this.restriction);
                            }
                        } else {
                            com.google.common.collect.Range range2 = (com.google.common.collect.Range) this.rangesByLowerBound.get(cut);
                            if (range2 != null) {
                                return range2.intersection(this.restriction);
                            }
                        }
                    }
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> entryIterator() {
            final java.util.Iterator<com.google.common.collect.Range<C>> it;
            if (this.restriction.isEmpty()) {
                return com.google.common.collect.Iterators.emptyIterator();
            }
            if (this.lowerBoundWindow.upperBound.isLessThan(this.restriction.lowerBound)) {
                return com.google.common.collect.Iterators.emptyIterator();
            }
            if (this.lowerBoundWindow.lowerBound.isLessThan(this.restriction.lowerBound)) {
                it = this.rangesByUpperBound.tailMap(this.restriction.lowerBound, false).values().iterator();
            } else {
                it = this.rangesByLowerBound.tailMap(this.lowerBoundWindow.lowerBound.endpoint(), this.lowerBoundWindow.lowerBoundType() == com.google.common.collect.BoundType.CLOSED).values().iterator();
            }
            final com.google.common.collect.Cut cut = (com.google.common.collect.Cut) com.google.common.collect.Ordering.natural().min(this.lowerBoundWindow.upperBound, com.google.common.collect.Cut.belowValue(this.restriction.upperBound));
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    if (!it.hasNext()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    com.google.common.collect.Range range = (com.google.common.collect.Range) it.next();
                    if (!cut.isLessThan(range.lowerBound)) {
                        com.google.common.collect.Range intersection = range.intersection(com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.this.restriction);
                        return com.google.common.collect.Maps.immutableEntry(intersection.lowerBound, intersection);
                    }
                    return (java.util.Map.Entry) endOfData();
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> descendingEntryIterator() {
            if (this.restriction.isEmpty()) {
                return com.google.common.collect.Iterators.emptyIterator();
            }
            com.google.common.collect.Cut cut = (com.google.common.collect.Cut) com.google.common.collect.Ordering.natural().min(this.lowerBoundWindow.upperBound, com.google.common.collect.Cut.belowValue(this.restriction.upperBound));
            final java.util.Iterator<com.google.common.collect.Range<C>> it = this.rangesByLowerBound.headMap((com.google.common.collect.Cut) cut.endpoint(), cut.typeAsUpperBound() == com.google.common.collect.BoundType.CLOSED).descendingMap().values().iterator();
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    if (!it.hasNext()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    com.google.common.collect.Range range = (com.google.common.collect.Range) it.next();
                    if (com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.this.restriction.lowerBound.compareTo((com.google.common.collect.Cut) range.upperBound) < 0) {
                        com.google.common.collect.Range intersection = range.intersection(com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.this.restriction);
                        if (com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.this.lowerBoundWindow.contains(intersection.lowerBound)) {
                            return com.google.common.collect.Maps.immutableEntry(intersection.lowerBound, intersection);
                        }
                        return (java.util.Map.Entry) endOfData();
                    }
                    return (java.util.Map.Entry) endOfData();
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return com.google.common.collect.Iterators.size(entryIterator());
        }
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.RangeSet<C> subRangeSet(com.google.common.collect.Range<C> view) {
        return view.equals(com.google.common.collect.Range.all()) ? this : new com.google.common.collect.TreeRangeSet.SubRangeSet(view);
    }

    private final class SubRangeSet extends com.google.common.collect.TreeRangeSet<C> {
        private final com.google.common.collect.Range<C> restriction;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        SubRangeSet(com.google.common.collect.Range<C> restriction) {
            super(new com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound(com.google.common.collect.Range.all(), restriction, com.google.common.collect.TreeRangeSet.this.rangesByLowerBound));
            this.restriction = restriction;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean encloses(com.google.common.collect.Range<C> range) {
            com.google.common.collect.Range rangeEnclosing;
            return (this.restriction.isEmpty() || !this.restriction.encloses(range) || (rangeEnclosing = com.google.common.collect.TreeRangeSet.this.rangeEnclosing(range)) == null || rangeEnclosing.intersection(this.restriction).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        @javax.annotation.CheckForNull
        public com.google.common.collect.Range<C> rangeContaining(C value) {
            com.google.common.collect.Range<C> rangeContaining;
            if (this.restriction.contains(value) && (rangeContaining = com.google.common.collect.TreeRangeSet.this.rangeContaining(value)) != null) {
                return rangeContaining.intersection(this.restriction);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(com.google.common.collect.Range<C> rangeToAdd) {
            com.google.common.base.Preconditions.checkArgument(this.restriction.encloses(rangeToAdd), "Cannot add range %s to subRangeSet(%s)", rangeToAdd, this.restriction);
            com.google.common.collect.TreeRangeSet.this.add(rangeToAdd);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(com.google.common.collect.Range<C> rangeToRemove) {
            if (rangeToRemove.isConnected(this.restriction)) {
                com.google.common.collect.TreeRangeSet.this.remove(rangeToRemove.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C value) {
            return this.restriction.contains(value) && com.google.common.collect.TreeRangeSet.this.contains(value);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void clear() {
            com.google.common.collect.TreeRangeSet.this.remove(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public com.google.common.collect.RangeSet<C> subRangeSet(com.google.common.collect.Range<C> view) {
            if (view.encloses(this.restriction)) {
                return this;
            }
            if (view.isConnected(this.restriction)) {
                return new com.google.common.collect.TreeRangeSet.SubRangeSet(this.restriction.intersection(view));
            }
            return com.google.common.collect.ImmutableRangeSet.of();
        }
    }
}
