package com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/analytics/CelebrationAnalyticsConstants;", "", "<init>", "()V", "", "TRANSFER_CELEBRATION_SCREEN_ID", "Ljava/lang/String;", "SHOP_CELEBRATION_SCREEN_ID", "EXPLORE_CELEBRATION_SCREEN_ID", "TRANSFER_CELEBRATION_ACTION", "SHOP_CELEBRATION_ACTION", "EXPLORE_CELEBRATION_ACTION", "TRANSFER_MONEY_FEATURE", "SHOP_AND_PAY_FEATURE", "FINISH_SETTING_UP_FEATURE", "COMMS_CELEBRATION_SCREEN_ID", "COMMS_CELEBRATION_ACTION", "TAP_TO_PAY_CELEBRATION_SCREEN_ID", "TAP_TO_PAY_CELEBRATION_ACTION", "TAP_TO_PAY_FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "LETS_GO_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getLETS_GO_ITEM", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "DISMISS_ITEM", "getDISMISS_ITEM", "CLOSE_ITEM", "getCLOSE_ITEM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CelebrationAnalyticsConstants {
    public static final int $stable;
    public static final java.lang.String COMMS_CELEBRATION_ACTION = "sheet_comms_success";
    public static final java.lang.String COMMS_CELEBRATION_SCREEN_ID = "setup_comms_success_sheet";
    public static final java.lang.String EXPLORE_CELEBRATION_ACTION = "explore_celebration";
    public static final java.lang.String EXPLORE_CELEBRATION_SCREEN_ID = "explore_celebration";
    public static final java.lang.String FINISH_SETTING_UP_FEATURE = "finish_setting_up";
    public static final java.lang.String SHOP_AND_PAY_FEATURE = "shop_and_pay";
    public static final java.lang.String SHOP_CELEBRATION_ACTION = "shop_celebration";
    public static final java.lang.String SHOP_CELEBRATION_SCREEN_ID = "shop_celebration";
    public static final java.lang.String TAP_TO_PAY_CELEBRATION_ACTION = "nfc_celebration";
    public static final java.lang.String TAP_TO_PAY_CELEBRATION_SCREEN_ID = "nfc_celebration";
    public static final java.lang.String TAP_TO_PAY_FEATURE = "nfc";
    public static final java.lang.String TRANSFER_CELEBRATION_ACTION = "transfer_celebration";
    public static final java.lang.String TRANSFER_CELEBRATION_SCREEN_ID = "transfer_celebration";
    public static final java.lang.String TRANSFER_MONEY_FEATURE = "transfer_money";
    public static final com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item LETS_GO_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("lets_go_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DISMISS_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("dismiss_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CLOSE_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null);

    private CelebrationAnalyticsConstants() {
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getLETS_GO_ITEM() {
        return LETS_GO_ITEM;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDISMISS_ITEM() {
        return DISMISS_ITEM;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_ITEM() {
        return CLOSE_ITEM;
    }
}
