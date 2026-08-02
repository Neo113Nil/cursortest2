package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8G¢\u0006\u0006\u001a\u0004\b$\u0010%R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020#0'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/GetPlanListOverviewUseCase;", "getOverview", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListMapper;", "planListMapper", "Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig;", "supportedCpisConfig", "Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;", "sessionStorage", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/GetPlanListOverviewUseCase;Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListMapper;Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig;Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListReducer;)V", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/GetPlanListOverviewUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;", "getSessionStorage$bnpl_servicing_prodRelease", "()Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiEffect;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanListViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage sessionStorage;

    @javax.inject.Inject
    public PlanListViewModel(com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase getPlanListOverviewUseCase, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper planListMapper, com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig, com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage bnplServicingSessionStorage, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListReducer planListReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPlanListOverviewUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedCpisConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingSessionStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListReducer, "");
        this.Camera2StreamConfigurationMap = getPlanListOverviewUseCase;
        this.getHighSpeedVideoFpsRangesFor = planListMapper;
        this.getHighSpeedVideoFpsRanges = supportedCpisConfig;
        this.sessionStorage = bnplServicingSessionStorage;
        this.getHighSpeedVideoSizes = new com.paypal.oslo.core.mvi.MviStateStore<>("PlanListViewModel.store", com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Loading.INSTANCE, planListReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent>() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (input.getEvent() instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.LoadData) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r2), null, null, new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel$loadData$1(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel.this, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        processEvent(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.LoadData.INSTANCE);
    }

    /* renamed from: getSessionStorage$bnpl_servicing_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState> getUiState() {
        return this.getHighSpeedVideoSizes.getUiState();
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect> getUiEffect() {
        return this.getHighSpeedVideoSizes.getUiEffect();
    }

    public final void processEvent(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}
