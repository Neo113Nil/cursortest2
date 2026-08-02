package org.apache.commons.imaging.formats.tiff.datareaders;

/* loaded from: classes17.dex */
public final class DataReaderStrips extends org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader {
    private final int bitsPerPixel;
    private final java.nio.ByteOrder byteOrder;
    private final int compression;
    private final org.apache.commons.imaging.formats.tiff.TiffImageData.Strips imageData;
    private final int rowsPerStrip;
    private int x;
    private int y;

    public DataReaderStrips(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory, org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter, int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, java.nio.ByteOrder byteOrder, int i8, org.apache.commons.imaging.formats.tiff.TiffImageData.Strips strips) {
        super(tiffDirectory, photometricInterpreter, iArr, i2, i3, i4, i5, i6);
        this.bitsPerPixel = i;
        this.compression = i7;
        this.rowsPerStrip = i8;
        this.imageData = strips;
        this.byteOrder = byteOrder;
    }

    private void interpretStrip(org.apache.commons.imaging.common.ImageBuilder imageBuilder, byte[] bArr, int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (this.y >= i2) {
            return;
        }
        if (this.sampleFormat == 3) {
            int i3 = i / this.width;
            int i4 = this.y;
            if (i4 + i3 > i2) {
                i3 = i2 - i4;
            }
            int i5 = i4 + i3;
            this.x = 0;
            this.y = i5;
            int[] unpackFloatingPointSamples = unpackFloatingPointSamples(this.width, i5 - i4, this.width, bArr, this.predictor, this.bitsPerPixel, this.byteOrder);
            int i6 = 0;
            while (i4 < i5) {
                int i7 = 0;
                while (i7 < this.width) {
                    this.photometricInterpreter.interpretPixel(imageBuilder, new int[]{unpackFloatingPointSamples[i6]}, i7, i4);
                    i7++;
                    i6++;
                }
                i4++;
            }
            return;
        }
        boolean isHomogenous = isHomogenous(8);
        int i8 = 2;
        if (this.predictor != 2 && this.bitsPerPixel == 8 && isHomogenous) {
            int i9 = i / this.width;
            int i10 = this.y;
            if (i10 + i9 > i2) {
                i9 = i2 - i10;
            }
            this.x = 0;
            int i11 = i9 + i10;
            this.y = i11;
            int i12 = 0;
            while (i10 < i11) {
                int i13 = 0;
                while (i13 < this.width) {
                    this.photometricInterpreter.interpretPixel(imageBuilder, new int[]{bArr[i12] & 255}, i13, i10);
                    i13++;
                    i12++;
                }
                i10++;
            }
            return;
        }
        if (this.bitsPerPixel == 24 && isHomogenous && (this.photometricInterpreter instanceof org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb)) {
            int i14 = i / this.width;
            int i15 = this.y;
            if (i15 + i14 > i2) {
                i14 = i2 - i15;
            }
            int i16 = i14 + i15;
            this.x = 0;
            this.y = i16;
            if (this.predictor == 2) {
                int i17 = i15;
                int i18 = 0;
                while (i17 < i16) {
                    int i19 = bArr[i18] & 255;
                    int i20 = bArr[i18 + 1] & 255;
                    int i21 = bArr[i18 + i8] & 255;
                    i18 += 3;
                    int i22 = i20;
                    int i23 = i19;
                    for (int i24 = 1; i24 < this.width; i24++) {
                        i23 = (bArr[i18] + i23) & 255;
                        int i25 = i18 + 1;
                        bArr[i18] = (byte) i23;
                        i22 = (bArr[i25] + i22) & 255;
                        int i26 = i18 + 2;
                        bArr[i25] = (byte) i22;
                        i21 = (bArr[i26] + i21) & 255;
                        i18 += 3;
                        bArr[i26] = (byte) i21;
                    }
                    i17++;
                    i8 = 2;
                }
            }
            int i27 = 0;
            while (i15 < i16) {
                int i28 = 0;
                while (i28 < this.width) {
                    imageBuilder.setRGB(i28, i15, (((bArr[i27] << 8) | (bArr[i27 + 1] & 255)) << 8) | (-16777216) | (bArr[i27 + 2] & 255));
                    i28++;
                    i27 += 3;
                }
                i15++;
            }
            return;
        }
        org.apache.commons.imaging.formats.tiff.datareaders.BitInputStream bitInputStream = new org.apache.commons.imaging.formats.tiff.datareaders.BitInputStream(new java.io.ByteArrayInputStream(bArr), this.byteOrder);
        try {
            int[] iArr = new int[this.bitsPerSampleLength];
            resetPredictor();
            for (int i29 = 0; i29 < i; i29++) {
                getSamplesAsBytes(bitInputStream, iArr);
                if (this.x < this.width) {
                    iArr = applyPredictor(iArr);
                    this.photometricInterpreter.interpretPixel(imageBuilder, iArr, this.x, this.y);
                }
                int i30 = this.x + 1;
                this.x = i30;
                if (i30 >= this.width) {
                    this.x = 0;
                    resetPredictor();
                    this.y++;
                    bitInputStream.flushCache();
                    if (this.y >= i2) {
                        break;
                    }
                }
            }
            bitInputStream.close();
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public final void readImageData(org.apache.commons.imaging.common.ImageBuilder imageBuilder) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        for (int i = 0; i < this.imageData.getImageDataLength(); i++) {
            long j = this.rowsPerStrip & 4294967295L;
            long min = java.lang.Math.min(this.height - (i * j), j);
            interpretStrip(imageBuilder, decompress(this.imageData.getImageData(i).getData(), this.compression, (int) ((((this.bitsPerPixel * this.width) + 7) / 8) * min), this.width, (int) min), (int) (this.width * min), this.height);
        }
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public final java.awt.image.BufferedImage readImageData(java.awt.Rectangle rectangle) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i = rectangle.y / this.rowsPerStrip;
        int i2 = rectangle.y;
        int i3 = rectangle.height;
        int i4 = this.rowsPerStrip;
        int i5 = ((i2 + i3) - 1) / i4;
        int i6 = ((i5 - i) + 1) * i4;
        int i7 = i * i4;
        int i8 = rectangle.y;
        int i9 = rectangle.height;
        org.apache.commons.imaging.common.ImageBuilder imageBuilder = new org.apache.commons.imaging.common.ImageBuilder(this.width, i6, false);
        for (int i10 = i; i10 <= i5; i10++) {
            long j = this.rowsPerStrip & 4294967295L;
            long min = java.lang.Math.min(this.height - (i10 * j), j);
            interpretStrip(imageBuilder, decompress(this.imageData.getImageData(i10).getData(), this.compression, (int) ((((this.bitsPerPixel * this.width) + 7) / 8) * min), this.width, (int) min), (int) (this.width * min), (i8 - i7) + i9);
        }
        if (rectangle.x == 0 && rectangle.y == i7 && rectangle.width == this.width && rectangle.height == i6) {
            return imageBuilder.getBufferedImage();
        }
        return imageBuilder.getSubimage(rectangle.x, rectangle.y - i7, rectangle.width, rectangle.height);
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public final org.apache.commons.imaging.formats.tiff.TiffRasterData readRasterData(java.awt.Rectangle rectangle) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i;
        int i2;
        int i3;
        int i4;
        if (rectangle != null) {
            int i5 = rectangle.x;
            int i6 = rectangle.y;
            i = rectangle.width;
            i2 = rectangle.height;
            i3 = i5;
            i4 = i6;
        } else {
            i = this.width;
            i2 = this.height;
            i3 = 0;
            i4 = 0;
        }
        int i7 = i;
        float[] fArr = new float[i7 * i2];
        int i8 = this.rowsPerStrip;
        int i9 = i4 / i8;
        for (int i10 = ((i4 + i2) - 1) / i8; i9 <= i10; i10 = i10) {
            int i11 = i9 * this.rowsPerStrip;
            int min = java.lang.Math.min(this.height - i11, this.rowsPerStrip);
            transferBlockToRaster(0, i11, this.width, min, unpackFloatingPointSamples(this.width, min, this.width, decompress(this.imageData.getImageData(i9).getData(), this.compression, min * (((this.bitsPerPixel * this.width) + 7) / 8), this.width, min), this.predictor, this.bitsPerPixel, this.byteOrder), i3, i4, i7, i2, fArr);
            i9++;
        }
        return new org.apache.commons.imaging.formats.tiff.TiffRasterData(i7, i2, fArr);
    }
}
