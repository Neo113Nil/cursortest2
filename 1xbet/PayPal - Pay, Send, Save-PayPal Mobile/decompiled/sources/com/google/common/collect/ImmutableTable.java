package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ImmutableTable<R, C, V> extends com.google.common.collect.AbstractTable<R, C, V> implements java.io.Serializable {
    private static final long serialVersionUID = 912559;

    @Override // com.google.common.collect.Table
    public abstract com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractTable
    public abstract com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractTable
    public abstract com.google.common.collect.ImmutableCollection<V> createValues();

    @Override // com.google.common.collect.Table
    public abstract com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap();

    abstract java.lang.Object writeReplace();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map column(java.lang.Object obj) {
        return column((com.google.common.collect.ImmutableTable<R, C, V>) obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(java.lang.Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(java.lang.Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj, java.lang.Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map row(java.lang.Object obj) {
        return row((com.google.common.collect.ImmutableTable<R, C, V>) obj);
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public static <T, R, C, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> toImmutableTable(java.util.function.Function<? super T, ? extends R> function, java.util.function.Function<? super T, ? extends C> function2, java.util.function.Function<? super T, ? extends V> function3) {
        return com.google.common.collect.TableCollectors.toImmutableTable(function, function2, function3);
    }

    public static <T, R, C, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> toImmutableTable(java.util.function.Function<? super T, ? extends R> function, java.util.function.Function<? super T, ? extends C> function2, java.util.function.Function<? super T, ? extends V> function3, java.util.function.BinaryOperator<V> binaryOperator) {
        return com.google.common.collect.TableCollectors.toImmutableTable(function, function2, function3, binaryOperator);
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> of() {
        return (com.google.common.collect.ImmutableTable<R, C, V>) com.google.common.collect.SparseImmutableTable.EMPTY;
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> of(R r, C c, V v) {
        return new com.google.common.collect.SingletonImmutableTable(r, c, v);
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> copyOf(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        if (table instanceof com.google.common.collect.ImmutableTable) {
            return (com.google.common.collect.ImmutableTable) table;
        }
        return copyOf(table.cellSet());
    }

    static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> copyOf(java.lang.Iterable<? extends com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V>> iterable) {
        com.google.common.collect.ImmutableTable.Builder builder = builder();
        java.util.Iterator<? extends com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            builder.put(it.next());
        }
        return builder.buildOrThrow();
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable.Builder<R, C, V> builder() {
        return new com.google.common.collect.ImmutableTable.Builder<>();
    }

    static <R, C, V> com.google.common.collect.Table.Cell<R, C, V> cellOf(R r, C c, V v) {
        return com.google.common.collect.Tables.immutableCell(com.google.common.base.Preconditions.checkNotNull(r, "rowKey"), com.google.common.base.Preconditions.checkNotNull(c, "columnKey"), com.google.common.base.Preconditions.checkNotNull(v, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE));
    }

    @com.google.errorprone.annotations.DoNotMock
    public static final class Builder<R, C, V> {
        private final java.util.List<com.google.common.collect.Table.Cell<R, C, V>> cells = new java.util.ArrayList();
        private java.util.Comparator<? super C> columnComparator;
        private java.util.Comparator<? super R> rowComparator;

        public final com.google.common.collect.ImmutableTable.Builder<R, C, V> orderRowsBy(java.util.Comparator<? super R> comparator) {
            this.rowComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator, "rowComparator");
            return this;
        }

        public final com.google.common.collect.ImmutableTable.Builder<R, C, V> orderColumnsBy(java.util.Comparator<? super C> comparator) {
            this.columnComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator, "columnComparator");
            return this;
        }

        public final com.google.common.collect.ImmutableTable.Builder<R, C, V> put(R r, C c, V v) {
            this.cells.add(com.google.common.collect.ImmutableTable.cellOf(r, c, v));
            return this;
        }

        public final com.google.common.collect.ImmutableTable.Builder<R, C, V> put(com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V> cell) {
            if (cell instanceof com.google.common.collect.Tables.ImmutableCell) {
                com.google.common.base.Preconditions.checkNotNull(cell.getRowKey(), "row");
                com.google.common.base.Preconditions.checkNotNull(cell.getColumnKey(), "column");
                com.google.common.base.Preconditions.checkNotNull(cell.getValue(), com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                this.cells.add(cell);
                return this;
            }
            put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
            return this;
        }

        public final com.google.common.collect.ImmutableTable.Builder<R, C, V> putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
            java.util.Iterator<com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V>> it = table.cellSet().iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        final com.google.common.collect.ImmutableTable.Builder<R, C, V> combine(com.google.common.collect.ImmutableTable.Builder<R, C, V> builder) {
            this.cells.addAll(builder.cells);
            return this;
        }

        public final com.google.common.collect.ImmutableTable<R, C, V> build() {
            return buildOrThrow();
        }

        public final com.google.common.collect.ImmutableTable<R, C, V> buildOrThrow() {
            int size = this.cells.size();
            if (size == 0) {
                return com.google.common.collect.ImmutableTable.of();
            }
            if (size == 1) {
                return new com.google.common.collect.SingletonImmutableTable((com.google.common.collect.Table.Cell) com.google.common.collect.Iterables.getOnlyElement(this.cells));
            }
            return com.google.common.collect.RegularImmutableTable.forCells(this.cells, this.rowComparator, this.columnComparator);
        }
    }

    ImmutableTable() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
        return (com.google.common.collect.ImmutableSet) super.cellSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractTable
    public final com.google.common.collect.UnmodifiableIterator<com.google.common.collect.Table.Cell<R, C, V>> cellIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableCollection<V> values() {
        return (com.google.common.collect.ImmutableCollection) super.values();
    }

    @Override // com.google.common.collect.AbstractTable
    final java.util.Iterator<V> valuesIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, V> column(C c) {
        com.google.common.base.Preconditions.checkNotNull(c, "columnKey");
        return (com.google.common.collect.ImmutableMap) com.google.common.base.MoreObjects.firstNonNull((com.google.common.collect.ImmutableMap) columnMap().get(c), com.google.common.collect.ImmutableMap.of());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<C, V> row(R r) {
        com.google.common.base.Preconditions.checkNotNull(r, "rowKey");
        return (com.google.common.collect.ImmutableMap) com.google.common.base.MoreObjects.firstNonNull((com.google.common.collect.ImmutableMap) rowMap().get(r), com.google.common.collect.ImmutableMap.of());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(java.lang.Object obj, java.lang.Object obj2) {
        return get(obj, obj2) != null;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @java.lang.Deprecated
    public final V put(R r, C c, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @java.lang.Deprecated
    public final void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @java.lang.Deprecated
    public final V remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final int[] cellColumnIndices;
        private final int[] cellRowIndices;
        private final java.lang.Object[] cellValues;
        private final java.lang.Object[] columnKeys;
        private final java.lang.Object[] rowKeys;

        private SerializedForm(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3, int[] iArr, int[] iArr2) {
            this.rowKeys = objArr;
            this.columnKeys = objArr2;
            this.cellValues = objArr3;
            this.cellRowIndices = iArr;
            this.cellColumnIndices = iArr2;
        }

        static com.google.common.collect.ImmutableTable.SerializedForm create(com.google.common.collect.ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            return new com.google.common.collect.ImmutableTable.SerializedForm(immutableTable.rowKeySet().toArray(), immutableTable.columnKeySet().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        final java.lang.Object readResolve() {
            java.lang.Object[] objArr = this.cellValues;
            if (objArr.length == 0) {
                return com.google.common.collect.ImmutableTable.of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return com.google.common.collect.ImmutableTable.of(this.rowKeys[0], this.columnKeys[0], objArr[0]);
            }
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(this.cellValues.length);
            while (true) {
                java.lang.Object[] objArr2 = this.cellValues;
                if (i < objArr2.length) {
                    builder.add((com.google.common.collect.ImmutableList.Builder) com.google.common.collect.ImmutableTable.cellOf(this.rowKeys[this.cellRowIndices[i]], this.columnKeys[this.cellColumnIndices[i]], objArr2[i]));
                    i++;
                } else {
                    return com.google.common.collect.RegularImmutableTable.forOrderedComponents(builder.build(), com.google.common.collect.ImmutableSet.copyOf(this.rowKeys), com.google.common.collect.ImmutableSet.copyOf(this.columnKeys));
                }
            }
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }
}
