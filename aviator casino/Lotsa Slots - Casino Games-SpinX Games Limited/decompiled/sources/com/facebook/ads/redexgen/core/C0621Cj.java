package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0621Cj implements com.facebook.ads.redexgen.core.InterfaceC1623gV {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1623gV
    public final long A5m() {
        return java.lang.System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1623gV
    public final void AK4(java.lang.Object obj, long j) throws java.lang.InterruptedException {
        obj.wait(j);
    }
}
