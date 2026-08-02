package com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00018BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R \u00104\u001a\b\u0012\u0004\u0012\u000201038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/CryptoSellAmountEntryViewModel;", "Landroidx/lifecycle/ViewModel;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;", "getAssetHoldingUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/ExchangeRateFormatter;", "exchangeRateFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "cryptoPriceFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateSellAmountUseCase;", "validateSellAmountUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateSellAllAmountUseCase;", "validateSellAllAmountUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/ExchangeRateFormatter;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateSellAmountUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateSellAllAmountUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEvent;", "event", "", "handleEvent", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getInputFormats", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/ExchangeRateFormatter;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateSellAmountUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateSellAllAmountUseCase;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSellAmountEntryViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect> getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAllAmountUseCase getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/CryptoSellAmountEntryViewModel$Factory;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/CryptoSellAmountEntryViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/CryptoSellAmountEntryViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel create(java.lang.String assetSymbol);
    }

    @dagger.assisted.AssistedInject
    public CryptoSellAmountEntryViewModel(@dagger.assisted.Assisted java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRateFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase validateSellAmountUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAllAmountUseCase validateSellAllAmountUseCase, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetHoldingUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateSellAmountUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateSellAllAmountUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = getAssetHoldingUseCase;
        this.getHighSpeedVideoSizes = exchangeRateFormatter;
        this.Camera2StreamConfigurationMap = cryptoPriceFormatter;
        this.getHighSpeedVideoFpsRanges = validateSellAmountUseCase;
        this.getOutputFormats = validateSellAllAmountUseCase;
        this.getInputSizeshNQ4ISI = currencyProvider;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState("0", currencyProvider.getCurrencyCode(), str, false, null, null, null, null, null, false, null, null, false, 8184, null));
        this.getOutputMinFrameDuration = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getInputFormats = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel$loadAssetHolding$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect> getEffect() {
        return this.effect;
    }

    public final void handleEvent(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent event) {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy;
        java.math.BigDecimal bigDecimalOrNull;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value3;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy3;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value4;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy4;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value5;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy5;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value6;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy6;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value7;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy7;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value8;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy8;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value9;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy9;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value10;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy10;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState value11;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        boolean z = true;
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.AmountChange) {
            com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.AmountChange amountChange = (com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.AmountChange) event;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(amountChange.getAmount(), "0") && amountChange.getAmount().length() != 0) {
                z = false;
            }
            boolean z2 = z;
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow = this.getOutputMinFrameDuration;
            do {
                value11 = mutableStateFlow.getValue();
                copy11 = r5.copy((r28 & 1) != 0 ? r5.currentAmount : amountChange.getAmount(), (r28 & 2) != 0 ? r5.currencyCode : null, (r28 & 4) != 0 ? r5.assetSymbol : null, (r28 & 8) != 0 ? r5.isLoading : false, (r28 & 16) != 0 ? r5.titleAssetDisplayName : null, (r28 & 32) != 0 ? r5.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r5.exchangeRateFormatted : null, (r28 & 128) != 0 ? r5.amountError : null, (r28 & 256) != 0 ? r5.holdingsError : null, (r28 & 512) != 0 ? r5.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r5.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r5.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value11.isSellAllMode : z2);
            } while (!mutableStateFlow.compareAndSet(value11, copy11));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.BackButtonClick.INSTANCE)) {
            this.getInputFormats.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateBack.INSTANCE);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.CtaButtonClick.INSTANCE)) {
            if (this.uiState.getValue().isSellAllMode()) {
                java.lang.String maxSellableAmountRaw = this.uiState.getValue().getMaxSellableAmountRaw();
                com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult invoke = this.getOutputFormats.invoke(maxSellableAmountRaw);
                if (invoke instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.Valid) {
                    this.getInputFormats.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen(this.getHighSpeedVideoFpsRangesFor, maxSellableAmountRaw, true, this.uiState.getValue().getMaxSellableCryptoQuantity()));
                    return;
                }
                if (!(invoke instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.BelowMinimum)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter = this.Camera2StreamConfigurationMap;
                java.lang.String plainString = ((com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.BelowMinimum) invoke).getMinimumAmount().toPlainString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
                java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoPriceFormatter, plainString, this.getInputSizeshNQ4ISI.getCurrencyCode(), null, false, false, 28, null);
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow2 = this.getOutputMinFrameDuration;
                do {
                    value10 = mutableStateFlow2.getValue();
                    copy10 = r12.copy((r28 & 1) != 0 ? r12.currentAmount : null, (r28 & 2) != 0 ? r12.currencyCode : null, (r28 & 4) != 0 ? r12.assetSymbol : null, (r28 & 8) != 0 ? r12.isLoading : false, (r28 & 16) != 0 ? r12.titleAssetDisplayName : null, (r28 & 32) != 0 ? r12.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r12.exchangeRateFormatted : null, (r28 & 128) != 0 ? r12.amountError : formatPrice$default, (r28 & 256) != 0 ? r12.holdingsError : null, (r28 & 512) != 0 ? r12.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r12.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r12.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value10.isSellAllMode : false);
                } while (!mutableStateFlow2.compareAndSet(value10, copy10));
                return;
            }
            java.lang.String currentAmount = this.uiState.getValue().getCurrentAmount();
            java.lang.String maxSellableAmountRaw2 = this.uiState.getValue().getMaxSellableAmountRaw();
            java.math.BigDecimal bigDecimalOrNull2 = kotlin.text.StringsKt.toBigDecimalOrNull(maxSellableAmountRaw2);
            if (bigDecimalOrNull2 == null) {
                bigDecimalOrNull2 = java.math.BigDecimal.ZERO;
            }
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase validateSellAmountUseCase = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull2);
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult invoke2 = validateSellAmountUseCase.invoke(currentAmount, bigDecimalOrNull2);
            if (invoke2 instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.Valid) {
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow3 = this.getOutputMinFrameDuration;
                do {
                    value9 = mutableStateFlow3.getValue();
                    copy9 = r6.copy((r28 & 1) != 0 ? r6.currentAmount : null, (r28 & 2) != 0 ? r6.currencyCode : null, (r28 & 4) != 0 ? r6.assetSymbol : null, (r28 & 8) != 0 ? r6.isLoading : false, (r28 & 16) != 0 ? r6.titleAssetDisplayName : null, (r28 & 32) != 0 ? r6.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r6.exchangeRateFormatted : null, (r28 & 128) != 0 ? r6.amountError : null, (r28 & 256) != 0 ? r6.holdingsError : null, (r28 & 512) != 0 ? r6.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r6.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r6.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value9.isSellAllMode : false);
                } while (!mutableStateFlow3.compareAndSet(value9, copy9));
                this.getInputFormats.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen(this.getHighSpeedVideoFpsRangesFor, currentAmount, false, null, 12, null));
                return;
            }
            if (invoke2 instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum) {
                com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter2 = this.Camera2StreamConfigurationMap;
                java.lang.String plainString2 = ((com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum) invoke2).getMinimumAmount().toPlainString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString2, "");
                java.lang.String formatPrice$default2 = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoPriceFormatter2, plainString2, this.getInputSizeshNQ4ISI.getCurrencyCode(), null, false, false, 28, null);
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow4 = this.getOutputMinFrameDuration;
                do {
                    value8 = mutableStateFlow4.getValue();
                    copy8 = r16.copy((r28 & 1) != 0 ? r16.currentAmount : null, (r28 & 2) != 0 ? r16.currencyCode : null, (r28 & 4) != 0 ? r16.assetSymbol : null, (r28 & 8) != 0 ? r16.isLoading : false, (r28 & 16) != 0 ? r16.titleAssetDisplayName : null, (r28 & 32) != 0 ? r16.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r16.exchangeRateFormatted : null, (r28 & 128) != 0 ? r16.amountError : formatPrice$default2, (r28 & 256) != 0 ? r16.holdingsError : null, (r28 & 512) != 0 ? r16.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r16.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r16.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value8.isSellAllMode : false);
                } while (!mutableStateFlow4.compareAndSet(value8, copy8));
                return;
            }
            if (invoke2 instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.NearHoldings) {
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow5 = this.getOutputMinFrameDuration;
                do {
                    value7 = mutableStateFlow5.getValue();
                    copy7 = r3.copy((r28 & 1) != 0 ? r3.currentAmount : null, (r28 & 2) != 0 ? r3.currencyCode : null, (r28 & 4) != 0 ? r3.assetSymbol : null, (r28 & 8) != 0 ? r3.isLoading : false, (r28 & 16) != 0 ? r3.titleAssetDisplayName : null, (r28 & 32) != 0 ? r3.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r3.exchangeRateFormatted : null, (r28 & 128) != 0 ? r3.amountError : null, (r28 & 256) != 0 ? r3.holdingsError : null, (r28 & 512) != 0 ? r3.showSellAllConfirmation : true, (r28 & 1024) != 0 ? r3.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r3.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value7.isSellAllMode : false);
                } while (!mutableStateFlow5.compareAndSet(value7, copy7));
                return;
            }
            if (!(invoke2 instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.ExceedsHoldings)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String formatPrice$default3 = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.Camera2StreamConfigurationMap, maxSellableAmountRaw2, this.getInputSizeshNQ4ISI.getCurrencyCode(), null, false, false, 28, null);
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow6 = this.getOutputMinFrameDuration;
            do {
                value6 = mutableStateFlow6.getValue();
                copy6 = r14.copy((r28 & 1) != 0 ? r14.currentAmount : null, (r28 & 2) != 0 ? r14.currencyCode : null, (r28 & 4) != 0 ? r14.assetSymbol : null, (r28 & 8) != 0 ? r14.isLoading : false, (r28 & 16) != 0 ? r14.titleAssetDisplayName : null, (r28 & 32) != 0 ? r14.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r14.exchangeRateFormatted : null, (r28 & 128) != 0 ? r14.amountError : null, (r28 & 256) != 0 ? r14.holdingsError : formatPrice$default3, (r28 & 512) != 0 ? r14.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r14.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r14.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value6.isSellAllMode : false);
            } while (!mutableStateFlow6.compareAndSet(value6, copy6));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.SellAllConfirm.INSTANCE)) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow7 = this.getOutputMinFrameDuration;
            do {
                value5 = mutableStateFlow7.getValue();
                copy5 = r5.copy((r28 & 1) != 0 ? r5.currentAmount : null, (r28 & 2) != 0 ? r5.currencyCode : null, (r28 & 4) != 0 ? r5.assetSymbol : null, (r28 & 8) != 0 ? r5.isLoading : false, (r28 & 16) != 0 ? r5.titleAssetDisplayName : null, (r28 & 32) != 0 ? r5.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r5.exchangeRateFormatted : null, (r28 & 128) != 0 ? r5.amountError : null, (r28 & 256) != 0 ? r5.holdingsError : null, (r28 & 512) != 0 ? r5.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r5.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r5.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value5.isSellAllMode : false);
            } while (!mutableStateFlow7.compareAndSet(value5, copy5));
            this.getInputFormats.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen(this.getHighSpeedVideoFpsRangesFor, this.uiState.getValue().getMaxSellableAmountRaw(), true, this.uiState.getValue().getMaxSellableCryptoQuantity()));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.SellAllDismiss.INSTANCE)) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow8 = this.getOutputMinFrameDuration;
            do {
                value4 = mutableStateFlow8.getValue();
                copy4 = r3.copy((r28 & 1) != 0 ? r3.currentAmount : null, (r28 & 2) != 0 ? r3.currencyCode : null, (r28 & 4) != 0 ? r3.assetSymbol : null, (r28 & 8) != 0 ? r3.isLoading : false, (r28 & 16) != 0 ? r3.titleAssetDisplayName : null, (r28 & 32) != 0 ? r3.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r3.exchangeRateFormatted : null, (r28 & 128) != 0 ? r3.amountError : null, (r28 & 256) != 0 ? r3.holdingsError : null, (r28 & 512) != 0 ? r3.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r3.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r3.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value4.isSellAllMode : false);
            } while (!mutableStateFlow8.compareAndSet(value4, copy4));
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.SellAllDialogNo.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow9 = this.getOutputMinFrameDuration;
        do {
            value = mutableStateFlow9.getValue();
            copy = r3.copy((r28 & 1) != 0 ? r3.currentAmount : null, (r28 & 2) != 0 ? r3.currencyCode : null, (r28 & 4) != 0 ? r3.assetSymbol : null, (r28 & 8) != 0 ? r3.isLoading : false, (r28 & 16) != 0 ? r3.titleAssetDisplayName : null, (r28 & 32) != 0 ? r3.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r3.exchangeRateFormatted : null, (r28 & 128) != 0 ? r3.amountError : null, (r28 & 256) != 0 ? r3.holdingsError : null, (r28 & 512) != 0 ? r3.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r3.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r3.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value.isSellAllMode : false);
        } while (!mutableStateFlow9.compareAndSet(value, copy));
        java.lang.String currentAmount2 = this.uiState.getValue().getCurrentAmount();
        java.lang.String maxSellableAmountRaw3 = this.uiState.getValue().getMaxSellableAmountRaw();
        java.math.BigDecimal bigDecimalOrNull3 = kotlin.text.StringsKt.toBigDecimalOrNull(maxSellableAmountRaw3);
        if (bigDecimalOrNull3 == null || (bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(currentAmount2)) == null) {
            return;
        }
        if (bigDecimalOrNull.compareTo(bigDecimalOrNull3) > 0) {
            java.lang.String formatPrice$default4 = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.Camera2StreamConfigurationMap, maxSellableAmountRaw3, this.getInputSizeshNQ4ISI.getCurrencyCode(), null, false, false, 28, null);
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow10 = this.getOutputMinFrameDuration;
            do {
                value3 = mutableStateFlow10.getValue();
                copy3 = r13.copy((r28 & 1) != 0 ? r13.currentAmount : null, (r28 & 2) != 0 ? r13.currencyCode : null, (r28 & 4) != 0 ? r13.assetSymbol : null, (r28 & 8) != 0 ? r13.isLoading : false, (r28 & 16) != 0 ? r13.titleAssetDisplayName : null, (r28 & 32) != 0 ? r13.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r13.exchangeRateFormatted : null, (r28 & 128) != 0 ? r13.amountError : null, (r28 & 256) != 0 ? r13.holdingsError : formatPrice$default4, (r28 & 512) != 0 ? r13.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r13.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r13.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value3.isSellAllMode : false);
            } while (!mutableStateFlow10.compareAndSet(value3, copy3));
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState> mutableStateFlow11 = this.getOutputMinFrameDuration;
        do {
            value2 = mutableStateFlow11.getValue();
            copy2 = r5.copy((r28 & 1) != 0 ? r5.currentAmount : null, (r28 & 2) != 0 ? r5.currencyCode : null, (r28 & 4) != 0 ? r5.assetSymbol : null, (r28 & 8) != 0 ? r5.isLoading : false, (r28 & 16) != 0 ? r5.titleAssetDisplayName : null, (r28 & 32) != 0 ? r5.maxSellableAmountFormatted : null, (r28 & 64) != 0 ? r5.exchangeRateFormatted : null, (r28 & 128) != 0 ? r5.amountError : null, (r28 & 256) != 0 ? r5.holdingsError : null, (r28 & 512) != 0 ? r5.showSellAllConfirmation : false, (r28 & 1024) != 0 ? r5.maxSellableAmountRaw : null, (r28 & 2048) != 0 ? r5.maxSellableCryptoQuantity : null, (r28 & 4096) != 0 ? value2.isSellAllMode : false);
        } while (!mutableStateFlow11.compareAndSet(value2, copy2));
        this.getInputFormats.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen(this.getHighSpeedVideoFpsRangesFor, currentAmount2, false, null, 12, null));
    }
}
