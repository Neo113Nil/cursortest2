package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
final class LongArrayList extends com.google.crypto.tink.shaded.protobuf.AbstractProtobufList<java.lang.Long> implements com.google.crypto.tink.shaded.protobuf.Internal.LongList, java.util.RandomAccess, com.google.crypto.tink.shaded.protobuf.PrimitiveNonBoxingCollection {
    private static final com.google.crypto.tink.shaded.protobuf.LongArrayList EMPTY_LIST = new com.google.crypto.tink.shaded.protobuf.LongArrayList(new long[0], 0, false);
    private long[] array;
    private int size;

    public static com.google.crypto.tink.shaded.protobuf.LongArrayList emptyList() {
        return EMPTY_LIST;
    }

    LongArrayList() {
        this(new long[10], 0, true);
    }

    private LongArrayList(long[] jArr, int i, boolean z) {
        super(z);
        this.array = jArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.array;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList)) {
            return super.equals(obj);
        }
        com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + com.google.crypto.tink.shaded.protobuf.Internal.hashLong(this.array[i2]);
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public final com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Long> mutableCopyWithCapacity2(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.crypto.tink.shaded.protobuf.LongArrayList(java.util.Arrays.copyOf(this.array, i), this.size, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Long get(int i) {
        return java.lang.Long.valueOf(getLong(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public final long getLong(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long longValue = ((java.lang.Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final java.lang.Long set(int i, java.lang.Long l) {
        return java.lang.Long.valueOf(setLong(i, l.longValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public final long setLong(int i, long j) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Long l) {
        addLong(l.longValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Long l) {
        addLong(i, l.longValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public final void addLong(long j) {
        ensureIsMutable();
        int i = this.size;
        long[] jArr = this.array;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
    }

    private void addLong(int i, long j) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
        long[] jArr = this.array;
        if (i2 < jArr.length) {
            java.lang.System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.array, i, jArr2, i + 1, this.size - i);
            this.array = jArr2;
        }
        this.array[i] = j;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Long> collection) {
        ensureIsMutable();
        com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(collection);
        if (!(collection instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList)) {
            return super.addAll(collection);
        }
        com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) collection;
        int i = longArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.array;
        if (i3 > jArr.length) {
            this.array = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final java.lang.Long remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j = jArr[i];
        if (i < this.size - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private java.lang.String makeOutOfBoundsExceptionMessage(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.size);
        return sb.toString();
    }
}
