package sg.bigo.ads.t;

import android.app.Activity;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.h.AbstractC5204s;
import sg.bigo.ads.n.C5408w;

/* loaded from: classes3.dex */
public class v extends i {
    public ImageView A0;
    public TextView B0;
    public RelativeLayout C0;
    public ImageView D0;
    public ImageView E0;
    public ImageView F0;
    public ImageView G0;
    public final u H0;
    public final u I0;
    public final AtomicBoolean J0;
    public boolean K0;
    public final l L0;
    public boolean M0;
    public final C5476f r0;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public RoundedFrameLayout w0;
    public RelativeLayout x0;
    public View y0;
    public LinearLayout z0;

    public v(Activity activity) {
        super(activity);
        C5476f c5476f;
        int i;
        this.J0 = new AtomicBoolean(true);
        this.K0 = false;
        this.L0 = new l(this);
        this.M0 = true;
        LandingPageStyleConfig landingPageStyleConfig = this.q0;
        if (landingPageStyleConfig != null) {
            int i2 = landingPageStyleConfig.f12718a;
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    c5476f = new C5476f(landingPageStyleConfig.c, i2, landingPageStyleConfig.e, landingPageStyleConfig.f);
                    break;
                default:
                    c5476f = new C5476f(0, 1, landingPageStyleConfig.e, landingPageStyleConfig.f);
                    break;
            }
        } else {
            c5476f = null;
        }
        this.r0 = c5476f;
        int a2 = AbstractC4963u.a(this.f12687a, 20);
        this.t0 = a2;
        LandingPageStyleConfig landingPageStyleConfig2 = this.q0;
        if (landingPageStyleConfig2 == null || (i = landingPageStyleConfig2.d) <= 0) {
            this.s0 = (this.f12687a.getResources().getDisplayMetrics().heightPixels - AbstractC4963u.a(this.f12687a, 48)) - a2;
        } else {
            this.s0 = i - a2;
        }
        this.u0 = (int) ((1.0f - (c5476f != null ? c5476f.d : 1.0f)) * this.s0);
        this.v0 = AbstractC4963u.a(activity, 3);
        this.H0 = new u(this);
        this.I0 = new u(this);
        activity.setTheme(R.style.BigoAd_LandingPageStyle);
        q();
        R();
        activity.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.j1.h
    public final int A() {
        return R.layout.bigo_ad_activity_interstitial_landingpage;
    }

    @Override // sg.bigo.ads.j1.h
    public final void B() {
        View findViewById = this.f12687a.findViewById(R.id.inter_webview_back);
        X.a(findViewById, new q(this, findViewById, this.f12687a.findViewById(R.id.inter_webview_copy), this.f12687a.findViewById(R.id.inter_webview_close)));
    }

