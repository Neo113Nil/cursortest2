package com.paypal.oslo.feature.onboarding.steps.nav.data;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001e\u001a\u00020\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0#8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/data/NavigationOrchestrator;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/BackstackFlowStepService;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/WriteableFlowStepService;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/repository/FlowStepRepository;", "flowStepRepository", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/repository/FlowStepRepository;)V", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "stepId", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "transition", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "getFlowStep-vm54Raw", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFlowStep", "peekBackStack", "()Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "popBackStack", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepKey;", "stepKey", "step", "", "cacheStep", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepKey;Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)V", "", "steps", "preloadSteps", "(Ljava/util/Map;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/repository/FlowStepRepository;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/collections/ArrayDeque;", "backStack", "Lkotlin/collections/ArrayDeque;", "getBackStack", "()Lkotlin/collections/ArrayDeque;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavigationOrchestrator implements com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService, com.paypal.oslo.feature.onboarding.steps.nav.domain.WriteableFlowStepService {
    public static final int $stable = 8;
    private final kotlin.collections.ArrayDeque<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> backStack;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.steps.nav.domain.repository.FlowStepRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public NavigationOrchestrator(com.paypal.oslo.feature.onboarding.steps.nav.domain.repository.FlowStepRepository flowStepRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowStepRepository, "");
        this.getHighSpeedVideoFpsRangesFor = flowStepRepository;
        this.backStack = new kotlin.collections.ArrayDeque<>(15);
    }

    public final kotlin.collections.ArrayDeque<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> getBackStack() {
        return this.backStack;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.onboarding.steps.nav.domain.ReadableFlowStepService
    /* renamed from: getFlowStep-vm54Raw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16512getFlowStepvm54Raw(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step>> continuation) {
        com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator$getFlowStep$1 navigationOrchestrator$getFlowStep$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator$getFlowStep$1) {
            navigationOrchestrator$getFlowStep$1 = (com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator$getFlowStep$1) continuation;
            if ((navigationOrchestrator$getFlowStep$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                navigationOrchestrator$getFlowStep$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = navigationOrchestrator$getFlowStep$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = navigationOrchestrator$getFlowStep$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.onboarding.steps.nav.domain.repository.FlowStepRepository flowStepRepository = this.getHighSpeedVideoFpsRangesFor;
                    navigationOrchestrator$getFlowStep$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    navigationOrchestrator$getFlowStep$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    navigationOrchestrator$getFlowStep$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transition);
                    navigationOrchestrator$getFlowStep$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = flowStepRepository.mo16512getFlowStepvm54Raw(str, str2, transition, navigationOrchestrator$getFlowStep$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    this.backStack.add((com.paypal.oslo.feature.onboarding.steps.nav.domain.Step) ((arrow.core.Either.Right) either).getValue());
                }
                return either;
            }
        }
        navigationOrchestrator$getFlowStep$1 = new com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator$getFlowStep$1(this, continuation);
        java.lang.Object obj2 = navigationOrchestrator$getFlowStep$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = navigationOrchestrator$getFlowStep$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        return either;
    }

    @Override // com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService
    public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step peekBackStack() {
        return this.backStack.lastOrNull();
    }

    @Override // com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService
    public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step popBackStack() {
        return this.backStack.removeLastOrNull();
    }

    @Override // com.paypal.oslo.feature.onboarding.steps.nav.domain.WriteableFlowStepService
    public final void preloadSteps(java.util.Map<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> steps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(steps, "");
        this.getHighSpeedVideoFpsRangesFor.preloadSteps(steps);
    }

    @Override // com.paypal.oslo.feature.onboarding.steps.nav.domain.WriteableFlowStepService
    public final void cacheStep(com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey stepKey, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        this.getHighSpeedVideoFpsRangesFor.cacheStep(stepKey, step);
    }
}
