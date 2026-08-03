package kotlinx.serialization.json;

/* compiled from: JsonEncoder.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "encodeJsonElement", "", "element", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface JsonEncoder extends kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder {
    void encodeJsonElement(kotlinx.serialization.json.JsonElement element);

    kotlinx.serialization.json.Json getJson();

    /* compiled from: JsonEncoder.kt */
    /* renamed from: kotlinx.serialization.json.JsonEncoder$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: JsonEncoder.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static kotlinx.serialization.encoding.CompositeEncoder beginCollection(kotlinx.serialization.json.JsonEncoder jsonEncoder, kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return kotlinx.serialization.encoding.Encoder.CC.$default$beginCollection(jsonEncoder, descriptor, i);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static void encodeNotNullMark(kotlinx.serialization.json.JsonEncoder jsonEncoder) {
            kotlinx.serialization.encoding.Encoder.CC.$default$encodeNotNullMark(jsonEncoder);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static <T> void encodeNullableSerializableValue(kotlinx.serialization.json.JsonEncoder jsonEncoder, kotlinx.serialization.SerializationStrategy<? super T> serializer, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
            kotlinx.serialization.encoding.Encoder.CC.$default$encodeNullableSerializableValue(jsonEncoder, serializer, t);
        }

        @java.lang.Deprecated
        public static <T> void encodeSerializableValue(kotlinx.serialization.json.JsonEncoder jsonEncoder, kotlinx.serialization.SerializationStrategy<? super T> serializer, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
            kotlinx.serialization.encoding.Encoder.CC.$default$encodeSerializableValue(jsonEncoder, serializer, t);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static boolean shouldEncodeElementDefault(kotlinx.serialization.json.JsonEncoder jsonEncoder, kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return kotlinx.serialization.encoding.CompositeEncoder.CC.$default$shouldEncodeElementDefault(jsonEncoder, descriptor, i);
        }
    }
}
