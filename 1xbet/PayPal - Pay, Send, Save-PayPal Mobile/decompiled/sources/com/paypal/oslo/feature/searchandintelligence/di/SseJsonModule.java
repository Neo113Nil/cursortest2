package com.paypal.oslo.feature.searchandintelligence.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/SseJsonModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudDisplayComponentDeserializer;", "cloudDeserializer", "Lkotlinx/serialization/json/Json;", "provideSseJson", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudDisplayComponentDeserializer;)Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class SseJsonModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.searchandintelligence.di.SseJsonModule INSTANCE = new com.paypal.oslo.feature.searchandintelligence.di.SseJsonModule();

    private SseJsonModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final kotlinx.serialization.json.Json provideSseJson(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer cloudDeserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudDeserializer, "");
        return com.paypal.oslo.feature.searchandintelligence.data.SseJsonFactory.INSTANCE.create(kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent.class), cloudDeserializer));
    }
}
