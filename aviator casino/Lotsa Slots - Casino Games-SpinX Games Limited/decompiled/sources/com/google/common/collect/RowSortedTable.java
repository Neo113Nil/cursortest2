package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface RowSortedTable<R, C, V> extends com.google.common.collect.Table<R, C, V> {
    @Override // com.google.common.collect.Table
    java.util.SortedSet<R> rowKeySet();

    @Override // com.google.common.collect.Table
    java.util.SortedMap<R, java.util.Map<C, V>> rowMap();

    /* renamed from: com.google.common.collect.RowSortedTable$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
