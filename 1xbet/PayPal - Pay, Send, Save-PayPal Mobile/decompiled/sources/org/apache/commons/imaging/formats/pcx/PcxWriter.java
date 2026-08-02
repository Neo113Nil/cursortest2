package org.apache.commons.imaging.formats.pcx;

/* loaded from: classes17.dex */
class PcxWriter {
    private int bitDepthWanted;
    private int encoding;
    private org.apache.commons.imaging.PixelDensity pixelDensity;
    private int planesWanted;
    private final org.apache.commons.imaging.formats.pcx.RleWriter rleWriter;

    PcxWriter(java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException {
        java.lang.Object remove;
        java.lang.Object remove2;
        java.lang.Object remove3;
        java.lang.Object remove4;
        this.bitDepthWanted = -1;
        this.planesWanted = -1;
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        this.encoding = 1;
        if (hashMap.containsKey(org.apache.commons.imaging.formats.pcx.PcxConstants.PARAM_KEY_PCX_COMPRESSION) && (remove4 = hashMap.remove(org.apache.commons.imaging.formats.pcx.PcxConstants.PARAM_KEY_PCX_COMPRESSION)) != null) {
            if (!(remove4 instanceof java.lang.Number)) {
                throw new org.apache.commons.imaging.ImageWriteException("Invalid compression parameter: ".concat(java.lang.String.valueOf(remove4)));
            }
            if (((java.lang.Number) remove4).intValue() == 0) {
                this.encoding = 0;
            }
        }
        if (this.encoding == 0) {
            this.rleWriter = new org.apache.commons.imaging.formats.pcx.RleWriter(false);
        } else {
            this.rleWriter = new org.apache.commons.imaging.formats.pcx.RleWriter(true);
        }
        if (hashMap.containsKey(org.apache.commons.imaging.formats.pcx.PcxConstants.PARAM_KEY_PCX_BIT_DEPTH) && (remove3 = hashMap.remove(org.apache.commons.imaging.formats.pcx.PcxConstants.PARAM_KEY_PCX_BIT_DEPTH)) != null) {
            if (!(remove3 instanceof java.lang.Number)) {
                throw new org.apache.commons.imaging.ImageWriteException("Invalid bit depth parameter: ".concat(java.lang.String.valueOf(remove3)));
            }
            this.bitDepthWanted = ((java.lang.Number) remove3).intValue();
        }
        if (hashMap.containsKey(org.apache.commons.imaging.formats.pcx.PcxConstants.PARAM_KEY_PCX_PLANES) && (remove2 = hashMap.remove(org.apache.commons.imaging.formats.pcx.PcxConstants.PARAM_KEY_PCX_PLANES)) != null) {
            if (!(remove2 instanceof java.lang.Number)) {
                throw new org.apache.commons.imaging.ImageWriteException("Invalid planes parameter: ".concat(java.lang.String.valueOf(remove2)));
            }
            this.planesWanted = ((java.lang.Number) remove2).intValue();
        }
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY) && (remove = hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY)) != null) {
            if (!(remove instanceof org.apache.commons.imaging.PixelDensity)) {
                throw new org.apache.commons.imaging.ImageWriteException("Invalid pixel density parameter");
            }
            this.pixelDensity = (org.apache.commons.imaging.PixelDensity) remove;
        }
        if (this.pixelDensity == null) {
            this.pixelDensity = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(72.0d, 72.0d);
        }
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0089, code lost:
    
        if (r18.planesWanted != 1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int entry;
        int entry2;
        org.apache.commons.imaging.palette.SimplePalette makeExactRgbPaletteSimple = new org.apache.commons.imaging.palette.PaletteFactory().makeExactRgbPaletteSimple(bufferedImage, 256);
        org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream = new org.apache.commons.imaging.common.BinaryOutputStream(outputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        if (makeExactRgbPaletteSimple == null || (i4 = this.bitDepthWanted) == 24 || i4 == 32) {
            if (this.bitDepthWanted == 32) {
                i3 = 32;
                i2 = i3;
                i = 1;
            } else {
                i = 3;
                i2 = 8;
            }
        } else {
            if (makeExactRgbPaletteSimple.length() > 16 || this.bitDepthWanted == 8) {
                i3 = 8;
            } else {
                i3 = 4;
                if (makeExactRgbPaletteSimple.length() <= 8 && this.bitDepthWanted != 4) {
                    if (makeExactRgbPaletteSimple.length() > 4 || this.bitDepthWanted == 3) {
                        i3 = 3;
                    } else {
                        if (makeExactRgbPaletteSimple.length() > 2 || this.bitDepthWanted == 2) {
                            if (this.planesWanted != 2) {
                                i3 = 2;
                            }
                        } else {
                            boolean z = makeExactRgbPaletteSimple.length() <= 0 || (entry2 = makeExactRgbPaletteSimple.getEntry(0)) == 0 || entry2 == 16777215;
                            if ((makeExactRgbPaletteSimple.length() != 2 || (entry = makeExactRgbPaletteSimple.getEntry(1)) == 0 || entry == 16777215) && z) {
                                i2 = 1;
                                i = 1;
                            }
                        }
                        i3 = 2;
                    }
                    i = i3;
                    i2 = 1;
                }
            }
            i2 = i3;
            i = 1;
        }
        int width = ((bufferedImage.getWidth() * i2) + 7) / 8;
        if (width % 2 != 0) {
            width++;
        }
        byte[] bArr = new byte[48];
        int i5 = 0;
        for (int i6 = 16; i5 < i6; i6 = 16) {
            int entry3 = i5 < makeExactRgbPaletteSimple.length() ? makeExactRgbPaletteSimple.getEntry(i5) : 0;
            int i7 = i5 * 3;
            bArr[i7] = (byte) ((entry3 >> 16) & 255);
            bArr[i7 + 1] = (byte) ((entry3 >> 8) & 255);
            bArr[i7 + 2] = (byte) (entry3 & 255);
            i5++;
        }
        binaryOutputStream.write(10);
        binaryOutputStream.write((i2 == 1 && i == 1) ? 3 : 5);
        binaryOutputStream.write(this.encoding);
        binaryOutputStream.write(i2);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(bufferedImage.getWidth() - 1);
        binaryOutputStream.write2Bytes(bufferedImage.getHeight() - 1);
        binaryOutputStream.write2Bytes((short) java.lang.Math.round(this.pixelDensity.horizontalDensityInches()));
        binaryOutputStream.write2Bytes((short) java.lang.Math.round(this.pixelDensity.verticalDensityInches()));
        binaryOutputStream.write(bArr);
        binaryOutputStream.write(0);
        binaryOutputStream.write(i);
        binaryOutputStream.write2Bytes(width);
        binaryOutputStream.write2Bytes(1);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write(new byte[54]);
        if (i2 == 32) {
            writePixels32(bufferedImage, width, binaryOutputStream);
        } else {
            writePixels(bufferedImage, i2, i, width, makeExactRgbPaletteSimple, binaryOutputStream);
        }
        if (i2 == 8 && i == 1) {
            binaryOutputStream.write(12);
            int i8 = 0;
            while (i8 < 256) {
                int entry4 = i8 < makeExactRgbPaletteSimple.length() ? makeExactRgbPaletteSimple.getEntry(i8) : 0;
                binaryOutputStream.write((entry4 >> 16) & 255);
                binaryOutputStream.write((entry4 >> 8) & 255);
                binaryOutputStream.write(entry4 & 255);
                i8++;
            }
        }
    }

    private void writePixels(java.awt.image.BufferedImage bufferedImage, int i, int i2, int i3, org.apache.commons.imaging.palette.SimplePalette simplePalette, org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i3];
        byte[][] bArr5 = {bArr, bArr2, bArr3, bArr4};
        byte b = 0;
        int i4 = 0;
        while (i4 < bufferedImage.getHeight()) {
            for (int i5 = b; i5 < i2; i5++) {
                java.util.Arrays.fill(bArr5[i5], b);
            }
            int i6 = 16777215;
            if (i == 1 && i2 == 1) {
                for (int i7 = b; i7 < bufferedImage.getWidth(); i7++) {
                    int i8 = i7 >>> 3;
                    bArr[i8] = (byte) (bArr[i8] | (((bufferedImage.getRGB(i7, i4) & 16777215) == 0 ? 0 : 1) << (7 - (i7 & 7))));
                }
            } else if (i == 1 && i2 == 2) {
                int i9 = 0;
                while (i9 < bufferedImage.getWidth()) {
                    int paletteIndex = simplePalette.getPaletteIndex(bufferedImage.getRGB(i9, i4) & i6);
                    int i10 = i9 >>> 3;
                    int i11 = 7 - (i9 & 7);
                    bArr[i10] = (byte) (bArr[i10] | ((paletteIndex & 1) << i11));
                    bArr2[i10] = (byte) (bArr2[i10] | (((paletteIndex & 2) >> 1) << i11));
                    i9++;
                    i6 = 16777215;
                }
            } else if (i == 1 && i2 == 3) {
                for (int i12 = 0; i12 < bufferedImage.getWidth(); i12++) {
                    int paletteIndex2 = simplePalette.getPaletteIndex(bufferedImage.getRGB(i12, i4) & 16777215);
                    int i13 = i12 >>> 3;
                    int i14 = 7 - (i12 & 7);
                    bArr[i13] = (byte) (bArr[i13] | ((paletteIndex2 & 1) << i14));
                    bArr2[i13] = (byte) (bArr2[i13] | (((paletteIndex2 & 2) >> 1) << i14));
                    bArr3[i13] = (byte) (bArr3[i13] | (((paletteIndex2 & 4) >> 2) << i14));
                }
            } else if (i == 1 && i2 == 4) {
                for (int i15 = 0; i15 < bufferedImage.getWidth(); i15++) {
                    int paletteIndex3 = simplePalette.getPaletteIndex(bufferedImage.getRGB(i15, i4) & 16777215);
                    int i16 = i15 >>> 3;
                    int i17 = 7 - (i15 & 7);
                    bArr[i16] = (byte) (bArr[i16] | ((paletteIndex3 & 1) << i17));
                    bArr2[i16] = (byte) (bArr2[i16] | (((paletteIndex3 & 2) >> 1) << i17));
                    bArr3[i16] = (byte) (bArr3[i16] | (((paletteIndex3 & 4) >> 2) << i17));
                    bArr4[i16] = (byte) (bArr4[i16] | (((paletteIndex3 & 8) >> 3) << i17));
                }
            } else if (i == 2 && i2 == 1) {
                for (int i18 = 0; i18 < bufferedImage.getWidth(); i18++) {
                    int i19 = i18 >>> 2;
                    bArr[i19] = (byte) ((simplePalette.getPaletteIndex(bufferedImage.getRGB(i18, i4) & 16777215) << ((3 - (i18 & 3)) * 2)) | bArr[i19]);
                }
            } else if (i == 4 && i2 == 1) {
                for (int i20 = 0; i20 < bufferedImage.getWidth(); i20++) {
                    int i21 = i20 >>> 1;
                    bArr[i21] = (byte) (bArr[i21] | (simplePalette.getPaletteIndex(bufferedImage.getRGB(i20, i4) & 16777215) << ((1 - (i20 & 1)) * 4)));
                }
            } else if (i == 8 && i2 == 1) {
                for (int i22 = 0; i22 < bufferedImage.getWidth(); i22++) {
                    bArr[i22] = (byte) simplePalette.getPaletteIndex(bufferedImage.getRGB(i22, i4) & 16777215);
                }
            } else if (i == 8 && i2 == 3) {
                for (int i23 = 0; i23 < bufferedImage.getWidth(); i23++) {
                    int rgb = bufferedImage.getRGB(i23, i4);
                    bArr[i23] = (byte) (rgb >>> 16);
                    bArr2[i23] = (byte) (rgb >>> 8);
                    bArr3[i23] = (byte) rgb;
                }
            }
            for (int i24 = 0; i24 < i2; i24++) {
                this.rleWriter.write(binaryOutputStream, bArr5[i24]);
            }
            i4++;
            b = 0;
        }
        this.rleWriter.flush(binaryOutputStream);
    }

    private void writePixels32(java.awt.image.BufferedImage bufferedImage, int i, org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        int width = bufferedImage.getWidth();
        int[] iArr = new int[width];
        byte[] bArr = new byte[i * 4];
        for (int i2 = 0; i2 < bufferedImage.getHeight(); i2++) {
            bufferedImage.getRGB(0, i2, bufferedImage.getWidth(), 1, iArr, 0, bufferedImage.getWidth());
            for (int i3 = 0; i3 < width; i3++) {
                int i4 = i3 * 4;
                int i5 = iArr[i3];
                bArr[i4] = (byte) i5;
                bArr[i4 + 1] = (byte) (i5 >> 8);
                bArr[i4 + 2] = (byte) (i5 >> 16);
                bArr[i4 + 3] = 0;
            }
            this.rleWriter.write(binaryOutputStream, bArr);
        }
        this.rleWriter.flush(binaryOutputStream);
    }
}
