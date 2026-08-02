package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/serialization/json/JsonElementSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonElementSerializer implements kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonElement> {
    public static final kotlinx.serialization.json.JsonElementSerializer INSTANCE = new kotlinx.serialization.json.JsonElementSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", kotlinx.serialization.descriptors.PolymorphicKind.SEALED.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kotlinx.serialization.json.JsonElementSerializer.$r8$lambda$11pnsZ79xhRxEt_22nHYd8_5rdc((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
        }
    });

    private JsonElementSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.json.JsonElement value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.json.JsonElementSerializersKt.asJsonEncoder(encoder);
        if (value instanceof kotlinx.serialization.json.JsonPrimitive) {
            encoder.encodeSerializableValue(kotlinx.serialization.json.JsonPrimitiveSerializer.INSTANCE, value);
        } else if (value instanceof kotlinx.serialization.json.JsonObject) {
            encoder.encodeSerializableValue(kotlinx.serialization.json.JsonObjectSerializer.INSTANCE, value);
        } else {
            if (!(value instanceof kotlinx.serialization.json.JsonArray)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            encoder.encodeSerializableValue(kotlinx.serialization.json.JsonArraySerializer.INSTANCE, value);
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.json.JsonElement deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return kotlinx.serialization.json.JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$11pnsZ79xhRxEt_22nHYd8_5rdc(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, com.datadog.android.sessionreplay.internal.gson.GsonExtKt.JSON_PRIMITIVE_TYPE, kotlinx.serialization.json.JsonElementSerializersKt.access$defer(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor2;
                descriptor2 = kotlinx.serialization.json.JsonPrimitiveSerializer.INSTANCE.getDescriptor();
                return descriptor2;
            }
        }), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "JsonNull", kotlinx.serialization.json.JsonElementSerializersKt.access$defer(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor2;
                descriptor2 = kotlinx.serialization.json.JsonNullSerializer.INSTANCE.getDescriptor();
                return descriptor2;
            }
        }), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "JsonLiteral", kotlinx.serialization.json.JsonElementSerializersKt.access$defer(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor2;
                descriptor2 = kotlinx.serialization.json.JsonLiteralSerializer.INSTANCE.getDescriptor();
                return descriptor2;
            }
        }), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, com.datadog.android.sessionreplay.internal.gson.GsonExtKt.JSON_OBJECT_TYPE, kotlinx.serialization.json.JsonElementSerializersKt.access$defer(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor2;
                descriptor2 = kotlinx.serialization.json.JsonObjectSerializer.INSTANCE.getDescriptor();
                return descriptor2;
            }
        }), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, com.datadog.android.sessionreplay.internal.gson.GsonExtKt.JSON_ARRAY_TYPE, kotlinx.serialization.json.JsonElementSerializersKt.access$defer(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor2;
                descriptor2 = kotlinx.serialization.json.JsonArraySerializer.INSTANCE.getDescriptor();
                return descriptor2;
            }
        }), null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }
}
