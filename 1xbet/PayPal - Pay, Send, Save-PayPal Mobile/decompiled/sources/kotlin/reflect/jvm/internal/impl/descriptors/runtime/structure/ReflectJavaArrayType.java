package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaArrayType extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType {
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final java.lang.reflect.Type getHighSpeedVideoSizes;

    public ReflectJavaArrayType(java.lang.reflect.Type type) {
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType create;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.getHighSpeedVideoSizes = type;
        java.lang.reflect.Type reflectType = getReflectType();
        if (!(reflectType instanceof java.lang.reflect.GenericArrayType)) {
            if (reflectType instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) reflectType;
                if (cls.isArray()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory factory = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory;
                    java.lang.Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentType, "");
                    create = factory.create(componentType);
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Not an array type (");
            sb.append(getReflectType().getClass());
            sb.append("): ");
            sb.append(getReflectType());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory factory2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory;
        java.lang.reflect.Type genericComponentType = ((java.lang.reflect.GenericArrayType) reflectType).getGenericComponentType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericComponentType, "");
        create = factory2.create(genericComponentType);
        this.getHighResolutionOutputSizeshNQ4ISI = create;
        this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    protected final java.lang.reflect.Type getReflectType() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType getComponentType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> getAnnotations() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final boolean isDeprecatedInJavaDoc() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
