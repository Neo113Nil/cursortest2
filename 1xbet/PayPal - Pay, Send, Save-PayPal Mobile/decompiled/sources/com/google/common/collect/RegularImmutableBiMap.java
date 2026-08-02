package com.google.common.collect;

/* loaded from: classes9.dex */
final class RegularImmutableBiMap<K, V> extends com.google.common.collect.ImmutableBiMap<K, V> {
    static final com.google.common.collect.RegularImmutableBiMap<java.lang.Object, java.lang.Object> EMPTY = new com.google.common.collect.RegularImmutableBiMap<>();
    final transient java.lang.Object[] alternatingKeysAndValues;
    private final transient com.google.common.collect.RegularImmutableBiMap<V, K> inverse;
    private final transient java.lang.Object keyHashTable;
    private final transient int keyOffset;
    private final transient int size;

    @Override // com.google.common.collect.ImmutableMap
    final boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public final /* bridge */ /* synthetic */ com.google.common.collect.BiMap inverse() {
        return inverse();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RegularImmutableBiMap() {
        this.keyHashTable = null;
        this.alternatingKeysAndValues = new java.lang.Object[0];
        this.keyOffset = 0;
        this.size = 0;
        this.inverse = this;
    }

    RegularImmutableBiMap(java.lang.Object[] objArr, int i) {
        this.alternatingKeysAndValues = objArr;
        this.size = i;
        this.keyOffset = 0;
        int chooseTableSize = i >= 2 ? com.google.common.collect.ImmutableSet.chooseTableSize(i) : 0;
        this.keyHashTable = com.google.common.collect.RegularImmutableMap.createHashTableOrThrow(objArr, i, chooseTableSize, 0);
        this.inverse = new com.google.common.collect.RegularImmutableBiMap<>(com.google.common.collect.RegularImmutableMap.createHashTableOrThrow(objArr, i, chooseTableSize, 1), objArr, i, this);
    }

    private RegularImmutableBiMap(java.lang.Object obj, java.lang.Object[] objArr, int i, com.google.common.collect.RegularImmutableBiMap<V, K> regularImmutableBiMap) {
        this.keyHashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.keyOffset = 1;
        this.size = i;
        this.inverse = regularImmutableBiMap;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public final com.google.common.collect.ImmutableBiMap<V, K> inverse() {
        return this.inverse;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(java.lang.Object obj) {
        V v = (V) com.google.common.collect.RegularImmutableMap.get(this.keyHashTable, this.alternatingKeysAndValues, this.size, this.keyOffset, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.ImmutableMap
    final com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
        return new com.google.common.collect.RegularImmutableMap.EntrySet(this, this.alternatingKeysAndValues, this.keyOffset, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    final com.google.common.collect.ImmutableSet<K> createKeySet() {
        return new com.google.common.collect.RegularImmutableMap.KeySet(this, new com.google.common.collect.RegularImmutableMap.KeysOrValuesAsList(this.alternatingKeysAndValues, this.keyOffset, this.size));
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    final java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
