package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001IBC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00101R\u0014\u0010,\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020 048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00105R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 078\u0007¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010=R \u0010@\u001a\b\u0012\u0004\u0012\u00020<0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0016\u00102\u001a\u0004\u0018\u00010D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010ER\u0014\u0010H\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010G"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewArgs;", "args", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewUseCases;", "useCases", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewFormatters;", "formatters", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/mapper/CryptoSellPaymentOptionMapper;", "paymentOptionMapper", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;", "getAssetCurrentPriceUseCase", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewArgs;Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewUseCases;Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewFormatters;Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/mapper/CryptoSellPaymentOptionMapper;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent;", "event", "", "handleEvent$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent;)V", "handleSellNow$cryptocurrency_prodRelease", "()V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "generateInitialQuote$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopQuotePolling$cryptocurrency_prodRelease", "resumeQuotePollingIfNeeded$cryptocurrency_prodRelease", "onCleared", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewUiState;", "uiState", "updateUiStateForTesting$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewUiState;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewArgs;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getHighSpeedVideoSizes", "getOutputStallDuration", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewUseCases;", "getOutputFormats", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewFormatters;", "getInputFormats", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/mapper/CryptoSellPaymentOptionMapper;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "", "Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/poll/QuotePollingManager;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/poll/QuotePollingManager;", "getOutputSizeshNQ4ISI", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSellReviewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect> getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager getOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewViewModel$Factory;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewArgs;", "args", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewViewModel;", "create", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewArgs;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel create(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs args);
    }

    @dagger.assisted.AssistedInject
    public CryptoSellReviewViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases cryptoSellReviewUseCases, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters cryptoSellReviewFormatters, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper cryptoSellPaymentOptionMapper, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase) {
        java.lang.String cryptoQuantity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewUseCases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewFormatters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellPaymentOptionMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetCurrentPriceUseCase, "");
        this.getHighSpeedVideoFpsRanges = cryptoSellReviewArgs;
        this.getHighSpeedVideoSizes = featureGateManager;
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoSellReviewUseCases;
        this.getHighSpeedVideoFpsRangesFor = cryptoSellReviewFormatters;
        this.Camera2StreamConfigurationMap = cryptoSellPaymentOptionMapper;
        this.getInputFormats = currencyProvider;
        this.getOutputFormats = getAssetCurrentPriceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState(cryptoSellReviewArgs.getAssetSymbol(), null, null, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoSellReviewFormatters.getCryptoPrice(), cryptoSellReviewArgs.getAmount(), currencyProvider.getCurrencyCode(), null, false, false, 28, null), currencyProvider.getCurrencyCode(), "", null, null, null, null, false, false, null, null, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.LOADING, true, 16326, null));
        this.getOutputMinFrameDuration = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getInputSizeshNQ4ISI = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        java.lang.String str = (!cryptoSellReviewArgs.isSellAll() || (cryptoQuantity = cryptoSellReviewArgs.getCryptoQuantity()) == null || kotlin.text.StringsKt.isBlank(cryptoQuantity)) ? null : cryptoQuantity;
        this.getHighSpeedVideoSizesFor = str;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel = this;
        this.getOutputSizeshNQ4ISI = new com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager(androidx.view.ViewModelKt.getViewModelScope(cryptoSellReviewViewModel), cryptoSellReviewUseCases.getPollQuote(), com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.SELL, cryptoSellReviewArgs.getAssetSymbol(), currencyProvider.getCurrencyCode(), cryptoSellReviewArgs.getAmount(), str, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.$r8$lambda$DKkuWTCnvM4jsr7FoyuyZFWxZYw(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.this, (com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote) obj);
            }
        });
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(cryptoSellReviewViewModel), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$loadCryptocurrencyAssetDetails$1(this, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(cryptoSellReviewViewModel), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$loadFundingOptionsAndQuote$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect> getEffect() {
        return this.effect;
    }

    public final void handleEvent$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent event) {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState value2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentAccordionToggled.INSTANCE)) {
            if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentOptionSelected) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$handlePaymentOptionSelected$1(this, ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentOptionSelected) event).getOption(), null), 3, null);
                return;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.CryptoSellNowClick.INSTANCE)) {
                handleSellNow$cryptocurrency_prodRelease();
                return;
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.BackClick.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getInputSizeshNQ4ISI.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateBack.INSTANCE);
                return;
            }
        }
        if (this.getOutputMinFrameDuration.getValue().isPaymentAccordionExpanded()) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState> mutableStateFlow = this.getOutputMinFrameDuration;
            do {
                value2 = mutableStateFlow.getValue();
                copy2 = r3.copy((r34 & 1) != 0 ? r3.assetSymbol : null, (r34 & 2) != 0 ? r3.titleAssetDisplayName : null, (r34 & 4) != 0 ? r3.assetLogoUrl : null, (r34 & 8) != 0 ? r3.amount : null, (r34 & 16) != 0 ? r3.currencyCode : null, (r34 & 32) != 0 ? r3.cryptoAmount : null, (r34 & 64) != 0 ? r3.exchangeRate : null, (r34 & 128) != 0 ? r3.transactionFee : null, (r34 & 256) != 0 ? r3.totalAmount : null, (r34 & 512) != 0 ? r3.quoteId : null, (r34 & 1024) != 0 ? r3.showPaymentAccordion : false, (r34 & 2048) != 0 ? r3.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r3.availablePaymentOptions : null, (r34 & 8192) != 0 ? r3.selectedPaymentOption : null, (r34 & 16384) != 0 ? r3.currentStep : null, (r34 & 32768) != 0 ? value2.isLoading : false);
            } while (!mutableStateFlow.compareAndSet(value2, copy2));
            return;
        }
        stopQuotePolling$cryptocurrency_prodRelease();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState> mutableStateFlow2 = this.getOutputMinFrameDuration;
        do {
            value = mutableStateFlow2.getValue();
            copy = r3.copy((r34 & 1) != 0 ? r3.assetSymbol : null, (r34 & 2) != 0 ? r3.titleAssetDisplayName : null, (r34 & 4) != 0 ? r3.assetLogoUrl : null, (r34 & 8) != 0 ? r3.amount : null, (r34 & 16) != 0 ? r3.currencyCode : null, (r34 & 32) != 0 ? r3.cryptoAmount : null, (r34 & 64) != 0 ? r3.exchangeRate : null, (r34 & 128) != 0 ? r3.transactionFee : null, (r34 & 256) != 0 ? r3.totalAmount : null, (r34 & 512) != 0 ? r3.quoteId : null, (r34 & 1024) != 0 ? r3.showPaymentAccordion : false, (r34 & 2048) != 0 ? r3.isPaymentAccordionExpanded : true, (r34 & 4096) != 0 ? r3.availablePaymentOptions : null, (r34 & 8192) != 0 ? r3.selectedPaymentOption : null, (r34 & 16384) != 0 ? r3.currentStep : com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.PAYMENT_SELECTION, (r34 & 32768) != 0 ? value.isLoading : false);
        } while (!mutableStateFlow2.compareAndSet(value, copy));
    }

    public final void handleSellNow$cryptocurrency_prodRelease() {
        stopQuotePolling$cryptocurrency_prodRelease();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$handleSellNow$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object generateInitialQuote$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$generateInitialQuote$1 cryptoSellReviewViewModel$generateInitialQuote$1;
        int i;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption2;
        arrow.core.Either either;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState value2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy2;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$generateInitialQuote$1) {
            cryptoSellReviewViewModel$generateInitialQuote$1 = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$generateInitialQuote$1) continuation;
            if ((cryptoSellReviewViewModel$generateInitialQuote$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cryptoSellReviewViewModel$generateInitialQuote$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$generateInitialQuote$1 cryptoSellReviewViewModel$generateInitialQuote$12 = cryptoSellReviewViewModel$generateInitialQuote$1;
                java.lang.Object obj = cryptoSellReviewViewModel$generateInitialQuote$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoSellReviewViewModel$generateInitialQuote$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuote = this.getHighResolutionOutputSizeshNQ4ISI.getGenerateQuote();
                    com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction = com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.SELL;
                    java.lang.String assetSymbol = this.getHighSpeedVideoFpsRanges.getAssetSymbol();
                    java.lang.String currencyCode = this.getInputFormats.getCurrencyCode();
                    java.lang.String fundingOptionId = cryptoSellPaymentOption.getFundingOptionId();
                    java.lang.String amount = this.getHighSpeedVideoFpsRanges.getAmount();
                    java.lang.String str = this.getHighSpeedVideoSizesFor;
                    cryptoSellReviewViewModel$generateInitialQuote$12.getHighResolutionOutputSizeshNQ4ISI = cryptoSellPaymentOption;
                    cryptoSellReviewViewModel$generateInitialQuote$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = generateQuote.invoke(cryptoTradeAction, assetSymbol, currencyCode, fundingOptionId, amount, str, cryptoSellReviewViewModel$generateInitialQuote$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cryptoSellPaymentOption2 = cryptoSellPaymentOption;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cryptoSellPaymentOption2 = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption) cryptoSellReviewViewModel$generateInitialQuote$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote cryptoQuote = (com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState> mutableStateFlow = this.getOutputMinFrameDuration;
                    do {
                        value2 = mutableStateFlow.getValue();
                        java.lang.String formatCryptoAmount = this.getHighSpeedVideoFpsRangesFor.getCryptoAmount().formatCryptoAmount(cryptoQuote.getQuoteQuantity());
                        java.lang.String formatExchangeRate = this.getHighSpeedVideoFpsRangesFor.getExchangeRate().formatExchangeRate(this.getHighSpeedVideoFpsRanges.getAssetSymbol(), cryptoQuote.getAssetPrice());
                        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalFee = cryptoQuote.getTradeAmountBreakdown().getTotalFee();
                        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.getHighSpeedVideoFpsRangesFor.getCryptoPrice(), totalFee.getValue(), totalFee.getCurrencyCode(), null, false, false, 28, null);
                        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalAmount = cryptoQuote.getTradeAmountBreakdown().getTotalAmount();
                        copy2 = r3.copy((r34 & 1) != 0 ? r3.assetSymbol : null, (r34 & 2) != 0 ? r3.titleAssetDisplayName : null, (r34 & 4) != 0 ? r3.assetLogoUrl : null, (r34 & 8) != 0 ? r3.amount : null, (r34 & 16) != 0 ? r3.currencyCode : null, (r34 & 32) != 0 ? r3.cryptoAmount : formatCryptoAmount, (r34 & 64) != 0 ? r3.exchangeRate : formatExchangeRate, (r34 & 128) != 0 ? r3.transactionFee : formatPrice$default, (r34 & 256) != 0 ? r3.totalAmount : com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.getHighSpeedVideoFpsRangesFor.getCryptoPrice(), totalAmount.getValue(), totalAmount.getCurrencyCode(), null, false, false, 28, null), (r34 & 512) != 0 ? r3.quoteId : cryptoQuote.getQuoteId(), (r34 & 1024) != 0 ? r3.showPaymentAccordion : false, (r34 & 2048) != 0 ? r3.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r3.availablePaymentOptions : null, (r34 & 8192) != 0 ? r3.selectedPaymentOption : cryptoSellPaymentOption2, (r34 & 16384) != 0 ? r3.currentStep : com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.FINAL_REVIEW, (r34 & 32768) != 0 ? value2.isLoading : false);
                    } while (!mutableStateFlow.compareAndSet(value2, copy2));
                    this.getOutputSizeshNQ4ISI.start(cryptoSellPaymentOption2.getFundingOptionId());
                } else if (either instanceof arrow.core.Either.Left) {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState> mutableStateFlow2 = this.getOutputMinFrameDuration;
                    do {
                        value = mutableStateFlow2.getValue();
                        copy = r3.copy((r34 & 1) != 0 ? r3.assetSymbol : null, (r34 & 2) != 0 ? r3.titleAssetDisplayName : null, (r34 & 4) != 0 ? r3.assetLogoUrl : null, (r34 & 8) != 0 ? r3.amount : null, (r34 & 16) != 0 ? r3.currencyCode : null, (r34 & 32) != 0 ? r3.cryptoAmount : null, (r34 & 64) != 0 ? r3.exchangeRate : null, (r34 & 128) != 0 ? r3.transactionFee : null, (r34 & 256) != 0 ? r3.totalAmount : null, (r34 & 512) != 0 ? r3.quoteId : null, (r34 & 1024) != 0 ? r3.showPaymentAccordion : false, (r34 & 2048) != 0 ? r3.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r3.availablePaymentOptions : null, (r34 & 8192) != 0 ? r3.selectedPaymentOption : null, (r34 & 16384) != 0 ? r3.currentStep : null, (r34 & 32768) != 0 ? value.isLoading : false);
                    } while (!mutableStateFlow2.compareAndSet(value, copy));
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getInputSizeshNQ4ISI.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.ShowGenericError.INSTANCE));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        cryptoSellReviewViewModel$generateInitialQuote$1 = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$generateInitialQuote$1(this, continuation);
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel$generateInitialQuote$1 cryptoSellReviewViewModel$generateInitialQuote$122 = cryptoSellReviewViewModel$generateInitialQuote$1;
        java.lang.Object obj2 = cryptoSellReviewViewModel$generateInitialQuote$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoSellReviewViewModel$generateInitialQuote$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void stopQuotePolling$cryptocurrency_prodRelease() {
        this.getOutputSizeshNQ4ISI.stop();
    }

    public final void resumeQuotePollingIfNeeded$cryptocurrency_prodRelease() {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState value = this.getOutputMinFrameDuration.getValue();
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption selectedPaymentOption = value.getSelectedPaymentOption();
        java.lang.String fundingOptionId = selectedPaymentOption != null ? selectedPaymentOption.getFundingOptionId() : null;
        if (value.getCurrentStep() != com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.FINAL_REVIEW || fundingOptionId == null || this.getOutputSizeshNQ4ISI.isActive()) {
            return;
        }
        this.getOutputSizeshNQ4ISI.start(fundingOptionId);
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.getOutputSizeshNQ4ISI.stop();
    }

    public final void updateUiStateForTesting$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState uiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiState, "");
        this.getOutputMinFrameDuration.setValue(uiState);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DKkuWTCnvM4jsr7FoyuyZFWxZYw(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel, com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote cryptoQuote) {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoQuote, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState> mutableStateFlow = cryptoSellReviewViewModel.getOutputMinFrameDuration;
        do {
            value = mutableStateFlow.getValue();
            java.lang.String formatCryptoAmount = cryptoSellReviewViewModel.getHighSpeedVideoFpsRangesFor.getCryptoAmount().formatCryptoAmount(cryptoQuote.getQuoteQuantity());
            java.lang.String formatExchangeRate = cryptoSellReviewViewModel.getHighSpeedVideoFpsRangesFor.getExchangeRate().formatExchangeRate(cryptoSellReviewViewModel.getHighSpeedVideoFpsRanges.getAssetSymbol(), cryptoQuote.getAssetPrice());
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalFee = cryptoQuote.getTradeAmountBreakdown().getTotalFee();
            java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoSellReviewViewModel.getHighSpeedVideoFpsRangesFor.getCryptoPrice(), totalFee.getValue(), totalFee.getCurrencyCode(), null, false, false, 28, null);
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalAmount = cryptoQuote.getTradeAmountBreakdown().getTotalAmount();
            copy = r4.copy((r34 & 1) != 0 ? r4.assetSymbol : null, (r34 & 2) != 0 ? r4.titleAssetDisplayName : null, (r34 & 4) != 0 ? r4.assetLogoUrl : null, (r34 & 8) != 0 ? r4.amount : null, (r34 & 16) != 0 ? r4.currencyCode : null, (r34 & 32) != 0 ? r4.cryptoAmount : formatCryptoAmount, (r34 & 64) != 0 ? r4.exchangeRate : formatExchangeRate, (r34 & 128) != 0 ? r4.transactionFee : formatPrice$default, (r34 & 256) != 0 ? r4.totalAmount : com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoSellReviewViewModel.getHighSpeedVideoFpsRangesFor.getCryptoPrice(), totalAmount.getValue(), totalAmount.getCurrencyCode(), null, false, false, 28, null), (r34 & 512) != 0 ? r4.quoteId : cryptoQuote.getQuoteId(), (r34 & 1024) != 0 ? r4.showPaymentAccordion : false, (r34 & 2048) != 0 ? r4.isPaymentAccordionExpanded : false, (r34 & 4096) != 0 ? r4.availablePaymentOptions : null, (r34 & 8192) != 0 ? r4.selectedPaymentOption : null, (r34 & 16384) != 0 ? r4.currentStep : null, (r34 & 32768) != 0 ? value.isLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return kotlin.Unit.INSTANCE;
    }
}
