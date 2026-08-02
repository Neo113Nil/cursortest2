package com.paypal.oslo.feature.identity.analytics.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/analytics/domain/Feature;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Login", "EmailConfirmation", "PhoneConfirmation", "PASSWORD_RECOVERY", "ReturningUserLogin", "ReturningUserBioLogin", "ReturningLoginPassword", "OTP_LOGIN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Feature {
    public static final com.paypal.oslo.feature.identity.analytics.domain.Feature EmailConfirmation;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Feature Login;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Feature OTP_LOGIN;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Feature PASSWORD_RECOVERY;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Feature PhoneConfirmation;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Feature ReturningLoginPassword;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Feature ReturningUserBioLogin;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Feature ReturningUserLogin;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.analytics.domain.Feature[] getHighSpeedVideoSizes;
    private final java.lang.String value;

    private Feature(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.identity.analytics.domain.Feature feature = new com.paypal.oslo.feature.identity.analytics.domain.Feature("Login", 0, "login");
        Login = feature;
        com.paypal.oslo.feature.identity.analytics.domain.Feature feature2 = new com.paypal.oslo.feature.identity.analytics.domain.Feature("EmailConfirmation", 1, "email_confirmation");
        EmailConfirmation = feature2;
        com.paypal.oslo.feature.identity.analytics.domain.Feature feature3 = new com.paypal.oslo.feature.identity.analytics.domain.Feature("PhoneConfirmation", 2, com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.PHONE_OTP_SCREEN_ID);
        PhoneConfirmation = feature3;
        com.paypal.oslo.feature.identity.analytics.domain.Feature feature4 = new com.paypal.oslo.feature.identity.analytics.domain.Feature("PASSWORD_RECOVERY", 3, "identity_password_recovery");
        PASSWORD_RECOVERY = feature4;
        com.paypal.oslo.feature.identity.analytics.domain.Feature feature5 = new com.paypal.oslo.feature.identity.analytics.domain.Feature("ReturningUserLogin", 4, "returning_user_login");
        ReturningUserLogin = feature5;
        com.paypal.oslo.feature.identity.analytics.domain.Feature feature6 = new com.paypal.oslo.feature.identity.analytics.domain.Feature("ReturningUserBioLogin", 5, "returning_user_biologin");
        ReturningUserBioLogin = feature6;
        com.paypal.oslo.feature.identity.analytics.domain.Feature feature7 = new com.paypal.oslo.feature.identity.analytics.domain.Feature("ReturningLoginPassword", 6, "returning_login_password");
        ReturningLoginPassword = feature7;
        com.paypal.oslo.feature.identity.analytics.domain.Feature feature8 = new com.paypal.oslo.feature.identity.analytics.domain.Feature("OTP_LOGIN", 7, "otp_login");
        OTP_LOGIN = feature8;
        com.paypal.oslo.feature.identity.analytics.domain.Feature[] featureArr = {feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
        getHighSpeedVideoSizes = featureArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(featureArr);
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.Feature[] values() {
        return (com.paypal.oslo.feature.identity.analytics.domain.Feature[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.Feature valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.analytics.domain.Feature) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.analytics.domain.Feature.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.analytics.domain.Feature> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
