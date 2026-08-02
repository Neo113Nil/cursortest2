package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1293fd extends AbstractRunnableC0827Vg {
    public final /* synthetic */ C1290fa A00;
    public final /* synthetic */ V1 A01;

    public C1293fd(C1290fa c1290fa, V1 v1) {
        this.A00 = c1290fa;
        this.A01 = v1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0827Vg
    public final void A01() {
        RO ro;
        RO ro2;
        ro = this.A00.A00;
        if (ro.A00() != null) {
            ro2 = this.A00.A00;
            ro2.A00().onAdError(WT.A00(this.A01));
        }
    }
}
