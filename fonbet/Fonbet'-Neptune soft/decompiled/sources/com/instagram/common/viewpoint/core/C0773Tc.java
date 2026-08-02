package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0773Tc implements InterfaceC0806Uk {
    public WeakReference<C0696Qc> A00;

    public C0773Tc(C0696Qc c0696Qc) {
        this.A00 = new WeakReference<>(c0696Qc);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0806Uk
    public final void AEW(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1f(z, false);
        }
    }
}
