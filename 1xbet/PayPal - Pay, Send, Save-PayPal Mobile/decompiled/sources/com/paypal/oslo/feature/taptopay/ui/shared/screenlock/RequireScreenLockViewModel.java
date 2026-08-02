package com.paypal.oslo.feature.taptopay.ui.shared.screenlock;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/shared/screenlock/RequireScreenLockViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceScreenLockEnabledUseCase;", "isDeviceScreenLockEnabledUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceScreenLockEnabledUseCase;)V", "", "checkScreenLockStatus", "()V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceScreenLockEnabledUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "screenLockEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "getScreenLockEnabled", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RequireScreenLockViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> screenLockEnabled;

    @javax.inject.Inject
    public RequireScreenLockViewModel(com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase isDeviceScreenLockEnabledUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isDeviceScreenLockEnabledUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = isDeviceScreenLockEnabledUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.screenLockEnabled = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getScreenLockEnabled() {
        return this.screenLockEnabled;
    }

    public final void checkScreenLockStatus() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "checkScreenLockStatus", null, null, 6, null);
        this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRangesFor.invoke()));
    }
}
