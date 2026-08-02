package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lkotlinx/serialization/internal/TripleSerializer;", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Lkotlinx/serialization/KSerializer;", "Lkotlin/Triple;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlin/Triple;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlin/Triple;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/KSerializer;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TripleSerializer<A, B, C> implements kotlinx.serialization.KSerializer<kotlin.Triple<? extends A, ? extends B, ? extends C>> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<B> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<A> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<C> getHighSpeedVideoFpsRanges;

    public TripleSerializer(kotlinx.serialization.KSerializer<A> kSerializer, kotlinx.serialization.KSerializer<B> kSerializer2, kotlinx.serialization.KSerializer<C> kSerializer3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer3, "");
        this.Camera2StreamConfigurationMap = kSerializer;
        this.getHighSpeedVideoFpsRangesFor = kSerializer2;
        this.getHighSpeedVideoFpsRanges = kSerializer3;
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Triple", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.internal.TripleSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.serialization.internal.TripleSerializer.$r8$lambda$1rMBbyNpoVrPk6COujtyupPSbJ4(kotlinx.serialization.internal.TripleSerializer.this, (kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlin.Triple<? extends A, ? extends B, ? extends C> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(getDescriptor());
        beginStructure.encodeSerializableElement(getDescriptor(), 0, this.Camera2StreamConfigurationMap, value.getFirst());
        beginStructure.encodeSerializableElement(getDescriptor(), 1, this.getHighSpeedVideoFpsRangesFor, value.getSecond());
        beginStructure.encodeSerializableElement(getDescriptor(), 2, this.getHighSpeedVideoFpsRanges, value.getThird());
        beginStructure.endStructure(getDescriptor());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlin.Triple<A, B, C> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(getDescriptor());
        if (!beginStructure.decodeSequentially()) {
            obj = kotlinx.serialization.internal.TuplesKt.Camera2StreamConfigurationMap;
            obj2 = kotlinx.serialization.internal.TuplesKt.Camera2StreamConfigurationMap;
            obj3 = kotlinx.serialization.internal.TuplesKt.Camera2StreamConfigurationMap;
            java.lang.Object obj7 = obj2;
            java.lang.Object obj8 = obj3;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex == -1) {
                    beginStructure.endStructure(getDescriptor());
                    obj4 = kotlinx.serialization.internal.TuplesKt.Camera2StreamConfigurationMap;
                    if (obj != obj4) {
                        obj5 = kotlinx.serialization.internal.TuplesKt.Camera2StreamConfigurationMap;
                        if (obj7 != obj5) {
                            obj6 = kotlinx.serialization.internal.TuplesKt.Camera2StreamConfigurationMap;
                            if (obj8 == obj6) {
                                throw new kotlinx.serialization.SerializationException("Element 'third' is missing");
                            }
                            return new kotlin.Triple<>(obj, obj7, obj8);
                        }
                        throw new kotlinx.serialization.SerializationException("Element 'second' is missing");
                    }
                    throw new kotlinx.serialization.SerializationException("Element 'first' is missing");
                }
                if (decodeElementIndex == 0) {
                    obj = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 0, this.Camera2StreamConfigurationMap, null, 8, null);
                } else if (decodeElementIndex == 1) {
                    obj7 = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 1, this.getHighSpeedVideoFpsRangesFor, null, 8, null);
                } else if (decodeElementIndex == 2) {
                    obj8 = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 2, this.getHighSpeedVideoFpsRanges, null, 8, null);
                } else {
                    throw new kotlinx.serialization.SerializationException("Unexpected index ".concat(java.lang.String.valueOf(decodeElementIndex)));
                }
            }
        } else {
            java.lang.Object decodeSerializableElement$default = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 0, this.Camera2StreamConfigurationMap, null, 8, null);
            java.lang.Object decodeSerializableElement$default2 = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 1, this.getHighSpeedVideoFpsRangesFor, null, 8, null);
            java.lang.Object decodeSerializableElement$default3 = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 2, this.getHighSpeedVideoFpsRanges, null, 8, null);
            beginStructure.endStructure(getDescriptor());
            return new kotlin.Triple<>(decodeSerializableElement$default, decodeSerializableElement$default2, decodeSerializableElement$default3);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1rMBbyNpoVrPk6COujtyupPSbJ4(kotlinx.serialization.internal.TripleSerializer tripleSerializer, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "first", tripleSerializer.Camera2StreamConfigurationMap.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "second", tripleSerializer.getHighSpeedVideoFpsRangesFor.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "third", tripleSerializer.getHighSpeedVideoFpsRanges.getDescriptor(), null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }
}
