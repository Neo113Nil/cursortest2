package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$loadCryptocurrencyAssetDetails$1", f = "CryptoSellReviewViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoSellReviewViewModel$loadCryptocurrencyAssetDetails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs;
        java.lang.Object invoke$default;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getAssetCurrentPriceUseCase = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
            cryptoSellReviewArgs = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = 1;
            invoke$default = com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase.invoke$default(getAssetCurrentPriceUseCase, cryptoSellReviewArgs.getAssetSymbol(), null, false, this, 2, null);
            if (invoke$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke$default = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke$default;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails assetPriceDetails = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow2 = cryptoSellReviewViewModel.getOutputMinFrameDuration;
            do {
                value2 = mutableStateFlow2.getValue();
                copy2 = r5.copy((r34 & 1) != 0 ? r5.assetSymbol : null, (r34 & 2) != 0 ? r5.titleAssetDisplayName : assetPriceDetails.getAssetName(), (r34 & 4) != 0 ? r5.assetLogoUrl : assetPriceDetails.getLogoUrl(), (r34 & 8) != 0 ? r5.amount : null, (r34 & 16) != 0 ? r5.currencyCode : null, (r34 & 32) != 0 ? r5.cryptoAmount : null, (r34 & 64) != 0 ? r5.exchangeRate : null, (r34 & 128) != 0 ? r5.transactionFee : null, (r34 & 256) != 0 ? r5.totalAmount : null, (r34 & 512) != 0 ? r5.quoteId : null, (r34 & 1024) != 0 ? r5.showPaymentAccordion : false, (r34 & 2048) != 0 ? r5.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r5.availablePaymentOptions : null, (r34 & 8192) != 0 ? r5.selectedPaymentOption : null, (r34 & 16384) != 0 ? r5.currentStep : null, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value2).isLoading : false);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow = cryptoSellReviewViewModel.getOutputMinFrameDuration;
            do {
                value = mutableStateFlow.getValue();
                cryptoSellReviewArgs2 = cryptoSellReviewViewModel.getHighSpeedVideoFpsRanges;
                copy = r4.copy((r34 & 1) != 0 ? r4.assetSymbol : null, (r34 & 2) != 0 ? r4.titleAssetDisplayName : cryptoSellReviewArgs2.getAssetSymbol(), (r34 & 4) != 0 ? r4.assetLogoUrl : null, (r34 & 8) != 0 ? r4.amount : null, (r34 & 16) != 0 ? r4.currencyCode : null, (r34 & 32) != 0 ? r4.cryptoAmount : null, (r34 & 64) != 0 ? r4.exchangeRate : null, (r34 & 128) != 0 ? r4.transactionFee : null, (r34 & 256) != 0 ? r4.totalAmount : null, (r34 & 512) != 0 ? r4.quoteId : null, (r34 & 1024) != 0 ? r4.showPaymentAccordion : false, (r34 & 2048) != 0 ? r4.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r4.availablePaymentOptions : null, (r34 & 8192) != 0 ? r4.selectedPaymentOption : null, (r34 & 16384) != 0 ? r4.currentStep : null, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value).isLoading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$loadCryptocurrencyAssetDetails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$loadCryptocurrencyAssetDetails$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSellReviewViewModel$loadCryptocurrencyAssetDetails$1(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$loadCryptocurrencyAssetDetails$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cryptoSellReviewViewModel;
    }
}
