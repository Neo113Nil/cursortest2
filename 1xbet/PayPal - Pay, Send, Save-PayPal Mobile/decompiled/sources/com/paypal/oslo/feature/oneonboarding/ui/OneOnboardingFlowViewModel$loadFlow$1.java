package com.paypal.oslo.feature.oneonboarding.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel$loadFlow$1", f = "OneOnboardingFlowViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, nl = {176}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class OneOnboardingFlowViewModel$loadFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase getFlowUseCase;
        com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher imagePrefetcher;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getFlowUseCase = this.getOutputFormats.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            obj = getFlowUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel = this.getOutputFormats;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.oneonboarding.domain.Flow flow = (com.paypal.oslo.feature.oneonboarding.domain.Flow) ((arrow.core.Either.Right) either).getValue();
            imagePrefetcher = oneOnboardingFlowViewModel.getHighSpeedVideoFpsRanges;
            imagePrefetcher.prefetch(flow);
            function1.invoke(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded(flow.getIntentId(), flow));
        } else if (either instanceof arrow.core.Either.Left) {
            function1.invoke(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed(intentId, (com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError) ((arrow.core.Either.Left) either).getValue()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel$loadFlow$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel$loadFlow$1(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OneOnboardingFlowViewModel$loadFlow$1(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> list, boolean z, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel$loadFlow$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = oneOnboardingFlowViewModel;
        this.getHighSpeedVideoFpsRangesFor = intentId;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
