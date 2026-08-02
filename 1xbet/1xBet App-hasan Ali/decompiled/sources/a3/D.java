package a3;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Qw;
import java.util.Locale;

/* loaded from: classes.dex */
public final class D extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final WebView f6475a;

    /* renamed from: b, reason: collision with root package name */
    public final A f6476b;

    /* renamed from: c, reason: collision with root package name */
    public final Qw f6477c;

    /* renamed from: d, reason: collision with root package name */
    public WebViewClient f6478d;

    public D(WebView webView, A a5, C0606Hd c0606Hd) {
        this.f6475a = webView;
        this.f6476b = a5;
        this.f6477c = c0606Hd;
    }

    public final void a(WebView webView, String str) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onPageFinished(webView, str);
    }

    public final void b(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onPageStarted(webView, str, bitmap);
    }

    public final void c() {
        this.f6475a.evaluateJavascript(String.format(Locale.getDefault(), (String) Q2.r.f5053d.f5056c.a(F7.r9), this.f6476b.a()), null);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z3) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.doUpdateVisitedHistory(webView, str, z3);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        c();
        a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        c();
        b(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return false;
        }
        onRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        return onRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f5) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onScaleChanged(webView, f, f5);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return null;
        }
        return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return false;
        }
        return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean shouldOverrideUrlLoading;
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return false;
        }
        shouldOverrideUrlLoading = webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
        return shouldOverrideUrlLoading;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return null;
        }
        return webViewClient.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClient = this.f6478d;
        if (webViewClient == null) {
            return false;
        }
        return webViewClient.shouldOverrideUrlLoading(webView, str);
    }
}
