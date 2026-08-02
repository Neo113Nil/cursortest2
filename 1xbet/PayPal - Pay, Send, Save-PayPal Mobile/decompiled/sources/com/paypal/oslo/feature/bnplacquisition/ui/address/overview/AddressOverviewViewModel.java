package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiMapper;", "uiMapper", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewReducer;Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiMapper;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewReducer;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiMapper;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiEffect;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressOverviewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewReducer getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState> uiState;

    @javax.inject.Inject
    public AddressOverviewViewModel(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewReducer addressOverviewReducer, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper addressOverviewUiMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressOverviewReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressOverviewUiMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = addressOverviewReducer;
        this.Camera2StreamConfigurationMap = addressOverviewUiMapper;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AddressOverviewViewModel.store", com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Loading.INSTANCE, addressOverviewReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.LoadAddresses) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel.this), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel.this, event, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(event);
    }
}
