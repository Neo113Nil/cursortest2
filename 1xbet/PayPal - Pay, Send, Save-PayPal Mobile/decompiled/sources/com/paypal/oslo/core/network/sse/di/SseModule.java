package com.paypal.oslo.core.network.sse.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/network/sse/di/SseModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "dynamicProvider", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/paypal/oslo/core/network/sse/config/SseConfig;", "sseConfig", "Lcom/paypal/oslo/core/network/sse/di/SseOkHttpClientProvider;", "provideSseOkHttpClientProvider", "(Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;Lkotlinx/coroutines/CoroutineScope;Lcom/paypal/oslo/core/network/sse/config/SseConfig;)Lcom/paypal/oslo/core/network/sse/di/SseOkHttpClientProvider;", "sseOkHttpClientProvider", "Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository;", "provideSseRepository", "(Lcom/paypal/oslo/core/network/sse/config/SseConfig;Lcom/paypal/oslo/core/network/sse/di/SseOkHttpClientProvider;)Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class SseModule {
    public static final com.paypal.oslo.core.network.sse.di.SseModule INSTANCE = new com.paypal.oslo.core.network.sse.di.SseModule();

    private SseModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider provideSseOkHttpClientProvider(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicProvider, kotlinx.coroutines.CoroutineScope scope, com.paypal.oslo.core.network.sse.config.SseConfig sseConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseConfig, "");
        return new com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider(dynamicProvider, scope, sseConfig);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.network.sse.domain.repository.SseRepository provideSseRepository(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig, com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider sseOkHttpClientProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseOkHttpClientProvider, "");
        return com.paypal.oslo.core.network.sse.SseFactory.INSTANCE.createRepository(sseConfig, sseOkHttpClientProvider);
    }
}
