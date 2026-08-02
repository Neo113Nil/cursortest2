package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"T", "", "fromJson", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JsonExtensionsKt {
    private static final kotlinx.serialization.json.Json json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.util.JsonExtensionsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.shared.util.JsonExtensionsKt.m14671$r8$lambda$8hqFEML4Pq0uET6G1fI1oaYPRg((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);

    public static final kotlinx.serialization.json.Json getJson() {
        return json;
    }

    public static final /* synthetic */ <T> T fromJson(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlinx.serialization.json.Json json2 = getJson();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
            kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
            return (T) json2.decodeFromString(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null), str);
        } catch (kotlinx.serialization.SerializationException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class).getSimpleName();
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to deserialize JSON ");
            sb.append(str);
            sb.append(" to ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(message);
            kotlinx.serialization.SerializationException serializationException = e;
            logger.e(sb.toString(), serializationException);
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            throw new java.lang.IllegalStateException("Failed to deserialize JSON to ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class).getSimpleName())), serializationException);
        }
    }

    /* renamed from: $r8$lambda$8hqFEML4Pq0uET6G1fI1oaYPR-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14671$r8$lambda$8hqFEML4Pq0uET6G1fI1oaYPRg(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setPrettyPrint(false);
        return kotlin.Unit.INSTANCE;
    }
}
