package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1661h7 extends com.facebook.ads.redexgen.core.WP {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1660h6 A00;

    public C1661h7(com.facebook.ads.redexgen.core.C1660h6 c1660h6) {
        this.A00 = c1660h6;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        com.facebook.ads.redexgen.core.S6 s6;
        com.facebook.ads.redexgen.core.S6 s62;
        s6 = this.A00.A01.A01;
        if (s6.A00() != null) {
            s62 = this.A00.A01.A01;
            s62.A00().onAdsLoaded();
        }
    }
}
