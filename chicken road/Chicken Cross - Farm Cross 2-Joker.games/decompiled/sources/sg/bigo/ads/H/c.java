package sg.bigo.ads.H;

import android.app.Activity;
import android.view.View;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.f.InterfaceC5108m;
import sg.bigo.ads.h.AbstractC5163f0;
import sg.bigo.ads.h.C5178j0;
import sg.bigo.ads.h.C5190n0;

/* loaded from: classes3.dex */
public final class c extends C5178j0 implements InterfaceC5108m {
    public c(Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.h.C5178j0, sg.bigo.ads.h.AbstractC5151c0
    public final int G() {
        return R.layout.bigo_ad_activity_popup_banner;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean K() {
        return true;
    }

    @Override // sg.bigo.ads.h.C5178j0, sg.bigo.ads.h.AbstractC5151c0
    public final void g(int i) {
        super.g(i);
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 != null) {
            ((C5190n0) abstractC5163f0).W.q = this;
            AdCountDownButton adCountDownButton = this.g;
            if (adCountDownButton != null) {
                adCountDownButton.setShowCloseButtonInCountdown(false);
                this.g.setTakeoverTickEvent(false);
                this.g.a(((C5190n0) this.e).z(), null);
            }
        }
        View findViewById = this.f12687a.findViewById(R.id.inter_container);
        X.a(findViewById, new b(findViewById, this.f12687a.findViewById(R.id.inter_banner_container)));
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void t() {
        this.f12687a.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.h.C5178j0, sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void w() {
        super.w();
        ((C5190n0) this.e).W.q = null;
    }
}
