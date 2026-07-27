package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class W2 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final Y9 f6921a;
    public boolean c;
    public boolean d;
    public int b = -1;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public W2(Y9 y9) {
        this.f6921a = y9;
    }

    public final void a(WebView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.e.set(true);
        view.postDelayed(new Runnable() { // from class: com.inmobi.media.W2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                W2.a(W2.this);
            }
        }, 1000L);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.d) {
            this.d = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Kc.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).b("BaseWebViewClient", "onRenderProcessGone - WebView crash detected, destroying ad ");
        }
        view.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Y5.f6965a.getClass();
        if (!Y5.x() && -1 != (i = this.b)) {
            if (i > 0) {
                this.b = i - 1;
            } else if (!this.c) {
                new Handler(Looper.getMainLooper()).post(new Hf(view));
                this.c = true;
                if (view instanceof Ej) {
                    ((Ej) view).I();
                }
            }
        }
        WebResourceResponse a2 = AbstractC4089sq.a(url, this.f6921a);
        return a2 == null ? super.shouldInterceptRequest(view, url) : a2;
    }

    public static final void a(W2 w2) {
        w2.e.set(false);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            Z9 z9 = (Z9) y9;
            z9.c("BaseWebViewClient", "shouldInterceptRequest - url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
        }
        int i = this.b;
        if (-1 != i) {
            if (i > 0) {
                this.b = i - 1;
            } else if (!this.c) {
                new Handler(Looper.getMainLooper()).post(new Hf(view));
                this.c = true;
                if (view instanceof Ej) {
                    ((Ej) view).I();
                }
            }
        }
        WebResourceResponse a2 = AbstractC4089sq.a(request, this.f6921a);
        return a2 == null ? super.shouldInterceptRequest(view, request) : a2;
    }
}
