package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/datetime/serializers/DayBasedDateTimeUnitSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/DateTimeUnit$DayBased;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/datetime/DateTimeUnit$DayBased;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/datetime/DateTimeUnit$DayBased;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DayBasedDateTimeUnitSerializer implements kotlinx.serialization.KSerializer<kotlinx.datetime.DateTimeUnit.DayBased> {
    public static final kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer INSTANCE = new kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer();

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy descriptor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.descriptors.SerialDescriptor buildClassSerialDescriptor;
            buildClassSerialDescriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("kotlinx.datetime.DayBased", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer.$r8$lambda$QKIVZyJJbXAJIYi8geEpNk4c9Sk((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
                }
            });
            return buildClassSerialDescriptor;
        }
    });

    private DayBasedDateTimeUnitSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return (kotlinx.serialization.descriptors.SerialDescriptor) descriptor.getValue();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.datetime.DateTimeUnit.DayBased value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        beginStructure.encodeIntElement(INSTANCE.getDescriptor(), 0, value.getDays());
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.datetime.DateTimeUnit.DayBased deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        boolean z = true;
        if (!beginStructure.decodeSequentially()) {
            i = 0;
            boolean z2 = false;
            while (true) {
                kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer dayBasedDateTimeUnitSerializer = INSTANCE;
                int decodeElementIndex = beginStructure.decodeElementIndex(dayBasedDateTimeUnitSerializer.getDescriptor());
                if (decodeElementIndex == -1) {
                    z = z2;
                    break;
                }
                if (decodeElementIndex == 0) {
                    i = beginStructure.decodeIntElement(dayBasedDateTimeUnitSerializer.getDescriptor(), 0);
                    z2 = true;
                } else {
                    kotlinx.datetime.serializers.DateTimeUnitSerializersKt.throwUnknownIndexException(decodeElementIndex);
                    throw new kotlin.KotlinNothingValueException();
                }
            }
        } else {
            i = beginStructure.decodeIntElement(INSTANCE.getDescriptor(), 0);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        beginStructure.endStructure(descriptor2);
        if (!z) {
            throw new kotlinx.serialization.MissingFieldException("days", getDescriptor().getGetHighSpeedVideoSizes());
        }
        return new kotlinx.datetime.DateTimeUnit.DayBased(i);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QKIVZyJJbXAJIYi8geEpNk4c9Sk(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        classSerialDescriptorBuilder.element("days", kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        return kotlin.Unit.INSTANCE;
    }
}
