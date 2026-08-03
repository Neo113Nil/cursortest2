package com.google.android.exoplayer2.extractor;

/* loaded from: classes3.dex */
public final class VorbisUtil {
    private static final java.lang.String TAG = "VorbisUtil";

    public static int iLog(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final class CommentHeader {
        public final java.lang.String[] comments;
        public final int length;
        public final java.lang.String vendor;

        public CommentHeader(java.lang.String str, java.lang.String[] strArr, int i) {
            this.vendor = str;
            this.comments = strArr;
            this.length = i;
        }
    }

    public static final class VorbisIdHeader {
        public final int bitrateMaximum;
        public final int bitrateMinimum;
        public final int bitrateNominal;
        public final int blockSize0;
        public final int blockSize1;
        public final int channels;
        public final byte[] data;
        public final boolean framingFlag;
        public final int sampleRate;
        public final int version;

        public VorbisIdHeader(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.version = i;
            this.channels = i2;
            this.sampleRate = i3;
            this.bitrateMaximum = i4;
            this.bitrateNominal = i5;
            this.bitrateMinimum = i6;
            this.blockSize0 = i7;
            this.blockSize1 = i8;
            this.framingFlag = z;
            this.data = bArr;
        }
    }

    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean z, int i, int i2, int i3) {
            this.blockFlag = z;
            this.windowType = i;
            this.transformType = i2;
            this.mapping = i3;
        }
    }

    public static com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader readVorbisIdentificationHeader(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws com.google.android.exoplayer2.ParserException {
        verifyVorbisHeaderCapturePattern(1, parsableByteArray, false);
        int readLittleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readLittleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        if (readLittleEndianInt <= 0) {
            readLittleEndianInt = -1;
        }
        int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
        if (readLittleEndianInt2 <= 0) {
            readLittleEndianInt2 = -1;
        }
        int readLittleEndianInt3 = parsableByteArray.readLittleEndianInt();
        if (readLittleEndianInt3 <= 0) {
            readLittleEndianInt3 = -1;
        }
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        return new com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader(readLittleEndianUnsignedIntToInt, readUnsignedByte, readLittleEndianUnsignedIntToInt2, readLittleEndianInt, readLittleEndianInt2, readLittleEndianInt3, (int) java.lang.Math.pow(2.0d, readUnsignedByte2 & 15), (int) java.lang.Math.pow(2.0d, (readUnsignedByte2 & 240) >> 4), (parsableByteArray.readUnsignedByte() & 1) > 0, java.util.Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit()));
    }

    public static com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader readVorbisCommentHeader(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws com.google.android.exoplayer2.ParserException {
        return readVorbisCommentHeader(parsableByteArray, true, true);
    }

    public static com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader readVorbisCommentHeader(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, boolean z, boolean z2) throws com.google.android.exoplayer2.ParserException {
        if (z) {
            verifyVorbisHeaderCapturePattern(3, parsableByteArray, false);
        }
        java.lang.String readString = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
        int length = readString.length();
        long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
        java.lang.String[] strArr = new java.lang.String[(int) readLittleEndianUnsignedInt];
        int i = length + 15;
        for (int i2 = 0; i2 < readLittleEndianUnsignedInt; i2++) {
            java.lang.String readString2 = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
            strArr[i2] = readString2;
            i = i + 4 + readString2.length();
        }
        if (z2 && (parsableByteArray.readUnsignedByte() & 1) == 0) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader(readString, strArr, i + 1);
    }

    public static com.google.android.exoplayer2.metadata.Metadata parseVorbisComments(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = list.get(i);
            java.lang.String[] splitAtFirst = com.google.android.exoplayer2.util.Util.splitAtFirst(str, com.ironsource.X3.j.b);
            if (splitAtFirst.length != 2) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Failed to parse Vorbis comment: " + str);
            } else if (splitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(com.google.android.exoplayer2.metadata.flac.PictureFrame.fromPictureBlock(new com.google.android.exoplayer2.util.ParsableByteArray(android.util.Base64.decode(splitAtFirst[1], 0))));
                } catch (java.lang.RuntimeException e) {
                    com.google.android.exoplayer2.util.Log.w(TAG, "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new com.google.android.exoplayer2.metadata.vorbis.VorbisComment(splitAtFirst[0], splitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.google.android.exoplayer2.metadata.Metadata(arrayList);
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, boolean z) throws com.google.android.exoplayer2.ParserException {
        if (parsableByteArray.bytesLeft() < 7) {
            if (z) {
                return false;
            }
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("too short header: " + parsableByteArray.bytesLeft(), null);
        }
        if (parsableByteArray.readUnsignedByte() != i) {
            if (z) {
                return false;
            }
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("expected header type " + java.lang.Integer.toHexString(i), null);
        }
        if (parsableByteArray.readUnsignedByte() == 118 && parsableByteArray.readUnsignedByte() == 111 && parsableByteArray.readUnsignedByte() == 114 && parsableByteArray.readUnsignedByte() == 98 && parsableByteArray.readUnsignedByte() == 105 && parsableByteArray.readUnsignedByte() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static com.google.android.exoplayer2.extractor.VorbisUtil.Mode[] readVorbisModes(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) throws com.google.android.exoplayer2.ParserException {
        verifyVorbisHeaderCapturePattern(5, parsableByteArray, false);
        int readUnsignedByte = parsableByteArray.readUnsignedByte() + 1;
        com.google.android.exoplayer2.extractor.VorbisBitArray vorbisBitArray = new com.google.android.exoplayer2.extractor.VorbisBitArray(parsableByteArray.getData());
        vorbisBitArray.skipBits(parsableByteArray.getPosition() * 8);
        for (int i2 = 0; i2 < readUnsignedByte; i2++) {
            readBook(vorbisBitArray);
        }
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i3 = 0; i3 < readBits; i3++) {
            if (vorbisBitArray.readBits(16) != 0) {
                throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        readFloors(vorbisBitArray);
        readResidues(vorbisBitArray);
        readMappings(i, vorbisBitArray);
        com.google.android.exoplayer2.extractor.VorbisUtil.Mode[] readModes = readModes(vorbisBitArray);
        if (vorbisBitArray.readBit()) {
            return readModes;
        }
        throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    private static com.google.android.exoplayer2.extractor.VorbisUtil.Mode[] readModes(com.google.android.exoplayer2.extractor.VorbisBitArray vorbisBitArray) {
        int readBits = vorbisBitArray.readBits(6) + 1;
        com.google.android.exoplayer2.extractor.VorbisUtil.Mode[] modeArr = new com.google.android.exoplayer2.extractor.VorbisUtil.Mode[readBits];
        for (int i = 0; i < readBits; i++) {
            modeArr[i] = new com.google.android.exoplayer2.extractor.VorbisUtil.Mode(vorbisBitArray.readBit(), vorbisBitArray.readBits(16), vorbisBitArray.readBits(16), vorbisBitArray.readBits(8));
        }
        return modeArr;
    }

    private static void readMappings(int i, com.google.android.exoplayer2.extractor.VorbisBitArray vorbisBitArray) throws com.google.android.exoplayer2.ParserException {
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i2 = 0; i2 < readBits; i2++) {
            int readBits2 = vorbisBitArray.readBits(16);
            if (readBits2 != 0) {
                com.google.android.exoplayer2.util.Log.e(TAG, "mapping type other than 0 not supported: " + readBits2);
            } else {
                int readBits3 = vorbisBitArray.readBit() ? vorbisBitArray.readBits(4) + 1 : 1;
                if (vorbisBitArray.readBit()) {
                    int readBits4 = vorbisBitArray.readBits(8) + 1;
                    for (int i3 = 0; i3 < readBits4; i3++) {
                        int i4 = i - 1;
                        vorbisBitArray.skipBits(iLog(i4));
                        vorbisBitArray.skipBits(iLog(i4));
                    }
                }
                if (vorbisBitArray.readBits(2) != 0) {
                    throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (readBits3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        vorbisBitArray.skipBits(4);
                    }
                }
                for (int i6 = 0; i6 < readBits3; i6++) {
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                }
            }
        }
    }

    private static void readResidues(com.google.android.exoplayer2.extractor.VorbisBitArray vorbisBitArray) throws com.google.android.exoplayer2.ParserException {
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i = 0; i < readBits; i++) {
            if (vorbisBitArray.readBits(16) > 2) {
                throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            int readBits2 = vorbisBitArray.readBits(6) + 1;
            vorbisBitArray.skipBits(8);
            int[] iArr = new int[readBits2];
            for (int i2 = 0; i2 < readBits2; i2++) {
                iArr[i2] = ((vorbisBitArray.readBit() ? vorbisBitArray.readBits(5) : 0) * 8) + vorbisBitArray.readBits(3);
            }
            for (int i3 = 0; i3 < readBits2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        vorbisBitArray.skipBits(8);
                    }
                }
            }
        }
    }

    private static void readFloors(com.google.android.exoplayer2.extractor.VorbisBitArray vorbisBitArray) throws com.google.android.exoplayer2.ParserException {
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i = 0; i < readBits; i++) {
            int readBits2 = vorbisBitArray.readBits(16);
            if (readBits2 == 0) {
                vorbisBitArray.skipBits(8);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(6);
                vorbisBitArray.skipBits(8);
                int readBits3 = vorbisBitArray.readBits(4) + 1;
                for (int i2 = 0; i2 < readBits3; i2++) {
                    vorbisBitArray.skipBits(8);
                }
            } else {
                if (readBits2 != 1) {
                    throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + readBits2, null);
                }
                int readBits4 = vorbisBitArray.readBits(5);
                int[] iArr = new int[readBits4];
                int i3 = -1;
                for (int i4 = 0; i4 < readBits4; i4++) {
                    int readBits5 = vorbisBitArray.readBits(4);
                    iArr[i4] = readBits5;
                    if (readBits5 > i3) {
                        i3 = readBits5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = vorbisBitArray.readBits(3) + 1;
                    int readBits6 = vorbisBitArray.readBits(2);
                    if (readBits6 > 0) {
                        vorbisBitArray.skipBits(8);
                    }
                    for (int i7 = 0; i7 < (1 << readBits6); i7++) {
                        vorbisBitArray.skipBits(8);
                    }
                }
                vorbisBitArray.skipBits(2);
                int readBits7 = vorbisBitArray.readBits(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < readBits4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        vorbisBitArray.skipBits(readBits7);
                        i9++;
                    }
                }
            }
        }
    }

    private static com.google.android.exoplayer2.extractor.VorbisUtil.CodeBook readBook(com.google.android.exoplayer2.extractor.VorbisBitArray vorbisBitArray) throws com.google.android.exoplayer2.ParserException {
        if (vorbisBitArray.readBits(24) != 5653314) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + vorbisBitArray.getPosition(), null);
        }
        int readBits = vorbisBitArray.readBits(16);
        int readBits2 = vorbisBitArray.readBits(24);
        long[] jArr = new long[readBits2];
        boolean readBit = vorbisBitArray.readBit();
        long j = 0;
        if (!readBit) {
            boolean readBit2 = vorbisBitArray.readBit();
            for (int i = 0; i < readBits2; i++) {
                if (readBit2) {
                    if (vorbisBitArray.readBit()) {
                        jArr[i] = vorbisBitArray.readBits(5) + 1;
                    } else {
                        jArr[i] = 0;
                    }
                } else {
                    jArr[i] = vorbisBitArray.readBits(5) + 1;
                }
            }
        } else {
            int readBits3 = vorbisBitArray.readBits(5) + 1;
            int i2 = 0;
            while (i2 < readBits2) {
                int readBits4 = vorbisBitArray.readBits(iLog(readBits2 - i2));
                for (int i3 = 0; i3 < readBits4 && i2 < readBits2; i3++) {
                    jArr[i2] = readBits3;
                    i2++;
                }
                readBits3++;
            }
        }
        int readBits5 = vorbisBitArray.readBits(4);
        if (readBits5 > 2) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + readBits5, null);
        }
        if (readBits5 == 1 || readBits5 == 2) {
            vorbisBitArray.skipBits(32);
            vorbisBitArray.skipBits(32);
            int readBits6 = vorbisBitArray.readBits(4) + 1;
            vorbisBitArray.skipBits(1);
            if (readBits5 != 1) {
                j = readBits2 * readBits;
            } else if (readBits != 0) {
                j = mapType1QuantValues(readBits2, readBits);
            }
            vorbisBitArray.skipBits((int) (j * readBits6));
        }
        return new com.google.android.exoplayer2.extractor.VorbisUtil.CodeBook(readBits, readBits2, jArr, readBits5, readBit);
    }

    private static long mapType1QuantValues(long j, long j2) {
        return (long) java.lang.Math.floor(java.lang.Math.pow(j, 1.0d / j2));
    }

    private VorbisUtil() {
    }

    private static final class CodeBook {
        public final int dimensions;
        public final int entries;
        public final boolean isOrdered;
        public final long[] lengthMap;
        public final int lookupType;

        public CodeBook(int i, int i2, long[] jArr, int i3, boolean z) {
            this.dimensions = i;
            this.entries = i2;
            this.lengthMap = jArr;
            this.lookupType = i3;
            this.isOrdered = z;
        }
    }
}
