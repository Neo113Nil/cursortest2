package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Fj extends W2 {
    public final Oj f;
    public final Function1 g;
    public boolean h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fj(Oj oj, Y9 y9, Function1 onRenderViewProcessGone) {
        super(y9);
        Intrinsics.checkNotNullParameter(onRenderViewProcessGone, "onRenderViewProcessGone");
        this.f = oj;
        this.g = onRenderViewProcessGone;
        this.i = "redirect";
    }

    public final boolean a(WebView webView, String str) {
        boolean z;
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("RenderViewClient", "onShouldOverrideUrlLoading  - url - " + str);
        }
        if (webView instanceof Ej) {
            Ej ej = (Ej) webView;
            ej.getClass();
            z = true;
            if (!ej.a()) {
                ej.a(this.i);
                return true;
            }
            Y9 y92 = this.f6921a;
            if (y92 != null) {
                ((Z9) y92).a("RenderViewClient", "Placement type:  " + ((int) ej.getPlacementType()) + "  url:" + str);
            }
            a(ej, str);
        } else {
            z = false;
        }
        Y9 y93 = this.f6921a;
        if (y93 != null) {
            ((Z9) y93).a("RenderViewClient", "Override URL loading :" + str + " returned " + z);
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("RenderViewClient", "Resource loading:" + str);
        }
        if (webView instanceof Ej) {
            Ej ej = (Ej) webView;
            String url = ej.getUrl();
            if (str == null || url == null || StringsKt.startsWith$default(url, "file:", false, 2, (Object) null)) {
                return;
            }
            a(ej);
        }
    }

    @Override // com.inmobi.media.W2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C3685ej c3685ej;
        Oj oj = this.f;
        if (oj != null) {
            Map a2 = oj.a();
            long j = oj.c;
            CoroutineScope coroutineScope = AbstractC4143un.f7420a;
            a2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String a3 = oj.a("WebViewLoadFinished");
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b(a3, a2, EnumC3944nm.f7271a);
        }
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("RenderViewClient", "Page load finished:" + str);
        }
        if (webView instanceof Ej) {
            Ej ej = (Ej) webView;
            a(ej);
            ej.g();
            if (Intrinsics.areEqual("Loading", ej.B)) {
                BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Bj(ej, null), 3, null);
            }
        }
        Y9 y92 = this.f6921a;
        if (y92 != null) {
            ((Z9) y92).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        Y9 y93 = this.f6921a;
        if (y93 == null || (c3685ej = ((Z9) y93).f6988a) == null) {
            return;
        }
        c3685ej.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C3685ej c3685ej;
        Oj oj = this.f;
        if (oj != null) {
            Map a2 = oj.a();
            long j = oj.c;
            CoroutineScope coroutineScope = AbstractC4143un.f7420a;
            a2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String a3 = oj.a("PageStarted");
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b(a3, a2, EnumC3944nm.f7271a);
        }
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("RenderViewClient", "Page load started:" + str);
        }
        if (webView instanceof Ej) {
            Y9 y92 = this.f6921a;
            if (y92 != null) {
                ((Z9) y92).a("RenderViewClient", "Page load started renderview: " + ((Ej) webView).getMarkupType());
            }
            Ej ej = (Ej) webView;
            a(ej);
            ej.setAndUpdateViewState("Loading");
        }
        Y9 y93 = this.f6921a;
        if (y93 != null) {
            ((Z9) y93).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        Y9 y94 = this.f6921a;
        if (y94 == null || (c3685ej = ((Z9) y94).f6988a) == null) {
            return;
        }
        c3685ej.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).b("RenderViewClient", "OnReceivedError - errorCode - " + i + ", description - " + description + ", url - " + failingUrl);
        }
        super.onReceivedError(view, i, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).b("RenderViewClient", "ReceivedHttpError - error - " + (webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null) + ", statusCode - " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null) + " url - " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " isMainFrame - " + (webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).b("RenderViewClient", "onReceivedSSLError - error - " + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null) + " - url - " + (sslError != null ? sslError.getUrl() : null));
        }
    }

    @Override // com.inmobi.media.W2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        if (Build.VERSION.SDK_INT >= 26) {
            Y9 y9 = this.f6921a;
            if (y9 != null) {
                Z9 z9 = (Z9) y9;
                z9.c("RenderViewClient", "onRenderProcessGone detail did crash- " + detail.didCrash() + " priority - " + detail.rendererPriorityAtExit());
            }
            this.g.invoke(Boolean.valueOf(detail.didCrash()));
        } else {
            Y9 y92 = this.f6921a;
            if (y92 != null) {
                ((Z9) y92).c("RenderViewClient", "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(view, detail);
    }

    @Override // com.inmobi.media.W2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        WebResourceResponse a2 = AbstractC4089sq.a(request, this.f6921a);
        return a2 == null ? super.shouldInterceptRequest(view, request) : a2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        Y5.f6965a.getClass();
        if (!Y5.x()) {
            return false;
        }
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return a(view, uri);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        Y5.f6965a.getClass();
        if (Y5.z()) {
            Y9 y9 = this.f6921a;
            if (y9 != null) {
                int errorCode = error.getErrorCode();
                CharSequence description = error.getDescription();
                Z9 z9 = (Z9) y9;
                z9.b("RenderViewClient", "OnReceivedError - errorCode - " + errorCode + ", description - " + ((Object) description) + ", url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
                return;
            }
            return;
        }
        Y9 y92 = this.f6921a;
        if (y92 != null) {
            ((Z9) y92).b("RenderViewClient", "OnReceivedError ");
        }
    }

    @Override // com.inmobi.media.W2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        WebResourceResponse a2 = AbstractC4089sq.a(url, this.f6921a);
        return a2 == null ? super.shouldInterceptRequest(view, url) : a2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("RenderViewClient", "shouldOverrideUrlLoading Called " + url);
        }
        return a(view, url);
    }

    public final void a(Ej ej, String str) {
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("RenderViewClient", "Override URL loading :" + str);
        }
        ej.t();
        Tb a2 = Ub.a(ej.getLandingPageHandler(), this.i, (String) null, str, (Yb) null, 24);
        Y9 y92 = this.f6921a;
        if (y92 != null) {
            Z9 z9 = (Z9) y92;
            z9.a("RenderViewClient", "Current Index :" + ej.copyBackForwardList().getCurrentIndex() + " Original Url :" + ej.getOriginalUrl() + " URL: " + str);
        }
        Y9 y93 = this.f6921a;
        if (y93 != null) {
            ((Z9) y93).c("RenderViewClient", "landingPage process result - " + a2.f6870a);
        }
    }

    public final void a(Ej ej) {
        if (this.h || ej.e) {
            return;
        }
        this.h = true;
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        ej.h(ej.getMraidJsString());
    }
}
