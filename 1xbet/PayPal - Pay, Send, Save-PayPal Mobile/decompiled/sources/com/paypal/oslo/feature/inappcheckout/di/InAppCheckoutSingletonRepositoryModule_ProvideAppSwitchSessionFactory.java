package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes5.dex */
public final class InAppCheckoutSingletonRepositoryModule_ProvideAppSwitchSessionFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession get() {
        return provideAppSwitchSession();
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutSingletonRepositoryModule_ProvideAppSwitchSessionFactory create() {
        return com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutSingletonRepositoryModule_ProvideAppSwitchSessionFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession provideAppSwitchSession() {
        return (com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutSingletonRepositoryModule.INSTANCE.provideAppSwitchSession());
    }

    /* loaded from: classes13.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutSingletonRepositoryModule_ProvideAppSwitchSessionFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutSingletonRepositoryModule_ProvideAppSwitchSessionFactory();

        private InstanceHolder() {
        }
    }
}
