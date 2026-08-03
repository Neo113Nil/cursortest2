package com.google.protobuf;

/* loaded from: classes4.dex */
final class ProtobufArrayList<E> extends com.google.protobuf.AbstractProtobufList<E> implements java.util.RandomAccess {
    private static final com.google.protobuf.ProtobufArrayList<java.lang.Object> EMPTY_LIST = new com.google.protobuf.ProtobufArrayList<>(new java.lang.Object[0], 0, false);
    private E[] array;
    private int size;

    public static <E> com.google.protobuf.ProtobufArrayList<E> emptyList() {
        return (com.google.protobuf.ProtobufArrayList<E>) EMPTY_LIST;
    }

    ProtobufArrayList() {
        this(new java.lang.Object[10], 0, true);
    }

    private ProtobufArrayList(E[] array, int size, boolean isMutable) {
        super(isMutable);
        this.array = array;
        this.size = size;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public com.google.protobuf.ProtobufArrayList<E> mutableCopyWithCapacity(int capacity) {
        if (capacity < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.protobuf.ProtobufArrayList<>(java.util.Arrays.copyOf(this.array, capacity), this.size, true);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ensureIsMutable();
        int i = this.size;
        E[] eArr = this.array;
        if (i == eArr.length) {
            this.array = (E[]) java.util.Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
        E[] eArr = this.array;
        if (i2 < eArr.length) {
            java.lang.System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) createArray(((i2 * 3) / 2) + 1);
            java.lang.System.arraycopy(this.array, 0, eArr2, 0, i);
            java.lang.System.arraycopy(this.array, i, eArr2, i + 1, this.size - i);
            this.array = eArr2;
        }
        this.array[i] = e;
        this.size++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        E[] eArr = this.array;
        E e = eArr[index];
        if (index < this.size - 1) {
            java.lang.System.arraycopy(eArr, index + 1, eArr, index, (r2 - index) - 1);
        }
        this.size--;
        this.modCount++;
        return e;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        E[] eArr = this.array;
        E e = eArr[index];
        eArr[index] = element;
        this.modCount++;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private static <E> E[] createArray(int i) {
        return (E[]) new java.lang.Object[i];
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.size) {
            throw new java.lang.IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private java.lang.String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.size;
    }
}
