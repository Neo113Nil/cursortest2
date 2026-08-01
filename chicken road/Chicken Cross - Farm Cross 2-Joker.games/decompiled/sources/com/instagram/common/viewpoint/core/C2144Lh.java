package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2144Lh extends AbstractRunnableC2417Wc {
    public final WeakReference<C2875fp> A00;

    public C2144Lh(C2875fp c2875fp) {
        this.A00 = new WeakReference<>(c2875fp);
    }

    public C2144Lh(WeakReference<C2875fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C2875fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
