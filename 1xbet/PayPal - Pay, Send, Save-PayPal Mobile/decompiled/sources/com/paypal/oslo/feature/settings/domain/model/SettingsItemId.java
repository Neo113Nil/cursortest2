package com.paypal.oslo.feature.settings.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemId;", "", "<init>", "()V", "Section", "Account", "PaymentPreferences", "NotificationPreferences", "DataAndPrivacy", "HelpAndSupport"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsItemId {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemId INSTANCE = new com.paypal.oslo.feature.settings.domain.model.SettingsItemId();

    private SettingsItemId() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemId$Section;", "", "<init>", "()V", "", "ACCOUNT", "Ljava/lang/String;", "PAYMENT_PREFERENCES", "NOTIFICATION_PREFERENCES", "DATA_AND_PRIVACY", "HELP_AND_SUPPORT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Section {
        public static final int $stable = 0;
        public static final java.lang.String ACCOUNT = "section_account";
        public static final java.lang.String DATA_AND_PRIVACY = "section_data_and_privacy";
        public static final java.lang.String HELP_AND_SUPPORT = "section_help_and_support";
        public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Section INSTANCE = new com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Section();
        public static final java.lang.String NOTIFICATION_PREFERENCES = "section_notification_preferences";
        public static final java.lang.String PAYMENT_PREFERENCES = "section_payment_preferences";
        public static final java.lang.String UNKNOWN = "unknown_setting_item";

        private Section() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemId$Account;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "EMAIL", "PHONE_NUMBER", "ADDRESS", "ACCOUNT_VISIBILITY", "STATEMENTS_AND_TAXES"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Account {
        public static final int $stable = 0;
        public static final java.lang.String ACCOUNT_VISIBILITY = "account_visibility";
        public static final java.lang.String ADDRESS = "account_address";
        public static final java.lang.String EMAIL = "account_email";
        public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account INSTANCE = new com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account();
        public static final java.lang.String NAME = "account_name";
        public static final java.lang.String PHONE_NUMBER = "account_phone_number";
        public static final java.lang.String STATEMENTS_AND_TAXES = "account_statements_and_taxes";

        private Account() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemId$PaymentPreferences;", "", "<init>", "()V", "", "ONLINE_PAYMENTS", "Ljava/lang/String;", "YOUR_SUBSCRIPTIONS", "LINKED_BUSINESSES", "IN_STORE_PAYMENTS", "MONEY_MANAGEMENT_HEADER", "PAYPAL_BALANCE", "PAYPAL_CREDIT", "PAYPAL_CASHBACK_CARD", "SAVINGS_SMART_ROUTE", "AUTO_SAVE", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentPreferences {
        public static final int $stable = 0;
        public static final java.lang.String AUTO_SAVE = "payment_auto_save";
        public static final java.lang.String CRYPTO = "payment_crypto";
        public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences INSTANCE = new com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences();
        public static final java.lang.String IN_STORE_PAYMENTS = "payment_in_store_payments";
        public static final java.lang.String LINKED_BUSINESSES = "payment_linked_businesses";
        public static final java.lang.String MONEY_MANAGEMENT_HEADER = "payment_money_management_header";
        public static final java.lang.String ONLINE_PAYMENTS = "payment_online_payments";
        public static final java.lang.String PAYPAL_BALANCE = "payment_paypal_balance";
        public static final java.lang.String PAYPAL_CASHBACK_CARD = "payment_paypal_cashback_card";
        public static final java.lang.String PAYPAL_CREDIT = "payment_paypal_credit";
        public static final java.lang.String SAVINGS_SMART_ROUTE = "payment_savings_smart_route";
        public static final java.lang.String YOUR_SUBSCRIPTIONS = "payment_your_subscriptions";

        private PaymentPreferences() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemId$NotificationPreferences;", "", "<init>", "()V", "", "RECEIVE_PUSH", "Ljava/lang/String;", "GENERAL_NOTIFICATIONS_HEADER", "PUSH_NOTIFICATIONS", "SMS_AND_EMAIL", "MARKETING"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NotificationPreferences {
        public static final int $stable = 0;
        public static final java.lang.String GENERAL_NOTIFICATIONS_HEADER = "notification_general_header";
        public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemId.NotificationPreferences INSTANCE = new com.paypal.oslo.feature.settings.domain.model.SettingsItemId.NotificationPreferences();
        public static final java.lang.String MARKETING = "notification_marketing";
        public static final java.lang.String PUSH_NOTIFICATIONS = "notification_push";
        public static final java.lang.String RECEIVE_PUSH = "notification_receive_push";
        public static final java.lang.String SMS_AND_EMAIL = "notification_sms_email";

        private NotificationPreferences() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemId$DataAndPrivacy;", "", "<init>", "()V", "", "MANAGE_ACCOUNT_HEADER", "Ljava/lang/String;", "PASSKEY", "FINGERPRINT_SCAN", "LLS", "VERIFICATION_METHODS", "LOGIN_DEVICES", "PASSWORD", "BLOCKED_CONTACTS", "AUTHENTICATOR_APP", "LOGIN_SESSIONS", "ADS_AND_SHOPPING_HEADER", "PERSONALIZED_SHOPPING", "PERSONALIZED_ADS", "DOWNLOAD_DELETE_DATA", "CONNECTED_APPS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DataAndPrivacy {
        public static final int $stable = 0;
        public static final java.lang.String ADS_AND_SHOPPING_HEADER = "privacy_ads_shopping_header";
        public static final java.lang.String AUTHENTICATOR_APP = "privacy_authenticator_app";
        public static final java.lang.String BLOCKED_CONTACTS = "privacy_blocked_contacts";
        public static final java.lang.String CONNECTED_APPS = "privacy_connected_apps";
        public static final java.lang.String DOWNLOAD_DELETE_DATA = "privacy_download_delete_data";
        public static final java.lang.String FINGERPRINT_SCAN = "privacy_fingerprint_scan";
        public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy INSTANCE = new com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy();
        public static final java.lang.String LLS = "privacy_lls";
        public static final java.lang.String LOGIN_DEVICES = "privacy_login_devices";
        public static final java.lang.String LOGIN_SESSIONS = "privacy_login_sessions";
        public static final java.lang.String MANAGE_ACCOUNT_HEADER = "privacy_manage_account_header";
        public static final java.lang.String PASSKEY = "privacy_passkey";
        public static final java.lang.String PASSWORD = "privacy_password";
        public static final java.lang.String PERSONALIZED_ADS = "privacy_personalized_ads";
        public static final java.lang.String PERSONALIZED_SHOPPING = "privacy_personalized_shopping";
        public static final java.lang.String VERIFICATION_METHODS = "privacy_verification_methods";

        private DataAndPrivacy() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemId$HelpAndSupport;", "", "<init>", "()V", "", "MESSAGE_CENTER", "Ljava/lang/String;", "HELP_CENTER", "PAYPAL_ASSISTANT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HelpAndSupport {
        public static final int $stable = 0;
        public static final java.lang.String HELP_CENTER = "help_help_center";
        public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemId.HelpAndSupport INSTANCE = new com.paypal.oslo.feature.settings.domain.model.SettingsItemId.HelpAndSupport();
        public static final java.lang.String MESSAGE_CENTER = "help_message_center";
        public static final java.lang.String PAYPAL_ASSISTANT = "help_paypal_assistant";

        private HelpAndSupport() {
        }
    }
}
