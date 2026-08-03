package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Si, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1027Si {
    public static com.facebook.ads.redexgen.core.InterfaceC1028Sj A00;
    public static boolean A01;
    public static byte[] A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 18);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (com.facebook.ads.redexgen.core.C1027Si.class) {
            if (A00 == null) {
                return;
            }
            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A00.AIb());
            c1049Te.A05(1);
            com.facebook.ads.redexgen.core.C1632ge A002 = com.facebook.ads.redexgen.core.T7.A00();
            if (A002 != null) {
                A002.A08().ABC(A00(0, 9, 49), 3401, c1049Te);
            }
            A00.reset();
        }
    }

    public static void A03(long j) {
        if (j > 0) {
            A00 = new com.facebook.ads.redexgen.core.C1645gr();
            new com.facebook.ads.redexgen.core.C1029Sk(j);
        }
    }
}
