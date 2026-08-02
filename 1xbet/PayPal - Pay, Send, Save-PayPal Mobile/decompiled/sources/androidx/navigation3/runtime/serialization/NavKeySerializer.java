package androidx.navigation3.runtime.serialization;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/navigation3/runtime/serialization/NavKeySerializer;", "Landroidx/navigation3/runtime/NavKey;", "T", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Landroidx/navigation3/runtime/NavKey;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Landroidx/navigation3/runtime/NavKey;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class NavKeySerializer<T extends androidx.navigation3.runtime.NavKey> implements kotlinx.serialization.KSerializer<T> {
    public static final int $stable = 8;
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("androidx.navigation.runtime.NavKey", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.runtime.serialization.NavKeySerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.navigation3.runtime.serialization.NavKeySerializer.$r8$lambda$U9xLw2LLKX_RabAFe71wJ7N5SM4((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
        }
    });

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object decodeSerializableElement$default;
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        decodeSerializableElement$default = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), beginStructure.decodeElementIndex(getDescriptor()), kotlinx.serialization.SerializersKt.serializer(kotlin.jvm.JvmClassMappingKt.getKotlinClass(java.lang.Class.forName(beginStructure.decodeStringElement(getDescriptor(), beginStructure.decodeElementIndex(getDescriptor()))))), null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeSerializableElement$default, "");
        T t = (T) decodeSerializableElement$default;
        beginStructure.endStructure(descriptor);
        return t;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        beginStructure.encodeStringElement(getDescriptor(), 0, value.getClass().getName());
        kotlinx.serialization.KSerializer serializer = kotlinx.serialization.SerializersKt.serializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()));
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "");
        beginStructure.encodeSerializableElement(getDescriptor(), 1, serializer, value);
        beginStructure.endStructure(descriptor);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$U9xLw2LLKX_RabAFe71wJ7N5SM4(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "type", kotlinx.serialization.internal.StringSerializer.INSTANCE.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor$default("Any", new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 4, null), null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }
}
