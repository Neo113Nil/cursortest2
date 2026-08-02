package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$handlePaymentMethodSelected$1", f = "ReviewViewModel.kt", i = {0}, l = {239}, m = "invokeSuspend", n = {"currentState"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class ReviewViewModel$handlePaymentMethodSelected$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases reviewUseCases;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs reviewArgs;
        java.lang.Object invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters reviewFormatters;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters reviewFormatters2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs reviewArgs2;
        java.lang.String formatPrice$default;
        java.lang.String formatPrice$default2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy3;
        com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager quotePollingManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = 1;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r37 & 1) != 0 ? r5.assetSymbol : null, (r37 & 2) != 0 ? r5.titleAssetDisplayName : null, (r37 & 4) != 0 ? r5.assetLogoUrl : null, (r37 & 8) != 0 ? r5.amount : null, (r37 & 16) != 0 ? r5.currencyCode : null, (r37 & 32) != 0 ? r5.cryptoAmount : null, (r37 & 64) != 0 ? r5.exchangeRate : null, (r37 & 128) != 0 ? r5.transactionFee : null, (r37 & 256) != 0 ? r5.totalAmount : null, (r37 & 512) != 0 ? r5.quoteId : null, (r37 & 1024) != 0 ? r5.accordionItems : null, (r37 & 2048) != 0 ? r5.currentStep : null, (r37 & 4096) != 0 ? r5.selectedRecurringOption : null, (r37 & 8192) != 0 ? r5.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r5.availablePaymentMethods : null, (r37 & 32768) != 0 ? r5.isLoading : true, (r37 & 65536) != 0 ? r5.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r5.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value).pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState2 = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) mutableStateFlow2.getValue();
            reviewUseCases = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuote = reviewUseCases.getGenerateQuote();
            com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction = com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.BUY;
            java.lang.String assetSymbol = reviewUiState2.getAssetSymbol();
            java.lang.String currencyCode = reviewUiState2.getCurrencyCode();
            java.lang.String fundingOptionId = this.getHighSpeedVideoSizes.getFundingOptionId();
            reviewArgs = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = reviewUiState2;
            this.getHighSpeedVideoFpsRangesFor = 1;
            invoke = generateQuote.invoke(cryptoTradeAction, assetSymbol, currencyCode, fundingOptionId, reviewArgs.getAmount(), (r17 & 32) != 0 ? null : null, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            reviewUiState = reviewUiState2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reviewUiState = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod2 = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote cryptoQuote = (com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow4 = reviewViewModel.getInputSizeshNQ4ISI;
            while (true) {
                java.lang.Object value3 = mutableStateFlow4.getValue();
                com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState3 = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value3;
                com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep reviewStep = com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.FINAL_REVIEW;
                java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem> accordionItems = reviewUiState.getAccordionItems();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(accordionItems, 10));
                java.util.Iterator<T> it = accordionItems.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem) it.next(), null, false, i2, null));
                }
                java.util.ArrayList arrayList2 = arrayList;
                reviewFormatters = reviewViewModel.getHighSpeedVideoSizes;
                java.lang.String formatCryptoAmount = reviewFormatters.getCryptoAmount().formatCryptoAmount(cryptoQuote.getQuoteQuantity());
                reviewFormatters2 = reviewViewModel.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRate = reviewFormatters2.getExchangeRate();
                reviewArgs2 = reviewViewModel.getHighSpeedVideoFpsRanges;
                java.lang.String formatExchangeRate = exchangeRate.formatExchangeRate(reviewArgs2.getAssetSymbol(), cryptoQuote.getAssetPrice());
                formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(reviewViewModel.getHighSpeedVideoSizes.getCryptoPrice(), r6.getValue(), cryptoQuote.getTradeAmountBreakdown().getTotalFee().getCurrencyCode(), null, false, false, 28, null);
                formatPrice$default2 = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(reviewViewModel.getHighSpeedVideoSizes.getCryptoPrice(), r6.getValue(), cryptoQuote.getTradeAmountBreakdown().getTotalAmount().getCurrencyCode(), null, false, false, 28, null);
                paymentMethod = paymentMethod2;
                copy3 = reviewUiState3.copy((r37 & 1) != 0 ? reviewUiState3.assetSymbol : null, (r37 & 2) != 0 ? reviewUiState3.titleAssetDisplayName : null, (r37 & 4) != 0 ? reviewUiState3.assetLogoUrl : null, (r37 & 8) != 0 ? reviewUiState3.amount : null, (r37 & 16) != 0 ? reviewUiState3.currencyCode : null, (r37 & 32) != 0 ? reviewUiState3.cryptoAmount : formatCryptoAmount, (r37 & 64) != 0 ? reviewUiState3.exchangeRate : formatExchangeRate, (r37 & 128) != 0 ? reviewUiState3.transactionFee : formatPrice$default, (r37 & 256) != 0 ? reviewUiState3.totalAmount : formatPrice$default2, (r37 & 512) != 0 ? reviewUiState3.quoteId : cryptoQuote.getQuoteId(), (r37 & 1024) != 0 ? reviewUiState3.accordionItems : arrayList2, (r37 & 2048) != 0 ? reviewUiState3.currentStep : reviewStep, (r37 & 4096) != 0 ? reviewUiState3.selectedRecurringOption : null, (r37 & 8192) != 0 ? reviewUiState3.selectedPaymentMethod : paymentMethod, (r37 & 16384) != 0 ? reviewUiState3.availablePaymentMethods : null, (r37 & 32768) != 0 ? reviewUiState3.isLoading : false, (r37 & 65536) != 0 ? reviewUiState3.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? reviewUiState3.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? reviewUiState3.pyusdRewardsFormattedRate : null);
                if (mutableStateFlow4.compareAndSet(value3, copy3)) {
                    break;
                }
                paymentMethod2 = paymentMethod;
                i2 = 1;
            }
            quotePollingManager = reviewViewModel.getInputFormats;
            quotePollingManager.start(paymentMethod.getFundingOptionId());
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow3 = reviewViewModel.getInputSizeshNQ4ISI;
            do {
                value2 = mutableStateFlow3.getValue();
                copy2 = r4.copy((r37 & 1) != 0 ? r4.assetSymbol : null, (r37 & 2) != 0 ? r4.titleAssetDisplayName : null, (r37 & 4) != 0 ? r4.assetLogoUrl : null, (r37 & 8) != 0 ? r4.amount : null, (r37 & 16) != 0 ? r4.currencyCode : null, (r37 & 32) != 0 ? r4.cryptoAmount : null, (r37 & 64) != 0 ? r4.exchangeRate : null, (r37 & 128) != 0 ? r4.transactionFee : null, (r37 & 256) != 0 ? r4.totalAmount : null, (r37 & 512) != 0 ? r4.quoteId : null, (r37 & 1024) != 0 ? r4.accordionItems : null, (r37 & 2048) != 0 ? r4.currentStep : null, (r37 & 4096) != 0 ? r4.selectedRecurringOption : null, (r37 & 8192) != 0 ? r4.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r4.availablePaymentMethods : null, (r37 & 32768) != 0 ? r4.isLoading : false, (r37 & 65536) != 0 ? r4.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r4.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value2).pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow3.compareAndSet(value2, copy2));
            mutableSharedFlow = reviewViewModel.getOutputMinFrameDuration;
            mutableSharedFlow.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect.ShowGenericError.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$handlePaymentMethodSelected$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$handlePaymentMethodSelected$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$handlePaymentMethodSelected$1(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$handlePaymentMethodSelected$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = reviewViewModel;
        this.getHighSpeedVideoSizes = paymentMethod;
    }
}
