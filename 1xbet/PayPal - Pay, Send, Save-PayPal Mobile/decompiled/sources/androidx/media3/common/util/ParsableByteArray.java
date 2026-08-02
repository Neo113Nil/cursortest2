package androidx.media3.common.util;

@com.google.errorprone.annotations.CheckReturnValue
/* loaded from: classes7.dex */
public final class ParsableByteArray {
    public static final int INVALID_CODE_POINT = 1114112;
    private byte[] Camera2StreamConfigurationMap;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private static final char[] getHighResolutionOutputSizeshNQ4ISI = {'\r', '\n'};
    private static final char[] getHighSpeedVideoSizes = {'\n'};
    private static final com.google.common.collect.ImmutableSet<java.nio.charset.Charset> getHighSpeedVideoFpsRangesFor = com.google.common.collect.ImmutableSet.of(java.nio.charset.StandardCharsets.US_ASCII, java.nio.charset.StandardCharsets.UTF_8, java.nio.charset.StandardCharsets.UTF_16, java.nio.charset.StandardCharsets.UTF_16BE, java.nio.charset.StandardCharsets.UTF_16LE);
    private static final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean();

    public ParsableByteArray() {
        this.Camera2StreamConfigurationMap = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    }

    public ParsableByteArray(int i) {
        this.Camera2StreamConfigurationMap = new byte[i];
        this.getOutputMinFrameDuration = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.Camera2StreamConfigurationMap = bArr;
        this.getOutputMinFrameDuration = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.Camera2StreamConfigurationMap = bArr;
        this.getOutputMinFrameDuration = i;
    }

