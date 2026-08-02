package org.apache.commons.imaging.formats.ico;

/* loaded from: classes17.dex */
public class IcoImageParser extends org.apache.commons.imaging.ImageParser {
    private static final java.lang.String DEFAULT_EXTENSION = ".ico";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION, ".cur"};

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    public IcoImageParser() {
        super.setByteOrder(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "ico-Custom";
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
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.ICO};
    }

    static class FileHeader {
        public final int iconCount;
        public final int iconType;
        public final int reserved;

        FileHeader(int i, int i2, int i3) {
            this.reserved = i;
            this.iconType = i2;
            this.iconCount = i3;
        }

        public void dump(java.io.PrintWriter printWriter) {
            printWriter.println("FileHeader");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Reserved: ");
            sb.append(this.reserved);
            printWriter.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("IconType: ");
            sb2.append(this.iconType);
            printWriter.println(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("IconCount: ");
            sb3.append(this.iconCount);
            printWriter.println(sb3.toString());
            printWriter.println();
        }
    }

    private org.apache.commons.imaging.formats.ico.IcoImageParser.FileHeader readFileHeader(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Reserved", inputStream, "Not a Valid ICO File", getByteOrder());
        int read2Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("IconType", inputStream, "Not a Valid ICO File", getByteOrder());
        int read2Bytes3 = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("IconCount", inputStream, "Not a Valid ICO File", getByteOrder());
        if (read2Bytes != 0) {
            throw new org.apache.commons.imaging.ImageReadException("Not a Valid ICO File: reserved is ".concat(java.lang.String.valueOf(read2Bytes)));
        }
        if (read2Bytes2 != 1 && read2Bytes2 != 2) {
            throw new org.apache.commons.imaging.ImageReadException("Not a Valid ICO File: icon type is ".concat(java.lang.String.valueOf(read2Bytes2)));
        }
        return new org.apache.commons.imaging.formats.ico.IcoImageParser.FileHeader(read2Bytes, read2Bytes2, read2Bytes3);
    }

    static class IconInfo {
        public final int bitCount;
        public final byte colorCount;
        public final byte height;
        public final int imageOffset;
        public final int imageSize;
        public final int planes;
        public final byte reserved;
        public final byte width;

        IconInfo(byte b, byte b2, byte b3, byte b4, int i, int i2, int i3, int i4) {
            this.width = b;
            this.height = b2;
            this.colorCount = b3;
            this.reserved = b4;
            this.planes = i;
            this.bitCount = i2;
            this.imageSize = i3;
            this.imageOffset = i4;
        }

        public void dump(java.io.PrintWriter printWriter) {
            printWriter.println("IconInfo");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Width: ");
            sb.append((int) this.width);
            printWriter.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Height: ");
            sb2.append((int) this.height);
            printWriter.println(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("ColorCount: ");
            sb3.append((int) this.colorCount);
            printWriter.println(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Reserved: ");
            sb4.append((int) this.reserved);
            printWriter.println(sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Planes: ");
            sb5.append(this.planes);
            printWriter.println(sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BitCount: ");
            sb6.append(this.bitCount);
            printWriter.println(sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ImageSize: ");
            sb7.append(this.imageSize);
            printWriter.println(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("ImageOffset: ");
            sb8.append(this.imageOffset);
            printWriter.println(sb8.toString());
        }
    }

    private org.apache.commons.imaging.formats.ico.IcoImageParser.IconInfo readIconInfo(java.io.InputStream inputStream) throws java.io.IOException {
        return new org.apache.commons.imaging.formats.ico.IcoImageParser.IconInfo(org.apache.commons.imaging.common.BinaryFunctions.readByte(com.google.common.net.HttpHeaders.WIDTH, inputStream, "Not a Valid ICO File"), org.apache.commons.imaging.common.BinaryFunctions.readByte(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Height, inputStream, "Not a Valid ICO File"), org.apache.commons.imaging.common.BinaryFunctions.readByte("ColorCount", inputStream, "Not a Valid ICO File"), org.apache.commons.imaging.common.BinaryFunctions.readByte("Reserved", inputStream, "Not a Valid ICO File"), org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Planes", inputStream, "Not a Valid ICO File", getByteOrder()), org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("BitCount", inputStream, "Not a Valid ICO File", getByteOrder()), org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ImageSize", inputStream, "Not a Valid ICO File", getByteOrder()), org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ImageOffset", inputStream, "Not a Valid ICO File", getByteOrder()));
    }

    static class BitmapHeader {
        public final int bitCount;
        public final int colorsImportant;
        public final int colorsUsed;
        public final int compression;
        public final int height;
        public final int planes;
        public final int size;
        public final int sizeImage;
        public final int width;
        public final int xPelsPerMeter;
        public final int yPelsPerMeter;

        BitmapHeader(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.size = i;
            this.width = i2;
            this.height = i3;
            this.planes = i4;
            this.bitCount = i5;
            this.compression = i6;
            this.sizeImage = i7;
            this.xPelsPerMeter = i8;
            this.yPelsPerMeter = i9;
            this.colorsUsed = i10;
            this.colorsImportant = i11;
        }

        public void dump(java.io.PrintWriter printWriter) {
            printWriter.println("BitmapHeader");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Size: ");
            sb.append(this.size);
            printWriter.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Width: ");
            sb2.append(this.width);
            printWriter.println(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Height: ");
            sb3.append(this.height);
            printWriter.println(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Planes: ");
            sb4.append(this.planes);
            printWriter.println(sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("BitCount: ");
            sb5.append(this.bitCount);
            printWriter.println(sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Compression: ");
            sb6.append(this.compression);
            printWriter.println(sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SizeImage: ");
            sb7.append(this.sizeImage);
            printWriter.println(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("XPelsPerMeter: ");
            sb8.append(this.xPelsPerMeter);
            printWriter.println(sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("YPelsPerMeter: ");
            sb9.append(this.yPelsPerMeter);
            printWriter.println(sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("ColorsUsed: ");
            sb10.append(this.colorsUsed);
            printWriter.println(sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("ColorsImportant: ");
            sb11.append(this.colorsImportant);
            printWriter.println(sb11.toString());
        }
    }

    static abstract class IconData {
        public final org.apache.commons.imaging.formats.ico.IcoImageParser.IconInfo iconInfo;

        protected abstract void dumpSubclass(java.io.PrintWriter printWriter);

        public abstract java.awt.image.BufferedImage readBufferedImage() throws org.apache.commons.imaging.ImageReadException;

        IconData(org.apache.commons.imaging.formats.ico.IcoImageParser.IconInfo iconInfo) {
            this.iconInfo = iconInfo;
        }

        public void dump(java.io.PrintWriter printWriter) {
            this.iconInfo.dump(printWriter);
            printWriter.println();
            dumpSubclass(printWriter);
        }
    }

    static class BitmapIconData extends org.apache.commons.imaging.formats.ico.IcoImageParser.IconData {
        public final java.awt.image.BufferedImage bufferedImage;
        public final org.apache.commons.imaging.formats.ico.IcoImageParser.BitmapHeader header;

        BitmapIconData(org.apache.commons.imaging.formats.ico.IcoImageParser.IconInfo iconInfo, org.apache.commons.imaging.formats.ico.IcoImageParser.BitmapHeader bitmapHeader, java.awt.image.BufferedImage bufferedImage) {
            super(iconInfo);
            this.header = bitmapHeader;
            this.bufferedImage = bufferedImage;
        }

        @Override // org.apache.commons.imaging.formats.ico.IcoImageParser.IconData
        public java.awt.image.BufferedImage readBufferedImage() throws org.apache.commons.imaging.ImageReadException {
            return this.bufferedImage;
        }

        @Override // org.apache.commons.imaging.formats.ico.IcoImageParser.IconData
        protected void dumpSubclass(java.io.PrintWriter printWriter) {
            printWriter.println("BitmapIconData");
            this.header.dump(printWriter);
            printWriter.println();
        }
    }

    static class PNGIconData extends org.apache.commons.imaging.formats.ico.IcoImageParser.IconData {
        public final java.awt.image.BufferedImage bufferedImage;

        PNGIconData(org.apache.commons.imaging.formats.ico.IcoImageParser.IconInfo iconInfo, java.awt.image.BufferedImage bufferedImage) {
            super(iconInfo);
            this.bufferedImage = bufferedImage;
        }

        @Override // org.apache.commons.imaging.formats.ico.IcoImageParser.IconData
        public java.awt.image.BufferedImage readBufferedImage() {
            return this.bufferedImage;
        }

        @Override // org.apache.commons.imaging.formats.ico.IcoImageParser.IconData
        protected void dumpSubclass(java.io.PrintWriter printWriter) {
            printWriter.println("PNGIconData");
            printWriter.println();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01da, code lost:
    
        if (r8 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private org.apache.commons.imaging.formats.ico.IcoImageParser.IconData readBitmapIconData(byte[] bArr, org.apache.commons.imaging.formats.ico.IcoImageParser.IconInfo iconInfo) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
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
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(io.ktor.http.ContentDisposition.Parameters.Size, byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("width", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes3 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("height", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("planes", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read2Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("bitCount", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes4 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("compression", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes5 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("sizeImage", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes6 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("xPelsPerMeter", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes7 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("yPelsPerMeter", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes8 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("colorsUsed", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes9 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorsImportant", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        if (read4Bytes4 == 3) {
            int read4Bytes10 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("redMask", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
            i2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("greenMask", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
            i3 = read4Bytes10;
            i = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("blueMask", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        int i12 = i;
        byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("RestOfFile", byteArrayInputStream, byteArrayInputStream.available());
        if (read4Bytes != 40) {
            throw new org.apache.commons.imaging.ImageReadException("Not a Valid ICO File: Wrong bitmap header size ".concat(java.lang.String.valueOf(read4Bytes)));
        }
        if (read2Bytes != 1) {
            throw new org.apache.commons.imaging.ImageReadException("Not a Valid ICO File: Planes can't be ".concat(java.lang.String.valueOf(read2Bytes)));
        }
        if (read4Bytes4 == 0 && read2Bytes2 == 32) {
            i6 = 255;
            i7 = 16711680;
            i4 = -16777216;
            i8 = 65280;
            i5 = 3;
        } else {
            i4 = 0;
            int i13 = i2;
            i5 = read4Bytes4;
            i6 = i12;
            i7 = i3;
            i8 = i13;
        }
        int i14 = i6;
        int i15 = i5;
        org.apache.commons.imaging.formats.ico.IcoImageParser.BitmapHeader bitmapHeader = new org.apache.commons.imaging.formats.ico.IcoImageParser.BitmapHeader(read4Bytes, read4Bytes2, read4Bytes3, read2Bytes, read2Bytes2, i15, read4Bytes5, read4Bytes6, read4Bytes7, read4Bytes8, read4Bytes9);
        int i16 = (read4Bytes8 != 0 || read2Bytes2 > 8) ? read4Bytes8 : 1 << read2Bytes2;
        int length = readBytes.length + 70;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(length);
        org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream = new org.apache.commons.imaging.common.BinaryOutputStream(byteArrayOutputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        try {
            binaryOutputStream.write(66);
            binaryOutputStream.write(77);
            binaryOutputStream.write4Bytes(length);
            binaryOutputStream.write4Bytes(0);
            binaryOutputStream.write4Bytes((i16 * 4) + 70);
            binaryOutputStream.write4Bytes(56);
            binaryOutputStream.write4Bytes(read4Bytes2);
            binaryOutputStream.write4Bytes(read4Bytes3 / 2);
            binaryOutputStream.write2Bytes(read2Bytes);
            binaryOutputStream.write2Bytes(read2Bytes2);
            binaryOutputStream.write4Bytes(i15);
            binaryOutputStream.write4Bytes(read4Bytes5);
            binaryOutputStream.write4Bytes(read4Bytes6);
            binaryOutputStream.write4Bytes(read4Bytes7);
            binaryOutputStream.write4Bytes(read4Bytes8);
            binaryOutputStream.write4Bytes(read4Bytes9);
            binaryOutputStream.write4Bytes(i7);
            binaryOutputStream.write4Bytes(i8);
            binaryOutputStream.write4Bytes(i14);
            binaryOutputStream.write4Bytes(i4);
            binaryOutputStream.write(readBytes);
            binaryOutputStream.flush();
            binaryOutputStream.close();
            java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            byte[] bArr2 = null;
            java.awt.image.BufferedImage bufferedImage = new org.apache.commons.imaging.formats.bmp.BmpImageParser().getBufferedImage(byteArrayInputStream2, (java.util.Map<java.lang.String, java.lang.Object>) null);
            int i17 = (read4Bytes2 + 7) / 8;
            int i18 = i17 % 4;
            if (i18 != 0) {
                i17 += 4 - i18;
            }
            try {
                bArr2 = org.apache.commons.imaging.common.BinaryFunctions.readBytes("transparency_map", byteArrayInputStream2, (read4Bytes3 / 2) * i17, "Not a Valid ICO File");
                i9 = 32;
            } catch (java.io.IOException e) {
                i9 = 32;
                if (read2Bytes2 != 32) {
                    throw e;
                }
            }
            if (read2Bytes2 == i9) {
                boolean z = true;
                for (int i19 = 0; z && i19 < bufferedImage.getHeight(); i19++) {
                    int i20 = 0;
                    while (true) {
                        if (i20 >= bufferedImage.getWidth()) {
                            break;
                        }
                        if ((bufferedImage.getRGB(i20, i19) & (-16777216)) != 0) {
                            z = false;
                            break;
                        }
                        i20++;
                    }
                }
            }
            java.awt.image.BufferedImage bufferedImage2 = new java.awt.image.BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
            for (int i21 = 0; i21 < bufferedImage2.getHeight(); i21++) {
                for (int i22 = 0; i22 < bufferedImage2.getWidth(); i22++) {
                    if (bArr2 != null) {
                        i10 = 255;
                        if ((((bArr2[(((bufferedImage.getHeight() - i21) - 1) * i17) + (i22 / 8)] & 255) >> (7 - (i22 % 8))) & 1) != 0) {
                            i11 = 0;
                            bufferedImage2.setRGB(i22, i21, (i11 << 24) | (bufferedImage.getRGB(i22, i21) & 16777215));
                        }
                    } else {
                        i10 = 255;
                    }
                    i11 = i10;
                    bufferedImage2.setRGB(i22, i21, (i11 << 24) | (bufferedImage.getRGB(i22, i21) & 16777215));
                }
            }
            bufferedImage = bufferedImage2;
            return new org.apache.commons.imaging.formats.ico.IcoImageParser.BitmapIconData(iconInfo, bitmapHeader, bufferedImage);
        } finally {
        }
    }

    private org.apache.commons.imaging.formats.ico.IcoImageParser.IconData readIconData(byte[] bArr, org.apache.commons.imaging.formats.ico.IcoImageParser.IconInfo iconInfo) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (org.apache.commons.imaging.Imaging.guessFormat(bArr).equals(org.apache.commons.imaging.ImageFormats.PNG)) {
            return new org.apache.commons.imaging.formats.ico.IcoImageParser.PNGIconData(iconInfo, org.apache.commons.imaging.Imaging.getBufferedImage(bArr));
        }
        return readBitmapIconData(bArr, iconInfo);
    }

    static class ImageContents {
        public final org.apache.commons.imaging.formats.ico.IcoImageParser.FileHeader fileHeader;
        public final org.apache.commons.imaging.formats.ico.IcoImageParser.IconData[] iconDatas;

        ImageContents(org.apache.commons.imaging.formats.ico.IcoImageParser.FileHeader fileHeader, org.apache.commons.imaging.formats.ico.IcoImageParser.IconData[] iconDataArr) {
            this.fileHeader = fileHeader;
            this.iconDatas = iconDataArr;
        }
    }

    private org.apache.commons.imaging.formats.ico.IcoImageParser.ImageContents readImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.ico.IcoImageParser.FileHeader readFileHeader = readFileHeader(inputStream);
            org.apache.commons.imaging.formats.ico.IcoImageParser.IconInfo[] iconInfoArr = new org.apache.commons.imaging.formats.ico.IcoImageParser.IconInfo[readFileHeader.iconCount];
            for (int i = 0; i < readFileHeader.iconCount; i++) {
                iconInfoArr[i] = readIconInfo(inputStream);
            }
            org.apache.commons.imaging.formats.ico.IcoImageParser.IconData[] iconDataArr = new org.apache.commons.imaging.formats.ico.IcoImageParser.IconData[readFileHeader.iconCount];
            for (int i2 = 0; i2 < readFileHeader.iconCount; i2++) {
                iconDataArr[i2] = readIconData(byteSource.getBlock(iconInfoArr[i2].imageOffset, iconInfoArr[i2].imageSize), iconInfoArr[i2]);
            }
            org.apache.commons.imaging.formats.ico.IcoImageParser.ImageContents imageContents = new org.apache.commons.imaging.formats.ico.IcoImageParser.ImageContents(readFileHeader, iconDataArr);
            if (inputStream != null) {
                inputStream.close();
            }
            return imageContents;
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
        org.apache.commons.imaging.formats.ico.IcoImageParser.ImageContents readImage = readImage(byteSource);
        readImage.fileHeader.dump(printWriter);
        for (org.apache.commons.imaging.formats.ico.IcoImageParser.IconData iconData : readImage.iconDatas) {
            iconData.dump(printWriter);
        }
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.ico.IcoImageParser.ImageContents readImage = readImage(byteSource);
        if (readImage.fileHeader.iconCount > 0) {
            return readImage.iconDatas[0].readBufferedImage();
        }
        throw new org.apache.commons.imaging.ImageReadException("No icons in ICO file");
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.ico.IcoImageParser.ImageContents readImage = readImage(byteSource);
        org.apache.commons.imaging.formats.ico.IcoImageParser.FileHeader fileHeader = readImage.fileHeader;
        java.util.ArrayList arrayList = new java.util.ArrayList(fileHeader.iconCount);
        for (int i = 0; i < fileHeader.iconCount; i++) {
            arrayList.add(readImage.iconDatas[i].readBufferedImage());
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        int i;
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        org.apache.commons.imaging.PixelDensity pixelDensity = (org.apache.commons.imaging.PixelDensity) hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        org.apache.commons.imaging.palette.PaletteFactory paletteFactory = new org.apache.commons.imaging.palette.PaletteFactory();
        org.apache.commons.imaging.palette.SimplePalette makeExactRgbPaletteSimple = paletteFactory.makeExactRgbPaletteSimple(bufferedImage, 256);
        if (makeExactRgbPaletteSimple == null) {
            i = paletteFactory.hasTransparency(bufferedImage) ? 32 : 24;
        } else if (makeExactRgbPaletteSimple.length() <= 2) {
            i = 1;
        } else {
            i = makeExactRgbPaletteSimple.length() <= 16 ? 4 : 8;
        }
        org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream = new org.apache.commons.imaging.common.BinaryOutputStream(outputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        int width = ((bufferedImage.getWidth() * i) + 7) / 8;
        int i2 = width % 4;
        if (i2 != 0) {
            width += 4 - i2;
        }
        int width2 = (bufferedImage.getWidth() + 7) / 8;
        int i3 = width2 % 4;
        if (i3 != 0) {
            width2 += 4 - i3;
        }
        int i4 = i <= 8 ? 1 << i : 0;
        int height = bufferedImage.getHeight();
        int height2 = bufferedImage.getHeight();
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(1);
        binaryOutputStream.write2Bytes(1);
        int width3 = bufferedImage.getWidth();
        int height3 = bufferedImage.getHeight();
        if (width3 > 255 || height3 > 255) {
            width3 = 0;
            height3 = 0;
        }
        binaryOutputStream.write(width3);
        binaryOutputStream.write(height3);
        binaryOutputStream.write(i >= 8 ? 0 : 1 << i);
        binaryOutputStream.write(0);
        binaryOutputStream.write2Bytes(1);
        binaryOutputStream.write2Bytes(i);
        binaryOutputStream.write4Bytes((i4 * 4) + 40 + (height * width) + (height2 * width2));
        binaryOutputStream.write4Bytes(22);
        binaryOutputStream.write4Bytes(40);
        binaryOutputStream.write4Bytes(bufferedImage.getWidth());
        binaryOutputStream.write4Bytes(bufferedImage.getHeight() * 2);
        binaryOutputStream.write2Bytes(1);
        binaryOutputStream.write2Bytes(i);
        binaryOutputStream.write4Bytes(0);
        binaryOutputStream.write4Bytes(0);
        binaryOutputStream.write4Bytes(pixelDensity == null ? 0 : (int) java.lang.Math.round(pixelDensity.horizontalDensityMetres()));
        binaryOutputStream.write4Bytes(pixelDensity == null ? 0 : (int) java.lang.Math.round(pixelDensity.horizontalDensityMetres()));
        binaryOutputStream.write4Bytes(0);
        binaryOutputStream.write4Bytes(0);
        if (makeExactRgbPaletteSimple != null) {
            for (int i5 = 0; i5 < (1 << i); i5++) {
                if (i5 < makeExactRgbPaletteSimple.length()) {
                    binaryOutputStream.write3Bytes(makeExactRgbPaletteSimple.getEntry(i5));
                    binaryOutputStream.write(0);
                } else {
                    binaryOutputStream.write4Bytes(0);
                }
            }
        }
        int width4 = ((bufferedImage.getWidth() * i) + 7) / 8;
        int i6 = 0;
        int i7 = 0;
        for (int height4 = bufferedImage.getHeight() - 1; height4 >= 0; height4--) {
            for (int i8 = 0; i8 < bufferedImage.getWidth(); i8++) {
                int rgb = bufferedImage.getRGB(i8, height4);
                if (makeExactRgbPaletteSimple == null) {
                    if (i == 24) {
                        binaryOutputStream.write3Bytes(rgb);
                    } else if (i == 32) {
                        binaryOutputStream.write4Bytes(rgb);
                    }
                } else if (i < 8) {
                    i7 = (i7 << i) | makeExactRgbPaletteSimple.getPaletteIndex(rgb & 16777215);
                    i6 += i;
                    if (i6 >= 8) {
                        binaryOutputStream.write(i7 & 255);
                        i6 = 0;
                        i7 = 0;
                    }
                } else if (i == 8) {
                    binaryOutputStream.write(makeExactRgbPaletteSimple.getPaletteIndex(rgb & 16777215) & 255);
                }
            }
            if (i6 > 0) {
                binaryOutputStream.write((i7 << (8 - i6)) & 255);
                i6 = 0;
                i7 = 0;
            }
            for (int i9 = 0; i9 < width - width4; i9++) {
                binaryOutputStream.write(0);
            }
        }
        int width5 = (bufferedImage.getWidth() + 7) / 8;
        for (int height5 = bufferedImage.getHeight() - 1; height5 >= 0; height5--) {
            for (int i10 = 0; i10 < bufferedImage.getWidth(); i10++) {
                i7 <<= 1;
                if (((bufferedImage.getRGB(i10, height5) >> 24) & 255) == 0) {
                    i7 |= 1;
                }
                i6++;
                if (i6 >= 8) {
                    binaryOutputStream.write(i7 & 255);
                    i6 = 0;
                    i7 = 0;
                }
            }
            if (i6 > 0) {
                binaryOutputStream.write((i7 << (8 - i6)) & 255);
                i6 = 0;
                i7 = 0;
            }
            for (int i11 = 0; i11 < width2 - width5; i11++) {
                binaryOutputStream.write(0);
            }
        }
        binaryOutputStream.close();
    }
}
