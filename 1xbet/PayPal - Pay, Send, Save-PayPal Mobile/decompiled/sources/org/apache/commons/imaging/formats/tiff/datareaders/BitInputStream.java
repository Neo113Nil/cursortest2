package org.apache.commons.imaging.formats.tiff.datareaders;

/* loaded from: classes17.dex */
class BitInputStream extends java.io.InputStream {
    private final java.nio.ByteOrder byteOrder;
    private long bytesRead;
    private int cache;
    private int cacheBitsRemaining;
    private final java.io.InputStream is;

    BitInputStream(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        this.is = inputStream;
        this.byteOrder = byteOrder;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.cacheBitsRemaining > 0) {
            throw new java.io.IOException("BitInputStream: incomplete bit read");
        }
        return this.is.read();
    }

    public final int readBits(int i) throws java.io.IOException {
        if (i < 8) {
            if (this.cacheBitsRemaining == 0) {
                this.cache = this.is.read();
                this.cacheBitsRemaining = 8;
                this.bytesRead++;
            }
            int i2 = this.cacheBitsRemaining;
            if (i > i2) {
                throw new java.io.IOException("BitInputStream: can't read bit fields across bytes");
            }
            int i3 = i2 - i;
            this.cacheBitsRemaining = i3;
            int i4 = this.cache >> i3;
            switch (i) {
                case 1:
                    return i4 & 1;
                case 2:
                    return i4 & 3;
                case 3:
                    return i4 & 7;
                case 4:
                    return i4 & 15;
                case 5:
                    return i4 & 31;
                case 6:
                    return i4 & 63;
                case 7:
                    return i4 & 127;
            }
        }
        if (this.cacheBitsRemaining > 0) {
            throw new java.io.IOException("BitInputStream: incomplete bit read");
        }
        if (i == 8) {
            this.bytesRead++;
            return this.is.read();
        }
        if (this.byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            if (i == 16) {
                this.bytesRead += 2;
                return (this.is.read() << 8) | this.is.read();
            }
            if (i == 24) {
                this.bytesRead += 3;
                return (this.is.read() << 16) | (this.is.read() << 8) | this.is.read();
            }
            if (i == 32) {
                this.bytesRead += 4;
                return (this.is.read() << 24) | (this.is.read() << 16) | (this.is.read() << 8) | this.is.read();
            }
        } else {
            if (i == 16) {
                this.bytesRead += 2;
                return this.is.read() | (this.is.read() << 8);
            }
            if (i == 24) {
                this.bytesRead += 3;
                return this.is.read() | (this.is.read() << 8) | (this.is.read() << 16);
            }
            if (i == 32) {
                this.bytesRead += 4;
                return this.is.read() | (this.is.read() << 8) | (this.is.read() << 16) | (this.is.read() << 24);
            }
        }
        throw new java.io.IOException("BitInputStream: unknown error");
    }

    public void flushCache() {
        this.cacheBitsRemaining = 0;
    }

    public long getBytesRead() {
        return this.bytesRead;
    }
}
