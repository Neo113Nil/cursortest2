package com.startapp.sdk.internal;

import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class uc extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final wa f4463a;

    /* renamed from: b, reason: collision with root package name */
    public MraidState f4464b = MraidState.LOADING;

    /* renamed from: c, reason: collision with root package name */
    public tc f4465c;

    /* renamed from: d, reason: collision with root package name */
    public wc f4466d;

    /* renamed from: e, reason: collision with root package name */
    public xc f4467e;
    public bd f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f4468g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f4469h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4470i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4471j;

    /* renamed from: k, reason: collision with root package name */
    public Handler f4472k;

    public uc(wa waVar) {
        this.f4463a = waVar;
    }

    @Override // com.startapp.sdk.internal.x0
    public final void a() {
        MraidState mraidState = MraidState.HIDDEN;
        this.f4464b = mraidState;
        si.a(this.f4463a.f4595t, true, "mraid.fireStateChangeEvent", mraidState.toString());
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean b(WebView webView, String str) {
        if (this.f == null) {
            this.f = new bd(h(), null);
        }
        return this.f.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean c() {
        return !(this.f4463a.k() >= ((long) this.f4463a.f4438q));
    }

    @Override // com.startapp.sdk.internal.x0
    public final void d() {
        if (this.f4463a.k() >= this.f4463a.f4438q) {
            h().close();
        }
    }

    @Override // com.startapp.sdk.internal.x0
    public final void e() {
        i();
    }

    @Override // com.startapp.sdk.internal.x0
    public final void f() {
        this.f4471j = false;
        if (this.f4464b == MraidState.DEFAULT) {
            h().fireViewableChangeEvent();
        }
    }

    @Override // com.startapp.sdk.internal.x0
    public final void g() {
        if (this.f4472k == null && this.f4463a.o()) {
            this.f4472k = new Handler(Looper.getMainLooper());
        }
        this.f4471j = true;
        if (this.f4464b == MraidState.DEFAULT) {
            h().fireViewableChangeEvent();
        }
    }

    public final tc h() {
        if (this.f4465c == null) {
            this.f4465c = new tc(this, new rc(this));
        }
        return this.f4465c;
    }

    public final void i() {
        wa waVar = this.f4463a;
        OverlayActivity overlayActivity = waVar.f4423a;
        WebView webView = waVar.f4595t;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            overlayActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            float f = i4;
            si.a(webView, true, "mraid.setScreenSize", Integer.valueOf(ii.b(overlayActivity, i3)), Integer.valueOf(Math.round(f / overlayActivity.getResources().getDisplayMetrics().density)));
            si.a(webView, true, "mraid.setMaxSize", Integer.valueOf(ii.b(overlayActivity, i3)), Integer.valueOf(Math.round(f / overlayActivity.getResources().getDisplayMetrics().density)));
            qc.a(overlayActivity, 0, 0, i3, i4, webView);
            qc.b(overlayActivity, 0, 0, i3, i4, webView);
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    @Override // com.startapp.sdk.internal.x0
    public final void a(RelativeLayout relativeLayout) {
        if (this.f4463a.o()) {
            wa waVar = this.f4463a;
            if (waVar.f4439r) {
                return;
            }
            OverlayActivity overlayActivity = waVar.f4423a;
            int a3 = ii.a(overlayActivity, 32);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams.addRule(13);
            ImageView imageView = new ImageView(overlayActivity);
            this.f4469h = imageView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setStroke(2, -1);
            int a4 = ii.a(this.f4463a.f4423a, 32);
            gradientDrawable.setSize(a4, a4);
            imageView.setImageDrawable(gradientDrawable);
            this.f4469h.setScaleType(ImageView.ScaleType.FIT_CENTER);
            relativeLayout.addView(this.f4469h, layoutParams);
            TextView textView = new TextView(overlayActivity);
            this.f4468g = textView;
            textView.setTextColor(-1);
            this.f4468g.setGravity(17);
            relativeLayout.addView(this.f4468g, layoutParams);
        }
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean b() {
        return this.f4463a.f4438q > 0;
    }

    @Override // com.startapp.sdk.internal.x0
    public final void a(WebView webView, String str) {
        webView.getContext();
        WeakHashMap weakHashMap = si.f4343a;
        Log.println(2, "StartAppSDK", "Mraid received callback onPageFinished()");
        if (this.f == null) {
            this.f = new bd(h(), null);
        }
        this.f.onPageFinished(webView, str);
        if (this.f4464b == MraidState.LOADING) {
            si.a(webView, true, "mraid.setPlacementType", "interstitial");
            OverlayActivity overlayActivity = this.f4463a.f4423a;
            if (this.f4466d == null) {
                this.f4466d = new wc(overlayActivity);
            }
            vc.a(overlayActivity, webView, this.f4466d);
            i();
            this.f4463a.j();
            si.a(webView, true, "gClientInterface.onPageFinished", Boolean.TRUE);
            if (!this.f4470i) {
                this.f4463a.t();
            }
            MraidState mraidState = MraidState.DEFAULT;
            this.f4464b = mraidState;
            si.a(webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
            si.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
            if (this.f4471j) {
                h().fireViewableChangeEvent();
            }
            Handler handler = this.f4472k;
            if (handler != null) {
                handler.post(new sc(this));
            }
            this.f4463a.q();
        }
    }
}
