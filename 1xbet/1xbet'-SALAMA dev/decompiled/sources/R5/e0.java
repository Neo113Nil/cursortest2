package R5;

import A1.RunnableC0032m0;
import E4.RunnableC0181n;
import G4.RunnableC0278k;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends WebViewClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6158c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f6159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6160b = false;

    public e0(T t7) {
        this.f6159a = t7;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
        this.f6159a.f6101a.l(new c0(0, this, webView, str, z4));
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f6159a.f6101a.l(new RunnableC0181n(this, webView, message, message2, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f6159a.f6101a.l(new b0(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f6159a.f6101a.l(new b0(this, webView, str, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f6159a.f6101a.l(new b0(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f6159a.f6101a.l(new b0(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f6159a.f6101a.l(new RunnableC0032m0(this, webView, clientCertRequest, 15));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.f6159a.f6101a.l(new RunnableC0278k(this, webView, i7, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f6159a.f6101a.l(new E4.p(this, webView, httpAuthHandler, str, str2, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f6159a.f6101a.l(new RunnableC0181n(this, webView, webResourceRequest, webResourceResponse, 6));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f6159a.f6101a.l(new E4.p(this, webView, str, str2, str3, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f6159a.f6101a.l(new RunnableC0181n(this, webView, sslErrorHandler, sslError, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(final WebView webView, final float f7, final float f8) {
        this.f6159a.f6101a.l(new Runnable() { // from class: R5.d0
            @Override // java.lang.Runnable
            public final void run() {
                double d7 = f7;
                double d8 = f8;
                C0410f c0410f = new C0410f(3);
                e0 e0Var = this.f6152a;
                T t7 = e0Var.f6159a;
                WebView webView2 = webView;
                t7.getClass();
                t6.h.e(e0Var, "pigeon_instanceArg");
                t6.h.e(webView2, "viewArg");
                I4.j jVar = t7.f6101a;
                jVar.getClass();
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", jVar.a(), (Object) null, 1).L(p050g6.i.M0(e0Var, webView2, Double.valueOf(d7), Double.valueOf(d8)), new O(14, c0410f));
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f6159a.f6101a.l(new RunnableC0032m0(this, webView, webResourceRequest, 16));
        return webResourceRequest.isForMainFrame() && this.f6160b;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f6159a.f6101a.l(new RunnableC0181n(this, webView, webResourceRequest, webResourceError, 5));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f6159a.f6101a.l(new b0(this, webView, str, 1));
        return this.f6160b;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
