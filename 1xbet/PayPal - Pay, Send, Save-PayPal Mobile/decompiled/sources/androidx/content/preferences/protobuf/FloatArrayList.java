package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class FloatArrayList extends androidx.content.preferences.protobuf.AbstractProtobufList<java.lang.Float> implements androidx.datastore.preferences.protobuf.Internal.FloatList, java.util.RandomAccess, androidx.content.preferences.protobuf.PrimitiveNonBoxingCollection {
    private static final androidx.content.preferences.protobuf.FloatArrayList Camera2StreamConfigurationMap = new androidx.content.preferences.protobuf.FloatArrayList(new float[0], 0, false);
    private float[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        float floatValue = ((java.lang.Float) obj).floatValue();
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.getHighSpeedVideoSizes)) {
            float[] fArr = this.getHighSpeedVideoFpsRangesFor;
            if (i2 < fArr.length) {
                java.lang.System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
                java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, i, fArr2, i + 1, this.getHighSpeedVideoSizes - i);
                this.getHighSpeedVideoFpsRangesFor = fArr2;
            }
            this.getHighSpeedVideoFpsRangesFor[i] = floatValue;
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
        addFloat(((java.lang.Float) obj).floatValue());
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        return java.lang.Float.valueOf(setFloat(i, ((java.lang.Float) obj).floatValue()));
    }

    public static androidx.content.preferences.protobuf.FloatArrayList getHighSpeedVideoFpsRanges() {
        return Camera2StreamConfigurationMap;
    }

    FloatArrayList() {
        this(new float[10], 0, true);
    }

    private FloatArrayList(float[] fArr, int i, boolean z) {
        super(z);
        this.getHighSpeedVideoFpsRangesFor = fArr;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.getHighSpeedVideoSizes - i2);
        this.getHighSpeedVideoSizes -= i2 - i;
        this.modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.content.preferences.protobuf.FloatArrayList)) {
            return super.equals(obj);
        }
        androidx.content.preferences.protobuf.FloatArrayList floatArrayList = (androidx.content.preferences.protobuf.FloatArrayList) obj;
        if (this.getHighSpeedVideoSizes != floatArrayList.getHighSpeedVideoSizes) {
            return false;
        }
        float[] fArr = floatArrayList.getHighSpeedVideoFpsRangesFor;
        for (int i = 0; i < this.getHighSpeedVideoSizes; i++) {
            if (java.lang.Float.floatToIntBits(this.getHighSpeedVideoFpsRangesFor[i]) != java.lang.Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizes; i2++) {
            i = (i * 31) + java.lang.Float.floatToIntBits(this.getHighSpeedVideoFpsRangesFor[i2]);
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public final androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Float> mutableCopyWithCapacity2(int i) {
        if (i < this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.content.preferences.protobuf.FloatArrayList(java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, i), this.getHighSpeedVideoSizes, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public final float getFloat(int i) {
        getHighResolutionOutputSizeshNQ4ISI(i);
        return this.getHighSpeedVideoFpsRangesFor[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float floatValue = ((java.lang.Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.getHighSpeedVideoFpsRangesFor[i] == floatValue) {
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

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public final float setFloat(int i, float f) {
        ensureIsMutable();
        getHighResolutionOutputSizeshNQ4ISI(i);
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public final void addFloat(float f) {
        ensureIsMutable();
        int i = this.getHighSpeedVideoSizes;
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
            this.getHighSpeedVideoFpsRangesFor = fArr2;
        }
        float[] fArr3 = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Float> collection) {
        ensureIsMutable();
        androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(collection);
        if (!(collection instanceof androidx.content.preferences.protobuf.FloatArrayList)) {
            return super.addAll(collection);
        }
        androidx.content.preferences.protobuf.FloatArrayList floatArrayList = (androidx.content.preferences.protobuf.FloatArrayList) collection;
        int i = floatArrayList.getHighSpeedVideoSizes;
        if (i == 0) {
            return false;
        }
        int i2 = this.getHighSpeedVideoSizes;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        if (i3 > fArr.length) {
            this.getHighSpeedVideoFpsRangesFor = java.util.Arrays.copyOf(fArr, i3);
        }
        java.lang.System.arraycopy(floatArrayList.getHighSpeedVideoFpsRangesFor, 0, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, floatArrayList.getHighSpeedVideoSizes);
        this.getHighSpeedVideoSizes = i3;
        this.modCount++;
        return true;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i) {
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
        return java.lang.Float.valueOf(getFloat(i));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        ensureIsMutable();
        getHighResolutionOutputSizeshNQ4ISI(i);
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        float f = fArr[i];
        if (i < this.getHighSpeedVideoSizes - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.getHighSpeedVideoSizes--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }
}
