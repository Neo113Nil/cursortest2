package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7967a = 0;

    public final android.widget.FrameLayout a(android.content.Context context, android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        android.view.ViewParent parent = webView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.setBackgroundColor(0);
        webView.setVisibility(0);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.addView(webView, new android.view.ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }
}
