package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvidePushManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.PushManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4415a;
    public final javax.inject.Provider b;

    public LogicModule_ProvidePushManager$core_releaseFactory(javax.inject.Provider<com.payair.logic.remote.repositories.PushRemoteRepository> provider, javax.inject.Provider<com.payair.logic.implementation.FirebaseInterface> provider2) {
        this.f4415a = provider;
        this.b = provider2;
    }

    public static com.payair.logic.di.LogicModule_ProvidePushManager$core_releaseFactory create(javax.inject.Provider<com.payair.logic.remote.repositories.PushRemoteRepository> provider, javax.inject.Provider<com.payair.logic.implementation.FirebaseInterface> provider2) {
        return new com.payair.logic.di.LogicModule_ProvidePushManager$core_releaseFactory(provider, provider2);
    }

    public static com.payair.logic.managers.PushManager providePushManager$core_release(com.payair.logic.remote.repositories.PushRemoteRepository pushRemoteRepository, com.payair.logic.implementation.FirebaseInterface firebaseInterface) {
        return (com.payair.logic.managers.PushManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.providePushManager$core_release(pushRemoteRepository, firebaseInterface));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.PushManager get() {
        return providePushManager$core_release((com.payair.logic.remote.repositories.PushRemoteRepository) this.f4415a.get(), (com.payair.logic.implementation.FirebaseInterface) this.b.get());
    }
}
