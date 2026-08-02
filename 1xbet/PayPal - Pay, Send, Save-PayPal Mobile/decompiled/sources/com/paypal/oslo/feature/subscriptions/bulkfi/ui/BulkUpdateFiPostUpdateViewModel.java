package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020!0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;", "navigationCache", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/usecase/MergeBulkUpdateResultsUseCase;", "mergeBulkUpdateResultsUseCase", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/usecase/MergeBulkUpdateResultsUseCase;)V", "", "onUpdateFiChanged", "()V", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent;", "event", "onEvent", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent;)V", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult;", "getHighResolutionOutputSizeshNQ4ISI", "()Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/usecase/MergeBulkUpdateResultsUseCase;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiResultWithAgreements;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "updateResult", "Lkotlinx/coroutines/flow/StateFlow;", "getUpdateResult", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiPostUpdateUiEffect;", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "updateFiRequestId", "Ljava/lang/String;", "getUpdateFiRequestId-QDVFmTU", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkUpdateFiPostUpdateViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect> uiEffect;
    private final java.lang.String updateFiRequestId;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements> updateResult;

    @javax.inject.Inject
    public BulkUpdateFiPostUpdateViewModel(com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase mergeBulkUpdateResultsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiNavigationCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mergeBulkUpdateResultsUseCase, "");
        this.getHighSpeedVideoSizes = bulkUpdateFiNavigationCache;
        this.getHighSpeedVideoFpsRanges = mergeBulkUpdateResultsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.updateResult = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.Camera2StreamConfigurationMap = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        this.updateFiRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        MutableStateFlow.setValue(new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements(bulkUpdateFiNavigationCache.getUpdateResult(), bulkUpdateFiNavigationCache.getAgreementsMap(), bulkUpdateFiNavigationCache.getSelectedFundingInstruments()));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements> getUpdateResult() {
        return this.updateResult;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    /* renamed from: getUpdateFiRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getUpdateFiRequestId() {
        return this.updateFiRequestId;
    }

    public final void onUpdateFiChanged() {
        com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult updateResult = this.getHighSpeedVideoSizes.getUpdateResult();
        java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> agreementsMap = this.getHighSpeedVideoSizes.getAgreementsMap();
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements(this.getHighSpeedVideoFpsRanges.invoke(value != null ? value.getResult() : null, updateResult), kotlin.collections.MapsKt.toMap(agreementsMap), this.getHighSpeedVideoSizes.getSelectedFundingInstruments()));
    }

    public final void onEvent(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent event) {
        com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements value;
        java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> allAgreements;
        com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel preferredFundingInstrument;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick) {
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick onChangeClick = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick) event;
            java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onChangeClick.getAgreementIds());
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel$sendEffect$1(this, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateToUpdateFi(onChangeClick.getAgreementIds(), onChangeClick.getAgreementType(), (str == null || (value = this.getHighResolutionOutputSizeshNQ4ISI.getValue()) == null || (allAgreements = value.getAllAgreements()) == null || (subscriptionItemUiModel = allAgreements.get(str)) == null || (preferredFundingInstrument = subscriptionItemUiModel.getPreferredFundingInstrument()) == null) ? null : preferredFundingInstrument.getId()), null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnDoneClick.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel$sendEffect$1(this, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateToDone(getHighResolutionOutputSizeshNQ4ISI()), null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnCloseClick.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel$sendEffect$1(this, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateToClose(getHighResolutionOutputSizeshNQ4ISI()), null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnBackClick.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel$sendEffect$1(this, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateBack(getHighResolutionOutputSizeshNQ4ISI()), null), 3, null);
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnSystemBackPressed.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements value2 = this.updateResult.getValue();
        if (value2 == null || !value2.getAllFailed()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel$sendEffect$1(this, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateToClose(getHighResolutionOutputSizeshNQ4ISI()), null), 3, null);
        } else {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel$sendEffect$1(this, new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateBack(getHighResolutionOutputSizeshNQ4ISI()), null), 3, null);
        }
    }

    private final com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult getHighResolutionOutputSizeshNQ4ISI() {
        com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        boolean z = false;
        if (value != null && value.getHasAnySuccess()) {
            z = true;
        }
        return new com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult(z, true);
    }
}
