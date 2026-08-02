package org.apache.commons.imaging.common.mylzw;

/* loaded from: classes17.dex */
public class MyBitOutputStream extends java.io.OutputStream {
    private int bitCache;
    private int bitsInCache;
    private final java.nio.ByteOrder byteOrder;
    private int bytesWritten;
    private final java.io.OutputStream os;

    public MyBitOutputStream(java.io.OutputStream outputStream, java.nio.ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.os = outputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        writeBits(i, 8);
    }

    public void writeBits(int i, int i2) throws java.io.IOException {
        int i3 = i & ((1 << i2) - 1);
        if (this.byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            this.bitCache = i3 | (this.bitCache << i2);
        } else {
            this.bitCache = (i3 << this.bitsInCache) | this.bitCache;
        }
        this.bitsInCache += i2;
        while (this.bitsInCache >= 8) {
            if (this.byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
                actualWrite((this.bitCache >> (this.bitsInCache - 8)) & 255);
                this.bitsInCache -= 8;
            } else {
                actualWrite(this.bitCache & 255);
                this.bitCache >>= 8;
                this.bitsInCache -= 8;
            }
            this.bitCache = ((1 << this.bitsInCache) - 1) & this.bitCache;
        }
    }

    private void actualWrite(int i) throws java.io.IOException {
        this.os.write(i);
        this.bytesWritten++;
    }

    public void flushCache() throws java.io.IOException {
        int i = this.bitsInCache;
        if (i > 0) {
            int i2 = ((1 << i) - 1) & this.bitCache;
            if (this.byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
                this.os.write(i2 << (8 - this.bitsInCache));
            } else {
                this.os.write(i2);
            }
        }
        this.bitsInCache = 0;
        this.bitCache = 0;
    }

    public int getBytesWritten() {
        return this.bytesWritten + (this.bitsInCache > 0 ? 1 : 0);
    }
}
