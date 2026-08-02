package com.paypal.oslo.feature.taptopay.ui.transaction.notification;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/transaction/notification/DefaultTapToPayNotificationContentProvider;", "Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContentProvider;", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContext;", "context", "Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationData;", "provideContent", "(Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContext;)Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationData;", "", "p0", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(DLjava/lang/String;)Ljava/lang/String;", "", "priority", com.visa.cbp.getEncExpo.warmup, "getPriority", "()I", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultTapToPayNotificationContentProvider implements com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider.Companion Companion = new com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String DEEPLINK_AUTHORITY = "activity";

    @java.lang.Deprecated
    public static final java.lang.String DEEPLINK_SOURCE_PARAM = "source";

    @java.lang.Deprecated
    public static final java.lang.String DEEPLINK_SOURCE_VALUE = "push_notification";

    @java.lang.Deprecated
    public static final int DEFAULT_DECIMALS = 2;
    private final int priority;

    @javax.inject.Inject
    public DefaultTapToPayNotificationContentProvider() {
    }

    @Override // com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider
    public final int getPriority() {
        return this.priority;
    }

    @Override // com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider
    public final com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationData provideContent(com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (!context.isApproved()) {
            return null;
        }
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(context.getAmount(), context.getCurrencyCode());
        java.lang.String obj = new android.net.Uri.Builder().scheme("paypal").authority("activity").appendQueryParameter("source", DEEPLINK_SOURCE_VALUE).build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return new com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationData(highResolutionOutputSizeshNQ4ISI, obj);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(double p0, java.lang.String p1) {
        try {
            return com.paypal.oslo.feature.taptopay.ui.core.util.CurrencyUtilsKt.amountToCurrency(p0, 2, p1);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to format currency, using fallback", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", p1), kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(p0)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/transaction/notification/DefaultTapToPayNotificationContentProvider$Companion;", "", "<init>", "()V", "", "DEFAULT_DECIMALS", com.visa.cbp.getEncExpo.warmup, "", "DEEPLINK_AUTHORITY", "Ljava/lang/String;", "DEEPLINK_SOURCE_PARAM", "DEEPLINK_SOURCE_VALUE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
