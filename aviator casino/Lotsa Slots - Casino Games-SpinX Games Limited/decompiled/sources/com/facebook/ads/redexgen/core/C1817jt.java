package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1817jt implements com.facebook.ads.redexgen.core.InterfaceC1034Sp {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05227w A00;

    public C1817jt(com.facebook.ads.redexgen.core.C05227w c05227w) {
        this.A00 = c05227w;
    }

    private void A00(boolean z) {
        com.facebook.ads.redexgen.core.NJ nj;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.facebook.ads.redexgen.core.NJ nj2;
        if (!z) {
            nj = this.A00.A01;
            nj.AFp(this.A00, com.facebook.ads.AdError.CACHE_ERROR);
        } else {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj2 = this.A00.A01;
            nj2.AFm(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1034Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1034Sp
    public final void ADT() {
        A00(true);
    }
}
