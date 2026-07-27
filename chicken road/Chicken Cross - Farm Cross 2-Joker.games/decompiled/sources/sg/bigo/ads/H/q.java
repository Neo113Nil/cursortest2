package sg.bigo.ads.H;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.K0.E;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.h.C5149b2;
import sg.bigo.ads.h.Y0;
import sg.bigo.ads.n.AbstractC5391n;
import sg.bigo.ads.n.V0;
import sg.bigo.ads.n.W0;

/* loaded from: classes3.dex */
public final class q extends C5149b2 implements n {
    public W0 e0;

    public q(Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void B0() {
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5151c0
    public final int G() {
        int T = T();
        return T != 2 ? T != 3 ? T != 4 ? T != 5 ? T != 6 ? R.layout.bigo_ad_activity_pop_up_style_1 : R.layout.bigo_ad_activity_pop_up_style_6 : R.layout.bigo_ad_activity_pop_up_style_5 : R.layout.bigo_ad_activity_pop_up_style_4 : R.layout.bigo_ad_activity_pop_up_style_3 : R.layout.bigo_ad_activity_pop_up_style_2;
    }

    @Override // sg.bigo.ads.h.C5149b2
    public final void H0() {
        MediaView mediaView;
        ViewGroup viewGroup = this.m;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        if (!this.a0) {
            mediaView.setMediaAreaClickable(false);
        }
        M0().b((ViewGroup) mediaView);
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean K() {
        return true;
    }

    public final W0 M0() {
        if (this.e0 == null) {
            this.e0 = AbstractC5391n.a(this.l, this.t, T());
        }
        return this.e0;
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void R() {
        g gVar;
        f fVar;
        super.R();
        if (this.g != null || (gVar = M0().t) == null || (fVar = gVar.e) == null) {
            return;
        }
        fVar.d();
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void S() {
        super.S();
        if (this.g == null) {
            M0().j();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void a(ViewGroup viewGroup) {
        M0().h(viewGroup);
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s
    public final boolean f(boolean z) {
        d(true);
        return true;
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void g(int i) {
        super.g(i);
        if (this.m == null) {
            return;
        }
        Y0 y0 = this.J;
        if (y0 != null) {
            y0.m = false;
        }
        M0().e(this.m);
        M0().c(this.m);
        M0().d(this.m);
        View findViewById = this.f12687a.findViewById(R.id.inter_container);
        View findViewById2 = this.m.findViewById(R.id.media_layout);
        M0().getClass();
        X.a(findViewById, new V0(findViewById, findViewById2));
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void h(boolean z) {
    }

    @Override // sg.bigo.ads.h.C5149b2
    public final void n(int i) {
        W0 M0 = M0();
        ViewGroup viewGroup = this.m;
        String str = this.D;
        M0.getClass();
        W0.a(viewGroup, str);
        E g = M0().g(this.m);
        this.R = g;
        if (g == null) {
            M0().f(this.m);
        } else {
            g.e();
        }
    }

    @Override // sg.bigo.ads.H.n
    public final void o() {
        e(true);
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void t() {
        this.f12687a.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void v0() {
        M0().a(this.g, this.m, this);
    }
}
