package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network/classes2.dex */
public class GD implements InterfaceC2761dy {
    public final /* synthetic */ GB A00;

    public GD(GB gb) {
        this.A00 = gb;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2761dy
    public final void AIY() {
        boolean z;
        C2202No c2202No;
        InterfaceC2471Yh interfaceC2471Yh;
        ZU zu;
        InterfaceC2471Yh interfaceC2471Yh2;
        ZU zu2;
        ZU zu3;
        C2202No c2202No2;
        AbstractC3095jd abstractC3095jd;
        InterfaceC2472Yi A05;
        Intent intent;
        InterfaceC2472Yi interfaceC2472Yi;
        Intent intent2;
        Bundle bundle;
        InterfaceC2472Yi interfaceC2472Yi2;
        this.A00.A0B();
        z = this.A00.A0E;
        if (!z || this.A00.A01 == null) {
            c2202No = this.A00.A07;
            if (c2202No == null) {
                interfaceC2471Yh = this.A00.A0C;
                zu = this.A00.A0D;
                interfaceC2471Yh.A4j(zu.A81());
                interfaceC2471Yh2 = this.A00.A0C;
                zu2 = this.A00.A0D;
                interfaceC2471Yh2.A4j(zu2.A7w());
                return;
            }
            GB gb = this.A00;
            GB gb2 = this.A00;
            zu3 = this.A00.A0D;
            c2202No2 = this.A00.A07;
            abstractC3095jd = this.A00.A05;
            A05 = gb2.A05(zu3, c2202No2, Boolean.valueOf(abstractC3095jd.A1n()));
            gb.A04 = A05;
            intent = this.A00.A02;
            if (intent != null && this.A00.A00 != null) {
                interfaceC2472Yi = this.A00.A04;
                intent2 = this.A00.A02;
                bundle = this.A00.A03;
                interfaceC2472Yi.AAu(intent2, bundle, this.A00.A00);
                return;
            }
            return;
        }
        if (this.A00.A01 instanceof MW) {
            this.A00.A04 = this.A00.A01;
            interfaceC2472Yi2 = this.A00.A04;
            ((MW) interfaceC2472Yi2).A0b();
        }
    }
}
