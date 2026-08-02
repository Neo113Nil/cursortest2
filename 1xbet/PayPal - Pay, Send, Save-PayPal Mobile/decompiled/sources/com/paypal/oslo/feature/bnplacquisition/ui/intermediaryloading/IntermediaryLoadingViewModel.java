package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R&\u0010'\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020#0(8\u0007¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020$0-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetBnplPlansUseCase;", "getBnplPlansUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiMapper;", "intermediaryLoadingUiMapper", "Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "cpiAvailabilityProvider", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingConfig;", "config", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingReducer;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetBnplPlansUseCase;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiMapper;Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingConfig;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetBnplPlansUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingConfig;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IntermediaryLoadingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect> getHighSpeedVideoSizesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState> uiState;

    @javax.inject.Inject
    public IntermediaryLoadingViewModel(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingReducer intermediaryLoadingReducer, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase getBnplPlansUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper intermediaryLoadingUiMapper, com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig intermediaryLoadingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intermediaryLoadingReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBnplPlansUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intermediaryLoadingUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpiAvailabilityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intermediaryLoadingConfig, "");
        this.getHighSpeedVideoFpsRanges = getBnplPlansUseCase;
        this.getHighSpeedVideoSizes = sessionStorage;
        this.getHighResolutionOutputSizeshNQ4ISI = intermediaryLoadingUiMapper;
        this.getHighSpeedVideoFpsRangesFor = cpiAvailabilityProvider;
        this.Camera2StreamConfigurationMap = intermediaryLoadingConfig;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("IntermediaryLoadingViewModel.store", com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState.Loading.INSTANCE, intermediaryLoadingReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckLoanStatus) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r2), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel$checkLoanStatus$1(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel.this, null), 3, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ScreenLockCompleted) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r2), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel$checkLoanStatus$1(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel.this, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        if (intermediaryLoadingConfig.getActions().getGetHighSpeedVideoFpsRanges().getShouldRequire()) {
            processEvent(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckScreenLockRequired.INSTANCE);
        } else {
            processEvent(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckLoanStatus.INSTANCE);
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizesFor.onEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error p0) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic generic;
        if (p0 == null || (generic = com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from(p0)) == null) {
            generic = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, 0 == true ? 1 : 0);
        }
        processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusCheckFailed(this.getHighResolutionOutputSizeshNQ4ISI.toErrorContent(generic)));
    }

    public static final /* synthetic */ void access$handleLoanStatusSuccess(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel, java.lang.Object obj) {
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlanItem> items;
        com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlanItem bnplPlanItem;
        java.lang.String str = null;
        com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse bnplPlansResponse = obj instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse ? (com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse) obj : null;
        if (bnplPlansResponse != null) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage page = bnplPlansResponse.getPage();
            if (page != null && (items = page.getItems()) != null && (bnplPlanItem = (com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlanItem) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) items)) != null) {
                str = bnplPlanItem.getCreditAccountId();
            }
            if (str != null) {
                intermediaryLoadingViewModel.getHighSpeedVideoSizes.setCreditAccountId(str);
            }
            boolean hasPlans = bnplPlansResponse.getHasPlans();
            if (str == null) {
                str = "";
            }
            intermediaryLoadingViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusReceived(new com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult(hasPlans, str)));
            return;
        }
        intermediaryLoadingViewModel.getHighSpeedVideoFpsRanges(null);
    }
}
