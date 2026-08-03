package com.yandex.varioqub.protobuf.nano;

/* loaded from: classes.dex */
public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int lastTag;
    private int recursionDepth;
    private int currentLimit = Integer.MAX_VALUE;
    private int recursionLimit = DEFAULT_RECURSION_LIMIT;
    private int sizeLimit = DEFAULT_SIZE_LIMIT;

    private CodedInputByteBufferNano(byte[] bArr, int i2, int i3) {
        this.buffer = bArr;
        this.bufferStart = i2;
        this.bufferSize = i3 + i2;
        this.bufferPos = i2;
    }

    public static int decodeZigZag32(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long decodeZigZag64(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    private void recomputeBufferSizeAfterLimit() {
        int i2 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i2;
        int i3 = this.currentLimit;
        if (i2 <= i3) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i4 = i2 - i3;
        this.bufferSizeAfterLimit = i4;
        this.bufferSize = i2 - i4;
    }

    public void checkLastTagWas(int i2) {
        if (this.lastTag != i2) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i2 = this.currentLimit;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - this.bufferPos;
    }

    public byte[] getData(int i2, int i3) {
        if (i3 == 0) {
            return com.yandex.varioqub.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        }
        byte[] bArr = new byte[i3];
        java.lang.System.arraycopy(this.buffer, this.bufferStart + i2, bArr, 0, i3);
        return bArr;
    }

    public int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public void popLimit(int i2) {
        this.currentLimit = i2;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i2) {
        if (i2 < 0) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.negativeSize();
        }
        int i3 = i2 + this.bufferPos;
        int i4 = this.currentLimit;
        if (i3 > i4) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.currentLimit = i3;
        recomputeBufferSizeAfterLimit();
        return i4;
    }

    public boolean readBool() {
        return readRawVarint32() != 0;
    }

    public byte[] readBytes() {
        int readRawVarint32 = readRawVarint32();
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        if (readRawVarint32 > i2 - i3 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? com.yandex.varioqub.protobuf.nano.WireFormatNano.EMPTY_BYTES : readRawBytes(readRawVarint32);
        }
        byte[] bArr = new byte[readRawVarint32];
        java.lang.System.arraycopy(this.buffer, i3, bArr, 0, readRawVarint32);
        this.bufferPos += readRawVarint32;
        return bArr;
    }

    public double readDouble() {
        return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() {
        return readRawVarint32();
    }

    public int readFixed32() {
        return readRawLittleEndian32();
    }

    public long readFixed64() {
        return readRawLittleEndian64();
    }

    public float readFloat() {
        return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(com.yandex.varioqub.protobuf.nano.MessageNano messageNano, int i2) {
        int i3 = this.recursionDepth;
        if (i3 >= this.recursionLimit) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        this.recursionDepth = i3 + 1;
        messageNano.mergeFrom(this);
        checkLastTagWas(com.yandex.varioqub.protobuf.nano.WireFormatNano.makeTag(i2, 4));
        this.recursionDepth--;
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public void readMessage(com.yandex.varioqub.protobuf.nano.MessageNano messageNano) {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        messageNano.mergeFrom(this);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(pushLimit);
    }

    public java.lang.Object readPrimitiveField(int i2) {
        switch (i2) {
            case 1:
                return java.lang.Double.valueOf(readDouble());
            case 2:
                return java.lang.Float.valueOf(readFloat());
            case 3:
                return java.lang.Long.valueOf(readInt64());
            case 4:
                return java.lang.Long.valueOf(readUInt64());
            case 5:
                return java.lang.Integer.valueOf(readInt32());
            case 6:
                return java.lang.Long.valueOf(readFixed64());
            case 7:
                return java.lang.Integer.valueOf(readFixed32());
            case 8:
                return java.lang.Boolean.valueOf(readBool());
            case 9:
                return readString();
            case 10:
            case 11:
            default:
                throw new java.lang.IllegalArgumentException(B1.a.f(i2, "Unknown type "));
            case 12:
                return readBytes();
            case 13:
                return java.lang.Integer.valueOf(readUInt32());
            case 14:
                return java.lang.Integer.valueOf(readEnum());
            case 15:
                return java.lang.Integer.valueOf(readSFixed32());
            case 16:
                return java.lang.Long.valueOf(readSFixed64());
            case 17:
                return java.lang.Integer.valueOf(readSInt32());
            case 18:
                return java.lang.Long.valueOf(readSInt64());
        }
    }

    public byte readRawByte() {
        int i2 = this.bufferPos;
        if (i2 == this.bufferSize) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i2 + 1;
        return bArr[i2];
    }

    public byte[] readRawBytes(int i2) {
        if (i2 < 0) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.negativeSize();
        }
        int i3 = this.bufferPos;
        int i4 = i3 + i2;
        int i5 = this.currentLimit;
        if (i4 > i5) {
            skipRawBytes(i5 - i3);
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i2 > this.bufferSize - i3) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[i2];
        java.lang.System.arraycopy(this.buffer, i3, bArr, 0, i2);
        this.bufferPos += i2;
        return bArr;
    }

    public int readRawLittleEndian32() {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    public long readRawLittleEndian64() {
        return ((readRawByte() & 255) << 8) | (readRawByte() & 255) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
    }

    public int readRawVarint32() {
        int i2;
        byte readRawByte = readRawByte();
        if (readRawByte >= 0) {
            return readRawByte;
        }
        int i3 = readRawByte & Byte.MAX_VALUE;
        byte readRawByte2 = readRawByte();
        if (readRawByte2 >= 0) {
            i2 = readRawByte2 << 7;
        } else {
            i3 |= (readRawByte2 & Byte.MAX_VALUE) << 7;
            byte readRawByte3 = readRawByte();
            if (readRawByte3 >= 0) {
                i2 = readRawByte3 << 14;
            } else {
                i3 |= (readRawByte3 & Byte.MAX_VALUE) << 14;
                byte readRawByte4 = readRawByte();
                if (readRawByte4 < 0) {
                    int i4 = i3 | ((readRawByte4 & Byte.MAX_VALUE) << 21);
                    byte readRawByte5 = readRawByte();
                    int i5 = i4 | (readRawByte5 << 28);
                    if (readRawByte5 >= 0) {
                        return i5;
                    }
                    for (int i6 = 0; i6 < 5; i6++) {
                        if (readRawByte() >= 0) {
                            return i5;
                        }
                    }
                    throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.malformedVarint();
                }
                i2 = readRawByte4 << 21;
            }
        }
        return i3 | i2;
    }

    public long readRawVarint64() {
        long j2 = 0;
        for (int i2 = 0; i2 < DEFAULT_RECURSION_LIMIT; i2 += 7) {
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((readRawByte() & 128) == 0) {
                return j2;
            }
        }
        throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readSFixed32() {
        return readRawLittleEndian32();
    }

    public long readSFixed64() {
        return readRawLittleEndian64();
    }

    public int readSInt32() {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() {
        return decodeZigZag64(readRawVarint64());
    }

    public java.lang.String readString() {
        int readRawVarint32 = readRawVarint32();
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        if (readRawVarint32 > i2 - i3 || readRawVarint32 <= 0) {
            return new java.lang.String(readRawBytes(readRawVarint32), com.yandex.varioqub.protobuf.nano.InternalNano.UTF_8);
        }
        java.lang.String str = new java.lang.String(this.buffer, i3, readRawVarint32, com.yandex.varioqub.protobuf.nano.InternalNano.UTF_8);
        this.bufferPos += readRawVarint32;
        return str;
    }

    public int readTag() {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (readRawVarint32 != 0) {
            return readRawVarint32;
        }
        throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.invalidTag();
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public void resetSizeCounter() {
    }

    public void rewindToPosition(int i2) {
        int i3 = this.bufferPos;
        int i4 = this.bufferStart;
        if (i2 <= i3 - i4) {
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException(B1.a.f(i2, "Bad position "));
            }
            this.bufferPos = i4 + i2;
        } else {
            throw new java.lang.IllegalArgumentException("Position " + i2 + " is beyond current " + (this.bufferPos - this.bufferStart));
        }
    }

    public int setRecursionLimit(int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(B1.a.f(i2, "Recursion limit cannot be negative: "));
        }
        int i3 = this.recursionLimit;
        this.recursionLimit = i2;
        return i3;
    }

    public int setSizeLimit(int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(B1.a.f(i2, "Size limit cannot be negative: "));
        }
        int i3 = this.sizeLimit;
        this.sizeLimit = i2;
        return i3;
    }

    public boolean skipField(int i2) {
        int tagWireType = com.yandex.varioqub.protobuf.nano.WireFormatNano.getTagWireType(i2);
        if (tagWireType == 0) {
            readInt32();
            return true;
        }
        if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(com.yandex.varioqub.protobuf.nano.WireFormatNano.makeTag(com.yandex.varioqub.protobuf.nano.WireFormatNano.getTagFieldNumber(i2), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.invalidWireType();
        }
        readRawLittleEndian32();
        return true;
    }

    public void skipMessage() {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag));
    }

    public void skipRawBytes(int i2) {
        if (i2 < 0) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.negativeSize();
        }
        int i3 = this.bufferPos;
        int i4 = i3 + i2;
        int i5 = this.currentLimit;
        if (i4 > i5) {
            skipRawBytes(i5 - i3);
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i2 > this.bufferSize - i3) {
            throw com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.bufferPos = i4;
    }

    public static com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano newInstance(byte[] bArr, int i2, int i3) {
        return new com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano(bArr, i2, i3);
    }
}
