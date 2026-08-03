package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2038ni implements com.facebook.ads.redexgen.core.InterfaceC0688Ez {
    public long A00;
    public long A01;
    public com.facebook.ads.redexgen.core.C2038ni A02;
    public com.facebook.ads.redexgen.core.C0687Ey A03;

    public C2038ni(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final com.facebook.ads.redexgen.core.C2038ni A01() {
        this.A03 = null;
        com.facebook.ads.redexgen.core.C2038ni c2038ni = this.A02;
        this.A02 = null;
        return c2038ni;
    }

    public final void A02(long j, int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = i + j;
    }

    public final void A03(com.facebook.ads.redexgen.core.C0687Ey c0687Ey, com.facebook.ads.redexgen.core.C2038ni c2038ni) {
        this.A03 = c0687Ey;
        this.A02 = c2038ni;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0688Ez
    public final com.facebook.ads.redexgen.core.C0687Ey A6u() {
        return (com.facebook.ads.redexgen.core.C0687Ey) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0688Ez
    public final com.facebook.ads.redexgen.core.C2038ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
