package com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/viewmodel/VerificationSuccessViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/reducer/VerificationSuccessReducer;", "reducer", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/reducer/VerificationSuccessReducer;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/contract/VerificationSuccessEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/contract/VerificationSuccessEvent;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/contract/VerificationSuccessUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/contract/VerificationSuccessUiEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationSuccessViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiState> uiState;

    @javax.inject.Inject
    public VerificationSuccessViewModel(com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer verificationSuccessReducer, androidx.view.SavedStateHandle savedStateHandle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationSuccessReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("VerificationSuccessViewModel.store", com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiState.Initial.INSTANCE, verificationSuccessReducer, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.verificationcapture.ui.util.MviObservabilityMiddlewareKt.createObservabilityMiddleware("Verification success")), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        java.lang.String str = (java.lang.String) savedStateHandle.get("verificationId");
        processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessEvent.Initialize(str != null ? str : ""));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}
