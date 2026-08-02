package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network.dex */
public class FM implements InterfaceC1112cf {
    public final /* synthetic */ YY A00;
    public final /* synthetic */ FL A01;
    public final /* synthetic */ C1132cz A02;

    public FM(FL fl, C1132cz c1132cz, YY yy) {
        this.A01 = fl;
        this.A02 = c1132cz;
        this.A00 = yy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1112cf
    public final void AHo() {
        InterfaceC0885Xo A05;
        Intent intent;
        InterfaceC0885Xo interfaceC0885Xo;
        Intent intent2;
        Bundle bundle;
        this.A01.A09();
        FL fl = this.A01;
        A05 = this.A01.A05(this.A02, this.A00);
        fl.A03 = A05;
        intent = this.A01.A01;
        if (intent != null && this.A01.A00 != null) {
            interfaceC0885Xo = this.A01.A03;
            intent2 = this.A01.A01;
            bundle = this.A01.A02;
            interfaceC0885Xo.AAl(intent2, bundle, this.A01.A00);
        }
    }
}
