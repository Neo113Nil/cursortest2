package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/PushProvisioningSetupAnalytics;", "", "<init>", "()V", "", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_ERROR", "SCREEN_SUCCESS", "ACTION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushProvisioningSetupAnalytics {
    public static final int $stable = 0;
    public static final java.lang.String ACTION = "initiate";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningSetupAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningSetupAnalytics();
    public static final java.lang.String SCREEN_ERROR = "debit_card_push_provisioning_setup_error";
    public static final java.lang.String SCREEN_ID = "debit_card_push_provisioning_setup";
    public static final java.lang.String SCREEN_LOADING = "debit_card_push_provisioning_setup_loading";
    public static final java.lang.String SCREEN_SUCCESS = "debit_card_push_provisioning_setup_success";

    private PushProvisioningSetupAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(java.lang.String productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.fromValue(productName)), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.PUSH_PROVISIONING_FEATURE, ACTION);
    }
}
