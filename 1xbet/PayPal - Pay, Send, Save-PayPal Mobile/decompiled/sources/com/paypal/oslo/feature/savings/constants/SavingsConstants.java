package com.paypal.oslo.feature.savings.constants;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants;", "", "<init>", "()V", "Analytics", "RemoteConfig", "ComponentNames", "StateNames", "IntentNames", "EffectNames", "GoalCategories", "MoneyboxDefaults", "PromoZoneConstants", "AccessibilityTags", "GraphQLOperation", "DateFormatting", "Currency", "DocumentUrls", "FinancialInstrument", "Goals", "GraphQLOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.constants.SavingsConstants INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants();

    private SavingsConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$Analytics;", "", "<init>", "()V", "", "SOURCE", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Analytics {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.Analytics INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.Analytics();
        public static final java.lang.String SOURCE = "savings";

        private Analytics() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$RemoteConfig;", "", "<init>", "()V", "", "DOMAIN", "Ljava/lang/String;", "KEY_NAME", "ADD_MONEY_KEY_NAME", "TRANSFER_MONEY_KEY_NAME", "AUTO_SAVE_KEY_NAME", "HYS_ONBOARDING_KEY_NAME", "BALANCE_L2_SMART_ROUTE_KEY_NAME", "HYS_BETA_DISCLOSURE_KEY_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RemoteConfig {
        public static final int $stable = 0;
        public static final java.lang.String ADD_MONEY_KEY_NAME = "savings_add_money";
        public static final java.lang.String AUTO_SAVE_KEY_NAME = "savings_auto_save";
        public static final java.lang.String BALANCE_L2_SMART_ROUTE_KEY_NAME = "balance_l2_smart_route";
        public static final java.lang.String DOMAIN = "money_management";
        public static final java.lang.String HYS_BETA_DISCLOSURE_KEY_NAME = "hys_beta_disclosure";
        public static final java.lang.String HYS_ONBOARDING_KEY_NAME = "hys_onboarding_enabled";
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.RemoteConfig INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.RemoteConfig();
        public static final java.lang.String KEY_NAME = "savings";
        public static final java.lang.String TRANSFER_MONEY_KEY_NAME = "savings_transfer_money";

        private RemoteConfig() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$ComponentNames;", "", "<init>", "()V", "", "SAVINGS_HOME_VIEWMODEL_STORE", "Ljava/lang/String;", "SAVINGS_HOME_REDUCER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ComponentNames {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.ComponentNames INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.ComponentNames();
        public static final java.lang.String SAVINGS_HOME_REDUCER = "SavingsHomeReducer";
        public static final java.lang.String SAVINGS_HOME_VIEWMODEL_STORE = "SavingsHomeViewModel.store";

        private ComponentNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$StateNames;", "", "<init>", "()V", "", "STATE_INITIAL", "Ljava/lang/String;", "STATE_LOADING", "STATE_SUCCESS", "STATE_ERROR", "STATE_ERROR_NETWORK", "STATE_ERROR_GRAPHQL", "STATE_ERROR_UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StateNames {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.StateNames INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.StateNames();
        public static final java.lang.String STATE_ERROR = "Error";
        public static final java.lang.String STATE_ERROR_GRAPHQL = "Error.GraphQL";
        public static final java.lang.String STATE_ERROR_NETWORK = "Error.Network";
        public static final java.lang.String STATE_ERROR_UNKNOWN = "Error.Unknown";
        public static final java.lang.String STATE_INITIAL = "Initial";
        public static final java.lang.String STATE_LOADING = "Loading";
        public static final java.lang.String STATE_SUCCESS = "Success";

        private StateNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$IntentNames;", "", "<init>", "()V", "", "INTENT_INITIALIZE", "Ljava/lang/String;", "INTENT_FEATURE_AVAILABILITY_RESULT", "INTENT_ERROR", "INTENT_ERROR_NETWORK", "INTENT_ERROR_GRAPHQL", "INTENT_ERROR_UNKNOWN", "INTENT_RETRY_REQUESTED", "INTENT_TRANSFER_CLICKED", "INTENT_ADD_MONEY_CLICKED", "INTENT_ADD_MONEY_GENERAL_SAVINGS_CLICKED", "INTENT_NAVIGATE_TO_ADD_MONEY_WITH_FI_TYPE", "INTENT_SMART_ROUTE_CLICKED", "INTENT_AUTO_SAVE_CLICKED", "INTENT_NAVIGATE_TO_AUTO_SAVE_MANAGE", "INTENT_INTEREST_EARNINGS_CLICKED", "INTENT_CREATE_GOAL_CLICKED", "INTENT_GOAL_CLICKED", "INTENT_EDUCATIONAL_TILE_CLICKED", "INTENT_SAVINGS_STATEMENTS_CLICKED", "INTENT_FDIC_INSURANCE_CLICKED", "INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_CLICKED", "INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_CONFIRMED", "INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_UPDATE_SUCCESS", "INTENT_PROMO_TILE_DISMISSED", "INTENT_MONEY_MANAGEMENT_SUCCESS", "INTENT_AUTO_SAVE_SUCCESS", "INTENT_AUTO_SAVE_ERROR", "INTENT_DELETE_GOAL_SUCCESS", "INTENT_TILE_RETRY_REQUESTED", "INTENT_CLEAR_GOAL_SUCCESS_SHEET", "INTENT_AUTO_SHOW_TAX_PREFERENCE_PROMPT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IntentNames {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames();
        public static final java.lang.String INTENT_ADD_MONEY_CLICKED = "AddMoneyClicked";
        public static final java.lang.String INTENT_ADD_MONEY_GENERAL_SAVINGS_CLICKED = "AddMoneyGeneralSavingsClicked";
        public static final java.lang.String INTENT_AUTO_SAVE_CLICKED = "AutoSaveClicked";
        public static final java.lang.String INTENT_AUTO_SAVE_ERROR = "AutoSaveError";
        public static final java.lang.String INTENT_AUTO_SAVE_SUCCESS = "AutoSaveSuccess";
        public static final java.lang.String INTENT_AUTO_SHOW_TAX_PREFERENCE_PROMPT = "AutoShowTaxPreferencePrompt";
        public static final java.lang.String INTENT_CLEAR_GOAL_SUCCESS_SHEET = "ClearGoalForSuccessSheet";
        public static final java.lang.String INTENT_CREATE_GOAL_CLICKED = "CreateGoalClicked";
        public static final java.lang.String INTENT_DELETE_GOAL_SUCCESS = "DeleteGoalSuccess";
        public static final java.lang.String INTENT_EDUCATIONAL_TILE_CLICKED = "EducationalTileClicked";
        public static final java.lang.String INTENT_ERROR = "Error";
        public static final java.lang.String INTENT_ERROR_GRAPHQL = "Error.GraphQL";
        public static final java.lang.String INTENT_ERROR_NETWORK = "Error.Network";
        public static final java.lang.String INTENT_ERROR_UNKNOWN = "Error.Unknown";
        public static final java.lang.String INTENT_FDIC_INSURANCE_CLICKED = "FdicInsuranceClicked";
        public static final java.lang.String INTENT_FEATURE_AVAILABILITY_RESULT = "FeatureAvailabilityResult";
        public static final java.lang.String INTENT_GOAL_CLICKED = "GoalClicked";
        public static final java.lang.String INTENT_INITIALIZE = "Initialize";
        public static final java.lang.String INTENT_INTEREST_EARNINGS_CLICKED = "InterestEarningsClicked";
        public static final java.lang.String INTENT_MONEY_MANAGEMENT_SUCCESS = "MoneyManagementSuccess";
        public static final java.lang.String INTENT_NAVIGATE_TO_ADD_MONEY_WITH_FI_TYPE = "NavigateToAddMoneyWithFiType";
        public static final java.lang.String INTENT_NAVIGATE_TO_AUTO_SAVE_MANAGE = "NavigateToAutoSaveManage";
        public static final java.lang.String INTENT_PROMO_TILE_DISMISSED = "PromoTileDismissed";
        public static final java.lang.String INTENT_RETRY_REQUESTED = "RetryRequested";
        public static final java.lang.String INTENT_SAVINGS_STATEMENTS_CLICKED = "SavingsStatementsClicked";
        public static final java.lang.String INTENT_SMART_ROUTE_CLICKED = "SmartRouteClicked";
        public static final java.lang.String INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_CLICKED = "TaxStatementDeliveryPreferenceClicked";
        public static final java.lang.String INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_CONFIRMED = "TaxStatementDeliveryPreferenceConfirmed";
        public static final java.lang.String INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_UPDATE_SUCCESS = "TaxStatementDeliveryPreferenceUpdateSuccess";
        public static final java.lang.String INTENT_TILE_RETRY_REQUESTED = "TileRetryRequested";
        public static final java.lang.String INTENT_TRANSFER_CLICKED = "TransferClicked";

        private IntentNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$EffectNames;", "", "<init>", "()V", "", "EFFECT_SHOW_TOAST", "Ljava/lang/String;", "EFFECT_NAVIGATE_TO_TRANSFER_MONEY", "EFFECT_NAVIGATE_TO_ADD_MONEY", "EFFECT_NAVIGATE_TO_ADD_MONEY_GENERAL_SAVINGS", "EFFECT_NAVIGATE_TO_ADD_MONEY_WITH_FI_TYPE", "EFFECT_NAVIGATE_TO_SMART_ROUTE", "EFFECT_NAVIGATE_TO_AUTO_SAVE", "EFFECT_NAVIGATE_TO_AUTO_SAVE_MANAGE", "EFFECT_NAVIGATE_TO_INTEREST_EARNINGS", "EFFECT_NAVIGATE_TO_CREATE_GOAL", "EFFECT_NAVIGATE_TO_GOAL_DETAILS", "EFFECT_NAVIGATE_TO_EDUCATIONAL_DETAILS", "EFFECT_SHOW_SAVINGS_STATEMENTS_INFO", "EFFECT_SHOW_FDIC_INSURANCE", "EFFECT_SHOW_TAX_STATEMENT_DELIVERY_PREFERENCE", "EFFECT_TRIGGER_TILE_RETRY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EffectNames {
        public static final int $stable = 0;
        public static final java.lang.String EFFECT_NAVIGATE_TO_ADD_MONEY = "NavigateToAddMoney";
        public static final java.lang.String EFFECT_NAVIGATE_TO_ADD_MONEY_GENERAL_SAVINGS = "NavigateToAddMoneyGeneralSavings";
        public static final java.lang.String EFFECT_NAVIGATE_TO_ADD_MONEY_WITH_FI_TYPE = "NavigateToAddMoneyWithFiType";
        public static final java.lang.String EFFECT_NAVIGATE_TO_AUTO_SAVE = "NavigateToAutoSave";
        public static final java.lang.String EFFECT_NAVIGATE_TO_AUTO_SAVE_MANAGE = "NavigateToAutoSaveManage";
        public static final java.lang.String EFFECT_NAVIGATE_TO_CREATE_GOAL = "NavigateToCreateGoal";
        public static final java.lang.String EFFECT_NAVIGATE_TO_EDUCATIONAL_DETAILS = "NavigateToEducationalDetails";
        public static final java.lang.String EFFECT_NAVIGATE_TO_GOAL_DETAILS = "NavigateToGoalDetails";
        public static final java.lang.String EFFECT_NAVIGATE_TO_INTEREST_EARNINGS = "NavigateToInterestEarnings";
        public static final java.lang.String EFFECT_NAVIGATE_TO_SMART_ROUTE = "NavigateToSmartRoute";
        public static final java.lang.String EFFECT_NAVIGATE_TO_TRANSFER_MONEY = "NavigateToTransferMoney";
        public static final java.lang.String EFFECT_SHOW_FDIC_INSURANCE = "ShowFdicInsurance";
        public static final java.lang.String EFFECT_SHOW_SAVINGS_STATEMENTS_INFO = "ShowSavingsStatementsInfo";
        public static final java.lang.String EFFECT_SHOW_TAX_STATEMENT_DELIVERY_PREFERENCE = "ShowTaxStatementDeliveryPreference";
        public static final java.lang.String EFFECT_SHOW_TOAST = "ShowToast";
        public static final java.lang.String EFFECT_TRIGGER_TILE_RETRY = "TriggerTileRetry";
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames();

        private EffectNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$GoalCategories;", "", "<init>", "()V", "", com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_NON_GOAL, "Ljava/lang/String;", com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_GOAL, "", "SAVINGS_GOAL_TYPES", "Ljava/util/List;", "getSAVINGS_GOAL_TYPES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GoalCategories {
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories();
        public static final java.lang.String SAVINGS_NON_GOAL = "SAVINGS_NON_GOAL";
        public static final java.lang.String SAVINGS_GOAL = "SAVINGS_GOAL";
        private static final java.util.List<java.lang.String> SAVINGS_GOAL_TYPES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{SAVINGS_NON_GOAL, SAVINGS_GOAL});
        public static final int $stable = 8;

        private GoalCategories() {
        }

        public final java.util.List<java.lang.String> getSAVINGS_GOAL_TYPES() {
            return SAVINGS_GOAL_TYPES;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$MoneyboxDefaults;", "", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "DEFAULT_CATEGORY", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "getDEFAULT_CATEGORY", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;", "DEFAULT_TYPE", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;", "getDEFAULT_TYPE", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MoneyboxDefaults {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.MoneyboxDefaults INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.MoneyboxDefaults();
        private static final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory DEFAULT_CATEGORY = com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.SAVINGS_GOAL;
        private static final com.paypal.oslo.api.graphql.schema.type.MoneyboxType DEFAULT_TYPE = com.paypal.oslo.api.graphql.schema.type.MoneyboxType.SAVING;

        private MoneyboxDefaults() {
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory getDEFAULT_CATEGORY() {
            return DEFAULT_CATEGORY;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxType getDEFAULT_TYPE() {
            return DEFAULT_TYPE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$PromoZoneConstants;", "", "<init>", "()V", "Destinations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PromoZoneConstants {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.PromoZoneConstants INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.PromoZoneConstants();

        private PromoZoneConstants() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$PromoZoneConstants$Destinations;", "", "<init>", "()V", "", "SMARTROUTE", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Destinations {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.PromoZoneConstants.Destinations INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.PromoZoneConstants.Destinations();
            public static final java.lang.String SMARTROUTE = "smartroute";

            private Destinations() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$AccessibilityTags;", "", "<init>", "()V", "MoneyManagement"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AccessibilityTags {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.AccessibilityTags INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.AccessibilityTags();

        private AccessibilityTags() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$AccessibilityTags$MoneyManagement;", "", "<init>", "()V", "", "HEADER", "Ljava/lang/String;", "GOAL_TITLE", "AVAILABLE_AMOUNT", "CUSTOM_AMOUNT_INPUT", "AMOUNT_DISPLAY", "NUMERIC_KEYPAD", "QUICK_AMOUNT_SELECTOR", "FREQUENCY_SELECTOR", "AUTO_SAVE_INFO", "AUTO_SAVE_INFO_SHEET", "FOOTER", "REVIEW_BUTTON", "VALIDATION_ALERT"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class MoneyManagement {
            public static final int $stable = 0;
            public static final java.lang.String AMOUNT_DISPLAY = "money_management_amount_display";
            public static final java.lang.String AUTO_SAVE_INFO = "money_management_auto_save_info";
            public static final java.lang.String AUTO_SAVE_INFO_SHEET = "money_management_auto_save_info_sheet";
            public static final java.lang.String AVAILABLE_AMOUNT = "money_management_available_amount";
            public static final java.lang.String CUSTOM_AMOUNT_INPUT = "money_management_custom_amount_input";
            public static final java.lang.String FOOTER = "money_management_footer";
            public static final java.lang.String FREQUENCY_SELECTOR = "money_management_frequency_selector";
            public static final java.lang.String GOAL_TITLE = "money_management_goal_title";
            public static final java.lang.String HEADER = "money_management_header";
            public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.AccessibilityTags.MoneyManagement INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.AccessibilityTags.MoneyManagement();
            public static final java.lang.String NUMERIC_KEYPAD = "money_management_numeric_keypad";
            public static final java.lang.String QUICK_AMOUNT_SELECTOR = "money_management_quick_amount_selector";
            public static final java.lang.String REVIEW_BUTTON = "money_management_review_button";
            public static final java.lang.String VALIDATION_ALERT = "money_management_validation_alert";

            private MoneyManagement() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$GraphQLOperation;", "", "", "source", "operationName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$GraphQLOperation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource", "getOperationName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GraphQLOperation {
        public static final int $stable = 0;
        private final java.lang.String operationName;
        private final java.lang.String source;

        public GraphQLOperation(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.source = str;
            this.operationName = str2;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String getOperationName() {
            return this.operationName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.source;
            java.lang.String str2 = this.operationName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLOperation(source=");
            sb.append(str);
            sb.append(", operationName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.source.hashCode() * 31) + this.operationName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation)) {
                return false;
            }
            com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation graphQLOperation = (com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.source, graphQLOperation.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.operationName, graphQLOperation.operationName);
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation copy(java.lang.String source, java.lang.String operationName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
            return new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(source, operationName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getOperationName() {
            return this.operationName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation copy$default(com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation graphQLOperation, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = graphQLOperation.source;
            }
            if ((i & 2) != 0) {
                str2 = graphQLOperation.operationName;
            }
            return graphQLOperation.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$DateFormatting;", "", "<init>", "()V", "", "ISO_DATE_FORMAT", "Ljava/lang/String;", "DATE_DISPLAY_FORMAT", "DATE_INPUT_FORMAT", "WEEKDAY_FORMAT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DateFormatting {
        public static final int $stable = 0;
        public static final java.lang.String DATE_DISPLAY_FORMAT = "MMMM d, yyyy";
        public static final java.lang.String DATE_INPUT_FORMAT = "MM/dd/yyyy";
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.DateFormatting INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.DateFormatting();
        public static final java.lang.String ISO_DATE_FORMAT = "yyyy-MM-dd";
        public static final java.lang.String WEEKDAY_FORMAT = "EEEE";

        private DateFormatting() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$Currency;", "", "<init>", "()V", "", "USD", "Ljava/lang/String;", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "GBP", "SYMBOL_USD", "SYMBOL_EUR", "SYMBOL_GBP", "FORMAT_TWO_DECIMALS", "FORMAT_CURRENCY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Currency {
        public static final int $stable = 0;
        public static final java.lang.String EUR = "EUR";
        public static final java.lang.String FORMAT_CURRENCY = "%s%.2f";
        public static final java.lang.String FORMAT_TWO_DECIMALS = "%.2f";
        public static final java.lang.String GBP = "GBP";
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency();
        public static final java.lang.String SYMBOL_EUR = "€";
        public static final java.lang.String SYMBOL_GBP = "£";
        public static final java.lang.String SYMBOL_USD = "$";
        public static final java.lang.String USD = "USD";

        private Currency() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$DocumentUrls;", "", "<init>", "()V", "", "SYNCHRONY_ACCOUNT_AGREEMENT", "Ljava/lang/String;", "PAYPAL_USER_AGREEMENT", "FDIC_NATIONAL_RATES", "SYNCHRONY_E_DELIVERY_TERMS", "SYNCHRONY_PRIVACY_POLICY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DocumentUrls {
        public static final int $stable = 0;
        public static final java.lang.String FDIC_NATIONAL_RATES = "https://www.fdic.gov/national-rates-and-rate-caps";
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.DocumentUrls INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.DocumentUrls();
        public static final java.lang.String PAYPAL_USER_AGREEMENT = "https://www.paypal.com/us/legalhub/paypal/useragreement-full";
        public static final java.lang.String SYNCHRONY_ACCOUNT_AGREEMENT = "https://www.paypalobjects.com/marketing/ua/pdf/US/en/synchrony-acct-agreement.pdf";
        public static final java.lang.String SYNCHRONY_E_DELIVERY_TERMS = "https://www.paypalobjects.com/marketing/ua/pdf/US/en/synchrony-e-delivery-terms.pdf";
        public static final java.lang.String SYNCHRONY_PRIVACY_POLICY = "https://www.paypalobjects.com/marketing/ua/pdf/US/en/synchrony-privacy-policy.pdf";

        private DocumentUrls() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$FinancialInstrument;", "", "<init>", "()V", "", "FI_FALLBACK_IMAGE_URL", "Ljava/lang/String;", "PAYPAL_LOGO_IMAGE_URL", "BALANCE_IMAGE_URL", "ACCT_TYPE_SAVINGS", "ACCT_TYPE_CHECKING"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FinancialInstrument {
        public static final int $stable = 0;
        public static final java.lang.String ACCT_TYPE_CHECKING = "CHECKING";
        public static final java.lang.String ACCT_TYPE_SAVINGS = "SAVINGS";
        public static final java.lang.String BALANCE_IMAGE_URL = "https://www.paypalobjects.com/cfs/icons/balance/thumbnail/pp_balance.png";
        public static final java.lang.String FI_FALLBACK_IMAGE_URL = "https://pics.paypal.com/00/s/OTY5WDE1MzZYUE5H/p/YTBhNDA1NWItNTk5YS00YTBjLWIwNzMtZTBhNDM0ZDA0NTky/image_";
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument();
        public static final java.lang.String PAYPAL_LOGO_IMAGE_URL = "https://www.paypalobjects.com/digitalassets/c/website/logo/full-text/pp_fc_hl.svg";

        private FinancialInstrument() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$Goals;", "", "<init>", "()V", "", "MAX_TARGET_AMOUNT_VALUE", "D", "MINIMUM_TARGET_AMOUNT", "", "MAX_GOAL_NAME_LENGTH", com.visa.cbp.getEncExpo.warmup, "CENTS_PER_DOLLAR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Goals {
        public static final int $stable = 0;
        public static final double CENTS_PER_DOLLAR = 100.0d;
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.Goals INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.Goals();
        public static final int MAX_GOAL_NAME_LENGTH = 127;
        public static final double MAX_TARGET_AMOUNT_VALUE = 100000.0d;
        public static final double MINIMUM_TARGET_AMOUNT = 10.0d;

        private Goals() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$GraphQLOperations;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$GraphQLOperation;", "SAVINGS_HUB", "Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$GraphQLOperation;", "getSAVINGS_HUB", "()Lcom/paypal/oslo/feature/savings/constants/SavingsConstants$GraphQLOperation;", "SAVINGS_BALANCE", "getSAVINGS_BALANCE", "TRANSFER_MONEYBOX", "getTRANSFER_MONEYBOX", "GET_GOALS", "getGET_GOALS", "TRANSFER_MONEYBOX_SCHEDULE", "getTRANSFER_MONEYBOX_SCHEDULE", "UPDATE_MONEYBOX_TRANSFER_SCHEDULE", "getUPDATE_MONEYBOX_TRANSFER_SCHEDULE", "DELETE_MONEYBOX_TRANSFER_SCHEDULE", "getDELETE_MONEYBOX_TRANSFER_SCHEDULE", "GET_SAVINGS_ACCOUNT", "getGET_SAVINGS_ACCOUNT", "GET_SAVINGS_ACCOUNT_ELIGIBILITY", "getGET_SAVINGS_ACCOUNT_ELIGIBILITY", "CREATE_SAVINGS_GOAL", "getCREATE_SAVINGS_GOAL", "UPDATE_MONEYBOX", "getUPDATE_MONEYBOX", "DELETE_MONEYBOX", "getDELETE_MONEYBOX", "UPDATE_TAX_STATEMENT_DELIVERY_PREFERENCE", "getUPDATE_TAX_STATEMENT_DELIVERY_PREFERENCE", "GET_SAVINGS_LANDING_PAGE_DATA", "getGET_SAVINGS_LANDING_PAGE_DATA", "GET_GOAL_SUCCESS_STATUS", "getGET_GOAL_SUCCESS_STATUS", "UPDATE_GOAL_SUCCESS_SHOWN", "getUPDATE_GOAL_SUCCESS_SHOWN", "GET_DEPOSIT_OPTIONS", "getGET_DEPOSIT_OPTIONS", "UPDATE_USER_CONSENT", "getUPDATE_USER_CONSENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GraphQLOperations {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperations INSTANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperations();
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation SAVINGS_HUB = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.SCREEN_ID, "getSavingsHubData");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation SAVINGS_BALANCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation("savings_balance", "getSavingsBalance");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation TRANSFER_MONEYBOX = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.TRANSFER_MONEYBOX, "transferMoneybox");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation GET_GOALS = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_GOALS, "getGoals");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation TRANSFER_MONEYBOX_SCHEDULE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.TRANSFER_MONEYBOX_SCHEDULE, "transferMoneyboxSchedule");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation UPDATE_MONEYBOX_TRANSFER_SCHEDULE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_MONEYBOX_TRANSFER_SCHEDULE, "updateMoneyboxTransferSchedule");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation DELETE_MONEYBOX_TRANSFER_SCHEDULE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.DELETE_MONEYBOX_TRANSFER_SCHEDULE, "deleteMoneyboxTransferSchedule");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation GET_SAVINGS_ACCOUNT = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_ACCOUNT, "getSavingsAccount");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation GET_SAVINGS_ACCOUNT_ELIGIBILITY = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_ACCOUNT_ELIGIBILITY, "savingsAccountEligibility");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation CREATE_SAVINGS_GOAL = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation("create_savings_goal", "createSavingsGoal");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation UPDATE_MONEYBOX = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_MONEYBOX, "updateMoneybox");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation DELETE_MONEYBOX = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.DELETE_MONEYBOX, "deleteMoneybox");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation UPDATE_TAX_STATEMENT_DELIVERY_PREFERENCE = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation("update_tax_statement_delivery_preference", "updateTaxStatementDeliveryPreference");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation GET_SAVINGS_LANDING_PAGE_DATA = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation("savings_landing_page", "getSavingsLandingPageData");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation GET_GOAL_SUCCESS_STATUS = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation("goal_success_status", "getGoalsSuccessStatus");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation UPDATE_GOAL_SUCCESS_SHOWN = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation("goal_success_shown", "updateGoalSuccessShown");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation GET_DEPOSIT_OPTIONS = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation("deposit_options", "getDepositOptions");
        private static final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation UPDATE_USER_CONSENT = new com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_USER_CONSENT, "updateUserConsent");

        private GraphQLOperations() {
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getSAVINGS_HUB() {
            return SAVINGS_HUB;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getSAVINGS_BALANCE() {
            return SAVINGS_BALANCE;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getTRANSFER_MONEYBOX() {
            return TRANSFER_MONEYBOX;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getGET_GOALS() {
            return GET_GOALS;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getTRANSFER_MONEYBOX_SCHEDULE() {
            return TRANSFER_MONEYBOX_SCHEDULE;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getUPDATE_MONEYBOX_TRANSFER_SCHEDULE() {
            return UPDATE_MONEYBOX_TRANSFER_SCHEDULE;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getDELETE_MONEYBOX_TRANSFER_SCHEDULE() {
            return DELETE_MONEYBOX_TRANSFER_SCHEDULE;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getGET_SAVINGS_ACCOUNT() {
            return GET_SAVINGS_ACCOUNT;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getGET_SAVINGS_ACCOUNT_ELIGIBILITY() {
            return GET_SAVINGS_ACCOUNT_ELIGIBILITY;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getCREATE_SAVINGS_GOAL() {
            return CREATE_SAVINGS_GOAL;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getUPDATE_MONEYBOX() {
            return UPDATE_MONEYBOX;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getDELETE_MONEYBOX() {
            return DELETE_MONEYBOX;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getUPDATE_TAX_STATEMENT_DELIVERY_PREFERENCE() {
            return UPDATE_TAX_STATEMENT_DELIVERY_PREFERENCE;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getGET_SAVINGS_LANDING_PAGE_DATA() {
            return GET_SAVINGS_LANDING_PAGE_DATA;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getGET_GOAL_SUCCESS_STATUS() {
            return GET_GOAL_SUCCESS_STATUS;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getUPDATE_GOAL_SUCCESS_SHOWN() {
            return UPDATE_GOAL_SUCCESS_SHOWN;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getGET_DEPOSIT_OPTIONS() {
            return GET_DEPOSIT_OPTIONS;
        }

        public final com.paypal.oslo.feature.savings.constants.SavingsConstants.GraphQLOperation getUPDATE_USER_CONSENT() {
            return UPDATE_USER_CONSENT;
        }
    }
}
