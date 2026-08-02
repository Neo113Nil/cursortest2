package org.apache.commons.imaging.common.itu_t4;

/* loaded from: classes17.dex */
class BitInputStreamFlexible extends java.io.InputStream {
    private long bytesRead;
    private int cache;
    private int cacheBitsRemaining;
    private final java.io.InputStream is;

    BitInputStreamFlexible(java.io.InputStream inputStream) {
        this.is = inputStream;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.cacheBitsRemaining > 0) {
            throw new java.io.IOException("BitInputStream: incomplete bit read");
        }
        return this.is.read();
    }

    public final int readBits(int i) throws java.io.IOException {
        if (i <= 32) {
            int i2 = this.cacheBitsRemaining;
            int i3 = 0;
            if (i2 > 0) {
                if (i >= i2) {
                    int i4 = this.cache;
                    i -= i2;
                    this.cacheBitsRemaining = 0;
                    i3 = ((1 << i2) - 1) & i4;
                } else {
                    int i5 = i2 - i;
                    this.cacheBitsRemaining = i5;
                    i3 = ((1 << i) - 1) & (this.cache >> i5);
                    i = 0;
                }
            }
            while (i >= 8) {
                int read = this.is.read();
                this.cache = read;
                if (read < 0) {
                    throw new java.io.IOException("couldn't read bits");
                }
                this.bytesRead++;
                i3 = (i3 << 8) | (read & 255);
                i -= 8;
            }
            if (i <= 0) {
                return i3;
            }
            int read2 = this.is.read();
            this.cache = read2;
            if (read2 < 0) {
                throw new java.io.IOException("couldn't read bits");
            }
            this.bytesRead++;
            int i6 = 8 - i;
            this.cacheBitsRemaining = i6;
            return (i3 << i) | ((read2 >> i6) & ((1 << i) - 1));
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
