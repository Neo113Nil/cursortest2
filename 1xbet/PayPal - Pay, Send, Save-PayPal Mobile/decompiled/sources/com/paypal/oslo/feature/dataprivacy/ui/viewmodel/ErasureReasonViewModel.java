package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/ErasureReasonViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/CreateErasureRequestUseCase;", "createErasureRequestUseCase", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/CreateErasureRequestUseCase;)V", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureReason;", "reasons", "", "comments", "", "submitErasureRequest", "(Ljava/util/List;Ljava/lang/String;)V", "resetState", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/CreateErasureRequestUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/ErasureReasonUiState;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErasureReasonViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState> uiState;

    @javax.inject.Inject
    public ErasureReasonViewModel(com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase createErasureRequestUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createErasureRequestUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = createErasureRequestUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.Idle.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState> getUiState() {
        return this.uiState;
    }

    public final void submitErasureRequest(java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> reasons, java.lang.String comments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reasons, "");
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.Loading.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel$submitErasureRequest$1(this, reasons, comments, null), 3, null);
    }

    public final void resetState() {
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.Idle.INSTANCE);
    }
}
