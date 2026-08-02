package com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleUpdateAmountAndIntent$1", f = "CrossBorderViewModel.kt", i = {0, 0, 0, 0, 0}, l = {365}, m = "invokeSuspend", n = {"currentState", "requestAmount", "requestCurrencyCode", "amount", "intent"}, nl = {360}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes13.dex */
final class CrossBorderViewModel$handleUpdateAmountAndIntent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String receiveCurrencyCode;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent;
        com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase updateAmountAndIntentUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState value = this.getOutputFormats.getUiState().getValue();
            java.lang.String sendAmount = this.Camera2StreamConfigurationMap.getUseSendCurrency() ? value.getSendAmount() : value.getReceiveAmount();
            if (this.Camera2StreamConfigurationMap.getUseSendCurrency()) {
                receiveCurrencyCode = value.getSendCurrencyCode();
            } else {
                receiveCurrencyCode = value.getReceiveCurrencyCode();
            }
            if (!com.paypal.oslo.feature.p2p.ui.utils.AmountValidationKt.isValidPositiveAmount(sendAmount)) {
                this.getHighSpeedVideoFpsRanges.invoke(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentFailed.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = new com.paypal.oslo.feature.p2p.domain.model.Amount(sendAmount, receiveCurrencyCode, receiveCurrencyCode);
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.getIntent(), com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend)) {
                paymentTransferIntent = com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND;
            } else {
                paymentTransferIntent = com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST;
            }
            updateAmountAndIntentUseCase = this.getOutputFormats.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sendAmount);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(receiveCurrencyCode);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentTransferIntent);
            this.getHighSpeedVideoSizesFor = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(updateAmountAndIntentUseCase.invoke(value.getTransferAttemptId(), amount, paymentTransferIntent, value.getFxQuoteId()), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        if (ior.isRight()) {
            this.getHighSpeedVideoFpsRanges.invoke(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentCompleted.INSTANCE);
        } else {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            com.paypal.oslo.feature.p2p.domain.error.TransferError transferError = (com.paypal.oslo.feature.p2p.domain.error.TransferError) ior.leftOrNull();
            java.lang.String simpleName = transferError != null ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(transferError.getClass()).getSimpleName() : null;
            if (simpleName == null) {
                simpleName = "";
            }
            com.paypal.android.logger.Logger.w$default(logger, "Failed to update amount and intent in cross-border flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName)), null, 4, null);
            this.getHighSpeedVideoFpsRanges.invoke(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentFailed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleUpdateAmountAndIntent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleUpdateAmountAndIntent$1(this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CrossBorderViewModel$handleUpdateAmountAndIntent$1(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent updateAmountAndIntent, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleUpdateAmountAndIntent$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = crossBorderViewModel;
        this.Camera2StreamConfigurationMap = updateAmountAndIntent;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
