package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel$handleOnLoad$1", f = "RewardsLandingViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, nl = {93}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class RewardsLandingViewModel$handleOnLoad$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase getRewardsLandingUseCase;
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper rewardsLandingUiDataMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getRewardsLandingUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getRewardsLandingUseCase.invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Request.INSTANCE, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult useCaseResult = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) {
            rewardsLandingUiDataMapper = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadSuccess(rewardsLandingUiDataMapper.toUiData(((com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) useCaseResult).getData()).getRewardsLandingData())));
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error error = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Error loading rewards landing data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, null, 12, null);
            this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadError(error instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet ? com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.NetworkError : com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel$handleOnLoad$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel$handleOnLoad$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsLandingViewModel$handleOnLoad$1(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel rewardsLandingViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel$handleOnLoad$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = rewardsLandingViewModel;
    }
}
