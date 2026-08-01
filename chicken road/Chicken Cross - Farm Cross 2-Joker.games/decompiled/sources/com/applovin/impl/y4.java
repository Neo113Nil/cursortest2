package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class y4 extends WebViewClient {
    protected abstract Map a();

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        hashMap.putAll(a());
        if (p0.d()) {
            hashMap.put("source", renderProcessGoneDetail.didCrash() ? AppMeasurement.CRASH_ORIGIN : "non_crash");
            hashMap.put("details", "renderer_priority_at_exit=" + renderProcessGoneDetail.rendererPriorityAtExit());
        }
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null) {
            com.applovin.impl.sdk.l.E0.E().a(h2.n1, hashMap, ((Long) lVar.a(c5.y3)).longValue());
        }
        com.applovin.impl.sdk.p.g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
