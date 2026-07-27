package sg.bigo.ads.h;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.MaximumHeightMediaView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.m.AbstractC5325d;
import sg.bigo.ads.n.AbstractC5391n;
import sg.bigo.ads.n.C5408w;
import sg.bigo.ads.t.InterfaceC5477g;

/* renamed from: sg.bigo.ads.h.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5149b2 extends AbstractC5204s {
    public boolean a0;
    public final AtomicBoolean b0;
    public boolean c0;
    public AbstractC5325d d0;

    public C5149b2(Activity activity) {
        super(activity);
        this.a0 = true;
        this.b0 = new AtomicBoolean(false);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public void E0() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.g.setVisibility(0);
            AbstractC5140Q.b((View) this.g);
        }
        if (d0() == 0) {
            this.g.a(this.z.c, new Y1(this));
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public int G() {
        if (!this.v) {
            Integer a2 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_image_style.image_format"));
            int intValue = a2 != null ? a2.intValue() : 0;
            return intValue == 1 ? R.layout.bigo_ad_activity_interstitial_native_top : intValue == 2 ? R.layout.bigo_ad_activity_interstitial_bottom_card : R.layout.bigo_ad_activity_interstitial_native_center;
        }
        int T = T();
        if (r()) {
            return T != 1 ? T != 3 ? T != 4 ? T != 5 ? R.layout.bigo_ad_activity_interstitial_style_landscape_2 : R.layout.bigo_ad_activity_interstitial_percent_warning_landscape : R.layout.bigo_ad_activity_interstitial_style_landscape_4 : R.layout.bigo_ad_activity_interstitial_style_landscape_3 : R.layout.bigo_ad_activity_interstitial_style_landscape_1;
        }
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
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_9;
            case 10:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_10;
            case 11:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_11;
            case 12:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_12;
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
                sg.bigo.ads.U.r a3 = AbstractC5164f1.a(this.l);
                Objects.toString(a3);
                return ((31 == T || 32 == T) && a3.a()) ? a3.f12567a / a3.b >= 1 ? R.layout.bigo_ad_activity_interstitial_rich_video_land_material_31_32 : 31 == T ? R.layout.bigo_ad_activity_interstitial_rich_video_left_material_31 : R.layout.bigo_ad_activity_interstitial_rich_video_right_material_32 : R.layout.bigo_ad_activity_interstitial_native_center;
            default:
                return R.layout.bigo_ad_activity_interstitial_rich_video;
        }
    }

    public void H0() {
        MediaView mediaView;
        ViewGroup viewGroup = this.m;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        if (!this.a0) {
            mediaView.setMediaAreaClickable(false);
        }
        if (mediaView instanceof MaximumHeightMediaView) {
            ((MaximumHeightMediaView) mediaView).setMaxHeight(this.f12687a.getResources().getDisplayMetrics().heightPixels - AbstractC4963u.a(this.f12687a, 292));
        }
        Y();
    }

    public final void I0() {
        View findViewById;
        sg.bigo.ads.T0.q qVar;
        if ((X() instanceof AbstractC5391n) || (findViewById = this.m.findViewById(R.id.inter_btn_cta_layout)) == null) {
            return;
        }
        boolean z = this.v;
        if (z && (qVar = this.t) != null) {
            if (qVar.b("video_play_page.is_cta_show_animation") == 1) {
                AbstractC5140Q.a(findViewById);
            }
        } else {
            if (z) {
                return;
            }
            this.C.postDelayed(new U1(this, findViewById), (sg.bigo.ads.K0.z.a(this.s.a("interstitial_image_style.main_page.cta_impression")) != null ? r1.intValue() : 0) * 1000);
        }
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
        if (this.b0.get()) {
            a(this.R, X());
        }
    }

    public boolean K0() {
        return this.z.j == 3;
    }

    public final boolean L0() {
        if (this.d0 == null || this.m == null) {
            return false;
        }
        X().e();
        View findViewById = this.m.findViewById(R.id.inter_media_container);
        if (findViewById != null) {
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
        this.d0.a(this, this.m, V());
        l(11);
        sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 11, 2);
        return true;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean M() {
        return this.v;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5151c0
    public void O() {
        this.w = true;
        super.O();
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void R() {
        super.R();
        sg.bigo.ads.K0.E e = this.R;
        if (e != null) {
            e.d();
        }
        sg.bigo.ads.K0.E e2 = this.T;
        if (e2 != null) {
            e2.d();
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.a();
        }
        Y0 y0 = this.J;
        if (y0 != null) {
            y0.c();
        }
        AbstractC5325d abstractC5325d = this.d0;
        if (abstractC5325d != null) {
            abstractC5325d.a();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void S() {
        super.S();
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        sg.bigo.ads.K0.E e = this.R;
        if (e != null && e.b()) {
            this.R.e();
        }
        sg.bigo.ads.K0.E e2 = this.T;
        if (e2 != null && e2.b()) {
            this.T.e();
        }
        Y0 y0 = this.J;
        if (y0 != null) {
            y0.d();
        }
        AbstractC5325d abstractC5325d = this.d0;
        if (abstractC5325d != null) {
            abstractC5325d.b();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.t.InterfaceC5475e
    public final void a(int i) {
        Integer a2;
        this.V = true;
        this.c0 = true;
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
                    X().c = new Z1(this);
                    Y0 y0 = this.J;
                    if (y0 != null) {
                        y0.M = new C5145a2(this);
                    }
                    this.b0.set(true);
                    c(this.R, X(), this.J);
                }
            }
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public Q1 b0() {
        Q1 q1 = new Q1();
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null) {
            this.v = false;
            q1.f12848a = this.s.b("interstitial_image_style.main_page.is_global_click") == 1;
            Integer a2 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_image_style.main_page.impression_close_seconds"));
            q1.b = a2 != null ? a2.intValue() : 0;
            Integer a3 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_image_style.main_page.close_click_seconds"));
            q1.c = a3 != null ? a3.intValue() : 0;
            q1.d = this.s.b("interstitial_image_style.main_page.is_jump_layer") == 1;
            Integer a4 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_image_style.layer.impression_layer_close_seconds"));
            q1.e = a4 != null ? a4.intValue() : 0;
            q1.j = 1;
            q1.k = -1;
            return q1;
        }
        this.v = true;
        boolean z = qVar.b("video_play_page.media_view_clickable_switch") == 1;
        q1.f = z;
        this.a0 = z;
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
        if ((this instanceof sg.bigo.ads.w.b) && k0() && this.l != null && !l0()) {
            this.d0 = AbstractC5325d.a(this.l, this.t, ((C5185l1) this.e).C(), this.L, r());
        }
        return q1;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void d(boolean z) {
        super.d(true);
        J0();
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.t.InterfaceC5475e
    public final void e(int i) {
        super.e(i);
        if (d0() != 0) {
            J0();
        }
        if (this.b0.compareAndSet(true, false)) {
            b(this.R, X(), this.J);
            c0();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public boolean f(boolean z) {
        Y0 y0;
        int d0 = d0();
        if (d0 != 0 && d0 != 10) {
            if (d0 != 11) {
                return z;
            }
            boolean D0 = D0();
            if (D0) {
                sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 9, 2);
            }
            return !D0;
        }
        h0();
        super.d(true);
        J0();
        if (d0 != 10 && (y0 = this.J) != null && (y0.I.a() || this.J.N)) {
            l(10);
            return false;
        }
        if (L0()) {
            return false;
        }
        boolean D02 = D0();
        if (D02) {
            sg.bigo.ads.s1.b.a((InterfaceC5087a) ((C5185l1) this.e).W.e(), 9, 2);
        }
        return z && !D02;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void g(int i) {
        ViewGroup m;
        super.g(i);
        if (this.m == null) {
            return;
        }
        C5150c c5150c = this.S;
        if (c5150c != null) {
            c5150c.e();
        }
        h(false);
        F1 X = X();
        if (!(X instanceof AbstractC5391n)) {
            H0();
            n(i);
            return;
        }
        if (!(X instanceof sg.bigo.ads.n.U0)) {
            ViewGroup m2 = ((AbstractC5391n) X).m();
            if (m2 == null) {
                return;
            }
            m2.postDelayed(new W1(this, m2), 100L);
            return;
        }
        sg.bigo.ads.n.U0 u0 = (sg.bigo.ads.n.U0) X;
        if (!u0.C() || (m = u0.m()) == null) {
            return;
        }
        m.postDelayed(new W1(this, m), 100L);
    }

    public void n(int i) {
        sg.bigo.ads.C.l lVar;
        sg.bigo.ads.P.b popPage;
        RoundedFrameLayout roundedFrameLayout;
        int i2 = 0;
        if (o0() || p0()) {
            ViewGroup viewGroup = (ViewGroup) this.m.findViewById(R.id.inter_media_layout);
            TextView textView = (TextView) this.m.findViewById(R.id.inter_company);
            if (!(X() instanceof AbstractC5391n) && this.y && textView != null && (lVar = this.l) != null && (popPage = lVar.getPopPage()) != null && sg.bigo.ads.K0.I.a((CharSequence) ((sg.bigo.ads.U0.m) popPage).f)) {
                String g = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.l.e())).g();
                if (sg.bigo.ads.K0.I.a((CharSequence) g)) {
                    textView.setText(R.string.bigo_ad_title_default);
                } else {
                    textView.setText(g);
                }
                textView.setVisibility(0);
            }
            if (viewGroup != null) {
                Y();
                if (this.x) {
                    int c = AbstractC4963u.c(this.f12687a) - AbstractC4963u.a(this.f12687a, 80);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.width = c;
                    layoutParams.height = c;
                    viewGroup.setLayoutParams(layoutParams);
                }
                viewGroup.postDelayed(new W1(this, viewGroup), 100L);
            }
        }
        m(i);
        View findViewById = this.m.findViewById(R.id.inter_ad_info);
        if (findViewById != null) {
            int i3 = A0().f12870a;
            if (i3 > 0) {
                Context context = findViewById.getContext();
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = AbstractC4963u.a(context, 10);
                    marginLayoutParams.rightMargin = AbstractC4963u.a(context, 10);
                    marginLayoutParams.bottomMargin = AbstractC4963u.a(context, i3);
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
                I0();
                return;
            }
            if (this.v) {
                Integer a2 = sg.bigo.ads.K0.z.a(this.t.a("video_play_page.ad_component_show_time"));
                if (a2 != null) {
                    i2 = a2.intValue();
                }
            } else {
                Integer a3 = sg.bigo.ads.K0.z.a(this.s.a("interstitial_video_style.video_play_page.impression_ad_seconds"));
                if (a3 != null) {
                    i2 = a3.intValue();
                }
            }
            T1 t1 = new T1(this, i2 * 1000, findViewById);
            this.R = t1;
            t1.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.h.AbstractC5204s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u0() {
        long j;
        long j2;
        Integer a2;
        int i = this.z.j;
        sg.bigo.ads.T0.q qVar = this.t;
        int intValue = (qVar == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.auto_click_sec"))) == null) ? 0 : a2.intValue();
        int i2 = 5;
        if (i != 2) {
            if (i == 4) {
                j = intValue;
                j2 = j * 1000;
                if (j2 < 0) {
                    if (j2 == 0) {
                        j2 = 500;
                    }
                    V1 v1 = new V1(this, j2);
                    this.T = v1;
                    v1.e();
                    return;
                }
                return;
            }
            if (i != 5) {
                return;
            } else {
                i2 = Math.max(this.z.c - intValue, 0);
            }
        }
        j = i2;
        j2 = j * 1000;
        if (j2 < 0) {
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public void w0() {
        super.w0();
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
            this.g.setTakeoverTickEvent(false);
        }
    }
}
