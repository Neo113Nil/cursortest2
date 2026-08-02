package com.google.zxing.oned;

/* loaded from: classes9.dex */
public final class CodaBarWriter extends com.google.zxing.oned.OneDimensionalCodeWriter {
    private static final char[] ALT_START_END_CHARS = {'T', 'N', '*', 'E'};
    private static final char[] CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED = {kotlinx.io.files.FileSystemKt.UnixPathSeparator, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, '+', com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR};
    private static final char DEFAULT_GUARD;
    private static final char[] START_END_CHARS;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        START_END_CHARS = cArr;
        DEFAULT_GUARD = cArr[0];
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    protected final java.util.Collection<com.google.zxing.BarcodeFormat> getSupportedWriteFormats() {
        return java.util.Collections.singleton(com.google.zxing.BarcodeFormat.CODABAR);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] encode(java.lang.String str) {
        int i;
        if (str.length() < 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            char c = DEFAULT_GUARD;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = java.lang.Character.toUpperCase(str.charAt(0));
            char upperCase2 = java.lang.Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = START_END_CHARS;
            boolean arrayContains = com.google.zxing.oned.CodaBarReader.arrayContains(cArr, upperCase);
            boolean arrayContains2 = com.google.zxing.oned.CodaBarReader.arrayContains(cArr, upperCase2);
            char[] cArr2 = ALT_START_END_CHARS;
            boolean arrayContains3 = com.google.zxing.oned.CodaBarReader.arrayContains(cArr2, upperCase);
            boolean arrayContains4 = com.google.zxing.oned.CodaBarReader.arrayContains(cArr2, upperCase2);
            if (arrayContains) {
                if (!arrayContains2) {
                    throw new java.lang.IllegalArgumentException("Invalid start/end guards: ".concat(java.lang.String.valueOf(str)));
                }
            } else if (!arrayContains3) {
                if (arrayContains2 || arrayContains4) {
                    throw new java.lang.IllegalArgumentException("Invalid start/end guards: ".concat(java.lang.String.valueOf(str)));
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                char c2 = DEFAULT_GUARD;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            } else if (!arrayContains4) {
                throw new java.lang.IllegalArgumentException("Invalid start/end guards: ".concat(java.lang.String.valueOf(str)));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (java.lang.Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!com.google.zxing.oned.CodaBarReader.arrayContains(CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED, str.charAt(i3))) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Cannot encode : '");
                    sb3.append(str.charAt(i3));
                    sb3.append('\'');
                    throw new java.lang.IllegalArgumentException(sb3.toString());
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = java.lang.Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                if (i6 >= com.google.zxing.oned.CodaBarReader.ALPHABET.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == com.google.zxing.oned.CodaBarReader.ALPHABET[i6]) {
                    i = com.google.zxing.oned.CodaBarReader.CHARACTER_ENCODINGS[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
