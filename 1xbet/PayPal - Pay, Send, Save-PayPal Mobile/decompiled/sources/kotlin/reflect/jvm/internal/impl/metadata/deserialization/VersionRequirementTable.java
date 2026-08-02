package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* loaded from: classes5.dex */
public final class VersionRequirementTable {
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable(kotlin.collections.CollectionsKt.emptyList());
    private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> getHighSpeedVideoSizes;

    private VersionRequirementTable(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> list) {
        this.getHighSpeedVideoSizes = list;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement get(int i) {
        return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) kotlin.collections.CollectionsKt.getOrNull(this.getHighSpeedVideoSizes, i);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable getEMPTY() {
            return kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.getHighSpeedVideoFpsRanges;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable create(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionRequirementTable, "");
            if (versionRequirementTable.getRequirementCount() == 0) {
                return getEMPTY();
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> requirementList = versionRequirementTable.getRequirementList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requirementList, "");
            return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable(requirementList, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ VersionRequirementTable(java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
