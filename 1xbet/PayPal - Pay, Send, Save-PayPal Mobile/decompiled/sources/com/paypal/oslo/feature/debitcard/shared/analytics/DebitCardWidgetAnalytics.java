package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/DebitCardWidgetAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "action", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "ACTION_MANAGE", "Ljava/lang/String;", "ACTION_ENROLL", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "MODULE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getMODULE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "MANAGEMENT_WIDGET", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getMANAGEMENT_WIDGET", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "ACQUISITION_WIDGET", "getACQUISITION_WIDGET", "ERROR_WIDGET", "getERROR_WIDGET", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "APPLY_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getAPPLY_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "DID_NOT_GET_YOUR_CARD_LINK", "getDID_NOT_GET_YOUR_CARD_LINK", "ACTIVATE_BUTTON", "getACTIVATE_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWidgetAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION_ENROLL = "enroll";
    public static final java.lang.String ACTION_MANAGE = "manage";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardWidgetAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardWidgetAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_WIDGET, 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component MANAGEMENT_WIDGET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("debit_card_manage_widget", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component ACQUISITION_WIDGET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("debit_card_acquisition_widget", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component ERROR_WIDGET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("debit_card_error_widget", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item APPLY_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("apply_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DID_NOT_GET_YOUR_CARD_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("did_not_get_your_card_link", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ACTIVATE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("activate_button", 0, 2, null);

    private DebitCardWidgetAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), "debit_card", action);
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMODULE() {
        return MODULE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getMANAGEMENT_WIDGET() {
        return MANAGEMENT_WIDGET;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getACQUISITION_WIDGET() {
        return ACQUISITION_WIDGET;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getERROR_WIDGET() {
        return ERROR_WIDGET;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAPPLY_BUTTON() {
        return APPLY_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDID_NOT_GET_YOUR_CARD_LINK() {
        return DID_NOT_GET_YOUR_CARD_LINK;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getACTIVATE_BUTTON() {
        return ACTIVATE_BUTTON;
    }
}
