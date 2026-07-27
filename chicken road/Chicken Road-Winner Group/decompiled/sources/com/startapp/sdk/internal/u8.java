package com.startapp.sdk.internal;

import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import com.startapp.startappsdk.R;

/* loaded from: classes.dex */
public final class u8 extends u7 implements View.OnClickListener {

    /* renamed from: A, reason: collision with root package name */
    public static final int f4441A = R.id.io_start_navigation_bar;

    /* renamed from: B, reason: collision with root package name */
    public static final int f4442B = R.id.io_start_navigation_bar_close;

    /* renamed from: C, reason: collision with root package name */
    public static final int f4443C = R.id.io_start_navigation_bar_external;

    /* renamed from: D, reason: collision with root package name */
    public static final int f4444D = R.id.io_start_navigation_bar_back;

    /* renamed from: E, reason: collision with root package name */
    public static final int f4445E = R.id.io_start_navigation_bar_forward;

    /* renamed from: F, reason: collision with root package name */
    public static final int f4446F = R.id.io_start_navigation_bar_progress;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f4447z = false;

    /* renamed from: t, reason: collision with root package name */
    public RelativeLayout f4448t;

    /* renamed from: u, reason: collision with root package name */
    public NavigationBarLayout f4449u;

    /* renamed from: v, reason: collision with root package name */
    public WebView f4450v;

    /* renamed from: w, reason: collision with root package name */
    public AnimatingProgressBar f4451w;

    /* renamed from: x, reason: collision with root package name */
    public FrameLayout f4452x;
    public final String y;

    public u8(String str) {
        this.y = str;
    }

    @Override // com.startapp.sdk.internal.u7
    public final void a(Bundle bundle) {
        wb.a(this.f4423a).a(this.f4425c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        f4447z = false;
        this.f4448t = new RelativeLayout(this.f4423a);
        String str = this.y;
        if (this.f4449u == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f4423a);
            this.f4449u = navigationBarLayout;
            navigationBarLayout.d();
            this.f4449u.c();
            this.f4449u.setButtonsListener(this);
        }
        this.f4448t.addView(this.f4449u);
        this.f4451w = new AnimatingProgressBar(this.f4423a, null, android.R.attr.progressBarStyleHorizontal);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.f4451w.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.f4451w.setBackgroundColor(-1);
        this.f4451w.setId(f4446F);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ii.a(this.f4423a, 4));
        layoutParams.addRule(3, f4441A);
        this.f4448t.addView(this.f4451w, layoutParams);
        this.f4452x = new FrameLayout(this.f4423a);
        if (this.f4450v == null) {
            try {
                j();
                this.f4450v.loadUrl(str);
            } catch (Throwable th) {
                d9.a(th);
                this.f4449u.e();
                g0.b(this.f4423a, str);
                this.f4423a.finish();
            }
        }
        this.f4452x.addView(this.f4450v);
        this.f4452x.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, f4446F);
        this.f4448t.addView(this.f4452x, layoutParams2);
        if (bundle != null) {
            this.f4450v.restoreState(bundle);
        }
        this.f4423a.setContentView(this.f4448t, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.startapp.sdk.internal.u7
    public final void b(Bundle bundle) {
        this.f4450v.saveState(bundle);
    }

    @Override // com.startapp.sdk.internal.u7
    public final void f() {
    }

    @Override // com.startapp.sdk.internal.u7
    public final void g() {
    }

    public final void i() {
        try {
            f4447z = true;
            this.f4450v.stopLoading();
            this.f4450v.removeAllViews();
            this.f4450v.postInvalidate();
            this.f4450v.onPause();
            this.f4450v.destroy();
            this.f4450v = null;
        } catch (Exception unused) {
        }
        this.f4449u.e();
        this.f4423a.finish();
    }

    public final void j() {
        WebView c3 = ((rk) com.startapp.sdk.components.a.a(this.f4423a).f3355b.a()).c();
        this.f4450v = c3;
        c3.getSettings().setJavaScriptEnabled(true);
        this.f4450v.getSettings().setUseWideViewPort(true);
        this.f4450v.getSettings().setLoadWithOverviewMode(true);
        this.f4450v.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f4450v.getSettings().setBuiltInZoomControls(true);
        this.f4450v.getSettings().setDisplayZoomControls(false);
        this.f4450v.setWebViewClient(new t8(this.f4423a, this.f4449u, this.f4451w, this));
        this.f4450v.setWebChromeClient(new s8(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == f4444D) {
            WebView webView = this.f4450v;
            if (webView == null || !webView.canGoBack()) {
                return;
            }
            this.f4451w.a();
            this.f4450v.goBack();
            return;
        }
        if (id == f4445E) {
            WebView webView2 = this.f4450v;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.f4451w.a();
            this.f4450v.goForward();
            return;
        }
        if (id != f4443C) {
            if (id == f4442B) {
                i();
            }
        } else {
            WebView webView3 = this.f4450v;
            if (webView3 != null) {
                g0.b(this.f4423a, webView3.getUrl());
                i();
            }
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public final boolean a(int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i3 != 4) {
            return false;
        }
        WebView webView = this.f4450v;
        if (webView != null && webView.canGoBack()) {
            this.f4451w.a();
            this.f4450v.goBack();
            return true;
        }
        i();
        return true;
    }
}
