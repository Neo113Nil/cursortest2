package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Landroidx/compose/runtime/SourceInformationGroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/SlotTable;", "p0", "", "p1", "Landroidx/compose/runtime/GroupSourceInformation;", "p2", "Landroidx/compose/runtime/SourceInformationGroupPath;", "p3", "<init>", "(Landroidx/compose/runtime/SlotTable;ILandroidx/compose/runtime/GroupSourceInformation;Landroidx/compose/runtime/SourceInformationGroupPath;)V", "", "hasNext", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/SlotTable;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/runtime/GroupSourceInformation;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/SourceInformationGroupPath;", "getInputFormats", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SourceInformationGroupIterator implements java.util.Iterator<androidx.compose.runtime.tooling.CompositionGroup>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.SlotTable getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.GroupSourceInformation Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.SourceInformationGroupPath getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    public SourceInformationGroupIterator(androidx.compose.runtime.SlotTable slotTable, int i, androidx.compose.runtime.GroupSourceInformation groupSourceInformation, androidx.compose.runtime.SourceInformationGroupPath sourceInformationGroupPath) {
        this.getHighSpeedVideoFpsRangesFor = slotTable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = groupSourceInformation;
        this.getHighSpeedVideoSizes = sourceInformationGroupPath;
        this.getHighSpeedVideoFpsRanges = slotTable.getVersion();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.ArrayList<java.lang.Object> groups = this.Camera2StreamConfigurationMap.getGroups();
        return groups != null && this.getInputSizeshNQ4ISI < groups.size();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ androidx.compose.runtime.tooling.CompositionGroup next() {
        java.lang.Object obj;
        java.util.ArrayList<java.lang.Object> groups = this.Camera2StreamConfigurationMap.getGroups();
        if (groups != null) {
            int i = this.getInputSizeshNQ4ISI;
            this.getInputSizeshNQ4ISI = i + 1;
            obj = groups.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof androidx.compose.runtime.Anchor) {
            return new androidx.compose.runtime.SlotTableGroup(this.getHighSpeedVideoFpsRangesFor, ((androidx.compose.runtime.Anchor) obj).getLocation(), this.getHighSpeedVideoFpsRanges);
        }
        if (obj instanceof androidx.compose.runtime.GroupSourceInformation) {
            return new androidx.compose.runtime.SourceInformationSlotTableGroup(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, (androidx.compose.runtime.GroupSourceInformation) obj, new androidx.compose.runtime.RelativeGroupPath(this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI - 1));
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Unexpected group information structure");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
