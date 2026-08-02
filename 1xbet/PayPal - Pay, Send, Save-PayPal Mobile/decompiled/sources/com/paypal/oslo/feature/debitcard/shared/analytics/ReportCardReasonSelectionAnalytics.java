package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/ReportCardReasonSelectionAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "NEXT_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getNEXT_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "REASON_LOST_OR_STOLEN", "getREASON_LOST_OR_STOLEN", "REASON_DAMAGED", "getREASON_DAMAGED", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "REASON_SELECTION_CARD", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getREASON_SELECTION_CARD", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReportCardReasonSelectionAnalytics {
    public static final java.lang.String ACTION = "select";
    public static final java.lang.String SCREEN_ID = "debit_card_report_card_reason_selection";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.ReportCardReasonSelectionAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.ReportCardReasonSelectionAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item NEXT_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("next_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item REASON_LOST_OR_STOLEN = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("reason_lost_or_stolen_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item REASON_DAMAGED = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("reason_damaged_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component REASON_SELECTION_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.REPORT_CARD_REASON_SELECTION_FEATURE, 0, null, null, 14, null);
    public static final int $stable = ((com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;

    private ReportCardReasonSelectionAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.REPORT_CARD_REASON_SELECTION_FEATURE, "select");
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getNEXT_BUTTON() {
        return NEXT_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getREASON_LOST_OR_STOLEN() {
        return REASON_LOST_OR_STOLEN;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getREASON_DAMAGED() {
        return REASON_DAMAGED;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getREASON_SELECTION_CARD() {
        return REASON_SELECTION_CARD;
    }
}
