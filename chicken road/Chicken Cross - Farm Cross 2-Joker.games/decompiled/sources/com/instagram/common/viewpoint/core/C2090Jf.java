package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Jf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2090Jf implements InterfaceC2586b8 {
    public final WeakReference<AnonymousClass67> A00;

    public C2090Jf(AnonymousClass67 anonymousClass67) {
        this.A00 = new WeakReference<>(anonymousClass67);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2586b8
    public final void AE7(C2585b7 c2585b7) {
        AnonymousClass67 anonymousClass67 = this.A00.get();
        if (anonymousClass67 != null) {
            anonymousClass67.A06 = c2585b7.A00() != null;
            anonymousClass67.A02();
        }
    }
}
