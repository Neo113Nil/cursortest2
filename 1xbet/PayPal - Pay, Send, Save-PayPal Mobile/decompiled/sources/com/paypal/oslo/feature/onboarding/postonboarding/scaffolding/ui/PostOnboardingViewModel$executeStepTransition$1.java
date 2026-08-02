package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel$executeStepTransition$1", f = "PostOnboardingViewModel.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, nl = {101}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PostOnboardingViewModel$executeStepTransition$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService;
        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel2 = this.getHighSpeedVideoFpsRangesFor;
            backstackFlowStepService = postOnboardingViewModel2.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = postOnboardingViewModel2;
            this.getHighSpeedVideoSizes = 1;
            java.lang.Object obj2 = backstackFlowStepService.mo16512getFlowStepvm54Raw(this.getHighResolutionOutputSizeshNQ4ISI.m16522getFlowId8NcbBzM(), this.getHighResolutionOutputSizeshNQ4ISI.m16524getStepIdeVUBM90(), this.getHighSpeedVideoFpsRanges, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            postOnboardingViewModel = postOnboardingViewModel2;
            obj = obj2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            postOnboardingViewModel = (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.access$handleStepResult(postOnboardingViewModel, (arrow.core.Either) obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel$executeStepTransition$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel$executeStepTransition$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostOnboardingViewModel$executeStepTransition$1(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel$executeStepTransition$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = postOnboardingViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = step;
        this.getHighSpeedVideoFpsRanges = transition;
    }
}
