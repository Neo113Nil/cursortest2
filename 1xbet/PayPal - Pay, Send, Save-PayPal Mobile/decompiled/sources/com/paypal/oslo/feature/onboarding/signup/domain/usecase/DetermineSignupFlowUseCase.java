package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/DetermineSignupFlowUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "intent", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", "invoke-KtwKm_s", "(Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;)Ljava/lang/String;", "invoke"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DetermineSignupFlowUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DetermineSignupFlowUseCase() {
    }

    /* renamed from: invoke-KtwKm_s, reason: not valid java name */
    public final java.lang.String m16329invokeKtwKm_s(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone) {
            return com.paypal.oslo.feature.onboarding.signup.domain.SignupFlows.INSTANCE.m16297getSignupWithOneOnboardingEmailPhone8NcbBzM();
        }
        if (!(intent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail) && !(intent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail) && !(intent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.onboarding.signup.domain.SignupFlows.INSTANCE.m16296getSignupWithOneOnboardingEmail8NcbBzM();
    }
}
