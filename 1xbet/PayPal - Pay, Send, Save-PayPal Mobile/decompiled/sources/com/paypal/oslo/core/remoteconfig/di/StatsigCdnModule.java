package com.paypal.oslo.core.remoteconfig.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/di/StatsigCdnModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "dynamicProvider", "Lcom/paypal/oslo/core/remoteconfig/cdn/StatsigCdnService;", "provideStatsigCdnService", "(Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;)Lcom/paypal/oslo/core/remoteconfig/cdn/StatsigCdnService;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class StatsigCdnModule {
    public static final com.paypal.oslo.core.remoteconfig.di.StatsigCdnModule INSTANCE = new com.paypal.oslo.core.remoteconfig.di.StatsigCdnModule();

    private StatsigCdnModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService provideStatsigCdnService(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicProvider, "");
        okhttp3.MediaType mediaType = okhttp3.MediaType.INSTANCE.get("application/json");
        java.lang.Object create = new retrofit2.Retrofit.Builder().callFactory(dynamicProvider.getCallFactory()).baseUrl(com.paypal.oslo.core.remoteconfig.BuildConfig.STATSIG_CDN_BASE_URL).addConverterFactory(retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory.create(kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.remoteconfig.di.StatsigCdnModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.remoteconfig.di.StatsigCdnModule.m11681$r8$lambda$VqSLlIpt6J6NhOdLA8S6MAKipU((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null), mediaType)).build().create(com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return (com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService) create;
    }

    /* renamed from: $r8$lambda$VqSL-lIpt6J6NhOdLA8S6MAKipU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11681$r8$lambda$VqSLlIpt6J6NhOdLA8S6MAKipU(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        return kotlin.Unit.INSTANCE;
    }
}
