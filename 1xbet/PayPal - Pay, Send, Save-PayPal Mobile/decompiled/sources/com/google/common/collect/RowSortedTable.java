package com.google.common.collect;

/* loaded from: classes9.dex */
public interface RowSortedTable<R, C, V> extends com.google.common.collect.Table<R, C, V> {
    @Override // com.google.common.collect.Table
    java.util.SortedSet<R> rowKeySet();

    @Override // com.google.common.collect.Table
    java.util.SortedMap<R, java.util.Map<C, V>> rowMap();
}
