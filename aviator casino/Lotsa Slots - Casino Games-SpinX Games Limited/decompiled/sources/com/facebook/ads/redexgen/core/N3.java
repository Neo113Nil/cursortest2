package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class N3 {
    public static byte[] A04;
    public boolean A00;

    @javax.annotation.Nullable
    public final com.facebook.ads.redexgen.core.N4 A01;
    public final com.facebook.ads.redexgen.core.C1636gi A02;
    public final com.facebook.ads.redexgen.core.C1581fp A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, 37, 39, com.google.common.base.Ascii.SUB, 40, 40, com.google.common.base.Ascii.RS, 36, 35, -43, 33, 36, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.EM};
    }

    public abstract void A08(java.util.Map<java.lang.String, java.lang.String> map);

    public N3(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.N4 n4, com.facebook.ads.redexgen.core.C1581fp c1581fp) {
        this.A02 = c1636gi;
        this.A01 = n4;
        this.A03 = c1581fp;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        java.util.Map<java.lang.String, java.lang.String> extraData = new com.facebook.ads.redexgen.core.C1293b9().A03(this.A03).A05();
        A08(extraData);
        this.A00 = true;
        com.facebook.ads.redexgen.core.XI.A04(this.A02, A00(0, 17, 60));
        com.facebook.ads.redexgen.core.N4 n4 = this.A01;
    }
}
