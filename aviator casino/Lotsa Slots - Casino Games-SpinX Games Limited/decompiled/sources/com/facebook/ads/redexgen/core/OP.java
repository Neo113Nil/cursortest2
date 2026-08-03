package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @javax.annotation.Nullable
    public static com.facebook.ads.redexgen.core.OO A00;
    public static final java.util.concurrent.atomic.AtomicBoolean A01 = new java.util.concurrent.atomic.AtomicBoolean();

    public static com.facebook.ads.redexgen.core.OO A00(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (A00 == null) {
            A00 = new com.facebook.ads.redexgen.core.OO(c1632ge);
        }
        return A00;
    }

    public static void A01(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (com.facebook.ads.redexgen.core.AbstractC1089Us.A0F(c1632ge)) {
            A03(c1632ge);
        }
    }

    public static void A02(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (com.facebook.ads.redexgen.core.AbstractC1089Us.A0E(c1632ge)) {
            A03(c1632ge);
        }
    }

    public static void A03(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (A01.compareAndSet(false, true)) {
            com.facebook.ads.redexgen.core.Y4.A01.execute(new com.facebook.ads.redexgen.core.C1735iN(c1632ge));
        }
    }
}
