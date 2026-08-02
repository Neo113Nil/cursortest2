package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideRegistrationStatusManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.RegistrationStatusManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4416a;
    public final javax.inject.Provider b;

    public LogicModule_ProvideRegistrationStatusManager$core_releaseFactory(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider, javax.inject.Provider<com.payair.logic.storage.StorageService> provider2) {
        this.f4416a = provider;
        this.b = provider2;
    }

    public static com.payair.logic.di.LogicModule_ProvideRegistrationStatusManager$core_releaseFactory create(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider, javax.inject.Provider<com.payair.logic.storage.StorageService> provider2) {
        return new com.payair.logic.di.LogicModule_ProvideRegistrationStatusManager$core_releaseFactory(provider, provider2);
    }

    public static com.payair.logic.managers.RegistrationStatusManager provideRegistrationStatusManager$core_release(com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.storage.StorageService storageService) {
        return (com.payair.logic.managers.RegistrationStatusManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideRegistrationStatusManager$core_release(hceSDKInterface, storageService));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.RegistrationStatusManager get() {
        return provideRegistrationStatusManager$core_release((com.payair.logic.implementation.HceSDKInterface) this.f4416a.get(), (com.payair.logic.storage.StorageService) this.b.get());
    }
}
