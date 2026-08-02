package com.paypal.oslo.feature.qrc.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel$cancelQrCodePayment$1", f = "EnterAmountViewModel.kt", i = {0, 0}, l = {81}, m = "invokeSuspend", n = {"currentState", "request"}, nl = {93}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class EnterAmountViewModel$cancelQrCodePayment$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase cancelQrCodePaymentUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState value = this.Camera2StreamConfigurationMap.getUiState().getValue();
            if (!(value instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Content)) {
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest cancelQrcPaymentRequest = new com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest(this.Camera2StreamConfigurationMap.getNavArgs().getSessionId(), this.Camera2StreamConfigurationMap.getNavArgs().getSessionId(), this.getHighResolutionOutputSizeshNQ4ISI);
            cancelQrCodePaymentUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelQrcPaymentRequest);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = cancelQrCodePaymentUseCase.invoke(cancelQrcPaymentRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = ((arrow.core.Ior) obj).toEither();
        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel enterAmountViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            enterAmountViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.CancelPaymentComplete.INSTANCE);
        } else if (either instanceof arrow.core.Either.Left) {
            enterAmountViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.CancelPaymentComplete.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel$cancelQrCodePayment$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel$cancelQrCodePayment$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAmountViewModel$cancelQrCodePayment$1(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel enterAmountViewModel, com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel$cancelQrCodePayment$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = enterAmountViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = qrcPaymentCancellationReason;
    }
}
