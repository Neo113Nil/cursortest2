package kotlinx.serialization.json.internal;

/* compiled from: JsonStreams.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\f2\u0006\u0010\r\u001a\u0002H\u0006H\u0007¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a<\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007\u001a1\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"SINGLE_CHAR_MAX_CODEPOINT", "", "HIGH_SURROGATE_HEADER", "LOW_SURROGATE_HEADER", "encodeByWriter", "", "T", "json", "Lkotlinx/serialization/json/Json;", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "decodeByReader", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "reader", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/internal/InternalJsonReader;)Ljava/lang/Object;", "decodeToSequenceByReader", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonStreamsKt {
    private static final int HIGH_SURROGATE_HEADER = 55232;
    private static final int LOW_SURROGATE_HEADER = 56320;
    private static final int SINGLE_CHAR_MAX_CODEPOINT = 65535;

    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static final <T> void encodeByWriter(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonWriter writer, kotlinx.serialization.SerializationStrategy<? super T> serializer, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        new kotlinx.serialization.json.internal.StreamingJsonEncoder(writer, json, kotlinx.serialization.json.internal.WriteMode.OBJ, new kotlinx.serialization.json.JsonEncoder[kotlinx.serialization.json.internal.WriteMode.getEntries().size()]).encodeSerializableValue(serializer, t);
    }

    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static final <T> T decodeByReader(kotlinx.serialization.json.Json json, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, kotlinx.serialization.json.internal.InternalJsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        kotlinx.serialization.json.internal.ReaderJsonLexer ReaderJsonLexer$default = kotlinx.serialization.json.internal.ReaderJsonLexerKt.ReaderJsonLexer$default(json, reader, null, 4, null);
        try {
            T t = (T) new kotlinx.serialization.json.internal.StreamingJsonDecoder(json, kotlinx.serialization.json.internal.WriteMode.OBJ, ReaderJsonLexer$default, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
            ReaderJsonLexer$default.expectEof();
            return t;
        } finally {
            ReaderJsonLexer$default.release();
        }
    }

    public static /* synthetic */ kotlin.sequences.Sequence decodeToSequenceByReader$default(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonReader internalJsonReader, kotlinx.serialization.DeserializationStrategy deserializationStrategy, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            decodeSequenceMode = kotlinx.serialization.json.DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequenceByReader(json, internalJsonReader, deserializationStrategy, decodeSequenceMode);
    }

    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T> kotlin.sequences.Sequence<T> decodeToSequenceByReader(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonReader reader, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, kotlinx.serialization.json.DecodeSequenceMode format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        final java.util.Iterator JsonIterator = kotlinx.serialization.json.internal.JsonIteratorKt.JsonIterator(format, json, kotlinx.serialization.json.internal.ReaderJsonLexerKt.ReaderJsonLexer(json, reader, new char[16384]), deserializer);
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.sequences.Sequence<T>() { // from class: kotlinx.serialization.json.internal.JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<T> iterator() {
                return JsonIterator;
            }
        });
    }

    public static /* synthetic */ kotlin.sequences.Sequence decodeToSequenceByReader$default(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonReader reader, kotlinx.serialization.json.DecodeSequenceMode format, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            format = kotlinx.serialization.json.DecodeSequenceMode.AUTO_DETECT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(json, reader, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), format);
    }

    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> kotlin.sequences.Sequence<T> decodeToSequenceByReader(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonReader reader, kotlinx.serialization.json.DecodeSequenceMode format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(json, reader, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), format);
    }
}
