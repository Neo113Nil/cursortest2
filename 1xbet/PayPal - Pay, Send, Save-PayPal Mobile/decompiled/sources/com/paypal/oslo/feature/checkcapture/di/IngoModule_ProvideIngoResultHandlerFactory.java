package com.paypal.oslo.feature.checkcapture.di;

/* loaded from: classes5.dex */
public final class IngoModule_ProvideIngoResultHandlerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler get() {
        return provideIngoResultHandler();
    }

    public static com.paypal.oslo.feature.checkcapture.di.IngoModule_ProvideIngoResultHandlerFactory create() {
        return com.paypal.oslo.feature.checkcapture.di.IngoModule_ProvideIngoResultHandlerFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler provideIngoResultHandler() {
        return (com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.checkcapture.di.IngoModule.INSTANCE.provideIngoResultHandler());
    }

    /* loaded from: classes11.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.checkcapture.di.IngoModule_ProvideIngoResultHandlerFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.checkcapture.di.IngoModule_ProvideIngoResultHandlerFactory();

        private InstanceHolder() {
        }
    }
}
