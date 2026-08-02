package org.apache.commons.imaging.formats.icns;

/* loaded from: classes17.dex */
public class IcnsImageParser extends org.apache.commons.imaging.ImageParser {
    static final int ICNS_MAGIC = org.apache.commons.imaging.formats.icns.IcnsType.typeAsInt("icns");
    private static final java.lang.String DEFAULT_EXTENSION = ".icns";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    public IcnsImageParser() {
        super.setByteOrder(java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Apple Icon Image";
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
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.ICNS};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        java.util.List<java.awt.image.BufferedImage> decodeAllImages = org.apache.commons.imaging.formats.icns.IcnsDecoder.decodeAllImages(readImage(byteSource).icnsElements);
        if (decodeAllImages.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("No icons in ICNS file");
        }
        java.awt.image.BufferedImage bufferedImage = decodeAllImages.get(0);
        return new org.apache.commons.imaging.ImageInfo("Icns", 32, new java.util.ArrayList(), org.apache.commons.imaging.ImageFormats.ICNS, "ICNS Apple Icon Image", bufferedImage.getHeight(), "image/x-icns", decodeAllImages.size(), 0, 0.0f, 0, 0.0f, bufferedImage.getWidth(), false, true, false, org.apache.commons.imaging.ImageInfo.ColorType.RGB, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.UNKNOWN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        java.util.List<java.awt.image.BufferedImage> decodeAllImages = org.apache.commons.imaging.formats.icns.IcnsDecoder.decodeAllImages(readImage(byteSource).icnsElements);
        if (decodeAllImages.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("No icons in ICNS file");
        }
        java.awt.image.BufferedImage bufferedImage = decodeAllImages.get(0);
        return new java.awt.Dimension(bufferedImage.getWidth(), bufferedImage.getHeight());
    }

    static class IcnsHeader {
        public final int fileSize;
        public final int magic;

        IcnsHeader(int i, int i2) {
            this.magic = i;
            this.fileSize = i2;
        }

        public void dump(java.io.PrintWriter printWriter) {
            printWriter.println("IcnsHeader");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Magic: 0x");
            sb.append(java.lang.Integer.toHexString(this.magic));
            sb.append(" (");
            sb.append(org.apache.commons.imaging.formats.icns.IcnsType.describeType(this.magic));
            sb.append(")");
            printWriter.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("FileSize: ");
            sb2.append(this.fileSize);
            printWriter.println(sb2.toString());
            printWriter.println("");
        }
    }

    private org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsHeader readIcnsHeader(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Magic", inputStream, "Not a Valid ICNS File", getByteOrder());
        int read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("FileSize", inputStream, "Not a Valid ICNS File", getByteOrder());
        if (read4Bytes != ICNS_MAGIC) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Not a Valid ICNS File: magic is 0x");
            sb.append(java.lang.Integer.toHexString(read4Bytes));
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        return new org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsHeader(read4Bytes, read4Bytes2);
    }

    static class IcnsElement {
        public final byte[] data;
        public final int elementSize;
        public final int type;

        IcnsElement(int i, int i2, byte[] bArr) {
            this.type = i;
            this.elementSize = i2;
            this.data = bArr;
        }

        public void dump(java.io.PrintWriter printWriter) {
            java.lang.String obj;
            printWriter.println("IcnsElement");
            org.apache.commons.imaging.formats.icns.IcnsType findAnyType = org.apache.commons.imaging.formats.icns.IcnsType.findAnyType(this.type);
            if (findAnyType == null) {
                obj = "";
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(" ");
                sb.append(findAnyType.toString());
                obj = sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Type: 0x");
            sb2.append(java.lang.Integer.toHexString(this.type));
            sb2.append(" (");
            sb2.append(org.apache.commons.imaging.formats.icns.IcnsType.describeType(this.type));
            sb2.append(")");
            sb2.append(obj);
            printWriter.println(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("ElementSize: ");
            sb3.append(this.elementSize);
            printWriter.println(sb3.toString());
            printWriter.println("");
        }
    }

    private org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsElement readIcnsElement(java.io.InputStream inputStream, int i) throws java.io.IOException {
        int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, inputStream, "Not a valid ICNS file", getByteOrder());
        int read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ElementSize", inputStream, "Not a valid ICNS file", getByteOrder());
        if (read4Bytes2 > i) {
            throw new java.io.IOException(java.lang.String.format("Corrupted ICNS file: element size %d is greater than remaining size %d", java.lang.Integer.valueOf(read4Bytes2), java.lang.Integer.valueOf(i)));
        }
        return new org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsElement(read4Bytes, read4Bytes2, org.apache.commons.imaging.common.BinaryFunctions.readBytes("Data", inputStream, read4Bytes2 - 8, "Not a valid ICNS file"));
    }

    static class IcnsContents {
        public final org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsElement[] icnsElements;
        public final org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsHeader icnsHeader;

        IcnsContents(org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsHeader icnsHeader, org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsElement[] icnsElementArr) {
            this.icnsHeader = icnsHeader;
            this.icnsElements = icnsElementArr;
        }
    }

    private org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsContents readImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsHeader readIcnsHeader = readIcnsHeader(inputStream);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = readIcnsHeader.fileSize - 8;
            while (i > 0) {
                org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsElement readIcnsElement = readIcnsElement(inputStream, i);
                arrayList.add(readIcnsElement);
                i -= readIcnsElement.elementSize;
            }
            int size = arrayList.size();
            org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsElement[] icnsElementArr = new org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsElement[size];
            for (int i2 = 0; i2 < size; i2++) {
                icnsElementArr[i2] = (org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsElement) arrayList.get(i2);
            }
            org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsContents icnsContents = new org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsContents(readIcnsHeader, icnsElementArr);
            if (inputStream != null) {
                inputStream.close();
            }
            return icnsContents;
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
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsContents readImage = readImage(byteSource);
        readImage.icnsHeader.dump(printWriter);
        for (org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsElement icnsElement : readImage.icnsElements) {
            icnsElement.dump(printWriter);
        }
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<java.awt.image.BufferedImage> decodeAllImages = org.apache.commons.imaging.formats.icns.IcnsDecoder.decodeAllImages(readImage(byteSource).icnsElements);
        if (!decodeAllImages.isEmpty()) {
            return decodeAllImages.get(0);
        }
        throw new org.apache.commons.imaging.ImageReadException("No icons in ICNS file");
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return org.apache.commons.imaging.formats.icns.IcnsDecoder.decodeAllImages(readImage(byteSource).icnsElements);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        org.apache.commons.imaging.formats.icns.IcnsType icnsType;
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        if (bufferedImage.getWidth() == 16 && bufferedImage.getHeight() == 16) {
            icnsType = org.apache.commons.imaging.formats.icns.IcnsType.ICNS_16x16_32BIT_IMAGE;
        } else if (bufferedImage.getWidth() == 32 && bufferedImage.getHeight() == 32) {
            icnsType = org.apache.commons.imaging.formats.icns.IcnsType.ICNS_32x32_32BIT_IMAGE;
        } else if (bufferedImage.getWidth() == 48 && bufferedImage.getHeight() == 48) {
            icnsType = org.apache.commons.imaging.formats.icns.IcnsType.ICNS_48x48_32BIT_IMAGE;
        } else if (bufferedImage.getWidth() == 128 && bufferedImage.getHeight() == 128) {
            icnsType = org.apache.commons.imaging.formats.icns.IcnsType.ICNS_128x128_32BIT_IMAGE;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid/unsupported source width ");
            sb.append(bufferedImage.getWidth());
            sb.append(" and height ");
            sb.append(bufferedImage.getHeight());
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream = new org.apache.commons.imaging.common.BinaryOutputStream(outputStream, java.nio.ByteOrder.BIG_ENDIAN);
        try {
            binaryOutputStream.write4Bytes(ICNS_MAGIC);
            binaryOutputStream.write4Bytes((icnsType.getWidth() * 4 * icnsType.getHeight()) + 24 + (icnsType.getWidth() * icnsType.getHeight()));
            binaryOutputStream.write4Bytes(icnsType.getType());
            binaryOutputStream.write4Bytes((icnsType.getWidth() * 4 * icnsType.getHeight()) + 8);
            for (int i = 0; i < bufferedImage.getHeight(); i++) {
                for (int i2 = 0; i2 < bufferedImage.getWidth(); i2++) {
                    int rgb = bufferedImage.getRGB(i2, i);
                    binaryOutputStream.write(0);
                    binaryOutputStream.write(rgb >> 16);
                    binaryOutputStream.write(rgb >> 8);
                    binaryOutputStream.write(rgb);
                }
            }
            binaryOutputStream.write4Bytes(org.apache.commons.imaging.formats.icns.IcnsType.find8BPPMaskType(icnsType).getType());
            binaryOutputStream.write4Bytes((icnsType.getWidth() * icnsType.getWidth()) + 8);
            for (int i3 = 0; i3 < bufferedImage.getHeight(); i3++) {
                for (int i4 = 0; i4 < bufferedImage.getWidth(); i4++) {
                    binaryOutputStream.write(bufferedImage.getRGB(i4, i3) >> 24);
                }
            }
            binaryOutputStream.close();
        } finally {
        }
    }
}
