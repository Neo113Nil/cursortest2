package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$handlePaymentOptionSelected$1", f = "CryptoSellReviewViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m = "invokeSuspend", n = {"currentState"}, nl = {140}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoSellReviewViewModel$handlePaymentOptionSelected$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases cryptoSellReviewUseCases;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs;
        java.lang.String str;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters cryptoSellReviewFormatters;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters cryptoSellReviewFormatters2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs2;
        java.lang.String formatPrice$default;
        java.lang.String formatPrice$default2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy3;
        com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager quotePollingManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r34 & 1) != 0 ? r5.assetSymbol : null, (r34 & 2) != 0 ? r5.titleAssetDisplayName : null, (r34 & 4) != 0 ? r5.assetLogoUrl : null, (r34 & 8) != 0 ? r5.amount : null, (r34 & 16) != 0 ? r5.currencyCode : null, (r34 & 32) != 0 ? r5.cryptoAmount : null, (r34 & 64) != 0 ? r5.exchangeRate : null, (r34 & 128) != 0 ? r5.transactionFee : null, (r34 & 256) != 0 ? r5.totalAmount : null, (r34 & 512) != 0 ? r5.quoteId : null, (r34 & 1024) != 0 ? r5.showPaymentAccordion : false, (r34 & 2048) != 0 ? r5.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r5.availablePaymentOptions : null, (r34 & 8192) != 0 ? r5.selectedPaymentOption : null, (r34 & 16384) != 0 ? r5.currentStep : null, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value).isLoading : true);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) mutableStateFlow2.getValue();
            cryptoSellReviewUseCases = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuote = cryptoSellReviewUseCases.getGenerateQuote();
            com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction = com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.SELL;
            java.lang.String assetSymbol = cryptoSellReviewUiState.getAssetSymbol();
            java.lang.String currencyCode = cryptoSellReviewUiState.getCurrencyCode();
            java.lang.String fundingOptionId = this.getHighSpeedVideoFpsRanges.getFundingOptionId();
            cryptoSellReviewArgs = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            java.lang.String amount = cryptoSellReviewArgs.getAmount();
            str = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cryptoSellReviewUiState);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            invoke = generateQuote.invoke(cryptoTradeAction, assetSymbol, currencyCode, fundingOptionId, amount, str, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption2 = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote cryptoQuote = (com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow4 = cryptoSellReviewViewModel.getOutputMinFrameDuration;
            while (true) {
                java.lang.Object value3 = mutableStateFlow4.getValue();
                com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep cryptoSellReviewStep = com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.FINAL_REVIEW;
                cryptoSellReviewFormatters = cryptoSellReviewViewModel.getHighSpeedVideoFpsRangesFor;
                java.lang.String formatCryptoAmount = cryptoSellReviewFormatters.getCryptoAmount().formatCryptoAmount(cryptoQuote.getQuoteQuantity());
                cryptoSellReviewFormatters2 = cryptoSellReviewViewModel.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRate = cryptoSellReviewFormatters2.getExchangeRate();
                cryptoSellReviewArgs2 = cryptoSellReviewViewModel.getHighSpeedVideoFpsRanges;
                java.lang.String formatExchangeRate = exchangeRate.formatExchangeRate(cryptoSellReviewArgs2.getAssetSymbol(), cryptoQuote.getAssetPrice());
                formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoSellReviewViewModel.getHighSpeedVideoFpsRangesFor.getCryptoPrice(), r4.getValue(), cryptoQuote.getTradeAmountBreakdown().getTotalFee().getCurrencyCode(), null, false, false, 28, null);
                formatPrice$default2 = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoSellReviewViewModel.getHighSpeedVideoFpsRangesFor.getCryptoPrice(), r4.getValue(), cryptoQuote.getTradeAmountBreakdown().getTotalAmount().getCurrencyCode(), null, false, false, 28, null);
                cryptoSellPaymentOption = cryptoSellPaymentOption2;
                copy3 = r3.copy((r34 & 1) != 0 ? r3.assetSymbol : null, (r34 & 2) != 0 ? r3.titleAssetDisplayName : null, (r34 & 4) != 0 ? r3.assetLogoUrl : null, (r34 & 8) != 0 ? r3.amount : null, (r34 & 16) != 0 ? r3.currencyCode : null, (r34 & 32) != 0 ? r3.cryptoAmount : formatCryptoAmount, (r34 & 64) != 0 ? r3.exchangeRate : formatExchangeRate, (r34 & 128) != 0 ? r3.transactionFee : formatPrice$default, (r34 & 256) != 0 ? r3.totalAmount : formatPrice$default2, (r34 & 512) != 0 ? r3.quoteId : cryptoQuote.getQuoteId(), (r34 & 1024) != 0 ? r3.showPaymentAccordion : false, (r34 & 2048) != 0 ? r3.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r3.availablePaymentOptions : null, (r34 & 8192) != 0 ? r3.selectedPaymentOption : cryptoSellPaymentOption, (r34 & 16384) != 0 ? r3.currentStep : cryptoSellReviewStep, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value3).isLoading : false);
                if (mutableStateFlow4.compareAndSet(value3, copy3)) {
                    break;
                }
                cryptoSellPaymentOption2 = cryptoSellPaymentOption;
            }
            quotePollingManager = cryptoSellReviewViewModel.getOutputSizeshNQ4ISI;
            quotePollingManager.start(cryptoSellPaymentOption.getFundingOptionId());
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow3 = cryptoSellReviewViewModel.getOutputMinFrameDuration;
            do {
                value2 = mutableStateFlow3.getValue();
                copy2 = r4.copy((r34 & 1) != 0 ? r4.assetSymbol : null, (r34 & 2) != 0 ? r4.titleAssetDisplayName : null, (r34 & 4) != 0 ? r4.assetLogoUrl : null, (r34 & 8) != 0 ? r4.amount : null, (r34 & 16) != 0 ? r4.currencyCode : null, (r34 & 32) != 0 ? r4.cryptoAmount : null, (r34 & 64) != 0 ? r4.exchangeRate : null, (r34 & 128) != 0 ? r4.transactionFee : null, (r34 & 256) != 0 ? r4.totalAmount : null, (r34 & 512) != 0 ? r4.quoteId : null, (r34 & 1024) != 0 ? r4.showPaymentAccordion : false, (r34 & 2048) != 0 ? r4.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r4.availablePaymentOptions : null, (r34 & 8192) != 0 ? r4.selectedPaymentOption : null, (r34 & 16384) != 0 ? r4.currentStep : null, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value2).isLoading : false);
            } while (!mutableStateFlow3.compareAndSet(value2, copy2));
            mutableSharedFlow = cryptoSellReviewViewModel.getInputSizeshNQ4ISI;
            mutableSharedFlow.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.ShowGenericError.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$handlePaymentOptionSelected$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$handlePaymentOptionSelected$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSellReviewViewModel$handlePaymentOptionSelected$1(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$handlePaymentOptionSelected$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cryptoSellReviewViewModel;
        this.getHighSpeedVideoFpsRanges = cryptoSellPaymentOption;
    }
}
