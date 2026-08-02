package com.paypal.oslo.app.di;

/* loaded from: classes4.dex */
public final class OkHttpInterceptorModule_ProvideOkHttpInterceptorsFactory implements dagger.internal.Factory<java.util.List<okhttp3.Interceptor>> {
    private final dagger.internal.Provider<java.util.List<okhttp3.Interceptor>> Camera2StreamConfigurationMap;

    private OkHttpInterceptorModule_ProvideOkHttpInterceptorsFactory(dagger.internal.Provider<java.util.List<okhttp3.Interceptor>> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.List<okhttp3.Interceptor> get() {
        return provideOkHttpInterceptors(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.app.di.OkHttpInterceptorModule_ProvideOkHttpInterceptorsFactory create(dagger.internal.Provider<java.util.List<okhttp3.Interceptor>> provider) {
        return new com.paypal.oslo.app.di.OkHttpInterceptorModule_ProvideOkHttpInterceptorsFactory(provider);
    }

    public static java.util.List<okhttp3.Interceptor> provideOkHttpInterceptors(java.util.List<okhttp3.Interceptor> list) {
        return (java.util.List) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.OkHttpInterceptorModule.INSTANCE.provideOkHttpInterceptors(list));
    }
}
