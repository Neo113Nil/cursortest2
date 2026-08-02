package org.apache.commons.imaging.formats.tiff.datareaders;

/* loaded from: classes17.dex */
public final class DataReaderTiled extends org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader {
    private final int bitsPerPixel;
    private final java.nio.ByteOrder byteOrder;
    private final int compression;
    private final org.apache.commons.imaging.formats.tiff.TiffImageData.Tiles imageData;
    private final int tileLength;
    private final int tileWidth;

    public DataReaderTiled(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory, org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter, int i, int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7, int i8, int i9, java.nio.ByteOrder byteOrder, org.apache.commons.imaging.formats.tiff.TiffImageData.Tiles tiles) {
        super(tiffDirectory, photometricInterpreter, iArr, i4, i5, i6, i7, i8);
        this.tileWidth = i;
        this.tileLength = i2;
        this.bitsPerPixel = i3;
        this.compression = i9;
        this.imageData = tiles;
        this.byteOrder = byteOrder;
    }

    private void interpretTile(org.apache.commons.imaging.common.ImageBuilder imageBuilder, byte[] bArr, int i, int i2, int i3, int i4) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i5 = i3;
        int i6 = i4;
        if (this.sampleFormat == 3) {
            int i7 = i2 + this.tileLength;
            int i8 = i7 <= i6 ? i7 : i6;
            int i9 = this.tileWidth;
            int i10 = i + i9;
            int i11 = i10 <= i5 ? i10 : i5;
            int[] iArr = new int[4];
            int[] unpackFloatingPointSamples = unpackFloatingPointSamples(i11 - i, i8 - i2, i9, bArr, this.predictor, this.bitsPerPixel, this.byteOrder);
            for (int i12 = i2; i12 < i8; i12++) {
                int i13 = this.tileWidth;
                for (int i14 = i; i14 < i11; i14++) {
                    iArr[0] = unpackFloatingPointSamples[(i14 - i) + ((i12 - i2) * i13)];
                    this.photometricInterpreter.interpretPixel(imageBuilder, iArr, i14, i12);
                }
            }
            return;
        }
        boolean isHomogenous = isHomogenous(8);
        if (this.bitsPerPixel == 24 && isHomogenous && (this.photometricInterpreter instanceof org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb)) {
            int i15 = i2 + this.tileLength;
            if (i15 <= i6) {
                i6 = i15;
            }
            int i16 = i + this.tileWidth;
            if (i16 <= i5) {
                i5 = i16;
            }
            int i17 = 2;
            if (this.predictor == 2) {
                int i18 = i2;
                while (i18 < i6) {
                    int i19 = (i18 - i2) * this.tileWidth * 3;
                    int i20 = bArr[i19] & 255;
                    int i21 = bArr[i19 + 1] & 255;
                    int i22 = i19 + 3;
                    int i23 = bArr[i19 + i17] & 255;
                    for (int i24 = 1; i24 < this.tileWidth; i24++) {
                        i20 = (bArr[i22] + i20) & 255;
                        int i25 = i22 + 1;
                        bArr[i22] = (byte) i20;
                        i21 = (bArr[i25] + i21) & 255;
                        int i26 = i22 + 2;
                        bArr[i25] = (byte) i21;
                        i23 = (bArr[i26] + i23) & 255;
                        i22 += 3;
                        bArr[i26] = (byte) i23;
                    }
                    i18++;
                    i17 = 2;
                }
            }
            for (int i27 = i2; i27 < i6; i27++) {
                int i28 = (i27 - i2) * this.tileWidth * 3;
                int i29 = i;
                while (i29 < i5) {
                    imageBuilder.setRGB(i29, i27, (((bArr[i28] << 8) | (bArr[i28 + 1] & 255)) << 8) | (-16777216) | (bArr[i28 + 2] & 255));
                    i29++;
                    i28 += 3;
                }
            }
            return;
        }
        org.apache.commons.imaging.formats.tiff.datareaders.BitInputStream bitInputStream = new org.apache.commons.imaging.formats.tiff.datareaders.BitInputStream(new java.io.ByteArrayInputStream(bArr), this.byteOrder);
        try {
            int i30 = this.tileWidth;
            int i31 = this.tileLength;
            int[] iArr2 = new int[this.bitsPerSampleLength];
            resetPredictor();
            int i32 = 0;
            int i33 = 0;
            for (int i34 = 0; i34 < i30 * i31; i34++) {
                int i35 = i32 + i;
                int i36 = i33 + i2;
                getSamplesAsBytes(bitInputStream, iArr2);
                if (i35 < i5 && i36 < i6) {
                    iArr2 = applyPredictor(iArr2);
                    this.photometricInterpreter.interpretPixel(imageBuilder, iArr2, i35, i36);
                }
                i32++;
                if (i32 >= this.tileWidth) {
                    resetPredictor();
                    i33++;
                    bitInputStream.flushCache();
                    if (i33 >= this.tileLength) {
                        break;
                    } else {
                        i32 = 0;
                    }
                }
            }
            bitInputStream.close();
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public final void readImageData(org.apache.commons.imaging.common.ImageBuilder imageBuilder) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i = (((this.tileWidth * this.bitsPerPixel) + 7) / 8) * this.tileLength;
        int i2 = 0;
        int i3 = 0;
        for (org.apache.commons.imaging.formats.tiff.TiffElement.DataElement dataElement : this.imageData.tiles) {
            interpretTile(imageBuilder, decompress(dataElement.getData(), this.compression, i, this.tileWidth, this.tileLength), i2, i3, this.width, this.height);
            i2 += this.tileWidth;
            if (i2 >= this.width) {
                i3 += this.tileLength;
                if (i3 >= this.height) {
                    return;
                } else {
                    i2 = 0;
                }
            }
        }
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public final java.awt.image.BufferedImage readImageData(java.awt.Rectangle rectangle) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled = this;
        int i = (((dataReaderTiled.tileWidth * dataReaderTiled.bitsPerPixel) + 7) / 8) * dataReaderTiled.tileLength;
        int i2 = rectangle.x / dataReaderTiled.tileWidth;
        int i3 = ((rectangle.x + rectangle.width) - 1) / dataReaderTiled.tileWidth;
        int i4 = rectangle.y / dataReaderTiled.tileLength;
        int i5 = rectangle.y;
        int i6 = rectangle.height;
        int i7 = dataReaderTiled.tileLength;
        int i8 = ((i5 + i6) - 1) / i7;
        int i9 = dataReaderTiled.tileWidth * ((i3 - i2) + 1);
        int i10 = ((i8 - i4) + 1) * i7;
        int i11 = dataReaderTiled.width;
        int i12 = dataReaderTiled.tileWidth;
        int i13 = ((i11 + i12) - 1) / i12;
        int i14 = i2 * i12;
        int i15 = i4 * dataReaderTiled.tileLength;
        org.apache.commons.imaging.common.ImageBuilder imageBuilder = new org.apache.commons.imaging.common.ImageBuilder(i9, i10, false);
        int i16 = i4;
        while (i16 <= i8) {
            int i17 = i2;
            while (i17 <= i3) {
                org.apache.commons.imaging.common.ImageBuilder imageBuilder2 = imageBuilder;
                int i18 = i15;
                int i19 = i17;
                int i20 = i16;
                interpretTile(imageBuilder2, decompress(dataReaderTiled.imageData.tiles[(i16 * i13) + i17].getData(), dataReaderTiled.compression, i, dataReaderTiled.tileWidth, dataReaderTiled.tileLength), (dataReaderTiled.tileWidth * i19) - i14, (dataReaderTiled.tileLength * i20) - i18, i9, i10);
                i17 = i19 + 1;
                i14 = i14;
                i15 = i18;
                i = i;
                i16 = i20;
                imageBuilder = imageBuilder2;
                dataReaderTiled = this;
            }
            i16++;
            i = i;
            dataReaderTiled = this;
        }
        org.apache.commons.imaging.common.ImageBuilder imageBuilder3 = imageBuilder;
        int i21 = i15;
        int i22 = i14;
        if (rectangle.x == i22 && rectangle.y == i21 && rectangle.width == i9 && rectangle.height == i10) {
            return imageBuilder3.getBufferedImage();
        }
        return imageBuilder3.getSubimage(rectangle.x - i22, rectangle.y - i21, rectangle.width, rectangle.height);
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public final org.apache.commons.imaging.formats.tiff.TiffRasterData readRasterData(java.awt.Rectangle rectangle) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i;
        int i2;
        int i3;
        int i4;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled = this;
        int i5 = dataReaderTiled.tileLength * (((dataReaderTiled.tileWidth * dataReaderTiled.bitsPerPixel) + 7) / 8);
        if (rectangle != null) {
            int i6 = rectangle.x;
            int i7 = rectangle.y;
            i = rectangle.width;
            i2 = rectangle.height;
            i3 = i6;
            i4 = i7;
        } else {
            i = dataReaderTiled.width;
            i2 = dataReaderTiled.height;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i;
        float[] fArr = new float[i8 * i2];
        int i9 = dataReaderTiled.tileWidth;
        int i10 = i3 / i9;
        int i11 = ((i3 + i8) - 1) / i9;
        int i12 = dataReaderTiled.tileLength;
        int i13 = i4 / i12;
        int i14 = ((i4 + i2) - 1) / i12;
        int i15 = dataReaderTiled.width;
        int i16 = dataReaderTiled.tileWidth;
        int i17 = ((i15 + i16) - 1) / i16;
        int i18 = dataReaderTiled.tileLength;
        int i19 = i13;
        while (i19 <= i14) {
            int i20 = i10;
            while (i20 <= i11) {
                int i21 = i18;
                int i22 = i20;
                int i23 = i19;
                byte[] decompress = decompress(dataReaderTiled.imageData.tiles[(i19 * i17) + i20].getData(), dataReaderTiled.compression, i5, dataReaderTiled.tileWidth, dataReaderTiled.tileLength);
                int i24 = dataReaderTiled.tileWidth;
                int i25 = dataReaderTiled.tileLength;
                int i26 = i16;
                float[] fArr2 = fArr;
                transferBlockToRaster((i22 * i24) - (i10 * i26), (i23 * i25) - (i13 * i21), dataReaderTiled.tileWidth, dataReaderTiled.tileLength, unpackFloatingPointSamples(i24, i25, i24, decompress, dataReaderTiled.predictor, dataReaderTiled.bitsPerPixel, dataReaderTiled.byteOrder), i3, i4, i8, i2, fArr2);
                i20 = i22 + 1;
                fArr = fArr2;
                i8 = i8;
                i18 = i21;
                i19 = i23;
                i11 = i11;
                i14 = i14;
                i16 = i26;
                dataReaderTiled = this;
            }
            i19++;
            dataReaderTiled = this;
        }
        return new org.apache.commons.imaging.formats.tiff.TiffRasterData(i8, i2, fArr);
    }
}
