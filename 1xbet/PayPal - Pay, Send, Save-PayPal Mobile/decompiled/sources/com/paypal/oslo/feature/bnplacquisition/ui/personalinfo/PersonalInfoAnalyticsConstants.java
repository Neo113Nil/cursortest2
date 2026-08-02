package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoAnalyticsConstants;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CONTINUE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCONTINUE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoAnalyticsConstants {
    public static final java.lang.String ACTION = "enter_personal_info";
    public static final java.lang.String SCREEN_ID = "bnpl_appl_personal_info";
    public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAnalyticsConstants();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONTINUE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue_button", 0, 2, null);
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;

    private PersonalInfoAnalyticsConstants() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONTINUE_BUTTON() {
        return CONTINUE_BUTTON;
    }
}
