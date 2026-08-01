package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class G0 implements InterfaceC2693cr {
    public final /* synthetic */ C2006Fy A00;

    public G0(C2006Fy c2006Fy) {
        this.A00 = c2006Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2693cr
    public final void AGM(int i) {
        boolean A0H;
        this.A00.A0C(i, true);
        A0H = this.A00.A0H();
        if (A0H) {
            this.A00.A07();
        } else {
            this.A00.A09(i);
        }
    }
}
