package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/ViewPinAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_ERROR", "SCREEN_DISPLAY_PIN", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "VIEW_PIN_NEXT_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getVIEW_PIN_NEXT_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "VIEW_PIN_SUBMIT_BUTTON", "getVIEW_PIN_SUBMIT_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewPinAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION = "view_pin";
    public static final java.lang.String SCREEN_DISPLAY_PIN = "debit_card_display_pin";
    public static final java.lang.String SCREEN_ERROR = "debit_card_view_pin_cvv_entry_error";
    public static final java.lang.String SCREEN_ID = "debit_card_view_pin_cvv_entry";
    public static final java.lang.String SCREEN_LOADING = "debit_card_view_pin_cvv_entry_loading";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.ViewPinAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.ViewPinAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item VIEW_PIN_NEXT_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("view_pin_next_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item VIEW_PIN_SUBMIT_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("view_pin_submit_button", 0, 2, null);

    private ViewPinAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), "view_pin", "view_pin");
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getVIEW_PIN_NEXT_BUTTON() {
        return VIEW_PIN_NEXT_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getVIEW_PIN_SUBMIT_BUTTON() {
        return VIEW_PIN_SUBMIT_BUTTON;
    }
}
