package com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/analytics/ActivationAnalyticsConstants;", "", "<init>", "()V", "", "MODULE_SETUP_STEPS", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ADD_CARD_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getADD_CARD_ITEM", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "SETUP_PASSKEY_ITEM", "getSETUP_PASSKEY_ITEM", "LINK_BANK_ITEM", "getLINK_BANK_ITEM", "FINISH_SETUP_ITEM", "getFINISH_SETUP_ITEM", "DISMISS_ITEM", "getDISMISS_ITEM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActivationAnalyticsConstants {
    public static final int $stable;
    public static final java.lang.String MODULE_SETUP_STEPS = "setup_steps";
    public static final com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ADD_CARD_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.inappcheckout.Constants.ADD_CARD_LINK_ID, 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SETUP_PASSKEY_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("setup_passkey", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item LINK_BANK_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("link_bank", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FINISH_SETUP_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("finish_setup", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DISMISS_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("dismiss", 0, 2, null);

    private ActivationAnalyticsConstants() {
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getADD_CARD_ITEM() {
        return ADD_CARD_ITEM;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSETUP_PASSKEY_ITEM() {
        return SETUP_PASSKEY_ITEM;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getLINK_BANK_ITEM() {
        return LINK_BANK_ITEM;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFINISH_SETUP_ITEM() {
        return FINISH_SETUP_ITEM;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDISMISS_ITEM() {
        return DISMISS_ITEM;
    }
}
