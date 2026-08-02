package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/navigation/PostOnboardingStepDestination;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDestination;", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", "getFlowId-8NcbBzM", "()Ljava/lang/String;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "getStep", "()Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PostOnboardingStepDestination extends com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDestination {
    com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: getFlowId-8NcbBzM, reason: not valid java name */
        public static java.lang.String m16119getFlowId8NcbBzM(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.PostOnboardingStepDestination postOnboardingStepDestination) {
            return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.PostOnboardingStepDestination.super.mo15903getFlowId8NcbBzM();
        }
    }

    @Override // com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDestination
    /* renamed from: getFlowId-8NcbBzM */
    default java.lang.String mo15903getFlowId8NcbBzM() {
        return getStep().m16522getFlowId8NcbBzM();
    }
}
