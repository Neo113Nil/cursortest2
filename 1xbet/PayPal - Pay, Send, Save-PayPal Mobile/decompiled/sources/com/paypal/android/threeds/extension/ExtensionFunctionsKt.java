package com.paypal.android.threeds.extension;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "", "fileName", "readTextFromAsset", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExtensionFunctionsKt {
    public static final java.lang.String readTextFromAsset(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.io.InputStream open = context.getAssets().open(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
        try {
            java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            return readText;
        } finally {
        }
    }
}
