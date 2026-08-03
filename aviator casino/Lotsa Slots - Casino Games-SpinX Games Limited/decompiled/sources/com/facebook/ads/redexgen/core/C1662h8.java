package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1662h8 extends com.facebook.ads.redexgen.core.WP {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1659h5 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1108Vm A01;

    public C1662h8(com.facebook.ads.redexgen.core.C1659h5 c1659h5, com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        this.A00 = c1659h5;
        this.A01 = c1108Vm;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        com.facebook.ads.redexgen.core.S6 s6;
        com.facebook.ads.redexgen.core.S6 s62;
        s6 = this.A00.A01;
        if (s6.A00() != null) {
            s62 = this.A00.A01;
            s62.A00().onAdError(com.facebook.ads.redexgen.core.XE.A00(this.A01));
        }
    }
}
