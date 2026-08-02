package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/datetime/serializers/LocalDateTimeComponentSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/LocalDateTime;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/datetime/LocalDateTime;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocalDateTimeComponentSerializer implements kotlinx.serialization.KSerializer<kotlinx.datetime.LocalDateTime> {
    public static final kotlinx.datetime.serializers.LocalDateTimeComponentSerializer INSTANCE = new kotlinx.datetime.serializers.LocalDateTimeComponentSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("kotlinx.datetime.LocalDateTime/components", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.serializers.LocalDateTimeComponentSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kotlinx.datetime.serializers.LocalDateTimeComponentSerializer.m24198$r8$lambda$gjULFEtgXlEmngwtQm6JNDcvo((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
        }
    });

    private LocalDateTimeComponentSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.datetime.LocalDateTime deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        java.lang.Integer num = null;
        java.lang.Short sh = null;
        java.lang.Short sh2 = null;
        java.lang.Short sh3 = null;
        java.lang.Short sh4 = null;
        short s = 0;
        int i = 0;
        while (true) {
            kotlinx.datetime.serializers.LocalDateTimeComponentSerializer localDateTimeComponentSerializer = INSTANCE;
            int decodeElementIndex = beginStructure.decodeElementIndex(localDateTimeComponentSerializer.getDescriptor());
            switch (decodeElementIndex) {
                case -1:
                    if (num == null) {
                        throw new kotlinx.serialization.MissingFieldException(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, localDateTimeComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                    }
                    if (sh == null) {
                        throw new kotlinx.serialization.MissingFieldException("month", localDateTimeComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                    }
                    if (sh2 == null) {
                        throw new kotlinx.serialization.MissingFieldException("day", localDateTimeComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                    }
                    if (sh3 == null) {
                        throw new kotlinx.serialization.MissingFieldException("hour", localDateTimeComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                    }
                    if (sh4 == null) {
                        throw new kotlinx.serialization.MissingFieldException("minute", localDateTimeComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                    }
                    kotlinx.datetime.LocalDateTime localDateTime = new kotlinx.datetime.LocalDateTime(num.intValue(), sh.shortValue(), sh2.shortValue(), sh3.shortValue(), sh4.shortValue(), s, i);
                    beginStructure.endStructure(descriptor2);
                    return localDateTime;
                case 0:
                    num = java.lang.Integer.valueOf(beginStructure.decodeIntElement(localDateTimeComponentSerializer.getDescriptor(), 0));
                    break;
                case 1:
                    sh = java.lang.Short.valueOf(beginStructure.decodeShortElement(localDateTimeComponentSerializer.getDescriptor(), 1));
                    break;
                case 2:
                    sh2 = java.lang.Short.valueOf(beginStructure.decodeShortElement(localDateTimeComponentSerializer.getDescriptor(), 2));
                    break;
                case 3:
                    sh3 = java.lang.Short.valueOf(beginStructure.decodeShortElement(localDateTimeComponentSerializer.getDescriptor(), 3));
                    break;
                case 4:
                    sh4 = java.lang.Short.valueOf(beginStructure.decodeShortElement(localDateTimeComponentSerializer.getDescriptor(), 4));
                    break;
                case 5:
                    s = beginStructure.decodeShortElement(localDateTimeComponentSerializer.getDescriptor(), 5);
                    break;
                case 6:
                    i = beginStructure.decodeIntElement(localDateTimeComponentSerializer.getDescriptor(), 6);
                    break;
                default:
                    throw new kotlinx.serialization.SerializationException("Unexpected index: ".concat(java.lang.String.valueOf(decodeElementIndex)));
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.datetime.LocalDateTime value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        kotlinx.datetime.serializers.LocalDateTimeComponentSerializer localDateTimeComponentSerializer = INSTANCE;
        beginStructure.encodeIntElement(localDateTimeComponentSerializer.getDescriptor(), 0, value.getYear());
        beginStructure.encodeShortElement(localDateTimeComponentSerializer.getDescriptor(), 1, (short) kotlinx.datetime.MonthKt.getNumber(value.m24141getMonth()));
        beginStructure.encodeShortElement(localDateTimeComponentSerializer.getDescriptor(), 2, (short) value.getDay());
        beginStructure.encodeShortElement(localDateTimeComponentSerializer.getDescriptor(), 3, (short) value.getHour());
        beginStructure.encodeShortElement(localDateTimeComponentSerializer.getDescriptor(), 4, (short) value.getMinute());
        if (value.getSecond() != 0 || value.getNanosecond() != 0) {
            beginStructure.encodeShortElement(localDateTimeComponentSerializer.getDescriptor(), 5, (short) value.getSecond());
            if (value.getNanosecond() != 0) {
                beginStructure.encodeIntElement(localDateTimeComponentSerializer.getDescriptor(), 6, value.getNanosecond());
            }
        }
        beginStructure.endStructure(descriptor2);
    }

    /* renamed from: $r8$lambda$gjULFEtgXlEmn-gwt-Qm6JNDcvo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24198$r8$lambda$gjULFEtgXlEmngwtQm6JNDcvo(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        classSerialDescriptorBuilder.element(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        classSerialDescriptorBuilder.element("month", kotlinx.serialization.internal.ShortSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        classSerialDescriptorBuilder.element("day", kotlinx.serialization.internal.ShortSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        classSerialDescriptorBuilder.element("hour", kotlinx.serialization.internal.ShortSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        classSerialDescriptorBuilder.element("minute", kotlinx.serialization.internal.ShortSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        classSerialDescriptorBuilder.element("second", kotlinx.serialization.internal.ShortSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        classSerialDescriptorBuilder.element("nanosecond", kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        return kotlin.Unit.INSTANCE;
    }
}
