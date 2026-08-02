package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public class TiffReader extends org.apache.commons.imaging.common.BinaryFileParser {
    private final boolean strict;

    public interface Listener {
        boolean addDirectory(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory);

        boolean addField(org.apache.commons.imaging.formats.tiff.TiffField tiffField);

        boolean readImageData();

        boolean readOffsetDirectories();

        boolean setTiffHeader(org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader);
    }

    public TiffReader(boolean z) {
        this.strict = z;
    }

    private org.apache.commons.imaging.formats.tiff.TiffHeader readTiffHeader(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.tiff.TiffHeader readTiffHeader = readTiffHeader(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readTiffHeader;
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

    private java.nio.ByteOrder getTiffByteOrder(int i) throws org.apache.commons.imaging.ImageReadException {
        if (i == 73) {
            return java.nio.ByteOrder.LITTLE_ENDIAN;
        }
        if (i == 77) {
            return java.nio.ByteOrder.BIG_ENDIAN;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid TIFF byte order ");
        sb.append(i & 255);
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }

    private org.apache.commons.imaging.formats.tiff.TiffHeader readTiffHeader(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("BYTE_ORDER_1", inputStream, "Not a Valid TIFF File");
        byte readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("BYTE_ORDER_2", inputStream, "Not a Valid TIFF File");
        if (readByte != readByte2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Byte Order bytes don't match (");
            sb.append((int) readByte);
            sb.append(", ");
            sb.append((int) readByte2);
            sb.append(").");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        java.nio.ByteOrder tiffByteOrder = getTiffByteOrder(readByte);
        setByteOrder(tiffByteOrder);
        int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("tiffVersion", inputStream, "Not a Valid TIFF File", getByteOrder());
        if (read2Bytes != 42) {
            throw new org.apache.commons.imaging.ImageReadException("Unknown Tiff Version: ".concat(java.lang.String.valueOf(read2Bytes)));
        }
        long read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("offsetToFirstIFD", inputStream, "Not a Valid TIFF File", getByteOrder()) & 4294967295L;
        org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes - 8, "Not a Valid TIFF File: couldn't find IFDs");
        return new org.apache.commons.imaging.formats.tiff.TiffHeader(tiffByteOrder, read2Bytes, read4Bytes);
    }

    private void readDirectories(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, org.apache.commons.imaging.FormatCompliance formatCompliance, org.apache.commons.imaging.formats.tiff.TiffReader.Listener listener) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.TiffHeader readTiffHeader = readTiffHeader(byteSource);
        if (listener.setTiffHeader(readTiffHeader)) {
            readDirectory(byteSource, readTiffHeader.offsetToFirstIFD, 0, formatCompliance, listener, new java.util.ArrayList());
        }
    }

    private boolean readDirectory(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, long j, int i, org.apache.commons.imaging.FormatCompliance formatCompliance, org.apache.commons.imaging.formats.tiff.TiffReader.Listener listener, java.util.List<java.lang.Number> list) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return readDirectory(byteSource, j, i, formatCompliance, listener, false, list);
    }

    private boolean readDirectory(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, long j, int i, org.apache.commons.imaging.FormatCompliance formatCompliance, org.apache.commons.imaging.formats.tiff.TiffReader.Listener listener, boolean z, java.util.List<java.lang.Number> list) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.TiffField tiffField;
        int i2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong[] tagInfoLongArr;
        int i3;
        java.util.ArrayList arrayList;
        byte[] bArr;
        if (list.contains(java.lang.Long.valueOf(j))) {
            return false;
        }
        list.add(java.lang.Long.valueOf(j));
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            if (j >= byteSource.getLength()) {
                if (inputStream != null) {
                    inputStream.close();
                }
                return true;
            }
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, j);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            try {
                int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("DirectoryEntryCount", inputStream, "Not a Valid TIFF File", getByteOrder());
                for (int i4 = 0; i4 < read2Bytes; i4++) {
                    int read2Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Tag", inputStream, "Not a Valid TIFF File", getByteOrder());
                    int read2Bytes3 = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes(com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, inputStream, "Not a Valid TIFF File", getByteOrder());
                    long read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Count", inputStream, "Not a Valid TIFF File", getByteOrder()) & 4294967295L;
                    byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("Offset", inputStream, 4, "Not a Valid TIFF File");
                    long j2 = org.apache.commons.imaging.common.ByteConversions.toInt(readBytes, getByteOrder()) & 4294967295L;
                    if (read2Bytes2 != 0) {
                        try {
                            org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType = org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.getFieldType(read2Bytes3);
                            long size = fieldType.getSize() * read4Bytes;
                            if (size > 4) {
                                if (j2 >= 0 && j2 + size <= byteSource.getLength()) {
                                    bArr = byteSource.getBlock(j2, (int) size);
                                }
                                if (this.strict) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append("Attempt to read byte range starting from ");
                                    sb.append(j2);
                                    sb.append(" of length ");
                                    sb.append(size);
                                    sb.append(" which is outside the file's size of ");
                                    sb.append(byteSource.getLength());
                                    throw new java.io.IOException(sb.toString());
                                }
                            } else {
                                bArr = readBytes;
                            }
                            org.apache.commons.imaging.formats.tiff.TiffField tiffField2 = new org.apache.commons.imaging.formats.tiff.TiffField(read2Bytes2, i, fieldType, read4Bytes, j2, bArr, getByteOrder(), i4);
                            arrayList2.add(tiffField2);
                            if (!listener.addField(tiffField2)) {
                                if (inputStream == null) {
                                    return true;
                                }
                                inputStream.close();
                                return true;
                            }
                        } catch (org.apache.commons.imaging.ImageReadException unused) {
                            continue;
                        }
                    }
                }
                java.util.ArrayList arrayList3 = arrayList2;
                org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory = new org.apache.commons.imaging.formats.tiff.TiffDirectory(i, arrayList2, j, org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("nextDirectoryOffset", inputStream, "Not a Valid TIFF File", getByteOrder()) & 4294967295L, getByteOrder());
                if (listener.readImageData()) {
                    if (tiffDirectory.hasTiffImageData()) {
                        tiffDirectory.setTiffImageData(getTiffRawImageData(byteSource, tiffDirectory));
                    }
                    if (tiffDirectory.hasJpegImageData()) {
                        tiffDirectory.setJpegImageData(getJpegRawImageData(byteSource, tiffDirectory));
                    }
                }
                if (!listener.addDirectory(tiffDirectory)) {
                    if (inputStream == null) {
                        return true;
                    }
                    inputStream.close();
                    return true;
                }
                if (listener.readOffsetDirectories()) {
                    org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong[] tagInfoLongArr2 = {org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXIF_OFFSET, org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_GPSINFO, org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_INTEROP_OFFSET};
                    int[] iArr = {-2, -3, -4};
                    int i5 = 0;
                    for (int i6 = 3; i5 < i6; i6 = i3) {
                        org.apache.commons.imaging.formats.tiff.TiffField findField = tiffDirectory.findField(tagInfoLongArr2[i5]);
                        if (findField != null) {
                            try {
                                tiffField = findField;
                                i2 = i5;
                                tagInfoLongArr = tagInfoLongArr2;
                                i3 = i6;
                                arrayList = arrayList3;
                            } catch (org.apache.commons.imaging.ImageReadException e) {
                                e = e;
                                tiffField = findField;
                                i2 = i5;
                                tagInfoLongArr = tagInfoLongArr2;
                                i3 = i6;
                                arrayList = arrayList3;
                            }
                            try {
                                if (readDirectory(byteSource, tiffDirectory.getFieldValue(r0), iArr[i5], formatCompliance, listener, true, list)) {
                                }
                            } catch (org.apache.commons.imaging.ImageReadException e2) {
                                e = e2;
                                if (this.strict) {
                                    throw e;
                                }
                                arrayList.remove(tiffField);
                                i5 = i2 + 1;
                                arrayList3 = arrayList;
                                tagInfoLongArr2 = tagInfoLongArr;
                            }
                            arrayList.remove(tiffField);
                        } else {
                            i2 = i5;
                            tagInfoLongArr = tagInfoLongArr2;
                            i3 = i6;
                            arrayList = arrayList3;
                        }
                        i5 = i2 + 1;
                        arrayList3 = arrayList;
                        tagInfoLongArr2 = tagInfoLongArr;
                    }
                }
                if (!z && tiffDirectory.nextDirectoryOffset > 0) {
                    readDirectory(byteSource, tiffDirectory.nextDirectoryOffset, i + 1, formatCompliance, listener, list);
                }
                if (inputStream == null) {
                    return true;
                }
                inputStream.close();
                return true;
            } catch (java.io.IOException e3) {
                if (this.strict) {
                    throw e3;
                }
                if (inputStream == null) {
                    return true;
                }
                inputStream.close();
                return true;
            }
        } finally {
        }
    }

    static class Collector implements org.apache.commons.imaging.formats.tiff.TiffReader.Listener {
        private final java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory> directories;
        private final java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> fields;
        private final boolean readThumbnails;
        private org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader;

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean readOffsetDirectories() {
            return true;
        }

        Collector() {
            this(null);
        }

        Collector(java.util.Map<java.lang.String, java.lang.Object> map) {
            this.directories = new java.util.ArrayList();
            this.fields = new java.util.ArrayList();
            this.readThumbnails = (map == null || !map.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_READ_THUMBNAILS)) ? true : java.lang.Boolean.TRUE.equals(map.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_READ_THUMBNAILS));
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean setTiffHeader(org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader) {
            this.tiffHeader = tiffHeader;
            return true;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean addDirectory(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory) {
            this.directories.add(tiffDirectory);
            return true;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean addField(org.apache.commons.imaging.formats.tiff.TiffField tiffField) {
            this.fields.add(tiffField);
            return true;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean readImageData() {
            return this.readThumbnails;
        }

        public org.apache.commons.imaging.formats.tiff.TiffContents getContents() {
            return new org.apache.commons.imaging.formats.tiff.TiffContents(this.tiffHeader, this.directories, this.fields);
        }
    }

    static class FirstDirectoryCollector extends org.apache.commons.imaging.formats.tiff.TiffReader.Collector {
        private final boolean readImageData;

        FirstDirectoryCollector(boolean z) {
            this.readImageData = z;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Collector, org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean addDirectory(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory) {
            super.addDirectory(tiffDirectory);
            return false;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Collector, org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean readImageData() {
            return this.readImageData;
        }
    }

    public org.apache.commons.imaging.formats.tiff.TiffContents readFirstDirectory(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map, boolean z, org.apache.commons.imaging.FormatCompliance formatCompliance) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.TiffReader.FirstDirectoryCollector firstDirectoryCollector = new org.apache.commons.imaging.formats.tiff.TiffReader.FirstDirectoryCollector(z);
        read(byteSource, map, formatCompliance, firstDirectoryCollector);
        org.apache.commons.imaging.formats.tiff.TiffContents contents = firstDirectoryCollector.getContents();
        if (contents.directories.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("Image did not contain any directories.");
        }
        return contents;
    }

    public org.apache.commons.imaging.formats.tiff.TiffContents readDirectories(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, boolean z, org.apache.commons.imaging.FormatCompliance formatCompliance) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.TiffReader.Collector collector = new org.apache.commons.imaging.formats.tiff.TiffReader.Collector(java.util.Collections.singletonMap(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_READ_THUMBNAILS, java.lang.Boolean.valueOf(z)));
        readDirectories(byteSource, formatCompliance, collector);
        org.apache.commons.imaging.formats.tiff.TiffContents contents = collector.getContents();
        if (contents.directories.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("Image did not contain any directories.");
        }
        return contents;
    }

    public org.apache.commons.imaging.formats.tiff.TiffContents readContents(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map, org.apache.commons.imaging.FormatCompliance formatCompliance) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.TiffReader.Collector collector = new org.apache.commons.imaging.formats.tiff.TiffReader.Collector(map);
        read(byteSource, map, formatCompliance, collector);
        return collector.getContents();
    }

    public void read(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map, org.apache.commons.imaging.FormatCompliance formatCompliance, org.apache.commons.imaging.formats.tiff.TiffReader.Listener listener) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        readDirectories(byteSource, formatCompliance, listener);
    }

    private org.apache.commons.imaging.formats.tiff.TiffImageData getTiffRawImageData(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int intValue;
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement> tiffRawImageDataElements = tiffDirectory.getTiffRawImageDataElements();
        org.apache.commons.imaging.formats.tiff.TiffImageData.Data[] dataArr = new org.apache.commons.imaging.formats.tiff.TiffImageData.Data[tiffRawImageDataElements.size()];
        int i = 0;
        if (byteSource instanceof org.apache.commons.imaging.common.bytesource.ByteSourceFile) {
            org.apache.commons.imaging.common.bytesource.ByteSourceFile byteSourceFile = (org.apache.commons.imaging.common.bytesource.ByteSourceFile) byteSource;
            while (i < tiffRawImageDataElements.size()) {
                org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement = tiffRawImageDataElements.get(i);
                dataArr[i] = new org.apache.commons.imaging.formats.tiff.TiffImageData.ByteSourceData(imageDataElement.offset, imageDataElement.length, byteSourceFile);
                i++;
            }
        } else {
            while (i < tiffRawImageDataElements.size()) {
                org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement2 = tiffRawImageDataElements.get(i);
                dataArr[i] = new org.apache.commons.imaging.formats.tiff.TiffImageData.Data(imageDataElement2.offset, imageDataElement2.length, byteSource.getBlock(imageDataElement2.offset, imageDataElement2.length));
                i++;
            }
        }
        if (tiffDirectory.imageDataInStrips()) {
            org.apache.commons.imaging.formats.tiff.TiffField findField = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP);
            if (findField != null) {
                intValue = findField.getIntValue();
            } else {
                org.apache.commons.imaging.formats.tiff.TiffField findField2 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);
                intValue = findField2 != null ? findField2.getIntValue() : Integer.MAX_VALUE;
            }
            return new org.apache.commons.imaging.formats.tiff.TiffImageData.Strips(dataArr, intValue);
        }
        org.apache.commons.imaging.formats.tiff.TiffField findField3 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_WIDTH);
        if (findField3 == null) {
            throw new org.apache.commons.imaging.ImageReadException("Can't find tile width field.");
        }
        int intValue2 = findField3.getIntValue();
        org.apache.commons.imaging.formats.tiff.TiffField findField4 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_LENGTH);
        if (findField4 == null) {
            throw new org.apache.commons.imaging.ImageReadException("Can't find tile length field.");
        }
        return new org.apache.commons.imaging.formats.tiff.TiffImageData.Tiles(dataArr, intValue2, findField4.getIntValue());
    }

    private org.apache.commons.imaging.formats.tiff.JpegImageData getJpegRawImageData(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement jpegRawImageDataElement = tiffDirectory.getJpegRawImageDataElement();
        long j = jpegRawImageDataElement.offset;
        int i = jpegRawImageDataElement.length;
        if (i + j > byteSource.getLength()) {
            i = (int) (byteSource.getLength() - j);
        }
        byte[] block = byteSource.getBlock(j, i);
        if (this.strict && (i < 2 || (((block[block.length - 2] & 255) << 8) | (block[block.length - 1] & 255)) != 65497)) {
            throw new org.apache.commons.imaging.ImageReadException("JPEG EOI marker could not be found at expected location");
        }
        return new org.apache.commons.imaging.formats.tiff.JpegImageData(j, i, block);
    }
}
