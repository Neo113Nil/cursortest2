package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class UtilsKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility toDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibility, "");
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities.toDescriptorVisibility(visibility);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "");
        return descriptorVisibility;
    }

    public static final boolean isJspecifyEnabledInStrictMode(kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState javaTypeEnhancementState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "");
        return javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT;
    }

    public static final boolean hasErasedValueParameters(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(callableMemberDescriptor.getUserData(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS), java.lang.Boolean.TRUE);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor extractNullabilityAnnotationOnBoundedWildcard(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType javaWildcardType) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaWildcardType, "");
        if (javaWildcardType.getBound() == null) {
            throw new java.lang.IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported".toString());
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations(lazyJavaResolverContext, javaWildcardType, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                annotationDescriptor = null;
                break;
            }
            annotationDescriptor = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor2 = annotationDescriptor;
            for (kotlin.reflect.jvm.internal.impl.name.FqName fqName : kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.getRXJAVA3_ANNOTATIONS()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(annotationDescriptor2.getFqName(), fqName)) {
                    break loop0;
                }
            }
        }
        return annotationDescriptor;
    }
}
