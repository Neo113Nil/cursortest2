package com.google.zxing.oned;

/* loaded from: classes9.dex */
public final class Code93Reader extends com.google.zxing.oned.OneDReader {
    static final int ASTERISK_ENCODING;
    static final int[] CHARACTER_ENCODINGS;
    static final java.lang.String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    private final java.lang.StringBuilder decodeRowResult = new java.lang.StringBuilder(20);
    private final int[] counters = new int[6];

    static {
        int[] iArr = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, 328, 324, 322, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, 336, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING, 418, 404, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY, 394, 360, 356, 354, 308, 282, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD, com.visa.cbp.getCertUsage.getAppPrgrmIDAID, 326, 300, com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, 474, 470, 306, 350};
        CHARACTER_ENCODINGS = iArr;
        ASTERISK_ENCODING = iArr[47];
    }

    @Override // com.google.zxing.oned.OneDReader
    public final com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        int nextSet = bitArray.getNextSet(findAsteriskPattern(bitArray)[1]);
        int size = bitArray.getSize();
        int[] iArr = this.counters;
        java.util.Arrays.fill(iArr, 0);
        java.lang.StringBuilder sb = this.decodeRowResult;
        sb.setLength(0);
        while (true) {
            recordPattern(bitArray, nextSet, iArr);
            int pattern = toPattern(iArr);
            if (pattern < 0) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            char patternToChar = patternToChar(pattern);
            sb.append(patternToChar);
            int i2 = nextSet;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int nextSet2 = bitArray.getNextSet(i2);
            if (patternToChar == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                if (nextSet2 == size || !bitArray.get(nextSet2)) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                if (sb.length() < 2) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                checkChecksums(sb);
                sb.setLength(sb.length() - 2);
                float f = i;
                com.google.zxing.Result result = new com.google.zxing.Result(decodeExtended(sb), null, new com.google.zxing.ResultPoint[]{new com.google.zxing.ResultPoint((r14[1] + r14[0]) / 2.0f, f), new com.google.zxing.ResultPoint(nextSet + (i4 / 2.0f), f)}, com.google.zxing.BarcodeFormat.CODE_93);
                result.putMetadata(com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]G0");
                return result;
            }
            nextSet = nextSet2;
        }
    }

    private int[] findAsteriskPattern(com.google.zxing.common.BitArray bitArray) throws com.google.zxing.NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        java.util.Arrays.fill(this.counters, 0);
        int[] iArr = this.counters;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i != length - 1) {
                    i++;
                } else {
                    if (toPattern(iArr) == ASTERISK_ENCODING) {
                        return new int[]{i2, nextSet};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    java.lang.System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                }
                iArr[i] = 1;
                z = !z;
            }
            nextSet++;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static int toPattern(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = java.lang.Math.round((iArr[i4] * 9.0f) / i);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    private static char patternToChar(int i) throws com.google.zxing.NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = CHARACTER_ENCODINGS;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return ALPHABET[i2];
                }
                i2++;
            } else {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static java.lang.String decodeExtended(java.lang.CharSequence charSequence) throws com.google.zxing.FormatException {
        char c;
        int i;
        int length = charSequence.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'a' || charAt > 'd') {
                sb.append(charAt);
            } else {
                if (i2 >= length - 1) {
                    throw com.google.zxing.FormatException.getFormatInstance();
                }
                i2++;
                char charAt2 = charSequence.charAt(i2);
                switch (charAt) {
                    case 'a':
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                        i = charAt2 - '@';
                        c = (char) i;
                        sb.append(c);
                        break;
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i = charAt2 - '&';
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i = charAt2 - 11;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            i = charAt2 + 16;
                        } else if (charAt2 < 'P' || charAt2 > 'T') {
                            if (charAt2 != 'U') {
                                if (charAt2 == 'V') {
                                    c = '@';
                                } else if (charAt2 == 'W') {
                                    c = '`';
                                } else {
                                    if (charAt2 < 'X' || charAt2 > 'Z') {
                                        throw com.google.zxing.FormatException.getFormatInstance();
                                    }
                                    c = com.google.common.base.Ascii.MAX;
                                }
                                sb.append(c);
                                break;
                            }
                            c = 0;
                            sb.append(c);
                        } else {
                            i = charAt2 + '+';
                        }
                        c = (char) i;
                        sb.append(c);
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i = charAt2 - ' ';
                            c = (char) i;
                            sb.append(c);
                        } else {
                            if (charAt2 != 'Z') {
                                throw com.google.zxing.FormatException.getFormatInstance();
                            }
                            c = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
                            sb.append(c);
                            break;
                        }
                    case 'd':
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                        i = charAt2 + ' ';
                        c = (char) i;
                        sb.append(c);
                        break;
                        break;
                    default:
                        c = 0;
                        sb.append(c);
                        break;
                }
            }
            i2++;
        }
        return sb.toString();
    }

    private static void checkChecksums(java.lang.CharSequence charSequence) throws com.google.zxing.ChecksumException {
        int length = charSequence.length();
        checkOneChecksum(charSequence, length - 2, 20);
        checkOneChecksum(charSequence, length - 1, 15);
    }

    private static void checkOneChecksum(java.lang.CharSequence charSequence, int i, int i2) throws com.google.zxing.ChecksumException {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += ALPHABET_STRING.indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != ALPHABET[i3 % 47]) {
            throw com.google.zxing.ChecksumException.getChecksumInstance();
        }
    }
}
