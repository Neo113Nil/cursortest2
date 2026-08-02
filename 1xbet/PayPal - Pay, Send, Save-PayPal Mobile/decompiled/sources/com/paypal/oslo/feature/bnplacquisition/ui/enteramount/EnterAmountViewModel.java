package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010+R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010(\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010/\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00106R\u0014\u00102\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00107R\u0014\u0010-\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00108R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020;098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020:0>8\u0007¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010D\u001a\b\u0012\u0004\u0012\u00020;0C8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplacquisition/remoteconfigs/featureflags/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "cpiAvailabilityProvider", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetExperienceSessionUsecase;", "getExperienceSessionUsecase", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CheckApplicationEligibilityUseCase;", "checkApplicationEligibilityUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetLoanConstraintsUseCase;", "getLoanConstraintsUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CreateCreditApplicationUsecase;", "createCreditApplicationUsecase", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiMapper;", "enterAmountUiMapper", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/util/BnplAcquisitionFormatter;", "bnplAcquisitionFormatter", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig;", "config", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountAnalyticsHelper;", "analyticsHelper", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountReducer;Lcom/paypal/oslo/feature/bnplacquisition/remoteconfigs/featureflags/FeatureGateManager;Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetExperienceSessionUsecase;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CheckApplicationEligibilityUseCase;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetLoanConstraintsUseCase;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CreateCreditApplicationUsecase;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiMapper;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/util/BnplAcquisitionFormatter;Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig;Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountAnalyticsHelper;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;)V", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/EnterAmountDestination$EntryPoint;", "entryPoint", "storeEntryPoint", "(Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/EnterAmountDestination$EntryPoint;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetExperienceSessionUsecase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CheckApplicationEligibilityUseCase;", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetLoanConstraintsUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CreateCreditApplicationUsecase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiMapper;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/util/BnplAcquisitionFormatter;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountAnalyticsHelper;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnterAmountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsHelper getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect> getOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState> uiState;

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public EnterAmountViewModel(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer enterAmountReducer, com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase getExperienceSessionUsecase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase checkApplicationEligibilityUseCase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase getLoanConstraintsUseCase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase createCreditApplicationUsecase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsHelper enterAmountAnalyticsHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpiAvailabilityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getExperienceSessionUsecase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkApplicationEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLoanConstraintsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCreditApplicationUsecase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountAnalyticsHelper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cpiAvailabilityProvider;
        this.getHighSpeedVideoFpsRanges = getExperienceSessionUsecase;
        this.getHighSpeedVideoFpsRangesFor = checkApplicationEligibilityUseCase;
        this.getHighSpeedVideoSizes = getLoanConstraintsUseCase;
        this.Camera2StreamConfigurationMap = createCreditApplicationUsecase;
        this.getInputSizeshNQ4ISI = sessionStorage;
        this.getInputFormats = enterAmountUiMapper;
        this.getOutputFormats = bnplAcquisitionFormatter;
        this.getHighSpeedVideoSizesFor = enterAmountConfig;
        this.getOutputMinFrameDuration = enterAmountAnalyticsHelper;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("EnterAmountViewModel.store", new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Loading(null, 1, 0 == true ? 1 : 0), enterAmountReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsMiddleware(enterAmountAnalyticsHelper, sessionStorage), new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState component2 = input.getStates().component2();
                com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCompleted) {
                    com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.access$loadData(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.this);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateExperienceSession) {
                    com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.access$loadData(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.this);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Valid) {
                    if (component2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r3), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkEligibility$1(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.this, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading) component2).getModel(), null), 3, null);
                    }
                } else {
                    if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Pressed) {
                        if (component2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success) {
                            if (((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success) component2).getModel().isValid()) {
                                com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.this.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Valid.INSTANCE);
                                return;
                            } else {
                                com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.this.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Invalid.INSTANCE);
                                return;
                            }
                        }
                        return;
                    }
                    if ((event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Invalid) || !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckIfFirstTimeOnScreen)) {
                        return;
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r3), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkIfFirstTimeOnScreen$1(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.this, null), 3, null);
                }
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        if (featureGateManager.isInstoreProductEnabled()) {
            if (!enterAmountConfig.getActions().getCamera2StreamConfigurationMap().getShouldRequire()) {
                processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateExperienceSession.INSTANCE);
                return;
            } else {
                processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckScreenLock.INSTANCE);
                return;
            }
        }
        processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError(enterAmountUiMapper.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.PayLaterNotAvailable.INSTANCE)));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputSizeshNQ4ISI.onEvent(event);
    }

    public final void storeEntryPoint(com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination.EntryPoint entryPoint) {
        this.getInputSizeshNQ4ISI.setEntryPoint(entryPoint);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequest access$buildCreateCreditApplicationRequest(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, java.lang.String str, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer eligibleProductOffer = (com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer) it.next();
            java.lang.String id = eligibleProductOffer.getId();
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails productDetails = id != null ? new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails(eligibleProductOffer.getCreditProductIdentifier(), null, id) : null;
            if (productDetails != null) {
                arrayList.add(productDetails);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi initializeApplicationApi = enterAmountViewModel.getHighSpeedVideoSizesFor.getActions().getInitializeApplicationApi();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequest(str, arrayList, new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequestParams(initializeApplicationApi.getIncludeAnnualIncome(), initializeApplicationApi.getIncludeNationalIdentification(), initializeApplicationApi.getIncludePaymentFundingInstruments(), initializeApplicationApi.getIncludeSelectedPaymentFundingInstrument()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$handleCheckEligibilitySuccess(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibility checkApplicationEligibility, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibilitySuccess success = checkApplicationEligibility.getSuccess();
        int i = 1;
        java.lang.String str2 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (success != null) {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer> eligibleProductOffers = success.getEligibleProductOffers();
            if (eligibleProductOffers.isEmpty()) {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "No eligible product offers found", null, null, 6, null);
                enterAmountViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined(enterAmountViewModel.getInputFormats.toDeclineContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.NoEligibleOffers(str2, i, objArr3 == true ? 1 : 0))));
                return;
            }
            if (!enterAmountViewModel.getHighSpeedVideoSizesFor.getActions().getOffersCreditApplication().getShouldCall()) {
                if (enterAmountViewModel.getHighSpeedVideoSizesFor.getActions().getCreateCreditApplication().getShouldCall()) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(enterAmountViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$createCreditApplication$1(enterAmountViewModel, str, eligibleProductOffers, null), 3, null);
                    return;
                }
                return;
            }
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer> eligibleProductOffers2 = success.getEligibleProductOffers();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(eligibleProductOffers2, 10));
            for (com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer eligibleProductOffer : eligibleProductOffers2) {
                arrayList.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.ProductOfferEvaluation(eligibleProductOffer.getCreditProductIdentifier(), eligibleProductOffer.getOffers(), eligibleProductOffer.getId()));
            }
            enterAmountViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateApplicationSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication(money, arrayList), str));
            return;
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "CheckApplicationEligibilitySuccess is null", null, null, null, 14, null);
        enterAmountViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError(enterAmountViewModel.getInputFormats.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$handleExperienceSessionSuccess(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, java.lang.Object obj) {
        if (obj instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.common.ExperienceSession) {
            java.lang.String experienceSessionId = ((com.paypal.oslo.feature.bnplacquisition.domain.model.common.ExperienceSession) obj).getExperienceSessionId();
            java.lang.String str = null;
            java.lang.Object[] objArr = 0;
            if (experienceSessionId != null) {
                enterAmountViewModel.getInputSizeshNQ4ISI.setExperienceSessionId(experienceSessionId);
                enterAmountViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ExperienceSessionCreated.INSTANCE);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(enterAmountViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$fetchLoanConstraints$1(experienceSessionId, enterAmountViewModel, null), 3, null);
            } else {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "ExperienceSessionId is null", null, null, null, 14, null);
                enterAmountViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError(enterAmountViewModel.getInputFormats.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(str, 1, objArr == true ? 1 : 0))));
            }
        }
    }

    public static final /* synthetic */ void access$handleInitialLoadDecline(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, java.lang.String str, java.lang.String str2) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", str == null ? "UNKNOWN" : str)), null, 4, null);
        enterAmountViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined(enterAmountViewModel.getInputFormats.toDeclineContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(str, str2))));
    }

    public static final /* synthetic */ void access$handleInitialLoadError(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error) {
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to load experience session", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, null, 12, null);
        enterAmountViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError(enterAmountViewModel.getInputFormats.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from(error))));
    }

    public static final /* synthetic */ void access$loadData(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel) {
        enterAmountViewModel.getInputSizeshNQ4ISI.setFlowSpecifier(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier.STANDALONE_APPLICATION);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(enterAmountViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$loadData$1(enterAmountViewModel, null), 3, null);
    }
}
