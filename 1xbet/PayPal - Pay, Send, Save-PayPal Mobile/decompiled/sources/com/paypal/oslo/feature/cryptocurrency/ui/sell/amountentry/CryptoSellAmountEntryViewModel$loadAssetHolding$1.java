package com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel$loadAssetHolding$1", f = "CryptoSellAmountEntryViewModel.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, nl = {258}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoSellAmountEntryViewModel$loadAssetHolding$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase;
        java.lang.String str;
        java.lang.Object invoke$default;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        java.lang.String str2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy2;
        com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter;
        com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRateFormatter;
        java.lang.String str3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r28 & 1) != 0 ? r5.currentAmount : null, (r28 & 2) != 0 ? r5.currencyCode : null, (r28 & 4) != 0 ? r5.assetSymbol : null, (r28 & 8) != 0 ? r5.isLoading : true, (r28 & 16) != 0 ? r5.titleAssetDisplayName : null, (r28 & 32) != 0 ? r5.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r5.exchangeRateFormatted : null, (r28 & 128) != 0 ? r5.amountError : null, (r28 & 256) != 0 ? r5.holdingsError : null, (r28 & 512) != 0 ? r5.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r5.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r5.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) value).isSellAllMode : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            getAssetHoldingUseCase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            str = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = 1;
            invoke$default = com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase.invoke$default(getAssetHoldingUseCase, str, null, this, 2, null);
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
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel cryptoSellAmountEntryViewModel = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding cryptoHolding = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) ((arrow.core.Either.Right) either).getValue();
            cryptoPriceFormatter = cryptoSellAmountEntryViewModel.Camera2StreamConfigurationMap;
            java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoPriceFormatter, cryptoHolding.getFiatAmountValue(), cryptoHolding.getFiatAmountCurrencyCode(), null, false, false, 28, null);
            exchangeRateFormatter = cryptoSellAmountEntryViewModel.getHighSpeedVideoSizes;
            str3 = cryptoSellAmountEntryViewModel.getHighSpeedVideoFpsRangesFor;
            java.lang.String formatExchangeRate = exchangeRateFormatter.formatExchangeRate(str3, new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(cryptoHolding.getFiatPriceValue(), cryptoHolding.getFiatAmountCurrencyCode()));
            mutableStateFlow3 = cryptoSellAmountEntryViewModel.getOutputMinFrameDuration;
            do {
                value3 = mutableStateFlow3.getValue();
                copy3 = r12.copy((r28 & 1) != 0 ? r12.currentAmount : null, (r28 & 2) != 0 ? r12.currencyCode : null, (r28 & 4) != 0 ? r12.assetSymbol : null, (r28 & 8) != 0 ? r12.isLoading : false, (r28 & 16) != 0 ? r12.titleAssetDisplayName : cryptoHolding.getAssetName(), (r28 & 32) != 0 ? r12.maxSellableAmountFormatted : formatPrice$default, (r28 & 64) != 0 ? r12.exchangeRateFormatted : formatExchangeRate, (r28 & 128) != 0 ? r12.amountError : null, (r28 & 256) != 0 ? r12.holdingsError : null, (r28 & 512) != 0 ? r12.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r12.maxSellableAmountRaw : cryptoHolding.getFiatAmountValue(), (r28 & 2048) != 0 ? r12.maxSellableCryptoQuantity : cryptoHolding.getAssetQuantity(), (r28 & 4096) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) value3).isSellAllMode : false);
            } while (!mutableStateFlow3.compareAndSet(value3, copy3));
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = cryptoSellAmountEntryViewModel.getOutputMinFrameDuration;
            do {
                value2 = mutableStateFlow2.getValue();
                str2 = cryptoSellAmountEntryViewModel.getHighSpeedVideoFpsRangesFor;
                copy2 = r4.copy((r28 & 1) != 0 ? r4.currentAmount : null, (r28 & 2) != 0 ? r4.currencyCode : null, (r28 & 4) != 0 ? r4.assetSymbol : null, (r28 & 8) != 0 ? r4.isLoading : false, (r28 & 16) != 0 ? r4.titleAssetDisplayName : str2, (r28 & 32) != 0 ? r4.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r4.exchangeRateFormatted : null, (r28 & 128) != 0 ? r4.amountError : null, (r28 & 256) != 0 ? r4.holdingsError : null, (r28 & 512) != 0 ? r4.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r4.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r4.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) value2).isSellAllMode : false);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel$loadAssetHolding$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel$loadAssetHolding$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSellAmountEntryViewModel$loadAssetHolding$1(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel cryptoSellAmountEntryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel$loadAssetHolding$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cryptoSellAmountEntryViewModel;
    }
}
