package com.paypal.oslo.feature.activity.di.module;

/* loaded from: classes10.dex */
public final class RepositoryModule_ProvideErrorMapperFactory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper get() {
        return provideErrorMapper();
    }

    public static com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideErrorMapperFactory create() {
        return com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideErrorMapperFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper provideErrorMapper() {
        return (com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.activity.di.module.RepositoryModule.INSTANCE.provideErrorMapper());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideErrorMapperFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideErrorMapperFactory();

        private InstanceHolder() {
        }
    }
}
