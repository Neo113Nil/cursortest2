package kotlinx.serialization.json;

/* compiled from: JsonContentPolymorphicSerializer.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0018\u001a\u00020\u0019H$J \u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "T", "", "Lkotlinx/serialization/KSerializer;", "baseClass", "Lkotlin/reflect/KClass;", "<init>", "(Lkotlin/reflect/KClass;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "throwSubtypeNotRegistered", "", "subClass", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class JsonContentPolymorphicSerializer<T> implements kotlinx.serialization.KSerializer<T> {
    private final kotlin.reflect.KClass<T> baseClass;
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    protected abstract kotlinx.serialization.DeserializationStrategy<T> selectDeserializer(kotlinx.serialization.json.JsonElement element);

    public JsonContentPolymorphicSerializer(kotlin.reflect.KClass<T> baseClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor$default("JsonContentPolymorphicSerializer<" + baseClass.getSimpleName() + kotlin.text.Typography.greater, kotlinx.serialization.descriptors.PolymorphicKind.SEALED.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 8, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.KSerializer polymorphic = encoder.getSerializersModule().getPolymorphic((kotlin.reflect.KClass<? super kotlin.reflect.KClass<T>>) this.baseClass, (kotlin.reflect.KClass<T>) value);
        if (polymorphic == null) {
            kotlinx.serialization.KSerializer serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()));
            if (serializerOrNull != null) {
                polymorphic = serializerOrNull;
            } else {
                throwSubtypeNotRegistered(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()), this.baseClass);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        ((kotlinx.serialization.KSerializer) polymorphic).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.json.JsonDecoder asJsonDecoder = kotlinx.serialization.json.JsonElementSerializersKt.asJsonDecoder(decoder);
        kotlinx.serialization.json.JsonElement decodeJsonElement = asJsonDecoder.decodeJsonElement();
        kotlinx.serialization.DeserializationStrategy<T> selectDeserializer = selectDeserializer(decodeJsonElement);
        kotlin.jvm.internal.Intrinsics.checkNotNull(selectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) asJsonDecoder.getJson().decodeFromJsonElement((kotlinx.serialization.KSerializer) selectDeserializer, decodeJsonElement);
    }

    private final java.lang.Void throwSubtypeNotRegistered(kotlin.reflect.KClass<?> subClass, kotlin.reflect.KClass<?> baseClass) {
        java.lang.String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = java.lang.String.valueOf(subClass);
        }
        throw new kotlinx.serialization.SerializationException("Class '" + simpleName + "' is not registered for polymorphic serialization " + ("in the scope of '" + baseClass.getSimpleName() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }
}
