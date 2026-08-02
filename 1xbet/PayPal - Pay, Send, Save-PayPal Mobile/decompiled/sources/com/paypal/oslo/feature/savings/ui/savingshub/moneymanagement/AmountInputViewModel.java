package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AmountInputViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "amount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "selectedGoal", "", "onSubmitClick", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AmountInputUiState;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AmountInputSubmitData;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "submitEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getSubmitEvent", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AmountInputViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputUiState> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData> submitEvent;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputUiState> uiState;

    @javax.inject.Inject
    public AmountInputViewModel() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputUiState.Idle.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.submitEvent = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData> getSubmitEvent() {
        return this.submitEvent;
    }

    public final void onSubmitClick(java.lang.String amount, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO selectedGoal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedGoal, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel$onSubmitClick$1(this, amount, selectedGoal, null), 3, null);
    }
}
