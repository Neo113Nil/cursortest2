package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$handleSellNow$1", f = "CryptoSellReviewViewModel.kt", i = {0, 0, 0}, l = {207}, m = "invokeSuspend", n = {"currentState", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "quoteId"}, nl = {211}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoSellReviewViewModel$handleSellNow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases cryptoSellReviewUseCases;
        java.lang.Object invoke$default;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value3;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow4;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters cryptoSellReviewFormatters;
        java.lang.String formatPrice$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState2 = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) mutableStateFlow.getValue();
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption selectedPaymentOption = cryptoSellReviewUiState2.getSelectedPaymentOption();
            if (selectedPaymentOption == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Race condition: Sell Now clicked without a selected payment destination", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("current_step", cryptoSellReviewUiState2.getCurrentStep().toString()), kotlin.TuplesKt.to("available_payment_methods", kotlin.coroutines.jvm.internal.Boxing.boxInt(cryptoSellReviewUiState2.getAvailablePaymentOptions().size())), kotlin.TuplesKt.to("is_loading", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cryptoSellReviewUiState2.isLoading()))), null, 4, null);
                mutableSharedFlow2 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                mutableSharedFlow2.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.ShowGenericError.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            java.lang.String quoteId = cryptoSellReviewUiState2.getQuoteId();
            if (quoteId != null) {
                mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                do {
                    value = mutableStateFlow2.getValue();
                    copy = r12.copy((r34 & 1) != 0 ? r12.assetSymbol : null, (r34 & 2) != 0 ? r12.titleAssetDisplayName : null, (r34 & 4) != 0 ? r12.assetLogoUrl : null, (r34 & 8) != 0 ? r12.amount : null, (r34 & 16) != 0 ? r12.currencyCode : null, (r34 & 32) != 0 ? r12.cryptoAmount : null, (r34 & 64) != 0 ? r12.exchangeRate : null, (r34 & 128) != 0 ? r12.transactionFee : null, (r34 & 256) != 0 ? r12.totalAmount : null, (r34 & 512) != 0 ? r12.quoteId : null, (r34 & 1024) != 0 ? r12.showPaymentAccordion : false, (r34 & 2048) != 0 ? r12.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r12.availablePaymentOptions : null, (r34 & 8192) != 0 ? r12.selectedPaymentOption : null, (r34 & 16384) != 0 ? r12.currentStep : null, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value).isLoading : true);
                } while (!mutableStateFlow2.compareAndSet(value, copy));
                cryptoSellReviewUseCases = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = cryptoSellReviewUiState2;
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(selectedPaymentOption);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(quoteId);
                this.getHighSpeedVideoFpsRanges = 1;
                invoke$default = com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase.invoke$default(cryptoSellReviewUseCases.getExecuteTrade(), com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.SELL, selectedPaymentOption.getFundingOptionId(), quoteId, null, this, 8, null);
                if (invoke$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cryptoSellReviewUiState = cryptoSellReviewUiState2;
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Race condition: Sell Now clicked without a quote ID", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("current_step", cryptoSellReviewUiState2.getCurrentStep().toString()), kotlin.TuplesKt.to("available_payment_methods", kotlin.coroutines.jvm.internal.Boxing.boxInt(cryptoSellReviewUiState2.getAvailablePaymentOptions().size())), kotlin.TuplesKt.to("is_loading", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cryptoSellReviewUiState2.isLoading()))), null, 4, null);
                mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                mutableSharedFlow.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.ShowGenericError.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cryptoSellReviewUiState = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke$default = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke$default;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution cryptoTradeExecution = (com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow4 = cryptoSellReviewViewModel.getOutputMinFrameDuration;
            do {
                value3 = mutableStateFlow4.getValue();
                copy3 = r6.copy((r34 & 1) != 0 ? r6.assetSymbol : null, (r34 & 2) != 0 ? r6.titleAssetDisplayName : null, (r34 & 4) != 0 ? r6.assetLogoUrl : null, (r34 & 8) != 0 ? r6.amount : null, (r34 & 16) != 0 ? r6.currencyCode : null, (r34 & 32) != 0 ? r6.cryptoAmount : null, (r34 & 64) != 0 ? r6.exchangeRate : null, (r34 & 128) != 0 ? r6.transactionFee : null, (r34 & 256) != 0 ? r6.totalAmount : null, (r34 & 512) != 0 ? r6.quoteId : null, (r34 & 1024) != 0 ? r6.showPaymentAccordion : false, (r34 & 2048) != 0 ? r6.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r6.availablePaymentOptions : null, (r34 & 8192) != 0 ? r6.selectedPaymentOption : null, (r34 & 16384) != 0 ? r6.currentStep : com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.COMPLETED, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value3).isLoading : false);
            } while (!mutableStateFlow4.compareAndSet(value3, copy3));
            mutableSharedFlow4 = cryptoSellReviewViewModel.getInputSizeshNQ4ISI;
            java.lang.String id = cryptoTradeExecution.getId();
            java.lang.String assetSymbol = cryptoSellReviewUiState.getAssetSymbol();
            java.lang.String titleAssetDisplayName = cryptoSellReviewUiState.getTitleAssetDisplayName();
            java.lang.String assetLogoUrl = cryptoSellReviewUiState.getAssetLogoUrl();
            cryptoSellReviewFormatters = cryptoSellReviewViewModel.getHighSpeedVideoFpsRangesFor;
            java.lang.String formatCryptoAmount = cryptoSellReviewFormatters.getCryptoAmount().formatCryptoAmount(cryptoTradeExecution.getAssetQuantityTruncated());
            formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoSellReviewViewModel.getHighSpeedVideoFpsRangesFor.getCryptoPrice(), r1.getValue(), cryptoTradeExecution.getAmountFulfilled().getCurrencyCode(), null, false, false, 28, null);
            mutableSharedFlow4.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen(id, assetSymbol, titleAssetDisplayName, assetLogoUrl, formatCryptoAmount, formatPrice$default, cryptoTradeExecution.getStatus()));
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow3 = cryptoSellReviewViewModel.getOutputMinFrameDuration;
            do {
                value2 = mutableStateFlow3.getValue();
                copy2 = r4.copy((r34 & 1) != 0 ? r4.assetSymbol : null, (r34 & 2) != 0 ? r4.titleAssetDisplayName : null, (r34 & 4) != 0 ? r4.assetLogoUrl : null, (r34 & 8) != 0 ? r4.amount : null, (r34 & 16) != 0 ? r4.currencyCode : null, (r34 & 32) != 0 ? r4.cryptoAmount : null, (r34 & 64) != 0 ? r4.exchangeRate : null, (r34 & 128) != 0 ? r4.transactionFee : null, (r34 & 256) != 0 ? r4.totalAmount : null, (r34 & 512) != 0 ? r4.quoteId : null, (r34 & 1024) != 0 ? r4.showPaymentAccordion : false, (r34 & 2048) != 0 ? r4.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r4.availablePaymentOptions : null, (r34 & 8192) != 0 ? r4.selectedPaymentOption : null, (r34 & 16384) != 0 ? r4.currentStep : null, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value2).isLoading : false);
            } while (!mutableStateFlow3.compareAndSet(value2, copy2));
            mutableSharedFlow3 = cryptoSellReviewViewModel.getInputSizeshNQ4ISI;
            mutableSharedFlow3.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.ShowGenericError.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$handleSellNow$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$handleSellNow$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSellReviewViewModel$handleSellNow$1(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$handleSellNow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cryptoSellReviewViewModel;
    }
}
