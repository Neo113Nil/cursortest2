package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel$fetchWithdrawalOptions$1", f = "WithdrawMoneyReviewViewModel.kt", i = {0}, l = {150}, m = "invokeSuspend", n = {"input"}, nl = {151}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class WithdrawMoneyReviewViewModel$fetchWithdrawalOptions$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ double getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase getWithdrawalOptionsUseCase;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel = this.getInputSizeshNQ4ISI;
            mutableStateFlow = withdrawMoneyReviewViewModel.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object value2 = mutableStateFlow.getValue();
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content content = value2 instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content ? (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content) value2 : null;
            withdrawMoneyReviewViewModel.getOutputMinFrameDurationlomOqCM = (content == null || (withdrawSpeedSection = content.getWithdrawSpeedSection()) == null) ? null : withdrawSpeedSection.getSelectedWithdrawSpeed();
            mutableStateFlow2 = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Loading.INSTANCE));
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput getWithdrawalOptionsInput = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource(null, this.getHighSpeedVideoFpsRangesFor, 1, null), new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FiatCurrencyInput(this.getHighSpeedVideoSizes, java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI))));
            getWithdrawalOptionsUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getWithdrawalOptionsInput);
            this.Camera2StreamConfigurationMap = 1;
            obj = getWithdrawalOptionsUseCase.invoke(getWithdrawalOptionsInput, this);
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
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to fetch withdrawal options", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError) left.getValue()).toString())), null, null, 12, null);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.access$handleWithdrawOptionsError(this.getInputSizeshNQ4ISI, (com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError) left.getValue(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        } else if (ior instanceof arrow.core.Ior.Right) {
            arrow.core.Ior.Right right = (arrow.core.Ior.Right) ior;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully fetched withdrawal options", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("optionsCount", java.lang.String.valueOf(((com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult) right.getValue()).getOptions().size())), kotlin.TuplesKt.to("potentialInstrumentsCount", java.lang.String.valueOf(((com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult) right.getValue()).getPotentialInstruments().size()))), null, 4, null);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.access$handleWithdrawalOptionsSuccess(this.getInputSizeshNQ4ISI, (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult) right.getValue(), this.getHighResolutionOutputSizeshNQ4ISI);
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Withdrawal options API returned warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError) both.getLeftValue()).toString())), null, 4, null);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.access$handleWithdrawOptionsError(this.getInputSizeshNQ4ISI, (com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError) both.getLeftValue(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel$fetchWithdrawalOptions$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel$fetchWithdrawalOptions$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WithdrawMoneyReviewViewModel$fetchWithdrawalOptions$1(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel, java.lang.String str, java.lang.String str2, double d, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel$fetchWithdrawalOptions$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = withdrawMoneyReviewViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = d;
    }
}
