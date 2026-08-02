package org.apache.commons.imaging.formats.tiff.datareaders;

/* loaded from: classes17.dex */
public abstract class ImageDataReader {
    private final int[] bitsPerSample;
    protected final int bitsPerSampleLength;
    protected final org.apache.commons.imaging.formats.tiff.TiffDirectory directory;
    protected final int height;
    private final int[] last;
    protected final org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter;
    protected final int predictor;
    protected final int sampleFormat;
    protected final int samplesPerPixel;
    protected final int width;

    public abstract java.awt.image.BufferedImage readImageData(java.awt.Rectangle rectangle) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public abstract void readImageData(org.apache.commons.imaging.common.ImageBuilder imageBuilder) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public abstract org.apache.commons.imaging.formats.tiff.TiffRasterData readRasterData(java.awt.Rectangle rectangle) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public ImageDataReader(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory, org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        this.directory = tiffDirectory;
        this.photometricInterpreter = photometricInterpreter;
        this.bitsPerSample = iArr;
        this.bitsPerSampleLength = iArr.length;
        this.samplesPerPixel = i2;
        this.sampleFormat = i3;
        this.predictor = i;
        this.width = i4;
        this.height = i5;
        this.last = new int[i2];
    }

    protected boolean isHomogenous(int i) {
        for (int i2 : this.bitsPerSample) {
            if (i2 != i) {
                return false;
            }
        }
        return true;
    }

    void getSamplesAsBytes(org.apache.commons.imaging.formats.tiff.datareaders.BitInputStream bitInputStream, int[] iArr) throws java.io.IOException {
        int i = 0;
        while (true) {
            int[] iArr2 = this.bitsPerSample;
            if (i >= iArr2.length) {
                return;
            }
            int i2 = iArr2[i];
            int readBits = bitInputStream.readBits(i2);
            if (i2 < 8) {
                int i3 = 8 - i2;
                int i4 = readBits << i3;
                readBits = (readBits & 1) > 0 ? ((1 << i3) - 1) | i4 : i4;
            } else if (i2 > 8) {
                readBits >>= i2 - 8;
            }
            iArr[i] = readBits;
            i++;
        }
    }

    protected void resetPredictor() {
        java.util.Arrays.fill(this.last, 0);
    }

