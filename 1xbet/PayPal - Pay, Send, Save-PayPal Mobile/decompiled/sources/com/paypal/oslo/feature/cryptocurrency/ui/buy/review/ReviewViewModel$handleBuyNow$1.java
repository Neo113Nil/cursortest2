package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$handleBuyNow$1", f = "ReviewViewModel.kt", i = {0, 0}, l = {320}, m = "invokeSuspend", n = {"currentState", "quoteId"}, nl = {329}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class ReviewViewModel$handleBuyNow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases reviewUseCases;
        java.lang.Object invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value3;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow4;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters reviewFormatters;
        java.lang.String formatPrice$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState2 = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) mutableStateFlow.getValue();
            if (reviewUiState2.getSelectedPaymentMethod() == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Race condition: Buy Now clicked without a selected payment method", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("current_step", reviewUiState2.getCurrentStep().toString()), kotlin.TuplesKt.to("available_payment_methods", kotlin.coroutines.jvm.internal.Boxing.boxInt(reviewUiState2.getAvailablePaymentMethods().size())), kotlin.TuplesKt.to("is_loading", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(reviewUiState2.isLoading()))), null, 4, null);
                mutableSharedFlow2 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                mutableSharedFlow2.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect.ShowGenericError.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            java.lang.String quoteId = reviewUiState2.getQuoteId();
            if (quoteId != null) {
                mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                do {
                    value = mutableStateFlow2.getValue();
                    copy = r12.copy((r37 & 1) != 0 ? r12.assetSymbol : null, (r37 & 2) != 0 ? r12.titleAssetDisplayName : null, (r37 & 4) != 0 ? r12.assetLogoUrl : null, (r37 & 8) != 0 ? r12.amount : null, (r37 & 16) != 0 ? r12.currencyCode : null, (r37 & 32) != 0 ? r12.cryptoAmount : null, (r37 & 64) != 0 ? r12.exchangeRate : null, (r37 & 128) != 0 ? r12.transactionFee : null, (r37 & 256) != 0 ? r12.totalAmount : null, (r37 & 512) != 0 ? r12.quoteId : null, (r37 & 1024) != 0 ? r12.accordionItems : null, (r37 & 2048) != 0 ? r12.currentStep : null, (r37 & 4096) != 0 ? r12.selectedRecurringOption : null, (r37 & 8192) != 0 ? r12.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r12.availablePaymentMethods : null, (r37 & 32768) != 0 ? r12.isLoading : true, (r37 & 65536) != 0 ? r12.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r12.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value).pyusdRewardsFormattedRate : null);
                } while (!mutableStateFlow2.compareAndSet(value, copy));
                reviewUseCases = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase executeTrade = reviewUseCases.getExecuteTrade();
                com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction = com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.BUY;
                java.lang.String fundingOptionId = reviewUiState2.getSelectedPaymentMethod().getFundingOptionId();
                java.lang.Boolean boxBoolean = reviewUiState2.getShowPyusdRewardsToggle() ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(reviewUiState2.getPyusdRewardsOptIn()) : null;
                this.getHighSpeedVideoSizes = reviewUiState2;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(quoteId);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                invoke = executeTrade.invoke(cryptoTradeAction, fundingOptionId, quoteId, boxBoolean, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                reviewUiState = reviewUiState2;
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Race condition: Buy Now clicked without a quote ID", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("current_step", reviewUiState2.getCurrentStep().toString()), kotlin.TuplesKt.to("available_payment_methods", kotlin.coroutines.jvm.internal.Boxing.boxInt(reviewUiState2.getAvailablePaymentMethods().size())), kotlin.TuplesKt.to("is_loading", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(reviewUiState2.isLoading()))), null, 4, null);
                mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                mutableSharedFlow.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect.ShowGenericError.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reviewUiState = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution cryptoTradeExecution = (com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow4 = reviewViewModel.getInputSizeshNQ4ISI;
            do {
                value3 = mutableStateFlow4.getValue();
                copy3 = r6.copy((r37 & 1) != 0 ? r6.assetSymbol : null, (r37 & 2) != 0 ? r6.titleAssetDisplayName : null, (r37 & 4) != 0 ? r6.assetLogoUrl : null, (r37 & 8) != 0 ? r6.amount : null, (r37 & 16) != 0 ? r6.currencyCode : null, (r37 & 32) != 0 ? r6.cryptoAmount : null, (r37 & 64) != 0 ? r6.exchangeRate : null, (r37 & 128) != 0 ? r6.transactionFee : null, (r37 & 256) != 0 ? r6.totalAmount : null, (r37 & 512) != 0 ? r6.quoteId : null, (r37 & 1024) != 0 ? r6.accordionItems : null, (r37 & 2048) != 0 ? r6.currentStep : com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.COMPLETED, (r37 & 4096) != 0 ? r6.selectedRecurringOption : null, (r37 & 8192) != 0 ? r6.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r6.availablePaymentMethods : null, (r37 & 32768) != 0 ? r6.isLoading : false, (r37 & 65536) != 0 ? r6.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r6.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value3).pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow4.compareAndSet(value3, copy3));
            mutableSharedFlow4 = reviewViewModel.getOutputMinFrameDuration;
            java.lang.String id = cryptoTradeExecution.getId();
            java.lang.String assetSymbol = reviewUiState.getAssetSymbol();
            reviewFormatters = reviewViewModel.getHighSpeedVideoSizes;
            java.lang.String formatCryptoAmount = reviewFormatters.getCryptoAmount().formatCryptoAmount(cryptoTradeExecution.getAssetQuantityTruncated());
            formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(reviewViewModel.getHighSpeedVideoSizes.getCryptoPrice(), r1.getValue(), cryptoTradeExecution.getAmountFulfilled().getCurrencyCode(), null, false, false, 28, null);
            mutableSharedFlow4.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect.NavigateToSuccessScreen(id, assetSymbol, formatCryptoAmount, formatPrice$default, cryptoTradeExecution.getStatus()));
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow3 = reviewViewModel.getInputSizeshNQ4ISI;
            do {
                value2 = mutableStateFlow3.getValue();
                copy2 = r4.copy((r37 & 1) != 0 ? r4.assetSymbol : null, (r37 & 2) != 0 ? r4.titleAssetDisplayName : null, (r37 & 4) != 0 ? r4.assetLogoUrl : null, (r37 & 8) != 0 ? r4.amount : null, (r37 & 16) != 0 ? r4.currencyCode : null, (r37 & 32) != 0 ? r4.cryptoAmount : null, (r37 & 64) != 0 ? r4.exchangeRate : null, (r37 & 128) != 0 ? r4.transactionFee : null, (r37 & 256) != 0 ? r4.totalAmount : null, (r37 & 512) != 0 ? r4.quoteId : null, (r37 & 1024) != 0 ? r4.accordionItems : null, (r37 & 2048) != 0 ? r4.currentStep : null, (r37 & 4096) != 0 ? r4.selectedRecurringOption : null, (r37 & 8192) != 0 ? r4.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r4.availablePaymentMethods : null, (r37 & 32768) != 0 ? r4.isLoading : false, (r37 & 65536) != 0 ? r4.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r4.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value2).pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow3.compareAndSet(value2, copy2));
            mutableSharedFlow3 = reviewViewModel.getOutputMinFrameDuration;
            mutableSharedFlow3.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect.ShowGenericError.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$handleBuyNow$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$handleBuyNow$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$handleBuyNow$1(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$handleBuyNow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = reviewViewModel;
    }
}
