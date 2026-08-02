package kotlinx.serialization.json.io;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a,\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b\b\u0010\n\u001a/\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a$\u0010\u000f\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\u000f\u0010\u0011\u001a?\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0017"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/io/Sink;", "sink", "", "encodeToSink", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Lkotlinx/io/Sink;)V", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Lkotlinx/io/Sink;)V", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lkotlinx/io/Source;", "source", "decodeFromSource", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/io/Source;)Ljava/lang/Object;", "(Lkotlinx/serialization/json/Json;Lkotlinx/io/Source;)Ljava/lang/Object;", "Lkotlinx/serialization/json/DecodeSequenceMode;", "format", "Lkotlin/sequences/Sequence;", "decodeSourceToSequence", "(Lkotlinx/serialization/json/Json;Lkotlinx/io/Source;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkotlin/sequences/Sequence;", "(Lkotlinx/serialization/json/Json;Lkotlinx/io/Source;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkotlin/sequences/Sequence;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IoStreamsKt {
    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T> void encodeToSink(kotlinx.serialization.json.Json json, kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t, kotlinx.io.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlinx.serialization.json.io.internal.JsonToIoStreamWriter jsonToIoStreamWriter = new kotlinx.serialization.json.io.internal.JsonToIoStreamWriter(sink);
        try {
            kotlinx.serialization.json.internal.JsonStreamsKt.encodeByWriter(json, jsonToIoStreamWriter, serializationStrategy, t);
        } finally {
            jsonToIoStreamWriter.release();
        }
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> void encodeToSink(kotlinx.serialization.json.Json json, T t, kotlinx.io.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        encodeToSink(json, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t, sink);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T> T decodeFromSource(kotlinx.serialization.json.Json json, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return (T) kotlinx.serialization.json.internal.JsonStreamsKt.decodeByReader(json, deserializationStrategy, new kotlinx.serialization.json.io.internal.IoSerialReader(source));
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> T decodeFromSource(kotlinx.serialization.json.Json json, kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromSource(json, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), source);
    }

    public static /* synthetic */ kotlin.sequences.Sequence decodeSourceToSequence$default(kotlinx.serialization.json.Json json, kotlinx.io.Source source, kotlinx.serialization.DeserializationStrategy deserializationStrategy, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            decodeSequenceMode = kotlinx.serialization.json.DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeSourceToSequence(json, source, deserializationStrategy, decodeSequenceMode);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T> kotlin.sequences.Sequence<T> decodeSourceToSequence(kotlinx.serialization.json.Json json, kotlinx.io.Source source, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeSequenceMode, "");
        return kotlinx.serialization.json.internal.JsonStreamsKt.decodeToSequenceByReader(json, new kotlinx.serialization.json.io.internal.IoSerialReader(source), deserializationStrategy, decodeSequenceMode);
    }

    public static /* synthetic */ kotlin.sequences.Sequence decodeSourceToSequence$default(kotlinx.serialization.json.Json json, kotlinx.io.Source source, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            decodeSequenceMode = kotlinx.serialization.json.DecodeSequenceMode.AUTO_DETECT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeSequenceMode, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeSourceToSequence(json, source, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), decodeSequenceMode);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> kotlin.sequences.Sequence<T> decodeSourceToSequence(kotlinx.serialization.json.Json json, kotlinx.io.Source source, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeSequenceMode, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeSourceToSequence(json, source, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), decodeSequenceMode);
    }
}
