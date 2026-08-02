package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class IntArrayList extends androidx.content.preferences.protobuf.AbstractProtobufList<java.lang.Integer> implements androidx.datastore.preferences.protobuf.Internal.IntList, java.util.RandomAccess, androidx.content.preferences.protobuf.PrimitiveNonBoxingCollection {
    private static final androidx.content.preferences.protobuf.IntArrayList getHighSpeedVideoFpsRanges = new androidx.content.preferences.protobuf.IntArrayList(new int[0], 0, false);
    private int[] Camera2StreamConfigurationMap;
    private int getHighSpeedVideoSizes;

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        int intValue = ((java.lang.Integer) obj).intValue();
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.getHighSpeedVideoSizes)) {
            int[] iArr = this.Camera2StreamConfigurationMap;
            if (i2 < iArr.length) {
                java.lang.System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
                java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, i, iArr2, i + 1, this.getHighSpeedVideoSizes - i);
                this.Camera2StreamConfigurationMap = iArr2;
            }
            this.Camera2StreamConfigurationMap[i] = intValue;
            this.getHighSpeedVideoSizes++;
            this.modCount++;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.getHighSpeedVideoSizes);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        addInt(((java.lang.Integer) obj).intValue());
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        return java.lang.Integer.valueOf(setInt(i, ((java.lang.Integer) obj).intValue()));
    }

    public static androidx.content.preferences.protobuf.IntArrayList getHighSpeedVideoFpsRangesFor() {
        return getHighSpeedVideoFpsRanges;
    }

    IntArrayList() {
        this(new int[10], 0, true);
    }

    private IntArrayList(int[] iArr, int i, boolean z) {
        super(z);
        this.Camera2StreamConfigurationMap = iArr;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.Camera2StreamConfigurationMap;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.getHighSpeedVideoSizes - i2);
        this.getHighSpeedVideoSizes -= i2 - i;
        this.modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            return super.equals(obj);
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) obj;
        if (this.getHighSpeedVideoSizes != intArrayList.getHighSpeedVideoSizes) {
            return false;
        }
        int[] iArr = intArrayList.Camera2StreamConfigurationMap;
        for (int i = 0; i < this.getHighSpeedVideoSizes; i++) {
            if (this.Camera2StreamConfigurationMap[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizes; i2++) {
            i = (i * 31) + this.Camera2StreamConfigurationMap[i2];
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public final androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Integer> mutableCopyWithCapacity2(int i) {
        if (i < this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.content.preferences.protobuf.IntArrayList(java.util.Arrays.copyOf(this.Camera2StreamConfigurationMap, i), this.getHighSpeedVideoSizes, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public final int getInt(int i) {
        getHighSpeedVideoSizes(i);
        return this.Camera2StreamConfigurationMap[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.Camera2StreamConfigurationMap[i] == intValue) {
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
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public final int setInt(int i, int i2) {
        ensureIsMutable();
        getHighSpeedVideoSizes(i);
        int[] iArr = this.Camera2StreamConfigurationMap;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public final void addInt(int i) {
        ensureIsMutable();
        int i2 = this.getHighSpeedVideoSizes;
        int[] iArr = this.Camera2StreamConfigurationMap;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.Camera2StreamConfigurationMap = iArr2;
        }
        int[] iArr3 = this.Camera2StreamConfigurationMap;
        int i3 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Integer> collection) {
        ensureIsMutable();
        androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(collection);
        if (!(collection instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            return super.addAll(collection);
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) collection;
        int i = intArrayList.getHighSpeedVideoSizes;
        if (i == 0) {
            return false;
        }
        int i2 = this.getHighSpeedVideoSizes;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.Camera2StreamConfigurationMap;
        if (i3 > iArr.length) {
            this.Camera2StreamConfigurationMap = java.util.Arrays.copyOf(iArr, i3);
        }
        java.lang.System.arraycopy(intArrayList.Camera2StreamConfigurationMap, 0, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, intArrayList.getHighSpeedVideoSizes);
        this.getHighSpeedVideoSizes = i3;
        this.modCount++;
        return true;
    }

    private void getHighSpeedVideoSizes(int i) {
        if (i < 0 || i >= this.getHighSpeedVideoSizes) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index:");
            sb.append(i);
            sb.append(", Size:");
            sb.append(this.getHighSpeedVideoSizes);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Integer.valueOf(getInt(i));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        ensureIsMutable();
        getHighSpeedVideoSizes(i);
        int[] iArr = this.Camera2StreamConfigurationMap;
        int i2 = iArr[i];
        if (i < this.getHighSpeedVideoSizes - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.getHighSpeedVideoSizes--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }
}
