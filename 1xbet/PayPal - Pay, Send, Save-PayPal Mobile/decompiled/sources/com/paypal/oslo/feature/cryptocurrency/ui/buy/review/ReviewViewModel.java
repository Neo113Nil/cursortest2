package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001BBC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010*\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00101R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u001c028\u0007¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00109R \u0010;\u001a\b\u0012\u0004\u0012\u0002080:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010A"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewArgs;", "args", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewUseCases;", "useCases", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewFormatters;", "formatters", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/mapper/PaymentMethodMapper;", "paymentMethodMapper", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;", "getAssetCurrentPriceUseCase", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewArgs;Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewUseCases;Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewFormatters;Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/mapper/PaymentMethodMapper;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "event", "", "handleEvent$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;)V", "handleBuyNow$cryptocurrency_prodRelease", "()V", "stopQuotePolling$cryptocurrency_prodRelease", "resumeQuotePollingIfNeeded$cryptocurrency_prodRelease", "onCleared", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewUiState;", "testState", "updateStateForTesting$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewUiState;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewArgs;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewUseCases;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewFormatters;", "getHighSpeedVideoSizes", "getOutputFormats", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/mapper/PaymentMethodMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/poll/QuotePollingManager;", "getInputFormats", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/poll/QuotePollingManager;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReviewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getHighSpeedVideoSizesFor;
    private final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getOutputFormats;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewViewModel$Factory;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewArgs;", "args", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewViewModel;", "create", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewArgs;)Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel create(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs args);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.assisted.AssistedInject
    public ReviewViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs reviewArgs, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases reviewUseCases, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters reviewFormatters, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper paymentMethodMapper, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase) {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem accordionItem;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewUseCases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewFormatters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetCurrentPriceUseCase, "");
        this.getHighSpeedVideoFpsRanges = reviewArgs;
        this.Camera2StreamConfigurationMap = featureGateManager;
        this.getHighSpeedVideoFpsRangesFor = reviewUseCases;
        this.getHighSpeedVideoSizes = reviewFormatters;
        this.getHighResolutionOutputSizeshNQ4ISI = paymentMethodMapper;
        this.getHighSpeedVideoSizesFor = currencyProvider;
        this.getOutputFormats = getAssetCurrentPriceUseCase;
        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(reviewFormatters.getCryptoPrice(), reviewArgs.getAmount(), currencyProvider.getCurrencyCode(), null, false, false, 28, null);
        java.lang.String assetSymbol = reviewArgs.getAssetSymbol();
        if (featureGateManager.isRecurringBuysEnabled()) {
            accordionItem = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS, true);
        } else {
            accordionItem = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD, true);
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState(assetSymbol, null, null, formatPrice$default, currencyProvider.getCurrencyCode(), "", null, null, null, null, kotlin.collections.CollectionsKt.listOf(accordionItem), accordionItem.getStep(), null, null, kotlin.collections.CollectionsKt.emptyList(), true, false, false, null, 459718, null));
        this.getInputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getOutputMinFrameDuration = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel = this;
        this.getInputFormats = new com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager(androidx.view.ViewModelKt.getViewModelScope(reviewViewModel), reviewUseCases.getPollQuote(), com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.BUY, reviewArgs.getAssetSymbol(), currencyProvider.getCurrencyCode(), reviewArgs.getAmount(), null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.m13770$r8$lambda$8OHDGKGDTdEArOs2ZJw3lUQswo(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.this, (com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote) obj);
            }
        }, 64, 0 == true ? 1 : 0);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(reviewViewModel), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadAvailablePaymentMethods$1(this, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(reviewViewModel), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadCryptocurrencyAssetDetails$1(this, null), 3, null);
        if (featureGateManager.isPyusdRewardsEnabled() && kotlin.jvm.internal.Intrinsics.areEqual(reviewArgs.getAssetSymbol(), "PYUSD")) {
            do {
                value = MutableStateFlow.getValue();
                copy = r10.copy((r37 & 1) != 0 ? r10.assetSymbol : null, (r37 & 2) != 0 ? r10.titleAssetDisplayName : null, (r37 & 4) != 0 ? r10.assetLogoUrl : null, (r37 & 8) != 0 ? r10.amount : null, (r37 & 16) != 0 ? r10.currencyCode : null, (r37 & 32) != 0 ? r10.cryptoAmount : null, (r37 & 64) != 0 ? r10.exchangeRate : null, (r37 & 128) != 0 ? r10.transactionFee : null, (r37 & 256) != 0 ? r10.totalAmount : null, (r37 & 512) != 0 ? r10.quoteId : null, (r37 & 1024) != 0 ? r10.accordionItems : null, (r37 & 2048) != 0 ? r10.currentStep : null, (r37 & 4096) != 0 ? r10.selectedRecurringOption : null, (r37 & 8192) != 0 ? r10.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r10.availablePaymentMethods : null, (r37 & 32768) != 0 ? r10.isLoading : true, (r37 & 65536) != 0 ? r10.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r10.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? value.pyusdRewardsFormattedRate : null);
            } while (!MutableStateFlow.compareAndSet(value, copy));
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(reviewViewModel), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$checkPyusdRewardsEligibility$2(this, null), 3, null);
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect> getEffect() {
        return this.effect;
    }

    public final void handleEvent$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent event) {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState value2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState value3;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy3;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState value4;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy4;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState value5;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BuyAmountClick.INSTANCE)) {
            this.getOutputMinFrameDuration.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect.NavigateBack.INSTANCE);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AccordionToggled) {
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep step = ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AccordionToggled) event).getStep();
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState value6 = this.getInputSizeshNQ4ISI.getValue();
            int i = com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.WhenMappings.$EnumSwitchMapping$0[step.ordinal()];
            if (i == 1) {
                if (value6.getCurrentStep() != com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS) {
                    stopQuotePolling$cryptocurrency_prodRelease();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState> mutableStateFlow = this.getInputSizeshNQ4ISI;
                    do {
                        value4 = mutableStateFlow.getValue();
                        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep reviewStep = com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS;
                        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                        createListBuilder.add(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS, true));
                        copy4 = r5.copy((r37 & 1) != 0 ? r5.assetSymbol : null, (r37 & 2) != 0 ? r5.titleAssetDisplayName : null, (r37 & 4) != 0 ? r5.assetLogoUrl : null, (r37 & 8) != 0 ? r5.amount : null, (r37 & 16) != 0 ? r5.currencyCode : null, (r37 & 32) != 0 ? r5.cryptoAmount : null, (r37 & 64) != 0 ? r5.exchangeRate : null, (r37 & 128) != 0 ? r5.transactionFee : null, (r37 & 256) != 0 ? r5.totalAmount : null, (r37 & 512) != 0 ? r5.quoteId : null, (r37 & 1024) != 0 ? r5.accordionItems : kotlin.collections.CollectionsKt.build(createListBuilder), (r37 & 2048) != 0 ? r5.currentStep : reviewStep, (r37 & 4096) != 0 ? r5.selectedRecurringOption : null, (r37 & 8192) != 0 ? r5.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r5.availablePaymentMethods : null, (r37 & 32768) != 0 ? r5.isLoading : false, (r37 & 65536) != 0 ? r5.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r5.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? value4.pyusdRewardsFormattedRate : null);
                    } while (!mutableStateFlow.compareAndSet(value4, copy4));
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return;
            } else {
                if (value6.getCurrentStep() != com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD) {
                    stopQuotePolling$cryptocurrency_prodRelease();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState> mutableStateFlow2 = this.getInputSizeshNQ4ISI;
                    do {
                        value5 = mutableStateFlow2.getValue();
                        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState = value5;
                        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep reviewStep2 = com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD;
                        java.util.List createListBuilder2 = kotlin.collections.CollectionsKt.createListBuilder();
                        if (this.Camera2StreamConfigurationMap.isRecurringBuysEnabled()) {
                            createListBuilder2.add(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS, false));
                        }
                        createListBuilder2.add(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD, true));
                        copy5 = reviewUiState.copy((r37 & 1) != 0 ? reviewUiState.assetSymbol : null, (r37 & 2) != 0 ? reviewUiState.titleAssetDisplayName : null, (r37 & 4) != 0 ? reviewUiState.assetLogoUrl : null, (r37 & 8) != 0 ? reviewUiState.amount : null, (r37 & 16) != 0 ? reviewUiState.currencyCode : null, (r37 & 32) != 0 ? reviewUiState.cryptoAmount : null, (r37 & 64) != 0 ? reviewUiState.exchangeRate : null, (r37 & 128) != 0 ? reviewUiState.transactionFee : null, (r37 & 256) != 0 ? reviewUiState.totalAmount : null, (r37 & 512) != 0 ? reviewUiState.quoteId : null, (r37 & 1024) != 0 ? reviewUiState.accordionItems : kotlin.collections.CollectionsKt.build(createListBuilder2), (r37 & 2048) != 0 ? reviewUiState.currentStep : reviewStep2, (r37 & 4096) != 0 ? reviewUiState.selectedRecurringOption : null, (r37 & 8192) != 0 ? reviewUiState.selectedPaymentMethod : null, (r37 & 16384) != 0 ? reviewUiState.availablePaymentMethods : null, (r37 & 32768) != 0 ? reviewUiState.isLoading : false, (r37 & 65536) != 0 ? reviewUiState.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? reviewUiState.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? reviewUiState.pyusdRewardsFormattedRate : null);
                    } while (!mutableStateFlow2.compareAndSet(value5, copy5));
                    return;
                }
                return;
            }
        }
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringOptionSelected) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState> mutableStateFlow3 = this.getInputSizeshNQ4ISI;
            do {
                value3 = mutableStateFlow3.getValue();
                copy3 = r4.copy((r37 & 1) != 0 ? r4.assetSymbol : null, (r37 & 2) != 0 ? r4.titleAssetDisplayName : null, (r37 & 4) != 0 ? r4.assetLogoUrl : null, (r37 & 8) != 0 ? r4.amount : null, (r37 & 16) != 0 ? r4.currencyCode : null, (r37 & 32) != 0 ? r4.cryptoAmount : null, (r37 & 64) != 0 ? r4.exchangeRate : null, (r37 & 128) != 0 ? r4.transactionFee : null, (r37 & 256) != 0 ? r4.totalAmount : null, (r37 & 512) != 0 ? r4.quoteId : null, (r37 & 1024) != 0 ? r4.accordionItems : null, (r37 & 2048) != 0 ? r4.currentStep : null, (r37 & 4096) != 0 ? r4.selectedRecurringOption : ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringOptionSelected) event).getOption(), (r37 & 8192) != 0 ? r4.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r4.availablePaymentMethods : null, (r37 & 32768) != 0 ? r4.isLoading : false, (r37 & 65536) != 0 ? r4.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r4.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? value3.pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow3.compareAndSet(value3, copy3));
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringContinueClick.INSTANCE)) {
            if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PaymentMethodSelected) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$handlePaymentMethodSelected$1(this, ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PaymentMethodSelected) event).getPaymentMethod(), null), 3, null);
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AddPaymentMethodClick.INSTANCE)) {
                this.getOutputMinFrameDuration.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect.NavigateToAddPaymentMethod.INSTANCE);
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BuyNowClick.INSTANCE)) {
                handleBuyNow$cryptocurrency_prodRelease();
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BackClick.INSTANCE)) {
                this.getOutputMinFrameDuration.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEffect.NavigateBack.INSTANCE);
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RefreshPaymentMethods.INSTANCE)) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$loadAvailablePaymentMethods$1(this, null), 3, null);
                return;
            }
            if (!(event instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PyusdRewardsToggleChange)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState> mutableStateFlow4 = this.getInputSizeshNQ4ISI;
            do {
                value = mutableStateFlow4.getValue();
                copy = r4.copy((r37 & 1) != 0 ? r4.assetSymbol : null, (r37 & 2) != 0 ? r4.titleAssetDisplayName : null, (r37 & 4) != 0 ? r4.assetLogoUrl : null, (r37 & 8) != 0 ? r4.amount : null, (r37 & 16) != 0 ? r4.currencyCode : null, (r37 & 32) != 0 ? r4.cryptoAmount : null, (r37 & 64) != 0 ? r4.exchangeRate : null, (r37 & 128) != 0 ? r4.transactionFee : null, (r37 & 256) != 0 ? r4.totalAmount : null, (r37 & 512) != 0 ? r4.quoteId : null, (r37 & 1024) != 0 ? r4.accordionItems : null, (r37 & 2048) != 0 ? r4.currentStep : null, (r37 & 4096) != 0 ? r4.selectedRecurringOption : null, (r37 & 8192) != 0 ? r4.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r4.availablePaymentMethods : null, (r37 & 32768) != 0 ? r4.isLoading : false, (r37 & 65536) != 0 ? r4.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r4.pyusdRewardsOptIn : ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PyusdRewardsToggleChange) event).getEnabled(), (r37 & 262144) != 0 ? value.pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow4.compareAndSet(value, copy));
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState> mutableStateFlow5 = this.getInputSizeshNQ4ISI;
        do {
            value2 = mutableStateFlow5.getValue();
            java.util.List createListBuilder3 = kotlin.collections.CollectionsKt.createListBuilder();
            createListBuilder3.add(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS, false));
            createListBuilder3.add(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD, true));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            copy2 = r5.copy((r37 & 1) != 0 ? r5.assetSymbol : null, (r37 & 2) != 0 ? r5.titleAssetDisplayName : null, (r37 & 4) != 0 ? r5.assetLogoUrl : null, (r37 & 8) != 0 ? r5.amount : null, (r37 & 16) != 0 ? r5.currencyCode : null, (r37 & 32) != 0 ? r5.cryptoAmount : null, (r37 & 64) != 0 ? r5.exchangeRate : null, (r37 & 128) != 0 ? r5.transactionFee : null, (r37 & 256) != 0 ? r5.totalAmount : null, (r37 & 512) != 0 ? r5.quoteId : null, (r37 & 1024) != 0 ? r5.accordionItems : kotlin.collections.CollectionsKt.build(createListBuilder3), (r37 & 2048) != 0 ? r5.currentStep : com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD, (r37 & 4096) != 0 ? r5.selectedRecurringOption : null, (r37 & 8192) != 0 ? r5.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r5.availablePaymentMethods : null, (r37 & 32768) != 0 ? r5.isLoading : false, (r37 & 65536) != 0 ? r5.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r5.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? value2.pyusdRewardsFormattedRate : null);
        } while (!mutableStateFlow5.compareAndSet(value2, copy2));
    }

    public final void handleBuyNow$cryptocurrency_prodRelease() {
        stopQuotePolling$cryptocurrency_prodRelease();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$handleBuyNow$1(this, null), 3, null);
    }

    public final void stopQuotePolling$cryptocurrency_prodRelease() {
        this.getInputFormats.stop();
    }

    public final void resumeQuotePollingIfNeeded$cryptocurrency_prodRelease() {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState value = this.getInputSizeshNQ4ISI.getValue();
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod selectedPaymentMethod = value.getSelectedPaymentMethod();
        java.lang.String fundingOptionId = selectedPaymentMethod != null ? selectedPaymentMethod.getFundingOptionId() : null;
        if (value.getCurrentStep() != com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.FINAL_REVIEW || fundingOptionId == null || this.getInputFormats.isActive()) {
            return;
        }
        this.getInputFormats.start(fundingOptionId);
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.getInputFormats.stop();
    }

    public final void updateStateForTesting$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState testState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testState, "");
        this.getInputSizeshNQ4ISI.setValue(testState);
    }

    /* renamed from: $r8$lambda$8OHDGKG-DTdEArOs2ZJw3lUQswo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13770$r8$lambda$8OHDGKGDTdEArOs2ZJw3lUQswo(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote cryptoQuote) {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoQuote, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState> mutableStateFlow = reviewViewModel.getInputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
            java.lang.String formatCryptoAmount = reviewViewModel.getHighSpeedVideoSizes.getCryptoAmount().formatCryptoAmount(cryptoQuote.getQuoteQuantity());
            java.lang.String formatExchangeRate = reviewViewModel.getHighSpeedVideoSizes.getExchangeRate().formatExchangeRate(reviewViewModel.getHighSpeedVideoFpsRanges.getAssetSymbol(), cryptoQuote.getAssetPrice());
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalFee = cryptoQuote.getTradeAmountBreakdown().getTotalFee();
            java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(reviewViewModel.getHighSpeedVideoSizes.getCryptoPrice(), totalFee.getValue(), totalFee.getCurrencyCode(), null, false, false, 28, null);
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalAmount = cryptoQuote.getTradeAmountBreakdown().getTotalAmount();
            copy = r4.copy((r37 & 1) != 0 ? r4.assetSymbol : null, (r37 & 2) != 0 ? r4.titleAssetDisplayName : null, (r37 & 4) != 0 ? r4.assetLogoUrl : null, (r37 & 8) != 0 ? r4.amount : null, (r37 & 16) != 0 ? r4.currencyCode : null, (r37 & 32) != 0 ? r4.cryptoAmount : formatCryptoAmount, (r37 & 64) != 0 ? r4.exchangeRate : formatExchangeRate, (r37 & 128) != 0 ? r4.transactionFee : formatPrice$default, (r37 & 256) != 0 ? r4.totalAmount : com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(reviewViewModel.getHighSpeedVideoSizes.getCryptoPrice(), totalAmount.getValue(), totalAmount.getCurrencyCode(), null, false, false, 28, null), (r37 & 512) != 0 ? r4.quoteId : cryptoQuote.getQuoteId(), (r37 & 1024) != 0 ? r4.accordionItems : null, (r37 & 2048) != 0 ? r4.currentStep : null, (r37 & 4096) != 0 ? r4.selectedRecurringOption : null, (r37 & 8192) != 0 ? r4.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r4.availablePaymentMethods : null, (r37 & 32768) != 0 ? r4.isLoading : false, (r37 & 65536) != 0 ? r4.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r4.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? value.pyusdRewardsFormattedRate : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.FINAL_REVIEW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.COMPLETED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
