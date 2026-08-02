package org.apache.commons.codec.net;

/* loaded from: classes17.dex */
final class Utils {
    Utils() {
    }

    static int getHighSpeedVideoFpsRanges(byte b) throws org.apache.commons.codec.DecoderException {
        int digit = java.lang.Character.digit((char) b, 16);
        if (digit != -1) {
            return digit;
        }
        throw new org.apache.commons.codec.DecoderException("Invalid URL encoding: not a valid digit (radix 16): ".concat(java.lang.String.valueOf((int) b)));
    }

    static char getHighResolutionOutputSizeshNQ4ISI(int i) {
        return java.lang.Character.toUpperCase(java.lang.Character.forDigit(i & 15, 16));
    }
}
