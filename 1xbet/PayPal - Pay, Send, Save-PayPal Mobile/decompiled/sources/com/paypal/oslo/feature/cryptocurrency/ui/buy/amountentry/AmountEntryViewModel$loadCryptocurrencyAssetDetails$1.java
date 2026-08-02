package com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel$loadCryptocurrencyAssetDetails$1", f = "AmountEntryViewModel.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, nl = {78}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AmountEntryViewModel$loadCryptocurrencyAssetDetails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase;
        java.lang.String str;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        java.lang.String str2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getAssetCurrentPriceUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            str = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase.invoke$default(getAssetCurrentPriceUseCase, str, null, false, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel amountEntryViewModel = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails assetPriceDetails = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow2 = amountEntryViewModel.getInputFormats;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState) value2, null, null, null, assetPriceDetails.getAssetName(), null, 23, null)));
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow = amountEntryViewModel.getInputFormats;
            do {
                value = mutableStateFlow.getValue();
                str2 = amountEntryViewModel.getHighResolutionOutputSizeshNQ4ISI;
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState) value, null, null, null, str2, null, 23, null)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel$loadCryptocurrencyAssetDetails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel$loadCryptocurrencyAssetDetails$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountEntryViewModel$loadCryptocurrencyAssetDetails$1(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel amountEntryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel$loadCryptocurrencyAssetDetails$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = amountEntryViewModel;
    }
}
