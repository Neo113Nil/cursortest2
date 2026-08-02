package com.google.protobuf;

/* loaded from: classes9.dex */
final class DoubleArrayList extends com.google.protobuf.AbstractProtobufList<java.lang.Double> implements com.google.protobuf.Internal.DoubleList, java.util.RandomAccess, com.google.protobuf.PrimitiveNonBoxingCollection {
    private static final com.google.protobuf.DoubleArrayList EMPTY_LIST = new com.google.protobuf.DoubleArrayList(new double[0], 0, false);
    private double[] array;
    private int size;

    public static com.google.protobuf.DoubleArrayList emptyList() {
        return EMPTY_LIST;
    }

    DoubleArrayList() {
        this(new double[10], 0, true);
    }

    private DoubleArrayList(double[] dArr, int i, boolean z) {
        super(z);
        this.array = dArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.array;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.DoubleArrayList)) {
            return super.equals(obj);
        }
        com.google.protobuf.DoubleArrayList doubleArrayList = (com.google.protobuf.DoubleArrayList) obj;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (java.lang.Double.doubleToLongBits(this.array[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(this.array[i2]));
        }
        return i;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public final com.google.protobuf.Internal.ProtobufList<java.lang.Double> mutableCopyWithCapacity2(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.protobuf.DoubleArrayList(java.util.Arrays.copyOf(this.array, i), this.size, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Double get(int i) {
        return java.lang.Double.valueOf(getDouble(i));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double getDouble(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Double)) {
            return -1;
        }
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == doubleValue) {
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

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final java.lang.Double set(int i, java.lang.Double d) {
        return java.lang.Double.valueOf(setDouble(i, d.doubleValue()));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double setDouble(int i, double d) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double[] dArr = this.array;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Double d) {
        addDouble(d.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Double d) {
        addDouble(i, d.doubleValue());
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final void addDouble(double d) {
        ensureIsMutable();
        int i = this.size;
        double[] dArr = this.array;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        dArr3[i2] = d;
    }

    private void addDouble(int i, double d) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
        double[] dArr = this.array;
        if (i2 < dArr.length) {
            java.lang.System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.array, i, dArr2, i + 1, this.size - i);
            this.array = dArr2;
        }
        this.array[i] = d;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Double> collection) {
        ensureIsMutable();
        com.google.protobuf.Internal.checkNotNull(collection);
        if (!(collection instanceof com.google.protobuf.DoubleArrayList)) {
            return super.addAll(collection);
        }
        com.google.protobuf.DoubleArrayList doubleArrayList = (com.google.protobuf.DoubleArrayList) collection;
        int i = doubleArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.array;
        if (i3 > dArr.length) {
            this.array = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final java.lang.Double remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double[] dArr = this.array;
        double d = dArr[i];
        if (i < this.size - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
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
