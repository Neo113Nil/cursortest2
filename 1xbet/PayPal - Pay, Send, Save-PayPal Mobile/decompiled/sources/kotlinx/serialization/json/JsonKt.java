package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a$\u0010\f\u001a\u00020\u000b\"\u0006\b\u0000\u0010\t\u0018\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u000f\u001a\u00028\u0000\"\u0006\b\u0000\u0010\t\u0018\u0001*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/serialization/json/Json;", "from", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Json", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/json/Json;", "T", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/json/JsonElement;", "encodeToJsonElement", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "json", "decodeFromJsonElement", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonKt {
    public static /* synthetic */ kotlinx.serialization.json.Json Json$default(kotlinx.serialization.json.Json json, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            json = kotlinx.serialization.json.Json.INSTANCE;
        }
        return Json(json, function1);
    }

    public static final kotlinx.serialization.json.Json Json(kotlinx.serialization.json.Json json, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.serialization.json.JsonBuilder jsonBuilder = new kotlinx.serialization.json.JsonBuilder(json);
        function1.invoke(jsonBuilder);
        return new kotlinx.serialization.json.JsonImpl(jsonBuilder.build$kotlinx_serialization_json(), jsonBuilder.getSerializersModule());
    }

    public static final /* synthetic */ <T> kotlinx.serialization.json.JsonElement encodeToJsonElement(kotlinx.serialization.json.Json json, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return json.encodeToJsonElement(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromJsonElement(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) json.decodeFromJsonElement(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), jsonElement);
    }
}
