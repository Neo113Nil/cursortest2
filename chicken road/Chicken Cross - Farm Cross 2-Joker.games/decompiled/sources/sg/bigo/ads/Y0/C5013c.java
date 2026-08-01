package sg.bigo.ads.Y0;

import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import io.ktor.sse.ServerSentEventKt;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.Y0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5013c extends sg.bigo.ads.E1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12630a;
    public final /* synthetic */ String b;
    public final /* synthetic */ g c;

    public C5013c(g gVar, f fVar, String str) {
        this.c = gVar;
        this.f12630a = fVar;
        this.b = str;
    }

    @Override // sg.bigo.ads.E1.h
    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
        this.c.e = null;
        this.f12630a.a(this.b, SystemClock.elapsedRealtime() - this.c.f, false, 0);
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        webView.getUrl();
        this.f12630a.a(str, SystemClock.elapsedRealtime() - this.c.f, true, 0);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        AbstractC5496a.b("Preload", "onReceivedError: " + i + ServerSentEventKt.SPACE + str);
        this.f12630a.a(this.b, SystemClock.elapsedRealtime() - this.c.f, false, 0);
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceRequest.getUrl().toString());
        }
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }
}
