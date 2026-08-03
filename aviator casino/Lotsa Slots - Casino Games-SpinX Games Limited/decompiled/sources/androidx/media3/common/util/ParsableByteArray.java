package androidx.media3.common.util;

@com.google.errorprone.annotations.CheckReturnValue
/* loaded from: classes2.dex */
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final com.google.common.collect.ImmutableSet<java.nio.charset.Charset> SUPPORTED_CHARSETS_FOR_READLINE = com.google.common.collect.ImmutableSet.of(com.google.common.base.Charsets.US_ASCII, com.google.common.base.Charsets.UTF_8, com.google.common.base.Charsets.UTF_16, com.google.common.base.Charsets.UTF_16BE, com.google.common.base.Charsets.UTF_16LE);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }

    public void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.data, i);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public void ensureCapacity(int i) {
        if (i > capacity()) {
            this.data = java.util.Arrays.copyOf(this.data, i);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int limit() {
        return this.limit;
    }

    public void setLimit(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public byte[] getData() {
        return this.data;
    }

    public int capacity() {
        return this.data.length;
    }

    public void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public void readBytes(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        java.lang.System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public void readBytes(java.nio.ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.data, this.position, i);
        this.position += i;
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i = this.position;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public char peekChar(java.nio.charset.Charset charset) {
        androidx.media3.common.util.Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.position = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.position = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
        this.position = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | (((bArr[i] & 255) << 24) >> 8);
        this.position = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.position = i + 3;
        return ((bArr[i2] & 255) << 16) | i3;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.position = i + 3;
        return ((bArr[i2] & 255) << 16) | i3;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        this.position = i + 4;
        return (bArr[i2] & 255) | j;
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        this.position = i + 4;
        return ((bArr[i2] & 255) << 24) | j;
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 8);
        this.position = i + 4;
        return (bArr[i3] & 255) | i4;
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 16);
        this.position = i + 4;
        return ((bArr[i3] & 255) << 24) | i4;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        this.position = i + 8;
        return (bArr[i2] & 255) | j;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 7;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        this.position = i + 8;
        return ((bArr[i2] & 255) << 56) | j;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
        this.position = i + 4;
        return i2;
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + readInt);
    }

    public int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + readLittleEndianInt);
    }

    public long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + readLong);
    }

    public float readFloat() {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    public double readDouble() {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    public java.lang.String readString(int i) {
        return readString(i, com.google.common.base.Charsets.UTF_8);
    }

    public java.lang.String readString(int i, java.nio.charset.Charset charset) {
        java.lang.String str = new java.lang.String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public java.lang.String readNullTerminatedString(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.position;
        int i3 = (i2 + i) - 1;
        java.lang.String fromUtf8Bytes = androidx.media3.common.util.Util.fromUtf8Bytes(this.data, i2, (i3 >= this.limit || this.data[i3] != 0) ? i : i - 1);
        this.position += i;
        return fromUtf8Bytes;
    }

    public java.lang.String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public java.lang.String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != c) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        java.lang.String fromUtf8Bytes = androidx.media3.common.util.Util.fromUtf8Bytes(bArr, i2, i - i2);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return fromUtf8Bytes;
    }

    public java.lang.String readLine() {
        return readLine(com.google.common.base.Charsets.UTF_8);
    }

    public java.lang.String readLine(java.nio.charset.Charset charset) {
        androidx.media3.common.util.Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(com.google.common.base.Charsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        java.lang.String readString = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return readString;
        }
        skipLineTerminator(charset);
        return readString;
    }

    public long readUtf8EncodedLong() {
        int i;
        int i2;
        long j = this.data[this.position];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new java.lang.NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.data[this.position + i] & 192) != 128) {
                throw new java.lang.NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r3 & 63);
        }
        this.position += i2;
        return j;
    }

    public java.nio.charset.Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i = this.position;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.position = i + 3;
                return com.google.common.base.Charsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i2 = this.position;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.position = i2 + 2;
            return com.google.common.base.Charsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.position = i2 + 2;
        return com.google.common.base.Charsets.UTF_16LE;
    }

    private int findNextLineTerminator(java.nio.charset.Charset charset) {
        int i;
        if (charset.equals(com.google.common.base.Charsets.UTF_8) || charset.equals(com.google.common.base.Charsets.US_ASCII)) {
            i = 1;
        } else {
            if (!charset.equals(com.google.common.base.Charsets.UTF_16) && !charset.equals(com.google.common.base.Charsets.UTF_16LE) && !charset.equals(com.google.common.base.Charsets.UTF_16BE)) {
                throw new java.lang.IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.position;
        while (true) {
            int i3 = this.limit;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((charset.equals(com.google.common.base.Charsets.UTF_8) || charset.equals(com.google.common.base.Charsets.US_ASCII)) && androidx.media3.common.util.Util.isLinebreak(this.data[i2])) {
                return i2;
            }
            if (charset.equals(com.google.common.base.Charsets.UTF_16) || charset.equals(com.google.common.base.Charsets.UTF_16BE)) {
                byte[] bArr = this.data;
                if (bArr[i2] == 0 && androidx.media3.common.util.Util.isLinebreak(bArr[i2 + 1])) {
                    return i2;
                }
            }
            if (charset.equals(com.google.common.base.Charsets.UTF_16LE)) {
                byte[] bArr2 = this.data;
                if (bArr2[i2 + 1] == 0 && androidx.media3.common.util.Util.isLinebreak(bArr2[i2])) {
                    return i2;
                }
            }
            i2 += i;
        }
    }

    private void skipLineTerminator(java.nio.charset.Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    private char readCharacterIfInList(java.nio.charset.Charset charset, char[] cArr) {
        int peekCharacterAndSize = peekCharacterAndSize(charset);
        if (peekCharacterAndSize == 0) {
            return (char) 0;
        }
        char c = (char) (peekCharacterAndSize >> 16);
        if (!com.google.common.primitives.Chars.contains(cArr, c)) {
            return (char) 0;
        }
        this.position += peekCharacterAndSize & 65535;
        return c;
    }

    private int peekCharacterAndSize(java.nio.charset.Charset charset) {
        byte checkedCast;
        char fromBytes;
        int i = 1;
        if ((charset.equals(com.google.common.base.Charsets.UTF_8) || charset.equals(com.google.common.base.Charsets.US_ASCII)) && bytesLeft() >= 1) {
            checkedCast = (byte) com.google.common.primitives.Chars.checkedCast(com.google.common.primitives.UnsignedBytes.toInt(this.data[this.position]));
        } else {
            if ((charset.equals(com.google.common.base.Charsets.UTF_16) || charset.equals(com.google.common.base.Charsets.UTF_16BE)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i2 = this.position;
                fromBytes = com.google.common.primitives.Chars.fromBytes(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(com.google.common.base.Charsets.UTF_16LE) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.data;
                int i3 = this.position;
                fromBytes = com.google.common.primitives.Chars.fromBytes(bArr2[i3 + 1], bArr2[i3]);
            }
            checkedCast = (byte) fromBytes;
            i = 2;
        }
        return (com.google.common.primitives.Chars.checkedCast(checkedCast) << 16) + i;
    }
}
