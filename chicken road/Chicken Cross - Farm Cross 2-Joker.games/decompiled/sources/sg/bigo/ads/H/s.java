package sg.bigo.ads.H;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.K0.E;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.C5202r0;
import sg.bigo.ads.h.H2;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.h.Y0;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.m.m0;
import sg.bigo.ads.m.n0;
import sg.bigo.ads.m.o0;
import sg.bigo.ads.m.p0;
import sg.bigo.ads.n.AbstractC5391n;
import sg.bigo.ads.n.V0;
import sg.bigo.ads.n.W0;
import sg.bigo.ads.t.v;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class s extends H2 implements n {
    public W0 s0;
    public m0 t0;

    public s(Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void B0() {
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5151c0
    public final int G() {
        int T = T();
        return T != 2 ? T != 3 ? T != 4 ? T != 5 ? T != 6 ? R.layout.bigo_ad_activity_pop_up_style_1 : R.layout.bigo_ad_activity_pop_up_style_6 : R.layout.bigo_ad_activity_pop_up_style_5 : R.layout.bigo_ad_activity_pop_up_style_4 : R.layout.bigo_ad_activity_pop_up_style_3 : R.layout.bigo_ad_activity_pop_up_style_2;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean K() {
        return true;
    }

    @Override // sg.bigo.ads.h.H2
    public final LandingPageStyleConfig M0() {
        Integer a2;
        Integer a3;
        sg.bigo.ads.T0.q qVar = W0().q;
        int intValue = (qVar == null || (a3 = z.a(qVar.a("endpage.webview_layout"))) == null) ? 0 : a3.intValue();
        sg.bigo.ads.T0.q qVar2 = W0().q;
        int intValue2 = (qVar2 == null || (a2 = z.a(qVar2.a("endpage.webview_force_time"))) == null) ? 0 : a2.intValue();
        ViewGroup viewGroup = this.m;
        int measuredHeight = viewGroup != null ? viewGroup.getMeasuredHeight() : 0;
        Integer a4 = AbstractC5164f1.a((NativeAd) this.l);
        return new LandingPageStyleConfig(v.class, 1, intValue, intValue2, measuredHeight, a4 != null ? a4.intValue() : 0, 0.8f);
    }

    @Override // sg.bigo.ads.h.H2
    public final boolean Q0() {
        return !this.H.get();
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void R() {
        f fVar;
        f fVar2;
        super.R();
        if (this.g == null) {
            g gVar = X0().t;
            if (gVar != null && (fVar2 = gVar.e) != null) {
                fVar2.d();
            }
            g gVar2 = W0().t;
            if (gVar2 == null || (fVar = gVar2.e) == null) {
                return;
            }
            fVar.d();
        }
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void S() {
        super.S();
        if (this.g == null) {
            X0().j();
            W0().j();
        }
    }

    @Override // sg.bigo.ads.h.H2
    public final boolean V0() {
        W0().c();
        return false;
    }

    public final m0 W0() {
        if (this.t0 == null) {
            sg.bigo.ads.C.l lVar = this.l;
            sg.bigo.ads.T0.q qVar = this.t;
            int T = T();
            this.t0 = T != 3 ? T != 5 ? T != 6 ? new m0(lVar, qVar) : new p0(lVar, qVar) : new o0(lVar, qVar) : new n0(lVar, qVar);
        }
        return this.t0;
    }

    public final W0 X0() {
        if (this.s0 == null) {
            this.s0 = AbstractC5391n.a(this.l, this.t, T());
        }
        return this.s0;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void Y() {
        MediaView mediaView;
        ViewGroup viewGroup = this.m;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        X0().b((ViewGroup) mediaView);
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.N.h
    public final void a(boolean z) {
        super.a(z);
        X().b(this.m);
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s
    public final Q1 b0() {
        Q1 q1 = new Q1();
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar != null) {
            q1.f = qVar.b("video_play_page.media_view_clickable_switch") == 1;
            q1.h = this.t.b("video_play_page.ad_component_clickable_switch") == 1;
            q1.g = this.t.b("video_play_page.other_space_clickable_switch") == 1;
            Integer a2 = z.a(this.t.a("video_play_page.click_type"));
            q1.i = a2 != null ? a2.intValue() : 0;
            q1.l = this.t.b("layer.other_space_clickable_switch") == 1;
            Integer a3 = z.a(this.t.a("layer.click_type"));
            q1.m = a3 != null ? a3.intValue() : 0;
            Integer a4 = z.a(this.t.a("video_play_page.force_staying_time"));
            q1.c = a4 != null ? a4.intValue() : 0;
            Integer a5 = z.a(this.t.a("layer.force_staying_time"));
            q1.e = a5 != null ? a5.intValue() : 0;
            Integer a6 = z.a(this.t.a("video_play_page.auto_click"));
            q1.j = a6 != null ? a6.intValue() : 0;
            Integer a7 = z.a(this.t.a("video_play_page.time_for_auto_click"));
            q1.n = a7 != null ? a7.intValue() : -1;
            Integer a8 = z.a(this.t.a("video_play_page.time_for_show_backup"));
            q1.o = a8 != null ? a8.intValue() : -1;
            this.v = true;
            q1.f12848a = false;
            q1.b = 0;
            q1.d = false;
        }
        return q1;
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s
    public final boolean f(boolean z) {
        C5241m N0;
        C5202r0 c5202r0;
        int d0 = d0();
        if (d0 == 14 && (c5202r0 = this.K) != null) {
            this.g.c();
            E e = c5202r0.q;
            if (e != null) {
                e.a();
            }
        }
        if (k0() && d0 == 0) {
            d(true);
            o(3);
            return d0() == 0;
        }
        if ((d0 == 5 || d0 == 14) && (N0 = N0()) != null) {
            N0.a(2);
        }
        return z;
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void g(int i) {
        super.g(i);
        if (this.m == null) {
            return;
        }
        Y0 y0 = this.J;
        if (y0 != null) {
            y0.m = false;
        }
        X0().e(this.m);
        X0().c(this.m);
        X0().d(this.m);
        View findViewById = this.f12687a.findViewById(R.id.inter_container);
        View findViewById2 = this.m.findViewById(R.id.media_layout);
        X0().getClass();
        X.a(findViewById, new V0(findViewById, findViewById2));
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s
    public final void g0() {
        e(true);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void h(boolean z) {
    }

    @Override // sg.bigo.ads.h.H2
    public final void n(int i) {
        W0 X0 = X0();
        ViewGroup viewGroup = this.m;
        String str = this.D;
        X0.getClass();
        W0.a(viewGroup, str);
        E g = X0().g(this.m);
        this.R = g;
        if (g == null) {
            X0().f(this.m);
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
        X0().a(this.g, this.m, this);
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s
    public final void w0() {
        super.w0();
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
            this.g.setTakeoverTickEvent(false);
        }
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.l.InterfaceC5288d
    public final void a(boolean z, boolean z2) {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
        if (z2 && d0() == 0) {
            a(this.j0, new r(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    @Override // sg.bigo.ads.h.H2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int i) {
        int a2;
        boolean z;
        sg.bigo.ads.T0.q qVar;
        boolean z2;
        sg.bigo.ads.T0.q qVar2;
        boolean z3;
        sg.bigo.ads.T0.q qVar3;
        int i2;
        if (this.m == null) {
            return;
        }
        if (d0() != 0) {
            AbstractC5496a.a("PopupVideoActivityImpl", "end page can be shown but current page is not main");
            return;
        }
        int i3 = 1;
        if (this.H.get()) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) ((C5185l1) this.e).W.e();
            C5241m c5241m = ((C5185l1) this.e).X;
            boolean z4 = ((sg.bigo.ads.U0.k) interfaceC5087a).V0 == null;
            boolean z5 = c5241m == null || !c5241m.c();
            if (z4 && z5) {
                return;
            }
        }
        View findViewById = this.m.findViewById(R.id.inter_btn_cta);
        if (findViewById != null) {
            findViewById.setBackgroundColor(this.F);
        }
        View findViewById2 = this.m.findViewById(R.id.inter_btn_mute);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        MediaView mediaView = (MediaView) this.m.findViewById(R.id.inter_media);
        if (mediaView == null || (a2 = W0().a(mediaView, (C5185l1) this.e, this.H.get())) == 0) {
            return;
        }
        W0().e(this.m);
        m0 W0 = W0();
        ViewGroup viewGroup = this.m;
        sg.bigo.ads.T0.q qVar4 = W0.q;
        if (qVar4 != null) {
            Integer a3 = z.a(qVar4.a("endpage.media_view_clickable_switch"));
            if ((a3 != null ? a3.intValue() : 0) == 1) {
                z = true;
                qVar = W0.q;
                if (qVar != null) {
                    Integer a4 = z.a(qVar.a("endpage.ad_component_clickable_switch"));
                    if ((a4 != null ? a4.intValue() : 0) == 1) {
                        z2 = true;
                        qVar2 = W0.q;
                        if (qVar2 != null) {
                            Integer a5 = z.a(qVar2.a("endpage.other_space_clickable_switch"));
                            if ((a5 != null ? a5.intValue() : 0) == 1) {
                                z3 = true;
                                qVar3 = W0.q;
                                if (qVar3 != null) {
                                    Integer a6 = z.a(qVar3.a("endpage.click_type"));
                                    if (a6 == null) {
                                        i2 = 0;
                                        W0.a(viewGroup, z, z2, z3, i2);
                                        W0().f(this.m);
                                        W0().a(this.g, this.m, this);
                                        W0().d(this.m);
                                        l(a2);
                                        sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), d0(), i);
                                    }
                                    i3 = a6.intValue();
                                }
                                i2 = i3;
                                W0.a(viewGroup, z, z2, z3, i2);
                                W0().f(this.m);
                                W0().a(this.g, this.m, this);
                                W0().d(this.m);
                                l(a2);
                                sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), d0(), i);
                            }
                        }
                        z3 = false;
                        qVar3 = W0.q;
                        if (qVar3 != null) {
                        }
                        i2 = i3;
                        W0.a(viewGroup, z, z2, z3, i2);
                        W0().f(this.m);
                        W0().a(this.g, this.m, this);
                        W0().d(this.m);
                        l(a2);
                        sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), d0(), i);
                    }
                }
                z2 = false;
                qVar2 = W0.q;
                if (qVar2 != null) {
                }
                z3 = false;
                qVar3 = W0.q;
                if (qVar3 != null) {
                }
                i2 = i3;
                W0.a(viewGroup, z, z2, z3, i2);
                W0().f(this.m);
                W0().a(this.g, this.m, this);
                W0().d(this.m);
                l(a2);
                sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), d0(), i);
            }
        }
        z = false;
        qVar = W0.q;
        if (qVar != null) {
        }
        z2 = false;
        qVar2 = W0.q;
        if (qVar2 != null) {
        }
        z3 = false;
        qVar3 = W0.q;
        if (qVar3 != null) {
        }
        i2 = i3;
        W0.a(viewGroup, z, z2, z3, i2);
        W0().f(this.m);
        W0().a(this.g, this.m, this);
        W0().d(this.m);
        l(a2);
        sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), d0(), i);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void a(ViewGroup viewGroup) {
        X0().h(viewGroup);
    }
}
