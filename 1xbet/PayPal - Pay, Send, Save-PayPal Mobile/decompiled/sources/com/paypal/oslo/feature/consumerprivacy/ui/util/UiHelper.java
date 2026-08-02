package com.paypal.oslo.feature.consumerprivacy.ui.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/util/UiHelper;", "", "<init>", "()V", "", "url", "Landroid/content/Context;", "context", "errorMessage", "", "handleExternalWebView", "(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UiHelper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper();

    private UiHelper() {
    }

    public static /* synthetic */ void handleExternalWebView$default(com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper uiHelper, java.lang.String str, android.content.Context context, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "Failed to open URL";
        }
        uiHelper.handleExternalWebView(str, context, str2);
    }

    public final void handleExternalWebView(java.lang.String url, android.content.Context context, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        android.net.Uri parse = android.net.Uri.parse(url);
        if (kotlin.text.StringsKt.equals(parse.getScheme(), "https", true) || kotlin.text.StringsKt.equals(parse.getScheme(), "http", true)) {
            try {
                context.startActivity(new android.content.Intent("android.intent.action.VIEW", parse));
                return;
            } catch (android.content.ActivityNotFoundException unused) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.consumerprivacy.LoggerKt.log, errorMessage, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, null, 12, null);
                return;
            }
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.consumerprivacy.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("url", url);
        java.lang.String scheme = parse.getScheme();
        if (scheme == null) {
            scheme = "null";
        }
        pairArr[1] = kotlin.TuplesKt.to("scheme", scheme);
        com.paypal.android.logger.Logger.d$default(logger, "Invalid URL scheme", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }
}
