package com.paypal.oslo.app.di;

/* loaded from: classes4.dex */
public final class AppOkHttpInterceptorModule_ProvideDynamicBaseUrlInterceptorFactory implements dagger.internal.Factory<com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor> {
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> getHighSpeedVideoFpsRangesFor;

    private AppOkHttpInterceptorModule_ProvideDynamicBaseUrlInterceptorFactory(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor get() {
        return provideDynamicBaseUrlInterceptor(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.app.di.AppOkHttpInterceptorModule_ProvideDynamicBaseUrlInterceptorFactory create(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        return new com.paypal.oslo.app.di.AppOkHttpInterceptorModule_ProvideDynamicBaseUrlInterceptorFactory(provider);
    }

    public static com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor provideDynamicBaseUrlInterceptor(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        return (com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.AppOkHttpInterceptorModule.INSTANCE.provideDynamicBaseUrlInterceptor(environmentProvider));
    }
}
