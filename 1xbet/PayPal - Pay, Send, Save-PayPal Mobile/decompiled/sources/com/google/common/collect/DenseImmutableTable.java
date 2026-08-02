package com.google.common.collect;

@com.google.errorprone.annotations.Immutable(containerOf = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "V"})
/* loaded from: classes9.dex */
final class DenseImmutableTable<R, C, V> extends com.google.common.collect.RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts;
    private final com.google.common.collect.ImmutableMap<C, java.lang.Integer> columnKeyToIndex;
    private final com.google.common.collect.ImmutableMap<C, com.google.common.collect.ImmutableMap<R, V>> columnMap;
    private final int[] rowCounts;
    private final com.google.common.collect.ImmutableMap<R, java.lang.Integer> rowKeyToIndex;
    private final com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> rowMap;
    private final V[][] values;

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final /* bridge */ /* synthetic */ java.util.Map columnMap() {
        return columnMap();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final /* bridge */ /* synthetic */ java.util.Map rowMap() {
        return rowMap();
    }

    DenseImmutableTable(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> immutableList, com.google.common.collect.ImmutableSet<R> immutableSet, com.google.common.collect.ImmutableSet<C> immutableSet2) {
        this.values = (V[][]) ((java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, immutableSet.size(), immutableSet2.size()));
        com.google.common.collect.ImmutableMap<R, java.lang.Integer> indexMap = com.google.common.collect.Maps.indexMap(immutableSet);
        this.rowKeyToIndex = indexMap;
        com.google.common.collect.ImmutableMap<C, java.lang.Integer> indexMap2 = com.google.common.collect.Maps.indexMap(immutableSet2);
        this.columnKeyToIndex = indexMap2;
        this.rowCounts = new int[indexMap.size()];
        this.columnCounts = new int[indexMap2.size()];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            com.google.common.collect.Table.Cell<R, C, V> cell = immutableList.get(i);
            R rowKey = cell.getRowKey();
            C columnKey = cell.getColumnKey();
            int intValue = ((java.lang.Integer) java.util.Objects.requireNonNull(this.rowKeyToIndex.get(rowKey))).intValue();
            int intValue2 = ((java.lang.Integer) java.util.Objects.requireNonNull(this.columnKeyToIndex.get(columnKey))).intValue();
            checkNoDuplicate(rowKey, columnKey, this.values[intValue][intValue2], cell.getValue());
            this.values[intValue][intValue2] = cell.getValue();
            int[] iArr3 = this.rowCounts;
            iArr3[intValue] = iArr3[intValue] + 1;
            int[] iArr4 = this.columnCounts;
            iArr4[intValue2] = iArr4[intValue2] + 1;
            iArr[i] = intValue;
            iArr2[i] = intValue2;
        }
        this.cellRowIndices = iArr;
        this.cellColumnIndices = iArr2;
        this.rowMap = new com.google.common.collect.DenseImmutableTable.RowMap();
        this.columnMap = new com.google.common.collect.DenseImmutableTable.ColumnMap();
    }

    static abstract class ImmutableArrayMap<K, V> extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;

        abstract V getValue(int i);

        abstract com.google.common.collect.ImmutableMap<K, java.lang.Integer> keyToIndex();

        ImmutableArrayMap(int i) {
            this.size = i;
        }

        private boolean isFull() {
            return this.size == keyToIndex().size();
        }

        K getKey(int i) {
            return keyToIndex().keySet().asList().get(i);
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        com.google.common.collect.ImmutableSet<K> createKeySet() {
            return isFull() ? keyToIndex().keySet() : super.createKeySet();
        }

        @Override // java.util.Map
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public V get(java.lang.Object obj) {
            java.lang.Integer num = keyToIndex().get(obj);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator() {
            return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.1
                private int index = -1;
                private final int maxIndex;

                {
                    this.maxIndex = com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.this.keyToIndex().size();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public java.util.Map.Entry<K, V> computeNext() {
                    java.lang.Object value;
                    do {
                        int i = this.index + 1;
                        this.index = i;
                        if (i < this.maxIndex) {
                            value = com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.this.getValue(i);
                        } else {
                            return endOfData();
                        }
                    } while (value == null);
                    return com.google.common.collect.Maps.immutableEntry(com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.this.getKey(this.index), value);
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    final class Row extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<C, V> {
        private final int rowIndex;

        @Override // com.google.common.collect.ImmutableMap
        final boolean isPartialView() {
            return true;
        }

        Row(int i) {
            super(com.google.common.collect.DenseImmutableTable.this.rowCounts[i]);
            this.rowIndex = i;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        final com.google.common.collect.ImmutableMap<C, java.lang.Integer> keyToIndex() {
            return com.google.common.collect.DenseImmutableTable.this.columnKeyToIndex;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        final V getValue(int i) {
            return (V) com.google.common.collect.DenseImmutableTable.this.values[this.rowIndex][i];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    final class Column extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<R, V> {
        private final int columnIndex;

        @Override // com.google.common.collect.ImmutableMap
        final boolean isPartialView() {
            return true;
        }

        Column(int i) {
            super(com.google.common.collect.DenseImmutableTable.this.columnCounts[i]);
            this.columnIndex = i;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        final com.google.common.collect.ImmutableMap<R, java.lang.Integer> keyToIndex() {
            return com.google.common.collect.DenseImmutableTable.this.rowKeyToIndex;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        final V getValue(int i) {
            return (V) com.google.common.collect.DenseImmutableTable.this.values[i][this.columnIndex];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    final class RowMap extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<R, com.google.common.collect.ImmutableMap<C, V>> {
        @Override // com.google.common.collect.ImmutableMap
        final boolean isPartialView() {
            return false;
        }

        private RowMap() {
            super(com.google.common.collect.DenseImmutableTable.this.rowCounts.length);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        final com.google.common.collect.ImmutableMap<R, java.lang.Integer> keyToIndex() {
            return com.google.common.collect.DenseImmutableTable.this.rowKeyToIndex;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final com.google.common.collect.ImmutableMap<C, V> getValue(int i) {
            return new com.google.common.collect.DenseImmutableTable.Row(i);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    final class ColumnMap extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<C, com.google.common.collect.ImmutableMap<R, V>> {
        @Override // com.google.common.collect.ImmutableMap
        final boolean isPartialView() {
            return false;
        }

        private ColumnMap() {
            super(com.google.common.collect.DenseImmutableTable.this.columnCounts.length);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        final com.google.common.collect.ImmutableMap<C, java.lang.Integer> keyToIndex() {
            return com.google.common.collect.DenseImmutableTable.this.columnKeyToIndex;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final com.google.common.collect.ImmutableMap<R, V> getValue(int i) {
            return new com.google.common.collect.DenseImmutableTable.Column(i);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap() {
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) this.columnMap);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap() {
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) this.rowMap);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final V get(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = this.rowKeyToIndex.get(obj);
        java.lang.Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.values[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return this.cellRowIndices.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable
    final com.google.common.collect.Table.Cell<R, C, V> getCell(int i) {
        int i2 = this.cellRowIndices[i];
        int i3 = this.cellColumnIndices[i];
        return cellOf(rowKeySet().asList().get(i2), columnKeySet().asList().get(i3), java.util.Objects.requireNonNull(this.values[i2][i3]));
    }

    @Override // com.google.common.collect.RegularImmutableTable
    final V getValue(int i) {
        return (V) java.util.Objects.requireNonNull(this.values[this.cellRowIndices[i]][this.cellColumnIndices[i]]);
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    final java.lang.Object writeReplace() {
        return com.google.common.collect.ImmutableTable.SerializedForm.create(this, this.cellRowIndices, this.cellColumnIndices);
    }
}
