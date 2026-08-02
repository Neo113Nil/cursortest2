package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010&\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020$0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020#0'8\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010-\u001a\b\u0012\u0004\u0012\u00020$0,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/SubmitCreditApplicationUsecase;", "submitCreditApplicationUsecase", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetPaymentFundingInstrumentsUseCase;", "getPaymentFundingInstrumentsUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiMapper;", "repaymentsUiMapper", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsAnalyticsHelper;", "repaymentsAnalyticsHelper", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/SubmitCreditApplicationUsecase;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetPaymentFundingInstrumentsUseCase;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiMapper;Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsAnalyticsHelper;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;", "flowSpecifier", "setFlowSpecifier", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;)V", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/SubmitCreditApplicationUsecase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetPaymentFundingInstrumentsUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsAnalyticsHelper;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "addCardNavResultRequestId", "Ljava/lang/String;", "getAddCardNavResultRequestId-QDVFmTU", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RepaymentsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect> getInputFormats;
    private final java.lang.String addCardNavResultRequestId;
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsHelper getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState> uiState;

    @javax.inject.Inject
    public RepaymentsViewModel(com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase submitCreditApplicationUsecase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase getPaymentFundingInstrumentsUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper repaymentsUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsHelper repaymentsAnalyticsHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitCreditApplicationUsecase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentFundingInstrumentsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsAnalyticsHelper, "");
        this.Camera2StreamConfigurationMap = submitCreditApplicationUsecase;
        this.getHighSpeedVideoFpsRangesFor = getPaymentFundingInstrumentsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = sessionStorage;
        this.getHighSpeedVideoSizes = repaymentsUiMapper;
        this.getHighSpeedVideoFpsRanges = repaymentsAnalyticsHelper;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("RepaymentsViewModel.store", com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Initial.INSTANCE, new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsReducer(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsMiddleware(repaymentsAnalyticsHelper, sessionStorage), new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState second = input.getStates().getSecond();
                com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LoadDomainModel) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$loadDomainModel$1(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel.this, (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LoadDomainModel) event, null), 3, null);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Pressed.INSTANCE)) {
                    com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel.access$validateAndContinue(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel.this, input.getStates().getSecond());
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Valid.INSTANCE)) {
                    if (second instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Loading) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$submitCreditApplication$1(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel.this, false, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Loading) second).getModel(), null), 3, null);
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SkipPressed.INSTANCE)) {
                    if (second instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Loading) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$submitCreditApplication$1(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel.this, true, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Loading) second).getModel(), null), 3, null);
                    }
                } else {
                    if ((event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SubmitCreditApplicationSuccess) || !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnRefreshWithNewFi)) {
                        return;
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$reloadFundingInstruments$1(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel.this, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnRefreshWithNewFi) event).getNewlyAddedFiId(), null), 3, null);
                }
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        this.addCardNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    /* renamed from: getAddCardNavResultRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getAddCardNavResultRequestId() {
        return this.addCardNavResultRequestId;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputFormats.onEvent(event);
    }

    public final void setFlowSpecifier(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setFlowSpecifier(flowSpecifier);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$handleSubmitSuccess(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel, java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess success;
        java.lang.String str = null;
        java.lang.Object[] objArr = 0;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails submitVirtualCardApplicationDetails = obj instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails ? (com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails) obj : null;
        if (submitVirtualCardApplicationDetails != null && (success = submitVirtualCardApplicationDetails.getSuccess()) != null) {
            java.lang.String creditAccountId = success.getCreditApplication().getCreditAccountId();
            if (creditAccountId != null) {
                repaymentsViewModel.getHighResolutionOutputSizeshNQ4ISI.setCreditAccountId(creditAccountId);
            }
            repaymentsViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SubmitCreditApplicationSuccess(success));
            return;
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "SubmitCreditApplicationSuccess is null", null, null, null, 14, null);
        repaymentsViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError(repaymentsViewModel.getHighSpeedVideoSizes.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(str, 1, objArr == true ? 1 : 0))));
    }

    public static final /* synthetic */ void access$validateAndContinue(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState repaymentsUiState) {
        if (repaymentsUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Success) {
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Success) repaymentsUiState;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> fundingInstruments = success.getData().getFundingInstruments();
            boolean z = fundingInstruments == null || fundingInstruments.isEmpty();
            boolean z2 = success.getData().getSelectedFundingInstrumentId() == null;
            boolean z3 = success.getData().getShowConsentCheckbox() && !success.getData().isAgreed();
            boolean z4 = !z && z2;
            if (z4 || z3) {
                repaymentsViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid(z4, z3));
            } else {
                repaymentsViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Valid.INSTANCE);
            }
        }
    }
}
