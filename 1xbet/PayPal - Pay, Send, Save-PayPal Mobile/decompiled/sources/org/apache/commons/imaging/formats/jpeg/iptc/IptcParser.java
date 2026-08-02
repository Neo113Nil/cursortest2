package org.apache.commons.imaging.formats.jpeg.iptc;

/* loaded from: classes17.dex */
public class IptcParser extends org.apache.commons.imaging.common.BinaryFileParser {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.jpeg.iptc.IptcParser.class.getName());
    private static final java.nio.ByteOrder APP13_BYTE_ORDER = java.nio.ByteOrder.BIG_ENDIAN;
    private static final java.util.List<java.lang.Integer> PHOTOSHOP_IGNORED_BLOCK_TYPE = java.util.Arrays.asList(1084, 1085, 1086, 1087);

    public IptcParser() {
        setByteOrder(java.nio.ByteOrder.BIG_ENDIAN);
    }

    public boolean isPhotoshopJpegSegment(byte[] bArr) {
        if (!org.apache.commons.imaging.common.BinaryFunctions.startsWith(bArr, org.apache.commons.imaging.formats.jpeg.JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING)) {
            return false;
        }
        int size = org.apache.commons.imaging.formats.jpeg.JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING.size();
        return size + 4 <= bArr.length && org.apache.commons.imaging.common.ByteConversions.toInt(bArr, size, APP13_BYTE_ORDER) == org.apache.commons.imaging.formats.jpeg.JpegConstants.CONST_8BIM;
    }

    public org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data parsePhotoshopSegment(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return parsePhotoshopSegment(bArr, map != null && java.lang.Boolean.TRUE.equals(map.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_STRICT)));
    }

    public org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data parsePhotoshopSegment(byte[] bArr, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock> parseAllBlocks = parseAllBlocks(bArr, z);
        for (org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock iptcBlock : parseAllBlocks) {
            if (iptcBlock.isIPTCBlock()) {
                arrayList.addAll(parseIPTCBlock(iptcBlock.getBlockData()));
            }
        }
        return new org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data(arrayList, parseAllBlocks);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord> parseIPTCBlock(byte[] bArr) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= bArr.length) {
                break;
            }
            int i3 = bArr[i] & 255;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("tagMarker: ");
            sb.append(i3);
            sb.append(" (0x");
            sb.append(java.lang.Integer.toHexString(i3));
            sb.append(")");
            org.apache.commons.imaging.internal.Debug.debug(sb.toString());
            if (i3 != 28) {
                java.util.logging.Logger logger = LOGGER;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    logger.fine("Unexpected record tag marker in IPTC data.");
                    return arrayList;
                }
            } else {
                int i4 = bArr[i2] & 255;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("recordNumber: ");
                sb2.append(i4);
                sb2.append(" (0x");
                sb2.append(java.lang.Integer.toHexString(i4));
                sb2.append(")");
                org.apache.commons.imaging.internal.Debug.debug(sb2.toString());
                int i5 = bArr[i + 2] & 255;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("recordType: ");
                sb3.append(i5);
                sb3.append(" (0x");
                sb3.append(java.lang.Integer.toHexString(i5));
                sb3.append(")");
                org.apache.commons.imaging.internal.Debug.debug(sb3.toString());
                int uInt16 = org.apache.commons.imaging.common.ByteConversions.toUInt16(bArr, i + 3, getByteOrder());
                int i6 = i + 5;
                boolean z = uInt16 > 32767;
                if (z) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("extendedDataset. dataFieldCountLength: ");
                    sb4.append(uInt16 & 32767);
                    org.apache.commons.imaging.internal.Debug.debug(sb4.toString());
                }
                if (z) {
                    break;
                }
                byte[] slice = org.apache.commons.imaging.common.BinaryFunctions.slice(bArr, i6, uInt16);
                i = i6 + uInt16;
                if (i4 == 2) {
                    if (i5 == 0) {
                        java.util.logging.Logger logger2 = LOGGER;
                        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("ignore record version record! ");
                            sb5.append(arrayList.size());
                            logger2.fine(sb5.toString());
                        }
                    } else {
                        arrayList.add(new org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord(org.apache.commons.imaging.formats.jpeg.iptc.IptcTypeLookup.getIptcType(i5), new java.lang.String(slice, java.nio.charset.StandardCharsets.ISO_8859_1)));
                    }
                }
            }
        }
    }

    protected java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock> parseAllBlocks(byte[] bArr, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte[] bArr2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            if (!org.apache.commons.imaging.formats.jpeg.JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING.equals(org.apache.commons.imaging.common.BinaryFunctions.readBytes("", byteArrayInputStream, org.apache.commons.imaging.formats.jpeg.JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING.size(), "App13 Segment missing identification string"))) {
                throw new org.apache.commons.imaging.ImageReadException("Not a Photoshop App13 Segment");
            }
            while (true) {
                try {
                    java.nio.ByteOrder byteOrder = APP13_BYTE_ORDER;
                    if (org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("", byteArrayInputStream, "Image Resource Block missing identification string", byteOrder) != org.apache.commons.imaging.formats.jpeg.JpegConstants.CONST_8BIM) {
                        throw new org.apache.commons.imaging.ImageReadException("Invalid Image Resource Block Signature");
                    }
                    int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("", byteArrayInputStream, "Image Resource Block missing type", byteOrder);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("blockType: ");
                    sb.append(read2Bytes);
                    sb.append(" (0x");
                    sb.append(java.lang.Integer.toHexString(read2Bytes));
                    sb.append(")");
                    org.apache.commons.imaging.internal.Debug.debug(sb.toString());
                    if (PHOTOSHOP_IGNORED_BLOCK_TYPE.contains(java.lang.Integer.valueOf(read2Bytes))) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("Skipping blockType: ");
                        sb2.append(read2Bytes);
                        sb2.append(" (0x");
                        sb2.append(java.lang.Integer.toHexString(read2Bytes));
                        sb2.append(")");
                        org.apache.commons.imaging.internal.Debug.debug(sb2.toString());
                        org.apache.commons.imaging.common.BinaryFunctions.searchQuad(org.apache.commons.imaging.formats.jpeg.JpegConstants.CONST_8BIM, byteArrayInputStream);
                    } else {
                        byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("Name length", byteArrayInputStream, "Image Resource Block missing name length");
                        if (readByte > 0) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            sb3.append("blockNameLength: ");
                            sb3.append((int) readByte);
                            sb3.append(" (0x");
                            sb3.append(java.lang.Integer.toHexString(readByte));
                            sb3.append(")");
                            org.apache.commons.imaging.internal.Debug.debug(sb3.toString());
                        }
                        if (readByte == 0) {
                            org.apache.commons.imaging.common.BinaryFunctions.readByte("Block name bytes", byteArrayInputStream, "Image Resource Block has invalid name");
                            bArr2 = new byte[0];
                        } else {
                            try {
                                byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("", byteArrayInputStream, readByte, "Invalid Image Resource Block name");
                                if (readByte % 2 == 0) {
                                    org.apache.commons.imaging.common.BinaryFunctions.readByte("Padding byte", byteArrayInputStream, "Image Resource Block missing padding byte");
                                }
                                bArr2 = readBytes;
                            } catch (java.io.IOException e) {
                                if (z) {
                                    throw e;
                                }
                                byteArrayInputStream.close();
                                return arrayList;
                            }
                        }
                        int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("", byteArrayInputStream, "Image Resource Block missing size", byteOrder);
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append("blockSize: ");
                        sb4.append(read4Bytes);
                        sb4.append(" (0x");
                        sb4.append(java.lang.Integer.toHexString(read4Bytes));
                        sb4.append(")");
                        org.apache.commons.imaging.internal.Debug.debug(sb4.toString());
                        if (read4Bytes > bArr.length) {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            sb5.append("Invalid Block Size : ");
                            sb5.append(read4Bytes);
                            sb5.append(" > ");
                            sb5.append(bArr.length);
                            throw new org.apache.commons.imaging.ImageReadException(sb5.toString());
                        }
                        try {
                            arrayList.add(new org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock(read2Bytes, bArr2, org.apache.commons.imaging.common.BinaryFunctions.readBytes("", byteArrayInputStream, read4Bytes, "Invalid Image Resource Block data")));
                            if (read4Bytes % 2 != 0) {
                                org.apache.commons.imaging.common.BinaryFunctions.readByte("Padding byte", byteArrayInputStream, "Image Resource Block missing padding byte");
                            }
                        } catch (java.io.IOException e2) {
                            if (z) {
                                throw e2;
                            }
                            byteArrayInputStream.close();
                            return arrayList;
                        }
                    }
                } catch (java.io.IOException unused) {
                }
            }
        } finally {
        }
    }

    public byte[] writePhotoshopApp13Segment(org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data photoshopApp13Data) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream = new org.apache.commons.imaging.common.BinaryOutputStream(byteArrayOutputStream);
        org.apache.commons.imaging.formats.jpeg.JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING.writeTo(binaryOutputStream);
        for (org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock iptcBlock : photoshopApp13Data.getRawBlocks()) {
            binaryOutputStream.write4Bytes(org.apache.commons.imaging.formats.jpeg.JpegConstants.CONST_8BIM);
            if (iptcBlock.getBlockType() < 0 || iptcBlock.getBlockType() > 65535) {
                throw new org.apache.commons.imaging.ImageWriteException("Invalid IPTC block type.");
            }
            binaryOutputStream.write2Bytes(iptcBlock.getBlockType());
            byte[] blockNameBytes = iptcBlock.getBlockNameBytes();
            if (blockNameBytes.length > 255) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("IPTC block name is too long: ");
                sb.append(blockNameBytes.length);
                throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
            }
            binaryOutputStream.write(blockNameBytes.length);
            binaryOutputStream.write(blockNameBytes);
            if (blockNameBytes.length % 2 == 0) {
                binaryOutputStream.write(0);
            }
            byte[] blockData = iptcBlock.getBlockData();
            if (blockData.length > 32767) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("IPTC block data is too long: ");
                sb2.append(blockData.length);
                throw new org.apache.commons.imaging.ImageWriteException(sb2.toString());
            }
            binaryOutputStream.write4Bytes(blockData.length);
            binaryOutputStream.write(blockData);
            if (blockData.length % 2 == 1) {
                binaryOutputStream.write(0);
            }
        }
        binaryOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] writeIPTCBlock(java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord> list) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream = new org.apache.commons.imaging.common.BinaryOutputStream(byteArrayOutputStream, getByteOrder());
        try {
            binaryOutputStream.write(28);
            binaryOutputStream.write(2);
            binaryOutputStream.write(org.apache.commons.imaging.formats.jpeg.iptc.IptcTypes.RECORD_VERSION.type);
            binaryOutputStream.write2Bytes(2);
            binaryOutputStream.write2Bytes(2);
            java.util.ArrayList<org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord> arrayList = new java.util.ArrayList(list);
            java.util.Collections.sort(arrayList, new java.util.Comparator() { // from class: org.apache.commons.imaging.formats.jpeg.iptc.IptcParser$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return org.apache.commons.imaging.formats.jpeg.iptc.IptcParser.lambda$writeIPTCBlock$0((org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord) obj, (org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord) obj2);
                }
            });
            for (org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord iptcRecord : arrayList) {
                if (iptcRecord.iptcType != org.apache.commons.imaging.formats.jpeg.iptc.IptcTypes.RECORD_VERSION) {
                    binaryOutputStream.write(28);
                    binaryOutputStream.write(2);
                    if (iptcRecord.iptcType.getType() < 0 || iptcRecord.iptcType.getType() > 255) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Invalid record type: ");
                        sb.append(iptcRecord.iptcType.getType());
                        throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
                    }
                    binaryOutputStream.write(iptcRecord.iptcType.getType());
                    byte[] bytes = iptcRecord.getValue().getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
                    if (!new java.lang.String(bytes, java.nio.charset.StandardCharsets.ISO_8859_1).equals(iptcRecord.getValue())) {
                        throw new org.apache.commons.imaging.ImageWriteException("Invalid record value, not ISO-8859-1");
                    }
                    binaryOutputStream.write2Bytes(bytes.length);
                    binaryOutputStream.write(bytes);
                }
            }
            binaryOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    binaryOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    static /* synthetic */ int lambda$writeIPTCBlock$0(org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord iptcRecord, org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord iptcRecord2) {
        return iptcRecord2.iptcType.getType() - iptcRecord.iptcType.getType();
    }
}
