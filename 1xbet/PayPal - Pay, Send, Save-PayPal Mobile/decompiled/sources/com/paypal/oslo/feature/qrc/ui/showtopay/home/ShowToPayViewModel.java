package com.paypal.oslo.feature.qrc.ui.showtopay.home;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010&\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayReducer;", "reducer", "Lcom/paypal/oslo/feature/qrc/domain/scanner/LocationMatcher;", "locationMatcher", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayReducer;Lcom/paypal/oslo/feature/qrc/domain/scanner/LocationMatcher;)V", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "event", "", "handleEvent", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;)V", "", "latitude", "longitude", "detectCountryFromLocation", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/qrc/domain/scanner/LocationMatcher;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiState;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "", "p0", "detectedCountryCode", "Ljava/lang/String;", "getDetectedCountryCode", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShowToPayViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private java.lang.String detectedCountryCode;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState> uiState;

    @javax.inject.Inject
    public ShowToPayViewModel(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer showToPayReducer, com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher locationMatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showToPayReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationMatcher, "");
        this.getHighSpeedVideoSizes = locationMatcher;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ShowToPayViewModel.store", com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Initial.INSTANCE, showToPayReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent>() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (input.getEvent() instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CheckLocation) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel$sideEffectsMiddleware$1$invoke$1(input, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel.this, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighResolutionOutputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void handleEvent(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onEvent(event);
    }

    public final java.lang.String getDetectedCountryCode() {
        return this.detectedCountryCode;
    }

    public final void detectCountryFromLocation(java.lang.Double latitude, java.lang.Double longitude) {
        this.detectedCountryCode = this.getHighSpeedVideoSizes.getCountryCodeByLocation(latitude, longitude);
    }
}
