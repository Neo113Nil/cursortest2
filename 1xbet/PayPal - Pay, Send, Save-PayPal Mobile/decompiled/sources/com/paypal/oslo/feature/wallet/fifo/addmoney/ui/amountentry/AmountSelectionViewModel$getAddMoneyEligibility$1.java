package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel$getAddMoneyEligibility$1", f = "AmountSelectionViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, nl = {97}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AmountSelectionViewModel$getAddMoneyEligibility$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase getEligibilityUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loading.INSTANCE));
            getEligibilityUseCase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = getEligibilityUseCase.invoke(new com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityInput(com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier.CONSUMER_TRANSFERS), this);
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
        if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel.access$handleEligibilitySuccess(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult) ((arrow.core.Ior.Right) ior).getValue()).getBalanceAddWithdrawEligibility());
        } else if ((ior instanceof arrow.core.Ior.Left) || (ior instanceof arrow.core.Ior.Both)) {
            mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error(new com.paypal.oslo.feature.wallet.common.ui.UiText.StringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_error_title, null, 2, null), new com.paypal.oslo.feature.wallet.common.ui.UiText.StringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_error_description, null, 2, null), null, 4, null)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel$getAddMoneyEligibility$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel$getAddMoneyEligibility$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountSelectionViewModel$getAddMoneyEligibility$1(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel$getAddMoneyEligibility$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = amountSelectionViewModel;
    }
}
