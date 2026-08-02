package org.apache.commons.imaging.formats.png;

/* loaded from: classes17.dex */
class PngWriter {
    PngWriter() {
    }

    private void writeInt(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        outputStream.write((i >> 24) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write(i & 255);
    }

    private void writeChunk(java.io.OutputStream outputStream, org.apache.commons.imaging.formats.png.ChunkType chunkType, byte[] bArr) throws java.io.IOException {
        writeInt(outputStream, bArr == null ? 0 : bArr.length);
        outputStream.write(chunkType.array);
        if (bArr != null) {
            outputStream.write(bArr);
        }
        org.apache.commons.imaging.formats.png.PngCrc pngCrc = new org.apache.commons.imaging.formats.png.PngCrc();
        long start_partial_crc = pngCrc.start_partial_crc(chunkType.array, chunkType.array.length);
        if (bArr != null) {
            start_partial_crc = pngCrc.continue_partial_crc(start_partial_crc, bArr, bArr.length);
        }
        writeInt(outputStream, (int) pngCrc.finish_partial_crc(start_partial_crc));
    }

    static class ImageHeader {
        public final byte bitDepth;
        public final byte compressionMethod;
        public final byte filterMethod;
        public final int height;
        public final org.apache.commons.imaging.formats.png.InterlaceMethod interlaceMethod;
        public final org.apache.commons.imaging.formats.png.PngColorType pngColorType;
        public final int width;

        ImageHeader(int i, int i2, byte b, org.apache.commons.imaging.formats.png.PngColorType pngColorType, byte b2, byte b3, org.apache.commons.imaging.formats.png.InterlaceMethod interlaceMethod) {
            this.width = i;
            this.height = i2;
            this.bitDepth = b;
            this.pngColorType = pngColorType;
            this.compressionMethod = b2;
            this.filterMethod = b3;
            this.interlaceMethod = interlaceMethod;
        }
    }

    private void writeChunkIHDR(java.io.OutputStream outputStream, org.apache.commons.imaging.formats.png.PngWriter.ImageHeader imageHeader) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        writeInt(byteArrayOutputStream, imageHeader.width);
        writeInt(byteArrayOutputStream, imageHeader.height);
        byteArrayOutputStream.write(imageHeader.bitDepth & 255);
        byteArrayOutputStream.write(imageHeader.pngColorType.getValue() & 255);
        byteArrayOutputStream.write(imageHeader.compressionMethod & 255);
        byteArrayOutputStream.write(imageHeader.filterMethod & 255);
        byteArrayOutputStream.write(imageHeader.interlaceMethod.ordinal() & 255);
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.IHDR, byteArrayOutputStream.toByteArray());
    }

    private void writeChunkiTXt(java.io.OutputStream outputStream, org.apache.commons.imaging.formats.png.PngText.Itxt itxt) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        if (!isValidISO_8859_1(itxt.keyword)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Png tEXt chunk keyword is not ISO-8859-1: ");
            sb.append(itxt.keyword);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        if (!isValidISO_8859_1(itxt.languageTag)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Png tEXt chunk language tag is not ISO-8859-1: ");
            sb2.append(itxt.languageTag);
            throw new org.apache.commons.imaging.ImageWriteException(sb2.toString());
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(itxt.keyword.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(itxt.languageTag.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(itxt.translatedKeyword.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(deflate(itxt.text.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.iTXt, byteArrayOutputStream.toByteArray());
    }

    private void writeChunkzTXt(java.io.OutputStream outputStream, org.apache.commons.imaging.formats.png.PngText.Ztxt ztxt) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        if (!isValidISO_8859_1(ztxt.keyword)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Png zTXt chunk keyword is not ISO-8859-1: ");
            sb.append(ztxt.keyword);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        if (!isValidISO_8859_1(ztxt.text)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Png zTXt chunk text is not ISO-8859-1: ");
            sb2.append(ztxt.text);
            throw new org.apache.commons.imaging.ImageWriteException(sb2.toString());
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(ztxt.keyword.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(deflate(ztxt.text.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1)));
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.zTXt, byteArrayOutputStream.toByteArray());
    }

    private void writeChunktEXt(java.io.OutputStream outputStream, org.apache.commons.imaging.formats.png.PngText.Text text) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        if (!isValidISO_8859_1(text.keyword)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Png tEXt chunk keyword is not ISO-8859-1: ");
            sb.append(text.keyword);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        if (!isValidISO_8859_1(text.text)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Png tEXt chunk text is not ISO-8859-1: ");
            sb2.append(text.text);
            throw new org.apache.commons.imaging.ImageWriteException(sb2.toString());
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(text.keyword.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(text.text.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.tEXt, byteArrayOutputStream.toByteArray());
    }

    private byte[] deflate(byte[] bArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private boolean isValidISO_8859_1(java.lang.String str) {
        return str.equals(new java.lang.String(str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), java.nio.charset.StandardCharsets.ISO_8859_1));
    }

    private void writeChunkXmpiTXt(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(org.apache.commons.imaging.formats.png.PngConstants.XMP_KEYWORD.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(org.apache.commons.imaging.formats.png.PngConstants.XMP_KEYWORD.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(deflate(str.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.iTXt, byteArrayOutputStream.toByteArray());
    }

    private void writeChunkPLTE(java.io.OutputStream outputStream, org.apache.commons.imaging.palette.Palette palette) throws java.io.IOException {
        int length = palette.length();
        byte[] bArr = new byte[length * 3];
        for (int i = 0; i < length; i++) {
            int entry = palette.getEntry(i);
            int i2 = i * 3;
            bArr[i2] = (byte) ((entry >> 16) & 255);
            bArr[i2 + 1] = (byte) ((entry >> 8) & 255);
            bArr[i2 + 2] = (byte) (entry & 255);
        }
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.PLTE, bArr);
    }

    private void writeChunkTRNS(java.io.OutputStream outputStream, org.apache.commons.imaging.palette.Palette palette) throws java.io.IOException {
        int length = palette.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) ((palette.getEntry(i) >> 24) & 255);
        }
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.tRNS, bArr);
    }

    private void writeChunkIEND(java.io.OutputStream outputStream) throws java.io.IOException {
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.IEND, null);
    }

    private void writeChunkIDAT(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.IDAT, bArr);
    }

    private void writeChunkPHYS(java.io.OutputStream outputStream, int i, int i2, byte b) throws java.io.IOException {
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.pHYs, new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255), (byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255), b});
    }

    private void writeChunkSCAL(java.io.OutputStream outputStream, double d, double d2, byte b) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(b);
        byteArrayOutputStream.write(java.lang.String.valueOf(d).getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(java.lang.String.valueOf(d2).getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        writeChunk(outputStream, org.apache.commons.imaging.formats.png.ChunkType.sCAL, byteArrayOutputStream.toByteArray());
    }

    private byte getBitDepth(org.apache.commons.imaging.formats.png.PngColorType pngColorType, java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.Object obj = map.get(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_BIT_DEPTH);
        byte byteValue = obj instanceof java.lang.Number ? ((java.lang.Number) obj).byteValue() : (byte) 8;
        if (pngColorType.isBitDepthAllowed(byteValue)) {
            return byteValue;
        }
        return (byte) 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        org.apache.commons.imaging.formats.png.PngColorType colorType;
        org.apache.commons.imaging.formats.png.PngColorType pngColorType;
        boolean z;
        org.apache.commons.imaging.palette.Palette palette;
        java.lang.Object obj;
        java.lang.Object obj2;
        byte b;
        java.lang.Object obj3;
        org.apache.commons.imaging.palette.Palette palette2;
        byte b2;
        org.apache.commons.imaging.formats.png.PngColorType pngColorType2;
        int i;
        byte[] byteArray;
        int i2;
        byte[] byteArray2;
        java.util.HashMap hashMap = new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap(hashMap);
        if (hashMap.containsKey(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR)) {
            hashMap.remove(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR);
        }
        if (hashMap.containsKey(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_FORCE_INDEXED_COLOR)) {
            hashMap.remove(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_FORCE_INDEXED_COLOR);
        }
        if (hashMap.containsKey(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_BIT_DEPTH)) {
            hashMap.remove(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_BIT_DEPTH);
        }
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML);
        }
        if (hashMap.containsKey(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
            hashMap.remove(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS);
        }
        int intValue = hashMap.containsKey(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_COMPRESSION_LEVEL) ? ((java.lang.Integer) hashMap.remove(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_COMPRESSION_LEVEL)).intValue() : -1;
        hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        hashMap.remove(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PHYSICAL_SCALE);
        hashMap.remove(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_COMPRESSION_LEVEL);
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        boolean hasTransparency = new org.apache.commons.imaging.palette.PaletteFactory().hasTransparency(bufferedImage);
        org.apache.commons.imaging.internal.Debug.debug("hasAlpha: ".concat(java.lang.String.valueOf(hasTransparency)));
        boolean isGrayscale = new org.apache.commons.imaging.palette.PaletteFactory().isGrayscale(bufferedImage);
        int i3 = intValue;
        org.apache.commons.imaging.internal.Debug.debug("isGrayscale: ".concat(java.lang.String.valueOf(isGrayscale)));
        boolean equals = java.lang.Boolean.TRUE.equals(hashMap2.get(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_FORCE_INDEXED_COLOR));
        boolean equals2 = java.lang.Boolean.TRUE.equals(hashMap2.get(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR));
        if (equals && equals2) {
            throw new org.apache.commons.imaging.ImageWriteException("Params: Cannot force both indexed and true color modes");
        }
        if (equals) {
            colorType = org.apache.commons.imaging.formats.png.PngColorType.INDEXED_COLOR;
        } else {
            if (equals2) {
                pngColorType = hasTransparency ? org.apache.commons.imaging.formats.png.PngColorType.TRUE_COLOR_WITH_ALPHA : org.apache.commons.imaging.formats.png.PngColorType.TRUE_COLOR;
                z = false;
                org.apache.commons.imaging.internal.Debug.debug("colorType: ".concat(java.lang.String.valueOf(pngColorType)));
                byte bitDepth = getBitDepth(pngColorType, hashMap2);
                org.apache.commons.imaging.internal.Debug.debug("bitDepth: ".concat(java.lang.String.valueOf((int) bitDepth)));
                org.apache.commons.imaging.internal.Debug.debug("sampleDepth: ".concat(java.lang.String.valueOf((int) (pngColorType != org.apache.commons.imaging.formats.png.PngColorType.INDEXED_COLOR ? (byte) 8 : bitDepth))));
                org.apache.commons.imaging.formats.png.PngConstants.PNG_SIGNATURE.writeTo(outputStream);
                writeChunkIHDR(outputStream, new org.apache.commons.imaging.formats.png.PngWriter.ImageHeader(width, height, bitDepth, pngColorType, (byte) 0, (byte) 0, org.apache.commons.imaging.formats.png.InterlaceMethod.NONE));
                if (pngColorType != org.apache.commons.imaging.formats.png.PngColorType.INDEXED_COLOR) {
                    org.apache.commons.imaging.palette.PaletteFactory paletteFactory = new org.apache.commons.imaging.palette.PaletteFactory();
                    if (hasTransparency) {
                        palette = paletteFactory.makeQuantizedRgbaPalette(bufferedImage, hasTransparency, 256);
                        writeChunkPLTE(outputStream, palette);
                        writeChunkTRNS(outputStream, palette);
                    } else {
                        palette = paletteFactory.makeQuantizedRgbPalette(bufferedImage, 256);
                        writeChunkPLTE(outputStream, palette);
                    }
                } else {
                    palette = null;
                }
                org.apache.commons.imaging.palette.Palette palette3 = palette;
                obj = hashMap2.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
                if (obj instanceof org.apache.commons.imaging.PixelDensity) {
                    obj2 = org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PHYSICAL_SCALE;
                } else {
                    org.apache.commons.imaging.PixelDensity pixelDensity = (org.apache.commons.imaging.PixelDensity) obj;
                    if (!pixelDensity.isUnitless()) {
                        obj2 = org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PHYSICAL_SCALE;
                        b = 1;
                        writeChunkPHYS(outputStream, (int) java.lang.Math.round(pixelDensity.horizontalDensityMetres()), (int) java.lang.Math.round(pixelDensity.verticalDensityMetres()), (byte) 1);
                        obj3 = hashMap2.get(obj2);
                        if (obj3 instanceof org.apache.commons.imaging.formats.png.PhysicalScale) {
                            org.apache.commons.imaging.formats.png.PhysicalScale physicalScale = (org.apache.commons.imaging.formats.png.PhysicalScale) obj3;
                            b2 = b;
                            palette2 = palette3;
                            pngColorType2 = pngColorType;
                            writeChunkSCAL(outputStream, physicalScale.getHorizontalUnitsPerPixel(), physicalScale.getVerticalUnitsPerPixel(), !physicalScale.isInMeters() ? (byte) 2 : b);
                        } else {
                            palette2 = palette3;
                            b2 = b;
                            pngColorType2 = pngColorType;
                        }
                        if (hashMap2.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML)) {
                            writeChunkXmpiTXt(outputStream, (java.lang.String) hashMap2.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML));
                        }
                        if (hashMap2.containsKey(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
                            for (org.apache.commons.imaging.formats.png.PngText pngText : (java.util.List) hashMap2.get(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
                                if (pngText instanceof org.apache.commons.imaging.formats.png.PngText.Text) {
                                    writeChunktEXt(outputStream, (org.apache.commons.imaging.formats.png.PngText.Text) pngText);
                                } else if (pngText instanceof org.apache.commons.imaging.formats.png.PngText.Ztxt) {
                                    writeChunkzTXt(outputStream, (org.apache.commons.imaging.formats.png.PngText.Ztxt) pngText);
                                } else if (pngText instanceof org.apache.commons.imaging.formats.png.PngText.Itxt) {
                                    writeChunkiTXt(outputStream, (org.apache.commons.imaging.formats.png.PngText.Itxt) pngText);
                                } else {
                                    throw new org.apache.commons.imaging.ImageWriteException("Unknown text to embed in PNG: ".concat(java.lang.String.valueOf(pngText)));
                                }
                            }
                        }
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        byte b3 = (pngColorType2 != org.apache.commons.imaging.formats.png.PngColorType.GREYSCALE_WITH_ALPHA || pngColorType2 == org.apache.commons.imaging.formats.png.PngColorType.TRUE_COLOR_WITH_ALPHA) ? b2 : (byte) 0;
                        int[] iArr = new int[width];
                        i = 0;
                        while (i < height) {
                            int i4 = height;
                            int i5 = width;
                            int i6 = i3;
                            bufferedImage.getRGB(0, i, width, 1, iArr, 0, i5);
                            byteArrayOutputStream.write(org.apache.commons.imaging.formats.png.FilterType.NONE.ordinal());
                            int i7 = 0;
                            while (i7 < i5) {
                                int i8 = iArr[i7];
                                org.apache.commons.imaging.palette.Palette palette4 = palette2;
                                if (palette4 != null) {
                                    byteArrayOutputStream.write(palette4.getPaletteIndex(i8) & 255);
                                } else {
                                    int i9 = (i8 >> 16) & 255;
                                    int i10 = (i8 >> 8) & 255;
                                    int i11 = i8 & 255;
                                    if (z) {
                                        byteArrayOutputStream.write(((i9 + i10) + i11) / 3);
                                    } else {
                                        byteArrayOutputStream.write(i9);
                                        byteArrayOutputStream.write(i10);
                                        byteArrayOutputStream.write(i11);
                                    }
                                    if (b3 != 0) {
                                        byteArrayOutputStream.write((i8 >> 24) & 255);
                                    }
                                }
                                i7++;
                                palette2 = palette4;
                            }
                            i++;
                            i3 = i6;
                            width = i5;
                            height = i4;
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                        java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream2, new java.util.zip.Deflater(i3), 262144);
                        i2 = 0;
                        while (i2 < byteArray.length) {
                            int i12 = i2 + 262144;
                            deflaterOutputStream.write(byteArray, i2, java.lang.Math.min(byteArray.length, i12) - i2);
                            deflaterOutputStream.flush();
                            byteArrayOutputStream2.flush();
                            byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                            byteArrayOutputStream2.reset();
                            if (byteArray3.length > 0) {
                                writeChunkIDAT(outputStream, byteArray3);
                            }
                            i2 = i12;
                        }
                        deflaterOutputStream.finish();
                        byteArray2 = byteArrayOutputStream2.toByteArray();
                        if (byteArray2.length > 0) {
                            writeChunkIDAT(outputStream, byteArray2);
                        }
                        writeChunkIEND(outputStream);
                        outputStream.close();
                    }
                    double rawHorizontalDensity = pixelDensity.getRawHorizontalDensity();
                    obj2 = org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PHYSICAL_SCALE;
                    writeChunkPHYS(outputStream, (int) java.lang.Math.round(rawHorizontalDensity), (int) java.lang.Math.round(pixelDensity.getRawVerticalDensity()), (byte) 0);
                }
                b = 1;
                obj3 = hashMap2.get(obj2);
                if (obj3 instanceof org.apache.commons.imaging.formats.png.PhysicalScale) {
                }
                if (hashMap2.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML)) {
                }
                if (hashMap2.containsKey(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
                }
                java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
                if (pngColorType2 != org.apache.commons.imaging.formats.png.PngColorType.GREYSCALE_WITH_ALPHA) {
                }
                int[] iArr2 = new int[width];
                i = 0;
                while (i < height) {
                }
                byteArray = byteArrayOutputStream3.toByteArray();
                java.io.ByteArrayOutputStream byteArrayOutputStream22 = new java.io.ByteArrayOutputStream();
                java.util.zip.DeflaterOutputStream deflaterOutputStream2 = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream22, new java.util.zip.Deflater(i3), 262144);
                i2 = 0;
                while (i2 < byteArray.length) {
                }
                deflaterOutputStream2.finish();
                byteArray2 = byteArrayOutputStream22.toByteArray();
                if (byteArray2.length > 0) {
                }
                writeChunkIEND(outputStream);
                outputStream.close();
            }
            colorType = org.apache.commons.imaging.formats.png.PngColorType.getColorType(hasTransparency, isGrayscale);
        }
        pngColorType = colorType;
        z = isGrayscale;
        org.apache.commons.imaging.internal.Debug.debug("colorType: ".concat(java.lang.String.valueOf(pngColorType)));
        byte bitDepth2 = getBitDepth(pngColorType, hashMap2);
        org.apache.commons.imaging.internal.Debug.debug("bitDepth: ".concat(java.lang.String.valueOf((int) bitDepth2)));
        org.apache.commons.imaging.internal.Debug.debug("sampleDepth: ".concat(java.lang.String.valueOf((int) (pngColorType != org.apache.commons.imaging.formats.png.PngColorType.INDEXED_COLOR ? (byte) 8 : bitDepth2))));
        org.apache.commons.imaging.formats.png.PngConstants.PNG_SIGNATURE.writeTo(outputStream);
        writeChunkIHDR(outputStream, new org.apache.commons.imaging.formats.png.PngWriter.ImageHeader(width, height, bitDepth2, pngColorType, (byte) 0, (byte) 0, org.apache.commons.imaging.formats.png.InterlaceMethod.NONE));
        if (pngColorType != org.apache.commons.imaging.formats.png.PngColorType.INDEXED_COLOR) {
        }
        org.apache.commons.imaging.palette.Palette palette32 = palette;
        obj = hashMap2.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        if (obj instanceof org.apache.commons.imaging.PixelDensity) {
        }
        b = 1;
        obj3 = hashMap2.get(obj2);
        if (obj3 instanceof org.apache.commons.imaging.formats.png.PhysicalScale) {
        }
        if (hashMap2.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML)) {
        }
        if (hashMap2.containsKey(org.apache.commons.imaging.formats.png.PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream32 = new java.io.ByteArrayOutputStream();
        if (pngColorType2 != org.apache.commons.imaging.formats.png.PngColorType.GREYSCALE_WITH_ALPHA) {
        }
        int[] iArr22 = new int[width];
        i = 0;
        while (i < height) {
        }
        byteArray = byteArrayOutputStream32.toByteArray();
        java.io.ByteArrayOutputStream byteArrayOutputStream222 = new java.io.ByteArrayOutputStream();
        java.util.zip.DeflaterOutputStream deflaterOutputStream22 = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream222, new java.util.zip.Deflater(i3), 262144);
        i2 = 0;
        while (i2 < byteArray.length) {
        }
        deflaterOutputStream22.finish();
        byteArray2 = byteArrayOutputStream222.toByteArray();
        if (byteArray2.length > 0) {
        }
        writeChunkIEND(outputStream);
        outputStream.close();
    }
}
