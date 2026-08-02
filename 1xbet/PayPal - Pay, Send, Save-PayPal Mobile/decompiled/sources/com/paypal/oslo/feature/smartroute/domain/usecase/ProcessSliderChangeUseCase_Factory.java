package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class ProcessSliderChangeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase_Factory create() {
        return com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase newInstance() {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
