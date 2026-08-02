package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0016"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "Lkotlinx/serialization/SerializationStrategy;", "serializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "encodeByWriter", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "reader", "decodeByReader", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/internal/InternalJsonReader;)Ljava/lang/Object;", "Lkotlinx/serialization/json/DecodeSequenceMode;", "format", "Lkotlin/sequences/Sequence;", "decodeToSequenceByReader", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonReader;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkotlin/sequences/Sequence;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonReader;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkotlin/sequences/Sequence;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonStreamsKt {
    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static final <T> void encodeByWriter(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonWriter internalJsonWriter, kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        new kotlinx.serialization.json.internal.StreamingJsonEncoder(internalJsonWriter, json, kotlinx.serialization.json.internal.WriteMode.OBJ, new kotlinx.serialization.json.JsonEncoder[kotlinx.serialization.json.internal.WriteMode.getEntries().size()]).encodeSerializableValue(serializationStrategy, t);
    }

    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static final <T> T decodeByReader(kotlinx.serialization.json.Json json, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, kotlinx.serialization.json.internal.InternalJsonReader internalJsonReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonReader, "");
        kotlinx.serialization.json.internal.ReaderJsonLexer ReaderJsonLexer$default = kotlinx.serialization.json.internal.ReaderJsonLexerKt.ReaderJsonLexer$default(json, internalJsonReader, null, 4, null);
        try {
            T t = (T) new kotlinx.serialization.json.internal.StreamingJsonDecoder(json, kotlinx.serialization.json.internal.WriteMode.OBJ, ReaderJsonLexer$default, deserializationStrategy.getDescriptor(), null).decodeSerializableValue(deserializationStrategy);
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
    public static final <T> kotlin.sequences.Sequence<T> decodeToSequenceByReader(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonReader internalJsonReader, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeSequenceMode, "");
        final java.util.Iterator JsonIterator = kotlinx.serialization.json.internal.JsonIteratorKt.JsonIterator(decodeSequenceMode, json, kotlinx.serialization.json.internal.ReaderJsonLexerKt.ReaderJsonLexer(json, internalJsonReader, new char[16384]), deserializationStrategy);
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.sequences.Sequence<T>() { // from class: kotlinx.serialization.json.internal.JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<T> iterator() {
                return JsonIterator;
            }
        });
    }

    public static /* synthetic */ kotlin.sequences.Sequence decodeToSequenceByReader$default(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonReader internalJsonReader, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            decodeSequenceMode = kotlinx.serialization.json.DecodeSequenceMode.AUTO_DETECT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeSequenceMode, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(json, internalJsonReader, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), decodeSequenceMode);
    }

    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> kotlin.sequences.Sequence<T> decodeToSequenceByReader(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonReader internalJsonReader, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeSequenceMode, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(json, internalJsonReader, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), decodeSequenceMode);
    }
}
