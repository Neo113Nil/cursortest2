package sg.bigo.ads.M;

import android.view.ViewGroup;
import com.facebook.internal.FacebookRequestErrorClassification;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.h.AbstractC5164f1;

/* loaded from: classes3.dex */
public final class B extends C5002t {
    public final int q;
    public int r;

    public B(int i, sg.bigo.ads.P.j jVar, sg.bigo.ads.T0.q qVar, sg.bigo.ads.T0.q qVar2, sg.bigo.ads.L.N n) {
        super(jVar, qVar, qVar2, n);
        this.q = i;
    }

    @Override // sg.bigo.ads.M.C5002t
    public final void a(ViewGroup viewGroup, int i) {
        this.r = i;
    }

    @Override // sg.bigo.ads.M.C5002t
    public final int e() {
        return 5 == this.q ? R.layout.bigo_ad_splash_style_5_card_widget : R.layout.bigo_ad_splash_style_4_cta_widget;
    }

    @Override // sg.bigo.ads.M.C5002t, sg.bigo.ads.M.InterfaceC5003u
    public final void a(boolean z, ViewGroup viewGroup, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        Integer a2;
        super.a(z, viewGroup, -1);
        if (z) {
            RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) viewGroup.findViewById(R.id.bigo_ad_splash_media_container);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container_round);
            MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
            if (viewGroup2 == null || roundedFrameLayout == null) {
                return;
            }
            int a3 = AbstractC4963u.a(viewGroup2.getContext(), 20);
            int a4 = AbstractC4963u.a(viewGroup2.getContext(), 12);
            int a5 = AbstractC4963u.a(viewGroup2.getContext(), 38);
            int a6 = AbstractC4963u.a(viewGroup2.getContext(), FacebookRequestErrorClassification.EC_INVALID_TOKEN);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams();
            marginLayoutParams2.width = 0;
            marginLayoutParams2.height = 0;
            viewGroup2.setLayoutParams(marginLayoutParams2);
            int i3 = viewGroup2.getContext().getResources().getDisplayMetrics().heightPixels;
            int c = AbstractC4963u.c(viewGroup2.getContext());
            int i4 = (i3 - a5) - a3;
            sg.bigo.ads.U.r a7 = AbstractC5164f1.a(this.j.U);
            sg.bigo.ads.U.r a8 = sg.bigo.ads.U.r.a(a7.f12567a, a7.b, c - (a3 * 2), i4);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
            marginLayoutParams3.width = a8.f12567a;
            marginLayoutParams3.height = a8.b;
            roundedFrameLayout.setLayoutParams(marginLayoutParams3);
            roundedFrameLayout.setCornerRadius(a4);
            X.d(-1, -1, mediaView);
            sg.bigo.ads.T0.q qVar = this.d;
            int intValue = (qVar == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_show_time"))) == null) ? 0 : a2.intValue();
            int i5 = 1;
            if (intValue != 1) {
                i5 = 3;
                marginLayoutParams = marginLayoutParams3;
                if (intValue != 2) {
                    i2 = intValue != 3 ? 0 : 5;
                    viewGroup2.postDelayed(new A(this, viewGroup2, viewGroup, a6, marginLayoutParams2, c, a3, i4, a8, a7, roundedFrameLayout, a4, i3, a5, marginLayoutParams), i2 * 1000);
                }
            } else {
                marginLayoutParams = marginLayoutParams3;
            }
            i2 = i5;
            viewGroup2.postDelayed(new A(this, viewGroup2, viewGroup, a6, marginLayoutParams2, c, a3, i4, a8, a7, roundedFrameLayout, a4, i3, a5, marginLayoutParams), i2 * 1000);
        }
    }
}
