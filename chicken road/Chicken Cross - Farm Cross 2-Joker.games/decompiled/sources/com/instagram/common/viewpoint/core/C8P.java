package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends AbstractC3410oz implements InterfaceC2094Jj {
    public long A00;
    public InterfaceC2094Jj A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC3410oz
    public abstract void A0B();

    @Override // com.instagram.common.viewpoint.core.AbstractC17625u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j, InterfaceC2094Jj interfaceC2094Jj, long j2) {
        super.A01 = j;
        this.A01 = interfaceC2094Jj;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final List<C3440pT> A7X(long j) {
        return ((InterfaceC2094Jj) AbstractC17143y.A01(this.A01)).A7X(j - this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final long A83(int i) {
        return ((InterfaceC2094Jj) AbstractC17143y.A01(this.A01)).A83(i) + this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final int A84() {
        return ((InterfaceC2094Jj) AbstractC17143y.A01(this.A01)).A84();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final int A8a(long j) {
        return ((InterfaceC2094Jj) AbstractC17143y.A01(this.A01)).A8a(j - this.A00);
    }
}
