package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public final class LazyJavaTypeParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor {
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter, int i, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        super(lazyJavaResolverContext.getStorageManager(), declarationDescriptor, new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations(lazyJavaResolverContext, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, false, i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, lazyJavaResolverContext.getComponents().getSupertypeLoopChecker());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        this.getHighSpeedVideoSizes = lazyJavaResolverContext;
        this.getHighSpeedVideoFpsRangesFor = javaTypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> processBoundsWithoutCycles(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return this.getHighSpeedVideoSizes.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, list, this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> resolveUpperBounds() {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType> upperBounds = this.getHighSpeedVideoFpsRangesFor.getUpperBounds();
        if (upperBounds.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType anyType = this.getHighSpeedVideoSizes.getModule().getBuiltIns().getAnyType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(anyType, "");
            kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = this.getHighSpeedVideoSizes.getModule().getBuiltIns().getNullableAnyType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nullableAnyType, "");
            return kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType> collection = upperBounds;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.getHighSpeedVideoSizes.getTypeResolver().transformJavaType((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) it.next(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* renamed from: reportSupertypeLoopError */
    public final void mo23900reportSupertypeLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
    }
}
