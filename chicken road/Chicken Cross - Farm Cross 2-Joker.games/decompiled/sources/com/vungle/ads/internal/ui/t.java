package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f12161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(WebView webView) {
        super(0);
        this.f12161a = webView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.f12161a;
        return a2.append(webView != null ? webView.getUrl() : null).toString();
    }
}
