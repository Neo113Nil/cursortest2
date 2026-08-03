package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0773Ih implements com.facebook.ads.redexgen.core.InterfaceC1292b8 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04555h A00;

    public C0773Ih(com.facebook.ads.redexgen.core.C04555h c04555h) {
        this.A00 = c04555h;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1292b8
    public final void AE7(com.facebook.ads.redexgen.core.C1291b7 c1291b7) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A08;
        atomicBoolean.set(c1291b7.A00() != null);
        this.A00.A07();
    }
}
