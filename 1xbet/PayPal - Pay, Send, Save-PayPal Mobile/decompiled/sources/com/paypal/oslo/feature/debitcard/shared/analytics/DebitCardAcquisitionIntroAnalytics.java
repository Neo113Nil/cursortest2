package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/DebitCardAcquisitionIntroAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_INELIGIBLE", "SCREEN_ELIGIBLE_WITH_CONDITION", "SCREEN_ERROR", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "VALUE_PROP_CONTENT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getVALUE_PROP_CONTENT", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CLOSE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCLOSE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "GET_DEBIT_CARD_BUTTON", "getGET_DEBIT_CARD_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardAcquisitionIntroAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION = "enroll";
    public static final java.lang.String SCREEN_ELIGIBLE_WITH_CONDITION = "debit_card_acquisition_value_prop_eligible_with_condition";
    public static final java.lang.String SCREEN_ERROR = "debit_card_acquisition_value_prop_error";
    public static final java.lang.String SCREEN_ID = "debit_card_acquisition_value_prop";
    public static final java.lang.String SCREEN_INELIGIBLE = "debit_card_acquisition_value_prop_ineligible";
    public static final java.lang.String SCREEN_LOADING = "debit_card_acquisition_value_prop_loading";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAcquisitionIntroAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAcquisitionIntroAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module VALUE_PROP_CONTENT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("value_prop_content", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CLOSE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item GET_DEBIT_CARD_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("get_debit_card_button", 0, 2, null);

    private DebitCardAcquisitionIntroAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.ACQUISITION_FEATURE, "enroll");
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getVALUE_PROP_CONTENT() {
        return VALUE_PROP_CONTENT;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_BUTTON() {
        return CLOSE_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getGET_DEBIT_CARD_BUTTON() {
        return GET_DEBIT_CARD_BUTTON;
    }
}
