package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/CancelCardConfirmationAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_ERROR", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "KEEP_CARD_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getKEEP_CARD_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CANCEL_CARD_CONFIRM_BUTTON", "getCANCEL_CARD_CONFIRM_BUTTON", "LEARN_MORE_LINK", "getLEARN_MORE_LINK", "CANCEL_REASON_TEXT_AREA", "getCANCEL_REASON_TEXT_AREA"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelCardConfirmationAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION = "confirm";
    public static final java.lang.String SCREEN_ERROR = "debit_card_cancel_card_confirmation_error";
    public static final java.lang.String SCREEN_ID = "debit_card_cancel_card_confirmation";
    public static final java.lang.String SCREEN_LOADING = "debit_card_cancel_card_confirmation_loading";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardConfirmationAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardConfirmationAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item KEEP_CARD_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("keep_card_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CANCEL_CARD_CONFIRM_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cancel_card_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item LEARN_MORE_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("learn_more_link", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CANCEL_REASON_TEXT_AREA = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cancel_reason_text_area", 0, 2, null);

    private CancelCardConfirmationAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.CANCEL_CARD_FEATURE, "confirm");
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getKEEP_CARD_BUTTON() {
        return KEEP_CARD_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCANCEL_CARD_CONFIRM_BUTTON() {
        return CANCEL_CARD_CONFIRM_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getLEARN_MORE_LINK() {
        return LEARN_MORE_LINK;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCANCEL_REASON_TEXT_AREA() {
        return CANCEL_REASON_TEXT_AREA;
    }
}
