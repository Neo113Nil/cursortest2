package com.paypal.oslo.feature.revolvingcreditservicing.analytics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/analytics/AccountSummaryAnalyticsConstants;", "", "<init>", "()V", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Module, "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSummaryAnalyticsConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.analytics.AccountSummaryAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.analytics.AccountSummaryAnalyticsConstants();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/analytics/AccountSummaryAnalyticsConstants$Module;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getBALANCE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "SECONDARY_ACTIONS", "getSECONDARY_ACTIONS", "NEXT_BEST_ACTIONS", "getNEXT_BEST_ACTIONS", "ADD_TO_WALLET", "getADD_TO_WALLET", "REWARDS", "getREWARDS", "SPECIAL_FINANCING", "getSPECIAL_FINANCING", "RECENT_ACTIVITY", "getRECENT_ACTIVITY", "ACCOUNT_FEATURES", "getACCOUNT_FEATURES"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Module {
        public static final int $stable;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.analytics.AccountSummaryAnalyticsConstants.Module INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.analytics.AccountSummaryAnalyticsConstants.Module();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module BALANCE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("balance", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module SECONDARY_ACTIONS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("secondary_actions", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module NEXT_BEST_ACTIONS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("next_best_actions", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module ADD_TO_WALLET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("add_to_wallet", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module REWARDS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("rewards", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module SPECIAL_FINANCING = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("special_financing", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module RECENT_ACTIVITY = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.RecentActivityModule.NAME, 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module ACCOUNT_FEATURES = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("account_features", 0, null, null, 14, null);

        private Module() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getBALANCE() {
            return BALANCE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getSECONDARY_ACTIONS() {
            return SECONDARY_ACTIONS;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getNEXT_BEST_ACTIONS() {
            return NEXT_BEST_ACTIONS;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getADD_TO_WALLET() {
            return ADD_TO_WALLET;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getREWARDS() {
            return REWARDS;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getSPECIAL_FINANCING() {
            return SPECIAL_FINANCING;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getRECENT_ACTIVITY() {
            return RECENT_ACTIVITY;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getACCOUNT_FEATURES() {
            return ACCOUNT_FEATURES;
        }
    }

    private AccountSummaryAnalyticsConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/analytics/AccountSummaryAnalyticsConstants$Item;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "MAKE_PAYMENT_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getMAKE_PAYMENT_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "AUTOPAY", "getAUTOPAY", "SEE_ALL_ACTIVITY", "getSEE_ALL_ACTIVITY", "SEE_ALL_SPECIAL_FINANCING", "getSEE_ALL_SPECIAL_FINANCING", "SEE_ALL_ACCOUNT_FEATURES", "getSEE_ALL_ACCOUNT_FEATURES", "CASHBACK_REWARD", "getCASHBACK_REWARD", "ADD_TO_WALLET", "getADD_TO_WALLET"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item {
        public static final int $stable;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.analytics.AccountSummaryAnalyticsConstants.Item INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.analytics.AccountSummaryAnalyticsConstants.Item();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MAKE_PAYMENT_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("make_payment_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AUTOPAY = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("autopay", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SEE_ALL_ACTIVITY = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("see_all_activity", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SEE_ALL_SPECIAL_FINANCING = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("see_all_special_financing", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SEE_ALL_ACCOUNT_FEATURES = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("see_all_account_features", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CASHBACK_REWARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cashback_reward", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ADD_TO_WALLET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_to_wallet", 0, 2, null);

        private Item() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMAKE_PAYMENT_BUTTON() {
            return MAKE_PAYMENT_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAUTOPAY() {
            return AUTOPAY;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSEE_ALL_ACTIVITY() {
            return SEE_ALL_ACTIVITY;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSEE_ALL_SPECIAL_FINANCING() {
            return SEE_ALL_SPECIAL_FINANCING;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSEE_ALL_ACCOUNT_FEATURES() {
            return SEE_ALL_ACCOUNT_FEATURES;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCASHBACK_REWARD() {
            return CASHBACK_REWARD;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getADD_TO_WALLET() {
            return ADD_TO_WALLET;
        }
    }
}
