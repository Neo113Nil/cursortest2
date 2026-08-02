package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaValueParameter extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter {
    private final boolean Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType getHighSpeedVideoFpsRangesFor;
    private final java.lang.annotation.Annotation[] getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public ReflectJavaValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType reflectJavaType, java.lang.annotation.Annotation[] annotationArr, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reflectJavaType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArr, "");
        this.getHighSpeedVideoFpsRangesFor = reflectJavaType;
        this.getHighSpeedVideoSizes = annotationArr;
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType getType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public final boolean isVararg() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation> getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwnerKt.getAnnotations(this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwnerKt.findAnnotation(this.getHighSpeedVideoSizes, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public final kotlin.reflect.jvm.internal.impl.name.Name getName() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (str != null) {
            return kotlin.reflect.jvm.internal.impl.name.Name.guessByFirstCharacter(str);
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(isVararg() ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }
}
