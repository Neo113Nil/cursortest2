package com.paypal.oslo.feature.cashin.domain.usecase;

/* loaded from: classes11.dex */
public final class CheckLocationEnabledUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCaseImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCaseImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCaseImpl_Factory create() {
        return com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCaseImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCaseImpl newInstance() {
        return new com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCaseImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCaseImpl_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCaseImpl_Factory();

        private InstanceHolder() {
        }
    }
}
