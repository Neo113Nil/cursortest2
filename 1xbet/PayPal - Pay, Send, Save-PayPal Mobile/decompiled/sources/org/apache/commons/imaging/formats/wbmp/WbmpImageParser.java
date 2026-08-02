package org.apache.commons.imaging.formats.wbmp;

/* loaded from: classes17.dex */
public class WbmpImageParser extends org.apache.commons.imaging.ImageParser {
    private static final java.lang.String DEFAULT_EXTENSION = ".wbmp";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Wireless Application Protocol Bitmap Format";
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
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.WBMP};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.wbmp.WbmpImageParser.WbmpHeader readWbmpHeader = readWbmpHeader(byteSource);
        return new org.apache.commons.imaging.ImageInfo("WBMP", 1, new java.util.ArrayList(), org.apache.commons.imaging.ImageFormats.WBMP, "Wireless Application Protocol Bitmap", readWbmpHeader.height, "image/vnd.wap.wbmp", 1, 0, 0.0f, 0, 0.0f, readWbmpHeader.width, false, false, false, org.apache.commons.imaging.ImageInfo.ColorType.BW, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.wbmp.WbmpImageParser.WbmpHeader readWbmpHeader = readWbmpHeader(byteSource);
        return new java.awt.Dimension(readWbmpHeader.width, readWbmpHeader.height);
    }

    static class WbmpHeader {
        byte fixHeaderField;
        int height;
        int typeField;
        int width;

        WbmpHeader(int i, byte b, int i2, int i3) {
            this.typeField = i;
            this.fixHeaderField = b;
            this.width = i2;
            this.height = i3;
        }

        public void dump(java.io.PrintWriter printWriter) {
            printWriter.println("WbmpHeader");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TypeField: ");
            sb.append(this.typeField);
            printWriter.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("FixHeaderField: 0x");
            sb2.append(java.lang.Integer.toHexString(this.fixHeaderField & 255));
            printWriter.println(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Width: ");
            sb3.append(this.width);
            printWriter.println(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Height: ");
            sb4.append(this.height);
            printWriter.println(sb4.toString());
        }
    }

    private int readMultiByteInteger(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte readByte;
        int i = 0;
        int i2 = 0;
        do {
            readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("Header", inputStream, "Error reading WBMP header");
            i = (i << 7) | (readByte & Byte.MAX_VALUE);
            i2 += 7;
            if (i2 > 31) {
                throw new org.apache.commons.imaging.ImageReadException("Overflow reading WBMP multi-byte field");
            }
        } while ((readByte & 128) != 0);
        return i;
    }

    private void writeMultiByteInteger(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        boolean z = false;
        for (int i2 = 28; i2 > 0; i2 -= 7) {
            int i3 = (i >>> i2) & 127;
            if (i3 != 0 || z) {
                outputStream.write(i3 | 128);
                z = true;
            }
        }
        outputStream.write(i & 127);
    }

    private org.apache.commons.imaging.formats.wbmp.WbmpImageParser.WbmpHeader readWbmpHeader(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.wbmp.WbmpImageParser.WbmpHeader readWbmpHeader = readWbmpHeader(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readWbmpHeader;
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

    private org.apache.commons.imaging.formats.wbmp.WbmpImageParser.WbmpHeader readWbmpHeader(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int readMultiByteInteger = readMultiByteInteger(inputStream);
        if (readMultiByteInteger != 0) {
            throw new org.apache.commons.imaging.ImageReadException("Invalid/unsupported WBMP type ".concat(java.lang.String.valueOf(readMultiByteInteger)));
        }
        byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("FixHeaderField", inputStream, "Invalid WBMP File");
        if ((readByte & 159) != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid/unsupported WBMP FixHeaderField 0x");
            sb.append(java.lang.Integer.toHexString(readByte & 255));
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        return new org.apache.commons.imaging.formats.wbmp.WbmpImageParser.WbmpHeader(readMultiByteInteger, readByte, readMultiByteInteger(inputStream), readMultiByteInteger(inputStream));
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        readWbmpHeader(byteSource).dump(printWriter);
        return true;
    }

    private java.awt.image.BufferedImage readImage(org.apache.commons.imaging.formats.wbmp.WbmpImageParser.WbmpHeader wbmpHeader, java.io.InputStream inputStream) throws java.io.IOException {
        byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("Pixels", inputStream, ((wbmpHeader.width + 7) / 8) * wbmpHeader.height, "Error reading image pixels");
        java.awt.image.WritableRaster createPackedRaster = java.awt.image.Raster.createPackedRaster(new java.awt.image.DataBufferByte(readBytes, readBytes.length), wbmpHeader.width, wbmpHeader.height, 1, (java.awt.Point) null);
        java.awt.image.IndexColorModel indexColorModel = new java.awt.image.IndexColorModel(1, 2, new int[]{0, 16777215}, 0, false, -1, 0);
        return new java.awt.image.BufferedImage(indexColorModel, createPackedRaster, indexColorModel.isAlphaPremultiplied(), new java.util.Properties());
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            java.awt.image.BufferedImage readImage = readImage(readWbmpHeader(inputStream), inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readImage;
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
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        writeMultiByteInteger(outputStream, 0);
        outputStream.write(0);
        writeMultiByteInteger(outputStream, bufferedImage.getWidth());
        writeMultiByteInteger(outputStream, bufferedImage.getHeight());
        for (int i = 0; i < bufferedImage.getHeight(); i++) {
            int i2 = 0;
            int i3 = 128;
            for (int i4 = 0; i4 < bufferedImage.getWidth(); i4++) {
                int rgb = bufferedImage.getRGB(i4, i);
                if (((((rgb >> 16) & 255) + ((rgb >> 8) & 255)) + (rgb & 255)) / 3 > 127) {
                    i2 |= i3;
                }
                i3 >>>= 1;
                if (i3 == 0) {
                    outputStream.write(i2);
                    i2 = 0;
                    i3 = 128;
                }
            }
            if (i3 != 128) {
                outputStream.write(i2);
            }
        }
    }
}
