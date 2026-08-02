package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersAnalyticsConstants;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CONTINUE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCONTINUE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "EMONEY_INFO_TOOLTIP", "getEMONEY_INFO_TOOLTIP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OffersAnalyticsConstants {
    public static final int $stable;
    public static final java.lang.String ACTION = "select_offers";
    public static final java.lang.String SCREEN_ID = "bnpl_appl_offers";
    public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsConstants();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONTINUE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item EMONEY_INFO_TOOLTIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("emoney_info_tooltip", 0, 2, null);

    private OffersAnalyticsConstants() {
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONTINUE_BUTTON() {
        return CONTINUE_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getEMONEY_INFO_TOOLTIP() {
        return EMONEY_INFO_TOOLTIP;
    }
}
