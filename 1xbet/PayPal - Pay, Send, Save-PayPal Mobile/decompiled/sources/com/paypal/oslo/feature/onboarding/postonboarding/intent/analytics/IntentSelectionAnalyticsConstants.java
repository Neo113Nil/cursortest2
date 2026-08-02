package com.paypal.oslo.feature.onboarding.postonboarding.intent.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/intent/analytics/IntentSelectionAnalyticsConstants;", "", "<init>", "()V", "", "TRANSFER_MONEY_ITEM_NAME", "Ljava/lang/String;", "SHOP_AND_PAY_ITEM_NAME", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "FINISH_SETTING_UP_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getFINISH_SETTING_UP_ITEM", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IntentSelectionAnalyticsConstants {
    public static final java.lang.String SHOP_AND_PAY_ITEM_NAME = "shop_and_pay";
    public static final java.lang.String TRANSFER_MONEY_ITEM_NAME = "transfer_money";
    public static final com.paypal.oslo.feature.onboarding.postonboarding.intent.analytics.IntentSelectionAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.intent.analytics.IntentSelectionAnalyticsConstants();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FINISH_SETTING_UP_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.FINISH_SETTING_UP_FEATURE, 0, 2, null);
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;

    private IntentSelectionAnalyticsConstants() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFINISH_SETTING_UP_ITEM() {
        return FINISH_SETTING_UP_ITEM;
    }
}
