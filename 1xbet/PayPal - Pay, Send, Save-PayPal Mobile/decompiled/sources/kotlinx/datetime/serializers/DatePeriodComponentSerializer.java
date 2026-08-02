package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lkotlinx/datetime/serializers/DatePeriodComponentSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/DatePeriod;", "<init>", "()V", "", "p0", "", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;J)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/datetime/DatePeriod;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/datetime/DatePeriod;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DatePeriodComponentSerializer implements kotlinx.serialization.KSerializer<kotlinx.datetime.DatePeriod> {
    public static final kotlinx.datetime.serializers.DatePeriodComponentSerializer INSTANCE = new kotlinx.datetime.serializers.DatePeriodComponentSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("kotlinx.datetime.DatePeriod/components", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.serializers.DatePeriodComponentSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kotlinx.datetime.serializers.DatePeriodComponentSerializer.$r8$lambda$vEkkBhEtcloBUpFWVANfP4H3SGQ((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
        }
    });

    private DatePeriodComponentSerializer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHighSpeedVideoFpsRangesFor(java.lang.String p0, long p1) {
        if (p1 == 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DatePeriod should have non-date components be zero, but got ");
        sb.append(p1);
        sb.append(" in '");
        sb.append(p0);
        sb.append('\'');
        throw new kotlinx.serialization.SerializationException(sb.toString());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.datetime.DatePeriod deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            kotlinx.datetime.serializers.DatePeriodComponentSerializer datePeriodComponentSerializer = INSTANCE;
            int decodeElementIndex = beginStructure.decodeElementIndex(datePeriodComponentSerializer.getDescriptor());
            switch (decodeElementIndex) {
                case -1:
                    kotlinx.datetime.DatePeriod datePeriod = new kotlinx.datetime.DatePeriod(i, i2, i3);
                    beginStructure.endStructure(descriptor2);
                    return datePeriod;
                case 0:
                    i = beginStructure.decodeIntElement(datePeriodComponentSerializer.getDescriptor(), 0);
                    break;
                case 1:
                    i2 = beginStructure.decodeIntElement(datePeriodComponentSerializer.getDescriptor(), 1);
                    break;
                case 2:
                    i3 = beginStructure.decodeIntElement(datePeriodComponentSerializer.getDescriptor(), 2);
                    break;
                case 3:
                    access$unexpectedNonzero(datePeriodComponentSerializer, "hours", beginStructure.decodeIntElement(datePeriodComponentSerializer.getDescriptor(), 3));
                    break;
                case 4:
                    access$unexpectedNonzero(datePeriodComponentSerializer, "minutes", beginStructure.decodeIntElement(datePeriodComponentSerializer.getDescriptor(), 4));
                    break;
                case 5:
                    access$unexpectedNonzero(datePeriodComponentSerializer, "seconds", beginStructure.decodeIntElement(datePeriodComponentSerializer.getDescriptor(), 5));
                    break;
                case 6:
                    getHighSpeedVideoFpsRangesFor("nanoseconds", beginStructure.decodeLongElement(datePeriodComponentSerializer.getDescriptor(), 6));
                    break;
                default:
                    throw new kotlinx.serialization.SerializationException("Unexpected index: ".concat(java.lang.String.valueOf(decodeElementIndex)));
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.datetime.DatePeriod value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        if (value.getYears() != 0) {
            beginStructure.encodeIntElement(kotlinx.datetime.serializers.DateTimePeriodComponentSerializer.INSTANCE.getDescriptor(), 0, value.getYears());
        }
        if (value.getMonths() != 0) {
            beginStructure.encodeIntElement(kotlinx.datetime.serializers.DateTimePeriodComponentSerializer.INSTANCE.getDescriptor(), 1, value.getMonths());
        }
        if (value.getDays() != 0) {
            beginStructure.encodeIntElement(kotlinx.datetime.serializers.DateTimePeriodComponentSerializer.INSTANCE.getDescriptor(), 2, value.getDays());
        }
        beginStructure.endStructure(descriptor2);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vEkkBhEtcloBUpFWVANfP4H3SGQ(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
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

    public static final /* synthetic */ void access$unexpectedNonzero(kotlinx.datetime.serializers.DatePeriodComponentSerializer datePeriodComponentSerializer, java.lang.String str, int i) {
        getHighSpeedVideoFpsRangesFor(str, i);
    }
}
