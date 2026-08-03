package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3448e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f7440a = "https://appassets.androidplatform.net";

    public static final void a(android.webkit.WebView webView, java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        webView.loadDataWithBaseURL(f7440a, data, "text/html", com.ironsource.B5.O, null);
    }
}
