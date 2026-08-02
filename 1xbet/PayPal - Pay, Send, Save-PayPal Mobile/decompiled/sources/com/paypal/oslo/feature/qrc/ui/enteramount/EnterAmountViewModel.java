package com.paypal.oslo.feature.qrc.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u00020\u00108\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountReducer;", "reducer", "Lcom/paypal/oslo/feature/qrc/domain/usecase/CancelQrCodePaymentUseCase;", "cancelQrCodePaymentUseCase", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountReducer;Lcom/paypal/oslo/feature/qrc/domain/usecase/CancelQrCodePaymentUseCase;)V", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "event", "", "handleIntent", "(Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/qrc/domain/usecase/CancelQrCodePaymentUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "setNavArgs", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountUiState;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnterAmountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase getHighSpeedVideoFpsRangesFor;
    public com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState> uiState;

    @javax.inject.Inject
    public EnterAmountViewModel(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountReducer enterAmountReducer, com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase cancelQrCodePaymentUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelQrCodePaymentUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = cancelQrCodePaymentUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("EnterAmountViewModel.store", com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Initial.INSTANCE, enterAmountReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent>() { // from class: com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                kotlin.Pair<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState> states = input.getStates();
                com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState component1 = states.component1();
                com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState component2 = states.component2();
                com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen) {
                    if (component1 instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Initial) {
                        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel.this.setNavArgs(((com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen) event).getNavArgs());
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ConfirmCancelPayment.INSTANCE) && (component2 instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Content)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel$cancelQrCodePayment$1(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel.this, com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason.USER_CANCELLATION, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
        if (qrcSessionNavArgs != null) {
            return qrcSessionNavArgs;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setNavArgs(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
        this.navArgs = qrcSessionNavArgs;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void handleIntent(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }
}
