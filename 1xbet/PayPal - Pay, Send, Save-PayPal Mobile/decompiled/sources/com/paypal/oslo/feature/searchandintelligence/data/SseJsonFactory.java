package com.paypal.oslo.feature.searchandintelligence.data;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\n\u001a\u00020\t2J\u0010\b\u001a&\u0012\"\b\u0001\u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0004\"\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u0005¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/SseJsonFactory;", "", "<init>", "()V", "", "Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "deserializers", "Lkotlinx/serialization/json/Json;", "create", "([Lkotlin/Pair;)Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SseJsonFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.searchandintelligence.data.SseJsonFactory INSTANCE = new com.paypal.oslo.feature.searchandintelligence.data.SseJsonFactory();

    private SseJsonFactory() {
    }

    public final kotlinx.serialization.json.Json create(final kotlin.Pair<? extends kotlin.reflect.KClass<? extends java.lang.Object>, ? extends kotlinx.serialization.KSerializer<? extends java.lang.Object>>... deserializers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializers, "");
        return kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.data.SseJsonFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.searchandintelligence.data.SseJsonFactory.m19114$r8$lambda$muh2lrLgZgBfjxqjw7rCtwCR6E(deserializers, (kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null);
    }

    /* renamed from: $r8$lambda$muh2lrLgZgBfjxqjw7rCtw-CR6E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19114$r8$lambda$muh2lrLgZgBfjxqjw7rCtwCR6E(kotlin.Pair[] pairArr, kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setNamingStrategy(kotlinx.serialization.json.JsonNamingStrategy.INSTANCE.getSnakeCase());
        kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder = new kotlinx.serialization.modules.SerializersModuleBuilder();
        for (kotlin.Pair pair : pairArr) {
            kotlin.reflect.KClass kClass = (kotlin.reflect.KClass) pair.component1();
            kotlinx.serialization.KSerializer kSerializer = (kotlinx.serialization.KSerializer) pair.component2();
            kotlin.jvm.internal.Intrinsics.checkNotNull(kClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(kSerializer, "");
            serializersModuleBuilder.contextual(kClass, kSerializer);
        }
        jsonBuilder.setSerializersModule(serializersModuleBuilder.build());
        return kotlin.Unit.INSTANCE;
    }
}
