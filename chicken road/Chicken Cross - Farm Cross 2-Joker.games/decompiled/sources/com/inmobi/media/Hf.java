package com.inmobi.media;

import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Hf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f6604a;

    public Hf(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f6604a = new WeakReference(webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebSettings settings;
        WebView webView = (WebView) this.f6604a.get();
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.setBlockNetworkLoads(true);
    }
}
