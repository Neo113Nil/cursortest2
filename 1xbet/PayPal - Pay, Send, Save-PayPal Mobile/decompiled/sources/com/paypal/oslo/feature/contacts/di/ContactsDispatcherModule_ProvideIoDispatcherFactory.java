package com.paypal.oslo.feature.contacts.di;

/* loaded from: classes5.dex */
public final class ContactsDispatcherModule_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.feature.contacts.di.ContactsDispatcherModule_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.feature.contacts.di.ContactsDispatcherModule_ProvideIoDispatcherFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.contacts.di.ContactsDispatcherModule.INSTANCE.provideIoDispatcher());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.contacts.di.ContactsDispatcherModule_ProvideIoDispatcherFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.contacts.di.ContactsDispatcherModule_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
