package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/DebitCardApplyAndCreateAnalytics;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_PROVISIONING", "SCREEN_ERROR", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "CONFIRMING_INFO_LOADER", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getCONFIRMING_INFO_LOADER", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "CARD_READY_LOADER", "getCARD_READY_LOADER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardApplyAndCreateAnalytics {
    public static final int $stable;
    public static final java.lang.String SCREEN_ERROR = "debit_card_acquisition_apply_and_create_error";
    public static final java.lang.String SCREEN_ID = "debit_card_acquisition_apply_and_create";
    public static final java.lang.String SCREEN_PROVISIONING = "debit_card_acquisition_apply_and_create_provisioning";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics();
    public static final java.lang.String ACTION = "create_card";
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.ACQUISITION_FEATURE, ACTION);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module CONFIRMING_INFO_LOADER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("confirming_info_loader", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module CARD_READY_LOADER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("card_ready_loader", 0, null, null, 14, null);

    private DebitCardApplyAndCreateAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return userIntent;
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getCONFIRMING_INFO_LOADER() {
        return CONFIRMING_INFO_LOADER;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getCARD_READY_LOADER() {
        return CARD_READY_LOADER;
    }
}
