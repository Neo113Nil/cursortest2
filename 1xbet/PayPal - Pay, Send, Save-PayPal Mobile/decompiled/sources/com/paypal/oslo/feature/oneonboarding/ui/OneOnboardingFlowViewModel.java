package com.paypal.oslo.feature.oneonboarding.ui;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\fR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010'\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020$0)8\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010/\u001a\b\u0012\u0004\u0012\u00020&0.8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010 \u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0018038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u00105"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/oneonboarding/domain/usecase/GetFlowUseCase;", "getFlowUseCase", "Lcom/paypal/oslo/feature/oneonboarding/ui/common/ImagePrefetcher;", "imagePrefetcher", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/domain/usecase/GetFlowUseCase;Lcom/paypal/oslo/feature/oneonboarding/ui/common/ImagePrefetcher;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "startFlow", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "stepForward", "()V", "stepBack", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "status", "closeFlow", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;)V", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;", "retryableEvent", "retry", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "collectedItem", "contributeCollectedItem", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;)V", "submit", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/oneonboarding/domain/usecase/GetFlowUseCase;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/oneonboarding/ui/common/ImagePrefetcher;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneOnboardingFlowViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState> uiState;

    @javax.inject.Inject
    public OneOnboardingFlowViewModel(com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase getFlowUseCase, com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher imagePrefetcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getFlowUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrefetcher, "");
        this.getHighSpeedVideoSizes = getFlowUseCase;
        this.getHighSpeedVideoFpsRanges = imagePrefetcher;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("OneOnboardingFlowViewModel.store", com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Initial.INSTANCE, new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingReducer(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent>() { // from class: com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent> input) {
                java.util.Map map;
                java.util.Map map2;
                java.util.Map map3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow) {
                    map3 = com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this.getHighResolutionOutputSizeshNQ4ISI;
                    map3.clear();
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r2), null, null, new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel$loadFlow$1(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow) event).getIntentId(), (r16 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r16 & 4) != 0 ? false : true, input.getEventDispatcher(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit) {
                    com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit submit = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit) event;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r2), null, null, new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel$loadFlow$1(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, submit.getIntentId(), (r16 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : submit.getCollectedItems(), (r16 & 4) != 0 ? false : false, input.getEventDispatcher(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Retry) {
                    com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableEvent = ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Retry) event).getRetryableEvent();
                    if (retryableEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow) {
                        map2 = com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this.getHighResolutionOutputSizeshNQ4ISI;
                        map2.clear();
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r2), null, null, new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel$loadFlow$1(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow) retryableEvent).getIntentId(), (r16 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r16 & 4) != 0 ? false : true, input.getEventDispatcher(), null), 3, null);
                        return;
                    } else {
                        if (!(retryableEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit submit2 = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit) retryableEvent;
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r2), null, null, new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel$loadFlow$1(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, submit2.getIntentId(), (r16 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : submit2.getCollectedItems(), (r16 & 4) != 0 ? false : false, input.getEventDispatcher(), null), 3, null);
                        return;
                    }
                }
                if (event instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded) {
                    map = com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this.getHighResolutionOutputSizeshNQ4ISI;
                    map.clear();
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void startFlow(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow(intentId));
    }

    public final void stepForward() {
        this.getHighSpeedVideoFpsRangesFor.onEvent(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepForward.INSTANCE);
    }

    public final void stepBack() {
        this.getHighSpeedVideoFpsRangesFor.onEvent(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepBack.INSTANCE);
    }

    public static /* synthetic */ void closeFlow$default(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.Status status, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            status = null;
        }
        oneOnboardingFlowViewModel.closeFlow(status);
    }

    public final void closeFlow(com.paypal.oslo.feature.oneonboarding.api.domain.Status status) {
        this.getHighSpeedVideoFpsRangesFor.onEvent(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow(status));
    }

    public final void retry(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retryableEvent, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Retry(retryableEvent));
    }

    public final void contributeCollectedItem(com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        this.getHighResolutionOutputSizeshNQ4ISI.put(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(collectedItem.getGetHighSpeedVideoSizes()), collectedItem);
    }

    public final void submit(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit(intentId, kotlin.collections.CollectionsKt.toList(this.getHighResolutionOutputSizeshNQ4ISI.values())));
    }
}
