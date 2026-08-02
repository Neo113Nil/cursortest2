package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import com.google.common.collect.M;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

@Deprecated
/* loaded from: classes4.dex */
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final M<Charset> SUPPORTED_CHARSETS_FOR_READLINE = M.i(5, com.google.common.base.e.a, com.google.common.base.e.c, com.google.common.base.e.f, com.google.common.base.e.d, com.google.common.base.e.e);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private int findNextLineTerminator(Charset charset) {
        int i;
        if (charset.equals(com.google.common.base.e.c) || charset.equals(com.google.common.base.e.a)) {
            i = 1;
        } else {
            if (!charset.equals(com.google.common.base.e.f) && !charset.equals(com.google.common.base.e.e) && !charset.equals(com.google.common.base.e.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.position;
        while (true) {
            int i3 = this.limit;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((charset.equals(com.google.common.base.e.c) || charset.equals(com.google.common.base.e.a)) && Util.isLinebreak(this.data[i2])) {
                break;
            }
            if (charset.equals(com.google.common.base.e.f) || charset.equals(com.google.common.base.e.d)) {
                byte[] bArr = this.data;
                if (bArr[i2] == 0 && Util.isLinebreak(bArr[i2 + 1])) {
                    break;
                }
            }
            if (charset.equals(com.google.common.base.e.e)) {
                byte[] bArr2 = this.data;
                if (bArr2[i2 + 1] == 0 && Util.isLinebreak(bArr2[i2])) {
                    break;
                }
            }
            i2 += i;
        }
        return i2;
    }

    private int peekCharacterAndSize(Charset charset) {
        byte a;
        byte b;
        int i;
        int i2 = 1;
        if ((charset.equals(com.google.common.base.e.c) || charset.equals(com.google.common.base.e.a)) && bytesLeft() >= 1) {
            a = (byte) com.google.common.primitives.a.a(this.data[this.position] & UByte.MAX_VALUE);
        } else {
            if ((charset.equals(com.google.common.base.e.f) || charset.equals(com.google.common.base.e.d)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i3 = this.position;
                byte b2 = bArr[i3];
                b = bArr[i3 + 1];
                i = b2 << 8;
            } else {
                if (!charset.equals(com.google.common.base.e.e) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.data;
                int i4 = this.position;
                byte b3 = bArr2[i4 + 1];
                b = bArr2[i4];
                i = b3 << 8;
            }
            a = (byte) ((char) ((b & UByte.MAX_VALUE) | i));
            i2 = 2;
        }
        return (com.google.common.primitives.a.a(a) << 16) + i2;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int peekCharacterAndSize = peekCharacterAndSize(charset);
        if (peekCharacterAndSize != 0) {
            char c = (char) (peekCharacterAndSize >> 16);
            for (char c2 : cArr) {
                if (c2 == c) {
                    this.position += peekCharacterAndSize & 65535;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i) {
        if (i > capacity()) {
            this.data = Arrays.copyOf(this.data, i);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i = this.position;
        return (char) ((bArr[i + 1] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8));
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & UByte.MAX_VALUE;
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    @Nullable
    public String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != c) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i2, i - i2);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return fromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 24;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 16) | i3;
        int i6 = i + 3;
        this.position = i6;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 8);
        this.position = i + 4;
        return (bArr[i6] & UByte.MAX_VALUE) | i7;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = ((bArr[i] & UByte.MAX_VALUE) << 24) >> 8;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
        this.position = i + 3;
        return (bArr[i4] & UByte.MAX_VALUE) | i5;
    }

    @Nullable
    public String readLine() {
        return readLine(com.google.common.base.e.c);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
        int i6 = i + 3;
        this.position = i6;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 16);
        this.position = i + 4;
        return ((bArr[i6] & UByte.MAX_VALUE) << 24) | i7;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
        this.position = i + 3;
        return ((bArr[i4] & UByte.MAX_VALUE) << 16) | i5;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        this.position = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.position = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.position = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.position = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.position = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.position = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.position = i + 2;
        return (short) (((bArr[i2] & UByte.MAX_VALUE) << 8) | i3);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        this.position = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.position = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
        this.position = i + 3;
        return ((bArr[i4] & UByte.MAX_VALUE) << 16) | i5;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new IllegalStateException(android.support.v4.media.a.a(readLittleEndianInt, "Top bit not zero: "));
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.position = i + 2;
        return ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        this.position = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.position = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.position = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.position = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.position = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.position = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    public String readNullTerminatedString(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.position;
        int i3 = (i2 + i) - 1;
        String fromUtf8Bytes = Util.fromUtf8Bytes(this.data, i2, (i3 >= this.limit || this.data[i3] != 0) ? i : i - 1);
        this.position += i;
        return fromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 8;
        this.position = i + 2;
        return (short) ((bArr[i2] & UByte.MAX_VALUE) | i3);
    }

    public String readString(int i) {
        return readString(i, com.google.common.base.e.c);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 8;
        this.position = i + 2;
        int i4 = (bArr[i2] & UByte.MAX_VALUE) | i3;
        this.position = i + 4;
        return i4;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        this.position = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.position = i + 4;
        return (bArr[r4] & 255) | j;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 16;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
        this.position = i + 3;
        return (bArr[i4] & UByte.MAX_VALUE) | i5;
    }

    public int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new IllegalStateException(android.support.v4.media.a.a(readInt, "Top bit not zero: "));
    }

    public long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new IllegalStateException(androidx.core.database.a.c(readLong, "Top bit not zero: "));
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 8;
        this.position = i + 2;
        return (bArr[i2] & UByte.MAX_VALUE) | i3;
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
            throw new NumberFormatException(androidx.core.database.a.c(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            if ((this.data[this.position + i] & 192) != 128) {
                throw new NumberFormatException(androidx.core.database.a.c(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.position += i2;
        return j;
    }

    @Nullable
    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i = this.position;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.position = i + 3;
                return com.google.common.base.e.c;
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
            return com.google.common.base.e.d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.position = i2 + 2;
        return com.google.common.base.e.e;
    }

    public void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.data, i);
    }

    public void setLimit(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public void setPosition(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public char peekChar(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    @Nullable
    public String readLine(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(com.google.common.base.e.a)) {
            readUtfCharsetFromBom();
        }
        String readString = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return readString;
        }
        skipLineTerminator(charset);
        return readString;
    }

    public String readString(int i, Charset charset) {
        String str = new String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.data, this.position, i);
        this.position += i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    @Nullable
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }
}
