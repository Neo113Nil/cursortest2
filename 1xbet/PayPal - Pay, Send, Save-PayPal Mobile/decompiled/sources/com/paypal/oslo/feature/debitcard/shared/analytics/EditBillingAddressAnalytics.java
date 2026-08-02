package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/EditBillingAddressAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_ERROR", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "BILLING_ADDRESS_LIST", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getBILLING_ADDRESS_LIST", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "BILLING_ADDRESS_SELECTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getBILLING_ADDRESS_SELECTION", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "BILLING_ADDRESS_ADD_ADDRESS", "getBILLING_ADDRESS_ADD_ADDRESS", "BILLING_ADDRESS_SAVE_ADDRESS", "getBILLING_ADDRESS_SAVE_ADDRESS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EditBillingAddressAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION = "view";
    public static final java.lang.String SCREEN_ERROR = "edit_billing_address_bottom_sheet_error";
    public static final java.lang.String SCREEN_ID = "edit_billing_address_bottom_sheet";
    public static final java.lang.String SCREEN_LOADING = "edit_billing_address_bottom_sheet_loading";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.EditBillingAddressAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.EditBillingAddressAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module BILLING_ADDRESS_LIST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("billing_addresses_list", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BILLING_ADDRESS_SELECTION = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("billing_address_selection", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BILLING_ADDRESS_ADD_ADDRESS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("billing_address_add_a_new_address_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BILLING_ADDRESS_SAVE_ADDRESS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("billing_address_save_button", 0, 2, null);

    private EditBillingAddressAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.EDIT_BILLING_ADDRESS_FEATURE, "view");
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getBILLING_ADDRESS_LIST() {
        return BILLING_ADDRESS_LIST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBILLING_ADDRESS_SELECTION() {
        return BILLING_ADDRESS_SELECTION;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBILLING_ADDRESS_ADD_ADDRESS() {
        return BILLING_ADDRESS_ADD_ADDRESS;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBILLING_ADDRESS_SAVE_ADDRESS() {
        return BILLING_ADDRESS_SAVE_ADDRESS;
    }
}
