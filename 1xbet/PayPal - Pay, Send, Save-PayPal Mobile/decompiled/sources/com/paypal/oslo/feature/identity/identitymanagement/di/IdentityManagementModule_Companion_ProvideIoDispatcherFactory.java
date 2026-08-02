package com.paypal.oslo.feature.identity.identitymanagement.di;

/* loaded from: classes5.dex */
public final class IdentityManagementModule_Companion_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.feature.identity.identitymanagement.di.IdentityManagementModule_Companion_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.feature.identity.identitymanagement.di.IdentityManagementModule_Companion_ProvideIoDispatcherFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.identitymanagement.di.IdentityManagementModule.INSTANCE.provideIoDispatcher());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.identitymanagement.di.IdentityManagementModule_Companion_ProvideIoDispatcherFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.identitymanagement.di.IdentityManagementModule_Companion_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
