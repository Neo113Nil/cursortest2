package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1041Sw implements java.util.concurrent.Callable<java.lang.Boolean> {
    public static byte[] A02;
    public final com.facebook.ads.redexgen.core.C1040Sv A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1042Sx A01;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 2);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-35, -31, -43, -37, -39};
    }

    public CallableC1041Sw(com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.C1040Sv c1040Sv) {
        this.A01 = c1042Sx;
        this.A00 = c1040Sv;
    }

    private final java.lang.Boolean A00() {
        com.facebook.ads.redexgen.core.T8 t8;
        boolean z;
        com.facebook.ads.redexgen.core.C1043Sy c1043Sy;
        boolean z2;
        boolean z3;
        com.facebook.ads.redexgen.core.T8 t82;
        com.facebook.ads.redexgen.core.LR A03;
        java.util.Map map;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        try {
            android.net.TrafficStats.setThreadStatsTag(61453);
            com.facebook.ads.redexgen.core.LX lx = new com.facebook.ads.redexgen.core.LX(this.A00.A08, this.A00.A07, this.A00.A06, A01(0, 5, 114), this.A00.A02, this.A00.A03);
            lx.A01 = this.A00.A05;
            lx.A00 = this.A00.A04;
            t8 = this.A01.A04;
            if (com.facebook.ads.redexgen.core.T0.A06(t8)) {
                map = com.facebook.ads.redexgen.core.C1042Sx.A0F;
                map.put(this.A00.A08, lx);
            }
            z = this.A01.A08;
            boolean precacheResult = false;
            if (!z) {
                c1043Sy = this.A01.A03;
                if (c1043Sy.A0F(this.A00) != null) {
                    precacheResult = true;
                }
            } else {
                t82 = this.A01.A04;
                A03 = com.facebook.ads.redexgen.core.C1042Sx.A03(t82.A02());
                precacheResult = A03.AIe(lx, false).A01();
            }
            com.facebook.ads.redexgen.core.T3 t3 = this.A00.A01;
            if (t3 != null && t3.A02()) {
                int A00 = t3.A00();
                int A01 = t3.A01();
                if (A00 <= 0 || A01 <= 0) {
                    z2 = this.A01.A08;
                    if (z2) {
                        A04(this.A00.A08, lx);
                    } else {
                        A03(this.A00.A04, this.A00.A05);
                    }
                } else {
                    z3 = this.A01.A08;
                    if (z3) {
                        lx.A00 = A00;
                        lx.A01 = A01;
                        A04(this.A00.A08, lx);
                    } else {
                        A03(A00, A01);
                    }
                }
            }
            return java.lang.Boolean.valueOf(precacheResult);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }

    private void A03(int i, int i2) {
        com.facebook.ads.redexgen.core.C1043Sy c1043Sy;
        com.facebook.ads.redexgen.core.T8 t8;
        java.util.Map map;
        c1043Sy = this.A01.A03;
        t8 = this.A01.A04;
        android.graphics.Bitmap A0G = c1043Sy.A0G(t8, this.A00.A08, i, i2, this.A00.A02);
        if (A0G == null) {
            return;
        }
        map = this.A01.A07;
        map.put(this.A00.A08, A0G);
    }

    private void A04(java.lang.String str, com.facebook.ads.redexgen.core.LX lx) {
        com.facebook.ads.redexgen.core.T8 t8;
        com.facebook.ads.redexgen.core.LR A03;
        java.util.Map map;
        t8 = this.A01.A04;
        A03 = com.facebook.ads.redexgen.core.C1042Sx.A03(t8.A02());
        android.graphics.Bitmap A00 = A03.AIe(lx, true).A00();
        if (A00 == null) {
            return;
        }
        map = this.A01.A07;
        map.put(str, A00);
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
