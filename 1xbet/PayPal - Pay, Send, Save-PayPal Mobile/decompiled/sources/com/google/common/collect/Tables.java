package com.google.common.collect;

/* loaded from: classes9.dex */
public final class Tables {
    private Tables() {
    }

    public static <T, R, C, V, I extends com.google.common.collect.Table<R, C, V>> java.util.stream.Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> function, java.util.function.Function<? super T, ? extends C> function2, java.util.function.Function<? super T, ? extends V> function3, java.util.function.Supplier<I> supplier) {
        return com.google.common.collect.TableCollectors.toTable(function, function2, function3, supplier);
    }

    public static <T, R, C, V, I extends com.google.common.collect.Table<R, C, V>> java.util.stream.Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> function, java.util.function.Function<? super T, ? extends C> function2, java.util.function.Function<? super T, ? extends V> function3, java.util.function.BinaryOperator<V> binaryOperator, java.util.function.Supplier<I> supplier) {
        return com.google.common.collect.TableCollectors.toTable(function, function2, function3, binaryOperator, supplier);
    }

    public static <R, C, V> com.google.common.collect.Table.Cell<R, C, V> immutableCell(R r, C c, V v) {
        return new com.google.common.collect.Tables.ImmutableCell(r, c, v);
    }

    static final class ImmutableCell<R, C, V> extends com.google.common.collect.Tables.AbstractCell<R, C, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final C columnKey;
        private final R rowKey;
        private final V value;

        ImmutableCell(R r, C c, V v) {
            this.rowKey = r;
            this.columnKey = c;
            this.value = v;
        }

        @Override // com.google.common.collect.Table.Cell
        public final R getRowKey() {
            return this.rowKey;
        }

        @Override // com.google.common.collect.Table.Cell
        public final C getColumnKey() {
            return this.columnKey;
        }

        @Override // com.google.common.collect.Table.Cell
        public final V getValue() {
            return this.value;
        }
    }

    static abstract class AbstractCell<R, C, V> implements com.google.common.collect.Table.Cell<R, C, V> {
        AbstractCell() {
        }

        @Override // com.google.common.collect.Table.Cell
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.common.collect.Table.Cell)) {
                return false;
            }
            com.google.common.collect.Table.Cell cell = (com.google.common.collect.Table.Cell) obj;
            return java.util.Objects.equals(getRowKey(), cell.getRowKey()) && java.util.Objects.equals(getColumnKey(), cell.getColumnKey()) && java.util.Objects.equals(getValue(), cell.getValue());
        }

        @Override // com.google.common.collect.Table.Cell
        public int hashCode() {
            return java.util.Objects.hash(getRowKey(), getColumnKey(), getValue());
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
            sb.append(getRowKey());
            sb.append(",");
            sb.append(getColumnKey());
            sb.append(")=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static <R, C, V> com.google.common.collect.Table<C, R, V> transpose(com.google.common.collect.Table<R, C, V> table) {
        if (table instanceof com.google.common.collect.Tables.TransposeTable) {
            return ((com.google.common.collect.Tables.TransposeTable) table).original;
        }
        return new com.google.common.collect.Tables.TransposeTable(table);
    }

    static final class TransposeTable<C, R, V> extends com.google.common.collect.AbstractTable<C, R, V> {
        final com.google.common.collect.Table<R, C, V> original;

        TransposeTable(com.google.common.collect.Table<R, C, V> table) {
            this.original = (com.google.common.collect.Table) com.google.common.base.Preconditions.checkNotNull(table);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final void clear() {
            this.original.clear();
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<C, V> column(R r) {
            return this.original.row(r);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final java.util.Set<R> columnKeySet() {
            return this.original.rowKeySet();
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<R, java.util.Map<C, V>> columnMap() {
            return this.original.rowMap();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final boolean contains(java.lang.Object obj, java.lang.Object obj2) {
            return this.original.contains(obj2, obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final boolean containsColumn(java.lang.Object obj) {
            return this.original.containsRow(obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final boolean containsRow(java.lang.Object obj) {
            return this.original.containsColumn(obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final boolean containsValue(java.lang.Object obj) {
            return this.original.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final V get(java.lang.Object obj, java.lang.Object obj2) {
            return this.original.get(obj2, obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final V put(C c, R r, V v) {
            return this.original.put(r, c, v);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final void putAll(com.google.common.collect.Table<? extends C, ? extends R, ? extends V> table) {
            this.original.putAll(com.google.common.collect.Tables.transpose(table));
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final V remove(java.lang.Object obj, java.lang.Object obj2) {
            return this.original.remove(obj2, obj);
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<R, V> row(C c) {
            return this.original.column(c);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final java.util.Set<C> rowKeySet() {
            return this.original.columnKeySet();
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<C, java.util.Map<R, V>> rowMap() {
            return this.original.columnMap();
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            return this.original.size();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final java.util.Collection<V> values() {
            return this.original.values();
        }

        @Override // com.google.common.collect.AbstractTable
        final java.util.Iterator<com.google.common.collect.Table.Cell<C, R, V>> cellIterator() {
            return com.google.common.collect.Iterators.transform(this.original.cellSet().iterator(), new com.google.common.base.Function() { // from class: com.google.common.collect.Tables$TransposeTable$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    com.google.common.collect.Table.Cell transposeCell;
                    transposeCell = com.google.common.collect.Tables.transposeCell((com.google.common.collect.Table.Cell) obj);
                    return transposeCell;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <R, C, V> com.google.common.collect.Table.Cell<C, R, V> transposeCell(com.google.common.collect.Table.Cell<R, C, V> cell) {
        return immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue());
    }

    public static <R, C, V> com.google.common.collect.Table<R, C, V> newCustomTable(java.util.Map<R, java.util.Map<C, V>> map, com.google.common.base.Supplier<? extends java.util.Map<C, V>> supplier) {
        com.google.common.base.Preconditions.checkArgument(map.isEmpty());
        com.google.common.base.Preconditions.checkNotNull(supplier);
        return new com.google.common.collect.StandardTable(map, supplier);
    }

    public static <R, C, V1, V2> com.google.common.collect.Table<R, C, V2> transformValues(com.google.common.collect.Table<R, C, V1> table, com.google.common.base.Function<? super V1, V2> function) {
        return new com.google.common.collect.Tables.TransformedTable(table, function);
    }

    static final class TransformedTable<R, C, V1, V2> extends com.google.common.collect.AbstractTable<R, C, V2> {
        final com.google.common.collect.Table<R, C, V1> fromTable;
        final com.google.common.base.Function<? super V1, V2> function;

        TransformedTable(com.google.common.collect.Table<R, C, V1> table, com.google.common.base.Function<? super V1, V2> function) {
            this.fromTable = (com.google.common.collect.Table) com.google.common.base.Preconditions.checkNotNull(table);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final boolean contains(java.lang.Object obj, java.lang.Object obj2) {
            return this.fromTable.contains(obj, obj2);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final V2 get(java.lang.Object obj, java.lang.Object obj2) {
            if (contains(obj, obj2)) {
                return this.function.apply((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.fromTable.get(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            return this.fromTable.size();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final void clear() {
            this.fromTable.clear();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final V2 put(R r, C c, V2 v2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V2> table) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final V2 remove(java.lang.Object obj, java.lang.Object obj2) {
            if (contains(obj, obj2)) {
                return this.function.apply((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.fromTable.remove(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<C, V2> row(R r) {
            return com.google.common.collect.Maps.transformValues(this.fromTable.row(r), this.function);
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<R, V2> column(C c) {
            return com.google.common.collect.Maps.transformValues(this.fromTable.column(c), this.function);
        }

        final com.google.common.collect.Table.Cell<R, C, V2> applyToValue(com.google.common.collect.Table.Cell<R, C, V1> cell) {
            return com.google.common.collect.Tables.immutableCell(cell.getRowKey(), cell.getColumnKey(), this.function.apply(cell.getValue()));
        }

        @Override // com.google.common.collect.AbstractTable
        final java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V2>> cellIterator() {
            return com.google.common.collect.Iterators.transform(this.fromTable.cellSet().iterator(), new com.google.common.base.Function() { // from class: com.google.common.collect.Tables$TransformedTable$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.collect.Tables.TransformedTable.this.applyToValue((com.google.common.collect.Table.Cell) obj);
                }
            });
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final java.util.Set<R> rowKeySet() {
            return this.fromTable.rowKeySet();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public final java.util.Set<C> columnKeySet() {
            return this.fromTable.columnKeySet();
        }

        @Override // com.google.common.collect.AbstractTable
        final java.util.Collection<V2> createValues() {
            return com.google.common.collect.Collections2.transform(this.fromTable.values(), this.function);
        }

        /* renamed from: lambda$rowMap$0$com-google-common-collect-Tables$TransformedTable, reason: not valid java name */
        final /* synthetic */ java.util.Map m10324x34ddce2c(java.util.Map map) {
            return com.google.common.collect.Maps.transformValues(map, this.function);
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<R, java.util.Map<C, V2>> rowMap() {
            return com.google.common.collect.Maps.transformValues(this.fromTable.rowMap(), new com.google.common.base.Function() { // from class: com.google.common.collect.Tables$TransformedTable$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.collect.Tables.TransformedTable.this.m10324x34ddce2c((java.util.Map) obj);
                }
            });
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<C, java.util.Map<R, V2>> columnMap() {
            return com.google.common.collect.Maps.transformValues(this.fromTable.columnMap(), new com.google.common.base.Function() { // from class: com.google.common.collect.Tables$TransformedTable$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.collect.Tables.TransformedTable.this.m10323x6b379e16((java.util.Map) obj);
                }
            });
        }

        /* renamed from: lambda$columnMap$0$com-google-common-collect-Tables$TransformedTable, reason: not valid java name */
        final /* synthetic */ java.util.Map m10323x6b379e16(java.util.Map map) {
            return com.google.common.collect.Maps.transformValues(map, this.function);
        }
    }

    public static <R, C, V> com.google.common.collect.Table<R, C, V> unmodifiableTable(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        return new com.google.common.collect.Tables.UnmodifiableTable(table);
    }

    static class UnmodifiableTable<R, C, V> extends com.google.common.collect.ForwardingTable<R, C, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.Table<? extends R, ? extends C, ? extends V> delegate;

        UnmodifiableTable(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
            this.delegate = (com.google.common.collect.Table) com.google.common.base.Preconditions.checkNotNull(table);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public com.google.common.collect.Table<R, C, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
            return java.util.Collections.unmodifiableSet(super.cellSet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void clear() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<R, V> column(C c) {
            return java.util.Collections.unmodifiableMap(super.column(c));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Set<C> columnKeySet() {
            return java.util.Collections.unmodifiableSet(super.columnKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<C, java.util.Map<R, V>> columnMap() {
            return java.util.Collections.unmodifiableMap(com.google.common.collect.Maps.transformValues(super.columnMap(), new com.google.common.collect.Tables$UnmodifiableTable$$ExternalSyntheticLambda0()));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V put(R r, C c, V v) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V remove(java.lang.Object obj, java.lang.Object obj2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<C, V> row(R r) {
            return java.util.Collections.unmodifiableMap(super.row(r));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Set<R> rowKeySet() {
            return java.util.Collections.unmodifiableSet(super.rowKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Map<R, java.util.Map<C, V>> rowMap() {
            return java.util.Collections.unmodifiableMap(com.google.common.collect.Maps.transformValues(super.rowMap(), new com.google.common.collect.Tables$UnmodifiableTable$$ExternalSyntheticLambda0()));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public java.util.Collection<V> values() {
            return java.util.Collections.unmodifiableCollection(super.values());
        }
    }

    public static <R, C, V> com.google.common.collect.RowSortedTable<R, C, V> unmodifiableRowSortedTable(com.google.common.collect.RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
        return new com.google.common.collect.Tables.UnmodifiableRowSortedMap(rowSortedTable);
    }

    static final class UnmodifiableRowSortedMap<R, C, V> extends com.google.common.collect.Tables.UnmodifiableTable<R, C, V> implements com.google.common.collect.RowSortedTable<R, C, V> {
        private static final long serialVersionUID = 0;

        UnmodifiableRowSortedMap(com.google.common.collect.RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
            super(rowSortedTable);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public final com.google.common.collect.RowSortedTable<R, C, V> delegate() {
            return (com.google.common.collect.RowSortedTable) super.delegate();
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final java.util.SortedMap<R, java.util.Map<C, V>> rowMap() {
            return java.util.Collections.unmodifiableSortedMap(com.google.common.collect.Maps.transformValues((java.util.SortedMap) delegate().rowMap(), new com.google.common.base.Function() { // from class: com.google.common.collect.Tables$UnmodifiableRowSortedMap$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    java.util.Map unmodifiableMap;
                    unmodifiableMap = java.util.Collections.unmodifiableMap((java.util.Map) obj);
                    return unmodifiableMap;
                }
            }));
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final java.util.SortedSet<R> rowKeySet() {
            return java.util.Collections.unmodifiableSortedSet(delegate().rowKeySet());
        }
    }

    public static <R, C, V> com.google.common.collect.Table<R, C, V> synchronizedTable(com.google.common.collect.Table<R, C, V> table) {
        return com.google.common.collect.Synchronized.table(table, null);
    }

    static boolean equalsImpl(com.google.common.collect.Table<?, ?, ?> table, java.lang.Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof com.google.common.collect.Table) {
            return table.cellSet().equals(((com.google.common.collect.Table) obj).cellSet());
        }
        return false;
    }
}
