package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/CardReplacementAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_PROCESSING", "SCREEN_SUCCESS", "SCREEN_ERROR", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "SEND_REPLACEMENT_NEW_CARD_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getSEND_REPLACEMENT_NEW_CARD_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CHANGE_ADDRESS_BUTTON", "getCHANGE_ADDRESS_BUTTON", "OK_BUTTON", "getOK_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardReplacementAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION = "replace";
    public static final java.lang.String SCREEN_ERROR = "debit_card_card_replacement_error";
    public static final java.lang.String SCREEN_ID = "debit_card_card_replacement";
    public static final java.lang.String SCREEN_PROCESSING = "debit_card_card_replacement_processing";
    public static final java.lang.String SCREEN_SUCCESS = "debit_card_card_replacement_success";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.CardReplacementAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.CardReplacementAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SEND_REPLACEMENT_NEW_CARD_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("send_replacement_new_card_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CHANGE_ADDRESS_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("change_address_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item OK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.wallet.fifo.common.IneligibleFundingInstrumentModalKt.TestTagOkButton, 0, 2, null);

    private CardReplacementAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.CARD_REPLACEMENT_FEATURE, "replace");
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSEND_REPLACEMENT_NEW_CARD_BUTTON() {
        return SEND_REPLACEMENT_NEW_CARD_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCHANGE_ADDRESS_BUTTON() {
        return CHANGE_ADDRESS_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getOK_BUTTON() {
        return OK_BUTTON;
    }
}
