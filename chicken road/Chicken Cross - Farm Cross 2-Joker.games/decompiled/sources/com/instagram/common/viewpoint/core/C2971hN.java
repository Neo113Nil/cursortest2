package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2971hN extends WP {
    public final /* synthetic */ C2970hM A00;

    public C2971hN(C2970hM c2970hM) {
        this.A00 = c2970hM;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        C2291Rd c2291Rd;
        C2291Rd c2291Rd2;
        C2291Rd c2291Rd3;
        c2291Rd = this.A00.A01;
        if (c2291Rd.A06() != null) {
            c2291Rd2 = this.A00.A01;
            AdListener A06 = c2291Rd2.A06();
            c2291Rd3 = this.A00.A01;
            A06.onLoggingImpression(c2291Rd3.A07());
        }
    }
}
