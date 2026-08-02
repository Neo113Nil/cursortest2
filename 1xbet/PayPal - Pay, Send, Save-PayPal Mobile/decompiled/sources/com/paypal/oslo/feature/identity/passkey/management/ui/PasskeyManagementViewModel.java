package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/usecase/PasskeyListUseCase;", "passkeyListUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/usecase/PasskeyListUseCase;)V", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementEvent;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementEvent;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/usecase/PasskeyListUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyManagementViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState> uiState;

    @javax.inject.Inject
    public PasskeyManagementViewModel(com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase passkeyListUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyListUseCase, "");
        this.getHighSpeedVideoSizes = passkeyListUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.Loading.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel$loadPasskeys$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState> getUiState() {
        return this.uiState;
    }

    public final void onEvent(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementEvent.RetryLoad) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel$loadPasskeys$1(this, null), 3, null);
            return;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
