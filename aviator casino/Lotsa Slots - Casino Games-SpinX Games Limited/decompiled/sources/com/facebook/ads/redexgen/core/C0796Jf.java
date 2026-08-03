package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0796Jf implements com.facebook.ads.redexgen.core.InterfaceC1292b8 {
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.AnonymousClass67> A00;

    public C0796Jf(com.facebook.ads.redexgen.core.AnonymousClass67 anonymousClass67) {
        this.A00 = new java.lang.ref.WeakReference<>(anonymousClass67);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1292b8
    public final void AE7(com.facebook.ads.redexgen.core.C1291b7 c1291b7) {
        com.facebook.ads.redexgen.core.AnonymousClass67 anonymousClass67 = this.A00.get();
        if (anonymousClass67 != null) {
            anonymousClass67.A06 = c1291b7.A00() != null;
            anonymousClass67.A02();
        }
    }
}
