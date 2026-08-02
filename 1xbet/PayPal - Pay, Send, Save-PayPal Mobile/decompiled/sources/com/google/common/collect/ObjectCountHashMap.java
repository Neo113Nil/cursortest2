package com.google.common.collect;

@org.jspecify.annotations.NullMarked
/* loaded from: classes9.dex */
class ObjectCountHashMap<K> {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;
    transient long[] entries;
    transient java.lang.Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    private static int getHash(long j) {
        return (int) (j >>> 32);
    }

    private static int getNext(long j) {
        return (int) j;
    }

    private static long swapNext(long j, int i) {
        return (j & HASH_MASK) | (4294967295L & i);
    }

    int nextIndexAfterRemove(int i, int i2) {
        return i - 1;
    }

    static <K> com.google.common.collect.ObjectCountHashMap<K> create() {
        return new com.google.common.collect.ObjectCountHashMap<>();
    }

    static <K> com.google.common.collect.ObjectCountHashMap<K> createWithExpectedSize(int i) {
        return new com.google.common.collect.ObjectCountHashMap<>(i);
    }

    ObjectCountHashMap() {
        init(3, 1.0f);
    }

    ObjectCountHashMap(com.google.common.collect.ObjectCountHashMap<? extends K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int firstIndex = objectCountHashMap.firstIndex();
        while (firstIndex != -1) {
            put(objectCountHashMap.getKey(firstIndex), objectCountHashMap.getValue(firstIndex));
            firstIndex = objectCountHashMap.nextIndex(firstIndex);
        }
    }

    ObjectCountHashMap(int i) {
        this(i, 1.0f);
    }

    ObjectCountHashMap(int i, float f) {
        init(i, f);
    }

