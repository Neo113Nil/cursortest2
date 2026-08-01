package sg.bigo.ads.Y0;

import android.os.Build;
import android.webkit.DownloadListener;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class n implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f12640a;

    public n(x xVar) {
        this.f12640a = xVar;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        WebView webView;
        x xVar = this.f12640a;
        if (xVar.r) {
            return;
        }
        xVar.a(4, str);
        if (Build.VERSION.SDK_INT < 26 || (webView = this.f12640a.h) == null) {
            this.f12640a.b(str);
        } else {
            webView.getWebViewClient().onPageFinished(this.f12640a.h, str);
        }
        this.f12640a.g(0);
    }
}
