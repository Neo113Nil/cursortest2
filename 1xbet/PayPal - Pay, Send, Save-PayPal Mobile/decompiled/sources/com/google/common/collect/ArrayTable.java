package com.google.common.collect;

/* loaded from: classes9.dex */
public final class ArrayTable<R, C, V> extends com.google.common.collect.AbstractTable<R, C, V> implements com.google.common.collect.Table<R, C, V>, java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final com.google.common.collect.ImmutableMap<C, java.lang.Integer> columnKeyToIndex;
    private final com.google.common.collect.ImmutableList<C> columnList;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ArrayTable<R, C, V>.ColumnMap columnMap;
    private final com.google.common.collect.ImmutableMap<R, java.lang.Integer> rowKeyToIndex;
    private final com.google.common.collect.ImmutableList<R> rowList;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ArrayTable<R, C, V>.RowMap rowMap;

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractTable
    public final /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public static <R, C, V> com.google.common.collect.ArrayTable<R, C, V> create(java.lang.Iterable<? extends R> iterable, java.lang.Iterable<? extends C> iterable2) {
        return new com.google.common.collect.ArrayTable<>(iterable, iterable2);
    }

    public static <R, C, V> com.google.common.collect.ArrayTable<R, C, V> create(com.google.common.collect.Table<R, C, ? extends V> table) {
        if (table instanceof com.google.common.collect.ArrayTable) {
            return new com.google.common.collect.ArrayTable<>((com.google.common.collect.ArrayTable) table);
        }
        return new com.google.common.collect.ArrayTable<>(table);
    }

    private ArrayTable(java.lang.Iterable<? extends R> iterable, java.lang.Iterable<? extends C> iterable2) {
        com.google.common.collect.ImmutableList<R> copyOf = com.google.common.collect.ImmutableList.copyOf(iterable);
        this.rowList = copyOf;
        com.google.common.collect.ImmutableList<C> copyOf2 = com.google.common.collect.ImmutableList.copyOf(iterable2);
        this.columnList = copyOf2;
        com.google.common.base.Preconditions.checkArgument(copyOf.isEmpty() == copyOf2.isEmpty());
        this.rowKeyToIndex = com.google.common.collect.Maps.indexMap(copyOf);
        this.columnKeyToIndex = com.google.common.collect.Maps.indexMap(copyOf2);
        this.array = (V[][]) ((java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, copyOf.size(), copyOf2.size()));
        eraseAll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayTable(com.google.common.collect.Table<R, C, ? extends V> table) {
        this(table.rowKeySet(), table.columnKeySet());
        putAll(table);
    }

    private ArrayTable(com.google.common.collect.ArrayTable<R, C, V> arrayTable) {
        com.google.common.collect.ImmutableList<R> immutableList = arrayTable.rowList;
        this.rowList = immutableList;
        com.google.common.collect.ImmutableList<C> immutableList2 = arrayTable.columnList;
        this.columnList = immutableList2;
        this.rowKeyToIndex = arrayTable.rowKeyToIndex;
        this.columnKeyToIndex = arrayTable.columnKeyToIndex;
        V[][] vArr = (V[][]) ((java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, immutableList.size(), immutableList2.size()));
        this.array = vArr;
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = arrayTable.array[i];
            java.lang.System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
    }

    static abstract class ArrayMap<K, V> extends com.google.common.collect.Maps.IteratorBasedAbstractMap<K, V> {
        private final com.google.common.collect.ImmutableMap<K, java.lang.Integer> keyIndex;

        abstract java.lang.String getKeyRole();

        abstract V getValue(int i);

        abstract V setValue(int i, V v);

        private ArrayMap(com.google.common.collect.ImmutableMap<K, java.lang.Integer> immutableMap) {
            this.keyIndex = immutableMap;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            return this.keyIndex.keySet();
        }

        K getKey(int i) {
            return this.keyIndex.keySet().asList().get(i);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.keyIndex.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.keyIndex.isEmpty();
        }

        java.util.Map.Entry<K, V> getEntry(final int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return new com.google.common.collect.AbstractMapEntry<K, V>(this) { // from class: com.google.common.collect.ArrayTable.ArrayMap.1
                final /* synthetic */ com.google.common.collect.ArrayTable.ArrayMap this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public K getKey() {
                    return (K) this.this$0.getKey(i);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public V getValue() {
                    return (V) this.this$0.getValue(i);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public V setValue(V v) {
                    return (V) this.this$0.setValue(i, v);
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return new com.google.common.collect.AbstractIndexedListIterator<java.util.Map.Entry<K, V>>(size()) { // from class: com.google.common.collect.ArrayTable.ArrayMap.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIndexedListIterator
                public java.util.Map.Entry<K, V> get(int i) {
                    return com.google.common.collect.ArrayTable.ArrayMap.this.getEntry(i);
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            return this.keyIndex.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(java.lang.Object obj) {
            java.lang.Integer num = this.keyIndex.get(obj);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            java.lang.Integer num = this.keyIndex.get(k);
            if (num == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getKeyRole());
                sb.append(" ");
                sb.append(k);
                sb.append(" not in ");
                sb.append(this.keyIndex.keySet());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return setValue(num.intValue(), v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final com.google.common.collect.ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    public final com.google.common.collect.ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    public final V at(int i, int i2) {
        com.google.common.base.Preconditions.checkElementIndex(i, this.rowList.size());
        com.google.common.base.Preconditions.checkElementIndex(i2, this.columnList.size());
        return this.array[i][i2];
    }

    public final V set(int i, int i2, V v) {
        com.google.common.base.Preconditions.checkElementIndex(i, this.rowList.size());
        com.google.common.base.Preconditions.checkElementIndex(i2, this.columnList.size());
        V[] vArr = this.array[i];
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    public final V[][] toArray(java.lang.Class<V> cls) {
        V[][] vArr = (V[][]) ((java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, this.rowList.size(), this.columnList.size()));
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = this.array[i];
            java.lang.System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
        return vArr;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void eraseAll() {
        for (V[] vArr : this.array) {
            java.util.Arrays.fill(vArr, (java.lang.Object) null);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final boolean contains(java.lang.Object obj, java.lang.Object obj2) {
        return containsRow(obj) && containsColumn(obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final boolean containsColumn(java.lang.Object obj) {
        return this.columnKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final boolean containsRow(java.lang.Object obj) {
        return this.rowKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final boolean containsValue(java.lang.Object obj) {
        for (V[] vArr : this.array) {
            for (V v : vArr) {
                if (java.util.Objects.equals(obj, v)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final V get(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = this.rowKeyToIndex.get(obj);
        java.lang.Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return at(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final boolean isEmpty() {
        return this.rowList.isEmpty() || this.columnList.isEmpty();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final V put(R r, C c, V v) {
        com.google.common.base.Preconditions.checkNotNull(r);
        com.google.common.base.Preconditions.checkNotNull(c);
        java.lang.Integer num = this.rowKeyToIndex.get(r);
        com.google.common.base.Preconditions.checkArgument(num != null, "Row %s not in %s", r, this.rowList);
        java.lang.Integer num2 = this.columnKeyToIndex.get(c);
        com.google.common.base.Preconditions.checkArgument(num2 != null, "Column %s not in %s", c, this.columnList);
        return set(num.intValue(), num2.intValue(), v);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @java.lang.Deprecated
    public final V remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final V erase(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = this.rowKeyToIndex.get(obj);
        java.lang.Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return this.rowList.size() * this.columnList.size();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractTable
    final java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> cellIterator() {
        return new com.google.common.collect.AbstractIndexedListIterator<com.google.common.collect.Table.Cell<R, C, V>>(size()) { // from class: com.google.common.collect.ArrayTable.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIndexedListIterator
            public com.google.common.collect.Table.Cell<R, C, V> get(int i) {
                return com.google.common.collect.ArrayTable.this.getCell(i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.Table.Cell<R, C, V> getCell(int i) {
        return new com.google.common.collect.Tables.AbstractCell<R, C, V>(this, i) { // from class: com.google.common.collect.ArrayTable.2
            final int columnIndex;
            final int rowIndex;
            final /* synthetic */ com.google.common.collect.ArrayTable this$0;
            final /* synthetic */ int val$index;

            {
                this.val$index = i;
                this.this$0 = this;
                this.rowIndex = i / this.columnList.size();
                this.columnIndex = i % this.columnList.size();
            }

            @Override // com.google.common.collect.Table.Cell
            public R getRowKey() {
                return (R) this.this$0.rowList.get(this.rowIndex);
            }

            @Override // com.google.common.collect.Table.Cell
            public C getColumnKey() {
                return (C) this.this$0.columnList.get(this.columnIndex);
            }

            @Override // com.google.common.collect.Table.Cell
            public V getValue() {
                return (V) this.this$0.at(this.rowIndex, this.columnIndex);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V getValue(int i) {
        return at(i / this.columnList.size(), i % this.columnList.size());
    }

    @Override // com.google.common.collect.Table
    public final java.util.Map<R, V> column(C c) {
        com.google.common.base.Preconditions.checkNotNull(c);
        java.lang.Integer num = this.columnKeyToIndex.get(c);
        if (num == null) {
            return java.util.Collections.emptyMap();
        }
        return new com.google.common.collect.ArrayTable.Column(num.intValue());
    }

    final class Column extends com.google.common.collect.ArrayTable.ArrayMap<R, V> {
        final int columnIndex;

        Column(int i) {
            super(com.google.common.collect.ArrayTable.this.rowKeyToIndex);
            this.columnIndex = i;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        final java.lang.String getKeyRole() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        final V getValue(int i) {
            return (V) com.google.common.collect.ArrayTable.this.at(i, this.columnIndex);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        final V setValue(int i, V v) {
            return (V) com.google.common.collect.ArrayTable.this.set(i, this.columnIndex, v);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final com.google.common.collect.ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.Table
    public final java.util.Map<C, java.util.Map<R, V>> columnMap() {
        com.google.common.collect.ArrayTable<R, C, V>.ColumnMap columnMap = this.columnMap;
        if (columnMap != null) {
            return columnMap;
        }
        com.google.common.collect.ArrayTable<R, C, V>.ColumnMap columnMap2 = new com.google.common.collect.ArrayTable.ColumnMap();
        this.columnMap = columnMap2;
        return columnMap2;
    }

    final class ColumnMap extends com.google.common.collect.ArrayTable.ArrayMap<C, java.util.Map<R, V>> {
        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
            return put((com.google.common.collect.ArrayTable.ColumnMap) obj, (java.util.Map) obj2);
        }

        private ColumnMap() {
            super(com.google.common.collect.ArrayTable.this.columnKeyToIndex);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        final java.lang.String getKeyRole() {
            return "Column";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.util.Map<R, V> getValue(int i) {
            return new com.google.common.collect.ArrayTable.Column(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.util.Map<R, V> setValue(int i, java.util.Map<R, V> map) {
            throw new java.lang.UnsupportedOperationException();
        }

        public final java.util.Map<R, V> put(C c, java.util.Map<R, V> map) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.Table
    public final java.util.Map<C, V> row(R r) {
        com.google.common.base.Preconditions.checkNotNull(r);
        java.lang.Integer num = this.rowKeyToIndex.get(r);
        if (num == null) {
            return java.util.Collections.emptyMap();
        }
        return new com.google.common.collect.ArrayTable.Row(num.intValue());
    }

    final class Row extends com.google.common.collect.ArrayTable.ArrayMap<C, V> {
        final int rowIndex;

        Row(int i) {
            super(com.google.common.collect.ArrayTable.this.columnKeyToIndex);
            this.rowIndex = i;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        final java.lang.String getKeyRole() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        final V getValue(int i) {
            return (V) com.google.common.collect.ArrayTable.this.at(this.rowIndex, i);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        final V setValue(int i, V v) {
            return (V) com.google.common.collect.ArrayTable.this.set(this.rowIndex, i, v);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final com.google.common.collect.ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.Table
    public final java.util.Map<R, java.util.Map<C, V>> rowMap() {
        com.google.common.collect.ArrayTable<R, C, V>.RowMap rowMap = this.rowMap;
        if (rowMap != null) {
            return rowMap;
        }
        com.google.common.collect.ArrayTable<R, C, V>.RowMap rowMap2 = new com.google.common.collect.ArrayTable.RowMap();
        this.rowMap = rowMap2;
        return rowMap2;
    }

    final class RowMap extends com.google.common.collect.ArrayTable.ArrayMap<R, java.util.Map<C, V>> {
        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
            return put((com.google.common.collect.ArrayTable.RowMap) obj, (java.util.Map) obj2);
        }

        private RowMap() {
            super(com.google.common.collect.ArrayTable.this.rowKeyToIndex);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        final java.lang.String getKeyRole() {
            return "Row";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.util.Map<C, V> getValue(int i) {
            return new com.google.common.collect.ArrayTable.Row(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.util.Map<C, V> setValue(int i, java.util.Map<C, V> map) {
            throw new java.lang.UnsupportedOperationException();
        }

        public final java.util.Map<C, V> put(R r, java.util.Map<C, V> map) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final java.util.Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractTable
    final java.util.Iterator<V> valuesIterator() {
        return new com.google.common.collect.AbstractIndexedListIterator<V>(size()) { // from class: com.google.common.collect.ArrayTable.3
            @Override // com.google.common.collect.AbstractIndexedListIterator
            protected V get(int i) {
                return (V) com.google.common.collect.ArrayTable.this.getValue(i);
            }
        };
    }
}
