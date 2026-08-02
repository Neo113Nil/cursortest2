package com.paypal.oslo.app.di;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJR\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0011\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/app/di/AppOkHttpInterceptorModule;", "", "<init>", "()V", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "environmentProvider", "Lcom/paypal/oslo/core/network/http/DefaultBaseUrlOverwriteInterceptor;", "provideDynamicBaseUrlInterceptor", "(Lcom/paypal/oslo/app/environment/EnvironmentProvider;)Lcom/paypal/oslo/core/network/http/DefaultBaseUrlOverwriteInterceptor;", "baseUrlInterceptor", "Lcom/paypal/oslo/app/network/UserAgentInterceptor;", "userAgentInterceptor", "Lcom/paypal/oslo/app/network/RequestIdInterceptor;", "requestIdInterceptor", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "authInterceptors", "datadogInterceptor", "Lcom/paypal/oslo/app/contextheader/ContextHeadersInterceptor;", "contextHeadersInterceptor", "", "provideOkHttpInterceptors", "(Lcom/paypal/oslo/core/network/http/DefaultBaseUrlOverwriteInterceptor;Lcom/paypal/oslo/app/network/UserAgentInterceptor;Lcom/paypal/oslo/app/network/RequestIdInterceptor;Ljava/util/Set;Lokhttp3/Interceptor;Lcom/paypal/oslo/app/contextheader/ContextHeadersInterceptor;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class AppOkHttpInterceptorModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.di.AppOkHttpInterceptorModule INSTANCE = new com.paypal.oslo.app.di.AppOkHttpInterceptorModule();

    /* renamed from: $r8$lambda$Zd9U-UGeZoVF14yfFN8OrO_hPgI, reason: not valid java name */
    public static /* synthetic */ java.lang.String m11057$r8$lambda$Zd9UUGeZoVF14yfFN8OrO_hPgI(java.lang.String str) {
        return str;
    }

    private AppOkHttpInterceptorModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor provideDynamicBaseUrlInterceptor(final com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        final java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentProvider, "");
        okhttp3.HttpUrl parse = okhttp3.HttpUrl.INSTANCE.parse(com.paypal.oslo.app.environment.Environment.Production.INSTANCE.getBaseUrl());
        if (parse == null || (str = parse.host()) == null) {
            str = com.paypal.oslo.feature.idassurance.utils.IdAssuranceConstants.PROD_REST_BASE_URL;
        }
        return new com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.di.AppOkHttpInterceptorModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String baseUrl;
                baseUrl = com.paypal.oslo.app.environment.EnvironmentProvider.this.getEnvironment().getBaseUrl();
                return baseUrl;
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.di.AppOkHttpInterceptorModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.app.di.AppOkHttpInterceptorModule.m11057$r8$lambda$Zd9UUGeZoVF14yfFN8OrO_hPgI(str);
            }
        });
    }

    @com.paypal.oslo.app.di.AppOkHttpInterceptors
    @dagger.Provides
    public final java.util.List<okhttp3.Interceptor> provideOkHttpInterceptors(com.paypal.oslo.core.network.http.DefaultBaseUrlOverwriteInterceptor baseUrlInterceptor, com.paypal.oslo.app.network.UserAgentInterceptor userAgentInterceptor, com.paypal.oslo.app.network.RequestIdInterceptor requestIdInterceptor, java.util.Set<okhttp3.Interceptor> authInterceptors, @com.paypal.oslo.core.telemetry.di.DatadogInterceptor okhttp3.Interceptor datadogInterceptor, com.paypal.oslo.app.contextheader.ContextHeadersInterceptor contextHeadersInterceptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrlInterceptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAgentInterceptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestIdInterceptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authInterceptors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogInterceptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextHeadersInterceptor, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(baseUrlInterceptor);
        createListBuilder.add(userAgentInterceptor);
        createListBuilder.add(requestIdInterceptor);
        createListBuilder.addAll(authInterceptors);
        createListBuilder.add(datadogInterceptor);
        createListBuilder.add(contextHeadersInterceptor);
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }
}
