package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideConfigurationManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.ConfigurationManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4406a;
    public final javax.inject.Provider b;
    public final javax.inject.Provider c;
    public final javax.inject.Provider d;
    public final javax.inject.Provider e;

    public LogicModule_ProvideConfigurationManager$core_releaseFactory(javax.inject.Provider<com.payair.logic.remote.repositories.UserRemoteRepository> provider, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider2, javax.inject.Provider<com.payair.logic.managers.PushManager> provider3, javax.inject.Provider<com.payair.logic.storage.SchemeStorage> provider4, javax.inject.Provider<com.payair.listener.DefaultHceEventListenerImpl> provider5) {
        this.f4406a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = provider5;
    }

    public static com.payair.logic.di.LogicModule_ProvideConfigurationManager$core_releaseFactory create(javax.inject.Provider<com.payair.logic.remote.repositories.UserRemoteRepository> provider, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider2, javax.inject.Provider<com.payair.logic.managers.PushManager> provider3, javax.inject.Provider<com.payair.logic.storage.SchemeStorage> provider4, javax.inject.Provider<com.payair.listener.DefaultHceEventListenerImpl> provider5) {
        return new com.payair.logic.di.LogicModule_ProvideConfigurationManager$core_releaseFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.payair.logic.managers.ConfigurationManager provideConfigurationManager$core_release(com.payair.logic.remote.repositories.UserRemoteRepository userRemoteRepository, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.managers.PushManager pushManager, com.payair.logic.storage.SchemeStorage schemeStorage, com.payair.listener.DefaultHceEventListenerImpl defaultHceEventListenerImpl) {
        return (com.payair.logic.managers.ConfigurationManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideConfigurationManager$core_release(userRemoteRepository, hceSDKInterface, pushManager, schemeStorage, defaultHceEventListenerImpl));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.ConfigurationManager get() {
        return provideConfigurationManager$core_release((com.payair.logic.remote.repositories.UserRemoteRepository) this.f4406a.get(), (com.payair.logic.implementation.HceSDKInterface) this.b.get(), (com.payair.logic.managers.PushManager) this.c.get(), (com.payair.logic.storage.SchemeStorage) this.d.get(), (com.payair.listener.DefaultHceEventListenerImpl) this.e.get());
    }
}
