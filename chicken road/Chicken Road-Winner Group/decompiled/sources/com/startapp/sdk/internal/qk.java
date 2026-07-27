package com.startapp.sdk.internal;

import android.os.Build;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public class qk extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        didCrash = renderProcessGoneDetail.didCrash();
        if (!didCrash) {
            return false;
        }
        Log.e("StartAppSDK", "WebView render process crashed");
        return true;
    }
}
