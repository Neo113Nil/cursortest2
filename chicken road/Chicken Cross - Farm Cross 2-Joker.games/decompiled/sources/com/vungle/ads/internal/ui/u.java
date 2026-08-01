package com.vungle.ads.internal.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f12162a;
    public final /* synthetic */ RenderProcessGoneDetail b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super(0);
        this.f12162a = webView;
        this.b = renderProcessGoneDetail;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.f12162a;
        StringBuilder append = a2.append(webView != null ? webView.getUrl() : null).append(", did crash: ");
        RenderProcessGoneDetail renderProcessGoneDetail = this.b;
        return append.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null).toString();
    }
}
