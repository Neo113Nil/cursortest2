package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/datetime/serializers/DateTimePeriodComponentSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/DateTimePeriod;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/datetime/DateTimePeriod;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/datetime/DateTimePeriod;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DateTimePeriodComponentSerializer implements kotlinx.serialization.KSerializer<kotlinx.datetime.DateTimePeriod> {
    public static final kotlinx.datetime.serializers.DateTimePeriodComponentSerializer INSTANCE = new kotlinx.datetime.serializers.DateTimePeriodComponentSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("kotlinx.datetime.DateTimePeriod/components", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.serializers.DateTimePeriodComponentSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kotlinx.datetime.serializers.DateTimePeriodComponentSerializer.m24196$r8$lambda$xHx96YDzBuWzh9bQBCVqCZlf2E((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
        }
    });

    private DateTimePeriodComponentSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.datetime.DateTimePeriod deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        long j = 0;
        while (true) {
            kotlinx.datetime.serializers.DateTimePeriodComponentSerializer dateTimePeriodComponentSerializer = INSTANCE;
            int decodeElementIndex = beginStructure.decodeElementIndex(dateTimePeriodComponentSerializer.getDescriptor());
            switch (decodeElementIndex) {
                case -1:
                    kotlinx.datetime.DateTimePeriod DateTimePeriod = kotlinx.datetime.DateTimePeriodKt.DateTimePeriod(i, i2, i3, i4, i5, i6, j);
                    beginStructure.endStructure(descriptor2);
                    return DateTimePeriod;
                case 0:
                    i = beginStructure.decodeIntElement(dateTimePeriodComponentSerializer.getDescriptor(), 0);
                    break;
                case 1:
                    i2 = beginStructure.decodeIntElement(dateTimePeriodComponentSerializer.getDescriptor(), 1);
                    break;
                case 2:
                    i3 = beginStructure.decodeIntElement(dateTimePeriodComponentSerializer.getDescriptor(), 2);
                    break;
                case 3:
                    i4 = beginStructure.decodeIntElement(dateTimePeriodComponentSerializer.getDescriptor(), 3);
                    break;
                case 4:
                    i5 = beginStructure.decodeIntElement(dateTimePeriodComponentSerializer.getDescriptor(), 4);
                    break;
                case 5:
                    i6 = beginStructure.decodeIntElement(dateTimePeriodComponentSerializer.getDescriptor(), 5);
                    break;
                case 6:
                    j = beginStructure.decodeLongElement(dateTimePeriodComponentSerializer.getDescriptor(), 6);
                    break;
                default:
                    throw new kotlinx.serialization.SerializationException("Unexpected index: ".concat(java.lang.String.valueOf(decodeElementIndex)));
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.datetime.DateTimePeriod value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        if (value.getYears() != 0) {
            beginStructure.encodeIntElement(INSTANCE.getDescriptor(), 0, value.getYears());
        }
        if (value.getMonths() != 0) {
            beginStructure.encodeIntElement(INSTANCE.getDescriptor(), 1, value.getMonths());
        }
        if (value.getDays() != 0) {
            beginStructure.encodeIntElement(INSTANCE.getDescriptor(), 2, value.getDays());
        }
        if (value.getHours() != 0) {
            beginStructure.encodeIntElement(INSTANCE.getDescriptor(), 3, value.getHours());
        }
        if (value.getMinutes() != 0) {
            beginStructure.encodeIntElement(INSTANCE.getDescriptor(), 4, value.getMinutes());
        }
        if (value.getSeconds() != 0) {
            beginStructure.encodeIntElement(INSTANCE.getDescriptor(), 5, value.getSeconds());
        }
        if (value.getNanoseconds() != 0) {
            beginStructure.encodeLongElement(INSTANCE.getDescriptor(), 6, value.getNanoseconds());
        }
        beginStructure.endStructure(descriptor2);
    }

    /* renamed from: $r8$lambda$x-Hx96YDzBuWzh9bQBCVqCZlf2E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24196$r8$lambda$xHx96YDzBuWzh9bQBCVqCZlf2E(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        classSerialDescriptorBuilder.element("years", kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        classSerialDescriptorBuilder.element("months", kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        classSerialDescriptorBuilder.element("days", kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        classSerialDescriptorBuilder.element("hours", kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        classSerialDescriptorBuilder.element("minutes", kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        classSerialDescriptorBuilder.element("seconds", kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        classSerialDescriptorBuilder.element("nanoseconds", kotlinx.serialization.internal.LongSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        return kotlin.Unit.INSTANCE;
    }
}
