package com.paypal.oslo.feature.onboarding.signup.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/SignupFlows;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", "SignupWithPhone", "Ljava/lang/String;", "getSignupWithPhone-8NcbBzM", "()Ljava/lang/String;", "SignupWithEmail", "getSignupWithEmail-8NcbBzM", "SignupWithOnboardingEmail", "getSignupWithOnboardingEmail-8NcbBzM", "SignupWithOneOnboardingEmail", "getSignupWithOneOnboardingEmail-8NcbBzM", "SignupWithOneOnboardingEmailPhone", "getSignupWithOneOnboardingEmailPhone-8NcbBzM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupFlows {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.SignupFlows INSTANCE = new com.paypal.oslo.feature.onboarding.signup.domain.SignupFlows();
    private static final java.lang.String SignupWithPhone = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl("SIGNUP_WITH_PHONE");
    private static final java.lang.String SignupWithEmail = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl("SIGNUP_WITH_EMAIL");
    private static final java.lang.String SignupWithOnboardingEmail = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl("SIGNUP_WITH_ONBOARDING_EMAIL");
    private static final java.lang.String SignupWithOneOnboardingEmail = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl("SIGNUP_WITH_ONE_ONBOARDING_EMAIL");
    private static final java.lang.String SignupWithOneOnboardingEmailPhone = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl("SIGNUP_WITH_ONE_ONBOARDING_EMAIL_PHONE");

    private SignupFlows() {
    }

    /* renamed from: getSignupWithPhone-8NcbBzM, reason: not valid java name */
    public final java.lang.String m16298getSignupWithPhone8NcbBzM() {
        return SignupWithPhone;
    }

    /* renamed from: getSignupWithEmail-8NcbBzM, reason: not valid java name */
    public final java.lang.String m16294getSignupWithEmail8NcbBzM() {
        return SignupWithEmail;
    }

    /* renamed from: getSignupWithOnboardingEmail-8NcbBzM, reason: not valid java name */
    public final java.lang.String m16295getSignupWithOnboardingEmail8NcbBzM() {
        return SignupWithOnboardingEmail;
    }

    /* renamed from: getSignupWithOneOnboardingEmail-8NcbBzM, reason: not valid java name */
    public final java.lang.String m16296getSignupWithOneOnboardingEmail8NcbBzM() {
        return SignupWithOneOnboardingEmail;
    }

    /* renamed from: getSignupWithOneOnboardingEmailPhone-8NcbBzM, reason: not valid java name */
    public final java.lang.String m16297getSignupWithOneOnboardingEmailPhone8NcbBzM() {
        return SignupWithOneOnboardingEmailPhone;
    }
}
