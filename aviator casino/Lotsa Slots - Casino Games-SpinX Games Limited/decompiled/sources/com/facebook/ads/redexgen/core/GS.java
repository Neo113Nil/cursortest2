package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GS implements com.facebook.ads.redexgen.core.InterfaceC1151Xh {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4V A00;

    public GS(com.facebook.ads.redexgen.core.C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1151Xh
    public final void AF5(java.lang.String str) {
        android.os.Handler handler;
        handler = this.A00.A0G;
        handler.postDelayed(new com.facebook.ads.redexgen.core.RunnableC1461ds(this), 2000L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1151Xh
    public final void AF6(java.lang.String str) {
        this.A00.A0H(com.facebook.ads.redexgen.core.VH.A0c);
    }
}
