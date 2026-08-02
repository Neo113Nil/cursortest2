package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class DeserializationContext {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getOutputMinFrameDuration;

    public DeserializationContext(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> list) {
        java.lang.String presentableString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionRequirementTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = deserializationComponents;
        this.getOutputFormats = nameResolver;
        this.getHighResolutionOutputSizeshNQ4ISI = declarationDescriptor;
        this.getOutputMinFrameDuration = typeTable;
        this.getHighSpeedVideoSizesFor = versionRequirementTable;
        this.getHighSpeedVideoFpsRanges = binaryVersion;
        this.getHighSpeedVideoFpsRangesFor = deserializedContainerSource;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Deserializer for \"");
        sb.append(declarationDescriptor.getName());
        sb.append('\"');
        this.getInputFormats = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer(this, typeDeserializer, list, sb.toString(), (deserializedContainerSource == null || (presentableString = deserializedContainerSource.getPresentableString()) == null) ? "[container not found]" : presentableString);
        this.Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer(this);
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getComponents() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getNameResolver() {
        return this.getOutputFormats;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getTypeTable() {
        return this.getOutputMinFrameDuration;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getVersionRequirementTable() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion getMetadataVersion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource getContainerSource() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer getTypeDeserializer() {
        return this.getInputFormats;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer getMemberDeserializer() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        return this.getHighSpeedVideoSizes.getStorageManager();
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext childContext$default(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.util.List list, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            nameResolver = deserializationContext.getOutputFormats;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver2 = nameResolver;
        if ((i & 8) != 0) {
            typeTable = deserializationContext.getOutputMinFrameDuration;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = typeTable;
        if ((i & 16) != 0) {
            versionRequirementTable = deserializationContext.getHighSpeedVideoSizesFor;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        if ((i & 32) != 0) {
            binaryVersion = deserializationContext.getHighSpeedVideoFpsRanges;
        }
        return deserializationContext.childContext(declarationDescriptor, list, nameResolver2, typeTable2, versionRequirementTable2, binaryVersion);
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext childContext(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> list, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionRequirementTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext(this.getHighSpeedVideoSizes, nameResolver, declarationDescriptor, typeTable, !kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt.isVersionRequirementTableWrittenCorrectly(binaryVersion) ? this.getHighSpeedVideoSizesFor : versionRequirementTable, binaryVersion, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, list);
    }
}
