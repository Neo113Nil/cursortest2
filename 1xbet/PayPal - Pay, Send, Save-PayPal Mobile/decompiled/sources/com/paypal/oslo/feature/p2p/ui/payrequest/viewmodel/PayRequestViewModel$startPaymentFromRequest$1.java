package com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$startPaymentFromRequest$1", f = "PayRequestViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PayRequestViewModel$startPaymentFromRequest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase startPaymentFromRequestUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            startPaymentFromRequestUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = startPaymentFromRequestUseCase.invoke(this.getHighSpeedVideoFpsRanges, this);
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
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.p2p.domain.model.Amount transferAmount = paymentTransferAttempt.getTransferAmount();
            java.lang.String amount = transferAmount != null ? transferAmount.getAmount() : null;
            if (amount == null) {
                amount = "";
            }
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent selectedIntent = paymentTransferAttempt.getSelectedIntent();
            java.lang.String name2 = selectedIntent != null ? selectedIntent.name() : null;
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted(amount, name2 != null ? name2 : ""));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError paymentTransferError = (com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAR_START_PAYMENT_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "PAR"), kotlin.TuplesKt.to("errorMessage", paymentTransferError.toString())), null, 4, null);
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStartFailed(paymentTransferError.toString()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$startPaymentFromRequest$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$startPaymentFromRequest$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PayRequestViewModel$startPaymentFromRequest$1(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel payRequestViewModel, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$startPaymentFromRequest$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = payRequestViewModel;
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = function1;
    }
}
