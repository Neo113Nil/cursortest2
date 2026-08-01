package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2835fB implements View.OnClickListener {
    public final /* synthetic */ C1936Df A00;

    public ViewOnClickListenerC2835fB(C1936Df c1936Df) {
        this.A00 = c1936Df;
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
            vi = this.A00.A04;
            vi.A04(VH.A0l, null);
            c2930gi = this.A00.A03;
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
