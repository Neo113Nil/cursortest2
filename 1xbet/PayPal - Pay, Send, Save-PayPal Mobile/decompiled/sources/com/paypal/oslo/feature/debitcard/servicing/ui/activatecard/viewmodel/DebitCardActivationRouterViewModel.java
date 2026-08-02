package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/DebitCardActivationRouterViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "updateNavigationState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/NavigationState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "navigationState", "Lkotlinx/coroutines/flow/StateFlow;", "getNavigationState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardActivationRouterViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState> navigationState;

    @javax.inject.Inject
    public DebitCardActivationRouterViewModel() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState.INITIAL);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.navigationState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState> getNavigationState() {
        return this.navigationState;
    }

    public final void updateNavigationState() {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState.COMPLETED);
    }
}
