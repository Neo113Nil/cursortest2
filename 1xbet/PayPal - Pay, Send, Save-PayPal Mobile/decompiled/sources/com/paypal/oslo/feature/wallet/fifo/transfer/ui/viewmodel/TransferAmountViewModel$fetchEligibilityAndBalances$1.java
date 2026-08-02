package com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel$fetchEligibilityAndBalances$1", f = "TransferAmountViewModel.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, nl = {144}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class TransferAmountViewModel$fetchEligibilityAndBalances$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase getEligibilityAndBalancesUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loading.INSTANCE));
            getEligibilityAndBalancesUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 1;
            obj = getEligibilityAndBalancesUseCase.invoke(this);
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
        if (ior instanceof arrow.core.Ior.Left) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel.access$handleEligibilitySuccess(this.getHighSpeedVideoFpsRanges, (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult) ((arrow.core.Ior.Right) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Both) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel$fetchEligibilityAndBalances$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel$fetchEligibilityAndBalances$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferAmountViewModel$fetchEligibilityAndBalances$1(com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel transferAmountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel$fetchEligibilityAndBalances$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = transferAmountViewModel;
    }
}
