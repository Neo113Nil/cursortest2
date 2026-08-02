package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
final class SignatureParts extends kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> {
    private final boolean Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isK2() {
        return false;
    }

    public /* synthetic */ SignatureParts(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated, boolean z, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        this(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, false);
    }

    public SignatureParts(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated, boolean z, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationQualifierApplicabilityType, "");
        this.getHighResolutionOutputSizeshNQ4ISI = annotated;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoSizes = lazyJavaResolverContext;
        this.getHighSpeedVideoFpsRangesFor = annotationQualifierApplicabilityType;
        this.Camera2StreamConfigurationMap = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final /* synthetic */ boolean forceWarning(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor2 = annotationDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationDescriptor2, "");
        if ((annotationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor) && ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor) annotationDescriptor2).isIdeExternalAnnotation()) {
            return true;
        }
        if ((annotationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor) && !getEnableImprovementsInStrictMode() && (((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor) annotationDescriptor2).isFreshlySupportedTypeUseAnnotation() || getContainerApplicabilityType() == kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        return kotlinTypeMarker != null && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveArray((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker) && this.getHighSpeedVideoSizes.getComponents().getAnnotationTypeQualifierResolver().isTypeUseAnnotation(annotationDescriptor2) && !this.getHighSpeedVideoSizes.getComponents().getSettings().getEnhancePrimitiveArrays();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getEnhancedForWarnings(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.getEnhancement((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isCovariant() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType getContainerApplicabilityType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getSkipRawTypeArguments() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getEnableImprovementsInStrictMode() {
        return this.getHighSpeedVideoSizes.getComponents().getSettings().getTypeEnhancementImprovementsInStrictMode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> getContainerAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated = this.getHighResolutionOutputSizeshNQ4ISI;
        return (annotated == null || (annotations = annotated.getAnnotations()) == null) ? kotlin.collections.CollectionsKt.emptyList() : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers() {
        return this.getHighSpeedVideoSizes.getDefaultTypeQualifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getContainerIsVarargParameter() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated = this.getHighResolutionOutputSizeshNQ4ISI;
        return (annotated instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) annotated).getVarargElementType() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> getAnnotations(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return ((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe getFqNameUnsafe(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = kotlin.reflect.jvm.internal.impl.types.TypeUtils.getClassDescriptor((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker);
        if (classDescriptor != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classDescriptor);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isNotNullTypeParameterCompat(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return ((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker).unwrap() instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isEqual(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "");
        return this.getHighSpeedVideoSizes.getComponents().getKotlinTypeChecker().equalTypes((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker, (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isArrayOrPrimitiveArray(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArrayOrPrimitiveArray((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isFromJava(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterMarker, "");
        return typeParameterMarker instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    protected final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus getDefaultNullability(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus copy$default;
        if (nullabilityQualifierWithMigrationStatus != null && (copy$default = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, false, 2, null)) != null) {
            return copy$default;
        }
        if (javaDefaultQualifiers != null) {
            return javaDefaultQualifiers.getNullabilityQualifier();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> getAnnotationTypeQualifierResolver() {
        return this.getHighSpeedVideoSizes.getComponents().getAnnotationTypeQualifierResolver();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext getTypeSystem() {
        return kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE;
    }
}
