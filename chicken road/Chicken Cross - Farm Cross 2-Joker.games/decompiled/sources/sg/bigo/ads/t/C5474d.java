package sg.bigo.ads.t;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* renamed from: sg.bigo.ads.t.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5474d extends i {
    public C5474d(Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.j1.h
    public final int A() {
        return R.layout.bigo_ad_activity_interstitial_landingpage_7_8;
    }

    @Override // sg.bigo.ads.j1.h
    public final void B() {
        View findViewById = this.f12687a.findViewById(R.id.inter_webview_close);
        X.a(findViewById, new C5473c(this, findViewById));
    }

    @Override // sg.bigo.ads.t.i, sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public final void C() {
        super.C();
        View findViewById = this.f12687a.findViewById(R.id.inter_webview_close);
        LandingPageStyleConfig landingPageStyleConfig = this.q0;
        if (landingPageStyleConfig == null || findViewById == null || landingPageStyleConfig.f12718a != 8) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.gravity = 8388661;
        layoutParams.rightMargin = AbstractC4963u.a(this.f12687a, 20);
    }
}
