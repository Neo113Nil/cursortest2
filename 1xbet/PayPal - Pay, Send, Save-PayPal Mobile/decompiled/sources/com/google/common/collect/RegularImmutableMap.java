package com.google.common.collect;

/* loaded from: classes4.dex */
final class RegularImmutableMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    static final com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> EMPTY = new com.google.common.collect.RegularImmutableMap(null, new java.lang.Object[0], 0);
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;
    private static final long serialVersionUID = 0;
    final transient java.lang.Object[] alternatingKeysAndValues;
    private final transient java.lang.Object hashTable;
    private final transient int size;

    @Override // com.google.common.collect.ImmutableMap
    final boolean isPartialView() {
        return false;
    }

    static <K, V> com.google.common.collect.RegularImmutableMap<K, V> create(int i, java.lang.Object[] objArr) {
        return create(i, objArr, null);
    }

    static <K, V> com.google.common.collect.RegularImmutableMap<K, V> create(int i, java.lang.Object[] objArr, com.google.common.collect.ImmutableMap.Builder<K, V> builder) {
        if (i == 0) {
            return (com.google.common.collect.RegularImmutableMap) EMPTY;
        }
        if (i == 1) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(java.util.Objects.requireNonNull(objArr[0]), java.util.Objects.requireNonNull(objArr[1]));
            return new com.google.common.collect.RegularImmutableMap<>(null, objArr, 1);
        }
        com.google.common.base.Preconditions.checkPositionIndex(i, objArr.length >> 1);
        java.lang.Object createHashTable = createHashTable(objArr, i, com.google.common.collect.ImmutableSet.chooseTableSize(i), 0);
        if (createHashTable instanceof java.lang.Object[]) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) createHashTable;
            com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey = (com.google.common.collect.ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder == null) {
                throw duplicateKey.exception();
            }
            builder.duplicateKey = duplicateKey;
            java.lang.Object obj = objArr2[0];
            int intValue = ((java.lang.Integer) objArr2[1]).intValue();
            objArr = java.util.Arrays.copyOf(objArr, intValue * 2);
            createHashTable = obj;
            i = intValue;
        }
        return new com.google.common.collect.RegularImmutableMap<>(createHashTable, objArr, i);
    }

    private static java.lang.Object createHashTable(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        if (i == 1) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(java.util.Objects.requireNonNull(objArr[i3]), java.util.Objects.requireNonNull(objArr[i3 ^ 1]));
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            java.util.Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                java.lang.Object requireNonNull = java.util.Objects.requireNonNull(objArr[i7]);
                java.lang.Object requireNonNull2 = java.util.Objects.requireNonNull(objArr[i7 ^ 1]);
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(requireNonNull, requireNonNull2);
                int smear = com.google.common.collect.Hashing.smear(requireNonNull.hashCode());
                while (true) {
                    int i9 = smear & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = requireNonNull;
                            objArr[i8 ^ 1] = requireNonNull2;
                        }
                        i6++;
                    } else {
                        if (requireNonNull.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey2 = new com.google.common.collect.ImmutableMap.Builder.DuplicateKey(requireNonNull, requireNonNull2, java.util.Objects.requireNonNull(objArr[i11]));
                            objArr[i11] = requireNonNull2;
                            duplicateKey = duplicateKey2;
                            break;
                        }
                        smear = i9 + 1;
                    }
                }
                i5++;
            }
            return i6 == i ? bArr : new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i6), duplicateKey};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            java.util.Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                java.lang.Object requireNonNull3 = java.util.Objects.requireNonNull(objArr[i13]);
                java.lang.Object requireNonNull4 = java.util.Objects.requireNonNull(objArr[i13 ^ 1]);
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(requireNonNull3, requireNonNull4);
                int smear2 = com.google.common.collect.Hashing.smear(requireNonNull3.hashCode());
                while (true) {
                    int i15 = smear2 & i4;
                    int i16 = sArr[i15] & kotlin.UShort.MAX_VALUE;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = requireNonNull3;
                            objArr[i14 ^ 1] = requireNonNull4;
                        }
                        i12++;
                    } else {
                        if (requireNonNull3.equals(objArr[i16])) {
                            int i17 = i16 ^ 1;
                            com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey3 = new com.google.common.collect.ImmutableMap.Builder.DuplicateKey(requireNonNull3, requireNonNull4, java.util.Objects.requireNonNull(objArr[i17]));
                            objArr[i17] = requireNonNull4;
                            duplicateKey = duplicateKey3;
                            break;
                        }
                        smear2 = i15 + 1;
                    }
                }
                i5++;
            }
            return i12 == i ? sArr : new java.lang.Object[]{sArr, java.lang.Integer.valueOf(i12), duplicateKey};
        }
        int[] iArr = new int[i2];
        java.util.Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            java.lang.Object requireNonNull5 = java.util.Objects.requireNonNull(objArr[i19]);
            java.lang.Object requireNonNull6 = java.util.Objects.requireNonNull(objArr[i19 ^ 1]);
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(requireNonNull5, requireNonNull6);
            int smear3 = com.google.common.collect.Hashing.smear(requireNonNull5.hashCode());
            while (true) {
                int i21 = smear3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = requireNonNull5;
                        objArr[i20 ^ 1] = requireNonNull6;
                    }
                    i18++;
                } else {
                    if (requireNonNull5.equals(objArr[i22])) {
                        int i23 = i22 ^ 1;
                        com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey4 = new com.google.common.collect.ImmutableMap.Builder.DuplicateKey(requireNonNull5, requireNonNull6, java.util.Objects.requireNonNull(objArr[i23]));
                        objArr[i23] = requireNonNull6;
                        duplicateKey = duplicateKey4;
                        break;
                    }
                    smear3 = i21 + 1;
                }
            }
            i5++;
        }
        return i18 == i ? iArr : new java.lang.Object[]{iArr, java.lang.Integer.valueOf(i18), duplicateKey};
    }

    static java.lang.Object createHashTableOrThrow(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Object createHashTable = createHashTable(objArr, i, i2, i3);
        if (createHashTable instanceof java.lang.Object[]) {
            throw ((com.google.common.collect.ImmutableMap.Builder.DuplicateKey) ((java.lang.Object[]) createHashTable)[2]).exception();
        }
        return createHashTable;
    }

    private RegularImmutableMap(java.lang.Object obj, java.lang.Object[] objArr, int i) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(java.lang.Object obj) {
        V v = (V) get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    static java.lang.Object get(java.lang.Object obj, java.lang.Object[] objArr, int i, int i2, java.lang.Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (java.util.Objects.requireNonNull(objArr[i2]).equals(obj2)) {
                return java.util.Objects.requireNonNull(objArr[i2 ^ 1]);
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            int smear = com.google.common.collect.Hashing.smear(obj2.hashCode());
            while (true) {
                int i3 = smear & (length - 1);
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                smear = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length;
            int smear2 = com.google.common.collect.Hashing.smear(obj2.hashCode());
            while (true) {
                int i5 = smear2 & (length2 - 1);
                int i6 = sArr[i5] & kotlin.UShort.MAX_VALUE;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                smear2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            int smear3 = com.google.common.collect.Hashing.smear(obj2.hashCode());
            while (true) {
                int i7 = smear3 & (length3 - 1);
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                smear3 = i7 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    final com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
        return new com.google.common.collect.RegularImmutableMap.EntrySet(this, this.alternatingKeysAndValues, 0, this.size);
    }

    static final class EntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {
        private final transient java.lang.Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient com.google.common.collect.ImmutableMap<K, V> map;
        private final transient int size;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return iterator();
        }

        EntrySet(com.google.common.collect.ImmutableMap<K, V> immutableMap, java.lang.Object[] objArr, int i, int i2) {
            this.map = immutableMap;
            this.alternatingKeysAndValues = objArr;
            this.keyOffset = i;
            this.size = i2;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        final int copyIntoArray(java.lang.Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet
        final com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
            return new com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.List
                public java.util.Map.Entry<K, V> get(int i) {
                    com.google.common.base.Preconditions.checkElementIndex(i, com.google.common.collect.RegularImmutableMap.EntrySet.this.size);
                    int i2 = i * 2;
                    return new java.util.AbstractMap.SimpleImmutableEntry(java.util.Objects.requireNonNull(com.google.common.collect.RegularImmutableMap.EntrySet.this.alternatingKeysAndValues[com.google.common.collect.RegularImmutableMap.EntrySet.this.keyOffset + i2]), java.util.Objects.requireNonNull(com.google.common.collect.RegularImmutableMap.EntrySet.this.alternatingKeysAndValues[i2 + (com.google.common.collect.RegularImmutableMap.EntrySet.this.keyOffset ^ 1)]));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return com.google.common.collect.RegularImmutableMap.EntrySet.this.size;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                java.lang.Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            return value != null && value.equals(this.map.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    final com.google.common.collect.ImmutableSet<K> createKeySet() {
        return new com.google.common.collect.RegularImmutableMap.KeySet(this, new com.google.common.collect.RegularImmutableMap.KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.size));
    }

    static final class KeysOrValuesAsList extends com.google.common.collect.ImmutableList<java.lang.Object> {
        private final transient java.lang.Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return true;
        }

        KeysOrValuesAsList(java.lang.Object[] objArr, int i, int i2) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i;
            this.size = i2;
        }

        @Override // java.util.List
        public final java.lang.Object get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, this.size);
            return java.util.Objects.requireNonNull(this.alternatingKeysAndValues[(i * 2) + this.offset]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class KeySet<K> extends com.google.common.collect.ImmutableSet<K> {
        private final transient com.google.common.collect.ImmutableList<K> list;
        private final transient com.google.common.collect.ImmutableMap<K, ?> map;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return iterator();
        }

        KeySet(com.google.common.collect.ImmutableMap<K, ?> immutableMap, com.google.common.collect.ImmutableList<K> immutableList) {
            this.map = immutableMap;
            this.list = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final com.google.common.collect.UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        final int copyIntoArray(java.lang.Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final com.google.common.collect.ImmutableList<K> asList() {
            return this.list;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return this.map.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    final com.google.common.collect.ImmutableCollection<V> createValues() {
        return new com.google.common.collect.RegularImmutableMap.KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    final java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
