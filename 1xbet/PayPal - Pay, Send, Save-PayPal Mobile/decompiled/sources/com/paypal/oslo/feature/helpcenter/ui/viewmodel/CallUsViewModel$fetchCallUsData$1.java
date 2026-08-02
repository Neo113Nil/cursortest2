package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel$fetchCallUsData$1", f = "CallUsViewModel.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, nl = {74}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CallUsViewModel$fetchCallUsData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase fetchCallUsDataUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                fetchCallUsDataUseCase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = 1;
                obj = fetchCallUsDataUseCase.invoke(this);
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
            com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel callUsViewModel = this.getHighSpeedVideoFpsRangesFor;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.feature.helpcenter.domain.models.CallUsData callUsData = (com.paypal.oslo.feature.helpcenter.domain.models.CallUsData) ((arrow.core.Either.Right) either).getValue();
                mutableStateFlow3 = callUsViewModel.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow3.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(callUsData));
            } else if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError helpCenterDomainError = (com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError) ((arrow.core.Either.Left) either).getValue();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Failed to fetch call us data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", helpCenterDomainError.getErrorMessage())), null, 4, null);
                mutableStateFlow2 = callUsViewModel.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow2.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.INSTANCE.from(helpCenterDomainError.getCallError()), null, 2, null));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.helpcenter.LoggerKt.log.e("Failed to fetch call us data", e);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.NETWORK_ERROR, null, 2, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel$fetchCallUsData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel$fetchCallUsData$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CallUsViewModel$fetchCallUsData$1(com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel callUsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel$fetchCallUsData$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = callUsViewModel;
    }
}
