package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public interface TypeAliasExpansionReportStrategy {
    void boundsViolationInSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor);

    void conflictingProjection(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType);

    void recursiveTypeAlias(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor);

    void repeatedAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor);

    public static final class DO_NOTHING implements kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy {
        public static final kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy.DO_NOTHING INSTANCE = new kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy.DO_NOTHING();

        private DO_NOTHING() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public final void repeatedAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationDescriptor, "");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public final void recursiveTypeAlias(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAliasDescriptor, "");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public final void conflictingProjection(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAliasDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public final void boundsViolationInSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitutor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        }
    }
}
