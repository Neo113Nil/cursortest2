package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010+R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-R&\u00102\u001a\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000200048\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010:\u001a\b\u0012\u0004\u0012\u000201098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010="}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiMapper;", "reviewPlanUiMapper", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/SubmitCreditApplicationUsecase;", "submitCreditApplicationUsecase", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/RemoveExistingPayLaterCardsUseCase;", "removeExistingPayLaterCardsUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;", "applicationFailureUiMapper", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanConfig;", "reviewPlanConfig", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanReducer;Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiMapper;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/SubmitCreditApplicationUsecase;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/RemoveExistingPayLaterCardsUseCase;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanConfig;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "submitData", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/PayLaterCard;", "buildPayLaterCard$bnpl_acquisition_prodRelease", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/PayLaterCard;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "buildSetupCardInfo$bnpl_acquisition_prodRelease", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanReducer;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiMapper;", "getInputFormats", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/SubmitCreditApplicationUsecase;", "getHighSpeedVideoSizes", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/RemoveExistingPayLaterCardsUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;", "getOutputFormats", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanConfig;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewPlanViewModel extends androidx.view.ViewModel {
    public static final int MAX_CARD_REMOVAL_RETRIES = 2;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig getInputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanReducer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect> getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public ReviewPlanViewModel(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanReducer reviewPlanReducer, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper reviewPlanUiMapper, com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase submitCreditApplicationUsecase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase removeExistingPayLaterCardsUseCase, com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig reviewPlanConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitCreditApplicationUsecase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeExistingPayLaterCardsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationFailureUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanConfig, "");
        this.Camera2StreamConfigurationMap = reviewPlanReducer;
        this.getHighResolutionOutputSizeshNQ4ISI = reviewPlanUiMapper;
        this.getHighSpeedVideoSizes = submitCreditApplicationUsecase;
        this.getHighSpeedVideoFpsRanges = sessionStorage;
        this.getHighSpeedVideoFpsRangesFor = removeExistingPayLaterCardsUseCase;
        this.getOutputFormats = applicationFailureUiMapper;
        this.getInputSizeshNQ4ISI = reviewPlanConfig;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ReviewPlanViewModel.store", com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Initial.INSTANCE, reviewPlanReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent> input) {
                com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage2;
                com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig reviewPlanConfig2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState second = input.getStates().getSecond();
                com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.LoadDomainData) {
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel = com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.this;
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent event2 = input.getEvent();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(event2, "");
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(reviewPlanViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$loadDomainModel$1(reviewPlanViewModel, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.LoadDomainData) event2).getReviewPlanData(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ApplyButtonPressed) {
                    if (second instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading) {
                        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.access$submitApplication(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.this);
                        return;
                    }
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess) {
                    sessionStorage2 = com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.this.getHighSpeedVideoFpsRanges;
                    sessionStorage2.setFlowSpecifier(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier.STANDALONE_APPLICATION);
                    reviewPlanConfig2 = com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.this.getInputSizeshNQ4ISI;
                    if (reviewPlanConfig2.getActions().isNfcProvisioning()) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r5), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$removeExistingPayLaterCards$1(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.this, 0, null), 3, null);
                        return;
                    }
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRetryPressed) {
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState first = input.getStates().getFirst();
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError nFCProvisioningError = first instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError ? (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError) first : null;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r5), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$removeExistingPayLaterCards$1(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.this, (nFCProvisioningError != null ? nFCProvisioningError.getRetryCount() : 0) + 1, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputMinFrameDuration = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputMinFrameDuration.onEvent(event);
    }

    public final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard buildPayLaterCard$bnpl_acquisition_prodRelease(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitData) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money loanAmount;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money loanAmount2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication creditApplication = submitData != null ? submitData.getCreditApplication() : null;
        com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCard = creditApplication != null ? creditApplication.getVirtualCard() : null;
        java.lang.String creditAccountId = creditApplication != null ? creditApplication.getCreditAccountId() : null;
        java.lang.String str = creditAccountId == null ? "" : creditAccountId;
        java.lang.String createTime = virtualCard != null ? virtualCard.getCreateTime() : null;
        java.lang.String str2 = createTime == null ? "" : createTime;
        java.lang.String expirationDuration = virtualCard != null ? virtualCard.getExpirationDuration() : null;
        java.lang.String str3 = expirationDuration == null ? "" : expirationDuration;
        java.lang.String currencyCode = (virtualCard == null || (loanAmount2 = virtualCard.getLoanAmount()) == null) ? null : loanAmount2.getCurrencyCode();
        if (currencyCode == null) {
            currencyCode = "";
        }
        java.lang.String value = (virtualCard == null || (loanAmount = virtualCard.getLoanAmount()) == null) ? null : loanAmount.getValue();
        if (value == null) {
            value = "";
        }
        com.paypal.oslo.feature.bnplacquisition.api.navigation.result.LoanAmount loanAmount3 = new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.LoanAmount(currencyCode, value);
        java.lang.String lastNCharsText = virtualCard != null ? virtualCard.getLastNCharsText() : null;
        java.lang.String str4 = lastNCharsText == null ? "" : lastNCharsText;
        java.lang.String imageUrl = virtualCard != null ? virtualCard.getImageUrl() : null;
        java.lang.String str5 = imageUrl == null ? "" : imageUrl;
        java.lang.String imageUrl2 = virtualCard != null ? virtualCard.getImageUrl() : null;
        return new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard(str, str2, str3, loanAmount3, str4, new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.CardArt(str5, imageUrl2 == null ? "" : imageUrl2, (java.lang.Integer) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo buildSetupCardInfo$bnpl_acquisition_prodRelease(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitData) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication creditApplication;
        com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCard;
        if (submitData == null || (creditApplication = submitData.getCreditApplication()) == null || (virtualCard = creditApplication.getVirtualCard()) == null) {
            return null;
        }
        java.lang.String creditAccountId = submitData.getCreditApplication().getCreditAccountId();
        java.lang.String str = creditAccountId == null ? "" : creditAccountId;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType = com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayLaterToGo;
        java.lang.String lastNCharsText = virtualCard.getLastNCharsText();
        java.lang.String str2 = lastNCharsText == null ? "" : lastNCharsText;
        java.lang.String createTime = virtualCard.getCreateTime();
        java.lang.String expirationDuration = virtualCard.getExpirationDuration();
        java.lang.String currencyCode = virtualCard.getLoanAmount().getCurrencyCode();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        return new com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo(str, cardType, str2, (java.lang.String) null, new com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData(createTime, new com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.CardSpendingLimit(currencyCode != null ? currencyCode : "", virtualCard.getLoanAmount().getValue()), expirationDuration), new com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection(new com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt(virtualCard.getImageUrl(), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtMetadata) null, 28, defaultConstructorMarker), new com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt(virtualCard.getImageUrl(), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtMetadata) null, 28, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt) (0 == true ? 1 : 0), 4, defaultConstructorMarker), 8, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest access$buildSubmitRequest(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel) {
        java.lang.String camera2StreamConfigurationMap = reviewPlanViewModel.getHighSpeedVideoFpsRanges.getCamera2StreamConfigurationMap();
        if (camera2StreamConfigurationMap == null) {
            camera2StreamConfigurationMap = "";
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest(camera2StreamConfigurationMap, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType[]{com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.INSTALLMENT_AGREEMENT, com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.CARD_AGREEMENT}), null, true, 4, null);
    }

    public static final /* synthetic */ kotlinx.coroutines.Job access$submitApplication(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel) {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(reviewPlanViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$submitApplication$1(reviewPlanViewModel, null), 3, null);
        return launch$default;
    }
}
