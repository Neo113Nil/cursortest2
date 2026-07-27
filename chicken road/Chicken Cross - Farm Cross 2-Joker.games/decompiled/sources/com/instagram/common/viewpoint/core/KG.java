package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KG implements InterfaceC2621bh {
    public final /* synthetic */ KE A00;

    public KG(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2621bh
    public final void ACt() {
        C2647c7 c2647c7;
        C2647c7 c2647c72;
        c2647c7 = this.A00.A0J;
        AbstractC3095jd A05 = c2647c7.A05();
        c2647c72 = this.A00.A0J;
        A05.A2H(c2647c72.A0C());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2621bh
    public final void AEm() {
        this.A00.A0Y = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2621bh
    public final void AEn() {
        this.A00.A0Y = true;
    }
}
