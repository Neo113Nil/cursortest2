package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4761z5;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5267a;
    public final /* synthetic */ String b;

    public j0(String str, String str2) {
        this.f5267a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.R;
        if (iAConfigManager.N == null && (context = iAConfigManager.g) != null) {
            try {
                webView = new WebView(context);
                webView.setWebViewClient(new c0());
            } catch (Throwable unused) {
                IAlog.a("failed to create a new webview", new Object[0]);
                webView = null;
            }
            iAConfigManager.N = webView;
        }
        WebView webView2 = iAConfigManager.N;
        String str = this.f5267a;
        String str2 = this.b;
        if (webView2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            webView2.loadDataWithBaseURL(str, str2, "text/html", C4761z5.O, null);
        }
        com.fyber.inneractive.sdk.util.r.b.postDelayed(IAConfigManager.T, TimeUnit.SECONDS.toMillis(10L));
    }
}
