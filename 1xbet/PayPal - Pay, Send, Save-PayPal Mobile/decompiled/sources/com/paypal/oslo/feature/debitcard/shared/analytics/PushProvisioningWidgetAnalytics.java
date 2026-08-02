package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/PushProvisioningWidgetAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "COMPONENT_ID", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "COMPONENT_LOADING", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getCOMPONENT_LOADING", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "COMPONENT_ERROR", "getCOMPONENT_ERROR", "COMPONENT_SUCCESS", "getCOMPONENT_SUCCESS", "COMPONENT_ELIGIBLE", "getCOMPONENT_ELIGIBLE", "COMPONENT_INELIGIBLE", "getCOMPONENT_INELIGIBLE", "COMPONENT_MANAGE_WALLET", "getCOMPONENT_MANAGE_WALLET", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ADD_TO_WALLET_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getADD_TO_WALLET_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushProvisioningWidgetAnalytics {
    public static final java.lang.String ACTION = "widget";
    public static final java.lang.String COMPONENT_ID = "push_provisioning_widget";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component COMPONENT_LOADING = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("push_provisioning_widget_loading", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component COMPONENT_ERROR = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("push_provisioning_widget_error", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component COMPONENT_SUCCESS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("push_provisioning_widget_success", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component COMPONENT_ELIGIBLE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("push_provisioning_widget_eligible", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component COMPONENT_INELIGIBLE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("push_provisioning_widget_ineligible", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component COMPONENT_MANAGE_WALLET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("push_provisioning_widget_manage_wallet", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ADD_TO_WALLET_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_to_wallet_button", 0, 2, null);
    public static final int $stable = (((((com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable;

    private PushProvisioningWidgetAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCOMPONENT_LOADING() {
        return COMPONENT_LOADING;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCOMPONENT_ERROR() {
        return COMPONENT_ERROR;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCOMPONENT_SUCCESS() {
        return COMPONENT_SUCCESS;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCOMPONENT_ELIGIBLE() {
        return COMPONENT_ELIGIBLE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCOMPONENT_INELIGIBLE() {
        return COMPONENT_INELIGIBLE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCOMPONENT_MANAGE_WALLET() {
        return COMPONENT_MANAGE_WALLET;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getADD_TO_WALLET_BUTTON() {
        return ADD_TO_WALLET_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.PUSH_PROVISIONING_FEATURE, ACTION);
    }
}