    @Override // sg.bigo.ads.t.i, sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public void C() {
        String str;
        ImageView imageView;
        super.C();
        this.w0 = (RoundedFrameLayout) this.f12687a.findViewById(R.id.inter_landpage_webview_page);
        this.x0 = (RelativeLayout) this.f12687a.findViewById(R.id.inter_webview_top_bar);
        this.z0 = (LinearLayout) this.f12687a.findViewById(R.id.inter_webview_top_action_bar);
        this.A0 = (ImageView) this.f12687a.findViewById(R.id.inter_webview_open);
        this.B0 = (TextView) this.f12687a.findViewById(R.id.inter_webview_host);
        this.G0 = (ImageView) this.f12687a.findViewById(R.id.inter_webview_safe);
        this.y0 = this.f12687a.findViewById(R.id.inter_webview_top_indicator);
        this.C0 = (RelativeLayout) this.f12687a.findViewById(R.id.inter_webview_bottom_bar);
        this.D0 = (ImageView) this.f12687a.findViewById(R.id.inter_webview_forward);
        this.E0 = (ImageView) this.f12687a.findViewById(R.id.inter_webview_copy);
        this.F0 = (ImageView) this.f12687a.findViewById(R.id.inter_webview_refresh);
        this.A0.setOnClickListener(this);
        this.D0.setOnClickListener(this);
        this.E0.setOnClickListener(this);
        this.F0.setOnClickListener(this);
        View findViewById = this.f12687a.findViewById(R.id.inter_webview_top_middle);
        int i = 8;
        this.A0.setVisibility(F() ? 8 : 0);
        this.D0.setVisibility(F() ? 8 : 0);
        this.E0.setVisibility(F() ? 8 : 0);
        this.F0.setVisibility(F() ? 8 : 0);
        this.C0.setVisibility(F() ? 8 : 0);
        ImageView imageView2 = this.g;
        if (imageView2 != null) {
            imageView2.setVisibility(F() ? 8 : 0);
        }
        View view = this.y0;
        if (view != null) {
            view.setVisibility(F() ? 8 : 0);
        }
        if (findViewById != null) {
            findViewById.setVisibility(F() ? 8 : 0);
        }
        C5476f c5476f = this.r0;
        if (c5476f != null) {
            RelativeLayout relativeLayout = this.x0;
            int i2 = c5476f.b;
            relativeLayout.setLayoutDirection((i2 == 2 || i2 == 4 || i2 == 6) ? 1 : 0);
        }
        this.z0.setLayoutDirection(this.x0.getLayoutDirection());
        this.f.setLayoutDirection(0);
        this.A0.setLayoutDirection(0);
        this.e.setLayoutDirection(0);
        this.d.setLayoutDirection(0);
        this.B0.setLayoutDirection(0);
        this.d.setMaxLines(1);
        float a2 = AbstractC4963u.a(this.f12687a, 16);
        this.w0.a(a2, a2, 0.0f, 0.0f);
        this.d.setVisibility(8);
        this.B0.setVisibility(8);
        String str2 = this.i;
        boolean isHttpsUrl = URLUtil.isHttpsUrl(str2);
        try {
            str = Uri.parse(str2).getHost();
        } catch (Exception unused) {
            str = "";
        }
        this.B0.setText(str);
        if (I.a((CharSequence) str)) {
            this.B0.setVisibility(8);
            imageView = this.G0;
        } else {
            this.B0.setVisibility(0);
            imageView = this.G0;
            if (isHttpsUrl) {
                i = 0;
            }
        }
        imageView.setVisibility(i);
        this.x0.setOnTouchListener(this.I0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w0.getLayoutParams();
        C5476f c5476f2 = this.r0;
        if (c5476f2 != null) {
            int i3 = c5476f2.b;
            marginLayoutParams.topMargin = (i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6) ? this.u0 : 0;
        }
        this.w0.requestLayout();
        X.a(this.w0, new r(this));
        C5476f c5476f3 = this.r0;
        if ((c5476f3 == null || c5476f3.c != 0) && !F()) {
            Drawable progressDrawable = this.e.getProgressDrawable();
            if (progressDrawable instanceof LayerDrawable) {
                Drawable drawable = ((ClipDrawable) ((LayerDrawable) progressDrawable).findDrawableByLayerId(android.R.id.progress)).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    C5476f c5476f4 = this.r0;
                    gradientDrawable.setColors(new int[]{c5476f4 != null ? c5476f4.c : -1, -1312769});
                }
            }
        }
    }

    @Override // sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public final void J() {
        Integer a2;
        super.J();
        C5476f c5476f = this.r0;
        if (c5476f != null) {
            int i = c5476f.f13309a;
            WeakReference weakReference = C5476f.e;
            InterfaceC5475e interfaceC5475e = weakReference != null ? (InterfaceC5475e) weakReference.get() : null;
            if (interfaceC5475e != null) {
                AbstractC5204s abstractC5204s = (AbstractC5204s) interfaceC5475e;
                if (abstractC5204s.d0() == 0 && i == 0) {
                    Object X = abstractC5204s.X();
                    if (X instanceof InterfaceC5477g) {
                        C5408w c5408w = (C5408w) ((InterfaceC5477g) X);
                        int i2 = 0;
                        if (c5408w.O == -1) {
                            sg.bigo.ads.T0.q qVar = c5408w.x;
                            c5408w.O = (qVar == null || (a2 = z.a(qVar.a("video_play_page.webview_layout"))) == null) ? 0 : a2.intValue();
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
                        if ((i2 == 5 || i2 == 6) && !abstractC5204s.m0() && abstractC5204s.V && !abstractC5204s.i.get()) {
                            abstractC5204s.R();
                        }
                    }
                }
            }
        }
    }

    @Override // sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public final void K() {
        Integer a2;
        super.K();
        C5476f c5476f = this.r0;
        if (c5476f != null) {
            int i = c5476f.f13309a;
            WeakReference weakReference = C5476f.e;
            InterfaceC5475e interfaceC5475e = weakReference != null ? (InterfaceC5475e) weakReference.get() : null;
            if (interfaceC5475e != null) {
                AbstractC5204s abstractC5204s = (AbstractC5204s) interfaceC5475e;
                if (abstractC5204s.d0() == 0 && i == 0) {
                    Object X = abstractC5204s.X();
                    if (X instanceof InterfaceC5477g) {
                        C5408w c5408w = (C5408w) ((InterfaceC5477g) X);
                        int i2 = 0;
                        if (c5408w.O == -1) {
                            sg.bigo.ads.T0.q qVar = c5408w.x;
                            c5408w.O = (qVar == null || (a2 = z.a(qVar.a("video_play_page.webview_layout"))) == null) ? 0 : a2.intValue();
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
                        if ((i2 == 5 || i2 == 6) && !abstractC5204s.m0() && abstractC5204s.V && abstractC5204s.i.get()) {
                            abstractC5204s.S();
                        }
                    }
                }
            }
        }
    }

    public void R() {
        Window window = this.f12687a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = this.s0;
        attributes.gravity = 80;
        window.setAttributes(attributes);
    }

    public void b(int i, int i2) {
        View view;
        int i3 = this.s0;
        int i4 = i3 - this.u0;
        int i5 = this.t0;
        if (i2 == i3 && (view = this.y0) != null && !this.K0) {
            this.K0 = true;
            view.postDelayed(new m(this), 500L);
        }
        C5476f c5476f = this.r0;
        if (c5476f != null) {
            int i6 = c5476f.f13309a;
            WeakReference weakReference = C5476f.e;
            InterfaceC5475e interfaceC5475e = weakReference != null ? (InterfaceC5475e) weakReference.get() : null;
            if (interfaceC5475e != null) {
                AbstractC5204s abstractC5204s = (AbstractC5204s) interfaceC5475e;
                if (abstractC5204s.d0() == abstractC5204s.d0() && i6 == 0) {
                    Object X = abstractC5204s.X();
                    if (X instanceof InterfaceC5477g) {
                        C5408w c5408w = (C5408w) ((InterfaceC5477g) X);
                        c5408w.b(i2, i4, i3, i5);
                        if (c5408w.P && abstractC5204s.V && !abstractC5204s.i.get()) {
                            abstractC5204s.R();
                        }
                    }
                }
            }
        }
    }

    @Override // sg.bigo.ads.Y0.x, sg.bigo.ads.Q.g
    public final int c() {
        C5476f c5476f = this.r0;
        if (c5476f == null) {
            return 0;
        }
        return c5476f.b;
    }

    @Override // sg.bigo.ads.j1.h
    public final void e(String str) {
        super.e(str);
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(I.a((CharSequence) str) ? 8 : 0);
        }
    }

    @Override // sg.bigo.ads.j1.h
    public final void g(int i) {
        sg.bigo.ads.P.f fVar = this.p;
        if (fVar != null && fVar.a() == 4) {
            super.g(i);
            return;
        }
        p pVar = new p(this, i);
        if (this.J0.compareAndSet(true, false)) {
            long abs = (long) Math.abs(((this.s0 - ((ViewGroup.MarginLayoutParams) this.w0.getLayoutParams()).topMargin) * 1.5f) / this.v0);
            o oVar = new o(this, pVar);
            oVar.setFillAfter(true);
            oVar.setDuration(abs);
            this.w0.startAnimation(oVar);
        }
    }

    public final void j(int i) {
        int max = Math.max(0, Math.min(this.u0, i));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w0.getLayoutParams();
        if (marginLayoutParams.topMargin == max) {
            return;
        }
        long abs = (long) Math.abs(((max - r2) * 2.0f) / this.v0);
        this.M0 = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new s(this));
        transitionSet.setDuration(abs);
        transitionSet.addListener((Transition.TransitionListener) new t(this));
        TransitionManager.beginDelayedTransition(this.w0, transitionSet);
        marginLayoutParams.topMargin = max;
        this.w0.requestLayout();
    }

    public void k(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w0.getLayoutParams();
        int min = Math.min(Math.max(0, marginLayoutParams.topMargin + i), this.u0);
        marginLayoutParams.topMargin = min;
        this.w0.requestLayout();
        b(this.w0.getMeasuredWidth(), this.s0 - min);
    }

    @Override // sg.bigo.ads.j1.h, android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        super.onClick(view);
        if (view == this.A0) {
            sg.bigo.ads.j1.b.a((sg.bigo.ads.P.c) null, this.f12687a, this.i, (JSONArray) null);
            return;
        }
        if (view == this.D0) {
            WebView webView2 = this.h;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.h.goForward();
            return;
        }
        if (view == this.E0) {
            if (AbstractC4956m.a(this.i, this.f12687a)) {
                Activity activity = this.f12687a;
                Toast.makeText(activity, AbstractC4944a.a(activity, R.string.bigo_ad_link_copied, new Object[0]), 0).show();
                return;
            }
            return;
        }
        if (view != this.F0 || (webView = this.h) == null) {
            return;
        }
        webView.reload();
    }

    @Override // sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void t() {
        super.t();
        this.f12687a.overridePendingTransition(0, 0);
        C5476f c5476f = this.r0;
        if (c5476f != null) {
            int i = c5476f.f13309a;
            WeakReference weakReference = C5476f.e;
            InterfaceC5475e interfaceC5475e = weakReference != null ? (InterfaceC5475e) weakReference.get() : null;
            if (interfaceC5475e != null) {
                interfaceC5475e.e(i);
            }
        }
    }

    @Override // sg.bigo.ads.t.i, sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public final void a(String str, boolean z) {
        super.a(str, z);
        this.g.setEnabled(z());
        ImageView imageView = this.D0;
        WebView webView = this.h;
        imageView.setEnabled(webView == null ? false : webView.canGoForward());
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean a(MotionEvent motionEvent) {
        C5476f c5476f = this.r0;
        if (c5476f == null) {
            return false;
        }
        l lVar = this.L0;
        int i = c5476f.f13309a;
        WeakReference weakReference = C5476f.e;
        InterfaceC5475e interfaceC5475e = weakReference != null ? (InterfaceC5475e) weakReference.get() : null;
        if (interfaceC5475e != null) {
            return interfaceC5475e.a(motionEvent, lVar, i);
        }
        return false;
    }

    @Override // sg.bigo.ads.t.i, sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public final void b(String str) {
        super.b(str);
        this.g.setEnabled(z());
        ImageView imageView = this.D0;
        WebView webView = this.h;
        imageView.setEnabled(webView == null ? false : webView.canGoForward());
    }

    @Override // sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public boolean b(MotionEvent motionEvent) {
        if (this.g0) {
            super.b(motionEvent);
        }
        return this.H0.onTouch(this.h, motionEvent);
    }
}
