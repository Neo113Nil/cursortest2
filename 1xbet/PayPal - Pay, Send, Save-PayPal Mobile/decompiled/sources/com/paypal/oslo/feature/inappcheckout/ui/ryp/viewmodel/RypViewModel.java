package com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010#\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010.R\u0016\u0010 \u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00100\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00104R\u001d\u00106\u001a\b\u0012\u0004\u0012\u000203058\u0007¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010<R \u0010>\u001a\b\u0012\u0004\u0012\u00020;0=8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u001c\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u00104R\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010J"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/viewmodel/RypViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/reducer/RypReducer;", "reducer", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/AuthorizeBillingAgreementUseCase;", "authorizeBillingAgreementUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInputFactory;", "contingencyInputFactory", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/RouteContingencyUseCase;", "routeContingencyUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FundingSelectionUseCase;", "fundingSelectionUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;", "handleInAppLinkUseCase", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsTracker;", "analyticsTracker", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/reducer/RypReducer;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/AuthorizeBillingAgreementUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInputFactory;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/RouteContingencyUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FundingSelectionUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsTracker;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "response", "", "initialize", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "onCleared", "()V", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "event", "onEvent", "(Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;)V", "getOutputStallDuration", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/reducer/RypReducer;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/AuthorizeBillingAgreementUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInputFactory;", "getHighSpeedVideoFpsRanges", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/RouteContingencyUseCase;", "Camera2StreamConfigurationMap", "getOutputFormats", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FundingSelectionUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsTracker;", "Lkotlinx/coroutines/Job;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "Larrow/atomic/AtomicBoolean;", "getOutputSizes", "Larrow/atomic/AtomicBoolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RypViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity> getOutputStallDurationlomOqCM;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity> getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect> getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getInputSizeshNQ4ISI;
    private com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity getOutputMinFrameDurationlomOqCM;
    private final arrow.atomic.AtomicBoolean getOutputSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase Camera2StreamConfigurationMap;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State> state;

    @javax.inject.Inject
    public RypViewModel(com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer rypReducer, com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase authorizeBillingAgreementUseCase, com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory contingencyInputFactory, com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase routeContingencyUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase fundingSelectionUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase handleInAppLinkUseCase, com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker rypAnalyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rypReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizeBillingAgreementUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyInputFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routeContingencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSelectionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleInAppLinkUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rypAnalyticsTracker, "");
        this.getHighSpeedVideoFpsRangesFor = rypReducer;
        this.getHighSpeedVideoSizes = authorizeBillingAgreementUseCase;
        this.getHighSpeedVideoFpsRanges = contingencyInputFactory;
        this.Camera2StreamConfigurationMap = routeContingencyUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = fundingSelectionUseCase;
        this.getInputFormats = handleInAppLinkUseCase;
        this.getHighSpeedVideoSizesFor = rypAnalyticsTracker;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State(null, null, null, false, false, false, null, null, null, false, null, false, null, false, false, false, false, false, null, 524287, null));
        this.getOutputMinFrameDuration = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getOutputFormats = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.getOutputSizeshNQ4ISI = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputStallDurationlomOqCM = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputSizes = new arrow.atomic.AtomicBoolean(false);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect> getEffect() {
        return this.effect;
    }

    public final void initialize(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (this.getOutputSizes.getValue()) {
            return;
        }
        this.getOutputSizes.set(true);
        this.getOutputMinFrameDurationlomOqCM = response.getInitializeCheckoutEntity();
        this.getOutputSizeshNQ4ISI.setValue(response.getBuyerInfoEntity());
        this.getOutputStallDurationlomOqCM.setValue(response.getFundingSelectionEntity());
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1(this, null), 3, null);
        this.getInputSizeshNQ4ISI = launch$default;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
        if (job != null) {
            if (job == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                job = null;
            }
            if (job.isActive()) {
                kotlinx.coroutines.Job job2 = this.getInputSizeshNQ4ISI;
                if (job2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    job2 = null;
                }
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        }
    }

    public final void onEvent(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event event) {
        java.lang.Object obj;
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State> mutableStateFlow = this.getOutputMinFrameDuration;
            mutableStateFlow.setValue(this.getHighSpeedVideoFpsRangesFor.reduce(mutableStateFlow.getValue(), event));
            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContent)) {
                if ((event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToAddCard) || (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToAddCardOnContingencyResponse)) {
                    break;
                }
                if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToUpdateCard) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToUpdateCard(((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToUpdateCard) event).getUpdateCardParams()), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToProfile) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToProfile.INSTANCE, null), 3, null);
                    return;
                }
                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToEConsentOnContingencyResponse)) {
                    if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAddOrUpdateCardResult) {
                        com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAddOrUpdateCardResult onAddOrUpdateCardResult = (com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAddOrUpdateCardResult) event;
                        boolean cardSavedSuccessfully = onAddOrUpdateCardResult.getCardSavedSuccessfully();
                        boolean billingAddressAdded = onAddOrUpdateCardResult.getBillingAddressAdded();
                        if (cardSavedSuccessfully) {
                            com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel = this;
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(rypViewModel), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$handleAddOrUpdateCardResult$1(this, null), 3, null);
                            if (billingAddressAdded) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(rypViewModel), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.ReloadCardFormData.INSTANCE, null), 3, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAgreeAndContinue) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$handleAgreeAndContinue$1(this, null), 3, null);
                        return;
                    }
                    if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationSuccess)) {
                        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnEConsentGiven) {
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity> mutableStateFlow2 = this.getOutputSizeshNQ4ISI;
                            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity value = mutableStateFlow2.getValue();
                            mutableStateFlow2.setValue(value != null ? com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.withoutEConsentContingency(value) : null);
                            return;
                        }
                        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.RetryLastOperation)) {
                            if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationContingency) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onContingencyOccurred$1(this, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationContingency) event).getEntity(), null), 3, null);
                                return;
                            }
                            if ((event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationFailure) || (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyError)) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToError(com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.toErrorScreenType(this.getOutputMinFrameDuration.getValue().getError()), com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.cancelUrl(this.getOutputMinFrameDuration.getValue().getInitializeCheckoutEntity())), null), 3, null);
                                return;
                            }
                            if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.ReturnToMerchant) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateBackToMerchant.INSTANCE, null), 3, null);
                                return;
                            }
                            if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDisclaimerLinkClick) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onEvent$1(this, event, null), 3, null);
                                return;
                            } else if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onEvent$2(event, this, null), 3, null);
                                return;
                            } else {
                                if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.TrackAnalyticsEvent) {
                                    this.getHighSpeedVideoSizesFor.trackEvent(((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.TrackAnalyticsEvent) event).getEvent());
                                    return;
                                }
                                return;
                            }
                        }
                        event = com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAgreeAndContinue.INSTANCE;
                    } else {
                        com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity = this.getOutputMinFrameDuration.getValue().getInitializeCheckoutEntity();
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToSuccessScreen(new com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData(com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.merchantName(initializeCheckoutEntity), com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.returnUrl(initializeCheckoutEntity))), null), 3, null);
                        return;
                    }
                } else {
                    com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = this.getOutputMinFrameDuration.getValue().getBuyerInfoEntity();
                    if (buyerInfoEntity != null) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToEConsent(buyerInfoEntity), null), 3, null);
                        return;
                    }
                    return;
                }
            } else {
                com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity buyerInfoContingency = this.getOutputMinFrameDuration.getValue().getBuyerInfoContingency();
                if (buyerInfoContingency == null) {
                    buyerInfoContingency = this.getOutputMinFrameDuration.getValue().getContingency();
                }
                if (buyerInfoContingency != null) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$onContingencyOccurred$1(this, buyerInfoContingency, null), 3, null);
                    return;
                }
                if (this.getOutputMinFrameDuration.getValue().getError() != null) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToError(com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.toErrorScreenType(this.getOutputMinFrameDuration.getValue().getError()), com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.cancelUrl(this.getOutputMinFrameDuration.getValue().getInitializeCheckoutEntity())), null), 3, null);
                    return;
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.LoadCardMetaData.INSTANCE, null), 3, null);
                java.util.Iterator<T> it = this.getOutputMinFrameDuration.getValue().getFundingInstruments().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) obj).getId(), this.getOutputMinFrameDuration.getValue().getSelectedInstrumentId())) {
                            break;
                        }
                    }
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) obj;
                com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker rypAnalyticsTracker = this.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity2 = this.getOutputMinFrameDuration.getValue().getInitializeCheckoutEntity();
                rypAnalyticsTracker.trackEvent(new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenLoaded(new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext(initializeCheckoutEntity2 != null ? initializeCheckoutEntity2.getCheckoutContext() : null, fundingInstrument, this.getOutputMinFrameDuration.getValue().getFundingInstruments())));
                return;
            }
        }
        com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel2 = this;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(rypViewModel2), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.LoadCardMetaData.INSTANCE, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(rypViewModel2), null, null, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this, com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToAddCard.INSTANCE, null), 3, null);
    }

    public static final /* synthetic */ void access$handleAuthorizeBACreationResponse(com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel, arrow.core.Either either) {
        com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationSuccess onAuthorizeBACreationSuccess;
        if (either instanceof arrow.core.Either.Left) {
            onAuthorizeBACreationSuccess = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationFailure((com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) ((arrow.core.Either.Left) either).getValue());
        } else {
            if (!(either instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity authorizeBACreationEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency = authorizeBACreationEntity.getContingency();
            if (contingency != null) {
                onAuthorizeBACreationSuccess = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationContingency(contingency);
            } else {
                onAuthorizeBACreationSuccess = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationSuccess(authorizeBACreationEntity);
            }
        }
        rypViewModel.onEvent(onAuthorizeBACreationSuccess);
    }
}
