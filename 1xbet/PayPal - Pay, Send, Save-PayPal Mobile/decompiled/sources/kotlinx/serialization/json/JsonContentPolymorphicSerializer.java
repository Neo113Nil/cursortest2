package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0013\u001a\u00020\u0012H$¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u001a8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "baseClass", "<init>", "(Lkotlin/reflect/KClass;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/reflect/KClass;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class JsonContentPolymorphicSerializer<T> implements kotlinx.serialization.KSerializer<T> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.reflect.KClass<T> getHighSpeedVideoSizes;

    protected abstract kotlinx.serialization.DeserializationStrategy<T> selectDeserializer(kotlinx.serialization.json.JsonElement element);

    public JsonContentPolymorphicSerializer(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        this.getHighSpeedVideoSizes = kClass;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonContentPolymorphicSerializer<");
        sb.append(kClass.getSimpleName());
        sb.append(kotlin.text.Typography.greater);
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor$default(sb.toString(), kotlinx.serialization.descriptors.PolymorphicKind.SEALED.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 8, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.KSerializer polymorphic = encoder.getSerializersModule().getPolymorphic((kotlin.reflect.KClass<? super kotlin.reflect.KClass<T>>) this.getHighSpeedVideoSizes, (kotlin.reflect.KClass<T>) value);
        if (polymorphic == null) {
            kotlinx.serialization.KSerializer serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()));
            if (serializerOrNull != null) {
                polymorphic = serializerOrNull;
            } else {
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass());
                kotlin.reflect.KClass<T> kClass = this.getHighSpeedVideoSizes;
                java.lang.String simpleName = orCreateKotlinClass.getSimpleName();
                if (simpleName == null) {
                    simpleName = java.lang.String.valueOf(orCreateKotlinClass);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("in the scope of '");
                sb.append(kClass.getSimpleName());
                sb.append('\'');
                java.lang.String obj = sb.toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Class '");
                sb2.append(simpleName);
                sb2.append("' is not registered for polymorphic serialization ");
                sb2.append(obj);
                sb2.append(".\nMark the base class as 'sealed' or register the serializer explicitly.");
                throw new kotlinx.serialization.SerializationException(sb2.toString());
            }
        }
        ((kotlinx.serialization.KSerializer) polymorphic).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.json.JsonDecoder asJsonDecoder = kotlinx.serialization.json.JsonElementSerializersKt.asJsonDecoder(decoder);
        kotlinx.serialization.json.JsonElement decodeJsonElement = asJsonDecoder.decodeJsonElement();
        kotlinx.serialization.DeserializationStrategy<T> selectDeserializer = selectDeserializer(decodeJsonElement);
        kotlin.jvm.internal.Intrinsics.checkNotNull(selectDeserializer, "");
        return (T) asJsonDecoder.getJson().decodeFromJsonElement((kotlinx.serialization.KSerializer) selectDeserializer, decodeJsonElement);
    }
}
