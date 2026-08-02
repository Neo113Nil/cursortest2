package com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/viewmodel/MockSelectionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "mockFileNameProvider", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/reducer/MockSelectionReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/reducer/MockSelectionReducer;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/reducer/MockSelectionReducer;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$State;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Effect;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockSelectionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.reducer.MockSelectionReducer Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect> effect;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State> state;

    @javax.inject.Inject
    public MockSelectionViewModel(com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider, com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.reducer.MockSelectionReducer mockSelectionReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockFileNameProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockSelectionReducer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = mockFileNameProvider;
        this.Camera2StreamConfigurationMap = mockSelectionReducer;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State(null, null, null, null, null, null, null, null, null, null, null, null, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null));
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighSpeedVideoFpsRanges = Channel$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        onEvent(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.LoadScenarios.INSTANCE);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect> getEffect() {
        return this.effect;
    }

    public final void onEvent(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow.setValue(this.Camera2StreamConfigurationMap.reduce(mutableStateFlow.getValue(), event));
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.ConfirmSelection) {
            com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State value = this.getHighSpeedVideoFpsRangesFor.getValue();
            this.getHighResolutionOutputSizeshNQ4ISI.setMockBaToken(value.getBaTokenValue());
            this.getHighResolutionOutputSizeshNQ4ISI.setShouldUseAuthFlow(value.getSelectedFlowType() == com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType.AUTH_FLOW);
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario selectedAuthScenario = value.getSelectedAuthScenario();
            if (selectedAuthScenario != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.setAuthMockFileName(selectedAuthScenario.getFileName());
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario selectedInitializeNativeRypCheckoutScenario = value.getSelectedInitializeNativeRypCheckoutScenario();
            if (selectedInitializeNativeRypCheckoutScenario != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.setInitializeNativeRypCheckoutMockFileName(selectedInitializeNativeRypCheckoutScenario.getFileName());
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario selectedAddCardScenario = value.getSelectedAddCardScenario();
            if (selectedAddCardScenario != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.setAddCardMockFileName(selectedAddCardScenario.getFileName());
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario selectedCtaScenario = value.getSelectedCtaScenario();
            if (selectedCtaScenario != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.setCtaMockFileName(selectedCtaScenario.getFileName());
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario selectedFiAfterCTAContingencyScenario = value.getSelectedFiAfterCTAContingencyScenario();
            if (selectedFiAfterCTAContingencyScenario != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.setFiAfterRypCTAContingencyMockFileName(selectedFiAfterCTAContingencyScenario.getFileName());
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel$confirmSelection$6(this, null), 3, null);
        }
    }
}
