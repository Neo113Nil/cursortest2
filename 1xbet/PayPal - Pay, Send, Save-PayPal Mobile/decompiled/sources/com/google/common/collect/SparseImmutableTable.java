package com.google.common.collect;

@com.google.errorprone.annotations.Immutable(containerOf = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "V"})
/* loaded from: classes9.dex */
final class SparseImmutableTable<R, C, V> extends com.google.common.collect.RegularImmutableTable<R, C, V> {
    static final com.google.common.collect.ImmutableTable<java.lang.Object, java.lang.Object, java.lang.Object> EMPTY = new com.google.common.collect.SparseImmutableTable(com.google.common.collect.ImmutableList.of(), com.google.common.collect.ImmutableSet.of(), com.google.common.collect.ImmutableSet.of());
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final com.google.common.collect.ImmutableMap<C, com.google.common.collect.ImmutableMap<R, V>> columnMap;
    private final com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> rowMap;

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final /* bridge */ /* synthetic */ java.util.Map columnMap() {
        return columnMap();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final /* bridge */ /* synthetic */ java.util.Map rowMap() {
        return rowMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    SparseImmutableTable(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> immutableList, com.google.common.collect.ImmutableSet<R> immutableSet, com.google.common.collect.ImmutableSet<C> immutableSet2) {
        com.google.common.collect.ImmutableMap indexMap = com.google.common.collect.Maps.indexMap(immutableSet);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.google.common.collect.UnmodifiableIterator<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), new java.util.LinkedHashMap());
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        com.google.common.collect.UnmodifiableIterator<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.put(it2.next(), new java.util.LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            com.google.common.collect.Table.Cell<R, C, V> cell = immutableList.get(i);
            R rowKey = cell.getRowKey();
            C columnKey = cell.getColumnKey();
            V value = cell.getValue();
            iArr[i] = ((java.lang.Integer) java.util.Objects.requireNonNull((java.lang.Integer) indexMap.get(rowKey))).intValue();
            java.util.Map map = (java.util.Map) java.util.Objects.requireNonNull((java.util.Map) linkedHashMap.get(rowKey));
            iArr2[i] = map.size();
            checkNoDuplicate(rowKey, columnKey, map.put(columnKey, value), value);
            ((java.util.Map) java.util.Objects.requireNonNull((java.util.Map) linkedHashMap2.get(columnKey))).put(rowKey, value);
        }
        this.cellRowIndices = iArr;
        this.cellColumnInRowIndices = iArr2;
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(linkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            builder.put(entry.getKey(), com.google.common.collect.ImmutableMap.copyOf((java.util.Map) entry.getValue()));
        }
        this.rowMap = builder.buildOrThrow();
        com.google.common.collect.ImmutableMap.Builder builder2 = new com.google.common.collect.ImmutableMap.Builder(linkedHashMap2.size());
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            builder2.put(entry2.getKey(), com.google.common.collect.ImmutableMap.copyOf((java.util.Map) entry2.getValue()));
        }
        this.columnMap = builder2.buildOrThrow();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap() {
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) this.columnMap);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap() {
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) this.rowMap);
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return this.cellRowIndices.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable
    final com.google.common.collect.Table.Cell<R, C, V> getCell(int i) {
        java.util.Map.Entry<R, com.google.common.collect.ImmutableMap<C, V>> entry = this.rowMap.entrySet().asList().get(this.cellRowIndices[i]);
        com.google.common.collect.ImmutableMap<C, V> value = entry.getValue();
        java.util.Map.Entry<C, V> entry2 = value.entrySet().asList().get(this.cellColumnInRowIndices[i]);
        return cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.RegularImmutableTable
    final V getValue(int i) {
        com.google.common.collect.ImmutableMap<C, V> immutableMap = this.rowMap.values().asList().get(this.cellRowIndices[i]);
        return immutableMap.values().asList().get(this.cellColumnInRowIndices[i]);
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    final java.lang.Object writeReplace() {
        com.google.common.collect.ImmutableMap indexMap = com.google.common.collect.Maps.indexMap(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        com.google.common.collect.UnmodifiableIterator<com.google.common.collect.Table.Cell<R, C, V>> it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((java.lang.Integer) java.util.Objects.requireNonNull((java.lang.Integer) indexMap.get(it.next().getColumnKey()))).intValue();
            i++;
        }
        return com.google.common.collect.ImmutableTable.SerializedForm.create(this, this.cellRowIndices, iArr);
    }
}
