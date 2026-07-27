package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3074jB implements SM {
    public final /* synthetic */ C2208Nu A00;

    public C3074jB(C2208Nu c2208Nu) {
        this.A00 = c2208Nu;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        InterfaceC2207Nt interfaceC2207Nt;
        interfaceC2207Nt = this.A00.A04;
        interfaceC2207Nt.ACp();
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        InterfaceC2207Nt interfaceC2207Nt;
        interfaceC2207Nt = this.A00.A04;
        interfaceC2207Nt.ACo(AdError.CACHE_ERROR);
    }
}
