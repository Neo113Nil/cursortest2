package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05007a extends com.facebook.ads.redexgen.core.AbstractC1771j0 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C05007a(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.O7 o7) {
        super(c1636gi, o7);
    }

    private com.facebook.ads.redexgen.core.C1760ip A00(java.lang.Runnable runnable) {
        return new com.facebook.ads.redexgen.core.C1760ip(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final void A0P() {
        com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh = (com.facebook.ads.redexgen.core.AbstractC1805jh) this.A01;
        abstractC1805jh.A00(this.A08.A00);
        abstractC1805jh.A01(this.A08.A01);
        abstractC1805jh.A0J();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final void A0R(com.facebook.ads.redexgen.core.N1 n1, com.facebook.ads.redexgen.core.C1067Tw c1067Tw, com.facebook.ads.redexgen.core.C1065Tu c1065Tu, com.facebook.ads.redexgen.core.O8 o8) {
        com.facebook.ads.redexgen.core.C05227w c05227w = (com.facebook.ads.redexgen.core.C05227w) n1;
        com.facebook.ads.redexgen.core.C1764it c1764it = new com.facebook.ads.redexgen.core.C1764it(this, o8, c05227w);
        if (com.facebook.ads.redexgen.core.C1086Up.A2f(this.A0B)) {
            android.os.Handler A0H = A0H();
            com.facebook.ads.redexgen.core.C1068Tx A05 = c1067Tw.A05();
            java.lang.String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            A0H.postDelayed(c1764it, A05.A05());
        }
        c05227w.A0K(this.A0B, A00(c1764it), o8, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0a(com.facebook.ads.RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A8k() == com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO) {
                com.facebook.ads.redexgen.core.AbstractC1805jh rewardedVideoAdapter = (com.facebook.ads.redexgen.core.AbstractC1805jh) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new java.lang.IllegalStateException(A01(0, 34, 82));
        }
        throw new java.lang.IllegalStateException(A01(34, 33, 34));
    }
}
