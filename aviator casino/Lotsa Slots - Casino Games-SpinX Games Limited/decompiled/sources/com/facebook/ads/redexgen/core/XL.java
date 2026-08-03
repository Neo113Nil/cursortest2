package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XL {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"qSiXKiq1IG9lqM50Z2Mb9O8Z2LWgBu", "r2U8xUOmaYVPqVNF7ipuwqUkClKOL9fI", "t2SmaoScOMFcI6wk6u94gycUTd7TrCEv", "g958mvzQCDN4laMR6tofpj9QKe8MWy18", "srt0ITOyv23HblPPEDvfXyJdFCTOXScH", "yBqqog3SgBsnKDzcKk1fPvagOkeR5j", "3gR", "V2iGxa"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SO, 5, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 35, 32, 43, 44};
    }

    static {
        A02();
    }

    public static java.lang.String A00(float f) {
        if (A03(f)) {
            return A01(10, 4, 69);
        }
        if (A05(f)) {
            return A01(0, 4, 126);
        }
        if (A04(f)) {
            return A01(4, 3, 96);
        }
        java.lang.String A012 = A01(7, 3, 112);
        java.lang.String[] strArr = A01;
        if (strArr[0].length() != strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        A01[4] = "joCrsBqpJwLPerzsPAAgEpnRec6YcWpS";
        return A012;
    }

    public static boolean A03(float f) {
        return f <= 0.7f;
    }

    public static boolean A04(float f) {
        return f == 1.0f;
    }

    public static boolean A05(float f) {
        return f >= 1.2f;
    }
}
