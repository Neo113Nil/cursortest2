package com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00010B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020)0+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/amountentry/AmountEntryViewModel;", "Landroidx/lifecycle/ViewModel;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;", "getAssetCurrentPriceUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateBuyAmountUseCase;", "validateBuyAmountUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "priceFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateBuyAmountUseCase;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/amountentry/model/AmountEntryEvent;", "event", "", "handleEvent", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/amountentry/model/AmountEntryEvent;)V", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateBuyAmountUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/amountentry/model/AmountEntryUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/amountentry/model/AmountEntryEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AmountEntryViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> getInputFormats;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/amountentry/AmountEntryViewModel$Factory;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/amountentry/AmountEntryViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/amountentry/AmountEntryViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel create(java.lang.String assetSymbol);
    }

    @dagger.assisted.AssistedInject
    public AmountEntryViewModel(@dagger.assisted.Assisted java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase validateBuyAmountUseCase, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetCurrentPriceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateBuyAmountUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = getAssetCurrentPriceUseCase;
        this.getHighSpeedVideoFpsRangesFor = validateBuyAmountUseCase;
        this.getHighSpeedVideoSizes = cryptoPriceFormatter;
        this.getHighSpeedVideoFpsRanges = currencyProvider;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState("0", currencyProvider.getCurrencyCode(), str, null, null, 24, null));
        this.getInputFormats = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getHighSpeedVideoSizesFor = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel$loadCryptocurrencyAssetDetails$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect> getEffect() {
        return this.effect;
    }

    public final void handleEvent(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEvent event) {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState value2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState value3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEvent.AmountChange) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> mutableStateFlow = this.getInputFormats;
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value3, com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState.copy$default(value3, ((com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEvent.AmountChange) event).getAmount(), null, null, null, null, 14, null)));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEvent.BackButtonClick.INSTANCE)) {
            this.getHighSpeedVideoSizesFor.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect.NavigateBack.INSTANCE);
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEvent.NextButtonClick.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String currentAmount = this.uiState.getValue().getCurrentAmount();
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.BuyAmountValidationResult invoke = this.getHighSpeedVideoFpsRangesFor.invoke(currentAmount);
        if (invoke instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.BuyAmountValidationResult.Valid) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> mutableStateFlow2 = this.getInputFormats;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState.copy$default(value2, null, null, null, null, null, 15, null)));
            this.getHighSpeedVideoSizesFor.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect.NavigateToNextScreen(currentAmount));
            return;
        }
        if (!(invoke instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.BuyAmountValidationResult.BelowMinimum)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter = this.getHighSpeedVideoSizes;
        java.lang.String plainString = ((com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.BuyAmountValidationResult.BelowMinimum) invoke).getMinimumAmount().toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoPriceFormatter, plainString, this.getHighSpeedVideoFpsRanges.getCurrencyCode(), null, false, false, 12, null);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> mutableStateFlow3 = this.getInputFormats;
        do {
            value = mutableStateFlow3.getValue();
        } while (!mutableStateFlow3.compareAndSet(value, com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState.copy$default(value, null, null, null, null, formatPrice$default, 15, null)));
    }
}
