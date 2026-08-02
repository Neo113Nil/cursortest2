package com.paypal.oslo.feature.taptopay.ui.transaction.notification;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/transaction/notification/TapToPayNotificationClickHandler;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClickHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick;", com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.AccountNumbersScreen.NAVIGATION_TYPE, "", "onNotificationClicked", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick;)Z", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapToPayNotificationClickHandler implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    @dagger.hilt.android.qualifiers.ApplicationContext
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public TapToPayNotificationClickHandler(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler
    public final boolean onNotificationClicked(com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick click) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(click.getMetadata().get("type"), "taptopay") || (str = click.getMetadata().get(com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationConstants.METADATA_DEEPLINK)) == null) {
            return false;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "paypal")) {
            return false;
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", parse);
            intent.setFlags(335544320);
            this.getHighSpeedVideoFpsRangesFor.startActivity(intent);
            return true;
        } catch (android.content.ActivityNotFoundException unused) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No activity found for TapToPay notification deeplink", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deeplinkUri", str)), null, 4, null);
            return false;
        }
    }
}
