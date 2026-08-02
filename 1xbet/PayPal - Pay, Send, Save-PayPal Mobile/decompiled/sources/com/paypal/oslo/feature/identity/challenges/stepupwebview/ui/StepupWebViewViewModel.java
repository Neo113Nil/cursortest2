package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/StepupWebViewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewReducer;", "reducer", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewReducer;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "initializeChallenge", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;)V", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEvent;", "event", "processEvent", "(Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEvent;)V", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "getTokenStorage", "()Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupWebViewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage tokenStorage;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState> uiState;

    @javax.inject.Inject
    public StepupWebViewViewModel(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewReducer stepupWebViewReducer, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupWebViewReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        this.tokenStorage = identityTokenStorage;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("StepupWebViewViewModel.store", com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Uninitialized.INSTANCE, stepupWebViewReducer, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(this));
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage getTokenStorage() {
        return this.tokenStorage;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void initializeChallenge(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        this.Camera2StreamConfigurationMap.onEvent(new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent.ChallengeInitialized(challenge));
    }

    public final void processEvent(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }
}
