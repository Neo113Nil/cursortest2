package com.paypal.oslo.feature.p2p.ui.success.viewmodel;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/viewmodel/SuccessViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState;", "Lcom/paypal/oslo/feature/p2p/ui/success/effects/SuccessEffect;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuccessViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState, com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent, com.paypal.oslo.feature.p2p.ui.success.effects.SuccessEffect> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.success.effects.SuccessEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState> uiState;

    @javax.inject.Inject
    public SuccessViewModel() {
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState, com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent, com.paypal.oslo.feature.p2p.ui.success.effects.SuccessEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("SuccessViewModel.store", com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Loading.INSTANCE, com.paypal.oslo.feature.p2p.ui.success.reducers.SuccessReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState, com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel$validationMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState, com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.Initialize) {
                    com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel.access$validateSuccessState(com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel.this, ((com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.Initialize) event).getSuccessState(), input.getEventDispatcher());
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.success.effects.SuccessEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$validateSuccessState(com.paypal.oslo.feature.p2p.ui.success.viewmodel.SuccessViewModel successViewModel, com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState, kotlin.jvm.functions.Function1 function1) {
        int i = 1;
        boolean z = successState.getAmount().length() > 0 && successState.getCurrencyCode().length() > 0;
        boolean z2 = successState.getFlowType() == com.paypal.oslo.feature.p2p.ui.success.state.FlowType.PAYPAL_LINK || successState.getFlowType() == com.paypal.oslo.feature.p2p.ui.success.state.FlowType.REQUEST_MONEY || successState.getReceiver() != null;
        if (z && z2) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[5];
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, successState.getFlowType().name());
            pairArr[1] = kotlin.TuplesKt.to("currencyCode", successState.getCurrencyCode());
            pairArr[2] = kotlin.TuplesKt.to("hasReceiver", java.lang.String.valueOf(successState.getReceiver() != null));
            pairArr[3] = kotlin.TuplesKt.to("hasNote", java.lang.String.valueOf(successState.getNote() != null));
            pairArr[4] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_MEDIA_UI, java.lang.String.valueOf(successState.getMediaState() != null));
            com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.SUCCESS_SCREEN_APPEARED, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationSucceeded(successState));
            return;
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.SUCCESS_SCREEN_DISPLAY_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, successState.getFlowType().name()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_AMOUNT_VALID_UI, java.lang.String.valueOf(z)), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_RECEIVER_VALID_UI, java.lang.String.valueOf(z2))), null, null, 12, null);
        function1.invoke(new com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationFailed(null, i, 0 == true ? 1 : 0));
    }
}
