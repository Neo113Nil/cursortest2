package com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010*R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020+0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010*R&\u00101\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020.0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020-028\u0007¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u00108\u001a\b\u0012\u0004\u0012\u00020.078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/viewmodel/CurrencyPickerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetCurrenciesUseCase;", "getCurrenciesUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetCryptosUseCase;", "getCryptosUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCurrencyDetailsUseCase;", "getCurrencyDetailsUseCase", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/mappers/P2PCurrencyItemToCurrencyItemMapper;", "currencyItemToCurrencyMapper", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/mappers/CryptoToItemStateMapper;", "cryptoToItemStateMapper", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "p2pFeatureGateManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/GetCurrenciesUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/GetCryptosUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/GetCurrencyDetailsUseCase;Lcom/paypal/oslo/feature/p2p/ui/currencypicker/mappers/P2PCurrencyItemToCurrencyItemMapper;Lcom/paypal/oslo/feature/p2p/ui/currencypicker/mappers/CryptoToItemStateMapper;Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;)V", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetCurrenciesUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetCryptosUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCurrencyDetailsUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/mappers/P2PCurrencyItemToCurrencyItemMapper;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/mappers/CryptoToItemStateMapper;", "getOutputFormats", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "Ljava/util/List;", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyPickerState;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect;", "getOutputSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputStallDuration", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyPickerViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.List<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem> getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.P2PCurrencyItemToCurrencyItemMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> getOutputMinFrameDuration;
    private final com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.CryptoToItemStateMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetCurrenciesUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getOutputFormats;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect> getOutputStallDuration;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public CurrencyPickerViewModel(com.paypal.oslo.feature.p2p.domain.usecase.GetCurrenciesUseCase getCurrenciesUseCase, com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase getCryptosUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase getCurrencyDetailsUseCase, com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.P2PCurrencyItemToCurrencyItemMapper p2PCurrencyItemToCurrencyItemMapper, com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.CryptoToItemStateMapper cryptoToItemStateMapper, com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCurrenciesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCryptosUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCurrencyDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PCurrencyItemToCurrencyItemMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoToItemStateMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pFeatureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = getCurrenciesUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getCryptosUseCase;
        this.Camera2StreamConfigurationMap = getCurrencyDetailsUseCase;
        this.getHighSpeedVideoSizes = p2PCurrencyItemToCurrencyItemMapper;
        this.getHighSpeedVideoFpsRangesFor = cryptoToItemStateMapper;
        this.getInputSizeshNQ4ISI = p2pFeatureGateManager;
        this.getOutputFormats = coroutineDispatcher;
        this.getOutputMinFrameDuration = kotlin.collections.CollectionsKt.emptyList();
        this.getInputFormats = kotlin.collections.CollectionsKt.emptyList();
        this.getHighSpeedVideoSizesFor = kotlin.collections.CollectionsKt.emptyList();
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("CurrencyPickerViewModel.store", new com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState(null, null, p2pFeatureGateManager.isCryptoPickerEnabled(), null, false, null, 59, null), com.paypal.oslo.feature.p2p.ui.currencypicker.reducers.CurrencyPickerReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$currencyLoadingMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCurrencies) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCurrencies) event).getTransferAttemptID(), input.getEventDispatcher(), null), 3, null);
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$cryptoLoadingMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if ((input.getEvent() instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCryptos) && input.getStates().getSecond().isCryptoEnabled()) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this, input.getEventDispatcher(), null), 3, null);
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$filteringMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged) {
                    com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged tabChanged = (com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged) event;
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CURRENCY_TAB_CHANGED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PREVIOUS_TAB, input.getStates().getFirst().getSelectedTab().name()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.NEW_TAB, tabChanged.getType().name())), null, 4, null);
                    com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.access$updateCurrencyList(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this, tabChanged.getType(), input.getEventDispatcher());
                } else if (event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CURRENCY_SEARCH_QUERY_CHANGED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.QUERY_LENGTH, java.lang.Integer.valueOf(((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged) event).getQuery().length())), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_QUERY, java.lang.Boolean.valueOf(!kotlin.text.StringsKt.isBlank(r0.getQuery()))), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENT_TAB, input.getStates().getSecond().getSelectedTab().name())), null, 4, null);
                } else if (event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoaded) {
                    com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.access$updateCurrencyList(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this, input.getStates().getSecond().getSelectedTab(), input.getEventDispatcher());
                } else if ((event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CryptosLoaded) && input.getStates().getSecond().getSelectedTab() == com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO) {
                    com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.access$updateCurrencyList(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO, input.getEventDispatcher());
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$currencySelectionMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked) {
                    com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.access$enrichCurrencyClickEvent(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked) event).getCurrencyId(), input.getEventDispatcher());
                }
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputStallDuration = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CURRENCY_PICKER_APPEARED, kotlin.collections.MapsKt.emptyMap(), null, 4, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_SELECTED_CURRENCY, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked) event).getCurrencyId())), null, 4, null);
        }
        this.getOutputStallDuration.onEvent(event);
    }

    public static final /* synthetic */ void access$enrichCurrencyClickEvent(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        java.lang.Object obj;
        java.util.Iterator<T> it = currencyPickerViewModel.getHighSpeedVideoSizesFor.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.p2p.domain.model.CurrencyItem) obj).getId(), str)) {
                    break;
                }
            }
        }
        com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem = (com.paypal.oslo.feature.p2p.domain.model.CurrencyItem) obj;
        if (currencyItem == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, "Currency not found in cache", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", str)), null, 4, null);
        } else {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, "Currency clicked with processor info", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", currencyItem.getCurrencyCode()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_PROCESSOR, currencyItem.getPaymentProcessor().name())), null, 4, null);
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClickedWithProcessor(currencyItem));
        }
    }

    public static final /* synthetic */ void access$logCryptoLoadError(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.lang.Throwable th) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "Unknown";
        }
        com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CRYPTO_LOAD_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName)), null, th, 4, null);
    }

    public static final /* synthetic */ void access$logCryptoLoadPartialFailure(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.lang.String str) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        if (str == null) {
            str = "Unknown";
        }
        com.paypal.android.logger.Logger.w$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CRYPTO_LOAD_PARTIAL_FAILURE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", str)), null, 4, null);
    }

    public static final /* synthetic */ void access$logCryptosLoadedWithErrors(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, int i, java.lang.String str) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CRYPTOS_COUNT, java.lang.Integer.valueOf(i));
        if (str == null) {
            str = "Unknown";
        }
        pairArr[1] = kotlin.TuplesKt.to("errorType", str);
        com.paypal.android.logger.Logger.w$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CRYPTOS_LOADED_WITH_ERRORS, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public static final /* synthetic */ void access$logCurrenciesLoadedWithErrors(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.lang.String str, int i, java.lang.String str2) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("attemptId", str);
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCIES_COUNT, java.lang.Integer.valueOf(i));
        if (str2 == null) {
            str2 = "Unknown";
        }
        pairArr[2] = kotlin.TuplesKt.to("errorType", str2);
        com.paypal.android.logger.Logger.w$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CURRENCIES_LOADED_WITH_ERRORS, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public static final /* synthetic */ void access$logCurrencyLoadError(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.lang.String str, java.lang.Throwable th) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("attemptId", str);
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "Unknown";
        }
        pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
        com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CURRENCY_LOAD_FAILED, kotlin.collections.MapsKt.mapOf(pairArr), null, th, 4, null);
    }

    public static final /* synthetic */ void access$logCurrencyLoadPartialFailure(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.lang.String str, java.lang.String str2) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("attemptId", str);
        if (str2 == null) {
            str2 = "Unknown";
        }
        pairArr[1] = kotlin.TuplesKt.to("errorType", str2);
        com.paypal.android.logger.Logger.w$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CURRENCY_LOAD_PARTIAL_FAILURE, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public static final /* synthetic */ void access$updateCurrencyList(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, kotlin.jvm.functions.Function1 function1) {
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list;
        int i = com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.WhenMappings.$EnumSwitchMapping$0[currencyType.ordinal()];
        if (i == 1) {
            list = currencyPickerViewModel.getOutputMinFrameDuration;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            list = currencyPickerViewModel.getInputFormats;
        }
        function1.invoke(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.UpdateDisplayedCurrencies(list));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
