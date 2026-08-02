package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/CurrencyConversionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/ExchangeRateToStringMapper;", "exchangeRateToStringMapper", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateCurrencyConversionProviderUseCase;", "updateCurrencyConversionProviderUseCase", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/mappers/ExchangeRateToStringMapper;Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateCurrencyConversionProviderUseCase;)V", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateCurrencyConversionProviderUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/ui/review/middlewares/FxQuoteLoadingMiddleware;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/ui/review/middlewares/FxQuoteLoadingMiddleware;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/CurrencyConversionUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/CurrencyConversionEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyConversionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState, com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent, com.paypal.oslo.feature.p2p.ui.review.effects.CurrencyConversionEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.review.middlewares.FxQuoteLoadingMiddleware getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.CurrencyConversionEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState> uiState;

    @javax.inject.Inject
    public CurrencyConversionViewModel(com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper exchangeRateToStringMapper, com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase updateCurrencyConversionProviderUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateToStringMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCurrencyConversionProviderUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = updateCurrencyConversionProviderUseCase;
        com.paypal.oslo.feature.p2p.ui.review.middlewares.FxQuoteLoadingMiddleware fxQuoteLoadingMiddleware = new com.paypal.oslo.feature.p2p.ui.review.middlewares.FxQuoteLoadingMiddleware(exchangeRateToStringMapper);
        this.getHighSpeedVideoFpsRanges = fxQuoteLoadingMiddleware;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState, com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent, com.paypal.oslo.feature.p2p.ui.review.effects.CurrencyConversionEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("CurrencyConversionViewModel.store", new com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState(null, null, null, null, null, false, null, 0, null, null, null, false, null, 8191, null), com.paypal.oslo.feature.p2p.ui.review.reducers.CurrencyConversionReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf(fxQuoteLoadingMiddleware), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.CurrencyConversionEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet)) {
            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CancelConversion)) {
                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption) {
                    com.paypal.oslo.feature.p2p.domain.model.ConversionOption option = ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption) event).getOption();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, this.uiState.getValue().getTransferAttemptId());
                    pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, option.name());
                    java.lang.String fxQuoteId = this.uiState.getValue().getFxQuoteId();
                    pairArr[2] = kotlin.TuplesKt.to("fxQuoteId", fxQuoteId != null ? fxQuoteId : "null");
                    com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CONVERSION_OPTION_SELECTED, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    this.getHighSpeedVideoSizes.onEvent(event);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion) {
                    com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion confirmConversion = (com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion) event;
                    com.paypal.oslo.feature.p2p.domain.model.ConversionOption option2 = confirmConversion.getOption();
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.p2p.LoggerKt.log;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[4];
                    pairArr2[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, this.uiState.getValue().getTransferAttemptId());
                    pairArr2[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, option2.name());
                    java.lang.String fxQuoteId2 = this.uiState.getValue().getFxQuoteId();
                    if (fxQuoteId2 == null) {
                        fxQuoteId2 = "null";
                    }
                    pairArr2[2] = kotlin.TuplesKt.to("fxQuoteId", fxQuoteId2);
                    java.lang.String conversionRate = this.uiState.getValue().getConversionRate();
                    pairArr2[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE, conversionRate != null ? conversionRate : "null");
                    com.paypal.android.logger.Logger.i$default(logger2, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CONVERSION_CONFIRMED, kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                    this.getHighSpeedVideoSizes.onEvent(event);
                    com.paypal.oslo.feature.p2p.domain.model.ConversionOption option3 = confirmConversion.getOption();
                    com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState value = this.uiState.getValue();
                    if (option3 == value.getCommittedOption()) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CONVERSION_PROVIDER_NO_CHANGE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, value.getTransferAttemptId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, option3.name())), null, 4, null);
                        return;
                    }
                    java.lang.String transferAttemptId = value.getTransferAttemptId();
                    java.lang.String paymentPlanId = value.getPaymentPlanId();
                    if (transferAttemptId.length() == 0 || paymentPlanId.length() == 0) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CONVERSION_PROVIDER_UPDATE_MISSING_IDS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, transferAttemptId), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_PLAN_ID, paymentPlanId)), null, 4, null);
                        return;
                    } else {
                        this.getHighSpeedVideoSizes.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateStarted.INSTANCE);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel$updateConversionProviderIfChanged$1(this, transferAttemptId, paymentPlanId, option3, null), 3, null);
                        return;
                    }
                }
                this.getHighSpeedVideoSizes.onEvent(event);
                return;
            }
            com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.p2p.LoggerKt.log;
            kotlin.Pair[] pairArr3 = new kotlin.Pair[3];
            pairArr3[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, this.uiState.getValue().getTransferAttemptId());
            pairArr3[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, this.uiState.getValue().getSelectedOption().name());
            pairArr3[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAD_FX_QUOTE, java.lang.String.valueOf(this.uiState.getValue().getFxQuoteId() != null));
            com.paypal.android.logger.Logger.i$default(logger3, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CONVERSION_CANCELLED, kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
            this.getHighSpeedVideoSizes.onEvent(event);
            return;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CONVERSION_SHEET_OPENED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, this.uiState.getValue().getTransferAttemptId())), null, 4, null);
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}
