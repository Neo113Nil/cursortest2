package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public class FlatBufferBuilder {
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.nio.ByteBuffer getHighSpeedVideoFpsRanges;
    androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    final androidx.emoji2.text.flatbuffer.Utf8 getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;
    int[] getOutputMinFrameDurationlomOqCM;
    int[] getOutputSizes;
    int getOutputSizeshNQ4ISI;
    int getOutputStallDurationlomOqCM;

    public static abstract class ByteBufferFactory {
        public abstract java.nio.ByteBuffer newByteBuffer(int i);

        public void releaseByteBuffer(java.nio.ByteBuffer byteBuffer) {
        }
    }

    public FlatBufferBuilder(int i, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory byteBufferFactory) {
        this(i, byteBufferFactory, null, androidx.emoji2.text.flatbuffer.Utf8.getDefault());
    }

    public FlatBufferBuilder(int i, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory byteBufferFactory, java.nio.ByteBuffer byteBuffer, androidx.emoji2.text.flatbuffer.Utf8 utf8) {
        this.Camera2StreamConfigurationMap = 1;
        this.getOutputSizes = null;
        this.getOutputSizeshNQ4ISI = 0;
        this.getInputFormats = false;
        this.getHighSpeedVideoSizes = false;
        this.getOutputMinFrameDurationlomOqCM = new int[16];
        this.getHighSpeedVideoSizesFor = 0;
        this.getOutputStallDurationlomOqCM = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        i = i <= 0 ? 1 : i;
        this.getHighSpeedVideoFpsRangesFor = byteBufferFactory;
        if (byteBuffer != null) {
            this.getHighSpeedVideoFpsRanges = byteBuffer;
            byteBuffer.clear();
            this.getHighSpeedVideoFpsRanges.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        } else {
            this.getHighSpeedVideoFpsRanges = byteBufferFactory.newByteBuffer(i);
        }
        this.getInputSizeshNQ4ISI = utf8;
        this.getOutputFormats = this.getHighSpeedVideoFpsRanges.capacity();
    }

    public FlatBufferBuilder(int i) {
        this(i, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory.INSTANCE, null, androidx.emoji2.text.flatbuffer.Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(java.nio.ByteBuffer byteBuffer, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, androidx.emoji2.text.flatbuffer.Utf8.getDefault());
    }

    public FlatBufferBuilder(java.nio.ByteBuffer byteBuffer) {
        this(byteBuffer, new androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory());
    }

    public androidx.emoji2.text.flatbuffer.FlatBufferBuilder init(java.nio.ByteBuffer byteBuffer, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory byteBufferFactory) {
        this.getHighSpeedVideoFpsRangesFor = byteBufferFactory;
        this.getHighSpeedVideoFpsRanges = byteBuffer;
        byteBuffer.clear();
        this.getHighSpeedVideoFpsRanges.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.Camera2StreamConfigurationMap = 1;
        this.getOutputFormats = this.getHighSpeedVideoFpsRanges.capacity();
        this.getOutputSizeshNQ4ISI = 0;
        this.getInputFormats = false;
        this.getHighSpeedVideoSizes = false;
        this.getOutputMinFrameDuration = 0;
        this.getHighSpeedVideoSizesFor = 0;
        this.getOutputStallDurationlomOqCM = 0;
        return this;
    }

    public static final class HeapByteBufferFactory extends androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory {
        public static final androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory INSTANCE = new androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public final java.nio.ByteBuffer newByteBuffer(int i) {
            return java.nio.ByteBuffer.allocate(i).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
    }

    public static boolean isFieldPresent(androidx.emoji2.text.flatbuffer.Table table, int i) {
        return table.__offset(i) != 0;
    }

    public void clear() {
        this.getOutputFormats = this.getHighSpeedVideoFpsRanges.capacity();
        this.getHighSpeedVideoFpsRanges.clear();
        this.Camera2StreamConfigurationMap = 1;
        while (true) {
            int i = this.getOutputSizeshNQ4ISI;
            if (i <= 0) {
                this.getOutputSizeshNQ4ISI = 0;
                this.getInputFormats = false;
                this.getHighSpeedVideoSizes = false;
                this.getOutputMinFrameDuration = 0;
                this.getHighSpeedVideoSizesFor = 0;
                this.getOutputStallDurationlomOqCM = 0;
                return;
            }
            int[] iArr = this.getOutputSizes;
            int i2 = i - 1;
            this.getOutputSizeshNQ4ISI = i2;
            iArr[i2] = 0;
        }
    }

    public int offset() {
        return this.getHighSpeedVideoFpsRanges.capacity() - this.getOutputFormats;
    }

    public void pad(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
            int i3 = this.getOutputFormats - 1;
            this.getOutputFormats = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public void prep(int i, int i2) {
        if (i > this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = i;
        }
        int i3 = ((~((this.getHighSpeedVideoFpsRanges.capacity() - this.getOutputFormats) + i2)) + 1) & (i - 1);
        while (this.getOutputFormats < i3 + i + i2) {
            int capacity = this.getHighSpeedVideoFpsRanges.capacity();
            java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory byteBufferFactory = this.getHighSpeedVideoFpsRangesFor;
            int capacity2 = byteBuffer.capacity();
            if (((-1073741824) & capacity2) != 0) {
                throw new java.lang.AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
            int i4 = capacity2 == 0 ? 1 : capacity2 << 1;
            byteBuffer.position(0);
            java.nio.ByteBuffer newByteBuffer = byteBufferFactory.newByteBuffer(i4);
            newByteBuffer.position(newByteBuffer.clear().capacity() - capacity2);
            newByteBuffer.put(byteBuffer);
            this.getHighSpeedVideoFpsRanges = newByteBuffer;
            if (byteBuffer != newByteBuffer) {
                this.getHighSpeedVideoFpsRangesFor.releaseByteBuffer(byteBuffer);
            }
            this.getOutputFormats += this.getHighSpeedVideoFpsRanges.capacity() - capacity;
        }
        pad(i3);
    }

    public void putBoolean(boolean z) {
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i = this.getOutputFormats - 1;
        this.getOutputFormats = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b) {
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i = this.getOutputFormats - 1;
        this.getOutputFormats = i;
        byteBuffer.put(i, b);
    }

    public void putShort(short s) {
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i = this.getOutputFormats - 2;
        this.getOutputFormats = i;
        byteBuffer.putShort(i, s);
    }

    public void putInt(int i) {
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getOutputFormats - 4;
        this.getOutputFormats = i2;
        byteBuffer.putInt(i2, i);
    }

    public void putLong(long j) {
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i = this.getOutputFormats - 8;
        this.getOutputFormats = i;
        byteBuffer.putLong(i, j);
    }

    public void putFloat(float f) {
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i = this.getOutputFormats - 4;
        this.getOutputFormats = i;
        byteBuffer.putFloat(i, f);
    }

    public void putDouble(double d) {
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i = this.getOutputFormats - 8;
        this.getOutputFormats = i;
        byteBuffer.putDouble(i, d);
    }

    public void addBoolean(boolean z) {
        prep(1, 0);
        putBoolean(z);
    }

    public void addByte(byte b) {
        prep(1, 0);
        putByte(b);
    }

    public void addShort(short s) {
        prep(2, 0);
        putShort(s);
    }

    public void addInt(int i) {
        prep(4, 0);
        putInt(i);
    }

    public void addLong(long j) {
        prep(8, 0);
        putLong(j);
    }

    public void addFloat(float f) {
        prep(4, 0);
        putFloat(f);
    }

    public void addDouble(double d) {
        prep(8, 0);
        putDouble(d);
    }

    public void addOffset(int i) {
        prep(4, 0);
        putInt((offset() - i) + 4);
    }

    public void startVector(int i, int i2, int i3) {
        notNested();
        this.getOutputStallDurationlomOqCM = i2;
        int i4 = i * i2;
        prep(4, i4);
        prep(i3, i4);
        this.getInputFormats = true;
    }

    public int endVector() {
        if (!this.getInputFormats) {
            throw new java.lang.AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.getInputFormats = false;
        putInt(this.getOutputStallDurationlomOqCM);
        return offset();
    }

    public java.nio.ByteBuffer createUnintializedVector(int i, int i2, int i3) {
        int i4 = i * i2;
        startVector(i, i2, i3);
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i5 = this.getOutputFormats - i4;
        this.getOutputFormats = i5;
        byteBuffer.position(i5);
        java.nio.ByteBuffer order = this.getHighSpeedVideoFpsRanges.slice().order(java.nio.ByteOrder.LITTLE_ENDIAN);
        order.limit(i4);
        return order;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public <T extends androidx.emoji2.text.flatbuffer.Table> int createSortedVectorOfTables(T t, int[] iArr) {
        t.sortTables(iArr, this.getHighSpeedVideoFpsRanges);
        return createVectorOfTables(iArr);
    }

    public int createString(java.lang.CharSequence charSequence) {
        int encodedLength = this.getInputSizeshNQ4ISI.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, encodedLength, 1);
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i = this.getOutputFormats - encodedLength;
        this.getOutputFormats = i;
        byteBuffer.position(i);
        this.getInputSizeshNQ4ISI.encodeUtf8(charSequence, this.getHighSpeedVideoFpsRanges);
        return endVector();
    }

    public int createString(java.nio.ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, remaining, 1);
        java.nio.ByteBuffer byteBuffer2 = this.getHighSpeedVideoFpsRanges;
        int i = this.getOutputFormats - remaining;
        this.getOutputFormats = i;
        byteBuffer2.position(i);
        this.getHighSpeedVideoFpsRanges.put(byteBuffer);
        return endVector();
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i = this.getOutputFormats - length;
        this.getOutputFormats = i;
        byteBuffer.position(i);
        this.getHighSpeedVideoFpsRanges.put(bArr);
        return endVector();
    }

    public int createByteVector(byte[] bArr, int i, int i2) {
        startVector(1, i2, 1);
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        int i3 = this.getOutputFormats - i2;
        this.getOutputFormats = i3;
        byteBuffer.position(i3);
        this.getHighSpeedVideoFpsRanges.put(bArr, i, i2);
        return endVector();
    }

    public int createByteVector(java.nio.ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        startVector(1, remaining, 1);
        java.nio.ByteBuffer byteBuffer2 = this.getHighSpeedVideoFpsRanges;
        int i = this.getOutputFormats - remaining;
        this.getOutputFormats = i;
        byteBuffer2.position(i);
        this.getHighSpeedVideoFpsRanges.put(byteBuffer);
        return endVector();
    }

    public void finished() {
        if (!this.getHighSpeedVideoSizes) {
            throw new java.lang.AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public void notNested() {
        if (this.getInputFormats) {
            throw new java.lang.AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public void Nested(int i) {
        if (i != offset()) {
            throw new java.lang.AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void startTable(int i) {
        notNested();
        int[] iArr = this.getOutputSizes;
        if (iArr == null || iArr.length < i) {
            this.getOutputSizes = new int[i];
        }
        this.getOutputSizeshNQ4ISI = i;
        java.util.Arrays.fill(this.getOutputSizes, 0, i, 0);
        this.getInputFormats = true;
        this.getOutputMinFrameDuration = offset();
    }

    public void addBoolean(int i, boolean z, boolean z2) {
        if (this.getHighResolutionOutputSizeshNQ4ISI || z != z2) {
            addBoolean(z);
            slot(i);
        }
    }

    public void addByte(int i, byte b, int i2) {
        if (this.getHighResolutionOutputSizeshNQ4ISI || b != i2) {
            addByte(b);
            slot(i);
        }
    }

    public void addShort(int i, short s, int i2) {
        if (this.getHighResolutionOutputSizeshNQ4ISI || s != i2) {
            addShort(s);
            slot(i);
        }
    }

    public void addInt(int i, int i2, int i3) {
        if (this.getHighResolutionOutputSizeshNQ4ISI || i2 != i3) {
            addInt(i2);
            slot(i);
        }
    }

    public void addLong(int i, long j, long j2) {
        if (this.getHighResolutionOutputSizeshNQ4ISI || j != j2) {
            addLong(j);
            slot(i);
        }
    }

    public void addFloat(int i, float f, double d) {
        if (this.getHighResolutionOutputSizeshNQ4ISI || f != d) {
            addFloat(f);
            slot(i);
        }
    }

    public void addDouble(int i, double d, double d2) {
        if (this.getHighResolutionOutputSizeshNQ4ISI || d != d2) {
            addDouble(d);
            slot(i);
        }
    }

    public void addOffset(int i, int i2, int i3) {
        if (this.getHighResolutionOutputSizeshNQ4ISI || i2 != i3) {
            addOffset(i2);
            slot(i);
        }
    }

    public void addStruct(int i, int i2, int i3) {
        if (i2 != i3) {
            Nested(i2);
            slot(i);
        }
    }

    public void slot(int i) {
        this.getOutputSizes[i] = offset();
    }

    public int endTable() {
        int i;
        int i2;
        if (this.getOutputSizes == null || !this.getInputFormats) {
            throw new java.lang.AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int offset = offset();
        int i3 = this.getOutputSizeshNQ4ISI - 1;
        while (i3 >= 0 && this.getOutputSizes[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.getOutputSizes[i4];
            addShort((short) (i5 != 0 ? offset - i5 : 0));
        }
        addShort((short) (offset - this.getOutputMinFrameDuration));
        addShort((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.getHighSpeedVideoSizesFor) {
                i = 0;
                break;
            }
            int capacity = this.getHighSpeedVideoFpsRanges.capacity() - this.getOutputMinFrameDurationlomOqCM[i6];
            int i7 = this.getOutputFormats;
            short s = this.getHighSpeedVideoFpsRanges.getShort(capacity);
            if (s == this.getHighSpeedVideoFpsRanges.getShort(i7)) {
                for (2; i2 < s; i2 + 2) {
                    i2 = this.getHighSpeedVideoFpsRanges.getShort(capacity + i2) == this.getHighSpeedVideoFpsRanges.getShort(i7 + i2) ? i2 + 2 : 2;
                }
                i = this.getOutputMinFrameDurationlomOqCM[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int capacity2 = this.getHighSpeedVideoFpsRanges.capacity() - offset;
            this.getOutputFormats = capacity2;
            this.getHighSpeedVideoFpsRanges.putInt(capacity2, i - offset);
        } else {
            int i8 = this.getHighSpeedVideoSizesFor;
            int[] iArr = this.getOutputMinFrameDurationlomOqCM;
            if (i8 == iArr.length) {
                this.getOutputMinFrameDurationlomOqCM = java.util.Arrays.copyOf(iArr, i8 * 2);
            }
            int[] iArr2 = this.getOutputMinFrameDurationlomOqCM;
            int i9 = this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = i9 + 1;
            iArr2[i9] = offset();
            java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
            byteBuffer.putInt(byteBuffer.capacity() - offset, offset() - offset);
        }
        this.getInputFormats = false;
        return offset;
    }

    public void required(int i, int i2) {
        int capacity = this.getHighSpeedVideoFpsRanges.capacity() - i;
        if (this.getHighSpeedVideoFpsRanges.getShort((capacity - this.getHighSpeedVideoFpsRanges.getInt(capacity)) + i2) != 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlatBuffers: field ");
        sb.append(i2);
        sb.append(" must be set");
        throw new java.lang.AssertionError(sb.toString());
    }

    protected void finish(int i, boolean z) {
        prep(this.Camera2StreamConfigurationMap, (z ? 4 : 0) + 4);
        addOffset(i);
        if (z) {
            addInt(this.getHighSpeedVideoFpsRanges.capacity() - this.getOutputFormats);
        }
        this.getHighSpeedVideoFpsRanges.position(this.getOutputFormats);
        this.getHighSpeedVideoSizes = true;
    }

    public void finish(int i) {
        finish(i, false);
    }

    public void finishSizePrefixed(int i) {
        finish(i, true);
    }

    protected void finish(int i, java.lang.String str, boolean z) {
        prep(this.Camera2StreamConfigurationMap, (z ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new java.lang.AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i2 = 3; i2 >= 0; i2--) {
            addByte((byte) str.charAt(i2));
        }
        finish(i, z);
    }

    public void finish(int i, java.lang.String str) {
        finish(i, str, false);
    }

    public void finishSizePrefixed(int i, java.lang.String str) {
        finish(i, str, true);
    }

    public androidx.emoji2.text.flatbuffer.FlatBufferBuilder forceDefaults(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        return this;
    }

    public java.nio.ByteBuffer dataBuffer() {
        finished();
        return this.getHighSpeedVideoFpsRanges;
    }

    public byte[] sizedByteArray(int i, int i2) {
        finished();
        byte[] bArr = new byte[i2];
        this.getHighSpeedVideoFpsRanges.position(i);
        this.getHighSpeedVideoFpsRanges.get(bArr);
        return bArr;
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.getOutputFormats, this.getHighSpeedVideoFpsRanges.capacity() - this.getOutputFormats);
    }

    public java.io.InputStream sizedInputStream() {
        finished();
        java.nio.ByteBuffer duplicate = this.getHighSpeedVideoFpsRanges.duplicate();
        duplicate.position(this.getOutputFormats);
        duplicate.limit(this.getHighSpeedVideoFpsRanges.capacity());
        return new androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferBackedInputStream(duplicate);
    }

    static class ByteBufferBackedInputStream extends java.io.InputStream {
        java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor;

        public ByteBufferBackedInputStream(java.nio.ByteBuffer byteBuffer) {
            this.getHighSpeedVideoFpsRangesFor = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            try {
                return this.getHighSpeedVideoFpsRangesFor.get() & 255;
            } catch (java.nio.BufferUnderflowException unused) {
                return -1;
            }
        }
    }
}
