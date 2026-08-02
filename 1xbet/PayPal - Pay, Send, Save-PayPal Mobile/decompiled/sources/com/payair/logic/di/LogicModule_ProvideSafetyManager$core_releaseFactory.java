package com.payair.logic.di;

/* loaded from: classes10.dex */
public final class LogicModule_ProvideSafetyManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.SafetyManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4417a;
    public final javax.inject.Provider b;

    public LogicModule_ProvideSafetyManager$core_releaseFactory(javax.inject.Provider<com.payair.db.Database> provider, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider2) {
        this.f4417a = provider;
        this.b = provider2;
    }

    public static com.payair.logic.di.LogicModule_ProvideSafetyManager$core_releaseFactory create(javax.inject.Provider<com.payair.db.Database> provider, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider2) {
        return new com.payair.logic.di.LogicModule_ProvideSafetyManager$core_releaseFactory(provider, provider2);
    }

    public static com.payair.logic.managers.SafetyManager provideSafetyManager$core_release(com.payair.db.Database database, com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        return (com.payair.logic.managers.SafetyManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideSafetyManager$core_release(database, hceSDKInterface));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.SafetyManager get() {
        return provideSafetyManager$core_release((com.payair.db.Database) this.f4417a.get(), (com.payair.logic.implementation.HceSDKInterface) this.b.get());
    }
}
