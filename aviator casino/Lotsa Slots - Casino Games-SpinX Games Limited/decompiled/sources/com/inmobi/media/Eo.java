package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Eo extends android.webkit.WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView view, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return com.inmobi.media.Fo.a(view, renderProcessGoneDetail, "safe_web_view");
    }
}
