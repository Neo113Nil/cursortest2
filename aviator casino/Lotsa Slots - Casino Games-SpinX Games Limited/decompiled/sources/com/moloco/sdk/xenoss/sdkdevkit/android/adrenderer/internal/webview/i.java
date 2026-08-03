package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

/* loaded from: classes5.dex */
public final class i implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.h {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.j f7970a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g c;

    public i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.j localAssetLoader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f contentEncoder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g cssMarginHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localAssetLoader, "localAssetLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentEncoder, "contentEncoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cssMarginHandler, "cssMarginHandler");
        this.f7970a = localAssetLoader;
        this.b = contentEncoder;
        this.c = cssMarginHandler;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.h
    public java.lang.String a(java.lang.String html) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(html, "html");
        java.lang.String a2 = this.f7970a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k);
        return kotlin.text.StringsKt.trimIndent("\n            <script>" + this.f7970a.a("mraid-bridge.js") + "</script>\n            <iframe id=\"adFrame\"\n                style=\"width:100vw; height:100vh; border:none;\"\n                src=\"data:text/html;base64," + this.b.a(kotlin.text.StringsKt.replace$default(this.c.a(html), "<script src=\"mraid.js\"></script>", "<script>" + a2 + "</script>", false, 4, (java.lang.Object) null)) + "\"\n                sandbox=\"allow-scripts allow-same-origin\"\n            >\n            </iframe>\n        ");
    }

    public /* synthetic */ i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.j jVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g gVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, fVar, (i & 4) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g() : gVar);
    }
}
