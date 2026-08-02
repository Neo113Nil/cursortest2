package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class CreateActivityDetailsInitialUrlUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoFpsRanges;

    private CreateActivityDetailsInitialUrlUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase(dynamicConfiguration);
    }
}
