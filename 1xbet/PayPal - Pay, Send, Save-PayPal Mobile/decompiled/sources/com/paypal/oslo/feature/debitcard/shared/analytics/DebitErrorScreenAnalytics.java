package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/DebitErrorScreenAnalytics;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "ERROR_MODULE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getERROR_MODULE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "ERROR_SCREEN", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getERROR_SCREEN", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CLOSE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCLOSE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "TRY_AGAIN_BUTTON", "getTRY_AGAIN_BUTTON", "OK_BUTTON", "getOK_BUTTON", "CONTACT_US_BUTTON", "getCONTACT_US_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitErrorScreenAnalytics {
    public static final int $stable;
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.DebitErrorScreenAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.DebitErrorScreenAnalytics();
    public static final java.lang.String SCREEN_ID = "debit_card_error_screen";
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module ERROR_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(SCREEN_ID, 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component ERROR_SCREEN = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("error_screen", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CLOSE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TRY_AGAIN_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("try_again_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item OK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.wallet.fifo.common.IneligibleFundingInstrumentModalKt.TestTagOkButton, 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONTACT_US_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("contact_us_button", 0, 2, null);

    private DebitErrorScreenAnalytics() {
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getERROR_MODULE() {
        return ERROR_MODULE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getERROR_SCREEN() {
        return ERROR_SCREEN;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_BUTTON() {
        return CLOSE_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTRY_AGAIN_BUTTON() {
        return TRY_AGAIN_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getOK_BUTTON() {
        return OK_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONTACT_US_BUTTON() {
        return CONTACT_US_BUTTON;
    }
}
