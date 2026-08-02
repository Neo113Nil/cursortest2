package org.apache.commons.imaging.formats.psd;

/* loaded from: classes17.dex */
public class PsdImageParser extends org.apache.commons.imaging.ImageParser implements org.apache.commons.imaging.common.XmpEmbeddable {
    public static final java.lang.String BLOCK_NAME_XMP = "XMP";
    private static final int COLOR_MODE_INDEXED = 2;
    public static final int IMAGE_RESOURCE_ID_ICC_PROFILE = 1039;
    public static final int IMAGE_RESOURCE_ID_XMP = 1060;
    private static final int PSD_HEADER_LENGTH = 26;
    private static final int PSD_SECTION_COLOR_MODE = 1;
    private static final int PSD_SECTION_HEADER = 0;
    private static final int PSD_SECTION_IMAGE_DATA = 4;
    private static final int PSD_SECTION_IMAGE_RESOURCES = 2;
    private static final int PSD_SECTION_LAYER_AND_MASK_DATA = 3;
    private static final java.lang.String DEFAULT_EXTENSION = ".psd";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    private int getChannelsPerMode(int i) {
        int i2 = 1;
        if (i != 0 && i != 1) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4 && i != 9) {
                    return -1;
                }
            }
        }
        return i2;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    public PsdImageParser() {
        super.setByteOrder(java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "PSD-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String[] getAcceptedExtensions() {
        return (java.lang.String[]) ACCEPTED_EXTENSIONS.clone();
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageFormat[] getAcceptedTypes() {
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.PSD};
    }

    private org.apache.commons.imaging.formats.psd.PsdHeaderInfo readHeader(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.psd.PsdHeaderInfo readHeader = readHeader(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readHeader;
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

    private org.apache.commons.imaging.formats.psd.PsdHeaderInfo readHeader(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes(inputStream, new byte[]{56, 66, 80, 83}, "Not a Valid PSD File");
        return new org.apache.commons.imaging.formats.psd.PsdHeaderInfo(org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Version", inputStream, "Not a Valid PSD File", getByteOrder()), org.apache.commons.imaging.common.BinaryFunctions.readBytes("Reserved", inputStream, 6, "Not a Valid PSD File"), org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Channels", inputStream, "Not a Valid PSD File", getByteOrder()), org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Rows", inputStream, "Not a Valid PSD File", getByteOrder()), org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Columns", inputStream, "Not a Valid PSD File", getByteOrder()), org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Depth", inputStream, "Not a Valid PSD File", getByteOrder()), org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Mode", inputStream, "Not a Valid PSD File", getByteOrder()));
    }

    private org.apache.commons.imaging.formats.psd.PsdImageContents readImageContents(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.psd.PsdHeaderInfo readHeader = readHeader(inputStream);
        int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorModeDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
        org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes);
        int read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ImageResourcesLength", inputStream, "Not a Valid PSD File", getByteOrder());
        org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes2);
        int read4Bytes3 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("LayerAndMaskDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
        org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes3);
        return new org.apache.commons.imaging.formats.psd.PsdImageContents(readHeader, read4Bytes, read4Bytes2, read4Bytes3, org.apache.commons.imaging.common.BinaryFunctions.read2Bytes(androidx.exifinterface.media.ExifInterface.TAG_COMPRESSION, inputStream, "Not a Valid PSD File", getByteOrder()));
    }

    private java.util.List<org.apache.commons.imaging.formats.psd.ImageResourceBlock> readImageResourceBlocks(byte[] bArr, int[] iArr, int i) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return readImageResourceBlocks(new java.io.ByteArrayInputStream(bArr), iArr, i, bArr.length);
    }

    private boolean keepImageResourceBlock(int i, int[] iArr) {
        if (iArr == null) {
            return true;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    private java.util.List<org.apache.commons.imaging.formats.psd.ImageResourceBlock> readImageResourceBlocks(java.io.InputStream inputStream, int[] iArr, int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i2 > 0) {
            org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes(inputStream, new byte[]{56, 66, 73, 77}, "Not a Valid PSD File");
            int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("ID", inputStream, "Not a Valid PSD File", getByteOrder());
            byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("NameLength", inputStream, "Not a Valid PSD File");
            byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("NameData", inputStream, readByte, "Not a Valid PSD File");
            int i3 = (i2 - 7) - readByte;
            if ((readByte + 1) % 2 != 0) {
                org.apache.commons.imaging.common.BinaryFunctions.readByte("NameDiscard", inputStream, "Not a Valid PSD File");
                i3--;
            }
            int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Size", inputStream, "Not a Valid PSD File", getByteOrder());
            byte[] readBytes2 = org.apache.commons.imaging.common.BinaryFunctions.readBytes("Data", inputStream, read4Bytes, "Not a Valid PSD File");
            i2 = (i3 - 4) - read4Bytes;
            if (read4Bytes % 2 != 0) {
                org.apache.commons.imaging.common.BinaryFunctions.readByte("DataDiscard", inputStream, "Not a Valid PSD File");
                i2--;
            }
            if (keepImageResourceBlock(read2Bytes, iArr)) {
                arrayList.add(new org.apache.commons.imaging.formats.psd.ImageResourceBlock(read2Bytes, readBytes, readBytes2));
                if (i >= 0 && arrayList.size() >= i) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private java.util.List<org.apache.commons.imaging.formats.psd.ImageResourceBlock> readImageResourceBlocks(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, int[] iArr, int i) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            java.io.InputStream inputStream2 = getInputStream(byteSource, 2);
            try {
                java.util.List<org.apache.commons.imaging.formats.psd.ImageResourceBlock> readImageResourceBlocks = readImageResourceBlocks(org.apache.commons.imaging.common.BinaryFunctions.readBytes("ImageResources", inputStream2, readImageContents(inputStream).ImageResourcesLength, "Not a Valid PSD File"), iArr, i);
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return readImageResourceBlocks;
            } finally {
            }
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

    private java.io.InputStream getInputStream(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, int i) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        if (i != 0) {
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, 26L);
            int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorModeDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
            if (i != 1) {
                org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes);
                int read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ImageResourcesLength", inputStream, "Not a Valid PSD File", getByteOrder());
                if (i != 2) {
                    org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes2);
                    int read4Bytes3 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("LayerAndMaskDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
                    if (i != 3) {
                        org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes3);
                        org.apache.commons.imaging.common.BinaryFunctions.read2Bytes(androidx.exifinterface.media.ExifInterface.TAG_COMPRESSION, inputStream, "Not a Valid PSD File", getByteOrder());
                        if (i != 4) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw new org.apache.commons.imaging.ImageReadException("getInputStream: Unknown Section: ".concat(java.lang.String.valueOf(i)));
                        }
                    }
                }
            }
        }
        return inputStream;
    }

    private byte[] getData(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, int i) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            if (i == 0) {
                byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("Header", inputStream, 26, "Not a Valid PSD File");
                if (inputStream != null) {
                    inputStream.close();
                }
                return readBytes;
            }
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, 26L);
            int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ColorModeDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
            if (i == 1) {
                byte[] readBytes2 = org.apache.commons.imaging.common.BinaryFunctions.readBytes("ColorModeData", inputStream, read4Bytes, "Not a Valid PSD File");
                if (inputStream != null) {
                    inputStream.close();
                }
                return readBytes2;
            }
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes);
            int read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ImageResourcesLength", inputStream, "Not a Valid PSD File", getByteOrder());
            if (i == 2) {
                byte[] readBytes3 = org.apache.commons.imaging.common.BinaryFunctions.readBytes("ImageResources", inputStream, read4Bytes2, "Not a Valid PSD File");
                if (inputStream != null) {
                    inputStream.close();
                }
                return readBytes3;
            }
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes2);
            int read4Bytes3 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("LayerAndMaskDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
            if (i == 3) {
                byte[] readBytes4 = org.apache.commons.imaging.common.BinaryFunctions.readBytes("LayerAndMaskData", inputStream, read4Bytes3, "Not a Valid PSD File");
                if (inputStream != null) {
                    inputStream.close();
                }
                return readBytes4;
            }
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes3);
            org.apache.commons.imaging.common.BinaryFunctions.read2Bytes(androidx.exifinterface.media.ExifInterface.TAG_COMPRESSION, inputStream, "Not a Valid PSD File", getByteOrder());
            if (inputStream != null) {
                inputStream.close();
            }
            throw new org.apache.commons.imaging.ImageReadException("getInputStream: Unknown Section: ".concat(java.lang.String.valueOf(i)));
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

    private org.apache.commons.imaging.formats.psd.PsdImageContents readImageContents(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.psd.PsdImageContents readImageContents = readImageContents(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readImageContents;
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
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte[] bArr;
        java.util.List<org.apache.commons.imaging.formats.psd.ImageResourceBlock> readImageResourceBlocks = readImageResourceBlocks(byteSource, new int[]{1039}, 1);
        if (readImageResourceBlocks == null || readImageResourceBlocks.isEmpty() || (bArr = readImageResourceBlocks.get(0).data) == null || bArr.length <= 0) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.psd.PsdHeaderInfo readHeader = readHeader(byteSource);
        if (readHeader == null) {
            throw new org.apache.commons.imaging.ImageReadException("PSD: couldn't read header");
        }
        return new java.awt.Dimension(readHeader.columns, readHeader.rows);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.ImageInfo.CompressionAlgorithm compressionAlgorithm;
        org.apache.commons.imaging.formats.psd.PsdImageContents readImageContents = readImageContents(byteSource);
        if (readImageContents == null) {
            throw new org.apache.commons.imaging.ImageReadException("PSD: Couldn't read blocks");
        }
        org.apache.commons.imaging.formats.psd.PsdHeaderInfo psdHeaderInfo = readImageContents.header;
        if (psdHeaderInfo == null) {
            throw new org.apache.commons.imaging.ImageReadException("PSD: Couldn't read Header");
        }
        int i = psdHeaderInfo.columns;
        int i2 = psdHeaderInfo.rows;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int channelsPerMode = psdHeaderInfo.depth * getChannelsPerMode(psdHeaderInfo.mode);
        int i3 = channelsPerMode < 0 ? 0 : channelsPerMode;
        org.apache.commons.imaging.ImageFormats imageFormats = org.apache.commons.imaging.ImageFormats.PSD;
        float f = (float) (i / 72.0d);
        float f2 = (float) (i2 / 72.0d);
        boolean z = psdHeaderInfo.mode == 2;
        org.apache.commons.imaging.ImageInfo.ColorType colorType = org.apache.commons.imaging.ImageInfo.ColorType.UNKNOWN;
        int i4 = readImageContents.Compression;
        if (i4 == 0) {
            compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.NONE;
        } else if (i4 == 1) {
            compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.PSD;
        } else {
            compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.UNKNOWN;
        }
        return new org.apache.commons.imaging.ImageInfo("Psd", i3, arrayList, imageFormats, "Photoshop", i2, "image/x-photoshop", -1, 72, f2, 72, f, i, false, false, z, colorType, compressionAlgorithm);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        printWriter.println("gif.dumpImageFile");
        org.apache.commons.imaging.ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }
        imageInfo.toString(printWriter, "");
        org.apache.commons.imaging.formats.psd.PsdImageContents readImageContents = readImageContents(byteSource);
        readImageContents.dump(printWriter);
        readImageContents.header.dump(printWriter);
        java.util.List<org.apache.commons.imaging.formats.psd.ImageResourceBlock> readImageResourceBlocks = readImageResourceBlocks(byteSource, (int[]) null, -1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("blocks.size(): ");
        sb.append(readImageResourceBlocks.size());
        printWriter.println(sb.toString());
        for (int i = 0; i < readImageResourceBlocks.size(); i++) {
            org.apache.commons.imaging.formats.psd.ImageResourceBlock imageResourceBlock = readImageResourceBlocks.get(i);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\t");
            sb2.append(i);
            sb2.append(" (");
            sb2.append(java.lang.Integer.toHexString(imageResourceBlock.id));
            sb2.append(", '");
            sb2.append(new java.lang.String(imageResourceBlock.nameData, java.nio.charset.StandardCharsets.ISO_8859_1));
            sb2.append("' (");
            sb2.append(imageResourceBlock.nameData.length);
            sb2.append("),  data: ");
            sb2.append(imageResourceBlock.data.length);
            sb2.append(" type: '");
            sb2.append(org.apache.commons.imaging.formats.psd.ImageResourceType.getDescription(imageResourceBlock.id));
            sb2.append("' )");
            printWriter.println(sb2.toString());
        }
        printWriter.println("");
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.psd.dataparsers.DataParser dataParserBitmap;
        org.apache.commons.imaging.formats.psd.datareaders.DataReader uncompressedDataReader;
        org.apache.commons.imaging.formats.psd.PsdImageContents readImageContents = readImageContents(byteSource);
        if (readImageContents == null) {
            throw new org.apache.commons.imaging.ImageReadException("PSD: Couldn't read blocks");
        }
        org.apache.commons.imaging.formats.psd.PsdHeaderInfo psdHeaderInfo = readImageContents.header;
        if (psdHeaderInfo == null) {
            throw new org.apache.commons.imaging.ImageReadException("PSD: Couldn't read Header");
        }
        readImageResourceBlocks(byteSource, (int[]) null, -1);
        java.awt.image.BufferedImage colorBufferedImage = getBufferedImageFactory(map).getColorBufferedImage(psdHeaderInfo.columns, psdHeaderInfo.rows, false);
        int i = readImageContents.header.mode;
        if (i == 0) {
            dataParserBitmap = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserBitmap();
        } else {
            if (i != 1) {
                if (i == 2) {
                    dataParserBitmap = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserIndexed(getData(byteSource, 1));
                } else if (i == 3) {
                    dataParserBitmap = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserRgb();
                } else if (i == 4) {
                    dataParserBitmap = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserCmyk();
                } else if (i != 8) {
                    if (i == 9) {
                        dataParserBitmap = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserLab();
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown Mode: ");
                        sb.append(readImageContents.header.mode);
                        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
                    }
                }
            }
            dataParserBitmap = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserGrayscale();
        }
        int i2 = readImageContents.Compression;
        if (i2 == 0) {
            uncompressedDataReader = new org.apache.commons.imaging.formats.psd.datareaders.UncompressedDataReader(dataParserBitmap);
        } else if (i2 == 1) {
            uncompressedDataReader = new org.apache.commons.imaging.formats.psd.datareaders.CompressedDataReader(dataParserBitmap);
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown Compression: ");
            sb2.append(readImageContents.Compression);
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        java.io.InputStream inputStream = getInputStream(byteSource, 4);
        try {
            uncompressedDataReader.readData(inputStream, colorBufferedImage, readImageContents, this);
            if (inputStream != null) {
                inputStream.close();
            }
            return colorBufferedImage;
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.common.XmpEmbeddable
    public java.lang.String getXmpXml(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.psd.PsdImageContents readImageContents = readImageContents(byteSource);
        if (readImageContents == null) {
            throw new org.apache.commons.imaging.ImageReadException("PSD: Couldn't read blocks");
        }
        if (readImageContents.header == null) {
            throw new org.apache.commons.imaging.ImageReadException("PSD: Couldn't read Header");
        }
        java.util.List<org.apache.commons.imaging.formats.psd.ImageResourceBlock> readImageResourceBlocks = readImageResourceBlocks(byteSource, new int[]{1060}, -1);
        if (readImageResourceBlocks == null || readImageResourceBlocks.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(readImageResourceBlocks);
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("PSD contains more than one XMP block.");
        }
        org.apache.commons.imaging.formats.psd.ImageResourceBlock imageResourceBlock = (org.apache.commons.imaging.formats.psd.ImageResourceBlock) arrayList.get(0);
        return new java.lang.String(imageResourceBlock.data, 0, imageResourceBlock.data.length, java.nio.charset.StandardCharsets.UTF_8);
    }
}
