package com.payair.logic.di;

/* loaded from: classes10.dex */
public final class LogicModule_ProvideTokenAliasManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.TokenAliasManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4420a;

    public LogicModule_ProvideTokenAliasManager$core_releaseFactory(javax.inject.Provider<com.payair.logic.storage.StorageService> provider) {
        this.f4420a = provider;
    }

    public static com.payair.logic.di.LogicModule_ProvideTokenAliasManager$core_releaseFactory create(javax.inject.Provider<com.payair.logic.storage.StorageService> provider) {
        return new com.payair.logic.di.LogicModule_ProvideTokenAliasManager$core_releaseFactory(provider);
    }

    public static com.payair.logic.managers.TokenAliasManager provideTokenAliasManager$core_release(com.payair.logic.storage.StorageService storageService) {
        return (com.payair.logic.managers.TokenAliasManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideTokenAliasManager$core_release(storageService));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.TokenAliasManager get() {
        return provideTokenAliasManager$core_release((com.payair.logic.storage.StorageService) this.f4420a.get());
    }
}
