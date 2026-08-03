package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.he, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1694he extends com.facebook.ads.redexgen.core.PL {
    public static java.lang.String[] A01 = {"TEi6qE8rkCQGgGy4v7NzSxsVq0pzva7O", "YDOvw0rnr4UKw3Mnxoslotwc24p8", "a0zjiBNZeYiCSuvwyHtYeell8KyTQ5xY", "ogjV6WpDB35FLp8RKY", "WANqVRIVKxhPnPWopei7e1k0CZWy62T", "aZZWj5Yt51SqLR33GVZjsdPHZCc7cpWa", "7MlacYU9Pwo9bfliYZC3slRrct3tH7Ko", "0XE4m45s2Z74YdVCvJuFI2R02XTQtmXa"};
    public final com.facebook.ads.redexgen.core.C1691hb A00;

    public C1694he(com.facebook.ads.redexgen.core.C1691hb c1691hb) {
        this.A00 = c1691hb;
    }

    @Override // com.facebook.ads.redexgen.core.PL
    public final void A08(android.view.View view, com.facebook.ads.redexgen.core.Q6 q6) {
        super.A08(view, q6);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            com.facebook.ads.redexgen.core.R2 layoutManager = this.A00.A01.getLayoutManager();
            if (A01[1].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "lLG2rM4BR6TSMRI6WEis0bH1e3aTZeM";
            layoutManager.A1E(view, q6);
        }
    }

    @Override // com.facebook.ads.redexgen.core.PL
    public final boolean A09(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1Z(view, i, bundle);
        }
        return false;
    }
}
