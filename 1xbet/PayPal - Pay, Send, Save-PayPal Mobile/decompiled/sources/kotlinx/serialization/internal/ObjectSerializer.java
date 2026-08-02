package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bB'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0007\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Lkotlinx/serialization/internal/ObjectSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "", "classAnnotations", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObjectSerializer<T> implements kotlinx.serialization.KSerializer<T> {

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy descriptor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final T getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<? extends java.lang.annotation.Annotation> getHighSpeedVideoFpsRanges;

    public ObjectSerializer(final java.lang.String str, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        this.getHighSpeedVideoFpsRangesFor = t;
        this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.emptyList();
        this.descriptor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.ObjectSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor buildSerialDescriptor;
                buildSerialDescriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor(str, kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.internal.ObjectSerializer$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kotlinx.serialization.internal.ObjectSerializer.m24219$r8$lambda$hQsazl9wY7ZLyEpg4QFWeBVf14(kotlinx.serialization.internal.ObjectSerializer.this, (kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
                    }
                });
                return buildSerialDescriptor;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectSerializer(java.lang.String str, T t, java.lang.annotation.Annotation[] annotationArr) {
        this(str, t);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArr, "");
        this.getHighSpeedVideoFpsRanges = kotlin.collections.ArraysKt.asList(annotationArr);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return (kotlinx.serialization.descriptors.SerialDescriptor) this.descriptor.getValue();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int decodeElementIndex;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (!beginStructure.decodeSequentially() && (decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor())) != -1) {
            throw new kotlinx.serialization.SerializationException("Unexpected index ".concat(java.lang.String.valueOf(decodeElementIndex)));
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        beginStructure.endStructure(descriptor);
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: $r8$lambda$hQsazl9wY7ZLyEpg4QFWe-BVf14, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24219$r8$lambda$hQsazl9wY7ZLyEpg4QFWeBVf14(kotlinx.serialization.internal.ObjectSerializer objectSerializer, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        classSerialDescriptorBuilder.setAnnotations(objectSerializer.getHighSpeedVideoFpsRanges);
        return kotlin.Unit.INSTANCE;
    }
}
