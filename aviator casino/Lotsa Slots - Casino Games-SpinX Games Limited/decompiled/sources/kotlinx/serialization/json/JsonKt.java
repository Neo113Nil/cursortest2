package kotlinx.serialization.json;

/* compiled from: Json.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u001a\"\u0010\b\u001a\u00020\t\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u0002H\nH\u0086\b¢\u0006\u0002\u0010\f\u001a\"\u0010\r\u001a\u0002H\n\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\tH\u0086\b¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Json", "Lkotlinx/serialization/json/Json;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonBuilder;", "", "Lkotlin/ExtensionFunctionType;", "encodeToJsonElement", "Lkotlinx/serialization/json/JsonElement;", "T", "value", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "decodeFromJsonElement", "json", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "defaultIndent", "", "defaultDiscriminator", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonKt {
    private static final java.lang.String defaultDiscriminator = "type";
    private static final java.lang.String defaultIndent = "    ";

    public static /* synthetic */ kotlinx.serialization.json.Json Json$default(kotlinx.serialization.json.Json json, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            json = kotlinx.serialization.json.Json.INSTANCE;
        }
        return Json(json, function1);
    }

    public static final kotlinx.serialization.json.Json Json(kotlinx.serialization.json.Json from, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "from");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlinx.serialization.json.JsonBuilder jsonBuilder = new kotlinx.serialization.json.JsonBuilder(from);
        builderAction.invoke(jsonBuilder);
        return new kotlinx.serialization.json.JsonImpl(jsonBuilder.build$kotlinx_serialization_json(), jsonBuilder.getSerializersModule());
    }

    public static final /* synthetic */ <T> kotlinx.serialization.json.JsonElement encodeToJsonElement(kotlinx.serialization.json.Json json, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return json.encodeToJsonElement(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromJsonElement(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement json2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json2, "json");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) json.decodeFromJsonElement(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), json2);
    }
}
