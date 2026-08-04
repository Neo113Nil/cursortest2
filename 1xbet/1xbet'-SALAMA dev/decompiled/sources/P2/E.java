package P2;

import F2.C0254t;
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
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzgbn;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class E extends zzbju {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f5415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f5416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzgbn f5417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebViewClient f5418d;

    public E(WebView webView, B b7, zzgbn zzgbnVar) {
        this.f5415a = webView;
        this.f5416b = b7;
        this.f5417c = zzgbnVar;
    }

    public static boolean b() {
        if (!((Boolean) zzbed.zza.zze()).booleanValue()) {
            return false;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(Thread.currentThread())) {
            return true;
        }
        boolean z4 = false;
        boolean z7 = false;
        for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
            if (stackTraceElement.getClassName().contains(E.class.getName())) {
                if (z4 && z7) {
                    return true;
                }
                z4 = true;
            } else if (z4) {
                z7 = true;
            }
        }
        return false;
    }

    public final void a() {
        this.f5415a.evaluateJavascript(String.format(Locale.getDefault(), (String) C0254t.f2723d.f2726c.zzb(zzbby.zzjM), this.f5416b.a()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
        if (b()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final WebViewClient getDelegate() {
        return this.f5418d;
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (b()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (b()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (b()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (b()) {
            return;
        }
        a();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (b()) {
            return;
        }
        a();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (b()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        if (b()) {
            return;
        }
        super.onReceivedError(webView, i7, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (b()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (b()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (b()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (b()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (b()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i7, SafeBrowsingResponse safeBrowsingResponse) {
        if (b()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i7, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f7, float f8) {
        if (b()) {
            return;
        }
        super.onScaleChanged(webView, f7, f8);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (b()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (b()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (b()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (b()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (b()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (b()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (b()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbju, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (b()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
