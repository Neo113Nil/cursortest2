package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes17.dex */
class PixelParserBitFields extends org.apache.commons.imaging.formats.bmp.PixelParserSimple {
    private final int alphaMask;
    private final int alphaShift;
    private final int blueMask;
    private final int blueShift;
    private int bytecount;
    private final int greenMask;
    private final int greenShift;
    private final int redMask;
    private final int redShift;

    private int getMaskShift(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = 0;
        while ((i & 1) == 0) {
            i = (i >> 1) & Integer.MAX_VALUE;
            i3++;
        }
        while ((i & 1) == 1) {
            i = (i >> 1) & Integer.MAX_VALUE;
            i2++;
        }
        return i3 - (8 - i2);
    }

    PixelParserBitFields(org.apache.commons.imaging.formats.bmp.BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2) {
        super(bmpHeaderInfo, bArr, bArr2);
        int i = bmpHeaderInfo.redMask;
        this.redMask = i;
        int i2 = bmpHeaderInfo.greenMask;
        this.greenMask = i2;
        int i3 = bmpHeaderInfo.blueMask;
        this.blueMask = i3;
        int i4 = bmpHeaderInfo.alphaMask;
        this.alphaMask = i4;
        this.redShift = getMaskShift(i);
        this.greenShift = getMaskShift(i2);
        this.blueShift = getMaskShift(i3);
        this.alphaShift = i4 != 0 ? getMaskShift(i4) : 0;
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParserSimple
    public int getNextRGB() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int read2Bytes;
        if (this.bhi.bitsPerPixel == 8) {
            byte[] bArr = this.imageData;
            int i = this.bytecount;
            read2Bytes = bArr[i] & 255;
            this.bytecount = i + 1;
        } else if (this.bhi.bitsPerPixel == 24) {
            read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read3Bytes("Pixel", this.is, "BMP Image Data", java.nio.ByteOrder.LITTLE_ENDIAN);
            this.bytecount += 3;
        } else if (this.bhi.bitsPerPixel == 32) {
            read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Pixel", this.is, "BMP Image Data", java.nio.ByteOrder.LITTLE_ENDIAN);
            this.bytecount += 4;
        } else if (this.bhi.bitsPerPixel == 16) {
            read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Pixel", this.is, "BMP Image Data", java.nio.ByteOrder.LITTLE_ENDIAN);
            this.bytecount += 2;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown BitsPerPixel: ");
            sb.append(this.bhi.bitsPerPixel);
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        int i2 = this.redMask & read2Bytes;
        int i3 = this.greenMask & read2Bytes;
        int i4 = this.blueMask & read2Bytes;
        int i5 = this.alphaMask;
        int i6 = i5 != 0 ? i5 & read2Bytes : 255;
        int i7 = this.redShift;
        int i8 = i7 >= 0 ? i2 >> i7 : i2 << (-i7);
        int i9 = this.greenShift;
        int i10 = i9 >= 0 ? i3 >> i9 : i3 << (-i9);
        int i11 = this.blueShift;
        int i12 = i11 >= 0 ? i4 >> i11 : i4 << (-i11);
        int i13 = this.alphaShift;
        return (i8 << 16) | ((i13 >= 0 ? i6 >> i13 : i6 << (-i13)) << 24) | (i10 << 8) | i12;
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParserSimple
    public void newline() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        while (this.bytecount % 4 != 0) {
            org.apache.commons.imaging.common.BinaryFunctions.readByte("Pixel", this.is, "BMP Image Data");
            this.bytecount++;
        }
    }
}
