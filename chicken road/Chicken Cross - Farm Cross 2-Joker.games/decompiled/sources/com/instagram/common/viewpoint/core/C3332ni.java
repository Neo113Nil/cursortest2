package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3332ni implements InterfaceC1982Ez {
    public long A00;
    public long A01;
    public C3332ni A02;
    public C1981Ey A03;

    public C3332ni(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C3332ni A01() {
        this.A03 = null;
        C3332ni c3332ni = this.A02;
        this.A02 = null;
        return c3332ni;
    }

    public final void A02(long j, int i) {
        AbstractC17143y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = i + j;
    }

    public final void A03(C1981Ey c1981Ey, C3332ni c3332ni) {
        this.A03 = c1981Ey;
        this.A02 = c3332ni;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1982Ez
    public final C1981Ey A6u() {
        return (C1981Ey) AbstractC17143y.A01(this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1982Ez
    public final C3332ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
