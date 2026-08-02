package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/ManageCardholderAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ADD_CARDHOLDER_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getADD_CARDHOLDER_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageCardholderAnalytics {
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardholderAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardholderAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ADD_CARDHOLDER_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_cardholder_button", 0, 2, null);
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;

    private ManageCardholderAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getADD_CARDHOLDER_BUTTON() {
        return ADD_CARDHOLDER_BUTTON;
    }
}
