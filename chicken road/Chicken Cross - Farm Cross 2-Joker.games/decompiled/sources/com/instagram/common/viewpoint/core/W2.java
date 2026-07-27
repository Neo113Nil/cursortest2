package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public class W2 implements InterfaceC2586b8 {
    public final /* synthetic */ C2414Vz A00;

    public W2(C2414Vz c2414Vz) {
        this.A00 = c2414Vz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2586b8
    public final void AE7(C2585b7 c2585b7) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        VV vv;
        VV vv2;
        atomicBoolean = this.A00.A0G;
        atomicBoolean.set(c2585b7.A00() != null);
        atomicBoolean2 = this.A00.A0H;
        if (atomicBoolean2.get()) {
            vv = this.A00.A05;
            if (vv != null) {
                vv2 = this.A00.A05;
                vv2.AFB(c2585b7.A00() != null);
            }
        }
    }
}
