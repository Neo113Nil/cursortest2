package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Pc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0948Pc implements com.facebook.ads.redexgen.core.InterfaceC1004Rk {
    public final /* synthetic */ com.facebook.ads.redexgen.core.PZ A00;

    public C0948Pc(com.facebook.ads.redexgen.core.PZ pz) {
        this.A00 = pz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1004Rk
    public final boolean AAI() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
