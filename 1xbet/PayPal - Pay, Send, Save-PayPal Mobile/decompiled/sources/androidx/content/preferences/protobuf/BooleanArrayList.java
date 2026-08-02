package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class BooleanArrayList extends androidx.content.preferences.protobuf.AbstractProtobufList<java.lang.Boolean> implements androidx.datastore.preferences.protobuf.Internal.BooleanList, java.util.RandomAccess, androidx.content.preferences.protobuf.PrimitiveNonBoxingCollection {
    private static final androidx.content.preferences.protobuf.BooleanArrayList Camera2StreamConfigurationMap = new androidx.content.preferences.protobuf.BooleanArrayList(new boolean[0], 0, false);
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean[] getHighSpeedVideoFpsRangesFor;

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.getHighResolutionOutputSizeshNQ4ISI)) {
            boolean[] zArr = this.getHighSpeedVideoFpsRangesFor;
            if (i2 < zArr.length) {
                java.lang.System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
                java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, i, zArr2, i + 1, this.getHighResolutionOutputSizeshNQ4ISI - i);
                this.getHighSpeedVideoFpsRangesFor = zArr2;
            }
            this.getHighSpeedVideoFpsRangesFor[i] = booleanValue;
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

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        addBoolean(((java.lang.Boolean) obj).booleanValue());
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        return java.lang.Boolean.valueOf(setBoolean(i, ((java.lang.Boolean) obj).booleanValue()));
    }

    public static androidx.content.preferences.protobuf.BooleanArrayList getHighSpeedVideoFpsRanges() {
        return Camera2StreamConfigurationMap;
    }

    BooleanArrayList() {
        this(new boolean[10], 0, true);
    }

    private BooleanArrayList(boolean[] zArr, int i, boolean z) {
        super(z);
        this.getHighSpeedVideoFpsRangesFor = zArr;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.getHighResolutionOutputSizeshNQ4ISI - i2);
        this.getHighResolutionOutputSizeshNQ4ISI -= i2 - i;
        this.modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.content.preferences.protobuf.BooleanArrayList)) {
            return super.equals(obj);
        }
        androidx.content.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.content.preferences.protobuf.BooleanArrayList) obj;
        if (this.getHighResolutionOutputSizeshNQ4ISI != booleanArrayList.getHighResolutionOutputSizeshNQ4ISI) {
            return false;
        }
        boolean[] zArr = booleanArrayList.getHighSpeedVideoFpsRangesFor;
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI; i++) {
            if (this.getHighSpeedVideoFpsRangesFor[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            i = (i * 31) + androidx.content.preferences.protobuf.Internal.hashBoolean(this.getHighSpeedVideoFpsRangesFor[i2]);
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public final androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Boolean> mutableCopyWithCapacity2(int i) {
        if (i < this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.content.preferences.protobuf.BooleanArrayList(java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, i), this.getHighResolutionOutputSizeshNQ4ISI, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public final boolean getBoolean(int i) {
        getHighResolutionOutputSizeshNQ4ISI(i);
        return this.getHighSpeedVideoFpsRangesFor[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.getHighSpeedVideoFpsRangesFor[i] == booleanValue) {
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
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public final boolean setBoolean(int i, boolean z) {
        ensureIsMutable();
        getHighResolutionOutputSizeshNQ4ISI(i);
        boolean[] zArr = this.getHighSpeedVideoFpsRangesFor;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public final void addBoolean(boolean z) {
        ensureIsMutable();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean[] zArr = this.getHighSpeedVideoFpsRangesFor;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            this.getHighSpeedVideoFpsRangesFor = zArr2;
        }
        boolean[] zArr3 = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Boolean> collection) {
        ensureIsMutable();
        androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(collection);
        if (!(collection instanceof androidx.content.preferences.protobuf.BooleanArrayList)) {
            return super.addAll(collection);
        }
        androidx.content.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.content.preferences.protobuf.BooleanArrayList) collection;
        int i = booleanArrayList.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            return false;
        }
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.getHighSpeedVideoFpsRangesFor;
        if (i3 > zArr.length) {
            this.getHighSpeedVideoFpsRangesFor = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(booleanArrayList.getHighSpeedVideoFpsRangesFor, 0, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, booleanArrayList.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        this.modCount++;
        return true;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i < 0 || i >= this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index:");
            sb.append(i);
            sb.append(", Size:");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Boolean.valueOf(getBoolean(i));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        ensureIsMutable();
        getHighResolutionOutputSizeshNQ4ISI(i);
        boolean[] zArr = this.getHighSpeedVideoFpsRangesFor;
        boolean z = zArr[i];
        if (i < this.getHighResolutionOutputSizeshNQ4ISI - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.getHighResolutionOutputSizeshNQ4ISI--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }
}
