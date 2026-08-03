package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1269al {
    public static byte[] A02;
    public boolean A00 = true;
    public final com.facebook.ads.redexgen.core.M3 A01;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SUB, 45, 66, com.google.common.base.Ascii.DLE, 59, 57, com.google.common.base.Ascii.SI, 59, 58, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 49, 58, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.CAN, 59, 45, 48, 49, 48, 6, com.google.common.base.Ascii.DC4, 33, 33, 52, 73, com.google.common.base.Ascii.US, 66, 52, 55, com.google.common.base.Ascii.CAN, 73, 56, 65, 71, com.google.common.base.Ascii.CAN, 65, 55, com.google.common.base.Ascii.CR, -52, -39, -39, -20, 1, -35, -16, -2, -5, -6, -7, -2, -16, -48, -7, -17, -59, 34, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DLE, -44, -44, com.google.common.base.Ascii.DC2, 33, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, -44, -43, -52, 39, 32, com.google.common.base.Ascii.RS, 37, -52, 39, -52, -52, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, -52, -44, -51, 35, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, 35, -38, com.google.common.base.Ascii.FS, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, 17, -52, 40, 40, -52, -51, 35, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, 35, -38, com.google.common.base.Ascii.FS, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, 17, -38, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 19, -52, 40, 40, -52, -51, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SI, 33, com.google.common.base.Ascii.EM, 17, com.google.common.base.Ascii.SUB, 32, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, -51, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SI, 33, com.google.common.base.Ascii.EM, 17, com.google.common.base.Ascii.SUB, 32, -38, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DLE, 37, -52, 40, 40, -52, -51, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SI, 33, com.google.common.base.Ascii.EM, 17, com.google.common.base.Ascii.SUB, 32, -38, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DLE, 37, -38, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.RS, 17, com.google.common.base.Ascii.SUB, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SI, 33, com.google.common.base.Ascii.EM, 17, com.google.common.base.Ascii.SUB, 32, -38, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DLE, 37, -38, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.RS, 17, com.google.common.base.Ascii.SUB, -38, com.google.common.base.Ascii.CAN, 17, com.google.common.base.Ascii.SUB, 19, 32, com.google.common.base.Ascii.DC4, -52, -24, -52, -35, -43, -52, 39, -52, -52, -52, -52, com.google.common.base.Ascii.RS, 17, 32, 33, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SUB, -25, -52, -52, 41, -52, -52, 34, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, -52, com.google.common.base.Ascii.SUB, 34, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 32, -52, -23, -52, 35, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, 35, -38, com.google.common.base.Ascii.FS, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, 17, -38, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 19, -25, -52, -52, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, -52, -44, com.google.common.base.Ascii.SUB, 34, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 32, -38, com.google.common.base.Ascii.RS, 17, com.google.common.base.Ascii.US, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, 17, -15, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, 17, -38, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, 19, -44, -45, -19, -6, -6, com.google.common.base.Ascii.CR, 34, -2, 17, com.google.common.base.Ascii.US, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, 17, -15, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, -26, -45, -52, -41, -52, com.google.common.base.Ascii.SUB, 34, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 32, -38, com.google.common.base.Ascii.RS, 17, com.google.common.base.Ascii.US, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, 17, -15, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, -43, -25, -52, -52, 41, -52, -52, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, -52, -44, com.google.common.base.Ascii.SUB, 34, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 32, -38, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.EM, -17, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, 32, 17, com.google.common.base.Ascii.SUB, 32, -8, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, 17, com.google.common.base.Ascii.DLE, -15, 34, 17, com.google.common.base.Ascii.SUB, 32, -1, 32, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, 32, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, 17, -38, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, 19, -44, -45, -19, -6, -6, com.google.common.base.Ascii.CR, 34, -16, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.EM, -17, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, 32, 17, com.google.common.base.Ascii.SUB, 32, -8, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, 17, com.google.common.base.Ascii.DLE, -26, -45, -52, -41, -52, com.google.common.base.Ascii.SUB, 34, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 32, -38, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.EM, -17, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, 32, 17, com.google.common.base.Ascii.SUB, 32, -8, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, 17, com.google.common.base.Ascii.DLE, -15, 34, 17, com.google.common.base.Ascii.SUB, 32, -1, 32, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, 32, -43, -25, -52, -52, 41, -52, -52, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, -52, -44, com.google.common.base.Ascii.SUB, 34, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 32, -38, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, -15, 34, 17, com.google.common.base.Ascii.SUB, 32, -15, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, 17, -38, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, 19, -44, -45, -19, -6, -6, com.google.common.base.Ascii.CR, 34, -8, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, -15, 34, 17, com.google.common.base.Ascii.SUB, 32, -15, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, -26, -45, -52, -41, -52, com.google.common.base.Ascii.SUB, 34, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 32, -38, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, -15, 34, 17, com.google.common.base.Ascii.SUB, 32, -15, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, -43, -25, -52, -52, 41, 41, -52, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, 32, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, -44, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, -43, -52, 39, -52, -52, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, 17, -38, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, 19, -44, -45, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CR, 34, com.google.common.base.Ascii.NAK, 19, com.google.common.base.Ascii.CR, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.VT, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, -26, -45, -52, -41, -52, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, -38, com.google.common.base.Ascii.EM, 17, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CR, 19, 17, -43, -25, 41, 41, -43, -44, -43, -43, -25};
    }

    public C1269al(com.facebook.ads.redexgen.core.M3 m3) {
        this.A01 = m3;
    }

    public static long A00(java.lang.String str, java.lang.String str2) {
        java.lang.String substring = str.substring(str2.length());
        if (android.text.TextUtils.isEmpty(substring)) {
            return -1L;
        }
        try {
            long parseLong = java.lang.Long.parseLong(substring);
            if (parseLong < 0) {
                return -1L;
            }
            return parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public final void A03() {
        if (!this.A00) {
            return;
        }
        if (this.A01.canGoBack() || this.A01.canGoForward()) {
            this.A00 = false;
        } else {
            this.A01.A0I(A01(57, 693, 87));
        }
    }

    public final void A04(java.lang.String str) {
        if (!this.A00) {
            return;
        }
        java.lang.String A01 = A01(40, 17, 54);
        if (str.startsWith(A01)) {
            this.A01.A0M(A00(str, A01));
            return;
        }
        java.lang.String A012 = A01(0, 22, 119);
        if (str.startsWith(A012)) {
            this.A01.A0K(A00(str, A012));
            return;
        }
        java.lang.String A013 = A01(22, 18, 126);
        if (!str.startsWith(A013)) {
            return;
        }
        this.A01.A0L(A00(str, A013));
    }

    public final void A05(boolean z) {
        this.A00 = z;
    }
}
