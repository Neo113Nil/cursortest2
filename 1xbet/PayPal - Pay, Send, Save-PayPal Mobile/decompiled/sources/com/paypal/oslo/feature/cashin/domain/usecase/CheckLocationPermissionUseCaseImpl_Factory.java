package com.paypal.oslo.feature.cashin.domain.usecase;

/* loaded from: classes11.dex */
public final class CheckLocationPermissionUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCaseImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCaseImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCaseImpl_Factory create() {
        return com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCaseImpl_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCaseImpl newInstance() {
        return new com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCaseImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCaseImpl_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCaseImpl_Factory();

        private InstanceHolder() {
        }
    }
}
