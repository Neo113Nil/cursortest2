package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class CodedOutputStream extends androidx.content.preferences.protobuf.ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @java.lang.Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    androidx.content.preferences.protobuf.CodedOutputStreamWriter getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    private static final java.util.logging.Logger Camera2StreamConfigurationMap = java.util.logging.Logger.getLogger(androidx.content.preferences.protobuf.CodedOutputStream.class.getName());
    private static final boolean getHighSpeedVideoSizes = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges();

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int encodeZigZag32(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static long encodeZigZag64(long j) {
        return (j << 1) ^ (j >> 63);
    }

    static int getHighSpeedVideoFpsRangesFor(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public abstract void flush() throws java.io.IOException;

    abstract void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) throws java.io.IOException;

    abstract void getHighSpeedVideoFpsRangesFor(int i, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException;

    public abstract int getTotalBytesWritten();

    public abstract int spaceLeft();

    @Override // androidx.content.preferences.protobuf.ByteOutput
    public abstract void write(byte b) throws java.io.IOException;

    @Override // androidx.content.preferences.protobuf.ByteOutput
    public abstract void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    @Override // androidx.content.preferences.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void writeBool(int i, boolean z) throws java.io.IOException;

    public abstract void writeByteArray(int i, byte[] bArr) throws java.io.IOException;

    public abstract void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException;

    public abstract void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    public abstract void writeBytes(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException;

    public abstract void writeBytesNoTag(androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException;

    public abstract void writeFixed32(int i, int i2) throws java.io.IOException;

    public abstract void writeFixed32NoTag(int i) throws java.io.IOException;

    public abstract void writeFixed64(int i, long j) throws java.io.IOException;

    public abstract void writeFixed64NoTag(long j) throws java.io.IOException;

    public abstract void writeInt32(int i, int i2) throws java.io.IOException;

    public abstract void writeInt32NoTag(int i) throws java.io.IOException;

    @Override // androidx.content.preferences.protobuf.ByteOutput
    public abstract void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    @Override // androidx.content.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void writeMessage(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException;

    public abstract void writeMessageNoTag(androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException;

    public abstract void writeMessageSetExtension(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException;

    public abstract void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    public abstract void writeRawMessageSetExtension(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException;

    public abstract void writeString(int i, java.lang.String str) throws java.io.IOException;

    public abstract void writeStringNoTag(java.lang.String str) throws java.io.IOException;

    public abstract void writeTag(int i, int i2) throws java.io.IOException;

    public abstract void writeUInt32(int i, int i2) throws java.io.IOException;

    public abstract void writeUInt32NoTag(int i) throws java.io.IOException;

    public abstract void writeUInt64(int i, long j) throws java.io.IOException;

    public abstract void writeUInt64NoTag(long j) throws java.io.IOException;

    /* synthetic */ CodedOutputStream(byte b) {
        this();
    }

    public static androidx.content.preferences.protobuf.CodedOutputStream newInstance(java.io.OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static androidx.content.preferences.protobuf.CodedOutputStream newInstance(java.io.OutputStream outputStream, int i) {
        return new androidx.datastore.preferences.protobuf.CodedOutputStream.OutputStreamEncoder(outputStream, i);
    }

    public static androidx.content.preferences.protobuf.CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static androidx.content.preferences.protobuf.CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder(bArr, i, i2);
    }

    public static androidx.content.preferences.protobuf.CodedOutputStream newInstance(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new androidx.datastore.preferences.protobuf.CodedOutputStream.HeapNioEncoder(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (androidx.datastore.preferences.protobuf.CodedOutputStream.UnsafeDirectNioEncoder.getHighSpeedVideoSizes()) {
                return new androidx.datastore.preferences.protobuf.CodedOutputStream.UnsafeDirectNioEncoder(byteBuffer);
            }
            return new androidx.datastore.preferences.protobuf.CodedOutputStream.SafeDirectNioEncoder(byteBuffer);
        }
        throw new java.lang.IllegalArgumentException("ByteBuffer is read-only");
    }

    public void useDeterministicSerialization() {
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    @java.lang.Deprecated
    public static androidx.content.preferences.protobuf.CodedOutputStream newInstance(java.nio.ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }

    private CodedOutputStream() {
    }

    public final void writeSInt32(int i, int i2) throws java.io.IOException {
        writeUInt32(i, encodeZigZag32(i2));
    }

    public final void writeSFixed32(int i, int i2) throws java.io.IOException {
        writeFixed32(i, i2);
    }

    public final void writeInt64(int i, long j) throws java.io.IOException {
        writeUInt64(i, j);
    }

    public final void writeSInt64(int i, long j) throws java.io.IOException {
        writeUInt64(i, encodeZigZag64(j));
    }

    public final void writeSFixed64(int i, long j) throws java.io.IOException {
        writeFixed64(i, j);
    }

    public final void writeFloat(int i, float f) throws java.io.IOException {
        writeFixed32(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void writeDouble(int i, double d) throws java.io.IOException {
        writeFixed64(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void writeEnum(int i, int i2) throws java.io.IOException {
        writeInt32(i, i2);
    }

    public final void writeRawByte(byte b) throws java.io.IOException {
        write(b);
    }

    public final void writeRawByte(int i) throws java.io.IOException {
        write((byte) i);
    }

    public final void writeRawBytes(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws java.io.IOException {
        write(bArr, i, i2);
    }

    public final void writeRawBytes(androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
        byteString.getHighResolutionOutputSizeshNQ4ISI(this);
    }

    public final void writeSInt32NoTag(int i) throws java.io.IOException {
        writeUInt32NoTag(encodeZigZag32(i));
    }

    public final void writeSFixed32NoTag(int i) throws java.io.IOException {
        writeFixed32NoTag(i);
    }

    public final void writeInt64NoTag(long j) throws java.io.IOException {
        writeUInt64NoTag(j);
    }

    public final void writeSInt64NoTag(long j) throws java.io.IOException {
        writeUInt64NoTag(encodeZigZag64(j));
    }

    public final void writeSFixed64NoTag(long j) throws java.io.IOException {
        writeFixed64NoTag(j);
    }

    public final void writeFloatNoTag(float f) throws java.io.IOException {
        writeFixed32NoTag(java.lang.Float.floatToRawIntBits(f));
    }

    public final void writeDoubleNoTag(double d) throws java.io.IOException {
        writeFixed64NoTag(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void writeBoolNoTag(boolean z) throws java.io.IOException {
        write(z ? (byte) 1 : (byte) 0);
    }

    public final void writeEnumNoTag(int i) throws java.io.IOException {
        writeInt32NoTag(i);
    }

    public final void writeByteArrayNoTag(byte[] bArr) throws java.io.IOException {
        getHighSpeedVideoFpsRanges(bArr, 0, bArr.length);
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeTagSize(i) + computeSInt32SizeNoTag(i2);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeFixed32SizeNoTag(i2);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeSFixed32SizeNoTag(i2);
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeFixed64Size(int i, long j) {
        return computeTagSize(i) + computeFixed64SizeNoTag(j);
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeTagSize(i) + computeSFixed64SizeNoTag(j);
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeStringSize(int i, java.lang.String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeBytesSize(int i, androidx.content.preferences.protobuf.ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeByteArraySize(int i, byte[] bArr) {
        return computeTagSize(i) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteBufferSize(int i, java.nio.ByteBuffer byteBuffer) {
        return computeTagSize(i) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeLazyFieldSize(int i, androidx.content.preferences.protobuf.LazyFieldLite lazyFieldLite) {
        return computeTagSize(i) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeMessageSize(int i, androidx.content.preferences.protobuf.MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    static int getHighSpeedVideoFpsRanges(int i, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.Schema schema) {
        int computeTagSize = computeTagSize(i);
        int highResolutionOutputSizeshNQ4ISI = ((androidx.content.preferences.protobuf.AbstractMessageLite) messageLite).getHighResolutionOutputSizeshNQ4ISI(schema);
        return computeTagSize + computeUInt32SizeNoTag(highResolutionOutputSizeshNQ4ISI) + highResolutionOutputSizeshNQ4ISI;
    }

    public static int computeMessageSetExtensionSize(int i, androidx.content.preferences.protobuf.MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeMessageSize(3, messageLite);
    }

    public static int computeRawMessageSetExtensionSize(int i, androidx.content.preferences.protobuf.ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeBytesSize(3, byteString);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i, androidx.content.preferences.protobuf.LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
    }

    public static int computeInt32SizeNoTag(int i) {
        return computeUInt64SizeNoTag(i);
    }

    public static int computeUInt32SizeNoTag(int i) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeUInt32SizeNoTag(encodeZigZag32(i));
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(encodeZigZag64(j));
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeStringSizeNoTag(java.lang.String str) {
        int length;
        try {
            length = androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(str);
        } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes).length;
        }
        return computeUInt32SizeNoTag(length) + length;
    }

    public static int computeLazyFieldSizeNoTag(androidx.content.preferences.protobuf.LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeUInt32SizeNoTag(serializedSize) + serializedSize;
    }

    public static int computeBytesSizeNoTag(androidx.content.preferences.protobuf.ByteString byteString) {
        int size = byteString.size();
        return computeUInt32SizeNoTag(size) + size;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        int length = bArr.length;
        return computeUInt32SizeNoTag(length) + length;
    }

    public static int computeByteBufferSizeNoTag(java.nio.ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        return computeUInt32SizeNoTag(capacity) + capacity;
    }

    public static int computeMessageSizeNoTag(androidx.content.preferences.protobuf.MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeUInt32SizeNoTag(serializedSize) + serializedSize;
    }

    static int getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.Schema schema) {
        int highResolutionOutputSizeshNQ4ISI = ((androidx.content.preferences.protobuf.AbstractMessageLite) messageLite).getHighResolutionOutputSizeshNQ4ISI(schema);
        return computeUInt32SizeNoTag(highResolutionOutputSizeshNQ4ISI) + highResolutionOutputSizeshNQ4ISI;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static class OutOfSpaceException extends java.io.IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(java.lang.String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(java.lang.String.valueOf(str)));
        }

        OutOfSpaceException(java.lang.Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public OutOfSpaceException(java.lang.String str, java.lang.Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(java.lang.String.valueOf(str)), th);
        }
    }

    final void getHighSpeedVideoFpsRanges(java.lang.String str, androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException unpairedSurrogateException) throws java.io.IOException {
        Camera2StreamConfigurationMap.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @java.lang.Deprecated
    public final void writeGroup(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    @java.lang.Deprecated
    public final void writeGroupNoTag(androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
        messageLite.writeTo(this);
    }

    @java.lang.Deprecated
    public static int computeGroupSize(int i, androidx.content.preferences.protobuf.MessageLite messageLite) {
        return (computeTagSize(i) * 2) + messageLite.getSerializedSize();
    }

    @java.lang.Deprecated
    static int getHighResolutionOutputSizeshNQ4ISI(int i, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.Schema schema) {
        return (computeTagSize(i) * 2) + ((androidx.content.preferences.protobuf.AbstractMessageLite) messageLite).getHighResolutionOutputSizeshNQ4ISI(schema);
    }

    @java.lang.Deprecated
    public static int computeGroupSizeNoTag(androidx.content.preferences.protobuf.MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    @java.lang.Deprecated
    public final void writeRawVarint32(int i) throws java.io.IOException {
        writeUInt32NoTag(i);
    }

    @java.lang.Deprecated
    public final void writeRawVarint64(long j) throws java.io.IOException {
        writeUInt64NoTag(j);
    }

    @java.lang.Deprecated
    public static int computeRawVarint32Size(int i) {
        return computeUInt32SizeNoTag(i);
    }

    @java.lang.Deprecated
    public static int computeRawVarint64Size(long j) {
        return computeUInt64SizeNoTag(j);
    }

    @java.lang.Deprecated
    public final void writeRawLittleEndian32(int i) throws java.io.IOException {
        writeFixed32NoTag(i);
    }

    @java.lang.Deprecated
    public final void writeRawLittleEndian64(long j) throws java.io.IOException {
        writeFixed64NoTag(j);
    }

    static class ArrayEncoder extends androidx.content.preferences.protobuf.CodedOutputStream {
        private final byte[] Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoSizes;
        private int getInputFormats;

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void flush() {
        }

        ArrayEncoder(byte[] bArr, int i, int i2) {
            super((byte) 0);
            if (bArr == null) {
                throw new java.lang.NullPointerException("buffer");
            }
            int i3 = i + i2;
            if (((bArr.length - i3) | i | i2) < 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            this.Camera2StreamConfigurationMap = bArr;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getInputFormats = i;
            this.getHighSpeedVideoSizes = i3;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, i2));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) throws java.io.IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) throws java.io.IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z) throws java.io.IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, java.lang.String str) throws java.io.IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr) throws java.io.IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeUInt32NoTag(byteString.size());
            byteString.getHighResolutionOutputSizeshNQ4ISI(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(i2);
            write(bArr, 0, i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(duplicate);
            write(duplicate);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        final void getHighSpeedVideoFpsRangesFor(int i, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(((androidx.content.preferences.protobuf.AbstractMessageLite) messageLite).getHighResolutionOutputSizeshNQ4ISI(schema));
            schema.getHighResolutionOutputSizeshNQ4ISI(messageLite, this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte b) throws java.io.IOException {
            try {
                byte[] bArr = this.Camera2StreamConfigurationMap;
                int i = this.getInputFormats;
                this.getInputFormats = i + 1;
                bArr[i] = b;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.getInputFormats), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), 1), e);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i) throws java.io.IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i) throws java.io.IOException {
            while ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                try {
                    byte[] bArr = this.Camera2StreamConfigurationMap;
                    int i2 = this.getInputFormats;
                    this.getInputFormats = i2 + 1;
                    bArr[i2] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.getInputFormats), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), 1), e);
                }
            }
            byte[] bArr2 = this.Camera2StreamConfigurationMap;
            int i3 = this.getInputFormats;
            this.getInputFormats = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i) throws java.io.IOException {
            try {
                byte[] bArr = this.Camera2StreamConfigurationMap;
                int i2 = this.getInputFormats;
                bArr[i2] = (byte) (i & 255);
                bArr[i2 + 1] = (byte) ((i >> 8) & 255);
                bArr[i2 + 2] = (byte) ((i >> 16) & 255);
                this.getInputFormats = i2 + 4;
                bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.getInputFormats), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), 1), e);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j) throws java.io.IOException {
            if (androidx.content.preferences.protobuf.CodedOutputStream.getHighSpeedVideoSizes && spaceLeft() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.Camera2StreamConfigurationMap;
                    int i = this.getInputFormats;
                    this.getInputFormats = i + 1;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                byte[] bArr2 = this.Camera2StreamConfigurationMap;
                int i2 = this.getInputFormats;
                this.getInputFormats = i2 + 1;
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.Camera2StreamConfigurationMap;
                    int i3 = this.getInputFormats;
                    this.getInputFormats = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.getInputFormats), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), 1), e);
                }
            }
            byte[] bArr4 = this.Camera2StreamConfigurationMap;
            int i4 = this.getInputFormats;
            this.getInputFormats = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j) throws java.io.IOException {
            try {
                byte[] bArr = this.Camera2StreamConfigurationMap;
                int i = this.getInputFormats;
                bArr[i] = (byte) (((int) j) & 255);
                bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
                bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
                bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
                bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
                bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
                bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
                this.getInputFormats = i + 8;
                bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.getInputFormats), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), 1), e);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                java.lang.System.arraycopy(bArr, i, this.Camera2StreamConfigurationMap, this.getInputFormats, i2);
                this.getInputFormats += i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.getInputFormats), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), java.lang.Integer.valueOf(i2)), e);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.Camera2StreamConfigurationMap, this.getInputFormats, remaining);
                this.getInputFormats += remaining;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.getInputFormats), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), java.lang.Integer.valueOf(remaining)), e);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            write(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(java.lang.String str) throws java.io.IOException {
            int i = this.getInputFormats;
            try {
                int computeUInt32SizeNoTag = computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i2 = i + computeUInt32SizeNoTag2;
                    this.getInputFormats = i2;
                    int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, this.Camera2StreamConfigurationMap, i2, spaceLeft());
                    this.getInputFormats = i;
                    writeUInt32NoTag((Camera2StreamConfigurationMap - i) - computeUInt32SizeNoTag2);
                    this.getInputFormats = Camera2StreamConfigurationMap;
                    return;
                }
                writeUInt32NoTag(androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(str));
                this.getInputFormats = androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, this.Camera2StreamConfigurationMap, this.getInputFormats, spaceLeft());
            } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e) {
                this.getInputFormats = i;
                getHighSpeedVideoFpsRanges(str, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.getHighSpeedVideoSizes - this.getInputFormats;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.getInputFormats - this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* loaded from: classes7.dex */
    static final class HeapNioEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private final java.nio.ByteBuffer getHighSpeedVideoSizes;

        HeapNioEncoder(java.nio.ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.getHighSpeedVideoSizes = byteBuffer;
            this.getHighResolutionOutputSizeshNQ4ISI = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder, androidx.content.preferences.protobuf.CodedOutputStream
        public final void flush() {
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI + getTotalBytesWritten());
        }
    }

    /* loaded from: classes7.dex */
    static final class SafeDirectNioEncoder extends androidx.content.preferences.protobuf.CodedOutputStream {
        private final int Camera2StreamConfigurationMap;
        private final java.nio.ByteBuffer getHighResolutionOutputSizeshNQ4ISI;
        private final java.nio.ByteBuffer getHighSpeedVideoSizes;

        SafeDirectNioEncoder(java.nio.ByteBuffer byteBuffer) {
            super((byte) 0);
            this.getHighSpeedVideoSizes = byteBuffer;
            this.getHighResolutionOutputSizeshNQ4ISI = byteBuffer.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.Camera2StreamConfigurationMap = byteBuffer.position();
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, i2));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) throws java.io.IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) throws java.io.IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z) throws java.io.IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, java.lang.String str) throws java.io.IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr) throws java.io.IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        final void getHighSpeedVideoFpsRangesFor(int i, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(((androidx.content.preferences.protobuf.AbstractMessageLite) messageLite).getHighResolutionOutputSizeshNQ4ISI(schema));
            schema.getHighResolutionOutputSizeshNQ4ISI(messageLite, this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte b) throws java.io.IOException {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.put(b);
            } catch (java.nio.BufferOverflowException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeUInt32NoTag(byteString.size());
            byteString.getHighResolutionOutputSizeshNQ4ISI(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(i2);
            write(bArr, 0, i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(duplicate);
            write(duplicate);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i) throws java.io.IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i) throws java.io.IOException {
            while ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.put((byte) ((i | 128) & 255));
                    i >>>= 7;
                } catch (java.nio.BufferOverflowException e) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.put((byte) i);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i) throws java.io.IOException {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.putInt(i);
            } catch (java.nio.BufferOverflowException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j) throws java.io.IOException {
            while (((-128) & j) != 0) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.put((byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                } catch (java.nio.BufferOverflowException e) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.put((byte) j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j) throws java.io.IOException {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.putLong(j);
            } catch (java.nio.BufferOverflowException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.put(bArr, i, i2);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            } catch (java.nio.BufferOverflowException e2) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.put(byteBuffer);
            } catch (java.nio.BufferOverflowException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            write(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(java.lang.String str) throws java.io.IOException {
            int position = this.getHighResolutionOutputSizeshNQ4ISI.position();
            try {
                int computeUInt32SizeNoTag = computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int position2 = this.getHighResolutionOutputSizeshNQ4ISI.position() + computeUInt32SizeNoTag2;
                    androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, position2);
                    try {
                        androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, this.getHighResolutionOutputSizeshNQ4ISI);
                        int position3 = this.getHighResolutionOutputSizeshNQ4ISI.position();
                        androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, position);
                        writeUInt32NoTag(position3 - position2);
                        androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, position3);
                        return;
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
                    }
                }
                writeUInt32NoTag(androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(str));
                try {
                    androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, this.getHighResolutionOutputSizeshNQ4ISI);
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
                }
            } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e3) {
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, position);
                getHighSpeedVideoFpsRanges(str, e3);
            } catch (java.lang.IllegalArgumentException e4) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void flush() {
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI.position());
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.getHighResolutionOutputSizeshNQ4ISI.remaining();
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.getHighResolutionOutputSizeshNQ4ISI.position() - this.Camera2StreamConfigurationMap;
        }
    }

    /* loaded from: classes7.dex */
    static final class UnsafeDirectNioEncoder extends androidx.content.preferences.protobuf.CodedOutputStream {
        private final long Camera2StreamConfigurationMap;
        private final long getHighResolutionOutputSizeshNQ4ISI;
        private final java.nio.ByteBuffer getHighSpeedVideoSizes;
        private long getHighSpeedVideoSizesFor;
        private final long getInputFormats;
        private final java.nio.ByteBuffer getOutputFormats;
        private final long getOutputMinFrameDuration;

        UnsafeDirectNioEncoder(java.nio.ByteBuffer byteBuffer) {
            super((byte) 0);
            this.getOutputFormats = byteBuffer;
            this.getHighSpeedVideoSizes = byteBuffer.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
            long highSpeedVideoSizes = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(byteBuffer);
            this.Camera2StreamConfigurationMap = highSpeedVideoSizes;
            long position = byteBuffer.position() + highSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = position;
            long limit = highSpeedVideoSizes + byteBuffer.limit();
            this.getInputFormats = limit;
            this.getOutputMinFrameDuration = limit - 10;
            this.getHighSpeedVideoSizesFor = position;
        }

        static boolean getHighSpeedVideoSizes() {
            return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes();
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, i2));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) throws java.io.IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) throws java.io.IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z) throws java.io.IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, java.lang.String str) throws java.io.IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr) throws java.io.IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        final void getHighSpeedVideoFpsRangesFor(int i, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(((androidx.content.preferences.protobuf.AbstractMessageLite) messageLite).getHighResolutionOutputSizeshNQ4ISI(schema));
            schema.getHighResolutionOutputSizeshNQ4ISI(messageLite, this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte b) throws java.io.IOException {
            long j = this.getHighSpeedVideoSizesFor;
            long j2 = this.getInputFormats;
            if (j >= j2) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), 1));
            }
            this.getHighSpeedVideoSizesFor = 1 + j;
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j, b);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeUInt32NoTag(byteString.size());
            byteString.getHighResolutionOutputSizeshNQ4ISI(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(i2);
            write(bArr, 0, i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(duplicate);
            write(duplicate);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i) throws java.io.IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i) throws java.io.IOException {
            if (this.getHighSpeedVideoSizesFor <= this.getOutputMinFrameDuration) {
                while ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    long j = this.getHighSpeedVideoSizesFor;
                    this.getHighSpeedVideoSizesFor = j + 1;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
                long j2 = this.getHighSpeedVideoSizesFor;
                this.getHighSpeedVideoSizesFor = 1 + j2;
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.getHighSpeedVideoSizesFor;
                long j4 = this.getInputFormats;
                if (j3 >= j4) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j4), 1));
                }
                if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                    this.getHighSpeedVideoSizesFor = 1 + j3;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) i);
                    return;
                } else {
                    this.getHighSpeedVideoSizesFor = j3 + 1;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i) throws java.io.IOException {
            this.getHighSpeedVideoSizes.putInt((int) (this.getHighSpeedVideoSizesFor - this.Camera2StreamConfigurationMap), i);
            this.getHighSpeedVideoSizesFor += 4;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j) throws java.io.IOException {
            if (this.getHighSpeedVideoSizesFor <= this.getOutputMinFrameDuration) {
                while ((j & (-128)) != 0) {
                    long j2 = this.getHighSpeedVideoSizesFor;
                    this.getHighSpeedVideoSizesFor = j2 + 1;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                long j3 = this.getHighSpeedVideoSizesFor;
                this.getHighSpeedVideoSizesFor = 1 + j3;
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.getHighSpeedVideoSizesFor;
                long j5 = this.getInputFormats;
                if (j4 >= j5) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j5), 1));
                }
                if ((j & (-128)) == 0) {
                    this.getHighSpeedVideoSizesFor = 1 + j4;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) j);
                    return;
                } else {
                    this.getHighSpeedVideoSizesFor = j4 + 1;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j4, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j) throws java.io.IOException {
            this.getHighSpeedVideoSizes.putLong((int) (this.getHighSpeedVideoSizesFor - this.Camera2StreamConfigurationMap), j);
            this.getHighSpeedVideoSizesFor += 8;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = this.getInputFormats;
                long j2 = i2;
                long j3 = this.getHighSpeedVideoSizesFor;
                if (j - j2 >= j3) {
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, i, j3, j2);
                    this.getHighSpeedVideoSizesFor += j2;
                    return;
                }
            }
            if (bArr == null) {
                throw new java.lang.NullPointerException(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            }
            throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.getHighSpeedVideoSizesFor), java.lang.Long.valueOf(this.getInputFormats), java.lang.Integer.valueOf(i2)));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            try {
                int remaining = byteBuffer.remaining();
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, (int) (this.getHighSpeedVideoSizesFor - this.Camera2StreamConfigurationMap));
                this.getHighSpeedVideoSizes.put(byteBuffer);
                this.getHighSpeedVideoSizesFor += remaining;
            } catch (java.nio.BufferOverflowException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            write(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(java.lang.String str) throws java.io.IOException {
            long j = this.getHighSpeedVideoSizesFor;
            try {
                int computeUInt32SizeNoTag = computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                    int highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(str);
                    writeUInt32NoTag(highResolutionOutputSizeshNQ4ISI);
                    androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, (int) (this.getHighSpeedVideoSizesFor - this.Camera2StreamConfigurationMap));
                    androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, this.getHighSpeedVideoSizes);
                    this.getHighSpeedVideoSizesFor += highResolutionOutputSizeshNQ4ISI;
                    return;
                }
                int i = ((int) (this.getHighSpeedVideoSizesFor - this.Camera2StreamConfigurationMap)) + computeUInt32SizeNoTag2;
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, i);
                androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, this.getHighSpeedVideoSizes);
                int position = this.getHighSpeedVideoSizes.position() - i;
                writeUInt32NoTag(position);
                this.getHighSpeedVideoSizesFor += position;
            } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e) {
                this.getHighSpeedVideoSizesFor = j;
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, (int) (j - this.Camera2StreamConfigurationMap));
                getHighSpeedVideoFpsRanges(str, e);
            } catch (java.lang.IllegalArgumentException e2) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            } catch (java.lang.IndexOutOfBoundsException e3) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e3);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void flush() {
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getOutputFormats, (int) (this.getHighSpeedVideoSizesFor - this.Camera2StreamConfigurationMap));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return (int) (this.getInputFormats - this.getHighSpeedVideoSizesFor);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return (int) (this.getHighSpeedVideoSizesFor - this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    static abstract class AbstractBufferedEncoder extends androidx.content.preferences.protobuf.CodedOutputStream {
        final int Camera2StreamConfigurationMap;
        final byte[] getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;
        int getOutputMinFrameDuration;

        AbstractBufferedEncoder(int i) {
            super((byte) 0);
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
            }
            int max = java.lang.Math.max(i, 20);
            this.getHighResolutionOutputSizeshNQ4ISI = new byte[max];
            this.Camera2StreamConfigurationMap = max;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new java.lang.UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.getOutputMinFrameDuration;
        }

        final void getHighSpeedVideoFpsRanges(int i) {
            if (androidx.content.preferences.protobuf.CodedOutputStream.getHighSpeedVideoSizes) {
                long j = this.getHighSpeedVideoSizes;
                while ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i2 = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = i2 + 1;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, i2, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
                byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = i3 + 1;
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, i3, (byte) i);
                this.getOutputMinFrameDuration += (int) (this.getHighSpeedVideoSizes - j);
                return;
            }
            while ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i4 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = i4 + 1;
                bArr3[i4] = (byte) ((i | 128) & 255);
                this.getOutputMinFrameDuration++;
                i >>>= 7;
            }
            byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i5 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i5 + 1;
            bArr4[i5] = (byte) i;
            this.getOutputMinFrameDuration++;
        }

        final void Camera2StreamConfigurationMap(long j) {
            if (androidx.content.preferences.protobuf.CodedOutputStream.getHighSpeedVideoSizes) {
                long j2 = this.getHighSpeedVideoSizes;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = i + 1;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i2 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = i2 + 1;
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr2, i2, (byte) j);
                this.getOutputMinFrameDuration += (int) (this.getHighSpeedVideoSizes - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) | 128) & 255);
                this.getOutputMinFrameDuration++;
                j >>>= 7;
            }
            byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i4 + 1;
            bArr4[i4] = (byte) j;
            this.getOutputMinFrameDuration++;
        }

        final void Camera2StreamConfigurationMap(int i) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoSizes;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            this.getHighSpeedVideoSizes = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            this.getOutputMinFrameDuration += 4;
        }

        final void getHighSpeedVideoFpsRangesFor(long j) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizes;
            bArr[i] = (byte) (j & 255);
            bArr[i + 1] = (byte) ((j >> 8) & 255);
            bArr[i + 2] = (byte) ((j >> 16) & 255);
            bArr[i + 3] = (byte) (255 & (j >> 24));
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            this.getHighSpeedVideoSizes = i + 8;
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
            this.getOutputMinFrameDuration += 8;
        }
    }

    /* loaded from: classes7.dex */
    static final class ByteOutputEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final androidx.content.preferences.protobuf.ByteOutput getInputFormats;

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, i2));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) throws java.io.IOException {
            getHighSpeedVideoSizes(20);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
            if (i2 >= 0) {
                getHighSpeedVideoFpsRanges(i2);
            } else {
                Camera2StreamConfigurationMap(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) throws java.io.IOException {
            getHighSpeedVideoSizes(20);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
            getHighSpeedVideoFpsRanges(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) throws java.io.IOException {
            getHighSpeedVideoSizes(14);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 5));
            Camera2StreamConfigurationMap(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) throws java.io.IOException {
            getHighSpeedVideoSizes(20);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
            Camera2StreamConfigurationMap(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) throws java.io.IOException {
            getHighSpeedVideoSizes(18);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 1));
            getHighSpeedVideoFpsRangesFor(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z) throws java.io.IOException {
            getHighSpeedVideoSizes(11);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
            byte b = z ? (byte) 1 : (byte) 0;
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 + 1;
            bArr[i2] = b;
            this.getOutputMinFrameDuration++;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, java.lang.String str) throws java.io.IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr) throws java.io.IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeUInt32NoTag(byteString.size());
            byteString.getHighResolutionOutputSizeshNQ4ISI(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(i2);
            write(bArr, 0, i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(duplicate);
            write(duplicate);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        final void getHighSpeedVideoFpsRangesFor(int i, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(((androidx.content.preferences.protobuf.AbstractMessageLite) messageLite).getHighResolutionOutputSizeshNQ4ISI(schema));
            schema.getHighResolutionOutputSizeshNQ4ISI(messageLite, this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte b) throws java.io.IOException {
            if (this.getHighSpeedVideoSizes == this.Camera2StreamConfigurationMap) {
                this.getInputFormats.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoSizes = 0;
            }
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i + 1;
            bArr[i] = b;
            this.getOutputMinFrameDuration++;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i) throws java.io.IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i) throws java.io.IOException {
            getHighSpeedVideoSizes(5);
            getHighSpeedVideoFpsRanges(i);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i) throws java.io.IOException {
            getHighSpeedVideoSizes(4);
            Camera2StreamConfigurationMap(i);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j) throws java.io.IOException {
            getHighSpeedVideoSizes(10);
            Camera2StreamConfigurationMap(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j) throws java.io.IOException {
            getHighSpeedVideoSizes(8);
            getHighSpeedVideoFpsRangesFor(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(java.lang.String str) throws java.io.IOException {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = computeUInt32SizeNoTag(length);
            int i = computeUInt32SizeNoTag + length;
            if (i > this.Camera2StreamConfigurationMap) {
                byte[] bArr = new byte[length];
                int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, bArr, 0, length);
                writeUInt32NoTag(Camera2StreamConfigurationMap);
                writeLazy(bArr, 0, Camera2StreamConfigurationMap);
                return;
            }
            if (i > this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes) {
                this.getInputFormats.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoSizes = 0;
            }
            int i2 = this.getHighSpeedVideoSizes;
            try {
                int computeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    this.getHighSpeedVideoSizes = i2 + computeUInt32SizeNoTag2;
                    int Camera2StreamConfigurationMap2 = androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes);
                    this.getHighSpeedVideoSizes = i2;
                    int i3 = (Camera2StreamConfigurationMap2 - i2) - computeUInt32SizeNoTag2;
                    getHighSpeedVideoFpsRanges(i3);
                    this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap2;
                    this.getOutputMinFrameDuration += i3;
                    return;
                }
                int highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(str);
                getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI);
                this.getHighSpeedVideoSizes = androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI);
                this.getOutputMinFrameDuration += highResolutionOutputSizeshNQ4ISI;
            } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e) {
                this.getOutputMinFrameDuration -= this.getHighSpeedVideoSizes - i2;
                this.getHighSpeedVideoSizes = i2;
                getHighSpeedVideoFpsRanges(str, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void flush() throws java.io.IOException {
            if (this.getHighSpeedVideoSizes > 0) {
                this.getInputFormats.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoSizes = 0;
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            flush();
            this.getInputFormats.write(bArr, i, i2);
            this.getOutputMinFrameDuration += i2;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException {
            flush();
            this.getInputFormats.writeLazy(bArr, i, i2);
            this.getOutputMinFrameDuration += i2;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            flush();
            int remaining = byteBuffer.remaining();
            this.getInputFormats.write(byteBuffer);
            this.getOutputMinFrameDuration += remaining;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            flush();
            int remaining = byteBuffer.remaining();
            this.getInputFormats.writeLazy(byteBuffer);
            this.getOutputMinFrameDuration += remaining;
        }

        private void getHighSpeedVideoSizes(int i) throws java.io.IOException {
            if (this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes < i) {
                this.getInputFormats.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoSizes = 0;
            }
        }
    }

    static final class OutputStreamEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final java.io.OutputStream getInputSizeshNQ4ISI;

        OutputStreamEncoder(java.io.OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new java.lang.NullPointerException("out");
            }
            this.getInputSizeshNQ4ISI = outputStream;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, i2));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) throws java.io.IOException {
            getHighSpeedVideoSizes(20);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
            if (i2 >= 0) {
                getHighSpeedVideoFpsRanges(i2);
            } else {
                Camera2StreamConfigurationMap(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) throws java.io.IOException {
            getHighSpeedVideoSizes(20);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
            getHighSpeedVideoFpsRanges(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) throws java.io.IOException {
            getHighSpeedVideoSizes(14);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 5));
            Camera2StreamConfigurationMap(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) throws java.io.IOException {
            getHighSpeedVideoSizes(20);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
            Camera2StreamConfigurationMap(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) throws java.io.IOException {
            getHighSpeedVideoSizes(18);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 1));
            getHighSpeedVideoFpsRangesFor(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z) throws java.io.IOException {
            getHighSpeedVideoSizes(11);
            getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0));
            byte b = z ? (byte) 1 : (byte) 0;
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 + 1;
            bArr[i2] = b;
            this.getOutputMinFrameDuration++;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, java.lang.String str) throws java.io.IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr) throws java.io.IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeUInt32NoTag(byteString.size());
            byteString.getHighResolutionOutputSizeshNQ4ISI(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(i2);
            write(bArr, 0, i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(duplicate);
            write(duplicate);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        final void getHighSpeedVideoFpsRangesFor(int i, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(((androidx.content.preferences.protobuf.AbstractMessageLite) messageLite).getHighResolutionOutputSizeshNQ4ISI(schema));
            schema.getHighResolutionOutputSizeshNQ4ISI(messageLite, this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i, androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(androidx.content.preferences.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte b) throws java.io.IOException {
            if (this.getHighSpeedVideoSizes == this.Camera2StreamConfigurationMap) {
                this.getInputSizeshNQ4ISI.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoSizes = 0;
            }
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i + 1;
            bArr[i] = b;
            this.getOutputMinFrameDuration++;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i) throws java.io.IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i) throws java.io.IOException {
            getHighSpeedVideoSizes(5);
            getHighSpeedVideoFpsRanges(i);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i) throws java.io.IOException {
            getHighSpeedVideoSizes(4);
            Camera2StreamConfigurationMap(i);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j) throws java.io.IOException {
            getHighSpeedVideoSizes(10);
            Camera2StreamConfigurationMap(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j) throws java.io.IOException {
            getHighSpeedVideoSizes(8);
            getHighSpeedVideoFpsRangesFor(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(java.lang.String str) throws java.io.IOException {
            int highResolutionOutputSizeshNQ4ISI;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = computeUInt32SizeNoTag(length);
                int i = computeUInt32SizeNoTag + length;
                if (i > this.Camera2StreamConfigurationMap) {
                    byte[] bArr = new byte[length];
                    int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, bArr, 0, length);
                    writeUInt32NoTag(Camera2StreamConfigurationMap);
                    writeLazy(bArr, 0, Camera2StreamConfigurationMap);
                    return;
                }
                if (i > this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes) {
                    this.getInputSizeshNQ4ISI.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizes);
                    this.getHighSpeedVideoSizes = 0;
                }
                int computeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                int i2 = this.getHighSpeedVideoSizes;
                try {
                    try {
                        if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                            this.getHighSpeedVideoSizes = i2 + computeUInt32SizeNoTag2;
                            int Camera2StreamConfigurationMap2 = androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes);
                            this.getHighSpeedVideoSizes = i2;
                            highResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap2 - i2) - computeUInt32SizeNoTag2;
                            getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI);
                            this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap2;
                        } else {
                            highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(str);
                            getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI);
                            this.getHighSpeedVideoSizes = androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(str, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI);
                        }
                        this.getOutputMinFrameDuration += highResolutionOutputSizeshNQ4ISI;
                    } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e) {
                        this.getOutputMinFrameDuration -= this.getHighSpeedVideoSizes - i2;
                        this.getHighSpeedVideoSizes = i2;
                        throw e;
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
                }
            } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e3) {
                getHighSpeedVideoFpsRanges(str, e3);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void flush() throws java.io.IOException {
            if (this.getHighSpeedVideoSizes > 0) {
                this.getInputSizeshNQ4ISI.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoSizes = 0;
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            if (this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes >= i2) {
                java.lang.System.arraycopy(bArr, i, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, i2);
                this.getHighSpeedVideoSizes += i2;
                this.getOutputMinFrameDuration += i2;
                return;
            }
            int i3 = this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(bArr, i, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, i3);
            int i4 = i + i3;
            int i5 = i2 - i3;
            this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration += i3;
            this.getInputSizeshNQ4ISI.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizes = 0;
            if (i5 <= this.Camera2StreamConfigurationMap) {
                java.lang.System.arraycopy(bArr, i4, this.getHighResolutionOutputSizeshNQ4ISI, 0, i5);
                this.getHighSpeedVideoSizes = i5;
            } else {
                this.getInputSizeshNQ4ISI.write(bArr, i4, i5);
            }
            this.getOutputMinFrameDuration += i5;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            int remaining = byteBuffer.remaining();
            if (this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes >= remaining) {
                byteBuffer.get(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, remaining);
                this.getHighSpeedVideoSizes += remaining;
                this.getOutputMinFrameDuration += remaining;
                return;
            }
            int i = this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes;
            byteBuffer.get(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, i);
            int i2 = remaining - i;
            this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration += i;
            this.getInputSizeshNQ4ISI.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizes = 0;
            while (i2 > this.Camera2StreamConfigurationMap) {
                byteBuffer.get(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.Camera2StreamConfigurationMap);
                this.getInputSizeshNQ4ISI.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.Camera2StreamConfigurationMap);
                i2 -= this.Camera2StreamConfigurationMap;
                this.getOutputMinFrameDuration += this.Camera2StreamConfigurationMap;
            }
            byteBuffer.get(this.getHighResolutionOutputSizeshNQ4ISI, 0, i2);
            this.getHighSpeedVideoSizes = i2;
            this.getOutputMinFrameDuration += i2;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            write(byteBuffer);
        }

        private void getHighSpeedVideoSizes(int i) throws java.io.IOException {
            if (this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes < i) {
                this.getInputSizeshNQ4ISI.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoSizes = 0;
            }
        }
    }
}
