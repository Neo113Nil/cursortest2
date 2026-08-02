package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes7.dex */
abstract class BinaryWriter extends androidx.content.preferences.protobuf.ByteOutput implements androidx.content.preferences.protobuf.Writer {
    final java.util.ArrayDeque<androidx.content.preferences.protobuf.AllocatedBuffer> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.content.preferences.protobuf.BufferAllocator getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    static /* synthetic */ byte getHighSpeedVideoFpsRangesFor(long j) {
        byte b;
        if (((-128) & j) == 0) {
            return (byte) 1;
        }
        if (j < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            b = 6;
        } else {
            b = 2;
        }
        if (((-2097152) & j) != 0) {
            b = (byte) (b + 2);
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? (byte) (b + 1) : b;
    }

    public abstract int Camera2StreamConfigurationMap();

    abstract void Camera2StreamConfigurationMap(int i);

    abstract void Camera2StreamConfigurationMap(long j);

    abstract void getHighResolutionOutputSizeshNQ4ISI(long j);

    abstract void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str);

    abstract void getHighResolutionOutputSizeshNQ4ISI(boolean z);

    abstract void getHighSpeedVideoFpsRanges(int i);

    abstract void getHighSpeedVideoFpsRanges(int i, int i2);

    abstract void getHighSpeedVideoFpsRanges(long j);

    abstract void getHighSpeedVideoFpsRangesFor();

    abstract void getHighSpeedVideoSizes(int i);

    abstract void getHighSpeedVideoSizesFor(int i);

    abstract void getInputSizeshNQ4ISI(int i);

