package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0833Kq extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1321bb A00;

    public C0833Kq(com.facebook.ads.redexgen.core.AbstractC1321bb abstractC1321bb) {
        this.A00 = abstractC1321bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        java.lang.Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            com.facebook.ads.redexgen.core.AbstractC1321bb abstractC1321bb = this.A00;
            i = this.A00.A08;
            abstractC1321bb.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            com.facebook.ads.redexgen.core.AbstractC1321bb abstractC1321bb2 = this.A00;
            runnable = this.A00.A0A;
            abstractC1321bb2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
