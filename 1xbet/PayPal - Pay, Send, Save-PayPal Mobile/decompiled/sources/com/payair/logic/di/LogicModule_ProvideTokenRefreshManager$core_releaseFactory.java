package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideTokenRefreshManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.TokenRefreshManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4422a;

    public LogicModule_ProvideTokenRefreshManager$core_releaseFactory(javax.inject.Provider<com.payair.logic.managers.TokenManager> provider) {
        this.f4422a = provider;
    }

    public static com.payair.logic.di.LogicModule_ProvideTokenRefreshManager$core_releaseFactory create(javax.inject.Provider<com.payair.logic.managers.TokenManager> provider) {
        return new com.payair.logic.di.LogicModule_ProvideTokenRefreshManager$core_releaseFactory(provider);
    }

    public static com.payair.logic.managers.TokenRefreshManager provideTokenRefreshManager$core_release(com.payair.logic.managers.TokenManager tokenManager) {
        return (com.payair.logic.managers.TokenRefreshManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideTokenRefreshManager$core_release(tokenManager));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.TokenRefreshManager get() {
        return provideTokenRefreshManager$core_release((com.payair.logic.managers.TokenManager) this.f4422a.get());
    }
}
