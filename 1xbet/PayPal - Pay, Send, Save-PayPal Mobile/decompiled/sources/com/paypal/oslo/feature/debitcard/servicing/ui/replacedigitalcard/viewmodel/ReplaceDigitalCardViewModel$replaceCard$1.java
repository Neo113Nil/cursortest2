package com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel$replaceCard$1", f = "ReplaceDigitalCardViewModel.kt", i = {0}, l = {98}, m = "invokeSuspend", n = {"request"}, nl = {99}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class ReplaceDigitalCardViewModel$replaceCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase replaceDigitalCardUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardRequest replaceDigitalCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardRequest(this.getHighSpeedVideoFpsRangesFor.getReplacementInfo().getDebitInstrumentId());
            replaceDigitalCardUseCase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replaceDigitalCardRequest);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = replaceDigitalCardUseCase.invoke2(replaceDigitalCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse>>) this);
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
            this.getHighSpeedVideoFpsRangesFor.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.ReplacementCompleted.INSTANCE);
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
            pairArr[0] = kotlin.TuplesKt.to("errorTag", error.getTag());
            java.lang.String errorMessage = error.getErrorMessage();
            if (errorMessage == null) {
                errorMessage = "";
            }
            pairArr[1] = kotlin.TuplesKt.to("errorMessage", errorMessage);
            java.lang.String correlationId = error.getCorrelationId();
            pairArr[2] = kotlin.TuplesKt.to("correlationId", correlationId != null ? correlationId : "");
            com.paypal.android.logger.Logger.d$default(logger, "Replace digital card failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.ReplacementFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error), error.getTag()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel$replaceCard$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel$replaceCard$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReplaceDigitalCardViewModel$replaceCard$1(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel replaceDigitalCardViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel$replaceCard$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = replaceDigitalCardViewModel;
    }
}
