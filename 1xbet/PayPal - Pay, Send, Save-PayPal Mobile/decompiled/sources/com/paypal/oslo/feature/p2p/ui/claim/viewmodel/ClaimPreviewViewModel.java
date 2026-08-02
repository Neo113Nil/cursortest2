package com.paypal.oslo.feature.p2p.ui.claim.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/viewmodel/ClaimPreviewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferUseCase;", "getPaymentTransferUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ClaimMoneyUseCase;", "claimMoneyUseCase", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/ClaimMoneyUseCase;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState;", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClaimPreviewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent, com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState> uiState;

    @javax.inject.Inject
    public ClaimPreviewViewModel(com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase getPaymentTransferUseCase, com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase claimMoneyUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentTransferUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimMoneyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent, com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ClaimPreviewViewModel.store", com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Loading.INSTANCE, com.paypal.oslo.feature.p2p.ui.claim.reducers.ClaimPreviewReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware(getPaymentTransferUseCase, claimMoneyUseCase, userStore)), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}
