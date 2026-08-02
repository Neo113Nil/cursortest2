package com.paypal.oslo.feature.savings.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001:\u000e\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants;", "", "<init>", "()V", "", "PRODUCT", "Ljava/lang/String;", "FEATURE", "Hub", "AddMoney", "MoneyTransfer", "AutoSave", "Interest", "Education", "CreateGoal", "GoalDetails", "EditGoal", "TaxDocuments", "Onboarding", "SharedSheets", "ApiType", "ApiName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsAnalyticsConstants {
    public static final int $stable = 0;
    public static final java.lang.String FEATURE = "savings";
    public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants();
    public static final java.lang.String PRODUCT = "savings";

    private SavingsAnalyticsConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010!\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010'\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010)\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001a\u0010+\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u001a\u0010-\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u001a\u00100\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00104\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001a\u00106\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u001a\u00108\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u001a\u0010:\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103R\u001a\u0010<\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R\u001a\u0010>\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u00103R\u001a\u0010@\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u00103R\u001a\u0010B\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u00103R\u001a\u0010D\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\bE\u00103R\u001a\u0010F\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u00101\u001a\u0004\bG\u00103R\u001a\u0010H\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\bI\u00103R\u001a\u0010J\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bK\u00103"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$Hub;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_CONTENT", "SCREEN_ERROR_NETWORK", "SCREEN_ERROR_GRAPHQL", "SCREEN_ERROR_UNKNOWN", "SCREEN_EMPTY", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "BALANCE_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getBALANCE_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "GOALS_ZONE", "getGOALS_ZONE", "AUTOSAVE_ZONE", "getAUTOSAVE_ZONE", "SMART_ROUTE_ZONE", "getSMART_ROUTE_ZONE", "PROMO_ZONE", "getPROMO_ZONE", "INTEREST_EARNINGS_ZONE", "getINTEREST_EARNINGS_ZONE", "EDUCATION_ZONE", "getEDUCATION_ZONE", "DOCUMENT_ZONE", "getDOCUMENT_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "BALANCE_CARD", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getBALANCE_CARD", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "GOAL_CARD", "getGOAL_CARD", "PROMO_TILE", "getPROMO_TILE", "EDUCATION_TILE", "getEDUCATION_TILE", "INTEREST_EARNINGS_CARD", "getINTEREST_EARNINGS_CARD", "DOCUMENT_ITEM", "getDOCUMENT_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ADD_MONEY_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getADD_MONEY_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "TRANSFER_BUTTON", "getTRANSFER_BUTTON", "CREATE_GOAL_BUTTON", "getCREATE_GOAL_BUTTON", "SMART_ROUTE_ROW", "getSMART_ROUTE_ROW", "AUTOSAVE_ROW", "getAUTOSAVE_ROW", "GOAL_CARD_TAP", "getGOAL_CARD_TAP", "PROMO_TILE_TAP", "getPROMO_TILE_TAP", "PROMO_DISMISS_BUTTON", "getPROMO_DISMISS_BUTTON", "EDUCATION_TILE_TAP", "getEDUCATION_TILE_TAP", "INTEREST_CARD_TAP", "getINTEREST_CARD_TAP", "DOCUMENT_ITEM_TAP", "getDOCUMENT_ITEM_TAP", "RETRY_BUTTON", "getRETRY_BUTTON", "CLOSE_BUTTON", "getCLOSE_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Hub {
        public static final int $stable;
        public static final java.lang.String SCREEN_CONTENT = "savings_hub_content";
        public static final java.lang.String SCREEN_EMPTY = "savings_hub_empty";
        public static final java.lang.String SCREEN_ERROR_GRAPHQL = "savings_hub_error_graphql";
        public static final java.lang.String SCREEN_ERROR_NETWORK = "savings_hub_error_network";
        public static final java.lang.String SCREEN_ERROR_UNKNOWN = "savings_hub_error_unknown";
        public static final java.lang.String SCREEN_ID = "savings_hub";
        public static final java.lang.String SCREEN_LOADING = "savings_hub_loading";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module BALANCE_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("balance_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module GOALS_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("goals_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module AUTOSAVE_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("autosave_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module SMART_ROUTE_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("smart_route_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module PROMO_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("promo_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module INTEREST_EARNINGS_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("interest_earnings_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module EDUCATION_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("education_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module DOCUMENT_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("document_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component BALANCE_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt.TestTagBalanceCard, 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component GOAL_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("goal_card", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component PROMO_TILE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("promo_tile", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component EDUCATION_TILE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("education_tile", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component INTEREST_EARNINGS_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("interest_earnings_card", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component DOCUMENT_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("document_item", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ADD_MONEY_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_money_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TRANSFER_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("transfer_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CREATE_GOAL_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("create_goal_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SMART_ROUTE_ROW = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("smart_route_row", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AUTOSAVE_ROW = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("autosave_row", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item GOAL_CARD_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_card_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item PROMO_TILE_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("promo_tile_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item PROMO_DISMISS_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("promo_dismiss_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item EDUCATION_TILE_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("education_tile_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item INTEREST_CARD_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("interest_card_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DOCUMENT_ITEM_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("document_item_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item RETRY_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.ErrorScreen.RETRY_BUTTON, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CLOSE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null);

        private Hub() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getBALANCE_ZONE() {
            return BALANCE_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getGOALS_ZONE() {
            return GOALS_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getAUTOSAVE_ZONE() {
            return AUTOSAVE_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getSMART_ROUTE_ZONE() {
            return SMART_ROUTE_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getPROMO_ZONE() {
            return PROMO_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getINTEREST_EARNINGS_ZONE() {
            return INTEREST_EARNINGS_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getEDUCATION_ZONE() {
            return EDUCATION_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getDOCUMENT_ZONE() {
            return DOCUMENT_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getBALANCE_CARD() {
            return BALANCE_CARD;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getGOAL_CARD() {
            return GOAL_CARD;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getPROMO_TILE() {
            return PROMO_TILE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getEDUCATION_TILE() {
            return EDUCATION_TILE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getINTEREST_EARNINGS_CARD() {
            return INTEREST_EARNINGS_CARD;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getDOCUMENT_ITEM() {
            return DOCUMENT_ITEM;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getADD_MONEY_BUTTON() {
            return ADD_MONEY_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTRANSFER_BUTTON() {
            return TRANSFER_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCREATE_GOAL_BUTTON() {
            return CREATE_GOAL_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSMART_ROUTE_ROW() {
            return SMART_ROUTE_ROW;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAUTOSAVE_ROW() {
            return AUTOSAVE_ROW;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getGOAL_CARD_TAP() {
            return GOAL_CARD_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getPROMO_TILE_TAP() {
            return PROMO_TILE_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getPROMO_DISMISS_BUTTON() {
            return PROMO_DISMISS_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getEDUCATION_TILE_TAP() {
            return EDUCATION_TILE_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getINTEREST_CARD_TAP() {
            return INTEREST_CARD_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDOCUMENT_ITEM_TAP() {
            return DOCUMENT_ITEM_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getRETRY_BUTTON() {
            return RETRY_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_BUTTON() {
            return CLOSE_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001a\u0010\"\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001a\u0010&\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u001a\u0010)\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001a\u0010/\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u001a\u00101\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u001a\u00103\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R\u001a\u00105\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u001a\u00107\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010,R\u001a\u00109\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010,R\u001a\u0010;\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010,R\u001a\u0010=\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010*\u001a\u0004\b>\u0010,R\u001a\u0010?\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010*\u001a\u0004\b@\u0010,R\u001a\u0010A\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\bB\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$AddMoney;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_GOAL_SELECTION", "SCREEN_AMOUNT_INPUT", "SCREEN_REVIEW", "SCREEN_PROCESSING", "SCREEN_SUCCESS", "SCREEN_ERROR", "SCREEN_FI_LOADING", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "GOAL_SELECTION_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getGOAL_SELECTION_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "AMOUNT_INPUT_ZONE", "getAMOUNT_INPUT_ZONE", "FREQUENCY_ZONE", "getFREQUENCY_ZONE", "REVIEW_ZONE", "getREVIEW_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "GOAL_SELECTION_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getGOAL_SELECTION_ITEM", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "AMOUNT_CHIP", "getAMOUNT_CHIP", "CUSTOM_AMOUNT_DISPLAY", "getCUSTOM_AMOUNT_DISPLAY", "FREQUENCY_CARD", "getFREQUENCY_CARD", "FI_SELECTION_CARD", "getFI_SELECTION_CARD", "REVIEW_SUMMARY_CARD", "getREVIEW_SUMMARY_CARD", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "GOAL_SELECT_TAP", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getGOAL_SELECT_TAP", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "AMOUNT_10_CHIP", "getAMOUNT_10_CHIP", "AMOUNT_50_CHIP", "getAMOUNT_50_CHIP", "AMOUNT_150_CHIP", "getAMOUNT_150_CHIP", "AMOUNT_OTHER_CHIP", "getAMOUNT_OTHER_CHIP", "CUSTOM_AMOUNT_EDIT_BUTTON", "getCUSTOM_AMOUNT_EDIT_BUTTON", "FREQUENCY_CARD_TAP", "getFREQUENCY_CARD_TAP", "REVIEW_BUTTON", "getREVIEW_BUTTON", "CONFIRM_BUTTON", "getCONFIRM_BUTTON", "CANCEL_BUTTON", "getCANCEL_BUTTON", "FI_CHANGE_TAP", "getFI_CHANGE_TAP", "BACK_BUTTON", "getBACK_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AddMoney {
        public static final int $stable;
        public static final java.lang.String SCREEN_AMOUNT_INPUT = "savings_add_money_amount_input";
        public static final java.lang.String SCREEN_ERROR = "savings_add_money_error";
        public static final java.lang.String SCREEN_FI_LOADING = "savings_add_money_fi_loading";
        public static final java.lang.String SCREEN_GOAL_SELECTION = "savings_add_money_goal_selection";
        public static final java.lang.String SCREEN_ID = "savings_add_money";
        public static final java.lang.String SCREEN_PROCESSING = "savings_add_money_processing";
        public static final java.lang.String SCREEN_REVIEW = "savings_add_money_review";
        public static final java.lang.String SCREEN_SUCCESS = "savings_add_money_success";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AddMoney INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AddMoney();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module GOAL_SELECTION_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("goal_selection_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module AMOUNT_INPUT_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("amount_input_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module FREQUENCY_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("frequency_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module REVIEW_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("review_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component GOAL_SELECTION_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("goal_selection_item", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component AMOUNT_CHIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("amount_chip", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CUSTOM_AMOUNT_DISPLAY = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("custom_amount_display", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component FREQUENCY_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("frequency_card", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component FI_SELECTION_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("fi_selection_card", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component REVIEW_SUMMARY_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("review_summary_card", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item GOAL_SELECT_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_select_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_10_CHIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("amount_10_chip", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_50_CHIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("amount_50_chip", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_150_CHIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("amount_150_chip", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_OTHER_CHIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("amount_other_chip", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CUSTOM_AMOUNT_EDIT_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("custom_amount_edit_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FREQUENCY_CARD_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("frequency_card_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item REVIEW_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("review_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONFIRM_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt.TestTagConfirmButton, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CANCEL_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cancel_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FI_CHANGE_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("fi_change_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("back_button", 0, 2, null);

        private AddMoney() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getGOAL_SELECTION_ZONE() {
            return GOAL_SELECTION_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getAMOUNT_INPUT_ZONE() {
            return AMOUNT_INPUT_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getFREQUENCY_ZONE() {
            return FREQUENCY_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getREVIEW_ZONE() {
            return REVIEW_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getGOAL_SELECTION_ITEM() {
            return GOAL_SELECTION_ITEM;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getAMOUNT_CHIP() {
            return AMOUNT_CHIP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCUSTOM_AMOUNT_DISPLAY() {
            return CUSTOM_AMOUNT_DISPLAY;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getFREQUENCY_CARD() {
            return FREQUENCY_CARD;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getFI_SELECTION_CARD() {
            return FI_SELECTION_CARD;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getREVIEW_SUMMARY_CARD() {
            return REVIEW_SUMMARY_CARD;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getGOAL_SELECT_TAP() {
            return GOAL_SELECT_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_10_CHIP() {
            return AMOUNT_10_CHIP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_50_CHIP() {
            return AMOUNT_50_CHIP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_150_CHIP() {
            return AMOUNT_150_CHIP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_OTHER_CHIP() {
            return AMOUNT_OTHER_CHIP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCUSTOM_AMOUNT_EDIT_BUTTON() {
            return CUSTOM_AMOUNT_EDIT_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFREQUENCY_CARD_TAP() {
            return FREQUENCY_CARD_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getREVIEW_BUTTON() {
            return REVIEW_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONFIRM_BUTTON() {
            return CONFIRM_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCANCEL_BUTTON() {
            return CANCEL_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFI_CHANGE_TAP() {
            return FI_CHANGE_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
            return BACK_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$MoneyTransfer;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_GOAL_SELECTION", "SCREEN_AMOUNT_INPUT", "SCREEN_REVIEW", "SCREEN_PROCESSING", "SCREEN_SUCCESS", "SCREEN_ERROR", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "FROM_GOAL_SELECTOR", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getFROM_GOAL_SELECTOR", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "TO_GOAL_SELECTOR", "getTO_GOAL_SELECTOR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MoneyTransfer {
        public static final int $stable;
        public static final java.lang.String SCREEN_AMOUNT_INPUT = "savings_money_transfer_amount_input";
        public static final java.lang.String SCREEN_ERROR = "savings_money_transfer_error";
        public static final java.lang.String SCREEN_GOAL_SELECTION = "savings_money_transfer_goal_selection";
        public static final java.lang.String SCREEN_ID = "savings_money_transfer";
        public static final java.lang.String SCREEN_PROCESSING = "savings_money_transfer_processing";
        public static final java.lang.String SCREEN_REVIEW = "savings_money_transfer_review";
        public static final java.lang.String SCREEN_SUCCESS = "savings_money_transfer_success";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.MoneyTransfer INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.MoneyTransfer();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FROM_GOAL_SELECTOR = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("from_goal_selector", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TO_GOAL_SELECTOR = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("to_goal_selector", 0, 2, null);

        private MoneyTransfer() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFROM_GOAL_SELECTOR() {
            return FROM_GOAL_SELECTOR;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTO_GOAL_SELECTOR() {
            return TO_GOAL_SELECTOR;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b4\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001a\u0010\"\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u001a\u0010*\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b+\u0010\u0013R\u001a\u0010,\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013R\u001a\u0010.\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0011\u001a\u0004\b/\u0010\u0013R\u001a\u00100\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b1\u0010\u0013R\u001a\u00102\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u0010\u001dR\u001a\u00104\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\u001dR\u001a\u00106\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u001b\u001a\u0004\b7\u0010\u001dR\u001a\u00108\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u001b\u001a\u0004\b9\u0010\u001dR\u001a\u0010:\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u001b\u001a\u0004\b;\u0010\u001dR\u001a\u0010<\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u001b\u001a\u0004\b=\u0010\u001dR\u001a\u0010>\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u001b\u001a\u0004\b?\u0010\u001dR\u001a\u0010@\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u001b\u001a\u0004\bA\u0010\u001dR\u001a\u0010B\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010\u001b\u001a\u0004\bC\u0010\u001dR\u001a\u0010D\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u001b\u001a\u0004\bE\u0010\u001dR\u001a\u0010F\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u001b\u001a\u0004\bG\u0010\u001dR\u0014\u0010H\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\bH\u0010\u0006R\u0014\u0010I\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\bI\u0010\u0006R\u0014\u0010J\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\bJ\u0010\u0006R\u0014\u0010K\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\bK\u0010\u0006R\u0014\u0010L\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\bL\u0010\u0006R\u0014\u0010M\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\bM\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$AutoSave;", "", "<init>", "()V", "", "SCREEN_HALFSHEET", "Ljava/lang/String;", "SCREEN_HALFSHEET_LOADING", "SCREEN_HALFSHEET_CONTENT", "SCREEN_HALFSHEET_ERROR", "SCREEN_HALFSHEET_NO_GOALS", "SCREEN_FULLSCREEN", "SCREEN_FULLSCREEN_LOADING", "SCREEN_FULLSCREEN_CONTENT", "SCREEN_FULLSCREEN_ERROR", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "GOAL_LIST_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getGOAL_LIST_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "GOAL_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getGOAL_ITEM", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "SETUP_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getSETUP_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "MANAGE_BUTTON", "getMANAGE_BUTTON", "HALFSHEET_CLOSE", "getHALFSHEET_CLOSE", "HALFSHEET_RETRY", "getHALFSHEET_RETRY", "FULLSCREEN_CLOSE", "getFULLSCREEN_CLOSE", "SCREEN_MANAGE", "SCREEN_MANAGE_LOADING", "SCREEN_MANAGE_CONTENT", "SCREEN_MANAGE_ERROR", "MANAGE_AMOUNT_ZONE", "getMANAGE_AMOUNT_ZONE", "MANAGE_FREQUENCY_ZONE", "getMANAGE_FREQUENCY_ZONE", "MANAGE_FI_ZONE", "getMANAGE_FI_ZONE", "MANAGE_ACTIONS_ZONE", "getMANAGE_ACTIONS_ZONE", "MANAGE_AMOUNT_10_CHIP", "getMANAGE_AMOUNT_10_CHIP", "MANAGE_AMOUNT_50_CHIP", "getMANAGE_AMOUNT_50_CHIP", "MANAGE_AMOUNT_150_CHIP", "getMANAGE_AMOUNT_150_CHIP", "MANAGE_AMOUNT_OTHER_CHIP", "getMANAGE_AMOUNT_OTHER_CHIP", "MANAGE_CUSTOM_AMOUNT_EDIT", "getMANAGE_CUSTOM_AMOUNT_EDIT", "MANAGE_FREQUENCY_CARD_TAP", "getMANAGE_FREQUENCY_CARD_TAP", "MANAGE_FI_CARD_TAP", "getMANAGE_FI_CARD_TAP", "MANAGE_ADD_CARD_BUTTON", "getMANAGE_ADD_CARD_BUTTON", "MANAGE_UPDATE_BUTTON", "getMANAGE_UPDATE_BUTTON", "MANAGE_REMOVE_SCHEDULE_BUTTON", "getMANAGE_REMOVE_SCHEDULE_BUTTON", "MANAGE_BACK_BUTTON", "getMANAGE_BACK_BUTTON", "SCREEN_SETUP", "SCREEN_SETUP_AMOUNT_INPUT", "SCREEN_SETUP_REVIEW", "SCREEN_SETUP_PROCESSING", "SCREEN_SETUP_SUCCESS", "SCREEN_SETUP_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AutoSave {
        public static final int $stable;
        public static final java.lang.String SCREEN_FULLSCREEN = "savings_autosave_fullscreen";
        public static final java.lang.String SCREEN_FULLSCREEN_CONTENT = "savings_autosave_fullscreen_content";
        public static final java.lang.String SCREEN_FULLSCREEN_ERROR = "savings_autosave_fullscreen_error";
        public static final java.lang.String SCREEN_FULLSCREEN_LOADING = "savings_autosave_fullscreen_loading";
        public static final java.lang.String SCREEN_HALFSHEET = "savings_autosave_halfsheet";
        public static final java.lang.String SCREEN_HALFSHEET_CONTENT = "savings_autosave_halfsheet_content";
        public static final java.lang.String SCREEN_HALFSHEET_ERROR = "savings_autosave_halfsheet_error";
        public static final java.lang.String SCREEN_HALFSHEET_LOADING = "savings_autosave_halfsheet_loading";
        public static final java.lang.String SCREEN_HALFSHEET_NO_GOALS = "savings_autosave_halfsheet_no_goals";
        public static final java.lang.String SCREEN_MANAGE = "savings_autosave_manage";
        public static final java.lang.String SCREEN_MANAGE_CONTENT = "savings_autosave_manage_content";
        public static final java.lang.String SCREEN_MANAGE_ERROR = "savings_autosave_manage_error";
        public static final java.lang.String SCREEN_MANAGE_LOADING = "savings_autosave_manage_loading";
        public static final java.lang.String SCREEN_SETUP = "savings_autosave_setup";
        public static final java.lang.String SCREEN_SETUP_AMOUNT_INPUT = "savings_autosave_setup_amount_input";
        public static final java.lang.String SCREEN_SETUP_ERROR = "savings_autosave_setup_error";
        public static final java.lang.String SCREEN_SETUP_PROCESSING = "savings_autosave_setup_processing";
        public static final java.lang.String SCREEN_SETUP_REVIEW = "savings_autosave_setup_review";
        public static final java.lang.String SCREEN_SETUP_SUCCESS = "savings_autosave_setup_success";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module GOAL_LIST_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("autosave_goal_list_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component GOAL_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("autosave_goal_item", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SETUP_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("autosave_setup_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("autosave_manage_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item HALFSHEET_CLOSE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("autosave_halfsheet_close", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item HALFSHEET_RETRY = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("autosave_halfsheet_retry", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FULLSCREEN_CLOSE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("autosave_fullscreen_close", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MANAGE_AMOUNT_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("manage_amount_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MANAGE_FREQUENCY_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("manage_frequency_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MANAGE_FI_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("manage_fi_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MANAGE_ACTIONS_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("manage_actions_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_AMOUNT_10_CHIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_amount_10_chip", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_AMOUNT_50_CHIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_amount_50_chip", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_AMOUNT_150_CHIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_amount_150_chip", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_AMOUNT_OTHER_CHIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_amount_other_chip", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_CUSTOM_AMOUNT_EDIT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_custom_amount_edit", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_FREQUENCY_CARD_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_frequency_card_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_FI_CARD_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_fi_card_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_ADD_CARD_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_add_card_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_UPDATE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_update_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_REMOVE_SCHEDULE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_remove_schedule_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MANAGE_BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_back_button", 0, 2, null);

        private AutoSave() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getGOAL_LIST_ZONE() {
            return GOAL_LIST_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getGOAL_ITEM() {
            return GOAL_ITEM;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSETUP_BUTTON() {
            return SETUP_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_BUTTON() {
            return MANAGE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getHALFSHEET_CLOSE() {
            return HALFSHEET_CLOSE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getHALFSHEET_RETRY() {
            return HALFSHEET_RETRY;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFULLSCREEN_CLOSE() {
            return FULLSCREEN_CLOSE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMANAGE_AMOUNT_ZONE() {
            return MANAGE_AMOUNT_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMANAGE_FREQUENCY_ZONE() {
            return MANAGE_FREQUENCY_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMANAGE_FI_ZONE() {
            return MANAGE_FI_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMANAGE_ACTIONS_ZONE() {
            return MANAGE_ACTIONS_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_AMOUNT_10_CHIP() {
            return MANAGE_AMOUNT_10_CHIP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_AMOUNT_50_CHIP() {
            return MANAGE_AMOUNT_50_CHIP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_AMOUNT_150_CHIP() {
            return MANAGE_AMOUNT_150_CHIP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_AMOUNT_OTHER_CHIP() {
            return MANAGE_AMOUNT_OTHER_CHIP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_CUSTOM_AMOUNT_EDIT() {
            return MANAGE_CUSTOM_AMOUNT_EDIT;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_FREQUENCY_CARD_TAP() {
            return MANAGE_FREQUENCY_CARD_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_FI_CARD_TAP() {
            return MANAGE_FI_CARD_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_ADD_CARD_BUTTON() {
            return MANAGE_ADD_CARD_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_UPDATE_BUTTON() {
            return MANAGE_UPDATE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_REMOVE_SCHEDULE_BUTTON() {
            return MANAGE_REMOVE_SCHEDULE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMANAGE_BACK_BUTTON() {
            return MANAGE_BACK_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$Interest;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_CONTENT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "DETAIL_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getDETAIL_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "PENDING_CARD", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getPENDING_CARD", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "LIFETIME_CARD", "getLIFETIME_CARD", "APY_BADGE", "getAPY_BADGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Interest {
        public static final int $stable;
        public static final java.lang.String SCREEN_CONTENT = "savings_interest_earnings_content";
        public static final java.lang.String SCREEN_ID = "savings_interest_earnings";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Interest INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Interest();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module DETAIL_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("interest_detail_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component PENDING_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("interest_pending_card", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component LIFETIME_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("interest_lifetime_card", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component APY_BADGE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("interest_apy_badge", 0, null, null, 14, null);

        private Interest() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getDETAIL_ZONE() {
            return DETAIL_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getPENDING_CARD() {
            return PENDING_CARD;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getLIFETIME_CARD() {
            return LIFETIME_CARD;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getAPY_BADGE() {
            return APY_BADGE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$Education;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "CONTENT_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getCONTENT_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "BACK_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getBACK_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Education {
        public static final java.lang.String SCREEN_ID = "savings_education_details";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Education INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Education();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module CONTENT_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("education_content_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("education_back_button", 0, 2, null);
        public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;

        private Education() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getCONTENT_ZONE() {
            return CONTENT_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
            return BACK_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010 \u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001a\u0010$\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u001a\u0010&\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u001a\u0010(\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u001a\u0010*\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001bR\u001a\u0010,\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001bR\u001a\u0010.\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b/\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$CreateGoal;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_CONTENT", "SCREEN_REVIEW", "SCREEN_PROCESSING", "SCREEN_SUCCESS", "SCREEN_ERROR", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "NAME_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getNAME_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "TARGET_ZONE", "getTARGET_ZONE", "AMOUNT_ZONE", "getAMOUNT_ZONE", "FREQUENCY_ZONE", "getFREQUENCY_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "NAME_INPUT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getNAME_INPUT", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "TARGET_INPUT", "getTARGET_INPUT", "AMOUNT_10", "getAMOUNT_10", "AMOUNT_50", "getAMOUNT_50", "AMOUNT_150", "getAMOUNT_150", "AMOUNT_OTHER", "getAMOUNT_OTHER", "CUSTOM_AMOUNT_EDIT", "getCUSTOM_AMOUNT_EDIT", "FREQUENCY_TAP", "getFREQUENCY_TAP", "AUTOSAVE_INFO", "getAUTOSAVE_INFO", "REVIEW_BUTTON", "getREVIEW_BUTTON", "BACK_BUTTON", "getBACK_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreateGoal {
        public static final int $stable;
        public static final java.lang.String SCREEN_CONTENT = "savings_create_goal_content";
        public static final java.lang.String SCREEN_ERROR = "savings_create_goal_error";
        public static final java.lang.String SCREEN_ID = "savings_create_goal";
        public static final java.lang.String SCREEN_PROCESSING = "savings_create_goal_processing";
        public static final java.lang.String SCREEN_REVIEW = "savings_create_goal_review";
        public static final java.lang.String SCREEN_SUCCESS = "savings_create_goal_success";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.CreateGoal INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.CreateGoal();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module NAME_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("create_goal_name_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module TARGET_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("create_goal_target_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module AMOUNT_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("create_goal_amount_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module FREQUENCY_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("create_goal_frequency_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item NAME_INPUT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.CreateGoal.GOAL_NAME_INPUT, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TARGET_INPUT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("create_goal_target_input", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_10 = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("create_goal_amount_10", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_50 = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("create_goal_amount_50", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_150 = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("create_goal_amount_150", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_OTHER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("create_goal_amount_other", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CUSTOM_AMOUNT_EDIT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("create_goal_custom_amount_edit", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FREQUENCY_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("create_goal_frequency_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AUTOSAVE_INFO = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("create_goal_autosave_info", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item REVIEW_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.CreateGoal.REVIEW_BUTTON, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.CreateGoal.BACK_BUTTON, 0, 2, null);

        private CreateGoal() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getNAME_ZONE() {
            return NAME_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getTARGET_ZONE() {
            return TARGET_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getAMOUNT_ZONE() {
            return AMOUNT_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getFREQUENCY_ZONE() {
            return FREQUENCY_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getNAME_INPUT() {
            return NAME_INPUT;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTARGET_INPUT() {
            return TARGET_INPUT;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_10() {
            return AMOUNT_10;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_50() {
            return AMOUNT_50;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_150() {
            return AMOUNT_150;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_OTHER() {
            return AMOUNT_OTHER;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCUSTOM_AMOUNT_EDIT() {
            return CUSTOM_AMOUNT_EDIT;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFREQUENCY_TAP() {
            return FREQUENCY_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAUTOSAVE_INFO() {
            return AUTOSAVE_INFO;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getREVIEW_BUTTON() {
            return REVIEW_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
            return BACK_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0019\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010 \u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001a\u0010&\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001a\u0010(\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001a\u0010*\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001a\u0010,\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u001a\u0010.\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001a\u00100\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001a\u00102\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#R\u001a\u00104\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$GoalDetails;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_CONTENT", "SCREEN_ERROR", "SCREEN_SUCCESS_SHEET", "SCREEN_DELETE_DIALOG", "SCREEN_DELETE_ERROR_SHEET", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "PROGRESS_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getPROGRESS_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "ACTIONS_ZONE", "getACTIONS_ZONE", "ACTIVITY_ZONE", "getACTIVITY_ZONE", "INTEREST_ZONE", "getINTEREST_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "PROGRESS_CARD", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getPROGRESS_CARD", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "ACTIVITY_ITEM", "getACTIVITY_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ADD_MONEY_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getADD_MONEY_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "TRANSFER_BUTTON", "getTRANSFER_BUTTON", "EDIT_BUTTON", "getEDIT_BUTTON", "AUTOSAVE_BUTTON", "getAUTOSAVE_BUTTON", "DELETE_BUTTON", "getDELETE_BUTTON", "DELETE_CONFIRM", "getDELETE_CONFIRM", "DELETE_CANCEL", "getDELETE_CANCEL", "ACTIVITY_ITEM_TAP", "getACTIVITY_ITEM_TAP", "SUCCESS_SHEET_DISMISS", "getSUCCESS_SHEET_DISMISS", "BACK_BUTTON", "getBACK_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GoalDetails {
        public static final int $stable;
        public static final java.lang.String SCREEN_CONTENT = "savings_goal_details_content";
        public static final java.lang.String SCREEN_DELETE_DIALOG = "savings_goal_details_delete_dialog";
        public static final java.lang.String SCREEN_DELETE_ERROR_SHEET = "savings_goal_details_delete_error_sheet";
        public static final java.lang.String SCREEN_ERROR = "savings_goal_details_error";
        public static final java.lang.String SCREEN_ID = "savings_goal_details";
        public static final java.lang.String SCREEN_LOADING = "savings_goal_details_loading";
        public static final java.lang.String SCREEN_SUCCESS_SHEET = "savings_goal_details_success_sheet";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.GoalDetails INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.GoalDetails();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module PROGRESS_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("goal_progress_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module ACTIONS_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("goal_actions_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module ACTIVITY_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("goal_activity_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module INTEREST_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("goal_interest_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component PROGRESS_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("goal_progress_card", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component ACTIVITY_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("goal_activity_item", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ADD_MONEY_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_add_money_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TRANSFER_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_transfer_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item EDIT_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_edit_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AUTOSAVE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_autosave_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DELETE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_delete_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DELETE_CONFIRM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_delete_confirm", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DELETE_CANCEL = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_delete_cancel", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ACTIVITY_ITEM_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_activity_item_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SUCCESS_SHEET_DISMISS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_success_sheet_dismiss", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_back_button", 0, 2, null);

        private GoalDetails() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getPROGRESS_ZONE() {
            return PROGRESS_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getACTIONS_ZONE() {
            return ACTIONS_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getACTIVITY_ZONE() {
            return ACTIVITY_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getINTEREST_ZONE() {
            return INTEREST_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getPROGRESS_CARD() {
            return PROGRESS_CARD;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getACTIVITY_ITEM() {
            return ACTIVITY_ITEM;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getADD_MONEY_BUTTON() {
            return ADD_MONEY_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTRANSFER_BUTTON() {
            return TRANSFER_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getEDIT_BUTTON() {
            return EDIT_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAUTOSAVE_BUTTON() {
            return AUTOSAVE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDELETE_BUTTON() {
            return DELETE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDELETE_CONFIRM() {
            return DELETE_CONFIRM;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDELETE_CANCEL() {
            return DELETE_CANCEL;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getACTIVITY_ITEM_TAP() {
            return ACTIVITY_ITEM_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSUCCESS_SHEET_DISMISS() {
            return SUCCESS_SHEET_DISMISS;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
            return BACK_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0017\u0010\f\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$EditGoal;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_CONTENT", "SCREEN_PROCESSING", "SCREEN_SUCCESS", "SCREEN_ERROR", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "NAME_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getNAME_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "TARGET_ZONE", "getTARGET_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "NAME_INPUT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getNAME_INPUT", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "TARGET_INPUT", "getTARGET_INPUT", "SAVE_BUTTON", "getSAVE_BUTTON", "BACK_BUTTON", "getBACK_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EditGoal {
        public static final int $stable;
        public static final java.lang.String SCREEN_CONTENT = "savings_edit_goal_content";
        public static final java.lang.String SCREEN_ERROR = "savings_edit_goal_error";
        public static final java.lang.String SCREEN_ID = "savings_edit_goal";
        public static final java.lang.String SCREEN_PROCESSING = "savings_edit_goal_processing";
        public static final java.lang.String SCREEN_SUCCESS = "savings_edit_goal_success";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.EditGoal INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.EditGoal();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module NAME_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("edit_goal_name_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module TARGET_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("edit_goal_target_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item NAME_INPUT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.EditGoal.GOAL_NAME_INPUT, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TARGET_INPUT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("edit_goal_target_input", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SAVE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.EditGoal.SAVE_BUTTON, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.EditGoal.BACK_BUTTON, 0, 2, null);

        private EditGoal() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getNAME_ZONE() {
            return NAME_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getTARGET_ZONE() {
            return TARGET_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getNAME_INPUT() {
            return NAME_INPUT;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTARGET_INPUT() {
            return TARGET_INPUT;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSAVE_BUTTON() {
            return SAVE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
            return BACK_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$TaxDocuments;", "", "<init>", "()V", "", "SCREEN_TAX_PREFERENCE", "Ljava/lang/String;", "SCREEN_TAX_CONFIRM", "SCREEN_FDIC", "SCREEN_WEBVIEW", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "TAX_PREFERENCE_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getTAX_PREFERENCE_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "FDIC_SHEET_ZONE", "getFDIC_SHEET_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "TAX_ONLINE_RADIO", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getTAX_ONLINE_RADIO", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "TAX_MAIL_RADIO", "getTAX_MAIL_RADIO", "TAX_PREFERENCE_CONFIRM_BUTTON", "getTAX_PREFERENCE_CONFIRM_BUTTON", "TAX_PREFERENCE_DISMISS", "getTAX_PREFERENCE_DISMISS", "FDIC_AGREEMENT_LINK", "getFDIC_AGREEMENT_LINK", "FDIC_SHEET_DISMISS", "getFDIC_SHEET_DISMISS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TaxDocuments {
        public static final int $stable;
        public static final java.lang.String SCREEN_FDIC = "savings_fdic_sheet";
        public static final java.lang.String SCREEN_TAX_CONFIRM = "savings_tax_preference_confirm_sheet";
        public static final java.lang.String SCREEN_TAX_PREFERENCE = "savings_tax_preference_halfsheet";
        public static final java.lang.String SCREEN_WEBVIEW = "savings_webview";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.TaxDocuments INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.TaxDocuments();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module TAX_PREFERENCE_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("tax_preference_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module FDIC_SHEET_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("fdic_sheet_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TAX_ONLINE_RADIO = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("tax_online_radio", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TAX_MAIL_RADIO = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("tax_mail_radio", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TAX_PREFERENCE_CONFIRM_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.savings.ui.testtags.DocumentZoneTestTags.TaxPreference.CONFIRM_BUTTON, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TAX_PREFERENCE_DISMISS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("tax_preference_dismiss", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FDIC_AGREEMENT_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("fdic_agreement_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FDIC_SHEET_DISMISS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("fdic_sheet_dismiss", 0, 2, null);

        private TaxDocuments() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getTAX_PREFERENCE_ZONE() {
            return TAX_PREFERENCE_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getFDIC_SHEET_ZONE() {
            return FDIC_SHEET_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTAX_ONLINE_RADIO() {
            return TAX_ONLINE_RADIO;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTAX_MAIL_RADIO() {
            return TAX_MAIL_RADIO;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTAX_PREFERENCE_CONFIRM_BUTTON() {
            return TAX_PREFERENCE_CONFIRM_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTAX_PREFERENCE_DISMISS() {
            return TAX_PREFERENCE_DISMISS;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFDIC_AGREEMENT_LINK() {
            return FDIC_AGREEMENT_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFDIC_SHEET_DISMISS() {
            return FDIC_SHEET_DISMISS;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\"\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010(\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001a\u0010*\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u001a\u0010,\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u001a\u0010.\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u001a\u00100\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R\u001a\u00102\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010%R\u001a\u00104\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%R\u001a\u00106\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010%R\u001a\u00108\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010#\u001a\u0004\b9\u0010%R\u001a\u0010:\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010#\u001a\u0004\b;\u0010%R\u001a\u0010<\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010#\u001a\u0004\b=\u0010%R\u001a\u0010>\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010#\u001a\u0004\b?\u0010%R\u001a\u0010@\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010#\u001a\u0004\bA\u0010%R\u001a\u0010B\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010#\u001a\u0004\bC\u0010%R\u001a\u0010D\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010#\u001a\u0004\bE\u0010%R\u001a\u0010F\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010#\u001a\u0004\bG\u0010%R\u001a\u0010H\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010#\u001a\u0004\bI\u0010%R\u001a\u0010J\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010#\u001a\u0004\bK\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$Onboarding;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LANDING", "SCREEN_TERMS", "SCREEN_ADD_MONEY", "SCREEN_ADD_MONEY_LOADING", "SCREEN_ADD_MONEY_CONTENT", "SCREEN_SERVICE_UNAVAILABLE", "SCREEN_NETWORK_ERROR", "SCREEN_EMAIL_ERROR", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "CAROUSEL_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getCAROUSEL_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "FOOTER_ZONE", "getFOOTER_ZONE", "AMOUNT_ZONE", "getAMOUNT_ZONE", "FREQUENCY_ZONE", "getFREQUENCY_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "CAROUSEL_PAGE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getCAROUSEL_PAGE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "PAGINATION_DOTS", "getPAGINATION_DOTS", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "START_SAVING_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getSTART_SAVING_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "APY_LINK", "getAPY_LINK", "FDIC_LINK", "getFDIC_LINK", "FDIC_RATES_LINK", "getFDIC_RATES_LINK", "TERMS_ACCEPT_BUTTON", "getTERMS_ACCEPT_BUTTON", "SETUP_SAVINGS_BUTTON", "getSETUP_SAVINGS_BUTTON", "AMOUNT_10", "getAMOUNT_10", "AMOUNT_50", "getAMOUNT_50", "AMOUNT_150", "getAMOUNT_150", "AMOUNT_OTHER", "getAMOUNT_OTHER", "FREQUENCY_TAP", "getFREQUENCY_TAP", "EMAIL_ERROR_SETTINGS_BUTTON", "getEMAIL_ERROR_SETTINGS_BUTTON", "BACK_BUTTON", "getBACK_BUTTON", "TERMS_FDIC_INSURED_LINK", "getTERMS_FDIC_INSURED_LINK", "TERMS_FDIC_RATES_LINK", "getTERMS_FDIC_RATES_LINK", "TERMS_RATE_INFO_LINK", "getTERMS_RATE_INFO_LINK", "TERMS_E_DELIVERY_LINK", "getTERMS_E_DELIVERY_LINK", "TERMS_DEPOSIT_ACCOUNT_LINK", "getTERMS_DEPOSIT_ACCOUNT_LINK", "TERMS_PRIVACY_LINK", "getTERMS_PRIVACY_LINK", "WELCOME_BACK_BUTTON", "getWELCOME_BACK_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Onboarding {
        public static final int $stable;
        public static final java.lang.String SCREEN_ADD_MONEY = "savings_onboarding_add_money";
        public static final java.lang.String SCREEN_ADD_MONEY_CONTENT = "savings_onboarding_add_money_content";
        public static final java.lang.String SCREEN_ADD_MONEY_LOADING = "savings_onboarding_add_money_loading";
        public static final java.lang.String SCREEN_EMAIL_ERROR = "savings_onboarding_email_error";
        public static final java.lang.String SCREEN_ID = "savings_onboarding";
        public static final java.lang.String SCREEN_LANDING = "savings_onboarding_landing";
        public static final java.lang.String SCREEN_NETWORK_ERROR = "savings_onboarding_network_error";
        public static final java.lang.String SCREEN_SERVICE_UNAVAILABLE = "savings_onboarding_service_unavailable";
        public static final java.lang.String SCREEN_TERMS = "savings_onboarding_terms";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Onboarding INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Onboarding();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module CAROUSEL_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("onboarding_carousel_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module FOOTER_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("onboarding_footer_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module AMOUNT_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("onboarding_amount_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module FREQUENCY_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("onboarding_frequency_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CAROUSEL_PAGE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("onboarding_carousel_page", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component PAGINATION_DOTS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("onboarding_pagination_dots", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item START_SAVING_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_start_saving_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item APY_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_apy_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FDIC_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_fdic_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FDIC_RATES_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_fdic_rates_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TERMS_ACCEPT_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.savings.ui.testtags.OnboardingTestTags.Terms.ACCEPT_BUTTON, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SETUP_SAVINGS_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_setup_savings_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_10 = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_amount_10", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_50 = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_amount_50", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_150 = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_amount_150", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AMOUNT_OTHER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_amount_other", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FREQUENCY_TAP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_frequency_tap", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item EMAIL_ERROR_SETTINGS_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_email_error_settings_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.savings.ui.testtags.OnboardingTestTags.OnboardingScreen.BACK_BUTTON, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TERMS_FDIC_INSURED_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_terms_fdic_insured_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TERMS_FDIC_RATES_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_terms_fdic_rates_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TERMS_RATE_INFO_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_terms_rate_info_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TERMS_E_DELIVERY_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_terms_e_delivery_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TERMS_DEPOSIT_ACCOUNT_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_terms_deposit_account_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TERMS_PRIVACY_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("onboarding_terms_privacy_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item WELCOME_BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("savings_welcome_button", 0, 2, null);

        private Onboarding() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getCAROUSEL_ZONE() {
            return CAROUSEL_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getFOOTER_ZONE() {
            return FOOTER_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getAMOUNT_ZONE() {
            return AMOUNT_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getFREQUENCY_ZONE() {
            return FREQUENCY_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCAROUSEL_PAGE() {
            return CAROUSEL_PAGE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getPAGINATION_DOTS() {
            return PAGINATION_DOTS;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSTART_SAVING_BUTTON() {
            return START_SAVING_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAPY_LINK() {
            return APY_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFDIC_LINK() {
            return FDIC_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFDIC_RATES_LINK() {
            return FDIC_RATES_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTERMS_ACCEPT_BUTTON() {
            return TERMS_ACCEPT_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSETUP_SAVINGS_BUTTON() {
            return SETUP_SAVINGS_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_10() {
            return AMOUNT_10;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_50() {
            return AMOUNT_50;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_150() {
            return AMOUNT_150;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAMOUNT_OTHER() {
            return AMOUNT_OTHER;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFREQUENCY_TAP() {
            return FREQUENCY_TAP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getEMAIL_ERROR_SETTINGS_BUTTON() {
            return EMAIL_ERROR_SETTINGS_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
            return BACK_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTERMS_FDIC_INSURED_LINK() {
            return TERMS_FDIC_INSURED_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTERMS_FDIC_RATES_LINK() {
            return TERMS_FDIC_RATES_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTERMS_RATE_INFO_LINK() {
            return TERMS_RATE_INFO_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTERMS_E_DELIVERY_LINK() {
            return TERMS_E_DELIVERY_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTERMS_DEPOSIT_ACCOUNT_LINK() {
            return TERMS_DEPOSIT_ACCOUNT_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTERMS_PRIVACY_LINK() {
            return TERMS_PRIVACY_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getWELCOME_BACK_BUTTON() {
            return WELCOME_BACK_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013R\u001a\u0010\"\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013R\u001a\u0010$\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$SharedSheets;", "", "<init>", "()V", "", "SCREEN_FREQUENCY_SHEET", "Ljava/lang/String;", "SCREEN_FI_SELECTION_SHEET", "SCREEN_APY_INFO_SHEET", "SCREEN_GOAL_SUCCESS_SHEET", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "FI_SELECTION_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getFI_SELECTION_ITEM", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "FREQUENCY_ONETIME_OPTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getFREQUENCY_ONETIME_OPTION", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "FREQUENCY_WEEKLY_OPTION", "getFREQUENCY_WEEKLY_OPTION", "FREQUENCY_BIWEEKLY_OPTION", "getFREQUENCY_BIWEEKLY_OPTION", "FREQUENCY_MONTHLY_OPTION", "getFREQUENCY_MONTHLY_OPTION", "FI_ADD_CARD_BUTTON", "getFI_ADD_CARD_BUTTON", "FI_ADD_BANK_BUTTON", "getFI_ADD_BANK_BUTTON", "APY_AGREEMENT_LINK", "getAPY_AGREEMENT_LINK", "GOAL_SUCCESS_ADD_MONEY", "getGOAL_SUCCESS_ADD_MONEY", "GOAL_SUCCESS_MANAGE_AUTOSAVE", "getGOAL_SUCCESS_MANAGE_AUTOSAVE", "GOAL_SUCCESS_DISMISS", "getGOAL_SUCCESS_DISMISS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SharedSheets {
        public static final int $stable;
        public static final java.lang.String SCREEN_APY_INFO_SHEET = "apy_info_sheet";
        public static final java.lang.String SCREEN_FI_SELECTION_SHEET = "fi_selection_sheet";
        public static final java.lang.String SCREEN_FREQUENCY_SHEET = "frequency_sheet";
        public static final java.lang.String SCREEN_GOAL_SUCCESS_SHEET = "goal_success_sheet";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.SharedSheets INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.SharedSheets();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component FI_SELECTION_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("fi_selection_item", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FREQUENCY_ONETIME_OPTION = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("frequency_onetime_option", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FREQUENCY_WEEKLY_OPTION = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("frequency_weekly_option", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FREQUENCY_BIWEEKLY_OPTION = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("frequency_biweekly_option", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FREQUENCY_MONTHLY_OPTION = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("frequency_monthly_option", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FI_ADD_CARD_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("fi_add_card_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FI_ADD_BANK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("fi_add_bank_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item APY_AGREEMENT_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("apy_agreement_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item GOAL_SUCCESS_ADD_MONEY = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_success_add_money", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item GOAL_SUCCESS_MANAGE_AUTOSAVE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_success_manage_autosave", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item GOAL_SUCCESS_DISMISS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("goal_success_dismiss", 0, 2, null);

        private SharedSheets() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getFI_SELECTION_ITEM() {
            return FI_SELECTION_ITEM;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFREQUENCY_ONETIME_OPTION() {
            return FREQUENCY_ONETIME_OPTION;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFREQUENCY_WEEKLY_OPTION() {
            return FREQUENCY_WEEKLY_OPTION;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFREQUENCY_BIWEEKLY_OPTION() {
            return FREQUENCY_BIWEEKLY_OPTION;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFREQUENCY_MONTHLY_OPTION() {
            return FREQUENCY_MONTHLY_OPTION;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFI_ADD_CARD_BUTTON() {
            return FI_ADD_CARD_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFI_ADD_BANK_BUTTON() {
            return FI_ADD_BANK_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAPY_AGREEMENT_LINK() {
            return APY_AGREEMENT_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getGOAL_SUCCESS_ADD_MONEY() {
            return GOAL_SUCCESS_ADD_MONEY;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getGOAL_SUCCESS_MANAGE_AUTOSAVE() {
            return GOAL_SUCCESS_MANAGE_AUTOSAVE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getGOAL_SUCCESS_DISMISS() {
            return GOAL_SUCCESS_DISMISS;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$ApiType;", "", "<init>", "()V", "", "QUERY", "Ljava/lang/String;", "MUTATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ApiType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiType INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiType();
        public static final java.lang.String MUTATION = "mutation";
        public static final java.lang.String QUERY = "query";

        private ApiType() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/analytics/SavingsAnalyticsConstants$ApiName;", "", "<init>", "()V", "", "GET_SAVINGS_HUB_DATA", "Ljava/lang/String;", "GET_SAVINGS_PAYPAL_BALANCE", "GET_GOALS", "GET_SAVINGS_ACCOUNT", "GET_SAVINGS_ACCOUNT_ELIGIBILITY", "GET_SAVINGS_LANDING_PAGE_DATA", "GET_GOAL_SUCCESS_STATUS", "GET_DEPOSIT_OPTIONS", "TRANSFER_MONEYBOX", "TRANSFER_MONEYBOX_SCHEDULE", "CREATE_MONEYBOX", "UPDATE_MONEYBOX", "DELETE_MONEYBOX", "UPDATE_MONEYBOX_TRANSFER_SCHEDULE", "DELETE_MONEYBOX_TRANSFER_SCHEDULE", "UPDATE_SAVINGS_ACCOUNT_E1099", "UPDATE_GOAL_SUCCESS_SHOWN", "UPDATE_USER_CONSENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ApiName {
        public static final int $stable = 0;
        public static final java.lang.String CREATE_MONEYBOX = "create_moneybox";
        public static final java.lang.String DELETE_MONEYBOX = "delete_moneybox";
        public static final java.lang.String DELETE_MONEYBOX_TRANSFER_SCHEDULE = "delete_moneybox_transfer_schedule";
        public static final java.lang.String GET_DEPOSIT_OPTIONS = "get_deposit_options";
        public static final java.lang.String GET_GOALS = "get_goals";
        public static final java.lang.String GET_GOAL_SUCCESS_STATUS = "get_goal_success_status";
        public static final java.lang.String GET_SAVINGS_ACCOUNT = "get_savings_account";
        public static final java.lang.String GET_SAVINGS_ACCOUNT_ELIGIBILITY = "get_savings_account_eligibility";
        public static final java.lang.String GET_SAVINGS_HUB_DATA = "get_savings_hub_data";
        public static final java.lang.String GET_SAVINGS_LANDING_PAGE_DATA = "get_savings_landing_page_data";
        public static final java.lang.String GET_SAVINGS_PAYPAL_BALANCE = "get_savings_paypal_balance";
        public static final com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName INSTANCE = new com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName();
        public static final java.lang.String TRANSFER_MONEYBOX = "transfer_moneybox";
        public static final java.lang.String TRANSFER_MONEYBOX_SCHEDULE = "transfer_moneybox_schedule";
        public static final java.lang.String UPDATE_GOAL_SUCCESS_SHOWN = "update_goal_success_shown";
        public static final java.lang.String UPDATE_MONEYBOX = "update_moneybox";
        public static final java.lang.String UPDATE_MONEYBOX_TRANSFER_SCHEDULE = "update_moneybox_transfer_schedule";
        public static final java.lang.String UPDATE_SAVINGS_ACCOUNT_E1099 = "update_savings_account_e1099";
        public static final java.lang.String UPDATE_USER_CONSENT = "update_user_consent";

        private ApiName() {
        }
    }
}
