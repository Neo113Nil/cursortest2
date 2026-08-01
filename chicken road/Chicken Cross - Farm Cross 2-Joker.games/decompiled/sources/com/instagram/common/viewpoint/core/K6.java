package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C2093Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C2093Ji c2093Ji, boolean z) {
        this.A00 = c2093Ji;
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C2647c7 c2647c7;
        c2647c7 = this.A00.A0b;
        AbstractC2465Yb A0B = c2647c7.A0B();
        if (A0B == null) {
            return;
        }
        A0B.setPageDetailsVisible((this.A01 || A0B.A0E()) ? false : true);
        A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
