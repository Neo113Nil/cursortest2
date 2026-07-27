package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class j extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final String f12170a;
    public WebView b;
    public h c;
    public f d;
    public i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, String str) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12170a = str;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView a2 = a0.a(context, str);
        this.b = a2;
        if (a2 != null) {
            a2.setLayoutParams(layoutParams);
        }
        WebView webView = this.b;
        if (webView != null) {
            webView.setTag("VungleWebView");
        }
        addView(this.b, layoutParams);
        a();
        c();
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    public final void c() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void d() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setVisibility(0);
        }
        WebView webView2 = this.b;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    public final f getCloseDelegate$vungle_ads_release() {
        return this.d;
    }

    public final String getEventId() {
        return this.f12170a;
    }

    public final h getOnViewTouchListener$vungle_ads_release() {
        return this.c;
    }

    public final i getOrientationDelegate$vungle_ads_release() {
        return this.e;
    }

    public final String getUrl() {
        WebView webView = this.b;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.b;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void setCloseDelegate(f closeDelegate) {
        Intrinsics.checkNotNullParameter(closeDelegate, "closeDelegate");
        this.d = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(f fVar) {
        this.d = fVar;
    }

    public final void setOnViewTouchListener(h hVar) {
        this.c = hVar;
    }

    public final void setOnViewTouchListener$vungle_ads_release(h hVar) {
        this.c = hVar;
    }

    public final void setOrientation(int i) {
        i iVar = this.e;
        if (iVar != null) {
            ((com.vungle.ads.internal.ui.j) iVar).f12152a.setRequestedOrientation(i);
        }
    }

    public final void setOrientationDelegate(i iVar) {
        this.e = iVar;
    }

    public final void setOrientationDelegate$vungle_ads_release(i iVar) {
        this.e = iVar;
    }

    public final void a() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.vungle.ads.internal.ui.view.j$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return j.a(j.this, view, motionEvent);
                }
            });
        }
    }

    public final void b() {
        WebView webView = this.b;
        if (webView != null) {
            webView.onPause();
        }
    }

    public static final boolean a(j this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        h hVar = this$0.c;
        if (hVar != null) {
            return hVar.onTouch(motionEvent);
        }
        return false;
    }

    public final void a(z vngWebViewClient, f0 f0Var) {
        Intrinsics.checkNotNullParameter(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.b;
        if (webView != null) {
            com.vungle.ads.internal.platform.g.a(webView, f0Var);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    public final void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        boolean z = u.f12190a;
        t.a("MRAIDAdWidget", "loadUrl: " + url);
        WebView webView = this.b;
        if (webView != null) {
            webView.loadUrl(url);
        }
    }

    public final void a(long j) {
        try {
            Result.Companion companion = Result.INSTANCE;
            ViewParent parent = getParent();
            Unit unit = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
                unit = Unit.INSTANCE;
            }
            Result.m8079constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            removeAllViews();
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th2));
        }
        if (j <= 0) {
            new g(this).run();
        } else {
            new com.vungle.ads.internal.util.o().a(new g(this), j);
        }
    }
}
