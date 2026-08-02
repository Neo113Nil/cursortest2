package com.instagram.common.viewpoint.core;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class EG implements InterfaceC1159dR {
    public final C1153dL A01;
    public final US A02;
    public final C1156dO A03;
    public final E1 A04;
    public final String A07;
    public final DR A06 = new DR() { // from class: com.facebook.ads.redexgen.X.3m
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C3Y c3y) {
            Boolean bool;
            C1153dL c1153dL;
            bool = EG.this.A00;
            if (bool.booleanValue()) {
                return;
            }
            c1153dL = EG.this.A01;
            c1153dL.A0F().AII();
            EG.this.A08();
        }
    };
    public final DX A05 = new DX() { // from class: com.facebook.ads.redexgen.X.3l
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C01193d c01193d) {
            Boolean bool;
            C1153dL c1153dL;
            bool = EG.this.A00;
            if (!bool.booleanValue()) {
                c1153dL = EG.this.A01;
                c1153dL.A0F().AIG();
                EG.this.A08();
            }
            EG.this.A00 = true;
        }
    };
    public Boolean A00 = false;

    public EG(C1153dL c1153dL, US us, E1 e1, String str, boolean z, C0362Dc c0362Dc, Map<String, String> extraParams) {
        this.A01 = c1153dL;
        this.A02 = us;
        this.A07 = str;
        this.A04 = e1;
        this.A03 = new C1156dO(e1, str, z, extraParams);
        if (U7.A25(this.A01)) {
            this.A01.A0F().AID();
            c0362Dc.A0m(this);
        } else {
            this.A01.A0F().AIE();
            this.A04.getEventBus().A03(this.A06, this.A05);
        }
    }

    public final void A07() {
        EI ei = new EI(this);
        if (this.A04.A0t()) {
            XJ.A00(ei);
        } else {
            this.A04.getStateHandler().post(ei);
        }
    }

    public final synchronized void A08() {
        if (!this.A00.booleanValue()) {
            this.A02.ABQ(this.A07, this.A03.A06());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1159dR
    public final void AE5() {
        this.A01.A0F().AIH();
        A08();
    }
}
