package com.google.common.collect;

/* loaded from: classes9.dex */
class StandardRowSortedTable<R, C, V> extends com.google.common.collect.StandardTable<R, C, V> implements com.google.common.collect.RowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    StandardRowSortedTable(java.util.SortedMap<R, java.util.Map<C, V>> sortedMap, com.google.common.base.Supplier<? extends java.util.Map<C, V>> supplier) {
        super(sortedMap, supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.SortedMap<R, java.util.Map<C, V>> sortedBackingMap() {
        return (java.util.SortedMap) this.backingMap;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.SortedSet<R> rowKeySet() {
        return (java.util.SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public java.util.SortedMap<R, java.util.Map<C, V>> rowMap() {
        return (java.util.SortedMap) super.rowMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.StandardTable
    public java.util.SortedMap<R, java.util.Map<C, V>> createRowMap() {
        return new com.google.common.collect.StandardRowSortedTable.RowSortedMap();
    }

    final class RowSortedMap extends com.google.common.collect.StandardTable<R, C, V>.RowMap implements java.util.SortedMap<R, java.util.Map<C, V>> {
        private RowSortedMap() {
            super();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final java.util.SortedSet<R> keySet() {
            return (java.util.SortedSet) super.keySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.SortedSet<R> createKeySet() {
            return new com.google.common.collect.Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public final java.util.Comparator<? super R> comparator() {
            return com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().comparator();
        }

        @Override // java.util.SortedMap
        public final R firstKey() {
            return (R) com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().firstKey();
        }

        @Override // java.util.SortedMap
        public final R lastKey() {
            return (R) com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().lastKey();
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<R, java.util.Map<C, V>> headMap(R r) {
            com.google.common.base.Preconditions.checkNotNull(r);
            return new com.google.common.collect.StandardRowSortedTable(com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().headMap(r), com.google.common.collect.StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<R, java.util.Map<C, V>> subMap(R r, R r2) {
            com.google.common.base.Preconditions.checkNotNull(r);
            com.google.common.base.Preconditions.checkNotNull(r2);
            return new com.google.common.collect.StandardRowSortedTable(com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().subMap(r, r2), com.google.common.collect.StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public final java.util.SortedMap<R, java.util.Map<C, V>> tailMap(R r) {
            com.google.common.base.Preconditions.checkNotNull(r);
            return new com.google.common.collect.StandardRowSortedTable(com.google.common.collect.StandardRowSortedTable.this.sortedBackingMap().tailMap(r), com.google.common.collect.StandardRowSortedTable.this.factory).rowMap();
        }
    }
}