    @Override // androidx.content.preferences.protobuf.Writer
    public final androidx.datastore.preferences.protobuf.Writer.FieldOrder getHighResolutionOutputSizeshNQ4ISI() {
        return androidx.datastore.preferences.protobuf.Writer.FieldOrder.DESCENDING;
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizes(int i, int i2) throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor(i, i2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, long j) throws java.io.IOException {
        getHighSpeedVideoSizes(i, j);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRanges(int i, long j) throws java.io.IOException {
        Camera2StreamConfigurationMap(i, j);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizes(int i, float f) throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRangesFor(int i, double d) throws java.io.IOException {
        Camera2StreamConfigurationMap(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) throws java.io.IOException {
        Camera2StreamConfigurationMap(i, i2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputMinFrameDuration(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
            getHighSpeedVideoFpsRangesFor(i, (androidx.content.preferences.protobuf.IntArrayList) list, z);
        } else {
            getOutputStallDurationlomOqCM(i, list, z);
        }
    }

    private void getOutputStallDurationlomOqCM(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (z) {
            getHighSpeedVideoFpsRanges((list.size() * 10) + 10);
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            for (int size = list.size() - 1; size >= 0; size--) {
                getHighSpeedVideoSizes(list.get(size).intValue());
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Camera2StreamConfigurationMap(i, list.get(size2).intValue());
        }
    }

    private void getHighSpeedVideoFpsRangesFor(int i, androidx.content.preferences.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        if (z) {
            getHighSpeedVideoFpsRanges((intArrayList.size() * 10) + 10);
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                getHighSpeedVideoSizes(intArrayList.getInt(size));
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            Camera2StreamConfigurationMap(i, intArrayList.getInt(size2));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizes(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            if (z) {
                getHighSpeedVideoFpsRanges((list.size() * 4) + 10);
                int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                for (int size = list.size() - 1; size >= 0; size--) {
                    Camera2StreamConfigurationMap(list.get(size).intValue());
                }
                getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
                getHighSpeedVideoFpsRanges(i, 2);
                return;
            }
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                getHighSpeedVideoFpsRangesFor(i, list.get(size2).intValue());
            }
            return;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        if (z) {
            getHighSpeedVideoFpsRanges((intArrayList.size() * 4) + 10);
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            for (int size3 = intArrayList.size() - 1; size3 >= 0; size3--) {
                Camera2StreamConfigurationMap(intArrayList.getInt(size3));
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap2);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size4 = intArrayList.size() - 1; size4 >= 0; size4--) {
            getHighSpeedVideoFpsRangesFor(i, intArrayList.getInt(size4));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
            getHighResolutionOutputSizeshNQ4ISI(i, (androidx.content.preferences.protobuf.LongArrayList) list, z);
        } else {
            toString(i, list, z);
        }
    }

    private void toString(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (z) {
            getHighSpeedVideoFpsRanges((list.size() * 10) + 10);
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            for (int size = list.size() - 1; size >= 0; size--) {
                getHighSpeedVideoFpsRanges(list.get(size).longValue());
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            getHighSpeedVideoSizes(i, list.get(size2).longValue());
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i, androidx.content.preferences.protobuf.LongArrayList longArrayList, boolean z) throws java.io.IOException {
        if (z) {
            getHighSpeedVideoFpsRanges((longArrayList.size() * 10) + 10);
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                getHighSpeedVideoFpsRanges(longArrayList.getLong(size));
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            getHighSpeedVideoSizes(i, longArrayList.getLong(size2));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (!(list instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            if (z) {
                getHighSpeedVideoFpsRanges((list.size() * 8) + 10);
                int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                for (int size = list.size() - 1; size >= 0; size--) {
                    Camera2StreamConfigurationMap(list.get(size).longValue());
                }
                getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
                getHighSpeedVideoFpsRanges(i, 2);
                return;
            }
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                Camera2StreamConfigurationMap(i, list.get(size2).longValue());
            }
            return;
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
        if (z) {
            getHighSpeedVideoFpsRanges((longArrayList.size() * 8) + 10);
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            for (int size3 = longArrayList.size() - 1; size3 >= 0; size3--) {
                Camera2StreamConfigurationMap(longArrayList.getLong(size3));
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap2);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size4 = longArrayList.size() - 1; size4 >= 0; size4--) {
            Camera2StreamConfigurationMap(i, longArrayList.getLong(size4));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputFormats(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        if (!(list instanceof androidx.content.preferences.protobuf.FloatArrayList)) {
            if (z) {
                getHighSpeedVideoFpsRanges((list.size() * 4) + 10);
                int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                for (int size = list.size() - 1; size >= 0; size--) {
                    Camera2StreamConfigurationMap(java.lang.Float.floatToRawIntBits(list.get(size).floatValue()));
                }
                getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
                getHighSpeedVideoFpsRanges(i, 2);
                return;
            }
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                getHighSpeedVideoFpsRangesFor(i, java.lang.Float.floatToRawIntBits(list.get(size2).floatValue()));
            }
            return;
        }
        androidx.content.preferences.protobuf.FloatArrayList floatArrayList = (androidx.content.preferences.protobuf.FloatArrayList) list;
        if (z) {
            getHighSpeedVideoFpsRanges((floatArrayList.size() * 4) + 10);
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            for (int size3 = floatArrayList.size() - 1; size3 >= 0; size3--) {
                Camera2StreamConfigurationMap(java.lang.Float.floatToRawIntBits(floatArrayList.getFloat(size3)));
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap2);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size4 = floatArrayList.size() - 1; size4 >= 0; size4--) {
            getHighSpeedVideoFpsRangesFor(i, java.lang.Float.floatToRawIntBits(floatArrayList.getFloat(size4)));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void Camera2StreamConfigurationMap(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        if (!(list instanceof androidx.content.preferences.protobuf.DoubleArrayList)) {
            if (z) {
                getHighSpeedVideoFpsRanges((list.size() * 8) + 10);
                int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                for (int size = list.size() - 1; size >= 0; size--) {
                    Camera2StreamConfigurationMap(java.lang.Double.doubleToRawLongBits(list.get(size).doubleValue()));
                }
                getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
                getHighSpeedVideoFpsRanges(i, 2);
                return;
            }
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                Camera2StreamConfigurationMap(i, java.lang.Double.doubleToRawLongBits(list.get(size2).doubleValue()));
            }
            return;
        }
        androidx.content.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.content.preferences.protobuf.DoubleArrayList) list;
        if (z) {
            getHighSpeedVideoFpsRanges((doubleArrayList.size() * 8) + 10);
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            for (int size3 = doubleArrayList.size() - 1; size3 >= 0; size3--) {
                Camera2StreamConfigurationMap(java.lang.Double.doubleToRawLongBits(doubleArrayList.getDouble(size3)));
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap2);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size4 = doubleArrayList.size() - 1; size4 >= 0; size4--) {
            Camera2StreamConfigurationMap(i, java.lang.Double.doubleToRawLongBits(doubleArrayList.getDouble(size4)));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRangesFor(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        if (!(list instanceof androidx.content.preferences.protobuf.BooleanArrayList)) {
            if (z) {
                getHighSpeedVideoFpsRanges(list.size() + 10);
                int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                for (int size = list.size() - 1; size >= 0; size--) {
                    getHighResolutionOutputSizeshNQ4ISI(list.get(size).booleanValue());
                }
                getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
                getHighSpeedVideoFpsRanges(i, 2);
                return;
            }
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                Camera2StreamConfigurationMap(i, list.get(size2).booleanValue());
            }
            return;
        }
        androidx.content.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.content.preferences.protobuf.BooleanArrayList) list;
        if (z) {
            getHighSpeedVideoFpsRanges(booleanArrayList.size() + 10);
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            for (int size3 = booleanArrayList.size() - 1; size3 >= 0; size3--) {
                getHighResolutionOutputSizeshNQ4ISI(booleanArrayList.getBoolean(size3));
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap2);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size4 = booleanArrayList.size() - 1; size4 >= 0; size4--) {
            Camera2StreamConfigurationMap(i, booleanArrayList.getBoolean(size4));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<java.lang.String> list) throws java.io.IOException {
        if (list instanceof androidx.content.preferences.protobuf.LazyStringList) {
            androidx.content.preferences.protobuf.LazyStringList lazyStringList = (androidx.content.preferences.protobuf.LazyStringList) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                java.lang.Object raw = lazyStringList.getRaw(size);
                if (raw instanceof java.lang.String) {
                    getHighSpeedVideoFpsRanges(i, (java.lang.String) raw);
                } else {
                    getHighSpeedVideoFpsRanges(i, (androidx.content.preferences.protobuf.ByteString) raw);
                }
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            getHighSpeedVideoFpsRanges(i, list.get(size2));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void Camera2StreamConfigurationMap(int i, java.util.List<androidx.content.preferences.protobuf.ByteString> list) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            getHighSpeedVideoFpsRanges(i, list.get(size));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputMinFrameDurationlomOqCM(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            if (z) {
                getHighSpeedVideoFpsRanges((list.size() * 5) + 10);
                int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                for (int size = list.size() - 1; size >= 0; size--) {
                    getInputSizeshNQ4ISI(list.get(size).intValue());
                }
                getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
                getHighSpeedVideoFpsRanges(i, 2);
                return;
            }
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                getOutputFormats(i, list.get(size2).intValue());
            }
            return;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        if (z) {
            getHighSpeedVideoFpsRanges((intArrayList.size() * 5) + 10);
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            for (int size3 = intArrayList.size() - 1; size3 >= 0; size3--) {
                getInputSizeshNQ4ISI(intArrayList.getInt(size3));
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap2);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size4 = intArrayList.size() - 1; size4 >= 0; size4--) {
            getOutputFormats(i, intArrayList.getInt(size4));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoSizesFor(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        getHighSpeedVideoSizes(i, list, z);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getInputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI(i, list, z);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputStallDuration(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (!(list instanceof androidx.content.preferences.protobuf.IntArrayList)) {
            if (z) {
                getHighSpeedVideoFpsRanges((list.size() * 5) + 10);
                int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                for (int size = list.size() - 1; size >= 0; size--) {
                    getHighSpeedVideoSizesFor(list.get(size).intValue());
                }
                getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
                getHighSpeedVideoFpsRanges(i, 2);
                return;
            }
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                getOutputMinFrameDuration(i, list.get(size2).intValue());
            }
            return;
        }
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
        if (z) {
            getHighSpeedVideoFpsRanges((intArrayList.size() * 5) + 10);
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            for (int size3 = intArrayList.size() - 1; size3 >= 0; size3--) {
                getHighSpeedVideoSizesFor(intArrayList.getInt(size3));
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap2);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size4 = intArrayList.size() - 1; size4 >= 0; size4--) {
            getOutputMinFrameDuration(i, intArrayList.getInt(size4));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getOutputSizes(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (!(list instanceof androidx.content.preferences.protobuf.LongArrayList)) {
            if (z) {
                getHighSpeedVideoFpsRanges((list.size() * 10) + 10);
                int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                for (int size = list.size() - 1; size >= 0; size--) {
                    getHighResolutionOutputSizeshNQ4ISI(list.get(size).longValue());
                }
                getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
                getHighSpeedVideoFpsRanges(i, 2);
                return;
            }
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                getHighSpeedVideoFpsRangesFor(i, list.get(size2).longValue());
            }
            return;
        }
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
        if (z) {
            getHighSpeedVideoFpsRanges((longArrayList.size() * 10) + 10);
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            for (int size3 = longArrayList.size() - 1; size3 >= 0; size3--) {
                getHighResolutionOutputSizeshNQ4ISI(longArrayList.getLong(size3));
            }
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap2);
            getHighSpeedVideoFpsRanges(i, 2);
            return;
        }
        for (int size4 = longArrayList.size() - 1; size4 >= 0; size4--) {
            getHighSpeedVideoFpsRangesFor(i, longArrayList.getLong(size4));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final <K, V> void Camera2StreamConfigurationMap(int i, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRangesFor(this, 2, metadata.getHighResolutionOutputSizeshNQ4ISI, entry.getValue());
            getHighSpeedVideoFpsRangesFor(this, 1, metadata.getHighSpeedVideoFpsRanges, entry.getKey());
            getInputSizeshNQ4ISI(Camera2StreamConfigurationMap() - Camera2StreamConfigurationMap);
            getHighSpeedVideoFpsRanges(i, 2);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.BinaryWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Writer writer, int i, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) throws java.io.IOException {
        switch (androidx.content.preferences.protobuf.BinaryWriter.AnonymousClass1.getHighSpeedVideoFpsRanges[fieldType.ordinal()]) {
            case 1:
                writer.Camera2StreamConfigurationMap(i, ((java.lang.Boolean) obj).booleanValue());
                return;
            case 2:
                writer.getHighSpeedVideoFpsRangesFor(i, ((java.lang.Integer) obj).intValue());
                return;
            case 3:
                writer.Camera2StreamConfigurationMap(i, ((java.lang.Long) obj).longValue());
                return;
            case 4:
                writer.Camera2StreamConfigurationMap(i, ((java.lang.Integer) obj).intValue());
                return;
            case 5:
                writer.getHighResolutionOutputSizeshNQ4ISI(i, ((java.lang.Long) obj).longValue());
                return;
            case 6:
                writer.getHighSpeedVideoSizes(i, ((java.lang.Integer) obj).intValue());
                return;
            case 7:
                writer.getHighSpeedVideoFpsRanges(i, ((java.lang.Long) obj).longValue());
                return;
            case 8:
                writer.getOutputMinFrameDuration(i, ((java.lang.Integer) obj).intValue());
                return;
            case 9:
                writer.getHighSpeedVideoFpsRangesFor(i, ((java.lang.Long) obj).longValue());
                return;
            case 10:
                writer.getHighSpeedVideoFpsRanges(i, (java.lang.String) obj);
                return;
            case 11:
                writer.getOutputFormats(i, ((java.lang.Integer) obj).intValue());
                return;
            case 12:
                writer.getHighSpeedVideoSizes(i, ((java.lang.Long) obj).longValue());
                return;
            case 13:
                writer.getHighSpeedVideoSizes(i, ((java.lang.Float) obj).floatValue());
                return;
            case 14:
                writer.getHighSpeedVideoFpsRangesFor(i, ((java.lang.Double) obj).doubleValue());
                return;
            case 15:
                writer.getHighSpeedVideoFpsRanges(i, obj);
                return;
            case 16:
                writer.getHighSpeedVideoFpsRanges(i, (androidx.content.preferences.protobuf.ByteString) obj);
                return;
            case 17:
                if (obj instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite) {
                    writer.getHighResolutionOutputSizeshNQ4ISI(i, ((androidx.datastore.preferences.protobuf.Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    if (obj instanceof java.lang.Integer) {
                        writer.getHighResolutionOutputSizeshNQ4ISI(i, ((java.lang.Integer) obj).intValue());
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("Unexpected type for enum in map.");
                }
            default:
                throw new java.lang.IllegalArgumentException("Unsupported map value type for: ".concat(java.lang.String.valueOf(fieldType)));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<?> list, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            getHighSpeedVideoFpsRanges(i, list.get(size), schema);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    @java.lang.Deprecated
    public final void getHighSpeedVideoSizes(int i, java.util.List<?> list, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            getHighSpeedVideoSizes(i, list.get(size), schema);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRangesFor(int i, java.lang.Object obj) throws java.io.IOException {
        getHighSpeedVideoFpsRanges(1, 4);
        if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
            getHighSpeedVideoFpsRanges(3, (androidx.content.preferences.protobuf.ByteString) obj);
        } else {
            getHighSpeedVideoFpsRanges(3, obj);
        }
        getOutputFormats(2, i);
        getHighSpeedVideoFpsRanges(1, 3);
    }

    final androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
    }

    final androidx.content.preferences.protobuf.AllocatedBuffer getHighResolutionOutputSizeshNQ4ISI(int i) {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(java.lang.Math.max(i, this.getHighSpeedVideoSizes));
    }

    final androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
    }

    final androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoFpsRangesFor(int i) {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(java.lang.Math.max(i, this.getHighSpeedVideoSizes));
    }

    static final class SafeHeapWriter extends androidx.content.preferences.protobuf.BinaryWriter {
        private androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoFpsRanges;
        private byte[] getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private int getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private int getOutputMinFrameDuration;

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRangesFor() {
            if (this.getHighSpeedVideoFpsRanges != null) {
                this.getHighResolutionOutputSizeshNQ4ISI += this.getInputSizeshNQ4ISI - this.getOutputFormats;
                androidx.content.preferences.protobuf.AllocatedBuffer allocatedBuffer = this.getHighSpeedVideoFpsRanges;
                allocatedBuffer.getHighSpeedVideoSizes((this.getOutputFormats - allocatedBuffer.getHighSpeedVideoSizes()) + 1);
                this.getHighSpeedVideoFpsRanges = null;
                this.getOutputFormats = 0;
                this.getInputSizeshNQ4ISI = 0;
            }
        }

        private void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.getHighSpeedVideoFpsRangesFor()) {
                throw new java.lang.RuntimeException("Allocator returned non-heap buffer");
            }
            getHighSpeedVideoFpsRangesFor();
            this.Camera2StreamConfigurationMap.addFirst(allocatedBuffer);
            this.getHighSpeedVideoFpsRanges = allocatedBuffer;
            this.getHighSpeedVideoFpsRangesFor = allocatedBuffer.getHighResolutionOutputSizeshNQ4ISI();
            int highSpeedVideoSizes = allocatedBuffer.getHighSpeedVideoSizes();
            this.getHighSpeedVideoSizes = allocatedBuffer.getHighSpeedVideoFpsRanges() + highSpeedVideoSizes;
            int outputFormats = highSpeedVideoSizes + allocatedBuffer.getOutputFormats();
            this.getOutputMinFrameDuration = outputFormats;
            this.getHighSpeedVideoSizesFor = outputFormats - 1;
            int i = this.getHighSpeedVideoSizes - 1;
            this.getInputSizeshNQ4ISI = i;
            this.getOutputFormats = i;
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        public final int Camera2StreamConfigurationMap() {
            return this.getHighResolutionOutputSizeshNQ4ISI + (this.getInputSizeshNQ4ISI - this.getOutputFormats);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            try {
                byteString.getHighSpeedVideoSizes(this);
                if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < 10) {
                    Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(10));
                }
                getInputSizeshNQ4ISI(byteString.size());
                getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoSizes(int i) {
            if (i >= 0) {
                getInputSizeshNQ4ISI(i);
            } else {
                getHighSpeedVideoFpsRanges(i);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoSizesFor(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag32(i));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag64(j));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(int i, int i2) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, i2));
        }

        private void getOutputStallDuration(int i) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i2 = this.getOutputFormats;
            bArr[i2] = (byte) (i >>> 7);
            this.getOutputFormats = i2 - 2;
            bArr[i2 - 1] = (byte) ((i & 127) | 128);
        }

        private void getOutputSizes(int i) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i2 = this.getOutputFormats;
            bArr[i2] = (byte) (i >>> 14);
            bArr[i2 - 1] = (byte) (((i >>> 7) & 127) | 128);
            this.getOutputFormats = i2 - 3;
            bArr[i2 - 2] = (byte) ((i & 127) | 128);
        }

        private void getOutputSizeshNQ4ISI(int i) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i2 = this.getOutputFormats;
            bArr[i2] = (byte) (i >>> 21);
            bArr[i2 - 1] = (byte) (((i >>> 14) & 127) | 128);
            bArr[i2 - 2] = (byte) (((i >>> 7) & 127) | 128);
            this.getOutputFormats = i2 - 4;
            bArr[i2 - 3] = (byte) ((i & 127) | 128);
        }

        private void getOutputFormats(int i) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i2 = this.getOutputFormats;
            bArr[i2] = (byte) (i >>> 28);
            bArr[i2 - 1] = (byte) (((i >>> 21) & 127) | 128);
            bArr[i2 - 2] = (byte) (((i >>> 14) & 127) | 128);
            bArr[i2 - 3] = (byte) (((i >>> 7) & 127) | 128);
            this.getOutputFormats = i2 - 5;
            bArr[i2 - 4] = (byte) ((i & 127) | 128);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(long j) {
            switch (androidx.content.preferences.protobuf.BinaryWriter.getHighSpeedVideoFpsRangesFor(j)) {
                case 1:
                    byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
                    int i = this.getOutputFormats;
                    this.getOutputFormats = i - 1;
                    bArr[i] = (byte) j;
                    break;
                case 2:
                    getOutputSizes(j);
                    break;
                case 3:
                    getOutputStallDuration(j);
                    break;
                case 4:
                    getInputSizeshNQ4ISI(j);
                    break;
                case 5:
                    getOutputFormats(j);
                    break;
                case 6:
                    getOutputMinFrameDuration(j);
                    break;
                case 7:
                    getHighSpeedVideoSizesFor(j);
                    break;
                case 8:
                    getHighSpeedVideoSizes(j);
                    break;
                case 9:
                    getInputFormats(j);
                    break;
                case 10:
                    getOutputSizeshNQ4ISI(j);
                    break;
            }
        }

        private void getOutputSizes(long j) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            bArr[i] = (byte) (j >>> 7);
            this.getOutputFormats = i - 2;
            bArr[i - 1] = (byte) ((((int) j) & 127) | 128);
        }

        private void getOutputStallDuration(long j) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            bArr[i] = (byte) (((int) j) >>> 14);
            bArr[i - 1] = (byte) (((j >>> 7) & 127) | 128);
            this.getOutputFormats = i - 3;
            bArr[i - 2] = (byte) ((j & 127) | 128);
        }

        private void getInputSizeshNQ4ISI(long j) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            bArr[i] = (byte) (j >>> 21);
            bArr[i - 1] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 7) & 127) | 128);
            this.getOutputFormats = i - 4;
            bArr[i - 3] = (byte) ((j & 127) | 128);
        }

        private void getOutputFormats(long j) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            bArr[i] = (byte) (j >>> 28);
            bArr[i - 1] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 7) & 127) | 128);
            this.getOutputFormats = i - 5;
            bArr[i - 4] = (byte) ((j & 127) | 128);
        }

        private void getOutputMinFrameDuration(long j) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            bArr[i] = (byte) (j >>> 35);
            bArr[i - 1] = (byte) (((j >>> 28) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 4] = (byte) (((j >>> 7) & 127) | 128);
            this.getOutputFormats = i - 6;
            bArr[i - 5] = (byte) ((j & 127) | 128);
        }

        private void getHighSpeedVideoSizesFor(long j) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            bArr[i] = (byte) (j >>> 42);
            bArr[i - 1] = (byte) (((j >>> 35) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 28) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 4] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 5] = (byte) (((j >>> 7) & 127) | 128);
            this.getOutputFormats = i - 7;
            bArr[i - 6] = (byte) ((j & 127) | 128);
        }

        private void getHighSpeedVideoSizes(long j) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            bArr[i] = (byte) (j >>> 49);
            bArr[i - 1] = (byte) (((j >>> 42) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 35) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 28) & 127) | 128);
            bArr[i - 4] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 5] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 6] = (byte) (((j >>> 7) & 127) | 128);
            this.getOutputFormats = i - 8;
            bArr[i - 7] = (byte) ((j & 127) | 128);
        }

