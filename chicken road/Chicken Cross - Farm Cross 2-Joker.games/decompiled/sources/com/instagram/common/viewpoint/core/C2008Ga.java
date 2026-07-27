package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2008Ga extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C17394x A00;

    public C2008Ga(C17394x c17394x) {
        this.A00 = c17394x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        AbstractC2643c3 abstractC2643c3;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC2643c3 abstractC2643c32;
        abstractC2643c3 = this.A00.A00;
        if (abstractC2643c3 != null) {
            abstractC2643c32 = this.A00.A00;
            abstractC2643c32.A1F();
        }
        AbstractC2465Yb abstractC2465Yb = this.A00.A09;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC2465Yb.setToolbarActionMode(closeButtonStyle);
        this.A00.A09.A0A();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
