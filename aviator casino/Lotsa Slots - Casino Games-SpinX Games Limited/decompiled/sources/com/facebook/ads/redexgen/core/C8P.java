package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends com.facebook.ads.redexgen.core.AbstractC2116oz implements com.facebook.ads.redexgen.core.InterfaceC0800Jj {
    public long A00;
    public com.facebook.ads.redexgen.core.InterfaceC0800Jj A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC2116oz
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.core.AbstractC04685u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j, com.facebook.ads.redexgen.core.InterfaceC0800Jj interfaceC0800Jj, long j2) {
        super.A01 = j;
        this.A01 = interfaceC0800Jj;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A7X(long j) {
        return ((com.facebook.ads.redexgen.core.InterfaceC0800Jj) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01)).A7X(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final long A83(int i) {
        return ((com.facebook.ads.redexgen.core.InterfaceC0800Jj) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01)).A83(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A84() {
        return ((com.facebook.ads.redexgen.core.InterfaceC0800Jj) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01)).A84();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A8a(long j) {
        return ((com.facebook.ads.redexgen.core.InterfaceC0800Jj) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01)).A8a(j - this.A00);
    }
}
