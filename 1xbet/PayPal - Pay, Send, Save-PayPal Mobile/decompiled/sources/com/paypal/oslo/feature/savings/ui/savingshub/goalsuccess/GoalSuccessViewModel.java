package com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/goalsuccess/GoalSuccessViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/savings/domain/usecase/UpdateGoalSuccessShownUseCase;", "updateGoalSuccessShownUseCase", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/usecase/UpdateGoalSuccessShownUseCase;)V", "", "moneyboxId", "", "acknowledgeGoalSuccess", "(Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/savings/domain/usecase/UpdateGoalSuccessShownUseCase;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GoalSuccessViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.UpdateGoalSuccessShownUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GoalSuccessViewModel(com.paypal.oslo.feature.savings.domain.usecase.UpdateGoalSuccessShownUseCase updateGoalSuccessShownUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateGoalSuccessShownUseCase, "");
        this.getHighSpeedVideoSizes = updateGoalSuccessShownUseCase;
    }

    public final void acknowledgeGoalSuccess(java.lang.String moneyboxId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel$acknowledgeGoalSuccess$1(this, moneyboxId, null), 3, null);
    }
}
