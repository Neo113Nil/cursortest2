package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideClientConfigurationInterface$core_releaseFactory implements dagger.internal.Factory<com.payair.configuration.ClientConfigurationInterface> {
    public static com.payair.logic.di.LogicModule_ProvideClientConfigurationInterface$core_releaseFactory create() {
        return com.payair.logic.di.b.f4434a;
    }

    public static com.payair.configuration.ClientConfigurationInterface provideClientConfigurationInterface$core_release() {
        return (com.payair.configuration.ClientConfigurationInterface) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideClientConfigurationInterface$core_release());
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.configuration.ClientConfigurationInterface get() {
        return provideClientConfigurationInterface$core_release();
    }
}
