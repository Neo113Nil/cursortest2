package sg.bigo.ads.d1;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.X;

/* loaded from: classes3.dex */
public final class o extends sg.bigo.ads.E1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f12738a;

    public o(s sVar) {
        this.f12738a = sVar;
    }

    @Override // sg.bigo.ads.E1.h
    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        try {
            s sVar = this.f12738a;
            X.a(sVar.i, sVar.f12728a, new FrameLayout.LayoutParams(-1, -1, 17), -1);
        } catch (Throwable unused) {
        }
    }
}
