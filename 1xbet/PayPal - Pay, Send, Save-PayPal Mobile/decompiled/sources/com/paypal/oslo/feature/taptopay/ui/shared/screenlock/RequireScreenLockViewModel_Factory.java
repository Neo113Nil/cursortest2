package com.paypal.oslo.feature.taptopay.ui.shared.screenlock;

/* loaded from: classes15.dex */
public final class RequireScreenLockViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.shared.screenlock.RequireScreenLockViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase> getHighSpeedVideoFpsRangesFor;

    private RequireScreenLockViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.shared.screenlock.RequireScreenLockViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.shared.screenlock.RequireScreenLockViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.ui.shared.screenlock.RequireScreenLockViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.ui.shared.screenlock.RequireScreenLockViewModel newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase isDeviceScreenLockEnabledUseCase) {
        return new com.paypal.oslo.feature.taptopay.ui.shared.screenlock.RequireScreenLockViewModel(isDeviceScreenLockEnabledUseCase);
    }
}
