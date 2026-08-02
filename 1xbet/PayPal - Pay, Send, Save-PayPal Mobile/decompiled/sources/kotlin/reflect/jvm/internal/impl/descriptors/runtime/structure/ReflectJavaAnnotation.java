package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaAnnotation extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation {
    private final java.lang.annotation.Annotation getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final boolean isIdeExternalAnnotation() {
        return false;
    }

    public ReflectJavaAnnotation(java.lang.annotation.Annotation annotation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotation, "");
        this.getHighSpeedVideoSizes = annotation;
    }

    public final java.lang.annotation.Annotation getAnnotation() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> getArguments() {
        java.lang.reflect.Method[] declaredMethods = kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(this.getHighSpeedVideoSizes)).getDeclaredMethods();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
        java.lang.reflect.Method[] methodArr = declaredMethods;
        java.util.ArrayList arrayList = new java.util.ArrayList(methodArr.length);
        for (java.lang.reflect.Method method : methodArr) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument.Factory factory = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument.Factory;
            java.lang.Object invoke = method.invoke(this.getHighSpeedVideoSizes, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(invoke, "");
            arrayList.add(factory.create(invoke, kotlin.reflect.jvm.internal.impl.name.Name.identifier(method.getName())));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(this.getHighSpeedVideoSizes)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass resolve() {
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass(kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(this.getHighSpeedVideoSizes)));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation) && this.getHighSpeedVideoSizes == ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation) obj).getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.getHighSpeedVideoSizes);
        return sb.toString();
    }
}
