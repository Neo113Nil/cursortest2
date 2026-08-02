package com.google.zxing.oned;

/* loaded from: classes9.dex */
public class Code93Writer extends com.google.zxing.oned.OneDimensionalCodeWriter {
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    protected java.util.Collection<com.google.zxing.BarcodeFormat> getSupportedWriteFormats() {
        return java.util.Collections.singleton(com.google.zxing.BarcodeFormat.CODE_93);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(java.lang.String str) {
        java.lang.String convertToExtended = convertToExtended(str);
        int length = convertToExtended.length();
        if (length > 80) {
            throw new java.lang.IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(java.lang.String.valueOf(length)));
        }
        boolean[] zArr = new boolean[((convertToExtended.length() + 4) * 9) + 1];
        int appendPattern = appendPattern(zArr, 0, com.google.zxing.oned.Code93Reader.ASTERISK_ENCODING);
        for (int i = 0; i < length; i++) {
            appendPattern += appendPattern(zArr, appendPattern, com.google.zxing.oned.Code93Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(convertToExtended.charAt(i))]);
        }
        int computeChecksumIndex = computeChecksumIndex(convertToExtended, 20);
        int appendPattern2 = appendPattern + appendPattern(zArr, appendPattern, com.google.zxing.oned.Code93Reader.CHARACTER_ENCODINGS[computeChecksumIndex]);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(convertToExtended);
        sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(computeChecksumIndex));
        int appendPattern3 = appendPattern2 + appendPattern(zArr, appendPattern2, com.google.zxing.oned.Code93Reader.CHARACTER_ENCODINGS[computeChecksumIndex(sb.toString(), 15)]);
        zArr[appendPattern3 + appendPattern(zArr, appendPattern3, com.google.zxing.oned.Code93Reader.ASTERISK_ENCODING)] = true;
        return zArr;
    }

    @java.lang.Deprecated
    protected static int appendPattern(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            zArr[i] = iArr[i2] != 0;
            i2++;
            i++;
        }
        return 9;
    }

    private static int appendPattern(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i + i3] = z;
        }
        return 9;
    }

    private static int computeChecksumIndex(java.lang.String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    static java.lang.String convertToExtended(java.lang.String str) {
        int length = str.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                sb.append("bU");
            } else if (charAt <= 26) {
                sb.append('a');
                sb.append((char) (charAt + '@'));
            } else if (charAt <= 31) {
                sb.append('b');
                sb.append((char) (charAt + kotlin.text.Typography.amp));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb.append(charAt);
            } else if (charAt <= ',') {
                sb.append('c');
                sb.append((char) (charAt + ' '));
            } else if (charAt <= '9') {
                sb.append(charAt);
            } else if (charAt == ':') {
                sb.append("cZ");
            } else if (charAt <= '?') {
                sb.append('b');
                sb.append((char) (charAt + 11));
            } else if (charAt == '@') {
                sb.append("bV");
            } else if (charAt <= 'Z') {
                sb.append(charAt);
            } else if (charAt <= '_') {
                sb.append('b');
                sb.append((char) (charAt - 16));
            } else if (charAt == '`') {
                sb.append("bW");
            } else if (charAt <= 'z') {
                sb.append(io.ktor.util.date.GMTDateParser.DAY_OF_MONTH);
                sb.append((char) (charAt - ' '));
            } else if (charAt <= 127) {
                sb.append('b');
                sb.append((char) (charAt - '+'));
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Requested content contains a non-encodable character: '");
                sb2.append(charAt);
                sb2.append("'");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
        }
        return sb.toString();
    }
}
