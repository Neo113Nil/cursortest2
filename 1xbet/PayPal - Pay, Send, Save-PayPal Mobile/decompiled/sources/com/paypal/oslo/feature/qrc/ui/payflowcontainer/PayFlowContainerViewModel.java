package com.paypal.oslo.feature.qrc.ui.payflowcontainer;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerReducer;", "reducer", "Lcom/paypal/oslo/feature/qrc/featureflags/QrcFeatureGateConfig;", "featureGateConfig", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerReducer;Lcom/paypal/oslo/feature/qrc/featureflags/QrcFeatureGateConfig;)V", "", "onScreenLoad", "()V", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent;", "event", "handleIntent", "(Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerReducer;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/qrc/featureflags/QrcFeatureGateConfig;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerUiState;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerUiEffect;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PayFlowContainerViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiState, com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent, com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiState> uiState;

    @javax.inject.Inject
    public PayFlowContainerViewModel(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer payFlowContainerReducer, com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig qrcFeatureGateConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payFlowContainerReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcFeatureGateConfig, "");
        this.getHighResolutionOutputSizeshNQ4ISI = payFlowContainerReducer;
        this.getHighSpeedVideoFpsRangesFor = qrcFeatureGateConfig;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiState, com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent, com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("PayFlowContainerViewModel.store", com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiState.Initial.INSTANCE, payFlowContainerReducer, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void onScreenLoad() {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab.Scanner);
        if (this.getHighSpeedVideoFpsRangesFor.isGetPaidP2pQrCodeEnabled()) {
            createListBuilder.add(com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab.GetPaid);
        }
        if (this.getHighSpeedVideoFpsRangesFor.isShowToPayEnabled()) {
            createListBuilder.add(com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab.ShowToPay);
        }
        this.getHighSpeedVideoFpsRanges.onEvent(new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadScreen(kotlin.collections.CollectionsKt.build(createListBuilder)));
    }

    public final void handleIntent(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }
}
