package kotlinx.serialization.builtins;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/serialization/builtins/InstantComponentSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/time/Instant;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlin/time/Instant;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlin/time/Instant;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InstantComponentSerializer implements kotlinx.serialization.KSerializer<kotlin.time.Instant> {
    public static final kotlinx.serialization.builtins.InstantComponentSerializer INSTANCE = new kotlinx.serialization.builtins.InstantComponentSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("kotlinx.serialization.InstantComponentSerializer", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.builtins.InstantComponentSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kotlinx.serialization.builtins.InstantComponentSerializer.$r8$lambda$tx_B1qSqPA_UIypSNiSuVenFWA8((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
        }
    });

    private InstantComponentSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlin.time.Instant deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        long j = 0;
        boolean z = true;
        int i = 0;
        while (true) {
            kotlinx.serialization.builtins.InstantComponentSerializer instantComponentSerializer = INSTANCE;
            int decodeElementIndex = beginStructure.decodeElementIndex(instantComponentSerializer.getDescriptor());
            if (decodeElementIndex == -1) {
                if (z) {
                    throw new kotlinx.serialization.MissingFieldException("epochSeconds", instantComponentSerializer.getDescriptor().getGetHighSpeedVideoSizes());
                }
                kotlin.time.Instant fromEpochSeconds = kotlin.time.Instant.INSTANCE.fromEpochSeconds(j, i);
                beginStructure.endStructure(descriptor2);
                return fromEpochSeconds;
            }
            if (decodeElementIndex == 0) {
                j = beginStructure.decodeLongElement(instantComponentSerializer.getDescriptor(), 0);
                z = false;
            } else if (decodeElementIndex == 1) {
                i = beginStructure.decodeIntElement(instantComponentSerializer.getDescriptor(), 1);
            } else {
                throw new kotlinx.serialization.SerializationException("Unexpected index: ".concat(java.lang.String.valueOf(decodeElementIndex)));
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlin.time.Instant value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        kotlinx.serialization.builtins.InstantComponentSerializer instantComponentSerializer = INSTANCE;
        beginStructure.encodeLongElement(instantComponentSerializer.getDescriptor(), 0, value.getEpochSeconds());
        if (value.getNanosecondsOfSecond() != 0 || beginStructure.shouldEncodeElementDefault(instantComponentSerializer.getDescriptor(), 1)) {
            beginStructure.encodeIntElement(instantComponentSerializer.getDescriptor(), 1, value.getNanosecondsOfSecond());
        }
        beginStructure.endStructure(descriptor2);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tx_B1qSqPA_UIypSNiSuVenFWA8(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        classSerialDescriptorBuilder.element("epochSeconds", kotlinx.serialization.internal.LongSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), false);
        classSerialDescriptorBuilder.element("nanosecondsOfSecond", kotlinx.serialization.internal.LongSerializer.INSTANCE.getDescriptor(), kotlin.collections.CollectionsKt.emptyList(), true);
        return kotlin.Unit.INSTANCE;
    }
}
