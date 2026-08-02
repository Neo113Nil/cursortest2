package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/TermsConditionsBottomSheetAnalytics;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "TERMS_MODULE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getTERMS_MODULE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "AGREE_AND_CONTINUE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getAGREE_AND_CONTINUE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TermsConditionsBottomSheetAnalytics {
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.TermsConditionsBottomSheetAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.TermsConditionsBottomSheetAnalytics();
    public static final java.lang.String ACTION = "terms";
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.ACQUISITION_FEATURE, ACTION);
    public static final java.lang.String SCREEN_ID = "debit_card_acquisition_terms";
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module TERMS_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(SCREEN_ID, 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AGREE_AND_CONTINUE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("agree_button", 0, 2, null);
    public static final int $stable = (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable;

    private TermsConditionsBottomSheetAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return userIntent;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getTERMS_MODULE() {
        return TERMS_MODULE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAGREE_AND_CONTINUE_BUTTON() {
        return AGREE_AND_CONTINUE_BUTTON;
    }
}
