package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutReducerModule_ProvideOneShotReducerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer get() {
        return provideOneShotReducer();
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideOneShotReducerFactory create() {
        return com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideOneShotReducerFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer provideOneShotReducer() {
        return (com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule.INSTANCE.provideOneShotReducer());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideOneShotReducerFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideOneShotReducerFactory();

        private InstanceHolder() {
        }
    }
}
