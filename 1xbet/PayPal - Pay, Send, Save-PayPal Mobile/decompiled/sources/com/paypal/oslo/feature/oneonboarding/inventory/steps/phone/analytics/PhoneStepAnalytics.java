package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.analytics;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/analytics/PhoneStepAnalytics;", "", "<init>", "()V", "", "ERROR_CODE_CONTEXTUAL", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "SCREEN", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "getSCREEN", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "MODULE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getMODULE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ITEM_CONTINUE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getITEM_CONTINUE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneStepAnalytics {
    public static final java.lang.String ERROR_CODE_CONTEXTUAL = "PHONE_CONTEXTUAL_ERROR";
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.analytics.PhoneStepAnalytics INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.analytics.PhoneStepAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen SCREEN = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("phone_entry");
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("phone", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ITEM_CONTINUE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue", 0, 2, null);
    public static final int $stable = (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen.$stable;

    private PhoneStepAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen getSCREEN() {
        return SCREEN;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMODULE() {
        return MODULE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getITEM_CONTINUE() {
        return ITEM_CONTINUE;
    }
}
