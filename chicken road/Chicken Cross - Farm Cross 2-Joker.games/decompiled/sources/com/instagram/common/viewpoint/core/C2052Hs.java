package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Hs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2052Hs extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C5F A00;

    public C2052Hs(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C2679cd c2679cd;
        c2679cd = this.A00.A0H;
        YB.A0F(1000, c2679cd);
        this.A00.postDelayed(this, 2000L);
    }
}
