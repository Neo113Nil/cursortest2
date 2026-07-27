package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2127Kq extends AbstractRunnableC2417Wc {
    public final /* synthetic */ AbstractC2615bb A00;

    public C2127Kq(AbstractC2615bb abstractC2615bb) {
        this.A00 = abstractC2615bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC2615bb abstractC2615bb = this.A00;
            i = this.A00.A08;
            abstractC2615bb.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC2615bb abstractC2615bb2 = this.A00;
            runnable = this.A00.A0A;
            abstractC2615bb2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
