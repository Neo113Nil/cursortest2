package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadAvailablePaymentMethods$1", f = "ReviewViewModel.kt", i = {}, l = {483}, m = "invokeSuspend", n = {}, nl = {488}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ReviewViewModel$loadAvailablePaymentMethods$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases reviewUseCases;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs reviewArgs;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs reviewArgs2;
        com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper paymentMethodMapper;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r37 & 1) != 0 ? r5.assetSymbol : null, (r37 & 2) != 0 ? r5.titleAssetDisplayName : null, (r37 & 4) != 0 ? r5.assetLogoUrl : null, (r37 & 8) != 0 ? r5.amount : null, (r37 & 16) != 0 ? r5.currencyCode : null, (r37 & 32) != 0 ? r5.cryptoAmount : null, (r37 & 64) != 0 ? r5.exchangeRate : null, (r37 & 128) != 0 ? r5.transactionFee : null, (r37 & 256) != 0 ? r5.totalAmount : null, (r37 & 512) != 0 ? r5.quoteId : null, (r37 & 1024) != 0 ? r5.accordionItems : null, (r37 & 2048) != 0 ? r5.currentStep : null, (r37 & 4096) != 0 ? r5.selectedRecurringOption : null, (r37 & 8192) != 0 ? r5.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r5.availablePaymentMethods : null, (r37 & 32768) != 0 ? r5.isLoading : true, (r37 & 65536) != 0 ? r5.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r5.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value).pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            reviewUseCases = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase evaluateEligibleFundingOptions = reviewUseCases.getEvaluateEligibleFundingOptions();
            com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction = com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.BUY;
            reviewArgs = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            java.lang.String assetSymbol = reviewArgs.getAssetSymbol();
            reviewArgs2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            java.lang.String amount = reviewArgs2.getAmount();
            currencyProvider = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
            java.lang.String currencyCode = currencyProvider.getCurrencyCode();
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            invoke = evaluateEligibleFundingOptions.invoke(cryptoTradeAction, assetSymbol, amount, (r16 & 8) != 0 ? null : currencyCode, (r16 & 16) != 0 ? null : null, this);
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
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption) it.next()).getFundingSources());
            }
            paymentMethodMapper = reviewViewModel.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod> transform = paymentMethodMapper.transform(arrayList);
            mutableStateFlow3 = reviewViewModel.getInputSizeshNQ4ISI;
            do {
                value3 = mutableStateFlow3.getValue();
                copy3 = r4.copy((r37 & 1) != 0 ? r4.assetSymbol : null, (r37 & 2) != 0 ? r4.titleAssetDisplayName : null, (r37 & 4) != 0 ? r4.assetLogoUrl : null, (r37 & 8) != 0 ? r4.amount : null, (r37 & 16) != 0 ? r4.currencyCode : null, (r37 & 32) != 0 ? r4.cryptoAmount : null, (r37 & 64) != 0 ? r4.exchangeRate : null, (r37 & 128) != 0 ? r4.transactionFee : null, (r37 & 256) != 0 ? r4.totalAmount : null, (r37 & 512) != 0 ? r4.quoteId : null, (r37 & 1024) != 0 ? r4.accordionItems : null, (r37 & 2048) != 0 ? r4.currentStep : null, (r37 & 4096) != 0 ? r4.selectedRecurringOption : null, (r37 & 8192) != 0 ? r4.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r4.availablePaymentMethods : transform, (r37 & 32768) != 0 ? r4.isLoading : false, (r37 & 65536) != 0 ? r4.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r4.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value3).pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow3.compareAndSet(value3, copy3));
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = reviewViewModel.getInputSizeshNQ4ISI;
            do {
                value2 = mutableStateFlow2.getValue();
                copy2 = r4.copy((r37 & 1) != 0 ? r4.assetSymbol : null, (r37 & 2) != 0 ? r4.titleAssetDisplayName : null, (r37 & 4) != 0 ? r4.assetLogoUrl : null, (r37 & 8) != 0 ? r4.amount : null, (r37 & 16) != 0 ? r4.currencyCode : null, (r37 & 32) != 0 ? r4.cryptoAmount : null, (r37 & 64) != 0 ? r4.exchangeRate : null, (r37 & 128) != 0 ? r4.transactionFee : null, (r37 & 256) != 0 ? r4.totalAmount : null, (r37 & 512) != 0 ? r4.quoteId : null, (r37 & 1024) != 0 ? r4.accordionItems : null, (r37 & 2048) != 0 ? r4.currentStep : null, (r37 & 4096) != 0 ? r4.selectedRecurringOption : null, (r37 & 8192) != 0 ? r4.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r4.availablePaymentMethods : kotlin.collections.CollectionsKt.emptyList(), (r37 & 32768) != 0 ? r4.isLoading : false, (r37 & 65536) != 0 ? r4.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r4.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value2).pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
            mutableSharedFlow = reviewViewModel.getOutputMinFrameDuration;
            mutableSharedFlow.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect.ShowGenericError.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadAvailablePaymentMethods$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadAvailablePaymentMethods$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$loadAvailablePaymentMethods$1(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadAvailablePaymentMethods$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = reviewViewModel;
    }
}
