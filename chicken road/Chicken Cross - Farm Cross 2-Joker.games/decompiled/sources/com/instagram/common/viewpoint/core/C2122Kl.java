package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2122Kl extends AbstractRunnableC2417Wc {
    public final /* synthetic */ AbstractC2615bb A00;

    public C2122Kl(AbstractC2615bb abstractC2615bb) {
        this.A00 = abstractC2615bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC2615bb abstractC2615bb = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC2615bb.postOnAnimationDelayed(runnable, i);
    }
}
