package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes17.dex */
class PixelParserRle extends org.apache.commons.imaging.formats.bmp.PixelParser {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.bmp.PixelParserRle.class.getName());

    PixelParserRle(org.apache.commons.imaging.formats.bmp.BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2) {
        super(bmpHeaderInfo, bArr, bArr2);
    }

    private int getSamplesPerByte() throws org.apache.commons.imaging.ImageReadException {
        if (this.bhi.bitsPerPixel == 8) {
            return 1;
        }
        if (this.bhi.bitsPerPixel == 4) {
            return 2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BMP RLE: bad BitsPerPixel: ");
        sb.append(this.bhi.bitsPerPixel);
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }

    private int[] convertDataToSamples(int i) throws org.apache.commons.imaging.ImageReadException {
        if (this.bhi.bitsPerPixel == 8) {
            return new int[]{getColorTableRGB(i)};
        }
        if (this.bhi.bitsPerPixel == 4) {
            return new int[]{getColorTableRGB(i >> 4), getColorTableRGB(i & 15)};
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BMP RLE: bad BitsPerPixel: ");
        sb.append(this.bhi.bitsPerPixel);
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }

    private int processByteOfData(int[] iArr, int i, int i2, int i3, int i4, int i5, org.apache.commons.imaging.common.ImageBuilder imageBuilder) {
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            if (i2 >= 0 && i2 < i4 && i3 >= 0 && i3 < i5) {
                imageBuilder.setRGB(i2, i3, iArr[i7 % iArr.length]);
            } else {
                java.util.logging.Logger logger = LOGGER;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("skipping bad pixel (");
                sb.append(i2);
                sb.append(",");
                sb.append(i3);
                sb.append(")");
                logger.fine(sb.toString());
            }
            i2++;
            i6++;
        }
        return i6;
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParser
    public void processImage(org.apache.commons.imaging.common.ImageBuilder imageBuilder) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i = this.bhi.width;
        int i2 = this.bhi.height;
        int i3 = i2 - 1;
        boolean z = false;
        int i4 = 0;
        while (!z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RLE (");
            sb.append(i4);
            sb.append(",");
            sb.append(i3);
            sb.append(") a");
            int readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte(sb.toString(), this.is, "BMP: Bad RLE") & 255;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("RLE (");
            sb2.append(i4);
            sb2.append(",");
            sb2.append(i3);
            sb2.append(") b");
            int readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte(sb2.toString(), this.is, "BMP: Bad RLE") & 255;
            if (readByte != 0) {
                i4 += processByteOfData(convertDataToSamples(readByte2), readByte, i4, i3, i, i2, imageBuilder);
            } else if (readByte2 == 0) {
                i3--;
                i4 = 0;
            } else if (readByte2 == 1) {
                z = true;
            } else if (readByte2 == 2) {
                i4 += org.apache.commons.imaging.common.BinaryFunctions.readByte("RLE deltaX", this.is, "BMP: Bad RLE") & 255;
                i3 -= org.apache.commons.imaging.common.BinaryFunctions.readByte("RLE deltaY", this.is, "BMP: Bad RLE") & 255;
            } else {
                int samplesPerByte = getSamplesPerByte();
                int i5 = readByte2 / samplesPerByte;
                if (readByte2 % samplesPerByte > 0) {
                    i5++;
                }
                if (i5 % 2 != 0) {
                    i5++;
                }
                byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes(com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, this.is, i5, "RLE: Absolute Mode");
                int i6 = 0;
                int i7 = i4;
                int i8 = readByte2;
                while (i8 > 0) {
                    int processByteOfData = processByteOfData(convertDataToSamples(readBytes[i6] & 255), java.lang.Math.min(i8, samplesPerByte), i7, i3, i, i2, imageBuilder);
                    i7 += processByteOfData;
                    i8 -= processByteOfData;
                    i6++;
                    samplesPerByte = samplesPerByte;
                }
                i4 = i7;
            }
        }
    }
}
