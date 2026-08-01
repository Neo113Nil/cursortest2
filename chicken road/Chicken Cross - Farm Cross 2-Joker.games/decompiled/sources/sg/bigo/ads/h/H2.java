package sg.bigo.ads.h;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5236h;
import sg.bigo.ads.i.C5240l;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.i.C5242n;
import sg.bigo.ads.i.C5243o;
import sg.bigo.ads.i.C5244p;
import sg.bigo.ads.i.C5245q;
import sg.bigo.ads.j.C5252f;
import sg.bigo.ads.k.InterfaceC5257b;
import sg.bigo.ads.l.C5285a;
import sg.bigo.ads.l.C5286b;
import sg.bigo.ads.l.C5287c;
import sg.bigo.ads.l.C5289e;
import sg.bigo.ads.l.InterfaceC5288d;
import sg.bigo.ads.m.AbstractC5325d;
import sg.bigo.ads.n.AbstractC5391n;
import sg.bigo.ads.n.C5408w;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.t.C5476f;
import sg.bigo.ads.t.InterfaceC5477g;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public class H2 extends AbstractC5204s implements InterfaceC5288d, sg.bigo.ads.N.h {
    public boolean a0;
    public boolean b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public k2 f0;
    public j2 g0;
    public int h0;
    public AbstractC5325d i0;
    public final C5289e j0;
    public final AtomicBoolean k0;
    public boolean l0;
    public C5243o m0;
    public C5245q n0;
    public boolean o0;
    public volatile boolean p0;
    public final n2 q0;
    public final E2 r0;

    public H2(Activity activity) {
        super(activity);
        this.a0 = false;
        this.b0 = true;
        this.c0 = 1;
        this.d0 = false;
        this.e0 = false;
        this.h0 = 9;
        this.j0 = new C5289e();
        this.k0 = new AtomicBoolean(false);
        this.o0 = true;
        this.q0 = new n2(this);
        this.r0 = new E2(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (r1 > 0) goto L22;
     */
    @Override // sg.bigo.ads.h.AbstractC5204s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0() {
        long j;
        long j2;
        super.E0();
        if (d0() == 0 || (d0() == 14 && f0() == -1)) {
            C5289e c5289e = this.j0;
            if (c5289e.a() && c5289e.i) {
                C5287c c5287c = c5289e.f;
                if (c5287c != null) {
                    c5287c.a();
                }
                if (c5289e.h <= 0 || !c5289e.a()) {
                    sg.bigo.ads.C.l lVar = c5289e.f13052a;
                    InterfaceC5087a interfaceC5087a = lVar != null ? (InterfaceC5087a) lVar.e() : null;
                    if (interfaceC5087a != null) {
                        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
                        sg.bigo.ads.P.r rVar = kVar.E0;
                        j2 = rVar != null ? rVar.c : 0L;
                        if (j2 <= 0) {
                            j = kVar.i();
                        }
                        C5287c c5287c2 = new C5287c(c5289e, j2, 1 * 1000);
                        c5289e.f = c5287c2;
                        c5287c2.e();
                    }
                    Q1 q1 = c5289e.b;
                    int i = q1 != null ? q1.c : 0;
                    if (i < 0) {
                        i = 15;
                    }
                    j = i * 1000;
                } else {
                    j = c5289e.h;
                }
                j2 = j;
                C5287c c5287c22 = new C5287c(c5289e, j2, 1 * 1000);
                c5289e.f = c5287c22;
                c5287c22.e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    @Override // sg.bigo.ads.h.AbstractC5151c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int G() {
        boolean z;
        int T = T();
        if (!r()) {
            switch (T) {
                case 2:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_2;
                case 3:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_3;
                case 4:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_4;
                case 5:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_5;
                case 6:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_download_6;
                case 7:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_download_7;
                case 8:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_download_8;
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    return R.layout.bigo_ad_activity_interstitial_rich_video;
                case 13:
                case 18:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_13;
                case 14:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_14;
                case 15:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_15;
                case 16:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_16;
                case 17:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_17;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_19_29;
                case 30:
                    return R.layout.bigo_ad_activity_interstitial_percent_warning;
                case 31:
                case 32:
                    sg.bigo.ads.U.r a2 = AbstractC5164f1.a(this.l);
                    Objects.toString(a2);
                    return ((31 == T || 32 == T) && a2.a()) ? a2.f12567a / a2.b >= 1 ? R.layout.bigo_ad_activity_interstitial_rich_video_land_material_31_32 : 31 == T ? R.layout.bigo_ad_activity_interstitial_rich_video_left_material_31 : R.layout.bigo_ad_activity_interstitial_rich_video_right_material_32 : R.layout.bigo_ad_activity_interstitial_native_center;
            }
        }
        AbstractC5163f0 abstractC5163f0 = this.e;
        sg.bigo.ads.P.c cVar = (abstractC5163f0 == null || ((C5185l1) abstractC5163f0).D() == null) ? null : (InterfaceC5087a) ((C5185l1) this.e).D().e();
        if (cVar != null) {
            sg.bigo.ads.P.r rVar = ((sg.bigo.ads.U0.k) cVar).E0;
            Activity activity = this.f12687a;
            if (rVar != null && activity != null && (rVar.f12490a * 1.0f) / rVar.b == (activity.getResources().getDisplayMetrics().widthPixels * 1.0f) / activity.getResources().getDisplayMetrics().heightPixels) {
                z = true;
                if (T != 1) {
                    return z ? R.layout.bigo_ad_activity_interstitial_style_landscape_1_full_media : R.layout.bigo_ad_activity_interstitial_style_landscape_1;
                }
                if (T != 3) {
                    return T != 4 ? T != 5 ? z ? R.layout.bigo_ad_activity_interstitial_style_landscape_2_full_media : R.layout.bigo_ad_activity_interstitial_style_landscape_2 : R.layout.bigo_ad_activity_interstitial_percent_warning_landscape : z ? R.layout.bigo_ad_activity_interstitial_style_landscape_4_full_media : R.layout.bigo_ad_activity_interstitial_style_landscape_4;
                }
                sg.bigo.ads.T0.q qVar = this.t;
                if (qVar == null) {
                    qVar = this.s;
                }
                if (qVar != null && cVar != null) {
                    Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.gp_element"));
                    int intValue = a3 != null ? a3.intValue() : 0;
                    if ((!TextUtils.isEmpty(((sg.bigo.ads.U0.b) cVar).U) || (intValue != 0 && intValue != 1 && intValue != 4)) && this.B != null) {
                        return R.layout.bigo_ad_activity_interstitial_style_landscape_3;
                    }
                }
                return R.layout.bigo_ad_activity_interstitial_style_landscape_3_no_gp_element;
            }
        }
        z = false;
        if (T != 1) {
        }
    }

    public final void H0() {
        View findViewById;
        if ((X() instanceof AbstractC5391n) || this.m == null || d0() != 0 || !this.a0 || (findViewById = this.m.findViewById(R.id.inter_btn_cta_layout)) == null) {
            return;
        }
        AbstractC5140Q.a(findViewById);
        this.d0 = true;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void I() {
        Integer a2;
        super.I();
        P0();
        C5289e c5289e = this.j0;
        sg.bigo.ads.C.l D = ((C5185l1) this.e).D();
        Q1 q1 = this.z;
        sg.bigo.ads.T0.q qVar = this.v ? this.t : null;
        c5289e.f13052a = D;
        c5289e.b = q1;
        int i = 1;
        if (qVar != null && (a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.countdown_way"))) != null) {
            i = a2.intValue();
        }
        c5289e.c = i;
        this.j0.g = this;
        if (this.l != null && this.v && this.t != null && ((k0() || this.H.get()) && !l0())) {
            AbstractC5325d a3 = AbstractC5325d.a(this.l, this.t, ((C5185l1) this.e).C(), this.L, r());
            this.i0 = a3;
            if (a3 != null) {
                a3.f = this.c;
            }
        }
        this.m0 = new C5243o(new F2(this));
        sg.bigo.ads.T0.q qVar2 = this.u;
        if (qVar2 != null) {
            Integer a4 = sg.bigo.ads.K0.z.a(qVar2.a("playable_attr.playable_show_delay"));
            if ((a4 != null ? a4.intValue() : 0) > 0) {
                this.n0 = new C5245q(new G2(this), this.u);
            }
        }
    }

    public final boolean I0() {
        return k0() || this.H.get();
    }

    public final void J0() {
        F1 X = X();
        X.f12858a = true;
        U u = X.b;
        if (u != null) {
            u.a();
        }
        sg.bigo.ads.K0.E e = this.R;
        if (e != null) {
            e.a();
        }
        C5150c c5150c = this.S;
        if (c5150c != null) {
            c5150c.a();
        }
        if (this.k0.get()) {
            a(this.R, this.S, X());
        }
    }

    public final void K0() {
        if (X() instanceof AbstractC5391n) {
            return;
        }
        boolean z = this.d0;
        if (!z && !this.v && this.c0 == 1) {
            this.C.postDelayed(new RunnableC5165f2(this), (sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.video_play_page.cta_animation_show_wait_time")) != null ? r0.intValue() : 0) * 1000);
            return;
        }
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null || z || !this.v || qVar.b("video_play_page.is_cta_show_animation") != 1) {
            return;
        }
        H0();
    }

    public C5231c L0() {
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null) {
            return null;
        }
        return ((C5185l1) abstractC5163f0).Y;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean M() {
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LandingPageStyleConfig M0() {
        int i;
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null || !this.v) {
            qVar = null;
        }
        int a2 = AbstractC5391n.a(qVar, "endpage.webview_layout");
        int a3 = AbstractC5391n.a(qVar, "endpage.webview_force_time", "endpage.webview_force_time_new");
        int i2 = AbstractC5325d.a(this.i0, qVar) ? X().o : 0;
        if (i2 == 0) {
            Integer a4 = AbstractC5164f1.a((NativeAd) this.l);
            if (a4 == null) {
                i = 0;
                Class i3 = AbstractC5204s.i(a2);
                ViewGroup viewGroup = this.m;
                return new LandingPageStyleConfig(i3, 1, a2, a3, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, i, 0.8f);
            }
            i2 = a4.intValue();
        }
        i = i2;
        Class i32 = AbstractC5204s.i(a2);
        ViewGroup viewGroup2 = this.m;
        return new LandingPageStyleConfig(i32, 1, a2, a3, viewGroup2 != null ? viewGroup2.getMeasuredHeight() : 0, i, 0.8f);
    }

    public C5241m N0() {
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null) {
            return null;
        }
        return ((C5185l1) abstractC5163f0).X;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5151c0
    public void O() {
        this.w = true;
        sg.bigo.ads.C.l D = ((C5185l1) this.e).D();
        boolean z = D != null && D.E == 22;
        if (this.v || d0() != 0 || z) {
            super.O();
        } else {
            o(3);
        }
    }

    public final void O0() {
        View findViewById;
        X().e();
        ViewGroup viewGroup = this.m;
        if (viewGroup == null) {
            return;
        }
        if (this.a0) {
            View findViewById2 = viewGroup.findViewById(R.id.inter_ad_info);
            if (findViewById2 != null) {
                this.a0 = false;
                AbstractC5140Q.a(findViewById2, new C5131H(findViewById2));
            }
            View findViewById3 = this.m.findViewById(R.id.inter_ad_info_new);
            if (findViewById3 != null) {
                this.a0 = false;
                AbstractC5140Q.a(findViewById3, new C5131H(findViewById3));
            }
            View findViewById4 = this.m.findViewById(R.id.inter_ad_info_down);
            if (findViewById4 != null) {
                this.a0 = false;
                AbstractC5140Q.a(findViewById4, new C5131H(findViewById4));
            }
        }
        if (!this.b0 || (findViewById = this.m.findViewById(R.id.inter_media_container)) == null) {
            return;
        }
        this.b0 = false;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setInterpolator(AbstractC4954k.a(1));
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new C5132I(findViewById));
        findViewById.startAnimation(alphaAnimation);
        MediaView mediaView = (MediaView) findViewById.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.destroy();
        }
    }

    public void P0() {
        if (this.K != null) {
            return;
        }
        C5202r0 c5202r0 = new C5202r0(((C5185l1) this.e).D(), X());
        this.K = c5202r0;
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null) {
            c5202r0.h = false;
        } else {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("multi_ads.page_group_type"));
            int intValue = a2 != null ? a2.intValue() : 1;
            c5202r0.g = intValue;
            if (intValue == 2 || intValue == 3) {
                c5202r0.h = true;
                Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("play_page.is_loading"));
                c5202r0.c = a3 != null ? a3.intValue() : 1;
                Integer a4 = sg.bigo.ads.K0.z.a(qVar.a("play_page.loading_timing"));
                c5202r0.d = a4 != null ? a4.intValue() : 0;
                Integer a5 = sg.bigo.ads.K0.z.a(qVar.a("play_page.force_staying_time"));
                c5202r0.e = a5 != null ? a5.intValue() : 15;
                Integer a6 = sg.bigo.ads.K0.z.a(qVar.a("play_page.duration"));
                c5202r0.f = a6 != null ? a6.intValue() : 30;
            } else {
                c5202r0.h = false;
            }
        }
        C5202r0 c5202r02 = this.K;
        if (c5202r02 == null || !c5202r02.b()) {
            return;
        }
        l(14);
        Q1 q1 = this.z;
        this.K.getClass();
        q1.getClass();
        this.z.c = this.K.f;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public void Q() {
        if (this.p0) {
            this.C.removeCallbacks(this.q0);
            this.p0 = false;
        }
        AbstractC5446j.b(new q2(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if ((r0 != null ? r0.intValue() : 0) != 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean Q0() {
        sg.bigo.ads.T0.q qVar;
        if (this.e == null) {
            return false;
        }
        if (r() && this.v && (qVar = this.t) != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_layout"));
            if ((a2 != null ? a2.intValue() : 0) == 3) {
                return true;
            }
        }
        if (this.v) {
            sg.bigo.ads.T0.q qVar2 = this.t;
            if (qVar2 != null) {
                Integer a3 = sg.bigo.ads.K0.z.a(qVar2.a("endpage.ad_component_layout"));
            }
            AbstractC5325d abstractC5325d = this.i0;
            if (abstractC5325d == null || !abstractC5325d.i()) {
                return false;
            }
        }
        return true;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void R() {
        super.R();
        sg.bigo.ads.K0.E e = this.R;
        if (e != null) {
            e.d();
        }
        C5150c c5150c = this.S;
        if (c5150c != null) {
            c5150c.d();
        }
        sg.bigo.ads.K0.E e2 = this.T;
        if (e2 != null) {
            e2.d();
        }
        C5201r c5201r = this.U;
        if (c5201r != null) {
            c5201r.d();
        }
        C5241m N0 = N0();
        if (N0 != null) {
            N0.p.pause();
        }
        AbstractC5325d abstractC5325d = this.i0;
        if (abstractC5325d != null) {
            abstractC5325d.a();
        }
        boolean z = false;
        this.j0.a(false);
        VideoController W = W();
        if (W != null && W.isPlaying()) {
            z = true;
        }
        this.o0 = z;
        if (z) {
            W.pause();
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        adCountDownButton.a();
    }

    public boolean R0() {
        return this.z.j == 3;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void S() {
        VideoController W;
        super.S();
        int d0 = d0();
        if (d0 != 10 && (!this.H.get() || ((sg.bigo.ads.U0.k) ((InterfaceC5087a) ((C5185l1) this.e).D().e())).V0 != null)) {
            sg.bigo.ads.K0.E e = this.R;
            if (e != null && e.b()) {
                this.R.e();
            }
            C5150c c5150c = this.S;
            if (c5150c != null && c5150c.b()) {
                this.S.e();
            }
        }
        C5241m N0 = N0();
        if (N0 != null) {
            N0.p.d();
        }
        AbstractC5325d abstractC5325d = this.i0;
        if (abstractC5325d != null) {
            abstractC5325d.b();
        }
        this.j0.b(false);
        if ((d0 == 0 || d0 == 3) && (W = W()) != null && W.isPaused() && this.o0) {
            W.play();
            this.o0 = false;
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        C5201r c5201r = this.U;
        if (c5201r != null && c5201r.b()) {
            this.U.e();
        }
        sg.bigo.ads.K0.E e2 = this.T;
        if (e2 == null || !e2.b()) {
            return;
        }
        this.T.e();
    }

    public void S0() {
    }

    public final void T0() {
        C5231c L0;
        sg.bigo.ads.P.c e;
        if (this.e != null) {
            if (!I0()) {
                sg.bigo.ads.C.l lVar = this.l;
                C5241m N0 = N0();
                if (lVar == null || N0 == null || !N0.f12988a || (e = lVar.e()) == null || ((sg.bigo.ads.U0.b) e).p0 != 1) {
                    return;
                }
            }
            a(9, N0());
            if (this.e == null || !I0() || (L0 = L0()) == null) {
                return;
            }
            D2 d2 = new D2(this, 15, 9);
            InterfaceC5257b interfaceC5257b = L0.b;
            if (interfaceC5257b instanceof C5252f) {
                ((C5252f) interfaceC5257b).l = d2;
            }
            C2 c2 = new C2(this);
            if (interfaceC5257b instanceof sg.bigo.ads.j.l) {
                ((sg.bigo.ads.j.l) interfaceC5257b).k = c2;
            }
            L0.a(this.f12687a);
        }
    }

    public void U0() {
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 != null) {
            C5185l1 c5185l1 = (C5185l1) abstractC5163f0;
            C5241m c5241m = c5185l1.X;
            if (c5241m != null) {
                c5241m.a();
                c5185l1.X = null;
            }
            C5185l1 c5185l12 = (C5185l1) this.e;
            C5231c c5231c = c5185l12.Y;
            if (c5231c != null) {
                c5231c.a();
                c5185l12.Y = null;
            }
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1
    public int V() {
        return this.H.get() ? 3 : 1;
    }

    public boolean V0() {
        sg.bigo.ads.y.i iVar = this.M;
        if (iVar == null || !iVar.d()) {
            if (!AbstractC5325d.a(this.i0, this.v ? this.t : null)) {
                return false;
            }
        }
        return true;
    }

    public final void a(View view, View view2) {
        sg.bigo.ads.T0.q qVar;
        sg.bigo.ads.d1.u uVar;
        if (this.m == null) {
            return;
        }
        int i = 0;
        if (!this.v) {
            Integer a2 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.endpage.is_global_click"));
            if ((a2 != null ? a2.intValue() : 0) == 1) {
                ViewGroup viewGroup = this.m;
                if (viewGroup != null) {
                    viewGroup.setTag(11);
                    a(this.m, 4, ((C5185l1) this.e).D(), 0);
                    return;
                }
                return;
            }
        }
        if (!this.v || (qVar = this.t) == null) {
            return;
        }
        Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("endpage.media_view_clickable_switch"));
        if ((a3 != null ? a3.intValue() : 0) == 1) {
            sg.bigo.ads.C.l D = ((C5185l1) this.e).D();
            Integer a4 = sg.bigo.ads.K0.z.a(this.t.a("endpage.click_type"));
            a(view, 9, D, a4 != null ? a4.intValue() : 0);
        } else {
            a(view, 9, AbstractC5144a1.p, 0);
        }
        Integer a5 = sg.bigo.ads.K0.z.a(this.t.a("endpage.other_space_clickable_switch"));
        if ((a5 != null ? a5.intValue() : 0) == 1) {
            uVar = ((C5185l1) this.e).D();
            Integer a6 = sg.bigo.ads.K0.z.a(this.t.a("endpage.click_type"));
            if (a6 != null) {
                i = a6.intValue();
            }
        } else {
            uVar = AbstractC5144a1.p;
        }
        a(view2, 9, uVar, i);
    }

    public final boolean b(int i, C5241m c5241m) {
        C5243o c5243o = this.m0;
        if (c5243o != null) {
            View view = c5241m.p.o;
            if (!c5241m.c()) {
                AbstractC5496a.a("PlayablePagePresenter", "playableAdCompanion is not ResourceReady");
                c5241m.p.b();
            } else if (view == null) {
                AbstractC5496a.a("PlayablePagePresenter", "playableView == null.");
            } else {
                ViewGroup a2 = c5243o.a(i, "");
                if (a2 != null) {
                    c5241m.f();
                    H2 h2 = (H2) c5243o.f12990a.f12819a.get();
                    ViewGroup viewGroup = h2 == null ? null : h2.m;
                    sg.bigo.ads.K0.X.a(view, a2, new FrameLayout.LayoutParams(-1, -1, 17), -1);
                    view.setTag(19);
                    H2 h22 = (H2) c5243o.f12990a.f12819a.get();
                    if (h22 != null) {
                        h22.a(view, viewGroup);
                    }
                    c5243o.f12990a.a();
                    H2 h23 = (H2) c5243o.f12990a.f12819a.get();
                    if (h23 != null) {
                        h23.r0.f12816a.add(view);
                    }
                    c5241m.a(1);
                    H2 h24 = (H2) c5243o.f12990a.f12819a.get();
                    C5185l1 c5185l1 = h24 == null ? null : (C5185l1) h24.e;
                    if (c5185l1 != null && c5185l1.D() != null && c5185l1.D().getWatermarkView() != null) {
                        c5185l1.D().getWatermarkView().bringToFront();
                    }
                    H2 h25 = (H2) c5243o.f12990a.f12819a.get();
                    C5185l1 c5185l12 = h25 != null ? (C5185l1) h25.e : null;
                    if (c5185l12 != null) {
                        sg.bigo.ads.s1.b.a((InterfaceC5087a) c5185l12.W.e(), 5, i);
                    }
                    H2 h26 = (H2) c5243o.f12990a.f12819a.get();
                    if (h26 == null) {
                        return true;
                    }
                    h26.S0();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public Q1 b0() {
        Q1 q1 = new Q1();
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null) {
            this.v = false;
            q1.j = 1;
            q1.k = -1;
            q1.f12848a = this.s.b("interstitial_video_style.video_play_page.is_global_click") == 1;
            Integer a2 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.video_play_page.impression_close_seconds"));
            q1.b = a2 != null ? a2.intValue() : 0;
            Integer a3 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.video_play_page.close_click_seconds"));
            q1.c = a3 != null ? a3.intValue() : 0;
            q1.d = this.s.b("interstitial_video_style.video_play_page.is_jump_layer") == 1;
            Integer a4 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.layer.impression_layer_close_seconds"));
            q1.e = a4 != null ? a4.intValue() : 0;
            return q1;
        }
        this.v = true;
        q1.f = qVar.b("video_play_page.media_view_clickable_switch") == 1;
        q1.h = this.t.b("video_play_page.ad_component_clickable_switch") == 1;
        q1.g = this.t.b("video_play_page.other_space_clickable_switch") == 1;
        Integer a5 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.click_type"));
        q1.i = a5 != null ? a5.intValue() : 0;
        q1.l = this.t.b("layer.other_space_clickable_switch") == 1;
        Integer a6 = sg.bigo.ads.K0.z.a(this.t.a("layer.click_type"));
        q1.m = a6 != null ? a6.intValue() : 0;
        q1.f12848a = false;
        q1.b = 0;
        Integer a7 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.force_staying_time"));
        q1.c = a7 != null ? a7.intValue() : 0;
        q1.d = this.t.b("layer.is_show_layer") == 1;
        Integer a8 = sg.bigo.ads.K0.z.a(this.t.a("layer.force_staying_time"));
        q1.e = a8 != null ? a8.intValue() : 0;
        Integer a9 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.auto_click"));
        q1.j = a9 != null ? a9.intValue() : 0;
        Integer a10 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.auto_click_new"));
        q1.k = a10 != null ? a10.intValue() : -1;
        Integer a11 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.time_for_auto_click"));
        q1.n = a11 != null ? a11.intValue() : -1;
        Integer a12 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.time_for_show_backup"));
        q1.o = a12 != null ? a12.intValue() : -1;
        return q1;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.t.InterfaceC5475e
    public final void e(int i) {
        super.e(i);
        if (d0() != 0) {
            J0();
            a(this.R, this.S, X());
        }
        if (this.k0.compareAndSet(true, false)) {
            b(this.U, this.J, this.j0, this.R, this.S, X());
            if (this.j0.d) {
                a(this.R, this.S, X());
            }
            c0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        r7 = r7.intValue();
     */
    @Override // sg.bigo.ads.h.AbstractC5204s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(boolean z) {
        C5241m N0;
        Y0 y0;
        AbstractC5163f0 abstractC5163f0;
        C5202r0 c5202r0;
        int d0 = d0();
        if (d0 == 14 && (c5202r0 = this.K) != null) {
            this.g.c();
            sg.bigo.ads.K0.E e = c5202r0.q;
            if (e != null) {
                e.a();
            }
        }
        if (!k0() && !this.H.get() && (d0 == 0 || d0 == 14)) {
            J0();
            h0();
            d(true);
            AdCountDownButton adCountDownButton = this.g;
            if (adCountDownButton != null) {
                adCountDownButton.c();
            }
            C5202r0 c5202r02 = this.K;
            if (c5202r02 != null && c5202r02.h && !c5202r02.i) {
                o(2);
                return false;
            }
            Y0 y02 = this.J;
            if (y02 != null && (y02.I.a() || this.J.N)) {
                return false;
            }
            R();
            return !D0();
        }
        if (d0 == 0 || d0 == 10 || d0 == 14) {
            J0();
            if (d0 != 10 && (y0 = this.J) != null && (y0.I.a() || this.J.N)) {
                l(10);
                return false;
            }
            if (l0()) {
                return true;
            }
            o(2);
            if (d0 == 14 && (N0 = N0()) != null) {
                N0.a(2);
            }
            return false;
        }
        if (d0 == 5) {
            boolean D0 = D0();
            AdCountDownButton adCountDownButton2 = this.g;
            if (adCountDownButton2 != null) {
                adCountDownButton2.c();
                if (!D0) {
                    int intValue = this.v ? 0 : 0;
                    a(intValue * 1000);
                }
            }
            if (D0 && (abstractC5163f0 = this.e) != null) {
                sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) abstractC5163f0).W.e(), 9, this.h0);
                C5241m N02 = N0();
                if (N02 != null) {
                    N02.a(2);
                }
                return false;
            }
            C5241m N03 = N0();
            if (N03 != null) {
                N03.a(2);
            }
        }
        if (d0 != 1 && d0 != 7) {
            return z;
        }
        boolean D02 = D0();
        if (D02) {
            sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 9, 10);
        }
        return z && !D02;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void g(boolean z) {
        super.g(z);
        this.I = z;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public void g0() {
        Y0 y0;
        if (((sg.bigo.ads.U0.k) ((InterfaceC5087a) ((C5185l1) this.e).W.e())).O0 && (y0 = this.J) != null && y0.I.a(new r2(this))) {
            return;
        }
        o(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z) {
        View view;
        boolean z2;
        sg.bigo.ads.q.o oVar;
        int a2;
        TextView textView;
        Integer a3;
        int i;
        int i2;
        int i3;
        sg.bigo.ads.T0.q qVar;
        sg.bigo.ads.T0.q qVar2;
        boolean z3;
        boolean z4;
        Integer a4;
        Integer a5;
        ViewGroup viewGroup = this.m;
        if (viewGroup == null) {
            return;
        }
        View findViewById = viewGroup.findViewById(R.id.inter_layout_playable_loading);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        m2 m2Var = new m2(this);
        AbstractC5325d abstractC5325d = this.i0;
        if (abstractC5325d != null) {
            view = abstractC5325d.a(this, this.m, V());
            m2Var.run();
        } else {
            View findViewById2 = this.m.findViewById(R.id.inter_end_page);
            if (findViewById2 == null) {
                Context context = this.m.getContext();
                if (r()) {
                    if (!this.v || (qVar = this.t) == null) {
                        i3 = 1;
                    } else {
                        Integer a6 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_layout"));
                        i3 = a6 != null ? a6.intValue() : 0;
                    }
                    i = i3 != 2 ? R.layout.bigo_ad_activity_interstitial_rich_video_end_landscape : R.layout.bigo_ad_activity_interstitial_rich_video_end_landscape_2;
                } else {
                    if (!this.e0) {
                        if (this.v) {
                            Integer a7 = sg.bigo.ads.K0.z.a(this.t.a("endpage.ad_component_layout"));
                            i2 = a7 != null ? a7.intValue() : 0;
                        } else {
                            i2 = 1;
                        }
                        if (i2 == 2) {
                            i = R.layout.bigo_ad_activity_interstitial_rich_video_end_2;
                        } else if (i2 == 3) {
                            i = R.layout.bigo_ad_activity_interstitial_rich_video_end_3;
                        } else if (i2 == 4) {
                            i = R.layout.bigo_ad_activity_interstitial_rich_video_end_4;
                        }
                    }
                    i = R.layout.bigo_ad_activity_interstitial_rich_video_end;
                }
                ViewGroup viewGroup2 = this.m;
                AbstractC4944a.a(context, i, viewGroup2, viewGroup2 != null);
            }
            View findViewById3 = this.m.findViewById(R.id.inter_layout_end_page);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            if (findViewById2 == null) {
                View findViewById4 = this.m.findViewById(R.id.inter_end_page);
                View findViewById5 = this.m.findViewById(R.id.inter_end_page_image);
                if (findViewById4 != null && findViewById3 != null) {
                    int i4 = this.v ? 9 : 4;
                    F1 X = X();
                    ViewGroup viewGroup3 = this.m;
                    int V = V();
                    sg.bigo.ads.T0.q qVar3 = this.t;
                    X.a(viewGroup3, findViewById3, V, i4, (qVar3 == null || (a3 = sg.bigo.ads.K0.z.a(qVar3.a("endpage.click_type"))) == null) ? 0 : a3.intValue(), findViewById3);
                    View view2 = findViewById5 == null ? findViewById4 : findViewById5;
                    View view3 = findViewById5 == null ? findViewById3 : findViewById4;
                    view2.setTag(5);
                    view3.setTag(9);
                    a(view2, view3);
                    TextView textView2 = (TextView) findViewById4.findViewById(R.id.inter_advertiser);
                    TextView textView3 = (TextView) findViewById4.findViewById(R.id.inter_ad_label);
                    if (TextUtils.isEmpty(this.D)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(this.D);
                        textView3.setText(R.string.bigo_ad_tag);
                    }
                    AbstractC5140Q.c(findViewById4);
                    View findViewById6 = findViewById4.findViewById(R.id.inter_btn_cta);
                    if (this.v) {
                        Integer a8 = sg.bigo.ads.K0.z.a(this.t.a("endpage.is_cta_show_animation"));
                        if (!((a8 != null ? a8.intValue() : 0) == 1)) {
                            z2 = false;
                            if (z2 && findViewById6 != null) {
                                if (this.v) {
                                    findViewById6.setBackgroundColor(this.F);
                                }
                                AbstractC5140Q.a(findViewById6);
                            }
                            m2Var.run();
                            oVar = this.L;
                            if (oVar != null) {
                                oVar.a((ViewGroup) findViewById3, 1);
                            }
                            if (r()) {
                                Context context2 = findViewById4.getContext();
                                if (!TextUtils.isEmpty(this.D) && textView3 != null && context2 != null) {
                                    textView3.setText(this.D + " · " + context2.getString(R.string.bigo_ad_tag));
                                }
                                View findViewById7 = findViewById4.findViewById(R.id.inter_btn_end_page_cta_layout);
                                if (z2 && findViewById7 != null) {
                                    if (findViewById6 != null) {
                                        findViewById6.clearAnimation();
                                    }
                                    AbstractC5140Q.a(findViewById7);
                                }
                                if (this.v && (textView = (TextView) findViewById4.findViewById(R.id.inter_company)) != null) {
                                    textView.setTextColor(this.F);
                                }
                                T t = new T();
                                TextView textView4 = (TextView) findViewById4.findViewById(R.id.inter_title);
                                if (textView4 != null) {
                                    t.a(textView4);
                                }
                                TextView textView5 = (TextView) findViewById4.findViewById(R.id.inter_description);
                                if (textView5 != null) {
                                    t.a(textView5);
                                }
                                sg.bigo.ads.T0.q qVar4 = this.t;
                                if (qVar4 != null) {
                                    Integer a9 = sg.bigo.ads.K0.z.a(qVar4.a("video_play_page.background_colour"));
                                    int intValue = a9 != null ? a9.intValue() : 0;
                                    if (intValue == 1) {
                                        t.a(-1);
                                    } else {
                                        if (intValue == 2) {
                                            a2 = ViewCompat.MEASURED_STATE_MASK;
                                        } else if (intValue == 4) {
                                            a2 = this.E;
                                        } else if (intValue == 5) {
                                            X().b(this.m);
                                        } else {
                                            a2 = sg.bigo.ads.K0.I.a(-7829368, "#262E33");
                                        }
                                        t.a(a2);
                                    }
                                }
                                IconListView iconListView = (IconListView) findViewById4.findViewById(R.id.inter_iconlist_download_msg_list);
                                if (this.B != null && iconListView != null) {
                                    iconListView.setThemeWhite(t.d == -1);
                                    iconListView.a(this.B);
                                    iconListView.setVisibility(0);
                                }
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        if (this.v) {
                        }
                        AbstractC5140Q.a(findViewById6);
                    }
                    m2Var.run();
                    oVar = this.L;
                    if (oVar != null) {
                    }
                    if (r()) {
                    }
                }
            }
            view = findViewById3;
        }
        if (((C5185l1) this.e).D().getWatermarkView() != null) {
            ((C5185l1) this.e).D().getWatermarkView().bringToFront();
        }
        if (!z || view == null || (qVar2 = this.t) == null) {
            return;
        }
        int intValue2 = (!this.v || (a5 = sg.bigo.ads.K0.z.a(qVar2.a("endpage.below_area_dp"))) == null) ? 0 : a5.intValue();
        if (this.v) {
            Integer a10 = sg.bigo.ads.K0.z.a(this.t.a("endpage.below_area_clickable"));
            if ((a10 != null ? a10.intValue() : 0) == 1) {
                z3 = true;
                int intValue3 = (this.v || (a4 = sg.bigo.ads.K0.z.a(this.t.a("endpage.up_area_dp"))) == null) ? 0 : a4.intValue();
                if (this.v) {
                    Integer a11 = sg.bigo.ads.K0.z.a(this.t.a("endpage.up_area_clickable"));
                    if ((a11 != null ? a11.intValue() : 0) == 1) {
                        z4 = true;
                        Integer a12 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.click_type"));
                        a(view, intValue2, z3, intValue3, z4, 9, a12 != null ? a12.intValue() : 0);
                    }
                }
                z4 = false;
                Integer a122 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.click_type"));
                a(view, intValue2, z3, intValue3, z4, 9, a122 != null ? a122.intValue() : 0);
            }
        }
        z3 = false;
        if (this.v) {
        }
        if (this.v) {
        }
        z4 = false;
        Integer a1222 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.click_type"));
        a(view, intValue2, z3, intValue3, z4, 9, a1222 != null ? a1222.intValue() : 0);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void l(int i) {
        ViewGroup viewGroup;
        super.l(i);
        if (i != 9 || k0() || (viewGroup = this.m) == null) {
            return;
        }
        viewGroup.postDelayed(new l2(this), 50L);
    }

    public void n(int i) {
        RoundedFrameLayout roundedFrameLayout;
        if (X() instanceof AbstractC5391n) {
            return;
        }
        m(i);
        View findViewById = this.m.findViewById(R.id.inter_ad_info);
        if (findViewById != null) {
            int i2 = A0().f12870a;
            if (i2 > 0) {
                Context context = findViewById.getContext();
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = AbstractC4963u.a(context, 10);
                    marginLayoutParams.rightMargin = AbstractC4963u.a(context, 10);
                    marginLayoutParams.bottomMargin = AbstractC4963u.a(context, i2);
                }
                View findViewById2 = this.m.findViewById(R.id.inter_ad_info_background);
                if (findViewById2 != null) {
                    if (findViewById2 instanceof RoundedFrameLayout) {
                        roundedFrameLayout = (RoundedFrameLayout) findViewById2;
                        roundedFrameLayout.setCornerRadius(AbstractC4963u.a(context, 16));
                    }
                } else if (findViewById instanceof RoundedFrameLayout) {
                    roundedFrameLayout = (RoundedFrameLayout) findViewById;
                    roundedFrameLayout.setCornerRadius(AbstractC4963u.a(context, 16));
                }
            }
            if (o0() || p0()) {
                this.a0 = true;
                K0();
                return;
            }
            int i3 = 0;
            if (this.v) {
                Integer a2 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.ad_component_show_time"));
                if (a2 != null) {
                    i3 = a2.intValue();
                }
            } else {
                Integer a3 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.video_play_page.impression_ad_seconds"));
                if (a3 != null) {
                    i3 = a3.intValue();
                }
            }
            this.R = new y2(this, i3 * 1000, findViewById);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(int i) {
        View findViewById;
        boolean z;
        sg.bigo.ads.P.c e;
        C5243o c5243o;
        ViewGroup a2;
        ViewGroup viewGroup;
        C5241m c5241m;
        ViewStub viewStub;
        View view;
        h0();
        d(!this.H.get());
        C5241m N0 = N0();
        C5202r0 c5202r0 = this.K;
        if (c5202r0 != null) {
            ViewGroup viewGroup2 = this.m;
            if (viewGroup2 != null && (c5241m = c5202r0.o) != null && c5202r0.b != null && c5202r0.h && !c5202r0.i) {
                c5241m.f();
                View view2 = c5202r0.o.p.o;
                if (view2 != null) {
                    AbstractC4944a.a(viewGroup2.getContext(), R.layout.bigo_ad_activity_interstitial_play_page, viewGroup2, true);
                    viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.inter_layout_end_page);
                    if (viewGroup != null) {
                        if (!c5202r0.o.c() && c5202r0.c != 0 && !c5202r0.j) {
                            if ((c5202r0.k == null || c5202r0.l == null) && (viewStub = (ViewStub) viewGroup2.findViewById(R.id.bigo_web_loading_container)) != null) {
                                View inflate = viewStub.inflate();
                                c5202r0.k = inflate;
                                if (inflate != null) {
                                    c5202r0.l = (ProgressBar) inflate.findViewById(R.id.bigo_ad_webview_loading_progress);
                                }
                            }
                            View view3 = c5202r0.k;
                            if (view3 != null) {
                                view3.setVisibility(0);
                                ProgressBar progressBar = c5202r0.l;
                                if (progressBar != null) {
                                    progressBar.setProgress(c5202r0.m);
                                }
                            }
                            int i2 = c5202r0.d;
                            int i3 = i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 10 : 5 : 3;
                            if (i3 >= 3 && (view = c5202r0.k) != null) {
                                view.postDelayed(new RunnableC5199q0(c5202r0), i3 * 1000);
                            } else if (c5202r0.n) {
                                c5202r0.a();
                            }
                            c5202r0.j = true;
                        }
                        sg.bigo.ads.K0.X.a(view2, (ViewGroup) viewGroup.findViewById(R.id.inter_play_page), new FrameLayout.LayoutParams(-1, -1, 17), -1);
                        c5202r0.i = true;
                        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
                        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_ad_label);
                        String advertiser = c5202r0.f12920a.getAdvertiser();
                        if (textView != null && textView2 != null) {
                            boolean isEmpty = TextUtils.isEmpty(advertiser);
                            textView.setVisibility(!isEmpty ? 0 : 8);
                            if (!isEmpty) {
                                textView.setText(advertiser);
                                textView2.setText(R.string.bigo_ad_tag);
                            }
                        }
                        c5202r0.b.a(viewGroup2, viewGroup, 1, 16, 0, null);
                        if (viewGroup == null) {
                            O0();
                            this.r0.f12816a.add(viewGroup);
                            l(14);
                            C5202r0 c5202r02 = this.K;
                            AdCountDownButton adCountDownButton = this.g;
                            if (adCountDownButton == null) {
                                c5202r02.getClass();
                            } else if (c5202r02.b()) {
                                long j = c5202r02.f * 1000;
                                C5193o0 c5193o0 = new C5193o0(c5202r02, j, j, c5202r02.e * 1000, adCountDownButton);
                                c5202r02.q = c5193o0;
                                c5193o0.e();
                            } else {
                                adCountDownButton.clearAnimation();
                                adCountDownButton.setVisibility(4);
                                C5196p0 c5196p0 = new C5196p0(c5202r02.e * 1000, adCountDownButton);
                                c5202r02.q = c5196p0;
                                c5196p0.e();
                            }
                            N0.a(1);
                            sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 14, i);
                            S0();
                            return;
                        }
                        C5202r0 c5202r03 = this.K;
                        sg.bigo.ads.K0.E e2 = c5202r03.q;
                        if (e2 != null) {
                            e2.a();
                        }
                        c5202r03.q = null;
                        c5202r03.p = null;
                        c5202r03.o = null;
                    }
                }
            }
            viewGroup = null;
            if (viewGroup == null) {
            }
        }
        if (N0 != null && !N0.b && N0.h() && (c5243o = this.m0) != null && (a2 = c5243o.a(i, "force fallback: ")) != null) {
            H2 h2 = (H2) c5243o.f12990a.f12819a.get();
            ViewGroup viewGroup3 = h2 == null ? null : h2.m;
            H2 h22 = (H2) c5243o.f12990a.f12819a.get();
            if (h22 != null) {
                h22.a(a2, viewGroup3);
            }
            C5236h c5236h = c5243o.b;
            if (c5236h != null) {
                c5236h.a();
            }
            C5236h c5236h2 = new C5236h(N0);
            c5243o.b = c5236h2;
            c5236h2.g = new C5242n(c5243o, N0);
            if (viewGroup3 != null) {
                c5236h2.a(viewGroup3.getContext(), a2);
            }
            c5243o.f12990a.a();
            H2 h23 = (H2) c5243o.f12990a.f12819a.get();
            C5185l1 c5185l1 = h23 == null ? null : (C5185l1) h23.e;
            if (c5185l1 != null) {
                sg.bigo.ads.s1.b.a((InterfaceC5087a) c5185l1.W.e(), 5, i);
            }
            H2 h24 = (H2) c5243o.f12990a.f12819a.get();
            if (h24 != null) {
                h24.S0();
                return;
            }
            return;
        }
        sg.bigo.ads.C.l lVar = this.l;
        boolean z2 = N0 != null && !N0.b && (z = N0.f12988a) && ((lVar != null && z && (e = lVar.e()) != null && ((sg.bigo.ads.U0.b) e).p0 == 1) || (!(this instanceof sg.bigo.ads.w.b) && k0() && Q0()));
        if (N0 != null && z2) {
            if (N0.c()) {
                b(i, N0);
                return;
            }
            sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
            if (gVar.C.f12488a == 2) {
                j2 j2Var = this.g0;
                if (j2Var == null) {
                    j2Var = new j2(this, N0);
                    this.g0 = j2Var;
                }
                N0.e = j2Var;
                int i4 = gVar.C.b;
                if (this.m != null && d0() == 0 && d0() == 10) {
                    l(4);
                    O0();
                    i(false);
                    AdCountDownButton adCountDownButton2 = this.g;
                    if (adCountDownButton2 != null && adCountDownButton2.getVisibility() == 0) {
                        this.g.clearAnimation();
                        this.g.setVisibility(4);
                    }
                    ViewGroup viewGroup4 = this.m;
                    if (viewGroup4 != null && (findViewById = viewGroup4.findViewById(R.id.inter_layout_playable_loading)) != null) {
                        findViewById.setVisibility(0);
                        int i5 = i4 >= 1 ? i4 : 1;
                        k2 k2Var = this.f0;
                        if (k2Var == null) {
                            k2Var = new k2(this, N0);
                            this.f0 = k2Var;
                        }
                        AbstractC5446j.a(2, null, k2Var, i5 * 1000);
                    }
                    sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), d0(), 7);
                    return;
                }
            } else if (b(i, N0)) {
                return;
            }
        }
        p(i);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public boolean o0() {
        int i;
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar != null) {
            if (this.v) {
                Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_layout"));
                if (a2 != null) {
                    i = a2.intValue();
                }
            } else {
                i = 1;
            }
            return (i != 6 || i == 7) ? !r() : i == 8;
        }
        i = 0;
        if (i != 6) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0209, code lost:
    
        if (r4 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0222, code lost:
    
        r4.bringToFront();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0220, code lost:
    
        if (r4 != null) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i) {
        Integer a2;
        C5231c L0;
        View e;
        Integer a3;
        if (this.m == null) {
            return;
        }
        if (d0() != 0 && d0() != 10 && d0() != 4 && d0() != 14) {
            AbstractC5496a.a("RichInterstitialVideoActivityImpl", "end page can be shown but current page is not main or playable loading or mid page or play page.");
            return;
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
        if (!k0() && !this.H.get()) {
            D0();
            return;
        }
        E2 e2 = this.r0;
        if (e2.b.m != null) {
            Iterator it = e2.f12816a.iterator();
            while (it.hasNext()) {
                e2.b.m.removeView((View) it.next());
            }
        }
        O0();
        boolean z = this instanceof sg.bigo.ads.w.b;
        int i2 = 1;
        if (!z && Q0() && (L0 = L0()) != null) {
            if (L0.f12978a && L0.c() && (e = L0.e()) != null) {
                if (e instanceof ViewGroup) {
                    Integer a4 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.endpage.is_global_click"));
                    if ((a4 != null ? a4.intValue() : 0) != 1) {
                        e.setOnClickListener(null);
                    }
                }
                ViewGroup viewGroup = this.m;
                if (viewGroup != null) {
                    Context context = viewGroup.getContext();
                    int i3 = R.layout.bigo_ad_activity_interstitial_rich_video_empty_end;
                    ViewGroup viewGroup2 = this.m;
                    AbstractC4944a.a(context, i3, viewGroup2, viewGroup2 != null);
                    ViewGroup viewGroup3 = (ViewGroup) this.m.findViewById(R.id.inter_layout_end_page);
                    if (viewGroup3 == null) {
                        AbstractC5496a.a("RichInterstitialVideoActivityImpl", "playContainer is null.");
                    } else {
                        sg.bigo.ads.q.o oVar = this.L;
                        if (oVar != null) {
                            oVar.a(viewGroup3, 8);
                        }
                        sg.bigo.ads.K0.X.a(e, (ViewGroup) viewGroup3.findViewById(R.id.inter_end_page), new FrameLayout.LayoutParams(-1, -1, 17), -1);
                        e.setTag(20);
                        this.m.setTag(20);
                        a(e, this.m);
                        L0.a(1);
                        a(((!this.v ? (a3 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.endpage.impression_close_seconds"))) != null : (a3 = sg.bigo.ads.K0.z.a(this.t.a("endpage.close_click_seconds"))) != null) ? 0 : a3.intValue()) * 1000);
                        AdCountDownButton adCountDownButton2 = this.g;
                        if (adCountDownButton2 != null) {
                            adCountDownButton2.c();
                        }
                        if (((C5185l1) this.e).D().getWatermarkView() != null) {
                            ((C5185l1) this.e).D().getWatermarkView().bringToFront();
                        }
                    }
                }
                i2 = 7;
                l(i2);
                sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), d0(), i);
            }
            if (!L0.c()) {
                L0.b();
            }
        }
        if (z || !this.H.get()) {
            this.e0 = false;
            i(true);
        } else if (((InterfaceC5087a) ((C5185l1) this.e).W.e()) instanceof InterfaceC5087a) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) ((C5185l1) this.e).W.e();
            sg.bigo.ads.L0.C watermarkView = ((C5185l1) this.e).D().getWatermarkView();
            sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
            if (kVar.V0 == null || this.m == null) {
                C5241m N0 = N0();
                if (z || N0 == null || !N0.c()) {
                    this.e0 = true;
                    i(true);
                } else {
                    kVar.T0 = 3;
                    b(i, N0);
                }
            } else {
                ImageView imageView = new ImageView(this.m.getContext());
                imageView.setImageBitmap((Bitmap) kVar.V0.first);
                sg.bigo.ads.K0.X.a(imageView, this.m, new FrameLayout.LayoutParams(-1, -1, 17), -1);
                imageView.setTag(15);
                this.m.setTag(20);
                a(imageView, this.m);
                sg.bigo.ads.T0.q qVar = this.t;
                a(((qVar == null ? (a2 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.endpage.impression_close_seconds"))) == null : (a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.close_click_seconds"))) == null) ? 0 : a2.intValue()) * 1000);
                AdCountDownButton adCountDownButton3 = this.g;
                if (adCountDownButton3 != null) {
                    adCountDownButton3.c();
                }
            }
        }
        l(i2);
        sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), d0(), i);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void q0() {
        H2 h2;
        sg.bigo.ads.T0.q qVar;
        Integer a2;
        super.q0();
        C5245q c5245q = this.n0;
        if (c5245q == null || !c5245q.a() || c5245q.e || c5245q.f) {
            return;
        }
        H2 h22 = (H2) c5245q.f12991a.f12823a.get();
        C5241m N0 = h22 == null ? null : h22.N0();
        if (N0 == null || !N0.f12988a || N0.b) {
            return;
        }
        H2 h23 = (H2) c5245q.f12991a.f12823a.get();
        if (((h23 == null || (qVar = h23.t) == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.show_time"))) == null) ? 0 : a2.intValue()) != -1 && ((h2 = (H2) c5245q.f12991a.f12823a.get()) == null || !h2.j0.d)) {
            c5245q.b();
            return;
        }
        c5245q.e = true;
        H2 h24 = (H2) c5245q.f12991a.f12823a.get();
        Y0 y0 = h24 != null ? h24.J : null;
        if (y0 != null) {
            y0.m = false;
        }
        H2 h25 = (H2) c5245q.f12991a.f12823a.get();
        if (h25 != null) {
            h25.o(16);
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void r0() {
        C5244p c5244p;
        super.r0();
        C5245q c5245q = this.n0;
        if (c5245q == null || (c5244p = c5245q.g) == null || c5244p.f || c5244p.b()) {
            return;
        }
        c5245q.g.d();
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public void u0() {
        sg.bigo.ads.K0.E e = this.T;
        if (e != null) {
            e.a();
            this.T = null;
        }
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) ((C5185l1) this.e).W.e();
        if (!this.H.get()) {
            a(interfaceC5087a, false, this.z.j);
        } else if (((sg.bigo.ads.U0.k) interfaceC5087a).V0 == null) {
            a(interfaceC5087a, true, this.z.n);
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void w() {
        C5236h c5236h;
        U0();
        k2 k2Var = this.f0;
        if (k2Var != null) {
            AbstractC5446j.a(k2Var);
        }
        j2 j2Var = this.g0;
        if (j2Var != null) {
            AbstractC5446j.a(j2Var);
        }
        C5243o c5243o = this.m0;
        if (c5243o != null && (c5236h = c5243o.b) != null) {
            c5236h.a();
            c5243o.b = null;
        }
        C5245q c5245q = this.n0;
        if (c5245q != null) {
            c5245q.f = true;
            C5244p c5244p = c5245q.g;
            if (c5244p != null) {
                c5244p.a();
            }
        }
        super.w();
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public void w0() {
        super.w0();
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(true);
            this.g.setTakeoverTickEvent(!this.H.get());
            this.j0.i = true ^ this.H.get();
            if (G0()) {
                h(R.drawable.bigo_ad_ic_close);
            }
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void z0() {
        VideoController videoController;
        Button button;
        super.z0();
        sg.bigo.ads.C.l lVar = this.l;
        if (lVar == null || (videoController = lVar.getVideoController()) == null) {
            return;
        }
        F1 X = X();
        boolean p = X instanceof AbstractC5391n ? ((AbstractC5391n) X).p() : false;
        this.n = (Button) this.f12687a.findViewById(R.id.inter_btn_mute);
        if (!this.H.get() && (button = this.n) != null && !p) {
            button.setVisibility(0);
            boolean isMuted = videoController.isMuted();
            Button button2 = this.n;
            if (button2 != null) {
                button2.setBackgroundResource(isMuted ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute);
            }
            this.n.setOnClickListener(new o2(videoController));
        }
        C5289e c5289e = this.j0;
        s2 s2Var = new s2(this, videoController, p, lVar);
        c5289e.getClass();
        videoController.setVideoLifeCallback(new C5285a(c5289e, s2Var));
        videoController.setLoadHTMLCallback(new t2(this));
        C5289e c5289e2 = this.j0;
        u2 u2Var = new u2(this);
        c5289e2.getClass();
        videoController.setProgressChangeListener(new C5286b(c5289e2, u2Var));
        videoController.setBackupLoadCallback(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(int i) {
        C5231c L0;
        C5202r0 c5202r0;
        View findViewById;
        sg.bigo.ads.P.c e;
        C5202r0 c5202r02;
        super.g(i);
        if (this.m == null) {
            return;
        }
        if (V0() && (k0() || this.H.get())) {
            X().c();
        }
        h(Q0());
        Y();
        Integer a2 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.video_play_page.cta_animation_show_way"));
        this.c0 = a2 != null ? a2.intValue() : 0;
        n(i);
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) ((C5185l1) this.e).D().e();
        sg.bigo.ads.C.l lVar = this.l;
        C5241m N0 = N0();
        if (lVar == null || N0 == null || !N0.f12988a || (e = lVar.e()) == null || ((sg.bigo.ads.U0.b) e).p0 != 1 || ((c5202r02 = this.K) != null && c5202r02.h)) {
            C5202r0 c5202r03 = this.K;
            if (c5202r03 != null && c5202r03.h) {
                C5241m N02 = N0();
                if (N02 != null) {
                    C5202r0 c5202r04 = this.K;
                    C5240l c5240l = N02.q;
                    if (c5240l != null) {
                        c5240l.f12987a = c5202r04;
                    }
                }
                if (N02 == null) {
                    N02 = ((C5185l1) this.e).a(this.K);
                }
                a(16, N02);
                AbstractC5163f0 abstractC5163f0 = this.e;
                C5231c c5231c = ((C5185l1) abstractC5163f0).Y;
                if (c5231c != null && !(c5231c.b instanceof C5252f) && abstractC5163f0 != null && I0() && (L0 = L0()) != null) {
                    D2 d2 = new D2(this, 15, 9);
                    InterfaceC5257b interfaceC5257b = L0.b;
                    if (interfaceC5257b instanceof C5252f) {
                        ((C5252f) interfaceC5257b).l = d2;
                    }
                    C2 c2 = new C2(this);
                    if (interfaceC5257b instanceof sg.bigo.ads.j.l) {
                        ((sg.bigo.ads.j.l) interfaceC5257b).k = c2;
                    }
                    L0.a(this.f12687a);
                }
                this.K.o = N02;
            } else if (!Q0()) {
                if (this.H.get() && ((sg.bigo.ads.U0.k) interfaceC5087a).P0 && !Q0() && I0()) {
                    AbstractC5446j.a(2, new z2(this));
                }
            }
            if (this.H.get()) {
                sg.bigo.ads.K0.E e2 = this.R;
                if (e2 != null) {
                    e2.e();
                }
                C5150c c5150c = this.S;
                if (c5150c != null) {
                    c5150c.e();
                }
            } else {
                if (((sg.bigo.ads.U0.k) interfaceC5087a).V0 == null) {
                    AbstractC5446j.a(2, null, new v2(this), 0L);
                    if (r() && (findViewById = this.m.findViewById(R.id.inter_ad_info)) != null) {
                        findViewById.setVisibility(0);
                    }
                }
                C5245q c5245q = this.n0;
                if (c5245q != null) {
                    c5245q.b();
                }
            }
            c5202r0 = this.K;
            if (c5202r0 == null && c5202r0.b()) {
                O0();
                o(15);
                return;
            }
        }
        T0();
        if (this.H.get()) {
        }
        c5202r0 = this.K;
        if (c5202r0 == null) {
        }
    }

    public void a(boolean z) {
        C5201r c5201r = this.U;
        if (c5201r != null) {
            c5201r.a();
            this.U = null;
        }
        sg.bigo.ads.K0.E e = this.T;
        if (e != null) {
            e.a();
            this.T = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(boolean z, boolean z2) {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
        if (z2) {
            C5245q c5245q = this.n0;
            if (c5245q != null) {
                c5245q.f = true;
                C5244p c5244p = c5245q.g;
                if (c5244p != null) {
                    c5244p.a();
                }
            }
            int d0 = d0();
            C5202r0 c5202r0 = this.K;
            boolean z3 = c5202r0 != null && c5202r0.b();
            if (d0 == 0 || (z3 && d0 == 14)) {
                if (s0()) {
                    h(R.drawable.bigo_ad_ic_close);
                }
                if (this instanceof sg.bigo.ads.w.b) {
                    ((sg.bigo.ads.w.b) this).b(0);
                }
                a(this.j0, new RunnableC5173h2(this));
            }
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.e.g
    public final LandingPageStyleConfig a(Context context, String str, int i, boolean z) {
        LandingPageStyleConfig M0;
        if (d0() != 1) {
            return super.a(context, str, i, z);
        }
        if (z) {
            sg.bigo.ads.T0.q qVar = this.t;
            if (qVar == null || !this.v) {
                qVar = null;
            }
            int a2 = AbstractC5391n.a(qVar, "endpage.webview_layout");
            if (AbstractC5204s.j(a2)) {
                a2 = 0;
            }
            int i2 = a2;
            M0 = new LandingPageStyleConfig(AbstractC5204s.i(i2), 1, i2, AbstractC5391n.a(qVar, "endpage.webview_force_time", "endpage.webview_force_time_new"), 0, 0, 0.0f);
        } else {
            M0 = M0();
        }
        C5476f.a(M0);
        return M0;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.t.InterfaceC5475e
    public final void a(int i) {
        Integer a2;
        this.V = true;
        this.l0 = true;
        sg.bigo.ads.K0.E e = this.T;
        if (e != null) {
            e.a();
            this.T = null;
        }
        if (d0() == 0 && i == 0) {
            Object X = X();
            if (X instanceof InterfaceC5477g) {
                C5408w c5408w = (C5408w) ((InterfaceC5477g) X);
                int i2 = 0;
                if (c5408w.O == -1) {
                    sg.bigo.ads.T0.q qVar = c5408w.x;
                    c5408w.O = (qVar == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.webview_layout"))) == null) ? 0 : a2.intValue();
                }
                int i3 = c5408w.O;
                switch (i3) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        i2 = i3;
                        break;
                }
                if ((i2 == 5 || i2 == 6) && !m0()) {
                    X().c = new C5153c2(this);
                    Y0 y0 = this.J;
                    if (y0 != null) {
                        y0.M = new C5157d2(this);
                    }
                    this.k0.set(true);
                    c(this.U, this.J, this.j0, this.R, this.S, X());
                }
            }
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.t.InterfaceC5475e
    public final boolean a(MotionEvent motionEvent, sg.bigo.ads.t.l lVar, int i) {
        sg.bigo.ads.r1.q qVar;
        Integer a2;
        Object X = X();
        if ((X instanceof InterfaceC5477g) && (X instanceof AbstractC5391n)) {
            AbstractC5391n abstractC5391n = (AbstractC5391n) X;
            C5408w c5408w = (C5408w) ((InterfaceC5477g) X);
            int i2 = 0;
            if (c5408w.O == -1) {
                sg.bigo.ads.T0.q qVar2 = c5408w.x;
                c5408w.O = (qVar2 == null || (a2 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.webview_layout"))) == null) ? 0 : a2.intValue();
            }
            int i3 = c5408w.O;
            switch (i3) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = i3;
                    break;
            }
            if ((i2 == 5 || i2 == 6) && !c5408w.P) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                Button n = abstractC5391n.n();
                if (n != null && sg.bigo.ads.K0.X.c(rawX, rawY, n)) {
                    if (motionEvent.getAction() == 1) {
                        n.performClick();
                    }
                    return true;
                }
                MediaView k = abstractC5391n.k();
                sg.bigo.ads.N.g gVar = k != null ? (sg.bigo.ads.N.g) k.getViewImpl() : null;
                if (gVar != null) {
                    sg.bigo.ads.d1.s sVar = (sg.bigo.ads.d1.s) gVar;
                    sg.bigo.ads.r1.q qVar3 = sVar.b;
                    if ((qVar3 != null ? qVar3.isClickable() : sVar.g) && sg.bigo.ads.K0.X.c(rawX, rawY, k)) {
                        if (motionEvent.getAction() == 1 && (qVar = sVar.b) != null) {
                            qVar.performClick();
                        }
                        return true;
                    }
                }
            }
        }
        return super.a(motionEvent, lVar, i);
    }

    public final void a(int i, C5241m c5241m) {
        sg.bigo.ads.P.c e;
        if (c5241m != null) {
            if (!I0()) {
                sg.bigo.ads.C.l lVar = this.l;
                C5241m N0 = N0();
                if (lVar == null || N0 == null || !N0.f12988a || (e = lVar.e()) == null || ((sg.bigo.ads.U0.b) e).p0 != 1) {
                    return;
                }
            }
            c5241m.o = 1;
            c5241m.f = new B2(this);
            c5241m.p.l = new D2(this, 13, i);
            c5241m.a(this.f12687a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(InterfaceC5087a interfaceC5087a, boolean z, int i) {
        long j;
        Integer a2;
        Integer a3;
        int i2 = 0;
        if (!z) {
            sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
            sg.bigo.ads.U0.t tVar = kVar.C0;
            j = 5 * 1000;
            if ((tVar != null ? tVar.f : 0L) <= j) {
                return;
            }
            int i3 = this.z.j;
            if (i3 == 5) {
                sg.bigo.ads.P.r rVar = kVar.E0;
                long j2 = rVar != null ? rVar.c : 0L;
                if (j2 <= 0) {
                    j2 = kVar.i();
                }
                sg.bigo.ads.T0.q qVar = this.t;
                if (qVar != null && (a3 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.auto_click_sec"))) != null) {
                    i2 = a3.intValue();
                }
                j = Math.max(0L, j2 - (i2 * 1000));
            } else if (i3 != 2) {
                if (i3 != 4) {
                    return;
                }
                sg.bigo.ads.T0.q qVar2 = this.t;
                if (qVar2 != null && (a2 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.auto_click_sec"))) != null) {
                    i2 = a2.intValue();
                }
            }
            if (j == 0) {
                j = 500;
            }
            C5161e2 c5161e2 = new C5161e2(this, j);
            this.T = c5161e2;
            c5161e2.e();
        }
        if (i == 0) {
            i2 = 1;
        } else if (i == 1) {
            i2 = 3;
        } else if (i == 2) {
            i2 = 5;
        } else if (i == 3) {
            i2 = 10;
        }
        if (i2 == 0) {
            return;
        }
        j = i2 * 1000;
        if (j == 0) {
        }
        C5161e2 c5161e22 = new C5161e2(this, j);
        this.T = c5161e22;
        c5161e22.e();
    }
}
