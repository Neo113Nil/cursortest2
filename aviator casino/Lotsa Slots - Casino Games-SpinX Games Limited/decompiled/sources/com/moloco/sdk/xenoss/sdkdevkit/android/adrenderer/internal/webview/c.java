package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.j {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7966a;

    public c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7966a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.j
    public java.lang.String a(java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        java.io.InputStream open = this.f7966a.getAssets().open(fileName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8);
        java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
        try {
            java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            return readText;
        } finally {
        }
    }
}
