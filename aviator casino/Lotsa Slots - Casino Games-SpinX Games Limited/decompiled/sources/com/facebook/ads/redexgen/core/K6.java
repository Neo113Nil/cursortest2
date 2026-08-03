package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class K6 extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0799Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(com.facebook.ads.redexgen.core.C0799Ji c0799Ji, boolean z) {
        this.A00 = c0799Ji;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C1353c7 c1353c7;
        c1353c7 = this.A00.A0b;
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0B = c1353c7.A0B();
        if (A0B == null) {
            return;
        }
        A0B.setPageDetailsVisible((this.A01 || A0B.A0E()) ? false : true);
        A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
