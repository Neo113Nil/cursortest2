package sg.bigo.ads.M;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.u.AbstractC5488i;
import sg.bigo.ads.u.C5485f;

/* loaded from: classes3.dex */
public final class y extends C5002t {
    public Q q;

    public y(sg.bigo.ads.P.j jVar, sg.bigo.ads.T0.q qVar, sg.bigo.ads.T0.q qVar2, sg.bigo.ads.L.N n) {
        super(jVar, qVar, qVar2, n);
    }

    @Override // sg.bigo.ads.M.C5002t, sg.bigo.ads.M.InterfaceC5003u
    public final void a(boolean z, ViewGroup viewGroup, int i) {
        super.a(z, viewGroup, -1);
        if (!z) {
            View findViewWithTag = viewGroup.findViewWithTag("adview_background_second_tag");
            if (findViewWithTag instanceof ImageView) {
                viewGroup.removeView(findViewWithTag);
                return;
            }
            return;
        }
        if (this.q == null) {
            Q1 q1 = new Q1();
            sg.bigo.ads.T0.q qVar = this.d;
            if (qVar != null) {
                Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.media_view_clickable_switch"));
                q1.f = (a2 != null ? a2.intValue() : 0) == 1;
                Integer a3 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.ad_component_clickable_switch"));
                q1.h = (a3 != null ? a3.intValue() : 0) == 1;
                Integer a4 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.other_space_clickable_switch"));
                q1.g = (a4 != null ? a4.intValue() : 0) == 1;
                Integer a5 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.click_type"));
                q1.i = a5 != null ? a5.intValue() : 0;
                Integer a6 = sg.bigo.ads.K0.z.a(this.d.a("layer.other_space_clickable_switch"));
                q1.l = (a6 != null ? a6.intValue() : 0) == 1;
                Integer a7 = sg.bigo.ads.K0.z.a(this.d.a("layer.click_type"));
                q1.m = a7 != null ? a7.intValue() : 0;
                q1.f12848a = false;
                q1.b = 0;
                Integer a8 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.force_staying_time"));
                q1.c = a8 != null ? a8.intValue() : 0;
                Integer a9 = sg.bigo.ads.K0.z.a(this.d.a("layer.is_show_layer"));
                q1.d = (a9 != null ? a9.intValue() : 0) == 1;
                Integer a10 = sg.bigo.ads.K0.z.a(this.d.a("layer.force_staying_time"));
                q1.e = a10 != null ? a10.intValue() : 0;
                Integer a11 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.auto_click"));
                q1.j = a11 != null ? a11.intValue() : 0;
                Integer a12 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.time_for_auto_click"));
                q1.n = a12 != null ? a12.intValue() : -1;
                Integer a13 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.time_for_show_backup"));
                q1.o = a13 != null ? a13.intValue() : -1;
            } else {
                q1.j = 1;
                Integer a14 = sg.bigo.ads.K0.z.a(this.c.a("interstitial_video_style.video_play_page.is_global_click"));
                q1.f12848a = (a14 != null ? a14.intValue() : 0) == 1;
                Integer a15 = sg.bigo.ads.K0.z.a(this.c.a("interstitial_video_style.video_play_page.impression_close_seconds"));
                q1.b = a15 != null ? a15.intValue() : 0;
                Integer a16 = sg.bigo.ads.K0.z.a(this.c.a("interstitial_video_style.video_play_page.close_click_seconds"));
                q1.c = a16 != null ? a16.intValue() : 0;
                Integer a17 = sg.bigo.ads.K0.z.a(this.c.a("interstitial_video_style.video_play_page.is_jump_layer"));
                q1.d = (a17 != null ? a17.intValue() : 0) == 1;
                Integer a18 = sg.bigo.ads.K0.z.a(this.c.a("interstitial_video_style.layer.impression_layer_close_seconds"));
                q1.e = a18 != null ? a18.intValue() : 0;
            }
            sg.bigo.ads.C.l lVar = this.j.U;
            sg.bigo.ads.T0.q qVar2 = this.d;
            if (qVar2 == null) {
                qVar2 = this.c;
            }
            sg.bigo.ads.T0.q qVar3 = qVar2;
            Integer a19 = sg.bigo.ads.K0.z.a(qVar3.a("video_play_page.multi_img_load"));
            int intValue = a19 != null ? a19.intValue() : 1;
            Integer a20 = sg.bigo.ads.K0.z.a(qVar3.a("video_play_page.multi_img"));
            this.q = new Q(lVar, viewGroup, q1, C5485f.a(lVar, qVar3, intValue, AbstractC5488i.a(a20 != null ? a20.intValue() : 0), 1, true, false));
        }
        this.q.c();
        a(this.q.q);
        sg.bigo.ads.T0.q qVar4 = this.d;
        if (qVar4 != null) {
            Integer a21 = sg.bigo.ads.K0.z.a(qVar4.a("video_play_page.background_colour"));
            int intValue2 = a21 != null ? a21.intValue() : 0;
            TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
            if (textView != null) {
                this.q.n.a(textView);
            }
            if (1 == intValue2) {
                this.q.n.a(-1);
                Q q = this.q;
                sg.bigo.ads.v.k kVar = q.o;
                if (kVar != null) {
                    kVar.a(false);
                }
                sg.bigo.ads.v.k kVar2 = q.p;
                if (kVar2 != null) {
                    kVar2.a(false);
                }
                Q q2 = this.q;
                int a22 = sg.bigo.ads.K0.I.a(-7829368, "#80202124");
                Indicator indicator = q2.e;
                if (indicator != null) {
                    indicator.setColorSelected(ViewCompat.MEASURED_STATE_MASK);
                    q2.e.setColor(a22);
                }
            }
        }
    }

    @Override // sg.bigo.ads.M.C5002t, sg.bigo.ads.M.InterfaceC5003u
    public final void d() {
        g();
        C5002t.p = null;
        Q q = this.q;
        if (q != null) {
            q.q = null;
            this.q = null;
        }
    }

    @Override // sg.bigo.ads.M.C5002t
    public final int e() {
        return R.layout.bigo_ad_splash_style_3_multi_img;
    }
}
