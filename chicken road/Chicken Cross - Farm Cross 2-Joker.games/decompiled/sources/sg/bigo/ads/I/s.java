package sg.bigo.ads.I;

import android.app.Activity;
import android.view.View;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5163f0;
import sg.bigo.ads.h.C5149b2;
import sg.bigo.ads.h.Q1;

/* loaded from: classes3.dex */
public class s extends C5149b2 {
    public x e0;
    public final boolean f0;
    public boolean g0;

    public s(Activity activity) {
        super(activity);
        this.f0 = true;
        this.g0 = false;
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s
    public final void E0() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.g.setVisibility(0);
            AbstractC5140Q.b((View) this.g);
        }
        if (d0() == 0) {
            int i = this.z.c;
            if (i < 0) {
                i = 15;
            }
            this.g.a(i, new r(this));
        }
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5151c0
    public final void O() {
        this.w = true;
        if (n0()) {
            e0();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1
    public final int V() {
        Integer a2 = z.a(this.s.a("interstitial_video_style.video_play_page.icon_strategy"));
        return (a2 != null ? a2.intValue() : 0) == 2 ? 2 : 1;
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s
    public Q1 b0() {
        Q1 b0 = super.b0();
        if (!this.f0) {
            b0.b = 0;
            b0.c = -1;
        }
        return b0;
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s
    public final boolean f(boolean z) {
        if (this.H.get() && !this.g0) {
            AdCountDownButton adCountDownButton = this.g;
            if (adCountDownButton != null) {
                adCountDownButton.c();
            }
            x xVar = this.e0;
            if (xVar != null) {
                this.g0 = true;
                xVar.G();
            }
        }
        return super.f(z);
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void u() {
        if (this.f0 && d0() == 0) {
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
            this.e0 = (x) abstractC5163f0;
        }
        if (this.e0 == null) {
            a("Illegal static content.");
        }
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s
    public final void w0() {
        super.w0();
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(this.f0);
        }
    }
}
