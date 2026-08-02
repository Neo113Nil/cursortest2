package com.paypal.oslo.feature.taptopay.data.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\t\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"T", "", "toJson", "(Ljava/lang/Object;)Ljava/lang/String;", "fromJson", "(Ljava/lang/String;)Ljava/lang/Object;", "getFormattedCurrentDate", "()Ljava/lang/String;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExtensionsKt {
    private static final kotlinx.serialization.json.Json json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt.$r8$lambda$IQoU0wJuPMFfmzJJFF7wLfoYO0c((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);

    public static final kotlinx.serialization.json.Json getJson() {
        return json;
    }

    public static final /* synthetic */ <T> java.lang.String toJson(T t) {
        try {
            kotlinx.serialization.json.Json json2 = getJson();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
            kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
            return json2.encodeToString(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null), t);
        } catch (kotlinx.serialization.SerializationException e) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class).getSimpleName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to serialize ");
            sb.append(simpleName);
            sb.append(" to JSON");
            throw new java.lang.IllegalStateException(sb.toString(), e);
        }
    }

    public static final /* synthetic */ <T> T fromJson(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlinx.serialization.json.Json json2 = getJson();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
            kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
            return (T) json2.decodeFromString(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null), str);
        } catch (kotlinx.serialization.SerializationException e) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            throw new java.lang.IllegalStateException("Failed to deserialize JSON to ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class).getSimpleName())), e);
        }
    }

    public static final java.lang.String getFormattedCurrentDate() {
        java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", java.util.Locale.getDefault()).format(new java.util.Date());
        int length = format.length() - 2;
        kotlin.jvm.internal.Intrinsics.checkNotNull(format);
        java.lang.String substring = format.substring(0, length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String substring2 = format.substring(length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(substring2);
        return sb.toString();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IQoU0wJuPMFfmzJJFF7wLfoYO0c(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setPrettyPrint(false);
        return kotlin.Unit.INSTANCE;
    }
}
