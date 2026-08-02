package com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/viewmodel/SubscriptionsHubViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/usecase/GetSubscriptionsUseCase;", "getSubscriptionsUseCase", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "formatHelper", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;", "navigationCache", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/hub/domain/usecase/GetSubscriptionsUseCase;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;)V", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;)V", "clearBulkFINavigationCache", "()V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/usecase/GetSubscriptionsUseCase;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$subscriptions_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect;", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "agreementUpdateRequestId", "Ljava/lang/String;", "getAgreementUpdateRequestId-QDVFmTU", "()Ljava/lang/String;", "linkFlowRequestId", "getLinkFlowRequestId-QDVFmTU"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionsHubViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState> Camera2StreamConfigurationMap;
    private final java.lang.String agreementUpdateRequestId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache getHighSpeedVideoFpsRangesFor;
    private final java.lang.String linkFlowRequestId;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState> uiState;

    @javax.inject.Inject
    public SubscriptionsHubViewModel(com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase getSubscriptionsUseCase, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSubscriptionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiNavigationCache, "");
        this.getHighSpeedVideoFpsRanges = getSubscriptionsUseCase;
        this.getHighSpeedVideoSizes = formatHelper;
        this.getHighSpeedVideoFpsRangesFor = bulkUpdateFiNavigationCache;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Idle.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighResolutionOutputSizeshNQ4ISI = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$loadSubscriptions$1(this, null), 3, null);
        this.agreementUpdateRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.linkFlowRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState> getUiState$subscriptions_prodRelease() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    /* renamed from: getAgreementUpdateRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getAgreementUpdateRequestId() {
        return this.agreementUpdateRequestId;
    }

    /* renamed from: getLinkFlowRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getLinkFlowRequestId() {
        return this.linkFlowRequestId;
    }

    public final void onEvent(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.AddClicked.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$sendEffect$1(this, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToLinkSubscriptions.INSTANCE, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.InfoClicked.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$sendEffect$1(this, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToAboutSubscriptions.INSTANCE, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.LinkSubscriptionsClicked.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$sendEffect$1(this, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToLinkSubscriptions.INSTANCE, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.RefreshTriggered.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$loadSubscriptions$1(this, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.TryAgainClicked.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$loadSubscriptions$1(this, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.UpdateClicked.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$sendEffect$1(this, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToBulkUpdateFi.INSTANCE, null), 3, null);
        } else if (event instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.SubscriptionClicked) {
            com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.SubscriptionClicked subscriptionClicked = (com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.SubscriptionClicked) event;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$sendEffect$1(this, new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails(subscriptionClicked.getSubscription().getId(), subscriptionClicked.getSubscription().getType(), this.agreementUpdateRequestId, defaultConstructorMarker), null), 3, null);
        } else {
            if (event instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.TabReselected) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$loadSubscriptions$1(this, null), 3, null);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final void clearBulkFINavigationCache() {
        this.getHighSpeedVideoFpsRangesFor.clearAll();
    }
}
