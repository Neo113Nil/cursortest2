package kotlinx.serialization.json;

/* compiled from: JvmStreams.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a*\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u0002H\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0087\b¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\"\u0010\u000b\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\b¢\u0006\u0002\u0010\u0010\u001a8\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0012\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a-\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0012\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\b¨\u0006\u0015"}, d2 = {"encodeToStream", "", "T", "Lkotlinx/serialization/json/Json;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "stream", "Ljava/io/OutputStream;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Ljava/io/OutputStream;)V", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Ljava/io/OutputStream;)V", "decodeFromStream", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "Ljava/io/InputStream;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/io/InputStream;)Ljava/lang/Object;", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;)Ljava/lang/Object;", "decodeToSequence", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JvmStreamsKt {
    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T> void encodeToStream(kotlinx.serialization.json.Json json, kotlinx.serialization.SerializationStrategy<? super T> serializer, T t, java.io.OutputStream stream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
        kotlinx.serialization.json.internal.JsonToJavaStreamWriter jsonToJavaStreamWriter = new kotlinx.serialization.json.internal.JsonToJavaStreamWriter(stream);
        try {
            kotlinx.serialization.json.internal.JsonStreamsKt.encodeByWriter(json, jsonToJavaStreamWriter, serializer, t);
        } finally {
            jsonToJavaStreamWriter.release();
        }
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> void encodeToStream(kotlinx.serialization.json.Json json, T t, java.io.OutputStream stream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        encodeToStream(json, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t, stream);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T> T decodeFromStream(kotlinx.serialization.json.Json json, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, java.io.InputStream stream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
        kotlinx.serialization.json.internal.JavaStreamSerialReader javaStreamSerialReader = new kotlinx.serialization.json.internal.JavaStreamSerialReader(stream);
        try {
            return (T) kotlinx.serialization.json.internal.JsonStreamsKt.decodeByReader(json, deserializer, javaStreamSerialReader);
        } finally {
            javaStreamSerialReader.release();
        }
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> T decodeFromStream(kotlinx.serialization.json.Json json, java.io.InputStream stream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromStream(json, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), stream);
    }

    public static /* synthetic */ kotlin.sequences.Sequence decodeToSequence$default(kotlinx.serialization.json.Json json, java.io.InputStream inputStream, kotlinx.serialization.DeserializationStrategy deserializationStrategy, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            decodeSequenceMode = kotlinx.serialization.json.DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequence(json, inputStream, deserializationStrategy, decodeSequenceMode);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T> kotlin.sequences.Sequence<T> decodeToSequence(kotlinx.serialization.json.Json json, java.io.InputStream stream, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, kotlinx.serialization.json.DecodeSequenceMode format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlinx.serialization.json.internal.JsonStreamsKt.decodeToSequenceByReader(json, new kotlinx.serialization.json.internal.JavaStreamSerialReader(stream), deserializer, format);
    }

    public static /* synthetic */ kotlin.sequences.Sequence decodeToSequence$default(kotlinx.serialization.json.Json json, java.io.InputStream stream, kotlinx.serialization.json.DecodeSequenceMode format, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            format = kotlinx.serialization.json.DecodeSequenceMode.AUTO_DETECT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequence(json, stream, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), format);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> kotlin.sequences.Sequence<T> decodeToSequence(kotlinx.serialization.json.Json json, java.io.InputStream stream, kotlinx.serialization.json.DecodeSequenceMode format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequence(json, stream, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), format);
    }
}
