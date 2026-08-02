package com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001/BA\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020!0%8\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020\"0*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010."}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/viewmodel/PayRequestViewModel;", "Landroidx/lifecycle/ViewModel;", "", "requestId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.REQUEST_ID_TYPE, "", "autoStartPayment", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentRequestUseCase;", "getPaymentRequestUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/StartPaymentFromRequestUseCase;", "startPaymentFromRequestUseCase", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentRequestUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/StartPaymentFromRequestUseCase;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Z", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentRequestUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/domain/usecase/StartPaymentFromRequestUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/userstore/UserStore;", "getInputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/state/PayRequestState;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/effect/PayRequestEffect;", "getOutputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PayRequestViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect> getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/viewmodel/PayRequestViewModel$Factory;", "", "", "requestId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.REQUEST_ID_TYPE, "", "autoStartPayment", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/viewmodel/PayRequestViewModel;", "create", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/p2p/ui/payrequest/viewmodel/PayRequestViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel create(@dagger.assisted.Assisted("requestId") java.lang.String requestId, @dagger.assisted.Assisted("requestIdType") java.lang.String requestIdType, @dagger.assisted.Assisted("autoStartPayment") boolean autoStartPayment);
    }

    @dagger.assisted.AssistedInject
    public PayRequestViewModel(@dagger.assisted.Assisted("requestId") java.lang.String str, @dagger.assisted.Assisted("requestIdType") java.lang.String str2, @dagger.assisted.Assisted("autoStartPayment") boolean z, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase getPaymentRequestUseCase, com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase startPaymentFromRequestUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentRequestUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startPaymentFromRequestUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = getPaymentRequestUseCase;
        this.Camera2StreamConfigurationMap = startPaymentFromRequestUseCase;
        this.getInputFormats = userStore;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("PayRequestViewModel.store", com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Loading.INSTANCE, com.paypal.oslo.feature.p2p.ui.payrequest.reducers.PayRequestReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$dataLoadingMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent> input) {
                boolean z2;
                java.lang.String str3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent event = input.getEvent();
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.Initialize.INSTANCE)) {
                    z2 = com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.this.getHighResolutionOutputSizeshNQ4ISI;
                    if (!z2) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$loadPayRequestData$1(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.this, input.getEventDispatcher(), null), 3, null);
                        return;
                    }
                    com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel payRequestViewModel = com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.this;
                    str3 = payRequestViewModel.getHighSpeedVideoSizes;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(payRequestViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$startPaymentFromRequest$1(payRequestViewModel, str3, input.getEventDispatcher(), null), 3, null);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PrimaryCtaClicked.INSTANCE)) {
                    com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState second = input.getStates().getSecond();
                    if (second instanceof com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Success) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$startPaymentFromRequest$1(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.this, ((com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Success) second).getData().getRequestId(), input.getEventDispatcher(), null), 3, null);
                    }
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        processEvent(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.Initialize.INSTANCE);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputSizeshNQ4ISI.onEvent(event);
    }
}
