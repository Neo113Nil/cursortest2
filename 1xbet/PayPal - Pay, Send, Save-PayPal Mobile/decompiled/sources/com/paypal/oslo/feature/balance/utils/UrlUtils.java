package com.paypal.oslo.feature.balance.utils;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/utils/UrlUtils;", "", "<init>", "()V", "", "url", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extraParams", "", "launchUrlInBrowser$balance_prodRelease", "(Ljava/lang/String;Landroid/content/Context;Landroid/os/Bundle;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UrlUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.utils.UrlUtils INSTANCE = new com.paypal.oslo.feature.balance.utils.UrlUtils();

    private UrlUtils() {
    }

    public static /* synthetic */ void launchUrlInBrowser$balance_prodRelease$default(com.paypal.oslo.feature.balance.utils.UrlUtils urlUtils, java.lang.String str, android.content.Context context, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        urlUtils.launchUrlInBrowser$balance_prodRelease(str, context, bundle);
    }

    public final void launchUrlInBrowser$balance_prodRelease(java.lang.String url, android.content.Context context, android.os.Bundle extraParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.net.Uri parse = android.net.Uri.parse(url);
        if (!kotlin.text.StringsKt.equals(parse.getScheme(), "https", true)) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Invalid URL scheme - must use HTTPS", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, null, 12, null);
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", parse);
            if (extraParams != null) {
                intent.putExtras(extraParams);
            }
            context.startActivity(intent);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Launched URL in browser", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, 4, null);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to open URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, e, 4, null);
        }
    }
}
