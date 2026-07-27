package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2836fC implements View.OnClickListener {
    public final /* synthetic */ C1934Dd A00;

    public ViewOnClickListenerC2836fC(C1934Dd c1934Dd) {
        this.A00 = c1934Dd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VI vi;
        C2930gi c2930gi;
        C1967Ek c1967Ek;
        boolean A07;
        C1967Ek c1967Ek2;
        C1967Ek c1967Ek3;
        if (WU.A02(this)) {
            return;
        }
        try {
            vi = this.A00.A03;
            vi.A04(VH.A0l, null);
            c2930gi = this.A00.A02;
            c2930gi.A0F().A3m();
            c1967Ek = this.A00.A00;
            if (c1967Ek != null) {
                A07 = this.A00.A07();
                if (A07) {
                    c1967Ek3 = this.A00.A00;
                    c1967Ek3.setVolume(1.0f);
                } else {
                    c1967Ek2 = this.A00.A00;
                    c1967Ek2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
