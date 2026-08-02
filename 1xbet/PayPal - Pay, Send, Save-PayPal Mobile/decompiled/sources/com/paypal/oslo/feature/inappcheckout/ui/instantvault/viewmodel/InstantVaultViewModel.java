package com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0018\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/viewmodel/InstantVaultViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/reducer/InstantVaultReducer;", "reducer", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/AuthorizeBillingAgreementUseCase;", "authorizeBillingAgreementUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/reducer/InstantVaultReducer;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/AuthorizeBillingAgreementUseCase;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "response", "", "initialize", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "event", "onEvent", "(Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/reducer/InstantVaultReducer;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/AuthorizeBillingAgreementUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$State;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Larrow/atomic/AtomicBoolean;", "Larrow/atomic/AtomicBoolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstantVaultViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final arrow.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State> state;

    @javax.inject.Inject
    public InstantVaultViewModel(com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer instantVaultReducer, com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase authorizeBillingAgreementUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instantVaultReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizeBillingAgreementUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = instantVaultReducer;
        this.Camera2StreamConfigurationMap = authorizeBillingAgreementUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State(null, null, null, null, null, false, null, false, null, 511, null));
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRanges = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.getHighSpeedVideoFpsRangesFor = new arrow.atomic.AtomicBoolean(false);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect> getEffect() {
        return this.effect;
    }

    public final void initialize(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (this.getHighSpeedVideoFpsRangesFor.getValue()) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.set(true);
        onEvent(new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContent(response));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x016d, code lost:
    
        r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r9), null, null, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$emitEffect$1(r9, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError(com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.toErrorScreenType(r9.getHighSpeedVideoSizes.getValue().getError()), com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.cancelUrl(r9.getHighSpeedVideoSizes.getValue().getInitializeCheckoutEntity())), null), 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01aa, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onEvent(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event event) {
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State> mutableStateFlow = this.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(this.getHighResolutionOutputSizeshNQ4ISI.reduce(mutableStateFlow.getValue(), event));
            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContent)) {
                if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAgreeAndContinue) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$handleAgreeAndContinue$1(this, null), 3, null);
                    return;
                }
                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationSuccess)) {
                    if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$onContingencyOccurred$1(((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency) event).getEntity(), this, null), 3, null);
                        return;
                    }
                    if ((event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationFailure) || (event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyError)) {
                        break;
                    }
                    if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.RetryLastOperation)) {
                        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.ReturnToMerchant) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$emitEffect$1(this, com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateBackToMerchant.INSTANCE, null), 3, null);
                            return;
                        } else {
                            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyNotHandled) && !(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.HandleBackPress)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            return;
                        }
                    }
                    event = com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAgreeAndContinue.INSTANCE;
                } else {
                    com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity = this.getHighSpeedVideoSizes.getValue().getInitializeCheckoutEntity();
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToSuccessScreen(new com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData(com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.merchantName(initializeCheckoutEntity), com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.returnUrl(initializeCheckoutEntity))), null), 3, null);
                    return;
                }
            } else {
                com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity buyerInfoContingency = this.getHighSpeedVideoSizes.getValue().getBuyerInfoContingency();
                if (buyerInfoContingency == null) {
                    buyerInfoContingency = this.getHighSpeedVideoSizes.getValue().getContingency();
                }
                if (buyerInfoContingency != null) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$onContingencyOccurred$1(buyerInfoContingency, this, null), 3, null);
                    return;
                } else if (this.getHighSpeedVideoSizes.getValue().getError() != null) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError(com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.toErrorScreenType(this.getHighSpeedVideoSizes.getValue().getError()), com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.cancelUrl(this.getHighSpeedVideoSizes.getValue().getInitializeCheckoutEntity())), null), 3, null);
                    return;
                } else {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel$emitEffect$1(this, com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.LoadCardMetaData.INSTANCE, null), 3, null);
                    return;
                }
            }
        }
    }

    public static final /* synthetic */ void access$handleAuthorizeBACreationResponse(com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel, arrow.core.Either either) {
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationSuccess onAuthorizeBACreationSuccess;
        if (either instanceof arrow.core.Either.Left) {
            onAuthorizeBACreationSuccess = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationFailure((com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) ((arrow.core.Either.Left) either).getValue());
        } else {
            if (!(either instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity authorizeBACreationEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency = authorizeBACreationEntity.getContingency();
            if (contingency != null) {
                onAuthorizeBACreationSuccess = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency(contingency);
            } else {
                onAuthorizeBACreationSuccess = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationSuccess(authorizeBACreationEntity);
            }
        }
        instantVaultViewModel.onEvent(onAuthorizeBACreationSuccess);
    }
}
