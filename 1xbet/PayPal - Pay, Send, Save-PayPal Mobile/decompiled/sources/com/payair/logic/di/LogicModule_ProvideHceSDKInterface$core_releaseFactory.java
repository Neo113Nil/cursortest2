package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideHceSDKInterface$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.implementation.HceSDKInterface> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4411a;
    public final javax.inject.Provider b;

    public LogicModule_ProvideHceSDKInterface$core_releaseFactory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.payair.configuration.ClientConfigurationInterface> provider2) {
        this.f4411a = provider;
        this.b = provider2;
    }

    public static com.payair.logic.di.LogicModule_ProvideHceSDKInterface$core_releaseFactory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.payair.configuration.ClientConfigurationInterface> provider2) {
        return new com.payair.logic.di.LogicModule_ProvideHceSDKInterface$core_releaseFactory(provider, provider2);
    }

    public static com.payair.logic.implementation.HceSDKInterface provideHceSDKInterface$core_release(android.content.Context context, com.payair.configuration.ClientConfigurationInterface clientConfigurationInterface) {
        return (com.payair.logic.implementation.HceSDKInterface) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideHceSDKInterface$core_release(context, clientConfigurationInterface));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.implementation.HceSDKInterface get() {
        return provideHceSDKInterface$core_release((android.content.Context) this.f4411a.get(), (com.payair.configuration.ClientConfigurationInterface) this.b.get());
    }
}
