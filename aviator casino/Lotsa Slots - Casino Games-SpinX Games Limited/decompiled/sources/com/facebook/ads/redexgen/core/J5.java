package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class J5 extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1412d4 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4A A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    public J5(com.facebook.ads.redexgen.core.C1412d4 c1412d4, com.facebook.ads.redexgen.core.C4A c4a) {
        this.A00 = c1412d4;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
        c0673Ek = this.A00.A0D;
        if (c0673Ek.getState() != com.facebook.ads.redexgen.core.EnumC1578fm.A02) {
            return;
        }
        c0673Ek2 = this.A00.A0D;
        if (c0673Ek2.getCurrentPositionInMillis() != A00()) {
            return;
        }
        this.A00.A0I(A00(0, 22, 47));
    }
}
