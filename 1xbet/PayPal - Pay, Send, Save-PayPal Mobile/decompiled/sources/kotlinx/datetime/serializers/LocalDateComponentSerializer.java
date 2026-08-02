package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/datetime/serializers/LocalDateComponentSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/LocalDate;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/datetime/LocalDate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/datetime/LocalDate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocalDateComponentSerializer implements kotlinx.serialization.KSerializer<kotlinx.datetime.LocalDate> {
    public static final kotlinx.datetime.serializers.LocalDateComponentSerializer INSTANCE = new kotlinx.datetime.serializers.LocalDateComponentSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("kotlinx.datetime.LocalDate/components", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.serializers.LocalDateComponentSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kotlinx.datetime.serializers.LocalDateComponentSerializer.$r8$lambda$wI0oUoIT9VNYk9wzORoCxZJmpqk((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
        }
    });

    private LocalDateComponentSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.datetime.LocalDate deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        java.lang.Integer num = null;
        java.lang.Short sh = null;
        java.lang.Short sh2 = null;
        while (true) {
            kotlinx.datetime.serializers.LocalDateComponentSerializer localDateComponentSerializer = INSTANCE;
            int decodeElementIndex = beginStructure.decodeElementIndex(localDateComponentSerializer.getDescriptor());
            if (decodeElementIndex == -1) {
                if (num == null) {
                    throw new kotlinx.serialization.MissingFieldException(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, localDateComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                }
                if (sh == null) {
                    throw new kotlinx.serialization.MissingFieldException("month", localDateComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                }
                if (sh2 == null) {
                    throw new kotlinx.serialization.MissingFieldException("day", localDateComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                }
                kotlinx.datetime.LocalDate localDate = new kotlinx.datetime.LocalDate(num.intValue(), sh.shortValue(), sh2.shortValue());
                beginStructure.endStructure(descriptor2);
                return localDate;
            }
            if (decodeElementIndex == 0) {
                num = java.lang.Integer.valueOf(beginStructure.decodeIntElement(localDateComponentSerializer.getDescriptor(), 0));
            } else if (decodeElementIndex == 1) {
                sh = java.lang.Short.valueOf(beginStructure.decodeShortElement(localDateComponentSerializer.getDescriptor(), 1));
            } else if (decodeElementIndex == 2) {
                sh2 = java.lang.Short.valueOf(beginStructure.decodeShortElement(localDateComponentSerializer.getDescriptor(), 2));
            } else {
                kotlinx.datetime.serializers.DateTimeUnitSerializersKt.throwUnknownIndexException(decodeElementIndex);
                throw new kotlin.KotlinNothingValueException();
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.datetime.LocalDate value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        kotlinx.datetime.serializers.LocalDateComponentSerializer localDateComponentSerializer = INSTANCE;
        beginStructure.encodeIntElement(localDateComponentSerializer.getDescriptor(), 0, value.getYear());
        beginStructure.encodeShortElement(localDateComponentSerializer.getDescriptor(), 1, (short) kotlinx.datetime.MonthKt.getNumber(value.m24137getMonth()));
        beginStructure.encodeShortElement(localDateComponentSerializer.getDescriptor(), 2, (short) value.getDay());
        beginStructure.endStructure(descriptor2);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wI0oUoIT9VNYk9wzORoCxZJmpqk(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        classSerialDescriptorBuilder.element(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        classSerialDescriptorBuilder.element("month", kotlinx.serialization.internal.ShortSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        classSerialDescriptorBuilder.element("day", kotlinx.serialization.internal.ShortSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        return kotlin.Unit.INSTANCE;
    }
}
