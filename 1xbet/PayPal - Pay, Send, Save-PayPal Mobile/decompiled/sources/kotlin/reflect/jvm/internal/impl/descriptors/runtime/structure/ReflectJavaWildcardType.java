package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaWildcardType extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType {
    private final java.lang.reflect.WildcardType Camera2StreamConfigurationMap;
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRangesFor;

    public ReflectJavaWildcardType(java.lang.reflect.WildcardType wildcardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wildcardType, "");
        this.Camera2StreamConfigurationMap = wildcardType;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final java.lang.reflect.WildcardType getReflectType() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType getBound() {
        java.lang.reflect.Type[] upperBounds = getReflectType().getUpperBounds();
        java.lang.reflect.Type[] lowerBounds = getReflectType().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wildcard types with many bounds are not yet supported: ");
            sb.append(getReflectType());
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
        if (lowerBounds.length == 1) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory factory = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lowerBounds);
            java.lang.Object single = kotlin.collections.ArraysKt.single(lowerBounds);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(single, "");
            return factory.create((java.lang.reflect.Type) single);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(upperBounds);
        java.lang.reflect.Type type = (java.lang.reflect.Type) kotlin.collections.ArraysKt.single(upperBounds);
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Object.class)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory factory2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory;
        kotlin.jvm.internal.Intrinsics.checkNotNull(type);
        return factory2.create(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public final boolean isExtends() {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getReflectType().getUpperBounds(), "");
        return !kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.ArraysKt.firstOrNull(r0), java.lang.Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> getAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final boolean isDeprecatedInJavaDoc() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