        private void getInputFormats(long j) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            bArr[i] = (byte) (j >>> 56);
            bArr[i - 1] = (byte) (((j >>> 49) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 42) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 35) & 127) | 128);
            bArr[i - 4] = (byte) (((j >>> 28) & 127) | 128);
            bArr[i - 5] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 6] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 7] = (byte) (((j >>> 7) & 127) | 128);
            this.getOutputFormats = i - 9;
            bArr[i - 8] = (byte) ((j & 127) | 128);
        }

        private void getOutputSizeshNQ4ISI(long j) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            bArr[i] = (byte) (j >>> 63);
            bArr[i - 1] = (byte) (((j >>> 56) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 49) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 42) & 127) | 128);
            bArr[i - 4] = (byte) (((j >>> 35) & 127) | 128);
            bArr[i - 5] = (byte) (((j >>> 28) & 127) | 128);
            bArr[i - 6] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 7] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 8] = (byte) (((j >>> 7) & 127) | 128);
            this.getOutputFormats = i - 10;
            bArr[i - 9] = (byte) ((j & 127) | 128);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void Camera2StreamConfigurationMap(int i) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i2 = this.getOutputFormats;
            bArr[i2] = (byte) ((i >> 24) & 255);
            bArr[i2 - 1] = (byte) ((i >> 16) & 255);
            bArr[i2 - 2] = (byte) ((i >> 8) & 255);
            this.getOutputFormats = i2 - 4;
            bArr[i2 - 3] = (byte) (i & 255);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void Camera2StreamConfigurationMap(long j) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            bArr[i] = (byte) (((int) (j >> 56)) & 255);
            bArr[i - 1] = (byte) (((int) (j >> 48)) & 255);
            bArr[i - 2] = (byte) (((int) (j >> 40)) & 255);
            bArr[i - 3] = (byte) (((int) (j >> 32)) & 255);
            bArr[i - 4] = (byte) (((int) (j >> 24)) & 255);
            bArr[i - 5] = (byte) (((int) (j >> 16)) & 255);
            bArr[i - 6] = (byte) (((int) (j >> 8)) & 255);
            this.getOutputFormats = i - 8;
            bArr[i - 7] = (byte) (((int) j) & 255);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            int length = str.length();
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < length) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(length));
            }
            int length2 = str.length() - 1;
            this.getOutputFormats -= length2;
            while (length2 >= 0 && (charAt = str.charAt(length2)) < 128) {
                this.getHighSpeedVideoFpsRangesFor[this.getOutputFormats + length2] = (byte) charAt;
                length2--;
            }
            if (length2 == -1) {
                this.getOutputFormats--;
                return;
            }
            this.getOutputFormats += length2;
            while (length2 >= 0) {
                char charAt2 = str.charAt(length2);
                if (charAt2 < 128 && (i3 = this.getOutputFormats) > this.getHighSpeedVideoSizesFor) {
                    byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
                    this.getOutputFormats = i3 - 1;
                    bArr[i3] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i2 = this.getOutputFormats) > this.getOutputMinFrameDuration) {
                    byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
                    bArr2[i2] = (byte) ((charAt2 & '?') | 128);
                    this.getOutputFormats = i2 - 2;
                    bArr2[i2 - 1] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.getOutputFormats) > this.getOutputMinFrameDuration + 1) {
                    byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
                    bArr3[i] = (byte) ((charAt2 & '?') | 128);
                    bArr3[i - 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.getOutputFormats = i - 3;
                    bArr3[i - 2] = (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
                } else {
                    int i4 = this.getOutputFormats;
                    if (i4 > this.getOutputMinFrameDuration + 2) {
                        if (length2 != 0) {
                            char charAt3 = str.charAt(length2 - 1);
                            if (java.lang.Character.isSurrogatePair(charAt3, charAt2)) {
                                length2--;
                                int codePoint = java.lang.Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
                                int i5 = this.getOutputFormats;
                                bArr4[i5] = (byte) ((codePoint & 63) | 128);
                                bArr4[i5 - 1] = (byte) (((codePoint >>> 6) & 63) | 128);
                                bArr4[i5 - 2] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.getOutputFormats = i5 - 4;
                                bArr4[i5 - 3] = (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                            }
                        }
                        throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(length2 - 1, length2);
                    }
                    if (i4 - this.getHighSpeedVideoSizesFor < length2) {
                        Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(length2));
                    }
                    length2++;
                }
                length2--;
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte b) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getOutputFormats;
            this.getOutputFormats = i - 1;
            bArr[i] = b;
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < remaining) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(remaining));
            }
            int i = this.getOutputFormats - remaining;
            this.getOutputFormats = i;
            byteBuffer.get(this.getHighSpeedVideoFpsRangesFor, i + 1, remaining);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < remaining) {
                this.getHighResolutionOutputSizeshNQ4ISI += remaining;
                this.Camera2StreamConfigurationMap.addFirst(androidx.content.preferences.protobuf.AllocatedBuffer.getHighSpeedVideoFpsRanges(byteBuffer));
                Camera2StreamConfigurationMap(getHighSpeedVideoSizes());
            }
            int i = this.getOutputFormats - remaining;
            this.getOutputFormats = i;
            byteBuffer.get(this.getHighSpeedVideoFpsRangesFor, i + 1, remaining);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(int i) {
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < i) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(i));
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < i2) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(i2));
            }
            int i3 = this.getOutputFormats - i2;
            this.getOutputFormats = i3;
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRangesFor, i3 + 1, i2);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, boolean z) throws java.io.IOException {
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < 6) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(6));
            }
            write(z ? (byte) 1 : (byte) 0);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getOutputMinFrameDuration(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRangesFor(int i, int i2) throws java.io.IOException {
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < 9) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(9));
            }
            Camera2StreamConfigurationMap(i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 5));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, long j) throws java.io.IOException {
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < 13) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(13));
            }
            Camera2StreamConfigurationMap(j);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 1));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoSizes(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            schema.getHighResolutionOutputSizeshNQ4ISI(obj, this);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 3));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, int i2) throws java.io.IOException {
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < 15) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(15));
            }
            if (i2 >= 0) {
                getInputSizeshNQ4ISI(i2);
            } else {
                getHighSpeedVideoFpsRanges(i2);
            }
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) {
            int i3 = this.getOutputFormats;
            if (i3 - this.getHighSpeedVideoSizesFor < i2) {
                this.getHighResolutionOutputSizeshNQ4ISI += i2;
                this.Camera2StreamConfigurationMap.addFirst(androidx.content.preferences.protobuf.AllocatedBuffer.getHighSpeedVideoSizes(bArr, i, i2));
                Camera2StreamConfigurationMap(getHighSpeedVideoSizes());
            } else {
                int i4 = i3 - i2;
                this.getOutputFormats = i4;
                java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRangesFor, i4 + 1, i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj) throws java.io.IOException {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + (this.getInputSizeshNQ4ISI - this.getOutputFormats);
            androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(obj.getClass()).getHighResolutionOutputSizeshNQ4ISI(obj, this);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = this.getInputSizeshNQ4ISI;
            int i5 = this.getOutputFormats;
            int i6 = i3 + (i4 - i5);
            if (i5 - this.getHighSpeedVideoSizesFor < 10) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(10));
            }
            getInputSizeshNQ4ISI(i6 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + (this.getInputSizeshNQ4ISI - this.getOutputFormats);
            schema.getHighResolutionOutputSizeshNQ4ISI(obj, this);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = this.getInputSizeshNQ4ISI;
            int i5 = this.getOutputFormats;
            int i6 = i3 + (i4 - i5);
            if (i5 - this.getHighSpeedVideoSizesFor < 10) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(10));
            }
            getInputSizeshNQ4ISI(i6 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getOutputMinFrameDuration(int i, int i2) throws java.io.IOException {
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < 10) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(10));
            }
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag32(i2));
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.String str) throws java.io.IOException {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + (this.getInputSizeshNQ4ISI - this.getOutputFormats);
            getHighResolutionOutputSizeshNQ4ISI(str);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = this.getInputSizeshNQ4ISI;
            int i5 = this.getOutputFormats;
            int i6 = i3 + (i4 - i5);
            if (i5 - this.getHighSpeedVideoSizesFor < 10) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(10));
            }
            getInputSizeshNQ4ISI(i6 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRangesFor(int i, long j) throws java.io.IOException {
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < 15) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(15));
            }
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag64(j));
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getOutputFormats(int i, int i2) throws java.io.IOException {
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < 10) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(10));
            }
            getInputSizeshNQ4ISI(i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoSizes(int i, long j) throws java.io.IOException {
            if (this.getOutputFormats - this.getHighSpeedVideoSizesFor < 15) {
                Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(15));
            }
            getHighSpeedVideoFpsRanges(j);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getInputFormats(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 3));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getInputSizeshNQ4ISI(int i) {
            if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
                int i2 = this.getOutputFormats;
                this.getOutputFormats = i2 - 1;
                bArr[i2] = (byte) i;
                return;
            }
            if ((i & (-16384)) == 0) {
                getOutputStallDuration(i);
                return;
            }
            if (((-2097152) & i) == 0) {
                getOutputSizes(i);
            } else if (((-268435456) & i) == 0) {
                getOutputSizeshNQ4ISI(i);
            } else {
                getOutputFormats(i);
            }
        }
    }

    static final class UnsafeHeapWriter extends androidx.content.preferences.protobuf.BinaryWriter {
        private androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoFpsRanges;
        private long getHighSpeedVideoFpsRangesFor;
        private byte[] getHighSpeedVideoSizes;
        private long getHighSpeedVideoSizesFor;
        private long getInputSizeshNQ4ISI;
        private long getOutputFormats;
        private long getOutputMinFrameDuration;

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRangesFor() {
            if (this.getHighSpeedVideoFpsRanges != null) {
                this.getHighResolutionOutputSizeshNQ4ISI += (int) (this.getHighSpeedVideoSizesFor - this.getOutputMinFrameDuration);
                androidx.content.preferences.protobuf.AllocatedBuffer allocatedBuffer = this.getHighSpeedVideoFpsRanges;
                allocatedBuffer.getHighSpeedVideoSizes((((int) this.getOutputMinFrameDuration) - allocatedBuffer.getHighSpeedVideoSizes()) + 1);
                this.getHighSpeedVideoFpsRanges = null;
                this.getOutputMinFrameDuration = 0L;
                this.getHighSpeedVideoSizesFor = 0L;
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.getHighSpeedVideoFpsRangesFor()) {
                throw new java.lang.RuntimeException("Allocator returned non-heap buffer");
            }
            getHighSpeedVideoFpsRangesFor();
            this.Camera2StreamConfigurationMap.addFirst(allocatedBuffer);
            this.getHighSpeedVideoFpsRanges = allocatedBuffer;
            this.getHighSpeedVideoSizes = allocatedBuffer.getHighResolutionOutputSizeshNQ4ISI();
            long highSpeedVideoSizes = allocatedBuffer.getHighSpeedVideoSizes();
            this.getHighSpeedVideoFpsRangesFor = allocatedBuffer.getHighSpeedVideoFpsRanges() + highSpeedVideoSizes;
            long outputFormats = highSpeedVideoSizes + allocatedBuffer.getOutputFormats();
            this.getInputSizeshNQ4ISI = outputFormats;
            this.getOutputFormats = outputFormats - 1;
            long j = this.getHighSpeedVideoFpsRangesFor - 1;
            this.getHighSpeedVideoSizesFor = j;
            this.getOutputMinFrameDuration = j;
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        public final int Camera2StreamConfigurationMap() {
            return this.getHighResolutionOutputSizeshNQ4ISI + ((int) (this.getHighSpeedVideoSizesFor - this.getOutputMinFrameDuration));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, androidx.content.preferences.protobuf.ByteString byteString) {
            try {
                byteString.getHighSpeedVideoSizes(this);
                if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < 10) {
                    getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(10));
                }
                getInputSizeshNQ4ISI(byteString.size());
                getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoSizes(int i) {
            if (i >= 0) {
                getInputSizeshNQ4ISI(i);
            } else {
                getHighSpeedVideoFpsRanges(i);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoSizesFor(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag32(i));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag64(j));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(int i, int i2) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, i2));
        }

        private void getOutputSizeshNQ4ISI(int i) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j, (byte) (i >>> 7));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j2, (byte) ((i & 127) | 128));
        }

        private void getOutputStallDuration(int i) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j, (byte) (i >>> 14));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j2, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j3, (byte) ((i & 127) | 128));
        }

        private void getOutputStallDurationlomOqCM(int i) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j, (byte) (i >>> 21));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j2, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j3, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j4, (byte) ((i & 127) | 128));
        }

        private void getOutputFormats(int i) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j, (byte) (i >>> 28));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j2, (byte) (((i >>> 21) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j3, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j4, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr5 = this.getHighSpeedVideoSizes;
            long j5 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr5, j5, (byte) ((i & 127) | 128));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(long j) {
            switch (androidx.content.preferences.protobuf.BinaryWriter.getHighSpeedVideoFpsRangesFor(j)) {
                case 1:
                    byte[] bArr = this.getHighSpeedVideoSizes;
                    long j2 = this.getOutputMinFrameDuration;
                    this.getOutputMinFrameDuration = j2 - 1;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) j);
                    break;
                case 2:
                    getOutputMinFrameDurationlomOqCM(j);
                    break;
                case 3:
                    getOutputStallDurationlomOqCM(j);
                    break;
                case 4:
                    getOutputMinFrameDuration(j);
                    break;
                case 5:
                    getInputFormats(j);
                    break;
                case 6:
                    getInputSizeshNQ4ISI(j);
                    break;
                case 7:
                    getOutputFormats(j);
                    break;
                case 8:
                    getHighSpeedVideoSizes(j);
                    break;
                case 9:
                    getHighSpeedVideoSizesFor(j);
                    break;
                case 10:
                    getOutputSizeshNQ4ISI(j);
                    break;
            }
        }

        private void getOutputMinFrameDurationlomOqCM(long j) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) (j >>> 7));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j3, (byte) ((((int) j) & 127) | 128));
        }

        private void getOutputStallDurationlomOqCM(long j) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) (((int) j) >>> 14));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j3, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j4, (byte) ((j & 127) | 128));
        }

        private void getOutputMinFrameDuration(long j) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) (j >>> 21));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j3, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j4, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j5 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j5, (byte) ((j & 127) | 128));
        }

        private void getInputFormats(long j) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) (j >>> 28));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j3, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j4, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j5 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j5, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr5 = this.getHighSpeedVideoSizes;
            long j6 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr5, j6, (byte) ((j & 127) | 128));
        }

        private void getInputSizeshNQ4ISI(long j) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) (j >>> 35));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j3, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j4, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j5 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j5, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr5 = this.getHighSpeedVideoSizes;
            long j6 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr5, j6, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr6 = this.getHighSpeedVideoSizes;
            long j7 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr6, j7, (byte) ((j & 127) | 128));
        }

        private void getOutputFormats(long j) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) (j >>> 42));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j3, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j4, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j5 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j5, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr5 = this.getHighSpeedVideoSizes;
            long j6 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr5, j6, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr6 = this.getHighSpeedVideoSizes;
            long j7 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr6, j7, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr7 = this.getHighSpeedVideoSizes;
            long j8 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j8 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr7, j8, (byte) ((j & 127) | 128));
        }

        private void getHighSpeedVideoSizes(long j) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) (j >>> 49));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j3, (byte) (((j >>> 42) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j4, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j5 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j5, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr5 = this.getHighSpeedVideoSizes;
            long j6 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr5, j6, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr6 = this.getHighSpeedVideoSizes;
            long j7 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr6, j7, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr7 = this.getHighSpeedVideoSizes;
            long j8 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j8 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr7, j8, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr8 = this.getHighSpeedVideoSizes;
            long j9 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j9 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr8, j9, (byte) ((j & 127) | 128));
        }

        private void getHighSpeedVideoSizesFor(long j) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) (j >>> 56));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j3, (byte) (((j >>> 49) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j4, (byte) (((j >>> 42) & 127) | 128));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j5 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j5, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr5 = this.getHighSpeedVideoSizes;
            long j6 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr5, j6, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr6 = this.getHighSpeedVideoSizes;
            long j7 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr6, j7, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr7 = this.getHighSpeedVideoSizes;
            long j8 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j8 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr7, j8, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr8 = this.getHighSpeedVideoSizes;
            long j9 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j9 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr8, j9, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr9 = this.getHighSpeedVideoSizes;
            long j10 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j10 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr9, j10, (byte) ((j & 127) | 128));
        }

        private void getOutputSizeshNQ4ISI(long j) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) (j >>> 63));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j3, (byte) (((j >>> 56) & 127) | 128));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j4, (byte) (((j >>> 49) & 127) | 128));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j5 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j5, (byte) (((j >>> 42) & 127) | 128));
            byte[] bArr5 = this.getHighSpeedVideoSizes;
            long j6 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr5, j6, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr6 = this.getHighSpeedVideoSizes;
            long j7 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr6, j7, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr7 = this.getHighSpeedVideoSizes;
            long j8 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j8 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr7, j8, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr8 = this.getHighSpeedVideoSizes;
            long j9 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j9 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr8, j9, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr9 = this.getHighSpeedVideoSizes;
            long j10 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j10 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr9, j10, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr10 = this.getHighSpeedVideoSizes;
            long j11 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j11 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr10, j11, (byte) ((j & 127) | 128));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void Camera2StreamConfigurationMap(int i) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j, (byte) ((i >> 24) & 255));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j2, (byte) ((i >> 16) & 255));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j3, (byte) ((i >> 8) & 255));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j4, (byte) (i & 255));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void Camera2StreamConfigurationMap(long j) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) (((int) (j >> 56)) & 255));
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            long j3 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j3, (byte) (((int) (j >> 48)) & 255));
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            long j4 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j4, (byte) (((int) (j >> 40)) & 255));
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            long j5 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j5, (byte) (((int) (j >> 32)) & 255));
            byte[] bArr5 = this.getHighSpeedVideoSizes;
            long j6 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr5, j6, (byte) (((int) (j >> 24)) & 255));
            byte[] bArr6 = this.getHighSpeedVideoSizes;
            long j7 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr6, j7, (byte) (((int) (j >> 16)) & 255));
            byte[] bArr7 = this.getHighSpeedVideoSizes;
            long j8 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j8 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr7, j8, (byte) (((int) (j >> 8)) & 255));
            byte[] bArr8 = this.getHighSpeedVideoSizes;
            long j9 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j9 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr8, j9, (byte) (((int) j) & 255));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            char charAt;
            int length = str.length();
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < length) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(length));
            }
            int length2 = str.length();
            while (true) {
                length2--;
                if (length2 < 0 || (charAt = str.charAt(length2)) >= 128) {
                    break;
                }
                byte[] bArr = this.getHighSpeedVideoSizes;
                long j = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = j - 1;
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j, (byte) charAt);
            }
            if (length2 != -1) {
                while (length2 >= 0) {
                    char charAt2 = str.charAt(length2);
                    if (charAt2 < 128) {
                        long j2 = this.getOutputMinFrameDuration;
                        if (j2 > this.getOutputFormats) {
                            byte[] bArr2 = this.getHighSpeedVideoSizes;
                            this.getOutputMinFrameDuration = j2 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, j2, (byte) charAt2);
                            length2--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.getOutputMinFrameDuration;
                        if (j3 > this.getInputSizeshNQ4ISI) {
                            byte[] bArr3 = this.getHighSpeedVideoSizes;
                            this.getOutputMinFrameDuration = j3 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr3, j3, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr4 = this.getHighSpeedVideoSizes;
                            long j4 = this.getOutputMinFrameDuration;
                            this.getOutputMinFrameDuration = j4 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr4, j4, (byte) ((charAt2 >>> 6) | 960));
                            length2--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.getOutputMinFrameDuration;
                        if (j5 > this.getInputSizeshNQ4ISI + 1) {
                            byte[] bArr5 = this.getHighSpeedVideoSizes;
                            this.getOutputMinFrameDuration = j5 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr5, j5, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr6 = this.getHighSpeedVideoSizes;
                            long j6 = this.getOutputMinFrameDuration;
                            this.getOutputMinFrameDuration = j6 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr6, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            byte[] bArr7 = this.getHighSpeedVideoSizes;
                            long j7 = this.getOutputMinFrameDuration;
                            this.getOutputMinFrameDuration = j7 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr7, j7, (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
                            length2--;
                        }
                    }
                    long j8 = this.getOutputMinFrameDuration;
                    if (j8 > this.getInputSizeshNQ4ISI + 2) {
                        if (length2 != 0) {
                            char charAt3 = str.charAt(length2 - 1);
                            if (java.lang.Character.isSurrogatePair(charAt3, charAt2)) {
                                length2--;
                                int codePoint = java.lang.Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr8 = this.getHighSpeedVideoSizes;
                                long j9 = this.getOutputMinFrameDuration;
                                this.getOutputMinFrameDuration = j9 - 1;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr8, j9, (byte) ((codePoint & 63) | 128));
                                byte[] bArr9 = this.getHighSpeedVideoSizes;
                                long j10 = this.getOutputMinFrameDuration;
                                this.getOutputMinFrameDuration = j10 - 1;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr9, j10, (byte) (((codePoint >>> 6) & 63) | 128));
                                byte[] bArr10 = this.getHighSpeedVideoSizes;
                                long j11 = this.getOutputMinFrameDuration;
                                this.getOutputMinFrameDuration = j11 - 1;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr10, j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                byte[] bArr11 = this.getHighSpeedVideoSizes;
                                long j12 = this.getOutputMinFrameDuration;
                                this.getOutputMinFrameDuration = j12 - 1;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr11, j12, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                            }
                        }
                        throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(length2 - 1, length2);
                    }
                    if (((int) (j8 - this.getOutputFormats)) < length2) {
                        getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(length2));
                    }
                    length2++;
                    length2--;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte b) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            long j = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j, b);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("value.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < i2) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(i2));
            }
            long j = this.getOutputMinFrameDuration - i2;
            this.getOutputMinFrameDuration = j;
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, ((int) j) + 1, i2);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("value.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            long j = this.getOutputMinFrameDuration;
            if (((int) (j - this.getOutputFormats)) < i2) {
                this.getHighResolutionOutputSizeshNQ4ISI += i2;
                this.Camera2StreamConfigurationMap.addFirst(androidx.content.preferences.protobuf.AllocatedBuffer.getHighSpeedVideoSizes(bArr, i, i2));
                getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes());
            } else {
                long j2 = j - i2;
                this.getOutputMinFrameDuration = j2;
                java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, ((int) j2) + 1, i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < remaining) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(remaining));
            }
            long j = this.getOutputMinFrameDuration - remaining;
            this.getOutputMinFrameDuration = j;
            byteBuffer.get(this.getHighSpeedVideoSizes, ((int) j) + 1, remaining);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < remaining) {
                this.getHighResolutionOutputSizeshNQ4ISI += remaining;
                this.Camera2StreamConfigurationMap.addFirst(androidx.content.preferences.protobuf.AllocatedBuffer.getHighSpeedVideoFpsRanges(byteBuffer));
                getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes());
            }
            long j = this.getOutputMinFrameDuration - remaining;
            this.getOutputMinFrameDuration = j;
            byteBuffer.get(this.getHighSpeedVideoSizes, ((int) j) + 1, remaining);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(int i) {
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < i) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(i));
            }
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, boolean z) {
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < 6) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(6));
            }
            write(z ? (byte) 1 : (byte) 0);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getOutputMinFrameDuration(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < 9) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(9));
            }
            Camera2StreamConfigurationMap(i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 5));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, long j) {
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < 13) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(13));
            }
            Camera2StreamConfigurationMap(j);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 1));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoSizes(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            schema.getHighResolutionOutputSizeshNQ4ISI(obj, this);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 3));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, int i2) {
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < 15) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(15));
            }
            if (i2 >= 0) {
                getInputSizeshNQ4ISI(i2);
            } else {
                getHighSpeedVideoFpsRanges(i2);
            }
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj) throws java.io.IOException {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + ((int) (this.getHighSpeedVideoSizesFor - this.getOutputMinFrameDuration));
            androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(obj.getClass()).getHighResolutionOutputSizeshNQ4ISI(obj, this);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            long j = this.getHighSpeedVideoSizesFor;
            long j2 = this.getOutputMinFrameDuration;
            int i4 = i3 + ((int) (j - j2));
            if (((int) (j2 - this.getOutputFormats)) < 10) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(10));
            }
            getInputSizeshNQ4ISI(i4 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + ((int) (this.getHighSpeedVideoSizesFor - this.getOutputMinFrameDuration));
            schema.getHighResolutionOutputSizeshNQ4ISI(obj, this);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            long j = this.getHighSpeedVideoSizesFor;
            long j2 = this.getOutputMinFrameDuration;
            int i4 = i3 + ((int) (j - j2));
            if (((int) (j2 - this.getOutputFormats)) < 10) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(10));
            }
            getInputSizeshNQ4ISI(i4 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getOutputMinFrameDuration(int i, int i2) {
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < 10) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(10));
            }
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag32(i2));
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.String str) {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + ((int) (this.getHighSpeedVideoSizesFor - this.getOutputMinFrameDuration));
            getHighResolutionOutputSizeshNQ4ISI(str);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            long j = this.getHighSpeedVideoSizesFor;
            long j2 = this.getOutputMinFrameDuration;
            int i4 = i3 + ((int) (j - j2));
            if (((int) (j2 - this.getOutputFormats)) < 10) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(10));
            }
            getInputSizeshNQ4ISI(i4 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRangesFor(int i, long j) {
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < 15) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(15));
            }
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag64(j));
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getOutputFormats(int i, int i2) {
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < 10) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(10));
            }
            getInputSizeshNQ4ISI(i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoSizes(int i, long j) {
            if (((int) (this.getOutputMinFrameDuration - this.getOutputFormats)) < 15) {
                getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(15));
            }
            getHighSpeedVideoFpsRanges(j);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getInputFormats(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 3));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getInputSizeshNQ4ISI(int i) {
            if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr = this.getHighSpeedVideoSizes;
                long j = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = j - 1;
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j, (byte) i);
                return;
            }
            if ((i & (-16384)) == 0) {
                getOutputSizeshNQ4ISI(i);
                return;
            }
            if (((-2097152) & i) == 0) {
                getOutputStallDuration(i);
            } else if (((-268435456) & i) == 0) {
                getOutputStallDurationlomOqCM(i);
            } else {
                getOutputFormats(i);
            }
        }
    }

    static final class SafeDirectWriter extends androidx.content.preferences.protobuf.BinaryWriter {
        private java.nio.ByteBuffer getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        private void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.Camera2StreamConfigurationMap()) {
                throw new java.lang.RuntimeException("Allocated buffer does not have NIO buffer");
            }
            java.nio.ByteBuffer outputMinFrameDuration = allocatedBuffer.getOutputMinFrameDuration();
            if (!outputMinFrameDuration.isDirect()) {
                throw new java.lang.RuntimeException("Allocator returned non-direct buffer");
            }
            getHighSpeedVideoFpsRangesFor();
            this.Camera2StreamConfigurationMap.addFirst(allocatedBuffer);
            this.getHighSpeedVideoFpsRanges = outputMinFrameDuration;
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(outputMinFrameDuration, outputMinFrameDuration.capacity());
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, 0);
            this.getHighSpeedVideoFpsRanges.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            int limit = this.getHighSpeedVideoFpsRanges.limit() - 1;
            this.getHighSpeedVideoFpsRangesFor = limit;
            this.getHighSpeedVideoSizes = limit;
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        public final int Camera2StreamConfigurationMap() {
            return this.getHighResolutionOutputSizeshNQ4ISI + (this.getHighSpeedVideoFpsRangesFor - this.getHighSpeedVideoSizes);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRangesFor() {
            if (this.getHighSpeedVideoFpsRanges != null) {
                this.getHighResolutionOutputSizeshNQ4ISI += this.getHighSpeedVideoFpsRangesFor - this.getHighSpeedVideoSizes;
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes + 1);
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
            }
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, androidx.content.preferences.protobuf.ByteString byteString) {
            try {
                byteString.getHighSpeedVideoSizes(this);
                if (this.getHighSpeedVideoSizes + 1 < 10) {
                    getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(10));
                }
                getInputSizeshNQ4ISI(byteString.size());
                getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoSizes(int i) {
            if (i >= 0) {
                getInputSizeshNQ4ISI(i);
            } else {
                getHighSpeedVideoFpsRanges(i);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoSizesFor(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag32(i));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag64(j));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(int i, int i2) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, i2));
        }

        private void getOutputSizes(int i) {
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 - 2;
            this.getHighSpeedVideoFpsRanges.putShort(i2 - 1, (short) (((i & 16256) << 1) | (i & 127) | 128));
        }

        private void getOutputStallDuration(int i) {
            int i2 = this.getHighSpeedVideoSizes - 3;
            this.getHighSpeedVideoSizes = i2;
            this.getHighSpeedVideoFpsRanges.putInt(i2, (((i & 16256) | 16384) << 9) | ((2080768 & i) << 10) | (((i & 127) | 128) << 8));
        }

        private void getOutputMinFrameDurationlomOqCM(int i) {
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 - 4;
            this.getHighSpeedVideoFpsRanges.putInt(i2 - 3, (((i & 16256) | 16384) << 1) | ((266338304 & i) << 3) | (((2080768 & i) | 2097152) << 2) | (i & 127) | 128);
        }

        private void getOutputFormats(int i) {
            java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 - 1;
            byteBuffer.put(i2, (byte) (i >>> 28));
            int i3 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i3 - 4;
            this.getHighSpeedVideoFpsRanges.putInt(i3 - 3, ((((i >>> 7) & 127) | 128) << 8) | ((((i >>> 21) & 127) | 128) << 24) | ((((i >>> 14) & 127) | 128) << 16) | (i & 127) | 128);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(long j) {
            switch (androidx.content.preferences.protobuf.BinaryWriter.getHighSpeedVideoFpsRangesFor(j)) {
                case 1:
                    getHighSpeedVideoSizesFor(j);
                    break;
                case 2:
                    getOutputSizes((int) j);
                    break;
                case 3:
                    getOutputStallDuration((int) j);
                    break;
                case 4:
                    getOutputMinFrameDurationlomOqCM((int) j);
                    break;
                case 5:
                    getInputSizeshNQ4ISI(j);
                    break;
                case 6:
                    getOutputSizeshNQ4ISI(j);
                    break;
                case 7:
                    getInputFormats(j);
                    break;
                case 8:
                    getHighSpeedVideoSizes(j);
                    break;
                case 9:
                    getOutputMinFrameDuration(j);
                    break;
                case 10:
                    getOutputMinFrameDurationlomOqCM(j);
                    break;
            }
        }

        private void getInputSizeshNQ4ISI(long j) {
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i - 5;
            this.getHighSpeedVideoFpsRanges.putLong(i - 7, (((j & 16256) | okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) << 25) | ((34091302912L & j) << 28) | (((266338304 & j) | 268435456) << 27) | (((2080768 & j) | 2097152) << 26) | (((127 & j) | 128) << 24));
        }

        private void getOutputSizeshNQ4ISI(long j) {
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i - 6;
            this.getHighSpeedVideoFpsRanges.putLong(i - 7, (((j & 16256) | okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) << 17) | ((4363686772736L & j) << 21) | (((34091302912L & j) | 34359738368L) << 20) | (((266338304 & j) | 268435456) << 19) | (((2080768 & j) | 2097152) << 18) | (((127 & j) | 128) << 16));
        }

        private void getInputFormats(long j) {
            int i = this.getHighSpeedVideoSizes - 7;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRanges.putLong(i, (((j & 16256) | okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) << 9) | ((558551906910208L & j) << 14) | (((4363686772736L & j) | 4398046511104L) << 13) | (((34091302912L & j) | 34359738368L) << 12) | (((266338304 & j) | 268435456) << 11) | (((2080768 & j) | 2097152) << 10) | (((127 & j) | 128) << 8));
        }

        private void getHighSpeedVideoSizes(long j) {
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i - 8;
            this.getHighSpeedVideoFpsRanges.putLong(i - 7, (((j & 16256) | okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) << 1) | ((71494644084506624L & j) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (127 & j) | 128);
        }

        private void getOutputFormats(long j) {
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i - 8;
            this.getHighSpeedVideoFpsRanges.putLong(i - 7, (((j & 16256) | okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) << 1) | (((71494644084506624L & j) | 72057594037927936L) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (127 & j) | 128);
        }

        private void getOutputMinFrameDuration(long j) {
            java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i - 1;
            byteBuffer.put(i, (byte) (j >>> 56));
            getOutputFormats(j & 72057594037927935L);
        }

        private void getOutputMinFrameDurationlomOqCM(long j) {
            java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i - 1;
            byteBuffer.put(i, (byte) (j >>> 63));
            java.nio.ByteBuffer byteBuffer2 = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 - 1;
            byteBuffer2.put(i2, (byte) (((j >>> 56) & 127) | 128));
            getOutputFormats(j & 72057594037927935L);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void Camera2StreamConfigurationMap(int i) {
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 - 4;
            this.getHighSpeedVideoFpsRanges.putInt(i2 - 3, i);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void Camera2StreamConfigurationMap(long j) {
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i - 8;
            this.getHighSpeedVideoFpsRanges.putLong(i - 7, j);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            int length = str.length();
            if (this.getHighSpeedVideoSizes + 1 < length) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(length));
            }
            int length2 = str.length() - 1;
            this.getHighSpeedVideoSizes -= length2;
            while (length2 >= 0 && (charAt = str.charAt(length2)) < 128) {
                this.getHighSpeedVideoFpsRanges.put(this.getHighSpeedVideoSizes + length2, (byte) charAt);
                length2--;
            }
            if (length2 == -1) {
                this.getHighSpeedVideoSizes--;
                return;
            }
            this.getHighSpeedVideoSizes += length2;
            while (length2 >= 0) {
                char charAt2 = str.charAt(length2);
                if (charAt2 < 128 && (i3 = this.getHighSpeedVideoSizes) >= 0) {
                    java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoSizes = i3 - 1;
                    byteBuffer.put(i3, (byte) charAt2);
                } else if (charAt2 < 2048 && (i2 = this.getHighSpeedVideoSizes) > 0) {
                    java.nio.ByteBuffer byteBuffer2 = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoSizes = i2 - 1;
                    byteBuffer2.put(i2, (byte) ((charAt2 & '?') | 128));
                    java.nio.ByteBuffer byteBuffer3 = this.getHighSpeedVideoFpsRanges;
                    int i4 = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = i4 - 1;
                    byteBuffer3.put(i4, (byte) ((charAt2 >>> 6) | 960));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.getHighSpeedVideoSizes) > 1) {
                    java.nio.ByteBuffer byteBuffer4 = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoSizes = i - 1;
                    byteBuffer4.put(i, (byte) ((charAt2 & '?') | 128));
                    java.nio.ByteBuffer byteBuffer5 = this.getHighSpeedVideoFpsRanges;
                    int i5 = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = i5 - 1;
                    byteBuffer5.put(i5, (byte) (((charAt2 >>> 6) & 63) | 128));
                    java.nio.ByteBuffer byteBuffer6 = this.getHighSpeedVideoFpsRanges;
                    int i6 = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = i6 - 1;
                    byteBuffer6.put(i6, (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
                } else {
                    int i7 = this.getHighSpeedVideoSizes;
                    if (i7 > 2) {
                        if (length2 != 0) {
                            char charAt3 = str.charAt(length2 - 1);
                            if (java.lang.Character.isSurrogatePair(charAt3, charAt2)) {
                                length2--;
                                int codePoint = java.lang.Character.toCodePoint(charAt3, charAt2);
                                java.nio.ByteBuffer byteBuffer7 = this.getHighSpeedVideoFpsRanges;
                                int i8 = this.getHighSpeedVideoSizes;
                                this.getHighSpeedVideoSizes = i8 - 1;
                                byteBuffer7.put(i8, (byte) ((codePoint & 63) | 128));
                                java.nio.ByteBuffer byteBuffer8 = this.getHighSpeedVideoFpsRanges;
                                int i9 = this.getHighSpeedVideoSizes;
                                this.getHighSpeedVideoSizes = i9 - 1;
                                byteBuffer8.put(i9, (byte) (((codePoint >>> 6) & 63) | 128));
                                java.nio.ByteBuffer byteBuffer9 = this.getHighSpeedVideoFpsRanges;
                                int i10 = this.getHighSpeedVideoSizes;
                                this.getHighSpeedVideoSizes = i10 - 1;
                                byteBuffer9.put(i10, (byte) (((codePoint >>> 12) & 63) | 128));
                                java.nio.ByteBuffer byteBuffer10 = this.getHighSpeedVideoFpsRanges;
                                int i11 = this.getHighSpeedVideoSizes;
                                this.getHighSpeedVideoSizes = i11 - 1;
                                byteBuffer10.put(i11, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                            }
                        }
                        throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(length2 - 1, length2);
                    }
                    if (i7 + 1 < length2) {
                        getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(length2));
                    }
                    length2++;
                }
                length2--;
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte b) {
            java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i - 1;
            byteBuffer.put(i, b);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (this.getHighSpeedVideoSizes + 1 < remaining) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(remaining));
            }
            int i = this.getHighSpeedVideoSizes - remaining;
            this.getHighSpeedVideoSizes = i;
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, i + 1);
            this.getHighSpeedVideoFpsRanges.put(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i = this.getHighSpeedVideoSizes;
            if (i + 1 < remaining) {
                this.getHighResolutionOutputSizeshNQ4ISI += remaining;
                this.Camera2StreamConfigurationMap.addFirst(androidx.content.preferences.protobuf.AllocatedBuffer.getHighSpeedVideoFpsRanges(byteBuffer));
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges());
            } else {
                int i2 = i - remaining;
                this.getHighSpeedVideoSizes = i2;
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, i2 + 1);
                this.getHighSpeedVideoFpsRanges.put(byteBuffer);
            }
        }

        private void getHighSpeedVideoSizesFor(long j) {
            java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i - 1;
            byteBuffer.put(i, (byte) j);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(int i) {
            if (this.getHighSpeedVideoSizes + 1 < i) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(i));
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            if (this.getHighSpeedVideoSizes + 1 < i2) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(i2));
            }
            int i3 = this.getHighSpeedVideoSizes - i2;
            this.getHighSpeedVideoSizes = i3;
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, i3 + 1);
            this.getHighSpeedVideoFpsRanges.put(bArr, i, i2);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, boolean z) {
            if (this.getHighSpeedVideoSizes + 1 < 6) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(6));
            }
            write(z ? (byte) 1 : (byte) 0);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        @java.lang.Deprecated
        public final void getOutputMinFrameDuration(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            if (this.getHighSpeedVideoSizes + 1 < 9) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(9));
            }
            int i3 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i3 - 4;
            this.getHighSpeedVideoFpsRanges.putInt(i3 - 3, i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 5));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, long j) {
            if (this.getHighSpeedVideoSizes + 1 < 13) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(13));
            }
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 - 8;
            this.getHighSpeedVideoFpsRanges.putLong(i2 - 7, j);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 1));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoSizes(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            schema.getHighResolutionOutputSizeshNQ4ISI(obj, this);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 3));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, int i2) {
            if (this.getHighSpeedVideoSizes + 1 < 15) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(15));
            }
            if (i2 >= 0) {
                getInputSizeshNQ4ISI(i2);
            } else {
                getHighSpeedVideoFpsRanges(i2);
            }
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) {
            int i3 = this.getHighSpeedVideoSizes;
            if (i3 + 1 < i2) {
                this.getHighResolutionOutputSizeshNQ4ISI += i2;
                this.Camera2StreamConfigurationMap.addFirst(androidx.content.preferences.protobuf.AllocatedBuffer.getHighSpeedVideoSizes(bArr, i, i2));
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges());
            } else {
                int i4 = i3 - i2;
                this.getHighSpeedVideoSizes = i4;
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, i4 + 1);
                this.getHighSpeedVideoFpsRanges.put(bArr, i, i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj) throws java.io.IOException {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + (this.getHighSpeedVideoFpsRangesFor - this.getHighSpeedVideoSizes);
            androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(obj.getClass()).getHighResolutionOutputSizeshNQ4ISI(obj, this);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            int i5 = this.getHighSpeedVideoSizes;
            int i6 = i3 + (i4 - i5);
            if (i5 + 1 < 10) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(10));
            }
            getInputSizeshNQ4ISI(i6 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + (this.getHighSpeedVideoFpsRangesFor - this.getHighSpeedVideoSizes);
            schema.getHighResolutionOutputSizeshNQ4ISI(obj, this);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            int i5 = this.getHighSpeedVideoSizes;
            int i6 = i3 + (i4 - i5);
            if (i5 + 1 < 10) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(10));
            }
            getInputSizeshNQ4ISI(i6 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getOutputMinFrameDuration(int i, int i2) {
            if (this.getHighSpeedVideoSizes + 1 < 10) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(10));
            }
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag32(i2));
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.String str) {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + (this.getHighSpeedVideoFpsRangesFor - this.getHighSpeedVideoSizes);
            getHighResolutionOutputSizeshNQ4ISI(str);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            int i5 = this.getHighSpeedVideoSizes;
            int i6 = i3 + (i4 - i5);
            if (i5 + 1 < 10) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(10));
            }
            getInputSizeshNQ4ISI(i6 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRangesFor(int i, long j) {
            if (this.getHighSpeedVideoSizes + 1 < 15) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(15));
            }
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag64(j));
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getOutputFormats(int i, int i2) {
            if (this.getHighSpeedVideoSizes + 1 < 10) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(10));
            }
            getInputSizeshNQ4ISI(i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoSizes(int i, long j) {
            if (this.getHighSpeedVideoSizes + 1 < 15) {
                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(15));
            }
            getHighSpeedVideoFpsRanges(j);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        @java.lang.Deprecated
        public final void getInputFormats(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 3));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getInputSizeshNQ4ISI(int i) {
            if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
                int i2 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = i2 - 1;
                byteBuffer.put(i2, (byte) i);
                return;
            }
            if ((i & (-16384)) == 0) {
                getOutputSizes(i);
                return;
            }
            if (((-2097152) & i) == 0) {
                getOutputStallDuration(i);
            } else if (((-268435456) & i) == 0) {
                getOutputMinFrameDurationlomOqCM(i);
            } else {
                getOutputFormats(i);
            }
        }
    }

    static final class UnsafeDirectWriter extends androidx.content.preferences.protobuf.BinaryWriter {
        private long getHighSpeedVideoFpsRanges;
        private java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor;
        private long getHighSpeedVideoSizes;
        private long getOutputFormats;

        private void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.Camera2StreamConfigurationMap()) {
                throw new java.lang.RuntimeException("Allocated buffer does not have NIO buffer");
            }
            java.nio.ByteBuffer outputMinFrameDuration = allocatedBuffer.getOutputMinFrameDuration();
            if (!outputMinFrameDuration.isDirect()) {
                throw new java.lang.RuntimeException("Allocator returned non-direct buffer");
            }
            getHighSpeedVideoFpsRangesFor();
            this.Camera2StreamConfigurationMap.addFirst(allocatedBuffer);
            this.getHighSpeedVideoFpsRangesFor = outputMinFrameDuration;
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(outputMinFrameDuration, outputMinFrameDuration.capacity());
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, 0);
            long highSpeedVideoSizes = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoSizes = highSpeedVideoSizes;
            long limit = highSpeedVideoSizes + (this.getHighSpeedVideoFpsRangesFor.limit() - 1);
            this.getHighSpeedVideoFpsRanges = limit;
            this.getOutputFormats = limit;
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        public final int Camera2StreamConfigurationMap() {
            return this.getHighResolutionOutputSizeshNQ4ISI + ((int) (this.getHighSpeedVideoFpsRanges - this.getOutputFormats));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRangesFor() {
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                this.getHighResolutionOutputSizeshNQ4ISI += (int) (this.getHighSpeedVideoFpsRanges - this.getOutputFormats);
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, ((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1);
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getOutputFormats = 0L;
                this.getHighSpeedVideoFpsRanges = 0L;
            }
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, androidx.content.preferences.protobuf.ByteString byteString) {
            try {
                byteString.getHighSpeedVideoSizes(this);
                if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < 10) {
                    getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(10));
                }
                getInputSizeshNQ4ISI(byteString.size());
                getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoSizes(int i) {
            if (i >= 0) {
                getInputSizeshNQ4ISI(i);
            } else {
                getHighSpeedVideoFpsRanges(i);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoSizesFor(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag32(i));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag64(j));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(int i, int i2) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, i2));
        }

        private void getOutputMinFrameDurationlomOqCM(int i) {
            long j = this.getOutputFormats;
            this.getOutputFormats = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j, (byte) (i >>> 7));
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) ((i & 127) | 128));
        }

        private void getOutputSizeshNQ4ISI(int i) {
            long j = this.getOutputFormats;
            this.getOutputFormats = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j, (byte) (i >>> 14));
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (((i >>> 7) & 127) | 128));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) ((i & 127) | 128));
        }

        private void getOutputStallDuration(int i) {
            long j = this.getOutputFormats;
            this.getOutputFormats = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j, (byte) (i >>> 21));
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (((i >>> 14) & 127) | 128));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((i >>> 7) & 127) | 128));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) ((i & 127) | 128));
        }

        private void getOutputFormats(int i) {
            long j = this.getOutputFormats;
            this.getOutputFormats = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j, (byte) (i >>> 28));
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (((i >>> 21) & 127) | 128));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((i >>> 14) & 127) | 128));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) (((i >>> 7) & 127) | 128));
            long j5 = this.getOutputFormats;
            this.getOutputFormats = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j5, (byte) ((i & 127) | 128));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(long j) {
            switch (androidx.content.preferences.protobuf.BinaryWriter.getHighSpeedVideoFpsRangesFor(j)) {
                case 1:
                    long j2 = this.getOutputFormats;
                    this.getOutputFormats = j2 - 1;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) j);
                    break;
                case 2:
                    getOutputMinFrameDurationlomOqCM(j);
                    break;
                case 3:
                    getOutputStallDuration(j);
                    break;
                case 4:
                    getOutputMinFrameDuration(j);
                    break;
                case 5:
                    getHighSpeedVideoSizesFor(j);
                    break;
                case 6:
                    getInputFormats(j);
                    break;
                case 7:
                    getOutputFormats(j);
                    break;
                case 8:
                    getHighSpeedVideoSizes(j);
                    break;
                case 9:
                    getInputSizeshNQ4ISI(j);
                    break;
                case 10:
                    getOutputSizeshNQ4ISI(j);
                    break;
            }
        }

        private void getOutputMinFrameDurationlomOqCM(long j) {
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (j >>> 7));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) ((((int) j) & 127) | 128));
        }

        private void getOutputStallDuration(long j) {
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (((int) j) >>> 14));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((j >>> 7) & 127) | 128));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) ((j & 127) | 128));
        }

        private void getOutputMinFrameDuration(long j) {
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (j >>> 21));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((j >>> 14) & 127) | 128));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) (((j >>> 7) & 127) | 128));
            long j5 = this.getOutputFormats;
            this.getOutputFormats = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j5, (byte) ((j & 127) | 128));
        }

        private void getHighSpeedVideoSizesFor(long j) {
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (j >>> 28));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((j >>> 21) & 127) | 128));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) (((j >>> 14) & 127) | 128));
            long j5 = this.getOutputFormats;
            this.getOutputFormats = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j5, (byte) (((j >>> 7) & 127) | 128));
            long j6 = this.getOutputFormats;
            this.getOutputFormats = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j6, (byte) ((j & 127) | 128));
        }

        private void getInputFormats(long j) {
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (j >>> 35));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((j >>> 28) & 127) | 128));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) (((j >>> 21) & 127) | 128));
            long j5 = this.getOutputFormats;
            this.getOutputFormats = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j5, (byte) (((j >>> 14) & 127) | 128));
            long j6 = this.getOutputFormats;
            this.getOutputFormats = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j6, (byte) (((j >>> 7) & 127) | 128));
            long j7 = this.getOutputFormats;
            this.getOutputFormats = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j7, (byte) ((j & 127) | 128));
        }

        private void getOutputFormats(long j) {
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (j >>> 42));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((j >>> 35) & 127) | 128));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) (((j >>> 28) & 127) | 128));
            long j5 = this.getOutputFormats;
            this.getOutputFormats = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j5, (byte) (((j >>> 21) & 127) | 128));
            long j6 = this.getOutputFormats;
            this.getOutputFormats = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j6, (byte) (((j >>> 14) & 127) | 128));
            long j7 = this.getOutputFormats;
            this.getOutputFormats = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j7, (byte) (((j >>> 7) & 127) | 128));
            long j8 = this.getOutputFormats;
            this.getOutputFormats = j8 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j8, (byte) ((j & 127) | 128));
        }

        private void getHighSpeedVideoSizes(long j) {
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (j >>> 49));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((j >>> 42) & 127) | 128));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) (((j >>> 35) & 127) | 128));
            long j5 = this.getOutputFormats;
            this.getOutputFormats = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j5, (byte) (((j >>> 28) & 127) | 128));
            long j6 = this.getOutputFormats;
            this.getOutputFormats = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j6, (byte) (((j >>> 21) & 127) | 128));
            long j7 = this.getOutputFormats;
            this.getOutputFormats = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j7, (byte) (((j >>> 14) & 127) | 128));
            long j8 = this.getOutputFormats;
            this.getOutputFormats = j8 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j8, (byte) (((j >>> 7) & 127) | 128));
            long j9 = this.getOutputFormats;
            this.getOutputFormats = j9 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j9, (byte) ((j & 127) | 128));
        }

        private void getInputSizeshNQ4ISI(long j) {
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (j >>> 56));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((j >>> 49) & 127) | 128));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) (((j >>> 42) & 127) | 128));
            long j5 = this.getOutputFormats;
            this.getOutputFormats = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j5, (byte) (((j >>> 35) & 127) | 128));
            long j6 = this.getOutputFormats;
            this.getOutputFormats = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j6, (byte) (((j >>> 28) & 127) | 128));
            long j7 = this.getOutputFormats;
            this.getOutputFormats = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j7, (byte) (((j >>> 21) & 127) | 128));
            long j8 = this.getOutputFormats;
            this.getOutputFormats = j8 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j8, (byte) (((j >>> 14) & 127) | 128));
            long j9 = this.getOutputFormats;
            this.getOutputFormats = j9 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j9, (byte) (((j >>> 7) & 127) | 128));
            long j10 = this.getOutputFormats;
            this.getOutputFormats = j10 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j10, (byte) ((j & 127) | 128));
        }

        private void getOutputSizeshNQ4ISI(long j) {
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (j >>> 63));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((j >>> 56) & 127) | 128));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) (((j >>> 49) & 127) | 128));
            long j5 = this.getOutputFormats;
            this.getOutputFormats = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j5, (byte) (((j >>> 42) & 127) | 128));
            long j6 = this.getOutputFormats;
            this.getOutputFormats = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j6, (byte) (((j >>> 35) & 127) | 128));
            long j7 = this.getOutputFormats;
            this.getOutputFormats = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j7, (byte) (((j >>> 28) & 127) | 128));
            long j8 = this.getOutputFormats;
            this.getOutputFormats = j8 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j8, (byte) (((j >>> 21) & 127) | 128));
            long j9 = this.getOutputFormats;
            this.getOutputFormats = j9 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j9, (byte) (((j >>> 14) & 127) | 128));
            long j10 = this.getOutputFormats;
            this.getOutputFormats = j10 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j10, (byte) (((j >>> 7) & 127) | 128));
            long j11 = this.getOutputFormats;
            this.getOutputFormats = j11 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j11, (byte) ((j & 127) | 128));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void Camera2StreamConfigurationMap(int i) {
            long j = this.getOutputFormats;
            this.getOutputFormats = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j, (byte) ((i >> 24) & 255));
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) ((i >> 16) & 255));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) ((i >> 8) & 255));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) (i & 255));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void Camera2StreamConfigurationMap(long j) {
            long j2 = this.getOutputFormats;
            this.getOutputFormats = j2 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.getOutputFormats;
            this.getOutputFormats = j3 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.getOutputFormats;
            this.getOutputFormats = j4 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.getOutputFormats;
            this.getOutputFormats = j5 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.getOutputFormats;
            this.getOutputFormats = j6 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.getOutputFormats;
            this.getOutputFormats = j7 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.getOutputFormats;
            this.getOutputFormats = j8 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.getOutputFormats;
            this.getOutputFormats = j9 - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j9, (byte) (((int) j) & 255));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            char charAt;
            int length = str.length();
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < length) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(length));
            }
            int length2 = str.length();
            while (true) {
                length2--;
                if (length2 < 0 || (charAt = str.charAt(length2)) >= 128) {
                    break;
                }
                long j = this.getOutputFormats;
                this.getOutputFormats = j - 1;
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j, (byte) charAt);
            }
            if (length2 != -1) {
                while (length2 >= 0) {
                    char charAt2 = str.charAt(length2);
                    if (charAt2 < 128) {
                        long j2 = this.getOutputFormats;
                        if (j2 >= this.getHighSpeedVideoSizes) {
                            this.getOutputFormats = j2 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) charAt2);
                            length2--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.getOutputFormats;
                        if (j3 > this.getHighSpeedVideoSizes) {
                            this.getOutputFormats = j3 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) ((charAt2 & '?') | 128));
                            long j4 = this.getOutputFormats;
                            this.getOutputFormats = j4 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) ((charAt2 >>> 6) | 960));
                            length2--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.getOutputFormats;
                        if (j5 > this.getHighSpeedVideoSizes + 1) {
                            this.getOutputFormats = j5 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j5, (byte) ((charAt2 & '?') | 128));
                            long j6 = this.getOutputFormats;
                            this.getOutputFormats = j6 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j7 = this.getOutputFormats;
                            this.getOutputFormats = j7 - 1;
                            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j7, (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
                            length2--;
                        }
                    }
                    long j8 = this.getOutputFormats;
                    long j9 = this.getHighSpeedVideoSizes;
                    if (j8 > 2 + j9) {
                        if (length2 != 0) {
                            char charAt3 = str.charAt(length2 - 1);
                            if (java.lang.Character.isSurrogatePair(charAt3, charAt2)) {
                                length2--;
                                int codePoint = java.lang.Character.toCodePoint(charAt3, charAt2);
                                long j10 = this.getOutputFormats;
                                this.getOutputFormats = j10 - 1;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j10, (byte) ((codePoint & 63) | 128));
                                long j11 = this.getOutputFormats;
                                this.getOutputFormats = j11 - 1;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j12 = this.getOutputFormats;
                                this.getOutputFormats = j12 - 1;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j13 = this.getOutputFormats;
                                this.getOutputFormats = j13 - 1;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j13, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                            }
                        }
                        throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(length2 - 1, length2);
                    }
                    if (((int) (j8 - j9)) + 1 < length2) {
                        getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(length2));
                    }
                    length2++;
                    length2--;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte b) {
            long j = this.getOutputFormats;
            this.getOutputFormats = j - 1;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j, b);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < remaining) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(remaining));
            }
            long j = this.getOutputFormats - remaining;
            this.getOutputFormats = j;
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, ((int) (j - this.getHighSpeedVideoSizes)) + 1);
            this.getHighSpeedVideoFpsRangesFor.put(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            long j = this.getOutputFormats;
            long j2 = this.getHighSpeedVideoSizes;
            if (((int) (j - j2)) + 1 < remaining) {
                this.getHighResolutionOutputSizeshNQ4ISI += remaining;
                this.Camera2StreamConfigurationMap.addFirst(androidx.content.preferences.protobuf.AllocatedBuffer.getHighSpeedVideoFpsRanges(byteBuffer));
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges());
            } else {
                long j3 = j - remaining;
                this.getOutputFormats = j3;
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, ((int) (j3 - j2)) + 1);
                this.getHighSpeedVideoFpsRangesFor.put(byteBuffer);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getHighSpeedVideoFpsRanges(int i) {
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < i) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(i));
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < i2) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(i2));
            }
            long j = this.getOutputFormats - i2;
            this.getOutputFormats = j;
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, ((int) (j - this.getHighSpeedVideoSizes)) + 1);
            this.getHighSpeedVideoFpsRangesFor.put(bArr, i, i2);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, boolean z) {
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < 6) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(6));
            }
            write(z ? (byte) 1 : (byte) 0);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        @java.lang.Deprecated
        public final void getOutputMinFrameDuration(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < 9) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(9));
            }
            Camera2StreamConfigurationMap(i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 5));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, long j) {
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < 13) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(13));
            }
            Camera2StreamConfigurationMap(j);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 1));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoSizes(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            schema.getHighResolutionOutputSizeshNQ4ISI(obj, this);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 3));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void Camera2StreamConfigurationMap(int i, int i2) {
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < 15) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(15));
            }
            if (i2 >= 0) {
                getInputSizeshNQ4ISI(i2);
            } else {
                getHighSpeedVideoFpsRanges(i2);
            }
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj) throws java.io.IOException {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + ((int) (this.getHighSpeedVideoFpsRanges - this.getOutputFormats));
            androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(obj.getClass()).getHighResolutionOutputSizeshNQ4ISI(obj, this);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            long j = this.getHighSpeedVideoFpsRanges;
            long j2 = this.getOutputFormats;
            int i4 = i3 + ((int) (j - j2));
            if (((int) (j2 - this.getHighSpeedVideoSizes)) + 1 < 10) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(10));
            }
            getInputSizeshNQ4ISI(i4 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + ((int) (this.getHighSpeedVideoFpsRanges - this.getOutputFormats));
            schema.getHighResolutionOutputSizeshNQ4ISI(obj, this);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            long j = this.getHighSpeedVideoFpsRanges;
            long j2 = this.getOutputFormats;
            int i4 = i3 + ((int) (j - j2));
            if (((int) (j2 - this.getHighSpeedVideoSizes)) + 1 < 10) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(10));
            }
            getInputSizeshNQ4ISI(i4 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) {
            long j = this.getOutputFormats;
            long j2 = this.getHighSpeedVideoSizes;
            if (((int) (j - j2)) + 1 < i2) {
                this.getHighResolutionOutputSizeshNQ4ISI += i2;
                this.Camera2StreamConfigurationMap.addFirst(androidx.content.preferences.protobuf.AllocatedBuffer.getHighSpeedVideoSizes(bArr, i, i2));
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges());
            } else {
                long j3 = j - i2;
                this.getOutputFormats = j3;
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, ((int) (j3 - j2)) + 1);
                this.getHighSpeedVideoFpsRangesFor.put(bArr, i, i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRanges(int i, java.lang.String str) {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI + ((int) (this.getHighSpeedVideoFpsRanges - this.getOutputFormats));
            getHighResolutionOutputSizeshNQ4ISI(str);
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            long j = this.getHighSpeedVideoFpsRanges;
            long j2 = this.getOutputFormats;
            int i4 = i3 + ((int) (j - j2));
            if (((int) (j2 - this.getHighSpeedVideoSizes)) + 1 < 10) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(10));
            }
            getInputSizeshNQ4ISI(i4 - i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getOutputMinFrameDuration(int i, int i2) {
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < 10) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(10));
            }
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag32(i2));
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoFpsRangesFor(int i, long j) {
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < 15) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(15));
            }
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.CodedOutputStream.encodeZigZag64(j));
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getOutputFormats(int i, int i2) {
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < 10) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(10));
            }
            getInputSizeshNQ4ISI(i2);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public final void getHighSpeedVideoSizes(int i, long j) {
            if (((int) (this.getOutputFormats - this.getHighSpeedVideoSizes)) + 1 < 15) {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(15));
            }
            getHighSpeedVideoFpsRanges(j);
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        @java.lang.Deprecated
        public final void getInputFormats(int i) {
            getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 3));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        final void getInputSizeshNQ4ISI(int i) {
            if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                long j = this.getOutputFormats;
                this.getOutputFormats = j - 1;
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j, (byte) i);
            } else {
                if ((i & (-16384)) == 0) {
                    getOutputMinFrameDurationlomOqCM(i);
                    return;
                }
                if (((-2097152) & i) == 0) {
                    getOutputSizeshNQ4ISI(i);
                } else if (((-268435456) & i) == 0) {
                    getOutputStallDuration(i);
                } else {
                    getOutputFormats(i);
                }
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getHighSpeedVideoFpsRanges(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
            getHighSpeedVideoFpsRangesFor(i, (androidx.content.preferences.protobuf.IntArrayList) list, z);
        } else {
            getOutputStallDurationlomOqCM(i, list, z);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void getInputFormats(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
            getHighResolutionOutputSizeshNQ4ISI(i, (androidx.content.preferences.protobuf.LongArrayList) list, z);
        } else {
            toString(i, list, z);
        }
    }
}
