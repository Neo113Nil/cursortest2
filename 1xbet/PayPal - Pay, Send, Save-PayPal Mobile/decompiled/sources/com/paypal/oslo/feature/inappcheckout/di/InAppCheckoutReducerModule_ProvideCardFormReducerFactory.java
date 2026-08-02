package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutReducerModule_ProvideCardFormReducerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer get() {
        return provideCardFormReducer();
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideCardFormReducerFactory create() {
        return com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideCardFormReducerFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer provideCardFormReducer() {
        return (com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule.INSTANCE.provideCardFormReducer());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideCardFormReducerFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule_ProvideCardFormReducerFactory();

        private InstanceHolder() {
        }
    }
}
