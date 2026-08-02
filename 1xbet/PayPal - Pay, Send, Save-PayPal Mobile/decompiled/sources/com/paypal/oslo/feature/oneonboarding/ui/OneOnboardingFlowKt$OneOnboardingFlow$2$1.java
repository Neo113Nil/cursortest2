package com.paypal.oslo.feature.oneonboarding.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1", f = "OneOnboardingFlow.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, nl = {69}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class OneOnboardingFlowKt$OneOnboardingFlow$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiEffect", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1$1", f = "OneOnboardingFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect oneOnboardingUiEffect = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (oneOnboardingUiEffect instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow) {
                this.getHighResolutionOutputSizeshNQ4ISI.setResultAndCloseFlow(((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow) oneOnboardingUiEffect).getResult());
            } else if (oneOnboardingUiEffect instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigateBack(((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack) oneOnboardingUiEffect).getStepsToPopBack());
            } else {
                if (!(oneOnboardingUiEffect instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward handleStepForward = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward) oneOnboardingUiEffect;
                this.getHighResolutionOutputSizeshNQ4ISI.navigateTo(handleStepForward.getIntentId(), handleStepForward.getStepComponentConfig(), handleStepForward.getClearBackStack());
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect oneOnboardingUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1.AnonymousClass1) create(oneOnboardingUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = oneOnboardingNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap.getUiEffect(), new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneOnboardingFlowKt$OneOnboardingFlow$2$1(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt$OneOnboardingFlow$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = oneOnboardingFlowViewModel;
        this.getHighSpeedVideoFpsRanges = oneOnboardingNavigator;
    }
}
