package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaTypeParameter extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement implements kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter {
    private final java.lang.reflect.TypeVariable<?> getHighSpeedVideoFpsRanges;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final /* bridge */ /* synthetic */ java.util.Collection getAnnotations() {
        return getAnnotations();
    }

    public ReflectJavaTypeParameter(java.lang.reflect.TypeVariable<?> typeVariable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeVariable, "");
        this.getHighSpeedVideoFpsRanges = typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation> getAnnotations() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation> annotations;
        java.lang.reflect.AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? kotlin.collections.CollectionsKt.emptyList() : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClassifierType> getUpperBounds() {
        java.lang.reflect.Type[] bounds = this.getHighSpeedVideoFpsRanges.getBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds, "");
        java.lang.reflect.Type[] typeArr = bounds;
        java.util.ArrayList arrayList = new java.util.ArrayList(typeArr.length);
        for (java.lang.reflect.Type type : typeArr) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClassifierType(type));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClassifierType reflectJavaClassifierType = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClassifierType) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) arrayList2);
        return kotlin.jvm.internal.Intrinsics.areEqual(reflectJavaClassifierType != null ? reflectJavaClassifierType.getReflectType() : null, java.lang.Object.class) ? kotlin.collections.CollectionsKt.emptyList() : arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.lang.reflect.AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public final java.lang.reflect.AnnotatedElement getElement() {
        java.lang.reflect.TypeVariable<?> typeVariable = this.getHighSpeedVideoFpsRanges;
        if (typeVariable instanceof java.lang.reflect.AnnotatedElement) {
            return (java.lang.reflect.AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public final kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(this.getHighSpeedVideoFpsRanges.getName());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return identifier;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaTypeParameter) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaTypeParameter) obj).getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        return sb.toString();
    }
}
