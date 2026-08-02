package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class QN extends AbstractRunnableC0827Vg {
    public final /* synthetic */ C6I A00;
    public final /* synthetic */ V1 A01;

    public QN(C6I c6i, V1 v1) {
        this.A00 = c6i;
        this.A01 = v1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0827Vg
    public final void A01() {
        this.A00.A01.onError(this.A00.A00, WT.A00(this.A01));
    }
}
