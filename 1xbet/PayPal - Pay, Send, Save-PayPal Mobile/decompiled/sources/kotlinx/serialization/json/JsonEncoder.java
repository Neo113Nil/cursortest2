package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/json/JsonElement;", "element", "", "encodeJsonElement", "(Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface JsonEncoder extends kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder {
    void encodeJsonElement(kotlinx.serialization.json.JsonElement element);

    kotlinx.serialization.json.Json getJson();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static kotlinx.serialization.encoding.CompositeEncoder beginCollection(kotlinx.serialization.json.JsonEncoder jsonEncoder, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
            return kotlinx.serialization.json.JsonEncoder.super.beginCollection(serialDescriptor, i);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static void encodeNotNullMark(kotlinx.serialization.json.JsonEncoder jsonEncoder) {
            kotlinx.serialization.json.JsonEncoder.super.encodeNotNullMark();
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static <T> void encodeNullableSerializableValue(kotlinx.serialization.json.JsonEncoder jsonEncoder, kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
            kotlinx.serialization.json.JsonEncoder.super.encodeNullableSerializableValue(serializationStrategy, t);
        }

        @java.lang.Deprecated
        public static <T> void encodeSerializableValue(kotlinx.serialization.json.JsonEncoder jsonEncoder, kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
            kotlinx.serialization.json.JsonEncoder.super.encodeSerializableValue(serializationStrategy, t);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static boolean shouldEncodeElementDefault(kotlinx.serialization.json.JsonEncoder jsonEncoder, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
            return kotlinx.serialization.json.JsonEncoder.super.shouldEncodeElementDefault(serialDescriptor, i);
        }
    }
}
