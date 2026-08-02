package com.paypal.oslo.feature.smartroute.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/utils/UrlUtils;", "", "<init>", "()V", "", "url", "Landroid/content/Context;", "context", "", "launchUrlInBrowser$smart_route_prodRelease", "(Ljava/lang/String;Landroid/content/Context;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.smartroute.utils.UrlUtils INSTANCE = new com.paypal.oslo.feature.smartroute.utils.UrlUtils();

    private UrlUtils() {
    }

    public final void launchUrlInBrowser$smart_route_prodRelease(java.lang.String url, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(url));
            intent.setFlags(268435456);
            context.startActivity(intent);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Launched URL in browser", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, 4, null);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Failed to open URL - no browser activity found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, e, 4, null);
        }
    }
}
