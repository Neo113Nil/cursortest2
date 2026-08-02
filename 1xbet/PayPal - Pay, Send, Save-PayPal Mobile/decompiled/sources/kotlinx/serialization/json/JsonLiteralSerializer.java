package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/serialization/json/JsonLiteralSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonLiteral;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonLiteralSerializer implements kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonLiteral> {
    public static final kotlinx.serialization.json.JsonLiteralSerializer INSTANCE = new kotlinx.serialization.json.JsonLiteralSerializer();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final kotlinx.serialization.descriptors.SerialDescriptor getHighSpeedVideoFpsRanges = kotlinx.serialization.descriptors.SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", kotlinx.serialization.descriptors.PrimitiveKind.STRING.INSTANCE);

    private JsonLiteralSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.json.JsonElement decodeJsonElement = kotlinx.serialization.json.JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (!(decodeJsonElement instanceof kotlinx.serialization.json.JsonLiteral)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()));
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), decodeJsonElement.toString());
        }
        return (kotlinx.serialization.json.JsonLiteral) decodeJsonElement;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* synthetic */ void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlinx.serialization.json.JsonLiteral jsonLiteral = (kotlinx.serialization.json.JsonLiteral) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonLiteral, "");
        kotlinx.serialization.json.JsonElementSerializersKt.asJsonEncoder(encoder);
        if (!jsonLiteral.getIsString()) {
            if (jsonLiteral.getCoerceToInlineType() != null) {
                encoder.encodeInline(jsonLiteral.getCoerceToInlineType()).encodeString(jsonLiteral.getContent());
                return;
            }
            java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(jsonLiteral.getContent());
            if (longOrNull != null) {
                encoder.encodeLong(longOrNull.longValue());
                return;
            }
            kotlin.ULong uLongOrNull = kotlin.text.UStringsKt.toULongOrNull(jsonLiteral.getContent());
            if (uLongOrNull != null) {
                encoder.encodeInline(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.ULong.INSTANCE).getDescriptor()).encodeLong(uLongOrNull.getGetHighSpeedVideoFpsRanges());
                return;
            }
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(jsonLiteral.getContent());
            if (doubleOrNull != null) {
                encoder.encodeDouble(doubleOrNull.doubleValue());
                return;
            }
            java.lang.Boolean booleanStrictOrNull = kotlin.text.StringsKt.toBooleanStrictOrNull(jsonLiteral.getContent());
            if (booleanStrictOrNull != null) {
                encoder.encodeBoolean(booleanStrictOrNull.booleanValue());
                return;
            }
        }
        encoder.encodeString(jsonLiteral.getContent());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return getHighSpeedVideoFpsRanges;
    }
}
