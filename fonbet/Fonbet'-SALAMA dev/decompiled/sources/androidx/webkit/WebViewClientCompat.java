package androidx.webkit;

import P6.b;
import R0.d;
import R0.f;
import R0.p;
import S0.k;
import S0.s;
import S0.w;
import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

/* loaded from: classes.dex */
public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    public abstract void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, p pVar);

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        s sVar = new s();
        sVar.f6264b = (WebResourceErrorBoundaryInterface) b.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
        onReceivedError(webView, webResourceRequest, sVar);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i7, InvocationHandler invocationHandler) {
        k kVar = new k();
        kVar.f6245b = (SafeBrowsingResponseBoundaryInterface) b.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        onSafeBrowsingHit(webView, webResourceRequest, i7, kVar);
    }

    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        s sVar = new s();
        sVar.f6263a = webResourceError;
        onReceivedError(webView, webResourceRequest, sVar);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i7, SafeBrowsingResponse safeBrowsingResponse) {
        k kVar = new k();
        kVar.f6244a = safeBrowsingResponse;
        onSafeBrowsingHit(webView, webResourceRequest, i7, kVar);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i7, f fVar) {
        if (d.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            fVar.a(true);
            return;
        }
        throw w.a();
    }
}
