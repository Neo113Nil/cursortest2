package com.yandex.varioqub.protobuf.nano;

import b2.AbstractC0279e;
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

        public OutOfSpaceException(int i2, int i3) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i2 + " limit " + i3 + ").");
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i2, int i3) {
        this(ByteBuffer.wrap(bArr, i2, i3));
    }

    public static int computeBoolSize(int i2, boolean z) {
        return computeBoolSizeNoTag(z) + computeTagSize(i2);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeBytesSize(int i2, byte[] bArr) {
        return computeBytesSizeNoTag(bArr) + computeTagSize(i2);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeDoubleSize(int i2, double d6) {
        return computeDoubleSizeNoTag(d6) + computeTagSize(i2);
    }

    public static int computeDoubleSizeNoTag(double d6) {
        return 8;
    }

    public static int computeEnumSize(int i2, int i3) {
        return computeEnumSizeNoTag(i3) + computeTagSize(i2);
    }

    public static int computeEnumSizeNoTag(int i2) {
        return computeRawVarint32Size(i2);
    }

    public static int computeFieldSize(int i2, int i3, Object obj) {
        switch (i3) {
            case 1:
                return computeDoubleSize(i2, ((Double) obj).doubleValue());
            case 2:
                return computeFloatSize(i2, ((Float) obj).floatValue());
            case 3:
                return computeInt64Size(i2, ((Long) obj).longValue());
            case 4:
                return computeUInt64Size(i2, ((Long) obj).longValue());
            case 5:
                return computeInt32Size(i2, ((Integer) obj).intValue());
            case 6:
                return computeFixed64Size(i2, ((Long) obj).longValue());
            case 7:
                return computeFixed32Size(i2, ((Integer) obj).intValue());
            case 8:
                return computeBoolSize(i2, ((Boolean) obj).booleanValue());
            case 9:
                return computeStringSize(i2, (String) obj);
            case 10:
                return computeGroupSize(i2, (MessageNano) obj);
            case 11:
                return computeMessageSize(i2, (MessageNano) obj);
            case 12:
                return computeBytesSize(i2, (byte[]) obj);
            case 13:
                return computeUInt32Size(i2, ((Integer) obj).intValue());
            case 14:
                return computeEnumSize(i2, ((Integer) obj).intValue());
            case 15:
                return computeSFixed32Size(i2, ((Integer) obj).intValue());
            case 16:
                return computeSFixed64Size(i2, ((Long) obj).longValue());
            case 17:
                return computeSInt32Size(i2, ((Integer) obj).intValue());
            case 18:
                return computeSInt64Size(i2, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException(AbstractC0279e.d(i3, "Unknown type: "));
        }
    }

    public static int computeFixed32Size(int i2, int i3) {
        return computeFixed32SizeNoTag(i3) + computeTagSize(i2);
    }

    public static int computeFixed32SizeNoTag(int i2) {
        return 4;
    }

    public static int computeFixed64Size(int i2, long j2) {
        return computeFixed64SizeNoTag(j2) + computeTagSize(i2);
    }

    public static int computeFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeFloatSize(int i2, float f3) {
        return computeFloatSizeNoTag(f3) + computeTagSize(i2);
    }

    public static int computeFloatSizeNoTag(float f3) {
        return 4;
    }

    public static int computeGroupSize(int i2, MessageNano messageNano) {
        return computeGroupSizeNoTag(messageNano) + (computeTagSize(i2) * 2);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int i2, int i3) {
        return computeInt32SizeNoTag(i3) + computeTagSize(i2);
    }

    public static int computeInt32SizeNoTag(int i2) {
        if (i2 >= 0) {
            return computeRawVarint32Size(i2);
        }
        return 10;
    }

    public static int computeInt64Size(int i2, long j2) {
        return computeInt64SizeNoTag(j2) + computeTagSize(i2);
    }

    public static int computeInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(j2);
    }

    public static int computeMessageSize(int i2, MessageNano messageNano) {
        return computeMessageSizeNoTag(messageNano) + computeTagSize(i2);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int i2, int i3) {
        return computeSFixed32SizeNoTag(i3) + computeTagSize(i2);
    }

    public static int computeSFixed32SizeNoTag(int i2) {
        return 4;
    }

    public static int computeSFixed64Size(int i2, long j2) {
        return computeSFixed64SizeNoTag(j2) + computeTagSize(i2);
    }

    public static int computeSFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeSInt32Size(int i2, int i3) {
        return computeSInt32SizeNoTag(i3) + computeTagSize(i2);
    }

    public static int computeSInt32SizeNoTag(int i2) {
        return computeRawVarint32Size(encodeZigZag32(i2));
    }

    public static int computeSInt64Size(int i2, long j2) {
        return computeSInt64SizeNoTag(j2) + computeTagSize(i2);
    }

    public static int computeSInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(encodeZigZag64(j2));
    }

    public static int computeStringSize(int i2, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i2);
    }

    public static int computeStringSizeNoTag(String str) {
        int encodedLength = encodedLength(str);
        return computeRawVarint32Size(encodedLength) + encodedLength;
    }

    public static int computeTagSize(int i2) {
        return computeRawVarint32Size(WireFormatNano.makeTag(i2, 0));
    }

    public static int computeUInt32Size(int i2, int i3) {
        return computeUInt32SizeNoTag(i3) + computeTagSize(i2);
    }

    public static int computeUInt32SizeNoTag(int i2) {
        return computeRawVarint32Size(i2);
    }

    public static int computeUInt64Size(int i2, long j2) {
        return computeUInt64SizeNoTag(j2) + computeTagSize(i2);
    }

    public static int computeUInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(j2);
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
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 128) {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 2048) {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else {
                if (charAt >= 55296 && 57343 >= charAt) {
                    int i3 = i2 + 1;
                    if (i3 != charSequence.length()) {
                        char charAt2 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            int codePoint = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i2 = i3;
                        } else {
                            i2 = i3;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                    sb.append(i2 - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            }
            i2++;
        }
    }

    public static int encodeZigZag32(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long encodeZigZag64(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    private static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 < length) {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 2048) {
                    i3 += encodedLengthGeneral(charSequence, i2);
                    break;
                }
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) < 65536) {
                        throw new IllegalArgumentException(AbstractC0279e.d(i2, "Unpaired surrogate at index "));
                    }
                    i2++;
                }
            }
            i2++;
        }
        return i3;
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

    public void writeBool(int i2, boolean z) {
        writeTag(i2, 0);
        writeBoolNoTag(z);
    }

    public void writeBoolNoTag(boolean z) {
        writeRawByte(z ? 1 : 0);
    }

    public void writeBytes(int i2, byte[] bArr) {
        writeTag(i2, 2);
        writeBytesNoTag(bArr);
    }

    public void writeBytesNoTag(byte[] bArr) {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeDouble(int i2, double d6) {
        writeTag(i2, 1);
        writeDoubleNoTag(d6);
    }

    public void writeDoubleNoTag(double d6) {
        writeRawLittleEndian64(Double.doubleToLongBits(d6));
    }

    public void writeEnum(int i2, int i3) {
        writeTag(i2, 0);
        writeEnumNoTag(i3);
    }

    public void writeEnumNoTag(int i2) {
        writeRawVarint32(i2);
    }

    public void writeField(int i2, int i3, Object obj) {
        switch (i3) {
            case 1:
                writeDouble(i2, ((Double) obj).doubleValue());
                return;
            case 2:
                writeFloat(i2, ((Float) obj).floatValue());
                return;
            case 3:
                writeInt64(i2, ((Long) obj).longValue());
                return;
            case 4:
                writeUInt64(i2, ((Long) obj).longValue());
                return;
            case 5:
                writeInt32(i2, ((Integer) obj).intValue());
                return;
            case 6:
                writeFixed64(i2, ((Long) obj).longValue());
                return;
            case 7:
                writeFixed32(i2, ((Integer) obj).intValue());
                return;
            case 8:
                writeBool(i2, ((Boolean) obj).booleanValue());
                return;
            case 9:
                writeString(i2, (String) obj);
                return;
            case 10:
                writeGroup(i2, (MessageNano) obj);
                return;
            case 11:
                writeMessage(i2, (MessageNano) obj);
                return;
            case 12:
                writeBytes(i2, (byte[]) obj);
                return;
            case 13:
                writeUInt32(i2, ((Integer) obj).intValue());
                return;
            case 14:
                writeEnum(i2, ((Integer) obj).intValue());
                return;
            case 15:
                writeSFixed32(i2, ((Integer) obj).intValue());
                return;
            case 16:
                writeSFixed64(i2, ((Long) obj).longValue());
                return;
            case 17:
                writeSInt32(i2, ((Integer) obj).intValue());
                return;
            case 18:
                writeSInt64(i2, ((Long) obj).longValue());
                return;
            default:
                throw new IOException(AbstractC0279e.d(i3, "Unknown type: "));
        }
    }

    public void writeFixed32(int i2, int i3) {
        writeTag(i2, 5);
        writeFixed32NoTag(i3);
    }

    public void writeFixed32NoTag(int i2) {
        writeRawLittleEndian32(i2);
    }

    public void writeFixed64(int i2, long j2) {
        writeTag(i2, 1);
        writeFixed64NoTag(j2);
    }

    public void writeFixed64NoTag(long j2) {
        writeRawLittleEndian64(j2);
    }

    public void writeFloat(int i2, float f3) {
        writeTag(i2, 5);
        writeFloatNoTag(f3);
    }

    public void writeFloatNoTag(float f3) {
        writeRawLittleEndian32(Float.floatToIntBits(f3));
    }

    public void writeGroup(int i2, MessageNano messageNano) {
        writeTag(i2, 3);
        writeGroupNoTag(messageNano);
        writeTag(i2, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) {
        messageNano.writeTo(this);
    }

    public void writeInt32(int i2, int i3) {
        writeTag(i2, 0);
        writeInt32NoTag(i3);
    }

    public void writeInt32NoTag(int i2) {
        if (i2 >= 0) {
            writeRawVarint32(i2);
        } else {
            writeRawVarint64(i2);
        }
    }

    public void writeInt64(int i2, long j2) {
        writeTag(i2, 0);
        writeInt64NoTag(j2);
    }

    public void writeInt64NoTag(long j2) {
        writeRawVarint64(j2);
    }

    public void writeMessage(int i2, MessageNano messageNano) {
        writeTag(i2, 2);
        writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte b6) {
        if (!this.buffer.hasRemaining()) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(b6);
    }

    public void writeRawBytes(byte[] bArr) {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int i2) {
        if (this.buffer.remaining() < 4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putInt(i2);
    }

    public void writeRawLittleEndian64(long j2) {
        if (this.buffer.remaining() < 8) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putLong(j2);
    }

    public void writeRawVarint32(int i2) {
        while ((i2 & (-128)) != 0) {
            writeRawByte((i2 & 127) | 128);
            i2 >>>= 7;
        }
        writeRawByte(i2);
    }

    public void writeRawVarint64(long j2) {
        while (((-128) & j2) != 0) {
            writeRawByte((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        writeRawByte((int) j2);
    }

    public void writeSFixed32(int i2, int i3) {
        writeTag(i2, 5);
        writeSFixed32NoTag(i3);
    }

    public void writeSFixed32NoTag(int i2) {
        writeRawLittleEndian32(i2);
    }

    public void writeSFixed64(int i2, long j2) {
        writeTag(i2, 1);
        writeSFixed64NoTag(j2);
    }

    public void writeSFixed64NoTag(long j2) {
        writeRawLittleEndian64(j2);
    }

    public void writeSInt32(int i2, int i3) {
        writeTag(i2, 0);
        writeSInt32NoTag(i3);
    }

    public void writeSInt32NoTag(int i2) {
        writeRawVarint32(encodeZigZag32(i2));
    }

    public void writeSInt64(int i2, long j2) {
        writeTag(i2, 0);
        writeSInt64NoTag(j2);
    }

    public void writeSInt64NoTag(long j2) {
        writeRawVarint64(encodeZigZag64(j2));
    }

    public void writeString(int i2, String str) {
        writeTag(i2, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) {
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

    public void writeTag(int i2, int i3) {
        writeRawVarint32(WireFormatNano.makeTag(i2, i3));
    }

    public void writeUInt32(int i2, int i3) {
        writeTag(i2, 0);
        writeUInt32NoTag(i3);
    }

    public void writeUInt32NoTag(int i2) {
        writeRawVarint32(i2);
    }

    public void writeUInt64(int i2, long j2) {
        writeTag(i2, 0);
        writeUInt64NoTag(j2);
    }

    public void writeUInt64NoTag(long j2) {
        writeRawVarint64(j2);
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int i2, int i3) {
        return new CodedOutputByteBufferNano(bArr, i2, i3);
    }

    public void writeRawBytes(byte[] bArr, int i2, int i3) {
        if (this.buffer.remaining() < i3) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(bArr, i2, i3);
    }

    public void writeRawByte(int i2) {
        writeRawByte((byte) i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int encode(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i6;
        char charAt;
        int length = charSequence.length();
        int i7 = i3 + i2;
        int i8 = 0;
        while (i8 < length && (i6 = i8 + i2) < i7 && (charAt = charSequence.charAt(i8)) < 128) {
            bArr[i6] = (byte) charAt;
            i8++;
        }
        int i9 = i2 + i8;
        while (i8 < length) {
            char charAt2 = charSequence.charAt(i8);
            if (charAt2 < 128 && i9 < i7) {
                bArr[i9] = (byte) charAt2;
                i9++;
            } else if (charAt2 < 2048 && i9 <= i7 - 2) {
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 >>> 6) | 960);
                i9 += 2;
                bArr[i10] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i9 > i7 - 3) {
                    if (i9 <= i7 - 4) {
                        int i11 = i8 + 1;
                        if (i11 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i11);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i12 = i9 + 3;
                                bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i9 += 4;
                                bArr[i12] = (byte) ((codePoint & 63) | 128);
                                i8 = i11;
                            } else {
                                i8 = i11;
                            }
                        }
                        StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                        sb.append(i8 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i9);
                }
                bArr[i9] = (byte) ((charAt2 >>> '\f') | 480);
                int i13 = i9 + 2;
                bArr[i9 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i9 += 3;
                bArr[i13] = (byte) ((charAt2 & '?') | 128);
            }
            i8++;
        }
        return i9;
    }
}
