package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1605gD {
    public static com.facebook.ads.redexgen.core.InterfaceC1585ft A00;
    public static byte[] A01;
    public static final java.util.Set<java.lang.String> A02;
    public static final java.util.Set<java.lang.String> A03;
    public static final java.util.concurrent.atomic.AtomicBoolean A04;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{51, 114, 121, 9, 84, 69, 113, 55, 55, 120, 5, 112, 1, com.google.common.base.Ascii.EM, 51, com.google.common.base.Ascii.DC2, 114, 47, com.google.common.base.Ascii.CAN, 117, 44, 46, 36, 43, 114, 40, 55, 48, 114, com.google.common.base.Ascii.NAK, 47, 51, 43, 125, 74, 63, 96, 71, 122, 102, 66, Byte.MAX_VALUE, 106, 97, 126, 98, 39, 91, 97, 106, 72, 100, 122, 126, 62, 101, 90, 100, 35, 117, 94, Byte.MAX_VALUE, 49, 6, 81, 35, 43, 66, 103, 86, 39, 106, 95, 80, 119, Byte.MAX_VALUE, 122, 39, 97, 99, 103, 106, 98, 82, 86, 112, 105, 75, 92, 118, 82, 46, com.google.common.base.Ascii.EM, 88, 115, 98, 97, 121, 100, 125, Byte.MAX_VALUE, 120, 113, 54, 116, 115, 112, 121, 100, 115, 54, Byte.MAX_VALUE, 120, Byte.MAX_VALUE, 98, 55, 83, 81, 83, 66, kotlin.io.encoding.Base64.padSymbol, 106, 101, 81, 105, 111, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 109, 32, Byte.MAX_VALUE, 106, 94, 89, 111, 101, 114, 94, 67, 62, 98, 123, 108, 70, 54, 1, com.google.common.base.Ascii.SI, 7, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, 2, com.google.common.base.Ascii.SI, 0, com.google.common.base.Ascii.VT, 49, 3, 1, 10, com.google.common.base.Ascii.VT, 49, 1, 0, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, 7, 4, com.google.common.base.Ascii.FS, 1, com.google.common.base.Ascii.CAN, 33, 58, com.google.common.base.Ascii.SI, 103, com.google.common.base.Ascii.DC2, 7, 59, 7, 63, com.google.common.base.Ascii.SYN, 108, 5, 96, 3, 3, 0, 49, com.google.common.base.Ascii.SYN, 37, com.google.common.base.Ascii.SUB, 39, 19, com.google.common.base.Ascii.GS, 109, 57, 51, 4, 104, 95};
    }

    static {
        A07();
        A02 = new java.util.HashSet();
        A03 = new java.util.HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(168, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(116, 29, 22));
        A04 = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public static com.facebook.ads.redexgen.core.InterfaceC1587fv A00(com.facebook.ads.redexgen.core.T8 t8) {
        return A03(true, t8);
    }

    public static com.facebook.ads.redexgen.core.InterfaceC1587fv A01(com.facebook.ads.redexgen.core.T8 t8) {
        return A02(true, t8);
    }

    public static com.facebook.ads.redexgen.core.InterfaceC1587fv A02(boolean z, com.facebook.ads.redexgen.core.T8 t8) {
        com.facebook.ads.redexgen.core.C1591fz c1591fz = new com.facebook.ads.redexgen.core.C1591fz();
        com.facebook.ads.redexgen.core.C1594g2 networkModuleRequestConfigurationBuilder = A04(t8);
        if (!A0B(t8)) {
            c1591fz.A02(A03);
            c1591fz.A01(A02);
        }
        if (com.facebook.ads.redexgen.core.XD.A04()) {
            networkModuleRequestConfigurationBuilder.A08(com.facebook.ads.redexgen.core.XD.A02());
        }
        com.facebook.ads.redexgen.core.C0632Cv A002 = com.facebook.ads.redexgen.core.AbstractC1589fx.A00();
        com.facebook.ads.redexgen.core.C1591fz networkModuleConfigurationBuilder = c1591fz.A00(networkModuleRequestConfigurationBuilder.A09());
        return A002.A00(networkModuleConfigurationBuilder.A03(z).A04(t8.A05().AAO()).A05(), t8.A08(), com.facebook.ads.redexgen.core.YG.A01());
    }

    public static com.facebook.ads.redexgen.core.InterfaceC1587fv A03(boolean z, com.facebook.ads.redexgen.core.T8 t8) {
        return com.facebook.ads.redexgen.core.AbstractC1589fx.A00().A00(new com.facebook.ads.redexgen.core.C1591fz().A03(z).A00(A04(t8).A09()).A04(t8.A05().AAO()).A05(), t8.A08(), com.facebook.ads.redexgen.core.YG.A01());
    }

    public static com.facebook.ads.redexgen.core.C1594g2 A04(com.facebook.ads.redexgen.core.T8 t8) {
        A08(t8);
        com.facebook.ads.redexgen.core.C1594g2 c1594g2 = new com.facebook.ads.redexgen.core.C1594g2();
        if (A0B(t8) || com.facebook.ads.redexgen.core.XD.A04()) {
            c1594g2.A02(360000).A04(com.unity3d.services.UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        } else {
            c1594g2.A02(com.facebook.ads.redexgen.core.C1086Up.A09(t8)).A04(com.facebook.ads.redexgen.core.C1086Up.A0B(t8));
        }
        c1594g2.A03(com.facebook.ads.redexgen.core.C1086Up.A0A(t8)).A05(com.facebook.ads.redexgen.core.C1086Up.A0C(t8)).A06(com.facebook.ads.redexgen.core.C1086Up.A0D(t8));
        synchronized (com.facebook.ads.redexgen.core.C1605gD.class) {
            if (A00 != null && (A00 instanceof com.facebook.ads.redexgen.core.InterfaceC1585ft)) {
                c1594g2.A07(A00);
            }
        }
        return c1594g2;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(com.facebook.ads.redexgen.core.T8 t8) {
        if (!A04.get()) {
            t8.A08().ABC(A05(161, 7, 110), com.facebook.ads.redexgen.core.AbstractC1048Td.A21, new com.facebook.ads.redexgen.core.C1049Te(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(com.facebook.ads.redexgen.core.InterfaceC1585ft interfaceC1585ft) {
        synchronized (com.facebook.ads.redexgen.core.C1605gD.class) {
            A00 = interfaceC1585ft;
        }
    }

    public static boolean A0A(com.facebook.ads.redexgen.core.T8 t8) {
        return android.provider.Settings.Global.getInt(t8.getContentResolver(), A05(145, 16, 115), 0) != 0;
    }

    public static boolean A0B(com.facebook.ads.redexgen.core.T8 t8) {
        java.lang.String A9Q = t8.A05().A9Q();
        if (!android.text.TextUtils.isEmpty(A9Q)) {
            java.lang.String urlPrefix = A05(3, 3, 58);
            if (!A9Q.endsWith(urlPrefix)) {
                java.lang.String urlPrefix2 = A05(0, 3, 0);
                if (A9Q.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
