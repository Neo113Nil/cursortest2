package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class T0 {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final java.lang.String A09;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, -42, com.google.common.base.Ascii.SUB, 37, 45, 36, 34, 37, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, -42, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, 34, 43, 40, com.google.common.base.Ascii.ESC, -28, -80, -50, -48, -43, -46, -115, -43, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, com.google.common.base.Ascii.SYN, 17, com.google.common.base.Ascii.NAK, 36, com.google.common.base.Ascii.ETB, 19, 38, com.google.common.base.Ascii.ESC, 40, com.google.common.base.Ascii.ETB, 17, 37, com.google.common.base.Ascii.ESC, 44, com.google.common.base.Ascii.ETB, 17, com.google.common.base.Ascii.DC4, 43, 38, com.google.common.base.Ascii.ETB, 37, -33, -30, -35, -31, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, com.google.common.base.Ascii.GS, 32, com.google.common.base.Ascii.ESC, 34, 43, 46, 41, com.google.common.base.Ascii.GS, 48, com.google.common.base.Ascii.ESC, 48, 53, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, 35, 32, 63, kotlin.io.encoding.Base64.padSymbol, 63, 68, 65, 59, 63, 75, 74, 80, 65, 84, 80, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, 19, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, 17, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, 70, 67, kotlin.io.encoding.Base64.padSymbol};
    }

    static {
        A01();
        A09 = com.facebook.ads.redexgen.core.T0.class.getSimpleName();
        A05 = com.facebook.ads.redexgen.core.AbstractC1048Td.A0o;
        A06 = com.facebook.ads.redexgen.core.AbstractC1048Td.A0s;
        A02 = com.facebook.ads.redexgen.core.AbstractC1048Td.A0l;
        A01 = com.facebook.ads.redexgen.core.AbstractC1048Td.A0k;
        A03 = com.facebook.ads.redexgen.core.AbstractC1048Td.A0m;
        A00 = com.facebook.ads.redexgen.core.AbstractC1048Td.A0i;
        A04 = com.facebook.ads.redexgen.core.AbstractC1048Td.A0n;
        A07 = com.facebook.ads.redexgen.core.AbstractC1048Td.A0t;
    }

    public static void A02(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.C1035Sq c1035Sq, int i, java.lang.String str, long j) {
        if (!A06(t8)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A00(120, 14, 85), c1035Sq.A01);
            jSONObject.put(A00(134, 13, 46), c1035Sq.A02);
            if (j > 0) {
                jSONObject.put(A00(191, 9, 73), com.facebook.ads.redexgen.core.Y1.A07(java.lang.System.currentTimeMillis() - j));
            }
            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(str);
            c1049Te.A07(jSONObject);
            c1049Te.A05(1);
            t8.A08().ABD(A00(154, 5, 84), i, c1049Te);
        } catch (java.lang.Throwable deLogException) {
            t8.A08().A4I(deLogException);
        }
    }

    public static void A03(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.C1040Sv c1040Sv, java.lang.String str, int i, java.lang.String str2, java.lang.Long l, java.lang.Long l2) {
        if (A06(t8)) {
            A05(t8, c1040Sv.A06, c1040Sv.A07, c1040Sv.A08, A00(186, 5, 71), str, i, str2, l, l2, null);
        }
    }

    public static void A04(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.C1044Sz c1044Sz, boolean z) {
        if (!A06(t8)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A00(120, 14, 85), c1044Sz.A01);
            jSONObject.put(A00(134, 13, 46), c1044Sz.A03);
            jSONObject.put(A00(104, 16, 23), c1044Sz.A02);
            jSONObject.put(A00(159, 13, 117), c1044Sz.A00);
            if (com.facebook.ads.redexgen.core.C1086Up.A2T(t8)) {
                jSONObject.put(A00(200, 3, 106), c1044Sz.A04);
            }
            java.lang.String A002 = z ? A00(61, 10, 6) : A00(71, 11, 23);
            int i = z ? A05 : A06;
            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A002);
            c1049Te.A07(jSONObject);
            c1049Te.A05(1);
            t8.A08().ABD(A00(154, 5, 84), i, c1049Te);
        } catch (java.lang.Throwable th) {
            t8.A08().A4I(th);
        }
    }

    public static void A05(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.String str6, java.lang.Long l, java.lang.Long l2, java.lang.Integer num) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 16), str6);
            }
            if (l != null) {
                jSONObject.put(A00(82, 22, 75), java.lang.String.valueOf(l));
            }
            if (l2 != null) {
                jSONObject.put(A00(191, 9, 73), java.lang.String.valueOf(l2));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 123), java.lang.String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 117), str5);
            if (com.facebook.ads.redexgen.core.C1086Up.A2T(t8)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            java.lang.String A002 = A00(19, 19, 14);
            if (i == A03) {
                A002 = A00(38, 23, 79);
            } else if (i == A01) {
                A002 = A00(0, 19, 39);
            }
            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A002);
            c1049Te.A07(jSONObject);
            c1049Te.A05(1);
            t8.A08().ABD(A00(154, 5, 84), i, c1049Te);
        } catch (java.lang.Throwable th) {
            t8.A08().A4I(th);
        }
    }

    public static boolean A06(com.facebook.ads.redexgen.core.T8 t8) {
        int A062;
        if (t8.A05().AAO()) {
            A062 = 1;
        } else {
            A062 = com.facebook.ads.redexgen.core.AbstractC1088Ur.A06(t8);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || t8.A09().A00() <= 1.0d / ((double) A062);
    }
}
