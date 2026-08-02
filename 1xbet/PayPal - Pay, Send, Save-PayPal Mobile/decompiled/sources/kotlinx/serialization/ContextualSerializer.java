package kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0007¢\u0006\u0004\b\t\u0010\nB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u001a\u0010#\u001a\u00020\"8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lkotlinx/serialization/ContextualSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "serializableClass", "fallbackSerializer", "", "typeArgumentsSerializers", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V", "(Lkotlin/reflect/KClass;)V", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "serializer", "(Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lkotlin/reflect/KClass;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lkotlinx/serialization/KSerializer;", "", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes5.dex */
public final class ContextualSerializer<T> implements kotlinx.serialization.KSerializer<T> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<kotlinx.serialization.KSerializer<?>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.reflect.KClass<T> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.serialization.KSerializer<T> getHighSpeedVideoSizes;

    public ContextualSerializer(kotlin.reflect.KClass<T> kClass, kotlinx.serialization.KSerializer<T> kSerializer, kotlinx.serialization.KSerializer<?>[] kSerializerArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializerArr, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kClass;
        this.getHighSpeedVideoSizes = kSerializer;
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.ArraysKt.asList(kSerializerArr);
        this.descriptor = kotlinx.serialization.descriptors.ContextAwareKt.withContext(kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.ContextualSerializer", kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.ContextualSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.serialization.ContextualSerializer.$r8$lambda$Hes48jZtrTGJGDwWLsPXnVZQ9dM(kotlinx.serialization.ContextualSerializer.this, (kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
            }
        }), kClass);
    }

    private final kotlinx.serialization.KSerializer<T> serializer(kotlinx.serialization.modules.SerializersModule serializersModule) {
        kotlinx.serialization.KSerializer<T> contextual = serializersModule.getContextual(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        if (contextual != null) {
            return contextual;
        }
        kotlinx.serialization.KSerializer<T> kSerializer = this.getHighSpeedVideoSizes;
        if (kSerializer != null) {
            return kSerializer;
        }
        kotlinx.serialization.internal.Platform_commonKt.serializerNotRegistered(this.getHighResolutionOutputSizeshNQ4ISI);
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextualSerializer(kotlin.reflect.KClass<T> kClass) {
        this(kClass, null, kotlinx.serialization.internal.PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        encoder.encodeSerializableValue(serializer(encoder.getSerializersModule()), value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return (T) decoder.decodeSerializableValue(serializer(decoder.getSerializersModule()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Hes48jZtrTGJGDwWLsPXnVZQ9dM(kotlinx.serialization.ContextualSerializer contextualSerializer, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlinx.serialization.descriptors.SerialDescriptor descriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        kotlinx.serialization.KSerializer<T> kSerializer = contextualSerializer.getHighSpeedVideoSizes;
        java.util.List<java.lang.annotation.Annotation> annotations = (kSerializer == null || (descriptor = kSerializer.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = kotlin.collections.CollectionsKt.emptyList();
        }
        classSerialDescriptorBuilder.setAnnotations(annotations);
        return kotlin.Unit.INSTANCE;
    }
}