    protected int[] applyPredictor(int[] iArr) {
        if (this.predictor == 2) {
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                int[] iArr2 = this.last;
                int i3 = (i2 + iArr2[i]) & 255;
                iArr[i] = i3;
                iArr2[i] = i3;
            }
        }
        return iArr;
    }

    protected byte[] decompress(byte[] bArr, int i, int i2, int i3, int i4) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte[] bArr2;
        org.apache.commons.imaging.formats.tiff.TiffField findField = this.directory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_FILL_ORDER);
        int intValue = findField != null ? findField.getIntValue() : 1;
        if (intValue == 1) {
            bArr2 = bArr;
        } else if (intValue == 2) {
            bArr2 = new byte[bArr.length];
            for (int i5 = 0; i5 < bArr.length; i5++) {
                bArr2[i5] = (byte) (java.lang.Integer.reverse(bArr[i5] & 255) >>> 24);
            }
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TIFF FillOrder=");
            sb.append(intValue);
            sb.append(" is invalid");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (i == 1) {
            return bArr2;
        }
        if (i == 2) {
            return org.apache.commons.imaging.common.itu_t4.T4AndT6Compression.decompressModifiedHuffman(bArr2, i3, i4);
        }
        if (i == 3) {
            org.apache.commons.imaging.formats.tiff.TiffField findField2 = this.directory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_T4_OPTIONS);
            int intValue2 = findField2 != null ? findField2.getIntValue() : 0;
            boolean z = (intValue2 & 1) != 0;
            if ((intValue2 & 2) != 0) {
                throw new org.apache.commons.imaging.ImageReadException("T.4 compression with the uncompressed mode extension is not yet supported");
            }
            boolean z2 = (intValue2 & 4) != 0;
            if (z) {
                return org.apache.commons.imaging.common.itu_t4.T4AndT6Compression.decompressT4_2D(bArr2, i3, i4, z2);
            }
            return org.apache.commons.imaging.common.itu_t4.T4AndT6Compression.decompressT4_1D(bArr2, i3, i4, z2);
        }
        if (i == 4) {
            org.apache.commons.imaging.formats.tiff.TiffField findField3 = this.directory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_T6_OPTIONS);
            if (((findField3 != null ? findField3.getIntValue() : 0) & 2) != 0) {
                throw new org.apache.commons.imaging.ImageReadException("T.6 compression with the uncompressed mode extension is not yet supported");
            }
            return org.apache.commons.imaging.common.itu_t4.T4AndT6Compression.decompressT6(bArr2, i3, i4);
        }
        if (i == 5) {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr2);
            org.apache.commons.imaging.common.mylzw.MyLzwDecompressor myLzwDecompressor = new org.apache.commons.imaging.common.mylzw.MyLzwDecompressor(8, java.nio.ByteOrder.BIG_ENDIAN);
            myLzwDecompressor.setTiffLZWMode();
            return myLzwDecompressor.decompress(byteArrayInputStream, i2);
        }
        if (i != 8) {
            if (i == 32773) {
                return new org.apache.commons.imaging.common.PackBits().decompress(bArr2, i2);
            }
            if (i != 32946) {
                throw new org.apache.commons.imaging.ImageReadException("Tiff: unknown/unsupported compression: ".concat(java.lang.String.valueOf(i)));
            }
        }
        return org.apache.commons.imaging.common.ZlibDeflate.decompress(bArr, i2);
    }

    protected int[] unpackFloatingPointSamples(int i, int i2, int i3, byte[] bArr, int i4, int i5, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageReadException {
        int i6 = i3;
        byte[] bArr2 = bArr;
        int i7 = (i5 / 8) * i6 * i2;
        int i8 = bArr2.length < i7 ? i7 / i6 : i2;
        int[] iArr = new int[i6 * i2];
        if (i4 == 3) {
            if (i5 != 32) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Imaging does not yet support floating-point data with predictor type 3 for ");
                sb.append(i5);
                sb.append(" bits per sample");
                throw new org.apache.commons.imaging.ImageReadException(sb.toString());
            }
            int i9 = i6 * 4;
            for (int i10 = 0; i10 < i8; i10++) {
                int i11 = i10 * i9;
                int i12 = i11 + i6;
                int i13 = i12 + i6;
                for (int i14 = 1; i14 < i9; i14++) {
                    int i15 = i11 + i14;
                    bArr2[i15] = (byte) (bArr2[i15] + bArr2[i15 - 1]);
                }
                int i16 = i10 * i6;
                int i17 = 0;
                while (i17 < i) {
                    iArr[i16] = ((bArr2[i13 + i17] & 255) << 8) | ((bArr2[i12 + i17] & 255) << 16) | ((bArr2[i11 + i17] & 255) << 24) | (bArr2[i13 + i6 + i17] & 255);
                    i17++;
                    i16++;
                }
            }
        } else {
            if (i5 != 64) {
                int i18 = i8;
                if (i5 != 32) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Imaging does not support floating-point samples with ");
                    sb2.append(i5);
                    sb2.append(" bits per sample");
                    throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
                }
                int i19 = 0;
                int i20 = 0;
                for (int i21 = 0; i21 < i18; i21++) {
                    int i22 = 0;
                    while (i22 < i3) {
                        int i23 = bArr[i19] & 255;
                        int i24 = bArr[i19 + 1] & 255;
                        int i25 = bArr[i19 + 2] & 255;
                        int i26 = i19 + 4;
                        int i27 = bArr[i19 + 3] & 255;
                        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
                            i27 = (i27 << 24) | (i25 << 16) | (i24 << 8);
                        } else {
                            i23 = (i23 << 24) | (i24 << 16) | (i25 << 8);
                        }
                        iArr[i20] = i27 | i23;
                        i22++;
                        i20++;
                        i19 = i26;
                    }
                }
                return iArr;
            }
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            while (i28 < i8) {
                int i31 = 0;
                while (i31 < i6) {
                    long j = bArr2[i29] & 255;
                    long j2 = bArr2[i29 + 1] & 255;
                    int i32 = i31;
                    long j3 = bArr2[i29 + 2] & 255;
                    int i33 = i8;
                    int[] iArr2 = iArr;
                    long j4 = bArr2[i29 + 3] & 255;
                    long j5 = bArr2[i29 + 4] & 255;
                    long j6 = bArr2[i29 + 5] & 255;
                    int i34 = i30;
                    long j7 = bArr2[i29 + 6] & 255;
                    long j8 = bArr2[i29 + 7] & 255;
                    iArr2[i34] = java.lang.Float.floatToRawIntBits((float) java.lang.Double.longBitsToDouble(byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN ? (j8 << 56) | (j7 << 48) | (j6 << 40) | (j5 << 32) | (j4 << 24) | (j3 << 16) | (j2 << 8) | j : j8 | (j4 << 32) | (j3 << 40) | (j << 56) | (j2 << 48) | (j5 << 24) | (j6 << 16) | (j7 << 8)));
                    i30 = i34 + 1;
                    i29 += 8;
                    bArr2 = bArr;
                    i31 = i32 + 1;
                    i8 = i33;
                    iArr = iArr2;
                    i6 = i3;
                }
                i28++;
                i6 = i3;
                bArr2 = bArr;
            }
        }
        return iArr;
    }

    void transferBlockToRaster(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6, int i7, int i8, float[] fArr) {
        int i9 = i - i5;
        int i10 = i2 - i6;
        int i11 = i9 + i3;
        int i12 = i10 + i4;
        if (i9 < 0) {
            i9 = 0;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > i7) {
            i11 = i7;
        }
        if (i12 <= i8) {
            i8 = i12;
        }
        int i13 = (i5 + i9) - i;
        int i14 = (i6 + i10) - i2;
        if (i13 < 0) {
            i9 -= i13;
            i13 = 0;
        }
        if (i14 < 0) {
            i10 -= i14;
            i14 = 0;
        }
        int i15 = i11 - i9;
        int i16 = i8 - i10;
        if (i15 <= 0 || i16 <= 0) {
            return;
        }
        if (i15 > i3) {
            i15 = i3;
        }
        if (i16 <= i4) {
            i4 = i16;
        }
        for (int i17 = 0; i17 < i4; i17++) {
            for (int i18 = 0; i18 < i15; i18++) {
                fArr[((i10 + i17) * i7) + i9 + i18] = java.lang.Float.intBitsToFloat(iArr[((i14 + i17) * i3) + i13 + i18]);
            }
        }
    }
}
