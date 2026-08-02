package com.datadog.trace.api.internal.util;

/* loaded from: classes3.dex */
public class LongStringUtils {
    private static final byte[] getHighSpeedVideoFpsRanges = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 97, 98, 99, 100, 101, 102};

    private LongStringUtils() {
    }

    public static long parseUnsignedLongHex(java.lang.CharSequence charSequence) throws java.lang.NumberFormatException {
        return parseUnsignedLongHex(charSequence, 0, charSequence == null ? 0 : charSequence.length(), false);
    }

    public static long parseUnsignedLongHex(java.lang.CharSequence charSequence, int i, int i2, boolean z) throws java.lang.NumberFormatException {
        if (charSequence == null) {
            throw new java.lang.NumberFormatException("null");
        }
        if (i2 <= 0 || i < 0 || i + i2 > charSequence.length()) {
            throw new java.lang.NumberFormatException("Empty input string");
        }
        if (i2 > 16) {
            int i3 = i;
            while (i3 < charSequence.length() && charSequence.charAt(i3) == '0') {
                i3++;
            }
            if (i2 - i3 > 16) {
                throw numberFormatOutOfLongRange(charSequence);
            }
        }
        int i4 = 0;
        long j = 0;
        int i5 = 0;
        while (i4 < i2 && i5 >= 0) {
            char charAt = charSequence.charAt(i);
            int digit = java.lang.Character.digit(charAt, 16);
            if (z && java.lang.Character.isUpperCase(charAt)) {
                i5 = -1;
            }
            i5 |= digit;
            j = (j << 4) | digit;
            i4++;
            i++;
        }
        if (i5 >= 0) {
            return j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal character in ");
        sb.append((java.lang.Object) charSequence.subSequence(i, i2));
        throw new java.lang.NumberFormatException(sb.toString());
    }

    public static long parseUnsignedLong(java.lang.String str) throws java.lang.NumberFormatException {
        int i;
        if (str == null) {
            throw new java.lang.NumberFormatException("s can't be null");
        }
        int length = str.length();
        if (length > 0) {
            int i2 = 0;
            if (str.charAt(0) == '-') {
                throw new java.lang.NumberFormatException(java.lang.String.format("Illegal leading minus sign on unsigned string %s.", str));
            }
            if (length <= 18) {
                return java.lang.Long.parseLong(str);
            }
            if (length > 20) {
                throw numberFormatOutOfLongRange(str);
            }
            int i3 = 0;
            long j = 0;
            while (true) {
                i = length - 1;
                if (i2 >= i) {
                    break;
                }
                int digit = java.lang.Character.digit(str.charAt(i2), 10);
                i3 |= digit;
                j = (j * 10) + digit;
                i2++;
            }
            int digit2 = java.lang.Character.digit(str.charAt(i), 10);
            if ((i3 | digit2) < 0) {
                throw new java.lang.NumberFormatException("Illegal character in ".concat(java.lang.String.valueOf(str)));
            }
            if (j > 1844674407370955161L) {
                throw numberFormatOutOfLongRange(str);
            }
            long j2 = j * 10;
            long j3 = digit2 + j2;
            if (j2 >= 0 || j3 < 0) {
                return j3;
            }
            throw numberFormatOutOfLongRange(str);
        }
        throw new java.lang.NumberFormatException("Empty input string");
    }

    public static java.lang.NumberFormatException numberFormatOutOfLongRange(java.lang.CharSequence charSequence) {
        return new java.lang.NumberFormatException(java.lang.String.format("String value %s exceeds range of unsigned long.", charSequence));
    }

    public static java.lang.String toHexStringPadded(long j, long j2, int i) {
        if (i <= 16) {
            return toHexStringPadded(j2, i);
        }
        if (i > 16) {
            i = 32;
        } else if (i < 16) {
            i = 16;
        }
        byte[] bArr = new byte[i];
        getHighResolutionOutputSizeshNQ4ISI(j, 0, 16, bArr);
        getHighResolutionOutputSizeshNQ4ISI(j2, 16, 16, bArr);
        return new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(long j, int i, int i2, byte[] bArr) {
        int numberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j) >>> 2;
        java.util.Arrays.fill(bArr, i, (i2 - 16) + i + numberOfLeadingZeros, (byte) 48);
        for (int i3 = 0; i3 < 16 - numberOfLeadingZeros; i3++) {
            bArr[((i + i2) - 1) - i3] = getHighSpeedVideoFpsRanges[(int) (15 & j)];
            j >>>= 4;
        }
    }

    public static java.lang.String toHexStringPadded(long j, int i) {
        if (i > 16) {
            i = 32;
        } else if (i < 16) {
            i = 16;
        }
        byte[] bArr = new byte[i];
        getHighResolutionOutputSizeshNQ4ISI(j, 0, i, bArr);
        return new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII);
    }
}
