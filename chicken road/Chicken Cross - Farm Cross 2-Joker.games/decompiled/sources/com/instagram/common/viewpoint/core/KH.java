package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends AbstractRunnableC2417Wc {
    public final /* synthetic */ KE A00;

    public KH(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        boolean z;
        C2679cd c2679cd;
        z = this.A00.A0Y;
        if (!z) {
            c2679cd = this.A00.A0K;
            YB.A0F(1000, c2679cd);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
