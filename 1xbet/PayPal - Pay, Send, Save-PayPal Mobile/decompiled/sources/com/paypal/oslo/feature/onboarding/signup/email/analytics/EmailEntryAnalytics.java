package com.paypal.oslo.feature.onboarding.signup.email.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/analytics/EmailEntryAnalytics;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "MODULE_EMAIL", "ERROR_TYPE_PAGE", "ERROR_TYPE_FIELD", "ERROR_SOURCE", "ErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailEntryAnalytics {
    public static final int $stable = 0;
    public static final java.lang.String ERROR_SOURCE = "email";
    public static final java.lang.String ERROR_TYPE_FIELD = "field";
    public static final java.lang.String ERROR_TYPE_PAGE = "page";
    public static final com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics INSTANCE = new com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics();
    public static final java.lang.String MODULE_EMAIL = "email";
    public static final java.lang.String SCREEN_ID = "account_identifier_entry";

    private EmailEntryAnalytics() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/analytics/EmailEntryAnalytics$ErrorCode;", "", "<init>", "()V", "", com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.EMAIL_EMPTY_VALIDATION, "Ljava/lang/String;", com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.EMAIL_REGEX_VALIDATION, com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.INVALID_EMAIL, com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.BLOCKED_EMAIL, "NETWORK_FAILURE", "UNKNOWN_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorCode {
        public static final int $stable = 0;
        public static final java.lang.String BLOCKED_EMAIL = "BLOCKED_EMAIL";
        public static final java.lang.String EMAIL_EMPTY_VALIDATION = "EMAIL_EMPTY_VALIDATION";
        public static final java.lang.String EMAIL_REGEX_VALIDATION = "EMAIL_REGEX_VALIDATION";
        public static final com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode INSTANCE = new com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode();
        public static final java.lang.String INVALID_EMAIL = "INVALID_EMAIL";
        public static final java.lang.String NETWORK_FAILURE = "NETWORK_FAILURE";
        public static final java.lang.String UNKNOWN_ERROR = "UNKNOWN_ERROR";

        private ErrorCode() {
        }
    }
}
