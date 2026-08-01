package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F8 implements InterfaceC2900gE {
    public final /* synthetic */ C2798ea A00;

    public F8(C2798ea c2798ea) {
        this.A00 = c2798ea;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2900gE
    public final void AHA() {
        InterfaceC2471Yh interfaceC2471Yh;
        InterfaceC2471Yh interfaceC2471Yh2;
        ZU zu;
        interfaceC2471Yh = this.A00.A02;
        if (interfaceC2471Yh == null) {
            return;
        }
        interfaceC2471Yh2 = this.A00.A02;
        zu = this.A00.A03;
        interfaceC2471Yh2.A4j(zu.A94());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2900gE
    public final void AHC(C2902gG c2902gG) {
        InterfaceC2471Yh interfaceC2471Yh;
        C2930gi c2930gi;
        InterfaceC2471Yh interfaceC2471Yh2;
        ZU zu;
        C2930gi c2930gi2;
        InterfaceC2471Yh interfaceC2471Yh3;
        ZU zu2;
        interfaceC2471Yh = this.A00.A02;
        if (interfaceC2471Yh == null) {
            return;
        }
        if (c2902gG == null || !c2902gG.A00()) {
            c2930gi = this.A00.A01;
            c2930gi.A0F().ABv();
            interfaceC2471Yh2 = this.A00.A02;
            zu = this.A00.A03;
            interfaceC2471Yh2.A4j(zu.A94());
            return;
        }
        c2930gi2 = this.A00.A01;
        c2930gi2.A0F().ABw();
        interfaceC2471Yh3 = this.A00.A02;
        zu2 = this.A00.A03;
        interfaceC2471Yh3.A4j(zu2.A95());
    }
}
