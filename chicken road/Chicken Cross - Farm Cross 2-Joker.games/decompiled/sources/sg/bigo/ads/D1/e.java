package sg.bigo.ads.D1;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class e extends l {
    public final /* synthetic */ k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, String str) {
        super(str);
        this.b = kVar;
    }

    @Override // sg.bigo.ads.E1.h
    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
        this.b.a(renderProcessGoneDetail);
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AbstractC5496a.a("VPAIDWebView", "onPageFinished: " + str);
        if (this.b.n.compareAndSet(false, true)) {
            this.b.a(new d(this));
            this.b.b();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        AbstractC5496a.a("VPAIDWebView", "Error: " + str);
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.b.b(str);
        return true;
    }
}
