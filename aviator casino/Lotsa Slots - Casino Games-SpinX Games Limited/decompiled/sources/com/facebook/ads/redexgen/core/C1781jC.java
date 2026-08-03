package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1781jC implements com.facebook.ads.redexgen.core.O3 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0914Nu A00;

    public C1781jC(com.facebook.ads.redexgen.core.C0914Nu c0914Nu) {
        this.A00 = c0914Nu;
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFF(com.facebook.ads.AdError adError) {
        com.facebook.ads.redexgen.core.InterfaceC0913Nt interfaceC0913Nt;
        interfaceC0913Nt = this.A00.A04;
        interfaceC0913Nt.ACo(com.facebook.ads.AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFG() {
        com.facebook.ads.redexgen.core.InterfaceC0913Nt interfaceC0913Nt;
        interfaceC0913Nt = this.A00.A04;
        interfaceC0913Nt.ACp();
    }
}
