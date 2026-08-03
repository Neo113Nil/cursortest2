package kotlinx.serialization.json;

/* compiled from: JsonDecoder.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "decodeJsonElement", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface JsonDecoder extends kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder {
    kotlinx.serialization.json.JsonElement decodeJsonElement();

    kotlinx.serialization.json.Json getJson();

    /* compiled from: JsonDecoder.kt */
    /* renamed from: kotlinx.serialization.json.JsonDecoder$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: JsonDecoder.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static int decodeCollectionSize(kotlinx.serialization.json.JsonDecoder jsonDecoder, kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return kotlinx.serialization.encoding.CompositeDecoder.CC.$default$decodeCollectionSize(jsonDecoder, descriptor);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static <T> T decodeNullableSerializableValue(kotlinx.serialization.json.JsonDecoder jsonDecoder, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) kotlinx.serialization.encoding.Decoder.CC.$default$decodeNullableSerializableValue(jsonDecoder, deserializer);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static boolean decodeSequentially(kotlinx.serialization.json.JsonDecoder jsonDecoder) {
            return kotlinx.serialization.encoding.CompositeDecoder.CC.$default$decodeSequentially(jsonDecoder);
        }

        @java.lang.Deprecated
        public static <T> T decodeSerializableValue(kotlinx.serialization.json.JsonDecoder jsonDecoder, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) kotlinx.serialization.encoding.Decoder.CC.$default$decodeSerializableValue(jsonDecoder, deserializer);
        }
    }
}