    void init(int i, float f) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Initial capacity must be non-negative");
        com.google.common.base.Preconditions.checkArgument(f > 0.0f, "Illegal load factor");
        int closedTableSize = com.google.common.collect.Hashing.closedTableSize(i, f);
        this.table = newTable(closedTableSize);
        this.loadFactor = f;
        this.keys = new java.lang.Object[i];
        this.values = new int[i];
        this.entries = newEntries(i);
        this.threshold = java.lang.Math.max(1, (int) (closedTableSize * f));
    }

    private static int[] newTable(int i) {
        int[] iArr = new int[i];
        java.util.Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] newEntries(int i) {
        long[] jArr = new long[i];
        java.util.Arrays.fill(jArr, -1L);
        return jArr;
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    int nextIndex(int i) {
        int i2 = i + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    int size() {
        return this.size;
    }

    K getKey(int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, this.size);
        return (K) this.keys[i];
    }

    int getValue(int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, this.size);
        return this.values[i];
    }

    void setValue(int i, int i2) {
        com.google.common.base.Preconditions.checkElementIndex(i, this.size);
        this.values[i] = i2;
    }

    com.google.common.collect.Multiset.Entry<K> getEntry(int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, this.size);
        return new com.google.common.collect.ObjectCountHashMap.MapEntry(i);
    }

    final class MapEntry extends com.google.common.collect.Multisets.AbstractEntry<K> {
        final K key;
        int lastKnownIndex;

        MapEntry(int i) {
            this.key = (K) com.google.common.collect.ObjectCountHashMap.this.keys[i];
            this.lastKnownIndex = i;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final K getElement() {
            return this.key;
        }

        final void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            if (i == -1 || i >= com.google.common.collect.ObjectCountHashMap.this.size() || !java.util.Objects.equals(this.key, com.google.common.collect.ObjectCountHashMap.this.keys[this.lastKnownIndex])) {
                this.lastKnownIndex = com.google.common.collect.ObjectCountHashMap.this.indexOf(this.key);
            }
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            updateLastKnownIndex();
            if (this.lastKnownIndex == -1) {
                return 0;
            }
            return com.google.common.collect.ObjectCountHashMap.this.values[this.lastKnownIndex];
        }
    }

    void ensureCapacity(int i) {
        if (i > this.entries.length) {
            resizeEntries(i);
        }
        if (i >= this.threshold) {
            resizeTable(java.lang.Math.max(2, java.lang.Integer.highestOneBit(i - 1) << 1));
        }
    }

    public int put(K k, int i) {
        com.google.common.collect.CollectPreconditions.checkPositive(i, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT);
        long[] jArr = this.entries;
        java.lang.Object[] objArr = this.keys;
        int[] iArr = this.values;
        int smearedHash = com.google.common.collect.Hashing.smearedHash(k);
        int hashTableMask = hashTableMask() & smearedHash;
        int i2 = this.size;
        int[] iArr2 = this.table;
        int i3 = iArr2[hashTableMask];
        if (i3 == -1) {
            iArr2[hashTableMask] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (getHash(j) == smearedHash && java.util.Objects.equals(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int next = getNext(j);
                if (next == -1) {
                    jArr[i3] = swapNext(j, i2);
                    break;
                }
                i3 = next;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i5 = i2 + 1;
        resizeMeMaybe(i5);
        insertEntry(i2, k, i, smearedHash);
        this.size = i5;
        if (i2 >= this.threshold) {
            resizeTable(this.table.length * 2);
        }
        this.modCount++;
        return 0;
    }

    void insertEntry(int i, K k, int i2, int i3) {
        this.entries[i] = (i3 << 32) | 4294967295L;
        this.keys[i] = k;
        this.values[i] = i2;
    }

    private void resizeMeMaybe(int i) {
        int length = this.entries.length;
        if (i > length) {
            int max = java.lang.Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                resizeEntries(max);
            }
        }
    }

    void resizeEntries(int i) {
        this.keys = java.util.Arrays.copyOf(this.keys, i);
        this.values = java.util.Arrays.copyOf(this.values, i);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] copyOf = java.util.Arrays.copyOf(jArr, i);
        if (i > length) {
            java.util.Arrays.fill(copyOf, length, i, -1L);
        }
        this.entries = copyOf;
    }

    private void resizeTable(int i) {
        if (this.table.length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i2 = (int) (i * this.loadFactor);
        int[] newTable = newTable(i);
        long[] jArr = this.entries;
        int length = newTable.length;
        for (int i3 = 0; i3 < this.size; i3++) {
            int hash = getHash(jArr[i3]);
            int i4 = (length - 1) & hash;
            int i5 = newTable[i4];
            newTable[i4] = i3;
            jArr[i3] = (hash << 32) | (i5 & 4294967295L);
        }
        this.threshold = i2 + 1;
        this.table = newTable;
    }

    int indexOf(java.lang.Object obj) {
        int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
        int i = this.table[hashTableMask() & smearedHash];
        while (i != -1) {
            long j = this.entries[i];
            if (getHash(j) == smearedHash && java.util.Objects.equals(obj, this.keys[i])) {
                return i;
            }
            i = getNext(j);
        }
        return -1;
    }

    public boolean containsKey(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public int get(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        return this.values[indexOf];
    }

    public int remove(java.lang.Object obj) {
        return remove(obj, com.google.common.collect.Hashing.smearedHash(obj));
    }

    private int remove(java.lang.Object obj, int i) {
        int hashTableMask = hashTableMask() & i;
        int i2 = this.table[hashTableMask];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (getHash(this.entries[i2]) == i && java.util.Objects.equals(obj, this.keys[i2])) {
                int i4 = this.values[i2];
                if (i3 == -1) {
                    this.table[hashTableMask] = getNext(this.entries[i2]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i3] = swapNext(jArr[i3], getNext(jArr[i2]));
                }
                moveLastEntry(i2);
                this.size--;
                this.modCount++;
                return i4;
            }
            int next = getNext(this.entries[i2]);
            if (next == -1) {
                return 0;
            }
            i3 = i2;
            i2 = next;
        }
    }

    int removeEntry(int i) {
        return remove(this.keys[i], getHash(this.entries[i]));
    }

    void moveLastEntry(int i) {
        int size = size() - 1;
        if (i < size) {
            java.lang.Object[] objArr = this.keys;
            objArr[i] = objArr[size];
            int[] iArr = this.values;
            iArr[i] = iArr[size];
            objArr[size] = null;
            iArr[size] = 0;
            long[] jArr = this.entries;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int hash = getHash(j) & hashTableMask();
            int[] iArr2 = this.table;
            int i2 = iArr2[hash];
            if (i2 == size) {
                iArr2[hash] = i;
                return;
            }
            while (true) {
                long j2 = this.entries[i2];
                int next = getNext(j2);
                if (next == size) {
                    this.entries[i2] = swapNext(j2, i);
                    return;
                }
                i2 = next;
            }
        } else {
            this.keys[i] = null;
            this.values[i] = 0;
            this.entries[i] = -1;
        }
    }

    public void clear() {
        this.modCount++;
        java.util.Arrays.fill(this.keys, 0, this.size, (java.lang.Object) null);
        java.util.Arrays.fill(this.values, 0, this.size, 0);
        java.util.Arrays.fill(this.table, -1);
        java.util.Arrays.fill(this.entries, -1L);
        this.size = 0;
    }
}
