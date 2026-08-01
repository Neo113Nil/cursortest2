package sg.bigo.ads.I;

import android.app.Activity;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.h.AbstractC5163f0;

/* loaded from: classes3.dex */
public final class p extends sg.bigo.ads.z.g {
    public x t;
    public boolean u;
    public n v;

    public p(Activity activity) {
        super(activity);
        this.u = false;
    }

    @Override // sg.bigo.ads.z.g, sg.bigo.ads.h.AbstractC5151c0
    public final void c(boolean z) {
        if (this.g.getVisibility() != 0) {
            return;
        }
        if (!this.u) {
            new l(this.f12687a).a(new o(this));
            return;
        }
        n nVar = this.v;
        if (nVar != null) {
            nVar.a();
            this.v = null;
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
        super.c(true);
    }

    @Override // sg.bigo.ads.z.g, sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void v() {
        super.v();
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null) {
            return;
        }
        if (abstractC5163f0 instanceof x) {
            this.t = (x) abstractC5163f0;
        } else {
            a("Illegal SAB content.");
        }
        if (this.g == null) {
            return;
        }
        this.v = new n(this, 1 * 1000);
        this.g.setVisibility(0);
        this.g.setTakeoverTickEvent(true);
        this.g.setShowCloseButtonInCountdown(true);
        this.g.a(1, null);
        this.v.e();
    }
}
