package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class ThalesAarDependenciesModule_Companion_ProvideContextFactory implements dagger.internal.Factory<android.content.Context> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private ThalesAarDependenciesModule_Companion_ProvideContextFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final android.content.Context get() {
        return provideContext(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule_Companion_ProvideContextFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule_Companion_ProvideContextFactory(provider);
    }

    public static android.content.Context provideContext(android.content.Context context) {
        return (android.content.Context) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule.INSTANCE.provideContext(context));
    }
}
