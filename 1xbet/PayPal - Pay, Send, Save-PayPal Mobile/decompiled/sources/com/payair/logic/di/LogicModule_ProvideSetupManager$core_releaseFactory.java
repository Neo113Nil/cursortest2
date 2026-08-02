package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideSetupManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.SetupManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4419a;
    public final javax.inject.Provider b;
    public final javax.inject.Provider c;
    public final javax.inject.Provider d;
    public final javax.inject.Provider e;
    public final javax.inject.Provider f;
    public final javax.inject.Provider g;
    public final javax.inject.Provider h;
    public final javax.inject.Provider i;

    public LogicModule_ProvideSetupManager$core_releaseFactory(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider, javax.inject.Provider<com.payair.logic.storage.StorageService> provider2, javax.inject.Provider<com.payair.logic.managers.PushManager> provider3, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider4, javax.inject.Provider<com.payair.logic.managers.RegistrationStatusManager> provider5, javax.inject.Provider<com.payair.logic.storage.implementation.CertificateStorage> provider6, javax.inject.Provider<com.payair.listener.DefaultHceEventListenerImpl> provider7, javax.inject.Provider<com.payair.db.Database> provider8, javax.inject.Provider<com.payair.logic.storage.SchemeStorage> provider9) {
        this.f4419a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = provider5;
        this.f = provider6;
        this.g = provider7;
        this.h = provider8;
        this.i = provider9;
    }

    public static com.payair.logic.di.LogicModule_ProvideSetupManager$core_releaseFactory create(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider, javax.inject.Provider<com.payair.logic.storage.StorageService> provider2, javax.inject.Provider<com.payair.logic.managers.PushManager> provider3, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider4, javax.inject.Provider<com.payair.logic.managers.RegistrationStatusManager> provider5, javax.inject.Provider<com.payair.logic.storage.implementation.CertificateStorage> provider6, javax.inject.Provider<com.payair.listener.DefaultHceEventListenerImpl> provider7, javax.inject.Provider<com.payair.db.Database> provider8, javax.inject.Provider<com.payair.logic.storage.SchemeStorage> provider9) {
        return new com.payair.logic.di.LogicModule_ProvideSetupManager$core_releaseFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static com.payair.logic.managers.SetupManager provideSetupManager$core_release(com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.storage.StorageService storageService, com.payair.logic.managers.PushManager pushManager, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider, com.payair.logic.managers.RegistrationStatusManager registrationStatusManager, com.payair.logic.storage.implementation.CertificateStorage certificateStorage, com.payair.listener.DefaultHceEventListenerImpl defaultHceEventListenerImpl, com.payair.db.Database database, com.payair.logic.storage.SchemeStorage schemeStorage) {
        return (com.payair.logic.managers.SetupManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideSetupManager$core_release(hceSDKInterface, storageService, pushManager, coroutineDispatcherProvider, registrationStatusManager, certificateStorage, defaultHceEventListenerImpl, database, schemeStorage));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.SetupManager get() {
        return provideSetupManager$core_release((com.payair.logic.implementation.HceSDKInterface) this.f4419a.get(), (com.payair.logic.storage.StorageService) this.b.get(), (com.payair.logic.managers.PushManager) this.c.get(), (com.payair.logic.managers.CoroutineDispatcherProvider) this.d.get(), (com.payair.logic.managers.RegistrationStatusManager) this.e.get(), (com.payair.logic.storage.implementation.CertificateStorage) this.f.get(), (com.payair.listener.DefaultHceEventListenerImpl) this.g.get(), (com.payair.db.Database) this.h.get(), (com.payair.logic.storage.SchemeStorage) this.i.get());
    }
}
