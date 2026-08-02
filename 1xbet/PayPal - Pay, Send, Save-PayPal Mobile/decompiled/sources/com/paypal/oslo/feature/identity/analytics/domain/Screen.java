package com.paypal.oslo.feature.identity.analytics.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/analytics/domain/Screen;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Login", "LoginEntry", "EmailConfirmation", "PhoneConfirmation", "PASSWORD_RECOVERY", "WelcomeBack", "PasskeyPrompt", "BiometricFaceId", "ReturningLoginPassword", "OTP_VERIFICATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Screen {
    public static final com.paypal.oslo.feature.identity.analytics.domain.Screen BiometricFaceId;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Screen EmailConfirmation;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Screen Login;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Screen LoginEntry;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Screen OTP_VERIFICATION;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Screen PASSWORD_RECOVERY;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Screen PasskeyPrompt;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Screen PhoneConfirmation;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Screen ReturningLoginPassword;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Screen WelcomeBack;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.analytics.domain.Screen[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private Screen(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.identity.analytics.domain.Screen screen = new com.paypal.oslo.feature.identity.analytics.domain.Screen("Login", 0, "login");
        Login = screen;
        com.paypal.oslo.feature.identity.analytics.domain.Screen screen2 = new com.paypal.oslo.feature.identity.analytics.domain.Screen("LoginEntry", 1, "login_entry");
        LoginEntry = screen2;
        com.paypal.oslo.feature.identity.analytics.domain.Screen screen3 = new com.paypal.oslo.feature.identity.analytics.domain.Screen("EmailConfirmation", 2, "email_confirmation");
        EmailConfirmation = screen3;
        com.paypal.oslo.feature.identity.analytics.domain.Screen screen4 = new com.paypal.oslo.feature.identity.analytics.domain.Screen("PhoneConfirmation", 3, com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.PHONE_OTP_SCREEN_ID);
        PhoneConfirmation = screen4;
        com.paypal.oslo.feature.identity.analytics.domain.Screen screen5 = new com.paypal.oslo.feature.identity.analytics.domain.Screen("PASSWORD_RECOVERY", 4, "identity_password_recovery_create_password");
        PASSWORD_RECOVERY = screen5;
        com.paypal.oslo.feature.identity.analytics.domain.Screen screen6 = new com.paypal.oslo.feature.identity.analytics.domain.Screen("WelcomeBack", 5, "identity_welcome_back");
        WelcomeBack = screen6;
        com.paypal.oslo.feature.identity.analytics.domain.Screen screen7 = new com.paypal.oslo.feature.identity.analytics.domain.Screen("PasskeyPrompt", 6, "identity_passkey_prompt");
        PasskeyPrompt = screen7;
        com.paypal.oslo.feature.identity.analytics.domain.Screen screen8 = new com.paypal.oslo.feature.identity.analytics.domain.Screen("BiometricFaceId", 7, "identity_biometric_faceid");
        BiometricFaceId = screen8;
        com.paypal.oslo.feature.identity.analytics.domain.Screen screen9 = new com.paypal.oslo.feature.identity.analytics.domain.Screen("ReturningLoginPassword", 8, "returning_login_password");
        ReturningLoginPassword = screen9;
        com.paypal.oslo.feature.identity.analytics.domain.Screen screen10 = new com.paypal.oslo.feature.identity.analytics.domain.Screen("OTP_VERIFICATION", 9, "identity_otp_verification");
        OTP_VERIFICATION = screen10;
        com.paypal.oslo.feature.identity.analytics.domain.Screen[] screenArr = {screen, screen2, screen3, screen4, screen5, screen6, screen7, screen8, screen9, screen10};
        getHighSpeedVideoFpsRanges = screenArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(screenArr);
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.Screen[] values() {
        return (com.paypal.oslo.feature.identity.analytics.domain.Screen[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.Screen valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.analytics.domain.Screen) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.analytics.domain.Screen.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.analytics.domain.Screen> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
