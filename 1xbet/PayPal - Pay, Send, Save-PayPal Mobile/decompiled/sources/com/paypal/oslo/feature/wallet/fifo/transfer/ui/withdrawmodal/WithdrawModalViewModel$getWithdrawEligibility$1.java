package com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel$getWithdrawEligibility$1", f = "WithdrawModalViewModel.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, nl = {78}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class WithdrawModalViewModel$getWithdrawEligibility$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase getEligibilityUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loading.INSTANCE));
            getEligibilityUseCase = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
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
        if (ior instanceof arrow.core.Ior.Left) {
            arrow.core.Ior.Left left = (arrow.core.Ior.Left) ior;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to fetch withdraw eligibility", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError) left.getValue()).toString())), null, null, 12, null);
            mutableStateFlow4 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            do {
                value4 = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.compareAndSet(value4, new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Error(((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError) left.getValue()).toString(), null, null, 6, null)));
        } else if (ior instanceof arrow.core.Ior.Right) {
            mutableStateFlow3 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel withdrawModalViewModel = this.getHighSpeedVideoSizes;
            do {
                value3 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value3, new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel.access$getWithdrawMoneyOptions(withdrawModalViewModel, ((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult) ((arrow.core.Ior.Right) ior).getValue()).getBalanceAddWithdrawEligibility()))));
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Eligibility API returned warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError) both.getLeftValue()).toString())), null, 4, null);
            mutableStateFlow2 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel withdrawModalViewModel2 = this.getHighSpeedVideoSizes;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel.access$getWithdrawMoneyOptions(withdrawModalViewModel2, ((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult) both.getRightValue()).getBalanceAddWithdrawEligibility()))));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel$getWithdrawEligibility$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel$getWithdrawEligibility$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WithdrawModalViewModel$getWithdrawEligibility$1(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel withdrawModalViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel$getWithdrawEligibility$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = withdrawModalViewModel;
    }
}
