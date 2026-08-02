package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/api/IsTapToPayEnabledImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/IsTapToPayEnabled;", "Lcom/paypal/oslo/feature/taptopay/api/domain/capability/TapToPayDeviceCapability;", "deviceCapability", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "tapToPayConfigManager", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceCompromisedUseCase;", "isDeviceCompromised", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/domain/capability/TapToPayDeviceCapability;Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceCompromisedUseCase;)V", "", "invoke", "()Z", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/api/domain/capability/TapToPayDeviceCapability;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceCompromisedUseCase;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IsTapToPayEnabledImpl implements com.paypal.oslo.feature.taptopay.api.domain.usecase.IsTapToPayEnabled {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public IsTapToPayEnabledImpl(com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability tapToPayDeviceCapability, com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase isDeviceCompromisedUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayDeviceCapability, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isDeviceCompromisedUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = tapToPayDeviceCapability;
        this.getHighSpeedVideoFpsRanges = manager;
        this.getHighSpeedVideoSizes = isDeviceCompromisedUseCase;
    }

    @Override // com.paypal.oslo.feature.taptopay.api.domain.usecase.IsTapToPayEnabled
    public final boolean invoke() {
        boolean isTapToPayEnabled = this.getHighSpeedVideoFpsRanges.isTapToPayEnabled();
        boolean isNFCSupported = this.getHighSpeedVideoFpsRangesFor.isNFCSupported();
        boolean invoke = this.getHighSpeedVideoSizes.invoke();
        boolean z = isTapToPayEnabled && isNFCSupported && !invoke;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Tap to Pay enabled check", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isTapToPayEnabled", java.lang.Boolean.valueOf(isTapToPayEnabled)), kotlin.TuplesKt.to("isNfcSupported", java.lang.Boolean.valueOf(isNFCSupported)), kotlin.TuplesKt.to("isDeviceCompromised", java.lang.Boolean.valueOf(invoke)), kotlin.TuplesKt.to("isSupported", java.lang.Boolean.valueOf(z))), null, 4, null);
        return z;
    }
}
