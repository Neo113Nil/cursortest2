package com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/personalinfo/analytics/PersonalInfoAnalytics;", "", "<init>", "()V", "", "ScreenId", "Ljava/lang/String;", "ModuleFirstName", "ModuleLastName", "ModuleCompressedAddress", "ModuleAddressLine1", "ModuleAddressLine2", "ModuleCity", "ModuleState", "ModulePostalCode", "ModuleStateDropdown", "ModulePageError", "ItemAgreeAndCreateAccount", "ItemEsignConsent", "ItemUserAgreement", "ItemPrivacyStatement", "ItemStateValue", "ItemDismiss", "ErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PersonalInfoAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics();
    public static final java.lang.String ItemAgreeAndCreateAccount = "agree_and_create_account";
    public static final java.lang.String ItemDismiss = "dismiss";
    public static final java.lang.String ItemEsignConsent = "esign_consent";
    public static final java.lang.String ItemPrivacyStatement = "privacy_statement";
    public static final java.lang.String ItemStateValue = "state_value";
    public static final java.lang.String ItemUserAgreement = "user_agreement";
    public static final java.lang.String ModuleAddressLine1 = "address_line_1";
    public static final java.lang.String ModuleAddressLine2 = "address_line_2";
    public static final java.lang.String ModuleCity = "city";
    public static final java.lang.String ModuleCompressedAddress = "compressed_address";
    public static final java.lang.String ModuleFirstName = "first_name";
    public static final java.lang.String ModuleLastName = "last_name";
    public static final java.lang.String ModulePageError = "page_error";
    public static final java.lang.String ModulePostalCode = "postal_code";
    public static final java.lang.String ModuleState = "state";
    public static final java.lang.String ModuleStateDropdown = "state_dropdown";
    public static final java.lang.String ScreenId = "personal_info";

    private PersonalInfoAnalytics() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/personalinfo/analytics/PersonalInfoAnalytics$ErrorCode;", "", "<init>", "()V", "", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.FIELD_REQUIRED, "Ljava/lang/String;", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.INVALID_FORMAT, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.INVALID_CHARACTERS, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.BELOW_MIN_LENGTH, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.EXCEEDS_MAX_LENGTH, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.MIXED_SCRIPTS, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.REPEATED_CHARACTERS, "INVALID_CONTENT", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.BLOCKED_VALUE, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.CONTAINS_PO_BOX, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.CONTAINS_RURAL_ROUTE, "NETWORK_FAILURE", "UNKNOWN_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorCode {
        public static final int $stable = 0;
        public static final java.lang.String BELOW_MIN_LENGTH = "BELOW_MIN_LENGTH";
        public static final java.lang.String BLOCKED_VALUE = "BLOCKED_VALUE";
        public static final java.lang.String CONTAINS_PO_BOX = "CONTAINS_PO_BOX";
        public static final java.lang.String CONTAINS_RURAL_ROUTE = "CONTAINS_RURAL_ROUTE";
        public static final java.lang.String EXCEEDS_MAX_LENGTH = "EXCEEDS_MAX_LENGTH";
        public static final java.lang.String FIELD_REQUIRED = "FIELD_REQUIRED";
        public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode();
        public static final java.lang.String INVALID_CHARACTERS = "INVALID_CHARACTERS";
        public static final java.lang.String INVALID_CONTENT = "INVALID_CONTENT";
        public static final java.lang.String INVALID_FORMAT = "INVALID_FORMAT";
        public static final java.lang.String MIXED_SCRIPTS = "MIXED_SCRIPTS";
        public static final java.lang.String NETWORK_FAILURE = "NETWORK_FAILURE";
        public static final java.lang.String REPEATED_CHARACTERS = "REPEATED_CHARACTERS";
        public static final java.lang.String UNKNOWN_ERROR = "UNKNOWN_ERROR";

        private ErrorCode() {
        }
    }
}
