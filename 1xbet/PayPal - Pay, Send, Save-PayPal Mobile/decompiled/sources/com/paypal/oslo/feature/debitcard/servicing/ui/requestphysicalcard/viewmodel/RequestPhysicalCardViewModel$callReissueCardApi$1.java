package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel$callReissueCardApi$1", f = "RequestPhysicalCardViewModel.kt", i = {0}, l = {72}, m = "invokeSuspend", n = {"request"}, nl = {73}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class RequestPhysicalCardViewModel$callReissueCardApi$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.RequestPhysicalCardUseCase requestPhysicalCardUseCase;
        com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter debitCardDateFormatter;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardRequest requestPhysicalCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardRequest(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
            requestPhysicalCardUseCase = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestPhysicalCardRequest);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = requestPhysicalCardUseCase.invoke2(requestPhysicalCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardResponse>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) {
            debitCardDateFormatter = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestSuccessful(debitCardDateFormatter.formatToMonthDay(((com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardResponse) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData()).getEstimatedDeliveryDate())));
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoSizes.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel$callReissueCardApi$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel$callReissueCardApi$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestPhysicalCardViewModel$callReissueCardApi$1(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel requestPhysicalCardViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel$callReissueCardApi$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoSizes = requestPhysicalCardViewModel;
    }
}
