package kotlin.reflect.jvm.internal.impl.km.internal;

/* loaded from: classes5.dex */
public final class ReadContext {
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.km.internal.ReadContext getHighSpeedVideoFpsRangesFor;
    private final java.util.List<java.lang.Object> getHighSpeedVideoSizes;
    private final java.util.Map<java.lang.Integer, java.lang.Integer> getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getOutputMinFrameDuration;

    public ReadContext(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable, boolean z, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext, java.util.List<? extends java.lang.Object> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionRequirementTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.Camera2StreamConfigurationMap = nameResolver;
        this.getOutputMinFrameDuration = typeTable;
        this.getOutputFormats = versionRequirementTable;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = readContext;
        this.getHighSpeedVideoSizes = list;
        this.getInputSizeshNQ4ISI = new java.util.LinkedHashMap();
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getStrings() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getTypes() {
        return this.getOutputMinFrameDuration;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getVersionRequirements$kotlin_metadata() {
        return this.getOutputFormats;
    }

    public final boolean getIgnoreUnknownVersionRequirements$kotlin_metadata() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public /* synthetic */ ReadContext(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable, boolean z, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, versionRequirementTable, z, (i & 16) != 0 ? null : readContext, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> getExtensions$kotlin_metadata() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String get(int i) {
        return this.Camera2StreamConfigurationMap.getString(i);
    }

    public final java.lang.String className$kotlin_metadata(int i) {
        return kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.getClassName(this.Camera2StreamConfigurationMap, i);
    }

    public final java.lang.Integer getTypeParameterId$kotlin_metadata(int i) {
        kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext = this;
        do {
            java.lang.Integer num = readContext.getInputSizeshNQ4ISI.get(java.lang.Integer.valueOf(i));
            if (num != null) {
                return num;
            }
            readContext = readContext.getHighSpeedVideoFpsRangesFor;
        } while (readContext != null);
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.km.internal.ReadContext withTypeParameters$kotlin_metadata(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext = new kotlin.reflect.jvm.internal.impl.km.internal.ReadContext(this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this, this.getHighSpeedVideoSizes);
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter : list) {
            readContext.getInputSizeshNQ4ISI.put(java.lang.Integer.valueOf(typeParameter.getName()), java.lang.Integer.valueOf(typeParameter.getId()));
        }
        return readContext;
    }
}
