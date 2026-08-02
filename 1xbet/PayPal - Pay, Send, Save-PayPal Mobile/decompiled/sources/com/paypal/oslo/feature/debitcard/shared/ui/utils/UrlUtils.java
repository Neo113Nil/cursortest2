package com.paypal.oslo.feature.debitcard.shared.ui.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/utils/UrlUtils;", "", "<init>", "()V", "", "url", "Landroid/content/Context;", "context", "", "launchUrlInBrowser$debit_card_prodRelease", "(Ljava/lang/String;Landroid/content/Context;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UrlUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.debitcard.shared.ui.utils.UrlUtils INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.utils.UrlUtils();

    private UrlUtils() {
    }

    public final void launchUrlInBrowser$debit_card_prodRelease(java.lang.String url, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.net.Uri parse = android.net.Uri.parse(url);
        if (kotlin.text.StringsKt.equals(parse.getScheme(), "https", true)) {
            try {
                context.startActivity(new android.content.Intent("android.intent.action.VIEW", parse));
                return;
            } catch (android.content.ActivityNotFoundException unused) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Failed to open URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, null, 12, null);
                return;
            }
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Invalid URL scheme", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, null, 12, null);
    }
}
