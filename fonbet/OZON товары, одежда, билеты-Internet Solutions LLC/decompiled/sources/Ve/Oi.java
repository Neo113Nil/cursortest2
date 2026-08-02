package Ve;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Oi extends Tm {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4592rj f29630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oi(C4592rj c4592rj, Context context) {
        super(context);
        this.f29630d = c4592rj;
        Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView != null) {
            webView.postDelayed(new MW.a(this.f29630d, 1), 500L);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError == null || (description = webResourceError.getDescription()) == null || !kotlin.text.h.t(description, "ERR_INTERNET_DISCONNECTED", false)) {
            return;
        }
        ((C4194dp) this.f29630d.u()).e0(Tc.f30034a);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        C4476ni block = new C4476ni(url, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        String host = url.getHost();
        if (host != null) {
            Intrinsics.checkNotNullExpressionValue(host, "host");
            C4592rj c4592rj = this.f29630d;
            if (kotlin.text.h.t(host, Wk.f30290b == 1 ? "platiecom.ru" : "ift.platiecom.ru", false)) {
                ((C4194dp) c4592rj.u()).e0(new C4758xd(url));
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
