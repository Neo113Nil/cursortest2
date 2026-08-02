package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
public final class DeserializedTypeParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor {
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext getHighSpeedVideoSizes;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeserializedTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContext, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter, int i) {
        super(r2, r3, r4, r5, r1.variance(r6), typeParameter.getReified(), i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameter, "");
        kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = deserializationContext.getStorageManager();
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        kotlin.reflect.jvm.internal.impl.name.Name name2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializationContext.getNameResolver(), typeParameter.getName());
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags protoEnumFlags = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(variance, "");
        this.getHighSpeedVideoSizes = deserializationContext;
        this.getHighResolutionOutputSizeshNQ4ISI = typeParameter;
        this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations(deserializationContext.getStorageManager(), new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.List list;
                list = kotlin.collections.CollectionsKt.toList(r0.getHighSpeedVideoSizes.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(r0.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes.getNameResolver()));
                return list;
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations getAnnotations() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> resolveUpperBounds() {
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> upperBounds = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.upperBounds(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.getTypeTable());
        if (upperBounds.isEmpty()) {
            return kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> list = upperBounds;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer = this.getHighSpeedVideoSizes.getTypeDeserializer();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializer.type((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* renamed from: reportSupertypeLoopError, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo23900reportSupertypeLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        throw new java.lang.IllegalStateException("There should be no cycles for deserialized type parameters, but found for: ".concat(java.lang.String.valueOf(this)));
    }
}
