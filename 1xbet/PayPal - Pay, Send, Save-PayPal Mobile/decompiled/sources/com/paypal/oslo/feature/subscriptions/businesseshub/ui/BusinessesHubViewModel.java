package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020#0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010."}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessesHubViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/usecase/GetLinkedBusinessesUseCase;", "getLinkedBusinessesUseCase", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "formatHelper", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;", "navigationCache", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/usecase/GetLinkedBusinessesUseCase;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;)V", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessesHubUiEvent;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessesHubUiEvent;)V", "loadBusinessAgreements", "()V", "clearBulkFINavigationCache", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/usecase/GetLinkedBusinessesUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessesHubUiEffect;", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "linkFlowRequestId", "Ljava/lang/String;", "getLinkFlowRequestId-QDVFmTU", "()Ljava/lang/String;", "agreementUpdateRequestId", "getAgreementUpdateRequestId-QDVFmTU"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BusinessesHubViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String agreementUpdateRequestId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect> getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache getHighSpeedVideoSizes;
    private final java.lang.String linkFlowRequestId;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState> state;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect> uiEffect;

    @javax.inject.Inject
    public BusinessesHubViewModel(com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase getLinkedBusinessesUseCase, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLinkedBusinessesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiNavigationCache, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getLinkedBusinessesUseCase;
        this.Camera2StreamConfigurationMap = formatHelper;
        this.getHighSpeedVideoSizes = bulkUpdateFiNavigationCache;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Initial.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighSpeedVideoFpsRanges = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        this.linkFlowRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.agreementUpdateRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        loadBusinessAgreements();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    /* renamed from: getLinkFlowRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getLinkFlowRequestId() {
        return this.linkFlowRequestId;
    }

    /* renamed from: getAgreementUpdateRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getAgreementUpdateRequestId() {
        return this.agreementUpdateRequestId;
    }

    public final void onEvent(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnBulkFiClicked.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel$sendEffect$1(this, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateToBulkFi.INSTANCE, null), 3, null);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnLinkedBusinessItemClicked) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel$sendEffect$1(this, new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateToBusinessDetails(((com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnLinkedBusinessItemClicked) event).getAgreementId()), null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnLinkBusinessesClicked.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel$sendEffect$1(this, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateToLinkBusinesses.INSTANCE, null), 3, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnCloseClicked.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel$sendEffect$1(this, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateBack.INSTANCE, null), 3, null);
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnInfoClicked.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel$sendEffect$1(this, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEffect.NavigateToAboutBusinesses.INSTANCE, null), 3, null);
        }
    }

    public final void loadBusinessAgreements() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel$loadBusinessAgreements$1(this, null), 3, null);
    }

    public final void clearBulkFINavigationCache() {
        this.getHighSpeedVideoSizes.clearAll();
    }
}
