package sg.bigo.ads.M;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.SplashAdRequest;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.P1;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class W implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f12439a;
    public final sg.bigo.ads.T0.q b;
    public final sg.bigo.ads.T0.q c;
    public final sg.bigo.ads.L.N d;
    public View e;
    public int f = 1;
    public final sg.bigo.ads.P.j g;

    public W(sg.bigo.ads.P.j jVar, sg.bigo.ads.T0.q qVar, sg.bigo.ads.T0.q qVar2, sg.bigo.ads.L.N n) {
        this.d = n;
        this.b = qVar;
        this.c = qVar2;
        this.g = jVar;
        this.f12439a = ((sg.bigo.ads.U0.b) jVar.f12482a).L;
    }

    @Override // sg.bigo.ads.M.F
    public final void a() {
    }

    @Override // sg.bigo.ads.M.F
    public final void a(P1 p1) {
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void a(boolean z) {
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final int b() {
        return this.f;
    }

    @Override // sg.bigo.ads.M.F
    public final AtomicBoolean c() {
        return new AtomicBoolean(false);
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void d() {
        this.f = 4;
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void onAdClicked() {
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void onAdImpression() {
        VideoController videoController;
        if (this.f == 2 && (videoController = this.d.U.getVideoController()) != null) {
            videoController.setVideoLifeCallback(new S(this));
        }
        sg.bigo.ads.P.j jVar = this.d.Z;
        AbstractC5446j.a(3, null, new T(jVar == null ? "" : jVar.b.l), 0L);
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void a(boolean z, ViewGroup viewGroup, int i) {
        String g;
        int i2;
        if (!z) {
            View view = this.e;
            if (view != null) {
                this.f = 3;
                view.setVisibility(8);
                this.f = 4;
                return;
            }
            return;
        }
        View view2 = this.e;
        if (view2 == null) {
            this.f = 2;
            sg.bigo.ads.C.l lVar = this.d.U;
            if (lVar == null) {
                return;
            }
            sg.bigo.ads.P.c cVar = (InterfaceC5087a) lVar.e();
            this.e = AbstractC4944a.a(viewGroup.getContext(), sg.bigo.ads.L.r.a(this.b) ? R.layout.bigo_ad_splash_style_halfscreen_vpaid : R.layout.bigo_ad_splash_style_fullscreen_vpaid, null, false);
            viewGroup.addView(this.e, 1, new ViewGroup.LayoutParams(-1, -1));
            viewGroup.setTag(11);
            MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
            if (mediaView != null) {
                mediaView.setImageBlurBorder(false);
            }
            AdOptionsView adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.bigo_ad_splash_options);
            ArrayList arrayList = new ArrayList();
            boolean a2 = sg.bigo.ads.L.r.a(this.b);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.bigo_ad_splash_icon);
            if (imageView != null) {
                imageView.setTag(1);
                if (a2) {
                    sg.bigo.ads.N.d dVar = this.g.c;
                    if ((dVar instanceof SplashAdRequest) && (i2 = ((SplashAdRequest) dVar).i) != 0) {
                        imageView.setImageResource(i2);
                    }
                } else {
                    sg.bigo.ads.U0.h hVar = ((sg.bigo.ads.U0.k) cVar).y0;
                    String str = hVar != null ? hVar.c : null;
                    if (!sg.bigo.ads.K0.I.a((CharSequence) str) && URLUtil.isNetworkUrl(str)) {
                        sg.bigo.ads.s0.u.f13300a.a(this.d.k.e, null, str, ((sg.bigo.ads.U0.b) cVar).T, new U(this, imageView));
                    }
                }
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
            if (textView != null) {
                textView.setTag(2);
                if (a2) {
                    sg.bigo.ads.N.d dVar2 = this.g.c;
                    g = dVar2 instanceof SplashAdRequest ? ((SplashAdRequest) dVar2).j : null;
                } else {
                    g = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).g();
                }
                if (!TextUtils.isEmpty(g)) {
                    textView.setText(g);
                }
            }
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_splash_advertiser);
            TextView textView3 = (TextView) viewGroup.findViewById(R.id.inter_splash_adtage);
            if (textView2 != null && textView3 != null) {
                if (sg.bigo.ads.K0.I.a((CharSequence) this.f12439a)) {
                    textView2.setVisibility(8);
                } else {
                    textView3.setText(R.string.bigo_ad_tag);
                    textView2.setText(this.f12439a);
                    textView2.setPadding(AbstractC4963u.a(textView2.getContext(), 4), AbstractC4963u.a(textView2.getContext(), 1), AbstractC4963u.a(textView2.getContext(), 4), AbstractC4963u.a(textView2.getContext(), 1));
                }
            }
            sg.bigo.ads.d1.u v = new V();
            View findViewById = viewGroup.findViewById(R.id.layout_contain_view);
            Integer a3 = sg.bigo.ads.K0.z.a(this.c.a("video_play_page.click_type"));
            int intValue = a3 != null ? a3.intValue() : 0;
            if (mediaView != null) {
                Integer a4 = sg.bigo.ads.K0.z.a(this.c.a("video_play_page.media_view_clickable_switch"));
                ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a((a4 != null ? a4.intValue() : 0) == 1);
            }
            if (findViewById != null) {
                findViewById.setTag(9);
                Integer a5 = sg.bigo.ads.K0.z.a(this.c.a("video_play_page.other_space_clickable_switch"));
                sg.bigo.ads.C.f.a(viewGroup, findViewById, 8, (a5 != null ? a5.intValue() : 0) == 1 ? lVar : v, intValue);
            }
            int i3 = intValue;
            lVar.registerViewForInteraction(viewGroup, mediaView, (ImageView) null, adOptionsView, arrayList);
            if (mediaView != null && sg.bigo.ads.L.r.b()) {
                mediaView.getLayoutParams().width = -2;
                mediaView.getLayoutParams().height = -1;
            }
            View findViewById2 = viewGroup.findViewById(R.id.inter_layout_ad_tag);
            if (findViewById2 != null) {
                sg.bigo.ads.C.f.a(viewGroup, findViewById2, 8, v, i3);
            }
            if (findViewById != null) {
                Integer a6 = sg.bigo.ads.K0.z.a(this.c.a("video_play_page.below_area_dp"));
                int intValue2 = a6 != null ? a6.intValue() : 0;
                Integer a7 = sg.bigo.ads.K0.z.a(this.c.a("video_play_page.below_area_clickable"));
                boolean z2 = (a7 != null ? a7.intValue() : 0) == 1;
                Integer a8 = sg.bigo.ads.K0.z.a(this.c.a("video_play_page.up_area_dp"));
                int intValue3 = a8 != null ? a8.intValue() : 0;
                Integer a9 = sg.bigo.ads.K0.z.a(this.c.a("video_play_page.up_area_clickable"));
                sg.bigo.ads.L.r.a(viewGroup, findViewById, intValue2, z2, intValue3, (a9 != null ? a9.intValue() : 0) == 1, 8, i3, lVar);
                return;
            }
            return;
        }
        this.f = 2;
        view2.setVisibility(0);
    }
}
