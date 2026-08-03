package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0714Ga extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04454x A00;

    public C0714Ga(com.facebook.ads.redexgen.core.C04454x c04454x) {
        this.A00 = c04454x;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3;
        int closeButtonStyle;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c32;
        abstractC1349c3 = this.A00.A00;
        if (abstractC1349c3 != null) {
            abstractC1349c32 = this.A00.A00;
            abstractC1349c32.A1F();
        }
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A00.A09;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC1171Yb.setToolbarActionMode(closeButtonStyle);
        this.A00.A09.A0A();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
