package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes17.dex */
class PixelParserRgb extends org.apache.commons.imaging.formats.bmp.PixelParserSimple {
    private int bytecount;
    private int cachedBitCount;
    private int cachedByte;

    PixelParserRgb(org.apache.commons.imaging.formats.bmp.BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2) {
        super(bmpHeaderInfo, bArr, bArr2);
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParserSimple
    public int getNextRGB() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (this.bhi.bitsPerPixel == 1 || this.bhi.bitsPerPixel == 4) {
            if (this.cachedBitCount < this.bhi.bitsPerPixel) {
                int i = this.cachedBitCount;
                if (i != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected leftover bits: ");
                    sb.append(this.cachedBitCount);
                    sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                    sb.append(this.bhi.bitsPerPixel);
                    throw new org.apache.commons.imaging.ImageReadException(sb.toString());
                }
                this.cachedBitCount = i + 8;
                byte[] bArr = this.imageData;
                int i2 = this.bytecount;
                this.cachedByte = bArr[i2] & 255;
                this.bytecount = i2 + 1;
            }
            int i3 = this.bhi.bitsPerPixel;
            int i4 = this.cachedByte;
            int i5 = this.bhi.bitsPerPixel;
            this.cachedByte = (this.cachedByte << this.bhi.bitsPerPixel) & 255;
            this.cachedBitCount -= this.bhi.bitsPerPixel;
            return getColorTableRGB(((1 << i3) - 1) & (i4 >> (8 - i5)));
        }
        if (this.bhi.bitsPerPixel == 8) {
            int colorTableRGB = getColorTableRGB(this.imageData[this.bytecount] & 255);
            this.bytecount++;
            return colorTableRGB;
        }
        if (this.bhi.bitsPerPixel == 16) {
            int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Pixel", this.is, "BMP Image Data", java.nio.ByteOrder.LITTLE_ENDIAN);
            this.bytecount += 2;
            return ((read2Bytes & 31) << 3) | (((read2Bytes >> 10) & 31) << 19) | (-16777216) | (((read2Bytes >> 5) & 31) << 11);
        }
        if (this.bhi.bitsPerPixel == 24) {
            byte b = this.imageData[this.bytecount];
            byte b2 = this.imageData[this.bytecount + 1];
            byte[] bArr2 = this.imageData;
            int i6 = this.bytecount;
            byte b3 = bArr2[i6 + 2];
            this.bytecount = i6 + 3;
            return (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16) | (-16777216);
        }
        if (this.bhi.bitsPerPixel == 32) {
            byte b4 = this.imageData[this.bytecount];
            byte b5 = this.imageData[this.bytecount + 1];
            byte[] bArr3 = this.imageData;
            int i7 = this.bytecount;
            byte b6 = bArr3[i7 + 2];
            this.bytecount = i7 + 4;
            return (b4 & 255) | ((b5 & 255) << 8) | ((b6 & 255) << 16) | (-16777216);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown BitsPerPixel: ");
        sb2.append(this.bhi.bitsPerPixel);
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParserSimple
    public void newline() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        this.cachedBitCount = 0;
        while (this.bytecount % 4 != 0) {
            org.apache.commons.imaging.common.BinaryFunctions.readByte("Pixel", this.is, "BMP Image Data");
            this.bytecount++;
        }
    }
}
