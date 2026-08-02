package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class GetForbiddenErrorPresentationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase_Factory create() {
        return com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase newInstance() {
        return new com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
