package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/serialization/json/JsonPrimitiveSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonPrimitive;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonPrimitiveSerializer implements kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonPrimitive> {
    public static final kotlinx.serialization.json.JsonPrimitiveSerializer INSTANCE = new kotlinx.serialization.json.JsonPrimitiveSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.json.JsonPrimitive", kotlinx.serialization.descriptors.PrimitiveKind.STRING.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 8, null);

    private JsonPrimitiveSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.json.JsonPrimitive value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.json.JsonElementSerializersKt.asJsonEncoder(encoder);
        if (value instanceof kotlinx.serialization.json.JsonNull) {
            encoder.encodeSerializableValue(kotlinx.serialization.json.JsonNullSerializer.INSTANCE, kotlinx.serialization.json.JsonNull.INSTANCE);
        } else {
            encoder.encodeSerializableValue(kotlinx.serialization.json.JsonLiteralSerializer.INSTANCE, (kotlinx.serialization.json.JsonLiteral) value);
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.json.JsonPrimitive deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.json.JsonElement decodeJsonElement = kotlinx.serialization.json.JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (!(decodeJsonElement instanceof kotlinx.serialization.json.JsonPrimitive)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()));
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), decodeJsonElement.toString());
        }
        return (kotlinx.serialization.json.JsonPrimitive) decodeJsonElement;
    }
}
