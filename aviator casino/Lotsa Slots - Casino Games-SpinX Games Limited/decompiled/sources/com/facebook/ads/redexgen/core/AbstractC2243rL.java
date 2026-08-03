package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.rL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2243rL {
    public com.facebook.ads.redexgen.core.InterfaceC2244rM A00;

    public final void A00() {
        if (this.A00 != null) {
            this.A00.onStart();
        }
    }

    public final void A02() {
        if (this.A00 != null) {
            this.A00.onStop();
        }
    }

    public final void A03(com.facebook.ads.redexgen.core.InterfaceC2244rM interfaceC2244rM) {
        this.A00 = interfaceC2244rM;
    }
}
