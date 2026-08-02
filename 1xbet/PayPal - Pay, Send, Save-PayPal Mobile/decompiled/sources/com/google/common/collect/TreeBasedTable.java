package com.google.common.collect;

/* loaded from: classes9.dex */
public class TreeBasedTable<R, C, V> extends com.google.common.collect.StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final java.util.Comparator<? super C> columnComparator;

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map column(java.lang.Object obj) {
        return super.column(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Object obj, java.lang.Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(java.lang.Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(java.lang.Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsValue(java.lang.Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj, java.lang.Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void putAll(com.google.common.collect.Table table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj, java.lang.Object obj2) {
        return super.remove(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map row(java.lang.Object obj) {
        return row((com.google.common.collect.TreeBasedTable<R, C, V>) obj);
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.SortedSet rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.SortedMap rowMap() {
        return super.rowMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Collection values() {
        return super.values();
    }

    static final class Factory<C, V> implements com.google.common.base.Supplier<java.util.Map<C, V>>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.Comparator<? super C> comparator;

        Factory(java.util.Comparator<? super C> comparator) {
            this.comparator = comparator;
        }

        @Override // com.google.common.base.Supplier
        public final java.util.Map<C, V> get() {
            return new java.util.TreeMap(this.comparator);
        }
    }

    public static <R extends java.lang.Comparable, C extends java.lang.Comparable, V> com.google.common.collect.TreeBasedTable<R, C, V> create() {
        return new com.google.common.collect.TreeBasedTable<>(com.google.common.collect.Ordering.natural(), com.google.common.collect.Ordering.natural());
    }

    public static <R, C, V> com.google.common.collect.TreeBasedTable<R, C, V> create(java.util.Comparator<? super R> comparator, java.util.Comparator<? super C> comparator2) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        com.google.common.base.Preconditions.checkNotNull(comparator2);
        return new com.google.common.collect.TreeBasedTable<>(comparator, comparator2);
    }

    public static <R, C, V> com.google.common.collect.TreeBasedTable<R, C, V> create(com.google.common.collect.TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        com.google.common.collect.TreeBasedTable<R, C, V> treeBasedTable2 = new com.google.common.collect.TreeBasedTable<>((java.util.Comparator) java.util.Objects.requireNonNull(treeBasedTable.rowKeySet().comparator()), treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
    }

    TreeBasedTable(java.util.Comparator<? super R> comparator, java.util.Comparator<? super C> comparator2) {
        super(new java.util.TreeMap(comparator), new com.google.common.collect.TreeBasedTable.Factory(comparator2));
        this.columnComparator = comparator2;
    }

    @java.lang.Deprecated
    public final java.util.Comparator<? super R> rowComparator() {
        return (java.util.Comparator) java.util.Objects.requireNonNull(rowKeySet().comparator());
    }

    @java.lang.Deprecated
    public java.util.Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public java.util.SortedMap<C, V> row(R r) {
        return new com.google.common.collect.TreeBasedTable.TreeRow(this, r);
    }

    final class TreeRow extends com.google.common.collect.StandardTable<R, C, V>.Row implements java.util.SortedMap<C, V> {
        final C lowerBound;
        final C upperBound;
        transient java.util.SortedMap<C, V> wholeRow;

        TreeRow(com.google.common.collect.TreeBasedTable treeBasedTable, R r) {
            this(r, null, null);
        }

        TreeRow(R r, C c, C c2) {
            super(r);
            this.lowerBound = c;
            this.upperBound = c2;
            com.google.common.base.Preconditions.checkArgument(c == null || c2 == null || compare(c, c2) <= 0);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final java.util.SortedSet<C> keySet() {
            return new com.google.common.collect.Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public final java.util.Comparator<? super C> comparator() {
            return com.google.common.collect.TreeBasedTable.this.columnComparator();
        }

        final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return comparator().compare(obj, obj2);
        }

        final boolean rangeContains(java.lang.Object obj) {
            if (obj == null) {
                return false;
            }
            C c = this.lowerBound;
            if (c != null && compare(c, obj) > 0) {
                return false;
            }
            C c2 = this.upperBound;
            return c2 == null || compare(c2, obj) > 0;
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<C, V> subMap(C c, C c2) {
            com.google.common.base.Preconditions.checkArgument(rangeContains(com.google.common.base.Preconditions.checkNotNull(c)) && rangeContains(com.google.common.base.Preconditions.checkNotNull(c2)));
            return new com.google.common.collect.TreeBasedTable.TreeRow(this.rowKey, c, c2);
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<C, V> headMap(C c) {
            com.google.common.base.Preconditions.checkArgument(rangeContains(com.google.common.base.Preconditions.checkNotNull(c)));
            return new com.google.common.collect.TreeBasedTable.TreeRow(this.rowKey, this.lowerBound, c);
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<C, V> tailMap(C c) {
            com.google.common.base.Preconditions.checkArgument(rangeContains(com.google.common.base.Preconditions.checkNotNull(c)));
            return new com.google.common.collect.TreeBasedTable.TreeRow(this.rowKey, c, this.upperBound);
        }

        @Override // java.util.SortedMap
        public final C firstKey() {
            updateBackingRowMapField();
            if (this.backingRowMap == null) {
                throw new java.util.NoSuchElementException();
            }
            return (C) ((java.util.SortedMap) this.backingRowMap).firstKey();
        }

        @Override // java.util.SortedMap
        public final C lastKey() {
            updateBackingRowMapField();
            if (this.backingRowMap == null) {
                throw new java.util.NoSuchElementException();
            }
            return (C) ((java.util.SortedMap) this.backingRowMap).lastKey();
        }

        final void updateWholeRowField() {
            java.util.SortedMap<C, V> sortedMap = this.wholeRow;
            if (sortedMap == null || (sortedMap.isEmpty() && com.google.common.collect.TreeBasedTable.this.backingMap.containsKey(this.rowKey))) {
                this.wholeRow = (java.util.SortedMap) com.google.common.collect.TreeBasedTable.this.backingMap.get(this.rowKey);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.StandardTable.Row
        public final java.util.SortedMap<C, V> computeBackingRowMap() {
            updateWholeRowField();
            java.util.SortedMap<C, V> sortedMap = this.wholeRow;
            if (sortedMap == null) {
                return null;
            }
            C c = this.lowerBound;
            if (c != null) {
                sortedMap = sortedMap.tailMap(c);
            }
            C c2 = this.upperBound;
            return c2 != null ? sortedMap.headMap(c2) : sortedMap;
        }

        @Override // com.google.common.collect.StandardTable.Row
        final void maintainEmptyInvariant() {
            updateWholeRowField();
            java.util.SortedMap<C, V> sortedMap = this.wholeRow;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            com.google.common.collect.TreeBasedTable.this.backingMap.remove(this.rowKey);
            this.wholeRow = null;
            this.backingRowMap = null;
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return rangeContains(obj) && super.containsKey(obj);
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public final V put(C c, V v) {
            com.google.common.base.Preconditions.checkArgument(rangeContains(com.google.common.base.Preconditions.checkNotNull(c)));
            return (V) super.put(c, v);
        }
    }

    @Override // com.google.common.collect.StandardTable
    java.util.Iterator<C> createColumnKeyIterator() {
        final java.util.Comparator<? super C> columnComparator = columnComparator();
        final com.google.common.collect.UnmodifiableIterator mergeSorted = com.google.common.collect.Iterators.mergeSorted(com.google.common.collect.Iterables.transform(this.backingMap.values(), new com.google.common.base.Function() { // from class: com.google.common.collect.TreeBasedTable$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.Iterator it;
                it = ((java.util.Map) obj).keySet().iterator();
                return it;
            }
        }), columnComparator);
        return new com.google.common.collect.AbstractIterator<C>(this) { // from class: com.google.common.collect.TreeBasedTable.1
            C lastValue;
            final /* synthetic */ com.google.common.collect.TreeBasedTable this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.collect.AbstractIterator
            protected C computeNext() {
                while (mergeSorted.hasNext()) {
                    C c = (C) mergeSorted.next();
                    C c2 = this.lastValue;
                    if (c2 == null || columnComparator.compare(c, c2) != 0) {
                        this.lastValue = c;
                        return c;
                    }
                }
                this.lastValue = null;
                return endOfData();
            }
        };
    }
}
