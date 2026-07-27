package com.mbridge.msdk.config.component.wei.monitor;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSession;

/* compiled from: OMSDKWebMonitor.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    AdSession f9060a;

    public b(AdSession adSession) {
        this.f9060a = adSession;
    }

    public void a(WebView webView) {
        this.f9060a.registerAdView(webView);
    }
}
