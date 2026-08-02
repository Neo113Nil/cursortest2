package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel$processWithdrawFunds$1", f = "WithdrawMoneyReviewViewModel.kt", i = {0, 0, 0, 0}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING}, m = "invokeSuspend", n = {"contentState", "selectedSpeed", "selectedFI", "input"}, nl = {421}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class WithdrawMoneyReviewViewModel$processWithdrawFunds$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase withdrawFundsUseCase;
        double d;
        java.lang.String str;
        double d2;
        java.lang.String str2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object value2 = mutableStateFlow.getValue();
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content content = value2 instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content ? (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content) value2 : null;
            if (content == null) {
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel selectedWithdrawSpeed = content.getWithdrawSpeedSection().getSelectedWithdrawSpeed();
            com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel selectedFundingInstrument = content.getWithdrawFISection().getSelectedFundingInstrument();
            if (selectedWithdrawSpeed == null || selectedFundingInstrument == null) {
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput buildWithdrawFundsInput$wallet_prodRelease = this.getInputSizeshNQ4ISI.buildWithdrawFundsInput$wallet_prodRelease(content.getWithdrawalOptionId(), content.getAllWithdrawalOptions(), selectedFundingInstrument);
            if (buildWithdrawFundsInput$wallet_prodRelease != null) {
                mutableStateFlow2 = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Loading.INSTANCE));
                withdrawFundsUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(content);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(selectedWithdrawSpeed);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(selectedFundingInstrument);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildWithdrawFundsInput$wallet_prodRelease);
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = withdrawFundsUseCase.invoke(buildWithdrawFundsInput$wallet_prodRelease, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return kotlin.Unit.INSTANCE;
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
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to withdraw funds", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError) left.getValue()).toString())), null, null, 12, null);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel = this.getInputSizeshNQ4ISI;
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError withdrawFundsError = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError) left.getValue();
            d2 = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration;
            str2 = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.access$handleWithdrawFundsError(withdrawMoneyReviewViewModel, withdrawFundsError, d2, str2);
        } else if (ior instanceof arrow.core.Ior.Right) {
            arrow.core.Ior.Right right = (arrow.core.Ior.Right) ior;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Withdrawal successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", ((com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult) right.getValue()).getStatus()), kotlin.TuplesKt.to("transferMode", ((com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult) right.getValue()).getTransferMode())), null, 4, null);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.access$handleWithdrawSuccess(this.getInputSizeshNQ4ISI, ((com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult) right.getValue()).getNetAmount());
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Withdraw funds returned with warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError) both.getLeftValue()).toString())), null, 4, null);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel2 = this.getInputSizeshNQ4ISI;
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError withdrawFundsError2 = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError) both.getLeftValue();
            d = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration;
            str = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.access$handleWithdrawFundsError(withdrawMoneyReviewViewModel2, withdrawFundsError2, d, str);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel$processWithdrawFunds$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel$processWithdrawFunds$1(this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WithdrawMoneyReviewViewModel$processWithdrawFunds$1(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel$processWithdrawFunds$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = withdrawMoneyReviewViewModel;
    }
}
