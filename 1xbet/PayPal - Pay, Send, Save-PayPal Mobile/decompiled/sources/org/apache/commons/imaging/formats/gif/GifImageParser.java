package org.apache.commons.imaging.formats.gif;

/* loaded from: classes17.dex */
public class GifImageParser extends org.apache.commons.imaging.ImageParser implements org.apache.commons.imaging.common.XmpEmbeddable {
    private static final int APPLICATION_EXTENSION_LABEL = 255;
    private static final int COMMENT_EXTENSION = 254;
    private static final int EXTENSION_CODE = 33;
    private static final int GRAPHIC_CONTROL_EXTENSION = 8697;
    private static final int IMAGE_SEPARATOR = 44;
    private static final int INTERLACE_FLAG_MASK = 64;
    private static final int LOCAL_COLOR_TABLE_FLAG_MASK = 128;
    private static final int PLAIN_TEXT_EXTENSION = 1;
    private static final int SORT_FLAG_MASK = 32;
    private static final int TERMINATOR_BYTE = 59;
    private static final int XMP_COMPLETE_CODE = 8703;
    private static final int XMP_EXTENSION = 255;
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.gif.GifImageParser.class.getName());
    private static final java.lang.String DEFAULT_EXTENSION = ".gif";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};
    private static final byte[] GIF_HEADER_SIGNATURE = {71, 73, 70};
    private static final byte[] XMP_APPLICATION_ID_AND_AUTH_CODE = {88, 77, 80, 32, 68, 97, 116, 97, 88, 77, 80};

    private int simplePow(int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 *= i;
        }
        return i3;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    public GifImageParser() {
        super.setByteOrder(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Graphics Interchange Format";
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
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.GIF};
    }

    private org.apache.commons.imaging.formats.gif.GifHeaderInfo readHeader(java.io.InputStream inputStream, org.apache.commons.imaging.FormatCompliance formatCompliance) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte b;
        int i;
        byte b2;
        byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("identifier1", inputStream, "Not a Valid GIF File");
        byte readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("identifier2", inputStream, "Not a Valid GIF File");
        byte readByte3 = org.apache.commons.imaging.common.BinaryFunctions.readByte("identifier3", inputStream, "Not a Valid GIF File");
        byte readByte4 = org.apache.commons.imaging.common.BinaryFunctions.readByte("version1", inputStream, "Not a Valid GIF File");
        byte readByte5 = org.apache.commons.imaging.common.BinaryFunctions.readByte("version2", inputStream, "Not a Valid GIF File");
        byte readByte6 = org.apache.commons.imaging.common.BinaryFunctions.readByte("version3", inputStream, "Not a Valid GIF File");
        if (formatCompliance != null) {
            formatCompliance.compareBytes("Signature", GIF_HEADER_SIGNATURE, new byte[]{readByte, readByte2, readByte3});
            formatCompliance.compare("version", 56, readByte4);
            formatCompliance.compare("version", new int[]{55, 57}, readByte5);
            formatCompliance.compare("version", 97, readByte6);
        }
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("identifier: ", (readByte << 16) | (readByte2 << 8) | readByte3);
            org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("version: ", (readByte4 << 16) | (readByte5 << 8) | readByte6);
        }
        int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Logical Screen Width", inputStream, "Not a Valid GIF File", getByteOrder());
        int read2Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Logical Screen Height", inputStream, "Not a Valid GIF File", getByteOrder());
        if (formatCompliance != null) {
            formatCompliance.checkBounds(com.google.common.net.HttpHeaders.WIDTH, 1, Integer.MAX_VALUE, read2Bytes);
            formatCompliance.checkBounds(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Height, 1, Integer.MAX_VALUE, read2Bytes2);
        }
        byte readByte7 = org.apache.commons.imaging.common.BinaryFunctions.readByte("Packed Fields", inputStream, "Not a Valid GIF File");
        byte readByte8 = org.apache.commons.imaging.common.BinaryFunctions.readByte("Background Color Index", inputStream, "Not a Valid GIF File");
        byte readByte9 = org.apache.commons.imaging.common.BinaryFunctions.readByte("Pixel Aspect Ratio", inputStream, "Not a Valid GIF File");
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            org.apache.commons.imaging.common.BinaryFunctions.printByteBits("PackedFields bits", readByte7);
        }
        boolean z = (readByte7 & 128) > 0;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            b = readByte9;
            logger.finest("GlobalColorTableFlag: ".concat(java.lang.String.valueOf(z)));
        } else {
            b = readByte9;
        }
        byte b3 = (byte) ((readByte7 >> 4) & 7);
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            i = read2Bytes2;
            logger.finest("ColorResolution: ".concat(java.lang.String.valueOf((int) b3)));
        } else {
            i = read2Bytes2;
        }
        boolean z2 = (readByte7 & 8) > 0;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("SortFlag: ".concat(java.lang.String.valueOf(z2)));
        }
        byte b4 = (byte) (readByte7 & 7);
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            b2 = b3;
            logger.finest("SizeofGlobalColorTable: ".concat(java.lang.String.valueOf((int) b4)));
        } else {
            b2 = b3;
        }
        if (formatCompliance != null && z && readByte8 != -1) {
            formatCompliance.checkBounds("Background Color Index", 0, convertColorTableSize(b4), readByte8);
        }
        return new org.apache.commons.imaging.formats.gif.GifHeaderInfo(readByte, readByte2, readByte3, readByte4, readByte5, readByte6, read2Bytes, i, readByte7, readByte8, b, z, b2, z2, b4);
    }

    private org.apache.commons.imaging.formats.gif.GraphicControlExtension readGraphicControlExtension(int i, java.io.InputStream inputStream) throws java.io.IOException {
        org.apache.commons.imaging.common.BinaryFunctions.readByte("block_size", inputStream, "GIF: corrupt GraphicControlExt");
        byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("packed fields", inputStream, "GIF: corrupt GraphicControlExt");
        boolean z = (readByte & 1) != 0;
        int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("delay in milliseconds", inputStream, "GIF: corrupt GraphicControlExt", getByteOrder());
        byte readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("transparent color index", inputStream, "GIF: corrupt GraphicControlExt");
        org.apache.commons.imaging.common.BinaryFunctions.readByte("block terminator", inputStream, "GIF: corrupt GraphicControlExt");
        return new org.apache.commons.imaging.formats.gif.GraphicControlExtension(i, readByte, (readByte & com.google.common.base.Ascii.FS) >> 2, z, read2Bytes, readByte2 & 255);
    }

    private byte[] readSubBlock(java.io.InputStream inputStream) throws java.io.IOException {
        return org.apache.commons.imaging.common.BinaryFunctions.readBytes("block", inputStream, org.apache.commons.imaging.common.BinaryFunctions.readByte("block_size", inputStream, "GIF: corrupt block") & 255, "GIF: corrupt block");
    }

    private org.apache.commons.imaging.formats.gif.GenericGifBlock readGenericGIFBlock(java.io.InputStream inputStream, int i) throws java.io.IOException {
        return readGenericGIFBlock(inputStream, i, null);
    }

    private org.apache.commons.imaging.formats.gif.GenericGifBlock readGenericGIFBlock(java.io.InputStream inputStream, int i, byte[] bArr) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (bArr != null) {
            arrayList.add(bArr);
        }
        while (true) {
            byte[] readSubBlock = readSubBlock(inputStream);
            if (readSubBlock.length > 0) {
                arrayList.add(readSubBlock);
            } else {
                return new org.apache.commons.imaging.formats.gif.GenericGifBlock(i, arrayList);
            }
        }
    }

    private java.util.List<org.apache.commons.imaging.formats.gif.GifBlock> readBlocks(org.apache.commons.imaging.formats.gif.GifHeaderInfo gifHeaderInfo, java.io.InputStream inputStream, boolean z, org.apache.commons.imaging.FormatCompliance formatCompliance) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new org.apache.commons.imaging.ImageReadException("GIF: unexpected end of data");
            }
            if (read != 0) {
                if (read == 33) {
                    int read2 = inputStream.read();
                    int i = ((read & 255) << 8) | (read2 & 255);
                    if (read2 != 1) {
                        if (read2 == 249) {
                            arrayList.add(readGraphicControlExtension(i, inputStream));
                        } else if (read2 != 254) {
                            if (read2 == 255) {
                                byte[] readSubBlock = readSubBlock(inputStream);
                                if (formatCompliance != null) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown Application Extension (");
                                    sb.append(new java.lang.String(readSubBlock, java.nio.charset.StandardCharsets.US_ASCII));
                                    sb.append(")");
                                    formatCompliance.addComment(sb.toString(), i);
                                }
                                if (readSubBlock != null && readSubBlock.length > 0) {
                                    arrayList.add(readGenericGIFBlock(inputStream, i, readSubBlock));
                                }
                            } else {
                                if (formatCompliance != null) {
                                    formatCompliance.addComment("Unknown block", i);
                                }
                                arrayList.add(readGenericGIFBlock(inputStream, i));
                            }
                        }
                    }
                    arrayList.add(readGenericGIFBlock(inputStream, i));
                } else {
                    if (read != 44) {
                        if (read == 59) {
                            return arrayList;
                        }
                        throw new org.apache.commons.imaging.ImageReadException("GIF: unknown code: ".concat(java.lang.String.valueOf(read)));
                    }
                    arrayList.add(readImageDescriptor(gifHeaderInfo, read, inputStream, z, formatCompliance));
                }
            }
        }
    }

    private org.apache.commons.imaging.formats.gif.ImageDescriptor readImageDescriptor(org.apache.commons.imaging.formats.gif.GifHeaderInfo gifHeaderInfo, int i, java.io.InputStream inputStream, boolean z, org.apache.commons.imaging.FormatCompliance formatCompliance) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte[] bArr;
        int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Image Left Position", inputStream, "Not a Valid GIF File", getByteOrder());
        int read2Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Image Top Position", inputStream, "Not a Valid GIF File", getByteOrder());
        int read2Bytes3 = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Image Width", inputStream, "Not a Valid GIF File", getByteOrder());
        int read2Bytes4 = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Image Height", inputStream, "Not a Valid GIF File", getByteOrder());
        byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("Packed Fields", inputStream, "Not a Valid GIF File");
        if (formatCompliance != null) {
            formatCompliance.checkBounds(com.google.common.net.HttpHeaders.WIDTH, 1, gifHeaderInfo.logicalScreenWidth, read2Bytes3);
            formatCompliance.checkBounds(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Height, 1, gifHeaderInfo.logicalScreenHeight, read2Bytes4);
            formatCompliance.checkBounds("Left Position", 0, gifHeaderInfo.logicalScreenWidth - read2Bytes3, read2Bytes);
            formatCompliance.checkBounds("Top Position", 0, gifHeaderInfo.logicalScreenHeight - read2Bytes4, read2Bytes2);
        }
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            org.apache.commons.imaging.common.BinaryFunctions.printByteBits("PackedFields bits", readByte);
        }
        boolean z2 = ((readByte >> 7) & 1) > 0;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("LocalColorTableFlag: ".concat(java.lang.String.valueOf(z2)));
        }
        boolean z3 = ((readByte >> 6) & 1) > 0;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("Interlace Flag: ".concat(java.lang.String.valueOf(z3)));
        }
        boolean z4 = ((readByte >> 5) & 1) > 0;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("Sort Flag: ".concat(java.lang.String.valueOf(z4)));
        }
        byte b = (byte) (readByte & 7);
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("SizeofLocalColorTable: ".concat(java.lang.String.valueOf((int) b)));
        }
        byte[] readColorTable = z2 ? readColorTable(inputStream, b) : null;
        if (!z) {
            bArr = new org.apache.commons.imaging.common.mylzw.MyLzwDecompressor(inputStream.read(), java.nio.ByteOrder.LITTLE_ENDIAN).decompress(new java.io.ByteArrayInputStream(readGenericGIFBlock(inputStream, -1).appendSubBlocks()), read2Bytes3 * read2Bytes4);
        } else {
            int read = inputStream.read();
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                logger.finest("LZWMinimumCodeSize: ".concat(java.lang.String.valueOf(read)));
            }
            readGenericGIFBlock(inputStream, -1);
            bArr = null;
        }
        return new org.apache.commons.imaging.formats.gif.ImageDescriptor(i, read2Bytes, read2Bytes2, read2Bytes3, read2Bytes4, readByte, z2, z3, z4, b, readColorTable, bArr);
    }

    private int convertColorTableSize(int i) {
        return simplePow(2, i + 1) * 3;
    }

    private byte[] readColorTable(java.io.InputStream inputStream, int i) throws java.io.IOException {
        return org.apache.commons.imaging.common.BinaryFunctions.readBytes("block", inputStream, convertColorTableSize(i), "GIF: corrupt Color Table");
    }

    private org.apache.commons.imaging.formats.gif.GifBlock findBlock(java.util.List<org.apache.commons.imaging.formats.gif.GifBlock> list, int i) {
        for (org.apache.commons.imaging.formats.gif.GifBlock gifBlock : list) {
            if (gifBlock.blockCode == i) {
                return gifBlock;
            }
        }
        return null;
    }

    private <T extends org.apache.commons.imaging.formats.gif.GifBlock> java.util.List<T> findAllBlocks(java.util.List<org.apache.commons.imaging.formats.gif.GifBlock> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.apache.commons.imaging.formats.gif.GifBlock gifBlock : list) {
            if (gifBlock.blockCode == i) {
                arrayList.add(gifBlock);
            }
        }
        return arrayList;
    }

    private org.apache.commons.imaging.formats.gif.GifImageContents readFile(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return readFile(byteSource, z, org.apache.commons.imaging.FormatCompliance.getDefault());
    }

    private org.apache.commons.imaging.formats.gif.GifImageContents readFile(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, boolean z, org.apache.commons.imaging.FormatCompliance formatCompliance) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.gif.GifHeaderInfo readHeader = readHeader(inputStream, formatCompliance);
            org.apache.commons.imaging.formats.gif.GifImageContents gifImageContents = new org.apache.commons.imaging.formats.gif.GifImageContents(readHeader, readHeader.globalColorTableFlag ? readColorTable(inputStream, readHeader.sizeOfGlobalColorTable) : null, readBlocks(readHeader, inputStream, z, formatCompliance));
            if (inputStream != null) {
                inputStream.close();
            }
            return gifImageContents;
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
        org.apache.commons.imaging.formats.gif.GifImageContents readFile = readFile(byteSource, false);
        if (readFile == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read blocks");
        }
        org.apache.commons.imaging.formats.gif.GifHeaderInfo gifHeaderInfo = readFile.gifHeaderInfo;
        if (gifHeaderInfo == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read Header");
        }
        return new java.awt.Dimension(gifHeaderInfo.logicalScreenWidth, gifHeaderInfo.logicalScreenHeight);
    }

    static org.apache.commons.imaging.formats.gif.DisposalMethod createDisposalMethodFromIntValue(int i) throws org.apache.commons.imaging.ImageReadException {
        switch (i) {
            case 0:
                return org.apache.commons.imaging.formats.gif.DisposalMethod.UNSPECIFIED;
            case 1:
                return org.apache.commons.imaging.formats.gif.DisposalMethod.DO_NOT_DISPOSE;
            case 2:
                return org.apache.commons.imaging.formats.gif.DisposalMethod.RESTORE_TO_BACKGROUND;
            case 3:
                return org.apache.commons.imaging.formats.gif.DisposalMethod.RESTORE_TO_PREVIOUS;
            case 4:
                return org.apache.commons.imaging.formats.gif.DisposalMethod.TO_BE_DEFINED_1;
            case 5:
                return org.apache.commons.imaging.formats.gif.DisposalMethod.TO_BE_DEFINED_2;
            case 6:
                return org.apache.commons.imaging.formats.gif.DisposalMethod.TO_BE_DEFINED_3;
            case 7:
                return org.apache.commons.imaging.formats.gif.DisposalMethod.TO_BE_DEFINED_4;
            default:
                throw new org.apache.commons.imaging.ImageReadException("GIF: Invalid parsing of disposal method");
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.gif.GifImageContents readFile = readFile(byteSource, false);
        if (readFile == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read blocks");
        }
        org.apache.commons.imaging.formats.gif.GifHeaderInfo gifHeaderInfo = readFile.gifHeaderInfo;
        if (gifHeaderInfo == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read Header");
        }
        java.util.List<org.apache.commons.imaging.formats.gif.GifImageData> findAllImageData = findAllImageData(readFile);
        java.util.ArrayList arrayList = new java.util.ArrayList(findAllImageData.size());
        for (org.apache.commons.imaging.formats.gif.GifImageData gifImageData : findAllImageData) {
            arrayList.add(new org.apache.commons.imaging.formats.gif.GifImageMetadataItem(gifImageData.gce.delay, gifImageData.descriptor.imageLeftPosition, gifImageData.descriptor.imageTopPosition, createDisposalMethodFromIntValue(gifImageData.gce.dispose)));
        }
        return new org.apache.commons.imaging.formats.gif.GifImageMetadata(gifHeaderInfo.logicalScreenWidth, gifHeaderInfo.logicalScreenHeight, arrayList);
    }

    private java.util.List<java.lang.String> getComments(java.util.List<org.apache.commons.imaging.formats.gif.GifBlock> list) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.apache.commons.imaging.formats.gif.GifBlock gifBlock : list) {
            if (gifBlock.blockCode == 8702) {
                arrayList.add(new java.lang.String(((org.apache.commons.imaging.formats.gif.GenericGifBlock) gifBlock).appendSubBlocks(), java.nio.charset.StandardCharsets.US_ASCII));
            }
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.gif.GifImageContents readFile = readFile(byteSource, false);
        if (readFile == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read blocks");
        }
        org.apache.commons.imaging.formats.gif.GifHeaderInfo gifHeaderInfo = readFile.gifHeaderInfo;
        if (gifHeaderInfo == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read Header");
        }
        org.apache.commons.imaging.formats.gif.ImageDescriptor imageDescriptor = (org.apache.commons.imaging.formats.gif.ImageDescriptor) findBlock(readFile.blocks, 44);
        if (imageDescriptor == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read ImageDescriptor");
        }
        org.apache.commons.imaging.formats.gif.GraphicControlExtension graphicControlExtension = (org.apache.commons.imaging.formats.gif.GraphicControlExtension) findBlock(readFile.blocks, GRAPHIC_CONTROL_EXTENSION);
        int i = gifHeaderInfo.logicalScreenHeight;
        int i2 = gifHeaderInfo.logicalScreenWidth;
        java.util.List<java.lang.String> comments = getComments(readFile.blocks);
        byte b = gifHeaderInfo.colorResolution;
        org.apache.commons.imaging.ImageFormats imageFormats = org.apache.commons.imaging.ImageFormats.GIF;
        int size = findAllBlocks(readFile.blocks, 44).size();
        boolean z = imageDescriptor.interlaceFlag;
        float f = (float) (i2 / 72.0d);
        float f2 = (float) (i / 72.0d);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Gif ");
        sb.append((char) readFile.gifHeaderInfo.version1);
        sb.append((char) readFile.gifHeaderInfo.version2);
        sb.append((char) readFile.gifHeaderInfo.version3);
        return new org.apache.commons.imaging.ImageInfo(sb.toString(), 1 + b, comments, imageFormats, "GIF Graphics Interchange Format", i, "image/gif", size, 72, f2, 72, f, i2, z, graphicControlExtension != null && graphicControlExtension.transparency, true, org.apache.commons.imaging.ImageInfo.ColorType.RGB, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.LZW);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        printWriter.println("gif.dumpImageFile");
        org.apache.commons.imaging.ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }
        imageInfo.toString(printWriter, "");
        org.apache.commons.imaging.formats.gif.GifImageContents readFile = readFile(byteSource, false);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("gif.blocks: ");
        sb.append(readFile.blocks.size());
        printWriter.println(sb.toString());
        for (int i = 0; i < readFile.blocks.size(); i++) {
            org.apache.commons.imaging.formats.gif.GifBlock gifBlock = readFile.blocks.get(i);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\t");
            sb2.append(i);
            sb2.append(" (");
            sb2.append(gifBlock.getClass().getName());
            sb2.append(")");
            debugNumber(printWriter, sb2.toString(), gifBlock.blockCode, 4);
        }
        printWriter.println("");
        return true;
    }

    private int[] getColorTable(byte[] bArr) throws org.apache.commons.imaging.ImageReadException {
        if (bArr.length % 3 != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad Color Table Length: ");
            sb.append(bArr.length);
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        int length = bArr.length / 3;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            iArr[i] = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | (-16777216) | ((bArr[i2 + 1] & 255) << 8);
        }
        return iArr;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.FormatCompliance getFormatCompliance(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.FormatCompliance formatCompliance = new org.apache.commons.imaging.FormatCompliance(byteSource.getDescription());
        readFile(byteSource, false, formatCompliance);
        return formatCompliance;
    }

    private java.util.List<org.apache.commons.imaging.formats.gif.GifImageData> findAllImageData(org.apache.commons.imaging.formats.gif.GifImageContents gifImageContents) throws org.apache.commons.imaging.ImageReadException {
        java.util.List findAllBlocks = findAllBlocks(gifImageContents.blocks, 44);
        if (findAllBlocks.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read Image Descriptor");
        }
        java.util.List findAllBlocks2 = findAllBlocks(gifImageContents.blocks, GRAPHIC_CONTROL_EXTENSION);
        if (!findAllBlocks2.isEmpty() && findAllBlocks2.size() != findAllBlocks.size()) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Invalid amount of Graphic Control Extensions");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(findAllBlocks.size());
        for (int i = 0; i < findAllBlocks.size(); i++) {
            org.apache.commons.imaging.formats.gif.ImageDescriptor imageDescriptor = (org.apache.commons.imaging.formats.gif.ImageDescriptor) findAllBlocks.get(i);
            if (imageDescriptor == null) {
                throw new org.apache.commons.imaging.ImageReadException(java.lang.String.format("GIF: Couldn't read Image Descriptor of image number %d", java.lang.Integer.valueOf(i)));
            }
            arrayList.add(new org.apache.commons.imaging.formats.gif.GifImageData(imageDescriptor, findAllBlocks2.isEmpty() ? null : (org.apache.commons.imaging.formats.gif.GraphicControlExtension) findAllBlocks2.get(i)));
        }
        return arrayList;
    }

    private org.apache.commons.imaging.formats.gif.GifImageData findFirstImageData(org.apache.commons.imaging.formats.gif.GifImageContents gifImageContents) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.gif.ImageDescriptor imageDescriptor = (org.apache.commons.imaging.formats.gif.ImageDescriptor) findBlock(gifImageContents.blocks, 44);
        if (imageDescriptor == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read Image Descriptor");
        }
        return new org.apache.commons.imaging.formats.gif.GifImageData(imageDescriptor, (org.apache.commons.imaging.formats.gif.GraphicControlExtension) findBlock(gifImageContents.blocks, GRAPHIC_CONTROL_EXTENSION));
    }

    private java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.formats.gif.GifHeaderInfo gifHeaderInfo, org.apache.commons.imaging.formats.gif.GifImageData gifImageData, byte[] bArr) throws org.apache.commons.imaging.ImageReadException {
        int[] colorTable;
        int i;
        org.apache.commons.imaging.formats.gif.ImageDescriptor imageDescriptor = gifImageData.descriptor;
        org.apache.commons.imaging.formats.gif.GraphicControlExtension graphicControlExtension = gifImageData.gce;
        int i2 = imageDescriptor.imageWidth;
        int i3 = imageDescriptor.imageHeight;
        int i4 = 1;
        boolean z = graphicControlExtension != null && graphicControlExtension.transparency;
        org.apache.commons.imaging.common.ImageBuilder imageBuilder = new org.apache.commons.imaging.common.ImageBuilder(i2, i3, z);
        if (imageDescriptor.localColorTable != null) {
            colorTable = getColorTable(imageDescriptor.localColorTable);
        } else if (bArr != null) {
            colorTable = getColorTable(bArr);
        } else {
            throw new org.apache.commons.imaging.ImageReadException("Gif: No Color Table");
        }
        int i5 = (graphicControlExtension == null || !z) ? -1 : graphicControlExtension.transparentColorIndex;
        int i6 = (i3 + 7) / 8;
        int i7 = (i3 + 3) / 8;
        int i8 = (i3 + 1) / 4;
        int i9 = i3 / 2;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i3) {
            if (!imageDescriptor.interlaceFlag) {
                i = i10;
            } else if (i10 < i6) {
                i = i10 * 8;
            } else {
                int i12 = i10 - i6;
                if (i12 < i7) {
                    i = (i12 * 8) + 4;
                } else {
                    int i13 = i12 - i7;
                    if (i13 < i8) {
                        i = (i13 * 4) + 2;
                    } else {
                        int i14 = i13 - i8;
                        if (i14 >= i9) {
                            throw new org.apache.commons.imaging.ImageReadException("Gif: Strange Row");
                        }
                        i = (i14 * 2) + i4;
                    }
                }
            }
            int i15 = 0;
            while (i15 < i2) {
                int i16 = imageDescriptor.imageData[i11] & 255;
                imageBuilder.setRGB(i15, i, i5 == i16 ? 0 : colorTable[i16]);
                i15++;
                i11++;
            }
            i10++;
            i4 = 1;
        }
        return imageBuilder.getBufferedImage();
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.gif.GifImageContents readFile = readFile(byteSource, false);
        if (readFile == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read blocks");
        }
        org.apache.commons.imaging.formats.gif.GifHeaderInfo gifHeaderInfo = readFile.gifHeaderInfo;
        if (gifHeaderInfo == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read Header");
        }
        java.util.List<org.apache.commons.imaging.formats.gif.GifImageData> findAllImageData = findAllImageData(readFile);
        java.util.ArrayList arrayList = new java.util.ArrayList(findAllImageData.size());
        java.util.Iterator<org.apache.commons.imaging.formats.gif.GifImageData> it = findAllImageData.iterator();
        while (it.hasNext()) {
            arrayList.add(getBufferedImage(gifHeaderInfo, it.next(), readFile.globalColorTable));
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.gif.GifImageContents readFile = readFile(byteSource, false);
        if (readFile == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read blocks");
        }
        org.apache.commons.imaging.formats.gif.GifHeaderInfo gifHeaderInfo = readFile.gifHeaderInfo;
        if (gifHeaderInfo == null) {
            throw new org.apache.commons.imaging.ImageReadException("GIF: Couldn't read Header");
        }
        return getBufferedImage(gifHeaderInfo, findFirstImageData(readFile), readFile.globalColorTable);
    }

    private void writeAsSubBlocks(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        int i = 0;
        while (i < bArr.length) {
            int min = java.lang.Math.min(bArr.length - i, 255);
            outputStream.write(min);
            outputStream.write(bArr, i, min);
            i += min;
        }
        outputStream.write(0);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        java.lang.String str;
        int paletteIndex;
        java.util.HashMap hashMap = new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML)) {
            str = (java.lang.String) hashMap.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML);
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML);
        } else {
            str = null;
        }
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        boolean hasTransparency = new org.apache.commons.imaging.palette.PaletteFactory().hasTransparency(bufferedImage);
        int i = hasTransparency ? 255 : 256;
        org.apache.commons.imaging.palette.Palette makeExactRgbPaletteSimple = new org.apache.commons.imaging.palette.PaletteFactory().makeExactRgbPaletteSimple(bufferedImage, i);
        if (makeExactRgbPaletteSimple == null) {
            makeExactRgbPaletteSimple = new org.apache.commons.imaging.palette.PaletteFactory().makeQuantizedRgbPalette(bufferedImage, i);
            java.util.logging.Logger logger = LOGGER;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                logger.fine("quantizing");
            }
        } else {
            java.util.logging.Logger logger2 = LOGGER;
            if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                logger2.fine("exact palette");
            }
        }
        if (makeExactRgbPaletteSimple == null) {
            throw new org.apache.commons.imaging.ImageWriteException("Gif: can't write images with more than 256 colors");
        }
        int length = makeExactRgbPaletteSimple.length() + (hasTransparency ? 1 : 0);
        org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream = new org.apache.commons.imaging.common.BinaryOutputStream(outputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        outputStream.write(71);
        outputStream.write(73);
        outputStream.write(70);
        outputStream.write(56);
        outputStream.write(57);
        outputStream.write(97);
        binaryOutputStream.write2Bytes(width);
        binaryOutputStream.write2Bytes(height);
        int i2 = length > 128 ? 7 : length > 64 ? 6 : length > 32 ? 5 : length > 16 ? 4 : length > 8 ? 3 : length > 4 ? 2 : length > 2 ? 1 : 0;
        int i3 = i2 + 1;
        binaryOutputStream.write((((byte) i2) & 7) * 16);
        binaryOutputStream.write(0);
        binaryOutputStream.write(0);
        binaryOutputStream.write(33);
        binaryOutputStream.write(-7);
        binaryOutputStream.write(4);
        binaryOutputStream.write(hasTransparency ? (byte) 1 : (byte) 0);
        binaryOutputStream.write(0);
        binaryOutputStream.write(0);
        binaryOutputStream.write((byte) (hasTransparency ? makeExactRgbPaletteSimple.length() : 0));
        binaryOutputStream.write(0);
        if (str != null) {
            binaryOutputStream.write(33);
            binaryOutputStream.write(255);
            byte[] bArr = XMP_APPLICATION_ID_AND_AUTH_CODE;
            binaryOutputStream.write(bArr.length);
            binaryOutputStream.write(bArr);
            binaryOutputStream.write(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            for (int i4 = 0; i4 <= 255; i4++) {
                binaryOutputStream.write(255 - i4);
            }
            binaryOutputStream.write(0);
        }
        binaryOutputStream.write(44);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(width);
        binaryOutputStream.write2Bytes(height);
        binaryOutputStream.write((i2 & 7) | 128);
        for (int i5 = 0; i5 < (1 << i3); i5++) {
            if (i5 < makeExactRgbPaletteSimple.length()) {
                int entry = makeExactRgbPaletteSimple.getEntry(i5);
                binaryOutputStream.write((entry >> 16) & 255);
                binaryOutputStream.write((entry >> 8) & 255);
                binaryOutputStream.write(entry & 255);
            } else {
                binaryOutputStream.write(0);
                binaryOutputStream.write(0);
                binaryOutputStream.write(0);
            }
        }
        int i6 = i3 < 2 ? 2 : i3;
        binaryOutputStream.write(i6);
        org.apache.commons.imaging.common.mylzw.MyLzwCompressor myLzwCompressor = new org.apache.commons.imaging.common.mylzw.MyLzwCompressor(i6, java.nio.ByteOrder.LITTLE_ENDIAN, false);
        byte[] bArr2 = new byte[width * height];
        for (int i7 = 0; i7 < height; i7++) {
            for (int i8 = 0; i8 < width; i8++) {
                int rgb = bufferedImage.getRGB(i8, i7);
                int i9 = 16777215 & rgb;
                if (!hasTransparency) {
                    paletteIndex = makeExactRgbPaletteSimple.getPaletteIndex(i9);
                } else if (((rgb >> 24) & 255) < 255) {
                    paletteIndex = makeExactRgbPaletteSimple.length();
                } else {
                    paletteIndex = makeExactRgbPaletteSimple.getPaletteIndex(i9);
                }
                bArr2[(i7 * width) + i8] = (byte) paletteIndex;
            }
        }
        writeAsSubBlocks(binaryOutputStream, myLzwCompressor.compress(bArr2));
        binaryOutputStream.write(59);
        binaryOutputStream.close();
        outputStream.close();
    }

    @Override // org.apache.commons.imaging.common.XmpEmbeddable
    public java.lang.String getXmpXml(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.gif.GifHeaderInfo readHeader = readHeader(inputStream, null);
            if (readHeader.globalColorTableFlag) {
                readColorTable(inputStream, readHeader.sizeOfGlobalColorTable);
            }
            java.util.List<org.apache.commons.imaging.formats.gif.GifBlock> readBlocks = readBlocks(readHeader, inputStream, true, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (org.apache.commons.imaging.formats.gif.GifBlock gifBlock : readBlocks) {
                if (gifBlock.blockCode == XMP_COMPLETE_CODE) {
                    byte[] appendSubBlocks = ((org.apache.commons.imaging.formats.gif.GenericGifBlock) gifBlock).appendSubBlocks(true);
                    int length = appendSubBlocks.length;
                    byte[] bArr = XMP_APPLICATION_ID_AND_AUTH_CODE;
                    if (length >= bArr.length && org.apache.commons.imaging.common.BinaryFunctions.compareBytes(appendSubBlocks, 0, bArr, 0, bArr.length)) {
                        byte[] bArr2 = new byte[256];
                        for (int i = 0; i <= 255; i++) {
                            bArr2[i] = (byte) (255 - i);
                        }
                        int length2 = appendSubBlocks.length;
                        byte[] bArr3 = XMP_APPLICATION_ID_AND_AUTH_CODE;
                        if (length2 >= bArr3.length + 256) {
                            if (!org.apache.commons.imaging.common.BinaryFunctions.compareBytes(appendSubBlocks, appendSubBlocks.length - 256, bArr2, 0, 256)) {
                                throw new org.apache.commons.imaging.ImageReadException("XMP block in GIF missing magic trailer.");
                            }
                            arrayList.add(new java.lang.String(appendSubBlocks, bArr3.length, appendSubBlocks.length - (bArr3.length + 256), java.nio.charset.StandardCharsets.UTF_8));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                if (inputStream != null) {
                    inputStream.close();
                }
                return null;
            }
            if (arrayList.size() > 1) {
                throw new org.apache.commons.imaging.ImageReadException("More than one XMP Block in GIF.");
            }
            java.lang.String str = (java.lang.String) arrayList.get(0);
            if (inputStream != null) {
                inputStream.close();
            }
            return str;
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
}
