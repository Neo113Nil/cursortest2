package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel$initFlow$1", f = "PostOnboardingViewModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, nl = {126}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PostOnboardingViewModel$initFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher imagePrefetcher;
        com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService;
        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            imagePrefetcher = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            imagePrefetcher.prefetchImages$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls.INSTANCE.getAllImageUrlsToPrefetch());
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel2 = this.getHighSpeedVideoFpsRanges;
            backstackFlowStepService = postOnboardingViewModel2.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = postOnboardingViewModel2;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object m16514getFlowStepvm54Raw$default = com.paypal.oslo.feature.onboarding.steps.nav.domain.ReadableFlowStepService.m16514getFlowStepvm54Raw$default(backstackFlowStepService, this.Camera2StreamConfigurationMap, null, null, this, 6, null);
            if (m16514getFlowStepvm54Raw$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            postOnboardingViewModel = postOnboardingViewModel2;
            obj = m16514getFlowStepvm54Raw$default;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            postOnboardingViewModel = (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.access$handleStepResult(postOnboardingViewModel, (arrow.core.Either) obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel$initFlow$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel$initFlow$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostOnboardingViewModel$initFlow$1(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel$initFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = postOnboardingViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}
