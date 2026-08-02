package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutReducerModule_ProvideRypReducerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer get() {
        return provideRypReducer();
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideRypReducerFactory create() {
        return com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideRypReducerFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer provideRypReducer() {
        return (com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule.INSTANCE.provideRypReducer());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideRypReducerFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideRypReducerFactory();

        private InstanceHolder() {
        }
    }
}
