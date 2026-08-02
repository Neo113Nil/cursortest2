package com.google.common.collect;

/* loaded from: classes9.dex */
public final class HashBiMap<K, V> extends java.util.AbstractMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.BiMap<V, K> inverse;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<V> valueSet;
    transient V[] values;

    public static <K, V> com.google.common.collect.HashBiMap<K, V> create() {
        return create(16);
    }

    public static <K, V> com.google.common.collect.HashBiMap<K, V> create(int i) {
        return new com.google.common.collect.HashBiMap<>(i);
    }

    public static <K, V> com.google.common.collect.HashBiMap<K, V> create(java.util.Map<? extends K, ? extends V> map) {
        com.google.common.collect.HashBiMap<K, V> create = create(map.size());
        create.putAll(map);
        return create;
    }

    private HashBiMap(int i) {
        init(i);
    }

    final void init(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "expectedSize");
        int closedTableSize = com.google.common.collect.Hashing.closedTableSize(i, 1.0d);
        this.size = 0;
        this.keys = (K[]) new java.lang.Object[i];
        this.values = (V[]) new java.lang.Object[i];
        this.hashTableKToV = createFilledWithAbsent(closedTableSize);
        this.hashTableVToK = createFilledWithAbsent(closedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    private static int[] createFilledWithAbsent(int i) {
        int[] iArr = new int[i];
        java.util.Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = java.util.Arrays.copyOf(iArr, i);
        java.util.Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.size;
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i) {
            int expandedCapacity = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(iArr.length, i);
            this.keys = (K[]) java.util.Arrays.copyOf(this.keys, expandedCapacity);
            this.values = (V[]) java.util.Arrays.copyOf(this.values, expandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, expandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, expandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, expandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, expandedCapacity);
        }
        if (this.hashTableKToV.length < i) {
            int closedTableSize = com.google.common.collect.Hashing.closedTableSize(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(closedTableSize);
            this.hashTableVToK = createFilledWithAbsent(closedTableSize);
            for (int i2 = 0; i2 < this.size; i2++) {
                int bucket = bucket(com.google.common.collect.Hashing.smearedHash(this.keys[i2]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i2] = iArr3[bucket];
                iArr3[bucket] = i2;
                int bucket2 = bucket(com.google.common.collect.Hashing.smearedHash(this.values[i2]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i2] = iArr5[bucket2];
                iArr5[bucket2] = i2;
            }
        }
    }

    private int bucket(int i) {
        return i & (this.hashTableKToV.length - 1);
    }

    final int findEntryByKey(java.lang.Object obj) {
        return findEntryByKey(obj, com.google.common.collect.Hashing.smearedHash(obj));
    }

    final int findEntryByKey(java.lang.Object obj, int i) {
        return findEntry(obj, i, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    final int findEntryByValue(java.lang.Object obj) {
        return findEntryByValue(obj, com.google.common.collect.Hashing.smearedHash(obj));
    }

    final int findEntryByValue(java.lang.Object obj, int i) {
        return findEntry(obj, i, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    final int findEntry(java.lang.Object obj, int i, int[] iArr, int[] iArr2, java.lang.Object[] objArr) {
        int i2 = iArr[bucket(i)];
        while (i2 != -1) {
            if (java.util.Objects.equals(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return findEntryByKey(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return findEntryByValue(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        int findEntryByKey = findEntryByKey(obj);
        if (findEntryByKey == -1) {
            return null;
        }
        return this.values[findEntryByKey];
    }

    final K getInverse(java.lang.Object obj) {
        int findEntryByValue = findEntryByValue(obj);
        if (findEntryByValue == -1) {
            return null;
        }
        return this.keys[findEntryByValue];
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public final V put(K k, V v) {
        return put(k, v, false);
    }

    final V put(K k, V v, boolean z) {
        int smearedHash = com.google.common.collect.Hashing.smearedHash(k);
        int findEntryByKey = findEntryByKey(k, smearedHash);
        if (findEntryByKey != -1) {
            V v2 = this.values[findEntryByKey];
            if (java.util.Objects.equals(v2, v)) {
                return v;
            }
            replaceValueInEntry(findEntryByKey, v, z);
            return v2;
        }
        int smearedHash2 = com.google.common.collect.Hashing.smearedHash(v);
        int findEntryByValue = findEntryByValue(v, smearedHash2);
        if (!z) {
            com.google.common.base.Preconditions.checkArgument(findEntryByValue == -1, "Value already present: %s", v);
        } else if (findEntryByValue != -1) {
            removeEntryValueHashKnown(findEntryByValue, smearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = k;
        this.values[i] = v;
        insertIntoTableKToV(i, smearedHash);
        insertIntoTableVToK(this.size, smearedHash2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // com.google.common.collect.BiMap
    public final V forcePut(K k, V v) {
        return put(k, v, true);
    }

    final K putInverse(V v, K k, boolean z) {
        int smearedHash = com.google.common.collect.Hashing.smearedHash(v);
        int findEntryByValue = findEntryByValue(v, smearedHash);
        if (findEntryByValue != -1) {
            K k2 = this.keys[findEntryByValue];
            if (java.util.Objects.equals(k2, k)) {
                return k;
            }
            replaceKeyInEntry(findEntryByValue, k, z);
            return k2;
        }
        int i = this.lastInInsertionOrder;
        int smearedHash2 = com.google.common.collect.Hashing.smearedHash(k);
        int findEntryByKey = findEntryByKey(k, smearedHash2);
        if (!z) {
            com.google.common.base.Preconditions.checkArgument(findEntryByKey == -1, "Key already present: %s", k);
        } else if (findEntryByKey != -1) {
            i = this.prevInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, smearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = k;
        this.values[i2] = v;
        insertIntoTableKToV(i2, smearedHash2);
        insertIntoTableVToK(this.size, smearedHash);
        int i3 = i == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i];
        setSucceeds(i, this.size);
        setSucceeds(this.size, i3);
        this.size++;
        this.modCount++;
        return null;
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstInInsertionOrder = i2;
        } else {
            this.nextInInsertionOrder[i] = i2;
        }
        if (i2 == -2) {
            this.lastInInsertionOrder = i;
        } else {
            this.prevInInsertionOrder[i2] = i;
        }
    }

    private void insertIntoTableKToV(int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i != -1);
        int bucket = bucket(i2);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i] = iArr2[bucket];
        iArr2[bucket] = i;
    }

    private void insertIntoTableVToK(int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i != -1);
        int bucket = bucket(i2);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i] = iArr2[bucket];
        iArr2[bucket] = i;
    }

    private void deleteFromTableKToV(int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i != -1);
        int bucket = bucket(i2);
        int[] iArr = this.hashTableKToV;
        int i3 = iArr[bucket];
        if (i3 == i) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[bucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.nextInBucketKToV[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected to find entry with key ");
                sb.append(this.keys[i]);
                throw new java.lang.AssertionError(sb.toString());
            }
            if (i3 != i) {
                i4 = this.nextInBucketKToV[i3];
            } else {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
        }
    }

    private void deleteFromTableVToK(int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i != -1);
        int bucket = bucket(i2);
        int[] iArr = this.hashTableVToK;
        int i3 = iArr[bucket];
        if (i3 == i) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[bucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.nextInBucketVToK[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected to find entry with value ");
                sb.append(this.values[i]);
                throw new java.lang.AssertionError(sb.toString());
            }
            if (i3 != i) {
                i4 = this.nextInBucketVToK[i3];
            } else {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int i, V v, boolean z) {
        com.google.common.base.Preconditions.checkArgument(i != -1);
        int smearedHash = com.google.common.collect.Hashing.smearedHash(v);
        int findEntryByValue = findEntryByValue(v, smearedHash);
        if (findEntryByValue != -1) {
            if (z) {
                removeEntryValueHashKnown(findEntryByValue, smearedHash);
                if (i == this.size) {
                    i = findEntryByValue;
                }
            } else {
                throw new java.lang.IllegalArgumentException("Value already present in map: ".concat(java.lang.String.valueOf(v)));
            }
        }
        deleteFromTableVToK(i, com.google.common.collect.Hashing.smearedHash(this.values[i]));
        this.values[i] = v;
        insertIntoTableVToK(i, smearedHash);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int i, K k, boolean z) {
        int i2;
        com.google.common.base.Preconditions.checkArgument(i != -1);
        int smearedHash = com.google.common.collect.Hashing.smearedHash(k);
        int findEntryByKey = findEntryByKey(k, smearedHash);
        int i3 = this.lastInInsertionOrder;
        if (findEntryByKey == -1) {
            i2 = -2;
        } else if (z) {
            i3 = this.prevInInsertionOrder[findEntryByKey];
            i2 = this.nextInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, smearedHash);
            if (i == this.size) {
                i = findEntryByKey;
            }
        } else {
            throw new java.lang.IllegalArgumentException("Key already present in map: ".concat(java.lang.String.valueOf(k)));
        }
        if (i3 == i) {
            i3 = this.prevInInsertionOrder[i];
        } else if (i3 == this.size) {
            i3 = findEntryByKey;
        }
        if (i2 == i) {
            findEntryByKey = this.nextInInsertionOrder[i];
        } else if (i2 != this.size) {
            findEntryByKey = i2;
        }
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        deleteFromTableKToV(i, com.google.common.collect.Hashing.smearedHash(this.keys[i]));
        this.keys[i] = k;
        insertIntoTableKToV(i, com.google.common.collect.Hashing.smearedHash(k));
        setSucceeds(i3, i);
        setSucceeds(i, findEntryByKey);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
        int findEntryByKey = findEntryByKey(obj, smearedHash);
        if (findEntryByKey == -1) {
            return null;
        }
        V v = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return v;
    }

    final K removeInverse(java.lang.Object obj) {
        int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
        int findEntryByValue = findEntryByValue(obj, smearedHash);
        if (findEntryByValue == -1) {
            return null;
        }
        K k = this.keys[findEntryByValue];
        removeEntryValueHashKnown(findEntryByValue, smearedHash);
        return k;
    }

    final void removeEntry(int i) {
        removeEntryKeyHashKnown(i, com.google.common.collect.Hashing.smearedHash(this.keys[i]));
    }

    private void removeEntry(int i, int i2, int i3) {
        com.google.common.base.Preconditions.checkArgument(i != -1);
        deleteFromTableKToV(i, i2);
        deleteFromTableVToK(i, i3);
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        moveEntryToIndex(this.size - 1, i);
        K[] kArr = this.keys;
        int i4 = this.size - 1;
        kArr[i4] = null;
        this.values[i4] = null;
        this.size = i4;
        this.modCount++;
    }

    final void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, com.google.common.collect.Hashing.smearedHash(this.values[i]));
    }

    final void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, com.google.common.collect.Hashing.smearedHash(this.keys[i]), i2);
    }

    private void moveEntryToIndex(int i, int i2) {
        if (i == i2) {
            return;
        }
        int i3 = this.prevInInsertionOrder[i];
        int i4 = this.nextInInsertionOrder[i];
        setSucceeds(i3, i2);
        setSucceeds(i2, i4);
        K[] kArr = this.keys;
        K k = kArr[i];
        V[] vArr = this.values;
        V v = vArr[i];
        kArr[i2] = k;
        vArr[i2] = v;
        int bucket = bucket(com.google.common.collect.Hashing.smearedHash(k));
        int[] iArr = this.hashTableKToV;
        int i5 = iArr[bucket];
        if (i5 == i) {
            iArr[bucket] = i2;
        } else {
            int i6 = this.nextInBucketKToV[i5];
            while (i6 != i) {
                i5 = i6;
                i6 = this.nextInBucketKToV[i6];
            }
            this.nextInBucketKToV[i5] = i2;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[i2] = iArr2[i];
        iArr2[i] = -1;
        int bucket2 = bucket(com.google.common.collect.Hashing.smearedHash(v));
        int[] iArr3 = this.hashTableVToK;
        int i7 = iArr3[bucket2];
        if (i7 == i) {
            iArr3[bucket2] = i2;
        } else {
            int i8 = this.nextInBucketVToK[i7];
            while (i8 != i) {
                i7 = i8;
                i8 = this.nextInBucketVToK[i8];
            }
            this.nextInBucketVToK[i7] = i2;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[i2] = iArr4[i];
        iArr4[i] = -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        java.util.Arrays.fill(this.keys, 0, this.size, (java.lang.Object) null);
        java.util.Arrays.fill(this.values, 0, this.size, (java.lang.Object) null);
        java.util.Arrays.fill(this.hashTableKToV, -1);
        java.util.Arrays.fill(this.hashTableVToK, -1);
        java.util.Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        java.util.Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        java.util.Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        java.util.Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    static abstract class View<K, V, T> extends java.util.AbstractSet<T> {
        final com.google.common.collect.HashBiMap<K, V> biMap;

        abstract T forEntry(int i);

        View(com.google.common.collect.HashBiMap<K, V> hashBiMap) {
            this.biMap = hashBiMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<T> iterator() {
            return new java.util.Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1
                private int expectedModCount;
                private int index;
                private int indexToRemove = -1;
                private int remaining;

                {
                    this.index = ((com.google.common.collect.HashBiMap) com.google.common.collect.HashBiMap.View.this.biMap).firstInInsertionOrder;
                    this.expectedModCount = com.google.common.collect.HashBiMap.View.this.biMap.modCount;
                    this.remaining = com.google.common.collect.HashBiMap.View.this.biMap.size;
                }

                private void checkForComodification() {
                    if (com.google.common.collect.HashBiMap.View.this.biMap.modCount != this.expectedModCount) {
                        throw new java.util.ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    return this.index != -2 && this.remaining > 0;
                }

                @Override // java.util.Iterator
                public T next() {
                    if (!hasNext()) {
                        throw new java.util.NoSuchElementException();
                    }
                    T t = (T) com.google.common.collect.HashBiMap.View.this.forEntry(this.index);
                    this.indexToRemove = this.index;
                    this.index = ((com.google.common.collect.HashBiMap) com.google.common.collect.HashBiMap.View.this.biMap).nextInInsertionOrder[this.index];
                    this.remaining--;
                    return t;
                }

                @Override // java.util.Iterator
                public void remove() {
                    checkForComodification();
                    com.google.common.collect.CollectPreconditions.checkRemove(this.indexToRemove != -1);
                    com.google.common.collect.HashBiMap.View.this.biMap.removeEntry(this.indexToRemove);
                    if (this.index == com.google.common.collect.HashBiMap.View.this.biMap.size) {
                        this.index = this.indexToRemove;
                    }
                    this.indexToRemove = -1;
                    this.expectedModCount = com.google.common.collect.HashBiMap.View.this.biMap.modCount;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.HashBiMap.KeySet keySet = new com.google.common.collect.HashBiMap.KeySet();
        this.keySet = keySet;
        return keySet;
    }

    final class KeySet extends com.google.common.collect.HashBiMap.View<K, V, K> {
        KeySet() {
            super(com.google.common.collect.HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        final K forEntry(int i) {
            return (K) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.HashBiMap.this.keys[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.collect.HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
            int findEntryByKey = com.google.common.collect.HashBiMap.this.findEntryByKey(obj, smearedHash);
            if (findEntryByKey == -1) {
                return false;
            }
            com.google.common.collect.HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
            return true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public final java.util.Set<V> values() {
        java.util.Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.HashBiMap.ValueSet valueSet = new com.google.common.collect.HashBiMap.ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    final class ValueSet extends com.google.common.collect.HashBiMap.View<K, V, V> {
        ValueSet() {
            super(com.google.common.collect.HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        final V forEntry(int i) {
            return (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.HashBiMap.this.values[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.collect.HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
            int findEntryByValue = com.google.common.collect.HashBiMap.this.findEntryByValue(obj, smearedHash);
            if (findEntryByValue == -1) {
                return false;
            }
            com.google.common.collect.HashBiMap.this.removeEntryValueHashKnown(findEntryByValue, smearedHash);
            return true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.HashBiMap.EntrySet entrySet = new com.google.common.collect.HashBiMap.EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    final class EntrySet extends com.google.common.collect.HashBiMap.View<K, V, java.util.Map.Entry<K, V>> {
        EntrySet() {
            super(com.google.common.collect.HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int findEntryByKey = com.google.common.collect.HashBiMap.this.findEntryByKey(key);
            return findEntryByKey != -1 && java.util.Objects.equals(value, com.google.common.collect.HashBiMap.this.values[findEntryByKey]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int smearedHash = com.google.common.collect.Hashing.smearedHash(key);
            int findEntryByKey = com.google.common.collect.HashBiMap.this.findEntryByKey(key, smearedHash);
            if (findEntryByKey == -1 || !java.util.Objects.equals(value, com.google.common.collect.HashBiMap.this.values[findEntryByKey])) {
                return false;
            }
            com.google.common.collect.HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public final java.util.Map.Entry<K, V> forEntry(int i) {
            return new com.google.common.collect.HashBiMap.EntryForKey(i);
        }
    }

    final class EntryForKey extends com.google.common.collect.AbstractMapEntry<K, V> {
        int index;
        final K key;

        EntryForKey(int i) {
            this.key = (K) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.HashBiMap.this.keys[i]);
            this.index = i;
        }

        final void updateIndex() {
            int i = this.index;
            if (i == -1 || i > com.google.common.collect.HashBiMap.this.size || !java.util.Objects.equals(com.google.common.collect.HashBiMap.this.keys[this.index], this.key)) {
                this.index = com.google.common.collect.HashBiMap.this.findEntryByKey(this.key);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final V getValue() {
            updateIndex();
            return this.index == -1 ? (V) com.google.common.collect.NullnessCasts.unsafeNull() : (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.HashBiMap.this.values[this.index]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final V setValue(V v) {
            updateIndex();
            if (this.index == -1) {
                com.google.common.collect.HashBiMap.this.put(this.key, v);
                return (V) com.google.common.collect.NullnessCasts.unsafeNull();
            }
            V v2 = (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.HashBiMap.this.values[this.index]);
            if (java.util.Objects.equals(v2, v)) {
                return v;
            }
            com.google.common.collect.HashBiMap.this.replaceValueInEntry(this.index, v, false);
            return v2;
        }
    }

    @Override // com.google.common.collect.BiMap
    public final com.google.common.collect.BiMap<V, K> inverse() {
        com.google.common.collect.BiMap<V, K> biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        com.google.common.collect.HashBiMap.Inverse inverse = new com.google.common.collect.HashBiMap.Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    static final class Inverse<K, V> extends java.util.AbstractMap<V, K> implements com.google.common.collect.BiMap<V, K>, java.io.Serializable {
        private final com.google.common.collect.HashBiMap<K, V> forward;
        private transient java.util.Set<java.util.Map.Entry<V, K>> inverseEntrySet;

        Inverse(com.google.common.collect.HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final K get(java.lang.Object obj) {
            return this.forward.getInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsValue(java.lang.Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final K put(V v, K k) {
            return this.forward.putInverse(v, k, false);
        }

        @Override // com.google.common.collect.BiMap
        public final K forcePut(V v, K k) {
            return this.forward.putInverse(v, k, true);
        }

        @Override // com.google.common.collect.BiMap
        public final com.google.common.collect.BiMap<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final K remove(java.lang.Object obj) {
            return this.forward.removeInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final java.util.Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final java.util.Set<K> values() {
            return this.forward.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final java.util.Set<java.util.Map.Entry<V, K>> entrySet() {
            java.util.Set<java.util.Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            com.google.common.collect.HashBiMap.InverseEntrySet inverseEntrySet = new com.google.common.collect.HashBiMap.InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet;
            return inverseEntrySet;
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
            objectInputStream.defaultReadObject();
            ((com.google.common.collect.HashBiMap) this.forward).inverse = this;
        }
    }

    static final class InverseEntrySet<K, V> extends com.google.common.collect.HashBiMap.View<K, V, java.util.Map.Entry<V, K>> {
        InverseEntrySet(com.google.common.collect.HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int findEntryByValue = this.biMap.findEntryByValue(key);
            return findEntryByValue != -1 && java.util.Objects.equals(this.biMap.keys[findEntryByValue], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int smearedHash = com.google.common.collect.Hashing.smearedHash(key);
            int findEntryByValue = this.biMap.findEntryByValue(key, smearedHash);
            if (findEntryByValue == -1 || !java.util.Objects.equals(this.biMap.keys[findEntryByValue], value)) {
                return false;
            }
            this.biMap.removeEntryValueHashKnown(findEntryByValue, smearedHash);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public final java.util.Map.Entry<V, K> forEntry(int i) {
            return new com.google.common.collect.HashBiMap.EntryForValue(this.biMap, i);
        }
    }

    static final class EntryForValue<K, V> extends com.google.common.collect.AbstractMapEntry<V, K> {
        final com.google.common.collect.HashBiMap<K, V> biMap;
        int index;
        final V value;

        EntryForValue(com.google.common.collect.HashBiMap<K, V> hashBiMap, int i) {
            this.biMap = hashBiMap;
            this.value = (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(hashBiMap.values[i]);
            this.index = i;
        }

        private void updateIndex() {
            int i = this.index;
            if (i == -1 || i > this.biMap.size || !java.util.Objects.equals(this.value, this.biMap.values[this.index])) {
                this.index = this.biMap.findEntryByValue(this.value);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final V getKey() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final K getValue() {
            updateIndex();
            return this.index == -1 ? (K) com.google.common.collect.NullnessCasts.unsafeNull() : (K) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[this.index]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final K setValue(K k) {
            updateIndex();
            if (this.index == -1) {
                this.biMap.putInverse(this.value, k, false);
                return (K) com.google.common.collect.NullnessCasts.unsafeNull();
            }
            K k2 = (K) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[this.index]);
            if (java.util.Objects.equals(k2, k)) {
                return k;
            }
            this.biMap.replaceKeyInEntry(this.index, k, false);
            return k2;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        com.google.common.collect.Serialization.writeMap(this, objectOutputStream);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readCount = com.google.common.collect.Serialization.readCount(objectInputStream);
        init(16);
        com.google.common.collect.Serialization.populateMap(this, objectInputStream, readCount);
    }
}
