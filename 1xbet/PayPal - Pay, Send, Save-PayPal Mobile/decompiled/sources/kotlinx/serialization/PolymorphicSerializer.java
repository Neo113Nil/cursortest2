package kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0010\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlinx/serialization/PolymorphicSerializer;", "", "T", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "Lkotlin/reflect/KClass;", "baseClass", "<init>", "(Lkotlin/reflect/KClass;)V", "", "", "classAnnotations", "(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PolymorphicSerializer<T> extends kotlinx.serialization.internal.AbstractPolymorphicSerializer<T> {
    private final kotlin.reflect.KClass<T> baseClass;

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy descriptor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.List<? extends java.lang.annotation.Annotation> getHighSpeedVideoFpsRangesFor;

    public PolymorphicSerializer(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        this.baseClass = kClass;
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.emptyList();
        this.descriptor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.PolymorphicSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor withContext;
                withContext = kotlinx.serialization.descriptors.ContextAwareKt.withContext(kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Polymorphic", kotlinx.serialization.descriptors.PolymorphicKind.OPEN.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.PolymorphicSerializer$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kotlinx.serialization.PolymorphicSerializer.$r8$lambda$cd85Llv6AaMlGDj_tyVFUwU2WLE(kotlinx.serialization.PolymorphicSerializer.this, (kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
                    }
                }), kotlinx.serialization.PolymorphicSerializer.this.getBaseClass());
                return withContext;
            }
        });
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final kotlin.reflect.KClass<T> getBaseClass() {
        return this.baseClass;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolymorphicSerializer(kotlin.reflect.KClass<T> kClass, java.lang.annotation.Annotation[] annotationArr) {
        this(kClass);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArr, "");
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.ArraysKt.asList(annotationArr);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return (kotlinx.serialization.descriptors.SerialDescriptor) this.descriptor.getValue();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("kotlinx.serialization.PolymorphicSerializer(baseClass: ");
        sb.append(getBaseClass());
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cd85Llv6AaMlGDj_tyVFUwU2WLE(kotlinx.serialization.PolymorphicSerializer polymorphicSerializer, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "type", kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("kotlinx.serialization.Polymorphic<");
        sb.append(polymorphicSerializer.getBaseClass().getSimpleName());
        sb.append(kotlin.text.Typography.greater);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor$default(sb.toString(), kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 8, null), null, false, 12, null);
        classSerialDescriptorBuilder.setAnnotations(polymorphicSerializer.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }
}
