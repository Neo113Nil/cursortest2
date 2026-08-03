package kotlinx.serialization.json.internal;

/* compiled from: StreamingJsonDecoder.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a9\u0010\t\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00020\r¢\u0006\u0002\b\u000eH\u0082\b¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"decodeStringToJsonTree", "Lkotlinx/serialization/json/JsonElement;", "T", "json", "Lkotlinx/serialization/json/Json;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "source", "", "parseString", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "expectedType", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamingJsonDecoderKt {
    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static final <T> kotlinx.serialization.json.JsonElement decodeStringToJsonTree(kotlinx.serialization.json.Json json, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlinx.serialization.json.internal.StringJsonLexer StringJsonLexer = kotlinx.serialization.json.internal.StringJsonLexerKt.StringJsonLexer(json, source);
        kotlinx.serialization.json.JsonElement decodeJsonElement = new kotlinx.serialization.json.internal.StreamingJsonDecoder(json, kotlinx.serialization.json.internal.WriteMode.OBJ, StringJsonLexer, deserializer.getDescriptor(), null).decodeJsonElement();
        StringJsonLexer.expectEof();
        return decodeJsonElement;
    }

    private static final <T> T parseString(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> function1) {
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return function1.invoke(consumeStringLenient);
        } catch (java.lang.IllegalArgumentException unused) {
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type '" + str + "' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }
}
