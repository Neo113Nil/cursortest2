package io.appmetrica.analytics.protobuf.nano;

import B0.c;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes.dex */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private static final int MAX_UTF8_EXPANSION = 3;
    private final ByteBuffer buffer;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int i3, int i4) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i3 + " limit " + i4 + ").");
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i3, int i4) {
        this(ByteBuffer.wrap(bArr, i3, i4));
    }

    public static int computeBoolSize(int i3, boolean z3) {
        return computeBoolSizeNoTag(z3) + computeTagSize(i3);
    }

    public static int computeBoolSizeNoTag(boolean z3) {
        return 1;
    }

    public static int computeBytesSize(int i3, byte[] bArr) {
        return computeBytesSizeNoTag(bArr) + computeTagSize(i3);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeDoubleSize(int i3, double d3) {
        return computeDoubleSizeNoTag(d3) + computeTagSize(i3);
    }

    public static int computeDoubleSizeNoTag(double d3) {
        return 8;
    }

    public static int computeEnumSize(int i3, int i4) {
        return computeEnumSizeNoTag(i4) + computeTagSize(i3);
    }

    public static int computeEnumSizeNoTag(int i3) {
        return computeRawVarint32Size(i3);
    }

    public static int computeFieldSize(int i3, int i4, Object obj) {
        switch (i4) {
            case 1:
                return computeDoubleSize(i3, ((Double) obj).doubleValue());
            case 2:
                return computeFloatSize(i3, ((Float) obj).floatValue());
            case 3:
                return computeInt64Size(i3, ((Long) obj).longValue());
            case 4:
                return computeUInt64Size(i3, ((Long) obj).longValue());
            case 5:
                return computeInt32Size(i3, ((Integer) obj).intValue());
            case 6:
                return computeFixed64Size(i3, ((Long) obj).longValue());
            case 7:
                return computeFixed32Size(i3, ((Integer) obj).intValue());
            case 8:
                return computeBoolSize(i3, ((Boolean) obj).booleanValue());
            case 9:
                return computeStringSize(i3, (String) obj);
            case 10:
                return computeGroupSize(i3, (MessageNano) obj);
            case 11:
                return computeMessageSize(i3, (MessageNano) obj);
            case 12:
                return computeBytesSize(i3, (byte[]) obj);
            case 13:
                return computeUInt32Size(i3, ((Integer) obj).intValue());
            case 14:
                return computeEnumSize(i3, ((Integer) obj).intValue());
            case 15:
                return computeSFixed32Size(i3, ((Integer) obj).intValue());
            case 16:
                return computeSFixed64Size(i3, ((Long) obj).longValue());
            case 17:
                return computeSInt32Size(i3, ((Integer) obj).intValue());
            case 18:
                return computeSInt64Size(i3, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException(c.h(i4, "Unknown type: "));
        }
    }

    public static int computeFixed32Size(int i3, int i4) {
        return computeFixed32SizeNoTag(i4) + computeTagSize(i3);
    }

    public static int computeFixed32SizeNoTag(int i3) {
        return 4;
    }

    public static int computeFixed64Size(int i3, long j3) {
        return computeFixed64SizeNoTag(j3) + computeTagSize(i3);
    }

    public static int computeFixed64SizeNoTag(long j3) {
        return 8;
    }

    public static int computeFloatSize(int i3, float f) {
        return computeFloatSizeNoTag(f) + computeTagSize(i3);
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    public static int computeGroupSize(int i3, MessageNano messageNano) {
        return computeGroupSizeNoTag(messageNano) + (computeTagSize(i3) * 2);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int i3, int i4) {
        return computeInt32SizeNoTag(i4) + computeTagSize(i3);
    }

    public static int computeInt32SizeNoTag(int i3) {
        if (i3 >= 0) {
            return computeRawVarint32Size(i3);
        }
        return 10;
    }

    public static int computeInt64Size(int i3, long j3) {
        return computeInt64SizeNoTag(j3) + computeTagSize(i3);
    }

    public static int computeInt64SizeNoTag(long j3) {
        return computeRawVarint64Size(j3);
    }

    public static int computeMessageSize(int i3, MessageNano messageNano) {
        return computeMessageSizeNoTag(messageNano) + computeTagSize(i3);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j3) {
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (((-16384) & j3) == 0) {
            return 2;
        }
        if (((-2097152) & j3) == 0) {
            return 3;
        }
        if (((-268435456) & j3) == 0) {
            return 4;
        }
        if (((-34359738368L) & j3) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j3) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j3) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j3) == 0) {
            return 8;
        }
        return (j3 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int i3, int i4) {
        return computeSFixed32SizeNoTag(i4) + computeTagSize(i3);
    }

    public static int computeSFixed32SizeNoTag(int i3) {
        return 4;
    }

    public static int computeSFixed64Size(int i3, long j3) {
        return computeSFixed64SizeNoTag(j3) + computeTagSize(i3);
    }

    public static int computeSFixed64SizeNoTag(long j3) {
        return 8;
    }

    public static int computeSInt32Size(int i3, int i4) {
        return computeSInt32SizeNoTag(i4) + computeTagSize(i3);
    }

    public static int computeSInt32SizeNoTag(int i3) {
        return computeRawVarint32Size(encodeZigZag32(i3));
    }

    public static int computeSInt64Size(int i3, long j3) {
        return computeSInt64SizeNoTag(j3) + computeTagSize(i3);
    }

    public static int computeSInt64SizeNoTag(long j3) {
        return computeRawVarint64Size(encodeZigZag64(j3));
    }

    public static int computeStringSize(int i3, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i3);
    }

    public static int computeStringSizeNoTag(String str) {
        int encodedLength = encodedLength(str);
        return computeRawVarint32Size(encodedLength) + encodedLength;
    }

    public static int computeTagSize(int i3) {
        return computeRawVarint32Size(WireFormatNano.makeTag(i3, 0));
    }

    public static int computeUInt32Size(int i3, int i4) {
        return computeUInt32SizeNoTag(i4) + computeTagSize(i3);
    }

    public static int computeUInt32SizeNoTag(int i3) {
        return computeRawVarint32Size(i3);
    }

    public static int computeUInt64Size(int i3, long j3) {
        return computeUInt64SizeNoTag(j3) + computeTagSize(i3);
    }

    public static int computeUInt64SizeNoTag(long j3) {
        return computeRawVarint64Size(j3);
    }

    private static void encode(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            encodeDirect(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(encode(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e3) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e3);
            throw bufferOverflowException;
        }
    }

    private static void encodeDirect(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt < 128) {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 2048) {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else {
                if (charAt >= 55296 && 57343 >= charAt) {
                    int i4 = i3 + 1;
                    if (i4 != charSequence.length()) {
                        char charAt2 = charSequence.charAt(i4);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            int codePoint = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i3 = i4;
                        } else {
                            i3 = i4;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                    sb.append(i3 - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            }
            i3++;
        }
    }

    public static int encodeZigZag32(int i3) {
        return (i3 >> 31) ^ (i3 << 1);
    }

    public static long encodeZigZag64(long j3) {
        return (j3 >> 63) ^ (j3 << 1);
    }

    private static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 < length) {
                char charAt = charSequence.charAt(i3);
                if (charAt >= 2048) {
                    i4 += encodedLengthGeneral(charSequence, i3);
                    break;
                }
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                break;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i4 + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i3) {
        int length = charSequence.length();
        int i4 = 0;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
            } else {
                i4 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i3) < 65536) {
                        throw new IllegalArgumentException(c.h(i3, "Unpaired surrogate at index "));
                    }
                    i3++;
                }
            }
            i3++;
        }
        return i4;
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int position() {
        return this.buffer.position();
    }

    public void reset() {
        this.buffer.clear();
    }

    public int spaceLeft() {
        return this.buffer.remaining();
    }

    public void writeBool(int i3, boolean z3) throws IOException {
        writeTag(i3, 0);
        writeBoolNoTag(z3);
    }

    public void writeBoolNoTag(boolean z3) throws IOException {
        writeRawByte(z3 ? 1 : 0);
    }

    public void writeBytes(int i3, byte[] bArr) throws IOException {
        writeTag(i3, 2);
        writeBytesNoTag(bArr);
    }

    public void writeBytesNoTag(byte[] bArr) throws IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeDouble(int i3, double d3) throws IOException {
        writeTag(i3, 1);
        writeDoubleNoTag(d3);
    }

    public void writeDoubleNoTag(double d3) throws IOException {
        writeRawLittleEndian64(Double.doubleToLongBits(d3));
    }

    public void writeEnum(int i3, int i4) throws IOException {
        writeTag(i3, 0);
        writeEnumNoTag(i4);
    }

    public void writeEnumNoTag(int i3) throws IOException {
        writeRawVarint32(i3);
    }

    public void writeField(int i3, int i4, Object obj) throws IOException {
        switch (i4) {
            case 1:
                writeDouble(i3, ((Double) obj).doubleValue());
                return;
            case 2:
                writeFloat(i3, ((Float) obj).floatValue());
                return;
            case 3:
                writeInt64(i3, ((Long) obj).longValue());
                return;
            case 4:
                writeUInt64(i3, ((Long) obj).longValue());
                return;
            case 5:
                writeInt32(i3, ((Integer) obj).intValue());
                return;
            case 6:
                writeFixed64(i3, ((Long) obj).longValue());
                return;
            case 7:
                writeFixed32(i3, ((Integer) obj).intValue());
                return;
            case 8:
                writeBool(i3, ((Boolean) obj).booleanValue());
                return;
            case 9:
                writeString(i3, (String) obj);
                return;
            case 10:
                writeGroup(i3, (MessageNano) obj);
                return;
            case 11:
                writeMessage(i3, (MessageNano) obj);
                return;
            case 12:
                writeBytes(i3, (byte[]) obj);
                return;
            case 13:
                writeUInt32(i3, ((Integer) obj).intValue());
                return;
            case 14:
                writeEnum(i3, ((Integer) obj).intValue());
                return;
            case 15:
                writeSFixed32(i3, ((Integer) obj).intValue());
                return;
            case 16:
                writeSFixed64(i3, ((Long) obj).longValue());
                return;
            case 17:
                writeSInt32(i3, ((Integer) obj).intValue());
                return;
            case 18:
                writeSInt64(i3, ((Long) obj).longValue());
                return;
            default:
                throw new IOException(c.h(i4, "Unknown type: "));
        }
    }

    public void writeFixed32(int i3, int i4) throws IOException {
        writeTag(i3, 5);
        writeFixed32NoTag(i4);
    }

    public void writeFixed32NoTag(int i3) throws IOException {
        writeRawLittleEndian32(i3);
    }

    public void writeFixed64(int i3, long j3) throws IOException {
        writeTag(i3, 1);
        writeFixed64NoTag(j3);
    }

    public void writeFixed64NoTag(long j3) throws IOException {
        writeRawLittleEndian64(j3);
    }

    public void writeFloat(int i3, float f) throws IOException {
        writeTag(i3, 5);
        writeFloatNoTag(f);
    }

    public void writeFloatNoTag(float f) throws IOException {
        writeRawLittleEndian32(Float.floatToIntBits(f));
    }

    public void writeGroup(int i3, MessageNano messageNano) throws IOException {
        writeTag(i3, 3);
        writeGroupNoTag(messageNano);
        writeTag(i3, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) throws IOException {
        messageNano.writeTo(this);
    }

    public void writeInt32(int i3, int i4) throws IOException {
        writeTag(i3, 0);
        writeInt32NoTag(i4);
    }

    public void writeInt32NoTag(int i3) throws IOException {
        if (i3 >= 0) {
            writeRawVarint32(i3);
        } else {
            writeRawVarint64(i3);
        }
    }

    public void writeInt64(int i3, long j3) throws IOException {
        writeTag(i3, 0);
        writeInt64NoTag(j3);
    }

    public void writeInt64NoTag(long j3) throws IOException {
        writeRawVarint64(j3);
    }

    public void writeMessage(int i3, MessageNano messageNano) throws IOException {
        writeTag(i3, 2);
        writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) throws IOException {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte b3) throws IOException {
        if (!this.buffer.hasRemaining()) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(b3);
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int i3) throws IOException {
        if (this.buffer.remaining() < 4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putInt(i3);
    }

    public void writeRawLittleEndian64(long j3) throws IOException {
        if (this.buffer.remaining() < 8) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putLong(j3);
    }

    public void writeRawVarint32(int i3) throws IOException {
        while ((i3 & (-128)) != 0) {
            writeRawByte((i3 & 127) | 128);
            i3 >>>= 7;
        }
        writeRawByte(i3);
    }

    public void writeRawVarint64(long j3) throws IOException {
        while (((-128) & j3) != 0) {
            writeRawByte((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        writeRawByte((int) j3);
    }

    public void writeSFixed32(int i3, int i4) throws IOException {
        writeTag(i3, 5);
        writeSFixed32NoTag(i4);
    }

    public void writeSFixed32NoTag(int i3) throws IOException {
        writeRawLittleEndian32(i3);
    }

    public void writeSFixed64(int i3, long j3) throws IOException {
        writeTag(i3, 1);
        writeSFixed64NoTag(j3);
    }

    public void writeSFixed64NoTag(long j3) throws IOException {
        writeRawLittleEndian64(j3);
    }

    public void writeSInt32(int i3, int i4) throws IOException {
        writeTag(i3, 0);
        writeSInt32NoTag(i4);
    }

    public void writeSInt32NoTag(int i3) throws IOException {
        writeRawVarint32(encodeZigZag32(i3));
    }

    public void writeSInt64(int i3, long j3) throws IOException {
        writeTag(i3, 0);
        writeSInt64NoTag(j3);
    }

    public void writeSInt64NoTag(long j3) throws IOException {
        writeRawVarint64(encodeZigZag64(j3));
    }

    public void writeString(int i3, String str) throws IOException {
        writeTag(i3, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) throws IOException {
        try {
            int computeRawVarint32Size = computeRawVarint32Size(str.length());
            if (computeRawVarint32Size != computeRawVarint32Size(str.length() * 3)) {
                writeRawVarint32(encodedLength(str));
                encode(str, this.buffer);
                return;
            }
            int position = this.buffer.position();
            if (this.buffer.remaining() < computeRawVarint32Size) {
                throw new OutOfSpaceException(position + computeRawVarint32Size, this.buffer.limit());
            }
            this.buffer.position(position + computeRawVarint32Size);
            encode(str, this.buffer);
            int position2 = this.buffer.position();
            this.buffer.position(position);
            writeRawVarint32((position2 - position) - computeRawVarint32Size);
            this.buffer.position(position2);
        } catch (BufferOverflowException e3) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
            outOfSpaceException.initCause(e3);
            throw outOfSpaceException;
        }
    }

    public void writeTag(int i3, int i4) throws IOException {
        writeRawVarint32(WireFormatNano.makeTag(i3, i4));
    }

    public void writeUInt32(int i3, int i4) throws IOException {
        writeTag(i3, 0);
        writeUInt32NoTag(i4);
    }

    public void writeUInt32NoTag(int i3) throws IOException {
        writeRawVarint32(i3);
    }

    public void writeUInt64(int i3, long j3) throws IOException {
        writeTag(i3, 0);
        writeUInt64NoTag(j3);
    }

    public void writeUInt64NoTag(long j3) throws IOException {
        writeRawVarint64(j3);
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int i3, int i4) {
        return new CodedOutputByteBufferNano(bArr, i3, i4);
    }

    public void writeRawBytes(byte[] bArr, int i3, int i4) throws IOException {
        if (this.buffer.remaining() < i4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(bArr, i3, i4);
    }

    public void writeRawByte(int i3) throws IOException {
        writeRawByte((byte) i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int encode(CharSequence charSequence, byte[] bArr, int i3, int i4) {
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i4 + i3;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i3) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        int i8 = i3 + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                bArr[i8] = (byte) charAt2;
                i8++;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 += 2;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i8 > i6 - 3) {
                    if (i8 <= i6 - 4) {
                        int i10 = i7 + 1;
                        if (i10 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i10);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i11 = i8 + 3;
                                bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i8 += 4;
                                bArr[i11] = (byte) ((codePoint & 63) | 128);
                                i7 = i10;
                            } else {
                                i7 = i10;
                            }
                        }
                        StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                        sb.append(i7 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                }
                bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                int i12 = i8 + 2;
                bArr[i8 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i8 += 3;
                bArr[i12] = (byte) ((charAt2 & '?') | 128);
            }
            i7++;
        }
        return i8;
    }
}
