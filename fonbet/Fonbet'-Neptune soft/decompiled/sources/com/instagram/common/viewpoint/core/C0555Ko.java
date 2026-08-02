package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0555Ko extends AbstractRunnableC0840Vt {
    public final WeakReference<C1226eX> A00;

    public C0555Ko(C1226eX c1226eX) {
        this.A00 = new WeakReference<>(c1226eX);
    }

    public C0555Ko(WeakReference<C1226eX> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        C1226eX viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
