package com.google.common.collect;

/* loaded from: classes9.dex */
final class SingletonImmutableTable<R, C, V> extends com.google.common.collect.ImmutableTable<R, C, V> {
    final C singleColumnKey;
    final R singleRowKey;
    final V singleValue;

    @Override // com.google.common.collect.Table
    public final int size() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final /* bridge */ /* synthetic */ java.util.Map column(java.lang.Object obj) {
        return column((com.google.common.collect.SingletonImmutableTable<R, C, V>) obj);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final /* bridge */ /* synthetic */ java.util.Map columnMap() {
        return columnMap();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final /* bridge */ /* synthetic */ java.util.Map rowMap() {
        return rowMap();
    }

    SingletonImmutableTable(R r, C c, V v) {
        this.singleRowKey = (R) com.google.common.base.Preconditions.checkNotNull(r);
        this.singleColumnKey = (C) com.google.common.base.Preconditions.checkNotNull(c);
        this.singleValue = (V) com.google.common.base.Preconditions.checkNotNull(v);
    }

    SingletonImmutableTable(com.google.common.collect.Table.Cell<R, C, V> cell) {
        this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final com.google.common.collect.ImmutableMap<R, V> column(C c) {
        com.google.common.base.Preconditions.checkNotNull(c);
        if (containsColumn(c)) {
            return com.google.common.collect.ImmutableMap.of(this.singleRowKey, (java.lang.Object) this.singleValue);
        }
        return com.google.common.collect.ImmutableMap.of();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap() {
        return com.google.common.collect.ImmutableMap.of(this.singleColumnKey, com.google.common.collect.ImmutableMap.of(this.singleRowKey, (java.lang.Object) this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap() {
        return com.google.common.collect.ImmutableMap.of(this.singleRowKey, com.google.common.collect.ImmutableMap.of(this.singleColumnKey, (java.lang.Object) this.singleValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
        return com.google.common.collect.ImmutableSet.of(cellOf(this.singleRowKey, this.singleColumnKey, this.singleValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final com.google.common.collect.ImmutableCollection<V> createValues() {
        return com.google.common.collect.ImmutableSet.of(this.singleValue);
    }

    @Override // com.google.common.collect.ImmutableTable
    final java.lang.Object writeReplace() {
        return com.google.common.collect.ImmutableTable.SerializedForm.create(this, new int[]{0}, new int[]{0});
    }
}
