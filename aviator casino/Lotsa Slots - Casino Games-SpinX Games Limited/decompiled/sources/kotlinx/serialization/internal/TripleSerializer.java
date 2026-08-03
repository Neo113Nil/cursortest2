package kotlinx.serialization.internal;

/* compiled from: Tuples.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\"\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/internal/TripleSerializer;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "Lkotlinx/serialization/KSerializer;", "Lkotlin/Triple;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "decodeSequentially", "composite", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decodeStructure", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TripleSerializer<A, B, C> implements kotlinx.serialization.KSerializer<kotlin.Triple<? extends A, ? extends B, ? extends C>> {
    private final kotlinx.serialization.KSerializer<A> aSerializer;
    private final kotlinx.serialization.KSerializer<B> bSerializer;
    private final kotlinx.serialization.KSerializer<C> cSerializer;
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    public TripleSerializer(kotlinx.serialization.KSerializer<A> aSerializer, kotlinx.serialization.KSerializer<B> bSerializer, kotlinx.serialization.KSerializer<C> cSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.aSerializer = aSerializer;
        this.bSerializer = bSerializer;
        this.cSerializer = cSerializer;
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Triple", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.internal.TripleSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit descriptor$lambda$0;
                descriptor$lambda$0 = kotlinx.serialization.internal.TripleSerializer.descriptor$lambda$0(kotlinx.serialization.internal.TripleSerializer.this, (kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
                return descriptor$lambda$0;
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit descriptor$lambda$0(kotlinx.serialization.internal.TripleSerializer tripleSerializer, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder buildClassSerialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "first", tripleSerializer.aSerializer.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "second", tripleSerializer.bSerializer.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "third", tripleSerializer.cSerializer.getDescriptor(), null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlin.Triple<? extends A, ? extends B, ? extends C> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(getDescriptor());
        beginStructure.encodeSerializableElement(getDescriptor(), 0, this.aSerializer, value.getFirst());
        beginStructure.encodeSerializableElement(getDescriptor(), 1, this.bSerializer, value.getSecond());
        beginStructure.encodeSerializableElement(getDescriptor(), 2, this.cSerializer, value.getThird());
        beginStructure.endStructure(getDescriptor());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public kotlin.Triple<A, B, C> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(getDescriptor());
        if (beginStructure.decodeSequentially()) {
            return decodeSequentially(beginStructure);
        }
        return decodeStructure(beginStructure);
    }

    private final kotlin.Triple<A, B, C> decodeSequentially(kotlinx.serialization.encoding.CompositeDecoder composite) {
        java.lang.Object decodeSerializableElement$default = kotlinx.serialization.encoding.CompositeDecoder.CC.decodeSerializableElement$default(composite, getDescriptor(), 0, this.aSerializer, null, 8, null);
        java.lang.Object decodeSerializableElement$default2 = kotlinx.serialization.encoding.CompositeDecoder.CC.decodeSerializableElement$default(composite, getDescriptor(), 1, this.bSerializer, null, 8, null);
        java.lang.Object decodeSerializableElement$default3 = kotlinx.serialization.encoding.CompositeDecoder.CC.decodeSerializableElement$default(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
        composite.endStructure(getDescriptor());
        return new kotlin.Triple<>(decodeSerializableElement$default, decodeSerializableElement$default2, decodeSerializableElement$default3);
    }

    private final kotlin.Triple<A, B, C> decodeStructure(kotlinx.serialization.encoding.CompositeDecoder composite) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        obj = kotlinx.serialization.internal.TuplesKt.NULL;
        obj2 = kotlinx.serialization.internal.TuplesKt.NULL;
        obj3 = kotlinx.serialization.internal.TuplesKt.NULL;
        while (true) {
            int decodeElementIndex = composite.decodeElementIndex(getDescriptor());
            if (decodeElementIndex == -1) {
                composite.endStructure(getDescriptor());
                obj4 = kotlinx.serialization.internal.TuplesKt.NULL;
                if (obj != obj4) {
                    obj5 = kotlinx.serialization.internal.TuplesKt.NULL;
                    if (obj2 != obj5) {
                        obj6 = kotlinx.serialization.internal.TuplesKt.NULL;
                        if (obj3 == obj6) {
                            throw new kotlinx.serialization.SerializationException("Element 'third' is missing");
                        }
                        return new kotlin.Triple<>(obj, obj2, obj3);
                    }
                    throw new kotlinx.serialization.SerializationException("Element 'second' is missing");
                }
                throw new kotlinx.serialization.SerializationException("Element 'first' is missing");
            }
            if (decodeElementIndex == 0) {
                obj = kotlinx.serialization.encoding.CompositeDecoder.CC.decodeSerializableElement$default(composite, getDescriptor(), 0, this.aSerializer, null, 8, null);
            } else if (decodeElementIndex == 1) {
                obj2 = kotlinx.serialization.encoding.CompositeDecoder.CC.decodeSerializableElement$default(composite, getDescriptor(), 1, this.bSerializer, null, 8, null);
            } else if (decodeElementIndex == 2) {
                obj3 = kotlinx.serialization.encoding.CompositeDecoder.CC.decodeSerializableElement$default(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
            } else {
                throw new kotlinx.serialization.SerializationException("Unexpected index " + decodeElementIndex);
            }
        }
    }
}
