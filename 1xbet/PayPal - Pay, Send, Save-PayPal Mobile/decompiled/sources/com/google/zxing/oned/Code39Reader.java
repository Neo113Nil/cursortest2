package com.google.zxing.oned;

/* loaded from: classes9.dex */
public final class Code39Reader extends com.google.zxing.oned.OneDReader {
    static final java.lang.String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
    static final int ASTERISK_ENCODING = 148;
    static final int[] CHARACTER_ENCODINGS = {52, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, 97, 352, 49, 304, 112, 37, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, 100, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, 73, 328, 25, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, 88, 13, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, 76, 28, 259, 67, 322, 19, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 82, 7, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 70, 22, 385, 193, 448, 145, 400, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 388, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 138, 42};
    private final int[] counters;
    private final java.lang.StringBuilder decodeRowResult;
    private final boolean extendedMode;
    private final boolean usingCheckDigit;

    public Code39Reader() {
        this(false);
    }

    public Code39Reader(boolean z) {
        this(z, false);
    }

    public Code39Reader(boolean z, boolean z2) {
        this.usingCheckDigit = z;
        this.extendedMode = z2;
        this.decodeRowResult = new java.lang.StringBuilder(20);
        this.counters = new int[9];
    }

    @Override // com.google.zxing.oned.OneDReader
    public final com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        java.lang.String obj;
        int[] iArr = this.counters;
        java.util.Arrays.fill(iArr, 0);
        java.lang.StringBuilder sb = this.decodeRowResult;
        sb.setLength(0);
        int nextSet = bitArray.getNextSet(findAsteriskPattern(bitArray, iArr)[1]);
        int size = bitArray.getSize();
        while (true) {
            recordPattern(bitArray, nextSet, iArr);
            int narrowWidePattern = toNarrowWidePattern(iArr);
            if (narrowWidePattern < 0) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            char patternToChar = patternToChar(narrowWidePattern);
            sb.append(patternToChar);
            int i2 = nextSet;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int nextSet2 = bitArray.getNextSet(i2);
            if (patternToChar == '*') {
                sb.setLength(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                if (nextSet2 != size && ((nextSet2 - nextSet) - i4) * 2 < i4) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                if (this.usingCheckDigit) {
                    int length = sb.length() - 1;
                    int i6 = 0;
                    for (int i7 = 0; i7 < length; i7++) {
                        i6 += ALPHABET_STRING.indexOf(this.decodeRowResult.charAt(i7));
                    }
                    if (sb.charAt(length) != ALPHABET_STRING.charAt(i6 % 43)) {
                        throw com.google.zxing.ChecksumException.getChecksumInstance();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                if (this.extendedMode) {
                    obj = decodeExtended(sb);
                } else {
                    obj = sb.toString();
                }
                float f = i;
                com.google.zxing.Result result = new com.google.zxing.Result(obj, null, new com.google.zxing.ResultPoint[]{new com.google.zxing.ResultPoint((r2[1] + r2[0]) / 2.0f, f), new com.google.zxing.ResultPoint(nextSet + (i4 / 2.0f), f)}, com.google.zxing.BarcodeFormat.CODE_39);
                result.putMetadata(com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]A0");
                return result;
            }
            nextSet = nextSet2;
        }
    }

    private static int[] findAsteriskPattern(com.google.zxing.common.BitArray bitArray, int[] iArr) throws com.google.zxing.NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
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
                    if (toNarrowWidePattern(iArr) == 148 && bitArray.isRange(java.lang.Math.max(0, i2 - ((nextSet - i2) / 2)), i2, false)) {
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

    private static int toNarrowWidePattern(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if (i10 * 2 >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }

    private static char patternToChar(int i) throws com.google.zxing.NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = CHARACTER_ENCODINGS;
            if (i2 >= iArr.length) {
                if (i == 148) {
                    return '*';
                }
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            if (iArr[i2] == i) {
                return ALPHABET_STRING.charAt(i2);
            }
            i2++;
        }
    }

    private static java.lang.String decodeExtended(java.lang.CharSequence charSequence) throws com.google.zxing.FormatException {
        int i;
        char c;
        int length = charSequence.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else {
                                    if (charAt2 != 'Z') {
                                        throw com.google.zxing.FormatException.getFormatInstance();
                                    }
                                    c = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
                                    sb.append(c);
                                }
                            }
                            c = 0;
                            sb.append(c);
                        } else {
                            if (charAt2 < 'A' || charAt2 > 'Z') {
                                throw com.google.zxing.FormatException.getFormatInstance();
                            }
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
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
                                if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                    throw com.google.zxing.FormatException.getFormatInstance();
                                }
                                c = com.google.common.base.Ascii.MAX;
                            }
                            sb.append(c);
                        }
                        c = 0;
                        sb.append(c);
                    } else {
                        i = charAt2 + '+';
                    }
                } else {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        throw com.google.zxing.FormatException.getFormatInstance();
                    }
                    i = charAt2 - '@';
                }
                c = (char) i;
                sb.append(c);
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }
}
