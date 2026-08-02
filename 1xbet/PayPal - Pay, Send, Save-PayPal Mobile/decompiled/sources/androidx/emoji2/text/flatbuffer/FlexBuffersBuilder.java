package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public class FlexBuffersBuilder {
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private java.util.Comparator<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value> Camera2StreamConfigurationMap;
    private final androidx.emoji2.text.flatbuffer.ReadWriteBuf getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> getHighSpeedVideoSizesFor;
    private final java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value> getOutputMinFrameDuration;

    public FlexBuffersBuilder(int i) {
        this(new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf(i), 1);
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    @java.lang.Deprecated
    public FlexBuffersBuilder(java.nio.ByteBuffer byteBuffer, int i) {
        this(new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf(byteBuffer.array()), i);
    }

    public FlexBuffersBuilder(androidx.emoji2.text.flatbuffer.ReadWriteBuf readWriteBuf, int i) {
        this.getOutputMinFrameDuration = new java.util.ArrayList<>();
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap<>();
        this.getHighSpeedVideoSizesFor = new java.util.HashMap<>();
        this.getHighSpeedVideoFpsRanges = false;
        this.Camera2StreamConfigurationMap = new java.util.Comparator<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value>() { // from class: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.1
            @Override // java.util.Comparator
            public /* synthetic */ int compare(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value value, androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value value2) {
                byte b;
                byte b2;
                int i2 = value.getHighSpeedVideoFpsRangesFor;
                int i3 = value2.getHighSpeedVideoFpsRangesFor;
                do {
                    b = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.this.getHighResolutionOutputSizeshNQ4ISI.get(i2);
                    b2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.this.getHighResolutionOutputSizeshNQ4ISI.get(i3);
                    if (b == 0) {
                        return b - b2;
                    }
                    i2++;
                    i3++;
                } while (b == b2);
                return b - b2;
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = readWriteBuf;
        this.getHighSpeedVideoSizes = i;
    }

    public FlexBuffersBuilder(java.nio.ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }

    public androidx.emoji2.text.flatbuffer.ReadWriteBuf getBuffer() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void putBoolean(boolean z) {
        putBoolean(null, z);
    }

    public void putBoolean(java.lang.String str, boolean z) {
        this.getOutputMinFrameDuration.add(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges(str), z));
    }

    private int getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str == null) {
            return -1;
        }
        int writePosition = this.getHighResolutionOutputSizeshNQ4ISI.writePosition();
        if ((this.getHighSpeedVideoSizes & 1) != 0) {
            java.lang.Integer num = this.getHighSpeedVideoFpsRangesFor.get(str);
            if (num == null) {
                byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                this.getHighResolutionOutputSizeshNQ4ISI.put(bytes, 0, bytes.length);
                this.getHighResolutionOutputSizeshNQ4ISI.put((byte) 0);
                this.getHighSpeedVideoFpsRangesFor.put(str, java.lang.Integer.valueOf(writePosition));
                return writePosition;
            }
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        this.getHighResolutionOutputSizeshNQ4ISI.put(bytes2, 0, bytes2.length);
        this.getHighResolutionOutputSizeshNQ4ISI.put((byte) 0);
        this.getHighSpeedVideoFpsRangesFor.put(str, java.lang.Integer.valueOf(writePosition));
        return writePosition;
    }

    public void putInt(int i) {
        putInt((java.lang.String) null, i);
    }

    public void putInt(java.lang.String str, int i) {
        putInt(str, i);
    }

    public void putInt(java.lang.String str, long j) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        if (-128 <= j && j <= 127) {
            this.getOutputMinFrameDuration.add(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, (int) j));
            return;
        }
        if (-32768 <= j && j <= 32767) {
            this.getOutputMinFrameDuration.add(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, (int) j));
        } else if (androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask <= j && j <= androidx.collection.SieveCacheKt.NodeLinkMask) {
            this.getOutputMinFrameDuration.add(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, (int) j));
        } else {
            this.getOutputMinFrameDuration.add(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, j));
        }
    }

    public void putInt(long j) {
        putInt((java.lang.String) null, j);
    }

    public void putUInt(int i) {
        Camera2StreamConfigurationMap(i);
    }

    public void putUInt(long j) {
        Camera2StreamConfigurationMap(j);
    }

    public void putUInt64(java.math.BigInteger bigInteger) {
        this.getOutputMinFrameDuration.add(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges(null), bigInteger.longValue()));
    }

    private void Camera2StreamConfigurationMap(long j) {
        androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value Camera2StreamConfigurationMap;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(null);
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(j);
        if (highResolutionOutputSizeshNQ4ISI == 0) {
            Camera2StreamConfigurationMap = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getInputSizeshNQ4ISI(highSpeedVideoFpsRanges, (int) j);
        } else if (highResolutionOutputSizeshNQ4ISI == 1) {
            Camera2StreamConfigurationMap = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, (int) j);
        } else if (highResolutionOutputSizeshNQ4ISI == 2) {
            Camera2StreamConfigurationMap = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getOutputMinFrameDuration(highSpeedVideoFpsRanges, (int) j);
        } else {
            Camera2StreamConfigurationMap = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, j);
        }
        this.getOutputMinFrameDuration.add(Camera2StreamConfigurationMap);
    }

    public void putFloat(float f) {
        putFloat((java.lang.String) null, f);
    }

    public void putFloat(java.lang.String str, float f) {
        this.getOutputMinFrameDuration.add(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges(str), f));
    }

    public void putFloat(double d) {
        putFloat((java.lang.String) null, d);
    }

    public void putFloat(java.lang.String str, double d) {
        this.getOutputMinFrameDuration.add(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges(str), d));
    }

    public int putString(java.lang.String str) {
        return putString(null, str);
    }

    public int putString(java.lang.String str, java.lang.String str2) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        if ((this.getHighSpeedVideoSizes & 2) != 0) {
            java.lang.Integer num = this.getHighSpeedVideoSizesFor.get(str2);
            if (num != null) {
                this.getOutputMinFrameDuration.add(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, num.intValue(), 5, getHighResolutionOutputSizeshNQ4ISI(str2.length())));
                return num.intValue();
            }
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), 5, true);
            this.getHighSpeedVideoSizesFor.put(str2, java.lang.Integer.valueOf((int) highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap));
            this.getOutputMinFrameDuration.add(highSpeedVideoFpsRangesFor);
            return (int) highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
        }
        androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), 5, true);
        this.getOutputMinFrameDuration.add(highSpeedVideoFpsRangesFor2);
        return (int) highSpeedVideoFpsRangesFor2.Camera2StreamConfigurationMap;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(long j) {
        if (j <= androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.Camera2StreamConfigurationMap((byte) -1)) {
            return 0;
        }
        if (j <= androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.getHighResolutionOutputSizeshNQ4ISI((short) -1)) {
            return 1;
        }
        return j <= androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.getHighSpeedVideoSizes(-1) ? 2 : 3;
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getHighSpeedVideoFpsRangesFor(int i, byte[] bArr, int i2, boolean z) {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr.length);
        Camera2StreamConfigurationMap(bArr.length, getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI));
        int writePosition = this.getHighResolutionOutputSizeshNQ4ISI.writePosition();
        this.getHighResolutionOutputSizeshNQ4ISI.put(bArr, 0, bArr.length);
        if (z) {
            this.getHighResolutionOutputSizeshNQ4ISI.put((byte) 0);
        }
        return androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoSizes(i, writePosition, i2, highResolutionOutputSizeshNQ4ISI);
    }

    private int getHighSpeedVideoFpsRangesFor(int i) {
        int i2 = 1 << i;
        for (int highSpeedVideoSizes = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI.writePosition(), i2); highSpeedVideoSizes != 0; highSpeedVideoSizes--) {
            this.getHighResolutionOutputSizeshNQ4ISI.put((byte) 0);
        }
        return i2;
    }

    private void Camera2StreamConfigurationMap(long j, int i) {
        if (i == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI.put((byte) j);
            return;
        }
        if (i == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI.putShort((short) j);
        } else if (i == 4) {
            this.getHighResolutionOutputSizeshNQ4ISI.putInt((int) j);
        } else {
            if (i != 8) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.putLong(j);
        }
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public int putBlob(java.lang.String str, byte[] bArr) {
        androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges(str), bArr, 25, false);
        this.getOutputMinFrameDuration.add(highSpeedVideoFpsRangesFor);
        return (int) highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
    }

    public int startVector() {
        return this.getOutputMinFrameDuration.size();
    }

    public int endVector(java.lang.String str, int i, boolean z, boolean z2) {
        androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges(str), i, this.getOutputMinFrameDuration.size() - i, z, z2, null);
        while (this.getOutputMinFrameDuration.size() > i) {
            this.getOutputMinFrameDuration.remove(r10.size() - 1);
        }
        this.getOutputMinFrameDuration.add(highSpeedVideoSizes);
        return (int) highSpeedVideoSizes.Camera2StreamConfigurationMap;
    }

    public java.nio.ByteBuffer finish() {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.Camera2StreamConfigurationMap(this.getOutputMinFrameDuration.get(0), this.getHighResolutionOutputSizeshNQ4ISI.writePosition(), 0));
        getHighSpeedVideoSizes(this.getOutputMinFrameDuration.get(0), highSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI.put(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration.get(0)));
        this.getHighResolutionOutputSizeshNQ4ISI.put((byte) highSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRanges = true;
        return java.nio.ByteBuffer.wrap(this.getHighResolutionOutputSizeshNQ4ISI.data(), 0, this.getHighResolutionOutputSizeshNQ4ISI.writePosition());
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getHighSpeedVideoSizes(int i, int i2, int i3, boolean z, boolean z2, androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value value) {
        int i4;
        int i5;
        int i6 = i3;
        long j = i6;
        int max = java.lang.Math.max(0, getHighResolutionOutputSizeshNQ4ISI(j));
        if (value != null) {
            max = java.lang.Math.max(max, androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.Camera2StreamConfigurationMap(value, this.getHighResolutionOutputSizeshNQ4ISI.writePosition(), 0));
            i4 = 3;
        } else {
            i4 = 1;
        }
        int i7 = 4;
        int i8 = max;
        for (int i9 = i2; i9 < this.getOutputMinFrameDuration.size(); i9++) {
            i8 = java.lang.Math.max(i8, androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.Camera2StreamConfigurationMap(this.getOutputMinFrameDuration.get(i9), this.getHighResolutionOutputSizeshNQ4ISI.writePosition(), i9 + i4));
            if (z && i9 == i2) {
                i7 = this.getOutputMinFrameDuration.get(i9).getHighSpeedVideoFpsRanges;
                if (!androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizes(i7)) {
                    throw new androidx.emoji2.text.flatbuffer.FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i10 = i2;
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i8);
        if (value != null) {
            Camera2StreamConfigurationMap((int) (this.getHighResolutionOutputSizeshNQ4ISI.writePosition() - value.Camera2StreamConfigurationMap), highSpeedVideoFpsRangesFor);
            Camera2StreamConfigurationMap(1 << value.getHighSpeedVideoSizes, highSpeedVideoFpsRangesFor);
        }
        if (!z2) {
            Camera2StreamConfigurationMap(j, highSpeedVideoFpsRangesFor);
        }
        int writePosition = this.getHighResolutionOutputSizeshNQ4ISI.writePosition();
        for (int i11 = i10; i11 < this.getOutputMinFrameDuration.size(); i11++) {
            getHighSpeedVideoSizes(this.getOutputMinFrameDuration.get(i11), highSpeedVideoFpsRangesFor);
        }
        if (!z) {
            while (i10 < this.getOutputMinFrameDuration.size()) {
                this.getHighResolutionOutputSizeshNQ4ISI.put(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoSizes(this.getOutputMinFrameDuration.get(i10), i8));
                i10++;
            }
        }
        if (value != null) {
            i5 = 9;
        } else if (z) {
            if (!z2) {
                i6 = 0;
            }
            i5 = androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(i7, i6);
        } else {
            i5 = 10;
        }
        return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, i5, i8, writePosition);
    }

    private void getHighSpeedVideoSizes(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value value, int i) {
        int i2 = value.getHighSpeedVideoFpsRanges;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                getHighSpeedVideoFpsRanges(value.getHighResolutionOutputSizeshNQ4ISI, i);
                return;
            } else if (i2 != 26) {
                Camera2StreamConfigurationMap((int) (this.getHighResolutionOutputSizeshNQ4ISI.writePosition() - value.Camera2StreamConfigurationMap), i);
                return;
            }
        }
        Camera2StreamConfigurationMap(value.Camera2StreamConfigurationMap, i);
    }

    private void getHighSpeedVideoFpsRanges(double d, int i) {
        if (i == 4) {
            this.getHighResolutionOutputSizeshNQ4ISI.putFloat((float) d);
        } else if (i == 8) {
            this.getHighResolutionOutputSizeshNQ4ISI.putDouble(d);
        }
    }

    public int startMap() {
        return this.getOutputMinFrameDuration.size();
    }

    public int endMap(java.lang.String str, int i) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value> arrayList = this.getOutputMinFrameDuration;
        java.util.Collections.sort(arrayList.subList(i, arrayList.size()), this.Camera2StreamConfigurationMap);
        long size = this.getOutputMinFrameDuration.size() - i;
        int max = java.lang.Math.max(0, getHighResolutionOutputSizeshNQ4ISI(size));
        int i2 = i;
        while (i2 < this.getOutputMinFrameDuration.size()) {
            i2++;
            max = java.lang.Math.max(max, androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.getHighSpeedVideoSizes(this.getOutputMinFrameDuration.get(i2).getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI.writePosition(), i2));
        }
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(max);
        Camera2StreamConfigurationMap(size, highSpeedVideoFpsRangesFor);
        int writePosition = this.getHighResolutionOutputSizeshNQ4ISI.writePosition();
        for (int i3 = i; i3 < this.getOutputMinFrameDuration.size(); i3++) {
            int i4 = this.getOutputMinFrameDuration.get(i3).getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap((int) (this.getHighResolutionOutputSizeshNQ4ISI.writePosition() - this.getOutputMinFrameDuration.get(i3).getHighSpeedVideoFpsRangesFor), highSpeedVideoFpsRangesFor);
        }
        androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value highSpeedVideoSizes = getHighSpeedVideoSizes(highSpeedVideoFpsRanges, i, this.getOutputMinFrameDuration.size() - i, false, false, new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(-1, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(4, 0), max, writePosition));
        while (this.getOutputMinFrameDuration.size() > i) {
            this.getOutputMinFrameDuration.remove(r0.size() - 1);
        }
        this.getOutputMinFrameDuration.add(highSpeedVideoSizes);
        return (int) highSpeedVideoSizes.Camera2StreamConfigurationMap;
    }

    static class Value {
        long Camera2StreamConfigurationMap;
        final double getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;

        static /* synthetic */ int getHighSpeedVideoSizes(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        static /* synthetic */ int getHighSpeedVideoSizes(long j, int i, int i2) {
            return Camera2StreamConfigurationMap(4, 0, j, i, i2);
        }

        Value(int i, int i2, int i3, long j) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = i2;
            this.getHighSpeedVideoSizes = i3;
            this.Camera2StreamConfigurationMap = j;
            this.getHighResolutionOutputSizeshNQ4ISI = Double.MIN_VALUE;
        }

        private Value(int i, int i2, double d) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = 3;
            this.getHighSpeedVideoSizes = i2;
            this.getHighResolutionOutputSizeshNQ4ISI = d;
            this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getHighSpeedVideoSizes(int i, boolean z) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 26, 0, z ? 1L : 0L);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getHighSpeedVideoSizes(int i, int i2, int i3, int i4) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, i3, i4, i2);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getHighSpeedVideoFpsRanges(int i, int i2) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 1, 0, i2);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getHighSpeedVideoFpsRangesFor(int i, int i2) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 1, 1, i2);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 1, 2, i2);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getHighSpeedVideoSizes(int i, long j) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 1, 3, j);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getInputSizeshNQ4ISI(int i, int i2) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 2, 0, i2);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value Camera2StreamConfigurationMap(int i, int i2) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 2, 1, i2);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getOutputMinFrameDuration(int i, int i2) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 2, 2, i2);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value Camera2StreamConfigurationMap(int i, long j) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 2, 3, j);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getHighSpeedVideoFpsRanges(int i, float f) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 2, f);
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value getHighSpeedVideoFpsRanges(int i, double d) {
            return new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value(i, 3, d);
        }

        private static int Camera2StreamConfigurationMap(int i, int i2, long j, int i3, int i4) {
            if (androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int highResolutionOutputSizeshNQ4ISI = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.getHighResolutionOutputSizeshNQ4ISI((int) ((((((~i3) + 1) & (i5 - 1)) + i3) + (i4 * i5)) - j));
                if ((1 << highResolutionOutputSizeshNQ4ISI) == i5) {
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }
            return 3;
        }

        static /* synthetic */ int Camera2StreamConfigurationMap(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value value, int i, int i2) {
            return Camera2StreamConfigurationMap(value.getHighSpeedVideoFpsRanges, value.getHighSpeedVideoSizes, value.Camera2StreamConfigurationMap, i, i2);
        }

        static /* synthetic */ byte getHighSpeedVideoFpsRanges(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value value) {
            int i;
            if (androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(value.getHighSpeedVideoFpsRanges)) {
                i = java.lang.Math.max(value.getHighSpeedVideoSizes, 0);
            } else {
                i = value.getHighSpeedVideoSizes;
            }
            return (byte) ((value.getHighSpeedVideoFpsRanges << 2) | i);
        }

        static /* synthetic */ byte getHighSpeedVideoSizes(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value value, int i) {
            int i2;
            if (androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(value.getHighSpeedVideoFpsRanges)) {
                i2 = java.lang.Math.max(value.getHighSpeedVideoSizes, i);
            } else {
                i2 = value.getHighSpeedVideoSizes;
            }
            return (byte) ((value.getHighSpeedVideoFpsRanges << 2) | i2);
        }
    }
}
