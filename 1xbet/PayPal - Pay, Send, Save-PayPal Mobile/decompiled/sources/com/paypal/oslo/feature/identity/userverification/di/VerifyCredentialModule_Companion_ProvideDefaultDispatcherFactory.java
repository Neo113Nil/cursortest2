package com.paypal.oslo.feature.identity.userverification.di;

/* loaded from: classes13.dex */
public final class VerifyCredentialModule_Companion_ProvideDefaultDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideDefaultDispatcher();
    }

    public static com.paypal.oslo.feature.identity.userverification.di.VerifyCredentialModule_Companion_ProvideDefaultDispatcherFactory create() {
        return com.paypal.oslo.feature.identity.userverification.di.VerifyCredentialModule_Companion_ProvideDefaultDispatcherFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideDefaultDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.userverification.di.VerifyCredentialModule.INSTANCE.provideDefaultDispatcher());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.userverification.di.VerifyCredentialModule_Companion_ProvideDefaultDispatcherFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.userverification.di.VerifyCredentialModule_Companion_ProvideDefaultDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
