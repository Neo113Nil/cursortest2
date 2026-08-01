package sg.bigo.ads.I;

import android.app.Activity;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5163f0;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.Q1;

/* loaded from: classes3.dex */
public final class t extends sg.bigo.ads.B.b {
    public x u;
    public final boolean v;
    public boolean w;

    public t(Activity activity) {
        super(activity);
        this.v = true;
        this.w = false;
    }

    @Override // sg.bigo.ads.B.b, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void I() {
        super.I();
        Q1 q1 = this.q;
        if (q1 != null) {
            q1.c = 15;
            q1.f = true;
            q1.g = false;
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1
    public final int V() {
        return 2;
    }

    @Override // sg.bigo.ads.B.b
    public final void Y() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
        }
        super.Y();
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void c(boolean z) {
        if (this.g.getVisibility() == 0) {
            AdCountDownButton adCountDownButton = this.g;
            if (adCountDownButton.c) {
                if (!this.w) {
                    adCountDownButton.c();
                    x xVar = this.u;
                    if (xVar != null) {
                        this.w = true;
                        xVar.G();
                    }
                }
                C();
            }
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void u() {
        if (this.v) {
            c(true);
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void v() {
        super.v();
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null) {
            return;
        }
        if (abstractC5163f0 instanceof x) {
            this.u = (x) abstractC5163f0;
        }
        if (this.u == null || !((sg.bigo.ads.U0.k) ((InterfaceC5087a) ((C5185l1) abstractC5163f0).W.e())).o()) {
            a("Illegal VPAID content.");
        }
    }
}
