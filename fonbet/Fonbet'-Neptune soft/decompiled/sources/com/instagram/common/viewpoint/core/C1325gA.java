package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1325gA implements InterfaceC0707Qn {
    public final /* synthetic */ C02006g A00;

    public C1325gA(C02006g c02006g) {
        this.A00 = c02006g;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0707Qn
    public final void AGP(AbstractC0700Qg abstractC0700Qg, QJ qj, QJ qj2) {
        this.A00.A1l(abstractC0700Qg, qj, qj2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0707Qn
    public final void AGR(AbstractC0700Qg abstractC0700Qg, QJ qj, QJ qj2) {
        this.A00.A0r.A0Y(abstractC0700Qg);
        this.A00.A1m(abstractC0700Qg, qj, qj2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0707Qn
    public final void AGT(AbstractC0700Qg abstractC0700Qg, QJ qj, QJ qj2) {
        abstractC0700Qg.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(abstractC0700Qg, abstractC0700Qg, qj, qj2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(abstractC0700Qg, qj, qj2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0707Qn
    public final void AJo(AbstractC0700Qg abstractC0700Qg) {
        this.A00.A06.A1F(abstractC0700Qg.A0H, this.A00.A0r);
    }
}
