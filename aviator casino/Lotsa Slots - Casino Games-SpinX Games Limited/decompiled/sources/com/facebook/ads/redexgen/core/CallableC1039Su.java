package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Su, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1039Su implements java.util.concurrent.Callable<java.lang.Boolean> {
    public static byte[] A02;
    public final com.facebook.ads.redexgen.core.C1038St A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1042Sx A01;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, -31, -25, -38, -43, -42, -32};
    }

    public CallableC1039Su(com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.C1038St c1038St) {
        this.A01 = c1042Sx;
        this.A00 = c1038St;
    }

    private final java.lang.Boolean A00() {
        java.lang.String A01;
        com.facebook.ads.redexgen.core.T8 t8;
        com.facebook.ads.redexgen.core.T8 t82;
        com.facebook.ads.redexgen.core.LR A03;
        java.util.Map map;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        try {
            android.net.TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                A01 = A01(0, 6, 72);
            } else {
                A01 = A01(6, 5, 72);
            }
            java.lang.String str = this.A00.A08;
            java.lang.String creativeType = this.A00.A07;
            com.facebook.ads.redexgen.core.LX lx = new com.facebook.ads.redexgen.core.LX(str, creativeType, this.A00.A06, A01, this.A00.A02, this.A00.A05);
            lx.A04 = this.A00.A03;
            lx.A02 = this.A00.A01;
            lx.A05 = this.A00.A04;
            t8 = this.A01.A04;
            if (com.facebook.ads.redexgen.core.T0.A06(t8)) {
                map = com.facebook.ads.redexgen.core.C1042Sx.A0F;
                map.put(this.A00.A08, lx);
            }
            t82 = this.A01.A04;
            A03 = com.facebook.ads.redexgen.core.C1042Sx.A03(t82.A02());
            return java.lang.Boolean.valueOf(A03.AIg(lx) != null);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }
}
