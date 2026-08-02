package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaAnnotationOwnerKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation> getAnnotations(java.lang.annotation.Annotation[] annotationArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(annotationArr.length);
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation(annotation));
        }
        return arrayList;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation findAnnotation(java.lang.annotation.Annotation[] annotationArr, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        java.lang.annotation.Annotation annotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation))).asSingleFqName(), fqName)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation(annotation);
        }
        return null;
    }
}
