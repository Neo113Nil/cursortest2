package com.google.zxing.aztec.decoder;

/* loaded from: classes9.dex */
public final class Decoder {
    private com.google.zxing.aztec.AztecDetectorResult ddata;
    private static final java.lang.String[] UPPER_TABLE = {"CTRL_PS", " ", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "D", "E", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "G", "H", com.visa.cbp.getEncExpo.warmup, "J", "K", "L", "M", "N", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "P", com.visa.cbp.getEncExpo.updateVisuals, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "S", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "V", "W", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN, "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final java.lang.String[] LOWER_TABLE = {"CTRL_PS", " ", "a", util.h.xy.cb.b.f1091, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", lib.android.paypal.com.magnessdk.g.n2, "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final java.lang.String[] MIXED_TABLE = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER, "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final java.lang.String[] PUNCT_TABLE = {"FLG(n)", "\r", io.ktor.sse.ServerSentEventKt.END_OF_LINE, ". ", ", ", ": ", "!", "\"", "#", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, io.ktor.sse.ServerSentEventKt.COLON, ";", "<", "=", ">", com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, "[", "]", "{", "}", "CTRL_UL"};
    private static final java.lang.String[] DIGIT_TABLE = {"CTRL_PS", " ", "0", "1", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    private static final java.nio.charset.Charset DEFAULT_ENCODING = java.nio.charset.StandardCharsets.ISO_8859_1;

    enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    private static int totalBitsInLayer(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    public final com.google.zxing.common.DecoderResult decode(com.google.zxing.aztec.AztecDetectorResult aztecDetectorResult) throws com.google.zxing.FormatException {
        this.ddata = aztecDetectorResult;
        com.google.zxing.aztec.decoder.Decoder.CorrectedBitsResult correctBits = correctBits(extractBits(aztecDetectorResult.getBits()));
        com.google.zxing.common.DecoderResult decoderResult = new com.google.zxing.common.DecoderResult(convertBoolArrayToByteArray(correctBits.correctBits), getEncodedData(correctBits.correctBits), null, java.lang.String.format("%d%%", java.lang.Integer.valueOf(correctBits.ecLevel)));
        decoderResult.setNumBits(correctBits.correctBits.length);
        decoderResult.setErrorsCorrected(java.lang.Integer.valueOf(correctBits.errorsCorrected));
        return decoderResult;
    }

    public static java.lang.String highLevelDecode(boolean[] zArr) throws com.google.zxing.FormatException {
        return getEncodedData(zArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        throw com.google.zxing.FormatException.getFormatInstance();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String getEncodedData(boolean[] zArr) throws com.google.zxing.FormatException {
        int length = zArr.length;
        com.google.zxing.aztec.decoder.Decoder.Table table = com.google.zxing.aztec.decoder.Decoder.Table.UPPER;
        com.google.zxing.aztec.decoder.Decoder.Table table2 = com.google.zxing.aztec.decoder.Decoder.Table.UPPER;
        java.lang.StringBuilder sb = new java.lang.StringBuilder((zArr.length - 5) / 4);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.nio.charset.Charset charset = DEFAULT_ENCODING;
        int i = 0;
        loop0: while (true) {
            com.google.zxing.aztec.decoder.Decoder.Table table3 = table2;
            table2 = table;
            table = table3;
            while (i < length) {
                if (table != com.google.zxing.aztec.decoder.Decoder.Table.BINARY) {
                    int i2 = table == com.google.zxing.aztec.decoder.Decoder.Table.DIGIT ? 4 : 5;
                    if (length - i >= i2) {
                        int readCode = readCode(zArr, i, i2);
                        i += i2;
                        java.lang.String character = getCharacter(table, readCode);
                        if ("FLG(n)".equals(character)) {
                            if (length - i >= 3) {
                                int readCode2 = readCode(zArr, i, 3);
                                i += 3;
                                try {
                                    sb.append(byteArrayOutputStream.toString(charset.name()));
                                    byteArrayOutputStream.reset();
                                    if (readCode2 == 0) {
                                        sb.append((char) 29);
                                    } else {
                                        if (readCode2 == 7) {
                                            throw com.google.zxing.FormatException.getFormatInstance();
                                        }
                                        if (length - i >= readCode2 * 4) {
                                            int i3 = 0;
                                            while (readCode2 > 0) {
                                                int readCode3 = readCode(zArr, i, 4);
                                                i += 4;
                                                if (readCode3 < 2 || readCode3 > 11) {
                                                    break loop0;
                                                }
                                                i3 = (i3 * 10) + (readCode3 - 2);
                                                readCode2--;
                                            }
                                            com.google.zxing.common.CharacterSetECI characterSetECIByValue = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(i3);
                                            if (characterSetECIByValue == null) {
                                                throw com.google.zxing.FormatException.getFormatInstance();
                                            }
                                            charset = characterSetECIByValue.getCharset();
                                        } else {
                                            continue;
                                        }
                                    }
                                } catch (java.io.UnsupportedEncodingException e) {
                                    throw new java.lang.IllegalStateException(e);
                                }
                            }
                        } else if (character.startsWith("CTRL_")) {
                            table2 = getTable(character.charAt(5));
                            if (character.charAt(6) != 'L') {
                                break;
                            }
                        } else {
                            byte[] bytes = character.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
                            byteArrayOutputStream.write(bytes, 0, bytes.length);
                        }
                        table = table2;
                    }
                } else if (length - i >= 5) {
                    int readCode4 = readCode(zArr, i, 5);
                    int i4 = i + 5;
                    if (readCode4 == 0) {
                        if (length - i4 >= 11) {
                            readCode4 = readCode(zArr, i4, 11) + 31;
                            i4 = i + 16;
                        }
                    }
                    int i5 = 0;
                    while (true) {
                        if (i5 >= readCode4) {
                            i = i4;
                            break;
                        }
                        if (length - i4 < 8) {
                            i = length;
                            break;
                        }
                        byteArrayOutputStream.write((byte) readCode(zArr, i4, 8));
                        i4 += 8;
                        i5++;
                    }
                    table = table2;
                }
            }
            try {
                sb.append(byteArrayOutputStream.toString(charset.name()));
                return sb.toString();
            } catch (java.io.UnsupportedEncodingException e2) {
                throw new java.lang.IllegalStateException(e2);
            }
        }
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

    private static java.lang.String getCharacter(com.google.zxing.aztec.decoder.Decoder.Table table, int i) {
        int ordinal = table.ordinal();
        if (ordinal == 0) {
            return UPPER_TABLE[i];
        }
        if (ordinal == 1) {
            return LOWER_TABLE[i];
        }
        if (ordinal == 2) {
            return MIXED_TABLE[i];
        }
        if (ordinal == 3) {
            return DIGIT_TABLE[i];
        }
        if (ordinal == 4) {
            return PUNCT_TABLE[i];
        }
        throw new java.lang.IllegalStateException("Bad table");
    }

    static final class CorrectedBitsResult {
        private final boolean[] correctBits;
        private final int ecLevel;
        private final int errorsCorrected;

        CorrectedBitsResult(boolean[] zArr, int i, int i2) {
            this.correctBits = zArr;
            this.errorsCorrected = i;
            this.ecLevel = i2;
        }
    }

    private com.google.zxing.aztec.decoder.Decoder.CorrectedBitsResult correctBits(boolean[] zArr) throws com.google.zxing.FormatException {
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
            com.google.zxing.common.reedsolomon.ReedSolomonDecoder reedSolomonDecoder = new com.google.zxing.common.reedsolomon.ReedSolomonDecoder(genericGF);
            int i3 = length - nbDatablocks;
            int decodeWithECCount = reedSolomonDecoder.decodeWithECCount(iArr, i3);
            int i4 = 1 << i;
            int i5 = 0;
            for (int i6 = 0; i6 < nbDatablocks; i6++) {
                int i7 = iArr[i6];
                if (i7 == 0 || i7 == i4 - 1) {
                    throw com.google.zxing.FormatException.getFormatInstance();
                }
                if (i7 == 1 || i7 == i4 - 2) {
                    i5++;
                }
            }
            boolean[] zArr2 = new boolean[(nbDatablocks * i) - i5];
            int i8 = 0;
            for (int i9 = 0; i9 < nbDatablocks; i9++) {
                int i10 = iArr[i9];
                if (i10 == 1 || i10 == i4 - 2) {
                    java.util.Arrays.fill(zArr2, i8, (i8 + i) - 1, i10 > 1);
                    i8 += i - 1;
                } else {
                    int i11 = i - 1;
                    while (i11 >= 0) {
                        zArr2[i8] = (i10 & (1 << i11)) != 0;
                        i11--;
                        i8++;
                    }
                }
            }
            return new com.google.zxing.aztec.decoder.Decoder.CorrectedBitsResult(zArr2, decodeWithECCount, (i3 * 100) / length);
        } catch (com.google.zxing.common.reedsolomon.ReedSolomonException e) {
            throw com.google.zxing.FormatException.getFormatInstance(e);
        }
    }

    private boolean[] extractBits(com.google.zxing.common.BitMatrix bitMatrix) {
        boolean isCompact = this.ddata.isCompact();
        int nbLayers = this.ddata.getNbLayers();
        int i = (isCompact ? 11 : 14) + (nbLayers * 4);
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
            int i9 = ((nbLayers - i7) * 4) + (isCompact ? 9 : 12);
            int i10 = i7 * 2;
            int i11 = (i - 1) - i10;
            int i12 = 0;
            while (i12 < i9) {
                int i13 = i12 * 2;
                int i14 = 0;
                while (i14 < i2) {
                    int i15 = i10 + i14;
                    int i16 = i10 + i12;
                    zArr[i8 + i13 + i14] = bitMatrix.get(iArr[i15], iArr[i16]);
                    int i17 = iArr[i16];
                    int i18 = i11 - i14;
                    boolean z = isCompact;
                    zArr[(i9 * 2) + i8 + i13 + i14] = bitMatrix.get(i17, iArr[i18]);
                    int i19 = i11 - i12;
                    zArr[(i9 * 4) + i8 + i13 + i14] = bitMatrix.get(iArr[i18], iArr[i19]);
                    zArr[(i9 * 6) + i8 + i13 + i14] = bitMatrix.get(iArr[i19], iArr[i15]);
                    i14++;
                    isCompact = z;
                    i2 = 2;
                }
                i12++;
                i2 = 2;
            }
            i8 += i9 * 8;
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
            bArr[i] = readByte(zArr, i * 8);
        }
        return bArr;
    }
}
