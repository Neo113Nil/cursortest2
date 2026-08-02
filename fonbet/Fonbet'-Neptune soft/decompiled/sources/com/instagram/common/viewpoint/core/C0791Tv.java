package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Tv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0791Tv implements InterfaceC0937Zo {
    public final /* synthetic */ TD A00;

    public C0791Tv(TD td) {
        this.A00 = td;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0937Zo
    public final void ADT(C0936Zn c0936Zn) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        InterfaceC0806Uk interfaceC0806Uk;
        InterfaceC0806Uk interfaceC0806Uk2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(c0936Zn.A00() != null);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            interfaceC0806Uk = this.A00.A02;
            if (interfaceC0806Uk != null) {
                interfaceC0806Uk2 = this.A00.A02;
                interfaceC0806Uk2.AEW(c0936Zn.A00() != null);
            }
        }
    }
}
