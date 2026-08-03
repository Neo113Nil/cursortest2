package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static com.facebook.ads.redexgen.core.YS A02;
    public final com.facebook.ads.redexgen.core.C0959Pp A00;
    public final com.facebook.ads.redexgen.core.YU A01;

    public YS(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.util.concurrent.Executor executor, com.facebook.ads.redexgen.core.C1067Tw c1067Tw) {
        this.A01 = new com.facebook.ads.redexgen.core.YU(c1636gi);
        this.A00 = new com.facebook.ads.redexgen.core.C0959Pp(executor, c1067Tw, c1636gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.util.concurrent.Executor executor, com.facebook.ads.redexgen.core.C1067Tw c1067Tw) {
        if (!com.facebook.ads.redexgen.core.C1086Up.A1c(c1636gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new com.facebook.ads.redexgen.core.YS(c1636gi, executor, c1067Tw);
            A02.A00();
        } else {
            A02.A02(c1067Tw);
        }
    }

    private void A02(com.facebook.ads.redexgen.core.C1067Tw c1067Tw) {
        this.A00.A07(c1067Tw);
    }
}
