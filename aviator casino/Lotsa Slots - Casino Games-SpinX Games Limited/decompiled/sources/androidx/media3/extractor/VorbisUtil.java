package androidx.media3.extractor;

/* loaded from: classes2.dex */
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

    public static int[] getVorbisToAndroidChannelLayoutMapping(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static com.google.common.collect.ImmutableList<byte[]> parseVorbisCsdFromEsdsInitializationData(byte[] bArr) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        parsableByteArray.skipBytes(1);
        int i = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            i += 255;
            parsableByteArray.skipBytes(1);
        }
        int readUnsignedByte = i + parsableByteArray.readUnsignedByte();
        int i2 = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            i2 += 255;
            parsableByteArray.skipBytes(1);
        }
        int readUnsignedByte2 = i2 + parsableByteArray.readUnsignedByte();
        byte[] bArr2 = new byte[readUnsignedByte];
        int position = parsableByteArray.getPosition();
        java.lang.System.arraycopy(bArr, position, bArr2, 0, readUnsignedByte);
        int i3 = position + readUnsignedByte + readUnsignedByte2;
        int length = bArr.length - i3;
        byte[] bArr3 = new byte[length];
        java.lang.System.arraycopy(bArr, i3, bArr3, 0, length);
        return com.google.common.collect.ImmutableList.of(bArr2, bArr3);
    }

    public static androidx.media3.extractor.VorbisUtil.VorbisIdHeader readVorbisIdentificationHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
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
        return new androidx.media3.extractor.VorbisUtil.VorbisIdHeader(readLittleEndianUnsignedIntToInt, readUnsignedByte, readLittleEndianUnsignedIntToInt2, readLittleEndianInt, readLittleEndianInt2, readLittleEndianInt3, (int) java.lang.Math.pow(2.0d, readUnsignedByte2 & 15), (int) java.lang.Math.pow(2.0d, (readUnsignedByte2 & 240) >> 4), (parsableByteArray.readUnsignedByte() & 1) > 0, java.util.Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit()));
    }

    public static androidx.media3.extractor.VorbisUtil.CommentHeader readVorbisCommentHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        return readVorbisCommentHeader(parsableByteArray, true, true);
    }

    public static androidx.media3.extractor.VorbisUtil.CommentHeader readVorbisCommentHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z, boolean z2) throws androidx.media3.common.ParserException {
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
            throw androidx.media3.common.ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new androidx.media3.extractor.VorbisUtil.CommentHeader(readString, strArr, i + 1);
    }

    public static androidx.media3.common.Metadata parseVorbisComments(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = list.get(i);
            java.lang.String[] splitAtFirst = androidx.media3.common.util.Util.splitAtFirst(str, com.ironsource.X3.j.b);
            if (splitAtFirst.length != 2) {
                androidx.media3.common.util.Log.w(TAG, "Failed to parse Vorbis comment: " + str);
            } else if (splitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(androidx.media3.extractor.metadata.flac.PictureFrame.fromPictureBlock(new androidx.media3.common.util.ParsableByteArray(android.util.Base64.decode(splitAtFirst[1], 0))));
                } catch (java.lang.RuntimeException e) {
                    androidx.media3.common.util.Log.w(TAG, "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new androidx.media3.extractor.metadata.vorbis.VorbisComment(splitAtFirst[0], splitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i, androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z) throws androidx.media3.common.ParserException {
        if (parsableByteArray.bytesLeft() < 7) {
            if (z) {
                return false;
            }
            throw androidx.media3.common.ParserException.createForMalformedContainer("too short header: " + parsableByteArray.bytesLeft(), null);
        }
        if (parsableByteArray.readUnsignedByte() != i) {
            if (z) {
                return false;
            }
            throw androidx.media3.common.ParserException.createForMalformedContainer("expected header type " + java.lang.Integer.toHexString(i), null);
        }
        if (parsableByteArray.readUnsignedByte() == 118 && parsableByteArray.readUnsignedByte() == 111 && parsableByteArray.readUnsignedByte() == 114 && parsableByteArray.readUnsignedByte() == 98 && parsableByteArray.readUnsignedByte() == 105 && parsableByteArray.readUnsignedByte() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static androidx.media3.extractor.VorbisUtil.Mode[] readVorbisModes(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) throws androidx.media3.common.ParserException {
        verifyVorbisHeaderCapturePattern(5, parsableByteArray, false);
        int readUnsignedByte = parsableByteArray.readUnsignedByte() + 1;
        androidx.media3.extractor.VorbisBitArray vorbisBitArray = new androidx.media3.extractor.VorbisBitArray(parsableByteArray.getData());
        vorbisBitArray.skipBits(parsableByteArray.getPosition() * 8);
        for (int i2 = 0; i2 < readUnsignedByte; i2++) {
            skipBook(vorbisBitArray);
        }
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i3 = 0; i3 < readBits; i3++) {
            if (vorbisBitArray.readBits(16) != 0) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        readFloors(vorbisBitArray);
        readResidues(vorbisBitArray);
        readMappings(i, vorbisBitArray);
        androidx.media3.extractor.VorbisUtil.Mode[] readModes = readModes(vorbisBitArray);
        if (vorbisBitArray.readBit()) {
            return readModes;
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    private static androidx.media3.extractor.VorbisUtil.Mode[] readModes(androidx.media3.extractor.VorbisBitArray vorbisBitArray) {
        int readBits = vorbisBitArray.readBits(6) + 1;
        androidx.media3.extractor.VorbisUtil.Mode[] modeArr = new androidx.media3.extractor.VorbisUtil.Mode[readBits];
        for (int i = 0; i < readBits; i++) {
            modeArr[i] = new androidx.media3.extractor.VorbisUtil.Mode(vorbisBitArray.readBit(), vorbisBitArray.readBits(16), vorbisBitArray.readBits(16), vorbisBitArray.readBits(8));
        }
        return modeArr;
    }

    private static void readMappings(int i, androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i2 = 0; i2 < readBits; i2++) {
            int readBits2 = vorbisBitArray.readBits(16);
            if (readBits2 != 0) {
                androidx.media3.common.util.Log.e(TAG, "mapping type other than 0 not supported: " + readBits2);
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
                    throw androidx.media3.common.ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
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

    private static void readResidues(androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i = 0; i < readBits; i++) {
            if (vorbisBitArray.readBits(16) > 2) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
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

    private static void readFloors(androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
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
                    throw androidx.media3.common.ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + readBits2, null);
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

    private static void skipBook(androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        long j;
        if (vorbisBitArray.readBits(24) != 5653314) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + vorbisBitArray.getPosition(), null);
        }
        int readBits = vorbisBitArray.readBits(16);
        int readBits2 = vorbisBitArray.readBits(24);
        int i = 0;
        if (!vorbisBitArray.readBit()) {
            boolean readBit = vorbisBitArray.readBit();
            while (i < readBits2) {
                if (readBit) {
                    if (vorbisBitArray.readBit()) {
                        vorbisBitArray.skipBits(5);
                    }
                } else {
                    vorbisBitArray.skipBits(5);
                }
                i++;
            }
        } else {
            vorbisBitArray.skipBits(5);
            while (i < readBits2) {
                i += vorbisBitArray.readBits(iLog(readBits2 - i));
            }
        }
        int readBits3 = vorbisBitArray.readBits(4);
        if (readBits3 > 2) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + readBits3, null);
        }
        if (readBits3 == 1 || readBits3 == 2) {
            vorbisBitArray.skipBits(32);
            vorbisBitArray.skipBits(32);
            int readBits4 = vorbisBitArray.readBits(4) + 1;
            vorbisBitArray.skipBits(1);
            if (readBits3 == 1) {
                j = readBits != 0 ? mapType1QuantValues(readBits2, readBits) : 0L;
            } else {
                j = readBits * readBits2;
            }
            vorbisBitArray.skipBits((int) (j * readBits4));
        }
    }

    private static long mapType1QuantValues(long j, long j2) {
        return (long) java.lang.Math.floor(java.lang.Math.pow(j, 1.0d / j2));
    }

    private VorbisUtil() {
    }
}
