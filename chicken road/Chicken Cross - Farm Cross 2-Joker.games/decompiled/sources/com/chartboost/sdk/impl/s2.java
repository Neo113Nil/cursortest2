package com.chartboost.sdk.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s2 extends s5 {
    public final da e;
    public final ah f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(da impressionInterface, ah gestureDetector, t5 callback, h7 eventTracker) {
        super(callback, eventTracker, impressionInterface, (com.chartboost.sdk.internal.Model.a) b4.b.b().b().get());
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(gestureDetector, "gestureDetector");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.e = impressionInterface;
        this.f = gestureDetector;
    }

    public final ah a() {
        return this.f;
    }

    @Override // com.chartboost.sdk.impl.s5, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.g = true;
    }

    @Override // com.chartboost.sdk.impl.s5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return a(url, webView);
    }

    public final boolean a(String str, WebView webView) {
        Object m8079constructorimpl;
        String str2;
        Object m8079constructorimpl2;
        String url;
        if (!this.g) {
            mb.b("Attempt to open " + str + " detected before WebView loading finished.", (Throwable) null, 2, (Object) null);
            this.e.c(new k3(str, Boolean.FALSE));
            return true;
        }
        if (!this.f.a()) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(Uri.parse(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = null;
        }
        Uri uri = (Uri) m8079constructorimpl;
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                str2 = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            String host = uri.getHost();
            try {
                Result.Companion companion3 = Result.INSTANCE;
                m8079constructorimpl2 = Result.m8079constructorimpl((webView == null || (url = webView.getUrl()) == null) ? null : Uri.parse(url).getHost());
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m8079constructorimpl2 = Result.m8079constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m8085isFailureimpl(m8079constructorimpl2)) {
                m8079constructorimpl2 = null;
            }
            String str3 = (String) m8079constructorimpl2;
            if (fl.a(str2, host, str3)) {
                mb.a("Ignoring HTML click '" + str + "' — no valid clickthrough target (scheme=" + str2 + ", clickHost=" + host + ", pageHost=" + str3 + ").", (Throwable) null, 2, (Object) null);
                this.f.b();
                return true;
            }
        }
        this.e.d(new k3(str, Boolean.FALSE));
        this.f.b();
        return true;
    }

    @Override // com.chartboost.sdk.impl.s5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return a(uri, view);
    }
}
