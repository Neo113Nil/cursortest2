package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class G0 implements com.facebook.ads.redexgen.core.InterfaceC1399cr {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0712Fy A00;

    public G0(com.facebook.ads.redexgen.core.C0712Fy c0712Fy) {
        this.A00 = c0712Fy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1399cr
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
