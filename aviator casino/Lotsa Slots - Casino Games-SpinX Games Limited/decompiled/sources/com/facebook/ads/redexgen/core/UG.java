package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class UG {
    public static com.facebook.ads.redexgen.core.UG A00 = new com.facebook.ads.redexgen.core.UG();

    public static com.facebook.ads.redexgen.core.UG A00() {
        return A00;
    }

    public final com.facebook.ads.redexgen.core.ZJ A01(com.facebook.ads.redexgen.core.T8 t8, boolean z) {
        return new com.facebook.ads.redexgen.core.ZJ(t8, z, new com.facebook.ads.redexgen.core.C1032Sn());
    }

    public final java.util.Map<java.lang.String, java.lang.String> A02(com.facebook.ads.redexgen.core.T8 t8) {
        try {
            return A01(t8, false).A06();
        } catch (java.lang.Throwable th) {
            t8.A08().A4I(th);
            return com.facebook.ads.redexgen.core.U8.A01(t8);
        }
    }
}
