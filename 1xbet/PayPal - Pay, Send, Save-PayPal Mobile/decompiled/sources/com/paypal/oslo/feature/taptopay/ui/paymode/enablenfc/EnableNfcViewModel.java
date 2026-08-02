package com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/enablenfc/EnableNfcViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcEnabledUseCase;", "isNfcEnabledUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcEnabledUseCase;)V", "", "checkNfcStatus", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcEnabledUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "isNfcEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EnableNfcViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isNfcEnabled;

    @javax.inject.Inject
    public EnableNfcViewModel(com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase isNfcEnabledUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isNfcEnabledUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = isNfcEnabledUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.isNfcEnabled = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isNfcEnabled() {
        return this.isNfcEnabled;
    }

    public final void checkNfcStatus() {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRangesFor.invoke()));
    }
}
