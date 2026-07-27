package sg.bigo.ads.L;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.M.C4989f;
import sg.bigo.ads.M.C5002t;
import sg.bigo.ads.M.W;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.splash.AdSplashActivity;
import sg.bigo.ads.ad.splash.LandscapeAdSplashActivity;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;
import sg.bigo.ads.e0.C5085c;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.j.C5252f;
import sg.bigo.ads.k.InterfaceC5257b;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class N extends sg.bigo.ads.e.h implements SplashAd {
    public sg.bigo.ads.M.F Q;
    public C4989f R;
    public sg.bigo.ads.M.E S;
    public long T;
    public final sg.bigo.ads.C.l U;
    public boolean V;
    public final A W;
    public final sg.bigo.ads.T0.q X;
    public final sg.bigo.ads.T0.q Y;
    public final sg.bigo.ads.P.j Z;
    public ViewGroup a0;
    public AdCountDownButton b0;
    public D c0;
    public I d0;
    public t e0;
    public s f0;
    public M g0;
    public K h0;
    public C5085c i0;
    public long j0;
    public long k0;

    public N(sg.bigo.ads.C.l lVar, sg.bigo.ads.P.j jVar, sg.bigo.ads.T0.q qVar, sg.bigo.ads.T0.q qVar2) {
        super(jVar);
        sg.bigo.ads.M.F c5002t;
        Integer a2;
        this.V = false;
        this.j0 = 0L;
        this.k0 = 0L;
        this.X = qVar;
        this.Y = qVar2;
        this.Z = jVar;
        a((sg.bigo.ads.Q.b) lVar);
        this.U = lVar;
        A a3 = new A(this);
        this.W = a3;
        lVar.setAdInteractionListener(a3);
        int i = ((sg.bigo.ads.U0.b) jVar.f12482a).o0;
        int intValue = (qVar2 == null || (a2 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.interactive_method"))) == null) ? 0 : a2.intValue();
        if (1 == i && intValue != 0) {
            this.Q = new sg.bigo.ads.M.x(jVar, qVar, qVar2, this);
            return;
        }
        if (qVar2 == null || r.a(qVar) || r.b()) {
            c5002t = new C5002t(jVar, qVar, qVar2, this);
        } else {
            Integer a4 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.ad_component_layout"));
            int intValue2 = a4 != null ? a4.intValue() : 0;
            c5002t = intValue2 != 3 ? (intValue2 == 4 || intValue2 == 5) ? new sg.bigo.ads.M.B(intValue2, jVar, qVar, qVar2, this) : new C5002t(jVar, qVar, qVar2, this) : new sg.bigo.ads.M.y(jVar, qVar, qVar2, this);
        }
        this.Q = c5002t;
    }

    public static void a(N n, ViewGroup viewGroup) {
        sg.bigo.ads.M.E e;
        View findViewById;
        C4989f c4989f = n.R;
        if (c4989f != null && (findViewById = c4989f.d.findViewById(R.id.layout_playable_loading)) != null && findViewById.getVisibility() == 0) {
            findViewById.setVisibility(4);
        }
        if (!n.B() || (e = n.S) == null || !e.e() || n.S.e) {
            return;
        }
        C4989f c4989f2 = n.R;
        if (c4989f2 != null) {
            c4989f2.a(false, viewGroup, -1);
        }
        sg.bigo.ads.M.E e2 = n.S;
        e2.f = 2;
        e2.a(true, viewGroup, 14);
    }

    public final void A() {
        C5241m c5241m;
        sg.bigo.ads.M.E e = this.S;
        if (e == null || e.f12425a != 2) {
            this.U.a((sg.bigo.ads.U.j) null, 8, 22);
            return;
        }
        Context context = this.k.e;
        if (e.g && (c5241m = e.b) != null) {
            c5241m.p.a(context, null, null);
            return;
        }
        C5231c c5231c = e.c;
        if (c5231c != null) {
            InterfaceC5257b interfaceC5257b = c5231c.b;
            if (interfaceC5257b instanceof C5252f) {
                ((C5252f) interfaceC5257b).a(context, null, null);
            } else if (interfaceC5257b instanceof sg.bigo.ads.j.l) {
                ((sg.bigo.ads.j.l) interfaceC5257b).a(context, (sg.bigo.ads.U.j) null);
            }
        }
    }

    public final boolean B() {
        sg.bigo.ads.T0.q qVar;
        if (y() && (qVar = this.Y) != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_layout"));
            if (2 == (a2 != null ? a2.intValue() : 1)) {
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        if (1 == ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.U.e())).p0) {
            return true;
        }
        sg.bigo.ads.T0.q qVar = this.Y;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_layout"));
            if (6 == (a2 != null ? a2.intValue() : 1)) {
                return true;
            }
        }
        return false;
    }

    public final void D() {
        AdCountDownButton adCountDownButton = this.b0;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.a();
        }
        D d = this.c0;
        if (d != null && !d.b()) {
            this.c0.d();
            this.j0 = (SystemClock.elapsedRealtime() - this.k0) + this.j0;
        }
        if (this.U.getVideoController() == null || !this.U.getVideoController().isPlaying()) {
            return;
        }
        this.U.getVideoController().pause();
    }

    public final void E() {
        AdCountDownButton adCountDownButton = this.b0;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        D d = this.c0;
        if (d != null && d.b()) {
            this.c0.e();
        }
        if (this.U.getVideoController() != null && this.U.getVideoController().isPaused()) {
            this.U.getVideoController().play();
        }
        this.k0 = SystemClock.elapsedRealtime();
    }

    public final void F() {
        sg.bigo.ads.M.E e = this.S;
        if (e != null) {
            M m = this.g0;
            C5241m c5241m = e.b;
            if (c5241m != null && c5241m.e == m) {
                c5241m.e = null;
            }
            AbstractC5446j.a(this.f0);
            this.S.d();
            this.S = null;
            this.g0 = null;
            this.f0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        int intValue;
        int i;
        int max;
        sg.bigo.ads.M.F f;
        sg.bigo.ads.M.F f2;
        sg.bigo.ads.T0.q qVar;
        AdCountDownButton adCountDownButton = this.b0;
        if (adCountDownButton == null) {
            this.V = true;
            this.W.onAdFinished();
            return;
        }
        adCountDownButton.setVisibility(0);
        sg.bigo.ads.T0.q qVar2 = this.Y;
        if (qVar2 == null) {
            intValue = 1;
        } else {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.close_button_style"));
            intValue = a2 != null ? a2.intValue() : 0;
        }
        AdCountDownButton adCountDownButton2 = this.b0;
        if (intValue != 2) {
            if (intValue == 3) {
                i = R.drawable.bigo_ad_ic_close;
            } else if (intValue != 4) {
                i = intValue != 5 ? intValue != 6 ? -1 : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4;
            }
            if (-1 != i) {
                adCountDownButton2.a(R.layout.bigo_ad_item_inter_countdown_bg);
                adCountDownButton2.setCloseImageResource(i);
                if (intValue != 2) {
                    adCountDownButton2.setShowCloseButtonInCountdown(true);
                }
            }
            Integer a3 = sg.bigo.ads.K0.z.a(this.X.a("splash_duration"));
            max = Math.max(0, a3 == null ? a3.intValue() : 0);
            f = this.Q;
            if (f != null && f.c().get() && ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.U.e())).V0 == null && (qVar = this.Y) != null) {
                Integer a4 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.time_for_show_backup"));
                max = Q1.a(a4 != null ? a4.intValue() : -1);
            }
            this.c0 = new D(this, max * 1000);
            Integer a5 = sg.bigo.ads.K0.z.a(this.X.a("splash_close"));
            int max2 = Math.max(0, a5 == null ? a5.intValue() : 0);
            this.b0.setWithUnit(true);
            this.b0.setTakeoverTickEvent(true);
            this.b0.setOnCloseListener(new E(this));
            f2 = this.Q;
            if (f2 == null && f2.c().get() && ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.U.e())).V0 == null) {
                AdCountDownButton adCountDownButton3 = this.b0;
                adCountDownButton3.l.setVisibility(0);
                adCountDownButton3.k.setVisibility(0);
                adCountDownButton3.j.setVisibility(0);
                adCountDownButton3.j.setAlpha(0.2f);
                adCountDownButton3.j.setClickable(false);
            } else {
                this.b0.a(max2, new G(this));
            }
            this.c0.e();
            ViewTreeObserver viewTreeObserver = this.b0.getViewTreeObserver();
            H h = new H(this);
            viewTreeObserver.addOnWindowFocusChangeListener(h);
            this.d0 = new I(viewTreeObserver, h);
        }
        adCountDownButton2.g = true;
        adCountDownButton2.k.setVisibility(8);
        adCountDownButton2.j.setVisibility(8);
        adCountDownButton2.setShowCloseButtonInCountdown(false);
        i = R.drawable.bigo_ad_ic_close3;
        if (-1 != i) {
        }
        Integer a32 = sg.bigo.ads.K0.z.a(this.X.a("splash_duration"));
        max = Math.max(0, a32 == null ? a32.intValue() : 0);
        f = this.Q;
        if (f != null) {
            Integer a42 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.time_for_show_backup"));
            max = Q1.a(a42 != null ? a42.intValue() : -1);
        }
        this.c0 = new D(this, max * 1000);
        Integer a52 = sg.bigo.ads.K0.z.a(this.X.a("splash_close"));
        int max22 = Math.max(0, a52 == null ? a52.intValue() : 0);
        this.b0.setWithUnit(true);
        this.b0.setTakeoverTickEvent(true);
        this.b0.setOnCloseListener(new E(this));
        f2 = this.Q;
        if (f2 == null) {
        }
        this.b0.a(max22, new G(this));
        this.c0.e();
        ViewTreeObserver viewTreeObserver2 = this.b0.getViewTreeObserver();
        H h2 = new H(this);
        viewTreeObserver2.addOnWindowFocusChangeListener(h2);
        this.d0 = new I(viewTreeObserver2, h2);
    }

    @Override // sg.bigo.ads.Q.b
    public final void a(boolean z, boolean z2) {
        throw null;
    }

    @Override // sg.bigo.ads.Q.b
    public final void b(int i) {
        this.b = i;
        this.U.b(i);
    }

    public final void c(int i) {
        this.W.onAdSkipped();
        if (this.Z != null) {
            this.j0 = (SystemClock.elapsedRealtime() - this.k0) + this.j0;
            sg.bigo.ads.s1.b.a(this.Z.f12482a, i, this.T > 0 ? SystemClock.elapsedRealtime() - this.T : 0L, this.j0, this);
        }
    }

    @Override // sg.bigo.ads.e.h
    public final void destroyInMainThread() {
        r.c = false;
        r.b = false;
        this.U.destroy();
        K k = this.h0;
        if (k != null) {
            k.a();
            this.h0 = null;
        }
        I i = this.d0;
        if (i != null) {
            AbstractC5446j.b(i);
            this.d0 = null;
        }
        t tVar = this.e0;
        if (tVar != null) {
            AbstractC5446j.a(tVar);
            this.e0 = null;
        }
        sg.bigo.ads.M.F f = this.Q;
        if (f != null) {
            f.d();
            this.Q = null;
        }
        C4989f c4989f = this.R;
        if (c4989f != null) {
            c4989f.e = 4;
            this.R = null;
        }
        r.a();
        F();
        this.a0 = null;
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.Q.b
    public final sg.bigo.ads.P.c e() {
        return (InterfaceC5087a) this.U.e();
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        return this.U.getCreativeId();
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.api.Ad
    public final String getExtraInfo(String str) {
        return null;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final SplashAd.Style getStyle() {
        sg.bigo.ads.T0.q qVar = this.X;
        sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
        int i = gVar == null ? 0 : gVar.O;
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("splash_style"));
        return i == 1 ? SplashAd.Style.HORIZONTAL : (a2 != null ? a2.intValue() : 0) == 1 ? SplashAd.Style.VERTICAL_HALFSCREEN : SplashAd.Style.VERTICAL_FULLSCREEN;
    }

    @Override // sg.bigo.ads.Q.b
    public final sg.bigo.ads.P.s i() {
        sg.bigo.ads.C.l lVar = this.U;
        return lVar != null ? lVar.i : this.i;
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        return false;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final boolean isSkippable() {
        return this.V || this.u;
    }

    @Override // sg.bigo.ads.e.h
    public final sg.bigo.ads.P.e p() {
        sg.bigo.ads.C.l lVar = this.U;
        return lVar != null ? lVar.I : this.I;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void setAdInteractionListener(SplashAdInteractionListener splashAdInteractionListener) {
        this.j = splashAdInteractionListener;
        this.W.f12367a = splashAdInteractionListener;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void show() {
        a((Activity) null, true);
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void showInAdContainer(ViewGroup viewGroup) {
        sg.bigo.ads.C.l lVar = this.U;
        ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).J0 = 2;
        lVar.J = 2;
        Context context = viewGroup.getContext();
        a(viewGroup, context instanceof Activity ? (Activity) context : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y() {
        sg.bigo.ads.T0.q qVar;
        boolean z;
        if (!r.b() && (qVar = this.Y) != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.endpage_timing"));
            if ((a2 != null ? a2.intValue() : 0) > 0) {
                sg.bigo.ads.T0.q qVar2 = this.Y;
                if (qVar2 != null) {
                    Integer a3 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.is_auto_close"));
                    if (1 == (a3 != null ? a3.intValue() : 0) && !C()) {
                        z = true;
                        if (z) {
                            return true;
                        }
                        Integer a4 = sg.bigo.ads.K0.z.a(this.Y.a("endpage.close_click_seconds"));
                        return (a4 != null ? a4.intValue() : 0) > 0;
                    }
                }
                z = false;
                if (z) {
                }
            }
        }
        return false;
    }

    public final void z() {
        AdCountDownButton adCountDownButton = this.b0;
        if (adCountDownButton == null) {
            return;
        }
        adCountDownButton.c();
        sg.bigo.ads.T0.q qVar = this.Y;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.close_click_seconds"));
            int intValue = a2 != null ? a2.intValue() : 0;
            if (intValue > 0) {
                this.b0.clearAnimation();
                this.b0.setVisibility(4);
                if (this.e0 == null) {
                    this.e0 = new t(this);
                }
                AbstractC5446j.a(2, null, this.e0, intValue * 1000);
            }
        }
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void show(Activity activity) {
        a(activity, false);
    }

    @Override // sg.bigo.ads.e.h
    public final Object a(Object obj, String str) {
        return this.U.a(obj, str);
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.Q.b
    public final void a(sg.bigo.ads.Q.c cVar) {
        sg.bigo.ads.T0.q qVar = this.Y;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.background_colour"));
            if ((a2 != null ? a2.intValue() : 0) == 4) {
                this.U.a(true);
            }
        }
        this.U.a(new y(this, (sg.bigo.ads.Z0.g) cVar));
    }

    @Override // sg.bigo.ads.e.h
    public final void a(sg.bigo.ads.P.e eVar) {
        this.I = eVar;
        sg.bigo.ads.C.l lVar = this.U;
        if (lVar != null) {
            lVar.I = eVar;
        }
    }

    public final void a(int i, int i2) {
        sg.bigo.ads.M.E e;
        sg.bigo.ads.M.E e2;
        ViewGroup viewGroup = this.a0;
        sg.bigo.ads.M.F f = this.Q;
        if (f == null || viewGroup == null) {
            return;
        }
        if (this.R != null && f.b() == 2) {
            this.Q.a(false, viewGroup, -1);
        }
        if (B() && (e2 = this.S) != null && e2.e()) {
            sg.bigo.ads.M.E e3 = this.S;
            if (!e3.e) {
                e3.f = 2;
                e3.a(true, viewGroup, i2);
                z();
                return;
            }
        }
        C4989f c4989f = this.R;
        if (c4989f != null && c4989f.e == 3 && ((e = this.S) == null || e.f != 2)) {
            c4989f.a(true, viewGroup, i2);
            z();
            sg.bigo.ads.M.E e4 = this.S;
            if (e4 != null) {
                sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
                if (gVar.C.f12488a == 2) {
                    M m = this.g0;
                    if (m == null) {
                        m = new M(this, viewGroup);
                        this.g0 = m;
                    }
                    C5241m c5241m = e4.b;
                    if (c5241m != null) {
                        c5241m.e = m;
                    }
                    int i3 = gVar.C.b;
                    if (i3 > 0) {
                        s sVar = this.f0;
                        if (sVar == null) {
                            sVar = new s(this, viewGroup);
                            this.f0 = sVar;
                        }
                        AbstractC5446j.a(2, null, sVar, i3 * 1000);
                        return;
                    }
                    return;
                }
            }
            F();
            return;
        }
        c(i);
    }

    public final void a(ViewGroup viewGroup, Activity activity) {
        ViewGroup viewGroup2;
        sg.bigo.ads.M.E e;
        Integer a2;
        if (this.Q != null) {
            sg.bigo.ads.P.j jVar = this.Z;
            boolean z = false;
            if (jVar != null) {
                HashMap a3 = sg.bigo.ads.s1.b.a(jVar.f12482a, (sg.bigo.ads.Q.b) null, false);
                a3.put("out_ad", String.valueOf(this.f));
                sg.bigo.ads.s1.b.a(a3, (sg.bigo.ads.Q.b) this, false);
                sg.bigo.ads.s1.b.a("06002022", a3);
            }
            if (Build.VERSION.SDK_INT >= 28 && activity != null) {
                this.i0 = new C5085c(activity);
                View decorView = activity.getWindow().getDecorView();
                if (decorView != null) {
                    decorView.post(new z(this, decorView));
                }
            }
            if (this.u) {
                b(2000, 1, "The ad is destroyed.");
                return;
            }
            ViewGroup viewGroup3 = (ViewGroup) AbstractC4944a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_style_root, null, false);
            X.a(viewGroup3, viewGroup, new ViewGroup.LayoutParams(-1, -1), -1);
            ViewGroup viewGroup4 = (ViewGroup) viewGroup3.findViewById(R.id.bigo_ad_splash_ad_container);
            this.a0 = viewGroup4;
            this.b0 = (AdCountDownButton) viewGroup3.findViewById(R.id.bigo_ad_splash_btn_skip);
            ImageView imageView = new ImageView(viewGroup4.getContext());
            imageView.setTag("adview_background_main_tag");
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            X.a(imageView, viewGroup4, null, 0);
            sg.bigo.ads.T0.q qVar = this.Y;
            if (qVar != null) {
                Integer a4 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.background_colour"));
                if (5 != (a4 != null ? a4.intValue() : 0)) {
                    Integer a5 = sg.bigo.ads.K0.z.a(this.Y.a("video_play_page.background_colour"));
                    int intValue = a5 != null ? a5.intValue() : 0;
                    int intValue2 = intValue != 2 ? intValue != 3 ? (intValue == 4 && (a2 = AbstractC5164f1.a((NativeAd) this.U)) != null) ? a2.intValue() : -1 : -7829368 : ViewCompat.MEASURED_STATE_MASK;
                    if (intValue2 != -1) {
                        AbstractC5446j.b(new RunnableC4969c(viewGroup4, intValue2));
                    }
                    if (C() || (e = this.S) == null || !e.e()) {
                        this.Q.a(true, viewGroup4, -1);
                    } else {
                        sg.bigo.ads.M.E e2 = this.S;
                        e2.f = 1;
                        e2.a(true, viewGroup4, 11);
                    }
                    X.a(viewGroup3, new B(this, viewGroup3));
                    if (this.Y == null && y()) {
                        if (this.R == null && (viewGroup2 = this.a0) != null) {
                            this.R = new C4989f(viewGroup2, this, this.Y, this.i0);
                        }
                        Integer a6 = sg.bigo.ads.K0.z.a(this.Y.a("endpage.endpage_timing"));
                        int intValue3 = a6 != null ? a6.intValue() : 0;
                        if (intValue3 >= 3) {
                            int i = intValue3 == 4 ? 5000 : intValue3 == 5 ? 10000 : 3000;
                            if (this.h0 == null) {
                                C4989f c4989f = this.R;
                                if (c4989f != null && c4989f.e == 2) {
                                    z = true;
                                }
                                if (!z) {
                                    this.h0 = new K(this, i);
                                }
                            }
                            this.h0.e();
                            return;
                        }
                        return;
                    }
                }
            }
            w wVar = new w(this, viewGroup4);
            sg.bigo.ads.M.F f = this.Q;
            if (f != null) {
                f.a(wVar);
            }
            if (C()) {
            }
            this.Q.a(true, viewGroup4, -1);
            X.a(viewGroup3, new B(this, viewGroup3));
            if (this.Y == null) {
            }
        }
    }

    public final void a(Activity activity, boolean z) {
        if (((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.U.e())).o() && C()) {
            this.Q = new W(this.Z, this.X, this.Y, this);
        }
        boolean z2 = activity == null;
        super.a(z2, z);
        this.U.a(z2, z);
        if (activity != null) {
            this.U.a(activity);
        }
        sg.bigo.ads.C.l lVar = this.U;
        ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).J0 = 1;
        lVar.J = 1;
        this.U.C();
        sg.bigo.ads.s1.b.a((InterfaceC5087a) this.U.e());
        if (this.u) {
            b(2000, 1, "The ad is destroyed.");
            return;
        }
        if (this.s) {
            b(2003, 0, "This ad cannot be shown repeatedly");
            return;
        }
        if (activity != null) {
            b(1);
        }
        Context context = activity;
        if (activity == null) {
            sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
            context = activity;
            if (gVar != null) {
                context = activity;
                if (gVar.B.a(16)) {
                    Activity a2 = sg.bigo.ads.a0.o.a();
                    b(2);
                    context = a2;
                }
            }
        }
        if (context == null) {
            context = this.k.e;
        }
        if (context != null) {
            sg.bigo.ads.D0.a aVar = this.e;
            int b = sg.bigo.ads.a0.o.b();
            if (b == 1) {
                aVar.f12253a = 1;
            } else if (b != 2) {
                aVar.f12253a = 0;
            } else {
                aVar.f12253a = 4;
            }
            int i = aVar.f12253a;
            this.f = i;
            sg.bigo.ads.Q.b bVar = this.g;
            if (bVar != null) {
                bVar.f = i;
            }
            HashMap hashMap = AdSplashActivity.c;
            Intent intent = new Intent(context, (Class<?>) (getStyle() == SplashAd.Style.HORIZONTAL ? LandscapeAdSplashActivity.class : AdSplashActivity.class));
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            int hashCode = hashCode();
            intent.putExtra("splash_hash", hashCode);
            AdSplashActivity.c.put(Integer.valueOf(hashCode), this);
            context.startActivity(intent);
        }
    }
}
