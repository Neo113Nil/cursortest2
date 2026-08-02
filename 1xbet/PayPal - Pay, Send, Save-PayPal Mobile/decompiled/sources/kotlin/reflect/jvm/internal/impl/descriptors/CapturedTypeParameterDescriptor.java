package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
final class CapturedTypeParameterDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean isCapturedFromOuterDeclaration() {
        return true;
    }

    public CapturedTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        this.getHighSpeedVideoSizes = typeParameterDescriptor;
        this.getHighSpeedVideoFpsRanges = declarationDescriptor;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor original = this.getHighSpeedVideoSizes.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(original, "");
        return original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final int getIndex() {
        return this.getHighResolutionOutputSizeshNQ4ISI + this.getHighSpeedVideoSizes.getIndex();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("[inner-copy]");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean isReified() {
        return this.getHighSpeedVideoSizes.isReified();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.Variance getVariance() {
        kotlin.reflect.jvm.internal.impl.types.Variance variance = this.getHighSpeedVideoSizes.getVariance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(variance, "");
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getUpperBounds() {
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = this.getHighSpeedVideoSizes.getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
        return upperBounds;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.getHighSpeedVideoSizes.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = this.getHighSpeedVideoSizes.getStorageManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storageManager, "");
        return storageManager;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = this.getHighSpeedVideoSizes.getSource();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(source, "");
        return source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name name2 = this.getHighSpeedVideoSizes.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return name2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = this.getHighSpeedVideoSizes.getDefaultType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
        return defaultType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.getHighSpeedVideoSizes.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) this.getHighSpeedVideoSizes.accept(declarationDescriptorVisitor, d);
    }
}
