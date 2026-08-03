package kotlinx.serialization.json;

/* compiled from: JsonElementSerializers.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/json/JsonPrimitiveSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonPrimitiveSerializer implements kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonPrimitive> {
    public static final kotlinx.serialization.json.JsonPrimitiveSerializer INSTANCE = new kotlinx.serialization.json.JsonPrimitiveSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.json.JsonPrimitive", kotlinx.serialization.descriptors.PrimitiveKind.STRING.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 8, null);

    private JsonPrimitiveSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.json.JsonPrimitive value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.json.JsonElementSerializersKt.verify(encoder);
        if (value instanceof kotlinx.serialization.json.JsonNull) {
            encoder.encodeSerializableValue(kotlinx.serialization.json.JsonNullSerializer.INSTANCE, kotlinx.serialization.json.JsonNull.INSTANCE);
        } else {
            encoder.encodeSerializableValue(kotlinx.serialization.json.JsonLiteralSerializer.INSTANCE, (kotlinx.serialization.json.JsonLiteral) value);
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.json.JsonPrimitive deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.json.JsonElement decodeJsonElement = kotlinx.serialization.json.JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (!(decodeJsonElement instanceof kotlinx.serialization.json.JsonPrimitive)) {
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()), decodeJsonElement.toString());
        }
        return (kotlinx.serialization.json.JsonPrimitive) decodeJsonElement;
    }
}
