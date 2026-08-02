package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapContainerViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "initialTab", "", "setInitialTab", "(I)V", "tab", "selectTab", "", "isSearchActive", "setSearchActive", "(Z)V", "", "query", "updateSearchQuery", "(Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapContainerUiState;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public class MapContainerViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState> uiState;

    @javax.inject.Inject
    public MapContainerViewModel() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState(0, false, null, 7, null));
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState> getUiState() {
        return this.uiState;
    }

    public final void setInitialTab(int initialTab) {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState.copy$default(value, initialTab, false, null, 6, null)));
    }

    public final void selectTab(int tab) {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState.copy$default(value, tab, false, null, 6, null)));
    }

    public final void setSearchActive(boolean isSearchActive) {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState.copy$default(value, 0, isSearchActive, null, 5, null)));
    }

    public final void updateSearchQuery(java.lang.String query) {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState.copy$default(value, 0, false, query, 3, null)));
    }
}
