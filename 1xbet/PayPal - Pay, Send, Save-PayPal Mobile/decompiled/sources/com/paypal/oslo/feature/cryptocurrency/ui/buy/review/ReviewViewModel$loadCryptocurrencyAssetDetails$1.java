package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadCryptocurrencyAssetDetails$1", f = "ReviewViewModel.kt", i = {0}, l = {386}, m = "invokeSuspend", n = {com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL}, nl = {my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class ReviewViewModel$loadCryptocurrencyAssetDetails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs reviewArgs;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase;
        java.lang.Object invoke$default;
        java.lang.String str;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            reviewArgs = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            java.lang.String assetSymbol = reviewArgs.getAssetSymbol();
            getAssetCurrentPriceUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
            this.getHighSpeedVideoFpsRanges = assetSymbol;
            this.getHighSpeedVideoFpsRangesFor = 1;
            invoke$default = com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase.invoke$default(getAssetCurrentPriceUseCase, assetSymbol, null, false, this, 2, null);
            if (invoke$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = assetSymbol;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke$default = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke$default;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails assetPriceDetails = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow2 = reviewViewModel.getInputSizeshNQ4ISI;
            do {
                value2 = mutableStateFlow2.getValue();
                copy2 = r6.copy((r37 & 1) != 0 ? r6.assetSymbol : null, (r37 & 2) != 0 ? r6.titleAssetDisplayName : assetPriceDetails.getAssetName(), (r37 & 4) != 0 ? r6.assetLogoUrl : assetPriceDetails.getLogoUrl(), (r37 & 8) != 0 ? r6.amount : null, (r37 & 16) != 0 ? r6.currencyCode : null, (r37 & 32) != 0 ? r6.cryptoAmount : null, (r37 & 64) != 0 ? r6.exchangeRate : null, (r37 & 128) != 0 ? r6.transactionFee : null, (r37 & 256) != 0 ? r6.totalAmount : null, (r37 & 512) != 0 ? r6.quoteId : null, (r37 & 1024) != 0 ? r6.accordionItems : null, (r37 & 2048) != 0 ? r6.currentStep : null, (r37 & 4096) != 0 ? r6.selectedRecurringOption : null, (r37 & 8192) != 0 ? r6.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r6.availablePaymentMethods : null, (r37 & 32768) != 0 ? r6.isLoading : false, (r37 & 65536) != 0 ? r6.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r6.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value2).pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow = reviewViewModel.getInputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
                copy = r4.copy((r37 & 1) != 0 ? r4.assetSymbol : null, (r37 & 2) != 0 ? r4.titleAssetDisplayName : str, (r37 & 4) != 0 ? r4.assetLogoUrl : null, (r37 & 8) != 0 ? r4.amount : null, (r37 & 16) != 0 ? r4.currencyCode : null, (r37 & 32) != 0 ? r4.cryptoAmount : null, (r37 & 64) != 0 ? r4.exchangeRate : null, (r37 & 128) != 0 ? r4.transactionFee : null, (r37 & 256) != 0 ? r4.totalAmount : null, (r37 & 512) != 0 ? r4.quoteId : null, (r37 & 1024) != 0 ? r4.accordionItems : null, (r37 & 2048) != 0 ? r4.currentStep : null, (r37 & 4096) != 0 ? r4.selectedRecurringOption : null, (r37 & 8192) != 0 ? r4.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r4.availablePaymentMethods : null, (r37 & 32768) != 0 ? r4.isLoading : false, (r37 & 65536) != 0 ? r4.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r4.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value).pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadCryptocurrencyAssetDetails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadCryptocurrencyAssetDetails$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$loadCryptocurrencyAssetDetails$1(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadCryptocurrencyAssetDetails$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = reviewViewModel;
    }
}
