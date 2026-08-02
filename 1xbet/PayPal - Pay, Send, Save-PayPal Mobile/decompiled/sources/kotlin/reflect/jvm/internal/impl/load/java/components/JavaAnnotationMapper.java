package kotlin.reflect.jvm.internal.impl.load.java.components;

/* loaded from: classes5.dex */
public final class JavaAnnotationMapper {
    private static final kotlin.reflect.jvm.internal.impl.name.Name Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper();
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.FqName> getHighSpeedVideoFpsRanges;
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoSizes;

    private JavaAnnotationMapper() {
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier("message");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        getHighSpeedVideoSizes = identifier;
        kotlin.reflect.jvm.internal.impl.name.Name identifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("allowedTargets");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier2, "");
        Camera2StreamConfigurationMap = identifier2;
        kotlin.reflect.jvm.internal.impl.name.Name identifier3 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier3, "");
        getHighResolutionOutputSizeshNQ4ISI = identifier3;
        getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.target, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.TARGET_ANNOTATION), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.retention, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.RETENTION_ANNOTATION), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mustBeDocumented, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DOCUMENTED_ANNOTATION));
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return Camera2StreamConfigurationMap;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mapOrResolveJavaAnnotation$default(kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper javaAnnotationMapper, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaAnnotationMapper.mapOrResolveJavaAnnotation(javaAnnotation, lazyJavaResolverContext, z);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mapOrResolveJavaAnnotation(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaAnnotation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = javaAnnotation.getClassId();
        kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.TARGET_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, companion.topLevel(fqName))) {
            return new kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion2 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.RETENTION_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, companion2.topLevel(fqName2))) {
            return new kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion3 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DOCUMENTED_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName3, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, companion3.topLevel(fqName3))) {
            return new kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mustBeDocumented);
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion4 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName4 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEPRECATED_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName4, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, companion4.topLevel(fqName4))) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, z);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor findMappedJavaAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner javaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaAnnotationOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.deprecated)) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEPRECATED_ANNOTATION;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName2, "");
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation2 = javaAnnotationOwner.findAnnotation(fqName2);
            if (findAnnotation2 != null || javaAnnotationOwner.isDeprecatedInJavaDoc()) {
                return new kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor(findAnnotation2, lazyJavaResolverContext);
            }
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = getHighSpeedVideoFpsRanges.get(fqName);
        if (fqName3 == null || (findAnnotation = javaAnnotationOwner.findAnnotation(fqName3)) == null) {
            return null;
        }
        return mapOrResolveJavaAnnotation$default(INSTANCE, findAnnotation, lazyJavaResolverContext, false, 4, null);
    }
}
