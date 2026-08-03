package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class JC extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1412d4 A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-87, -68, -73, -72, -62, 115, -63, -72, -55, -72, -59, 115, -58, -57, -76, -59, -57, -72, -73, 115, -61, -65, -76, -52, -68, -63, -70};
    }

    public JC(com.facebook.ads.redexgen.core.C1412d4 c1412d4) {
        this.A00 = c1412d4;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        boolean z;
        z = this.A00.A04;
        if (z) {
            return;
        }
        this.A00.A0I(A00(0, 27, 64));
    }
}
