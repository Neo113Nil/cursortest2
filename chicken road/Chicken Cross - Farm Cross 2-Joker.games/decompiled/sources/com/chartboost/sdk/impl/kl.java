package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kl extends h2 {
    public static final b i = new b(null);
    public final String f;
    public final WebView g;
    public boolean h;

    public static final class a extends WebViewClient {
        public final /* synthetic */ Function0 b;

        public a(Function0 function0) {
            this.b = function0;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            if (!kl.this.getGestureDetected$ChartboostMonetization_9_13_0_release()) {
                mb.e("Persistent CTA WebView navigation suppressed: no user gesture. url=" + url, null, 2, null);
                return true;
            }
            kl.this.setGestureDetected$ChartboostMonetization_9_13_0_release(false);
            Function0 function0 = this.b;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public static final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            kl.this.setGestureDetected$ChartboostMonetization_9_13_0_release(true);
            return false;
        }
    }

    public /* synthetic */ kl(Context context, AttributeSet attributeSet, int i2, String str, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? context.getString(R.string.persistent_cta_description, "Advertisement") : str, (i3 & 16) != 0 ? null : function0);
    }

    public static final void a(kl klVar, Function0 function0, View view) {
        klVar.h = false;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void getGestureDetected$ChartboostMonetization_9_13_0_release$annotations() {
    }

    public final boolean getGestureDetected$ChartboostMonetization_9_13_0_release() {
        return this.h;
    }

    public final WebView getWebView() {
        return this.g;
    }

    public final void setContentUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.g.loadUrl(url);
    }

    public final void setGestureDetected$ChartboostMonetization_9_13_0_release(boolean z) {
        this.h = z;
    }

    @Override // com.chartboost.sdk.impl.h2
    public void a(p5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String b2 = config.b();
        if (b2 != null) {
            this.g.loadDataWithBaseURL(null, b2, "text/html", "UTF-8", null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(Context context, AttributeSet attributeSet, int i2, String persistentCtaContentDescription, final Function0 function0) {
        super(context, attributeSet, i2, function0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(persistentCtaContentDescription, "persistentCtaContentDescription");
        this.f = persistentCtaContentDescription;
        GestureDetector gestureDetector = new GestureDetector(context, new c());
        WebView webView = new WebView(context);
        webView.setId(View.generateViewId());
        webView.setLayoutParams(new ConstraintLayout.LayoutParams(a(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE), a(60)));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        a(webView, gestureDetector);
        webView.setWebViewClient(new a(function0));
        webView.setFocusable(true);
        webView.setClickable(true);
        webView.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.kl$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kl.a(kl.this, function0, view);
            }
        });
        this.g = webView;
        setContentDescription(persistentCtaContentDescription);
        addView(webView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(webView.getId(), 1, 0, 1);
        constraintSet.connect(webView.getId(), 2, 0, 2);
        constraintSet.connect(webView.getId(), 3, 0, 3);
        constraintSet.connect(webView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
    }

    @Override // com.chartboost.sdk.impl.h2
    public void a(wk tracker, uk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
    }

    public final void a(WebView webView, final GestureDetector gestureDetector) {
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.chartboost.sdk.impl.kl$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return kl.a(gestureDetector, view, motionEvent);
            }
        });
    }

    public static final boolean a(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        return false;
    }
}
