package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes17.dex */
public class BmpImageParser extends org.apache.commons.imaging.ImageParser {
    private static final int BITMAP_FILE_HEADER_SIZE = 14;
    private static final int BITMAP_INFO_HEADER_SIZE = 40;
    private static final int BI_BITFIELDS = 3;
    private static final int BI_RGB = 0;
    private static final int BI_RLE4 = 2;
    private static final int BI_RLE8 = 1;
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.bmp.BmpImageParser.class.getName());
    private static final java.lang.String DEFAULT_EXTENSION = ".bmp";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};
    private static final byte[] BMP_HEADER_SIGNATURE = {66, 77};

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    public BmpImageParser() {
        super.setByteOrder(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Bmp-Custom";
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
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.BMP};
    }

    private org.apache.commons.imaging.formats.bmp.BmpHeaderInfo readBmpHeaderInfo(java.io.InputStream inputStream, org.apache.commons.imaging.FormatCompliance formatCompliance) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int read4Bytes;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("Identifier1", inputStream, "Not a Valid BMP File");
        byte readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("Identifier2", inputStream, "Not a Valid BMP File");
        if (formatCompliance != null) {
            formatCompliance.compareBytes("Signature", BMP_HEADER_SIGNATURE, new byte[]{readByte, readByte2});
        }
        int read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("File Size", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes3 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Reserved", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes4 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Bitmap Data Offset", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes5 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Bitmap Header Size", inputStream, "Not a Valid BMP File", getByteOrder());
        org.apache.commons.imaging.formats.bmp.BmpHeaderInfo.ColorSpace colorSpace = new org.apache.commons.imaging.formats.bmp.BmpHeaderInfo.ColorSpace();
        colorSpace.red = new org.apache.commons.imaging.formats.bmp.BmpHeaderInfo.ColorSpaceCoordinate();
        colorSpace.green = new org.apache.commons.imaging.formats.bmp.BmpHeaderInfo.ColorSpaceCoordinate();
        colorSpace.blue = new org.apache.commons.imaging.formats.bmp.BmpHeaderInfo.ColorSpaceCoordinate();
        if (read4Bytes5 >= 40) {
            int read4Bytes6 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(com.google.common.net.HttpHeaders.WIDTH, inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes7 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Height, inputStream, "Not a Valid BMP File", getByteOrder());
            int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Planes", inputStream, "Not a Valid BMP File", getByteOrder());
            int read2Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Bits Per Pixel", inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes8 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(androidx.exifinterface.media.ExifInterface.TAG_COMPRESSION, inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes9 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Bitmap Data Size", inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes10 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("HResolution", inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes11 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("VResolution", inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes12 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorsUsed", inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes13 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorsImportant", inputStream, "Not a Valid BMP File", getByteOrder());
            if (read4Bytes5 >= 52 || read4Bytes8 == 3) {
                int read4Bytes14 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("RedMask", inputStream, "Not a Valid BMP File", getByteOrder());
                int read4Bytes15 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("GreenMask", inputStream, "Not a Valid BMP File", getByteOrder());
                read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("BlueMask", inputStream, "Not a Valid BMP File", getByteOrder());
                i = read4Bytes14;
                i2 = read4Bytes15;
            } else {
                i = 0;
                i2 = 0;
                read4Bytes = 0;
            }
            if (read4Bytes5 >= 56) {
                i3 = i;
                i4 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("AlphaMask", inputStream, "Not a Valid BMP File", getByteOrder());
            } else {
                i3 = i;
                i4 = 0;
            }
            if (read4Bytes5 >= 108) {
                i5 = i4;
                int read4Bytes16 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorSpaceType", inputStream, "Not a Valid BMP File", getByteOrder());
                i6 = read4Bytes8;
                colorSpace.red.x = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorSpaceRedX", inputStream, "Not a Valid BMP File", getByteOrder());
                colorSpace.red.y = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorSpaceRedY", inputStream, "Not a Valid BMP File", getByteOrder());
                colorSpace.red.z = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorSpaceRedZ", inputStream, "Not a Valid BMP File", getByteOrder());
                colorSpace.green.x = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorSpaceGreenX", inputStream, "Not a Valid BMP File", getByteOrder());
                colorSpace.green.y = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorSpaceGreenY", inputStream, "Not a Valid BMP File", getByteOrder());
                colorSpace.green.z = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorSpaceGreenZ", inputStream, "Not a Valid BMP File", getByteOrder());
                colorSpace.blue.x = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorSpaceBlueX", inputStream, "Not a Valid BMP File", getByteOrder());
                colorSpace.blue.y = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorSpaceBlueY", inputStream, "Not a Valid BMP File", getByteOrder());
                colorSpace.blue.z = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorSpaceBlueZ", inputStream, "Not a Valid BMP File", getByteOrder());
                int read4Bytes17 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("GammaRed", inputStream, "Not a Valid BMP File", getByteOrder());
                int read4Bytes18 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("GammaGreen", inputStream, "Not a Valid BMP File", getByteOrder());
                i10 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("GammaBlue", inputStream, "Not a Valid BMP File", getByteOrder());
                i7 = read4Bytes16;
                i8 = read4Bytes17;
                i9 = read4Bytes18;
            } else {
                i5 = i4;
                i6 = read4Bytes8;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
            }
            if (read4Bytes5 >= 124) {
                i11 = i8;
                int read4Bytes19 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Intent", inputStream, "Not a Valid BMP File", getByteOrder());
                int read4Bytes20 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ProfileData", inputStream, "Not a Valid BMP File", getByteOrder());
                int read4Bytes21 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ProfileSize", inputStream, "Not a Valid BMP File", getByteOrder());
                i14 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Reserved", inputStream, "Not a Valid BMP File", getByteOrder());
                i15 = read4Bytes21;
                i12 = read4Bytes19;
                i13 = read4Bytes20;
            } else {
                i11 = i8;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i15 = 0;
            }
            int i30 = i14;
            if (LOGGER.isLoggable(java.util.logging.Level.FINE)) {
                debugNumber("identifier1", readByte, 1);
                debugNumber("identifier2", readByte2, 1);
                debugNumber("fileSize", read4Bytes2, 4);
                debugNumber("reserved", read4Bytes3, 4);
                debugNumber("bitmapDataOffset", read4Bytes4, 4);
                debugNumber("bitmapHeaderSize", read4Bytes5, 4);
                debugNumber("width", read4Bytes6, 4);
                debugNumber("height", read4Bytes7, 4);
                i17 = read4Bytes7;
                debugNumber("planes", read2Bytes, 2);
                debugNumber("bitsPerPixel", read2Bytes2, 2);
                int i31 = i6;
                debugNumber("compression", i31, 4);
                i25 = read4Bytes6;
                debugNumber("bitmapDataSize", read4Bytes9, 4);
                debugNumber("hResolution", read4Bytes10, 4);
                debugNumber("vResolution", read4Bytes11, 4);
                debugNumber("colorsUsed", read4Bytes12, 4);
                debugNumber("colorsImportant", read4Bytes13, 4);
                if (read4Bytes5 >= 52 || i31 == 3) {
                    i22 = i31;
                    debugNumber("redMask", i3, 4);
                    i19 = read4Bytes13;
                    i26 = i2;
                    debugNumber("greenMask", i26, 4);
                    i27 = read4Bytes;
                    debugNumber("blueMask", i27, 4);
                } else {
                    i19 = read4Bytes13;
                    i22 = i31;
                    i26 = i2;
                    i27 = read4Bytes;
                }
                if (read4Bytes5 >= 56) {
                    i23 = i27;
                    i20 = i5;
                    debugNumber("alphaMask", i20, 4);
                } else {
                    i23 = i27;
                    i20 = i5;
                }
                if (read4Bytes5 >= 108) {
                    debugNumber("colorSpaceType", i7, 4);
                    i2 = i26;
                    debugNumber("colorSpace.red.x", colorSpace.red.x, 1);
                    debugNumber("colorSpace.red.y", colorSpace.red.y, 1);
                    debugNumber("colorSpace.red.z", colorSpace.red.z, 1);
                    debugNumber("colorSpace.green.x", colorSpace.green.x, 1);
                    debugNumber("colorSpace.green.y", colorSpace.green.y, 1);
                    debugNumber("colorSpace.green.z", colorSpace.green.z, 1);
                    debugNumber("colorSpace.blue.x", colorSpace.blue.x, 1);
                    debugNumber("colorSpace.blue.y", colorSpace.blue.y, 1);
                    debugNumber("colorSpace.blue.z", colorSpace.blue.z, 1);
                    i28 = 4;
                    debugNumber("gammaRed", i11, 4);
                    i29 = i9;
                    debugNumber("gammaGreen", i29, 4);
                    i16 = i7;
                    i24 = i10;
                    debugNumber("gammaBlue", i24, 4);
                } else {
                    i16 = i7;
                    i2 = i26;
                    i24 = i10;
                    i28 = 4;
                    i29 = i9;
                }
                if (read4Bytes5 >= 124) {
                    debugNumber("intent", i12, i28);
                    debugNumber("profileData", i13, i28);
                    debugNumber("profileSize", i15, i28);
                    i21 = i29;
                    i18 = i30;
                    debugNumber("reservedV5", i18, i28);
                } else {
                    i21 = i29;
                    i18 = i30;
                }
            } else {
                i16 = i7;
                i17 = read4Bytes7;
                i18 = i30;
                i19 = read4Bytes13;
                i20 = i5;
                i21 = i9;
                i22 = i6;
                i23 = read4Bytes;
                i24 = i10;
                i25 = read4Bytes6;
            }
            return new org.apache.commons.imaging.formats.bmp.BmpHeaderInfo(readByte, readByte2, read4Bytes2, read4Bytes3, read4Bytes4, read4Bytes5, i25, i17, read2Bytes, read2Bytes2, i22, read4Bytes9, read4Bytes10, read4Bytes11, read4Bytes12, i19, i3, i2, i23, i20, i16, colorSpace, i11, i21, i24, i12, i13, i15, i18);
        }
        throw new org.apache.commons.imaging.ImageReadException("Invalid/unsupported BMP file");
    }

    private byte[] getRLEBytes(java.io.InputStream inputStream, int i) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        boolean z = false;
        while (!z) {
            int readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("RLE a", inputStream, "BMP: Bad RLE") & 255;
            byteArrayOutputStream.write(readByte);
            int readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("RLE b", inputStream, "BMP: Bad RLE") & 255;
            byteArrayOutputStream.write(readByte2);
            if (readByte == 0 && readByte2 != 0) {
                if (readByte2 == 1) {
                    z = true;
                } else if (readByte2 == 2) {
                    byteArrayOutputStream.write(org.apache.commons.imaging.common.BinaryFunctions.readByte("RLE c", inputStream, "BMP: Bad RLE") & 255);
                    byteArrayOutputStream.write(org.apache.commons.imaging.common.BinaryFunctions.readByte("RLE d", inputStream, "BMP: Bad RLE") & 255);
                } else {
                    int i2 = readByte2 / i;
                    if (readByte2 % i > 0) {
                        i2++;
                    }
                    if (i2 % 2 != 0) {
                        i2++;
                    }
                    byteArrayOutputStream.write(org.apache.commons.imaging.common.BinaryFunctions.readBytes(com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, inputStream, i2, "RLE: Absolute Mode"));
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r2.bitsPerPixel <= 8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a6, code lost:
    
        r3 = r3 * 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00a4, code lost:
    
        if (r2.bitsPerPixel <= 8) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110 A[LOOP:0: B:33:0x010c->B:35:0x0110, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private org.apache.commons.imaging.formats.bmp.BmpImageContents readImageContents(java.io.InputStream inputStream, org.apache.commons.imaging.FormatCompliance formatCompliance) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i;
        int i2;
        boolean z;
        int i3;
        java.util.logging.Logger logger;
        int i4;
        byte[] readBytes;
        org.apache.commons.imaging.formats.bmp.PixelParser pixelParserRgb;
        org.apache.commons.imaging.formats.bmp.BmpHeaderInfo readBmpHeaderInfo = readBmpHeaderInfo(inputStream, formatCompliance);
        int i5 = readBmpHeaderInfo.colorsUsed;
        if (i5 == 0) {
            i5 = 1 << readBmpHeaderInfo.bitsPerPixel;
        }
        java.util.logging.Logger logger2 = LOGGER;
        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
            debugNumber("ColorsUsed", readBmpHeaderInfo.colorsUsed, 4);
            debugNumber("BitsPerPixel", readBmpHeaderInfo.bitsPerPixel, 4);
            debugNumber("ColorTableSize", i5, 4);
            debugNumber("bhi.colorsUsed", readBmpHeaderInfo.colorsUsed, 4);
            debugNumber(androidx.exifinterface.media.ExifInterface.TAG_COMPRESSION, readBmpHeaderInfo.compression, 4);
        }
        int i6 = readBmpHeaderInfo.compression;
        if (i6 == 0) {
            if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                logger2.fine("Compression: BI_RGB");
            }
        } else {
            if (i6 == 1) {
                if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                    logger2.fine("Compression: BI_RLE8");
                }
                i = i5 * 4;
                z = true;
                i2 = 1;
            } else if (i6 == 2) {
                if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                    logger2.fine("Compression: BI_RLE4");
                }
                i = i5 * 4;
                z = true;
                i2 = 2;
            } else if (i6 == 3) {
                if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                    logger2.fine("Compression: BI_BITFIELDS");
                }
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("BMP: Unknown Compression: ");
                sb.append(readBmpHeaderInfo.compression);
                throw new org.apache.commons.imaging.ImageReadException(sb.toString());
            }
            byte[] readBytes2 = i <= 0 ? org.apache.commons.imaging.common.BinaryFunctions.readBytes("ColorTable", inputStream, i, "Not a Valid BMP File") : null;
            if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                debugNumber("paletteLength", i, 4);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ColorTable: ");
                sb2.append(readBytes2 == null ? "null" : java.lang.Integer.toString(readBytes2.length));
                logger2.fine(sb2.toString());
            }
            i3 = ((readBmpHeaderInfo.bitsPerPixel * readBmpHeaderInfo.width) + 7) / 8;
            if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                int i7 = readBmpHeaderInfo.width;
                int i8 = readBmpHeaderInfo.height;
                debugNumber("bhi.Width", readBmpHeaderInfo.width, 4);
                debugNumber("bhi.Height", readBmpHeaderInfo.height, 4);
                debugNumber("ImageLineLength", i3, 4);
                debugNumber("PixelCount", i7 * i8, 4);
            }
            while (i3 % 4 != 0) {
                i3++;
            }
            int i9 = readBmpHeaderInfo.bitmapHeaderSize + 14 + ((readBmpHeaderInfo.bitmapHeaderSize == 40 || readBmpHeaderInfo.compression != 3) ? 0 : 12);
            int i10 = i9 + i;
            logger = LOGGER;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                debugNumber("bhi.BitmapDataOffset", readBmpHeaderInfo.bitmapDataOffset, 4);
                debugNumber("expectedDataOffset", i10, 4);
            }
            i4 = readBmpHeaderInfo.bitmapDataOffset - i10;
            if (i4 >= 0) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("BMP has invalid image data offset: ");
                sb3.append(readBmpHeaderInfo.bitmapDataOffset);
                sb3.append(" (expected: ");
                sb3.append(i10);
                sb3.append(", paletteLength: ");
                sb3.append(i);
                sb3.append(", headerSize: ");
                sb3.append(i9);
                sb3.append(")");
                throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
            }
            if (i4 > 0) {
                org.apache.commons.imaging.common.BinaryFunctions.readBytes("BitmapDataOffset", inputStream, i4, "Not a Valid BMP File");
            }
            int i11 = readBmpHeaderInfo.height * i3;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                debugNumber("imageDataSize", i11, 4);
            }
            if (!z) {
                readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("ImageData", inputStream, i11, "Not a Valid BMP File");
            } else {
                readBytes = getRLEBytes(inputStream, i2);
            }
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                debugNumber("ImageData.length", readBytes.length, 4);
            }
            int i12 = readBmpHeaderInfo.compression;
            if (i12 == 0) {
                pixelParserRgb = new org.apache.commons.imaging.formats.bmp.PixelParserRgb(readBmpHeaderInfo, readBytes2, readBytes);
            } else if (i12 == 1 || i12 == 2) {
                pixelParserRgb = new org.apache.commons.imaging.formats.bmp.PixelParserRle(readBmpHeaderInfo, readBytes2, readBytes);
            } else if (i12 == 3) {
                pixelParserRgb = new org.apache.commons.imaging.formats.bmp.PixelParserBitFields(readBmpHeaderInfo, readBytes2, readBytes);
            } else {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("BMP: Unknown Compression: ");
                sb4.append(readBmpHeaderInfo.compression);
                throw new org.apache.commons.imaging.ImageReadException(sb4.toString());
            }
            return new org.apache.commons.imaging.formats.bmp.BmpImageContents(readBmpHeaderInfo, readBytes2, readBytes, pixelParserRgb);
        }
        z = false;
        i2 = 0;
        if (i <= 0) {
        }
        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
        }
        i3 = ((readBmpHeaderInfo.bitsPerPixel * readBmpHeaderInfo.width) + 7) / 8;
        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
        }
        while (i3 % 4 != 0) {
        }
        int i92 = readBmpHeaderInfo.bitmapHeaderSize + 14 + ((readBmpHeaderInfo.bitmapHeaderSize == 40 || readBmpHeaderInfo.compression != 3) ? 0 : 12);
        int i102 = i92 + i;
        logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
        }
        i4 = readBmpHeaderInfo.bitmapDataOffset - i102;
        if (i4 >= 0) {
        }
    }

    private org.apache.commons.imaging.formats.bmp.BmpHeaderInfo readBmpHeaderInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.bmp.BmpHeaderInfo readBmpHeaderInfo = readBmpHeaderInfo(inputStream, null);
            if (inputStream != null) {
                inputStream.close();
            }
            return readBmpHeaderInfo;
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

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        org.apache.commons.imaging.formats.bmp.BmpHeaderInfo readBmpHeaderInfo = readBmpHeaderInfo(byteSource);
        if (readBmpHeaderInfo == null) {
            throw new org.apache.commons.imaging.ImageReadException("BMP: couldn't read header");
        }
        return new java.awt.Dimension(readBmpHeaderInfo.width, readBmpHeaderInfo.height);
    }

    private java.lang.String getBmpTypeDescription(int i, int i2) {
        if (i == 66 && i2 == 77) {
            return "Windows 3.1x, 95, NT,";
        }
        if (i == 66 && i2 == 65) {
            return "OS/2 Bitmap Array";
        }
        if (i == 67 && i2 == 73) {
            return "OS/2 Color Icon";
        }
        if (i == 67 && i2 == 80) {
            return "OS/2 Color Pointer";
        }
        if (i == 73 && i2 == 67) {
            return "OS/2 Icon";
        }
        if (i == 80 && i2 == 84) {
            return "OS/2 Pointer";
        }
        return "Unknown";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.bmp.BmpImageContents readImageContents = readImageContents(inputStream, org.apache.commons.imaging.FormatCompliance.getDefault());
            if (inputStream != null) {
                inputStream.close();
            }
            if (readImageContents == null) {
                throw new org.apache.commons.imaging.ImageReadException("Couldn't read BMP Data");
            }
            org.apache.commons.imaging.formats.bmp.BmpHeaderInfo bmpHeaderInfo = readImageContents.bhi;
            byte[] bArr = readImageContents.colorTable;
            if (bmpHeaderInfo == null) {
                throw new org.apache.commons.imaging.ImageReadException("BMP: couldn't read header");
            }
            int i = bmpHeaderInfo.height;
            int i2 = bmpHeaderInfo.width;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i3 = bmpHeaderInfo.bitsPerPixel;
            org.apache.commons.imaging.ImageFormats imageFormats = org.apache.commons.imaging.ImageFormats.BMP;
            int i4 = (int) (bmpHeaderInfo.hResolution * 0.0254d);
            float f = (float) (i2 / i4);
            int i5 = (int) (bmpHeaderInfo.vResolution * 0.0254d);
            float f2 = (float) (i / i5);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bmp (");
            sb.append((char) bmpHeaderInfo.identifier1);
            sb.append((char) bmpHeaderInfo.identifier2);
            sb.append(": ");
            sb.append(getBmpTypeDescription(bmpHeaderInfo.identifier1, bmpHeaderInfo.identifier2));
            sb.append(")");
            return new org.apache.commons.imaging.ImageInfo(sb.toString(), i3, arrayList, imageFormats, "BMP Windows Bitmap", i, "image/x-ms-bmp", -1, i5, f2, i4, f, i2, false, false, bArr != null, org.apache.commons.imaging.ImageInfo.ColorType.RGB, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.RLE);
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        printWriter.println("bmp.dumpImageFile");
        getImageInfo(byteSource, (java.util.Map<java.lang.String, java.lang.Object>) null).toString(printWriter, "");
        printWriter.println("");
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.FormatCompliance getFormatCompliance(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.FormatCompliance formatCompliance = new org.apache.commons.imaging.FormatCompliance(byteSource.getDescription());
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            readImageContents(inputStream, formatCompliance);
            if (inputStream != null) {
                inputStream.close();
            }
            return formatCompliance;
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

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            java.awt.image.BufferedImage bufferedImage = getBufferedImage(inputStream, map);
            if (inputStream != null) {
                inputStream.close();
            }
            return bufferedImage;
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

    public java.awt.image.BufferedImage getBufferedImage(java.io.InputStream inputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.BUFFERED_IMAGE_FACTORY)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.BUFFERED_IMAGE_FACTORY);
        }
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        org.apache.commons.imaging.formats.bmp.BmpImageContents readImageContents = readImageContents(inputStream, org.apache.commons.imaging.FormatCompliance.getDefault());
        if (readImageContents == null) {
            throw new org.apache.commons.imaging.ImageReadException("Couldn't read BMP Data");
        }
        org.apache.commons.imaging.formats.bmp.BmpHeaderInfo bmpHeaderInfo = readImageContents.bhi;
        int i = bmpHeaderInfo.width;
        int i2 = bmpHeaderInfo.height;
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine("width: ".concat(java.lang.String.valueOf(i)));
            logger.fine("height: ".concat(java.lang.String.valueOf(i2)));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("width*height: ");
            int i3 = i * i2;
            sb.append(i3);
            logger.fine(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("width*height*4: ");
            sb2.append(i3 * 4);
            logger.fine(sb2.toString());
        }
        org.apache.commons.imaging.formats.bmp.PixelParser pixelParser = readImageContents.pixelParser;
        org.apache.commons.imaging.common.ImageBuilder imageBuilder = new org.apache.commons.imaging.common.ImageBuilder(i, i2, true);
        pixelParser.processImage(imageBuilder);
        return imageBuilder.getBufferedImage();
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        org.apache.commons.imaging.formats.bmp.BmpWriter bmpWriterPalette;
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        org.apache.commons.imaging.PixelDensity pixelDensity = hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY) ? (org.apache.commons.imaging.PixelDensity) hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY) : null;
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        org.apache.commons.imaging.palette.SimplePalette makeExactRgbPaletteSimple = new org.apache.commons.imaging.palette.PaletteFactory().makeExactRgbPaletteSimple(bufferedImage, 256);
        if (makeExactRgbPaletteSimple == null) {
            bmpWriterPalette = new org.apache.commons.imaging.formats.bmp.BmpWriterRgb();
        } else {
            bmpWriterPalette = new org.apache.commons.imaging.formats.bmp.BmpWriterPalette(makeExactRgbPaletteSimple);
        }
        byte[] imageData = bmpWriterPalette.getImageData(bufferedImage);
        org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream = new org.apache.commons.imaging.common.BinaryOutputStream(outputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        outputStream.write(66);
        outputStream.write(77);
        binaryOutputStream.write4Bytes((bmpWriterPalette.getPaletteSize() * 4) + 54 + imageData.length);
        binaryOutputStream.write4Bytes(0);
        binaryOutputStream.write4Bytes((bmpWriterPalette.getPaletteSize() * 4) + 54);
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        binaryOutputStream.write4Bytes(40);
        binaryOutputStream.write4Bytes(width);
        binaryOutputStream.write4Bytes(height);
        binaryOutputStream.write2Bytes(1);
        binaryOutputStream.write2Bytes(bmpWriterPalette.getBitsPerPixel());
        binaryOutputStream.write4Bytes(0);
        binaryOutputStream.write4Bytes(imageData.length);
        binaryOutputStream.write4Bytes(pixelDensity != null ? (int) java.lang.Math.round(pixelDensity.horizontalDensityMetres()) : 0);
        binaryOutputStream.write4Bytes(pixelDensity != null ? (int) java.lang.Math.round(pixelDensity.verticalDensityMetres()) : 0);
        if (makeExactRgbPaletteSimple == null) {
            binaryOutputStream.write4Bytes(0);
        } else {
            binaryOutputStream.write4Bytes(makeExactRgbPaletteSimple.length());
        }
        binaryOutputStream.write4Bytes(0);
        bmpWriterPalette.writePalette(binaryOutputStream);
        binaryOutputStream.write(imageData);
    }
}
