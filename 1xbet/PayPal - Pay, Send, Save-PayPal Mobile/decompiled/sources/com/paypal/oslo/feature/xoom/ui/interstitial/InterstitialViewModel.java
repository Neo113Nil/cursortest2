package com.paypal.oslo.feature.xoom.ui.interstitial;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialReducer;", "reducer", "Lcom/paypal/oslo/feature/xoom/domain/usecase/SetUserAgreementAcceptedUseCase;", "setUserAgreementAcceptedUseCase", "<init>", "(Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialReducer;Lcom/paypal/oslo/feature/xoom/domain/usecase/SetUserAgreementAcceptedUseCase;)V", "Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialEvent;)V", "onAgreeAndContinueClick", "()V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/xoom/domain/usecase/SetUserAgreementAcceptedUseCase;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialUiState;", "Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InterstitialViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState, com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialEvent, com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiEffect> getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState> uiState;

    @javax.inject.Inject
    public InterstitialViewModel(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialReducer interstitialReducer, com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase setUserAgreementAcceptedUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setUserAgreementAcceptedUseCase, "");
        this.getHighSpeedVideoSizes = setUserAgreementAcceptedUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState, com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialEvent, com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("InterstitialViewModel.store", com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState.Initial.INSTANCE, interstitialReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState, com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialEvent>() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState, com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (input.getEvent() instanceof com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialEvent.AgreeAndContinue) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel.this), null, null, new com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel.this, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }

    public final void onAgreeAndContinueClick() {
        processEvent(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialEvent.AgreeAndContinue.INSTANCE);
    }
}
