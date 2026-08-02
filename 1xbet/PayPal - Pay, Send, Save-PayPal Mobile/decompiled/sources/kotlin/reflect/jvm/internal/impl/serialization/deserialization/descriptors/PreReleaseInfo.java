package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
public final class PreReleaseInfo {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo.Companion Companion = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo(false, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    private final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PreReleaseInfo(boolean z, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    public /* synthetic */ PreReleaseInfo(boolean z, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PreReleaseInfo(isInvisible=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", poisoningFeatures=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo preReleaseInfo = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo) obj;
        return this.getHighSpeedVideoFpsRanges == preReleaseInfo.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, preReleaseInfo.getHighResolutionOutputSizeshNQ4ISI);
    }
}
