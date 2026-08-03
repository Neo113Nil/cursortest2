package kotlinx.serialization.json;

/* compiled from: JsonElementSerializers.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/json/JsonElementSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonElementSerializer implements kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonElement> {
    public static final kotlinx.serialization.json.JsonElementSerializer INSTANCE = new kotlinx.serialization.json.JsonElementSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", kotlinx.serialization.descriptors.PolymorphicKind.SEALED.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit descriptor$lambda$5;
            descriptor$lambda$5 = kotlinx.serialization.json.JsonElementSerializer.descriptor$lambda$5((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
            return descriptor$lambda$5;
        }
    });

    private JsonElementSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit descriptor$lambda$5(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder buildSerialDescriptor) {
        kotlinx.serialization.descriptors.SerialDescriptor defer;
        kotlinx.serialization.descriptors.SerialDescriptor defer2;
        kotlinx.serialization.descriptors.SerialDescriptor defer3;
        kotlinx.serialization.descriptors.SerialDescriptor defer4;
        kotlinx.serialization.descriptors.SerialDescriptor defer5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        defer = kotlinx.serialization.json.JsonElementSerializersKt.defer(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor$lambda$5$lambda$0;
                descriptor$lambda$5$lambda$0 = kotlinx.serialization.json.JsonElementSerializer.descriptor$lambda$5$lambda$0();
                return descriptor$lambda$5$lambda$0;
            }
        });
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonPrimitive", defer, null, false, 12, null);
        defer2 = kotlinx.serialization.json.JsonElementSerializersKt.defer(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor$lambda$5$lambda$1;
                descriptor$lambda$5$lambda$1 = kotlinx.serialization.json.JsonElementSerializer.descriptor$lambda$5$lambda$1();
                return descriptor$lambda$5$lambda$1;
            }
        });
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonNull", defer2, null, false, 12, null);
        defer3 = kotlinx.serialization.json.JsonElementSerializersKt.defer(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor$lambda$5$lambda$2;
                descriptor$lambda$5$lambda$2 = kotlinx.serialization.json.JsonElementSerializer.descriptor$lambda$5$lambda$2();
                return descriptor$lambda$5$lambda$2;
            }
        });
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonLiteral", defer3, null, false, 12, null);
        defer4 = kotlinx.serialization.json.JsonElementSerializersKt.defer(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor$lambda$5$lambda$3;
                descriptor$lambda$5$lambda$3 = kotlinx.serialization.json.JsonElementSerializer.descriptor$lambda$5$lambda$3();
                return descriptor$lambda$5$lambda$3;
            }
        });
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonObject", defer4, null, false, 12, null);
        defer5 = kotlinx.serialization.json.JsonElementSerializersKt.defer(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor$lambda$5$lambda$4;
                descriptor$lambda$5$lambda$4 = kotlinx.serialization.json.JsonElementSerializer.descriptor$lambda$5$lambda$4();
                return descriptor$lambda$5$lambda$4;
            }
        });
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonArray", defer5, null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.descriptors.SerialDescriptor descriptor$lambda$5$lambda$0() {
        return kotlinx.serialization.json.JsonPrimitiveSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.descriptors.SerialDescriptor descriptor$lambda$5$lambda$1() {
        return kotlinx.serialization.json.JsonNullSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.descriptors.SerialDescriptor descriptor$lambda$5$lambda$2() {
        return kotlinx.serialization.json.JsonLiteralSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.descriptors.SerialDescriptor descriptor$lambda$5$lambda$3() {
        return kotlinx.serialization.json.JsonObjectSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.descriptors.SerialDescriptor descriptor$lambda$5$lambda$4() {
        return kotlinx.serialization.json.JsonArraySerializer.INSTANCE.getDescriptor();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.json.JsonElement value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.json.JsonElementSerializersKt.verify(encoder);
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
    public kotlinx.serialization.json.JsonElement deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        return kotlinx.serialization.json.JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
    }
}
