package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class ProtobufArrayList<E> extends androidx.content.preferences.protobuf.AbstractProtobufList<E> implements java.util.RandomAccess {
    private static final androidx.content.preferences.protobuf.ProtobufArrayList<java.lang.Object> getHighSpeedVideoSizes = new androidx.content.preferences.protobuf.ProtobufArrayList<>(new java.lang.Object[0], 0, false);
    private int getHighResolutionOutputSizeshNQ4ISI;
    private E[] getHighSpeedVideoFpsRanges;

    public static <E> androidx.content.preferences.protobuf.ProtobufArrayList<E> Camera2StreamConfigurationMap() {
        return (androidx.content.preferences.protobuf.ProtobufArrayList<E>) getHighSpeedVideoSizes;
    }

    ProtobufArrayList() {
        this(new java.lang.Object[10], 0, true);
    }

    private ProtobufArrayList(E[] eArr, int i, boolean z) {
        super(z);
        this.getHighSpeedVideoFpsRanges = eArr;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ensureIsMutable();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        E[] eArr = this.getHighSpeedVideoFpsRanges;
        if (i == eArr.length) {
            this.getHighSpeedVideoFpsRanges = (E[]) java.util.Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.getHighResolutionOutputSizeshNQ4ISI)) {
            E[] eArr = this.getHighSpeedVideoFpsRanges;
            if (i2 < eArr.length) {
                java.lang.System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new java.lang.Object[((i2 * 3) / 2) + 1];
                java.lang.System.arraycopy(eArr, 0, eArr2, 0, i);
                java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, i, eArr2, i + 1, this.getHighResolutionOutputSizeshNQ4ISI - i);
                this.getHighSpeedVideoFpsRanges = eArr2;
            }
            this.getHighSpeedVideoFpsRanges[i] = e;
            this.getHighResolutionOutputSizeshNQ4ISI++;
            this.modCount++;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        getHighSpeedVideoFpsRanges(i);
        return this.getHighSpeedVideoFpsRanges[i];
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        ensureIsMutable();
        getHighSpeedVideoFpsRanges(i);
        E[] eArr = this.getHighSpeedVideoFpsRanges;
        E e = eArr[i];
        if (i < this.getHighResolutionOutputSizeshNQ4ISI - 1) {
            java.lang.System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.getHighResolutionOutputSizeshNQ4ISI--;
        this.modCount++;
        return e;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        ensureIsMutable();
        getHighSpeedVideoFpsRanges(i);
        E[] eArr = this.getHighSpeedVideoFpsRanges;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        if (i < 0 || i >= this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index:");
            sb.append(i);
            sb.append(", Size:");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public final /* synthetic */ androidx.datastore.preferences.protobuf.Internal.ProtobufList mutableCopyWithCapacity2(int i) {
        if (i < this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.content.preferences.protobuf.ProtobufArrayList(java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, i), this.getHighResolutionOutputSizeshNQ4ISI, true);
    }
}
