package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class DoubleArrayList extends androidx.content.preferences.protobuf.AbstractProtobufList<java.lang.Double> implements androidx.datastore.preferences.protobuf.Internal.DoubleList, java.util.RandomAccess, androidx.content.preferences.protobuf.PrimitiveNonBoxingCollection {
    private static final androidx.content.preferences.protobuf.DoubleArrayList getHighSpeedVideoSizes = new androidx.content.preferences.protobuf.DoubleArrayList(new double[0], 0, false);
    private int Camera2StreamConfigurationMap;
    private double[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.Camera2StreamConfigurationMap)) {
            double[] dArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 < dArr.length) {
                java.lang.System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
                java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, i, dArr2, i + 1, this.Camera2StreamConfigurationMap - i);
                this.getHighResolutionOutputSizeshNQ4ISI = dArr2;
            }
            this.getHighResolutionOutputSizeshNQ4ISI[i] = doubleValue;
            this.Camera2StreamConfigurationMap++;
            this.modCount++;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.Camera2StreamConfigurationMap);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        addDouble(((java.lang.Double) obj).doubleValue());
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        return java.lang.Double.valueOf(setDouble(i, ((java.lang.Double) obj).doubleValue()));
    }

    public static androidx.content.preferences.protobuf.DoubleArrayList Camera2StreamConfigurationMap() {
        return getHighSpeedVideoSizes;
    }

    DoubleArrayList() {
        this(new double[10], 0, true);
    }

    private DoubleArrayList(double[] dArr, int i, boolean z) {
        super(z);
        this.getHighResolutionOutputSizeshNQ4ISI = dArr;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.Camera2StreamConfigurationMap - i2);
        this.Camera2StreamConfigurationMap -= i2 - i;
        this.modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.content.preferences.protobuf.DoubleArrayList)) {
            return super.equals(obj);
        }
        androidx.content.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.content.preferences.protobuf.DoubleArrayList) obj;
        if (this.Camera2StreamConfigurationMap != doubleArrayList.Camera2StreamConfigurationMap) {
            return false;
        }
        double[] dArr = doubleArrayList.getHighResolutionOutputSizeshNQ4ISI;
        for (int i = 0; i < this.Camera2StreamConfigurationMap; i++) {
            if (java.lang.Double.doubleToLongBits(this.getHighResolutionOutputSizeshNQ4ISI[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.Camera2StreamConfigurationMap; i2++) {
            i = (i * 31) + androidx.content.preferences.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(this.getHighResolutionOutputSizeshNQ4ISI[i2]));
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public final androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Double> mutableCopyWithCapacity2(int i) {
        if (i < this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalArgumentException();
        }
        return new androidx.content.preferences.protobuf.DoubleArrayList(java.util.Arrays.copyOf(this.getHighResolutionOutputSizeshNQ4ISI, i), this.Camera2StreamConfigurationMap, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public final double getDouble(int i) {
        getHighSpeedVideoSizes(i);
        return this.getHighResolutionOutputSizeshNQ4ISI[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Double)) {
            return -1;
        }
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.getHighResolutionOutputSizeshNQ4ISI[i] == doubleValue) {
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
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public final double setDouble(int i, double d) {
        ensureIsMutable();
        getHighSpeedVideoSizes(i);
        double[] dArr = this.getHighResolutionOutputSizeshNQ4ISI;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public final void addDouble(double d) {
        ensureIsMutable();
        int i = this.Camera2StreamConfigurationMap;
        double[] dArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            this.getHighResolutionOutputSizeshNQ4ISI = dArr2;
        }
        double[] dArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Double> collection) {
        ensureIsMutable();
        androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(collection);
        if (!(collection instanceof androidx.content.preferences.protobuf.DoubleArrayList)) {
            return super.addAll(collection);
        }
        androidx.content.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.content.preferences.protobuf.DoubleArrayList) collection;
        int i = doubleArrayList.Camera2StreamConfigurationMap;
        if (i == 0) {
            return false;
        }
        int i2 = this.Camera2StreamConfigurationMap;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i3 > dArr.length) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(doubleArrayList.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, doubleArrayList.Camera2StreamConfigurationMap);
        this.Camera2StreamConfigurationMap = i3;
        this.modCount++;
        return true;
    }

    private void getHighSpeedVideoSizes(int i) {
        if (i < 0 || i >= this.Camera2StreamConfigurationMap) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index:");
            sb.append(i);
            sb.append(", Size:");
            sb.append(this.Camera2StreamConfigurationMap);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Double.valueOf(getDouble(i));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        ensureIsMutable();
        getHighSpeedVideoSizes(i);
        double[] dArr = this.getHighResolutionOutputSizeshNQ4ISI;
        double d = dArr[i];
        if (i < this.Camera2StreamConfigurationMap - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.Camera2StreamConfigurationMap--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }
}
