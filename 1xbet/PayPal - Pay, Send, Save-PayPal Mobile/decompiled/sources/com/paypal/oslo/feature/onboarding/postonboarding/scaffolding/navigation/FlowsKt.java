package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0017\u0010\u0005\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\"\u001a\u0010\u000b\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u001a\u0010\r\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", "", "isBackDisabled-786ZxuM", "(Ljava/lang/String;)Z", "isBackDisabled", "PostOnboardingFlowId", "Ljava/lang/String;", "getPostOnboardingFlowId", "()Ljava/lang/String;", "ActivationFlowId", "getActivationFlowId", "ExistingUserAppOnboardingFlowId", "getExistingUserAppOnboardingFlowId", "WelcomeBackEmailConfirmationFlowId", "getWelcomeBackEmailConfirmationFlowId", "", "getHighSpeedVideoSizes", "Ljava/util/Set;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FlowsKt {
    private static final java.lang.String ActivationFlowId;
    private static final java.lang.String ExistingUserAppOnboardingFlowId;
    private static final java.lang.String PostOnboardingFlowId;
    private static final java.lang.String WelcomeBackEmailConfirmationFlowId;
    private static final java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId> getHighSpeedVideoSizes;

    static {
        java.lang.String postOnboardingFlowId = com.paypal.oslo.feature.onboarding.api.navigation.FlowIdsKt.getPostOnboardingFlowId();
        PostOnboardingFlowId = postOnboardingFlowId;
        java.lang.String m16021constructorimpl = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl("EXISTING_USER_ACTIVATION");
        ActivationFlowId = m16021constructorimpl;
        java.lang.String existingUserAppOnboardingFlowId = com.paypal.oslo.feature.onboarding.api.navigation.FlowIdsKt.getExistingUserAppOnboardingFlowId();
        ExistingUserAppOnboardingFlowId = existingUserAppOnboardingFlowId;
        java.lang.String m16021constructorimpl2 = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl("WELCOME_BACK_EMAIL_CONFIRMATION");
        WelcomeBackEmailConfirmationFlowId = m16021constructorimpl2;
        getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId[]{com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(postOnboardingFlowId), com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(m16021constructorimpl), com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(existingUserAppOnboardingFlowId), com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(m16021constructorimpl2)});
    }

    public static final java.lang.String getPostOnboardingFlowId() {
        return PostOnboardingFlowId;
    }

    public static final java.lang.String getActivationFlowId() {
        return ActivationFlowId;
    }

    public static final java.lang.String getExistingUserAppOnboardingFlowId() {
        return ExistingUserAppOnboardingFlowId;
    }

    public static final java.lang.String getWelcomeBackEmailConfirmationFlowId() {
        return WelcomeBackEmailConfirmationFlowId;
    }

    /* renamed from: isBackDisabled-786ZxuM, reason: not valid java name */
    public static final boolean m16117isBackDisabled786ZxuM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighSpeedVideoSizes.contains(com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(str));
    }
}
