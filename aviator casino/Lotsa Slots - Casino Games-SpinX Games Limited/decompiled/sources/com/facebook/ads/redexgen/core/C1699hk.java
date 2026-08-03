package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1699hk implements com.facebook.ads.redexgen.core.InterfaceC0990Qw {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7M A00;

    public C1699hk(com.facebook.ads.redexgen.core.C7M c7m) {
        this.A00 = c7m;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0990Qw
    public final void ACv(com.facebook.ads.redexgen.core.RK rk) {
        boolean A0G;
        rk.A0d(true);
        if (rk.A06 != null && rk.A07 == null) {
            rk.A06 = null;
        }
        rk.A07 = null;
        A0G = rk.A0G();
        if (!A0G && !this.A00.A1x(rk.A0H) && rk.A0i()) {
            this.A00.removeDetachedView(rk.A0H, false);
        }
    }
}
