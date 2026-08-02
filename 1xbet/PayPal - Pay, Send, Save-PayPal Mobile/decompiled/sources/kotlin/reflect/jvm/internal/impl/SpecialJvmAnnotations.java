package kotlin.reflect.jvm.internal.impl;

/* loaded from: classes5.dex */
public final class SpecialJvmAnnotations {
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations INSTANCE = new kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations();
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> getHighResolutionOutputSizeshNQ4ISI;

    private SpecialJvmAnnotations() {
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> getSPECIAL_ANNOTATIONS() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    static {
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.METADATA_FQ_NAME, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.TARGET_ANNOTATION, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.RETENTION_ANNOTATION, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DOCUMENTED_ANNOTATION});
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
        java.util.Iterator it = listOf.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(companion.topLevel((kotlin.reflect.jvm.internal.impl.name.FqName) it.next()));
        }
        getHighResolutionOutputSizeshNQ4ISI = linkedHashSet;
        kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion2 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.REPEATABLE_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName, "");
        Camera2StreamConfigurationMap = companion2.topLevel(fqName);
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getJAVA_LANG_ANNOTATION_REPEATABLE() {
        return Camera2StreamConfigurationMap;
    }

    public final boolean isAnnotatedWithContainerMetaAnnotation(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "");
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        kotlinJvmBinaryClass.loadClassAnnotations(new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations$isAnnotatedWithContainerMetaAnnotation$1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public final void visitEnd() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
                if (!kotlin.jvm.internal.Intrinsics.areEqual(classId, kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.INSTANCE.getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION())) {
                    return null;
                }
                kotlin.jvm.internal.Ref.BooleanRef.this.element = true;
                return null;
            }
        }, null);
        return booleanRef.element;
    }
}
