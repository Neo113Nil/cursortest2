package com.paypal.oslo.feature.settings.featureflags.dynamicconfig;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0018\u0019\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R-\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00110\u00108GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsEnabledFeaturesSpecs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "", "ACCOUNT_PREFIX", "Ljava/lang/String;", "PAYMENT_PREFS_PREFIX", "MONEY_MANAGEMENT_PREFIX", "SECURITY_PRIVACY_PREFIX", "MANAGE_ACCOUNT_PREFIX", "ADS_SHOPPING_DATA", "NOTIFICATION_PREFS_PREFIX", "GENERAL_NOTIFICATIONS", "PAYPAL_PRODUCTS_NOTIFICATIONS", "SUPPORT_PREFIX", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "allRows$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getAllRows", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "allRows", "AccountSettings", "PaymentPrefs", "DataPrivacySettings", "NotificationPrefs", "HelpSupportSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsEnabledFeaturesSpecs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    public static final java.lang.String ACCOUNT_PREFIX = "account";
    public static final java.lang.String ADS_SHOPPING_DATA = "ads_shopping_data";
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap;
    public static final java.lang.String GENERAL_NOTIFICATIONS = "general";
    public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs INSTANCE;
    public static final java.lang.String MANAGE_ACCOUNT_PREFIX = "manage_account";
    public static final java.lang.String MONEY_MANAGEMENT_PREFIX = "money_management";
    public static final java.lang.String NOTIFICATION_PREFS_PREFIX = "notification_prefs";
    public static final java.lang.String PAYMENT_PREFS_PREFIX = "payment_prefs";
    public static final java.lang.String PAYPAL_PRODUCTS_NOTIFICATIONS = "paypal_products";
    public static final java.lang.String SECURITY_PRIVACY_PREFIX = "security_privacy";
    public static final java.lang.String SUPPORT_PREFIX = "support";

    /* renamed from: allRows$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty allRows;

    private SettingsEnabledFeaturesSpecs() {
        super("settings", "enabled_rows");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsEnabledFeaturesSpecs$AccountSettings;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "NAME", "EMAIL", "PHONE", "ADDRESS", "VISIBILITY", "STATEMENTS_TAXES"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AccountSettings {
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings ADDRESS;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings EMAIL;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings NAME;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings PHONE;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings STATEMENTS_TAXES;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings VISIBILITY;
        private static final /* synthetic */ com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
        private final java.lang.String key;

        private AccountSettings(java.lang.String str, int i, java.lang.String str2) {
            this.key = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        static {
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings accountSettings = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings("NAME", 0, com.datadog.android.log.LogAttributes.ACCOUNT_NAME);
            NAME = accountSettings;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings accountSettings2 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings("EMAIL", 1, "account.email");
            EMAIL = accountSettings2;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings accountSettings3 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings("PHONE", 2, "account.phone");
            PHONE = accountSettings3;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings accountSettings4 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings("ADDRESS", 3, "account.address");
            ADDRESS = accountSettings4;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings accountSettings5 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings("VISIBILITY", 4, "account.visibility");
            VISIBILITY = accountSettings5;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings accountSettings6 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings("STATEMENTS_TAXES", 5, "account.statements_taxes");
            STATEMENTS_TAXES = accountSettings6;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings[] accountSettingsArr = {accountSettings, accountSettings2, accountSettings3, accountSettings4, accountSettings5, accountSettings6};
            getHighSpeedVideoFpsRanges = accountSettingsArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(accountSettingsArr);
        }

        public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings[] values() {
            return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsEnabledFeaturesSpecs$PaymentPrefs;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "ONLINE_PAYMENTS", "LINKED_BUSINESSES", "IN_STORE_PAYMENTS", "MONEY_MANAGEMENT_HEADER", "BALANCE_AUTO_RELOAD", "CREDIT_AUTOPAY", "CASHBACK_AUTOPAY", "SAVINGS_SMART_ROUTE", "AUTO_SAVE", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentPrefs {
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs AUTO_SAVE;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs BALANCE_AUTO_RELOAD;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs CASHBACK_AUTOPAY;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs CREDIT_AUTOPAY;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs CRYPTO;
        private static final /* synthetic */ com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs[] Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs IN_STORE_PAYMENTS;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs LINKED_BUSINESSES;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs MONEY_MANAGEMENT_HEADER;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs ONLINE_PAYMENTS;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs SAVINGS_SMART_ROUTE;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private final java.lang.String key;

        private PaymentPrefs(java.lang.String str, int i, java.lang.String str2) {
            this.key = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        static {
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs paymentPrefs = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs("ONLINE_PAYMENTS", 0, "payment_prefs.online_payments");
            ONLINE_PAYMENTS = paymentPrefs;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs paymentPrefs2 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs("LINKED_BUSINESSES", 1, "payment_prefs.linked_businesses");
            LINKED_BUSINESSES = paymentPrefs2;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs paymentPrefs3 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs("IN_STORE_PAYMENTS", 2, "payment_prefs.in_store_payments");
            IN_STORE_PAYMENTS = paymentPrefs3;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs paymentPrefs4 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs("MONEY_MANAGEMENT_HEADER", 3, "payment_prefs.money_management.header");
            MONEY_MANAGEMENT_HEADER = paymentPrefs4;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs paymentPrefs5 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs("BALANCE_AUTO_RELOAD", 4, "payment_prefs.money_management.balance_auto_reload");
            BALANCE_AUTO_RELOAD = paymentPrefs5;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs paymentPrefs6 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs("CREDIT_AUTOPAY", 5, "payment_prefs.money_management.credit_autopay");
            CREDIT_AUTOPAY = paymentPrefs6;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs paymentPrefs7 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs("CASHBACK_AUTOPAY", 6, "payment_prefs.money_management.cashback_autopay");
            CASHBACK_AUTOPAY = paymentPrefs7;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs paymentPrefs8 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs("SAVINGS_SMART_ROUTE", 7, "payment_prefs.money_management.savings_smart_route");
            SAVINGS_SMART_ROUTE = paymentPrefs8;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs paymentPrefs9 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs("AUTO_SAVE", 8, "payment_prefs.money_management.auto_save");
            AUTO_SAVE = paymentPrefs9;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs paymentPrefs10 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 9, "payment_prefs.money_management.crypto");
            CRYPTO = paymentPrefs10;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs[] paymentPrefsArr = {paymentPrefs, paymentPrefs2, paymentPrefs3, paymentPrefs4, paymentPrefs5, paymentPrefs6, paymentPrefs7, paymentPrefs8, paymentPrefs9, paymentPrefs10};
            Camera2StreamConfigurationMap = paymentPrefsArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paymentPrefsArr);
        }

        public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs[] values() {
            return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs[]) Camera2StreamConfigurationMap.clone();
        }

        public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsEnabledFeaturesSpecs$DataPrivacySettings;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "MANAGE_ACCOUNT_HEADER", "PASSKEY", "BIOMETRICS", "LLS", "VERIFICATION_METHODS", "LOGIN_DEVICES", "PASSWORD", "BLOCKED_CONTACTS", "AUTH_APP", "MANAGED_SESSIONS", "ADS_SHOPPING_DATA_HEADER", "ADS_SHOPPING_DATA_PERSONALIZED_SHOPPING", "ADS_SHOPPING_DATA_PERSONALIZED_ADS", "ADS_SHOPPING_DATA_DOWNLOAD_DELETE_DATA", "ADS_SHOPPING_DATA_CONNECTED_APPS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DataPrivacySettings {
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings ADS_SHOPPING_DATA_CONNECTED_APPS;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings ADS_SHOPPING_DATA_DOWNLOAD_DELETE_DATA;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings ADS_SHOPPING_DATA_HEADER;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings ADS_SHOPPING_DATA_PERSONALIZED_ADS;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings ADS_SHOPPING_DATA_PERSONALIZED_SHOPPING;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings AUTH_APP;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings BIOMETRICS;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings BLOCKED_CONTACTS;
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings LLS;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings LOGIN_DEVICES;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings MANAGED_SESSIONS;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings MANAGE_ACCOUNT_HEADER;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings PASSKEY;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings PASSWORD;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings VERIFICATION_METHODS;
        private static final /* synthetic */ com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings[] getHighSpeedVideoFpsRanges;
        private final java.lang.String key;

        private DataPrivacySettings(java.lang.String str, int i, java.lang.String str2) {
            this.key = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        static {
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("MANAGE_ACCOUNT_HEADER", 0, "security_privacy.manage_account.header");
            MANAGE_ACCOUNT_HEADER = dataPrivacySettings;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings2 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("PASSKEY", 1, "security_privacy.manage_account.passkey");
            PASSKEY = dataPrivacySettings2;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings3 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("BIOMETRICS", 2, "security_privacy.manage_account.biometrics");
            BIOMETRICS = dataPrivacySettings3;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings4 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("LLS", 3, "security_privacy.manage_account.extend_login_session");
            LLS = dataPrivacySettings4;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings5 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("VERIFICATION_METHODS", 4, "security_privacy.manage_account.verification_methods");
            VERIFICATION_METHODS = dataPrivacySettings5;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings6 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("LOGIN_DEVICES", 5, "security_privacy.manage_account.login_devices");
            LOGIN_DEVICES = dataPrivacySettings6;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings7 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("PASSWORD", 6, "security_privacy.manage_account.password");
            PASSWORD = dataPrivacySettings7;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings8 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("BLOCKED_CONTACTS", 7, "security_privacy.manage_account.blocked_contacts");
            BLOCKED_CONTACTS = dataPrivacySettings8;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings9 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("AUTH_APP", 8, "security_privacy.manage_account.auth_app");
            AUTH_APP = dataPrivacySettings9;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings10 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("MANAGED_SESSIONS", 9, "security_privacy.manage_account.managed_sessions");
            MANAGED_SESSIONS = dataPrivacySettings10;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings11 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("ADS_SHOPPING_DATA_HEADER", 10, "security_privacy.ads_shopping_data.header");
            ADS_SHOPPING_DATA_HEADER = dataPrivacySettings11;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings12 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("ADS_SHOPPING_DATA_PERSONALIZED_SHOPPING", 11, "security_privacy.ads_shopping_data.personalized_shopping");
            ADS_SHOPPING_DATA_PERSONALIZED_SHOPPING = dataPrivacySettings12;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings13 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("ADS_SHOPPING_DATA_PERSONALIZED_ADS", 12, "security_privacy.ads_shopping_data.personalized_ads");
            ADS_SHOPPING_DATA_PERSONALIZED_ADS = dataPrivacySettings13;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings14 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("ADS_SHOPPING_DATA_DOWNLOAD_DELETE_DATA", 13, "security_privacy.ads_shopping_data.download_delete_data");
            ADS_SHOPPING_DATA_DOWNLOAD_DELETE_DATA = dataPrivacySettings14;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings15 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings("ADS_SHOPPING_DATA_CONNECTED_APPS", 14, "security_privacy.ads_shopping_data.connected_apps");
            ADS_SHOPPING_DATA_CONNECTED_APPS = dataPrivacySettings15;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings[] dataPrivacySettingsArr = {dataPrivacySettings, dataPrivacySettings2, dataPrivacySettings3, dataPrivacySettings4, dataPrivacySettings5, dataPrivacySettings6, dataPrivacySettings7, dataPrivacySettings8, dataPrivacySettings9, dataPrivacySettings10, dataPrivacySettings11, dataPrivacySettings12, dataPrivacySettings13, dataPrivacySettings14, dataPrivacySettings15};
            getHighSpeedVideoFpsRanges = dataPrivacySettingsArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(dataPrivacySettingsArr);
        }

        public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings[] values() {
            return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsEnabledFeaturesSpecs$NotificationPrefs;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "RECEIVE_PUSH", "GENERAL_NOTIFICATIONS_HEADER", "GENERAL_NOTIFICATIONS_PUSH", "GENERAL_NOTIFICATIONS_SMS_EMAIL", "GENERAL_NOTIFICATIONS_MARKETING"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NotificationPrefs {
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs GENERAL_NOTIFICATIONS_HEADER;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs GENERAL_NOTIFICATIONS_MARKETING;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs GENERAL_NOTIFICATIONS_PUSH;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs GENERAL_NOTIFICATIONS_SMS_EMAIL;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs RECEIVE_PUSH;
        private static final /* synthetic */ com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private final java.lang.String key;

        private NotificationPrefs(java.lang.String str, int i, java.lang.String str2) {
            this.key = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        static {
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs notificationPrefs = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs("RECEIVE_PUSH", 0, "notification_prefs.receive_push");
            RECEIVE_PUSH = notificationPrefs;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs notificationPrefs2 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs("GENERAL_NOTIFICATIONS_HEADER", 1, "notification_prefs.general.header");
            GENERAL_NOTIFICATIONS_HEADER = notificationPrefs2;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs notificationPrefs3 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs("GENERAL_NOTIFICATIONS_PUSH", 2, "notification_prefs.general.push");
            GENERAL_NOTIFICATIONS_PUSH = notificationPrefs3;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs notificationPrefs4 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs("GENERAL_NOTIFICATIONS_SMS_EMAIL", 3, "notification_prefs.general.sms_email");
            GENERAL_NOTIFICATIONS_SMS_EMAIL = notificationPrefs4;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs notificationPrefs5 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs("GENERAL_NOTIFICATIONS_MARKETING", 4, "notification_prefs.general.marketing");
            GENERAL_NOTIFICATIONS_MARKETING = notificationPrefs5;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs[] notificationPrefsArr = {notificationPrefs, notificationPrefs2, notificationPrefs3, notificationPrefs4, notificationPrefs5};
            getHighResolutionOutputSizeshNQ4ISI = notificationPrefsArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(notificationPrefsArr);
        }

        public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs[] values() {
            return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsEnabledFeaturesSpecs$HelpSupportSettings;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "PAYPAL_ASSISTANT", "HELP_CENTER", "MESSAGE_CENTER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HelpSupportSettings {
        private static final /* synthetic */ com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings[] Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings HELP_CENTER;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings MESSAGE_CENTER;
        public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings PAYPAL_ASSISTANT;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private final java.lang.String key;

        private HelpSupportSettings(java.lang.String str, int i, java.lang.String str2) {
            this.key = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        static {
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings helpSupportSettings = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings("PAYPAL_ASSISTANT", 0, "support.paypal_assistant");
            PAYPAL_ASSISTANT = helpSupportSettings;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings helpSupportSettings2 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings("HELP_CENTER", 1, "support.help_center");
            HELP_CENTER = helpSupportSettings2;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings helpSupportSettings3 = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings("MESSAGE_CENTER", 2, "support.message_center");
            MESSAGE_CENTER = helpSupportSettings3;
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings[] helpSupportSettingsArr = {helpSupportSettings, helpSupportSettings2, helpSupportSettings3};
            Camera2StreamConfigurationMap = helpSupportSettingsArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(helpSupportSettingsArr);
        }

        public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings[] values() {
            return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings[]) Camera2StreamConfigurationMap.clone();
        }

        public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.util.Map<java.lang.String, java.lang.Boolean>> getAllRows() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) allRows.getValue(this, Camera2StreamConfigurationMap[0]);
    }

    static {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        Camera2StreamConfigurationMap = new kotlin.reflect.KProperty[]{kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.class, "allRows", "getAllRows()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};
        com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs settingsEnabledFeaturesSpecs = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs();
        INSTANCE = settingsEnabledFeaturesSpecs;
        allRows = settingsEnabledFeaturesSpecs.create(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.NAME.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.EMAIL.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.PHONE.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.ADDRESS.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.VISIBILITY.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.STATEMENTS_TAXES.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.ONLINE_PAYMENTS.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.LINKED_BUSINESSES.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.IN_STORE_PAYMENTS.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.MONEY_MANAGEMENT_HEADER.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.BALANCE_AUTO_RELOAD.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.CREDIT_AUTOPAY.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.CASHBACK_AUTOPAY.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.SAVINGS_SMART_ROUTE.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.AUTO_SAVE.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.CRYPTO.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.MANAGE_ACCOUNT_HEADER.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.PASSKEY.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.BIOMETRICS.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.LLS.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.VERIFICATION_METHODS.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.LOGIN_DEVICES.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.PASSWORD.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.BLOCKED_CONTACTS.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.AUTH_APP.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.MANAGED_SESSIONS.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_HEADER.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_PERSONALIZED_SHOPPING.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_PERSONALIZED_ADS.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_DOWNLOAD_DELETE_DATA.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_CONNECTED_APPS.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.RECEIVE_PUSH.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.GENERAL_NOTIFICATIONS_HEADER.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.GENERAL_NOTIFICATIONS_PUSH.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.GENERAL_NOTIFICATIONS_SMS_EMAIL.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.GENERAL_NOTIFICATIONS_MARKETING.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings.HELP_CENTER.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings.MESSAGE_CENTER.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings.PAYPAL_ASSISTANT.getKey(), bool)), "rows");
        $stable = 8;
    }
}
