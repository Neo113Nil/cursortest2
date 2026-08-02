package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideDefaultHceEventListenerImpl$core_releaseFactory implements dagger.internal.Factory<com.payair.listener.DefaultHceEventListenerImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4408a;
    public final javax.inject.Provider b;
    public final javax.inject.Provider c;
    public final javax.inject.Provider d;
    public final javax.inject.Provider e;
    public final javax.inject.Provider f;
    public final javax.inject.Provider g;

    public LogicModule_ProvideDefaultHceEventListenerImpl$core_releaseFactory(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider, javax.inject.Provider<com.payair.logic.storage.StorageService> provider2, javax.inject.Provider<com.payair.db.Database> provider3, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider4, javax.inject.Provider<com.payair.logic.storage.SchemeStorage> provider5, javax.inject.Provider<com.payair.logic.storage.EnrollmentIdStorage> provider6, javax.inject.Provider<com.payair.logic.managers.TokenRefreshManager> provider7) {
        this.f4408a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = provider5;
        this.f = provider6;
        this.g = provider7;
    }

    public static com.payair.logic.di.LogicModule_ProvideDefaultHceEventListenerImpl$core_releaseFactory create(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider, javax.inject.Provider<com.payair.logic.storage.StorageService> provider2, javax.inject.Provider<com.payair.db.Database> provider3, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider4, javax.inject.Provider<com.payair.logic.storage.SchemeStorage> provider5, javax.inject.Provider<com.payair.logic.storage.EnrollmentIdStorage> provider6, javax.inject.Provider<com.payair.logic.managers.TokenRefreshManager> provider7) {
        return new com.payair.logic.di.LogicModule_ProvideDefaultHceEventListenerImpl$core_releaseFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.payair.listener.DefaultHceEventListenerImpl provideDefaultHceEventListenerImpl$core_release(com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.storage.StorageService storageService, com.payair.db.Database database, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider, com.payair.logic.storage.SchemeStorage schemeStorage, com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage, com.payair.logic.managers.TokenRefreshManager tokenRefreshManager) {
        return (com.payair.listener.DefaultHceEventListenerImpl) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideDefaultHceEventListenerImpl$core_release(hceSDKInterface, storageService, database, coroutineDispatcherProvider, schemeStorage, enrollmentIdStorage, tokenRefreshManager));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.listener.DefaultHceEventListenerImpl get() {
        return provideDefaultHceEventListenerImpl$core_release((com.payair.logic.implementation.HceSDKInterface) this.f4408a.get(), (com.payair.logic.storage.StorageService) this.b.get(), (com.payair.db.Database) this.c.get(), (com.payair.logic.managers.CoroutineDispatcherProvider) this.d.get(), (com.payair.logic.storage.SchemeStorage) this.e.get(), (com.payair.logic.storage.EnrollmentIdStorage) this.f.get(), (com.payair.logic.managers.TokenRefreshManager) this.g.get());
    }
}
