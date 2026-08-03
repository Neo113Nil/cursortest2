package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1810jm extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1809jl A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C1810jm(com.facebook.ads.redexgen.core.C1809jl c1809jl) {
        this.A00 = c1809jl;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.AbstractC1282ay abstractC1282ay;
        com.facebook.ads.redexgen.core.C1811jn c1811jn;
        c1636gi = this.A00.A03;
        c1636gi.A0F().AKw();
        abstractC1282ay = this.A00.A05;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(A00(0, 11, 29));
        c1811jn = this.A00.A00;
        abstractC1282ay.loadUrl(append.append(c1811jn.A03()).toString());
    }
}
