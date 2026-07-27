package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class EE implements InterfaceC2815er {
    public final View A00;
    public final C2930gi A01;

    public EE(C2930gi c2930gi, View view) {
        this.A01 = c2930gi;
        this.A00 = view;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2815er
    public final double A9V() {
        C2876fq result = C2875fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
