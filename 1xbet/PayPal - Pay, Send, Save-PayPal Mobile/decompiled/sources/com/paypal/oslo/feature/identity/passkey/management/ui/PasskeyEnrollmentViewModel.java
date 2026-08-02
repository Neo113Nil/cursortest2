package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/usecase/PasskeyCreateUseCase;", "passkeyCreateUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/usecase/PasskeyCreateUseCase;)V", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "()V", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/usecase/PasskeyCreateUseCase;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiEffect;", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyEnrollmentViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState> uiState;

    @javax.inject.Inject
    public PasskeyEnrollmentViewModel(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase passkeyCreateUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateUseCase, "");
        this.getHighSpeedVideoFpsRanges = passkeyCreateUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Idle.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighSpeedVideoSizes = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onEvent(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError = null;
        java.lang.Object[] objArr = 0;
        if (event instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey) {
            com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey createPasskey = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey) event;
            android.content.Context activityContext = createPasskey.getActivityContext();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel$createPasskey$1(this, createPasskey.getPublicCredential(), activityContext, null), 3, null);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissGotIt) {
            if (this.Camera2StreamConfigurationMap.getValue() instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        } else {
            if (!(event instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissBannerError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState value = this.Camera2StreamConfigurationMap.getValue();
            if (value instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error) {
                getHighResolutionOutputSizeshNQ4ISI();
            } else {
                if (!(value instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling) || ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling) value).getError() == null) {
                    return;
                }
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling(passkeyCreateError, 1, objArr == true ? 1 : 0))) {
                }
            }
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Idle.INSTANCE)) {
        }
    }
}
