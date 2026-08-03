package kotlinx.serialization.json.internal;

/* compiled from: TreeJsonDecoder.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a5\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0000¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"readJson", "T", "json", "Lkotlinx/serialization/json/Json;", "element", "Lkotlinx/serialization/json/JsonElement;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "readPolymorphicJson", "discriminator", "", "Lkotlinx/serialization/json/JsonObject;", "(Lkotlinx/serialization/json/Json;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TreeJsonDecoderKt {
    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static final <T> T readJson(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement element, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
        kotlinx.serialization.json.internal.JsonPrimitiveDecoder jsonPrimitiveDecoder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (element instanceof kotlinx.serialization.json.JsonObject) {
            jsonPrimitiveDecoder = new kotlinx.serialization.json.internal.JsonTreeDecoder(json, (kotlinx.serialization.json.JsonObject) element, null, null, 12, null);
        } else if (element instanceof kotlinx.serialization.json.JsonArray) {
            jsonPrimitiveDecoder = new kotlinx.serialization.json.internal.JsonTreeListDecoder(json, (kotlinx.serialization.json.JsonArray) element);
        } else {
            if (!(element instanceof kotlinx.serialization.json.JsonLiteral) && !kotlin.jvm.internal.Intrinsics.areEqual(element, kotlinx.serialization.json.JsonNull.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            jsonPrimitiveDecoder = new kotlinx.serialization.json.internal.JsonPrimitiveDecoder(json, (kotlinx.serialization.json.JsonPrimitive) element, null, 4, null);
        }
        return (T) jsonPrimitiveDecoder.decodeSerializableValue(deserializer);
    }

    public static final <T> T readPolymorphicJson(kotlinx.serialization.json.Json json, java.lang.String discriminator, kotlinx.serialization.json.JsonObject element, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) new kotlinx.serialization.json.internal.JsonTreeDecoder(json, element, discriminator, deserializer.getDescriptor()).decodeSerializableValue(deserializer);
    }
}
