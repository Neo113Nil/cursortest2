package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3075jC implements O3 {
    public final /* synthetic */ C2208Nu A00;

    public C3075jC(C2208Nu c2208Nu) {
        this.A00 = c2208Nu;
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFF(AdError adError) {
        InterfaceC2207Nt interfaceC2207Nt;
        interfaceC2207Nt = this.A00.A04;
        interfaceC2207Nt.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFG() {
        InterfaceC2207Nt interfaceC2207Nt;
        interfaceC2207Nt = this.A00.A04;
        interfaceC2207Nt.ACp();
    }
}
