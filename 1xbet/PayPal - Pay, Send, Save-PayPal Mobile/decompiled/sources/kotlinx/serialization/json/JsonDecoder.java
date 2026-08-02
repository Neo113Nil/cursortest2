package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "Lkotlinx/serialization/json/JsonElement;", "decodeJsonElement", "()Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface JsonDecoder extends kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder {
    kotlinx.serialization.json.JsonElement decodeJsonElement();

    kotlinx.serialization.json.Json getJson();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static int decodeCollectionSize(kotlinx.serialization.json.JsonDecoder jsonDecoder, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
            return kotlinx.serialization.json.JsonDecoder.super.decodeCollectionSize(serialDescriptor);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static <T> T decodeNullableSerializableValue(kotlinx.serialization.json.JsonDecoder jsonDecoder, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
            return (T) kotlinx.serialization.json.JsonDecoder.super.decodeNullableSerializableValue(deserializationStrategy);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static boolean decodeSequentially(kotlinx.serialization.json.JsonDecoder jsonDecoder) {
            return kotlinx.serialization.json.JsonDecoder.super.decodeSequentially();
        }

        @java.lang.Deprecated
        public static <T> T decodeSerializableValue(kotlinx.serialization.json.JsonDecoder jsonDecoder, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
            return (T) kotlinx.serialization.json.JsonDecoder.super.decodeSerializableValue(deserializationStrategy);
        }
    }
}
