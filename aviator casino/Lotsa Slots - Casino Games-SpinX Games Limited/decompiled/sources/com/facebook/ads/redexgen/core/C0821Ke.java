package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0821Ke implements com.facebook.ads.redexgen.core.InterfaceC1292b8 {
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C6M> A00;

    public C0821Ke(com.facebook.ads.redexgen.core.C6M c6m) {
        this.A00 = new java.lang.ref.WeakReference<>(c6m);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1292b8
    public final void AE7(com.facebook.ads.redexgen.core.C1291b7 c1291b7) {
        com.facebook.ads.redexgen.core.C6M c6m = this.A00.get();
        if (c6m != null) {
            c6m.A04 = c1291b7.A00() != null;
            c6m.A02();
        }
    }
}
