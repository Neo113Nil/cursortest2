package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0715Gb implements com.facebook.ads.redexgen.core.InterfaceC1292b8 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04454x A00;

    public C0715Gb(com.facebook.ads.redexgen.core.C04454x c04454x) {
        this.A00 = c04454x;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1292b8
    public final void AE7(com.facebook.ads.redexgen.core.C1291b7 c1291b7) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(c1291b7.A00() != null);
        this.A00.A06();
    }
}
