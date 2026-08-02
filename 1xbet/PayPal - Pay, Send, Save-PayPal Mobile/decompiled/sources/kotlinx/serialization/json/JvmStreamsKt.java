package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a,\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b\b\u0010\n\u001a/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0006\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u000e\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\u000e\u0010\u0010\u001a?\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0016"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/io/OutputStream;", "stream", "", "encodeToStream", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Ljava/io/OutputStream;)V", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Ljava/io/OutputStream;)V", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Ljava/io/InputStream;", "decodeFromStream", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/io/InputStream;)Ljava/lang/Object;", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;)Ljava/lang/Object;", "Lkotlinx/serialization/json/DecodeSequenceMode;", "format", "Lkotlin/sequences/Sequence;", "decodeToSequence", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkotlin/sequences/Sequence;", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkotlin/sequences/Sequence;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class JvmStreamsKt {
    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T> void encodeToStream(kotlinx.serialization.json.Json json, kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t, java.io.OutputStream outputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        kotlinx.serialization.json.internal.JsonToJavaStreamWriter jsonToJavaStreamWriter = new kotlinx.serialization.json.internal.JsonToJavaStreamWriter(outputStream);
        try {
            kotlinx.serialization.json.internal.JsonStreamsKt.encodeByWriter(json, jsonToJavaStreamWriter, serializationStrategy, t);
        } finally {
            jsonToJavaStreamWriter.release();
        }
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> void encodeToStream(kotlinx.serialization.json.Json json, T t, java.io.OutputStream outputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        encodeToStream(json, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t, outputStream);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T> T decodeFromStream(kotlinx.serialization.json.Json json, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlinx.serialization.json.internal.JavaStreamSerialReader javaStreamSerialReader = new kotlinx.serialization.json.internal.JavaStreamSerialReader(inputStream);
        try {
            return (T) kotlinx.serialization.json.internal.JsonStreamsKt.decodeByReader(json, deserializationStrategy, javaStreamSerialReader);
        } finally {
            javaStreamSerialReader.release();
        }
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> T decodeFromStream(kotlinx.serialization.json.Json json, java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromStream(json, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), inputStream);
    }

    public static /* synthetic */ kotlin.sequences.Sequence decodeToSequence$default(kotlinx.serialization.json.Json json, java.io.InputStream inputStream, kotlinx.serialization.DeserializationStrategy deserializationStrategy, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            decodeSequenceMode = kotlinx.serialization.json.DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequence(json, inputStream, deserializationStrategy, decodeSequenceMode);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T> kotlin.sequences.Sequence<T> decodeToSequence(kotlinx.serialization.json.Json json, java.io.InputStream inputStream, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeSequenceMode, "");
        return kotlinx.serialization.json.internal.JsonStreamsKt.decodeToSequenceByReader(json, new kotlinx.serialization.json.internal.JavaStreamSerialReader(inputStream), deserializationStrategy, decodeSequenceMode);
    }

    public static /* synthetic */ kotlin.sequences.Sequence decodeToSequence$default(kotlinx.serialization.json.Json json, java.io.InputStream inputStream, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            decodeSequenceMode = kotlinx.serialization.json.DecodeSequenceMode.AUTO_DETECT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeSequenceMode, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequence(json, inputStream, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), decodeSequenceMode);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> kotlin.sequences.Sequence<T> decodeToSequence(kotlinx.serialization.json.Json json, java.io.InputStream inputStream, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeSequenceMode, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequence(json, inputStream, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), decodeSequenceMode);
    }
}
