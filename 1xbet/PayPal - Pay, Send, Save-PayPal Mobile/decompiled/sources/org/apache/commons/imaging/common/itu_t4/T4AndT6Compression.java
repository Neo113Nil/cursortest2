package org.apache.commons.imaging.common.itu_t4;

/* loaded from: classes17.dex */
public final class T4AndT6Compression {
    public static final int BLACK = 1;
    public static final int WHITE = 0;
    private static final org.apache.commons.imaging.common.itu_t4.HuffmanTree<java.lang.Integer> WHITE_RUN_LENGTHS = new org.apache.commons.imaging.common.itu_t4.HuffmanTree<>();
    private static final org.apache.commons.imaging.common.itu_t4.HuffmanTree<java.lang.Integer> BLACK_RUN_LENGTHS = new org.apache.commons.imaging.common.itu_t4.HuffmanTree<>();
    private static final org.apache.commons.imaging.common.itu_t4.HuffmanTree<org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry> CONTROL_CODES = new org.apache.commons.imaging.common.itu_t4.HuffmanTree<>();

    static {
        try {
            for (org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry entry : org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.WHITE_TERMINATING_CODES) {
                WHITE_RUN_LENGTHS.insert(entry.bitString, entry.value);
            }
            for (org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry entry2 : org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.WHITE_MAKE_UP_CODES) {
                WHITE_RUN_LENGTHS.insert(entry2.bitString, entry2.value);
            }
            for (org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry entry3 : org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.BLACK_TERMINATING_CODES) {
                BLACK_RUN_LENGTHS.insert(entry3.bitString, entry3.value);
            }
            for (org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry entry4 : org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.BLACK_MAKE_UP_CODES) {
                BLACK_RUN_LENGTHS.insert(entry4.bitString, entry4.value);
            }
            for (org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry entry5 : org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.ADDITIONAL_MAKE_UP_CODES) {
                WHITE_RUN_LENGTHS.insert(entry5.bitString, entry5.value);
                BLACK_RUN_LENGTHS.insert(entry5.bitString, entry5.value);
            }
            org.apache.commons.imaging.common.itu_t4.HuffmanTree<org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry> huffmanTree = CONTROL_CODES;
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL13.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL13);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL14.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL14);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL15.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL15);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL16.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL16);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL17.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL17);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL18.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL18);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL19.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL19);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.P.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.P);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.H.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.H);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.V0.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.V0);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL1.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL1);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL2.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL2);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL3.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL3);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR1.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR1);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR2.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR2);
            huffmanTree.insert(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR3.bitString, org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR3);
        } catch (org.apache.commons.imaging.common.itu_t4.HuffmanTreeException e) {
            throw new java.lang.Error(e);
        }
    }

    private T4AndT6Compression() {
    }

    private static void compress1DLine(org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible, org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream, int[] iArr, int i) throws org.apache.commons.imaging.ImageWriteException {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            try {
                int readBits = bitInputStreamFlexible.readBits(1);
                if (iArr != null) {
                    iArr[i4] = readBits;
                }
                if (i3 == readBits) {
                    i2++;
                } else {
                    writeRunLength(bitArrayOutputStream, i2, i3);
                    i2 = 1;
                    i3 = readBits;
                }
            } catch (java.io.IOException e) {
                throw new org.apache.commons.imaging.ImageWriteException("Error reading image to compress", (java.lang.Throwable) e);
            }
        }
        writeRunLength(bitArrayOutputStream, i2, i3);
    }

    public static byte[] compressModifiedHuffman(byte[] bArr, int i, int i2) throws org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible = new org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible(new java.io.ByteArrayInputStream(bArr));
        org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream = new org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream();
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                compress1DLine(bitInputStreamFlexible, bitArrayOutputStream, null, i);
                bitInputStreamFlexible.flushCache();
                bitArrayOutputStream.flush();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        bitArrayOutputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        byte[] byteArray = bitArrayOutputStream.toByteArray();
        bitArrayOutputStream.close();
        return byteArray;
    }

    public static byte[] decompressModifiedHuffman(byte[] bArr, int i, int i2) throws org.apache.commons.imaging.ImageReadException {
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            try {
                org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible = new org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible(byteArrayInputStream);
                try {
                    org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream = new org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream();
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i) {
                            try {
                                int readTotalRunLength = readTotalRunLength(bitInputStreamFlexible, i5);
                                for (int i6 = 0; i6 < readTotalRunLength; i6++) {
                                    bitArrayOutputStream.writeBit(i5);
                                }
                                i5 = 1 - i5;
                                i4 += readTotalRunLength;
                            } finally {
                            }
                        }
                        if (i4 == i) {
                            bitInputStreamFlexible.flushCache();
                            bitArrayOutputStream.flush();
                        } else if (i4 > i) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("Unrecoverable row length error in image row ");
                            sb.append(i3);
                            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
                        }
                    }
                    byte[] byteArray = bitArrayOutputStream.toByteArray();
                    bitArrayOutputStream.close();
                    bitInputStreamFlexible.close();
                    byteArrayInputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (java.io.IOException e) {
            throw new org.apache.commons.imaging.ImageReadException("Error reading image to decompress", e);
        }
    }

    public static byte[] compressT4_1D(byte[] bArr, int i, int i2, boolean z) throws org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible = new org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible(new java.io.ByteArrayInputStream(bArr));
        org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream = new org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream();
        try {
            if (z) {
                org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL16.writeBits(bitArrayOutputStream);
            } else {
                org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL.writeBits(bitArrayOutputStream);
            }
            for (int i3 = 0; i3 < i2; i3++) {
                compress1DLine(bitInputStreamFlexible, bitArrayOutputStream, null, i);
                if (z) {
                    int bitsAvailableInCurrentByte = bitArrayOutputStream.getBitsAvailableInCurrentByte();
                    if (bitsAvailableInCurrentByte < 4) {
                        bitArrayOutputStream.flush();
                        bitsAvailableInCurrentByte = 8;
                    }
                    while (bitsAvailableInCurrentByte > 4) {
                        bitArrayOutputStream.writeBit(0);
                        bitsAvailableInCurrentByte--;
                    }
                }
                org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL.writeBits(bitArrayOutputStream);
                bitInputStreamFlexible.flushCache();
            }
            byte[] byteArray = bitArrayOutputStream.toByteArray();
            bitArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    bitArrayOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static byte[] decompressT4_1D(byte[] bArr, int i, int i2, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible = new org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible(new java.io.ByteArrayInputStream(bArr));
        org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream = new org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream();
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                try {
                    if (!isEOL(CONTROL_CODES.decode(bitInputStreamFlexible), z)) {
                        throw new org.apache.commons.imaging.ImageReadException("Expected EOL not found");
                    }
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < i) {
                        int readTotalRunLength = readTotalRunLength(bitInputStreamFlexible, i5);
                        for (int i6 = 0; i6 < readTotalRunLength; i6++) {
                            bitArrayOutputStream.writeBit(i5);
                        }
                        i5 = 1 - i5;
                        i4 += readTotalRunLength;
                    }
                    if (i4 == i) {
                        bitArrayOutputStream.flush();
                    } else if (i4 > i) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Unrecoverable row length error in image row ");
                        sb.append(i3);
                        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        try {
                            bitArrayOutputStream.close();
                        } catch (java.lang.Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (org.apache.commons.imaging.common.itu_t4.HuffmanTreeException e) {
                throw new org.apache.commons.imaging.ImageReadException("Decompression error", e);
            }
        }
        byte[] byteArray = bitArrayOutputStream.toByteArray();
        bitArrayOutputStream.close();
        return byteArray;
    }

    private static int compressT(int i, int i2, int i3, org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream, int i4, int[] iArr) {
        org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry entry;
        int i5 = i2 - i3;
        if (-3 <= i5 && i5 <= 3) {
            if (i5 == -3) {
                entry = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL3;
            } else if (i5 == -2) {
                entry = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL2;
            } else if (i5 == -1) {
                entry = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL1;
            } else if (i5 == 0) {
                entry = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.V0;
            } else if (i5 == 1) {
                entry = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR1;
            } else if (i5 == 2) {
                entry = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR2;
            } else {
                entry = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR3;
            }
            entry.writeBits(bitArrayOutputStream);
            return i2;
        }
        int i6 = 1 - i4;
        int nextChangingElement = nextChangingElement(iArr, i6, i2 + 1);
        org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.H.writeBits(bitArrayOutputStream);
        writeRunLength(bitArrayOutputStream, i2 - i, i4);
        writeRunLength(bitArrayOutputStream, nextChangingElement - i2, i6);
        return nextChangingElement;
    }

    public static byte[] compressT4_2D(byte[] bArr, int i, int i2, boolean z, int i3) throws org.apache.commons.imaging.ImageWriteException {
        int nextChangingElement;
        org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible = new org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible(new java.io.ByteArrayInputStream(bArr));
        org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream = new org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream();
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        if (z) {
            org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL16.writeBits(bitArrayOutputStream);
        } else {
            org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL.writeBits(bitArrayOutputStream);
        }
        int i4 = 0;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            if (i6 > 0) {
                bitArrayOutputStream.writeBit(i4);
                for (int i7 = i4; i7 < i; i7++) {
                    try {
                        iArr4[i7] = bitInputStreamFlexible.readBits(1);
                    } catch (java.io.IOException e) {
                        throw new org.apache.commons.imaging.ImageWriteException("Error reading image to compress", (java.lang.Throwable) e);
                    }
                }
                int nextChangingElement2 = nextChangingElement(iArr4, i4, i4);
                int nextChangingElement3 = nextChangingElement(iArr3, i4, i4);
                int nextChangingElement4 = nextChangingElement(iArr3, 1, nextChangingElement3 + 1);
                int i8 = nextChangingElement2;
                int i9 = nextChangingElement3;
                int i10 = i4;
                int i11 = i10;
                while (i10 < i) {
                    if (nextChangingElement4 < i8) {
                        org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.P.writeBits(bitArrayOutputStream);
                        i10 = nextChangingElement4;
                    } else {
                        int i12 = i8;
                        i10 = compressT(i10, i8, i9, bitArrayOutputStream, i11, iArr4);
                        if (i10 == i12) {
                            i11 = 1 - i11;
                        }
                    }
                    int i13 = i11;
                    int changingElementAt = changingElementAt(iArr3, i10);
                    int i14 = i10 + 1;
                    i8 = nextChangingElement(iArr4, i13, i14);
                    if (i13 == changingElementAt) {
                        nextChangingElement = nextChangingElement(iArr3, changingElementAt, i14);
                    } else {
                        nextChangingElement = nextChangingElement(iArr3, 1 - changingElementAt, nextChangingElement(iArr3, changingElementAt, i14) + 1);
                    }
                    i9 = nextChangingElement;
                    nextChangingElement4 = nextChangingElement(iArr3, 1 - i13, i9 + 1);
                    i11 = i13;
                }
                int[] iArr5 = iArr4;
                iArr4 = iArr3;
                iArr3 = iArr5;
            } else {
                bitArrayOutputStream.writeBit(1);
                compress1DLine(bitInputStreamFlexible, bitArrayOutputStream, iArr3, i);
            }
            if (z) {
                int bitsAvailableInCurrentByte = bitArrayOutputStream.getBitsAvailableInCurrentByte();
                if (bitsAvailableInCurrentByte < 4) {
                    bitArrayOutputStream.flush();
                    bitsAvailableInCurrentByte = 8;
                }
                while (bitsAvailableInCurrentByte > 4) {
                    bitArrayOutputStream.writeBit(0);
                    bitsAvailableInCurrentByte--;
                }
            }
            org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL.writeBits(bitArrayOutputStream);
            i6++;
            if (i6 == i3) {
                i6 = 0;
            }
            bitInputStreamFlexible.flushCache();
            i5++;
            i4 = 0;
        }
        return bitArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0099 A[Catch: HuffmanTreeException -> 0x0114, IOException -> 0x011b, all -> 0x012a, TryCatch #5 {IOException -> 0x011b, HuffmanTreeException -> 0x0114, blocks: (B:7:0x0017, B:9:0x0025, B:11:0x002c, B:13:0x003b, B:15:0x0047, B:17:0x0093, B:19:0x0099, B:21:0x00ad, B:22:0x00a0, B:24:0x004b, B:26:0x004f, B:27:0x0063, B:30:0x008c, B:31:0x0069, B:34:0x006f, B:37:0x0075, B:40:0x007b, B:43:0x0081, B:46:0x0087, B:50:0x00b7, B:51:0x00cf, B:65:0x00d4, B:67:0x00db, B:73:0x010c, B:74:0x0113), top: B:6:0x0017, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[Catch: HuffmanTreeException -> 0x0114, IOException -> 0x011b, all -> 0x012a, TryCatch #5 {IOException -> 0x011b, HuffmanTreeException -> 0x0114, blocks: (B:7:0x0017, B:9:0x0025, B:11:0x002c, B:13:0x003b, B:15:0x0047, B:17:0x0093, B:19:0x0099, B:21:0x00ad, B:22:0x00a0, B:24:0x004b, B:26:0x004f, B:27:0x0063, B:30:0x008c, B:31:0x0069, B:34:0x006f, B:37:0x0075, B:40:0x007b, B:43:0x0081, B:46:0x0087, B:50:0x00b7, B:51:0x00cf, B:65:0x00d4, B:67:0x00db, B:73:0x010c, B:74:0x0113), top: B:6:0x0017, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] decompressT4_2D(byte[] bArr, int i, int i2, boolean z) throws org.apache.commons.imaging.ImageReadException {
        int i3;
        int i4;
        int changingElementAt;
        org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible = new org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible(new java.io.ByteArrayInputStream(bArr));
        org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream = new org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream();
        try {
            int[] iArr = new int[i];
            for (int i5 = 0; i5 < i2; i5++) {
                try {
                    if (!isEOL(CONTROL_CODES.decode(bitInputStreamFlexible), z)) {
                        throw new org.apache.commons.imaging.ImageReadException("Expected EOL not found");
                    }
                    if (bitInputStreamFlexible.readBits(1) == 0) {
                        int nextChangingElement = nextChangingElement(iArr, 0, 0);
                        int nextChangingElement2 = nextChangingElement(iArr, 1, nextChangingElement + 1);
                        i3 = 0;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < i) {
                            org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry decode = CONTROL_CODES.decode(bitInputStreamFlexible);
                            if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.P) {
                                fillRange(bitArrayOutputStream, iArr, i6, nextChangingElement2, i7);
                            } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.H) {
                                int readTotalRunLength = readTotalRunLength(bitInputStreamFlexible, i7) + i6;
                                fillRange(bitArrayOutputStream, iArr, i6, readTotalRunLength, i7);
                                int i8 = 1 - i7;
                                int readTotalRunLength2 = readTotalRunLength(bitInputStreamFlexible, i8) + readTotalRunLength;
                                fillRange(bitArrayOutputStream, iArr, readTotalRunLength, readTotalRunLength2, i8);
                                i6 = readTotalRunLength2;
                                changingElementAt = changingElementAt(iArr, i6);
                                if (i7 != changingElementAt) {
                                    nextChangingElement = nextChangingElement(iArr, changingElementAt, i6 + 1);
                                } else {
                                    nextChangingElement = nextChangingElement(iArr, 1 - changingElementAt, nextChangingElement(iArr, changingElementAt, i6 + 1) + 1);
                                }
                                nextChangingElement2 = nextChangingElement(iArr, 1 - i7, nextChangingElement + 1);
                                i3 = i6;
                            } else {
                                if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.V0) {
                                    i4 = 0;
                                } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL1) {
                                    i4 = -1;
                                } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL2) {
                                    i4 = -2;
                                } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL3) {
                                    i4 = -3;
                                } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR1) {
                                    i4 = 1;
                                } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR2) {
                                    i4 = 2;
                                } else {
                                    if (decode != org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR3) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append("Invalid/unknown T.4 control code ");
                                        sb.append(decode.bitString);
                                        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
                                    }
                                    i4 = 3;
                                }
                                nextChangingElement2 = i4 + nextChangingElement;
                                fillRange(bitArrayOutputStream, iArr, i6, nextChangingElement2, i7);
                                i7 = 1 - i7;
                            }
                            i6 = nextChangingElement2;
                            changingElementAt = changingElementAt(iArr, i6);
                            if (i7 != changingElementAt) {
                            }
                            nextChangingElement2 = nextChangingElement(iArr, 1 - i7, nextChangingElement + 1);
                            i3 = i6;
                        }
                    } else {
                        int i9 = 0;
                        i3 = 0;
                        while (i3 < i) {
                            int readTotalRunLength3 = readTotalRunLength(bitInputStreamFlexible, i9);
                            for (int i10 = 0; i10 < readTotalRunLength3; i10++) {
                                bitArrayOutputStream.writeBit(i9);
                                iArr[i3 + i10] = i9;
                            }
                            i9 = 1 - i9;
                            i3 += readTotalRunLength3;
                        }
                    }
                    if (i3 == i) {
                        bitArrayOutputStream.flush();
                    } else if (i3 > i) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("Unrecoverable row length error in image row ");
                        sb2.append(i5);
                        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
                    }
                } catch (java.io.IOException e) {
                    throw new org.apache.commons.imaging.ImageReadException("Decompression error", e);
                } catch (org.apache.commons.imaging.common.itu_t4.HuffmanTreeException e2) {
                    throw new org.apache.commons.imaging.ImageReadException("Decompression error", e2);
                }
            }
            byte[] byteArray = bitArrayOutputStream.toByteArray();
            bitArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    bitArrayOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static byte[] compressT6(byte[] bArr, int i, int i2) throws org.apache.commons.imaging.ImageWriteException {
        int nextChangingElement;
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            try {
                org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible = new org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible(byteArrayInputStream);
                try {
                    org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream = new org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream();
                    int i3 = 0;
                    int[] iArr = new int[i];
                    int[] iArr2 = new int[i];
                    int i4 = 0;
                    while (i4 < i2) {
                        for (int i5 = i3; i5 < i; i5++) {
                            try {
                                iArr2[i5] = bitInputStreamFlexible.readBits(1);
                            } catch (java.io.IOException e) {
                                throw new org.apache.commons.imaging.ImageWriteException("Error reading image to compress", (java.lang.Throwable) e);
                            }
                        }
                        int nextChangingElement2 = nextChangingElement(iArr2, i3, i3);
                        int nextChangingElement3 = nextChangingElement(iArr, i3, i3);
                        int nextChangingElement4 = nextChangingElement(iArr, 1, nextChangingElement3 + 1);
                        int i6 = nextChangingElement2;
                        int i7 = nextChangingElement3;
                        int i8 = i3;
                        int i9 = i8;
                        while (i8 < i) {
                            if (nextChangingElement4 < i6) {
                                org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.P.writeBits(bitArrayOutputStream);
                                i8 = nextChangingElement4;
                            } else {
                                int i10 = i6;
                                i8 = compressT(i8, i6, i7, bitArrayOutputStream, i9, iArr2);
                                if (i8 == i10) {
                                    i9 = 1 - i9;
                                }
                            }
                            int i11 = i9;
                            int changingElementAt = changingElementAt(iArr, i8);
                            int i12 = i8 + 1;
                            i6 = nextChangingElement(iArr2, i11, i12);
                            if (i11 == changingElementAt) {
                                nextChangingElement = nextChangingElement(iArr, changingElementAt, i12);
                            } else {
                                nextChangingElement = nextChangingElement(iArr, 1 - changingElementAt, nextChangingElement(iArr, changingElementAt, i12) + 1);
                            }
                            i7 = nextChangingElement;
                            nextChangingElement4 = nextChangingElement(iArr, 1 - i11, i7 + 1);
                            i9 = i11;
                        }
                        bitInputStreamFlexible.flushCache();
                        i4++;
                        i3 = 0;
                        int[] iArr3 = iArr2;
                        iArr2 = iArr;
                        iArr = iArr3;
                    }
                    org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL.writeBits(bitArrayOutputStream);
                    org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL.writeBits(bitArrayOutputStream);
                    byte[] byteArray = bitArrayOutputStream.toByteArray();
                    bitInputStreamFlexible.close();
                    byteArrayInputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (java.io.IOException e2) {
            throw new org.apache.commons.imaging.ImageWriteException("I/O error", (java.lang.Throwable) e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083 A[Catch: HuffmanTreeException -> 0x00d6, TryCatch #0 {HuffmanTreeException -> 0x00d6, blocks: (B:4:0x0015, B:6:0x0025, B:8:0x0031, B:10:0x007d, B:12:0x0083, B:14:0x0097, B:15:0x008a, B:17:0x0035, B:19:0x0039, B:20:0x004d, B:23:0x0076, B:24:0x0053, B:27:0x0059, B:30:0x005f, B:33:0x0065, B:36:0x006b, B:39:0x0071, B:43:0x00a1, B:44:0x00b9), top: B:3:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[Catch: HuffmanTreeException -> 0x00d6, TryCatch #0 {HuffmanTreeException -> 0x00d6, blocks: (B:4:0x0015, B:6:0x0025, B:8:0x0031, B:10:0x007d, B:12:0x0083, B:14:0x0097, B:15:0x008a, B:17:0x0035, B:19:0x0039, B:20:0x004d, B:23:0x0076, B:24:0x0053, B:27:0x0059, B:30:0x005f, B:33:0x0065, B:36:0x006b, B:39:0x0071, B:43:0x00a1, B:44:0x00b9), top: B:3:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] decompressT6(byte[] bArr, int i, int i2) throws org.apache.commons.imaging.ImageReadException {
        int i3;
        int changingElementAt;
        org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible = new org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible(new java.io.ByteArrayInputStream(bArr));
        org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream = new org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream();
        int[] iArr = new int[i];
        for (int i4 = 0; i4 < i2; i4++) {
            try {
                int nextChangingElement = nextChangingElement(iArr, 0, 0);
                int nextChangingElement2 = nextChangingElement(iArr, 1, nextChangingElement + 1);
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i5 < i) {
                    org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry decode = CONTROL_CODES.decode(bitInputStreamFlexible);
                    if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.P) {
                        fillRange(bitArrayOutputStream, iArr, i5, nextChangingElement2, i7);
                    } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.H) {
                        int readTotalRunLength = readTotalRunLength(bitInputStreamFlexible, i7) + i5;
                        fillRange(bitArrayOutputStream, iArr, i5, readTotalRunLength, i7);
                        int i8 = 1 - i7;
                        int readTotalRunLength2 = readTotalRunLength(bitInputStreamFlexible, i8) + readTotalRunLength;
                        fillRange(bitArrayOutputStream, iArr, readTotalRunLength, readTotalRunLength2, i8);
                        i6 = readTotalRunLength2;
                        changingElementAt = changingElementAt(iArr, i6);
                        if (i7 != changingElementAt) {
                            nextChangingElement = nextChangingElement(iArr, changingElementAt, i6 + 1);
                        } else {
                            nextChangingElement = nextChangingElement(iArr, 1 - changingElementAt, nextChangingElement(iArr, changingElementAt, i6 + 1) + 1);
                        }
                        nextChangingElement2 = nextChangingElement(iArr, 1 - i7, nextChangingElement + 1);
                        i5 = i6;
                    } else {
                        if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.V0) {
                            i3 = 0;
                        } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL1) {
                            i3 = -1;
                        } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL2) {
                            i3 = -2;
                        } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VL3) {
                            i3 = -3;
                        } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR1) {
                            i3 = 1;
                        } else if (decode == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR2) {
                            i3 = 2;
                        } else {
                            if (decode != org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.VR3) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("Invalid/unknown T.6 control code ");
                                sb.append(decode.bitString);
                                throw new org.apache.commons.imaging.ImageReadException(sb.toString());
                            }
                            i3 = 3;
                        }
                        nextChangingElement2 = i3 + nextChangingElement;
                        fillRange(bitArrayOutputStream, iArr, i5, nextChangingElement2, i7);
                        i7 = 1 - i7;
                    }
                    i6 = nextChangingElement2;
                    changingElementAt = changingElementAt(iArr, i6);
                    if (i7 != changingElementAt) {
                    }
                    nextChangingElement2 = nextChangingElement(iArr, 1 - i7, nextChangingElement + 1);
                    i5 = i6;
                }
                if (i6 == i) {
                    bitArrayOutputStream.flush();
                } else if (i6 > i) {
                    throw new org.apache.commons.imaging.ImageReadException("Unrecoverable row length error in image row ".concat(java.lang.String.valueOf(i4)));
                }
            } catch (org.apache.commons.imaging.common.itu_t4.HuffmanTreeException e) {
                throw new org.apache.commons.imaging.ImageReadException("Decompression error", e);
            }
        }
        return bitArrayOutputStream.toByteArray();
    }

    private static boolean isEOL(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry entry, boolean z) {
        if (entry == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL) {
            return true;
        }
        if (z) {
            return entry == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL13 || entry == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL14 || entry == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL15 || entry == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL16 || entry == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL17 || entry == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL18 || entry == org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.EOL19;
        }
        return false;
    }

    private static void writeRunLength(org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream, int i, int i2) {
        org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry[] entryArr;
        org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry[] entryArr2;
        if (i2 == 0) {
            entryArr = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.WHITE_MAKE_UP_CODES;
            entryArr2 = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.WHITE_TERMINATING_CODES;
        } else {
            entryArr = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.BLACK_MAKE_UP_CODES;
            entryArr2 = org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.BLACK_TERMINATING_CODES;
        }
        while (i >= 1792) {
            org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry lowerBound = lowerBound(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.ADDITIONAL_MAKE_UP_CODES, i);
            lowerBound.writeBits(bitArrayOutputStream);
            i -= lowerBound.value.intValue();
        }
        while (i >= 64) {
            org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry lowerBound2 = lowerBound(entryArr, i);
            lowerBound2.writeBits(bitArrayOutputStream);
            i -= lowerBound2.value.intValue();
        }
        entryArr2[i].writeBits(bitArrayOutputStream);
    }

    private static org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry lowerBound(org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry[] entryArr, int i) {
        int i2;
        int length = entryArr.length - 1;
        int i3 = 0;
        do {
            int i4 = (i3 + length) >>> 1;
            if (entryArr[i4].value.intValue() <= i && ((i2 = i4 + 1) >= entryArr.length || i < entryArr[i2].value.intValue())) {
                return entryArr[i4];
            }
            if (entryArr[i4].value.intValue() > i) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        } while (i3 < length);
        return entryArr[i3];
    }

    private static int readTotalRunLength(org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible, int i) throws org.apache.commons.imaging.ImageReadException {
        java.lang.Integer decode;
        int i2 = 0;
        do {
            if (i == 0) {
                try {
                    decode = WHITE_RUN_LENGTHS.decode(bitInputStreamFlexible);
                } catch (org.apache.commons.imaging.common.itu_t4.HuffmanTreeException e) {
                    throw new org.apache.commons.imaging.ImageReadException("Decompression error", e);
                }
            } else {
                decode = BLACK_RUN_LENGTHS.decode(bitInputStreamFlexible);
            }
            i2 += decode.intValue();
        } while (decode.intValue() > 63);
        return i2;
    }

    private static int changingElementAt(int[] iArr, int i) {
        if (i < 0 || i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    private static int nextChangingElement(int[] iArr, int i, int i2) {
        while (i2 < iArr.length && iArr[i2] == i) {
            i2++;
        }
        return java.lang.Math.min(i2, iArr.length);
    }

    private static void fillRange(org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream bitArrayOutputStream, int[] iArr, int i, int i2, int i3) {
        while (i < i2) {
            iArr[i] = i3;
            bitArrayOutputStream.writeBit(i3);
            i++;
        }
    }
}
