package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class ValidateDistributionStateUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.ValidateDistributionStateUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.ValidateDistributionStateUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.ValidateDistributionStateUseCase_Factory create() {
        return com.paypal.oslo.feature.smartroute.domain.usecase.ValidateDistributionStateUseCase_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.ValidateDistributionStateUseCase newInstance() {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.ValidateDistributionStateUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.smartroute.domain.usecase.ValidateDistributionStateUseCase_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.smartroute.domain.usecase.ValidateDistributionStateUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
