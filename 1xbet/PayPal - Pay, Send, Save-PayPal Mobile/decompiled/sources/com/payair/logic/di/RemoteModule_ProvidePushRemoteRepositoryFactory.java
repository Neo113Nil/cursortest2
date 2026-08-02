package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class RemoteModule_ProvidePushRemoteRepositoryFactory implements dagger.internal.Factory<com.payair.logic.remote.repositories.PushRemoteRepository> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4427a;

    public RemoteModule_ProvidePushRemoteRepositoryFactory(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        this.f4427a = provider;
    }

    public static com.payair.logic.di.RemoteModule_ProvidePushRemoteRepositoryFactory create(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        return new com.payair.logic.di.RemoteModule_ProvidePushRemoteRepositoryFactory(provider);
    }

    public static com.payair.logic.remote.repositories.PushRemoteRepository providePushRemoteRepository(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        return (com.payair.logic.remote.repositories.PushRemoteRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.RemoteModule.INSTANCE.providePushRemoteRepository(hceSDKInterface));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.remote.repositories.PushRemoteRepository get() {
        return providePushRemoteRepository((com.payair.logic.implementation.HceSDKInterface) this.f4427a.get());
    }
}
