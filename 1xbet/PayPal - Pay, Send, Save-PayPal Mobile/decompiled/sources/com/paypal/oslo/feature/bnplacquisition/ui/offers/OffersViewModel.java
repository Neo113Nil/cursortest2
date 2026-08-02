package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R&\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010.R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a0/8\u0007¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00105\u001a\b\u0012\u0004\u0012\u00020-048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetReviewTermsUseCase;", "getReviewTermsUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetRepaymentDetailsUseCase;", "getRepaymentDetailsUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CreateCreditApplicationUsecase;", "createCreditApplicationUsecase", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/mapper/OffersUiMapper;", "offersUiMapper", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersConfig;", "offersConfig", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersAnalyticsHelper;", "analyticsHelper", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersReducer;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetReviewTermsUseCase;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetRepaymentDetailsUseCase;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CreateCreditApplicationUsecase;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/mapper/OffersUiMapper;Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersConfig;Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersAnalyticsHelper;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;", "sideEffectsMiddleware$bnpl_acquisition_prodRelease", "()Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersReducer;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetReviewTermsUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetRepaymentDetailsUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CreateCreditApplicationUsecase;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/mapper/OffersUiMapper;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersConfig;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OffersViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersReducer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect> getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState> uiState;

    @javax.inject.Inject
    public OffersViewModel(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersReducer offersReducer, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase getReviewTermsUseCase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase getRepaymentDetailsUseCase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase createCreditApplicationUsecase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig offersConfig, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsHelper offersAnalyticsHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getReviewTermsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRepaymentDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCreditApplicationUsecase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersAnalyticsHelper, "");
        this.getHighSpeedVideoFpsRangesFor = offersReducer;
        this.getHighSpeedVideoSizes = getReviewTermsUseCase;
        this.Camera2StreamConfigurationMap = getRepaymentDetailsUseCase;
        this.getHighSpeedVideoFpsRanges = createCreditApplicationUsecase;
        this.getHighResolutionOutputSizeshNQ4ISI = sessionStorage;
        this.getHighSpeedVideoSizesFor = offersUiMapper;
        this.getInputSizeshNQ4ISI = offersConfig;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("OffersViewModel.store", com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Initial.INSTANCE, offersReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsMiddleware(offersAnalyticsHelper, sessionStorage), sideEffectsMiddleware$bnpl_acquisition_prodRelease()}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputMinFrameDuration = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputMinFrameDuration.onEvent(event);
    }

    public final com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent> sideEffectsMiddleware$bnpl_acquisition_prodRelease() {
        return new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$loadDomainModel$1(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel.this, (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData) event, null), 3, null);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Pressed.INSTANCE)) {
                    com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState first = input.getStates().getFirst();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(first, "");
                    com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel.access$validateAndContinue(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel.this, (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success) first);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid) {
                    com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel.access$handleContinueValid(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel.this, (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid) event, input);
                }
            }
        };
    }

    public static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequest access$buildCreateCreditApplicationRequest(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel) {
        com.paypal.oslo.feature.bnplacquisition.ui.offers.InitializeBnplApplicationApiConfig initializeBnplApplicationApi = offersViewModel.getInputSizeshNQ4ISI.getActions().getInitializeBnplApplicationApi();
        java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem> offers = offersUiModel.getOffers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem offerItem : offers) {
            java.lang.String evaluationId = offerItem.getEvaluationId();
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails productDetails = evaluationId != null ? new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails(offerItem.getCreditProductIdentifier(), offersUiModel.getSelectedOfferId(), evaluationId) : null;
            if (productDetails != null) {
                arrayList.add(productDetails);
            }
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequest(str, arrayList, new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequestParams(initializeBnplApplicationApi.getIncludeAnnualIncome(), initializeBnplApplicationApi.getIncludeNationalIdentification(), initializeBnplApplicationApi.getIncludePaymentFundingInstruments(), initializeBnplApplicationApi.getIncludeSelectedPaymentFundingInstrument()));
    }

    public static final /* synthetic */ void access$handleContinueValid(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid valid, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input) {
        if (((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState) input.getStates().getSecond()) instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading) {
            java.lang.Object first = input.getStates().getFirst();
            kotlin.jvm.internal.Intrinsics.checkNotNull(first, "");
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success) first;
            com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier = valid.getSelectedOffer().getCreditProductIdentifier();
            offersViewModel.getHighResolutionOutputSizeshNQ4ISI.setCreditProductIdentifier(creditProductIdentifier);
            offersViewModel.getInputSizeshNQ4ISI.getCtx().setCPI$bnpl_acquisition_prodRelease(creditProductIdentifier);
            if (offersViewModel.getInputSizeshNQ4ISI.getActions().getInitializeBnplApplicationApi().getShouldCall()) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(offersViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$createCreditApplication$1(offersViewModel, success.getUiModel(), null), 3, null);
                return;
            }
            if (offersViewModel.getInputSizeshNQ4ISI.getActions().getUpdateApplicationAndFetchRepaymentsApi().getShouldCall()) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(offersViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$fetchRepayments$1(offersViewModel, success.getUiModel().getSelectedOfferId(), null), 3, null);
                return;
            }
            if (offersViewModel.getInputSizeshNQ4ISI.getActions().getReviewTermsApi().getShouldCall()) {
                if (!offersViewModel.getInputSizeshNQ4ISI.getActions().getCollectPersonalInfo().getShouldBeChecked()) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(offersViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$fetchReviewTerms$1(success.getUiModel(), offersViewModel, null), 3, null);
                    return;
                }
                com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel = success.getUiModel();
                if (!offersViewModel.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoSizesFor() && !offersViewModel.getHighResolutionOutputSizeshNQ4ISI.getGetInputSizeshNQ4ISI()) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(offersViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$fetchReviewTerms$1(uiModel, offersViewModel, null), 3, null);
                    return;
                }
                java.lang.String amount = uiModel.getAmount();
                java.lang.String selectedOfferId = uiModel.getSelectedOfferId();
                offersViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo(amount, selectedOfferId != null ? selectedOfferId : ""));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$handleCreateCreditApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication createCreditApplication) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess = createCreditApplication.getCreateCreditApplicationSuccess();
        if (createCreditApplicationSuccess != null) {
            offersViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.CreateCreditSuccess(createCreditApplicationSuccess));
        } else {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "CreateCreditApplicationSuccess is null", null, null, null, 14, null);
            offersViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError(offersViewModel.getHighSpeedVideoSizesFor.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, 0 == true ? 1 : 0))));
        }
    }

    public static final /* synthetic */ void access$validateAndContinue(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success success) {
        java.lang.Object obj;
        java.util.Iterator<T> it = success.getUiModel().getOffers().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem) obj).getId(), success.getUiModel().getSelectedOfferId())) {
                    break;
                }
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem offerItem = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem) obj;
        if (offerItem != null) {
            offersViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid(offerItem));
        } else {
            offersViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Invalid.INSTANCE);
        }
    }
}
