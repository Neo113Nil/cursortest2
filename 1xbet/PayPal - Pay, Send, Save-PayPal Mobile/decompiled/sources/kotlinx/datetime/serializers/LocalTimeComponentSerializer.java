package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/datetime/serializers/LocalTimeComponentSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/LocalTime;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/datetime/LocalTime;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/datetime/LocalTime;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocalTimeComponentSerializer implements kotlinx.serialization.KSerializer<kotlinx.datetime.LocalTime> {
    public static final kotlinx.datetime.serializers.LocalTimeComponentSerializer INSTANCE = new kotlinx.datetime.serializers.LocalTimeComponentSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("kotlinx.datetime.LocalTime/components", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.serializers.LocalTimeComponentSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kotlinx.datetime.serializers.LocalTimeComponentSerializer.$r8$lambda$trplYYgM1w7KBPx3if6b8vQiJ0I((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
        }
    });

    private LocalTimeComponentSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.datetime.LocalTime deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        java.lang.Short sh = null;
        java.lang.Short sh2 = null;
        short s = 0;
        int i = 0;
        while (true) {
            kotlinx.datetime.serializers.LocalTimeComponentSerializer localTimeComponentSerializer = INSTANCE;
            int decodeElementIndex = beginStructure.decodeElementIndex(localTimeComponentSerializer.getDescriptor());
            if (decodeElementIndex == -1) {
                if (sh == null) {
                    throw new kotlinx.serialization.MissingFieldException("hour", localTimeComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                }
                if (sh2 == null) {
                    throw new kotlinx.serialization.MissingFieldException("minute", localTimeComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                }
                kotlinx.datetime.LocalTime localTime = new kotlinx.datetime.LocalTime(sh.shortValue(), sh2.shortValue(), s, i);
                beginStructure.endStructure(descriptor2);
                return localTime;
            }
            if (decodeElementIndex == 0) {
                sh = java.lang.Short.valueOf(beginStructure.decodeShortElement(localTimeComponentSerializer.getDescriptor(), 0));
            } else if (decodeElementIndex == 1) {
                sh2 = java.lang.Short.valueOf(beginStructure.decodeShortElement(localTimeComponentSerializer.getDescriptor(), 1));
            } else if (decodeElementIndex == 2) {
                s = beginStructure.decodeShortElement(localTimeComponentSerializer.getDescriptor(), 2);
            } else if (decodeElementIndex == 3) {
                i = beginStructure.decodeIntElement(localTimeComponentSerializer.getDescriptor(), 3);
            } else {
                throw new kotlinx.serialization.SerializationException("Unexpected index: ".concat(java.lang.String.valueOf(decodeElementIndex)));
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.datetime.LocalTime value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        kotlinx.datetime.serializers.LocalTimeComponentSerializer localTimeComponentSerializer = INSTANCE;
        beginStructure.encodeShortElement(localTimeComponentSerializer.getDescriptor(), 0, (short) value.getHour());
        beginStructure.encodeShortElement(localTimeComponentSerializer.getDescriptor(), 1, (short) value.getMinute());
        if (value.getSecond() != 0 || value.getNanosecond() != 0) {
            beginStructure.encodeShortElement(localTimeComponentSerializer.getDescriptor(), 2, (short) value.getSecond());
            if (value.getNanosecond() != 0) {
                beginStructure.encodeIntElement(localTimeComponentSerializer.getDescriptor(), 3, value.getNanosecond());
            }
        }
        beginStructure.endStructure(descriptor2);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$trplYYgM1w7KBPx3if6b8vQiJ0I(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        classSerialDescriptorBuilder.element("hour", kotlinx.serialization.internal.ShortSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        classSerialDescriptorBuilder.element("minute", kotlinx.serialization.internal.ShortSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        classSerialDescriptorBuilder.element("second", kotlinx.serialization.internal.ShortSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        classSerialDescriptorBuilder.element("nanosecond", kotlinx.serialization.internal.IntSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        return kotlin.Unit.INSTANCE;
    }
}
