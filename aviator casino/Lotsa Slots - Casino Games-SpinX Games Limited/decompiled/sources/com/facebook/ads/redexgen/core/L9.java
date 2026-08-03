package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class L9 {
    public static byte[] A02;
    public final java.util.List<com.facebook.ads.redexgen.core.C2196qI> A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0743Hd[] A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, -100, -92, -113, -102, -105, -110, 78, -111, -102, -99, -95, -109, -110, 78, -111, -113, -98, -94, -105, -99, -100, 78, -101, -105, -101, -109, 78, -94, -89, -98, -109, 78, -98, -96, -99, -92, -105, -110, -109, -110, 104, 78, -123, -108, -108, -112, -115, -121, -123, -104, -115, -109, -110, 83, -121, -119, -123, 81, 90, 84, 92, -49, -34, -34, -38, -41, -47, -49, -30, -41, -35, -36, -99, -47, -45, -49, -101, -91, -98, -90};
    }

    public L9(java.util.List<com.facebook.ads.redexgen.core.C2196qI> list) {
        this.A00 = list;
        this.A01 = new com.facebook.ads.redexgen.core.InterfaceC0743Hd[list.size()];
    }

    public final void A02(long j, com.facebook.ads.redexgen.core.C04434v c04434v) {
        com.facebook.ads.redexgen.core.H3.A03(j, c04434v, this.A01);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(com.facebook.ads.redexgen.core.HA ha, com.facebook.ads.redexgen.core.LG lg) {
        for (int i = 0; i < i; i++) {
            lg.A05();
            com.facebook.ads.redexgen.core.InterfaceC0743Hd AKS = ha.AKS(lg.A03(), 3);
            com.facebook.ads.redexgen.core.C2196qI c2196qI = this.A00.get(i);
            java.lang.String str = c2196qI.A0W;
            com.facebook.ads.redexgen.core.AbstractC04203y.A09(A00(43, 19, 7).equals(str) || A00(62, 19, 81).equals(str), A00(0, 43, 17) + str);
            com.facebook.ads.redexgen.core.C03872p A11 = new com.facebook.ads.redexgen.core.C03872p().A0y(c2196qI.A0T != null ? c2196qI.A0T : lg.A04()).A11(str);
            int i2 = c2196qI.A0H;
            com.facebook.ads.redexgen.core.C03872p A10 = A11.A0n(i2).A10(c2196qI.A0V);
            int i3 = c2196qI.A03;
            AKS.A6e(A10.A0Z(i3).A12(c2196qI.A0X).A14());
            this.A01[i] = AKS;
        }
    }
}
