package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class W5 implements com.facebook.ads.redexgen.core.InterfaceC1519ep {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1120Vz A00;

    public W5(com.facebook.ads.redexgen.core.C1120Vz c1120Vz) {
        this.A00 = c1120Vz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1519ep
    public final void AGT() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.facebook.ads.redexgen.core.VV vv;
        com.facebook.ads.redexgen.core.VV vv2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0H;
        atomicBoolean.set(true);
        vv = this.A00.A05;
        if (vv != null) {
            vv2 = this.A00.A05;
            atomicBoolean2 = this.A00.A0G;
            vv2.AFB(atomicBoolean2.get());
        }
    }
}
