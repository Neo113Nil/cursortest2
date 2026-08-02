package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class LongArrayList extends androidx.content.preferences.protobuf.AbstractProtobufList<java.lang.Long> implements androidx.datastore.preferences.protobuf.Internal.LongList, java.util.RandomAccess, androidx.content.preferences.protobuf.PrimitiveNonBoxingCollection {
    private static final androidx.content.preferences.protobuf.LongArrayList getHighResolutionOutputSizeshNQ4ISI = new androidx.content.preferences.protobuf.LongArrayList(new long[0], 0, false);
    private long[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        long longValue = ((java.lang.Long) obj).longValue();
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.getHighSpeedVideoFpsRangesFor)) {
            long[] jArr = this.getHighSpeedVideoFpsRanges;
            if (i2 < jArr.length) {
                java.lang.System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
                java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, i, jArr2, i + 1, this.getHighSpeedVideoFpsRangesFor - i);
                this.getHighSpeedVideoFpsRanges = jArr2;
            }
            this.getHighSpeedVideoFpsRanges[i] = longValue;
            this.getHighSpeedVideoFpsRangesFor++;
            this.modCount++;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        addLong(((java.lang.Long) obj).longValue());
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        return java.lang.Long.valueOf(setLong(i, ((java.lang.Long) obj).longValue()));
    }

    public static androidx.content.preferences.protobuf.LongArrayList getHighSpeedVideoFpsRanges() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    LongArrayList() {
        this(new long[10], 0, true);
    }

    private LongArrayList(long[] jArr, int i, boolean z) {
        super(z);
        this.getHighSpeedVideoFpsRanges = jArr;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.getHighSpeedVideoFpsRanges;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.getHighSpeedVideoFpsRangesFor - i2);
        this.getHighSpeedVideoFpsRangesFor -= i2 - i;
        this.modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            return super.equals(obj);
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) obj;
        if (this.getHighSpeedVideoFpsRangesFor != longArrayList.getHighSpeedVideoFpsRangesFor) {
            return false;
        }
        long[] jArr = longArrayList.getHighSpeedVideoFpsRanges;
        for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor; i++) {
            if (this.getHighSpeedVideoFpsRanges[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRangesFor; i2++) {
            i = (i * 31) + androidx.content.preferences.protobuf.Internal.hashLong(this.getHighSpeedVideoFpsRanges[i2]);
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public final androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Long> mutableCopyWithCapacity2(int i) {
        if (i < this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.content.preferences.protobuf.LongArrayList(java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, i), this.getHighSpeedVideoFpsRangesFor, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public final long getLong(int i) {
        getHighSpeedVideoFpsRangesFor(i);
        return this.getHighSpeedVideoFpsRanges[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long longValue = ((java.lang.Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.getHighSpeedVideoFpsRanges[i] == longValue) {
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
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public final long setLong(int i, long j) {
        ensureIsMutable();
        getHighSpeedVideoFpsRangesFor(i);
        long[] jArr = this.getHighSpeedVideoFpsRanges;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public final void addLong(long j) {
        ensureIsMutable();
        int i = this.getHighSpeedVideoFpsRangesFor;
        long[] jArr = this.getHighSpeedVideoFpsRanges;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            this.getHighSpeedVideoFpsRanges = jArr2;
        }
        long[] jArr3 = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Long> collection) {
        ensureIsMutable();
        androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(collection);
        if (!(collection instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            return super.addAll(collection);
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) collection;
        int i = longArrayList.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            return false;
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.getHighSpeedVideoFpsRanges;
        if (i3 > jArr.length) {
            this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(longArrayList.getHighSpeedVideoFpsRanges, 0, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, longArrayList.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRangesFor = i3;
        this.modCount++;
        return true;
    }

    private void getHighSpeedVideoFpsRangesFor(int i) {
        if (i < 0 || i >= this.getHighSpeedVideoFpsRangesFor) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index:");
            sb.append(i);
            sb.append(", Size:");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Long.valueOf(getLong(i));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        ensureIsMutable();
        getHighSpeedVideoFpsRangesFor(i);
        long[] jArr = this.getHighSpeedVideoFpsRanges;
        long j = jArr[i];
        if (i < this.getHighSpeedVideoFpsRangesFor - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.getHighSpeedVideoFpsRangesFor--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }
}
