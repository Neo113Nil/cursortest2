package com.google.zxing.common;

/* loaded from: classes9.dex */
public final class BitSource {
    private int bitOffset;
    private int byteOffset;
    private final byte[] bytes;

    public BitSource(byte[] bArr) {
        this.bytes = bArr;
    }

    public final int getBitOffset() {
        return this.bitOffset;
    }

    public final int getByteOffset() {
        return this.byteOffset;
    }

    public final int readBits(int i) {
        if (i <= 0 || i > 32 || i > available()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(i));
        }
        int i2 = this.bitOffset;
        int i3 = 0;
        if (i2 > 0) {
            int i4 = 8 - i2;
            int min = java.lang.Math.min(i, i4);
            int i5 = i4 - min;
            byte[] bArr = this.bytes;
            int i6 = this.byteOffset;
            byte b = bArr[i6];
            i -= min;
            int i7 = this.bitOffset + min;
            this.bitOffset = i7;
            if (i7 == 8) {
                this.bitOffset = 0;
                this.byteOffset = i6 + 1;
            }
            i3 = (((255 >> (8 - min)) << i5) & b) >> i5;
        }
        if (i > 0) {
            while (i >= 8) {
                byte[] bArr2 = this.bytes;
                int i8 = this.byteOffset;
                i3 = (i3 << 8) | (bArr2[i8] & 255);
                this.byteOffset = i8 + 1;
                i -= 8;
            }
            if (i > 0) {
                int i9 = 8 - i;
                byte b2 = this.bytes[this.byteOffset];
                this.bitOffset += i;
                return (i3 << i) | ((((255 >> i9) << i9) & b2) >> i9);
            }
        }
        return i3;
    }

    public final int available() {
        return ((this.bytes.length - this.byteOffset) * 8) - this.bitOffset;
    }
}
