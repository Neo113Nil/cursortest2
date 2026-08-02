package com.paypal.oslo.feature.taptopay.domain.usecase.device;

/* loaded from: classes15.dex */
public final class IsApiLevelSupportedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase_Factory create() {
        return com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase newInstance() {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
