package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/ActivateCardAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_ERROR", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ACTIVATE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getACTIVATE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "DIDNT_GET_YOUR_CARD_BUTTON", "getDIDNT_GET_YOUR_CARD_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActivateCardAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION = "activate";
    public static final java.lang.String SCREEN_ERROR = "debit_card_activate_card_error";
    public static final java.lang.String SCREEN_ID = "debit_card_activate_card";
    public static final java.lang.String SCREEN_LOADING = "debit_card_activate_card_loading";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.ActivateCardAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.ActivateCardAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ACTIVATE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("activate_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DIDNT_GET_YOUR_CARD_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("didnt_get_your_card_button", 0, 2, null);

    private ActivateCardAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.ACTIVATE_CARD_FEATURE, "activate");
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getACTIVATE_BUTTON() {
        return ACTIVATE_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDIDNT_GET_YOUR_CARD_BUTTON() {
        return DIDNT_GET_YOUR_CARD_BUTTON;
    }
}
