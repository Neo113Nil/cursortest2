package com.paypal.oslo.app.di;

/* loaded from: classes4.dex */
public final class AppOkHttpInterceptorModule_ProvideOkHttpInterceptorsFactory implements dagger.internal.Factory<java.util.List<okhttp3.Interceptor>> {
    private final dagger.internal.Provider<com.paypal.oslo.app.network.RequestIdInterceptor> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<okhttp3.Interceptor> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<java.util.Set<okhttp3.Interceptor>> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.app.contextheader.ContextHeadersInterceptor> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.app.network.UserAgentInterceptor> getInputSizeshNQ4ISI;

    private AppOkHttpInterceptorModule_ProvideOkHttpInterceptorsFactory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor> provider, dagger.internal.Provider<com.paypal.oslo.app.network.UserAgentInterceptor> provider2, dagger.internal.Provider<com.paypal.oslo.app.network.RequestIdInterceptor> provider3, dagger.internal.Provider<java.util.Set<okhttp3.Interceptor>> provider4, dagger.internal.Provider<okhttp3.Interceptor> provider5, dagger.internal.Provider<com.paypal.oslo.app.contextheader.ContextHeadersInterceptor> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getInputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.List<okhttp3.Interceptor> get() {
        return provideOkHttpInterceptors(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.app.di.AppOkHttpInterceptorModule_ProvideOkHttpInterceptorsFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor> provider, dagger.internal.Provider<com.paypal.oslo.app.network.UserAgentInterceptor> provider2, dagger.internal.Provider<com.paypal.oslo.app.network.RequestIdInterceptor> provider3, dagger.internal.Provider<java.util.Set<okhttp3.Interceptor>> provider4, dagger.internal.Provider<okhttp3.Interceptor> provider5, dagger.internal.Provider<com.paypal.oslo.app.contextheader.ContextHeadersInterceptor> provider6) {
        return new com.paypal.oslo.app.di.AppOkHttpInterceptorModule_ProvideOkHttpInterceptorsFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static java.util.List<okhttp3.Interceptor> provideOkHttpInterceptors(com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor defaultBaseUrlOverwriteInterceptor, com.paypal.oslo.app.network.UserAgentInterceptor userAgentInterceptor, com.paypal.oslo.app.network.RequestIdInterceptor requestIdInterceptor, java.util.Set<okhttp3.Interceptor> set, okhttp3.Interceptor interceptor, com.paypal.oslo.app.contextheader.ContextHeadersInterceptor contextHeadersInterceptor) {
        return (java.util.List) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.AppOkHttpInterceptorModule.INSTANCE.provideOkHttpInterceptors(defaultBaseUrlOverwriteInterceptor, userAgentInterceptor, requestIdInterceptor, set, interceptor, contextHeadersInterceptor));
    }
}
