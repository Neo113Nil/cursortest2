package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel$handleOnActivateOffer$1", f = "OfferDetailsViewModel.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, nl = {192}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class OfferDetailsViewModel$handleOnActivateOffer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase activateOfferUseCase;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError onActivateOfferError;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData uiData;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                activateOfferUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = 1;
                obj = activateOfferUseCase.invoke2(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Request(this.getHighSpeedVideoSizes.getOfferId()), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response>>) this);
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
                com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails = ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) useCaseResult).getData()).getOfferDetails();
                if (offerDetails != null && (uiData = com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.UiDataMappers.INSTANCE.getUiData(offerDetails)) != null) {
                    onActivateOfferError = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess(uiData);
                } else {
                    onActivateOfferError = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate(this.getHighSpeedVideoSizes), "Error: No Data", com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError);
                }
            } else {
                onActivateOfferError = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate(this.getHighSpeedVideoSizes), "Error", useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet ? com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.NetworkError : com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError);
            }
            this.getHighSpeedVideoFpsRangesFor.processEvent(onActivateOfferError);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.feature.shoppingrewards.LoggerKt.log.e("Unexpected error activating offer: ".concat(java.lang.String.valueOf(e2.getMessage())), e2);
            this.getHighSpeedVideoFpsRangesFor.processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate(this.getHighSpeedVideoSizes), "An unexpected error occurred", com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel$handleOnActivateOffer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel$handleOnActivateOffer$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfferDetailsViewModel$handleOnActivateOffer$1(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel offerDetailsViewModel, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel$handleOnActivateOffer$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = offerDetailsViewModel;
        this.getHighSpeedVideoSizes = offerDetailsUiData;
    }
}
