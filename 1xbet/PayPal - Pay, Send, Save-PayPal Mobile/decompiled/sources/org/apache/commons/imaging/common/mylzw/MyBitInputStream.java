package org.apache.commons.imaging.common.mylzw;

/* loaded from: classes17.dex */
public class MyBitInputStream extends java.io.InputStream {
    private int bitCache;
    private int bitsInCache;
    private final java.nio.ByteOrder byteOrder;
    private long bytesRead;
    private final java.io.InputStream is;
    private boolean tiffLZWMode;

    public MyBitInputStream(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.is = inputStream;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        return readBits(8);
    }

    public void setTiffLZWMode() {
        this.tiffLZWMode = true;
    }

    public int readBits(int i) throws java.io.IOException {
        int i2;
        while (this.bitsInCache < i) {
            int read = this.is.read();
            if (read < 0) {
                return this.tiffLZWMode ? 257 : -1;
            }
            int i3 = read & 255;
            if (this.byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
                this.bitCache = i3 | (this.bitCache << 8);
            } else {
                this.bitCache = (i3 << this.bitsInCache) | this.bitCache;
            }
            this.bytesRead++;
            this.bitsInCache += 8;
        }
        int i4 = (1 << i) - 1;
        if (this.byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            i2 = i4 & (this.bitCache >> (this.bitsInCache - i));
        } else {
            int i5 = this.bitCache;
            i2 = i4 & i5;
            this.bitCache = i5 >> i;
        }
        int i6 = this.bitsInCache - i;
        this.bitsInCache = i6;
        this.bitCache = ((1 << i6) - 1) & this.bitCache;
        return i2;
    }

    public void flushCache() {
        this.bitsInCache = 0;
        this.bitCache = 0;
    }

    public long getBytesRead() {
        return this.bytesRead;
    }
}