    public final void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.Camera2StreamConfigurationMap, i);
    }

    public final void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public final void reset(byte[] bArr, int i) {
        this.Camera2StreamConfigurationMap = bArr;
        this.getOutputMinFrameDuration = i;
        this.getOutputFormats = 0;
    }

    public final void ensureCapacity(int i) {
        if (i > capacity()) {
            this.Camera2StreamConfigurationMap = java.util.Arrays.copyOf(this.Camera2StreamConfigurationMap, i);
        }
    }

    public final int bytesLeft() {
        return java.lang.Math.max(this.getOutputMinFrameDuration - this.getOutputFormats, 0);
    }

    public final int limit() {
        return this.getOutputMinFrameDuration;
    }

    public final void setLimit(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0 && i <= this.Camera2StreamConfigurationMap.length);
        this.getOutputMinFrameDuration = i;
    }

    public final int getPosition() {
        return this.getOutputFormats;
    }

    public final void setPosition(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0 && i <= this.getOutputMinFrameDuration);
        this.getOutputFormats = i;
    }

    public final byte[] getData() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int capacity() {
        return this.Camera2StreamConfigurationMap.length;
    }

    public final void skipBytes(int i) {
        setPosition(this.getOutputFormats + i);
    }

    public final void readBytes(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    public final void readBytes(byte[] bArr, int i, int i2) {
        getHighSpeedVideoFpsRanges(i2);
        java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, this.getOutputFormats, bArr, i, i2);
        this.getOutputFormats += i2;
    }

    public final void readBytes(java.nio.ByteBuffer byteBuffer, int i) {
        getHighSpeedVideoFpsRanges(i);
        byteBuffer.put(this.Camera2StreamConfigurationMap, this.getOutputFormats, i);
        this.getOutputFormats += i;
    }

    public final int peekUnsignedByte() {
        getHighSpeedVideoFpsRanges(1);
        return this.Camera2StreamConfigurationMap[this.getOutputFormats] & 255;
    }

    public final char peekChar() {
        return getHighSpeedVideoSizes(java.nio.ByteOrder.BIG_ENDIAN, 0);
    }

    @java.lang.Deprecated
    public final char peekChar(java.nio.charset.Charset charset) {
        int peekUnsignedByte;
        com.google.common.base.Preconditions.checkArgument(getHighSpeedVideoFpsRangesFor.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() == 0) {
            return (char) 0;
        }
        if (charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            peekUnsignedByte = peekUnsignedByte();
        } else if (charset.equals(java.nio.charset.StandardCharsets.UTF_8)) {
            if ((this.Camera2StreamConfigurationMap[this.getOutputFormats] & 128) != 0) {
                return (char) 0;
            }
            peekUnsignedByte = peekUnsignedByte();
        } else {
            if (bytesLeft() < 2) {
                return (char) 0;
            }
            return getHighSpeedVideoSizes(charset.equals(java.nio.charset.StandardCharsets.UTF_16LE) ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN, 0);
        }
        return (char) peekUnsignedByte;
    }

    private char getHighSpeedVideoSizes(java.nio.ByteOrder byteOrder, int i) {
        getHighSpeedVideoFpsRanges(2);
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            int i2 = this.getOutputFormats + i;
            return com.google.common.primitives.Chars.fromBytes(bArr[i2], bArr[i2 + 1]);
        }
        byte[] bArr2 = this.Camera2StreamConfigurationMap;
        int i3 = this.getOutputFormats + i;
        return com.google.common.primitives.Chars.fromBytes(bArr2[i3 + 1], bArr2[i3]);
    }

    public final int peekCodePoint(java.nio.charset.Charset charset) {
        return getHighSpeedVideoFpsRanges(charset) != 0 ? com.google.common.primitives.Ints.checkedCast(r3 >>> 8) : INVALID_CODE_POINT;
    }

    public final int peekUnsignedInt24() {
        if (bytesLeft() < 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("position=");
            sb.append(this.getOutputFormats);
            sb.append(", limit=");
            sb.append(this.getOutputMinFrameDuration);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        int readUnsignedInt24 = readUnsignedInt24();
        this.getOutputFormats -= 3;
        return readUnsignedInt24;
    }

    public final int peekInt() {
        if (bytesLeft() < 4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("position=");
            sb.append(this.getOutputFormats);
            sb.append(", limit=");
            sb.append(this.getOutputMinFrameDuration);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        int readInt = readInt();
        this.getOutputFormats -= 4;
        return readInt;
    }

    public final int readUnsignedByte() {
        getHighSpeedVideoFpsRanges(1);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        this.getOutputFormats = i + 1;
        return bArr[i] & 255;
    }

    public final int readUnsignedShort() {
        getHighSpeedVideoFpsRanges(2);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        int i2 = i + 1;
        byte b = bArr[i];
        this.getOutputFormats = i + 2;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    public final int readLittleEndianUnsignedShort() {
        getHighSpeedVideoFpsRanges(2);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        int i2 = i + 1;
        byte b = bArr[i];
        this.getOutputFormats = i + 2;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    public final short readShort() {
        getHighSpeedVideoFpsRanges(2);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        int i2 = i + 1;
        byte b = bArr[i];
        this.getOutputFormats = i + 2;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    public final short readLittleEndianShort() {
        getHighSpeedVideoFpsRanges(2);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        int i2 = i + 1;
        byte b = bArr[i];
        this.getOutputFormats = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | (b & 255));
    }

    public final int readUnsignedInt24() {
        getHighSpeedVideoFpsRanges(3);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.getOutputFormats = i + 3;
        return (bArr[i2] & 255) | ((b2 & 255) << 8) | ((b & 255) << 16);
    }

    public final int readInt24() {
        getHighSpeedVideoFpsRanges(3);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.getOutputFormats = i + 3;
        return (bArr[i2] & 255) | ((b2 & 255) << 8) | (((b & 255) << 24) >> 8);
    }

    public final int readLittleEndianInt24() {
        getHighSpeedVideoFpsRanges(3);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.getOutputFormats = i + 3;
        return ((bArr[i2] & 255) << 16) | ((b2 & 255) << 8) | (b & 255);
    }

    public final int readLittleEndianUnsignedInt24() {
        getHighSpeedVideoFpsRanges(3);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.getOutputFormats = i + 3;
        return ((bArr[i2] & 255) << 16) | ((b2 & 255) << 8) | (b & 255);
    }

    public final long readUnsignedInt() {
        getHighSpeedVideoFpsRanges(4);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        int i2 = i + 3;
        long j3 = bArr[i + 2];
        this.getOutputFormats = i + 4;
        return (bArr[i2] & 255) | ((255 & j3) << 8) | ((j & 255) << 24) | ((j2 & 255) << 16);
    }

    public final long readLittleEndianUnsignedInt() {
        getHighSpeedVideoFpsRanges(4);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        int i2 = i + 3;
        long j3 = bArr[i + 2];
        this.getOutputFormats = i + 4;
        return ((bArr[i2] & 255) << 24) | ((255 & j3) << 16) | (j & 255) | ((j2 & 255) << 8);
    }

    public final int readInt() {
        getHighSpeedVideoFpsRanges(4);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.getOutputFormats = i + 4;
        return (bArr[i2] & 255) | ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8);
    }

    public final int readLittleEndianInt() {
        getHighSpeedVideoFpsRanges(4);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.getOutputFormats = i + 4;
        return ((bArr[i2] & 255) << 24) | ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16);
    }

    public final long readLong() {
        getHighSpeedVideoFpsRanges(8);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        int i2 = i + 7;
        long j7 = bArr[i + 6];
        this.getOutputFormats = i + 8;
        return ((j7 & 255) << 8) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | (bArr[i2] & 255);
    }

    public final long readLittleEndianLong() {
        getHighSpeedVideoFpsRanges(8);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        int i2 = i + 7;
        long j7 = bArr[i + 6];
        this.getOutputFormats = i + 8;
        return ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((bArr[i2] & 255) << 56);
    }

    public final int readUnsignedFixedPoint1616() {
        getHighSpeedVideoFpsRanges(4);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getOutputFormats;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        this.getOutputFormats = i + 4;
        return (b2 & 255) | ((b & 255) << 8);
    }

    public final int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public final int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: ".concat(java.lang.String.valueOf(readInt)));
    }

    public final int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: ".concat(java.lang.String.valueOf(readLittleEndianInt)));
    }

    public final long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: ".concat(java.lang.String.valueOf(readLong)));
    }

    public final float readFloat() {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    public final double readDouble() {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    public final java.lang.String readString(int i) {
        return readString(i, java.nio.charset.StandardCharsets.UTF_8);
    }

    public final java.lang.String readString(int i, java.nio.charset.Charset charset) {
        getHighSpeedVideoFpsRanges(i);
        java.lang.String str = new java.lang.String(this.Camera2StreamConfigurationMap, this.getOutputFormats, i, charset);
        this.getOutputFormats += i;
        return str;
    }

    public final java.lang.String readNullTerminatedString(int i) {
        getHighSpeedVideoFpsRanges(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.getOutputFormats;
        int i3 = (i2 + i) - 1;
        java.lang.String fromUtf8Bytes = androidx.media3.common.util.Util.fromUtf8Bytes(this.Camera2StreamConfigurationMap, i2, (i3 >= this.getOutputMinFrameDuration || this.Camera2StreamConfigurationMap[i3] != 0) ? i : i - 1);
        this.getOutputFormats += i;
        return fromUtf8Bytes;
    }

    public final java.lang.String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public final java.lang.String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.getOutputFormats;
        while (i < this.getOutputMinFrameDuration && this.Camera2StreamConfigurationMap[i] != c) {
            i++;
        }
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i2 = this.getOutputFormats;
        java.lang.String fromUtf8Bytes = androidx.media3.common.util.Util.fromUtf8Bytes(bArr, i2, i - i2);
        this.getOutputFormats = i;
        if (i < this.getOutputMinFrameDuration) {
            this.getOutputFormats = i + 1;
        }
        return fromUtf8Bytes;
    }

    public final java.lang.String readLine() {
        return readLine(java.nio.charset.StandardCharsets.UTF_8);
    }

    public final java.lang.String readLine(java.nio.charset.Charset charset) {
        int i;
        com.google.common.base.Preconditions.checkArgument(getHighSpeedVideoFpsRangesFor.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        if (charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            i = 1;
        } else {
            if (!charset.equals(java.nio.charset.StandardCharsets.UTF_16) && !charset.equals(java.nio.charset.StandardCharsets.UTF_16LE) && !charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                throw new java.lang.IllegalArgumentException("Unsupported charset: ".concat(java.lang.String.valueOf(charset)));
            }
            i = 2;
        }
        int i2 = this.getOutputFormats;
        while (true) {
            int i3 = this.getOutputMinFrameDuration;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) && androidx.media3.common.util.Util.isLinebreak(this.Camera2StreamConfigurationMap[i2])) {
                break;
            }
            if (charset.equals(java.nio.charset.StandardCharsets.UTF_16) || charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.Camera2StreamConfigurationMap;
                if (bArr[i2] == 0 && androidx.media3.common.util.Util.isLinebreak(bArr[i2 + 1])) {
                    break;
                }
            }
            if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.Camera2StreamConfigurationMap;
                if (bArr2[i2 + 1] == 0 && androidx.media3.common.util.Util.isLinebreak(bArr2[i2])) {
                    break;
                }
            }
            i2 += i;
        }
        java.lang.String readString = readString(i2 - this.getOutputFormats, charset);
        if (this.getOutputFormats != this.getOutputMinFrameDuration && getHighSpeedVideoSizes(charset, getHighResolutionOutputSizeshNQ4ISI) == '\r') {
            getHighSpeedVideoSizes(charset, getHighSpeedVideoSizes);
        }
        return readString;
    }

    public final long readUtf8EncodedLong() {
        int i;
        getHighSpeedVideoFpsRanges(1);
        long j = this.Camera2StreamConfigurationMap[this.getOutputFormats];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r6 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new java.lang.NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(java.lang.String.valueOf(j)));
        }
        getHighSpeedVideoFpsRanges(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.Camera2StreamConfigurationMap[this.getOutputFormats + i3] & com.visa.cbp.getEncExpo.startTransaction) != 128) {
                throw new java.lang.NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(java.lang.String.valueOf(j)));
            }
            j = (j << 6) | (r4 & 63);
        }
        this.getOutputFormats += i;
        return j;
    }

    public final long readUnsignedLeb128ToLong() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.getOutputFormats == this.getOutputMinFrameDuration) {
                throw new java.lang.IllegalStateException("Attempting to read a byte over the limit.");
            }
            long readUnsignedByte = readUnsignedByte();
            j |= (127 & readUnsignedByte) << (i * 7);
            if ((readUnsignedByte & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public final int readUnsignedLeb128ToInt() {
        return com.google.common.primitives.Ints.checkedCast(readUnsignedLeb128ToLong());
    }

    public final void skipLeb128() {
        while ((readUnsignedByte() & 128) != 0) {
        }
    }

    public final java.nio.charset.Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            int i = this.getOutputFormats;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.getOutputFormats = i + 3;
                return java.nio.charset.StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.Camera2StreamConfigurationMap;
        int i2 = this.getOutputFormats;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.getOutputFormats = i2 + 2;
            return java.nio.charset.StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.getOutputFormats = i2 + 2;
        return java.nio.charset.StandardCharsets.UTF_16LE;
    }

    public static void setShouldEnforceLimitOnLegacyMethods(boolean z) {
        getHighSpeedVideoFpsRanges.set(z);
    }

    private char getHighSpeedVideoSizes(java.nio.charset.Charset charset, char[] cArr) {
        int highSpeedVideoFpsRanges;
        if (bytesLeft() < Camera2StreamConfigurationMap(charset) || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(charset)) == 0) {
            return (char) 0;
        }
        int checkedCast = com.google.common.primitives.UnsignedInts.checkedCast(highSpeedVideoFpsRanges >>> 8);
        if (java.lang.Character.isSupplementaryCodePoint(checkedCast)) {
            return (char) 0;
        }
        char checkedCast2 = com.google.common.primitives.Chars.checkedCast(checkedCast);
        if (!com.google.common.primitives.Chars.contains(cArr, checkedCast2)) {
            return (char) 0;
        }
        this.getOutputFormats += com.google.common.primitives.Ints.checkedCast(highSpeedVideoFpsRanges & 255);
        return checkedCast2;
    }

    private int getHighSpeedVideoFpsRanges(java.nio.charset.Charset charset) {
        int i;
        int i2;
        int i3;
        com.google.common.base.Preconditions.checkArgument(getHighSpeedVideoFpsRangesFor.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() < Camera2StreamConfigurationMap(charset)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("position=");
            sb.append(this.getOutputFormats);
            sb.append(", limit=");
            sb.append(this.getOutputMinFrameDuration);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        int i4 = 1;
        if (charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            byte b = this.Camera2StreamConfigurationMap[this.getOutputFormats];
            if ((b & 128) != 0) {
                return 0;
            }
            i = com.google.common.primitives.UnsignedBytes.toInt(b);
        } else if (!charset.equals(java.nio.charset.StandardCharsets.UTF_8)) {
            java.nio.ByteOrder byteOrder = charset.equals(java.nio.charset.StandardCharsets.UTF_16LE) ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN;
            char highSpeedVideoSizes = getHighSpeedVideoSizes(byteOrder, 0);
            if (!java.lang.Character.isHighSurrogate(highSpeedVideoSizes) || bytesLeft() < 4) {
                i = highSpeedVideoSizes;
                i4 = 2;
            } else {
                i = java.lang.Character.toCodePoint(highSpeedVideoSizes, getHighSpeedVideoSizes(byteOrder, 2));
                i4 = 4;
            }
        } else {
            byte b2 = this.Camera2StreamConfigurationMap[this.getOutputFormats];
            if ((b2 & 128) == 0) {
                i2 = 1;
            } else if ((b2 & 224) == 192 && bytesLeft() >= 2 && (this.Camera2StreamConfigurationMap[this.getOutputFormats + 1] & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                i2 = 2;
            } else {
                if ((this.Camera2StreamConfigurationMap[this.getOutputFormats] & com.visa.cbp.getEncExpo.onUnminimized) == 224 && bytesLeft() >= 3) {
                    byte[] bArr = this.Camera2StreamConfigurationMap;
                    int i5 = this.getOutputFormats;
                    if ((bArr[i5 + 1] & com.visa.cbp.getEncExpo.startTransaction) == 128 && (bArr[i5 + 2] & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                        i2 = 3;
                    }
                }
                if ((this.Camera2StreamConfigurationMap[this.getOutputFormats] & 248) == 240 && bytesLeft() >= 4) {
                    byte[] bArr2 = this.Camera2StreamConfigurationMap;
                    int i6 = this.getOutputFormats;
                    if ((bArr2[i6 + 1] & com.visa.cbp.getEncExpo.startTransaction) == 128 && (bArr2[i6 + 2] & com.visa.cbp.getEncExpo.startTransaction) == 128 && (bArr2[i6 + 3] & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                        i2 = 4;
                    }
                }
                i2 = 0;
            }
            if (i2 == 1) {
                i3 = com.google.common.primitives.UnsignedBytes.toInt(this.Camera2StreamConfigurationMap[this.getOutputFormats]);
            } else if (i2 == 2) {
                byte[] bArr3 = this.Camera2StreamConfigurationMap;
                int i7 = this.getOutputFormats;
                i3 = getHighSpeedVideoFpsRangesFor(0, 0, bArr3[i7], bArr3[i7 + 1]);
            } else if (i2 == 3) {
                byte[] bArr4 = this.Camera2StreamConfigurationMap;
                int i8 = this.getOutputFormats;
                i3 = getHighSpeedVideoFpsRangesFor(0, bArr4[i8] & com.google.common.base.Ascii.SI, bArr4[i8 + 1], bArr4[i8 + 2]);
            } else {
                if (i2 != 4) {
                    return 0;
                }
                byte[] bArr5 = this.Camera2StreamConfigurationMap;
                int i9 = this.getOutputFormats;
                i3 = getHighSpeedVideoFpsRangesFor(bArr5[i9], bArr5[i9 + 1], bArr5[i9 + 2], bArr5[i9 + 3]);
            }
            i4 = i2;
            i = i3;
        }
        return (i << 8) | i4;
    }

    private static int Camera2StreamConfigurationMap(java.nio.charset.Charset charset) {
        com.google.common.base.Preconditions.checkArgument(getHighSpeedVideoFpsRangesFor.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        if (!getHighSpeedVideoFpsRanges.get() || bytesLeft() >= i) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("bytesNeeded= ");
        sb.append(i);
        sb.append(", bytesLeft=");
        sb.append(bytesLeft());
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return com.google.common.primitives.Ints.fromBytes((byte) 0, com.google.common.primitives.UnsignedBytes.checkedCast(((i & 7) << 2) | ((i2 & 48) >> 4)), com.google.common.primitives.UnsignedBytes.checkedCast(((((byte) i2) & com.google.common.base.Ascii.SI) << 4) | ((b & 60) >> 2)), com.google.common.primitives.UnsignedBytes.checkedCast(((b & 3) << 6) | (((byte) i4) & 63)));
    }
}
