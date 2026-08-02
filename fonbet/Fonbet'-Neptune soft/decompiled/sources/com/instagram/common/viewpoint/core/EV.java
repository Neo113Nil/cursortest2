package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class EV implements InterfaceC1251ew {
    public final /* synthetic */ C1150dI A00;

    public EV(C1150dI c1150dI) {
        this.A00 = c1150dI;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1251ew
    public final void AGQ() {
        InterfaceC0884Xn interfaceC0884Xn;
        InterfaceC0884Xn interfaceC0884Xn2;
        YY yy;
        interfaceC0884Xn = this.A00.A02;
        if (interfaceC0884Xn == null) {
            return;
        }
        interfaceC0884Xn2 = this.A00.A02;
        yy = this.A00.A03;
        interfaceC0884Xn2.A4b(yy.A8w());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1251ew
    public final void AGS(C1253ey c1253ey) {
        InterfaceC0884Xn interfaceC0884Xn;
        InterfaceC0884Xn interfaceC0884Xn2;
        YY yy;
        InterfaceC0884Xn interfaceC0884Xn3;
        YY yy2;
        interfaceC0884Xn = this.A00.A02;
        if (interfaceC0884Xn == null) {
            return;
        }
        if (c1253ey == null || !c1253ey.A00()) {
            interfaceC0884Xn2 = this.A00.A02;
            yy = this.A00.A03;
            interfaceC0884Xn2.A4b(yy.A8w());
        } else {
            interfaceC0884Xn3 = this.A00.A02;
            yy2 = this.A00.A03;
            interfaceC0884Xn3.A4b(yy2.A8x());
        }
    }
}
