package com.paypal.oslo.feature.searchandintelligence.api.domain;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/domain/AgenticAction;", "", "Lkotlinx/serialization/json/JsonObject;", "getActionInfo", "()Lkotlinx/serialization/json/JsonObject;", "actionInfo", "getPayload", "payload", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AgenticAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction.Companion INSTANCE = com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction.Companion.getHighSpeedVideoFpsRangesFor;

    kotlinx.serialization.json.JsonObject getActionInfo();

    kotlinx.serialization.json.JsonObject getPayload();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u0004\u0018\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\u0007R \u0010\n\u001a\u00020\t8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/domain/AgenticAction$Companion;", "", "<init>", "()V", "T", "Lkotlinx/serialization/json/JsonObject;", "decode", "(Lkotlinx/serialization/json/JsonObject;)Ljava/lang/Object;", "decodeOrNull", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "getJson$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction.Companion();
        private static final kotlinx.serialization.json.Json json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction.Companion.$r8$lambda$QkGwPqw8keUadNsYj8t5R16SJaU((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null);

        public static /* synthetic */ void getJson$annotations() {
        }

        private Companion() {
        }

        public final kotlinx.serialization.json.Json getJson() {
            return json;
        }

        public final /* synthetic */ <T> T decode(kotlinx.serialization.json.JsonObject jsonObject) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            kotlinx.serialization.json.Json json2 = getJson();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
            kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
            return (T) json2.decodeFromJsonElement(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null), jsonObject);
        }

        public final /* synthetic */ <T> T decodeOrNull(kotlinx.serialization.json.JsonObject jsonObject) {
            if (jsonObject == null) {
                return null;
            }
            kotlinx.serialization.json.Json json2 = getHighSpeedVideoFpsRangesFor.getJson();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T?");
            kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
            return (T) json2.decodeFromJsonElement(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null), jsonObject);
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$QkGwPqw8keUadNsYj8t5R16SJaU(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
            jsonBuilder.setIgnoreUnknownKeys(true);
            jsonBuilder.setNamingStrategy(kotlinx.serialization.json.JsonNamingStrategy.INSTANCE.getSnakeCase());
            return kotlin.Unit.INSTANCE;
        }
    }
}
