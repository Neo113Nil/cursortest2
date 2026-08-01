package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f12155a;
    public final /* synthetic */ WebViewRenderProcess b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        super(0);
        this.f12155a = webView;
        this.b = webViewRenderProcess;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return com.iab.omid.library.vungle.internal.l.a("onRenderProcessUnresponsive(Title = ").append(this.f12155a.getTitle()).append(", URL = ").append(this.f12155a.getOriginalUrl()).append(", (webViewRenderProcess != null) = ").append(this.b != null).toString();
    }
}
