package com.paypal.oslo.feature.qrc.ui.getpaid;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidReducer;", "reducer", "Lcom/paypal/oslo/feature/qrc/domain/usecase/GenerateQrCodeUseCase;", "generateQrCodeUseCase", "Lcom/paypal/oslo/feature/qrc/domain/usecase/LoadPayPalLogoBitmapUseCase;", "loadPayPalLogoBitmapUseCase", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidReducer;Lcom/paypal/oslo/feature/qrc/domain/usecase/GenerateQrCodeUseCase;Lcom/paypal/oslo/feature/qrc/domain/usecase/LoadPayPalLogoBitmapUseCase;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;", "event", "", "handleIntent", "(Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidReducer;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/qrc/domain/usecase/GenerateQrCodeUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/qrc/domain/usecase/LoadPayPalLogoBitmapUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiState;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetPaidViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState> uiState;

    @javax.inject.Inject
    public GetPaidViewModel(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer getPaidReducer, com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase generateQrCodeUseCase, com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase loadPayPalLogoBitmapUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateQrCodeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadPayPalLogoBitmapUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.Camera2StreamConfigurationMap = getPaidReducer;
        this.getHighSpeedVideoFpsRanges = generateQrCodeUseCase;
        this.getHighSpeedVideoSizes = loadPayPalLogoBitmapUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("GetPaidViewModel.store", com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Initial.INSTANCE, getPaidReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent>() { // from class: com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$qrCodeGenerationMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                kotlin.Pair<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState> states = input.getStates();
                com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState component1 = states.component1();
                com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState component2 = states.component2();
                com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.LoadScreen) {
                    if ((component2 instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content) && (component1 instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Initial)) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$loadUserDetailsAndGenerateQrCode$1(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel.this, null), 3, null);
                        return;
                    }
                    return;
                }
                if ((event instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.UserDetailsLoaded) && (component2 instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$generateQrCode$1(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel.this, ((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content) component2).getUiModel(), null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void handleIntent(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(event);
    }
}
