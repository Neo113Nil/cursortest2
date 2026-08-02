package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001f\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014R\u001a\u0010$\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010*\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001a\u0010,\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/ManageWalletAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_ERROR", "SCREEN_REMOVE_BOTTOM_SHEET", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "BACK_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getBACK_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "LOCK_WALLET_TOGGLE", "getLOCK_WALLET_TOGGLE", "UNLOCK_WALLET_TOGGLE", "getUNLOCK_WALLET_TOGGLE", "REMOVE_WALLET_BUTTON", "getREMOVE_WALLET_BUTTON", "CONFIRM_REMOVE_BUTTON", "getCONFIRM_REMOVE_BUTTON", "CANCEL_REMOVE_BUTTON", "getCANCEL_REMOVE_BUTTON", "CLOSE_REMOVE_BUTTON", "getCLOSE_REMOVE_BUTTON", "FINISH_CONFIRMATION_BUTTON", "getFINISH_CONFIRMATION_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "WALLET_LOCKED_SUCCESS_TOAST", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getWALLET_LOCKED_SUCCESS_TOAST", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "WALLET_UNLOCKED_SUCCESS_TOAST", "getWALLET_UNLOCKED_SUCCESS_TOAST", "WALLET_REMOVED_SUCCESS_TOAST", "getWALLET_REMOVED_SUCCESS_TOAST", "UNKNOWN_TOAST", "getUNKNOWN_TOAST"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageWalletAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION = "manage";
    public static final java.lang.String SCREEN_ERROR = "debit_card_manage_wallet_error";
    public static final java.lang.String SCREEN_ID = "debit_card_manage_wallet";
    public static final java.lang.String SCREEN_LOADING = "debit_card_manage_wallet_loading";
    public static final java.lang.String SCREEN_REMOVE_BOTTOM_SHEET = "debit_card_manage_wallet_remove_bottom_sheet";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("back_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item LOCK_WALLET_TOGGLE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("lock_wallet_toggle", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item UNLOCK_WALLET_TOGGLE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("unlock_wallet_toggle", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item REMOVE_WALLET_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("remove_wallet_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONFIRM_REMOVE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("confirm_remove_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CANCEL_REMOVE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cancel_remove_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CLOSE_REMOVE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_remove_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FINISH_CONFIRMATION_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("finish_confirmation_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component WALLET_LOCKED_SUCCESS_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("wallet_locked_success_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component WALLET_UNLOCKED_SUCCESS_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("wallet_unlocked_success_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component WALLET_REMOVED_SUCCESS_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("wallet_removed_success_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component UNKNOWN_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("unknown_toast", 0, null, null, 14, null);

    private ManageWalletAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.MANAGE_WALLET_FEATURE, "manage");
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
        return BACK_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getLOCK_WALLET_TOGGLE() {
        return LOCK_WALLET_TOGGLE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getUNLOCK_WALLET_TOGGLE() {
        return UNLOCK_WALLET_TOGGLE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getREMOVE_WALLET_BUTTON() {
        return REMOVE_WALLET_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONFIRM_REMOVE_BUTTON() {
        return CONFIRM_REMOVE_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCANCEL_REMOVE_BUTTON() {
        return CANCEL_REMOVE_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_REMOVE_BUTTON() {
        return CLOSE_REMOVE_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFINISH_CONFIRMATION_BUTTON() {
        return FINISH_CONFIRMATION_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getWALLET_LOCKED_SUCCESS_TOAST() {
        return WALLET_LOCKED_SUCCESS_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getWALLET_UNLOCKED_SUCCESS_TOAST() {
        return WALLET_UNLOCKED_SUCCESS_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getWALLET_REMOVED_SUCCESS_TOAST() {
        return WALLET_REMOVED_SUCCESS_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getUNKNOWN_TOAST() {
        return UNKNOWN_TOAST;
    }
}
