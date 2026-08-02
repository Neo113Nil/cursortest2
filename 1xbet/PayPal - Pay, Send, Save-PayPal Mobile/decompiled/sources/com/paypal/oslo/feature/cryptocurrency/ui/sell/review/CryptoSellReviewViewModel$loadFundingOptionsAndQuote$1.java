package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$loadFundingOptionsAndQuote$1", f = "CryptoSellReviewViewModel.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, 311}, m = "invokeSuspend", n = {"this_$iv", "fundingOptions", "paymentOptions", "defaultOption", "allFundingSources", "$i$f$fold", "$i$a$-fold-CryptoSellReviewViewModel$loadFundingOptionsAndQuote$1$3", "hasBothOptions", "isSellToPyusdEnabled"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, 313}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "Z$0", "I$2"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoSellReviewViewModel$loadFundingOptionsAndQuote$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0134, code lost:
    
        if (r5.generateInitialQuote$cryptocurrency_prodRelease(r11, r30) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01bc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        if (r2 != r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases cryptoSellReviewUseCases;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs2;
        com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider;
        java.lang.String str;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper cryptoSellPaymentOptionMapper;
        com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper cryptoSellPaymentOptionMapper2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper cryptoSellPaymentOptionMapper3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getOutputStallDurationlomOqCM.getOutputMinFrameDuration;
            do {
                value = mutableStateFlow.getValue();
                copy = r6.copy((r34 & 1) != 0 ? r6.assetSymbol : null, (r34 & 2) != 0 ? r6.titleAssetDisplayName : null, (r34 & 4) != 0 ? r6.assetLogoUrl : null, (r34 & 8) != 0 ? r6.amount : null, (r34 & 16) != 0 ? r6.currencyCode : null, (r34 & 32) != 0 ? r6.cryptoAmount : null, (r34 & 64) != 0 ? r6.exchangeRate : null, (r34 & 128) != 0 ? r6.transactionFee : null, (r34 & 256) != 0 ? r6.totalAmount : null, (r34 & 512) != 0 ? r6.quoteId : null, (r34 & 1024) != 0 ? r6.showPaymentAccordion : false, (r34 & 2048) != 0 ? r6.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r6.availablePaymentOptions : null, (r34 & 8192) != 0 ? r6.selectedPaymentOption : null, (r34 & 16384) != 0 ? r6.currentStep : null, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value).isLoading : true);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            cryptoSellReviewUseCases = this.getOutputStallDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase evaluateEligibleFundingOptions = cryptoSellReviewUseCases.getEvaluateEligibleFundingOptions();
            com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction = com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.SELL;
            cryptoSellReviewArgs = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges;
            java.lang.String assetSymbol = cryptoSellReviewArgs.getAssetSymbol();
            cryptoSellReviewArgs2 = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges;
            java.lang.String amount = cryptoSellReviewArgs2.getAmount();
            currencyProvider = this.getOutputStallDurationlomOqCM.getInputFormats;
            java.lang.String currencyCode = currencyProvider.getCurrencyCode();
            str = this.getOutputStallDurationlomOqCM.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = 1;
            invoke = evaluateEligibleFundingOptions.invoke(cryptoTradeAction, assetSymbol, amount, currencyCode, str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel = this.getOutputStallDurationlomOqCM;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption) it.next()).getFundingSources());
            }
            java.util.ArrayList arrayList2 = arrayList;
            cryptoSellPaymentOptionMapper = cryptoSellReviewViewModel.Camera2StreamConfigurationMap;
            boolean hasBothBalanceAndPyusd = cryptoSellPaymentOptionMapper.hasBothBalanceAndPyusd(arrayList2);
            featureGateManager = cryptoSellReviewViewModel.getHighSpeedVideoSizes;
            int i2 = (featureGateManager.isSellToPyusdEnabled() && hasBothBalanceAndPyusd) ? 1 : 0;
            cryptoSellPaymentOptionMapper2 = cryptoSellReviewViewModel.Camera2StreamConfigurationMap;
            java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption> transform = cryptoSellPaymentOptionMapper2.transform(arrayList2);
            cryptoSellPaymentOptionMapper3 = cryptoSellReviewViewModel.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption balanceOption = cryptoSellPaymentOptionMapper3.getBalanceOption(arrayList2);
            if (balanceOption == null || i2 != 0) {
                mutableStateFlow3 = cryptoSellReviewViewModel.getOutputMinFrameDuration;
                do {
                    value3 = mutableStateFlow3.getValue();
                    copy3 = r11.copy((r34 & 1) != 0 ? r11.assetSymbol : null, (r34 & 2) != 0 ? r11.titleAssetDisplayName : null, (r34 & 4) != 0 ? r11.assetLogoUrl : null, (r34 & 8) != 0 ? r11.amount : null, (r34 & 16) != 0 ? r11.currencyCode : null, (r34 & 32) != 0 ? r11.cryptoAmount : null, (r34 & 64) != 0 ? r11.exchangeRate : null, (r34 & 128) != 0 ? r11.transactionFee : null, (r34 & 256) != 0 ? r11.totalAmount : null, (r34 & 512) != 0 ? r11.quoteId : null, (r34 & 1024) != 0 ? r11.showPaymentAccordion : true, (r34 & 2048) != 0 ? r11.isPaymentAccordionExpanded : true, (r34 & 4096) != 0 ? r11.availablePaymentOptions : transform, (r34 & 8192) != 0 ? r11.selectedPaymentOption : null, (r34 & 16384) != 0 ? r11.currentStep : com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.PAYMENT_SELECTION, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value3).isLoading : false);
                } while (!mutableStateFlow3.compareAndSet(value3, copy3));
            } else {
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transform);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceOption);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList2);
                this.Camera2StreamConfigurationMap = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getInputFormats = hasBothBalanceAndPyusd;
                this.getHighSpeedVideoFpsRanges = i2;
                this.getHighSpeedVideoSizesFor = 2;
            }
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = cryptoSellReviewViewModel.getOutputMinFrameDuration;
            do {
                value2 = mutableStateFlow2.getValue();
                copy2 = r6.copy((r34 & 1) != 0 ? r6.assetSymbol : null, (r34 & 2) != 0 ? r6.titleAssetDisplayName : null, (r34 & 4) != 0 ? r6.assetLogoUrl : null, (r34 & 8) != 0 ? r6.amount : null, (r34 & 16) != 0 ? r6.currencyCode : null, (r34 & 32) != 0 ? r6.cryptoAmount : null, (r34 & 64) != 0 ? r6.exchangeRate : null, (r34 & 128) != 0 ? r6.transactionFee : null, (r34 & 256) != 0 ? r6.totalAmount : null, (r34 & 512) != 0 ? r6.quoteId : null, (r34 & 1024) != 0 ? r6.showPaymentAccordion : false, (r34 & 2048) != 0 ? r6.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r6.availablePaymentOptions : null, (r34 & 8192) != 0 ? r6.selectedPaymentOption : null, (r34 & 16384) != 0 ? r6.currentStep : null, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) value2).isLoading : false);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
            mutableSharedFlow = cryptoSellReviewViewModel.getInputSizeshNQ4ISI;
            mutableSharedFlow.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.ShowGenericError.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$loadFundingOptionsAndQuote$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$loadFundingOptionsAndQuote$1(this.getOutputStallDurationlomOqCM, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSellReviewViewModel$loadFundingOptionsAndQuote$1(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$loadFundingOptionsAndQuote$1> continuation) {
        super(2, continuation);
        this.getOutputStallDurationlomOqCM = cryptoSellReviewViewModel;
    }
}
