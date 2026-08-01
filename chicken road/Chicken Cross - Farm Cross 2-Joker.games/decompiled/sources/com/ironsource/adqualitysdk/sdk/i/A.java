package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes6.dex */
public final class A extends AbstractViewOnLayoutChangeListenerC4320y {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractViewOnLayoutChangeListenerC4320y
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object mo5312(WebView webView) {
        Rect rect = AbstractC4297a.f147;
        WebView webView2 = webView;
        while (webView2.getParent() instanceof View) {
            webView2 = (View) webView2.getParent();
        }
        return webView2;
    }
}
