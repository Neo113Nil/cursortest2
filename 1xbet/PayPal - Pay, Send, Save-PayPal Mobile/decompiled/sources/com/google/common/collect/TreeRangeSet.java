package com.google.common.collect;

/* loaded from: classes9.dex */
public class TreeRangeSet<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractRangeSet<C> implements java.io.Serializable {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Range<C>> asDescendingSetOfRanges;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Range<C>> asRanges;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.RangeSet<C> complement;
    final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound;

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(com.google.common.collect.RangeSet rangeSet) {
        super.addAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(java.lang.Iterable iterable) {
        super.addAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(com.google.common.collect.RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(java.lang.Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(com.google.common.collect.RangeSet rangeSet) {
        super.removeAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(java.lang.Iterable iterable) {
        super.removeAll(iterable);
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.TreeRangeSet<C> create() {
        return new com.google.common.collect.TreeRangeSet<>(new java.util.TreeMap());
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.TreeRangeSet<C> create(com.google.common.collect.RangeSet<C> rangeSet) {
        com.google.common.collect.TreeRangeSet<C> create = create();
        create.addAll(rangeSet);
        return create;
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.TreeRangeSet<C> create(java.lang.Iterable<com.google.common.collect.Range<C>> iterable) {
        com.google.common.collect.TreeRangeSet<C> create = create();
        create.addAll(iterable);
        return create;
    }

    private TreeRangeSet(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    @Override // com.google.common.collect.RangeSet
    public java.util.Set<com.google.common.collect.Range<C>> asRanges() {
        java.util.Set<com.google.common.collect.Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        com.google.common.collect.TreeRangeSet.AsRanges asRanges = new com.google.common.collect.TreeRangeSet.AsRanges(this.rangesByLowerBound.values());
        this.asRanges = asRanges;
        return asRanges;
    }

    @Override // com.google.common.collect.RangeSet
    public java.util.Set<com.google.common.collect.Range<C>> asDescendingSetOfRanges() {
        java.util.Set<com.google.common.collect.Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        com.google.common.collect.TreeRangeSet.AsRanges asRanges = new com.google.common.collect.TreeRangeSet.AsRanges(this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = asRanges;
        return asRanges;
    }

    final class AsRanges extends com.google.common.collect.ForwardingCollection<com.google.common.collect.Range<C>> implements java.util.Set<com.google.common.collect.Range<C>> {
        final java.util.Collection<com.google.common.collect.Range<C>> delegate;

        AsRanges(java.util.Collection<com.google.common.collect.Range<C>> collection) {
            this.delegate = collection;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Collection<com.google.common.collect.Range<C>> delegate() {
            return this.delegate;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return com.google.common.collect.Sets.hashCodeImpl(this);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(java.lang.Object obj) {
            return com.google.common.collect.Sets.equalsImpl(this, obj);
        }
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public com.google.common.collect.Range<C> rangeContaining(C c) {
        com.google.common.base.Preconditions.checkNotNull(c);
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(com.google.common.collect.Cut.belowValue(c));
        if (floorEntry == null || !floorEntry.getValue().contains(c)) {
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
    public void add(com.google.common.collect.Range<C> range) {
        com.google.common.base.Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return;
        }
        com.google.common.collect.Cut<C> cut = range.lowerBound;
        com.google.common.collect.Cut<C> cut2 = range.upperBound;
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
    public void remove(com.google.common.collect.Range<C> range) {
        com.google.common.base.Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return;
        }
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (lowerEntry != null) {
            com.google.common.collect.Range<C> value = lowerEntry.getValue();
            if (value.upperBound.compareTo(range.lowerBound) >= 0) {
                if (range.hasUpperBound() && value.upperBound.compareTo(range.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(com.google.common.collect.Range.create(range.upperBound, value.upperBound));
                }
                replaceRangeWithSameLowerBound(com.google.common.collect.Range.create(value.lowerBound, range.lowerBound));
            }
        }
        java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
        if (floorEntry != null) {
            com.google.common.collect.Range<C> value2 = floorEntry.getValue();
            if (range.hasUpperBound() && value2.upperBound.compareTo(range.upperBound) >= 0) {
                replaceRangeWithSameLowerBound(com.google.common.collect.Range.create(range.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
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

        RangesByUpperBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> navigableMap) {
            this.rangesByLowerBound = navigableMap;
            this.upperBoundWindow = com.google.common.collect.Range.all();
        }

        private RangesByUpperBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> navigableMap, com.google.common.collect.Range<com.google.common.collect.Cut<C>> range) {
            this.rangesByLowerBound = navigableMap;
            this.upperBoundWindow = range;
        }

        private java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Range<com.google.common.collect.Cut<C>> range) {
            if (range.isConnected(this.upperBoundWindow)) {
                return new com.google.common.collect.TreeRangeSet.RangesByUpperBound(this.rangesByLowerBound, range.intersection(this.upperBoundWindow));
            }
            return com.google.common.collect.ImmutableSortedMap.of();
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Cut<C> cut, boolean z, com.google.common.collect.Cut<C> cut2, boolean z2) {
            return subMap(com.google.common.collect.Range.range(cut, com.google.common.collect.BoundType.forBoolean(z), cut2, com.google.common.collect.BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> headMap(com.google.common.collect.Cut<C> cut, boolean z) {
            return subMap(com.google.common.collect.Range.upTo(cut, com.google.common.collect.BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> tailMap(com.google.common.collect.Cut<C> cut, boolean z) {
            return subMap(com.google.common.collect.Range.downTo(cut, com.google.common.collect.BoundType.forBoolean(z)));
        }

        @Override // java.util.SortedMap
        public final java.util.Comparator<? super com.google.common.collect.Cut<C>> comparator() {
            return com.google.common.collect.Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public final com.google.common.collect.Range<C> get(java.lang.Object obj) {
            java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> lowerEntry;
            if (obj instanceof com.google.common.collect.Cut) {
                try {
                    com.google.common.collect.Cut<C> cut = (com.google.common.collect.Cut) obj;
                    if (this.upperBoundWindow.contains(cut) && (lowerEntry = this.rangesByLowerBound.lowerEntry(cut)) != null && lowerEntry.getValue().upperBound.equals(cut)) {
                        return lowerEntry.getValue();
                    }
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> entryIterator() {
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
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.1
                final /* synthetic */ com.google.common.collect.TreeRangeSet.RangesByUpperBound this$0;

                {
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    if (!it.hasNext()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    com.google.common.collect.Range range = (com.google.common.collect.Range) it.next();
                    if (this.this$0.upperBoundWindow.upperBound.isLessThan(range.upperBound)) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    return com.google.common.collect.Maps.immutableEntry(range.upperBound, range);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> descendingEntryIterator() {
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
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.2
                final /* synthetic */ com.google.common.collect.TreeRangeSet.RangesByUpperBound this$0;

                {
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    if (!peekingIterator.hasNext()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    com.google.common.collect.Range range = (com.google.common.collect.Range) peekingIterator.next();
                    if (this.this$0.upperBoundWindow.lowerBound.isLessThan(range.upperBound)) {
                        return com.google.common.collect.Maps.immutableEntry(range.upperBound, range);
                    }
                    return (java.util.Map.Entry) endOfData();
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final int size() {
            if (this.upperBoundWindow.equals(com.google.common.collect.Range.all())) {
                return this.rangesByLowerBound.size();
            }
            return com.google.common.collect.Iterators.size(entryIterator());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            if (this.upperBoundWindow.equals(com.google.common.collect.Range.all())) {
                return this.rangesByLowerBound.isEmpty();
            }
            return !entryIterator().hasNext();
        }
    }

    static final class ComplementRangesByLowerBound<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractNavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> {
        private final com.google.common.collect.Range<com.google.common.collect.Cut<C>> complementLowerBoundWindow;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> positiveRangesByLowerBound;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> positiveRangesByUpperBound;

        ComplementRangesByLowerBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> navigableMap) {
            this(navigableMap, com.google.common.collect.Range.all());
        }

        private ComplementRangesByLowerBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> navigableMap, com.google.common.collect.Range<com.google.common.collect.Cut<C>> range) {
            this.positiveRangesByLowerBound = navigableMap;
            this.positiveRangesByUpperBound = new com.google.common.collect.TreeRangeSet.RangesByUpperBound(navigableMap);
            this.complementLowerBoundWindow = range;
        }

        private java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Range<com.google.common.collect.Cut<C>> range) {
            if (!this.complementLowerBoundWindow.isConnected(range)) {
                return com.google.common.collect.ImmutableSortedMap.of();
            }
            return new com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound(this.positiveRangesByLowerBound, range.intersection(this.complementLowerBoundWindow));
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Cut<C> cut, boolean z, com.google.common.collect.Cut<C> cut2, boolean z2) {
            return subMap(com.google.common.collect.Range.range(cut, com.google.common.collect.BoundType.forBoolean(z), cut2, com.google.common.collect.BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> headMap(com.google.common.collect.Cut<C> cut, boolean z) {
            return subMap(com.google.common.collect.Range.upTo(cut, com.google.common.collect.BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> tailMap(com.google.common.collect.Cut<C> cut, boolean z) {
            return subMap(com.google.common.collect.Range.downTo(cut, com.google.common.collect.BoundType.forBoolean(z)));
        }

        @Override // java.util.SortedMap
        public final java.util.Comparator<? super com.google.common.collect.Cut<C>> comparator() {
            return com.google.common.collect.Ordering.natural();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> entryIterator() {
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
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>(this, cut, peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.1
                com.google.common.collect.Cut<C> nextComplementRangeLowerBound;
                final /* synthetic */ com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound this$0;
                final /* synthetic */ com.google.common.collect.Cut val$firstComplementRangeLowerBound;
                final /* synthetic */ com.google.common.collect.PeekingIterator val$positiveItr;

                {
                    this.val$firstComplementRangeLowerBound = cut;
                    this.val$positiveItr = peekingIterator;
                    this.this$0 = this;
                    this.nextComplementRangeLowerBound = cut;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    com.google.common.collect.Range create;
                    if (this.this$0.complementLowerBoundWindow.upperBound.isLessThan(this.nextComplementRangeLowerBound) || this.nextComplementRangeLowerBound == com.google.common.collect.Cut.aboveAll()) {
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
        final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> descendingEntryIterator() {
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
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>(this, (com.google.common.collect.Cut) com.google.common.base.MoreObjects.firstNonNull(higherKey, com.google.common.collect.Cut.aboveAll()), peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.2
                com.google.common.collect.Cut<C> nextComplementRangeUpperBound;
                final /* synthetic */ com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound this$0;
                final /* synthetic */ com.google.common.collect.Cut val$firstComplementRangeUpperBound;
                final /* synthetic */ com.google.common.collect.PeekingIterator val$positiveItr;

                {
                    this.val$firstComplementRangeUpperBound = r2;
                    this.val$positiveItr = peekingIterator;
                    this.this$0 = this;
                    this.nextComplementRangeUpperBound = r2;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    if (this.nextComplementRangeUpperBound == com.google.common.collect.Cut.belowAll()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    if (!this.val$positiveItr.hasNext()) {
                        if (this.this$0.complementLowerBoundWindow.lowerBound.isLessThan(com.google.common.collect.Cut.belowAll())) {
                            com.google.common.collect.Range create = com.google.common.collect.Range.create(com.google.common.collect.Cut.belowAll(), this.nextComplementRangeUpperBound);
                            this.nextComplementRangeUpperBound = com.google.common.collect.Cut.belowAll();
                            return com.google.common.collect.Maps.immutableEntry(com.google.common.collect.Cut.belowAll(), create);
                        }
                    } else {
                        com.google.common.collect.Range range = (com.google.common.collect.Range) this.val$positiveItr.next();
                        com.google.common.collect.Range create2 = com.google.common.collect.Range.create(range.upperBound, this.nextComplementRangeUpperBound);
                        this.nextComplementRangeUpperBound = range.lowerBound;
                        if (this.this$0.complementLowerBoundWindow.lowerBound.isLessThan(create2.lowerBound)) {
                            return com.google.common.collect.Maps.immutableEntry(create2.lowerBound, create2);
                        }
                    }
                    return (java.util.Map.Entry) endOfData();
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final int size() {
            return com.google.common.collect.Iterators.size(entryIterator());
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public final com.google.common.collect.Range<C> get(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.collect.Cut)) {
                return null;
            }
            try {
                com.google.common.collect.Cut<C> cut = (com.google.common.collect.Cut) obj;
                java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> firstEntry = tailMap((com.google.common.collect.Cut) cut, true).firstEntry();
                if (firstEntry == null || !firstEntry.getKey().equals(cut)) {
                    return null;
                }
                return firstEntry.getValue();
            } catch (java.lang.ClassCastException unused) {
                return null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return get(obj) != null;
        }
    }

    final class Complement extends com.google.common.collect.TreeRangeSet<C> {
        Complement() {
            super(new com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound(com.google.common.collect.TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public final void add(com.google.common.collect.Range<C> range) {
            com.google.common.collect.TreeRangeSet.this.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public final void remove(com.google.common.collect.Range<C> range) {
            com.google.common.collect.TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public final boolean contains(C c) {
            return !com.google.common.collect.TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public final com.google.common.collect.RangeSet<C> complement() {
            return com.google.common.collect.TreeRangeSet.this;
        }
    }

    static final class SubRangeSetRangesByLowerBound<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractNavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> {
        private final com.google.common.collect.Range<com.google.common.collect.Cut<C>> lowerBoundWindow;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByUpperBound;
        private final com.google.common.collect.Range<C> restriction;

        private SubRangeSetRangesByLowerBound(com.google.common.collect.Range<com.google.common.collect.Cut<C>> range, com.google.common.collect.Range<C> range2, java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> navigableMap) {
            this.lowerBoundWindow = (com.google.common.collect.Range) com.google.common.base.Preconditions.checkNotNull(range);
            this.restriction = (com.google.common.collect.Range) com.google.common.base.Preconditions.checkNotNull(range2);
            this.rangesByLowerBound = (java.util.NavigableMap) com.google.common.base.Preconditions.checkNotNull(navigableMap);
            this.rangesByUpperBound = new com.google.common.collect.TreeRangeSet.RangesByUpperBound(navigableMap);
        }

        private java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Range<com.google.common.collect.Cut<C>> range) {
            if (!range.isConnected(this.lowerBoundWindow)) {
                return com.google.common.collect.ImmutableSortedMap.of();
            }
            return new com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound(this.lowerBoundWindow.intersection(range), this.restriction, this.rangesByLowerBound);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Cut<C> cut, boolean z, com.google.common.collect.Cut<C> cut2, boolean z2) {
            return subMap(com.google.common.collect.Range.range(cut, com.google.common.collect.BoundType.forBoolean(z), cut2, com.google.common.collect.BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> headMap(com.google.common.collect.Cut<C> cut, boolean z) {
            return subMap(com.google.common.collect.Range.upTo(cut, com.google.common.collect.BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> tailMap(com.google.common.collect.Cut<C> cut, boolean z) {
            return subMap(com.google.common.collect.Range.downTo(cut, com.google.common.collect.BoundType.forBoolean(z)));
        }

        @Override // java.util.SortedMap
        public final java.util.Comparator<? super com.google.common.collect.Cut<C>> comparator() {
            return com.google.common.collect.Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public final com.google.common.collect.Range<C> get(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.collect.Cut)) {
                return null;
            }
            try {
                com.google.common.collect.Cut<C> cut = (com.google.common.collect.Cut) obj;
                if (this.lowerBoundWindow.contains(cut) && cut.compareTo(this.restriction.lowerBound) >= 0 && cut.compareTo(this.restriction.upperBound) < 0) {
                    if (cut.equals(this.restriction.lowerBound)) {
                        com.google.common.collect.Range range = (com.google.common.collect.Range) com.google.common.collect.Maps.valueOrNull(this.rangesByLowerBound.floorEntry(cut));
                        if (range == null || range.upperBound.compareTo((com.google.common.collect.Cut) this.restriction.lowerBound) <= 0) {
                            return null;
                        }
                        return range.intersection(this.restriction);
                    }
                    com.google.common.collect.Range range2 = (com.google.common.collect.Range) this.rangesByLowerBound.get(cut);
                    if (range2 != null) {
                        return range2.intersection(this.restriction);
                    }
                    return null;
                }
                return null;
            } catch (java.lang.ClassCastException unused) {
                return null;
            }
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> entryIterator() {
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
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.1
                final /* synthetic */ com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound this$0;

                {
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    if (!it.hasNext()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    com.google.common.collect.Range range = (com.google.common.collect.Range) it.next();
                    if (!cut.isLessThan(range.lowerBound)) {
                        com.google.common.collect.Range intersection = range.intersection(this.this$0.restriction);
                        return com.google.common.collect.Maps.immutableEntry(intersection.lowerBound, intersection);
                    }
                    return (java.util.Map.Entry) endOfData();
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> descendingEntryIterator() {
            if (this.restriction.isEmpty()) {
                return com.google.common.collect.Iterators.emptyIterator();
            }
            com.google.common.collect.Cut cut = (com.google.common.collect.Cut) com.google.common.collect.Ordering.natural().min(this.lowerBoundWindow.upperBound, com.google.common.collect.Cut.belowValue(this.restriction.upperBound));
            final java.util.Iterator<com.google.common.collect.Range<C>> it = this.rangesByLowerBound.headMap((com.google.common.collect.Cut) cut.endpoint(), cut.typeAsUpperBound() == com.google.common.collect.BoundType.CLOSED).descendingMap().values().iterator();
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.2
                final /* synthetic */ com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound this$0;

                {
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> computeNext() {
                    if (!it.hasNext()) {
                        return (java.util.Map.Entry) endOfData();
                    }
                    com.google.common.collect.Range range = (com.google.common.collect.Range) it.next();
                    if (this.this$0.restriction.lowerBound.compareTo((com.google.common.collect.Cut) range.upperBound) < 0) {
                        com.google.common.collect.Range intersection = range.intersection(this.this$0.restriction);
                        if (this.this$0.lowerBoundWindow.contains(intersection.lowerBound)) {
                            return com.google.common.collect.Maps.immutableEntry(intersection.lowerBound, intersection);
                        }
                        return (java.util.Map.Entry) endOfData();
                    }
                    return (java.util.Map.Entry) endOfData();
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final int size() {
            return com.google.common.collect.Iterators.size(entryIterator());
        }
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.RangeSet<C> subRangeSet(com.google.common.collect.Range<C> range) {
        return range.equals(com.google.common.collect.Range.all()) ? this : new com.google.common.collect.TreeRangeSet.SubRangeSet(range);
    }

    final class SubRangeSet extends com.google.common.collect.TreeRangeSet<C> {
        private final com.google.common.collect.Range<C> restriction;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        SubRangeSet(com.google.common.collect.Range<C> range) {
            super(new com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound(com.google.common.collect.Range.all(), range, com.google.common.collect.TreeRangeSet.this.rangesByLowerBound));
            this.restriction = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public final boolean encloses(com.google.common.collect.Range<C> range) {
            com.google.common.collect.Range rangeEnclosing;
            return (this.restriction.isEmpty() || !this.restriction.encloses(range) || (rangeEnclosing = com.google.common.collect.TreeRangeSet.this.rangeEnclosing(range)) == null || rangeEnclosing.intersection(this.restriction).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public final com.google.common.collect.Range<C> rangeContaining(C c) {
            com.google.common.collect.Range<C> rangeContaining;
            if (this.restriction.contains(c) && (rangeContaining = com.google.common.collect.TreeRangeSet.this.rangeContaining(c)) != null) {
                return rangeContaining.intersection(this.restriction);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public final void add(com.google.common.collect.Range<C> range) {
            com.google.common.base.Preconditions.checkArgument(this.restriction.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.restriction);
            com.google.common.collect.TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public final void remove(com.google.common.collect.Range<C> range) {
            if (range.isConnected(this.restriction)) {
                com.google.common.collect.TreeRangeSet.this.remove(range.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public final boolean contains(C c) {
            return this.restriction.contains(c) && com.google.common.collect.TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public final void clear() {
            com.google.common.collect.TreeRangeSet.this.remove(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public final com.google.common.collect.RangeSet<C> subRangeSet(com.google.common.collect.Range<C> range) {
            if (range.encloses(this.restriction)) {
                return this;
            }
            if (range.isConnected(this.restriction)) {
                return new com.google.common.collect.TreeRangeSet.SubRangeSet(this.restriction.intersection(range));
            }
            return com.google.common.collect.ImmutableRangeSet.of();
        }
    }
}
