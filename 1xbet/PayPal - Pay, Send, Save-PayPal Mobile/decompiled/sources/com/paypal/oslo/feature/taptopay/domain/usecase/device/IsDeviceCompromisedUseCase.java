package com.paypal.oslo.feature.taptopay.domain.usecase.device;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceCompromisedUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/capability/device/DeviceIntegrityChecker;", "deviceIntegrityChecker", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/capability/device/DeviceIntegrityChecker;)V", "", "invoke", "()Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/capability/device/DeviceIntegrityChecker;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IsDeviceCompromisedUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.capability.device.DeviceIntegrityChecker getHighSpeedVideoSizes;

    @javax.inject.Inject
    public IsDeviceCompromisedUseCase(com.paypal.oslo.feature.taptopay.domain.capability.device.DeviceIntegrityChecker deviceIntegrityChecker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceIntegrityChecker, "");
        this.getHighSpeedVideoSizes = deviceIntegrityChecker;
    }

    public final boolean invoke() {
        return this.getHighSpeedVideoSizes.isDeviceCompromised();
    }
}
