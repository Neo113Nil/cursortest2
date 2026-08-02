package com.ingo.sdk.kotlin.common;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/ingo/sdk/kotlin/common/IngoSdkResultDeserializer;", "", "<init>", "()V", "", "input", "Lcom/ingo/sdk/kotlin/common/model/result/IngoSdkResult;", "deserialize", "(Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/model/result/IngoSdkResult;", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IngoSdkResultDeserializer {
    public static final com.ingo.sdk.kotlin.common.IngoSdkResultDeserializer INSTANCE = new com.ingo.sdk.kotlin.common.IngoSdkResultDeserializer();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlinx.serialization.json.Json getHighSpeedVideoSizes = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.IngoSdkResultDeserializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.ingo.sdk.kotlin.common.IngoSdkResultDeserializer.$r8$lambda$71oIAzordbrhCsXMH3UxUNCJmR4((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);

    private IngoSdkResultDeserializer() {
    }

    public final com.ingo.sdk.kotlin.common.model.result.IngoSdkResult deserialize(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlinx.serialization.json.Json json = getHighSpeedVideoSizes;
        json.getSerializersModule();
        return (com.ingo.sdk.kotlin.common.model.result.IngoSdkResult) json.decodeFromString(com.ingo.sdk.kotlin.common.model.result.IngoSdkResult.INSTANCE.serializer(), input);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$71oIAzordbrhCsXMH3UxUNCJmR4(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        return kotlin.Unit.INSTANCE;
    }
}
