package org.apache.commons.imaging.common.mylzw;

/* loaded from: classes17.dex */
public class BitsToByteInputStream extends java.io.InputStream {
    private final int desiredDepth;
    private final org.apache.commons.imaging.common.mylzw.MyBitInputStream is;

    public BitsToByteInputStream(org.apache.commons.imaging.common.mylzw.MyBitInputStream myBitInputStream, int i) {
        this.is = myBitInputStream;
        this.desiredDepth = i;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        return readBits(8);
    }

    public int readBits(int i) throws java.io.IOException {
        int readBits = this.is.readBits(i);
        int i2 = this.desiredDepth;
        return i < i2 ? readBits << (i2 - i) : i > i2 ? readBits >> (i - i2) : readBits;
    }

    public int[] readBitsArray(int i, int i2) throws java.io.IOException {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = readBits(i);
        }
        return iArr;
    }
}
