package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountAnalyticsConstants;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "HOW_IT_WORKS_LINK", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getHOW_IT_WORKS_LINK", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CONTINUE_BUTTON", "getCONTINUE_BUTTON", "PREQUALIFICATION_FAQ_LINK", "getPREQUALIFICATION_FAQ_LINK"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnterAmountAnalyticsConstants {
    public static final int $stable;
    public static final java.lang.String ACTION = "enter_spending_amount";
    public static final java.lang.String SCREEN_ID = "bnpl_appl_enter_amount";
    public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsConstants();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item HOW_IT_WORKS_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("how_it_works_link", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONTINUE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item PREQUALIFICATION_FAQ_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("prequalification_faq_link", 0, 2, null);

    private EnterAmountAnalyticsConstants() {
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getHOW_IT_WORKS_LINK() {
        return HOW_IT_WORKS_LINK;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONTINUE_BUTTON() {
        return CONTINUE_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getPREQUALIFICATION_FAQ_LINK() {
        return PREQUALIFICATION_FAQ_LINK;
    }
}
