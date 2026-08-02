package com.paypal.oslo.core.network.sse;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/network/sse/SseFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/sse/config/SseConfig;", "sseConfig", "Lcom/paypal/oslo/core/network/sse/di/SseOkHttpClientProvider;", "sseOkHttpClientProvider", "Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository;", "createRepository", "(Lcom/paypal/oslo/core/network/sse/config/SseConfig;Lcom/paypal/oslo/core/network/sse/di/SseOkHttpClientProvider;)Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SseFactory {
    public static final com.paypal.oslo.core.network.sse.SseFactory INSTANCE = new com.paypal.oslo.core.network.sse.SseFactory();

    private SseFactory() {
    }

    public final com.paypal.oslo.core.network.sse.domain.repository.SseRepository createRepository(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig, com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider sseOkHttpClientProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseOkHttpClientProvider, "");
        return new com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl(sseConfig, sseOkHttpClientProvider, null, 4, null);
    }
}
