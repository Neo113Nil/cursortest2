package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class AbstractTable<R, C, V> implements com.google.common.collect.Table<R, C, V> {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<V> values;

    abstract java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> cellIterator();

    AbstractTable() {
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(java.lang.Object obj) {
        return com.google.common.collect.Maps.safeContainsKey(rowMap(), obj);
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(java.lang.Object obj) {
        return com.google.common.collect.Maps.safeContainsKey(columnMap(), obj);
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(java.lang.Object obj) {
        java.util.Iterator<java.util.Map<C, V>> it = rowMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Table
    public boolean contains(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = (java.util.Map) com.google.common.collect.Maps.safeGet(rowMap(), obj);
        return map != null && com.google.common.collect.Maps.safeContainsKey(map, obj2);
    }

    @Override // com.google.common.collect.Table
    public V get(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = (java.util.Map) com.google.common.collect.Maps.safeGet(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) com.google.common.collect.Maps.safeGet(map, obj2);
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.Table
    public void clear() {
        com.google.common.collect.Iterators.clear(cellSet().iterator());
    }

    @Override // com.google.common.collect.Table
    public V remove(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = (java.util.Map) com.google.common.collect.Maps.safeGet(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) com.google.common.collect.Maps.safeRemove(map, obj2);
    }

    @Override // com.google.common.collect.Table
    public V put(R r, C c, V v) {
        return row(r).put(c, v);
    }

    @Override // com.google.common.collect.Table
    public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        for (com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V> cell : table.cellSet()) {
            put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
        }
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
        java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> set = this.cellSet;
        if (set != null) {
            return set;
        }
        java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> createCellSet = createCellSet();
        this.cellSet = createCellSet;
        return createCellSet;
    }

    java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
        return new com.google.common.collect.AbstractTable.CellSet();
    }

    final class CellSet extends java.util.AbstractSet<com.google.common.collect.Table.Cell<R, C, V>> {
        private CellSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.collect.Table.Cell)) {
                return false;
            }
            com.google.common.collect.Table.Cell cell = (com.google.common.collect.Table.Cell) obj;
            java.util.Map map = (java.util.Map) com.google.common.collect.Maps.safeGet(com.google.common.collect.AbstractTable.this.rowMap(), cell.getRowKey());
            return map != null && com.google.common.collect.Collections2.safeContains(map.entrySet(), com.google.common.collect.Maps.immutableEntry(cell.getColumnKey(), cell.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.collect.Table.Cell)) {
                return false;
            }
            com.google.common.collect.Table.Cell cell = (com.google.common.collect.Table.Cell) obj;
            java.util.Map map = (java.util.Map) com.google.common.collect.Maps.safeGet(com.google.common.collect.AbstractTable.this.rowMap(), cell.getRowKey());
            return map != null && com.google.common.collect.Collections2.safeRemove(map.entrySet(), com.google.common.collect.Maps.immutableEntry(cell.getColumnKey(), cell.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.google.common.collect.AbstractTable.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> iterator() {
            return com.google.common.collect.AbstractTable.this.cellIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.google.common.collect.AbstractTable.this.size();
        }
    }

    @Override // com.google.common.collect.Table
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
        return new com.google.common.collect.AbstractTable.Values();
    }

    java.util.Iterator<V> valuesIterator() {
        return new com.google.common.collect.TransformedIterator<com.google.common.collect.Table.Cell<R, C, V>, V>(cellSet().iterator()) { // from class: com.google.common.collect.AbstractTable.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            public V transform(com.google.common.collect.Table.Cell<R, C, V> cell) {
                return cell.getValue();
            }
        };
    }

    final class Values extends java.util.AbstractCollection<V> {
        private Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            return com.google.common.collect.AbstractTable.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.collect.AbstractTable.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            com.google.common.collect.AbstractTable.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return com.google.common.collect.AbstractTable.this.size();
        }
    }

    @Override // com.google.common.collect.Table
    public boolean equals(java.lang.Object obj) {
        return com.google.common.collect.Tables.equalsImpl(this, obj);
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return cellSet().hashCode();
    }

    public java.lang.String toString() {
        return rowMap().toString();
    }
}
