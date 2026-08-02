package com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel$fetchBalances$1", f = "TransferAmountViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m = "invokeSuspend", n = {}, nl = {197}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class TransferAmountViewModel$fetchBalances$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase getBalancesUseCase;
        java.util.List list;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loading.INSTANCE));
            getBalancesUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = getBalancesUseCase.invoke(this);
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
            mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Error(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_error_title, com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_error_description, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_try_again)));
        } else if (ior instanceof arrow.core.Ior.Right) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = ((com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult) ((arrow.core.Ior.Right) ior).getValue()).getCurrencies();
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel.access$updateStateFromCurrencies(this.getHighSpeedVideoFpsRanges);
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = ((com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult) both.getRightValue()).getCurrencies();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(both.getLeftValue().getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[0] = kotlin.TuplesKt.to("errorType", simpleName);
            pairArr[1] = kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError) both.getLeftValue()).toString());
            list = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCIES_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()));
            com.paypal.android.logger.Logger.w$default(logger, "Warning in fetchBalances Ior.Both", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel.access$updateStateFromCurrencies(this.getHighSpeedVideoFpsRanges);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel$fetchBalances$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel$fetchBalances$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferAmountViewModel$fetchBalances$1(com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel transferAmountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel$fetchBalances$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = transferAmountViewModel;
    }
}
