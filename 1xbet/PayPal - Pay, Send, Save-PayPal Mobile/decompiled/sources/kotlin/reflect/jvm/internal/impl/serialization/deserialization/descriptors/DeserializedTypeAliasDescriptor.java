package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
public final class DeserializedTypeAliasDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor {
    private kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap;
    private kotlin.reflect.jvm.internal.impl.types.SimpleType getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getHighSpeedVideoSizes;
    private kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getOutputFormats;
    private java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getOutputMinFrameDuration;

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getProto() {
        return this.getInputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getNameResolver() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getTypeTable() {
        return this.getInputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getVersionRequirementTable() {
        return this.getOutputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource getContainerSource() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeserializedTypeAliasDescriptor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource) {
        super(storageManager, declarationDescriptor, annotations, name2, r5, descriptorVisibility);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorVisibility, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAlias, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionRequirementTable, "");
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceElement, "");
        this.getInputFormats = typeAlias;
        this.getHighSpeedVideoSizes = nameResolver;
        this.getInputSizeshNQ4ISI = typeTable;
        this.getOutputFormats = versionRequirementTable;
        this.getHighSpeedVideoFpsRanges = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getUnderlyingType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = this.getHighSpeedVideoSizesFor;
        if (simpleType != null) {
            return simpleType;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getExpandedType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = this.Camera2StreamConfigurationMap;
        if (simpleType != null) {
            return simpleType;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void initialize(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType2, "");
        initialize(list);
        this.getHighSpeedVideoSizesFor = simpleType;
        this.Camera2StreamConfigurationMap = simpleType2;
        this.getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.computeConstructorTypeParameters(this);
        this.getHighResolutionOutputSizeshNQ4ISI = computeDefaultType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassDescriptor() {
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(getExpandedType())) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = getExpandedType().getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = this.getHighResolutionOutputSizeshNQ4ISI;
        if (simpleType != null) {
            return simpleType;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = getStorageManager();
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = getAnnotations();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotations, "");
        kotlin.reflect.jvm.internal.impl.name.Name name2 = getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor(storageManager, containingDeclaration, annotations, name2, getVisibility(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = getDeclaredTypeParameters();
        kotlin.reflect.jvm.internal.impl.types.KotlinType safeSubstitute = typeSubstitutor.safeSubstitute(getUnderlyingType(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(safeSubstitute, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType asSimpleType = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(safeSubstitute);
        kotlin.reflect.jvm.internal.impl.types.KotlinType safeSubstitute2 = typeSubstitutor.safeSubstitute(getExpandedType(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(safeSubstitute2, "");
        deserializedTypeAliasDescriptor.initialize(declaredTypeParameters, asSimpleType, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(safeSubstitute2));
        return deserializedTypeAliasDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeConstructorTypeParameters() {
        java.util.List list = this.getOutputMinFrameDuration;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }
}
