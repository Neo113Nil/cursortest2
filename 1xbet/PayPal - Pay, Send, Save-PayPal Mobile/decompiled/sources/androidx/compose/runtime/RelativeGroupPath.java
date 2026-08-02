package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0011\u0010\t\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/runtime/RelativeGroupPath;", "Landroidx/compose/runtime/SourceInformationGroupPath;", "p0", "", "p1", "<init>", "(Landroidx/compose/runtime/SourceInformationGroupPath;I)V", "Landroidx/compose/runtime/SlotTable;", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/SlotTable;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/runtime/SourceInformationGroupPath;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RelativeGroupPath extends androidx.compose.runtime.SourceInformationGroupPath {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.SourceInformationGroupPath getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    public RelativeGroupPath(androidx.compose.runtime.SourceInformationGroupPath sourceInformationGroupPath, int i) {
        super(null);
        this.getHighSpeedVideoFpsRangesFor = sourceInformationGroupPath;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // androidx.compose.runtime.SourceInformationGroupPath
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.runtime.SlotTable p0) {
        return new androidx.compose.runtime.SourceInformationSlotTableGroupIdentity(this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(p0), this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.runtime.RelativeGroupPath)) {
            return false;
        }
        androidx.compose.runtime.RelativeGroupPath relativeGroupPath = (androidx.compose.runtime.RelativeGroupPath) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(relativeGroupPath.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor) && relativeGroupPath.Camera2StreamConfigurationMap == this.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }
}
