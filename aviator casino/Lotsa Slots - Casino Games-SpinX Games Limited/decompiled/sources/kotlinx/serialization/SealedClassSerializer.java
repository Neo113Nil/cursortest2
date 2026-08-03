package kotlinx.serialization;

/* compiled from: SealedSerializer.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\t\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\f\u0010\rBY\b\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\t\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0004\b\f\u0010\u0010J\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0016J%\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R*\u0010\u001b\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lkotlinx/serialization/SealedClassSerializer;", "T", "", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "serialName", "", "baseClass", "Lkotlin/reflect/KClass;", "subclasses", "", "subclassSerializers", "Lkotlinx/serialization/KSerializer;", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V", "classAnnotations", "", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "getBaseClass", "()Lkotlin/reflect/KClass;", "_annotations", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "class2Serializer", "", "serialName2Serializer", "findPolymorphicSerializerOrNull", "Lkotlinx/serialization/DeserializationStrategy;", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "klassName", "Lkotlinx/serialization/SerializationStrategy;", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.InternalSerializationApi
/* loaded from: classes6.dex */
public final class SealedClassSerializer<T> extends kotlinx.serialization.internal.AbstractPolymorphicSerializer<T> {
    private java.util.List<? extends java.lang.annotation.Annotation> _annotations;
    private final kotlin.reflect.KClass<T> baseClass;
    private final java.util.Map<kotlin.reflect.KClass<? extends T>, kotlinx.serialization.KSerializer<? extends T>> class2Serializer;

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy descriptor;
    private final java.util.Map<java.lang.String, kotlinx.serialization.KSerializer<? extends T>> serialName2Serializer;

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public kotlin.reflect.KClass<T> getBaseClass() {
        return this.baseClass;
    }

    public SealedClassSerializer(final java.lang.String serialName, kotlin.reflect.KClass<T> baseClass, kotlin.reflect.KClass<? extends T>[] subclasses, kotlinx.serialization.KSerializer<? extends T>[] subclassSerializers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.baseClass = baseClass;
        this._annotations = kotlin.collections.CollectionsKt.emptyList();
        this.descriptor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor descriptor_delegate$lambda$3;
                descriptor_delegate$lambda$3 = kotlinx.serialization.SealedClassSerializer.descriptor_delegate$lambda$3(serialName, this);
                return descriptor_delegate$lambda$3;
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new java.lang.IllegalArgumentException("All subclasses of sealed class " + getBaseClass().getSimpleName() + " should be marked @Serializable");
        }
        java.util.Map<kotlin.reflect.KClass<? extends T>, kotlinx.serialization.KSerializer<? extends T>> map = kotlin.collections.MapsKt.toMap(kotlin.collections.ArraysKt.zip(subclasses, subclassSerializers));
        this.class2Serializer = map;
        final java.util.Set<java.util.Map.Entry<kotlin.reflect.KClass<? extends T>, kotlinx.serialization.KSerializer<? extends T>>> entrySet = map.entrySet();
        kotlin.collections.Grouping<java.util.Map.Entry<? extends kotlin.reflect.KClass<? extends T>, ? extends kotlinx.serialization.KSerializer<? extends T>>, java.lang.String> grouping = new kotlin.collections.Grouping<java.util.Map.Entry<? extends kotlin.reflect.KClass<? extends T>, ? extends kotlinx.serialization.KSerializer<? extends T>>, java.lang.String>() { // from class: kotlinx.serialization.SealedClassSerializer$special$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public java.util.Iterator<java.util.Map.Entry<? extends kotlin.reflect.KClass<? extends T>, ? extends kotlinx.serialization.KSerializer<? extends T>>> sourceIterator() {
                return entrySet.iterator();
            }

