package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "", "source", "Lkotlinx/serialization/json/JsonElement;", "decodeStringToJsonTree", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StreamingJsonDecoderKt {
    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static final <T> kotlinx.serialization.json.JsonElement decodeStringToJsonTree(kotlinx.serialization.json.Json json, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlinx.serialization.json.internal.StringJsonLexer StringJsonLexer = kotlinx.serialization.json.internal.StringJsonLexerKt.StringJsonLexer(json, str);
        kotlinx.serialization.json.JsonElement decodeJsonElement = new kotlinx.serialization.json.internal.StreamingJsonDecoder(json, kotlinx.serialization.json.internal.WriteMode.OBJ, StringJsonLexer, deserializationStrategy.getDescriptor(), null).decodeJsonElement();
        StringJsonLexer.expectEof();
        return decodeJsonElement;
    }
}
