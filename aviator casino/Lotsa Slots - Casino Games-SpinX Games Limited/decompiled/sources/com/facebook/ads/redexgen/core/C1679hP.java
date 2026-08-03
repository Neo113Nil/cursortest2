package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1679hP extends com.facebook.ads.redexgen.core.WP {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1676hM A00;

    public C1679hP(com.facebook.ads.redexgen.core.C1676hM c1676hM) {
        this.A00 = c1676hM;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        com.facebook.ads.redexgen.core.C0997Rd c0997Rd;
        com.facebook.ads.redexgen.core.C0997Rd c0997Rd2;
        com.facebook.ads.redexgen.core.C0997Rd c0997Rd3;
        c0997Rd = this.A00.A01;
        if (c0997Rd.A06() != null) {
            c0997Rd2 = this.A00.A01;
            com.facebook.ads.AdListener A06 = c0997Rd2.A06();
            c0997Rd3 = this.A00.A01;
            A06.onAdLoaded(c0997Rd3.A07());
        }
    }
}
