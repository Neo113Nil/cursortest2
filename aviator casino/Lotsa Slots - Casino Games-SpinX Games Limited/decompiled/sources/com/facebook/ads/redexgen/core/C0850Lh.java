package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0850Lh extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1581fp> A00;

    public C0850Lh(com.facebook.ads.redexgen.core.C1581fp c1581fp) {
        this.A00 = new java.lang.ref.WeakReference<>(c1581fp);
    }

    public C0850Lh(java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1581fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C1581fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
