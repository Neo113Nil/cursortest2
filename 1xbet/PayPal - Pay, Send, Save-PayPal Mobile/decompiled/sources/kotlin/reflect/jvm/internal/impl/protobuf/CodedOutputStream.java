package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public final class CodedOutputStream {
    private final java.io.OutputStream Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

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

    public static int computeRawVarint32Size(int i) {
        if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
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

    private CodedOutputStream(byte[] bArr, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = i + i2;
    }

    private CodedOutputStream(java.io.OutputStream outputStream, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = outputStream;
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighSpeedVideoSizes = bArr.length;
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance(java.io.OutputStream outputStream, int i) {
        return new kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream(outputStream, new byte[i]);
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream(bArr, i, i2);
    }

    public final void writeDouble(int i, double d) throws java.io.IOException {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public final void writeFloat(int i, float f) throws java.io.IOException {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public final void writeInt32(int i, int i2) throws java.io.IOException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public final void writeBool(int i, boolean z) throws java.io.IOException {
        writeTag(i, 0);
        writeBoolNoTag(z);
    }

    public final void writeGroup(int i, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) throws java.io.IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    public final void writeMessage(int i, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) throws java.io.IOException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    public final void writeBytes(int i, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) throws java.io.IOException {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    public final void writeUInt32(int i, int i2) throws java.io.IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public final void writeEnum(int i, int i2) throws java.io.IOException {
        writeTag(i, 0);
        writeEnumNoTag(i2);
    }

    public final void writeSInt64(int i, long j) throws java.io.IOException {
        writeTag(i, 0);
        writeSInt64NoTag(j);
    }

    public final void writeMessageSetExtension(int i, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) throws java.io.IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    public final void writeDoubleNoTag(double d) throws java.io.IOException {
        writeRawLittleEndian64(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void writeFloatNoTag(float f) throws java.io.IOException {
        writeRawLittleEndian32(java.lang.Float.floatToRawIntBits(f));
    }

    public final void writeUInt64NoTag(long j) throws java.io.IOException {
        writeRawVarint64(j);
    }

    public final void writeInt64NoTag(long j) throws java.io.IOException {
        writeRawVarint64(j);
    }

    public final void writeInt32NoTag(int i) throws java.io.IOException {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64(i);
        }
    }

    public final void writeFixed64NoTag(long j) throws java.io.IOException {
        writeRawLittleEndian64(j);
    }

    public final void writeFixed32NoTag(int i) throws java.io.IOException {
        writeRawLittleEndian32(i);
    }

    public final void writeBoolNoTag(boolean z) throws java.io.IOException {
        writeRawByte(z ? 1 : 0);
    }

    public final void writeStringNoTag(java.lang.String str) throws java.io.IOException {
        byte[] bytes = str.getBytes("UTF-8");
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public final void writeGroupNoTag(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) throws java.io.IOException {
        messageLite.writeTo(this);
    }

    public final void writeMessageNoTag(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) throws java.io.IOException {
        writeRawVarint32(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    public final void writeBytesNoTag(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) throws java.io.IOException {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public final void writeByteArrayNoTag(byte[] bArr) throws java.io.IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public final void writeUInt32NoTag(int i) throws java.io.IOException {
        writeRawVarint32(i);
    }

    public final void writeEnumNoTag(int i) throws java.io.IOException {
        writeInt32NoTag(i);
    }

    public final void writeSFixed32NoTag(int i) throws java.io.IOException {
        writeRawLittleEndian32(i);
    }

    public final void writeSFixed64NoTag(long j) throws java.io.IOException {
        writeRawLittleEndian64(j);
    }

    public final void writeSInt32NoTag(int i) throws java.io.IOException {
        writeRawVarint32(encodeZigZag32(i));
    }

    public final void writeSInt64NoTag(long j) throws java.io.IOException {
        writeRawVarint64(encodeZigZag64(j));
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeMessageSize(int i, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeBytesSize(int i, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeRawVarint32Size(i);
        }
        return 10;
    }

    public static int computeStringSizeNoTag(java.lang.String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static int computeGroupSizeNoTag(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeMessageSizeNoTag(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeLazyFieldSizeNoTag(kotlin.reflect.jvm.internal.impl.protobuf.LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeBytesSizeNoTag(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        return computeRawVarint32Size(byteString.size()) + byteString.size();
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeRawVarint64Size(encodeZigZag64(j));
    }

    private void getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
        java.io.OutputStream outputStream = this.Camera2StreamConfigurationMap;
        if (outputStream == null) {
            throw new kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.OutOfSpaceException();
        }
        outputStream.write(this.getHighSpeedVideoFpsRangesFor, 0, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges = 0;
    }

    public final void flush() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap != null) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public final int spaceLeft() {
        if (this.Camera2StreamConfigurationMap == null) {
            return this.getHighSpeedVideoSizes - this.getHighSpeedVideoFpsRanges;
        }
        throw new java.lang.UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static class OutOfSpaceException extends java.io.IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public final void writeRawByte(byte b) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoSizes) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = i + 1;
        bArr[i] = b;
        this.getHighResolutionOutputSizeshNQ4ISI++;
    }

    public final void writeRawByte(int i) throws java.io.IOException {
        writeRawByte((byte) i);
    }

    public final void writeRawBytes(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) throws java.io.IOException {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public final void writeRawBytes(byte[] bArr) throws java.io.IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.getHighSpeedVideoSizes;
        int i4 = this.getHighSpeedVideoFpsRanges;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRangesFor, i4, i2);
            this.getHighSpeedVideoFpsRanges += i2;
            this.getHighResolutionOutputSizeshNQ4ISI += i2;
            return;
        }
        java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRangesFor, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI += i5;
        getHighResolutionOutputSizeshNQ4ISI();
        if (i7 <= this.getHighSpeedVideoSizes) {
            java.lang.System.arraycopy(bArr, i6, this.getHighSpeedVideoFpsRangesFor, 0, i7);
            this.getHighSpeedVideoFpsRanges = i7;
        } else {
            this.Camera2StreamConfigurationMap.write(bArr, i6, i7);
        }
        this.getHighResolutionOutputSizeshNQ4ISI += i7;
    }

    public final void writeRawBytes(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, int i, int i2) throws java.io.IOException {
        int i3 = this.getHighSpeedVideoSizes;
        int i4 = this.getHighSpeedVideoFpsRanges;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            byteString.copyTo(this.getHighSpeedVideoFpsRangesFor, i, i4, i2);
            this.getHighSpeedVideoFpsRanges += i2;
            this.getHighResolutionOutputSizeshNQ4ISI += i2;
            return;
        }
        byteString.copyTo(this.getHighSpeedVideoFpsRangesFor, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI += i5;
        getHighResolutionOutputSizeshNQ4ISI();
        if (i7 <= this.getHighSpeedVideoSizes) {
            byteString.copyTo(this.getHighSpeedVideoFpsRangesFor, i6, 0, i7);
            this.getHighSpeedVideoFpsRanges = i7;
        } else {
            java.io.OutputStream outputStream = this.Camera2StreamConfigurationMap;
            if (i6 < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
                sb.append("Source offset < 0: ");
                sb.append(i6);
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
            if (i7 < 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(23);
                sb2.append("Length < 0: ");
                sb2.append(i7);
                throw new java.lang.IndexOutOfBoundsException(sb2.toString());
            }
            int i8 = i6 + i7;
            if (i8 > byteString.size()) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(39);
                sb3.append("Source end offset exceeded: ");
                sb3.append(i8);
                throw new java.lang.IndexOutOfBoundsException(sb3.toString());
            }
            if (i7 > 0) {
                byteString.getHighSpeedVideoFpsRangesFor(outputStream, i6, i7);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI += i7;
    }

    public final void writeTag(int i, int i2) throws java.io.IOException {
        writeRawVarint32(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getHighSpeedVideoFpsRangesFor(i, i2));
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getHighSpeedVideoFpsRangesFor(i, 0));
    }

    public final void writeRawVarint32(int i) throws java.io.IOException {
        while ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            writeRawByte((i & 127) | 128);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public final void writeRawVarint64(long j) throws java.io.IOException {
        while (((-128) & j) != 0) {
            writeRawByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        writeRawByte((int) j);
    }

    public final void writeRawLittleEndian32(int i) throws java.io.IOException {
        writeRawByte(i & 255);
        writeRawByte((i >> 8) & 255);
        writeRawByte((i >> 16) & 255);
        writeRawByte((i >> 24) & 255);
    }

    public final void writeRawLittleEndian64(long j) throws java.io.IOException {
        writeRawByte(((int) j) & 255);
        writeRawByte(((int) (j >> 8)) & 255);
        writeRawByte(((int) (j >> 16)) & 255);
        writeRawByte(((int) (j >> 24)) & 255);
        writeRawByte(((int) (j >> 32)) & 255);
        writeRawByte(((int) (j >> 40)) & 255);
        writeRawByte(((int) (j >> 48)) & 255);
        writeRawByte(((int) (j >> 56)) & 255);
    }
}
