package com.google.zxing.aztec.decoder;

/* loaded from: classes4.dex */
public final class Decoder {
    private com.google.zxing.aztec.AztecDetectorResult ddata;
    private static final java.lang.String[] UPPER_TABLE = {"CTRL_PS", io.ktor.sse.ServerSentEventKt.SPACE, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "F", com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G, "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "T", "U", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final java.lang.String[] LOWER_TABLE = {"CTRL_PS", io.ktor.sse.ServerSentEventKt.SPACE, "a", "b", "c", "d", "e", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", "k", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE, com.ironsource.B5.q, "o", "p", "q", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final java.lang.String[] MIXED_TABLE = {"CTRL_PS", io.ktor.sse.ServerSentEventKt.SPACE, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final java.lang.String[] PUNCT_TABLE = {"", "\r", io.ktor.sse.ServerSentEventKt.END_OF_LINE, ". ", ", ", ": ", "!", "\"", "#", "$", "%", com.ironsource.X3.j.c, "'", "(", ")", "*", org.slf4j.Marker.ANY_NON_NULL_MARKER, ",", "-", ".", com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, ":", ";", "<", com.ironsource.X3.j.b, ">", "?", com.ironsource.X3.j.d, com.ironsource.X3.j.e, "{", "}", "CTRL_UL"};
    private static final java.lang.String[] DIGIT_TABLE = {"CTRL_PS", io.ktor.sse.ServerSentEventKt.SPACE, "0", "1", "2", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", com.ironsource.Fc.e, "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    private enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    private static int totalBitsInLayer(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    public com.google.zxing.common.DecoderResult decode(com.google.zxing.aztec.AztecDetectorResult aztecDetectorResult) throws com.google.zxing.FormatException {
        this.ddata = aztecDetectorResult;
        boolean[] correctBits = correctBits(extractBits(aztecDetectorResult.getBits()));
        com.google.zxing.common.DecoderResult decoderResult = new com.google.zxing.common.DecoderResult(convertBoolArrayToByteArray(correctBits), getEncodedData(correctBits), null, null);
        decoderResult.setNumBits(correctBits.length);
        return decoderResult;
    }

    public static java.lang.String highLevelDecode(boolean[] zArr) {
        return getEncodedData(zArr);
    }

    private static java.lang.String getEncodedData(boolean[] zArr) {
        int length = zArr.length;
        com.google.zxing.aztec.decoder.Decoder.Table table = com.google.zxing.aztec.decoder.Decoder.Table.UPPER;
        com.google.zxing.aztec.decoder.Decoder.Table table2 = com.google.zxing.aztec.decoder.Decoder.Table.UPPER;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
        int i = 0;
        while (i < length) {
            if (table2 != com.google.zxing.aztec.decoder.Decoder.Table.BINARY) {
                int i2 = table2 == com.google.zxing.aztec.decoder.Decoder.Table.DIGIT ? 4 : 5;
                if (length - i < i2) {
                    break;
                }
                int readCode = readCode(zArr, i, i2);
                i += i2;
                java.lang.String character = getCharacter(table2, readCode);
                if (character.startsWith("CTRL_")) {
                    table = getTable(character.charAt(5));
                    if (character.charAt(6) != 'L') {
                        com.google.zxing.aztec.decoder.Decoder.Table table3 = table2;
                        table2 = table;
                        table = table3;
                    }
                } else {
                    sb.append(character);
                }
                table2 = table;
            } else {
                if (length - i < 5) {
                    break;
                }
                int readCode2 = readCode(zArr, i, 5);
                int i3 = i + 5;
                if (readCode2 == 0) {
                    if (length - i3 < 11) {
                        break;
                    }
                    readCode2 = readCode(zArr, i3, 11) + 31;
                    i3 = i + 16;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= readCode2) {
                        i = i3;
                        break;
                    }
                    if (length - i3 < 8) {
                        i = length;
                        break;
                    }
                    sb.append((char) readCode(zArr, i3, 8));
                    i3 += 8;
                    i4++;
                }
                table2 = table;
            }
        }
        return sb.toString();
    }

    private static com.google.zxing.aztec.decoder.Decoder.Table getTable(char c) {
        if (c == 'B') {
            return com.google.zxing.aztec.decoder.Decoder.Table.BINARY;
        }
        if (c == 'D') {
            return com.google.zxing.aztec.decoder.Decoder.Table.DIGIT;
        }
        if (c == 'P') {
            return com.google.zxing.aztec.decoder.Decoder.Table.PUNCT;
        }
        if (c == 'L') {
            return com.google.zxing.aztec.decoder.Decoder.Table.LOWER;
        }
        if (c == 'M') {
            return com.google.zxing.aztec.decoder.Decoder.Table.MIXED;
        }
        return com.google.zxing.aztec.decoder.Decoder.Table.UPPER;
    }

    /* renamed from: com.google.zxing.aztec.decoder.Decoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;

        static {
            int[] iArr = new int[com.google.zxing.aztec.decoder.Decoder.Table.values().length];
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = iArr;
            try {
                iArr[com.google.zxing.aztec.decoder.Decoder.Table.UPPER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[com.google.zxing.aztec.decoder.Decoder.Table.LOWER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[com.google.zxing.aztec.decoder.Decoder.Table.MIXED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[com.google.zxing.aztec.decoder.Decoder.Table.PUNCT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[com.google.zxing.aztec.decoder.Decoder.Table.DIGIT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private static java.lang.String getCharacter(com.google.zxing.aztec.decoder.Decoder.Table table, int i) {
        int i2 = com.google.zxing.aztec.decoder.Decoder.AnonymousClass1.$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[table.ordinal()];
        if (i2 == 1) {
            return UPPER_TABLE[i];
        }
        if (i2 == 2) {
            return LOWER_TABLE[i];
        }
        if (i2 == 3) {
            return MIXED_TABLE[i];
        }
        if (i2 == 4) {
            return PUNCT_TABLE[i];
        }
        if (i2 == 5) {
            return DIGIT_TABLE[i];
        }
        throw new java.lang.IllegalStateException("Bad table");
    }

    private boolean[] correctBits(boolean[] zArr) throws com.google.zxing.FormatException {
        int i;
        com.google.zxing.common.reedsolomon.GenericGF genericGF;
        if (this.ddata.getNbLayers() <= 2) {
            genericGF = com.google.zxing.common.reedsolomon.GenericGF.AZTEC_DATA_6;
            i = 6;
        } else {
            i = 8;
            if (this.ddata.getNbLayers() <= 8) {
                genericGF = com.google.zxing.common.reedsolomon.GenericGF.AZTEC_DATA_8;
            } else if (this.ddata.getNbLayers() <= 22) {
                genericGF = com.google.zxing.common.reedsolomon.GenericGF.AZTEC_DATA_10;
                i = 10;
            } else {
                genericGF = com.google.zxing.common.reedsolomon.GenericGF.AZTEC_DATA_12;
                i = 12;
            }
        }
        int nbDatablocks = this.ddata.getNbDatablocks();
        int length = zArr.length / i;
        if (length < nbDatablocks) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i;
        int[] iArr = new int[length];
        int i2 = 0;
        while (i2 < length) {
            iArr[i2] = readCode(zArr, length2, i);
            i2++;
            length2 += i;
        }
        try {
            new com.google.zxing.common.reedsolomon.ReedSolomonDecoder(genericGF).decode(iArr, length - nbDatablocks);
            int i3 = 1 << i;
            int i4 = i3 - 1;
            int i5 = 0;
            for (int i6 = 0; i6 < nbDatablocks; i6++) {
                int i7 = iArr[i6];
                if (i7 == 0 || i7 == i4) {
                    throw com.google.zxing.FormatException.getFormatInstance();
                }
                if (i7 == 1 || i7 == i3 - 2) {
                    i5++;
                }
            }
            boolean[] zArr2 = new boolean[(nbDatablocks * i) - i5];
            int i8 = 0;
            for (int i9 = 0; i9 < nbDatablocks; i9++) {
                int i10 = iArr[i9];
                if (i10 == 1 || i10 == i3 - 2) {
                    java.util.Arrays.fill(zArr2, i8, (i8 + i) - 1, i10 > 1);
                    i8 += i - 1;
                } else {
                    int i11 = i - 1;
                    while (i11 >= 0) {
                        int i12 = i8 + 1;
                        zArr2[i8] = ((1 << i11) & i10) != 0;
                        i11--;
                        i8 = i12;
                    }
                }
            }
            return zArr2;
        } catch (com.google.zxing.common.reedsolomon.ReedSolomonException e) {
            throw com.google.zxing.FormatException.getFormatInstance(e);
        }
    }

    private boolean[] extractBits(com.google.zxing.common.BitMatrix bitMatrix) {
        boolean isCompact = this.ddata.isCompact();
        int nbLayers = this.ddata.getNbLayers();
        int i = (isCompact ? 11 : 14) + (nbLayers << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[totalBitsInLayer(nbLayers, isCompact)];
        int i2 = 2;
        if (isCompact) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                iArr[(i4 - i6) - 1] = (i5 - r12) - 1;
                iArr[i4 + i6] = (i6 / 15) + i6 + i5 + 1;
            }
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < nbLayers) {
            int i9 = ((nbLayers - i7) << i2) + (isCompact ? 9 : 12);
            int i10 = i7 << 1;
            int i11 = (i - 1) - i10;
            int i12 = 0;
            while (i12 < i9) {
                int i13 = i12 << 1;
                int i14 = 0;
                while (i14 < i2) {
                    int i15 = i10 + i14;
                    int i16 = i10 + i12;
                    zArr[i8 + i13 + i14] = bitMatrix.get(iArr[i15], iArr[i16]);
                    int i17 = iArr[i16];
                    int i18 = i11 - i14;
                    zArr[(i9 * 2) + i8 + i13 + i14] = bitMatrix.get(i17, iArr[i18]);
                    int i19 = i11 - i12;
                    zArr[(i9 * 4) + i8 + i13 + i14] = bitMatrix.get(iArr[i18], iArr[i19]);
                    zArr[(i9 * 6) + i8 + i13 + i14] = bitMatrix.get(iArr[i19], iArr[i15]);
                    i14++;
                    nbLayers = nbLayers;
                    isCompact = isCompact;
                    i2 = 2;
                }
                i12++;
                i2 = 2;
            }
            i8 += i9 << 3;
            i7++;
            i2 = 2;
        }
        return zArr;
    }

    private static int readCode(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private static byte readByte(boolean[] zArr, int i) {
        int readCode;
        int length = zArr.length - i;
        if (length >= 8) {
            readCode = readCode(zArr, i, 8);
        } else {
            readCode = readCode(zArr, i, length) << (8 - length);
        }
        return (byte) readCode;
    }

    static byte[] convertBoolArrayToByteArray(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = readByte(zArr, i << 3);
        }
        return bArr;
    }
}
