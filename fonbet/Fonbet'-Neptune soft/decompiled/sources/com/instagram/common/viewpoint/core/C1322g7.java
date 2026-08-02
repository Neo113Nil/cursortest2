package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.g7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1322g7 implements QI {
    public final /* synthetic */ C02006g A00;

    public C1322g7(C02006g c02006g) {
        this.A00 = c02006g;
    }

    @Override // com.instagram.common.viewpoint.core.QI
    public final void ACK(AbstractC0700Qg abstractC0700Qg) {
        boolean A0G;
        abstractC0700Qg.A0d(true);
        if (abstractC0700Qg.A06 != null && abstractC0700Qg.A07 == null) {
            abstractC0700Qg.A06 = null;
        }
        abstractC0700Qg.A07 = null;
        A0G = abstractC0700Qg.A0G();
        if (!A0G && !this.A00.A1x(abstractC0700Qg.A0H) && abstractC0700Qg.A0i()) {
            this.A00.removeDetachedView(abstractC0700Qg.A0H, false);
        }
    }
}