            @Override // kotlin.collections.Grouping
            public java.lang.String keyOf(java.util.Map.Entry<? extends kotlin.reflect.KClass<? extends T>, ? extends kotlinx.serialization.KSerializer<? extends T>> element) {
                return element.getValue().getDescriptor().getSerialName();
            }
        };
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.util.Map.Entry<? extends kotlin.reflect.KClass<? extends T>, ? extends kotlinx.serialization.KSerializer<? extends T>>> sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            java.util.Map.Entry<? extends kotlin.reflect.KClass<? extends T>, ? extends kotlinx.serialization.KSerializer<? extends T>> next = sourceIterator.next();
            java.lang.String keyOf = grouping.keyOf(next);
            java.lang.Object obj = linkedHashMap.get(keyOf);
            if (obj == null) {
                linkedHashMap.containsKey(keyOf);
            }
            java.util.Map.Entry<? extends kotlin.reflect.KClass<? extends T>, ? extends kotlinx.serialization.KSerializer<? extends T>> entry = next;
            java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
            java.lang.String str = keyOf;
            if (entry2 != null) {
                throw new java.lang.IllegalStateException(("Multiple sealed subclasses of '" + getBaseClass() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(keyOf, entry);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
        for (java.util.Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (kotlinx.serialization.KSerializer) ((java.util.Map.Entry) entry3.getValue()).getValue());
        }
        this.serialName2Serializer = linkedHashMap2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer(java.lang.String serialName, kotlin.reflect.KClass<T> baseClass, kotlin.reflect.KClass<? extends T>[] subclasses, kotlinx.serialization.KSerializer<? extends T>[] subclassSerializers, java.lang.annotation.Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this._annotations = kotlin.collections.ArraysKt.asList(classAnnotations);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return (kotlinx.serialization.descriptors.SerialDescriptor) this.descriptor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.descriptors.SerialDescriptor descriptor_delegate$lambda$3(java.lang.String str, final kotlinx.serialization.SealedClassSerializer sealedClassSerializer) {
        return kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor(str, kotlinx.serialization.descriptors.PolymorphicKind.SEALED.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit descriptor_delegate$lambda$3$lambda$2;
                descriptor_delegate$lambda$3$lambda$2 = kotlinx.serialization.SealedClassSerializer.descriptor_delegate$lambda$3$lambda$2(kotlinx.serialization.SealedClassSerializer.this, (kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
                return descriptor_delegate$lambda$3$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit descriptor_delegate$lambda$3$lambda$2(final kotlinx.serialization.SealedClassSerializer sealedClassSerializer, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder buildSerialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "type", kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "value", kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Sealed<" + sealedClassSerializer.getBaseClass().getSimpleName() + kotlin.text.Typography.greater, kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit descriptor_delegate$lambda$3$lambda$2$lambda$1;
                descriptor_delegate$lambda$3$lambda$2$lambda$1 = kotlinx.serialization.SealedClassSerializer.descriptor_delegate$lambda$3$lambda$2$lambda$1(kotlinx.serialization.SealedClassSerializer.this, (kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
                return descriptor_delegate$lambda$3$lambda$2$lambda$1;
            }
        }), null, false, 12, null);
        buildSerialDescriptor.setAnnotations(sealedClassSerializer._annotations);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit descriptor_delegate$lambda$3$lambda$2$lambda$1(kotlinx.serialization.SealedClassSerializer sealedClassSerializer, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder buildSerialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (java.util.Map.Entry<java.lang.String, kotlinx.serialization.KSerializer<? extends T>> entry : sealedClassSerializer.serialName2Serializer.entrySet()) {
            kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, entry.getKey(), entry.getValue().getDescriptor(), null, false, 12, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public kotlinx.serialization.DeserializationStrategy<T> findPolymorphicSerializerOrNull(kotlinx.serialization.encoding.CompositeDecoder decoder, java.lang.String klassName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.KSerializer<? extends T> kSerializer = this.serialName2Serializer.get(klassName);
        return kSerializer != null ? kSerializer : super.findPolymorphicSerializerOrNull(decoder, klassName);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public kotlinx.serialization.SerializationStrategy<T> findPolymorphicSerializerOrNull(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.KSerializer<? extends T> kSerializer = this.class2Serializer.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()));
        kotlinx.serialization.KSerializer<? extends T> findPolymorphicSerializerOrNull = kSerializer != null ? kSerializer : super.findPolymorphicSerializerOrNull(encoder, (kotlinx.serialization.encoding.Encoder) value);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        return null;
    }
}
