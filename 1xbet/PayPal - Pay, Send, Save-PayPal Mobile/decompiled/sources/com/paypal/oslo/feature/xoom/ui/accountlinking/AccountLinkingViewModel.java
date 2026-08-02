package com.paypal.oslo.feature.xoom.ui.accountlinking;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingReducer;", "reducer", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateAccountLinkingInitialUrlUseCase;", "createAccountLinkingInitialUrlUseCase", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase;", "createWebViewHeadersUseCase", "<init>", "(Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingReducer;Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateAccountLinkingInitialUrlUseCase;Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase;)V", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent;)V", "onLoad", "()V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateAccountLinkingInitialUrlUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiState;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccountLinkingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState> uiState;

    @javax.inject.Inject
    public AccountLinkingViewModel(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingReducer accountLinkingReducer, com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase createAccountLinkingInitialUrlUseCase, com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase createWebViewHeadersUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountLinkingReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAccountLinkingInitialUrlUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createWebViewHeadersUseCase, "");
        this.getHighSpeedVideoSizes = createAccountLinkingInitialUrlUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = createWebViewHeadersUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AccountLinkingViewModel.store", com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initial.INSTANCE, accountLinkingReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent>() { // from class: com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (input.getEvent() instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.Initialize) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel$initialize$1(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel.this, input.getEventDispatcher(), null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }

    public final void onLoad() {
        processEvent(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.Initialize.INSTANCE);
    }
}
