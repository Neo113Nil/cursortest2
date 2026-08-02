package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
public final class DeserializedSimpleFunctionDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor {
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getHighSpeedVideoSizes;

    public /* synthetic */ DeserializedSimpleFunctionDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, simpleFunctionDescriptor, annotations, name2, kind, function, nameResolver, typeTable, versionRequirementTable, deserializedContainerSource, (i & 1024) != 0 ? null : sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getProto() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getNameResolver() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getTypeTable() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getVersionRequirementTable() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource getContainerSource() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedSimpleFunctionDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name2, kind, sourceElement == null ? kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE : sourceElement);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionRequirementTable, "");
        this.getHighSpeedVideoFpsRangesFor = function;
        this.Camera2StreamConfigurationMap = nameResolver;
        this.getHighSpeedVideoSizes = typeTable;
        this.getHighResolutionOutputSizeshNQ4ISI = versionRequirementTable;
        this.getHighSpeedVideoFpsRanges = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        kotlin.reflect.jvm.internal.impl.name.Name name3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) functionDescriptor;
        if (name2 == null) {
            kotlin.reflect.jvm.internal.impl.name.Name name4 = getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name4, "");
            name3 = name4;
        } else {
            name3 = name2;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor(declarationDescriptor, simpleFunctionDescriptor, annotations, name3, kind, getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource(), sourceElement);
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(hasStableParameterNames());
        return deserializedSimpleFunctionDescriptor;
    }
}
