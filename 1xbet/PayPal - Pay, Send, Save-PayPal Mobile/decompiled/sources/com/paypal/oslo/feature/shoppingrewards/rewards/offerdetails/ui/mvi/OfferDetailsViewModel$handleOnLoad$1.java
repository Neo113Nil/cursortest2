package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel$handleOnLoad$1", f = "OfferDetailsViewModel.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class OfferDetailsViewModel$handleOnLoad$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase getOfferDetailsUseCase;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError onLoadError;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData uiData;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getOfferDetailsUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 1;
            obj = getOfferDetailsUseCase.invoke2(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase.Request(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase.Response>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel offerDetailsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult useCaseResult = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails = ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) useCaseResult).getData()).getOfferDetails();
            if (offerDetails != null && (uiData = com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.UiDataMappers.INSTANCE.getUiData(offerDetails)) != null) {
                onLoadError = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess(uiData);
            } else {
                onLoadError = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Load(str), "Error: No Data", com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError);
            }
        } else {
            onLoadError = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Load(str), "Error", useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet ? com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.NetworkError : com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError);
        }
        offerDetailsViewModel.processEvent(onLoadError);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel$handleOnLoad$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel$handleOnLoad$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfferDetailsViewModel$handleOnLoad$1(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel offerDetailsViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel$handleOnLoad$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = offerDetailsViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRanges = str3;
    }
}
