package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class CalculateSourcePercentageUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase_Factory create() {
        return com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase newInstance() {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
