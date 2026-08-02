package com.paypal.oslo.feature.onboarding.steps.nav.domain;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/ReadableFlowStepService;", "", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "stepId", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "transition", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "getFlowStep-vm54Raw", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFlowStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ReadableFlowStepService {
    /* renamed from: getFlowStep-vm54Raw */
    java.lang.Object mo16512getFlowStepvm54Raw(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: getFlowStep-vm54Raw$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m16514getFlowStepvm54Raw$default(com.paypal.oslo.feature.onboarding.steps.nav.domain.ReadableFlowStepService readableFlowStepService, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFlowStep-vm54Raw");
        }
        if ((i & 2) != 0) {
            str2 = com.paypal.oslo.feature.onboarding.api.steps.domain.StepIdKt.getInitialStepId();
        }
        if ((i & 4) != 0) {
            transition = new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Initial(false, 1, null);
        }
        return readableFlowStepService.mo16512getFlowStepvm54Raw(str, str2, transition, continuation);
    }
}
