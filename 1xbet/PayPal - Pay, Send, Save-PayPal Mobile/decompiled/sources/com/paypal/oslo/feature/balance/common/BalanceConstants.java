package com.paypal.oslo.feature.balance.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants;", "", "<init>", "()V", "RemoteConfig", "AccountType", "Analytics", "IntentNames", "StateNames", "EffectNames", "ComponentNames", "Documentation", "BalanceDashboardConstants", "Urls", "ErrorCodes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.common.BalanceConstants INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants();

    private BalanceConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$RemoteConfig;", "", "<init>", "()V", "", "DOMAIN", "Ljava/lang/String;", "KEY_NAME", "AUTO_RELOAD_KEY_NAME", "PREFERRED_PAYMENT_MODE_KEY_NAME", "ADD_CASH_STORES_KEY_NAME", "CASH_IN_CHECK_KEY_NAME", "FILE_TAXES_KEY_NAME", "DIRECT_DEPOSIT_KEY_NAME", "SMART_ROUTE_KEY_NAME", "NBA_KEY_NAME", "NBA_CATEGORY_SELECTION_KEY_NAME", "MORE_OPTIONS_KEY_NAME", "ACCOUNT_ROUTING_KEY_NAME", "ACTIVITY_WIDGET_KEY_NAME", "VIEW_CURRENCIES_KEY_NAME", "ADD_MONEY_KEY_NAME", "ACCOUNT_ROUTING_PROVISIONED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RemoteConfig {
        public static final int $stable = 0;
        public static final java.lang.String ACCOUNT_ROUTING_KEY_NAME = "balance_l2_account_routing";
        public static final java.lang.String ACCOUNT_ROUTING_PROVISIONED = "merchant_account_routing_number_provisioned";
        public static final java.lang.String ACTIVITY_WIDGET_KEY_NAME = "balance_l2_activity_widget";
        public static final java.lang.String ADD_CASH_STORES_KEY_NAME = "balance_l2_add_cash_stores";
        public static final java.lang.String ADD_MONEY_KEY_NAME = "balance_l2_add_money";
        public static final java.lang.String AUTO_RELOAD_KEY_NAME = "balance_auto_reload";
        public static final java.lang.String CASH_IN_CHECK_KEY_NAME = "balance_l2_cash_in_check";
        public static final java.lang.String DIRECT_DEPOSIT_KEY_NAME = "balance_l2_direct_deposit";
        public static final java.lang.String DOMAIN = "money_management";
        public static final java.lang.String FILE_TAXES_KEY_NAME = "balance_l2_file_taxes";
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig();
        public static final java.lang.String KEY_NAME = "balance";
        public static final java.lang.String MORE_OPTIONS_KEY_NAME = "balance_l2_more_options";
        public static final java.lang.String NBA_CATEGORY_SELECTION_KEY_NAME = "balance_l2_nba_category_selection";
        public static final java.lang.String NBA_KEY_NAME = "balance_l2_nba";
        public static final java.lang.String PREFERRED_PAYMENT_MODE_KEY_NAME = "balance_l2_preferred_payment_mode";
        public static final java.lang.String SMART_ROUTE_KEY_NAME = "balance_l2_smart_route";
        public static final java.lang.String VIEW_CURRENCIES_KEY_NAME = "balance_l2_view_currencies";

        private RemoteConfig() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$AccountType;", "", "<init>", "()V", "", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL, "Ljava/lang/String;", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AccountType {
        public static final int $stable = 0;
        public static final java.lang.String CONSUMER = "CONSUMER";
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType();
        public static final java.lang.String PERSONAL = "PERSONAL";

        private AccountType() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$Analytics;", "", "<init>", "()V", "", "BALANCE_DASHBOARD_VIEW", "Ljava/lang/String;", "BALANCE_DETAILS_VIEW", "BALANCE_REFRESH"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Analytics {
        public static final int $stable = 0;
        public static final java.lang.String BALANCE_DASHBOARD_VIEW = "balance_dashboard_view";
        public static final java.lang.String BALANCE_DETAILS_VIEW = "balance_details_view";
        public static final java.lang.String BALANCE_REFRESH = "balance_refresh";
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.Analytics INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.Analytics();

        private Analytics() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$IntentNames;", "", "<init>", "()V", "", "INTENT_INITIALIZE", "Ljava/lang/String;", "INTENT_REFRESH_SCREEN", "INTENT_RETRY_BALANCE_LOAD", "INTENT_ERROR", "INTENT_ACTIVITY_WIDGET_VIEW_ALL", "INTENT_EXTERNAL_FEATURE_CLICKED", "INTENT_SHOW_VIEW_CURRENCIES", "INTENT_DISMISS_VIEW_CURRENCIES", "INTENT_BALANCE_LOADED", "INTENT_CURRENCIES_LOADED", "INTENT_TAX_HOLD_POLICY_LOADED", "INTENT_MONEY_ON_HOLD_CLICKED", "INTENT_SHOW_TOAST", "INTENT_DISMISS_NBA"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IntentNames {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames();
        public static final java.lang.String INTENT_ACTIVITY_WIDGET_VIEW_ALL = "ViewAllActivities";
        public static final java.lang.String INTENT_BALANCE_LOADED = "BalanceLoaded";
        public static final java.lang.String INTENT_CURRENCIES_LOADED = "CurrenciesLoaded";
        public static final java.lang.String INTENT_DISMISS_NBA = "DismissNba";
        public static final java.lang.String INTENT_DISMISS_VIEW_CURRENCIES = "DismissViewCurrenciesBottomSheet";
        public static final java.lang.String INTENT_ERROR = "Error";
        public static final java.lang.String INTENT_EXTERNAL_FEATURE_CLICKED = "ExternalFeatureClicked";
        public static final java.lang.String INTENT_INITIALIZE = "Initialize";
        public static final java.lang.String INTENT_MONEY_ON_HOLD_CLICKED = "MoneyOnHoldClicked";
        public static final java.lang.String INTENT_REFRESH_SCREEN = "RefreshScreen";
        public static final java.lang.String INTENT_RETRY_BALANCE_LOAD = "RetryBalanceLoad";
        public static final java.lang.String INTENT_SHOW_TOAST = "ShowToastMessage";
        public static final java.lang.String INTENT_SHOW_VIEW_CURRENCIES = "ShowViewCurrenciesBottomSheet";
        public static final java.lang.String INTENT_TAX_HOLD_POLICY_LOADED = "TaxHoldPolicyLoaded";

        private IntentNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$StateNames;", "", "<init>", "()V", "", "STATE_IDLE", "Ljava/lang/String;", "STATE_LOADING", "STATE_SUCCESS", "STATE_ERROR", "STATE_HIDDEN", "STATE_VISIBLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StateNames {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames();
        public static final java.lang.String STATE_ERROR = "Error";
        public static final java.lang.String STATE_HIDDEN = "Hidden";
        public static final java.lang.String STATE_IDLE = "Idle";
        public static final java.lang.String STATE_LOADING = "Loading";
        public static final java.lang.String STATE_SUCCESS = "Success";
        public static final java.lang.String STATE_VISIBLE = "Visible";

        private StateNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$EffectNames;", "", "<init>", "()V", "", "EFFECT_SHOW_TOAST", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EffectNames {
        public static final int $stable = 0;
        public static final java.lang.String EFFECT_SHOW_TOAST = "ShowToast";
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.EffectNames INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.EffectNames();

        private EffectNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$ComponentNames;", "", "<init>", "()V", "", "BALANCE_DASHBOARD_VIEWMODEL_STORE", "Ljava/lang/String;", "BALANCE_DASHBOARD_REDUCER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ComponentNames {
        public static final int $stable = 0;
        public static final java.lang.String BALANCE_DASHBOARD_REDUCER = "BalanceDashboardReducer";
        public static final java.lang.String BALANCE_DASHBOARD_VIEWMODEL_STORE = "BalanceDashboardViewModel.store";
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.ComponentNames INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.ComponentNames();

        private ComponentNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$Documentation;", "", "<init>", "()V", "", "REMOTE_CONFIG_SINGLETON", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Documentation {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.Documentation INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.Documentation();
        public static final java.lang.String REMOTE_CONFIG_SINGLETON = "Singleton scope is used for remote config to ensure consistent configuration across the application.";

        private Documentation() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$BalanceDashboardConstants;", "", "<init>", "()V", "", "FEATURE_ID_DIRECT_DEPOSIT", "Ljava/lang/String;", "FEATURE_ID_PAYPAL_SMART_ROUTE", "TAX_FILING_URL", "BALANCE_HUB_SOURCE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BalanceDashboardConstants {
        public static final int $stable = 0;
        public static final java.lang.String BALANCE_HUB_SOURCE = "balance_hub";
        public static final java.lang.String FEATURE_ID_DIRECT_DEPOSIT = "direct_deposit";
        public static final java.lang.String FEATURE_ID_PAYPAL_SMART_ROUTE = "paypal_smart_route";
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.BalanceDashboardConstants INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.BalanceDashboardConstants();
        public static final java.lang.String TAX_FILING_URL = "https://www.te-tax-filing.qa.paypal.com/myaccount/taxfiling/flow/filing?entry_point=balance";

        private BalanceDashboardConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$Urls;", "", "<init>", "()V", "", "CUSTOMER_SUPPORT_URL", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Urls {
        public static final int $stable = 0;
        public static final java.lang.String CUSTOMER_SUPPORT_URL = "https://www.paypal.com/us/smarthelp/contact-us";
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.Urls INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.Urls();

        private Urls() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceConstants$ErrorCodes;", "", "<init>", "()V", "", "HTTP_INTERNAL_SERVER_ERROR", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorCodes {
        public static final int $stable = 0;
        public static final int HTTP_INTERNAL_SERVER_ERROR = 500;
        public static final com.paypal.oslo.feature.balance.common.BalanceConstants.ErrorCodes INSTANCE = new com.paypal.oslo.feature.balance.common.BalanceConstants.ErrorCodes();

        private ErrorCodes() {
        }
    }
}
