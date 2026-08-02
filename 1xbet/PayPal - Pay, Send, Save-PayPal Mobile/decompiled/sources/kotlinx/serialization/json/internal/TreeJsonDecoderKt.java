package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "readJson", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "", "discriminator", "Lkotlinx/serialization/json/JsonObject;", "readPolymorphicJson", "(Lkotlinx/serialization/json/Json;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TreeJsonDecoderKt {
    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static final <T> T readJson(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement jsonElement, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
        kotlinx.serialization.json.internal.JsonPrimitiveDecoder jsonPrimitiveDecoder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        if (jsonElement instanceof kotlinx.serialization.json.JsonObject) {
            jsonPrimitiveDecoder = new kotlinx.serialization.json.internal.JsonTreeDecoder(json, (kotlinx.serialization.json.JsonObject) jsonElement, null, null, 12, null);
        } else if (jsonElement instanceof kotlinx.serialization.json.JsonArray) {
            jsonPrimitiveDecoder = new kotlinx.serialization.json.internal.JsonTreeListDecoder(json, (kotlinx.serialization.json.JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof kotlinx.serialization.json.JsonLiteral) && !kotlin.jvm.internal.Intrinsics.areEqual(jsonElement, kotlinx.serialization.json.JsonNull.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            jsonPrimitiveDecoder = new kotlinx.serialization.json.internal.JsonPrimitiveDecoder(json, (kotlinx.serialization.json.JsonPrimitive) jsonElement, null, 4, null);
        }
        return (T) jsonPrimitiveDecoder.decodeSerializableValue(deserializationStrategy);
    }

    public static final <T> T readPolymorphicJson(kotlinx.serialization.json.Json json, java.lang.String str, kotlinx.serialization.json.JsonObject jsonObject, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        return (T) new kotlinx.serialization.json.internal.JsonTreeDecoder(json, jsonObject, str, deserializationStrategy.getDescriptor()).decodeSerializableValue(deserializationStrategy);
    }
}
