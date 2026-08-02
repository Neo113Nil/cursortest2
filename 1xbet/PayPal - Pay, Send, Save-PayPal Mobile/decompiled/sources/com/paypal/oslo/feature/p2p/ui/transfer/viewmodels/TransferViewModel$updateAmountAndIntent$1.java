package com.paypal.oslo.feature.p2p.ui.transfer.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$updateAmountAndIntent$1", f = "TransferViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m = "invokeSuspend", n = {"amount", "intent"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class TransferViewModel$updateAmountAndIntent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent;
        com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase updateAmountAndIntentUseCase;
        java.lang.Object first;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!com.paypal.oslo.feature.p2p.ui.utils.AmountValidationKt.isValidPositiveAmount(this.getHighSpeedVideoFpsRanges.getAmount())) {
                this.getHighSpeedVideoFpsRangesFor.invoke(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InvalidAmountSubmitted.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = new com.paypal.oslo.feature.p2p.domain.model.Amount(this.getHighSpeedVideoFpsRanges.getAmount(), this.getHighSpeedVideoFpsRanges.getCurrencyCode(), this.getHighSpeedVideoFpsRanges.getCurrencyCode());
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.getIntent(), com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend)) {
                paymentTransferIntent = com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND;
            } else {
                paymentTransferIntent = com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST;
            }
            updateAmountAndIntentUseCase = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
            this.getHighSpeedVideoSizes = paymentTransferIntent;
            this.Camera2StreamConfigurationMap = 1;
            first = kotlinx.coroutines.flow.FlowKt.first(com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase.invoke$default(updateAmountAndIntentUseCase, this.getHighSpeedVideoFpsRanges.getTransferAttemptId(), amount, paymentTransferIntent, null, 8, null), this);
            if (first == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentTransferIntent2 = paymentTransferIntent;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentTransferIntent2 = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            first = obj;
        }
        arrow.core.Ior ior = (arrow.core.Ior) first;
        if (ior.isRight()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.NAVIGATING_TO_REVIEW_SCREEN, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", this.getHighSpeedVideoFpsRanges.getTransferAttemptId()), kotlin.TuplesKt.to("intent", paymentTransferIntent2.name()), kotlin.TuplesKt.to("amount", this.getHighSpeedVideoFpsRanges.getAmount()), kotlin.TuplesKt.to("currencyCode", this.getHighSpeedVideoFpsRanges.getCurrencyCode())), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.invoke(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntentCompleted.INSTANCE);
        } else {
            com.paypal.oslo.feature.p2p.domain.error.TransferError transferError = (com.paypal.oslo.feature.p2p.domain.error.TransferError) ior.leftOrNull();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("attemptId", this.getHighSpeedVideoFpsRanges.getTransferAttemptId());
            pairArr[1] = kotlin.TuplesKt.to("intent", paymentTransferIntent2.name());
            java.lang.String simpleName = transferError != null ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(transferError.getClass()).getSimpleName() : null;
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[2] = kotlin.TuplesKt.to("errorType", simpleName);
            com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.FAILED_TO_UPDATE_AMOUNT_AND_INTENT, kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
            this.getHighSpeedVideoFpsRangesFor.invoke(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntentFailed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$updateAmountAndIntent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$updateAmountAndIntent$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransferViewModel$updateAmountAndIntent$1(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent updateAmountAndIntent, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent, kotlin.Unit> function1, com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$updateAmountAndIntent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = updateAmountAndIntent;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizesFor = transferViewModel;
    }
}
