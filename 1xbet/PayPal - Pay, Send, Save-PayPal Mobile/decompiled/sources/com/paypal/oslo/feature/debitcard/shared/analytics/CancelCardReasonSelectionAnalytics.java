package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/CancelCardReasonSelectionAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "CANCEL_REASON_SELECTION_CARD", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getCANCEL_REASON_SELECTION_CARD", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CANCEL_REASON_SELECTION_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCANCEL_REASON_SELECTION_ITEM", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelCardReasonSelectionAnalytics {
    public static final java.lang.String ACTION = "select";
    public static final java.lang.String SCREEN_ID = "debit_card_cancel_card_reason_selection";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardReasonSelectionAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardReasonSelectionAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CANCEL_REASON_SELECTION_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("cancel_reason_selection_card", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CANCEL_REASON_SELECTION_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cancel_reason_selection_item", 0, 2, null);
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable;

    private CancelCardReasonSelectionAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.CANCEL_CARD_FEATURE, "select");
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCANCEL_REASON_SELECTION_CARD() {
        return CANCEL_REASON_SELECTION_CARD;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCANCEL_REASON_SELECTION_ITEM() {
        return CANCEL_REASON_SELECTION_ITEM;
    }
}
