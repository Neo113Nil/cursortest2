package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaPrimitiveType extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType {
    private final boolean Camera2StreamConfigurationMap;
    private final java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> getHighSpeedVideoFpsRangesFor;

    public ReflectJavaPrimitiveType(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cls;
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final java.lang.Class<?> getReflectType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    public final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getType() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(getReflectType(), java.lang.Void.TYPE)) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(getReflectType().getName()).getPrimitiveType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> getAnnotations() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final boolean isDeprecatedInJavaDoc() {
        return this.Camera2StreamConfigurationMap;
    }
}
