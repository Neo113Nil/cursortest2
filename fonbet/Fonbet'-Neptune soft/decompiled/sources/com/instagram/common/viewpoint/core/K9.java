package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class K9 extends AbstractRunnableC0840Vt {
    public final /* synthetic */ AbstractC0958aB A00;

    public K9(AbstractC0958aB abstractC0958aB) {
        this.A00 = abstractC0958aB;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC0958aB abstractC0958aB = this.A00;
            i = this.A00.A08;
            abstractC0958aB.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC0958aB abstractC0958aB2 = this.A00;
            runnable = this.A00.A0A;
            abstractC0958aB2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
