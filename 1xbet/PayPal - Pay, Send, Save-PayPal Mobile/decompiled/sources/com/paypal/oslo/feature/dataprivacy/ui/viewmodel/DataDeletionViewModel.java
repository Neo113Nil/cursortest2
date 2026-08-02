package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataDeletionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetLinkedAccountsUseCase;", "getLinkedAccountsUseCase", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetLinkedAccountsUseCase;)V", "", "onContinueConfirmed", "()V", "onNavigationHandled", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetLinkedAccountsUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataDeletionUiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataDeletionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState> uiState;

    @javax.inject.Inject
    public DataDeletionViewModel(com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase getLinkedAccountsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLinkedAccountsUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getLinkedAccountsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState.Idle.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState> getUiState() {
        return this.uiState;
    }

    public final void onContinueConfirmed() {
        this.Camera2StreamConfigurationMap.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState.Loading.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel$onContinueConfirmed$1(this, null), 3, null);
    }

    public final void onNavigationHandled() {
        this.Camera2StreamConfigurationMap.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState.Idle.INSTANCE);
    }

    public static final /* synthetic */ void access$handleLinkedAccounts(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel dataDeletionViewModel, java.util.List list) {
        if (list.isEmpty()) {
            dataDeletionViewModel.Camera2StreamConfigurationMap.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState.NavigateToEmailConfirmation.INSTANCE);
        } else {
            dataDeletionViewModel.Camera2StreamConfigurationMap.setValue(new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState.NavigateToLinkedAccounts(list));
        }
    }
}
