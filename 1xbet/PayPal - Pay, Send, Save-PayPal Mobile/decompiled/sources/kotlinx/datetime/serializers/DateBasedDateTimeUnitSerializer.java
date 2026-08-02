package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u0010R\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lkotlinx/datetime/serializers/DateBasedDateTimeUnitSerializer;", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "<init>", "()V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializerOrNull", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/datetime/DateTimeUnit$DateBased;)Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/SealedClassSerializer;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "baseClass", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "descriptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DateBasedDateTimeUnitSerializer extends kotlinx.serialization.internal.AbstractPolymorphicSerializer<kotlinx.datetime.DateTimeUnit.DateBased> {
    public static final kotlinx.datetime.serializers.DateBasedDateTimeUnitSerializer INSTANCE = new kotlinx.datetime.serializers.DateBasedDateTimeUnitSerializer();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final kotlin.Lazy getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.serializers.DateBasedDateTimeUnitSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kotlinx.datetime.serializers.DateBasedDateTimeUnitSerializer.$r8$lambda$9eA2zvfc4SgZT4e3SmhFwvyLCNU();
        }
    });

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    private DateBasedDateTimeUnitSerializer() {
    }

    public static /* synthetic */ kotlinx.serialization.SealedClassSerializer $r8$lambda$9eA2zvfc4SgZT4e3SmhFwvyLCNU() {
        return new kotlinx.serialization.SealedClassSerializer("kotlinx.datetime.DateTimeUnit.DateBased", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.datetime.DateTimeUnit.DateBased.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.datetime.DateTimeUnit.DayBased.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.datetime.DateTimeUnit.MonthBased.class)}, new kotlinx.serialization.KSerializer[]{kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer.INSTANCE, kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer.INSTANCE});
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    @kotlinx.serialization.InternalSerializationApi
    public final kotlinx.serialization.DeserializationStrategy<kotlinx.datetime.DateTimeUnit.DateBased> findPolymorphicSerializerOrNull(kotlinx.serialization.encoding.CompositeDecoder decoder, java.lang.String klassName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return ((kotlinx.serialization.SealedClassSerializer) getHighSpeedVideoFpsRanges.getValue()).findPolymorphicSerializerOrNull(decoder, klassName);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    @kotlinx.serialization.InternalSerializationApi
    public final kotlinx.serialization.SerializationStrategy<kotlinx.datetime.DateTimeUnit.DateBased> findPolymorphicSerializerOrNull(kotlinx.serialization.encoding.Encoder encoder, kotlinx.datetime.DateTimeUnit.DateBased value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return ((kotlinx.serialization.SealedClassSerializer) getHighSpeedVideoFpsRanges.getValue()).findPolymorphicSerializerOrNull(encoder, (kotlinx.serialization.encoding.Encoder) value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return ((kotlinx.serialization.SealedClassSerializer) getHighSpeedVideoFpsRanges.getValue()).getDescriptor();
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final kotlin.reflect.KClass<kotlinx.datetime.DateTimeUnit.DateBased> getBaseClass() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.datetime.DateTimeUnit.DateBased.class);
    }
}
