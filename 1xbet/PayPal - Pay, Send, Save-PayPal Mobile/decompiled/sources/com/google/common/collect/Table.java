package com.google.common.collect;

@com.google.errorprone.annotations.DoNotMock("Use ImmutableTable, HashBasedTable, or another implementation")
/* loaded from: classes9.dex */
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        boolean equals(java.lang.Object obj);

        C getColumnKey();

        R getRowKey();

        V getValue();

        int hashCode();
    }

    java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet();

    void clear();

    java.util.Map<R, V> column(C c);

    java.util.Set<C> columnKeySet();

    java.util.Map<C, java.util.Map<R, V>> columnMap();

    boolean contains(java.lang.Object obj, java.lang.Object obj2);

    boolean containsColumn(java.lang.Object obj);

    boolean containsRow(java.lang.Object obj);

    boolean containsValue(java.lang.Object obj);

    boolean equals(java.lang.Object obj);

    V get(java.lang.Object obj, java.lang.Object obj2);

    int hashCode();

    boolean isEmpty();

    V put(R r, C c, V v);

    void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table);

    V remove(java.lang.Object obj, java.lang.Object obj2);

    java.util.Map<C, V> row(R r);

    java.util.Set<R> rowKeySet();

    java.util.Map<R, java.util.Map<C, V>> rowMap();

    int size();

    java.util.Collection<V> values();
}
