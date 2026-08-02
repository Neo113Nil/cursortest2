package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
final class BooleanArrayList extends com.google.crypto.tink.shaded.protobuf.AbstractProtobufList<java.lang.Boolean> implements com.google.crypto.tink.shaded.protobuf.Internal.BooleanList, java.util.RandomAccess, com.google.crypto.tink.shaded.protobuf.PrimitiveNonBoxingCollection {
    private static final com.google.crypto.tink.shaded.protobuf.BooleanArrayList EMPTY_LIST = new com.google.crypto.tink.shaded.protobuf.BooleanArrayList(new boolean[0], 0, false);
    private boolean[] array;
    private int size;

    public static com.google.crypto.tink.shaded.protobuf.BooleanArrayList emptyList() {
        return EMPTY_LIST;
    }

    BooleanArrayList() {
        this(new boolean[10], 0, true);
    }

    private BooleanArrayList(boolean[] zArr, int i, boolean z) {
        super(z);
        this.array = zArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.array;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.crypto.tink.shaded.protobuf.BooleanArrayList)) {
            return super.equals(obj);
        }
        com.google.crypto.tink.shaded.protobuf.BooleanArrayList booleanArrayList = (com.google.crypto.tink.shaded.protobuf.BooleanArrayList) obj;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + com.google.crypto.tink.shaded.protobuf.Internal.hashBoolean(this.array[i2]);
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public final com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Boolean> mutableCopyWithCapacity2(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.crypto.tink.shaded.protobuf.BooleanArrayList(java.util.Arrays.copyOf(this.array, i), this.size, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Boolean get(int i) {
        return java.lang.Boolean.valueOf(getBoolean(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final boolean getBoolean(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == booleanValue) {
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
    public final java.lang.Boolean set(int i, java.lang.Boolean bool) {
        return java.lang.Boolean.valueOf(setBoolean(i, bool.booleanValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final boolean setBoolean(int i, boolean z) {
        ensureIsMutable();
        ensureIndexInRange(i);
        boolean[] zArr = this.array;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Boolean bool) {
        addBoolean(i, bool.booleanValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final void addBoolean(boolean z) {
        ensureIsMutable();
        int i = this.size;
        boolean[] zArr = this.array;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        zArr3[i2] = z;
    }

    private void addBoolean(int i, boolean z) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
        boolean[] zArr = this.array;
        if (i2 < zArr.length) {
            java.lang.System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.array, i, zArr2, i + 1, this.size - i);
            this.array = zArr2;
        }
        this.array[i] = z;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Boolean> collection) {
        ensureIsMutable();
        com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(collection);
        if (!(collection instanceof com.google.crypto.tink.shaded.protobuf.BooleanArrayList)) {
            return super.addAll(collection);
        }
        com.google.crypto.tink.shaded.protobuf.BooleanArrayList booleanArrayList = (com.google.crypto.tink.shaded.protobuf.BooleanArrayList) collection;
        int i = booleanArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.array;
        if (i3 > zArr.length) {
            this.array = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final java.lang.Boolean remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        boolean[] zArr = this.array;
        boolean z = zArr[i];
        if (i < this.size - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
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
