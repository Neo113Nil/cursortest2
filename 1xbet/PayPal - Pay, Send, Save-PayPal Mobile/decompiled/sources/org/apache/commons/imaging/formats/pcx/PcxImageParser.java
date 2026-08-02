package org.apache.commons.imaging.formats.pcx;

/* loaded from: classes17.dex */
public class PcxImageParser extends org.apache.commons.imaging.ImageParser {
    private static final java.lang.String DEFAULT_EXTENSION = ".pcx";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION, ".pcc"};

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    public PcxImageParser() {
        super.setByteOrder(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Pcx-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageFormat[] getAcceptedTypes() {
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.PCX};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.pcx.PcxImageParser.PcxHeader readPcxHeader = readPcxHeader(byteSource);
        java.awt.Dimension imageSize = getImageSize(byteSource, map);
        return new org.apache.commons.imaging.ImageInfo("PCX", readPcxHeader.bitsPerPixel * readPcxHeader.nPlanes, new java.util.ArrayList(), org.apache.commons.imaging.ImageFormats.PCX, "ZSoft PCX Image", imageSize.height, "image/x-pcx", 1, readPcxHeader.vDpi, java.lang.Math.round(imageSize.getHeight() / readPcxHeader.vDpi), readPcxHeader.hDpi, java.lang.Math.round(imageSize.getWidth() / readPcxHeader.hDpi), imageSize.width, false, false, (readPcxHeader.nPlanes == 3 && readPcxHeader.bitsPerPixel == 8) ? false : true, org.apache.commons.imaging.ImageInfo.ColorType.RGB, readPcxHeader.encoding == 1 ? org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.RLE : org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.pcx.PcxImageParser.PcxHeader readPcxHeader = readPcxHeader(byteSource);
        int i = (readPcxHeader.xMax - readPcxHeader.xMin) + 1;
        if (i < 0) {
            throw new org.apache.commons.imaging.ImageReadException("Image width is negative");
        }
        int i2 = (readPcxHeader.yMax - readPcxHeader.yMin) + 1;
        if (i2 < 0) {
            throw new org.apache.commons.imaging.ImageReadException("Image height is negative");
        }
        return new java.awt.Dimension(i, i2);
    }

    static class PcxHeader {
        public static final int ENCODING_RLE = 1;
        public static final int ENCODING_UNCOMPRESSED = 0;
        public static final int PALETTE_INFO_COLOR = 1;
        public static final int PALETTE_INFO_GRAYSCALE = 2;
        public final int bitsPerPixel;
        public final int bytesPerLine;
        public final int[] colormap;
        public final int encoding;
        public final int hDpi;
        public final int hScreenSize;
        public final int manufacturer;
        public final int nPlanes;
        public final int paletteInfo;
        public final int reserved;
        public final int vDpi;
        public final int vScreenSize;
        public final int version;
        public final int xMax;
        public final int xMin;
        public final int yMax;
        public final int yMin;

        PcxHeader(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.manufacturer = i;
            this.version = i2;
            this.encoding = i3;
            this.bitsPerPixel = i4;
            this.xMin = i5;
            this.yMin = i6;
            this.xMax = i7;
            this.yMax = i8;
            this.hDpi = i9;
            this.vDpi = i10;
            this.colormap = iArr;
            this.reserved = i11;
            this.nPlanes = i12;
            this.bytesPerLine = i13;
            this.paletteInfo = i14;
            this.hScreenSize = i15;
            this.vScreenSize = i16;
        }

        public void dump(java.io.PrintWriter printWriter) {
            printWriter.println("PcxHeader");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Manufacturer: ");
            sb.append(this.manufacturer);
            printWriter.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Version: ");
            sb2.append(this.version);
            printWriter.println(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Encoding: ");
            sb3.append(this.encoding);
            printWriter.println(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("BitsPerPixel: ");
            sb4.append(this.bitsPerPixel);
            printWriter.println(sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("xMin: ");
            sb5.append(this.xMin);
            printWriter.println(sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("yMin: ");
            sb6.append(this.yMin);
            printWriter.println(sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("xMax: ");
            sb7.append(this.xMax);
            printWriter.println(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("yMax: ");
            sb8.append(this.yMax);
            printWriter.println(sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("hDpi: ");
            sb9.append(this.hDpi);
            printWriter.println(sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("vDpi: ");
            sb10.append(this.vDpi);
            printWriter.println(sb10.toString());
            printWriter.print("ColorMap: ");
            for (int i = 0; i < this.colormap.length; i++) {
                if (i > 0) {
                    printWriter.print(",");
                }
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder("(");
                sb11.append((this.colormap[i] >> 16) & 255);
                sb11.append(",");
                sb11.append((this.colormap[i] >> 8) & 255);
                sb11.append(",");
                sb11.append(this.colormap[i] & 255);
                sb11.append(")");
                printWriter.print(sb11.toString());
            }
            printWriter.println();
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("Reserved: ");
            sb12.append(this.reserved);
            printWriter.println(sb12.toString());
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder("nPlanes: ");
            sb13.append(this.nPlanes);
            printWriter.println(sb13.toString());
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder("BytesPerLine: ");
            sb14.append(this.bytesPerLine);
            printWriter.println(sb14.toString());
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder("PaletteInfo: ");
            sb15.append(this.paletteInfo);
            printWriter.println(sb15.toString());
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder("hScreenSize: ");
            sb16.append(this.hScreenSize);
            printWriter.println(sb16.toString());
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder("vScreenSize: ");
            sb17.append(this.vScreenSize);
            printWriter.println(sb17.toString());
            printWriter.println();
        }
    }

    private org.apache.commons.imaging.formats.pcx.PcxImageParser.PcxHeader readPcxHeader(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.pcx.PcxImageParser.PcxHeader readPcxHeader = readPcxHeader(inputStream, false);
            if (inputStream != null) {
                inputStream.close();
            }
            return readPcxHeader;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private org.apache.commons.imaging.formats.pcx.PcxImageParser.PcxHeader readPcxHeader(java.io.InputStream inputStream, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("PcxHeader", inputStream, 128, "Not a Valid PCX File");
        int i = 0;
        int i2 = readBytes[0] & 255;
        byte b = readBytes[1];
        byte b2 = readBytes[2];
        byte b3 = readBytes[3];
        int uInt16 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, 4, getByteOrder());
        int uInt162 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, 6, getByteOrder());
        int uInt163 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, 8, getByteOrder());
        int uInt164 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, 10, getByteOrder());
        int uInt165 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, 12, getByteOrder());
        int uInt166 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, 14, getByteOrder());
        int[] iArr = new int[16];
        for (int i3 = 16; i < i3; i3 = 16) {
            int i4 = i * 3;
            iArr[i] = ((readBytes[i4 + 17] & 255) << 8) | ((readBytes[i4 + 16] & 255) << i3) | (-16777216) | (readBytes[i4 + 18] & 255);
            i++;
        }
        byte b4 = readBytes[64];
        byte b5 = readBytes[65];
        int uInt167 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, 66, getByteOrder());
        int uInt168 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, 68, getByteOrder());
        int uInt169 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, 70, getByteOrder());
        int uInt1610 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, 72, getByteOrder());
        if (i2 != 10) {
            throw new org.apache.commons.imaging.ImageReadException("Not a Valid PCX File: manufacturer is ".concat(java.lang.String.valueOf(i2)));
        }
        if (z && uInt167 % 2 != 0) {
            throw new org.apache.commons.imaging.ImageReadException("Not a Valid PCX File: bytesPerLine is odd");
        }
        return new org.apache.commons.imaging.formats.pcx.PcxImageParser.PcxHeader(i2, b & 255, b2 & 255, b3 & 255, uInt16, uInt162, uInt163, uInt164, uInt165, uInt166, iArr, b4 & 255, b5 & 255, uInt167, uInt168, uInt169, uInt1610);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        readPcxHeader(byteSource).dump(printWriter);
        return true;
    }

    private int[] read256ColorPalette(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("Palette", inputStream, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_USER_ID, "Error reading palette");
        if (readBytes[0] != 12) {
            return null;
        }
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = i * 3;
            iArr[i] = (readBytes[i2 + 3] & 255) | ((readBytes[i2 + 1] & 255) << 16) | ((readBytes[i2 + 2] & 255) << 8);
        }
        return iArr;
    }

    private int[] read256ColorPaletteFromEndOfFile(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, (int) (byteSource.getLength() - 769));
            int[] read256ColorPalette = read256ColorPalette(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return read256ColorPalette;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f2, code lost:
    
        if (r25.nPlanes != 1) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.awt.image.BufferedImage readImage(org.apache.commons.imaging.formats.pcx.PcxImageParser.PcxHeader pcxHeader, java.io.InputStream inputStream, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.pcx.RleReader rleReader;
        int[] iArr;
        java.awt.image.WritableRaster createPackedRaster;
        int i = (pcxHeader.xMax - pcxHeader.xMin) + 1;
        if (i < 0) {
            throw new org.apache.commons.imaging.ImageReadException("Image width is negative");
        }
        int i2 = (pcxHeader.yMax - pcxHeader.yMin) + 1;
        if (i2 < 0) {
            throw new org.apache.commons.imaging.ImageReadException("Image height is negative");
        }
        if (pcxHeader.nPlanes <= 0 || 4 < pcxHeader.nPlanes) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported/invalid image with ");
            sb.append(pcxHeader.nPlanes);
            sb.append(" planes");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        byte b = 0;
        if (pcxHeader.encoding == 0) {
            rleReader = new org.apache.commons.imaging.formats.pcx.RleReader(false);
        } else if (pcxHeader.encoding == 1) {
            rleReader = new org.apache.commons.imaging.formats.pcx.RleReader(true);
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported/invalid image encoding ");
            sb2.append(pcxHeader.encoding);
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        org.apache.commons.imaging.formats.pcx.RleReader rleReader2 = rleReader;
        byte[] bArr = new byte[pcxHeader.bytesPerLine * pcxHeader.nPlanes];
        int i3 = 8;
        if ((pcxHeader.bitsPerPixel == 1 || pcxHeader.bitsPerPixel == 2 || pcxHeader.bitsPerPixel == 4 || pcxHeader.bitsPerPixel == 8) && pcxHeader.nPlanes == 1) {
            int i4 = ((pcxHeader.bitsPerPixel * i) + 7) / 8;
            int i5 = i2 * i4;
            byte[] bArr2 = new byte[i5];
            for (int i6 = 0; i6 < i2; i6++) {
                rleReader2.read(inputStream, bArr);
                java.lang.System.arraycopy(bArr, 0, bArr2, i6 * i4, i4);
            }
            java.awt.image.DataBufferByte dataBufferByte = new java.awt.image.DataBufferByte(bArr2, i5);
            if (pcxHeader.bitsPerPixel == 1) {
                iArr = new int[]{0, 16777215};
            } else if (pcxHeader.bitsPerPixel == 8) {
                iArr = read256ColorPalette(inputStream);
                if (iArr == null) {
                    iArr = read256ColorPaletteFromEndOfFile(byteSource);
                }
                if (iArr == null) {
                    throw new org.apache.commons.imaging.ImageReadException("No 256 color palette found in image that needs it");
                }
            } else {
                iArr = pcxHeader.colormap;
            }
            int[] iArr2 = iArr;
            if (pcxHeader.bitsPerPixel == 8) {
                createPackedRaster = java.awt.image.Raster.createInterleavedRaster(dataBufferByte, i, i2, i4, 1, new int[]{0}, (java.awt.Point) null);
            } else {
                createPackedRaster = java.awt.image.Raster.createPackedRaster(dataBufferByte, i, i2, pcxHeader.bitsPerPixel, (java.awt.Point) null);
            }
            java.awt.image.IndexColorModel indexColorModel = new java.awt.image.IndexColorModel(pcxHeader.bitsPerPixel, 1 << pcxHeader.bitsPerPixel, iArr2, 0, false, -1, 0);
            return new java.awt.image.BufferedImage(indexColorModel, createPackedRaster, indexColorModel.isAlphaPremultiplied(), new java.util.Properties());
        }
        if (pcxHeader.bitsPerPixel == 1 && 2 <= pcxHeader.nPlanes && pcxHeader.nPlanes <= 4) {
            java.awt.image.BufferedImage bufferedImage = new java.awt.image.BufferedImage(i, i2, 12, new java.awt.image.IndexColorModel(pcxHeader.nPlanes, 1 << pcxHeader.nPlanes, pcxHeader.colormap, 0, false, -1, 0));
            byte[] bArr3 = new byte[i];
            int i7 = 0;
            while (i7 < i2) {
                rleReader2.read(inputStream, bArr);
                java.util.Arrays.fill(bArr3, b);
                int i8 = b;
                int i9 = i8;
                while (i8 < pcxHeader.nPlanes) {
                    int i10 = b;
                    while (i10 < pcxHeader.bytesPerLine) {
                        int i11 = bArr[i9];
                        int i12 = 0;
                        while (i12 < i3) {
                            int i13 = (i10 * 8) + i12;
                            if (i13 < i) {
                                bArr3[i13] = (byte) (bArr3[i13] | ((byte) ((((i11 & 255) >> (7 - i12)) & 1) << i8)));
                                i12++;
                                i3 = 8;
                            }
                        }
                        i10++;
                        i9++;
                        i3 = 8;
                    }
                    i8++;
                    b = 0;
                    i3 = 8;
                }
                byte[] bArr4 = bArr3;
                bufferedImage.getRaster().setDataElements(0, i7, i, 1, bArr4);
                i7++;
                bufferedImage = bufferedImage;
                bArr3 = bArr4;
                b = 0;
                i3 = 8;
            }
            return bufferedImage;
        }
        if (pcxHeader.bitsPerPixel == 8 && pcxHeader.nPlanes == 3) {
            int i14 = i * i2;
            byte[][] bArr5 = {new byte[i14], new byte[i14], new byte[i14]};
            for (int i15 = 0; i15 < i2; i15++) {
                rleReader2.read(inputStream, bArr);
                int i16 = i15 * i;
                java.lang.System.arraycopy(bArr, 0, bArr5[0], i16, i);
                java.lang.System.arraycopy(bArr, pcxHeader.bytesPerLine, bArr5[1], i16, i);
                java.lang.System.arraycopy(bArr, pcxHeader.bytesPerLine * 2, bArr5[2], i16, i);
            }
            java.awt.image.WritableRaster createBandedRaster = java.awt.image.Raster.createBandedRaster(new java.awt.image.DataBufferByte(bArr5, bArr5[0].length), i, i2, i, new int[]{0, 1, 2}, new int[]{0, 0, 0}, (java.awt.Point) null);
            java.awt.image.ComponentColorModel componentColorModel = new java.awt.image.ComponentColorModel(java.awt.color.ColorSpace.getInstance(1000), false, false, 1, 0);
            return new java.awt.image.BufferedImage(componentColorModel, createBandedRaster, componentColorModel.isAlphaPremultiplied(), new java.util.Properties());
        }
        int i17 = pcxHeader.bitsPerPixel == 24 ? 1 : 1;
        if (pcxHeader.bitsPerPixel != 32 || pcxHeader.nPlanes != i17) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid/unsupported image with bitsPerPixel ");
            sb3.append(pcxHeader.bitsPerPixel);
            sb3.append(" and planes ");
            sb3.append(pcxHeader.nPlanes);
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        int i18 = i * 3;
        int i19 = i18 * i2;
        byte[] bArr6 = new byte[i19];
        for (int i20 = 0; i20 < i2; i20++) {
            rleReader2.read(inputStream, bArr);
            if (pcxHeader.bitsPerPixel == 24) {
                java.lang.System.arraycopy(bArr, 0, bArr6, i20 * i18, i18);
            } else {
                for (int i21 = 0; i21 < i; i21++) {
                    int i22 = (i20 * i18) + (i21 * 3);
                    int i23 = i21 * 4;
                    bArr6[i22] = bArr[i23];
                    bArr6[i22 + 1] = bArr[i23 + 1];
                    bArr6[i22 + 2] = bArr[i23 + 2];
                }
            }
        }
        java.awt.image.WritableRaster createInterleavedRaster = java.awt.image.Raster.createInterleavedRaster(new java.awt.image.DataBufferByte(bArr6, i19), i, i2, i18, 3, new int[]{2, 1, 0}, (java.awt.Point) null);
        java.awt.image.ComponentColorModel componentColorModel2 = new java.awt.image.ComponentColorModel(java.awt.color.ColorSpace.getInstance(1000), false, false, 1, 0);
        return new java.awt.image.BufferedImage(componentColorModel2, createInterleavedRaster, componentColorModel2.isAlphaPremultiplied(), new java.util.Properties());
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.lang.Object obj = (map == null ? new java.util.HashMap() : new java.util.HashMap(map)).get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_STRICT);
        boolean booleanValue = obj != null ? ((java.lang.Boolean) obj).booleanValue() : false;
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            java.awt.image.BufferedImage readImage = readImage(readPcxHeader(inputStream, booleanValue), inputStream, byteSource);
            if (inputStream != null) {
                inputStream.close();
            }
            return readImage;
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        new org.apache.commons.imaging.formats.pcx.PcxWriter(map).writeImage(bufferedImage, outputStream);
    }
}
