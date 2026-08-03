package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class W0 implements com.facebook.ads.redexgen.core.VV {
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.UK> A00;

    public W0(com.facebook.ads.redexgen.core.UK uk) {
        this.A00 = new java.lang.ref.WeakReference<>(uk);
    }

    @Override // com.facebook.ads.redexgen.core.VV
    public final void AFB(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1o(z, false);
        }
    }
}
