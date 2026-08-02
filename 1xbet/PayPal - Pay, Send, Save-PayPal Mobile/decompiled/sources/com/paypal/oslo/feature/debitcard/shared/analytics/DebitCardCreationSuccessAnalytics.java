package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/DebitCardCreationSuccessAnalytics;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ADD_TO_WALLET_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getADD_TO_WALLET_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "VIEW_CARD_BUTTON", "getVIEW_CARD_BUTTON", "ADD_CARDHOLDER_BUTTON", "getADD_CARDHOLDER_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardCreationSuccessAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION = "confirm";
    public static final java.lang.String SCREEN_ID = "debit_card_acquisition_confirmation";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardCreationSuccessAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardCreationSuccessAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.ACQUISITION_FEATURE, "confirm");
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ADD_TO_WALLET_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_to_wallet_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item VIEW_CARD_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("view_card_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ADD_CARDHOLDER_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_cardholder_button", 0, 2, null);

    private DebitCardCreationSuccessAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return userIntent;
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getADD_TO_WALLET_BUTTON() {
        return ADD_TO_WALLET_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getVIEW_CARD_BUTTON() {
        return VIEW_CARD_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getADD_CARDHOLDER_BUTTON() {
        return ADD_CARDHOLDER_BUTTON;
    }
}
