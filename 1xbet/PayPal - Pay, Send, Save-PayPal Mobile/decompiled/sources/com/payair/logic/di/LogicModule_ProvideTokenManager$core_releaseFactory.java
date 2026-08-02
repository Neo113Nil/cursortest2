package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideTokenManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.TokenManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4421a;
    public final javax.inject.Provider b;
    public final javax.inject.Provider c;
    public final javax.inject.Provider d;
    public final javax.inject.Provider e;
    public final javax.inject.Provider f;
    public final javax.inject.Provider g;
    public final javax.inject.Provider h;
    public final javax.inject.Provider i;
    public final javax.inject.Provider j;

    public LogicModule_ProvideTokenManager$core_releaseFactory(javax.inject.Provider<com.payair.logic.remote.repositories.TokenRemoteRepository> provider, javax.inject.Provider<com.payair.logic.remote.repositories.UserRemoteRepository> provider2, javax.inject.Provider<com.payair.logic.remote.repositories.HceRemoteRepository> provider3, javax.inject.Provider<com.payair.logic.storage.StorageService> provider4, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider5, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider6, javax.inject.Provider<com.payair.db.Database> provider7, javax.inject.Provider<com.payair.logic.storage.TokenizationTimestampStorage> provider8, javax.inject.Provider<com.payair.logic.storage.EnrollmentIdStorage> provider9, javax.inject.Provider<com.payair.logic.storage.SchemeStorage> provider10) {
        this.f4421a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = provider5;
        this.f = provider6;
        this.g = provider7;
        this.h = provider8;
        this.i = provider9;
        this.j = provider10;
    }

    public static com.payair.logic.di.LogicModule_ProvideTokenManager$core_releaseFactory create(javax.inject.Provider<com.payair.logic.remote.repositories.TokenRemoteRepository> provider, javax.inject.Provider<com.payair.logic.remote.repositories.UserRemoteRepository> provider2, javax.inject.Provider<com.payair.logic.remote.repositories.HceRemoteRepository> provider3, javax.inject.Provider<com.payair.logic.storage.StorageService> provider4, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider5, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider6, javax.inject.Provider<com.payair.db.Database> provider7, javax.inject.Provider<com.payair.logic.storage.TokenizationTimestampStorage> provider8, javax.inject.Provider<com.payair.logic.storage.EnrollmentIdStorage> provider9, javax.inject.Provider<com.payair.logic.storage.SchemeStorage> provider10) {
        return new com.payair.logic.di.LogicModule_ProvideTokenManager$core_releaseFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static com.payair.logic.managers.TokenManager provideTokenManager$core_release(com.payair.logic.remote.repositories.TokenRemoteRepository tokenRemoteRepository, com.payair.logic.remote.repositories.UserRemoteRepository userRemoteRepository, com.payair.logic.remote.repositories.HceRemoteRepository hceRemoteRepository, com.payair.logic.storage.StorageService storageService, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider, com.payair.db.Database database, com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage, com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage, com.payair.logic.storage.SchemeStorage schemeStorage) {
        return (com.payair.logic.managers.TokenManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideTokenManager$core_release(tokenRemoteRepository, userRemoteRepository, hceRemoteRepository, storageService, hceSDKInterface, coroutineDispatcherProvider, database, tokenizationTimestampStorage, enrollmentIdStorage, schemeStorage));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.TokenManager get() {
        return provideTokenManager$core_release((com.payair.logic.remote.repositories.TokenRemoteRepository) this.f4421a.get(), (com.payair.logic.remote.repositories.UserRemoteRepository) this.b.get(), (com.payair.logic.remote.repositories.HceRemoteRepository) this.c.get(), (com.payair.logic.storage.StorageService) this.d.get(), (com.payair.logic.implementation.HceSDKInterface) this.e.get(), (com.payair.logic.managers.CoroutineDispatcherProvider) this.f.get(), (com.payair.db.Database) this.g.get(), (com.payair.logic.storage.TokenizationTimestampStorage) this.h.get(), (com.payair.logic.storage.EnrollmentIdStorage) this.i.get(), (com.payair.logic.storage.SchemeStorage) this.j.get());
    }
}
