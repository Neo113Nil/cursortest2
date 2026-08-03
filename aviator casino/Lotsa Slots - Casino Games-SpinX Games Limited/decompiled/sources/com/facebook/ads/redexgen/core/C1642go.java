package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.go, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1642go extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1641gn A00;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{com.google.common.base.Ascii.SO, 44, 46, 51, 48, -21, 49, 44, 52, 55, -7, -110, -80, -78, -73, -76, 111, -62, -60, -78, -78, -76, -62, -62, 125};
    }

    public C1642go(com.facebook.ads.redexgen.core.C1641gn c1641gn, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.A00 = c1641gn;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.T8 t8;
        long j;
        com.facebook.ads.redexgen.core.T8 t82;
        long j2;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(com.facebook.ads.redexgen.core.VH.A0H);
                t82 = this.A00.A02.A04;
                com.facebook.ads.redexgen.core.C1035Sq c1035Sq = this.A00.A01;
                int i = com.facebook.ads.redexgen.core.T0.A00;
                j2 = this.A00.A02.A00;
                com.facebook.ads.redexgen.core.T0.A02(t82, c1035Sq, i, A00(11, 14, 1), j2);
                this.A00.A02.A0U();
                this.A00.A00.ADT();
                return;
            }
            this.A00.A02.A0I(com.facebook.ads.redexgen.core.VH.A0G);
            t8 = this.A00.A02.A04;
            com.facebook.ads.redexgen.core.C1035Sq c1035Sq2 = this.A00.A01;
            int i2 = com.facebook.ads.redexgen.core.T0.A04;
            j = this.A00.A02.A00;
            com.facebook.ads.redexgen.core.T0.A02(t8, c1035Sq2, i2, A00(0, 11, 125), j);
            this.A00.A02.A0V();
            this.A00.A00.ADL();
        }
    }
}
