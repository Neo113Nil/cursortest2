package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

/* loaded from: classes5.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7968a = 0;

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f
    public java.lang.String a(java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        byte[] bytes = kotlin.text.StringsKt.trimIndent(content).getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
