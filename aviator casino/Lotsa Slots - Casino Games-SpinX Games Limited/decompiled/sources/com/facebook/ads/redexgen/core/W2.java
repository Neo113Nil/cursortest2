package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class W2 implements com.facebook.ads.redexgen.core.InterfaceC1292b8 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1120Vz A00;

    public W2(com.facebook.ads.redexgen.core.C1120Vz c1120Vz) {
        this.A00 = c1120Vz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1292b8
    public final void AE7(com.facebook.ads.redexgen.core.C1291b7 c1291b7) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        com.facebook.ads.redexgen.core.VV vv;
        com.facebook.ads.redexgen.core.VV vv2;
        atomicBoolean = this.A00.A0G;
        atomicBoolean.set(c1291b7.A00() != null);
        atomicBoolean2 = this.A00.A0H;
        if (atomicBoolean2.get()) {
            vv = this.A00.A05;
            if (vv != null) {
                vv2 = this.A00.A05;
                vv2.AFB(c1291b7.A00() != null);
            }
        }
    }
}
